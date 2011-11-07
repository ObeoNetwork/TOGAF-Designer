/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.togaf.representations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.representations.View#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.representations.View#getViewpointURI <em>Viewpoint URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.representations.RepresentationsPackage#getView()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface View extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Representations</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.representations.Representation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representations</em>' containment reference list.
	 * @see org.obeonetwork.dsl.togaf.representations.RepresentationsPackage#getView_Representations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Representation> getRepresentations();

	/**
	 * Returns the value of the '<em><b>Viewpoint URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewpoint URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint URI</em>' attribute.
	 * @see #setViewpointURI(String)
	 * @see org.obeonetwork.dsl.togaf.representations.RepresentationsPackage#getView_ViewpointURI()
	 * @model
	 * @generated
	 */
	String getViewpointURI();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.representations.View#getViewpointURI <em>Viewpoint URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint URI</em>' attribute.
	 * @see #getViewpointURI()
	 * @generated
	 */
	void setViewpointURI(String value);

} // View
