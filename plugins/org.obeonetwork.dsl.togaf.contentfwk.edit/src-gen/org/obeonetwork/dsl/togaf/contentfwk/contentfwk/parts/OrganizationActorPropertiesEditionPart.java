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
public interface OrganizationActorPropertiesEditionPart {



	/**
	 * Init the organizations
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOrganizations(ReferencesTableSettings settings);

	/**
	 * Update the organizations
	 * @param newValue the organizations to update
	 * 
	 */
	public void updateOrganizations();

	/**
	 * Adds the given filter to the organizations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOrganizations(ViewerFilter filter);

	/**
	 * Adds the given filter to the organizations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOrganizations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the organizations table
	 * 
	 */
	public boolean isContainedInOrganizationsTable(EObject element);




	/**
	 * Init the actors
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initActors(ReferencesTableSettings settings);

	/**
	 * Update the actors
	 * @param newValue the actors to update
	 * 
	 */
	public void updateActors();

	/**
	 * Adds the given filter to the actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToActors(ViewerFilter filter);

	/**
	 * Adds the given filter to the actors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToActors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the actors table
	 * 
	 */
	public boolean isContainedInActorsTable(EObject element);





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
