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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class LocationsPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LocationsPropertiesEditionPart {

protected ReferencesTable locations;
protected List<ViewerFilter> locationsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> locationsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LocationsPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence locationsStep = new BindingCompositionSequence(propertiesEditionComponent);
		locationsStep
			.addStep(ContentfwkViewsRepository.Locations.Locations_.class)
			.addStep(ContentfwkViewsRepository.Locations.Locations_.locations__);
		
		
		composer = new PartComposer(locationsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.Locations.Locations_.class) {
					return createLocationsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.Locations.Locations_.locations__) {
					return createLocationsAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createLocationsGroup(Composite parent) {
		Group locationsGroup = new Group(parent, SWT.NONE);
		locationsGroup.setText(ContentfwkMessages.LocationsPropertiesEditionPart_LocationsGroupLabel);
		GridData locationsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		locationsGroupData.horizontalSpan = 3;
		locationsGroup.setLayoutData(locationsGroupData);
		GridLayout locationsGroupLayout = new GridLayout();
		locationsGroupLayout.numColumns = 3;
		locationsGroup.setLayout(locationsGroupLayout);
		return locationsGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLocationsAdvancedTableComposition(Composite parent) {
		this.locations = new ReferencesTable(ContentfwkMessages.LocationsPropertiesEditionPart_LocationsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Locations.Locations_.locations__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				locations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Locations.Locations_.locations__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				locations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Locations.Locations_.locations__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				locations.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Locations.Locations_.locations__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				locations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.locationsFilters) {
			this.locations.addFilter(filter);
		}
		this.locations.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Locations.Locations_.locations__, ContentfwkViewsRepository.SWT_KIND));
		this.locations.createControls(parent);
		this.locations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationsPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Locations.Locations_.locations__, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData locationsData = new GridData(GridData.FILL_HORIZONTAL);
		locationsData.horizontalSpan = 3;
		this.locations.setLayoutData(locationsData);
		this.locations.setLowerBound(0);
		this.locations.setUpperBound(-1);
		locations.setID(ContentfwkViewsRepository.Locations.Locations_.locations__);
		locations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationsPropertiesEditionPart#initLocations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLocations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		locations.setContentProvider(contentProvider);
		locations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationsPropertiesEditionPart#updateLocations()
	 * 
	 */
	public void updateLocations() {
	locations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationsPropertiesEditionPart#addFilterLocations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLocations(ViewerFilter filter) {
		locationsFilters.add(filter);
		if (this.locations != null) {
			this.locations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationsPropertiesEditionPart#addBusinessFilterLocations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLocations(ViewerFilter filter) {
		locationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationsPropertiesEditionPart#isContainedInLocationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInLocationsTable(EObject element) {
		return ((ReferencesTableSettings)locations.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.Locations_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
