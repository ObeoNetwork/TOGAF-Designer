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
package org.obeonetwork.dsl.togaf.ui.editors;


import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * @author sdrapeau
 *
 */
public class WebBrowserInput implements IEditorInput {
	
	private String url;
	
	public WebBrowserInput(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

	public String getName() {
		return url;
	}

	public boolean exists() {
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(
				ISharedImages.IMG_OBJ_ELEMENT);
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return url;
	}

	public Object getAdapter(Class adapter) {
		return null;
	}

}
