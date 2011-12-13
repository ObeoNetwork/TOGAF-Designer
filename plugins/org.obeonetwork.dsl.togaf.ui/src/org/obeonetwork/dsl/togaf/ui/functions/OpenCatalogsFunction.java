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
package org.obeonetwork.dsl.togaf.ui.functions;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.dawn.ui.DawnEditorInput;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.obeonetwork.dsl.togaf.common.MyCDOConnectionUtil;
import org.obeonetwork.dsl.togaf.ui.Activator;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;

import fr.obeo.dsl.viewpoint.collab.api.RepositoryConnectionException;

/**
 * @author sdrapeau
 * 
 */
public class OpenCatalogsFunction extends BrowserFunction {

    /**
     * TOGAF editor ID.
     */
    private final static String TOGAF_EDITOR = "org.obeonetwork.dsl.togaf.contentfwk.presentation.DawnContentfwkEditorID"; //$NON-NLS-1$

    /**
     * @param browser
     * @param name
     */
    public OpenCatalogsFunction(Browser browser, String name) {
	super(browser, name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.browser.BrowserFunction#function(java.lang.Object[])
     */
    public Object function(Object[] arguments) {
	CDOResource semanticResource = CollaborativeSessionUtil.getSemanticResource();
	if (semanticResource == null) {
	    return false;
	}

	CDOSession cdoSession = null;
	try {
	    CDOTransaction tx = CollaborativeSessionUtil.getCDORepositoryManager().getOrCreateTransaction(
		    CollaborativeSessionUtil.getCollaborativeSession());
	    cdoSession = tx.getSession();
	} catch (RepositoryConnectionException e) {
	    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.OpenCatalogsFunction_1, e));
	    return false;
	}

	MyCDOConnectionUtil.instance.init(cdoSession);
	MyCDOConnectionUtil.instance.getCurrentSession().openView();
	try {
	    IWorkbench wb = PlatformUI.getWorkbench();
	    IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
	    IWorkbenchPage page = win.getActivePage();
	    DawnEditorInput uriEditorInput = new DawnEditorInput(semanticResource.getURI());
	    IEditorPart editorPart = IDE.openEditor(page, uriEditorInput, TOGAF_EDITOR);
	    editorPart.setFocus();
	} catch (Exception e) {
	    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.OpenCatalogsFunction_2, e));
	    return false;
	}
	return true;
    }

}
