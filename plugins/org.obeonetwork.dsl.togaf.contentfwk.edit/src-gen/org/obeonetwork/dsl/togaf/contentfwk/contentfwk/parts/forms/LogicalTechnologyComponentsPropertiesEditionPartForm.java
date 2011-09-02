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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class LogicalTechnologyComponentsPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, LogicalTechnologyComponentsPropertiesEditionPart {

	protected ReferencesTable logicalTechnologyComponents;
	protected List<ViewerFilter> logicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> logicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LogicalTechnologyComponentsPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence logicalTechnologyComponentsStep = new BindingCompositionSequence(propertiesEditionComponent);
		logicalTechnologyComponentsStep
			.addStep(ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.class)
			.addStep(ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.logicalTechnologyComponents_);
		
		
		composer = new PartComposer(logicalTechnologyComponentsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.logicalTechnologyComponents_) {
					return createLogicalTechnologyComponentsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(ContentfwkMessages.LogicalTechnologyComponentsPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createLogicalTechnologyComponentsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.logicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.LogicalTechnologyComponentsPropertiesEditionPart_LogicalTechnologyComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.logicalTechnologyComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				logicalTechnologyComponents.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.logicalTechnologyComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				logicalTechnologyComponents.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.logicalTechnologyComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				logicalTechnologyComponents.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.logicalTechnologyComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				logicalTechnologyComponents.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.logicalTechnologyComponentsFilters) {
			this.logicalTechnologyComponents.addFilter(filter);
		}
		this.logicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.logicalTechnologyComponents_, ContentfwkViewsRepository.FORM_KIND));
		this.logicalTechnologyComponents.createControls(parent, widgetFactory);
		this.logicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.logicalTechnologyComponents_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData logicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		logicalTechnologyComponentsData.horizontalSpan = 3;
		this.logicalTechnologyComponents.setLayoutData(logicalTechnologyComponentsData);
		this.logicalTechnologyComponents.setLowerBound(0);
		this.logicalTechnologyComponents.setUpperBound(-1);
		logicalTechnologyComponents.setID(ContentfwkViewsRepository.LogicalTechnologyComponents.Properties.logicalTechnologyComponents_);
		logicalTechnologyComponents.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentsPropertiesEditionPart#initLogicalTechnologyComponents(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLogicalTechnologyComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		logicalTechnologyComponents.setContentProvider(contentProvider);
		logicalTechnologyComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentsPropertiesEditionPart#updateLogicalTechnologyComponents()
	 * 
	 */
	public void updateLogicalTechnologyComponents() {
	logicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentsPropertiesEditionPart#addFilterLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLogicalTechnologyComponents(ViewerFilter filter) {
		logicalTechnologyComponentsFilters.add(filter);
		if (this.logicalTechnologyComponents != null) {
			this.logicalTechnologyComponents.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentsPropertiesEditionPart#addBusinessFilterLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLogicalTechnologyComponents(ViewerFilter filter) {
		logicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentsPropertiesEditionPart#isContainedInLogicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInLogicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)logicalTechnologyComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.LogicalTechnologyComponents_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
