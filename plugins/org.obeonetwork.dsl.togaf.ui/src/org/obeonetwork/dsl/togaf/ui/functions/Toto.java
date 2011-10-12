package org.obeonetwork.dsl.togaf.ui.functions;

import java.util.ArrayList;
import java.util.List;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;
import org.obeonetwork.dsl.togaf.ui.util.RepresentationUtil;
import org.obeonetwork.dsl.togaf.ui.util.SemanticModelUtil;
import org.obeonetwork.dsl.togaf.ui.util.TogafRepresentation;
import org.obeonetwork.dsl.togaf.ui.util.TogafViewpoint;
import org.obeonetwork.dsl.togaf.ui.util.ViewpointUtil;

import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.description.RepresentationDescription;
import fr.obeo.dsl.viewpoint.description.Viewpoint;

public class Toto {

	


	public static List<String> getAllViewpoints() {
		List<String> result = new ArrayList<String>();

		ViewpointUtil.selectViewpoint(TogafViewpoint.BUSINESS.getID());
		Viewpoint viewpoint = ViewpointUtil.getViewpointIfSelected(TogafViewpoint.BUSINESS
				.getID());
		final BusinessArchitecture ba = SemanticModelUtil.getBusinessArchitecture();
		final RepresentationDescription representationDescription = ViewpointUtil.getRepresentationDescription(
				viewpoint, ba,
				TogafRepresentation.GOAL_OBJECTIVE_SERVICE_DIAG.getID());
		RepresentationUtil.createRepresentation("myRemoteRepresentation4", ba,
				representationDescription);

		DRepresentation representation = RepresentationUtil.getRepresentation("myRemoteRepresentation4");

		RepresentationUtil.openEditor(representation);
		CollaborativeSessionUtil.getCollaborativeSession().save();

		// collaborativeSession.close();

		/*
		 * collaborativeSession = (CollaborativeSession) sessionFactory
		 * .createSession(URI.createURI(SESSION_URI));
		 * collaborativeSession.open(); repositoryManager =
		 * CDORepositoryManagerRegistry
		 * .getRepositoryManager(collaborativeSession); editor =
		 * DialectUIManager.INSTANCE.openEditor(collaborativeSession,
		 * ((DAnalysis
		 * )Iterables.filter(collaborativeSession.getAllSessionResources(),
		 * CDOResource .class).iterator().next().getContents().iterator().next
		 * ()).getOwnedViews
		 * ().iterator().next().getOwnedRepresentations().iterator ().next());
		 * 
		 * 
		 * MessageDialog.openInformation(shell, "DEBUG",
		 * "Session CDO Ouverte : " + collaborativeSession.isOpen() +
		 * " - Semantic resources number :" +
		 * collaborativeSession.getSemanticResources() .size());
		 */
		return result;
	}
}
