package org.obeonetwork.dsl.togaf.ui.functions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;
import org.obeonetwork.dsl.togaf.ui.util.RepresentationUtil;

import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.DView;
import fr.obeo.dsl.viewpoint.collab.api.remotesession.CollaborativeSession;

public class EditDiagramFunction extends BrowserFunction {

    public EditDiagramFunction(Browser browser, String name) {
	super(browser, name);
    }

    public Object function(Object[] arguments) {
	String diagName = (String) arguments[0];
	String viewpointName = getViewpoint(diagName);
	EClass architectureKind = getArchitectureKind(diagName);
	testOpenDiagram(viewpointName, diagName, architectureKind);
	return null;
    }

    private String getViewpoint(String diagName) {
	if ("Goal/Objective/Service Diagram".equals(diagName) || "Organization Decomposition Diagram".equals(diagName)
		|| "Actor/Role Matrix".equals(diagName) || "Functional Decomposition Diagram".equals(diagName)
		|| "Business Interaction Matrix".equals(diagName) || "EventDiagram".equals(diagName)
		|| "Business Service / Information Diagram".equals(diagName) || "Business Footprint Diagram".equals(diagName)
		|| "Business Use-Case Diagram".equals(diagName))
	    return "business";
	else if ("Data Entity/Business Function Matrix".equals(diagName) || "System/Data Matrix".equals(diagName)
		|| "Data Dissemination Diagram".equals(diagName) || "Class Diagram".equals(diagName))
	    return "data";
	else if ("System/Organization Matrix (Logical App Map)".equals(diagName) || "System/Organization Matrix (Physical App Map)".equals(diagName)
		|| "Role/System Matrix (Logical App Map)".equals(diagName) || "Role/System Matrix (Physical App Map)".equals(diagName)
		|| "Systems/Function Matrix (Logical App Map)".equals(diagName) || "Systems/Function Matrix (Physical App Map)".equals(diagName)
		|| "Application Communication Diagram".equals(diagName) || "Application & User Location Diagram".equals(diagName)
		|| "System Use Case Diagram".equals(diagName))
	    return "application";
	else if ("Environments and Locations Diagram".equals(diagName) || "Platform Decomposition Diagram".equals(diagName)
		|| "System/Technology Matrix".equals(diagName))
	    return "technology";
	return null;
    }

    private EClass getArchitectureKind(String diagName) {
	EClass result = null;
	if ("Goal/Objective/Service Diagram".equals(diagName) || "Organization Decomposition Diagram".equals(diagName)
		|| "Actor/Role Matrix".equals(diagName) || "Functional Decomposition Diagram".equals(diagName)
		|| "Business Interaction Matrix".equals(diagName) || "EventDiagram".equals(diagName)
		|| "Business Service / Information Diagram".equals(diagName) || "Business Footprint Diagram".equals(diagName)
		|| "Business Use-Case Diagram".equals(diagName))
	    result = ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE;
	else if ("Data Entity/Business Function Matrix".equals(diagName) || "System/Data Matrix".equals(diagName)
		|| "Data Dissemination Diagram".equals(diagName) || "Class Diagram".equals(diagName))
	    result = ContentfwkPackage.Literals.DATA_ARCHITECTURE;
	else if ("System/Organization Matrix (Logical App Map)".equals(diagName) || "System/Organization Matrix (Physical App Map)".equals(diagName)
		|| "Role/System Matrix (Logical App Map)".equals(diagName) || "Role/System Matrix (Physical App Map)".equals(diagName)
		|| "Systems/Function Matrix (Logical App Map)".equals(diagName) || "Systems/Function Matrix (Physical App Map)".equals(diagName)
		|| "Application Communication Diagram".equals(diagName) || "Application & User Location Diagram".equals(diagName)
		|| "System Use Case Diagram".equals(diagName))
	    result = ContentfwkPackage.Literals.APPLICATION_ARCHITECTURE;
	else if ("Environments and Locations Diagram".equals(diagName) || "Platform Decomposition Diagram".equals(diagName)
		|| "System/Technology Matrix".equals(diagName))
	    result = ContentfwkPackage.Literals.TECHNOLOGY_ARCHITECTURE;
	return result;
    }

    private static void testOpenDiagram(final String viewpointName, final String repName, final EClass architectureKind) {
	PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getDisplay().syncExec(new Runnable() {
	    public void run() {
		CollaborativeSession collaborativeSession = CollaborativeSessionUtil.getCollaborativeSession();
		for (DView view : collaborativeSession.getOwnedViews()) {

		    DRepresentation representation = CollaborativeSessionUtil.getRepresentation(view, repName);

		    if (representation == null) {
			if (view.getViewpoint().getName().equals(viewpointName) && CollaborativeSessionUtil.getRepresentation(view, repName) == null) {
			    representation = RepresentationUtil.createRepresentation(repName,
				    CollaborativeSessionUtil.getArchitecture(architectureKind),
				    CollaborativeSessionUtil.getRepresentationDescription(repName));
			}
		    }

		    if (representation != null) {
			RepresentationUtil.openEditor(representation, collaborativeSession);
			break;
		    }

		}

	    }

	});

	// collaborativeSession.save();
    }

}
