package org.obeonetwork.dsl.togaf.ui.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.net4j.util.security.IPasswordCredentials;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Architecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture;
import org.obeonetwork.dsl.togaf.representations.Representation;
import org.obeonetwork.dsl.togaf.representations.RepresentationsFactory;
import org.obeonetwork.dsl.togaf.representations.View;
import org.obeonetwork.dsl.togaf.representations.ViewContainer;
import org.obeonetwork.dsl.togaf.ui.Activator;

import com.google.common.collect.Sets;

import fr.obeo.dsl.viewpoint.DAnalysis;
import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.DRepresentationContainer;
import fr.obeo.dsl.viewpoint.DView;
import fr.obeo.dsl.viewpoint.ViewpointFactory;
import fr.obeo.dsl.viewpoint.business.api.componentization.ViewpointRegistry;
import fr.obeo.dsl.viewpoint.business.api.helper.ViewpointResourceHelper;
import fr.obeo.dsl.viewpoint.collab.api.CDOAuthenticationManager;
import fr.obeo.dsl.viewpoint.collab.api.CDOAuthenticationManagerRegistry;
import fr.obeo.dsl.viewpoint.collab.api.CDORepositoryManager;
import fr.obeo.dsl.viewpoint.collab.api.CDORepositoryManagerRegistry;
import fr.obeo.dsl.viewpoint.collab.api.RepositoryConnectionException;
import fr.obeo.dsl.viewpoint.collab.api.model.cdoconfig.utils.CDOConfigUtils;
import fr.obeo.dsl.viewpoint.collab.api.remotesession.CollaborativeSession;
import fr.obeo.dsl.viewpoint.collab.internal.session.factory.CollaborativeSessionFactoryImpl;
import fr.obeo.dsl.viewpoint.collab.model.cdoconfig.RepositoryConfig;
import fr.obeo.dsl.viewpoint.description.Group;
import fr.obeo.dsl.viewpoint.description.RepresentationDescription;
import fr.obeo.dsl.viewpoint.description.Viewpoint;
import fr.obeo.dsl.viewpoint.tools.api.command.ViewpointCommand;
import fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectEditor;
import fr.obeo.dsl.viewpoint.ui.business.api.session.UserSession;

/**
 * 
 * @author steph
 * 
 */
public class CollaborativeSessionUtil {

    public static final String REPOSITORY_NAME = "demo";

    public static final String SEMANTIC_MODEL_URI = "/data.togaf";

    public static final String REPRESENTATIONS_MODEL_URI = "/rep.representations";

    public static CollaborativeSession getCollaborativeSession() {
	return collaborativeSession;
    }

    public static CDORepositoryManager getCDORepositoryManager() {
	return repositoryManager;
    }

    public static CDOResource getSemanticResource() {
	try {
	    return repositoryManager.getOrCreateTransaction(collaborativeSession).getOrCreateResource(SEMANTIC_MODEL_URI);
	} catch (RepositoryConnectionException e) {
	    e.printStackTrace();
	}
	return null;
    }

    private static Marshaller marshaller = MarshallerFactory.getInstance().getMarshaller(MarshallerFactory.MarshallerKind.XMI);

    private static HashMap<DRepresentation, Representation> loadedRepresentations = new HashMap<DRepresentation, Representation>();
    
    private static CollaborativeSession collaborativeSession = createCollaborativeSession();

    private static CDORepositoryManager repositoryManager;

    private static final String SERVER_LOCATION = "localhost";

    private static final String SERVER_PORT_NUMBER = "2036";

    private static final String SESSION_URI = "in-memory.aird";

