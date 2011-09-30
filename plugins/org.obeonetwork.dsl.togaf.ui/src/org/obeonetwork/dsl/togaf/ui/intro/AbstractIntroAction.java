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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.activities.IActivityManager;
import org.eclipse.ui.activities.IWorkbenchActivitySupport;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.intro.IIntroPart;
import org.eclipse.ui.intro.config.IIntroAction;
import org.obeonetwork.dsl.togaf.ui.Activator;

import fr.obeo.dsl.viewpoint.business.api.session.SessionManager;

public abstract class AbstractIntroAction extends Action implements IIntroAction {

	public static final String TOGAF_ACTIVITY_ID = "org.obeonetwork.dsl.togaf.ui.activity";
	public static final String OBEO_DESIGNER_ACTIVITY_ID = "visible.activity";

	protected void closeIntro() {
		IIntroPart introPart = PlatformUI.getWorkbench().getIntroManager().getIntro();
		PlatformUI.getWorkbench().getIntroManager().closeIntro(introPart);
	}

	protected void initializeUI() {
		IWorkbenchActivitySupport activitySupport = PlatformUI.getWorkbench().getActivitySupport();
		IActivityManager activityManager = activitySupport.getActivityManager();
		Set<String> enabledActivities = new HashSet<String>();
		if (activityManager.getActivity(TOGAF_ACTIVITY_ID).isDefined()) {
			enabledActivities.add(TOGAF_ACTIVITY_ID);
		}
		if (activityManager.getActivity(OBEO_DESIGNER_ACTIVITY_ID).isDefined()) {
			enabledActivities.add(OBEO_DESIGNER_ACTIVITY_ID);
		}
		activitySupport.setEnabledActivityIds(enabledActivities);
		IWorkbenchPage wbPage = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage();
		wbPage.hideView(wbPage.findView("org.eclipse.ui.views.PropertySheet"));

		WorkbenchWindow activeWorkbenchWindow = (WorkbenchWindow) PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		activeWorkbenchWindow.setCoolBarVisible(false);
	}

	protected void closeAllEditors() {
		// FIXME carre gris
		/*
		 * IWorkbenchPage wbPage =
		 * PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		 * IEditorReference[] refs = wbPage.getEditorReferences(); if
		 * (refs.length > 0) { for (IEditorReference ref : refs) { //
		 * if(!ref.getTitle().equals("XXXX")){ //
		 * wbPage.closeEditor(ref.getEditor(true), false); }
		 * wbPage.closeAllEditors(false); }
		 */
	}

}
