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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ActorPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the ID
	 * 
	 */
	public String getID();

	/**
	 * Defines a new ID
	 * @param newValue the new ID to set
	 * 
	 */
	public void setID(String newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the category
	 * 
	 */
	public String getCategory();

	/**
	 * Defines a new category
	 * @param newValue the new category to set
	 * 
	 */
	public void setCategory(String newValue);


	/**
	 * @return the source
	 * 
	 */
	public String getSource();

	/**
	 * Defines a new source
	 * @param newValue the new source to set
	 * 
	 */
	public void setSource(String newValue);


	/**
	 * @return the owner
	 * 
	 */
	public String getOwner();

	/**
	 * Defines a new owner
	 * @param newValue the new owner to set
	 * 
	 */
	public void setOwner(String newValue);


	/**
	 * @return the FTEs
	 * 
	 */
	public String getFTEs();

	/**
	 * Defines a new FTEs
	 * @param newValue the new FTEs to set
	 * 
	 */
	public void setFTEs(String newValue);


	/**
	 * @return the actor Goal
	 * 
	 */
	public String getActorGoal();

	/**
	 * Defines a new actor Goal
	 * @param newValue the new actor Goal to set
	 * 
	 */
	public void setActorGoal(String newValue);


	/**
	 * @return the actor Tasks
	 * 
	 */
	public String getActorTasks();

	/**
	 * Defines a new actor Tasks
	 * @param newValue the new actor Tasks to set
	 * 
	 */
	public void setActorTasks(String newValue);


	/**
	 * @return the operates In Location
	 * 
	 */
	public EObject getOperatesInLocation();

	/**
	 * Init the operates In Location
	 * @param settings the combo setting
	 */
	public void initOperatesInLocation(EObjectFlatComboSettings settings);

	/**
	 * Defines a new operates In Location
	 * @param newValue the new operates In Location to set
	 * 
	 */
	public void setOperatesInLocation(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOperatesInLocationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the operates In Location edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOperatesInLocation(ViewerFilter filter);

	/**
	 * Adds the given filter to the operates In Location edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOperatesInLocation(ViewerFilter filter);


	/**
	 * @return the belongs To
	 * 
	 */
	public EObject getBelongsTo();

	/**
	 * Init the belongs To
	 * @param settings the combo setting
	 */
	public void initBelongsTo(EObjectFlatComboSettings settings);

	/**
	 * Defines a new belongs To
	 * @param newValue the new belongs To to set
	 * 
	 */
	public void setBelongsTo(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setBelongsToButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the belongs To edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToBelongsTo(ViewerFilter filter);

	/**
	 * Adds the given filter to the belongs To edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToBelongsTo(ViewerFilter filter);




	/**
	 * Init the decomposes Actors
	 * @param settings settings for the decomposes Actors ReferencesTable 
	 */
	public void initDecomposesActors(ReferencesTableSettings settings);

	/**
	 * Update the decomposes Actors
	 * @param newValue the decomposes Actors to update
	 * 
	 */
	public void updateDecomposesActors();

	/**
	 * Adds the given filter to the decomposes Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecomposesActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the decomposes Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecomposesActors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the decomposes Actors table
	 * 
	 */
	public boolean isContainedInDecomposesActorsTable(EObject element);




	/**
	 * Init the performs Task In Roles
	 * @param settings settings for the performs Task In Roles ReferencesTable 
	 */
	public void initPerformsTaskInRoles(ReferencesTableSettings settings);

	/**
	 * Update the performs Task In Roles
	 * @param newValue the performs Task In Roles to update
	 * 
	 */
	public void updatePerformsTaskInRoles();

	/**
	 * Adds the given filter to the performs Task In Roles edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPerformsTaskInRoles(ViewerFilter filter);

	/**
	 * Adds the given filter to the performs Task In Roles edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPerformsTaskInRoles(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the performs Task In Roles table
	 * 
	 */
	public boolean isContainedInPerformsTaskInRolesTable(EObject element);




	/**
	 * Init the interacts With Functions
	 * @param settings settings for the interacts With Functions ReferencesTable 
	 */
	public void initInteractsWithFunctions(ReferencesTableSettings settings);

	/**
	 * Update the interacts With Functions
	 * @param newValue the interacts With Functions to update
	 * 
	 */
	public void updateInteractsWithFunctions();

	/**
	 * Adds the given filter to the interacts With Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInteractsWithFunctions(ViewerFilter filter);

	/**
	 * Adds the given filter to the interacts With Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInteractsWithFunctions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the interacts With Functions table
	 * 
	 */
	public boolean isContainedInInteractsWithFunctionsTable(EObject element);




	/**
	 * Init the performs Functions
	 * @param settings settings for the performs Functions ReferencesTable 
	 */
	public void initPerformsFunctions(ReferencesTableSettings settings);

	/**
	 * Update the performs Functions
	 * @param newValue the performs Functions to update
	 * 
	 */
	public void updatePerformsFunctions();

	/**
	 * Adds the given filter to the performs Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPerformsFunctions(ViewerFilter filter);

	/**
	 * Adds the given filter to the performs Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPerformsFunctions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the performs Functions table
	 * 
	 */
	public boolean isContainedInPerformsFunctionsTable(EObject element);




	/**
	 * Init the consumes Services
	 * @param settings settings for the consumes Services ReferencesTable 
	 */
	public void initConsumesServices(ReferencesTableSettings settings);

	/**
	 * Update the consumes Services
	 * @param newValue the consumes Services to update
	 * 
	 */
	public void updateConsumesServices();

	/**
	 * Adds the given filter to the consumes Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToConsumesServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the consumes Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToConsumesServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the consumes Services table
	 * 
	 */
	public boolean isContainedInConsumesServicesTable(EObject element);




	/**
	 * Init the participates In Processes
	 * @param settings settings for the participates In Processes ReferencesTable 
	 */
	public void initParticipatesInProcesses(ReferencesTableSettings settings);

	/**
	 * Update the participates In Processes
	 * @param newValue the participates In Processes to update
	 * 
	 */
	public void updateParticipatesInProcesses();

	/**
	 * Adds the given filter to the participates In Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParticipatesInProcesses(ViewerFilter filter);

	/**
	 * Adds the given filter to the participates In Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParticipatesInProcesses(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the participates In Processes table
	 * 
	 */
	public boolean isContainedInParticipatesInProcessesTable(EObject element);




	/**
	 * Init the resolves Events
	 * @param settings settings for the resolves Events ReferencesTable 
	 */
	public void initResolvesEvents(ReferencesTableSettings settings);

	/**
	 * Update the resolves Events
	 * @param newValue the resolves Events to update
	 * 
	 */
	public void updateResolvesEvents();

	/**
	 * Adds the given filter to the resolves Events edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResolvesEvents(ViewerFilter filter);

	/**
	 * Adds the given filter to the resolves Events edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResolvesEvents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resolves Events table
	 * 
	 */
	public boolean isContainedInResolvesEventsTable(EObject element);




	/**
	 * Init the generates Events
	 * @param settings settings for the generates Events ReferencesTable 
	 */
	public void initGeneratesEvents(ReferencesTableSettings settings);

	/**
	 * Update the generates Events
	 * @param newValue the generates Events to update
	 * 
	 */
	public void updateGeneratesEvents();

	/**
	 * Adds the given filter to the generates Events edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGeneratesEvents(ViewerFilter filter);

	/**
	 * Adds the given filter to the generates Events edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGeneratesEvents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the generates Events table
	 * 
	 */
	public boolean isContainedInGeneratesEventsTable(EObject element);




	/**
	 * Init the supplies Entities
	 * @param settings settings for the supplies Entities ReferencesTable 
	 */
	public void initSuppliesEntities(ReferencesTableSettings settings);

	/**
	 * Update the supplies Entities
	 * @param newValue the supplies Entities to update
	 * 
	 */
	public void updateSuppliesEntities();

	/**
	 * Adds the given filter to the supplies Entities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSuppliesEntities(ViewerFilter filter);

	/**
	 * Adds the given filter to the supplies Entities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSuppliesEntities(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the supplies Entities table
	 * 
	 */
	public boolean isContainedInSuppliesEntitiesTable(EObject element);




	/**
	 * Init the consumes Entities
	 * @param settings settings for the consumes Entities ReferencesTable 
	 */
	public void initConsumesEntities(ReferencesTableSettings settings);

	/**
	 * Update the consumes Entities
	 * @param newValue the consumes Entities to update
	 * 
	 */
	public void updateConsumesEntities();

	/**
	 * Adds the given filter to the consumes Entities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToConsumesEntities(ViewerFilter filter);

	/**
	 * Adds the given filter to the consumes Entities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToConsumesEntities(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the consumes Entities table
	 * 
	 */
	public boolean isContainedInConsumesEntitiesTable(EObject element);




	/**
	 * Init the delegates
	 * @param settings settings for the delegates ReferencesTable 
	 */
	public void initDelegates(ReferencesTableSettings settings);

	/**
	 * Update the delegates
	 * @param newValue the delegates to update
	 * 
	 */
	public void updateDelegates();

	/**
	 * Adds the given filter to the delegates edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter);

	/**
	 * Adds the given filter to the delegates edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the delegates table
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element);




	/**
	 * Init the is Delegated By
	 * @param settings settings for the is Delegated By ReferencesTable 
	 */
	public void initIsDelegatedBy(ReferencesTableSettings settings);

	/**
	 * Update the is Delegated By
	 * @param newValue the is Delegated By to update
	 * 
	 */
	public void updateIsDelegatedBy();

	/**
	 * Adds the given filter to the is Delegated By edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Delegated By edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Delegated By table
	 * 
	 */
	public boolean isContainedInIsDelegatedByTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods

// End of user code

}
