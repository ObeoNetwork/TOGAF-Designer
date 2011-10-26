package org.obeonetwork.dsl.togaf.ui.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.net4j.util.security.IPasswordCredentials;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture;
import org.obeonetwork.dsl.togaf.ui.Activator;

import representations.Representation;
import representations.RepresentationsContainer;
import representations.RepresentationsFactory;
import fr.obeo.dsl.viewpoint.DAnalysis;
import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.DRepresentationContainer;
import fr.obeo.dsl.viewpoint.ViewpointFactory;
import fr.obeo.dsl.viewpoint.business.api.dialect.DialectManager;
import fr.obeo.dsl.viewpoint.business.api.session.factory.SessionFactory;
import fr.obeo.dsl.viewpoint.collab.api.CDOAuthenticationManager;
import fr.obeo.dsl.viewpoint.collab.api.CDOAuthenticationManagerRegistry;
import fr.obeo.dsl.viewpoint.collab.api.CDORepositoryManager;
import fr.obeo.dsl.viewpoint.collab.api.CDORepositoryManagerRegistry;
import fr.obeo.dsl.viewpoint.collab.api.RepositoryConnectionException;
import fr.obeo.dsl.viewpoint.collab.api.model.cdoconfig.utils.CDOConfigUtils;
import fr.obeo.dsl.viewpoint.collab.api.remotesession.CollaborativeSession;
import fr.obeo.dsl.viewpoint.collab.internal.session.factory.CollaborativeSessionFactoryImpl;
import fr.obeo.dsl.viewpoint.collab.model.cdoconfig.RepositoryConfig;
import fr.obeo.dsl.viewpoint.description.RepresentationDescription;
import fr.obeo.dsl.viewpoint.description.Viewpoint;
import fr.obeo.dsl.viewpoint.tools.api.command.ViewpointCommand;

/**
 * 
 * @author steph
 * 
 */
public class CollaborativeSessionUtil {

	public static final String REPOSITORY_NAME = "demo";

	public static final String SEMANTIC_MODEL_URI = "/datas.service";

	// public static final String VIEWPOINT_MODEL_URI = "/DAnalysis.aird";

	public static final String REPRESENTATIONS_MODEL_URI = "/rep.representations";

	public static CollaborativeSession getCollaborativeSession() {
		return collaborativeSession;
	}

	public static CDORepositoryManager getCDORepositoryManager() {
		return repositoryManager;
	}

	public static CDOResource getSemanticResource() {
		try {
			return repositoryManager.getOrCreateTransaction(
					collaborativeSession).getOrCreateResource(
					SEMANTIC_MODEL_URI);
		} catch (RepositoryConnectionException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Marshaller marshaller = MarshallerFactory.getInstance()
			.getMarshaller(MarshallerFactory.MarshallerKind.XMI);

	private static HashMap<DRepresentation, Representation> loadedRepresentations = new HashMap<DRepresentation, Representation>();

	private static CollaborativeSession collaborativeSession = createCollaborativeSession();

	private static CDORepositoryManager repositoryManager;

	private static final String SERVER_LOCATION = "localhost";

	private static final String SERVER_PORT_NUMBER = "2036";

	private static final String SESSION_URI = "in-memory.aird";

	private static void closeSession() {
		collaborativeSession.save();
		collaborativeSession.close();
	}

	private static CollaborativeSession createCollaborativeSession() {
		if (collaborativeSession != null) {
			return collaborativeSession;
		}

		try {
			// Open the collaborative session
			openSession();
			prepareSemanticResource();
			//testCreateDRepresentation();
			testOpenGoalObjectiveServiceDiagram();
			testOpenApplicationCommunicationDiagram();
		} catch (Exception e) {
			Activator
					.getDefault()
					.getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							"Cannot open Viewpoint session.", e));
		}
		return collaborativeSession;
	}

