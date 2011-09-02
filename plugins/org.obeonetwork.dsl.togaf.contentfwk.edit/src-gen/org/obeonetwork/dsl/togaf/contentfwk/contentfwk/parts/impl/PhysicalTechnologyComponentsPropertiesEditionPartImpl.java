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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class PhysicalTechnologyComponentsPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PhysicalTechnologyComponentsPropertiesEditionPart {

protected ReferencesTable physicalTechnologyComponents;
protected List<ViewerFilter> physicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> physicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PhysicalTechnologyComponentsPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence physicalTechnologyComponentsStep = new BindingCompositionSequence(propertiesEditionComponent);
		physicalTechnologyComponentsStep
			.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.class)
			.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.physicalTechnologyComponents_);
		
		
		composer = new PartComposer(physicalTechnologyComponentsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.physicalTechnologyComponents_) {
					return createPhysicalTechnologyComponentsAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ContentfwkMessages.PhysicalTechnologyComponentsPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPhysicalTechnologyComponentsAdvancedTableComposition(Composite parent) {
		this.physicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.PhysicalTechnologyComponentsPropertiesEditionPart_PhysicalTechnologyComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.physicalTechnologyComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				physicalTechnologyComponents.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.physicalTechnologyComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				physicalTechnologyComponents.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.physicalTechnologyComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				physicalTechnologyComponents.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.physicalTechnologyComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				physicalTechnologyComponents.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.physicalTechnologyComponentsFilters) {
			this.physicalTechnologyComponents.addFilter(filter);
		}
		this.physicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.physicalTechnologyComponents_, ContentfwkViewsRepository.SWT_KIND));
		this.physicalTechnologyComponents.createControls(parent);
		this.physicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.physicalTechnologyComponents_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData physicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		physicalTechnologyComponentsData.horizontalSpan = 3;
		this.physicalTechnologyComponents.setLayoutData(physicalTechnologyComponentsData);
		this.physicalTechnologyComponents.setLowerBound(0);
		this.physicalTechnologyComponents.setUpperBound(-1);
		physicalTechnologyComponents.setID(ContentfwkViewsRepository.PhysicalTechnologyComponents.Properties.physicalTechnologyComponents_);
		physicalTechnologyComponents.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentsPropertiesEditionPart#initPhysicalTechnologyComponents(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPhysicalTechnologyComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		physicalTechnologyComponents.setContentProvider(contentProvider);
		physicalTechnologyComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentsPropertiesEditionPart#updatePhysicalTechnologyComponents()
	 * 
	 */
	public void updatePhysicalTechnologyComponents() {
	physicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentsPropertiesEditionPart#addFilterPhysicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPhysicalTechnologyComponents(ViewerFilter filter) {
		physicalTechnologyComponentsFilters.add(filter);
		if (this.physicalTechnologyComponents != null) {
			this.physicalTechnologyComponents.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentsPropertiesEditionPart#addBusinessFilterPhysicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPhysicalTechnologyComponents(ViewerFilter filter) {
		physicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentsPropertiesEditionPart#isContainedInPhysicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInPhysicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)physicalTechnologyComponents.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.PhysicalTechnologyComponents_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
