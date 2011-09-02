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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GoalImpl#getAddressesDrivers <em>Addresses Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GoalImpl#getIsRealizedThroughObjectives <em>Is Realized Through Objectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GoalImpl#getDecomposesGoal <em>Decomposes Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends ElementImpl implements Goal {
	/**
	 * The cached value of the '{@link #getAddressesDrivers() <em>Addresses Drivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressesDrivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Driver> addressesDrivers;

	/**
	 * The cached value of the '{@link #getIsRealizedThroughObjectives() <em>Is Realized Through Objectives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRealizedThroughObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> isRealizedThroughObjectives;

	/**
	 * The cached value of the '{@link #getDecomposesGoal() <em>Decomposes Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal decomposesGoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Driver> getAddressesDrivers() {
		if (addressesDrivers == null) {
			addressesDrivers = new EObjectWithInverseResolvingEList.ManyInverse<Driver>(Driver.class, this, ContentfwkPackage.GOAL__ADDRESSES_DRIVERS, ContentfwkPackage.DRIVER__CREATES_GOALS);
		}
		return addressesDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getIsRealizedThroughObjectives() {
		if (isRealizedThroughObjectives == null) {
			isRealizedThroughObjectives = new EObjectWithInverseResolvingEList.ManyInverse<Objective>(Objective.class, this, ContentfwkPackage.GOAL__IS_REALIZED_THROUGH_OBJECTIVES, ContentfwkPackage.OBJECTIVE__REALIZES_GOALS);
		}
		return isRealizedThroughObjectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getDecomposesGoal() {
		if (decomposesGoal != null && decomposesGoal.eIsProxy()) {
			InternalEObject oldDecomposesGoal = (InternalEObject)decomposesGoal;
			decomposesGoal = (Goal)eResolveProxy(oldDecomposesGoal);
			if (decomposesGoal != oldDecomposesGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.GOAL__DECOMPOSES_GOAL, oldDecomposesGoal, decomposesGoal));
			}
		}
		return decomposesGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetDecomposesGoal() {
		return decomposesGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesGoal(Goal newDecomposesGoal) {
		Goal oldDecomposesGoal = decomposesGoal;
		decomposesGoal = newDecomposesGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.GOAL__DECOMPOSES_GOAL, oldDecomposesGoal, decomposesGoal));
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
			case ContentfwkPackage.GOAL__ADDRESSES_DRIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAddressesDrivers()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.GOAL__IS_REALIZED_THROUGH_OBJECTIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRealizedThroughObjectives()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.GOAL__ADDRESSES_DRIVERS:
				return ((InternalEList<?>)getAddressesDrivers()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.GOAL__IS_REALIZED_THROUGH_OBJECTIVES:
				return ((InternalEList<?>)getIsRealizedThroughObjectives()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.GOAL__ADDRESSES_DRIVERS:
				return getAddressesDrivers();
			case ContentfwkPackage.GOAL__IS_REALIZED_THROUGH_OBJECTIVES:
				return getIsRealizedThroughObjectives();
			case ContentfwkPackage.GOAL__DECOMPOSES_GOAL:
				if (resolve) return getDecomposesGoal();
				return basicGetDecomposesGoal();
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
			case ContentfwkPackage.GOAL__ADDRESSES_DRIVERS:
				getAddressesDrivers().clear();
				getAddressesDrivers().addAll((Collection<? extends Driver>)newValue);
				return;
			case ContentfwkPackage.GOAL__IS_REALIZED_THROUGH_OBJECTIVES:
				getIsRealizedThroughObjectives().clear();
				getIsRealizedThroughObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case ContentfwkPackage.GOAL__DECOMPOSES_GOAL:
				setDecomposesGoal((Goal)newValue);
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
			case ContentfwkPackage.GOAL__ADDRESSES_DRIVERS:
				getAddressesDrivers().clear();
				return;
			case ContentfwkPackage.GOAL__IS_REALIZED_THROUGH_OBJECTIVES:
				getIsRealizedThroughObjectives().clear();
				return;
			case ContentfwkPackage.GOAL__DECOMPOSES_GOAL:
				setDecomposesGoal((Goal)null);
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
			case ContentfwkPackage.GOAL__ADDRESSES_DRIVERS:
				return addressesDrivers != null && !addressesDrivers.isEmpty();
			case ContentfwkPackage.GOAL__IS_REALIZED_THROUGH_OBJECTIVES:
				return isRealizedThroughObjectives != null && !isRealizedThroughObjectives.isEmpty();
			case ContentfwkPackage.GOAL__DECOMPOSES_GOAL:
				return decomposesGoal != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
