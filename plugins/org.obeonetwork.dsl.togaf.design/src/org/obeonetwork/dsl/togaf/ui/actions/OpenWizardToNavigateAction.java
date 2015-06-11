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
package org.obeonetwork.dsl.togaf.ui.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import fr.obeo.dsl.viewpoint.DNodeContainer;
import fr.obeo.dsl.viewpoint.DRepresentation;
import fr.obeo.dsl.viewpoint.DSemanticDecorator;
import fr.obeo.dsl.viewpoint.business.api.dialect.DialectManager;
import fr.obeo.dsl.viewpoint.business.api.session.Session;
import fr.obeo.dsl.viewpoint.business.api.session.SessionManager;
import fr.obeo.dsl.viewpoint.tools.api.ui.IExternalJavaAction;
import fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectEditor;
import fr.obeo.dsl.viewpoint.ui.business.api.dialect.DialectUIManager;
import fr.obeo.dsl.viewpoint.ui.business.api.session.IEditingSession;
import fr.obeo.dsl.viewpoint.ui.business.api.session.SessionUIManager;

public class OpenWizardToNavigateAction implements IExternalJavaAction {

	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		String type = (String) parameters.get("type");

		DNodeContainer dNodeContainer = (DNodeContainer) selections.iterator()
				.next();
		final EObject modelElement = dNodeContainer.getSemanticElements()
				.get(0);
		final Session session = SessionManager.INSTANCE
				.getSession(modelElement);
		final Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE
				.getRepresentations(modelElement, session);

		List<DRepresentation> representations = getRepresentations(type,
				allRepresentations);

		List<DRepresentation> representationToOpen = null;

		if (representations.size() == 0) {
			// Nada
		} else {
			if (representations.size() == 1) {
				representationToOpen = representations;
			} else {
				NavigationWizard dialogBox = new NavigationWizard(PlatformUI
						.getWorkbench().getActiveWorkbenchWindow().getShell(),
						representations);
				dialogBox.open();
				representationToOpen = dialogBox.getResult();
			}
			this.openRepresentation(representationToOpen, session);
		}
	}

	private List<DRepresentation> getRepresentations(String type,
			Collection<DRepresentation> allRepresentations) {
		List<DRepresentation> result = new ArrayList<DRepresentation>();
		if ("Motivation".equals(type)) {
			List<String> artifacts = new ArrayList<String>();
			artifacts.add("Goal/Objective/Service Diagram");
			for (DRepresentation r : allRepresentations) {
				if (artifacts.contains(r.getName())) {
					result.add(r);
				}
			}
		} else if ("Organization".equals(type)) {
			List<String> artifacts = new ArrayList<String>();
			artifacts.add("Organization Decomposition Diagram");
			artifacts.add("Actor/Role Matrix");
			for (DRepresentation r : allRepresentations) {
				if (artifacts.contains(r.getName())) {
					result.add(r);
				}
			}
		} else if ("Function".equals(type)) {
			List<String> artifacts = new ArrayList<String>();
			artifacts.add("Business Interaction Matrix");
			artifacts.add("Business Interaction Diagram");
			artifacts.add("Business Service / Information Diagram");
			artifacts.add("Business Footprint Diagram");
			artifacts.add("Business Use-Case Diagram");
			artifacts.add("Functional Decomposition Diagram ");
			artifacts.add("EventDiagram");
			for (DRepresentation r : allRepresentations) {
				if (artifacts.contains(r.getName())) {
					result.add(r);
				}
			}
		} else if ("Data".equals(type)) {
			List<String> artifacts = new ArrayList<String>();
			artifacts.add("Data Entity/Business Function Matrix");
			artifacts.add("System/Data Matrix");
			artifacts.add("Data Dissemination Diagram");
			artifacts.add("Class Diagram");
			for (DRepresentation r : allRepresentations) {
				if (artifacts.contains(r.getName())) {
					result.add(r);
				}
			}
		}else if ("PhysicalApplicationComponents".equals(type)) {
			List<String> artifacts = new ArrayList<String>();
			for (DRepresentation r : allRepresentations) {
				if (artifacts.contains(r.getName())) {
					result.add(r);
				}
			}
		}else if ("Application".equals(type)) {
			List<String> artifacts = new ArrayList<String>();
			artifacts.add("System/Organization Matrix (Logical App Map)");
			artifacts.add("Role/System Matrix (Logical App Map)");
			artifacts.add("Systems/Function Matrix (Logical App Map)");
			artifacts.add("System/Organization Matrix (Physical App Map)");
			artifacts.add("Role/System Matrix (Physical App Map)");
			artifacts.add("Systems/Function Matrix (Physical App Map)");
			artifacts.add("Application Communication Diagram");
			artifacts.add("Application & User Location Diagram");
			artifacts.add("System Use Case Diagram");
			artifacts.add("Application Portofolio Catalog");
			for (DRepresentation r : allRepresentations) {
				if (artifacts.contains(r.getName())) {
					result.add(r);
				}
			}
		}
		return result;
	}

	public void openRepresentation(List<DRepresentation> selected,
			Session session) {
		openRepresentation(selected, session);
	}

	public void openRepresentation(List<DRepresentation> selected,
			final IProgressMonitor pm, Session session) {
		pm.beginTask("Open representation...", 5);
		pm.worked(1);
		for (DRepresentation representation : selected) {
			IEditorPart part = openEditor(session, representation);
			pm.worked(3);
			if (part != null) {
				if (selected instanceof DSemanticDecorator) {
					final EObject semantic = ((DSemanticDecorator) selected)
							.getTarget();
					updateUISession((DialectEditor) part, semantic, session);
					pm.worked(1);
				}
			}
		}
		pm.done();
	}

	private void updateUISession(final DialectEditor part,
			final EObject semantic, Session session) {
		// final Session session = SessionManager.INSTANCE.getSession(semantic);
		if (session != null) {
			final IEditingSession uiSession = SessionUIManager.INSTANCE
					.getOrCreateUISession(session);
			uiSession.open();
			uiSession.attachEditor(part);

		}
	}

	protected IEditorPart openEditor(Session session,
			DRepresentation representation) {
		final IEditorPart openEditorPart = DialectUIManager.INSTANCE
				.openEditor(session, representation);
		return openEditorPart;
	}

}
