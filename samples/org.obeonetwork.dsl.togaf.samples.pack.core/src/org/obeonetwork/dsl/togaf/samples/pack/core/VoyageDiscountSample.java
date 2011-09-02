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
package org.obeonetwork.dsl.togaf.samples.pack.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.obeonetwork.dsl.togaf.samples.pack.core.l10n.Messages;
import org.obeonetwork.dsl.togaf.samples.wizards.TogafSample;

/**
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public class VoyageDiscountSample extends TogafSample {

	/**
	 * @throws MalformedURLException
	 */
	public VoyageDiscountSample() throws MalformedURLException {
		super(
				new URL(CoreSamplePlugin.getDefault().getZipURL()
						+ "examples/voyagediscount.zip"), //$NON-NLS-1$
				Messages.TogafVoyageDiscountSample_title,
				Messages.TogafVoyageDiscountSample_desc,
				0,
				CoreSamplePlugin
						.getDefault()
						.findImageDescriptor(
								"/org.obeonetwork.dsl.togaf.samples.pack.core/images/voyagediscount.png")); //$NON-NLS-1$
	}

}
