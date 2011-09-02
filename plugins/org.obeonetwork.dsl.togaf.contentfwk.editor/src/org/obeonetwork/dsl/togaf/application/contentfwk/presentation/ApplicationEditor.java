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
package org.obeonetwork.dsl.togaf.application.contentfwk.presentation;

import org.eclipse.swt.custom.CTabFolder;
import org.obeonetwork.dsl.togaf.contentfwk.IContentfwkEditor;
import org.obeonetwork.dsl.togaf.contentfwk.TogafEditorHelper;


/**
 * This is an example of a contentfwk model editor.
 * 
 */
public class ApplicationEditor extends ContentfwkEditor implements IContentfwkEditor {

	public static final String ID = "org.obeonetwork.dsl.togaf.contentfwk.contentfwk.presentation.ContentfwkApplicationEditorID";
	
	public void setSelection(int index) {
		CTabFolder tabFolder = TogafEditorHelper.getTabFolder(getContainer());
		tabFolder.setSelection(index);
	}

}
