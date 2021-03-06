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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceQualityImpl#getAppliesToServices <em>Applies To Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceQualityImpl#getAppliesToContracts <em>Applies To Contracts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceQualityImpl extends ElementImpl implements ServiceQuality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceQualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.SERVICE_QUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getAppliesToServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_SERVICES, ContentfwkPackage.Literals.SERVICE_QUALITY__APPLIES_TO_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contract> getAppliesToContracts() {
		return (EList<Contract>)eDynamicGet(ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_CONTRACTS, ContentfwkPackage.Literals.SERVICE_QUALITY__APPLIES_TO_CONTRACTS, true, true);
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
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppliesToServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_CONTRACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppliesToContracts()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_SERVICES:
				return ((InternalEList<?>)getAppliesToServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_CONTRACTS:
				return ((InternalEList<?>)getAppliesToContracts()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_SERVICES:
				return getAppliesToServices();
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_CONTRACTS:
				return getAppliesToContracts();
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
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_SERVICES:
				getAppliesToServices().clear();
				getAppliesToServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_CONTRACTS:
				getAppliesToContracts().clear();
				getAppliesToContracts().addAll((Collection<? extends Contract>)newValue);
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
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_SERVICES:
				getAppliesToServices().clear();
				return;
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_CONTRACTS:
				getAppliesToContracts().clear();
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
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_SERVICES:
				return !getAppliesToServices().isEmpty();
			case ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_CONTRACTS:
				return !getAppliesToContracts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceQualityImpl
