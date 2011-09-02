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
public interface LogicalTechnologyComponentsPropertiesEditionPart {



	/**
	 * Init the Logical Technology Components
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initLogicalTechnologyComponents(ReferencesTableSettings settings);

	/**
	 * Update the Logical Technology Components
	 * @param newValue the Logical Technology Components to update
	 * 
	 */
	public void updateLogicalTechnologyComponents();

	/**
	 * Adds the given filter to the Logical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLogicalTechnologyComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the Logical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLogicalTechnologyComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the Logical Technology Components table
	 * 
	 */
	public boolean isContainedInLogicalTechnologyComponentsTable(EObject element);





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
