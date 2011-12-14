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
package org.obeonetwork.dsl.togaf.ui.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * @author sdrapeau
 * 
 */
public class TogafPerspective implements IPerspectiveFactory {

    /**
     * ID of the perspective
     */
    public static final String ID = "org.obeonetwork.dsl.togaf.ui.perspectives.TogafPerspective"; //$NON-NLS-1$

    /**
     * 
     */
    public TogafPerspective() {
	super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
     */
    public void createInitialLayout(IPageLayout factory) {
	IFolderLayout bottom = factory.createFolder("bottomRight", IPageLayout.BOTTOM, 0.7f, factory.getEditorArea()); //$NON-NLS-1$
	bottom.addView(IPageLayout.ID_PROP_SHEET);
    }

}
