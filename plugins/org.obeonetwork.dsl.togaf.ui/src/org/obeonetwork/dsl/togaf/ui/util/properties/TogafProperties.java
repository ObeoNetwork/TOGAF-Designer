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
package org.obeonetwork.dsl.togaf.ui.util.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.obeonetwork.dsl.togaf.ui.Activator;

/**
 * @author sdrapeau
 * 
 */
public final class TogafProperties {

    private static final Properties PROPERTIES;

    private TogafProperties() {
	// Nada.
    }

    static {
	PROPERTIES = new Properties();
	FileInputStream input = null;
	try {
	    input = new FileInputStream("application.properties"); //$NON-NLS-1$
	    PROPERTIES.load(input);
	} catch (FileNotFoundException e) {
	    Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, Messages.TogafProperties_0));
	} catch (IOException e) {
	    throw new IllegalStateException(e);
	} finally {
	    try {
		if (input != null) {
		    input.close();
		}
	    } catch (IOException e) {
		throw new IllegalStateException(e);
	    }
	}
    }

    /**
     * The URI of the web server (default: localhost).
     */
    public static final String WEB_SERVER = PROPERTIES.getProperty("webServer", "localhost"); //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The port of the web server (default: 9000).
     */
    public static final String WEB_PORT = PROPERTIES.getProperty("webPort", "9000"); //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The URI of the repository server (default: localhost).
     */
    public static final String REPOSITORY_SERVER = PROPERTIES.getProperty("repositoryServer", "localhost"); //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * The port of the repository server (default: 2036).
     */
    public static final String REPOSITORY_PORT = PROPERTIES.getProperty("repositoryPort", "2036"); //$NON-NLS-1$ //$NON-NLS-2$

}
