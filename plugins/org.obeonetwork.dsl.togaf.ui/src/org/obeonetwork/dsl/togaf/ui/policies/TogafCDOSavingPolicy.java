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
package org.obeonetwork.dsl.togaf.ui.policies;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;

import fr.obeo.dsl.viewpoint.collab.api.remotesession.CollaborativeSession;
import fr.obeo.dsl.viewpoint.collab.internal.savingpolicy.CDOSavingPolicy;
import fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectEditor;

/**
 * 
 * 
 * @author sdrapeau
 * 
 */
@SuppressWarnings("restriction")
public class TogafCDOSavingPolicy extends CDOSavingPolicy {

    /**
     * @param session
     */
    public TogafCDOSavingPolicy(CollaborativeSession session) {
	super(session);
    }

    /**
     * {@inheritDoc}
     * 
     * @see fr.obeo.dsl.viewpoint.business.api.session.SavingPolicyImpl#save(Iterable,Map)
     * 
     */
    @Override
    public Collection<Resource> save(Iterable<Resource> resourcesToSave, Map<?, ?> options) {
	IWorkbench wb = PlatformUI.getWorkbench();
	IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
	IWorkbenchPage page = win.getActivePage();

	IEditorReference[] editorReferences = page.getEditorReferences();
	// Marshall all the DRepresentation opened in the editors before the save.
	for (IEditorReference editorReference : editorReferences) {
	    IEditorPart editor = editorReference.getEditor(false);
	    if (editor != null && editor instanceof DialectEditor) {
		DialectEditor dialectEditor = (DialectEditor) editor;
		// CollaborativeSessionUtil.save(dialectEditor.getRepresentation());
		CollaborativeSessionUtil.getCollaborativeSession().getTransactionalEditingDomain().getCommandStack()
			.execute(CollaborativeSessionUtil.marshallDRepresentation(dialectEditor.getRepresentation()));
	    }
	}

	Collection<Resource> savedResources = super.save(resourcesToSave, options);
	return savedResources;
    }

    public Collection<CDOResource> saveRemoteResources(Set<CDOResource> remoteResources, Map<?, ?> options) {
	Collection<CDOResource> savedResources = super.saveRemoteResources(remoteResources, options);
	return savedResources;
    }

}
