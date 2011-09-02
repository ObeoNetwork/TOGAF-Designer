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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class BusinessServiceFunctionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BusinessServiceFunctionPropertiesEditionPart {

protected ReferencesTable services;
protected List<ViewerFilter> servicesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> servicesFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable functions;
protected List<ViewerFilter> functionsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> functionsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BusinessServiceFunctionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence businessServiceFunctionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep organizationactorsStep = businessServiceFunctionStep.addStep(ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.class);
		organizationactorsStep.addStep(ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.services);
		organizationactorsStep.addStep(ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.functions);
		
		
		composer = new PartComposer(businessServiceFunctionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.class) {
					return createOrganizationactorsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.services) {
					return createServicesAdvancedTableComposition(parent);
				}
				if (key == ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.functions) {
					return createFunctionsAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createOrganizationactorsGroup(Composite parent) {
		Group organizationactorsGroup = new Group(parent, SWT.NONE);
		organizationactorsGroup.setText(ContentfwkMessages.BusinessServiceFunctionPropertiesEditionPart_OrganizationactorsGroupLabel);
		GridData organizationactorsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		organizationactorsGroupData.horizontalSpan = 3;
		organizationactorsGroup.setLayoutData(organizationactorsGroupData);
		GridLayout organizationactorsGroupLayout = new GridLayout();
		organizationactorsGroupLayout.numColumns = 3;
		organizationactorsGroup.setLayout(organizationactorsGroupLayout);
		return organizationactorsGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createServicesAdvancedTableComposition(Composite parent) {
		this.services = new ReferencesTable(ContentfwkMessages.BusinessServiceFunctionPropertiesEditionPart_ServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BusinessServiceFunctionPropertiesEditionPartImpl.this, ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				services.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BusinessServiceFunctionPropertiesEditionPartImpl.this, ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				services.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BusinessServiceFunctionPropertiesEditionPartImpl.this, ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				services.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BusinessServiceFunctionPropertiesEditionPartImpl.this, ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				services.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.servicesFilters) {
			this.services.addFilter(filter);
		}
		this.services.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.services, ContentfwkViewsRepository.SWT_KIND));
		this.services.createControls(parent);
		this.services.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BusinessServiceFunctionPropertiesEditionPartImpl.this, ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.services, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData servicesData = new GridData(GridData.FILL_HORIZONTAL);
		servicesData.horizontalSpan = 3;
		this.services.setLayoutData(servicesData);
		this.services.setLowerBound(0);
		this.services.setUpperBound(-1);
		services.setID(ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.services);
		services.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createFunctionsAdvancedTableComposition(Composite parent) {
		this.functions = new ReferencesTable(ContentfwkMessages.BusinessServiceFunctionPropertiesEditionPart_FunctionsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BusinessServiceFunctionPropertiesEditionPartImpl.this, ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.functions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				functions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BusinessServiceFunctionPropertiesEditionPartImpl.this, ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.functions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				functions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BusinessServiceFunctionPropertiesEditionPartImpl.this, ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.functions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				functions.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BusinessServiceFunctionPropertiesEditionPartImpl.this, ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.functions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				functions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.functionsFilters) {
			this.functions.addFilter(filter);
		}
		this.functions.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.functions, ContentfwkViewsRepository.SWT_KIND));
		this.functions.createControls(parent);
		this.functions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BusinessServiceFunctionPropertiesEditionPartImpl.this, ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.functions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData functionsData = new GridData(GridData.FILL_HORIZONTAL);
		functionsData.horizontalSpan = 3;
		this.functions.setLayoutData(functionsData);
		this.functions.setLowerBound(0);
		this.functions.setUpperBound(-1);
		functions.setID(ContentfwkViewsRepository.BusinessServiceFunction.Organizationactors.functions);
		functions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart#initServices(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		services.setContentProvider(contentProvider);
		services.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart#updateServices()
	 * 
	 */
	public void updateServices() {
	services.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart#addFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToServices(ViewerFilter filter) {
		servicesFilters.add(filter);
		if (this.services != null) {
			this.services.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart#addBusinessFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToServices(ViewerFilter filter) {
		servicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart#isContainedInServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInServicesTable(EObject element) {
		return ((ReferencesTableSettings)services.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart#initFunctions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFunctions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		functions.setContentProvider(contentProvider);
		functions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart#updateFunctions()
	 * 
	 */
	public void updateFunctions() {
	functions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart#addFilterFunctions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFunctions(ViewerFilter filter) {
		functionsFilters.add(filter);
		if (this.functions != null) {
			this.functions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart#addBusinessFilterFunctions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFunctions(ViewerFilter filter) {
		functionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart#isContainedInFunctionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInFunctionsTable(EObject element) {
		return ((ReferencesTableSettings)functions.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.BusinessServiceFunction_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
