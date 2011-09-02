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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class ApplicationPortofolioPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ApplicationPortofolioPropertiesEditionPart {

protected ReferencesTable logicalApplicationComponent;
protected List<ViewerFilter> logicalApplicationComponentBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> logicalApplicationComponentFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable physicalApplicationComponent;
protected List<ViewerFilter> physicalApplicationComponentBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> physicalApplicationComponentFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ApplicationPortofolioPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence applicationPortofolioStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = applicationPortofolioStep.addStep(ContentfwkViewsRepository.ApplicationPortofolio.Properties.class);
		propertiesStep.addStep(ContentfwkViewsRepository.ApplicationPortofolio.Properties.logicalApplicationComponent);
		propertiesStep.addStep(ContentfwkViewsRepository.ApplicationPortofolio.Properties.physicalApplicationComponent);
		
		
		composer = new PartComposer(applicationPortofolioStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.ApplicationPortofolio.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.ApplicationPortofolio.Properties.logicalApplicationComponent) {
					return createLogicalApplicationComponentAdvancedTableComposition(parent);
				}
				if (key == ContentfwkViewsRepository.ApplicationPortofolio.Properties.physicalApplicationComponent) {
					return createPhysicalApplicationComponentAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ContentfwkMessages.ApplicationPortofolioPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLogicalApplicationComponentAdvancedTableComposition(Composite parent) {
		this.logicalApplicationComponent = new ReferencesTable(ContentfwkMessages.ApplicationPortofolioPropertiesEditionPart_LogicalApplicationComponentLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPortofolioPropertiesEditionPartImpl.this, ContentfwkViewsRepository.ApplicationPortofolio.Properties.logicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				logicalApplicationComponent.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPortofolioPropertiesEditionPartImpl.this, ContentfwkViewsRepository.ApplicationPortofolio.Properties.logicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				logicalApplicationComponent.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPortofolioPropertiesEditionPartImpl.this, ContentfwkViewsRepository.ApplicationPortofolio.Properties.logicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				logicalApplicationComponent.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPortofolioPropertiesEditionPartImpl.this, ContentfwkViewsRepository.ApplicationPortofolio.Properties.logicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				logicalApplicationComponent.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.logicalApplicationComponentFilters) {
			this.logicalApplicationComponent.addFilter(filter);
		}
		this.logicalApplicationComponent.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.ApplicationPortofolio.Properties.logicalApplicationComponent, ContentfwkViewsRepository.SWT_KIND));
		this.logicalApplicationComponent.createControls(parent);
		this.logicalApplicationComponent.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPortofolioPropertiesEditionPartImpl.this, ContentfwkViewsRepository.ApplicationPortofolio.Properties.logicalApplicationComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData logicalApplicationComponentData = new GridData(GridData.FILL_HORIZONTAL);
		logicalApplicationComponentData.horizontalSpan = 3;
		this.logicalApplicationComponent.setLayoutData(logicalApplicationComponentData);
		this.logicalApplicationComponent.setLowerBound(0);
		this.logicalApplicationComponent.setUpperBound(-1);
		logicalApplicationComponent.setID(ContentfwkViewsRepository.ApplicationPortofolio.Properties.logicalApplicationComponent);
		logicalApplicationComponent.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPhysicalApplicationComponentAdvancedTableComposition(Composite parent) {
		this.physicalApplicationComponent = new ReferencesTable(ContentfwkMessages.ApplicationPortofolioPropertiesEditionPart_PhysicalApplicationComponentLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPortofolioPropertiesEditionPartImpl.this, ContentfwkViewsRepository.ApplicationPortofolio.Properties.physicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				physicalApplicationComponent.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPortofolioPropertiesEditionPartImpl.this, ContentfwkViewsRepository.ApplicationPortofolio.Properties.physicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				physicalApplicationComponent.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPortofolioPropertiesEditionPartImpl.this, ContentfwkViewsRepository.ApplicationPortofolio.Properties.physicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				physicalApplicationComponent.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPortofolioPropertiesEditionPartImpl.this, ContentfwkViewsRepository.ApplicationPortofolio.Properties.physicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				physicalApplicationComponent.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.physicalApplicationComponentFilters) {
			this.physicalApplicationComponent.addFilter(filter);
		}
		this.physicalApplicationComponent.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.ApplicationPortofolio.Properties.physicalApplicationComponent, ContentfwkViewsRepository.SWT_KIND));
		this.physicalApplicationComponent.createControls(parent);
		this.physicalApplicationComponent.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPortofolioPropertiesEditionPartImpl.this, ContentfwkViewsRepository.ApplicationPortofolio.Properties.physicalApplicationComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData physicalApplicationComponentData = new GridData(GridData.FILL_HORIZONTAL);
		physicalApplicationComponentData.horizontalSpan = 3;
		this.physicalApplicationComponent.setLayoutData(physicalApplicationComponentData);
		this.physicalApplicationComponent.setLowerBound(0);
		this.physicalApplicationComponent.setUpperBound(-1);
		physicalApplicationComponent.setID(ContentfwkViewsRepository.ApplicationPortofolio.Properties.physicalApplicationComponent);
		physicalApplicationComponent.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart#initLogicalApplicationComponent(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLogicalApplicationComponent(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		logicalApplicationComponent.setContentProvider(contentProvider);
		logicalApplicationComponent.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart#updateLogicalApplicationComponent()
	 * 
	 */
	public void updateLogicalApplicationComponent() {
	logicalApplicationComponent.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart#addFilterLogicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLogicalApplicationComponent(ViewerFilter filter) {
		logicalApplicationComponentFilters.add(filter);
		if (this.logicalApplicationComponent != null) {
			this.logicalApplicationComponent.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart#addBusinessFilterLogicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLogicalApplicationComponent(ViewerFilter filter) {
		logicalApplicationComponentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart#isContainedInLogicalApplicationComponentTable(EObject element)
	 * 
	 */
	public boolean isContainedInLogicalApplicationComponentTable(EObject element) {
		return ((ReferencesTableSettings)logicalApplicationComponent.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart#initPhysicalApplicationComponent(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPhysicalApplicationComponent(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		physicalApplicationComponent.setContentProvider(contentProvider);
		physicalApplicationComponent.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart#updatePhysicalApplicationComponent()
	 * 
	 */
	public void updatePhysicalApplicationComponent() {
	physicalApplicationComponent.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart#addFilterPhysicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPhysicalApplicationComponent(ViewerFilter filter) {
		physicalApplicationComponentFilters.add(filter);
		if (this.physicalApplicationComponent != null) {
			this.physicalApplicationComponent.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart#addBusinessFilterPhysicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPhysicalApplicationComponent(ViewerFilter filter) {
		physicalApplicationComponentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ApplicationPortofolioPropertiesEditionPart#isContainedInPhysicalApplicationComponentTable(EObject element)
	 * 
	 */
	public boolean isContainedInPhysicalApplicationComponentTable(EObject element) {
		return ((ReferencesTableSettings)physicalApplicationComponent.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.ApplicationPortofolio_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
