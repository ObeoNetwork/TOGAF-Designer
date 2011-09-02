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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface InformationSystemServicePropertiesEditionPart {

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
	 * @return the standard Class
	 * 
	 */
	public Enumerator getStandardClass();

	/**
	 * Init the standard Class
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initStandardClass(EEnum eenum, Enumerator current);

	/**
	 * Defines a new standard Class
	 * @param newValue the new standard Class to set
	 * 
	 */
	public void setStandardClass(Enumerator newValue);


	/**
	 * @return the standard Creation Date
	 * 
	 */
	public String getStandardCreationDate();

	/**
	 * Defines a new standard Creation Date
	 * @param newValue the new standard Creation Date to set
	 * 
	 */
	public void setStandardCreationDate(String newValue);


	/**
	 * @return the last Standard Creation Date
	 * 
	 */
	public String getLastStandardCreationDate();

	/**
	 * Defines a new last Standard Creation Date
	 * @param newValue the new last Standard Creation Date to set
	 * 
	 */
	public void setLastStandardCreationDate(String newValue);


	/**
	 * @return the next Standard Creation Date
	 * 
	 */
	public String getNextStandardCreationDate();

	/**
	 * Defines a new next Standard Creation Date
	 * @param newValue the new next Standard Creation Date to set
	 * 
	 */
	public void setNextStandardCreationDate(String newValue);


	/**
	 * @return the retire Date
	 * 
	 */
	public String getRetireDate();

	/**
	 * Defines a new retire Date
	 * @param newValue the new retire Date to set
	 * 
	 */
	public void setRetireDate(String newValue);




	/**
	 * Init the decomposes Services
	 * @param settings settings for the decomposes Services ReferencesTable 
	 */
	public void initDecomposesServices(ReferencesTableSettings settings);

	/**
	 * Update the decomposes Services
	 * @param newValue the decomposes Services to update
	 * 
	 */
	public void updateDecomposesServices();

	/**
	 * Adds the given filter to the decomposes Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecomposesServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the decomposes Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecomposesServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the decomposes Services table
	 * 
	 */
	public boolean isContainedInDecomposesServicesTable(EObject element);




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
	 * Init the is Provided To Actors
	 * @param settings settings for the is Provided To Actors ReferencesTable 
	 */
	public void initIsProvidedToActors(ReferencesTableSettings settings);

	/**
	 * Update the is Provided To Actors
	 * @param newValue the is Provided To Actors to update
	 * 
	 */
	public void updateIsProvidedToActors();

	/**
	 * Adds the given filter to the is Provided To Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsProvidedToActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Provided To Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsProvidedToActors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Provided To Actors table
	 * 
	 */
	public boolean isContainedInIsProvidedToActorsTable(EObject element);




	/**
	 * Init the is Owned And Governed By Organization Units
	 * @param settings settings for the is Owned And Governed By Organization Units ReferencesTable 
	 */
	public void initIsOwnedAndGovernedByOrganizationUnits(ReferencesTableSettings settings);

	/**
	 * Update the is Owned And Governed By Organization Units
	 * @param newValue the is Owned And Governed By Organization Units to update
	 * 
	 */
	public void updateIsOwnedAndGovernedByOrganizationUnits();

	/**
	 * Adds the given filter to the is Owned And Governed By Organization Units edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsOwnedAndGovernedByOrganizationUnits(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Owned And Governed By Organization Units edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsOwnedAndGovernedByOrganizationUnits(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Owned And Governed By Organization Units table
	 * 
	 */
	public boolean isContainedInIsOwnedAndGovernedByOrganizationUnitsTable(EObject element);




	/**
	 * Init the provides Governed Interface To Access Functions
	 * @param settings settings for the provides Governed Interface To Access Functions ReferencesTable 
	 */
	public void initProvidesGovernedInterfaceToAccessFunctions(ReferencesTableSettings settings);

	/**
	 * Update the provides Governed Interface To Access Functions
	 * @param newValue the provides Governed Interface To Access Functions to update
	 * 
	 */
	public void updateProvidesGovernedInterfaceToAccessFunctions();

	/**
	 * Adds the given filter to the provides Governed Interface To Access Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProvidesGovernedInterfaceToAccessFunctions(ViewerFilter filter);

	/**
	 * Adds the given filter to the provides Governed Interface To Access Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProvidesGovernedInterfaceToAccessFunctions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the provides Governed Interface To Access Functions table
	 * 
	 */
	public boolean isContainedInProvidesGovernedInterfaceToAccessFunctionsTable(EObject element);




	/**
	 * Init the supports Processes
	 * @param settings settings for the supports Processes ReferencesTable 
	 */
	public void initSupportsProcesses(ReferencesTableSettings settings);

	/**
	 * Update the supports Processes
	 * @param newValue the supports Processes to update
	 * 
	 */
	public void updateSupportsProcesses();

	/**
	 * Adds the given filter to the supports Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSupportsProcesses(ViewerFilter filter);

	/**
	 * Adds the given filter to the supports Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSupportsProcesses(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the supports Processes table
	 * 
	 */
	public boolean isContainedInSupportsProcessesTable(EObject element);




	/**
	 * Init the is Realized By Processes
	 * @param settings settings for the is Realized By Processes ReferencesTable 
	 */
	public void initIsRealizedByProcesses(ReferencesTableSettings settings);

	/**
	 * Update the is Realized By Processes
	 * @param newValue the is Realized By Processes to update
	 * 
	 */
	public void updateIsRealizedByProcesses();

	/**
	 * Adds the given filter to the is Realized By Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsRealizedByProcesses(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Realized By Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsRealizedByProcesses(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Realized By Processes table
	 * 
	 */
	public boolean isContainedInIsRealizedByProcessesTable(EObject element);




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
	 * Init the provides Entities
	 * @param settings settings for the provides Entities ReferencesTable 
	 */
	public void initProvidesEntities(ReferencesTableSettings settings);

	/**
	 * Update the provides Entities
	 * @param newValue the provides Entities to update
	 * 
	 */
	public void updateProvidesEntities();

	/**
	 * Adds the given filter to the provides Entities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProvidesEntities(ViewerFilter filter);

	/**
	 * Adds the given filter to the provides Entities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProvidesEntities(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the provides Entities table
	 * 
	 */
	public boolean isContainedInProvidesEntitiesTable(EObject element);




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
	 * Init the is Implemented On Logical Technology Components
	 * @param settings settings for the is Implemented On Logical Technology Components ReferencesTable 
	 */
	public void initIsImplementedOnLogicalTechnologyComponents(ReferencesTableSettings settings);

	/**
	 * Update the is Implemented On Logical Technology Components
	 * @param newValue the is Implemented On Logical Technology Components to update
	 * 
	 */
	public void updateIsImplementedOnLogicalTechnologyComponents();

	/**
	 * Adds the given filter to the is Implemented On Logical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsImplementedOnLogicalTechnologyComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Implemented On Logical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsImplementedOnLogicalTechnologyComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Implemented On Logical Technology Components table
	 * 
	 */
	public boolean isContainedInIsImplementedOnLogicalTechnologyComponentsTable(EObject element);




	/**
	 * Init the is Realized Through Logical Application Component
	 * @param settings settings for the is Realized Through Logical Application Component ReferencesTable 
	 */
	public void initIsRealizedThroughLogicalApplicationComponent(ReferencesTableSettings settings);

	/**
	 * Update the is Realized Through Logical Application Component
	 * @param newValue the is Realized Through Logical Application Component to update
	 * 
	 */
	public void updateIsRealizedThroughLogicalApplicationComponent();

	/**
	 * Adds the given filter to the is Realized Through Logical Application Component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsRealizedThroughLogicalApplicationComponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Realized Through Logical Application Component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsRealizedThroughLogicalApplicationComponent(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Realized Through Logical Application Component table
	 * 
	 */
	public boolean isContainedInIsRealizedThroughLogicalApplicationComponentTable(EObject element);




	/**
	 * Init the is Governed And Measured By Contracts
	 * @param settings settings for the is Governed And Measured By Contracts ReferencesTable 
	 */
	public void initIsGovernedAndMeasuredByContracts(ReferencesTableSettings settings);

	/**
	 * Update the is Governed And Measured By Contracts
	 * @param newValue the is Governed And Measured By Contracts to update
	 * 
	 */
	public void updateIsGovernedAndMeasuredByContracts();

	/**
	 * Adds the given filter to the is Governed And Measured By Contracts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsGovernedAndMeasuredByContracts(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Governed And Measured By Contracts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsGovernedAndMeasuredByContracts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Governed And Measured By Contracts table
	 * 
	 */
	public boolean isContainedInIsGovernedAndMeasuredByContractsTable(EObject element);




	/**
	 * Init the is Tracked Against Measures
	 * @param settings settings for the is Tracked Against Measures ReferencesTable 
	 */
	public void initIsTrackedAgainstMeasures(ReferencesTableSettings settings);

	/**
	 * Update the is Tracked Against Measures
	 * @param newValue the is Tracked Against Measures to update
	 * 
	 */
	public void updateIsTrackedAgainstMeasures();

	/**
	 * Adds the given filter to the is Tracked Against Measures edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsTrackedAgainstMeasures(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Tracked Against Measures edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsTrackedAgainstMeasures(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Tracked Against Measures table
	 * 
	 */
	public boolean isContainedInIsTrackedAgainstMeasuresTable(EObject element);




	/**
	 * Init the meets Qualities
	 * @param settings settings for the meets Qualities ReferencesTable 
	 */
	public void initMeetsQualities(ReferencesTableSettings settings);

	/**
	 * Update the meets Qualities
	 * @param newValue the meets Qualities to update
	 * 
	 */
	public void updateMeetsQualities();

	/**
	 * Adds the given filter to the meets Qualities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMeetsQualities(ViewerFilter filter);

	/**
	 * Adds the given filter to the meets Qualities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMeetsQualities(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the meets Qualities table
	 * 
	 */
	public boolean isContainedInMeetsQualitiesTable(EObject element);





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