    public static void saveRepresentationWithPermanentOIDs(DRepresentation representation) {
	
	// Enables to get permanent id for business added objects
	collaborativeSession.save();
//	try {
//	    commitForNewResource();
//	} catch (RepositoryConnectionException e) {
//	    // TODO Auto-generated catch block
//	    e.printStackTrace();
//	}
	collaborativeSession.getTransactionalEditingDomain().getCommandStack().execute(save(representation));
	
	collaborativeSession.save();
//	try {
//	    commitForNewResource();
//	} catch (RepositoryConnectionException e) {
//	    // TODO Auto-generated catch block
//	    e.printStackTrace();
//	}
	
	//collaborativeSession.close();
    }

    private static CollaborativeSession createCollaborativeSession() {
	if (collaborativeSession != null) {
	    return collaborativeSession;
	}

	try {
	    // Open the collaborative session
	    openSession();

	    prepareSemanticResources();

	    // BEGIN - Tests
	    // testCreateDRepresentation();
	    // testOpenDiagram("business", "Goal/Objective/Service Diagram", ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE);
	    // testOpenDiagram("application", "Application Communication Diagram", ContentfwkPackage.Literals.APPLICATION_ARCHITECTURE);
	    // END - Tests
	} catch (Exception e) {
	    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot open Viewpoint session.", e));
	}

	return collaborativeSession;
    }

