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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Architecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Container;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl#getArchitectures <em>Architectures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnterpriseArchitectureImpl extends EObjectImpl implements EnterpriseArchitecture {
	/**
	 * The cached value of the '{@link #getArchitectures() <em>Architectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<Architecture> architectures;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<Container> containers;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Architecture> getArchitectures() {
		if (architectures == null) {
			architectures = new EObjectContainmentEList<Architecture>(Architecture.class, this, ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES);
		}
		return architectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Container> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<Container>(Container.class, this, ContentfwkPackage.ENTERPRISE_ARCHITECTURE__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAny() {
		if (any == null) {
			any = new EObjectContainmentEList<EObject>(EObject.class, this, ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
				return ((InternalEList<?>)getArchitectures()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
				return getArchitectures();
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__CONTAINERS:
				return getContainers();
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ANY:
				return getAny();
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
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
				getArchitectures().clear();
				getArchitectures().addAll((Collection<? extends Architecture>)newValue);
				return;
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends Container>)newValue);
				return;
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends EObject>)newValue);
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
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
				getArchitectures().clear();
				return;
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__CONTAINERS:
				getContainers().clear();
				return;
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ANY:
				getAny().clear();
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
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
				return architectures != null && !architectures.isEmpty();
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ANY:
				return any != null && !any.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnterpriseArchitectureImpl
