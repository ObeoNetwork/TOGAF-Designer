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

public class TogafPerspective implements IPerspectiveFactory {

    public final static String ID = "org.obeonetwork.dsl.togaf.ui.perspectives.TogafPerspective";

    private IPageLayout factory;

    public TogafPerspective() {
        super();
    }

    public void createInitialLayout(IPageLayout factory) {
        this.factory = factory;
        addViews();
    }

    private void addViews() {
/*	
        IFolderLayout topLeft = factory.createFolder("topLeft", IPageLayout.LEFT, 0.25f, factory.getEditorArea()); // NON-NLS-1
        topLeft.addView(IModelExplorerView.ID);

        topLeft.addView("org.eclipse.ui.navigator.ProjectExplorer");
        // topLeft.addView("fr.obeo.dsl.viewpoint.ui.tools.views.sessionview");
*/
        IFolderLayout bottom = factory.createFolder("bottomRight", IPageLayout.BOTTOM, 0.7f, factory.getEditorArea()); // NON-NLS-1
        bottom.addView(IPageLayout.ID_PROP_SHEET); // NON-NLS-1

    }
}