	public static void openSession() throws RepositoryConnectionException,
			CoreException {
		RepositoryConfig repositoryConfig = CDOConfigUtils
				.createRepositoryConfig(SERVER_LOCATION, SERVER_PORT_NUMBER,
						REPOSITORY_NAME);

		// use new authentication API contributed from #OD-141
		CDOAuthenticationManagerRegistry.registerAuthenticationManager("*",
				new CDOAuthenticationManager() {
					public boolean isInteractive() {
						return false;
					}

					public IPasswordCredentials getCredentials() {
						// TODO get credentials with a dedicated login Js/Java
						// function
						return new IPasswordCredentials() {
							public String getUserID() {
								return "admin";
							}

							public char[] getPassword() {
								return hashPassword("admin").toCharArray();
							}

							public String hashPassword(String password) {
								try {
									MessageDigest m = MessageDigest
											.getInstance("MD5");
									byte[] out = m.digest(password.getBytes());
									return new String(Base64.encodeBase64(out));
								} catch (NoSuchAlgorithmException e) {
									return null;
								}
							}
						};
					}
				});

		SessionFactory sessionFactory = CollaborativeSessionFactoryImpl.INSTANCE;

		collaborativeSession = (CollaborativeSession) sessionFactory
				.createSession(URI.createURI(SESSION_URI));
		collaborativeSession.open();
		collaborativeSession = collaborativeSession.connect(repositoryConfig);

		// Get the class used to access the CDO repository
		repositoryManager = CDORepositoryManagerRegistry
				.getRepositoryManager(collaborativeSession);
	}

	private static void initRepresentationsResource(
			Resource remoteDAnalysisResource) {
		remoteDAnalysisResource.getContents().add(
				ViewpointFactory.eINSTANCE.createDAnalysis());
	}

	private static void prepareSemanticResource()
			throws RepositoryConnectionException {
		if (collaborativeSession.getSemanticResources().size() == 0) {
			final Resource resource = repositoryManager.getOrCreateTransaction(
					collaborativeSession).getOrCreateResource(
					SEMANTIC_MODEL_URI);
			if (resource.getContents().isEmpty()) {
				initSemanticResource(resource);
			}
			collaborativeSession
					.getTransactionalEditingDomain()
					.getCommandStack()
					.execute(
							new ViewpointCommand(collaborativeSession
									.getTransactionalEditingDomain()) {
								@Override
								protected void doExecute() {
									collaborativeSession.addSemanticResource(
											resource, true);
								}
							});

			// Add the semantic resource related to the storage of the
			// representations.
			final Resource resourceRepresentations = repositoryManager
					.getOrCreateTransaction(collaborativeSession)
					.getOrCreateResource(REPRESENTATIONS_MODEL_URI);
			if (resourceRepresentations.getContents().isEmpty()) {
				initSemanticRepresentationsResource(resourceRepresentations);
			} else {
				loadRepresentationsInViewPointSession(resourceRepresentations);
			}
			collaborativeSession
					.getTransactionalEditingDomain()
					.getCommandStack()
					.execute(
							new ViewpointCommand(collaborativeSession
									.getTransactionalEditingDomain()) {
								@Override
								protected void doExecute() {
									collaborativeSession.addSemanticResource(
											resourceRepresentations, true);
								}
							});

			// Enables to marshall the modified drepresentations.
			registerListeners();
		}
	}
	
	private static boolean go = false;

	private static void initSemanticResource(Resource semanticResource) {
		EnterpriseArchitecture enterpriseArchitecture = ContentfwkFactory.eINSTANCE
				.createEnterpriseArchitecture();

		StrategicArchitecture strategicArchitecture = ContentfwkFactory.eINSTANCE
				.createStrategicArchitecture();
		enterpriseArchitecture.getArchitectures().add(strategicArchitecture);

		BusinessArchitecture businessArchitecture = ContentfwkFactory.eINSTANCE
				.createBusinessArchitecture();
		enterpriseArchitecture.getArchitectures().add(businessArchitecture);

		DataArchitecture dataArchitecture = ContentfwkFactory.eINSTANCE
				.createDataArchitecture();
		enterpriseArchitecture.getArchitectures().add(dataArchitecture);

		ApplicationArchitecture applicationArchitecture = ContentfwkFactory.eINSTANCE
				.createApplicationArchitecture();
		enterpriseArchitecture.getArchitectures().add(applicationArchitecture);

		TechnologyArchitecture technologyArchitecture = ContentfwkFactory.eINSTANCE
				.createTechnologyArchitecture();
		enterpriseArchitecture.getArchitectures().add(technologyArchitecture);

		semanticResource.getContents().add(enterpriseArchitecture);
	}

