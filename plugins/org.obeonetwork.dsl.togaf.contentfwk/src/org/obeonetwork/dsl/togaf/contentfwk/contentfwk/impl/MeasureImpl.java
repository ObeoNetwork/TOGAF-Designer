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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.MeasureImpl#getSetsPerformanceCriteriaForObjectives <em>Sets Performance Criteria For Objectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.MeasureImpl#getSetsPerformanceCriteriaForServices <em>Sets Performance Criteria For Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.MeasureImpl#getDecomposesMeasure <em>Decomposes Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureImpl extends ElementImpl implements Measure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Objective> getSetsPerformanceCriteriaForObjectives() {
		return (EList<Objective>)eDynamicGet(ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES, ContentfwkPackage.Literals.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getSetsPerformanceCriteriaForServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES, ContentfwkPackage.Literals.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getDecomposesMeasure() {
		return (Measure)eDynamicGet(ContentfwkPackage.MEASURE__DECOMPOSES_MEASURE, ContentfwkPackage.Literals.MEASURE__DECOMPOSES_MEASURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetDecomposesMeasure() {
		return (Measure)eDynamicGet(ContentfwkPackage.MEASURE__DECOMPOSES_MEASURE, ContentfwkPackage.Literals.MEASURE__DECOMPOSES_MEASURE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesMeasure(Measure newDecomposesMeasure) {
		eDynamicSet(ContentfwkPackage.MEASURE__DECOMPOSES_MEASURE, ContentfwkPackage.Literals.MEASURE__DECOMPOSES_MEASURE, newDecomposesMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSetsPerformanceCriteriaForObjectives()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSetsPerformanceCriteriaForServices()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES:
				return ((InternalEList<?>)getSetsPerformanceCriteriaForObjectives()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES:
				return ((InternalEList<?>)getSetsPerformanceCriteriaForServices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES:
				return getSetsPerformanceCriteriaForObjectives();
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES:
				return getSetsPerformanceCriteriaForServices();
			case ContentfwkPackage.MEASURE__DECOMPOSES_MEASURE:
				if (resolve) return getDecomposesMeasure();
				return basicGetDecomposesMeasure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES:
				getSetsPerformanceCriteriaForObjectives().clear();
				getSetsPerformanceCriteriaForObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES:
				getSetsPerformanceCriteriaForServices().clear();
				getSetsPerformanceCriteriaForServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.MEASURE__DECOMPOSES_MEASURE:
				setDecomposesMeasure((Measure)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES:
				getSetsPerformanceCriteriaForObjectives().clear();
				return;
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES:
				getSetsPerformanceCriteriaForServices().clear();
				return;
			case ContentfwkPackage.MEASURE__DECOMPOSES_MEASURE:
				setDecomposesMeasure((Measure)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES:
				return !getSetsPerformanceCriteriaForObjectives().isEmpty();
			case ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES:
				return !getSetsPerformanceCriteriaForServices().isEmpty();
			case ContentfwkPackage.MEASURE__DECOMPOSES_MEASURE:
				return basicGetDecomposesMeasure() != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureImpl
