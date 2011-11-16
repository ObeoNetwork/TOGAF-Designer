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
package org.obeonetwork.dsl.togaf.ui;

import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.obeonetwork.dsl.togaf.ui";

    // The shared instance
    private static Activator plugin;

    public static final String IMG_STRATEGIC_ARCHITECTURE = "strategic_architecture.png";
    public static final String IMG_BUSINESS_ARCHITECTURE = "business_architecture.png";
    public static final String IMG_DATA_ARCHITECTURE = "data_architecture.png";
    public static final String IMG_APPLICATION_ARCHITECTURE = "application_architecture.png";
    public static final String IMG_TECHNOLOGY_ARCHITECTURE = "technology_architecture.png";

    /**
     * The constructor
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext )
     */
    public void start(BundleContext context) throws Exception {
	super.start(context);
	plugin = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext )
     */
    public void stop(BundleContext context) throws Exception {
	plugin = null;
	super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
	return plugin;
    }

    /**
     * @param key
     * @return
     */
    public Image getImage(String key) {
	Image image = getImageRegistry().get(key);
	if (image == null) {
	    image = registerImage(key);
	}
	return image;
    }

    private Image registerImage(String key) {
	try {
	    IPath path = new Path("icons/" + key); //$NON-NLS-1$
	    URL url = find(path);
	    if (url != null) {
		ImageDescriptor desc = ImageDescriptor.createFromURL(url);
		getImageRegistry().put(key, desc);
		return getImageRegistry().get(key);
	    }
	} catch (Exception e) {
	}
	return null;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in relative path
     * 
     * @param path
     *            the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(String path) {
	return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    public static IWorkbenchWindow getActiveWorkbenchWindow() {
	return getDefault().getWorkbench().getActiveWorkbenchWindow();
    }

    public static Shell getActiveWorkbenchShell() {
	IWorkbenchWindow window = getActiveWorkbenchWindow();
	if (window != null) {
	    return window.getShell();
	}
	return null;
    }

}
