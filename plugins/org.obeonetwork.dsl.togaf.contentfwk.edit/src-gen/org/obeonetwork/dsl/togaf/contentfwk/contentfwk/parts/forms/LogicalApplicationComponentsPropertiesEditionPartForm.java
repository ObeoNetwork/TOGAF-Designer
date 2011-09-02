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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class LogicalApplicationComponentsPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, LogicalApplicationComponentsPropertiesEditionPart {

	protected ReferencesTable logicalApplicationComponents;
	protected List<ViewerFilter> logicalApplicationComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> logicalApplicationComponentsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LogicalApplicationComponentsPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence logicalApplicationComponentsStep = new BindingCompositionSequence(propertiesEditionComponent);
		logicalApplicationComponentsStep
			.addStep(ContentfwkViewsRepository.LogicalApplicationComponents.Properties.class)
			.addStep(ContentfwkViewsRepository.LogicalApplicationComponents.Properties.logicalApplicationComponents_);
		
		
		composer = new PartComposer(logicalApplicationComponentsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.LogicalApplicationComponents.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponents.Properties.logicalApplicationComponents_) {
					return createLogicalApplicationComponentsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(ContentfwkMessages.LogicalApplicationComponentsPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createLogicalApplicationComponentsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.logicalApplicationComponents = new ReferencesTable(ContentfwkMessages.LogicalApplicationComponentsPropertiesEditionPart_LogicalApplicationComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponents.Properties.logicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				logicalApplicationComponents.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponents.Properties.logicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				logicalApplicationComponents.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponents.Properties.logicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				logicalApplicationComponents.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponents.Properties.logicalApplicationComponents_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				logicalApplicationComponents.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.logicalApplicationComponentsFilters) {
			this.logicalApplicationComponents.addFilter(filter);
		}
		this.logicalApplicationComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponents.Properties.logicalApplicationComponents_, ContentfwkViewsRepository.FORM_KIND));
		this.logicalApplicationComponents.createControls(parent, widgetFactory);
		this.logicalApplicationComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentsPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponents.Properties.logicalApplicationComponents_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData logicalApplicationComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		logicalApplicationComponentsData.horizontalSpan = 3;
		this.logicalApplicationComponents.setLayoutData(logicalApplicationComponentsData);
		this.logicalApplicationComponents.setLowerBound(0);
		this.logicalApplicationComponents.setUpperBound(-1);
		logicalApplicationComponents.setID(ContentfwkViewsRepository.LogicalApplicationComponents.Properties.logicalApplicationComponents_);
		logicalApplicationComponents.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentsPropertiesEditionPart#initLogicalApplicationComponents(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLogicalApplicationComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		logicalApplicationComponents.setContentProvider(contentProvider);
		logicalApplicationComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentsPropertiesEditionPart#updateLogicalApplicationComponents()
	 * 
	 */
	public void updateLogicalApplicationComponents() {
	logicalApplicationComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentsPropertiesEditionPart#addFilterLogicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLogicalApplicationComponents(ViewerFilter filter) {
		logicalApplicationComponentsFilters.add(filter);
		if (this.logicalApplicationComponents != null) {
			this.logicalApplicationComponents.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentsPropertiesEditionPart#addBusinessFilterLogicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLogicalApplicationComponents(ViewerFilter filter) {
		logicalApplicationComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentsPropertiesEditionPart#isContainedInLogicalApplicationComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInLogicalApplicationComponentsTable(EObject element) {
		return ((ReferencesTableSettings)logicalApplicationComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.LogicalApplicationComponents_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
