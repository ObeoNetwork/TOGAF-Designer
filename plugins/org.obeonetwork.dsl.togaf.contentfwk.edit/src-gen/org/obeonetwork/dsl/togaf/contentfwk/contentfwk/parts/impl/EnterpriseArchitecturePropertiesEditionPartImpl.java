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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class EnterpriseArchitecturePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EnterpriseArchitecturePropertiesEditionPart {

protected ReferencesTable architectures;
protected List<ViewerFilter> architecturesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> architecturesFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable containers;
protected List<ViewerFilter> containersBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> containersFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EnterpriseArchitecturePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence enterpriseArchitectureStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = enterpriseArchitectureStep.addStep(ContentfwkViewsRepository.EnterpriseArchitecture.Properties.class);
		propertiesStep.addStep(ContentfwkViewsRepository.EnterpriseArchitecture.Properties.architectures);
		propertiesStep.addStep(ContentfwkViewsRepository.EnterpriseArchitecture.Properties.containers);
		
		
		composer = new PartComposer(enterpriseArchitectureStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.EnterpriseArchitecture.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.EnterpriseArchitecture.Properties.architectures) {
					return createArchitecturesAdvancedTableComposition(parent);
				}
				if (key == ContentfwkViewsRepository.EnterpriseArchitecture.Properties.containers) {
					return createContainersAdvancedTableComposition(parent);
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
		propertiesGroup.setText(ContentfwkMessages.EnterpriseArchitecturePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createArchitecturesAdvancedTableComposition(Composite parent) {
		this.architectures = new ReferencesTable(ContentfwkMessages.EnterpriseArchitecturePropertiesEditionPart_ArchitecturesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnterpriseArchitecturePropertiesEditionPartImpl.this, ContentfwkViewsRepository.EnterpriseArchitecture.Properties.architectures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				architectures.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnterpriseArchitecturePropertiesEditionPartImpl.this, ContentfwkViewsRepository.EnterpriseArchitecture.Properties.architectures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				architectures.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnterpriseArchitecturePropertiesEditionPartImpl.this, ContentfwkViewsRepository.EnterpriseArchitecture.Properties.architectures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				architectures.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnterpriseArchitecturePropertiesEditionPartImpl.this, ContentfwkViewsRepository.EnterpriseArchitecture.Properties.architectures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				architectures.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.architecturesFilters) {
			this.architectures.addFilter(filter);
		}
		this.architectures.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.EnterpriseArchitecture.Properties.architectures, ContentfwkViewsRepository.SWT_KIND));
		this.architectures.createControls(parent);
		this.architectures.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnterpriseArchitecturePropertiesEditionPartImpl.this, ContentfwkViewsRepository.EnterpriseArchitecture.Properties.architectures, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData architecturesData = new GridData(GridData.FILL_HORIZONTAL);
		architecturesData.horizontalSpan = 3;
		this.architectures.setLayoutData(architecturesData);
		this.architectures.setLowerBound(0);
		this.architectures.setUpperBound(-1);
		architectures.setID(ContentfwkViewsRepository.EnterpriseArchitecture.Properties.architectures);
		architectures.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContainersAdvancedTableComposition(Composite parent) {
		this.containers = new ReferencesTable(ContentfwkMessages.EnterpriseArchitecturePropertiesEditionPart_ContainersLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnterpriseArchitecturePropertiesEditionPartImpl.this, ContentfwkViewsRepository.EnterpriseArchitecture.Properties.containers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				containers.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnterpriseArchitecturePropertiesEditionPartImpl.this, ContentfwkViewsRepository.EnterpriseArchitecture.Properties.containers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				containers.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnterpriseArchitecturePropertiesEditionPartImpl.this, ContentfwkViewsRepository.EnterpriseArchitecture.Properties.containers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				containers.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnterpriseArchitecturePropertiesEditionPartImpl.this, ContentfwkViewsRepository.EnterpriseArchitecture.Properties.containers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				containers.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.containersFilters) {
			this.containers.addFilter(filter);
		}
		this.containers.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.EnterpriseArchitecture.Properties.containers, ContentfwkViewsRepository.SWT_KIND));
		this.containers.createControls(parent);
		this.containers.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EnterpriseArchitecturePropertiesEditionPartImpl.this, ContentfwkViewsRepository.EnterpriseArchitecture.Properties.containers, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containersData = new GridData(GridData.FILL_HORIZONTAL);
		containersData.horizontalSpan = 3;
		this.containers.setLayoutData(containersData);
		this.containers.setLowerBound(0);
		this.containers.setUpperBound(-1);
		containers.setID(ContentfwkViewsRepository.EnterpriseArchitecture.Properties.containers);
		containers.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart#initArchitectures(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initArchitectures(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		architectures.setContentProvider(contentProvider);
		architectures.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart#updateArchitectures()
	 * 
	 */
	public void updateArchitectures() {
	architectures.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart#addFilterArchitectures(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArchitectures(ViewerFilter filter) {
		architecturesFilters.add(filter);
		if (this.architectures != null) {
			this.architectures.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart#addBusinessFilterArchitectures(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArchitectures(ViewerFilter filter) {
		architecturesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart#isContainedInArchitecturesTable(EObject element)
	 * 
	 */
	public boolean isContainedInArchitecturesTable(EObject element) {
		return ((ReferencesTableSettings)architectures.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart#initContainers(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContainers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containers.setContentProvider(contentProvider);
		containers.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart#updateContainers()
	 * 
	 */
	public void updateContainers() {
	containers.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart#addFilterContainers(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainers(ViewerFilter filter) {
		containersFilters.add(filter);
		if (this.containers != null) {
			this.containers.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart#addBusinessFilterContainers(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainers(ViewerFilter filter) {
		containersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EnterpriseArchitecturePropertiesEditionPart#isContainedInContainersTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainersTable(EObject element) {
		return ((ReferencesTableSettings)containers.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.EnterpriseArchitecture_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
