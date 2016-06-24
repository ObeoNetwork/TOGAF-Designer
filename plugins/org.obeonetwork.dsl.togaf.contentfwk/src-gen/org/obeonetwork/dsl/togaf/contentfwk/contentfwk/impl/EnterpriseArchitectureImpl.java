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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Architecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkPreferences;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkPreferences.ElementIdInitializationPolicy;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.IdUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Enterprise Architecture</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl#getArchitectures
 * <em>Architectures</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl#getID
 * <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnterpriseArchitectureImpl extends CDOObjectImpl implements EnterpriseArchitecture {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected EnterpriseArchitectureImpl() {
		super();
		if (ContentfwkPreferences.getElementIdInitializationPolicy() == ElementIdInitializationPolicy.CREATION_TIME) {
			forceID(IdUtil.generateId());
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Architecture> getArchitectures() {
		return (EList<Architecture>) eDynamicGet(ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES,
				ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ARCHITECTURES, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getID() {
		return (String) eDynamicGet(ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ID,
				ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setID(String newID) {
		Resource eResource = eResource();
		String oldID = getID();
		if (IdUtil.canIdBeSet(eResource, newID, cdoID())) {
			forceID(newID);
			IdUtil.updateResourceIds(eResource, oldID, newID);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void forceID(String newID) {
		eDynamicSet(ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ID,
				ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ID, newID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
			return ((InternalEList<?>) getArchitectures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
			return getArchitectures();
		case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ID:
			return getID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
			getArchitectures().clear();
			getArchitectures().addAll((Collection<? extends Architecture>) newValue);
			return;
		case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ID:
			setID((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
			getArchitectures().clear();
			return;
		case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ID:
			setID(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
			return !getArchitectures().isEmpty();
		case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ID:
			return ID_EDEFAULT == null ? getID() != null : !ID_EDEFAULT.equals(getID());
		}
		return super.eIsSet(featureID);
	}

} // EnterpriseArchitectureImpl
