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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
	@SuppressWarnings("unchecked")
	public EList<Goal> getCreatesGoals() {
		return (EList<Goal>)eDynamicGet(ContentfwkPackage.DRIVER__CREATES_GOALS, ContentfwkPackage.Literals.DRIVER__CREATES_GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationUnit> getMotivatesOrganizationUnits() {
		return (EList<OrganizationUnit>)eDynamicGet(ContentfwkPackage.DRIVER__MOTIVATES_ORGANIZATION_UNITS, ContentfwkPackage.Literals.DRIVER__MOTIVATES_ORGANIZATION_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver getDecomposesDriver() {
		return (Driver)eDynamicGet(ContentfwkPackage.DRIVER__DECOMPOSES_DRIVER, ContentfwkPackage.Literals.DRIVER__DECOMPOSES_DRIVER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver basicGetDecomposesDriver() {
		return (Driver)eDynamicGet(ContentfwkPackage.DRIVER__DECOMPOSES_DRIVER, ContentfwkPackage.Literals.DRIVER__DECOMPOSES_DRIVER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesDriver(Driver newDecomposesDriver) {
		eDynamicSet(ContentfwkPackage.DRIVER__DECOMPOSES_DRIVER, ContentfwkPackage.Literals.DRIVER__DECOMPOSES_DRIVER, newDecomposesDriver);
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
				return !getCreatesGoals().isEmpty();
			case ContentfwkPackage.DRIVER__MOTIVATES_ORGANIZATION_UNITS:
				return !getMotivatesOrganizationUnits().isEmpty();
			case ContentfwkPackage.DRIVER__DECOMPOSES_DRIVER:
				return basicGetDecomposesDriver() != null;
		}
		return super.eIsSet(featureID);
	}

} //DriverImpl
