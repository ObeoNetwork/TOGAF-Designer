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
package org.obeonetwork.dsl.togaf.contentfwk;

import fr.obeo.dsl.viewpoint.business.api.session.Session;
import fr.obeo.dsl.viewpoint.business.api.session.SessionManager;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.part.FileEditorInput;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.presentation.ContentfwkEditorPlugin;

@SuppressWarnings("restriction")
public class TogafEditorHelper {
	private static final String FILE_EXTENSION = "togaf";

	public static Resource getFirstTogafResource(ResourceSet resources) {
		for (Resource resource : resources.getResources()) {
			if (FILE_EXTENSION.equals(resource.getURI().fileExtension())) {
				return resource;
			}
		}
		return null;
	}

	private static TransactionalEditingDomain getEditingDomain() {
		Collection<Session> sessions = SessionManager.INSTANCE.getSessions();
		Iterator<Session> iterator = sessions.iterator();
		if (iterator.hasNext()) {
			return iterator.next().getTransactionalEditingDomain();
		} else {
			throw new IllegalArgumentException(
					"SearchEngineService: no editing domain could be found because there's no session open.");
		}
	}

	public static boolean open(String editorID, int index) {
		IWorkbenchPage page = Workbench.getInstance().getActiveWorkbenchWindow().getActivePage();
		EditingDomain editingDomain = getEditingDomain();
		Resource resource = getFirstTogafResource(editingDomain.getResourceSet());
		IFile modelFile;
		URI eUri = resource.getURI();
		if (!eUri.isPlatformResource()) {
			ContentfwkEditorPlugin.INSTANCE.log("Couldn't open editor for resource : " + eUri);
			return false;
		}
		String platformString = eUri.toPlatformString(true);
		IPath ipath = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString).getFullPath();
		modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(ipath);

		try {
			IEditorPart editorPart = page.openEditor(new FileEditorInput(modelFile), editorID, true,
					IWorkbenchPage.MATCH_ID);
			if (editorPart instanceof IContentfwkEditor) {
				IContentfwkEditor catalog = (IContentfwkEditor)editorPart;
				catalog.setSelection(index);
			}
		} catch (PartInitException e) {
			ContentfwkEditorPlugin.INSTANCE.log(e);
			return false;
		}
		return true;
	}

	public static CTabFolder getTabFolder(Object o) {
		CTabFolder result = null;
		// Attention il y a un premier TabFolder correspondant � la page de
		// l'�diteur. Ce TabFolder ne contient qu'une page.
		if ((o instanceof CTabFolder) && ((CTabFolder)o).getChildren().length > 1) {
			result = (CTabFolder)o;
		} else if (o instanceof Composite) {
			boolean found = false;
			Object[] it = ((Composite)o).getChildren();
			int cpt = 0;
			while (!found && cpt < it.length) {
				result = getTabFolder(it[cpt]);
				found = result != null;
				cpt++;
			}
		}
		return result;
	}

}