	private static void initSemanticRepresentationsResource(
			Resource semanticResource) {

		RepresentationsContainer container = RepresentationsFactory.eINSTANCE
				.createRepresentationsContainer();

		semanticResource.getContents().add(container);
	}

	private static Resource getAirdResource() {
		for (Resource r : collaborativeSession.getAllSessionResources()) {
			if ("aird".equals(r.getURI().fileExtension())) {
				return r;
			}
		}
		return null;
	}

	private static void loadRepresentationsInViewPointSession(
			Resource resourceRepresentations) {
		final List<Representation> representations = new ArrayList<Representation>();
		if (resourceRepresentations.getContents().get(0) instanceof RepresentationsContainer) {
			RepresentationsContainer container = (RepresentationsContainer) resourceRepresentations
					.getContents().get(0);
			representations.addAll(container.getRepresentations());
			final Resource airdResource = getAirdResource();
			TransactionalEditingDomain editingDomain = collaborativeSession
					.getTransactionalEditingDomain();
			RecordingCommand cmd = new RecordingCommand(editingDomain,
					"Load Representations in ViewPoint Session") {
				protected void doExecute() {
					if (airdResource.getContents().size() == 0) {
						initRepresentationsResource(airdResource);
					} else {
						DAnalysis dAnalysis = (DAnalysis) airdResource
								.getContents().get(0);
						ViewpointUtil.selectAllTogafViewpoints();			
						DRepresentationContainer dRepresentationContainer = ViewpointFactory.eINSTANCE
								.createDRepresentationContainer();
						for (Representation representation : representations) {
							DRepresentation dRepresentation = marshaller
									.unMarshall(representation.getContent());
							loadedRepresentations.put(dRepresentation,
									representation);
							dRepresentationContainer.getOwnedRepresentations()
									.add(dRepresentation);
							// graphicalResource.getContents().add(dRepresentation);
						}
						// graphicalResource.getContents().add(dRepresentationContainer);
						dAnalysis.getOwnedViews().add(dRepresentationContainer);
					}go=true;
				}
			};
			editingDomain.getCommandStack().execute(cmd);
		}
	}

	private static void registerListeners() {
		collaborativeSession.getTransactionalEditingDomain()
				.addResourceSetListener(new LocalResourceSetListener());
	}

	private static class LocalResourceSetListener extends
			ResourceSetListenerImpl {

		public LocalResourceSetListener() {
			super();
		}

		public boolean isPrecommitOnly() {
			return true;
		}

		@Override
		public Command transactionAboutToCommit(
				final ResourceSetChangeEvent event) throws RollbackException {
			Command result = null;

			// System.out.println("resourceSetChanged " + event);
			List<Notification> notifications = event.getNotifications();
			for (Notification notification : notifications) {
				// System.out.println("-----------------> "+notification.getEventType()+" - "+notification.getNotifier());
				if (notification.getNotifier() instanceof DRepresentation) {
					DRepresentation dRepresentation = (DRepresentation) notification
							.getNotifier();
					// handle diagram creation and update
					if (notification.getEventType() == Notification.ADD
							|| notification.getEventType() == Notification.SET) {
						System.out.println("add or update diagram "
								+ dRepresentation.getName());
						result = CollaborativeSessionUtil.save(dRepresentation);
					} else if (notification.getEventType() == Notification.REMOVE) {
						// TODO handle delete representation
						System.out.println("delete diagram "
								+ dRepresentation.getName());
						remove(dRepresentation);
					}
				} else if (notification.getNotifier() instanceof EObject) {
					EObject eObject = (EObject) notification.getNotifier();
					// handle GMF notation updates
					if (eObject.eResource() != null
							&& eObject.eResource().getURI().toString()
									.equals(SESSION_URI)) {
						DRepresentation dRepresentation = findDRepresentation(eObject);
						if (dRepresentation != null) {
							System.out.println("modify gmf diagram "
									+ dRepresentation.getName());
							result = save(dRepresentation);
						}
					}
				}
			}
			return result;
		}

		private DRepresentation findDRepresentation(EObject eObject) {
			if (eObject instanceof DRepresentation) {
				DRepresentation dRepresentation = (DRepresentation) eObject;
				return dRepresentation;
			} else if (eObject.eContainer() != null) {
				return findDRepresentation(eObject.eContainer());
			}
			return null;
		}
	}

