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
package org.obeonetwork.dsl.togaf.design.extensions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import fr.obeo.dsl.viewpoint.DRepresentationElement;
import fr.obeo.dsl.viewpoint.WorkspaceImage;

/**
 * 
 * @author cnotot
 *
 */
public class DynamicWorkspaceImageEditPart extends CustomWorkspaceImageEditPart {

	public static final String ROOT_IMG_PATH = "/org.obeonetwork.dsl.togaf.contentfwk.edit/icons/full/obj16/";
	
	public static final String IMG_EXT = ".gif";
	
	public DynamicWorkspaceImageEditPart(View view) {
		super(view);
	}

	protected void setPath(WorkspaceImage wkImage) {		
		EditPart ep = getParent();
		if (ep instanceof GraphicalEditPart) {
			Object model = ((GraphicalEditPart) ep).getModel();
			System.out.println(model);
			if (model instanceof Node) {
				EObject element = ((Node) model).getElement();
				if (element instanceof DRepresentationElement) {
					EObject target = ((DRepresentationElement) element).getTarget();
					String name = target.eClass().getName();
					wkImage.setWorkspacePath(ROOT_IMG_PATH + name + IMG_EXT);				
				}
			}
		}
		
	}
   

}
