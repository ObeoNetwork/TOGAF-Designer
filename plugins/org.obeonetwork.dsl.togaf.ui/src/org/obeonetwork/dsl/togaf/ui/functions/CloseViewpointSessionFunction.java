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

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * @author sdrapeau
 * 
 */
public class CloseViewpointSessionFunction extends BrowserFunction {

    /**
     * @param browser
     * @param name
     */
    public CloseViewpointSessionFunction(Browser browser, String name) {
	super(browser, name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.browser.BrowserFunction#function(java.lang.Object[])
     */
    public Object function(Object[] arguments) {
	Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	MessageDialog.openInformation(shell, "DEBUG", "Call CloseViewpointSessionFunction"); //$NON-NLS-1$ //$NON-NLS-2$
	// TODO close session and reinstantiate Browser with user-agent and redirect on the repository address selection screen
	return null;
    }

}
