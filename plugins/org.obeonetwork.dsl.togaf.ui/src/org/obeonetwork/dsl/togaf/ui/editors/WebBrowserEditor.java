package org.obeonetwork.dsl.togaf.ui.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.CloseWindowListener;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.OpenWindowListener;
import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.StatusTextEvent;
import org.eclipse.swt.browser.StatusTextListener;
import org.eclipse.swt.browser.TitleEvent;
import org.eclipse.swt.browser.TitleListener;
import org.eclipse.swt.browser.VisibilityWindowListener;
import org.eclipse.swt.browser.WindowEvent;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.obeonetwork.dsl.togaf.ui.Activator;
import org.obeonetwork.dsl.togaf.ui.functions.CloseViewpointSessionFunction;
import org.obeonetwork.dsl.togaf.ui.functions.CreateDiagramFunction;
import org.obeonetwork.dsl.togaf.ui.functions.EditDiagramFunction;
import org.obeonetwork.dsl.togaf.ui.functions.OpenAllCatalogsFunction;
import org.obeonetwork.dsl.togaf.ui.functions.SyncViewpointSessionFunction;

public class WebBrowserEditor extends EditorPart {

    public final static String ID = "org.obeonetwork.dsl.togaf.ui.WebBrowser";

    private Browser browser;
    private WebBrowserInput editorInput;

