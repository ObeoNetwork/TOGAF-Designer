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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class LocationsPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, LocationsPropertiesEditionPart {

	protected ReferencesTable locations;
	protected List<ViewerFilter> locationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> locationsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LocationsPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence locationsStep = new BindingCompositionSequence(propertiesEditionComponent);
		locationsStep
			.addStep(ContentfwkViewsRepository.Locations.Locations_.class)
			.addStep(ContentfwkViewsRepository.Locations.Locations_.locations__);
		
		
		composer = new PartComposer(locationsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.Locations.Locations_.class) {
					return createLocationsGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Locations.Locations_.locations__) {
					return createLocationsTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createLocationsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section locationsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		locationsSection.setText(ContentfwkMessages.LocationsPropertiesEditionPart_LocationsGroupLabel);
		GridData locationsSectionData = new GridData(GridData.FILL_HORIZONTAL);
		locationsSectionData.horizontalSpan = 3;
		locationsSection.setLayoutData(locationsSectionData);
		Composite locationsGroup = widgetFactory.createComposite(locationsSection);
		GridLayout locationsGroupLayout = new GridLayout();
		locationsGroupLayout.numColumns = 3;
		locationsGroup.setLayout(locationsGroupLayout);
		locationsSection.setClient(locationsGroup);
		return locationsGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLocationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.locations = new ReferencesTable(ContentfwkMessages.LocationsPropertiesEditionPart_LocationsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationsPropertiesEditionPartForm.this, ContentfwkViewsRepository.Locations.Locations_.locations__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				locations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationsPropertiesEditionPartForm.this, ContentfwkViewsRepository.Locations.Locations_.locations__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				locations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationsPropertiesEditionPartForm.this, ContentfwkViewsRepository.Locations.Locations_.locations__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				locations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationsPropertiesEditionPartForm.this, ContentfwkViewsRepository.Locations.Locations_.locations__, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				locations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.locationsFilters) {
			this.locations.addFilter(filter);
		}
		this.locations.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Locations.Locations_.locations__, ContentfwkViewsRepository.FORM_KIND));
		this.locations.createControls(parent, widgetFactory);
		this.locations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationsPropertiesEditionPartForm.this, ContentfwkViewsRepository.Locations.Locations_.locations__, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
