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
package org.obeonetwork.dsl.togaf.ui.actions;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import fr.obeo.dsl.viewpoint.DRepresentation;

public class NavigationWizard extends TrayDialog {

	private java.util.List<DRepresentation> representations;

	private java.util.List<DRepresentation> result;

	private List representationList;

	public java.util.List<DRepresentation> getResult() {
		return result;
	}

	public NavigationWizard(Shell parentShell,
			java.util.List<DRepresentation> representations) {
		super(parentShell);
		this.representations = representations;
		this.result = new ArrayList<DRepresentation>();
	}

	/**
	 * @see org.eclipse.jface.window.Window#configureShell(Shell)
	 */
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Select representations");
	}

	/**
	 * @see org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(Composite)
	 */
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
	}

	protected Control createDialogArea(final Composite parent) {
		final Control composite = super.createDialogArea(parent);
		Composite composite1 = new Composite((Composite) composite, SWT.NONE
				& SWT.MULTI);
		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.verticalSpacing = 0;
		layout.horizontalSpacing = 0;
		composite1.setLayout(layout);
		composite1.setLayoutData(new GridData(GridData.FILL_BOTH));
		applyDialogFont(composite1);

		selectDRepresentation(composite1);

		return composite;
	}

	private void selectDRepresentation(Composite composite) {
		representationList = new List(composite, SWT.BORDER | SWT.MULTI
				| SWT.V_SCROLL);
		representationList.addListener(SWT.MouseDoubleClick, new Listener() {
			public void handleEvent(Event event) {
				okPressed();
			}
		});
		for (DRepresentation s : representations) {
			representationList.add(s.getName());
		}
	}

	protected void okPressed() {
		if (representationList.getSelectionIndices().length > 0) {
			for (int indice : representationList.getSelectionIndices()) {
				if (indice >= 0 && indice < representations.size()) {
					result.add(representations.get(indice));
				}
			}
		}
		super.okPressed();
	}

}