    private ToolItem backButton;
    private ToolItem forwardButton;
    private ToolItem refreshButton;
    private ToolItem stopButton;
    private Combo location;
    private ToolItem goButton;

    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
	if (!(input instanceof WebBrowserInput)) {
	    throw new PartInitException("Editor input is invalid!");
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

	ToolBar browserNavBar = new ToolBar(parent, SWT.NONE);
	layout.marginTop = 0;
	browserNavBar.setLayout(layout);

	GridData data = new GridData();
	browserNavBar.setLayoutData(data);

	backButton = new ToolItem(browserNavBar, SWT.PUSH);
	backButton.setImage(Activator.getDefault().getImage("back_nav.gif"));
	backButton.setDisabledImage(Activator.getDefault().getImage("back_nav_d.gif"));
	backButton.setEnabled(false);

	forwardButton = new ToolItem(browserNavBar, SWT.PUSH);
	forwardButton.setImage(Activator.getDefault().getImage("forward_nav.gif"));
	forwardButton.setDisabledImage(Activator.getDefault().getImage("forward_nav.gif"));
	forwardButton.setEnabled(false);

	stopButton = new ToolItem(browserNavBar, SWT.PUSH);
	stopButton.setImage(Activator.getDefault().getImage("stop_nav.gif"));

	refreshButton = new ToolItem(browserNavBar, SWT.PUSH);
	refreshButton.setImage(Activator.getDefault().getImage("refresh.gif"));

	location = new Combo(parent, SWT.DROP_DOWN);
	location.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));

	ToolBar browserNavBar2 = new ToolBar(parent, SWT.NONE);

	goButton = new ToolItem(browserNavBar2, SWT.PUSH);
	// SDR goButton.setImage(Activator.getImage("icons/go_nav.gif"));
	// SDR goButton.setDisabledImage(Activator.getImage("icons/go_nav_d.gif"));
	goButton.setEnabled(false);

	browser = new Browser(parent, SWT.WEBKIT); // explicitly set for Mozilla
	// browser = new Browser(parent, SWT.NONE); // use default browser

	data = new GridData(SWT.FILL, SWT.FILL, true, true);
	data.horizontalSpan = 4;
	browser.setLayoutData(data);

	browser.setUrl(editorInput.getUrl());

	browser.addTitleListener(new TitleListener() {
	    public void changed(TitleEvent event) {
		setPartName(event.title);
		setContentDescription(" ");
	    }
	});

	JavascriptViewpointApi jsViewpointApi = new JavascriptViewpointApi(browser);
	browser.addLocationListener(jsViewpointApi);

	browser.addFocusListener(new FocusListener() {

	    public void focusLost(FocusEvent e) {
		//
	    }

	    public void focusGained(FocusEvent e) {
		/*try {
		    IViewReference[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences();// showView(IPageLayout.ID_PROP_SHEET);
		    for (IViewReference view : views) {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().hideView(view);
		    }
		} catch (Exception ee) {
		    ee.printStackTrace();
		}*/
	    }
	});

	browser.addStatusTextListener(new StatusTextListener() {
	    public void changed(StatusTextEvent event) {
		
		/* show mousedown event text and reset window.status */
		if (event.text.startsWith("MOUSEDOWN: ")) {
		    browser.execute("window.status = '';");
		}
	    }
	});

	browser.addProgressListener(new ProgressAdapter() {
	    public void completed(ProgressEvent event) {
		
		// try {
		// String value = (String) browser.evaluate(SCRIPT);
		// System.out.println("Node value: " + value);
		// }
		// catch(final Exception e) {
		// Display.getDefault().asyncExec(new Runnable() {
		// public void run() {
		// MessageDialog.openWarning(Activator.getActiveWorkbenchShell(),
		// "JavaScript Error", "Script was unsuccessful. " + e.getMessage());
		// }
		// });
		//
		// }

	    }
	});

	initialize(getEditorSite().getShell().getDisplay(), browser);

	// contributeToActionBars();
	createNavigationListeners();

    }

    /**
     * Register WindowEvent listeners
     */
    static void initialize(final Display display, Browser browser) {

	browser.addOpenWindowListener(new OpenWindowListener() {
	    public void open(WindowEvent event) {
		Shell shell = new Shell(display);
		shell.setText("New Window");
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
		if (event.location != null)
		    shell.setLocation(event.location);
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

    private void createNavigationListeners() {

	browser.addLocationListener(new LocationListener() {
	    public void changed(LocationEvent event) {
		if (event.top) {
		    location.setText(event.location);
		    String[] locations = location.getItems();
		    boolean found = false;
		    for (int i = 0; i < locations.length && !found; i++) {
			if (locations[i].equals(event.location))
			    found = true;
		    }
		    if (!found) {
			if (locations.length == 10) {
			    System.arraycopy(locations, 0, locations, 1, locations.length - 1);
			    locations[0] = event.location;
			    location.setItems(locations);
			} else {
			    location.add(event.location, 0);
			}
		    }
		}

		backButton.setEnabled(browser.isBackEnabled());
		forwardButton.setEnabled(browser.isForwardEnabled());
	    }

	    public void changing(LocationEvent event) {
	    }
	});

	backButton.addListener(SWT.Selection, new Listener() {
	    public void handleEvent(Event event) {
		browser.back();
	    }
	});
	forwardButton.addListener(SWT.Selection, new Listener() {
	    public void handleEvent(Event event) {
		browser.forward();
	    }
	});
	stopButton.addListener(SWT.Selection, new Listener() {
	    public void handleEvent(Event event) {
		browser.stop();
		getEditorSite().getActionBars().getStatusLineManager().getProgressMonitor().done();
	    }
	});
	refreshButton.addListener(SWT.Selection, new Listener() {
	    public void handleEvent(Event event) {
		browser.refresh();
	    }
	});
	goButton.addListener(SWT.Selection, new Listener() {
	    public void handleEvent(Event event) {
		browser.setUrl(location.getText());
	    }
	});
	location.addSelectionListener(new SelectionAdapter() {
	    public void widgetDefaultSelected(SelectionEvent e) {
		browser.setUrl(location.getText());
	    }

	    public void widgetSelected(SelectionEvent e) {
		browser.setUrl(location.getText());
	    }
	});
	location.addModifyListener(new ModifyListener() {
	    public void modifyText(ModifyEvent e) {
		goButton.setEnabled(location.getText().length() > 0);
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
