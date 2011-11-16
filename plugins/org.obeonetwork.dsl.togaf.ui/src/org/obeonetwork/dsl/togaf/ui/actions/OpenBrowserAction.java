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
package org.obeonetwork.dsl.togaf.ui.actions;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.obeonetwork.dsl.togaf.ui.Activator;
import org.obeonetwork.dsl.togaf.ui.editors.WebBrowserEditor;
import org.obeonetwork.dsl.togaf.ui.editors.WebBrowserInput;

public class OpenBrowserAction extends Action implements IWorkbenchWindowActionDelegate {

    public OpenBrowserAction() {
	setText("Open Browser");
	setToolTipText("Open Browser");
	setImageDescriptor(Activator.getImageDescriptor("browser.gif"));
    }

    public void run(IAction action) {
	openEditor();
    }

    private void openEditor() {

	try {
	    IProgressService service = PlatformUI.getWorkbench().getProgressService();
	    service.busyCursorWhile(new IRunnableWithProgress() {
		public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		    Display.getDefault().asyncExec(new Runnable() {
			public void run() {
			    try {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				WebBrowserInput input = new WebBrowserInput("http://localhost:9000");
				page.openEditor(input, WebBrowserEditor.ID);

			    } catch (PartInitException e) {
				MessageDialog.openError(Activator.getActiveWorkbenchShell(), "Error opening editor", e.getLocalizedMessage());
			    }
			}
		    });

		};
	    });
	} catch (Exception e) {
	    MessageDialog.openError(Activator.getActiveWorkbenchShell(), "Error", "Unable to open editor");
	}

    }

    public void run() {
	run(this);
    }

    public void init(IWorkbenchWindow window) {
    }

    public void dispose() {
    }

    public void selectionChanged(IAction action, ISelection selection) {
    }

}
