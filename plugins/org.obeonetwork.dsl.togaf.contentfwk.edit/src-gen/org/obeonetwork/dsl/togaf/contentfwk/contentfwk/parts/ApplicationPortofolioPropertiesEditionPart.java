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
public interface ApplicationPortofolioPropertiesEditionPart {



	/**
	 * Init the logicalApplicationComponent
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initLogicalApplicationComponent(ReferencesTableSettings settings);

	/**
	 * Update the logicalApplicationComponent
	 * @param newValue the logicalApplicationComponent to update
	 * 
	 */
	public void updateLogicalApplicationComponent();

	/**
	 * Adds the given filter to the logicalApplicationComponent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLogicalApplicationComponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the logicalApplicationComponent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLogicalApplicationComponent(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the logicalApplicationComponent table
	 * 
	 */
	public boolean isContainedInLogicalApplicationComponentTable(EObject element);




	/**
	 * Init the physicalApplicationComponent
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPhysicalApplicationComponent(ReferencesTableSettings settings);

	/**
	 * Update the physicalApplicationComponent
	 * @param newValue the physicalApplicationComponent to update
	 * 
	 */
	public void updatePhysicalApplicationComponent();

	/**
	 * Adds the given filter to the physicalApplicationComponent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPhysicalApplicationComponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the physicalApplicationComponent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPhysicalApplicationComponent(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the physicalApplicationComponent table
	 * 
	 */
	public boolean isContainedInPhysicalApplicationComponentTable(EObject element);





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
