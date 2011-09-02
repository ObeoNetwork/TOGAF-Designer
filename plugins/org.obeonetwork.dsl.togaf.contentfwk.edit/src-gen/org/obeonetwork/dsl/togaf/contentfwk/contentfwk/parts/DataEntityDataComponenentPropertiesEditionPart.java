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
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface DataEntityDataComponenentPropertiesEditionPart {



	/**
	 * Init the data-entity
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initDataentity(ReferencesTableSettings settings);

	/**
	 * Update the data-entity
	 * @param newValue the data-entity to update
	 * 
	 */
	public void updateDataentity();

	/**
	 * Adds the given filter to the data-entity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDataentity(ViewerFilter filter);

	/**
	 * Adds the given filter to the data-entity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDataentity(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the data-entity table
	 * 
	 */
	public boolean isContainedInDataentityTable(EObject element);




	/**
	 * Init the logical-data-component
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initLogicaldatacomponent(ReferencesTableSettings settings);

	/**
	 * Update the logical-data-component
	 * @param newValue the logical-data-component to update
	 * 
	 */
	public void updateLogicaldatacomponent();

	/**
	 * Adds the given filter to the logical-data-component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLogicaldatacomponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the logical-data-component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLogicaldatacomponent(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the logical-data-component table
	 * 
	 */
	public boolean isContainedInLogicaldatacomponentTable(EObject element);




	/**
	 * Init the physical-data-component
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPhysicaldatacomponent(ReferencesTableSettings settings);

	/**
	 * Update the physical-data-component
	 * @param newValue the physical-data-component to update
	 * 
	 */
	public void updatePhysicaldatacomponent();

	/**
	 * Adds the given filter to the physical-data-component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPhysicaldatacomponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the physical-data-component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPhysicaldatacomponent(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the physical-data-component table
	 * 
	 */
	public boolean isContainedInPhysicaldatacomponentTable(EObject element);





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
