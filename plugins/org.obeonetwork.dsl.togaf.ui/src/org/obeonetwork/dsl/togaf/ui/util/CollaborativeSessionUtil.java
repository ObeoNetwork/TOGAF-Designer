/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
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
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.net4j.util.security.IPasswordCredentials;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Architecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;
import org.obeonetwork.dsl.togaf.representations.Representation;
import org.obeonetwork.dsl.togaf.representations.RepresentationsFactory;
import org.obeonetwork.dsl.togaf.representations.View;
import org.obeonetwork.dsl.togaf.representations.ViewContainer;
import org.obeonetwork.dsl.togaf.ui.Activator;
import org.obeonetwork.dsl.togaf.ui.policies.TogafCDOSavingPolicy;
import org.obeonetwork.dsl.togaf.ui.util.marshaller.Marshaller;
import org.obeonetwork.dsl.togaf.ui.util.marshaller.MarshallerFactory;
import org.obeonetwork.dsl.togaf.ui.util.properties.TogafProperties;

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
import fr.obeo.dsl.viewpoint.ui.business.api.session.UserSession;


/**
 * 
 * @author sdrapeau
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

    private static List<String> viewpointsAdded;

    // The scheme "memory" enables to instantiate an InMemoryResourceImpl and not to serialize it in a file.
    // This feature requires to get the EMF bug fix on the WorkspaceSynchronizer.
    private static final String SESSION_URI = "in-memory.aird";

    private static CollaborativeSession createCollaborativeSession() {
	if (collaborativeSession != null) {
	    return collaborativeSession;
	}
	try {
	    initViewpointsAdded();
	    // Open the collaborative session
	    openSession();
	    prepareSemanticResources();
	} catch (Exception e) {
	    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot open Viewpoint session.", e));
	}
	collaborativeSession.setSavingPolicy(new TogafCDOSavingPolicy(collaborativeSession));
	return collaborativeSession;
    }

    private static void initViewpointsAdded() {
	viewpointsAdded = new ArrayList<String>();
	IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor("org.obeonetwork.dsl.togaf.ui.newViewpoint");
	for (IConfigurationElement e : config) {
	    String name = e.getAttribute("name");
	    viewpointsAdded.add(name);
	}
    }

    public static void openSession() throws RepositoryConnectionException, CoreException {

	RepositoryConfig repositoryConfig = CDOConfigUtils.createRepositoryConfig(TogafProperties.REPOSITORY_SERVER, TogafProperties.REPOSITORY_PORT,
		REPOSITORY_NAME);
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
	// Enables not to store durable locks in an aird and not to have the confirmation dialog during closing editors (save and commit, save
	// only...)
	// CDOViewpointActivator.getDefault().getPreferenceStore().setValue(CDOViewpointPreferenceKeys.PREF_ENABLE_DURABLE_LOCKING.name(), false);
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
	for (String viewpointAdded : viewpointsAdded) {
	    for (Viewpoint viewpoint : getViewpoints(viewpointAdded)) {
		final Viewpoint v = ViewpointResourceHelper.getCorrespondingViewpoint(collaborativeSession, viewpoint);
		viewpointsToSelect.add(v);
		viewpointNamesToSelect.add(v.getName());
	    }
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
    public static void commitForNewResource() throws RepositoryConnectionException {
	try {
	    repositoryManager.getOrCreateTransaction(collaborativeSession).commit();
	} catch (CommitException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    private static void initSemanticBusinessResource(Resource semanticResource) {
	//EnterpriseArchitecture enterpriseArchitecture = ContentfwkFactory.eINSTANCE.createEnterpriseArchitecture();
	//semanticResource.getContents().add(enterpriseArchitecture);
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
	for (String viewpointAdded : viewpointsAdded) {
	    for (Viewpoint viewpoint : getViewpoints(viewpointAdded)) {
		String viewpointUriFragment = viewpoint.eResource().getURIFragment(viewpoint);
		// Create the View
		View view = RepresentationsFactory.eINSTANCE.createView();
		view.setViewpointURI(viewpointUriFragment);
		container.getViews().add(view);
	    }
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
	    if (r.getURI().toString().endsWith("aird")) {
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
	if (result == null) {
	    for (String viewpointAdded : viewpointsAdded) {
		for (Viewpoint viewpoint : getViewpoints(viewpointAdded)) {
		    String uriFragment = viewpoint.eResource().getURIFragment(viewpoint);
		    if (uriFragment.equals(viewpointUri)) {
			result = viewpoint;
			break;
		    }
		}
	    }
	}
	return result;
    }

    public static RepresentationDescription getRepresentationDescription(String name) {
	for (Viewpoint viewpoint : getViewpoints("TOGAF")) {
	    for (RepresentationDescription repDesc : viewpoint.getOwnedRepresentations()) {
		if (repDesc.getName().equals(name)) {
		    return repDesc;
		}
	    }
	}
	for (String viewpointAdded : viewpointsAdded) {
	    for (Viewpoint viewpoint : getViewpoints(viewpointAdded)) {
		for (RepresentationDescription repDesc : viewpoint.getOwnedRepresentations()) {
		    if (repDesc.getName().equals(name)) {
			return repDesc;
		    }
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

    public static Command marshallDRepresentation(final DRepresentation dRepresentation) {
	Command result = null;

	result = new ViewpointCommand(CollaborativeSessionUtil.getCollaborativeSession().getTransactionalEditingDomain()) {
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
		    } else {
			final Representation representation = loadedRepresentations.get(dRepresentation);
			representation.setName(dRepresentation.getName());
			representation.setContent(marshaller.marshall(dRepresentation));
		    }
		} catch (Exception e) {
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

}
