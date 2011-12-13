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

import org.eclipse.osgi.util.NLS;

/**
 * @author sdrapeau
 * 
 */
public class Messages extends NLS {

    private static final String BUNDLE_NAME = "org.obeonetwork.dsl.togaf.ui.functions.messages"; //$NON-NLS-1$

    public static String OpenRepresentationFunction_0;
    public static String OpenCatalogsFunction_1;
    public static String OpenCatalogsFunction_2;

    static {
	// initialize resource bundle
	NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
	// Nada.
    }

}
