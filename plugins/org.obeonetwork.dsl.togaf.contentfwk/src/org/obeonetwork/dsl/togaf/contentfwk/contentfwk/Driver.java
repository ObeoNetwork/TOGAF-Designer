/**
 * Copyright (c) 2011 Obeo.
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getCreatesGoals <em>Creates Goals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getMotivatesOrganizationUnits <em>Motivates Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getDecomposesDriver <em>Decomposes Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDriver()
 * @model
 * @generated
 */
public interface Driver extends Element {
	/**
	 * Returns the value of the '<em><b>Creates Goals</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getAddressesDrivers <em>Addresses Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creates Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creates Goals</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDriver_CreatesGoals()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getAddressesDrivers
	 * @model opposite="addressesDrivers"
	 * @generated
	 */
	EList<Goal> getCreatesGoals();

	/**
	 * Returns the value of the '<em><b>Motivates Organization Units</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getIsMotivatedByDrivers <em>Is Motivated By Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motivates Organization Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motivates Organization Units</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDriver_MotivatesOrganizationUnits()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getIsMotivatedByDrivers
	 * @model opposite="isMotivatedByDrivers"
	 * @generated
	 */
	EList<OrganizationUnit> getMotivatesOrganizationUnits();

	/**
	 * Returns the value of the '<em><b>Decomposes Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Driver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Driver</em>' reference.
	 * @see #setDecomposesDriver(Driver)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDriver_DecomposesDriver()
	 * @model
	 * @generated
	 */
	Driver getDecomposesDriver();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getDecomposesDriver <em>Decomposes Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Driver</em>' reference.
	 * @see #getDecomposesDriver()
	 * @generated
	 */
	void setDecomposesDriver(Driver value);

} // Driver
