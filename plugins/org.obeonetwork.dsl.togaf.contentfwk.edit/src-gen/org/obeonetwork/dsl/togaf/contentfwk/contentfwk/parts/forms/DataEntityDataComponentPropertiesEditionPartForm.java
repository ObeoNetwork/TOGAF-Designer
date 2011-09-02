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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class DataEntityDataComponentPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, DataEntityDataComponentPropertiesEditionPart {

	protected ReferencesTable dataEntity;
	protected List<ViewerFilter> dataEntityBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> dataEntityFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable logicalDataComponent;
	protected List<ViewerFilter> logicalDataComponentBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> logicalDataComponentFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable physicalDataComponent;
	protected List<ViewerFilter> physicalDataComponentBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> physicalDataComponentFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DataEntityDataComponentPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence dataEntityDataComponentStep = new CompositionSequence();
		CompositionStep propertiesStep = dataEntityDataComponentStep.addStep(ContentfwkViewsRepository.DataEntityDataComponent.Properties.class);
		propertiesStep.addStep(ContentfwkViewsRepository.DataEntityDataComponent.Properties.dataEntity);
		propertiesStep.addStep(ContentfwkViewsRepository.DataEntityDataComponent.Properties.logicalDataComponent);
		propertiesStep.addStep(ContentfwkViewsRepository.DataEntityDataComponent.Properties.physicalDataComponent);
		
		
		composer = new PartComposer(dataEntityDataComponentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.DataEntityDataComponent.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.DataEntityDataComponent.Properties.dataEntity) {
					return createDataEntityTableComposition(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.DataEntityDataComponent.Properties.logicalDataComponent) {
					return createLogicalDataComponentTableComposition(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.DataEntityDataComponent.Properties.physicalDataComponent) {
					return createPhysicalDataComponentTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(ContentfwkMessages.DataEntityDataComponentPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createDataEntityTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.dataEntity = new ReferencesTable(ContentfwkMessages.DataEntityDataComponentPropertiesEditionPart_DataEntityLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.dataEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dataEntity.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.dataEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dataEntity.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.dataEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dataEntity.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.dataEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dataEntity.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dataEntityFilters) {
			this.dataEntity.addFilter(filter);
		}
		this.dataEntity.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntityDataComponent.Properties.dataEntity, ContentfwkViewsRepository.FORM_KIND));
		this.dataEntity.createControls(parent, widgetFactory);
		this.dataEntity.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.dataEntity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dataEntityData = new GridData(GridData.FILL_HORIZONTAL);
		dataEntityData.horizontalSpan = 3;
		this.dataEntity.setLayoutData(dataEntityData);
		this.dataEntity.setLowerBound(0);
		this.dataEntity.setUpperBound(-1);
		dataEntity.setID(ContentfwkViewsRepository.DataEntityDataComponent.Properties.dataEntity);
		dataEntity.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLogicalDataComponentTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.logicalDataComponent = new ReferencesTable(ContentfwkMessages.DataEntityDataComponentPropertiesEditionPart_LogicalDataComponentLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.logicalDataComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				logicalDataComponent.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.logicalDataComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				logicalDataComponent.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.logicalDataComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				logicalDataComponent.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.logicalDataComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				logicalDataComponent.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.logicalDataComponentFilters) {
			this.logicalDataComponent.addFilter(filter);
		}
		this.logicalDataComponent.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntityDataComponent.Properties.logicalDataComponent, ContentfwkViewsRepository.FORM_KIND));
		this.logicalDataComponent.createControls(parent, widgetFactory);
		this.logicalDataComponent.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.logicalDataComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData logicalDataComponentData = new GridData(GridData.FILL_HORIZONTAL);
		logicalDataComponentData.horizontalSpan = 3;
		this.logicalDataComponent.setLayoutData(logicalDataComponentData);
		this.logicalDataComponent.setLowerBound(0);
		this.logicalDataComponent.setUpperBound(-1);
		logicalDataComponent.setID(ContentfwkViewsRepository.DataEntityDataComponent.Properties.logicalDataComponent);
		logicalDataComponent.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPhysicalDataComponentTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.physicalDataComponent = new ReferencesTable(ContentfwkMessages.DataEntityDataComponentPropertiesEditionPart_PhysicalDataComponentLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.physicalDataComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				physicalDataComponent.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.physicalDataComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				physicalDataComponent.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.physicalDataComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				physicalDataComponent.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.physicalDataComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				physicalDataComponent.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.physicalDataComponentFilters) {
			this.physicalDataComponent.addFilter(filter);
		}
		this.physicalDataComponent.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntityDataComponent.Properties.physicalDataComponent, ContentfwkViewsRepository.FORM_KIND));
		this.physicalDataComponent.createControls(parent, widgetFactory);
		this.physicalDataComponent.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityDataComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.DataEntityDataComponent.Properties.physicalDataComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData physicalDataComponentData = new GridData(GridData.FILL_HORIZONTAL);
		physicalDataComponentData.horizontalSpan = 3;
		this.physicalDataComponent.setLayoutData(physicalDataComponentData);
		this.physicalDataComponent.setLowerBound(0);
		this.physicalDataComponent.setUpperBound(-1);
		physicalDataComponent.setID(ContentfwkViewsRepository.DataEntityDataComponent.Properties.physicalDataComponent);
		physicalDataComponent.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#initDataEntity(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDataEntity(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dataEntity.setContentProvider(contentProvider);
		dataEntity.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#updateDataEntity()
	 * 
	 */
	public void updateDataEntity() {
	dataEntity.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#addFilterDataEntity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDataEntity(ViewerFilter filter) {
		dataEntityFilters.add(filter);
		if (this.dataEntity != null) {
			this.dataEntity.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#addBusinessFilterDataEntity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDataEntity(ViewerFilter filter) {
		dataEntityBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#isContainedInDataEntityTable(EObject element)
	 * 
	 */
	public boolean isContainedInDataEntityTable(EObject element) {
		return ((ReferencesTableSettings)dataEntity.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#initLogicalDataComponent(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLogicalDataComponent(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		logicalDataComponent.setContentProvider(contentProvider);
		logicalDataComponent.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#updateLogicalDataComponent()
	 * 
	 */
	public void updateLogicalDataComponent() {
	logicalDataComponent.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#addFilterLogicalDataComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLogicalDataComponent(ViewerFilter filter) {
		logicalDataComponentFilters.add(filter);
		if (this.logicalDataComponent != null) {
			this.logicalDataComponent.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#addBusinessFilterLogicalDataComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLogicalDataComponent(ViewerFilter filter) {
		logicalDataComponentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#isContainedInLogicalDataComponentTable(EObject element)
	 * 
	 */
	public boolean isContainedInLogicalDataComponentTable(EObject element) {
		return ((ReferencesTableSettings)logicalDataComponent.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#initPhysicalDataComponent(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPhysicalDataComponent(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		physicalDataComponent.setContentProvider(contentProvider);
		physicalDataComponent.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#updatePhysicalDataComponent()
	 * 
	 */
	public void updatePhysicalDataComponent() {
	physicalDataComponent.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#addFilterPhysicalDataComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPhysicalDataComponent(ViewerFilter filter) {
		physicalDataComponentFilters.add(filter);
		if (this.physicalDataComponent != null) {
			this.physicalDataComponent.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#addBusinessFilterPhysicalDataComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPhysicalDataComponent(ViewerFilter filter) {
		physicalDataComponentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityDataComponentPropertiesEditionPart#isContainedInPhysicalDataComponentTable(EObject element)
	 * 
	 */
	public boolean isContainedInPhysicalDataComponentTable(EObject element) {
		return ((ReferencesTableSettings)physicalDataComponent.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.DataEntityDataComponent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
