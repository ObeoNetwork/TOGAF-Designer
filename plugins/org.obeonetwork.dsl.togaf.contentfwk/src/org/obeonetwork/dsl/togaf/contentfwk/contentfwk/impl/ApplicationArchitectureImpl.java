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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationArchitectureImpl#getLogicalApplicationComponents <em>Logical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationArchitectureImpl#getPhysicalApplicationComponents <em>Physical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationArchitectureImpl#getInformationSystemServices <em>Information System Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationArchitectureImpl#getAnyRef <em>Any Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationArchitectureImpl extends ArchitectureImpl implements ApplicationArchitecture {
	/**
	 * The cached value of the '{@link #getLogicalApplicationComponents() <em>Logical Application Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalApplicationComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalApplicationComponent> logicalApplicationComponents;

	/**
	 * The cached value of the '{@link #getPhysicalApplicationComponents() <em>Physical Application Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalApplicationComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalApplicationComponent> physicalApplicationComponents;

	/**
	 * The cached value of the '{@link #getInformationSystemServices() <em>Information System Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSystemServices()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationSystemService> informationSystemServices;

	/**
	 * The cached value of the '{@link #getAnyRef() <em>Any Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> anyRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.APPLICATION_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalApplicationComponent> getLogicalApplicationComponents() {
		if (logicalApplicationComponents == null) {
			logicalApplicationComponents = new EObjectContainmentEList<LogicalApplicationComponent>(LogicalApplicationComponent.class, this, ContentfwkPackage.APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS);
		}
		return logicalApplicationComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalApplicationComponent> getPhysicalApplicationComponents() {
		if (physicalApplicationComponents == null) {
			physicalApplicationComponents = new EObjectContainmentEList<PhysicalApplicationComponent>(PhysicalApplicationComponent.class, this, ContentfwkPackage.APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS);
		}
		return physicalApplicationComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationSystemService> getInformationSystemServices() {
		if (informationSystemServices == null) {
			informationSystemServices = new EObjectContainmentEList<InformationSystemService>(InformationSystemService.class, this, ContentfwkPackage.APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES);
		}
		return informationSystemServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAnyRef() {
		if (anyRef == null) {
			anyRef = new EObjectContainmentEList<EObject>(EObject.class, this, ContentfwkPackage.APPLICATION_ARCHITECTURE__ANY_REF);
		}
		return anyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<?>)getLogicalApplicationComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<?>)getPhysicalApplicationComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES:
				return ((InternalEList<?>)getInformationSystemServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__ANY_REF:
				return ((InternalEList<?>)getAnyRef()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS:
				return getLogicalApplicationComponents();
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS:
				return getPhysicalApplicationComponents();
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES:
				return getInformationSystemServices();
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__ANY_REF:
				return getAnyRef();
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
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS:
				getLogicalApplicationComponents().clear();
				getLogicalApplicationComponents().addAll((Collection<? extends LogicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS:
				getPhysicalApplicationComponents().clear();
				getPhysicalApplicationComponents().addAll((Collection<? extends PhysicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES:
				getInformationSystemServices().clear();
				getInformationSystemServices().addAll((Collection<? extends InformationSystemService>)newValue);
				return;
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__ANY_REF:
				getAnyRef().clear();
				getAnyRef().addAll((Collection<? extends EObject>)newValue);
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
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS:
				getLogicalApplicationComponents().clear();
				return;
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS:
				getPhysicalApplicationComponents().clear();
				return;
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES:
				getInformationSystemServices().clear();
				return;
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__ANY_REF:
				getAnyRef().clear();
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
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS:
				return logicalApplicationComponents != null && !logicalApplicationComponents.isEmpty();
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS:
				return physicalApplicationComponents != null && !physicalApplicationComponents.isEmpty();
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES:
				return informationSystemServices != null && !informationSystemServices.isEmpty();
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__ANY_REF:
				return anyRef != null && !anyRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationArchitectureImpl
