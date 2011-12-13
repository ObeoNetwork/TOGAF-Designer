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
package org.obeonetwork.dsl.togaf.ui.util.meta;

/**
 * @author sdrapeau
 * 
 */
public enum TogafViewpoint {

    BUSINESS("business"), DATA("data"), APPLICATION("application"), TECHNOLOGY("technology"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$

    private final String id;

    private TogafViewpoint(String id) {
	this.id = id;
    }

    public String getID() {
	return this.id;
    }

}
