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
package org.obeonetwork.dsl.togaf.ui.wizards.newmodel;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;

/**
 * Factory to create a default Togaf Model.
 * 
 * @author ymortier
 */
public class TogafModelFactory {

	public static void initializeModel(
			EnterpriseArchitecture enterpriseArchitecture) {
		ContentfwkFactory factory = ContentfwkFactory.eINSTANCE;

		enterpriseArchitecture.getArchitectures().add(
				factory.createStrategicArchitecture());
		enterpriseArchitecture.getArchitectures().add(
				factory.createBusinessArchitecture());
		enterpriseArchitecture.getArchitectures().add(
				factory.createDataArchitecture());
		enterpriseArchitecture.getArchitectures().add(
				factory.createApplicationArchitecture());
		enterpriseArchitecture.getArchitectures().add(
				factory.createTechnologyArchitecture());
	}

}
