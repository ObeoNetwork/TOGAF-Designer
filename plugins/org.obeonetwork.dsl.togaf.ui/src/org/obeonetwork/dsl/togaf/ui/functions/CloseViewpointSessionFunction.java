package org.obeonetwork.dsl.togaf.ui.functions;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class CloseViewpointSessionFunction extends BrowserFunction {

	public CloseViewpointSessionFunction(Browser browser, String name) {
		super(browser, name);
	}

	public Object function(Object[] arguments) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		MessageDialog.openInformation(shell, "DEBUG", "Call CloseViewpointSessionFunction");
		//TODO close session and reinstantiate Browser with user-agent and redirect on the repository address selection screen
		return null;
	}

}
