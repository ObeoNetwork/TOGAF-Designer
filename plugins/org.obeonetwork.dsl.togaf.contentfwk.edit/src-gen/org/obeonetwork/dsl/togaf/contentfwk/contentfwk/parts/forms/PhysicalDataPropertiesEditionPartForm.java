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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalDataPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class PhysicalDataPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PhysicalDataPropertiesEditionPart {

	protected ReferencesTable physicalData;
	protected List<ViewerFilter> physicalDataBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> physicalDataFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PhysicalDataPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence physicalDataStep = new BindingCompositionSequence(propertiesEditionComponent);
		physicalDataStep
			.addStep(ContentfwkViewsRepository.PhysicalData.Properties.class)
			.addStep(ContentfwkViewsRepository.PhysicalData.Properties.physicalData_);
		
		
		composer = new PartComposer(physicalDataStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.PhysicalData.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalData.Properties.physicalData_) {
					return createPhysicalDataTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(ContentfwkMessages.PhysicalDataPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPhysicalDataTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.physicalData = new ReferencesTable(ContentfwkMessages.PhysicalDataPropertiesEditionPart_PhysicalDataLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalDataPropertiesEditionPartForm.this, ContentfwkViewsRepository.PhysicalData.Properties.physicalData_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				physicalData.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalDataPropertiesEditionPartForm.this, ContentfwkViewsRepository.PhysicalData.Properties.physicalData_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				physicalData.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalDataPropertiesEditionPartForm.this, ContentfwkViewsRepository.PhysicalData.Properties.physicalData_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				physicalData.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalDataPropertiesEditionPartForm.this, ContentfwkViewsRepository.PhysicalData.Properties.physicalData_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				physicalData.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.physicalDataFilters) {
			this.physicalData.addFilter(filter);
		}
		this.physicalData.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalData.Properties.physicalData_, ContentfwkViewsRepository.FORM_KIND));
		this.physicalData.createControls(parent, widgetFactory);
		this.physicalData.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalDataPropertiesEditionPartForm.this, ContentfwkViewsRepository.PhysicalData.Properties.physicalData_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData physicalDataData = new GridData(GridData.FILL_HORIZONTAL);
		physicalDataData.horizontalSpan = 3;
		this.physicalData.setLayoutData(physicalDataData);
		this.physicalData.setLowerBound(0);
		this.physicalData.setUpperBound(-1);
		physicalData.setID(ContentfwkViewsRepository.PhysicalData.Properties.physicalData_);
		physicalData.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalDataPropertiesEditionPart#initPhysicalData(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPhysicalData(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		physicalData.setContentProvider(contentProvider);
		physicalData.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalDataPropertiesEditionPart#updatePhysicalData()
	 * 
	 */
	public void updatePhysicalData() {
	physicalData.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalDataPropertiesEditionPart#addFilterPhysicalData(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPhysicalData(ViewerFilter filter) {
		physicalDataFilters.add(filter);
		if (this.physicalData != null) {
			this.physicalData.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalDataPropertiesEditionPart#addBusinessFilterPhysicalData(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPhysicalData(ViewerFilter filter) {
		physicalDataBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalDataPropertiesEditionPart#isContainedInPhysicalDataTable(EObject element)
	 * 
	 */
	public boolean isContainedInPhysicalDataTable(EObject element) {
		return ((ReferencesTableSettings)physicalData.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.PhysicalData_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
