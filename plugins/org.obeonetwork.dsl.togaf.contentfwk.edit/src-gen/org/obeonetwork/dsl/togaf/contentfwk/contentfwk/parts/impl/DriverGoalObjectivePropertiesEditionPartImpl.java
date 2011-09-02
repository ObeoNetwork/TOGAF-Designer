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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class DriverGoalObjectivePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DriverGoalObjectivePropertiesEditionPart {

protected ReferencesTable drivers;
protected List<ViewerFilter> driversBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> driversFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable goals;
protected List<ViewerFilter> goalsBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> goalsFilters = new ArrayList<ViewerFilter>();
protected ReferencesTable objectives;
protected List<ViewerFilter> objectivesBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> objectivesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DriverGoalObjectivePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence driverGoalObjectiveStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep driversgoalfsobjectivesStep = driverGoalObjectiveStep.addStep(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.class);
		driversgoalfsobjectivesStep.addStep(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers);
		driversgoalfsobjectivesStep.addStep(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals);
		driversgoalfsobjectivesStep.addStep(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives);
		
		
		composer = new PartComposer(driverGoalObjectiveStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.class) {
					return createDriversgoalfsobjectivesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers) {
					return createDriversAdvancedTableComposition(parent);
				}
				if (key == ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals) {
					return createGoalsAdvancedTableComposition(parent);
				}
				if (key == ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives) {
					return createObjectivesAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createDriversgoalfsobjectivesGroup(Composite parent) {
		Group driversgoalfsobjectivesGroup = new Group(parent, SWT.NONE);
		driversgoalfsobjectivesGroup.setText(ContentfwkMessages.DriverGoalObjectivePropertiesEditionPart_DriversgoalfsobjectivesGroupLabel);
		GridData driversgoalfsobjectivesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		driversgoalfsobjectivesGroupData.horizontalSpan = 3;
		driversgoalfsobjectivesGroup.setLayoutData(driversgoalfsobjectivesGroupData);
		GridLayout driversgoalfsobjectivesGroupLayout = new GridLayout();
		driversgoalfsobjectivesGroupLayout.numColumns = 3;
		driversgoalfsobjectivesGroup.setLayout(driversgoalfsobjectivesGroupLayout);
		return driversgoalfsobjectivesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDriversAdvancedTableComposition(Composite parent) {
		this.drivers = new ReferencesTable(ContentfwkMessages.DriverGoalObjectivePropertiesEditionPart_DriversLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				drivers.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				drivers.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				drivers.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				drivers.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.driversFilters) {
			this.drivers.addFilter(filter);
		}
		this.drivers.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers, ContentfwkViewsRepository.SWT_KIND));
		this.drivers.createControls(parent);
		this.drivers.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData driversData = new GridData(GridData.FILL_HORIZONTAL);
		driversData.horizontalSpan = 3;
		this.drivers.setLayoutData(driversData);
		this.drivers.setLowerBound(0);
		this.drivers.setUpperBound(-1);
		drivers.setID(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers);
		drivers.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createGoalsAdvancedTableComposition(Composite parent) {
		this.goals = new ReferencesTable(ContentfwkMessages.DriverGoalObjectivePropertiesEditionPart_GoalsLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				goals.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				goals.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				goals.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				goals.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.goalsFilters) {
			this.goals.addFilter(filter);
		}
		this.goals.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals, ContentfwkViewsRepository.SWT_KIND));
		this.goals.createControls(parent);
		this.goals.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData goalsData = new GridData(GridData.FILL_HORIZONTAL);
		goalsData.horizontalSpan = 3;
		this.goals.setLayoutData(goalsData);
		this.goals.setLowerBound(0);
		this.goals.setUpperBound(-1);
		goals.setID(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals);
		goals.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createObjectivesAdvancedTableComposition(Composite parent) {
		this.objectives = new ReferencesTable(ContentfwkMessages.DriverGoalObjectivePropertiesEditionPart_ObjectivesLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				objectives.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				objectives.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				objectives.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				objectives.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.objectivesFilters) {
			this.objectives.addFilter(filter);
		}
		this.objectives.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives, ContentfwkViewsRepository.SWT_KIND));
		this.objectives.createControls(parent);
		this.objectives.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DriverGoalObjectivePropertiesEditionPartImpl.this, ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData objectivesData = new GridData(GridData.FILL_HORIZONTAL);
		objectivesData.horizontalSpan = 3;
		this.objectives.setLayoutData(objectivesData);
		this.objectives.setLowerBound(0);
		this.objectives.setUpperBound(-1);
		objectives.setID(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives);
		objectives.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#initDrivers(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDrivers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		drivers.setContentProvider(contentProvider);
		drivers.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#updateDrivers()
	 * 
	 */
	public void updateDrivers() {
	drivers.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#addFilterDrivers(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDrivers(ViewerFilter filter) {
		driversFilters.add(filter);
		if (this.drivers != null) {
			this.drivers.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#addBusinessFilterDrivers(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDrivers(ViewerFilter filter) {
		driversBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#isContainedInDriversTable(EObject element)
	 * 
	 */
	public boolean isContainedInDriversTable(EObject element) {
		return ((ReferencesTableSettings)drivers.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#initGoals(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoals(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		goals.setContentProvider(contentProvider);
		goals.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#updateGoals()
	 * 
	 */
	public void updateGoals() {
	goals.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#addFilterGoals(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoals(ViewerFilter filter) {
		goalsFilters.add(filter);
		if (this.goals != null) {
			this.goals.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#addBusinessFilterGoals(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGoals(ViewerFilter filter) {
		goalsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#isContainedInGoalsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGoalsTable(EObject element) {
		return ((ReferencesTableSettings)goals.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#initObjectives(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initObjectives(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		objectives.setContentProvider(contentProvider);
		objectives.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#updateObjectives()
	 * 
	 */
	public void updateObjectives() {
	objectives.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#addFilterObjectives(ViewerFilter filter)
	 * 
	 */
	public void addFilterToObjectives(ViewerFilter filter) {
		objectivesFilters.add(filter);
		if (this.objectives != null) {
			this.objectives.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#addBusinessFilterObjectives(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToObjectives(ViewerFilter filter) {
		objectivesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart#isContainedInObjectivesTable(EObject element)
	 * 
	 */
	public boolean isContainedInObjectivesTable(EObject element) {
		return ((ReferencesTableSettings)objectives.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.DriverGoalObjective_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
