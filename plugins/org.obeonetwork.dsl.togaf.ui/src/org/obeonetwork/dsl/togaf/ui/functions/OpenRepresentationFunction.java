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
package org.obeonetwork.dsl.togaf.ui.functions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.togaf.ui.Activator;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;
import org.obeonetwork.dsl.togaf.ui.util.meta.TogafRepresentation;

import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.DView;
import fr.obeo.dsl.viewpoint.business.api.dialect.DialectManager;
import fr.obeo.dsl.viewpoint.collab.api.remotesession.CollaborativeSession;
import fr.obeo.dsl.viewpoint.description.RepresentationDescription;
import fr.obeo.dsl.viewpoint.tools.api.command.ViewpointCommand;
import fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIManager;

/**
 * @author sdrapeau
 *
 */
public class OpenRepresentationFunction extends BrowserFunction {

    /**
     * @param browser
     * @param name
     */
    public OpenRepresentationFunction(Browser browser, String name) {
	super(browser, name);
    }

    /* (non-Javadoc)
     * @see org.eclipse.swt.browser.BrowserFunction#function(java.lang.Object[])
     */
    public Object function(Object[] arguments) {
	String diagName = (String) arguments[0];
	String viewpointName = TogafRepresentation.getViewpoint(diagName);
	EClass architectureKind = TogafRepresentation.getArchitectureKind(diagName);
	try {
	    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(IPageLayout.ID_PROP_SHEET);
	} catch (PartInitException e) {
	    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.OpenRepresentationFunction_0, e));
	}
	openRepresentation(viewpointName, diagName, architectureKind);
	return null;
    }

    /**
     * Open the representation <code>repName</code> of the wiewpoint <code> viewpointName</code>.
     * @param viewpointName
     * @param repName
     * @param architectureKind
     */
    private static void openRepresentation(final String viewpointName, final String repName, final EClass architectureKind) {
	PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getDisplay().syncExec(new Runnable() {
	    public void run() {
		for (DView view : CollaborativeSessionUtil.getCollaborativeSession().getOwnedViews()) {
		    DRepresentation representation = CollaborativeSessionUtil.getRepresentation(view, repName);
		    if (representation == null) {
			if (view.getViewpoint().getName().equals(viewpointName) && CollaborativeSessionUtil.getRepresentation(view, repName) == null) {
			    representation = createRepresentation(repName,
				    CollaborativeSessionUtil.getArchitecture(architectureKind),
				    CollaborativeSessionUtil.getRepresentationDescription(repName));
			}
		    }
		    if (representation != null) {
			DialectUIManager.INSTANCE.openEditor(CollaborativeSessionUtil.getCollaborativeSession(), representation);
		    }
		}
	    }
	});
    }
    
    private static DRepresentation createRepresentation(final String representationName, final EObject semanticElement,
	    final RepresentationDescription representationDescription) {
	final List<DRepresentation> result = new ArrayList<DRepresentation>();
	final CollaborativeSession collaborativeSession = CollaborativeSessionUtil.getCollaborativeSession();
	collaborativeSession.getTransactionalEditingDomain().getCommandStack().execute(
	new ViewpointCommand(collaborativeSession.getTransactionalEditingDomain()) {
	    @Override
	    protected void doExecute() {
		result.add(DialectManager.INSTANCE.createRepresentation(representationName, semanticElement, representationDescription,
			collaborativeSession, new NullProgressMonitor()));
	    }
	});
	if (!result.isEmpty()) {
	    return result.get(0);
	}
	return null;

    }

}