    public static void openSession() throws RepositoryConnectionException, CoreException {

	RepositoryConfig repositoryConfig = CDOConfigUtils.createRepositoryConfig(SERVER_LOCATION, SERVER_PORT_NUMBER, REPOSITORY_NAME);

	// use new authentication API contributed from #OD-141
	CDOAuthenticationManagerRegistry.registerAuthenticationManager("*", new CDOAuthenticationManager() {
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
			    MessageDigest m = MessageDigest.getInstance("MD5");
			    byte[] out = m.digest(password.getBytes());
			    return new String(Base64.encodeBase64(out));
			} catch (NoSuchAlgorithmException e) {
			    return null;
			}
		    }
		};
	    }
	});

	collaborativeSession = (CollaborativeSession) CollaborativeSessionFactoryImpl.INSTANCE.createSession(URI.createURI(SESSION_URI));

	collaborativeSession.open();

	collaborativeSession = collaborativeSession.connect(repositoryConfig);

	// Get the class used to access the CDO repository
	repositoryManager = CDORepositoryManagerRegistry.getRepositoryManager(collaborativeSession);
    }

    private static void initRepresentationsResource(Resource remoteDAnalysisResource) {
	remoteDAnalysisResource.getContents().add(ViewpointFactory.eINSTANCE.createDAnalysis());
    }

    private static void prepareSemanticResources() throws RepositoryConnectionException {

	if (collaborativeSession.getSemanticResources().isEmpty()) {

	    final Resource semanticBusinessResource = getResource(SEMANTIC_MODEL_URI);

	    initSemanticBusinessResourceInSession(semanticBusinessResource);

	    final Resource semanticRepresentationsResource = getResource(REPRESENTATIONS_MODEL_URI);

	    initSemanticRepresentationsResourceInSession(semanticRepresentationsResource);

	    // => Select the viewpoints in relation to TOGAF business (roles, credentials...) in the Viewpoint CDO session
	    // => Create empty representations (because it is specified in the odesign).
	    initSelectedViewpoints();

	    collaborativeSession.save();

	    // Enables to store the changes related to the representations, in DB.
	    registerListeners();

	}
    }

    private static void initSelectedViewpoints() {

	final Set<String> viewpointNamesToSelect = Sets.newHashSet();

	final Set<Viewpoint> viewpointsToSelect = Sets.newHashSet();

	for (Viewpoint viewpoint : getViewpoints("TOGAF")) {
	    final Viewpoint v = ViewpointResourceHelper.getCorrespondingViewpoint(collaborativeSession, viewpoint);
	    viewpointsToSelect.add(v); // For the demo, all of the TOGAF viewpoints are selected.
	    viewpointNamesToSelect.add(v.getName());
	}

	// viewpointNamesToSelect.add("business");

	UserSession userSession = UserSession.from(collaborativeSession);
	userSession.selectViewpoints(viewpointNamesToSelect);

	// final Callback callback = new ViewpointSelectionCallback();
	// final Command changeViewpointSelectionCommand = new ChangeViewpointSelectionCommand(collaborativeSession, callback, viewpointsToSelect,
	// new HashSet<Viewpoint>());
	// collaborativeSession.getTransactionalEditingDomain().getCommandStack().execute(changeViewpointSelectionCommand);
    }

    private static void initSemanticRepresentationsResourceInSession(final Resource semanticRepresentationsResource)
	    throws RepositoryConnectionException {
	if (semanticRepresentationsResource.getContents().isEmpty()) {

	    // Init this resource with the container of views and views if the DB is empty
	    initSemanticRepresentationsResource(semanticRepresentationsResource);
	    commitForNewResource();

	} else {

	    // Translate the representations in DB to DRepresentations and store them in the viewpoint CDO session.
	    // The DRepresentations have to be ordered per DRepresentationContainer with the related viewpoint.
	    loadRepresentationsInViewPointSession(semanticRepresentationsResource);

	}

	collaborativeSession.getTransactionalEditingDomain().getCommandStack()
		.execute(new ViewpointCommand(collaborativeSession.getTransactionalEditingDomain()) {
		    @Override
		    protected void doExecute() {
			collaborativeSession.addSemanticResource(semanticRepresentationsResource.getURI(), true);
		    }
		});
    }

    private static void initSemanticBusinessResourceInSession(final Resource semanticBusinessResource) throws RepositoryConnectionException {
	// Init this resource with TOGAF architectures if the DB is empty
	if (semanticBusinessResource.getContents().isEmpty()) {
	    initSemanticBusinessResource(semanticBusinessResource);
	    commitForNewResource();
	}

	// Add this resource to the Viewpoint CDO session
	collaborativeSession.getTransactionalEditingDomain().getCommandStack()
		.execute(new ViewpointCommand(collaborativeSession.getTransactionalEditingDomain()) {
		    @Override
		    protected void doExecute() {
			collaborativeSession.addSemanticResource(semanticBusinessResource.getURI(), true);
		    }
		});
    }

    private static Resource getResource(String uri) throws RepositoryConnectionException {
	// Get the business semantic resource
	final Resource resource = repositoryManager.getOrCreateTransaction(collaborativeSession).getOrCreateResource(uri);

	// commitForNewResource();

	return resource;
    }

    // Commit after creating the resource to avoid URI clash
    private static void commitForNewResource() throws RepositoryConnectionException {
	try {
	    repositoryManager.getOrCreateTransaction(collaborativeSession).commit();
	} catch (CommitException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    private static void initSemanticBusinessResource(Resource semanticResource) {
	EnterpriseArchitecture enterpriseArchitecture = ContentfwkFactory.eINSTANCE.createEnterpriseArchitecture();

	StrategicArchitecture strategicArchitecture = ContentfwkFactory.eINSTANCE.createStrategicArchitecture();
	enterpriseArchitecture.getArchitectures().add(strategicArchitecture);

	BusinessArchitecture businessArchitecture = ContentfwkFactory.eINSTANCE.createBusinessArchitecture();
	enterpriseArchitecture.getArchitectures().add(businessArchitecture);

	DataArchitecture dataArchitecture = ContentfwkFactory.eINSTANCE.createDataArchitecture();
	enterpriseArchitecture.getArchitectures().add(dataArchitecture);

	ApplicationArchitecture applicationArchitecture = ContentfwkFactory.eINSTANCE.createApplicationArchitecture();
	enterpriseArchitecture.getArchitectures().add(applicationArchitecture);

	TechnologyArchitecture technologyArchitecture = ContentfwkFactory.eINSTANCE.createTechnologyArchitecture();
	enterpriseArchitecture.getArchitectures().add(technologyArchitecture);

	semanticResource.getContents().add(enterpriseArchitecture);
    }

    private static void initSemanticRepresentationsResource(Resource semanticResource) {

	ViewContainer container = RepresentationsFactory.eINSTANCE.createViewContainer();

	for (Viewpoint viewpoint : getViewpoints("TOGAF")) {
	    String viewpointUriFragment = viewpoint.eResource().getURIFragment(viewpoint);

	    // Create the View
	    View view = RepresentationsFactory.eINSTANCE.createView();
	    view.setViewpointURI(viewpointUriFragment);

	    container.getViews().add(view);
	}

	semanticResource.getContents().add(container);
    }

    // TODO: To manage a scope of viewpoints/DSLs to obtain the list of available viewpoints.
    private static List<Viewpoint> getViewpoints(String oDesignRootGroupName) {
	final List<Viewpoint> result = new ArrayList<Viewpoint>();
	final Iterator<Viewpoint> viewpoints = ViewpointRegistry.getInstance().getViewpoints().iterator();
	while (viewpoints.hasNext()) {
	    Viewpoint viewpoint = viewpoints.next();
	    EObject root = viewpoint.eResource().getContents().get(0);
	    if (root instanceof Group && ((Group) root).getName().equals(oDesignRootGroupName)) {
		result.add(viewpoint);
	    }
	}
	return result;
    }

    private static Resource getAirdResource() {
	for (Resource r : collaborativeSession.getAllSessionResources()) {
	    if ("aird".equals(r.getURI().fileExtension())) {
		return r;
	    }
	}
	return null;
    }

    private static void loadRepresentationsInViewPointSession(Resource resourceRepresentations) {

	if (resourceRepresentations.getContents().get(0) instanceof ViewContainer) {

	    final ViewContainer container = (ViewContainer) resourceRepresentations.getContents().get(0);

	    // Get the Viewpoint CDO session resource
	    final Resource airdResource = getAirdResource();

	    TransactionalEditingDomain editingDomain = collaborativeSession.getTransactionalEditingDomain();
	    RecordingCommand cmd = new RecordingCommand(editingDomain, "Load Representations in ViewPoint Session") {

		protected void doExecute() {

		    if (airdResource.getContents().isEmpty()) {

			// Init session if empty (create the root DAnalysis)
			initRepresentationsResource(airdResource);

		    } else {

			DAnalysis dAnalysis = (DAnalysis) airdResource.getContents().get(0);

			Iterator<View> views = container.getViews().iterator();
			while (views.hasNext()) {

			    View view = views.next();

			    // Create the DRepresentationContainer for each View.
			    DRepresentationContainer dRepresentationContainer = ViewpointFactory.eINSTANCE.createDRepresentationContainer();
			    String viewpointUri = view.getViewpointURI();

			    Viewpoint viewpoint = getViewpoint(viewpointUri);

			    // Set the viewpoint reference.
			    Viewpoint v = ViewpointResourceHelper.getCorrespondingViewpoint(collaborativeSession, viewpoint);
			    dRepresentationContainer.setViewpoint(v);

			    for (Representation representation : view.getRepresentations()) {

				// Translate a representation into a DRepresentation
				DRepresentation dRepresentation = marshaller.unMarshall(representation.getContent());

				// Map the DRepresentation -> Representation
				loadedRepresentations.put(dRepresentation, representation);

				dRepresentationContainer.getOwnedRepresentations().add(dRepresentation);

			    }

			    dAnalysis.getOwnedViews().add(dRepresentationContainer);
			}

		    }
		}
	    };
	    editingDomain.getCommandStack().execute(cmd);
	}
    }

    private static Viewpoint getViewpoint(String viewpointUri) {
	Viewpoint result = null;
	for (Viewpoint viewpoint : getViewpoints("TOGAF")) {
	    String uriFragment = viewpoint.eResource().getURIFragment(viewpoint);
	    if (uriFragment.equals(viewpointUri)) {
		result = viewpoint;
		break;
	    }
	}
	return result;
    }

    private static void registerListeners() {
	collaborativeSession.getTransactionalEditingDomain().addResourceSetListener(new LocalResourceSetListener());
    }

    private static class LocalResourceSetListener extends ResourceSetListenerImpl {

	public LocalResourceSetListener() {
	    super();
	}

	public boolean isPrecommitOnly() {
	    return true;
	}

	@Override
	public Command transactionAboutToCommit(final ResourceSetChangeEvent event) throws RollbackException {
	    CompoundCommand result = new CompoundCommand();

	    List<Notification> notifications = event.getNotifications();

	    for (Notification notification : notifications) {

		if (notification.getNotifier() instanceof DRepresentation) {

		    DRepresentation dRepresentation = (DRepresentation) notification.getNotifier();

		    // handle diagram creation and update
		    if (notification.getEventType() == Notification.ADD || notification.getEventType() == Notification.SET) {
			System.out.println("add or update diagram " + dRepresentation.getName());
			result.append(save(dRepresentation));			
		    } else if (notification.getEventType() == Notification.REMOVE) {
			// System.out.println("delete diagram " + dRepresentation.getName());
			// result.append(remove(dRepresentation));
		    }

		} else if (notification.getNotifier() instanceof EObject) {
		    EObject eObject = (EObject) notification.getNotifier();
		    // handle GMF notation updates
		    if (eObject.eResource() != null && eObject.eResource().getURI().toString().equals(SESSION_URI)) {
			DRepresentation dRepresentation = findDRepresentation(eObject);
			if (dRepresentation != null) {
			    System.out.println("modify gmf diagram " + dRepresentation.getName());
			    result.append(save(dRepresentation));
			}
		    }
		}
	    }

	    return result.unwrap();
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

    private static Command remove(final DRepresentation dRepresentation) {

	Command result = new ViewpointCommand(collaborativeSession.getTransactionalEditingDomain()) {
	    @Override
	    protected void doExecute() {
		Representation representation = loadedRepresentations.get(dRepresentation);
		View view = (View) representation.eContainer();
		System.out.println("Remove representation : " + representation.getName());
		view.getRepresentations().remove(representation);
		loadedRepresentations.remove(dRepresentation);
	    }
	};
	return result;
    }

    private static Command save(final DRepresentation dRepresentation) {
	Command result = null;

	result = new ViewpointCommand(collaborativeSession.getTransactionalEditingDomain()) {
	    @Override
	    protected void doExecute() {
		try {

		    if (!loadedRepresentations.containsKey(dRepresentation)) {

			final Representation representation = RepresentationsFactory.eINSTANCE.createRepresentation();
			loadedRepresentations.put(dRepresentation, representation);

			final CDOResource resourceRepresentations = repositoryManager.getOrCreateTransaction(collaborativeSession)
				.getOrCreateResource(REPRESENTATIONS_MODEL_URI);

			final ViewContainer container = (ViewContainer) resourceRepresentations.getContents().get(0);
			representation.setName(dRepresentation.getName());
			representation.setContent(marshaller.marshall(dRepresentation));

			// Find the right View to store the storable representation
			View view = getView(dRepresentation, container);

			view.getRepresentations().add(representation);

			System.err.println("lock : " + container.cdoWriteLock().isLocked() + "//" + container.cdoWriteLock().isLockedByOthers());

		    } else {
			System.err.println("getting already marshalled representaiton");
			final Representation representation = loadedRepresentations.get(dRepresentation);

			System.err.println("UPDATING MARSHALLED");
			representation.setName(dRepresentation.getName());
			representation.setContent(marshaller.marshall(dRepresentation));
		    }

		} catch (Exception e) {
		    System.err.println("ERROR OCCURED DURING RESULT COMMAND");
		    e.printStackTrace();
		}
	    }

	    private View getView(final DRepresentation dRepresentation, final ViewContainer container) {
		View result = null;
		Iterator<View> views = container.getViews().iterator();
		while (views.hasNext()) {
		    result = views.next();
		    Viewpoint viewpoint = ((DRepresentationContainer) dRepresentation.eContainer()).getViewpoint();
		    if (result.getViewpointURI().equals(viewpoint.eResource().getURIFragment(viewpoint))) {
			break;
		    }
		}
		return result;
	    }
	};

	return result;
    }

    private static void testOpenDiagram(final String viewpointName, final String repName, final EClass architectureKind) {

	System.err.println(repName);

	PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getDisplay().syncExec(new Runnable() {
	    public void run() {

		for (DView view : collaborativeSession.getOwnedViews()) {

		    DRepresentation representation = getRepresentation(view, repName);

		    if (representation == null) {
			if (view.getViewpoint().getName().equals(viewpointName) && getRepresentation(view, repName) == null) {
			    representation = RepresentationUtil.createRepresentation(repName, getArchitecture(architectureKind),
				    getRepresentationDescription(repName));
			}
		    }

		    if (representation != null) {
			// final DRepresentation rep = representation;
			// new ViewpointCommand(collaborativeSession.getTransactionalEditingDomain()) {
			// @Override
			// protected void doExecute() {
			// RepresentationUtil.openEditor(rep, collaborativeSession);
			// }
			// }.execute();
			final IEditorPart editor = RepresentationUtil.openEditor(representation);
			if (editor != null) {
			    editor.getSite().getPage().addPartListener(new IPartListener() {
				    
				    public void partOpened(IWorkbenchPart part) {
					// TODO Auto-generated method stub
					
				    }
				    
				    public void partDeactivated(IWorkbenchPart part) {
					// TODO Auto-generated method stub
					
				    }
				    
				    public void partClosed(IWorkbenchPart part) {
					// Save in DB FIXME: The save has to be on demand (through CTRL-S or a specific button).
					// The dialog to do "save and commit" during closing of the editor does not make this operation.
					if (editor instanceof DialectEditor && part == editor) {
					    saveRepresentationWithPermanentOIDs(((DialectEditor)editor).getRepresentation());
					}
					// The ideal solution would be, when we decide to save a representation, to retrieve all the new business semantic objects (with temporary OID) referenced by the representation to commit them before to commit the representation.
				    }
				    
				    public void partBroughtToTop(IWorkbenchPart part) {
					
				    }
				    
				    public void partActivated(IWorkbenchPart part) {
					// TODO Auto-generated method stub
					
				    }
				});
			}
			break;
		    }

		}

	    }

	});
    }

    public static RepresentationDescription getRepresentationDescription(String name) {
	for (Viewpoint viewpoint : getViewpoints("TOGAF")) {
	    for (RepresentationDescription repDesc : viewpoint.getOwnedRepresentations()) {
		if (repDesc.getName().equals(name)) {
		    return repDesc;
		}
	    }
	}
	return null;
    }

    public static DRepresentation getRepresentation(DView view, String repName) {
	for (DRepresentation rep : view.getOwnedRepresentations()) {
	    if (rep.getName().equals(repName)) {
		return rep;
	    }
	}
	return null;
    }

    private static Resource getSemanticBusinessResource() {
	for (Resource resource : collaborativeSession.getSemanticResources()) {
	    if (resource.getURI().path().equals(SEMANTIC_MODEL_URI)) {
		return resource;
	    }
	}
	return null;
    }

    public static Architecture getArchitecture(EClass architectureKind) {
	Resource resource = getSemanticBusinessResource();
	if (resource != null) {
	    EObject root = resource.getContents().get(0);
	    if (root instanceof EnterpriseArchitecture) {
		for (Architecture architecture : ((EnterpriseArchitecture) root).getArchitectures()) {
		    if (architectureKind.isInstance(architecture)) {
			return architecture;
		    }
		}
	    }
	}
	return null;
    }

}