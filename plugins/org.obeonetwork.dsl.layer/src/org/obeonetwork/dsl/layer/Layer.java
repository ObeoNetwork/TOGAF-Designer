/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.layer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.layer.Layer#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.layer.Layer#getSubLayers <em>Sub Layers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.layer.Layer#getReferences <em>References</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.layer.Layer#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.layer.LayerPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.obeonetwork.dsl.layer.LayerPackage#getLayer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.layer.Layer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.layer.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Layers</em>' containment reference list.
	 * @see org.obeonetwork.dsl.layer.LayerPackage#getLayer_SubLayers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getSubLayers();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.layer.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see org.obeonetwork.dsl.layer.LayerPackage#getLayer_References()
	 * @model
	 * @generated
	 */
	EList<Layer> getReferences();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.obeonetwork.dsl.layer.LayerPackage#getLayer_Elements()
	 * @model
	 * @generated
	 */
	EList<EObject> getElements();

} // Layer