	private static void remove(DRepresentation dRepresentation) {
		Representation representation = loadedRepresentations
				.get(dRepresentation);
		System.out.println("Remove representation : "
				+ representation.getName());
		representation.setContent(null);
		loadedRepresentations.remove(dRepresentation);
	}

	private static Command save(DRepresentation dRepresentation) {
		Command result = null;
		Representation representation = null;
		boolean newRepresentation = false;
		if (!loadedRepresentations.containsKey(dRepresentation)) {
			System.err.println("create new marshalled representaiton");
			representation = RepresentationsFactory.eINSTANCE
					.createRepresentation();
			loadedRepresentations.put(dRepresentation, representation);
			newRepresentation = true;
		} else {
			System.err.println("getting already marshalled representaiton");
			representation = loadedRepresentations.get(dRepresentation);
		}
		result = syncStorableRepresentation(dRepresentation, representation,
				newRepresentation);
		return result;
	}

	private static Command syncStorableRepresentation(
			final DRepresentation dRepresentation,
			Representation storableRepresentation, boolean newRepresentation) {
		Command result = null;
		if (newRepresentation) {
			final Representation sr = storableRepresentation;
			result = new ViewpointCommand(
					collaborativeSession.getTransactionalEditingDomain()) {
				@Override
				protected void doExecute() {
					try {

						final CDOResource resourceRepresentations = repositoryManager
								.getOrCreateTransaction(collaborativeSession)
								.getOrCreateResource(REPRESENTATIONS_MODEL_URI);
						final RepresentationsContainer container = (RepresentationsContainer) resourceRepresentations
								.getContents().get(0);
						sr.setName(dRepresentation.getName());
						sr.setContent(marshaller.marshall(dRepresentation));
						container.getRepresentations().add(sr);
						System.err.println("lock : "
								+ container.cdoWriteLock().isLocked() + "//"
								+ container.cdoWriteLock().isLockedByOthers());
					} catch (Exception e) {
						System.err
								.println("ERROR OCCURED DURING RESULT COMMAND");
						e.printStackTrace();
					}
				}
			};
		} else {
			final Representation sr = storableRepresentation;

			result = new ViewpointCommand(
					collaborativeSession.getTransactionalEditingDomain()) {
				@Override
				protected void doExecute() {
					try {
						System.err.println("UPDATING MARSHALLED");
						sr.setName(dRepresentation.getName());
						sr.setContent(marshaller.marshall(dRepresentation));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};

		}
		return result;
	}
	

	private static void testOpenGoalObjectiveServiceDiagram() {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
				.getDisplay().asyncExec(new Runnable() {
					public void run() {
						System.err.println("Open Goal/Objective/Service Diagram");
						//ViewpointUtil.selectAllTogafViewpoints();
						ViewpointUtil.selectViewpoint(TogafViewpoint.BUSINESS.getID());
						DRepresentation representation = RepresentationUtil
								.getRepresentation("Goal/Objective/Service Diagram");
						RepresentationUtil.openEditor(representation);
					}
				});
		
		
	}private static void testOpenApplicationCommunicationDiagram() {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
		.getDisplay().asyncExec(new Runnable() {
			public void run() {
				System.err.println("Open Application Communication Diagram");
			//	ViewpointUtil.selectAllTogafViewpoints();
				ViewpointUtil.selectViewpoint(TogafViewpoint.APPLICATION.getID());
				System.err.println("Open Really Application Communication Diagram");
				DRepresentation representation = RepresentationUtil
						.getRepresentation("Application Communication Diagram");
				RepresentationUtil.openEditor(representation);
			}
		});
	}

	private static DRepresentation testCreateDRepresentation() {
		// SDR
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
				.getDisplay().asyncExec(new Runnable() {
					public void run() {
						ViewpointUtil.selectAllTogafViewpoints();
						collaborativeSession.save();
						collaborativeSession
								.getTransactionalEditingDomain()
								.getCommandStack()
								.execute(
										new ViewpointCommand(
												collaborativeSession
														.getTransactionalEditingDomain()) {
											final Viewpoint viewpoint = ViewpointUtil
													.getViewpointIfSelected(TogafViewpoint.BUSINESS
															.getID());
											final BusinessArchitecture ba = SemanticModelUtil
													.getBusinessArchitecture();
											final RepresentationDescription representationDescription = ViewpointUtil
													.getRepresentationDescription(
															viewpoint,
															ba,
															TogafRepresentation.GOAL_OBJECTIVE_SERVICE_DIAG
																	.getID());

											@Override
											protected void doExecute() {
												DialectManager.INSTANCE
														.createRepresentation(
																"GoalObjectiveService3",
																ba,
																representationDescription,
																collaborativeSession,
																new NullProgressMonitor());
											}

										});

					}

				});

		return null;
	}
	/*
	 * Viewpoint viewpoint = ViewpointUtil
	 * .getViewpointIfSelected(TogafViewpoint.BUSINESS.getID()); final
	 * BusinessArchitecture ba = SemanticModelUtil .getBusinessArchitecture();
	 * final RepresentationDescription representationDescription = ViewpointUtil
	 * .getRepresentationDescription(viewpoint, ba,
	 * TogafRepresentation.GOAL_OBJECTIVE_SERVICE_DIAG.getID());
	 * 
	 * 
	 * 
	 * collaborativeSession .getTransactionalEditingDomain() .getCommandStack()
	 * .execute( new ViewpointCommand(collaborativeSession
	 * .getTransactionalEditingDomain()) {
	 * 
	 * @Override protected void doExecute() {
	 * DialectManager.INSTANCE.createRepresentation( "Goal/Objective/Service4",
	 * ba, representationDescription, collaborativeSession, new
	 * NullProgressMonitor()); } });
	 * 
	 * //DRepresentation representation = RepresentationUtil //
	 * .getRepresentation("Goal/Objective/Service4");
	 * //RepresentationUtil.openEditor(representation); return null; }
	 */

}

/*
 * try{
 * 
 * final Resource resourceRepresentations = repositoryManager
 * .getOrCreateTransaction(collaborativeSession)
 * .getOrCreateResource(REPRESENTATIONS_MODEL_URI); final
 * RepresentationsContainer container =
 * (RepresentationsContainer)resourceRepresentations.getContents().get(0);
 * 
 * 
 * final Representation r = RepresentationsFactory.eINSTANCE
 * .createRepresentation(); representation = r;
 * r.setName(dRepresentation.getName());
 * 
 * collaborativeSession .getTransactionalEditingDomain() .getCommandStack()
 * .execute( new RecordingCommand( collaborativeSession
 * .getTransactionalEditingDomain()) {
 * 
 * 
 * @Override protected void doExecute() { container.getRepresentations().add(r);
 * } });
 * 
 * 
 * loadedRepresentations.put(dRepresentation, representation); }catch (Exception
 * e){ e.printStackTrace(); }
 */
