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
public interface LocationPropertiesEditionPart {

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
	 * @return the decomposes Location
	 * 
	 */
	public EObject getDecomposesLocation();

	/**
	 * Init the decomposes Location
	 * @param settings the combo setting
	 */
	public void initDecomposesLocation(EObjectFlatComboSettings settings);

	/**
	 * Defines a new decomposes Location
	 * @param newValue the new decomposes Location to set
	 * 
	 */
	public void setDecomposesLocation(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDecomposesLocationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the decomposes Location edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecomposesLocation(ViewerFilter filter);

	/**
	 * Adds the given filter to the decomposes Location edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecomposesLocation(ViewerFilter filter);




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
	 * Init the contains Organization Units
	 * @param settings settings for the contains Organization Units ReferencesTable 
	 */
	public void initContainsOrganizationUnits(ReferencesTableSettings settings);

	/**
	 * Update the contains Organization Units
	 * @param newValue the contains Organization Units to update
	 * 
	 */
	public void updateContainsOrganizationUnits();

	/**
	 * Adds the given filter to the contains Organization Units edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsOrganizationUnits(ViewerFilter filter);

	/**
	 * Adds the given filter to the contains Organization Units edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsOrganizationUnits(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contains Organization Units table
	 * 
	 */
	public boolean isContainedInContainsOrganizationUnitsTable(EObject element);




	/**
	 * Init the contains Physical Data Components
	 * @param settings settings for the contains Physical Data Components ReferencesTable 
	 */
	public void initContainsPhysicalDataComponents(ReferencesTableSettings settings);

	/**
	 * Update the contains Physical Data Components
	 * @param newValue the contains Physical Data Components to update
	 * 
	 */
	public void updateContainsPhysicalDataComponents();

	/**
	 * Adds the given filter to the contains Physical Data Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsPhysicalDataComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the contains Physical Data Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsPhysicalDataComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contains Physical Data Components table
	 * 
	 */
	public boolean isContainedInContainsPhysicalDataComponentsTable(EObject element);




	/**
	 * Init the contains Physical Application Components
	 * @param settings settings for the contains Physical Application Components ReferencesTable 
	 */
	public void initContainsPhysicalApplicationComponents(ReferencesTableSettings settings);

	/**
	 * Update the contains Physical Application Components
	 * @param newValue the contains Physical Application Components to update
	 * 
	 */
	public void updateContainsPhysicalApplicationComponents();

	/**
	 * Adds the given filter to the contains Physical Application Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsPhysicalApplicationComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the contains Physical Application Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsPhysicalApplicationComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contains Physical Application Components table
	 * 
	 */
	public boolean isContainedInContainsPhysicalApplicationComponentsTable(EObject element);




	/**
	 * Init the contains Physical Technology Components
	 * @param settings settings for the contains Physical Technology Components ReferencesTable 
	 */
	public void initContainsPhysicalTechnologyComponents(ReferencesTableSettings settings);

	/**
	 * Update the contains Physical Technology Components
	 * @param newValue the contains Physical Technology Components to update
	 * 
	 */
	public void updateContainsPhysicalTechnologyComponents();

	/**
	 * Adds the given filter to the contains Physical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainsPhysicalTechnologyComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the contains Physical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainsPhysicalTechnologyComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contains Physical Technology Components table
	 * 
	 */
	public boolean isContainedInContainsPhysicalTechnologyComponentsTable(EObject element);




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
