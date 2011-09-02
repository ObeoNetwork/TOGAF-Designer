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

import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;

import fr.obeo.dsl.viewpoint.CustomStyle;

/**
 * 
 * @author cnotot
 *
 */
public class ContentFwkEditPartProvider extends AbstractEditPartProvider {

	public static final String DYNAMIC_IMAGE_ID = "DynamicImage";
	
	@Override
	protected Class getNodeEditPartClass(View view) {
		if (view.getElement() instanceof CustomStyle) {
			CustomStyle customStyle = (CustomStyle) view.getElement();
			if (customStyle.getId().equals(DYNAMIC_IMAGE_ID)) {
				return DynamicWorkspaceImageEditPart.class;
			}
		}
		return super.getNodeEditPartClass(view);
	}
	
}
