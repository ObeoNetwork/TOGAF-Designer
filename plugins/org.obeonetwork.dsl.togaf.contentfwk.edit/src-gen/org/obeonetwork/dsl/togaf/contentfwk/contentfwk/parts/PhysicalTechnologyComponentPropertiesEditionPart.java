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
public interface PhysicalTechnologyComponentPropertiesEditionPart {

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
	 * @return the product Name
	 * 
	 */
	public String getProductName();

	/**
	 * Defines a new product Name
	 * @param newValue the new product Name to set
	 * 
	 */
	public void setProductName(String newValue);


	/**
	 * @return the module Name
	 * 
	 */
	public String getModuleName();

	/**
	 * Defines a new module Name
	 * @param newValue the new module Name to set
	 * 
	 */
	public void setModuleName(String newValue);


	/**
	 * @return the vendor
	 * 
	 */
	public String getVendor();

	/**
	 * Defines a new vendor
	 * @param newValue the new vendor to set
	 * 
	 */
	public void setVendor(String newValue);


	/**
	 * @return the version
	 * 
	 */
	public String getVersion();

	/**
	 * Defines a new version
	 * @param newValue the new version to set
	 * 
	 */
	public void setVersion(String newValue);


	/**
	 * @return the decomposes Physical Technology Component
	 * 
	 */
	public EObject getDecomposesPhysicalTechnologyComponent();

	/**
	 * Init the decomposes Physical Technology Component
	 * @param settings the combo setting
	 */
	public void initDecomposesPhysicalTechnologyComponent(EObjectFlatComboSettings settings);

	/**
	 * Defines a new decomposes Physical Technology Component
	 * @param newValue the new decomposes Physical Technology Component to set
	 * 
	 */
	public void setDecomposesPhysicalTechnologyComponent(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDecomposesPhysicalTechnologyComponentButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the decomposes Physical Technology Component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecomposesPhysicalTechnologyComponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the decomposes Physical Technology Component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecomposesPhysicalTechnologyComponent(ViewerFilter filter);




	/**
	 * Init the realizes Application Components
	 * @param settings settings for the realizes Application Components ReferencesTable 
	 */
	public void initRealizesApplicationComponents(ReferencesTableSettings settings);

	/**
	 * Update the realizes Application Components
	 * @param newValue the realizes Application Components to update
	 * 
	 */
	public void updateRealizesApplicationComponents();

	/**
	 * Adds the given filter to the realizes Application Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRealizesApplicationComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the realizes Application Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRealizesApplicationComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the realizes Application Components table
	 * 
	 */
	public boolean isContainedInRealizesApplicationComponentsTable(EObject element);




	/**
	 * Init the extends Logical Technology Components
	 * @param settings settings for the extends Logical Technology Components ReferencesTable 
	 */
	public void initExtendsLogicalTechnologyComponents(ReferencesTableSettings settings);

	/**
	 * Update the extends Logical Technology Components
	 * @param newValue the extends Logical Technology Components to update
	 * 
	 */
	public void updateExtendsLogicalTechnologyComponents();

	/**
	 * Adds the given filter to the extends Logical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExtendsLogicalTechnologyComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the extends Logical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExtendsLogicalTechnologyComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the extends Logical Technology Components table
	 * 
	 */
	public boolean isContainedInExtendsLogicalTechnologyComponentsTable(EObject element);




	/**
	 * Init the is Hosted In Location
	 * @param settings settings for the is Hosted In Location ReferencesTable 
	 */
	public void initIsHostedInLocation(ReferencesTableSettings settings);

	/**
	 * Update the is Hosted In Location
	 * @param newValue the is Hosted In Location to update
	 * 
	 */
	public void updateIsHostedInLocation();

	/**
	 * Adds the given filter to the is Hosted In Location edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsHostedInLocation(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Hosted In Location edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsHostedInLocation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Hosted In Location table
	 * 
	 */
	public boolean isContainedInIsHostedInLocationTable(EObject element);




	/**
	 * Init the is Dependent On Physical Technology Components
	 * @param settings settings for the is Dependent On Physical Technology Components ReferencesTable 
	 */
	public void initIsDependentOnPhysicalTechnologyComponents(ReferencesTableSettings settings);

	/**
	 * Update the is Dependent On Physical Technology Components
	 * @param newValue the is Dependent On Physical Technology Components to update
	 * 
	 */
	public void updateIsDependentOnPhysicalTechnologyComponents();

	/**
	 * Adds the given filter to the is Dependent On Physical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsDependentOnPhysicalTechnologyComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Dependent On Physical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsDependentOnPhysicalTechnologyComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Dependent On Physical Technology Components table
	 * 
	 */
	public boolean isContainedInIsDependentOnPhysicalTechnologyComponentsTable(EObject element);




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
