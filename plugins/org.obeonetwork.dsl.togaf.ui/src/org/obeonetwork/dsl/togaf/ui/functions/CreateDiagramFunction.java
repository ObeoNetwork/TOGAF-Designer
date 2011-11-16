package org.obeonetwork.dsl.togaf.ui.functions;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

public class CreateDiagramFunction extends BrowserFunction {

	public CreateDiagramFunction(Browser browser, String name) {
		super(browser, name);
	}

	public Object function(Object[] arguments) {
	    return null;
		/*ViewpointUtil.selectViewpoint(TogafViewpoint.BUSINESS.getID());
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
		return null;*/
	}

}
