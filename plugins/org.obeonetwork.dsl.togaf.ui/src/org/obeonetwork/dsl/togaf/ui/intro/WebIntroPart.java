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

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.togaf.ui.editors.WebBrowserEditor;
import org.obeonetwork.dsl.togaf.ui.editors.WebBrowserInput;
import org.obeonetwork.dsl.togaf.ui.functions.CloseViewpointSessionFunction;
import org.obeonetwork.dsl.togaf.ui.functions.CreateDiagramFunction;
import org.obeonetwork.dsl.togaf.ui.functions.EditDiagramFunction;
import org.obeonetwork.dsl.togaf.ui.functions.OpenAllCatalogsFunction;
import org.obeonetwork.dsl.togaf.ui.functions.SyncViewpointSessionFunction;

public class WebIntroPart  {

   // public static Browser browser = null;
public WebIntroPart(){
    this.createPartControl();
}
    public void standbyStateChanged(boolean standby) {
    }

    public void createPartControl() {
	
	IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	WebBrowserInput input = new WebBrowserInput("http://localhost:9000");
	try {
	    page.openEditor(input, WebBrowserEditor.ID);
	} catch (PartInitException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	/*
	 try {
	            // http://www.eclipse.org/swt/faq.php#howusewebkit
	            browser = new Browser(parent, SWT.WEBKIT);
	        } catch (SWTError e) {
	            System.out.println("Could not instantiate Browser: " + e.getMessage());
	            return;
	        }
	String[] headers = { "user-agent: eclipse" };
	browser.setUrl("http://localhost:9000", null, headers);
	JavascriptViewpointApi jsViewpointApi = new JavascriptViewpointApi(browser);
	browser.addLocationListener(jsViewpointApi);*/
    }

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
	    new CreateDiagramFunction(browser, "createDiagramFunction");
	    new OpenAllCatalogsFunction(browser, "openAllCatalogsFunction");
	}

	public void changed(LocationEvent event) {
	}
    }

}
