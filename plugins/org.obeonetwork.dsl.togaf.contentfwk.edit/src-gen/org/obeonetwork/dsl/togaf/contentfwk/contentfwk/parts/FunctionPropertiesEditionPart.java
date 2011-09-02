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
public interface FunctionPropertiesEditionPart {

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
	 * @return the standardClass
	 * 
	 */
	public Enumerator getStandardClass();

	/**
	 * Init the standardClass
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initStandardClass(EEnum eenum, Enumerator current);

	/**
	 * Defines a new standardClass
	 * @param newValue the new standardClass to set
	 * 
	 */
	public void setStandardClass(Enumerator newValue);


	/**
	 * @return the standardCreationDate
	 * 
	 */
	public String getStandardCreationDate();

	/**
	 * Defines a new standardCreationDate
	 * @param newValue the new standardCreationDate to set
	 * 
	 */
	public void setStandardCreationDate(String newValue);


	/**
	 * @return the lastStandardCreationDate
	 * 
	 */
	public String getLastStandardCreationDate();

	/**
	 * Defines a new lastStandardCreationDate
	 * @param newValue the new lastStandardCreationDate to set
	 * 
	 */
	public void setLastStandardCreationDate(String newValue);


	/**
	 * @return the nextStandardCreationDate
	 * 
	 */
	public String getNextStandardCreationDate();

	/**
	 * Defines a new nextStandardCreationDate
	 * @param newValue the new nextStandardCreationDate to set
	 * 
	 */
	public void setNextStandardCreationDate(String newValue);


	/**
	 * @return the retireDate
	 * 
	 */
	public String getRetireDate();

	/**
	 * Defines a new retireDate
	 * @param newValue the new retireDate to set
	 * 
	 */
	public void setRetireDate(String newValue);


	/**
	 * @return the is Owned By Unit
	 * 
	 */
	public EObject getIsOwnedByUnit();

	/**
	 * Init the is Owned By Unit
	 * @param settings the combo setting
	 */
	public void initIsOwnedByUnit(EObjectFlatComboSettings settings);

	/**
	 * Defines a new is Owned By Unit
	 * @param newValue the new is Owned By Unit to set
	 * 
	 */
	public void setIsOwnedByUnit(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setIsOwnedByUnitButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the is Owned By Unit edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsOwnedByUnit(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Owned By Unit edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsOwnedByUnit(ViewerFilter filter);


	/**
	 * @return the decomposes Function
	 * 
	 */
	public EObject getDecomposesFunction();

	/**
	 * Init the decomposes Function
	 * @param settings the combo setting
	 */
	public void initDecomposesFunction(EObjectFlatComboSettings settings);

	/**
	 * Defines a new decomposes Function
	 * @param newValue the new decomposes Function to set
	 * 
	 */
	public void setDecomposesFunction(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDecomposesFunctionButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the decomposes Function edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecomposesFunction(ViewerFilter filter);

	/**
	 * Adds the given filter to the decomposes Function edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecomposesFunction(ViewerFilter filter);




	/**
	 * Init the communicated With Functions
	 * @param settings settings for the communicated With Functions ReferencesTable 
	 */
	public void initCommunicatedWithFunctions(ReferencesTableSettings settings);

	/**
	 * Update the communicated With Functions
	 * @param newValue the communicated With Functions to update
	 * 
	 */
	public void updateCommunicatedWithFunctions();

	/**
	 * Adds the given filter to the communicated With Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCommunicatedWithFunctions(ViewerFilter filter);

	/**
	 * Adds the given filter to the communicated With Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCommunicatedWithFunctions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the communicated With Functions table
	 * 
	 */
	public boolean isContainedInCommunicatedWithFunctionsTable(EObject element);




	/**
	 * Init the is Bounded By Services
	 * @param settings settings for the is Bounded By Services ReferencesTable 
	 */
	public void initIsBoundedByServices(ReferencesTableSettings settings);

	/**
	 * Update the is Bounded By Services
	 * @param newValue the is Bounded By Services to update
	 * 
	 */
	public void updateIsBoundedByServices();

	/**
	 * Adds the given filter to the is Bounded By Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsBoundedByServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Bounded By Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsBoundedByServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Bounded By Services table
	 * 
	 */
	public boolean isContainedInIsBoundedByServicesTable(EObject element);




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
	 * Init the can Be Accessed By Roles
	 * @param settings settings for the can Be Accessed By Roles ReferencesTable 
	 */
	public void initCanBeAccessedByRoles(ReferencesTableSettings settings);

	/**
	 * Update the can Be Accessed By Roles
	 * @param newValue the can Be Accessed By Roles to update
	 * 
	 */
	public void updateCanBeAccessedByRoles();

	/**
	 * Adds the given filter to the can Be Accessed By Roles edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCanBeAccessedByRoles(ViewerFilter filter);

	/**
	 * Adds the given filter to the can Be Accessed By Roles edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCanBeAccessedByRoles(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the can Be Accessed By Roles table
	 * 
	 */
	public boolean isContainedInCanBeAccessedByRolesTable(EObject element);




	/**
	 * Init the is Performed By Actors
	 * @param settings settings for the is Performed By Actors ReferencesTable 
	 */
	public void initIsPerformedByActors(ReferencesTableSettings settings);

	/**
	 * Update the is Performed By Actors
	 * @param newValue the is Performed By Actors to update
	 * 
	 */
	public void updateIsPerformedByActors();

	/**
	 * Adds the given filter to the is Performed By Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsPerformedByActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Performed By Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsPerformedByActors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Performed By Actors table
	 * 
	 */
	public boolean isContainedInIsPerformedByActorsTable(EObject element);




	/**
	 * Init the supports Actors
	 * @param settings settings for the supports Actors ReferencesTable 
	 */
	public void initSupportsActors(ReferencesTableSettings settings);

	/**
	 * Update the supports Actors
	 * @param newValue the supports Actors to update
	 * 
	 */
	public void updateSupportsActors();

	/**
	 * Adds the given filter to the supports Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSupportsActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the supports Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSupportsActors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the supports Actors table
	 * 
	 */
	public boolean isContainedInSupportsActorsTable(EObject element);




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
