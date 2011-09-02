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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class ProcessEventControlProductPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ProcessEventControlProductPropertiesEditionPart {

	protected ReferencesTable processes;
	protected List<ViewerFilter> processesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable events;
	protected List<ViewerFilter> eventsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> eventsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable controls;
	protected List<ViewerFilter> controlsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> controlsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable products;
	protected List<ViewerFilter> productsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> productsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ProcessEventControlProductPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence processEventControlProductStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep processeventcontrolproductStep = processEventControlProductStep.addStep(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.class);
		processeventcontrolproductStep.addStep(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes);
		processeventcontrolproductStep.addStep(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events);
		processeventcontrolproductStep.addStep(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls);
		processeventcontrolproductStep.addStep(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products);
		
		
		composer = new PartComposer(processEventControlProductStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.class) {
					return createProcesseventcontrolproductGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes) {
					return createProcessesTableComposition(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events) {
					return createEventsTableComposition(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls) {
					return createControlsTableComposition(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products) {
					return createProductsTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createProcesseventcontrolproductGroup(FormToolkit widgetFactory, final Composite parent) {
		Section processeventcontrolproductSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		processeventcontrolproductSection.setText(ContentfwkMessages.ProcessEventControlProductPropertiesEditionPart_ProcesseventcontrolproductGroupLabel);
		GridData processeventcontrolproductSectionData = new GridData(GridData.FILL_HORIZONTAL);
		processeventcontrolproductSectionData.horizontalSpan = 3;
		processeventcontrolproductSection.setLayoutData(processeventcontrolproductSectionData);
		Composite processeventcontrolproductGroup = widgetFactory.createComposite(processeventcontrolproductSection);
		GridLayout processeventcontrolproductGroupLayout = new GridLayout();
		processeventcontrolproductGroupLayout.numColumns = 3;
		processeventcontrolproductGroup.setLayout(processeventcontrolproductGroupLayout);
		processeventcontrolproductSection.setClient(processeventcontrolproductGroup);
		return processeventcontrolproductGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createProcessesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.processes = new ReferencesTable(ContentfwkMessages.ProcessEventControlProductPropertiesEditionPart_ProcessesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				processes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				processes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				processes.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				processes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.processesFilters) {
			this.processes.addFilter(filter);
		}
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes, ContentfwkViewsRepository.FORM_KIND));
		this.processes.createControls(parent, widgetFactory);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processesData = new GridData(GridData.FILL_HORIZONTAL);
		processesData.horizontalSpan = 3;
		this.processes.setLayoutData(processesData);
		this.processes.setLowerBound(0);
		this.processes.setUpperBound(-1);
		processes.setID(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes);
		processes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEventsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.events = new ReferencesTable(ContentfwkMessages.ProcessEventControlProductPropertiesEditionPart_EventsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				events.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				events.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				events.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				events.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.eventsFilters) {
			this.events.addFilter(filter);
		}
		this.events.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events, ContentfwkViewsRepository.FORM_KIND));
		this.events.createControls(parent, widgetFactory);
		this.events.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eventsData = new GridData(GridData.FILL_HORIZONTAL);
		eventsData.horizontalSpan = 3;
		this.events.setLayoutData(eventsData);
		this.events.setLowerBound(0);
		this.events.setUpperBound(-1);
		events.setID(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events);
		events.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createControlsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.controls = new ReferencesTable(ContentfwkMessages.ProcessEventControlProductPropertiesEditionPart_ControlsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				controls.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				controls.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				controls.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				controls.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.controlsFilters) {
			this.controls.addFilter(filter);
		}
		this.controls.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls, ContentfwkViewsRepository.FORM_KIND));
		this.controls.createControls(parent, widgetFactory);
		this.controls.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData controlsData = new GridData(GridData.FILL_HORIZONTAL);
		controlsData.horizontalSpan = 3;
		this.controls.setLayoutData(controlsData);
		this.controls.setLowerBound(0);
		this.controls.setUpperBound(-1);
		controls.setID(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls);
		controls.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createProductsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.products = new ReferencesTable(ContentfwkMessages.ProcessEventControlProductPropertiesEditionPart_ProductsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				products.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				products.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				products.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				products.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.productsFilters) {
			this.products.addFilter(filter);
		}
		this.products.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products, ContentfwkViewsRepository.FORM_KIND));
		this.products.createControls(parent, widgetFactory);
		this.products.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessEventControlProductPropertiesEditionPartForm.this, ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData productsData = new GridData(GridData.FILL_HORIZONTAL);
		productsData.horizontalSpan = 3;
		this.products.setLayoutData(productsData);
		this.products.setLowerBound(0);
		this.products.setUpperBound(-1);
		products.setID(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products);
		products.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#initProcesses(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		processes.setContentProvider(contentProvider);
		processes.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#updateProcesses()
	 * 
	 */
	public void updateProcesses() {
	processes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#addFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter) {
		processesFilters.add(filter);
		if (this.processes != null) {
			this.processes.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#addBusinessFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter) {
		processesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#isContainedInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)processes.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#initEvents(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		events.setContentProvider(contentProvider);
		events.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#updateEvents()
	 * 
	 */
	public void updateEvents() {
	events.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#addFilterEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvents(ViewerFilter filter) {
		eventsFilters.add(filter);
		if (this.events != null) {
			this.events.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#addBusinessFilterEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvents(ViewerFilter filter) {
		eventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#isContainedInEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEventsTable(EObject element) {
		return ((ReferencesTableSettings)events.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#initControls(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initControls(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		controls.setContentProvider(contentProvider);
		controls.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#updateControls()
	 * 
	 */
	public void updateControls() {
	controls.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#addFilterControls(ViewerFilter filter)
	 * 
	 */
	public void addFilterToControls(ViewerFilter filter) {
		controlsFilters.add(filter);
		if (this.controls != null) {
			this.controls.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#addBusinessFilterControls(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToControls(ViewerFilter filter) {
		controlsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#isContainedInControlsTable(EObject element)
	 * 
	 */
	public boolean isContainedInControlsTable(EObject element) {
		return ((ReferencesTableSettings)controls.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#initProducts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProducts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		products.setContentProvider(contentProvider);
		products.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#updateProducts()
	 * 
	 */
	public void updateProducts() {
	products.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#addFilterProducts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProducts(ViewerFilter filter) {
		productsFilters.add(filter);
		if (this.products != null) {
			this.products.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#addBusinessFilterProducts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProducts(ViewerFilter filter) {
		productsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart#isContainedInProductsTable(EObject element)
	 * 
	 */
	public boolean isContainedInProductsTable(EObject element) {
		return ((ReferencesTableSettings)products.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.ProcessEventControlProduct_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
