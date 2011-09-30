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
package org.obeonetwork.dsl.togaf.ui.intro;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.IntroPart;
import org.obeonetwork.dsl.togaf.ui.functions.CloseViewpointSessionFunction;
import org.obeonetwork.dsl.togaf.ui.functions.EditDiagramFunction;
import org.obeonetwork.dsl.togaf.ui.functions.SyncViewpointSessionFunction;

public class WebIntroPart extends IntroPart {

	public void standbyStateChanged(boolean standby) {
	}

	@Override
	public void createPartControl(Composite parent) {
		final Browser browser;
		try {
			browser = new Browser(parent, SWT.WEBKIT);
		} catch (SWTError e) {
			System.out.println("Could not instantiate Browser: " + e.getMessage());
			return;
		}
		String[] headers = { "user-agent: eclipse" };
		browser.setUrl("http://localhost:9000", null, headers);
		JavascriptViewpointApi jsViewpointApi = new JavascriptViewpointApi(browser);
		browser.addLocationListener(jsViewpointApi);
	}

	@Override
	public void setFocus() {

	}

	private class JavascriptViewpointApi implements LocationListener {
		Browser browser;

		public JavascriptViewpointApi(Browser browser) {
			this.browser = browser;
		}

		public void changing(LocationEvent event) {
			// TODO maybe use singleton for each functions ?
			new CloseViewpointSessionFunction(browser, "closeViewpointSession");
			new SyncViewpointSessionFunction(browser, "syncViewpointSession");
			new EditDiagramFunction(browser, "editDiagramFunction");
		}

		public void changed(LocationEvent event) {
		}
	}

}
