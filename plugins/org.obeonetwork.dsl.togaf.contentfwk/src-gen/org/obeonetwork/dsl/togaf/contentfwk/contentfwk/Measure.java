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
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getSetsPerformanceCriteriaForObjectives <em>Sets Performance Criteria For Objectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getSetsPerformanceCriteriaForServices <em>Sets Performance Criteria For Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getDecomposesMeasure <em>Decomposes Measure</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getIsDecomposedByMeasures <em>Is Decomposed By Measures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends Element {
	/**
	 * Returns the value of the '<em><b>Sets Performance Criteria For Objectives</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsTrackedAgainstMeasures <em>Is Tracked Against Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets Performance Criteria For Objectives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets Performance Criteria For Objectives</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getMeasure_SetsPerformanceCriteriaForObjectives()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsTrackedAgainstMeasures
	 * @model opposite="isTrackedAgainstMeasures"
	 * @generated
	 */
	EList<Objective> getSetsPerformanceCriteriaForObjectives();

	/**
	 * Returns the value of the '<em><b>Sets Performance Criteria For Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsTrackedAgainstMeasures <em>Is Tracked Against Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets Performance Criteria For Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets Performance Criteria For Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getMeasure_SetsPerformanceCriteriaForServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsTrackedAgainstMeasures
	 * @model opposite="isTrackedAgainstMeasures"
	 * @generated
	 */
	EList<Service> getSetsPerformanceCriteriaForServices();

	/**
	 * Returns the value of the '<em><b>Decomposes Measure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getIsDecomposedByMeasures <em>Is Decomposed By Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Measure</em>' reference.
	 * @see #setDecomposesMeasure(Measure)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getMeasure_DecomposesMeasure()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getIsDecomposedByMeasures
	 * @model opposite="isDecomposedByMeasures"
	 * @generated
	 */
	Measure getDecomposesMeasure();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getDecomposesMeasure <em>Decomposes Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Measure</em>' reference.
	 * @see #getDecomposesMeasure()
	 * @generated
	 */
	void setDecomposesMeasure(Measure value);

	/**
	 * Returns the value of the '<em><b>Is Decomposed By Measures</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getDecomposesMeasure <em>Decomposes Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By Measures</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getMeasure_IsDecomposedByMeasures()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getDecomposesMeasure
	 * @model opposite="decomposesMeasure"
	 * @generated
	 */
	EList<Measure> getIsDecomposedByMeasures();

} // Measure
