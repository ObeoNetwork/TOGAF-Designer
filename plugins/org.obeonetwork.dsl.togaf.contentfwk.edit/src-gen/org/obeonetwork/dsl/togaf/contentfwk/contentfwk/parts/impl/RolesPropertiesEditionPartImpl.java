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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.RolesPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class RolesPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RolesPropertiesEditionPart {

protected ReferencesTable roles;
protected List<ViewerFilter> rolesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> rolesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RolesPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence rolesStep = new BindingCompositionSequence(propertiesEditionComponent);
		rolesStep
			.addStep(ContentfwkViewsRepository.Roles.Roles_.class)
			.addStep(ContentfwkViewsRepository.Roles.Roles_.roles__);
		
		
		composer = new PartComposer(rolesStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.Roles.Roles_.class) {
					return createRolesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.Roles.Roles_.roles__) {
					return createRolesAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createRolesGroup(Composite parent) {
		Group rolesGroup = new Group(parent, SWT.NONE);
		rolesGroup.setText(ContentfwkMessages.RolesPropertiesEditionPart_RolesGroupLabel);
		GridData rolesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		rolesGroupData.horizontalSpan = 3;
		rolesGroup.setLayoutData(rolesGroupData);
		GridLayout rolesGroupLayout = new GridLayout();
		rolesGroupLayout.numColumns = 3;
		rolesGroup.setLayout(rolesGroupLayout);
		return rolesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createRolesAdvancedTableComposition(Composite parent) {
		this.roles = new ReferencesTable(ContentfwkMessages.RolesPropertiesEditionPart_RolesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolesPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Roles.Roles_.roles__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				roles.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolesPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Roles.Roles_.roles__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				roles.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolesPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Roles.Roles_.roles__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				roles.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolesPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Roles.Roles_.roles__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				roles.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.rolesFilters) {
			this.roles.addFilter(filter);
		}
		this.roles.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Roles.Roles_.roles__, ContentfwkViewsRepository.SWT_KIND));
		this.roles.createControls(parent);
		this.roles.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RolesPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Roles.Roles_.roles__, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rolesData = new GridData(GridData.FILL_HORIZONTAL);
		rolesData.horizontalSpan = 3;
		this.roles.setLayoutData(rolesData);
		this.roles.setLowerBound(0);
		this.roles.setUpperBound(-1);
		roles.setID(ContentfwkViewsRepository.Roles.Roles_.roles__);
		roles.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.RolesPropertiesEditionPart#initRoles(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRoles(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		roles.setContentProvider(contentProvider);
		roles.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.RolesPropertiesEditionPart#updateRoles()
	 * 
	 */
	public void updateRoles() {
	roles.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.RolesPropertiesEditionPart#addFilterRoles(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRoles(ViewerFilter filter) {
		rolesFilters.add(filter);
		if (this.roles != null) {
			this.roles.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.RolesPropertiesEditionPart#addBusinessFilterRoles(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRoles(ViewerFilter filter) {
		rolesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.RolesPropertiesEditionPart#isContainedInRolesTable(EObject element)
	 * 
	 */
	public boolean isContainedInRolesTable(EObject element) {
		return ((ReferencesTableSettings)roles.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.Roles_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
