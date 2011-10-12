package org.obeonetwork.dsl.togaf.ui.functions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.ui.intro.WebIntroPart;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;
import org.obeonetwork.dsl.togaf.ui.util.RepresentationUtil;
import org.obeonetwork.dsl.togaf.ui.util.SemanticModelUtil;
import org.obeonetwork.dsl.togaf.ui.util.TogafRepresentation;
import org.obeonetwork.dsl.togaf.ui.util.TogafViewpoint;
import org.obeonetwork.dsl.togaf.ui.util.ViewpointUtil;

import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.collab.api.RepositoryConnectionException;
import fr.obeo.dsl.viewpoint.description.RepresentationDescription;
import fr.obeo.dsl.viewpoint.description.Viewpoint;

public class CreateDiagramFunction extends BrowserFunction {

	public CreateDiagramFunction(Browser browser, String name) {
		super(browser, name);
	}

	public Object function(Object[] arguments) {
		ViewpointUtil.selectViewpoint(TogafViewpoint.BUSINESS.getID());
		Viewpoint viewpoint = ViewpointUtil.getViewpointIfSelected(TogafViewpoint.BUSINESS
				.getID());
		final BusinessArchitecture ba = SemanticModelUtil.getBusinessArchitecture();
		final RepresentationDescription representationDescription = ViewpointUtil.getRepresentationDescription(
				viewpoint, ba,
				TogafRepresentation.GOAL_OBJECTIVE_SERVICE_DIAG.getID());
		RepresentationUtil.createRepresentation("Goal/Objective/Service", ba,
				representationDescription);

		DRepresentation representation = RepresentationUtil.getRepresentation("Goal/Objective/Service");

		RepresentationUtil.openEditor(representation);
		CollaborativeSessionUtil.getCollaborativeSession().save();
		WebIntroPart.browser.stop();
		return null;
	}

}
