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
public interface DataEntityPropertiesEditionPart {

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
	 * @return the data Entity Category
	 * 
	 */
	public Enumerator getDataEntityCategory();

	/**
	 * Init the data Entity Category
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initDataEntityCategory(EEnum eenum, Enumerator current);

	/**
	 * Defines a new data Entity Category
	 * @param newValue the new data Entity Category to set
	 * 
	 */
	public void setDataEntityCategory(Enumerator newValue);


	/**
	 * @return the privacy Classification
	 * 
	 */
	public String getPrivacyClassification();

	/**
	 * Defines a new privacy Classification
	 * @param newValue the new privacy Classification to set
	 * 
	 */
	public void setPrivacyClassification(String newValue);


	/**
	 * @return the retention Classification
	 * 
	 */
	public String getRetentionClassification();

	/**
	 * Defines a new retention Classification
	 * @param newValue the new retention Classification to set
	 * 
	 */
	public void setRetentionClassification(String newValue);


	/**
	 * @return the decompose Entity
	 * 
	 */
	public EObject getDecomposeEntity();

	/**
	 * Init the decompose Entity
	 * @param settings the combo setting
	 */
	public void initDecomposeEntity(EObjectFlatComboSettings settings);

	/**
	 * Defines a new decompose Entity
	 * @param newValue the new decompose Entity to set
	 * 
	 */
	public void setDecomposeEntity(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDecomposeEntityButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the decompose Entity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecomposeEntity(ViewerFilter filter);

	/**
	 * Adds the given filter to the decompose Entity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecomposeEntity(ViewerFilter filter);




	/**
	 * Init the relates To
	 * @param settings settings for the relates To ReferencesTable 
	 */
	public void initRelatesTo(ReferencesTableSettings settings);

	/**
	 * Update the relates To
	 * @param newValue the relates To to update
	 * 
	 */
	public void updateRelatesTo();

	/**
	 * Adds the given filter to the relates To edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRelatesTo(ViewerFilter filter);

	/**
	 * Adds the given filter to the relates To edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRelatesTo(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the relates To table
	 * 
	 */
	public boolean isContainedInRelatesToTable(EObject element);


	/**
	 * @return the resides Within Logical Data Component
	 * 
	 */
	public EObject getResidesWithinLogicalDataComponent();

	/**
	 * Init the resides Within Logical Data Component
	 * @param settings the combo setting
	 */
	public void initResidesWithinLogicalDataComponent(EObjectFlatComboSettings settings);

	/**
	 * Defines a new resides Within Logical Data Component
	 * @param newValue the new resides Within Logical Data Component to set
	 * 
	 */
	public void setResidesWithinLogicalDataComponent(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setResidesWithinLogicalDataComponentButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the resides Within Logical Data Component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResidesWithinLogicalDataComponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the resides Within Logical Data Component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResidesWithinLogicalDataComponent(ViewerFilter filter);




	/**
	 * Init the is Processes By Logical Application Components
	 * @param settings settings for the is Processes By Logical Application Components ReferencesTable 
	 */
	public void initIsProcessesByLogicalApplicationComponents(ReferencesTableSettings settings);

	/**
	 * Update the is Processes By Logical Application Components
	 * @param newValue the is Processes By Logical Application Components to update
	 * 
	 */
	public void updateIsProcessesByLogicalApplicationComponents();

	/**
	 * Adds the given filter to the is Processes By Logical Application Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsProcessesByLogicalApplicationComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Processes By Logical Application Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsProcessesByLogicalApplicationComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Processes By Logical Application Components table
	 * 
	 */
	public boolean isContainedInIsProcessesByLogicalApplicationComponentsTable(EObject element);




	/**
	 * Init the is Supplied By Actors
	 * @param settings settings for the is Supplied By Actors ReferencesTable 
	 */
	public void initIsSuppliedByActors(ReferencesTableSettings settings);

	/**
	 * Update the is Supplied By Actors
	 * @param newValue the is Supplied By Actors to update
	 * 
	 */
	public void updateIsSuppliedByActors();

	/**
	 * Adds the given filter to the is Supplied By Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsSuppliedByActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Supplied By Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsSuppliedByActors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Supplied By Actors table
	 * 
	 */
	public boolean isContainedInIsSuppliedByActorsTable(EObject element);




	/**
	 * Init the is Consumed By Actors
	 * @param settings settings for the is Consumed By Actors ReferencesTable 
	 */
	public void initIsConsumedByActors(ReferencesTableSettings settings);

	/**
	 * Update the is Consumed By Actors
	 * @param newValue the is Consumed By Actors to update
	 * 
	 */
	public void updateIsConsumedByActors();

	/**
	 * Adds the given filter to the is Consumed By Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsConsumedByActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Consumed By Actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsConsumedByActors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Consumed By Actors table
	 * 
	 */
	public boolean isContainedInIsConsumedByActorsTable(EObject element);




	/**
	 * Init the is Accessed By Services
	 * @param settings settings for the is Accessed By Services ReferencesTable 
	 */
	public void initIsAccessedByServices(ReferencesTableSettings settings);

	/**
	 * Update the is Accessed By Services
	 * @param newValue the is Accessed By Services to update
	 * 
	 */
	public void updateIsAccessedByServices();

	/**
	 * Adds the given filter to the is Accessed By Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsAccessedByServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Accessed By Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsAccessedByServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Accessed By Services table
	 * 
	 */
	public boolean isContainedInIsAccessedByServicesTable(EObject element);




	/**
	 * Init the is Updated Through Services
	 * @param settings settings for the is Updated Through Services ReferencesTable 
	 */
	public void initIsUpdatedThroughServices(ReferencesTableSettings settings);

	/**
	 * Update the is Updated Through Services
	 * @param newValue the is Updated Through Services to update
	 * 
	 */
	public void updateIsUpdatedThroughServices();

	/**
	 * Adds the given filter to the is Updated Through Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsUpdatedThroughServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Updated Through Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsUpdatedThroughServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Updated Through Services table
	 * 
	 */
	public boolean isContainedInIsUpdatedThroughServicesTable(EObject element);




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
