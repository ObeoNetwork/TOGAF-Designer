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
public interface OrganizationUnitPropertiesEditionPart {

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
	 * @return the headcount
	 * 
	 */
	public String getHeadcount();

	/**
	 * Defines a new headcount
	 * @param newValue the new headcount to set
	 * 
	 */
	public void setHeadcount(String newValue);


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
	 * Init the owns And Governs Services
	 * @param settings settings for the owns And Governs Services ReferencesTable 
	 */
	public void initOwnsAndGovernsServices(ReferencesTableSettings settings);

	/**
	 * Update the owns And Governs Services
	 * @param newValue the owns And Governs Services to update
	 * 
	 */
	public void updateOwnsAndGovernsServices();

	/**
	 * Adds the given filter to the owns And Governs Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnsAndGovernsServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the owns And Governs Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnsAndGovernsServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the owns And Governs Services table
	 * 
	 */
	public boolean isContainedInOwnsAndGovernsServicesTable(EObject element);




	/**
	 * Init the contains Actors
	 * @param settings settings for the contains Actors ReferencesTable 
	 */
	public void initContainsActors(ReferencesTableSettings settings);

	/**
	 * Update the contains Actors
	 * @param newValue the contains Actors to update
	 * 
	 */
	public void updateContainsActors();

	/**
	 * Adds the given filter to the contains Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the contains Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsActors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contains Actors table
	 * 
	 */
	public boolean isContainedInContainsActorsTable(EObject element);




	/**
	 * Init the owns Functions
	 * @param settings settings for the owns Functions ReferencesTable 
	 */
	public void initOwnsFunctions(ReferencesTableSettings settings);

	/**
	 * Update the owns Functions
	 * @param newValue the owns Functions to update
	 * 
	 */
	public void updateOwnsFunctions();

	/**
	 * Adds the given filter to the owns Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwnsFunctions(ViewerFilter filter);

	/**
	 * Adds the given filter to the owns Functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwnsFunctions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the owns Functions table
	 * 
	 */
	public boolean isContainedInOwnsFunctionsTable(EObject element);




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
	 * Init the is Motivated By Drivers
	 * @param settings settings for the is Motivated By Drivers ReferencesTable 
	 */
	public void initIsMotivatedByDrivers(ReferencesTableSettings settings);

	/**
	 * Update the is Motivated By Drivers
	 * @param newValue the is Motivated By Drivers to update
	 * 
	 */
	public void updateIsMotivatedByDrivers();

	/**
	 * Adds the given filter to the is Motivated By Drivers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsMotivatedByDrivers(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Motivated By Drivers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsMotivatedByDrivers(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Motivated By Drivers table
	 * 
	 */
	public boolean isContainedInIsMotivatedByDriversTable(EObject element);




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
