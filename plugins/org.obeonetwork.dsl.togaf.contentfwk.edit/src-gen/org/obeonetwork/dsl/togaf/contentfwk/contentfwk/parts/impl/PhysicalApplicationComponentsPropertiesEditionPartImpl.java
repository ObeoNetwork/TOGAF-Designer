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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class PhysicalApplicationComponentsPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PhysicalApplicationComponentsPropertiesEditionPart {

protected ReferencesTable physicalApplicationComponents;
protected List<ViewerFilter> physicalApplicationComponentsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> physicalApplicationComponentsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PhysicalApplicationComponentsPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence physicalApplicationComponentsStep = new BindingCompositionSequence(propertiesEditionComponent);
		physicalApplicationComponentsStep
			.addStep(ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.class)
			.addStep(ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_);
		
		
		composer = new PartComposer(physicalApplicationComponentsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_) {
					return createPhysicalApplicationComponentsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(ContentfwkMessages.PhysicalApplicationComponentsPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createPhysicalApplicationComponentsAdvancedTableComposition(Composite parent) {
		this.physicalApplicationComponents = new ReferencesTable(ContentfwkMessages.PhysicalApplicationComponentsPropertiesEditionPart_PhysicalApplicationComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				physicalApplicationComponents.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				physicalApplicationComponents.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				physicalApplicationComponents.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				physicalApplicationComponents.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.physicalApplicationComponentsFilters) {
			this.physicalApplicationComponents.addFilter(filter);
		}
		this.physicalApplicationComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, ContentfwkViewsRepository.SWT_KIND));
		this.physicalApplicationComponents.createControls(parent);
		this.physicalApplicationComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData physicalApplicationComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		physicalApplicationComponentsData.horizontalSpan = 3;
		this.physicalApplicationComponents.setLayoutData(physicalApplicationComponentsData);
		this.physicalApplicationComponents.setLowerBound(0);
		this.physicalApplicationComponents.setUpperBound(-1);
		physicalApplicationComponents.setID(ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_);
		physicalApplicationComponents.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentsPropertiesEditionPart#initPhysicalApplicationComponents(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPhysicalApplicationComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		physicalApplicationComponents.setContentProvider(contentProvider);
		physicalApplicationComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentsPropertiesEditionPart#updatePhysicalApplicationComponents()
	 * 
	 */
	public void updatePhysicalApplicationComponents() {
	physicalApplicationComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentsPropertiesEditionPart#addFilterPhysicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPhysicalApplicationComponents(ViewerFilter filter) {
		physicalApplicationComponentsFilters.add(filter);
		if (this.physicalApplicationComponents != null) {
			this.physicalApplicationComponents.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentsPropertiesEditionPart#addBusinessFilterPhysicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPhysicalApplicationComponents(ViewerFilter filter) {
		physicalApplicationComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentsPropertiesEditionPart#isContainedInPhysicalApplicationComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInPhysicalApplicationComponentsTable(EObject element) {
		return ((ReferencesTableSettings)physicalApplicationComponents.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.PhysicalApplicationComponents_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
