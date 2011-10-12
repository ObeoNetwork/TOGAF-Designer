package org.obeonetwork.dsl.togaf.ui.functions;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;

public class SyncViewpointSessionFunction extends BrowserFunction {

	public SyncViewpointSessionFunction(Browser browser, String name) {
		super(browser, name);
		CollaborativeSessionUtil.getCollaborativeSession();
	}

	public Object function(Object[] arguments) {
		return null;
	}

}
