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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class PhysicalApplicationComponentsPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PhysicalApplicationComponentsPropertiesEditionPart {

	protected ReferencesTable physicalApplicationComponents;
	protected List<ViewerFilter> physicalApplicationComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> physicalApplicationComponentsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PhysicalApplicationComponentsPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence physicalApplicationComponentsStep = new BindingCompositionSequence(propertiesEditionComponent);
		physicalApplicationComponentsStep
			.addStep(ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.class)
			.addStep(ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_);
		
		
		composer = new PartComposer(physicalApplicationComponentsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_) {
					return createPhysicalApplicationComponentsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(ContentfwkMessages.PhysicalApplicationComponentsPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createPhysicalApplicationComponentsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.physicalApplicationComponents = new ReferencesTable(ContentfwkMessages.PhysicalApplicationComponentsPropertiesEditionPart_PhysicalApplicationComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				physicalApplicationComponents.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				physicalApplicationComponents.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				physicalApplicationComponents.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				physicalApplicationComponents.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.physicalApplicationComponentsFilters) {
			this.physicalApplicationComponents.addFilter(filter);
		}
		this.physicalApplicationComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, ContentfwkViewsRepository.FORM_KIND));
		this.physicalApplicationComponents.createControls(parent, widgetFactory);
		this.physicalApplicationComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.PhysicalApplicationComponents.Properties.physicalApplicationComponents_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
