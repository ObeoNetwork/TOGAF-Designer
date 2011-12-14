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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategic Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicArchitectureImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicArchitectureImpl#getStrategicElements <em>Strategic Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategicArchitectureImpl extends ArchitectureImpl implements StrategicArchitecture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategicArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.STRATEGIC_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Capability> getCapabilities() {
		return (EList<Capability>)eDynamicGet(ContentfwkPackage.STRATEGIC_ARCHITECTURE__CAPABILITIES, ContentfwkPackage.Literals.STRATEGIC_ARCHITECTURE__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StrategicElement> getStrategicElements() {
		return (EList<StrategicElement>)eDynamicGet(ContentfwkPackage.STRATEGIC_ARCHITECTURE__STRATEGIC_ELEMENTS, ContentfwkPackage.Literals.STRATEGIC_ARCHITECTURE__STRATEGIC_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE__STRATEGIC_ELEMENTS:
				return ((InternalEList<?>)getStrategicElements()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE__CAPABILITIES:
				return getCapabilities();
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE__STRATEGIC_ELEMENTS:
				return getStrategicElements();
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
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE__STRATEGIC_ELEMENTS:
				getStrategicElements().clear();
				getStrategicElements().addAll((Collection<? extends StrategicElement>)newValue);
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
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE__CAPABILITIES:
				getCapabilities().clear();
				return;
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE__STRATEGIC_ELEMENTS:
				getStrategicElements().clear();
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
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE__CAPABILITIES:
				return !getCapabilities().isEmpty();
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE__STRATEGIC_ELEMENTS:
				return !getStrategicElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StrategicArchitectureImpl
