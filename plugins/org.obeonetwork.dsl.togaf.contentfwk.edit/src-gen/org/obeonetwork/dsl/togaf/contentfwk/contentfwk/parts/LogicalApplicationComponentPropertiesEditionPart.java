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
public interface LogicalApplicationComponentPropertiesEditionPart {

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
	 * @return the decomposes Logical Application Component
	 * 
	 */
	public EObject getDecomposesLogicalApplicationComponent();

	/**
	 * Init the decomposes Logical Application Component
	 * @param settings the combo setting
	 */
	public void initDecomposesLogicalApplicationComponent(EObjectFlatComboSettings settings);

	/**
	 * Defines a new decomposes Logical Application Component
	 * @param newValue the new decomposes Logical Application Component to set
	 * 
	 */
	public void setDecomposesLogicalApplicationComponent(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDecomposesLogicalApplicationComponentButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the decomposes Logical Application Component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecomposesLogicalApplicationComponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the decomposes Logical Application Component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecomposesLogicalApplicationComponent(ViewerFilter filter);




	/**
	 * Init the is Extended By Physical Application Components
	 * @param settings settings for the is Extended By Physical Application Components ReferencesTable 
	 */
	public void initIsExtendedByPhysicalApplicationComponents(ReferencesTableSettings settings);

	/**
	 * Update the is Extended By Physical Application Components
	 * @param newValue the is Extended By Physical Application Components to update
	 * 
	 */
	public void updateIsExtendedByPhysicalApplicationComponents();

	/**
	 * Adds the given filter to the is Extended By Physical Application Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsExtendedByPhysicalApplicationComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Extended By Physical Application Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsExtendedByPhysicalApplicationComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Extended By Physical Application Components table
	 * 
	 */
	public boolean isContainedInIsExtendedByPhysicalApplicationComponentsTable(EObject element);




	/**
	 * Init the communicates With
	 * @param settings settings for the communicates With ReferencesTable 
	 */
	public void initCommunicatesWith(ReferencesTableSettings settings);

	/**
	 * Update the communicates With
	 * @param newValue the communicates With to update
	 * 
	 */
	public void updateCommunicatesWith();

	/**
	 * Adds the given filter to the communicates With edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCommunicatesWith(ViewerFilter filter);

	/**
	 * Adds the given filter to the communicates With edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCommunicatesWith(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the communicates With table
	 * 
	 */
	public boolean isContainedInCommunicatesWithTable(EObject element);




	/**
	 * Init the operates On Data Entities
	 * @param settings settings for the operates On Data Entities ReferencesTable 
	 */
	public void initOperatesOnDataEntities(ReferencesTableSettings settings);

	/**
	 * Update the operates On Data Entities
	 * @param newValue the operates On Data Entities to update
	 * 
	 */
	public void updateOperatesOnDataEntities();

	/**
	 * Adds the given filter to the operates On Data Entities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOperatesOnDataEntities(ViewerFilter filter);

	/**
	 * Adds the given filter to the operates On Data Entities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOperatesOnDataEntities(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the operates On Data Entities table
	 * 
	 */
	public boolean isContainedInOperatesOnDataEntitiesTable(EObject element);




	/**
	 * Init the implements Services
	 * @param settings settings for the implements Services ReferencesTable 
	 */
	public void initImplementsServices(ReferencesTableSettings settings);

	/**
	 * Update the implements Services
	 * @param newValue the implements Services to update
	 * 
	 */
	public void updateImplementsServices();

	/**
	 * Adds the given filter to the implements Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToImplementsServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the implements Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToImplementsServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the implements Services table
	 * 
	 */
	public boolean isContainedInImplementsServicesTable(EObject element);




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
