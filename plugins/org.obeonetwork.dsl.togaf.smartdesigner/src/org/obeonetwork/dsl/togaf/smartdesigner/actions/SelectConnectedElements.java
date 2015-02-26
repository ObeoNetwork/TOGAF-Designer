/**
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.dsl.togaf.smartdesigner.actions;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.smartdesigner.design.actions.AbstractSelectConnectedElements;
import org.obeonetwork.dsl.togaf.smartdesigner.BasicDiagramTogafUtil;

/**
 * Java action that manages the Select Connected Elements action for the Togaf
 * content framework metamodel.
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public class SelectConnectedElements extends AbstractSelectConnectedElements {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.obeonetwork.dsl.smartdesigner.design.actions.
	 * AbstractSelectConnectedElements#getArchitectures()
	 */
	@Override
	public Map<EClass, List<EClass>> getArchitectures() {
		return BasicDiagramTogafUtil.getArchitectures();
	}

}
