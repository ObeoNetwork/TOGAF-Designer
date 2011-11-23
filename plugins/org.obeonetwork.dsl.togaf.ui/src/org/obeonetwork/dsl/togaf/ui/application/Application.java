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
package org.obeonetwork.dsl.togaf.ui.application;

import java.io.File;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class Application implements IApplication {

    public Object start(IApplicationContext context) throws Exception {
	Display display = PlatformUI.createDisplay();
	try {
	    File f = new File("in-memory.aird");
	    if (f.exists()) {
		boolean inMemoryAirdFeleted = f.delete();
		if (!inMemoryAirdFeleted) {
		    throw new IllegalStateException("Old version of the file in-memory.aird can't be deleted");
		}
	    }
	    int returnCode = PlatformUI.createAndRunWorkbench(display, new ApplicationWorkbenchAdvisor());
	    if (returnCode == PlatformUI.RETURN_RESTART)
		return IApplication.EXIT_RESTART;
	    return IApplication.EXIT_OK;
	} finally {
	    display.dispose();
	}

    }

    public void stop() {
	final IWorkbench workbench = PlatformUI.getWorkbench();
	if (workbench == null) {
	    return;
	}
	final Display display = workbench.getDisplay();
	display.syncExec(new Runnable() {
	    public void run() {
		if (!display.isDisposed()) {
		    workbench.close();
		}
	    }
	});
    }

}
