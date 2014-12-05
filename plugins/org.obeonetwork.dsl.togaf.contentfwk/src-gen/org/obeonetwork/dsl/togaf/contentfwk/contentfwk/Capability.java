/**
 * Copyright (c) 2011-2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes how this capability provides value to the enterprise. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getIsDeliveredBy <em>Is Delivered By</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getBusinessValue <em>Business Value</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getIncrements <em>Increments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends Element {
	/**
	 * Returns the value of the '<em><b>Is Delivered By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage#getDeliversCapabilities <em>Delivers Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Delivered By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Delivered By</em>' reference.
	 * @see #setIsDeliveredBy(WorkPackage)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getCapability_IsDeliveredBy()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage#getDeliversCapabilities
	 * @model opposite="deliversCapabilities"
	 * @generated
	 */
	WorkPackage getIsDeliveredBy();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getIsDeliveredBy <em>Is Delivered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Delivered By</em>' reference.
	 * @see #getIsDeliveredBy()
	 * @generated
	 */
	void setIsDeliveredBy(WorkPackage value);

	/**
	 * Returns the value of the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes how this capability provides value to the enterprise. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Value</em>' attribute.
	 * @see #setBusinessValue(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getCapability_BusinessValue()
	 * @model
	 * @generated
	 */
	String getBusinessValue();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getBusinessValue <em>Business Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Value</em>' attribute.
	 * @see #getBusinessValue()
	 * @generated
	 */
	void setBusinessValue(String value);

	/**
	 * Returns the value of the '<em><b>Increments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists possible maturity/quality levels for the capability. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Increments</em>' attribute.
	 * @see #setIncrements(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getCapability_Increments()
	 * @model
	 * @generated
	 */
	String getIncrements();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getIncrements <em>Increments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increments</em>' attribute.
	 * @see #getIncrements()
	 * @generated
	 */
	void setIncrements(String value);

} // Capability
