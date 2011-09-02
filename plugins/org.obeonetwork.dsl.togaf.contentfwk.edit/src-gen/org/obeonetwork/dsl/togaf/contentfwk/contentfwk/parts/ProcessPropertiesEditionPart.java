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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ProcessPropertiesEditionPart {

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
	 * @return the process Critiality
	 * 
	 */
	public String getProcessCritiality();

	/**
	 * Defines a new process Critiality
	 * @param newValue the new process Critiality to set
	 * 
	 */
	public void setProcessCritiality(String newValue);


	/**
	 * @return the is Automated
	 * 
	 */
	public Boolean getIsAutomated();

	/**
	 * Defines a new is Automated
	 * @param newValue the new is Automated to set
	 * 
	 */
	public void setIsAutomated(Boolean newValue);


	/**
	 * @return the process Volumetrics
	 * 
	 */
	public String getProcessVolumetrics();

	/**
	 * Defines a new process Volumetrics
	 * @param newValue the new process Volumetrics to set
	 * 
	 */
	public void setProcessVolumetrics(String newValue);


	/**
	 * @return the decomposes Process
	 * 
	 */
	public EObject getDecomposesProcess();

	/**
	 * Init the decomposes Process
	 * @param settings the combo setting
	 */
	public void initDecomposesProcess(EObjectFlatComboSettings settings);

	/**
	 * Defines a new decomposes Process
	 * @param newValue the new decomposes Process to set
	 * 
	 */
	public void setDecomposesProcess(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDecomposesProcessButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the decomposes Process edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecomposesProcess(ViewerFilter filter);

	/**
	 * Adds the given filter to the decomposes Process edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecomposesProcess(ViewerFilter filter);




	/**
	 * Init the precedes Processes
	 * @param settings settings for the precedes Processes ReferencesTable 
	 */
	public void initPrecedesProcesses(ReferencesTableSettings settings);

	/**
	 * Update the precedes Processes
	 * @param newValue the precedes Processes to update
	 * 
	 */
	public void updatePrecedesProcesses();

	/**
	 * Adds the given filter to the precedes Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPrecedesProcesses(ViewerFilter filter);

	/**
	 * Adds the given filter to the precedes Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPrecedesProcesses(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the precedes Processes table
	 * 
	 */
	public boolean isContainedInPrecedesProcessesTable(EObject element);




	/**
	 * Init the follows Processes
	 * @param settings settings for the follows Processes ReferencesTable 
	 */
	public void initFollowsProcesses(ReferencesTableSettings settings);

	/**
	 * Update the follows Processes
	 * @param newValue the follows Processes to update
	 * 
	 */
	public void updateFollowsProcesses();

	/**
	 * Adds the given filter to the follows Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFollowsProcesses(ViewerFilter filter);

	/**
	 * Adds the given filter to the follows Processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFollowsProcesses(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the follows Processes table
	 * 
	 */
	public boolean isContainedInFollowsProcessesTable(EObject element);




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
	 * Init the orchestrates Functions
	 * @param settings settings for the orchestrates Functions ReferencesTable 
	 */
	public void initOrchestratesFunctions(ReferencesTableSettings settings);

	/**
	 * Update the orchestrates Functions
	 * @param newValue the orchestrates Functions to update
	 * 
	 */
	public void updateOrchestratesFunctions();

	/**
	 * Adds the given filter to the orchestrates Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOrchestratesFunctions(ViewerFilter filter);

	/**
	 * Adds the given filter to the orchestrates Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOrchestratesFunctions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the orchestrates Functions table
	 * 
	 */
	public boolean isContainedInOrchestratesFunctionsTable(EObject element);




	/**
	 * Init the decomposes Functions
	 * @param settings settings for the decomposes Functions ReferencesTable 
	 */
	public void initDecomposesFunctions(ReferencesTableSettings settings);

	/**
	 * Update the decomposes Functions
	 * @param newValue the decomposes Functions to update
	 * 
	 */
	public void updateDecomposesFunctions();

	/**
	 * Adds the given filter to the decomposes Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecomposesFunctions(ViewerFilter filter);

	/**
	 * Adds the given filter to the decomposes Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecomposesFunctions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the decomposes Functions table
	 * 
	 */
	public boolean isContainedInDecomposesFunctionsTable(EObject element);




	/**
	 * Init the involves Organization Units
	 * @param settings settings for the involves Organization Units ReferencesTable 
	 */
	public void initInvolvesOrganizationUnits(ReferencesTableSettings settings);

	/**
	 * Update the involves Organization Units
	 * @param newValue the involves Organization Units to update
	 * 
	 */
	public void updateInvolvesOrganizationUnits();

	/**
	 * Adds the given filter to the involves Organization Units edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInvolvesOrganizationUnits(ViewerFilter filter);

	/**
	 * Adds the given filter to the involves Organization Units edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInvolvesOrganizationUnits(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the involves Organization Units table
	 * 
	 */
	public boolean isContainedInInvolvesOrganizationUnitsTable(EObject element);




	/**
	 * Init the orchestrates Services
	 * @param settings settings for the orchestrates Services ReferencesTable 
	 */
	public void initOrchestratesServices(ReferencesTableSettings settings);

	/**
	 * Update the orchestrates Services
	 * @param newValue the orchestrates Services to update
	 * 
	 */
	public void updateOrchestratesServices();

	/**
	 * Adds the given filter to the orchestrates Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOrchestratesServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the orchestrates Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOrchestratesServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the orchestrates Services table
	 * 
	 */
	public boolean isContainedInOrchestratesServicesTable(EObject element);




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
	 * Init the involves Actors
	 * @param settings settings for the involves Actors ReferencesTable 
	 */
	public void initInvolvesActors(ReferencesTableSettings settings);

	/**
	 * Update the involves Actors
	 * @param newValue the involves Actors to update
	 * 
	 */
	public void updateInvolvesActors();

	/**
	 * Adds the given filter to the involves Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInvolvesActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the involves Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInvolvesActors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the involves Actors table
	 * 
	 */
	public boolean isContainedInInvolvesActorsTable(EObject element);




	/**
	 * Init the is Guided By Controls
	 * @param settings settings for the is Guided By Controls ReferencesTable 
	 */
	public void initIsGuidedByControls(ReferencesTableSettings settings);

	/**
	 * Update the is Guided By Controls
	 * @param newValue the is Guided By Controls to update
	 * 
	 */
	public void updateIsGuidedByControls();

	/**
	 * Adds the given filter to the is Guided By Controls edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsGuidedByControls(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Guided By Controls edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsGuidedByControls(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Guided By Controls table
	 * 
	 */
	public boolean isContainedInIsGuidedByControlsTable(EObject element);




	/**
	 * Init the produces Products
	 * @param settings settings for the produces Products ReferencesTable 
	 */
	public void initProducesProducts(ReferencesTableSettings settings);

	/**
	 * Update the produces Products
	 * @param newValue the produces Products to update
	 * 
	 */
	public void updateProducesProducts();

	/**
	 * Adds the given filter to the produces Products edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProducesProducts(ViewerFilter filter);

	/**
	 * Adds the given filter to the produces Products edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProducesProducts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the produces Products table
	 * 
	 */
	public boolean isContainedInProducesProductsTable(EObject element);




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
