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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getAddressesDrivers <em>Addresses Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getIsRealizedThroughObjectives <em>Is Realized Through Objectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getDecomposesGoal <em>Decomposes Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Element {
	/**
	 * Returns the value of the '<em><b>Addresses Drivers</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getCreatesGoals <em>Creates Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses Drivers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses Drivers</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getGoal_AddressesDrivers()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getCreatesGoals
	 * @model opposite="createsGoals"
	 * @generated
	 */
	EList<Driver> getAddressesDrivers();

	/**
	 * Returns the value of the '<em><b>Is Realized Through Objectives</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getRealizesGoals <em>Realizes Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Realized Through Objectives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Realized Through Objectives</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getGoal_IsRealizedThroughObjectives()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getRealizesGoals
	 * @model opposite="realizesGoals"
	 * @generated
	 */
	EList<Objective> getIsRealizedThroughObjectives();

	/**
	 * Returns the value of the '<em><b>Decomposes Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Goal</em>' reference.
	 * @see #setDecomposesGoal(Goal)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getGoal_DecomposesGoal()
	 * @model
	 * @generated
	 */
	Goal getDecomposesGoal();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getDecomposesGoal <em>Decomposes Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Goal</em>' reference.
	 * @see #getDecomposesGoal()
	 * @generated
	 */
	void setDecomposesGoal(Goal value);

} // Goal
