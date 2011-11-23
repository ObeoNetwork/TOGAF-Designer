package org.obeonetwork.dsl.togaf.ui.functions;

import org.eclipse.emf.cdo.dawn.ui.DawnEditorInput;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.Workbench;
import org.obeonetwork.dsl.togaf.common.MyCDOConnectionUtil;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;

import fr.obeo.dsl.viewpoint.collab.api.RepositoryConnectionException;

public class OpenAllCatalogsFunction extends BrowserFunction {

    private final static String TOGAF_EDITOR = // "org.obeonetwork.dsl.togaf.contentfwk.contentfwk.presentation.ContentfwkEditorID";
    // "org.obeonetwork.dsl.togaf.contentfwk.contentfwk.presentation.ContentfwkEditorID";
    // "org.eclipse.emf.cdo.ui.CDOEditor";
    "org.obeonetwork.dsl.togaf.contentfwk.presentation.DawnContentfwkEditorID";

    public OpenAllCatalogsFunction(Browser browser, String name) {
	super(browser, name);
    }

    public Object function(Object[] arguments) {
	CDOResource semanticResource = CollaborativeSessionUtil.getSemanticResource();
	if (semanticResource == null) {
	    return false;
	}

	CDOSession cdoSession = null;
	try {
	    CDOTransaction tx = CollaborativeSessionUtil.getCDORepositoryManager().getOrCreateTransaction(CollaborativeSessionUtil.getCollaborativeSession());
	    cdoSession= tx.getSession();
	} catch (RepositoryConnectionException e1) {
	    // TODO Auto-generated catch block
	    e1.printStackTrace();
	}
	
	MyCDOConnectionUtil.instance.init(cdoSession);
	MyCDOConnectionUtil.instance.getCurrentSession().openView();
	try {
	    IWorkbenchPage page = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage();
	    DawnEditorInput uriEditorInput = new DawnEditorInput(semanticResource.getURI());
	    IEditorPart editorPart = IDE.openEditor(page, uriEditorInput, TOGAF_EDITOR);
	    editorPart.setFocus();
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    return false;
	}
	return true;
    }

    

}
