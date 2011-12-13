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

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;

/**
 * @author sdrapeau
 * 
 */
public class SyncViewpointSessionFunction extends BrowserFunction {

    /**
     * @param browser
     * @param name
     */
    public SyncViewpointSessionFunction(Browser browser, String name) {
	super(browser, name);
	CollaborativeSessionUtil.getCollaborativeSession();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.browser.BrowserFunction#function(java.lang.Object[])
     */
    public Object function(Object[] arguments) {
	return null;
    }

}
