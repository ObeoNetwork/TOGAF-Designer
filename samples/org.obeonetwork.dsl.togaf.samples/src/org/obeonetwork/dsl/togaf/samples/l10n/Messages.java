/*
 * Copyright (c) 2007-2008-2009-2010 Obeo
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.togaf.samples.l10n;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public final class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.obeonetwork.dsl.togaf.samples.l10n.Messages";//$NON-NLS-1$

	private Messages() {
		// Do not instantiate
	}

	public static String monitor_creatingProject;
	public static String monitor_unzippingProject;
	public static String TogafSampleWizardPage_pageName;
	public static String TogafSampleWizardPage_title;
	public static String TogafSampleWizardPage_desc;
	public static String WizardNewProjectCreationPage_pageName;
	public static String WizardNewProjectCreationPage_title;
	public static String WizardNewProjectCreationPage_desc;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}