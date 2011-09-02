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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class ContractMeasureServicesQualityPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ContractMeasureServicesQualityPropertiesEditionPart {

	protected ReferencesTable contracts;
	protected List<ViewerFilter> contractsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contractsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable measures;
	protected List<ViewerFilter> measuresBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> measuresFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable servicesQuality;
	protected List<ViewerFilter> servicesQualityBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> servicesQualityFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ContractMeasureServicesQualityPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence contractMeasureServicesQualityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep contractsmeasuresStep = contractMeasureServicesQualityStep.addStep(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.class);
		contractsmeasuresStep.addStep(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts);
		contractsmeasuresStep.addStep(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures);
		contractsmeasuresStep.addStep(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality);
		
		
		composer = new PartComposer(contractMeasureServicesQualityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.class) {
					return createContractsmeasuresGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts) {
					return createContractsTableComposition(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures) {
					return createMeasuresTableComposition(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality) {
					return createServicesQualityTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createContractsmeasuresGroup(FormToolkit widgetFactory, final Composite parent) {
		Section contractsmeasuresSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		contractsmeasuresSection.setText(ContentfwkMessages.ContractMeasureServicesQualityPropertiesEditionPart_ContractsmeasuresGroupLabel);
		GridData contractsmeasuresSectionData = new GridData(GridData.FILL_HORIZONTAL);
		contractsmeasuresSectionData.horizontalSpan = 3;
		contractsmeasuresSection.setLayoutData(contractsmeasuresSectionData);
		Composite contractsmeasuresGroup = widgetFactory.createComposite(contractsmeasuresSection);
		GridLayout contractsmeasuresGroupLayout = new GridLayout();
		contractsmeasuresGroupLayout.numColumns = 3;
		contractsmeasuresGroup.setLayout(contractsmeasuresGroupLayout);
		contractsmeasuresSection.setClient(contractsmeasuresGroup);
		return contractsmeasuresGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContractsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.contracts = new ReferencesTable(ContentfwkMessages.ContractMeasureServicesQualityPropertiesEditionPart_ContractsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				contracts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				contracts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				contracts.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				contracts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.contractsFilters) {
			this.contracts.addFilter(filter);
		}
		this.contracts.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts, ContentfwkViewsRepository.FORM_KIND));
		this.contracts.createControls(parent, widgetFactory);
		this.contracts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contractsData = new GridData(GridData.FILL_HORIZONTAL);
		contractsData.horizontalSpan = 3;
		this.contracts.setLayoutData(contractsData);
		this.contracts.setLowerBound(0);
		this.contracts.setUpperBound(-1);
		contracts.setID(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts);
		contracts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMeasuresTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.measures = new ReferencesTable(ContentfwkMessages.ContractMeasureServicesQualityPropertiesEditionPart_MeasuresLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				measures.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				measures.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				measures.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				measures.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.measuresFilters) {
			this.measures.addFilter(filter);
		}
		this.measures.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures, ContentfwkViewsRepository.FORM_KIND));
		this.measures.createControls(parent, widgetFactory);
		this.measures.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData measuresData = new GridData(GridData.FILL_HORIZONTAL);
		measuresData.horizontalSpan = 3;
		this.measures.setLayoutData(measuresData);
		this.measures.setLowerBound(0);
		this.measures.setUpperBound(-1);
		measures.setID(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures);
		measures.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createServicesQualityTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.servicesQuality = new ReferencesTable(ContentfwkMessages.ContractMeasureServicesQualityPropertiesEditionPart_ServicesQualityLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				servicesQuality.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				servicesQuality.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				servicesQuality.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				servicesQuality.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.servicesQualityFilters) {
			this.servicesQuality.addFilter(filter);
		}
		this.servicesQuality.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality, ContentfwkViewsRepository.FORM_KIND));
		this.servicesQuality.createControls(parent, widgetFactory);
		this.servicesQuality.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractMeasureServicesQualityPropertiesEditionPartForm.this, ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData servicesQualityData = new GridData(GridData.FILL_HORIZONTAL);
		servicesQualityData.horizontalSpan = 3;
		this.servicesQuality.setLayoutData(servicesQualityData);
		this.servicesQuality.setLowerBound(0);
		this.servicesQuality.setUpperBound(-1);
		servicesQuality.setID(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality);
		servicesQuality.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#initContracts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContracts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		contracts.setContentProvider(contentProvider);
		contracts.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#updateContracts()
	 * 
	 */
	public void updateContracts() {
	contracts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#addFilterContracts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContracts(ViewerFilter filter) {
		contractsFilters.add(filter);
		if (this.contracts != null) {
			this.contracts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#addBusinessFilterContracts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContracts(ViewerFilter filter) {
		contractsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#isContainedInContractsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContractsTable(EObject element) {
		return ((ReferencesTableSettings)contracts.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#initMeasures(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMeasures(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		measures.setContentProvider(contentProvider);
		measures.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#updateMeasures()
	 * 
	 */
	public void updateMeasures() {
	measures.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#addFilterMeasures(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMeasures(ViewerFilter filter) {
		measuresFilters.add(filter);
		if (this.measures != null) {
			this.measures.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#addBusinessFilterMeasures(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMeasures(ViewerFilter filter) {
		measuresBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#isContainedInMeasuresTable(EObject element)
	 * 
	 */
	public boolean isContainedInMeasuresTable(EObject element) {
		return ((ReferencesTableSettings)measures.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#initServicesQuality(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initServicesQuality(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		servicesQuality.setContentProvider(contentProvider);
		servicesQuality.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#updateServicesQuality()
	 * 
	 */
	public void updateServicesQuality() {
	servicesQuality.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#addFilterServicesQuality(ViewerFilter filter)
	 * 
	 */
	public void addFilterToServicesQuality(ViewerFilter filter) {
		servicesQualityFilters.add(filter);
		if (this.servicesQuality != null) {
			this.servicesQuality.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#addBusinessFilterServicesQuality(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToServicesQuality(ViewerFilter filter) {
		servicesQualityBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart#isContainedInServicesQualityTable(EObject element)
	 * 
	 */
	public boolean isContainedInServicesQualityTable(EObject element) {
		return ((ReferencesTableSettings)servicesQuality.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.ContractMeasureServicesQuality_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
