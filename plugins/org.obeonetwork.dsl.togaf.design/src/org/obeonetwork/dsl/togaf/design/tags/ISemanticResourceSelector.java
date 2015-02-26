/*******************************************************************************
 * Copyright (c) 2011-2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.togaf.design.tags;

import org.eclipse.emf.ecore.EObject;

/**
 * Selector to get the root element of the semantic model.
 * 
 * @author SDrapeau
 * 
 */
public interface ISemanticResourceSelector {

	/**
	 * @return the root element of the semantic model.
	 */
	public EObject getRootElement();
	
	/**
	 * 
	 * @return the root element of the Tags model.
	 */
	public EObject getTagsRoot();

}
