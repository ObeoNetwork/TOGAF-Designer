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
package org.obeonetwork.dsl.togaf.ui.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.CloseWindowListener;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.OpenWindowListener;
import org.eclipse.swt.browser.TitleEvent;
import org.eclipse.swt.browser.TitleListener;
import org.eclipse.swt.browser.VisibilityWindowListener;
import org.eclipse.swt.browser.WindowEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.obeonetwork.dsl.togaf.ui.Activator;
import org.obeonetwork.dsl.togaf.ui.functions.CloseViewpointSessionFunction;
import org.obeonetwork.dsl.togaf.ui.functions.OpenCatalogsFunction;
import org.obeonetwork.dsl.togaf.ui.functions.OpenRepresentationFunction;
import org.obeonetwork.dsl.togaf.ui.functions.SyncViewpointSessionFunction;

import fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectEditor;

/**
 * @author sdrapeau
 * 
 */
public class WebBrowserEditor extends EditorPart {

    public static final String ID = "org.obeonetwork.dsl.togaf.ui.WebBrowser"; //$NON-NLS-1$

    private Browser browser;

    private WebBrowserInput editorInput;

    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
	if (!(input instanceof WebBrowserInput)) {
	    throw new PartInitException(Messages.WebBrowserEditor_1);
	}
	editorInput = ((WebBrowserInput) input);
	try {
	    setInput(input);
	    setSite(site);
	    setPartName(input.getName());
	} catch (Exception e) {
	    throw new PartInitException(e.getMessage());
	}

    }

    @Override
    public void createPartControl(Composite parent) {
	GridLayout layout = new GridLayout(4, false);
	parent.setLayout(layout);
	GridData data = new GridData();
	browser = new Browser(parent, SWT.WEBKIT);
	data = new GridData(SWT.FILL, SWT.FILL, true, true);
	data.horizontalSpan = 0;
	browser.setLayoutData(data);
	String[] headers = { "user-agent: eclipse" }; //$NON-NLS-1$
	browser.setUrl(editorInput.getUrl(), null, headers);
	browser.addTitleListener(new TitleListener() {
	    public void changed(TitleEvent event) {
		setPartName(event.title);
		setContentDescription(" "); //$NON-NLS-1$
	    }
	});

	browser.addLocationListener(new JavascriptViewpointApi(browser));

	this.getSite().getPage().addPartListener(new IPartListener() {

	    public void partOpened(final IWorkbenchPart part) {
		// Nada.
	    }

	    public void partDeactivated(final IWorkbenchPart part) {
		// Nada.
	    }

	    public void partClosed(final IWorkbenchPart part) {
		// Nada.
	    }

	    public void partBroughtToTop(final IWorkbenchPart part) {
		// Nada.
	    }

	    public void partActivated(final IWorkbenchPart part) {
		if (part instanceof DialectEditor) {
		    try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.showView(IPageLayout.ID_PROP_SHEET, null, IWorkbenchPage.VIEW_VISIBLE);
		    } catch (PartInitException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.WebBrowserEditor_4, e));
		    }
		} else if (part instanceof WebBrowserEditor) {
		    IViewPart propertiesSheet = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
			    .findView(IPageLayout.ID_PROP_SHEET);
		    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().hideView(propertiesSheet);
		} else if ("org.obeonetwork.dsl.togaf.contentfwk.editor".equals(part.getSite().getPluginId())) { //$NON-NLS-1$
		    try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.showView(IPageLayout.ID_PROP_SHEET, null, IWorkbenchPage.VIEW_VISIBLE);
		    } catch (PartInitException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.WebBrowserEditor_6, e));
		    }
		}
	    }
	});
	initialize(getEditorSite().getShell().getDisplay(), browser);
    }

    /**
     * Register WindowEvent listeners
     */
    private static void initialize(final Display display, Browser browser) {
	browser.addOpenWindowListener(new OpenWindowListener() {
	    public void open(WindowEvent event) {
		Shell shell = new Shell(display);
		shell.setText(Messages.WebBrowserEditor_7);
		shell.setLayout(new FillLayout());
		Browser browser = new Browser(shell, SWT.NONE);
		initialize(display, browser);
		event.browser = browser;
	    }
	});

	browser.addVisibilityWindowListener(new VisibilityWindowListener() {
	    public void hide(WindowEvent event) {
		Browser browser = (Browser) event.widget;
		Shell shell = browser.getShell();
		shell.setVisible(false);
	    }

	    public void show(WindowEvent event) {
		Browser browser = (Browser) event.widget;
		final Shell shell = browser.getShell();
		if (event.location != null) {
		    shell.setLocation(event.location);
		}
		if (event.size != null) {
		    Point size = event.size;
		    shell.setSize(shell.computeSize(size.x, size.y));
		}
		shell.open();
	    }
	});

	browser.addCloseWindowListener(new CloseWindowListener() {
	    public void close(WindowEvent event) {
		Browser browser = (Browser) event.widget;
		Shell shell = browser.getShell();
		shell.close();
	    }
	});

    }

    @Override
    public void doSave(IProgressMonitor monitor) {
    }

    @Override
    public void doSaveAs() {
    }

    @Override
    public boolean isDirty() {
	return false;
    }

    @Override
    public boolean isSaveAsAllowed() {
	return false;
    }

    public Browser getBrowser() {
	return browser;
    }

    public String getBrowserText() {
	return browser.getText();
    }

    @Override
    public void setFocus() {
	if (browser != null && !browser.isDisposed()) {
	    browser.setFocus();
	}
    }

    private class JavascriptViewpointApi implements LocationListener {
	Browser browser;

	public JavascriptViewpointApi(Browser browser) {
	    this.browser = browser;
	}

	public void changing(LocationEvent event) {
	    // FIXME maybe use singleton for each functions ?
	    new CloseViewpointSessionFunction(browser, "closeViewpointSession"); //$NON-NLS-1$
	    new SyncViewpointSessionFunction(browser, "syncViewpointSession"); //$NON-NLS-1$
	    new OpenRepresentationFunction(browser, "openRepresentationFunction"); //$NON-NLS-1$
	    new OpenCatalogsFunction(browser, "openCatalogsFunction"); //$NON-NLS-1$
	}

	public void changed(LocationEvent event) {
	}
    }

}
