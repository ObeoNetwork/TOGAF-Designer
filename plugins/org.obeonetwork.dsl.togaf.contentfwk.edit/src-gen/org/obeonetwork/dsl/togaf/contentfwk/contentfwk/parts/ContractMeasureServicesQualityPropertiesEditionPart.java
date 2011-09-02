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
public interface ContractMeasureServicesQualityPropertiesEditionPart {



	/**
	 * Init the contracts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContracts(ReferencesTableSettings settings);

	/**
	 * Update the contracts
	 * @param newValue the contracts to update
	 * 
	 */
	public void updateContracts();

	/**
	 * Adds the given filter to the contracts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContracts(ViewerFilter filter);

	/**
	 * Adds the given filter to the contracts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContracts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contracts table
	 * 
	 */
	public boolean isContainedInContractsTable(EObject element);




	/**
	 * Init the measures
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMeasures(ReferencesTableSettings settings);

	/**
	 * Update the measures
	 * @param newValue the measures to update
	 * 
	 */
	public void updateMeasures();

	/**
	 * Adds the given filter to the measures edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMeasures(ViewerFilter filter);

	/**
	 * Adds the given filter to the measures edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMeasures(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the measures table
	 * 
	 */
	public boolean isContainedInMeasuresTable(EObject element);




	/**
	 * Init the services quality
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initServicesQuality(ReferencesTableSettings settings);

	/**
	 * Update the services quality
	 * @param newValue the services quality to update
	 * 
	 */
	public void updateServicesQuality();

	/**
	 * Adds the given filter to the services quality edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToServicesQuality(ViewerFilter filter);

	/**
	 * Adds the given filter to the services quality edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToServicesQuality(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the services quality table
	 * 
	 */
	public boolean isContainedInServicesQualityTable(EObject element);





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
