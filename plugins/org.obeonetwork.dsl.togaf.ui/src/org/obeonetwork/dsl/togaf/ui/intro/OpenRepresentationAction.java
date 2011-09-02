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
package org.obeonetwork.dsl.togaf.ui.intro;

import java.util.Arrays;
import java.util.Properties;

import org.eclipse.ui.intro.IIntroSite;

public class OpenRepresentationAction extends AbstractIntroAction {

	public void run(IIntroSite introSite, Properties properties) {		
		String representation = properties.getProperty("representation");
		String vp = properties.getProperty("vp");
		String[] viewpointsToSelect = new String[]{"Impact Analysis",vp};
		getSession().selectViewpoints(Arrays.asList(viewpointsToSelect));
		//TODO close all active editor (before viewpoint switch)
		closeAllEditors();
		getSession().openRepresentation(representation);
		initializeUI();
		closeIntro();		
	}

}