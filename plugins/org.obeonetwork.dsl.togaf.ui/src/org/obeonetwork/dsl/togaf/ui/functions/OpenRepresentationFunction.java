package org.obeonetwork.dsl.togaf.ui.functions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;
import org.obeonetwork.dsl.togaf.ui.util.RepresentationUtil;
import org.obeonetwork.dsl.togaf.ui.util.TogafRepresentation;

import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.DView;
import fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectEditor;

public class EditDiagramFunction extends BrowserFunction {

    public EditDiagramFunction(Browser browser, String name) {
	super(browser, name);
    }

    public Object function(Object[] arguments) {
	String diagName = (String) arguments[0];
	String viewpointName = TogafRepresentation.getViewpoint(diagName);
	EClass architectureKind = TogafRepresentation.getArchitectureKind(diagName);
	 try {
	    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(IPageLayout.ID_PROP_SHEET);
	} catch (PartInitException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	testOpenDiagram(viewpointName, diagName, architectureKind);
	return null;
    }

   

    private static void testOpenDiagram(final String viewpointName, final String repName, final EClass architectureKind) {
	System.err.println(repName);

	PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getDisplay().syncExec(new Runnable() {
	    public void run() {

		for (DView view : CollaborativeSessionUtil.getCollaborativeSession().getOwnedViews()) {

		    DRepresentation representation = CollaborativeSessionUtil.getRepresentation(view, repName);

		    if (representation == null) {
			if (view.getViewpoint().getName().equals(viewpointName) && CollaborativeSessionUtil.getRepresentation(view, repName) == null) {
			    representation = RepresentationUtil.createRepresentation(repName, CollaborativeSessionUtil.getArchitecture(architectureKind),
				    CollaborativeSessionUtil.getRepresentationDescription(repName));
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
					    CollaborativeSessionUtil.saveRepresentationWithPermanentOIDs(((DialectEditor)editor).getRepresentation());
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

}
