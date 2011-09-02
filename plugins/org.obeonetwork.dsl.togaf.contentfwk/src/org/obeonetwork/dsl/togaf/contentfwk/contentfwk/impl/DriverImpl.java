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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DriverImpl#getCreatesGoals <em>Creates Goals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DriverImpl#getMotivatesOrganizationUnits <em>Motivates Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DriverImpl#getDecomposesDriver <em>Decomposes Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DriverImpl extends ElementImpl implements Driver {
	/**
	 * The cached value of the '{@link #getCreatesGoals() <em>Creates Goals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatesGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> createsGoals;

	/**
	 * The cached value of the '{@link #getMotivatesOrganizationUnits() <em>Motivates Organization Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivatesOrganizationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationUnit> motivatesOrganizationUnits;

	/**
	 * The cached value of the '{@link #getDecomposesDriver() <em>Decomposes Driver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesDriver()
	 * @generated
	 * @ordered
	 */
	protected Driver decomposesDriver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getCreatesGoals() {
		if (createsGoals == null) {
			createsGoals = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this, ContentfwkPackage.DRIVER__CREATES_GOALS, ContentfwkPackage.GOAL__ADDRESSES_DRIVERS);
		}
		return createsGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationUnit> getMotivatesOrganizationUnits() {
		if (motivatesOrganizationUnits == null) {
			motivatesOrganizationUnits = new EObjectWithInverseResolvingEList.ManyInverse<OrganizationUnit>(OrganizationUnit.class, this, ContentfwkPackage.DRIVER__MOTIVATES_ORGANIZATION_UNITS, ContentfwkPackage.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS);
		}
		return motivatesOrganizationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver getDecomposesDriver() {
		if (decomposesDriver != null && decomposesDriver.eIsProxy()) {
			InternalEObject oldDecomposesDriver = (InternalEObject)decomposesDriver;
			decomposesDriver = (Driver)eResolveProxy(oldDecomposesDriver);
			if (decomposesDriver != oldDecomposesDriver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.DRIVER__DECOMPOSES_DRIVER, oldDecomposesDriver, decomposesDriver));
			}
		}
		return decomposesDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver basicGetDecomposesDriver() {
		return decomposesDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesDriver(Driver newDecomposesDriver) {
		Driver oldDecomposesDriver = decomposesDriver;
		decomposesDriver = newDecomposesDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.DRIVER__DECOMPOSES_DRIVER, oldDecomposesDriver, decomposesDriver));
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
			case ContentfwkPackage.DRIVER__CREATES_GOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCreatesGoals()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.DRIVER__MOTIVATES_ORGANIZATION_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMotivatesOrganizationUnits()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.DRIVER__CREATES_GOALS:
				return ((InternalEList<?>)getCreatesGoals()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.DRIVER__MOTIVATES_ORGANIZATION_UNITS:
				return ((InternalEList<?>)getMotivatesOrganizationUnits()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.DRIVER__CREATES_GOALS:
				return getCreatesGoals();
			case ContentfwkPackage.DRIVER__MOTIVATES_ORGANIZATION_UNITS:
				return getMotivatesOrganizationUnits();
			case ContentfwkPackage.DRIVER__DECOMPOSES_DRIVER:
				if (resolve) return getDecomposesDriver();
				return basicGetDecomposesDriver();
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
			case ContentfwkPackage.DRIVER__CREATES_GOALS:
				getCreatesGoals().clear();
				getCreatesGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ContentfwkPackage.DRIVER__MOTIVATES_ORGANIZATION_UNITS:
				getMotivatesOrganizationUnits().clear();
				getMotivatesOrganizationUnits().addAll((Collection<? extends OrganizationUnit>)newValue);
				return;
			case ContentfwkPackage.DRIVER__DECOMPOSES_DRIVER:
				setDecomposesDriver((Driver)newValue);
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
			case ContentfwkPackage.DRIVER__CREATES_GOALS:
				getCreatesGoals().clear();
				return;
			case ContentfwkPackage.DRIVER__MOTIVATES_ORGANIZATION_UNITS:
				getMotivatesOrganizationUnits().clear();
				return;
			case ContentfwkPackage.DRIVER__DECOMPOSES_DRIVER:
				setDecomposesDriver((Driver)null);
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
			case ContentfwkPackage.DRIVER__CREATES_GOALS:
				return createsGoals != null && !createsGoals.isEmpty();
			case ContentfwkPackage.DRIVER__MOTIVATES_ORGANIZATION_UNITS:
				return motivatesOrganizationUnits != null && !motivatesOrganizationUnits.isEmpty();
			case ContentfwkPackage.DRIVER__DECOMPOSES_DRIVER:
				return decomposesDriver != null;
		}
		return super.eIsSet(featureID);
	}

} //DriverImpl
