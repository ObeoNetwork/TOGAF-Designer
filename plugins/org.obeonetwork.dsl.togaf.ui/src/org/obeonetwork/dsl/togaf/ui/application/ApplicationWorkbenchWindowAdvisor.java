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
package org.obeonetwork.dsl.togaf.ui.application;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.bindings.Binding;
import org.eclipse.jface.bindings.BindingManager;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.internal.ide.application.IDEWorkbenchAdvisor;
import org.eclipse.ui.internal.ide.application.IDEWorkbenchWindowAdvisor;
import org.eclipse.ui.internal.keys.BindingService;
import org.eclipse.ui.internal.util.PrefUtil;
import org.eclipse.ui.keys.IBindingService;

public class ApplicationWorkbenchWindowAdvisor extends
		/* WorkbenchWindowAdvisor */IDEWorkbenchWindowAdvisor {

	public ApplicationWorkbenchWindowAdvisor(IDEWorkbenchAdvisor wbAdvisor,
			IWorkbenchWindowConfigurer configurer) {
		super(wbAdvisor, configurer);
		PrefUtil.getAPIPreferenceStore().setValue(
				IWorkbenchPreferenceConstants.SHOW_INTRO, true);
		PrefUtil.saveAPIPrefs();
	}

	@Override
	public void createWindowContents(Shell shell) {
		super.createWindowContents(shell);
	}

	@Override
	public void preWindowOpen() {
		super.preWindowOpen();
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setShowFastViewBars(false);
		configurer.setShowPerspectiveBar(false);
		configurer.setShowStatusLine(false);
		configurer.setShowProgressIndicator(false);
		configurer.setShowCoolBar(false);
	}

	@Override
	public void postWindowOpen() {
		super.postWindowOpen();
		replaceActionBarMenu();
		// clearCoolBar();
		clearKeybinding();

		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.resetPerspective();
	}

	@Override
	public void openIntro() {
		// TODO Auto-generated method stub
		super.openIntro();
	}

	private void replaceActionBarMenu() {
		clearActionBarMenu();
		//addActionBarMenu();
	}
	
	private void addActionBarMenu(){
		IWorkbenchWindowConfigurer workbenchWindowConfigurer = getWindowConfigurer();
		IActionBarConfigurer actionBarConfigurer = workbenchWindowConfigurer
				.getActionBarConfigurer();
		IMenuManager mainMenu = actionBarConfigurer.getMenuManager();
		MenuManager fileMenu = new MenuManager("&Fichier", "1");
		fileMenu.add(new Action("&Quitter") {
			@Override
			public void run() {
				PlatformUI.getWorkbench().close();
			}
		});
		mainMenu.add(fileMenu);
		MenuManager viewMenu = new MenuManager("&Affichage", "2");
		viewMenu.add(new Action("Vue Propriétés") {
		});
		mainMenu.add(viewMenu);

		mainMenu.update(true);
	}

	private void clearActionBarMenu() {
		IWorkbenchWindowConfigurer workbenchWindowConfigurer = getWindowConfigurer();
		IActionBarConfigurer actionBarConfigurer = workbenchWindowConfigurer
				.getActionBarConfigurer();
		IMenuManager menuManager = actionBarConfigurer.getMenuManager();
		IContributionItem[] menuItems = menuManager.getItems();
		for (IContributionItem menuItem : menuItems) {
			// Hack to remove standard Eclipse menu without using the
			// "org.eclipse.ui.activities" extension
			if (menuItem.getId() != null
					&& !menuItem.getId().startsWith("fr.obeo.od4ea.menu")) {
				menuManager.remove(menuItem);
			}
		}
		menuManager.update(true);
	}

	private void clearKeybinding() {
		final IBindingService bindingService = (IBindingService) PlatformUI
				.getWorkbench().getService(IBindingService.class);
		BindingManager bindingManager = ((BindingService) bindingService)
				.getBindingManager();
		Binding[] bindings = bindingManager.getBindings();
		for (Binding binding : bindings) {
			String key = binding.getTriggerSequence().toString();
			// if(key!=null && (key.startsWith("ALT+SHIFT") ||
			// key.startsWith("ALT+CTRL") || key.startsWith("CTRL+SHIFT"))){
			if (key != null
					&& (key.startsWith("ALT+") || key.startsWith("CTRL+"))) {
				bindingManager.removeBinding(binding);
			}// else {
				// System.out.println("========> preserve binding:" + key);
				// }
		}
	}

	/*
	 * private void clearCoolBar() {
	 * 
	 * IWorkbenchWindowConfigurer workbenchWindowConfigurer =
	 * getWindowConfigurer(); IActionBarConfigurer actionBarConfigurer =
	 * workbenchWindowConfigurer.getActionBarConfigurer(); ICoolBarManager
	 * coolBarManager = actionBarConfigurer.getCoolBarManager();
	 * 
	 * IContributionItem[] menuItems = coolBarManager.getItems(); for
	 * (IContributionItem menuItem : menuItems) { // Hack to remove standard
	 * Eclipse menu without using the // "org.eclipse.ui.activities" extension
	 * 
	 * if (menuItem.getId() != null &&
	 * !menuItem.getId().startsWith("fr.obeo.od4ea.menu") &&
	 * (menuItem.getId().startsWith("org.eclipse.debug.ui") ||
	 * menuItem.getId().startsWith("org.eclipse.search.searchActionSet") ||
	 * menuItem.getId().startsWith("org.eclipse.wst.xml") ||
	 * menuItem.getId().startsWith("org.eclipse.ui.workbench.navigate") ||
	 * menuItem.getId().startsWith("fr.obeo"))) {
	 * coolBarManager.remove(menuItem); }else {
	 * System.out.println("==========> " + menuItem.getId());
	 * 
	 * } } coolBarManager.update(true);
	 * 
	 * SaveAction saveAction = new
	 * SaveAction(PlatformUI.getWorkbench().getActiveWorkbenchWindow());
	 * saveAction
	 * .setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
	 * getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT));
	 * 
	 * coolBarManager.add(new Separator(IWorkbenchActionConstants.NEW_GROUP));
	 * coolBarManager.add(saveAction); coolBarManager.add(new
	 * GroupMarker(IWorkbenchActionConstants.NEW_EXT)); coolBarManager.add(new
	 * GroupMarker(IWorkbenchActionConstants.SAVE_GROUP));
	 * coolBarManager.add(saveAction);
	 * 
	 * coolBarManager.update(true); }
	 */

}
