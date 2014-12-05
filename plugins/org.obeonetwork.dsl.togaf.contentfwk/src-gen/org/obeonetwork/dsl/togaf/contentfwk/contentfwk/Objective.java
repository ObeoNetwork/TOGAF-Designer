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
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getRealizesGoals <em>Realizes Goals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsTrackedAgainstMeasures <em>Is Tracked Against Measures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getDecomposesObjective <em>Decomposes Objective</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsSupportedByBusinessService <em>Is Supported By Business Service</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsDecomposedByObjectives <em>Is Decomposed By Objectives</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getObjective()
 * @model
 * @generated
 */
public interface Objective extends Element {
	/**
	 * Returns the value of the '<em><b>Realizes Goals</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getIsRealizedThroughObjectives <em>Is Realized Through Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes Goals</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getObjective_RealizesGoals()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getIsRealizedThroughObjectives
	 * @model opposite="isRealizedThroughObjectives"
	 * @generated
	 */
	EList<Goal> getRealizesGoals();

	/**
	 * Returns the value of the '<em><b>Is Tracked Against Measures</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getSetsPerformanceCriteriaForObjectives <em>Sets Performance Criteria For Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tracked Against Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tracked Against Measures</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getObjective_IsTrackedAgainstMeasures()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getSetsPerformanceCriteriaForObjectives
	 * @model opposite="setsPerformanceCriteriaForObjectives"
	 * @generated
	 */
	EList<Measure> getIsTrackedAgainstMeasures();

	/**
	 * Returns the value of the '<em><b>Decomposes Objective</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsDecomposedByObjectives <em>Is Decomposed By Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Objective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Objective</em>' reference.
	 * @see #setDecomposesObjective(Objective)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getObjective_DecomposesObjective()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsDecomposedByObjectives
	 * @model opposite="isDecomposedByObjectives"
	 * @generated
	 */
	Objective getDecomposesObjective();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getDecomposesObjective <em>Decomposes Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Objective</em>' reference.
	 * @see #getDecomposesObjective()
	 * @generated
	 */
	void setDecomposesObjective(Objective value);

	/**
	 * Returns the value of the '<em><b>Is Supported By Business Service</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService#getSupportsObjective <em>Supports Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Supported By Business Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Supported By Business Service</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getObjective_IsSupportedByBusinessService()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService#getSupportsObjective
	 * @model opposite="supportsObjective"
	 * @generated
	 */
	EList<BusinessService> getIsSupportedByBusinessService();

	/**
	 * Returns the value of the '<em><b>Is Decomposed By Objectives</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getDecomposesObjective <em>Decomposes Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By Objectives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By Objectives</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getObjective_IsDecomposedByObjectives()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getDecomposesObjective
	 * @model opposite="decomposesObjective"
	 * @generated
	 */
	EList<Objective> getIsDecomposedByObjectives();

} // Objective
