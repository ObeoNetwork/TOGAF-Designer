package org.obeonetwork.dsl.togaf.ui.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorPart;

import fr.obeo.dsl.viewpoint.DAnalysis;
import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.business.api.dialect.DialectManager;
import fr.obeo.dsl.viewpoint.collab.api.remotesession.CollaborativeSession;
import fr.obeo.dsl.viewpoint.description.RepresentationDescription;
import fr.obeo.dsl.viewpoint.tools.api.command.ViewpointCommand;
import fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIManager;

public class RepresentationUtil {

    public static void openEditor(DRepresentation representation) {
	IEditorPart editor = DialectUIManager.INSTANCE.openEditor(CollaborativeSessionUtil.getCollaborativeSession(), representation);
    }

    public static void openEditor(DRepresentation representation, final CollaborativeSession session) {
	IEditorPart editor = DialectUIManager.INSTANCE.openEditor(CollaborativeSessionUtil.getCollaborativeSession(), representation);
    }

    public static List<DRepresentation> getAllRepresentations() {
	CollaborativeSession collaborativeSession = CollaborativeSessionUtil.getCollaborativeSession();

	/*
	 * DAnalysis dAnalysis =((DAnalysis) Iterables .filter(collaborativeSession.getAllSessionResources(),
	 * CDOResource.class).iterator().next().getContents() .iterator().next()) .getOwnedViews().iterator().next() .getOwnedRepresentations();
	 */

	/*
	 * Iterable<CDOResource> iterable = Iterables .filter(collaborativeSession.getAllSessionResources(), CDOResource.class); DAnalysis dAnalysis =
	 * (DAnalysis) iterable.iterator().next().getContents() .iterator().next();
	 * 
	 * List<DRepresentation> result = dAnalysis.getOwnedViews().iterator().next() .getOwnedRepresentations();
	 */

	List<DRepresentation> result = new ArrayList<DRepresentation>();
	Iterator<Resource> resources = collaborativeSession.getAllSessionResources().iterator();
	DAnalysis dAnalysis = null;
	while (resources.hasNext()) {
	    Resource r = resources.next();
	    for (Object o : r.getContents()) {
		if (o instanceof DAnalysis) {
		    dAnalysis = (DAnalysis) o;
		}
	    }
	}
	if (dAnalysis != null && dAnalysis.getOwnedViews() != null && dAnalysis.getOwnedViews().iterator().hasNext()) {
	    result = dAnalysis.getOwnedViews().iterator().next().getOwnedRepresentations();
	}
	return result;
    }

    public static DRepresentation getRepresentation(String representationName) {
	DRepresentation result = null;
	Iterator<DRepresentation> representations = getAllRepresentations().iterator();
	while (result == null && representations.hasNext()) {
	    DRepresentation r = representations.next();
	    if (representationName.equals(r.getName())) {
		result = r;
	    }
	}
	return result;
    }

    public static DRepresentation createRepresentation(final String representationName, final EObject semanticElement,
	    final RepresentationDescription representationDescription) {

	final List<DRepresentation> result = new ArrayList<DRepresentation>();

	final CollaborativeSession collaborativeSession = CollaborativeSessionUtil.getCollaborativeSession();

	collaborativeSession.getTransactionalEditingDomain().getCommandStack().execute(

	new ViewpointCommand(collaborativeSession.getTransactionalEditingDomain()) {
	    @Override
	    protected void doExecute() {
		result.add(DialectManager.INSTANCE.createRepresentation(representationName, semanticElement, representationDescription,
			collaborativeSession, new NullProgressMonitor()));
	    }
	});

	if (!result.isEmpty()) {
	    return result.get(0);
	}
	return null;

    }

    public static List<String> getAllExistingDiagrams() {
	List<String> result = new ArrayList<String>();
	return result;
    }

    public static List<String> getAllExistingMatrices() {
	List<String> result = new ArrayList<String>();
	return result;
    }

    public static List<String> getAllExistingDiagrams(List<String> viewpoints) {
	List<String> result = new ArrayList<String>();
	return result;
    }

    public static List<String> getAllExistingMatrices(List<String> viewpoints) {
	List<String> result = new ArrayList<String>();
	return result;
    }

    public static List<String> getAllExistingDiagrams(String viewpoint) {
	List<String> result = new ArrayList<String>();
	return result;
    }

    public static List<String> getAllExistingMatrices(String viewpoint) {
	List<String> result = new ArrayList<String>();
	return result;
    }

    public static void openRepresentation(String representationName) {

    }

    public static void openRepresentations(List<String> representationNames) {

    }

    public static void createRepresentation(String representationName) {

    }

}
