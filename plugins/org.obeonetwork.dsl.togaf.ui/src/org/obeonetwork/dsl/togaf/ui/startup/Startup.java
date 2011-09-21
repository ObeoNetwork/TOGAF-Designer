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
package org.obeonetwork.dsl.togaf.ui.startup;

import fr.obeo.dsl.viewpoint.business.api.session.Session;
import fr.obeo.dsl.viewpoint.business.api.session.SessionManager;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.internal.util.PrefUtil;

@SuppressWarnings("restriction")
public class Startup implements IStartup {

	public static Session demoSession;

	/**
	 * @see org.eclipse.ui.IStartup#earlyStartup()
	 */
	public void earlyStartup() {
		if (isTOGAFDemoProduct()) {
			// activateFullScreenIntro();
			// closeAllSessions();
			// openSampleSession();
		}
	}

	private boolean isTOGAFDemoProduct() {
		return Platform.getProduct().getId().equals("org.obeonetwork.dsl.togaf.ui.product");
	}

	private void activateFullScreenIntro() {
		PrefUtil.getAPIPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_INTRO, true);
		PrefUtil.saveAPIPrefs();
	}

	private void closeAllSessions() {
		if (SessionManager.INSTANCE.getSessions().size() > 0) {
			for (Session session : SessionManager.INSTANCE.getSessions()) {
				session.close();
				session = null;
			}
		}
	}

	private static final String DEMO_PROJECT = "org.obeonetwork.dsl.togaf.demo";

	private static final String DEMO_MODEL_PATH = "models/voyagediscount.togaf";

	private static final String DEMO_MODELGRAPH_PATH = "models/voyagediscount.aird";

	private void openSampleSession() {
		// TransactionalEditingDomain editingDomain =
		// EditingDomainService.getInstance().getEditingDomainProvider().getEditingDomain();
		// ResourceSet resourceSet = editingDomain.getResourceSet();
		// Resource semanticResource = resourceSet.getResource(URI.createPlatformResourceURI(DEMO_PROJECT +
		// "/" + DEMO_MODEL_PATH, true), true);
		// Resource airdResource = resourceSet.getResource(URI.createPlatformResourceURI(DEMO_PROJECT + "/" +
		// DEMO_MODELGRAPH_PATH, true), true);
		// Collection<Resource> semanticResources = new ArrayList<Resource>();
		// semanticResources.add(semanticResource);
		// ArrayList<Resource> loadedResources = new ArrayList<Resource>();
		// loadedResources.add(airdResource);
		// Session newSession = null;
		// if (DAnalysisSessionUIHelper.hasSessionData(loadedResources)) {
		// Map<Resource, Session> openOrCreateSessions =
		// DAnalysisSessionUIHelper.openOrCreateSessions(loadedResources);
		// newSession = openOrCreateSessions.get(airdResource);
		// // we should initialize the cross referencer before a deletion
		// newSession.getSemanticCrossReferencer();
		// } else {
		// try {
		// newSession = SessionHelper.createLocalSessionFromModelsSilently(semanticResources, airdResource);
		// } catch (IOException e) {
		// Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
		// "Cannot open model.", e));
		// }
		// }
		// demoSession=newSession;
	}

}
