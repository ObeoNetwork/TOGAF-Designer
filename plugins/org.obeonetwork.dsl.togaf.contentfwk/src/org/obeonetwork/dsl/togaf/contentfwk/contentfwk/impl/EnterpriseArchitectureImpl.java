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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Architecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Container;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Label;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl#getArchitectures <em>Architectures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnterpriseArchitectureImpl extends CDOObjectImpl implements EnterpriseArchitecture {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Architecture> getArchitectures() {
		return (EList<Architecture>)eDynamicGet(ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES, ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ARCHITECTURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Container> getContainers() {
		return (EList<Container>)eDynamicGet(ContentfwkPackage.ENTERPRISE_ARCHITECTURE__CONTAINERS, ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__CONTAINERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Label> getLabels() {
		return (EList<Label>)eDynamicGet(ContentfwkPackage.ENTERPRISE_ARCHITECTURE__LABELS, ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__LABELS, true, true);
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
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__LABELS:
				return getLabels();
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
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
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
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__LABELS:
				getLabels().clear();
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
				return !getArchitectures().isEmpty();
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__CONTAINERS:
				return !getContainers().isEmpty();
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__LABELS:
				return !getLabels().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnterpriseArchitectureImpl
