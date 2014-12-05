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
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationArchitectureImpl extends ArchitectureImpl implements ApplicationArchitecture {
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
	@SuppressWarnings("unchecked")
	public EList<LogicalApplicationComponent> getLogicalApplicationComponents() {
		return (EList<LogicalApplicationComponent>)eDynamicGet(ContentfwkPackage.APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS, ContentfwkPackage.Literals.APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalApplicationComponent> getPhysicalApplicationComponents() {
		return (EList<PhysicalApplicationComponent>)eDynamicGet(ContentfwkPackage.APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS, ContentfwkPackage.Literals.APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InformationSystemService> getInformationSystemServices() {
		return (EList<InformationSystemService>)eDynamicGet(ContentfwkPackage.APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES, ContentfwkPackage.Literals.APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES, true, true);
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
				return !getLogicalApplicationComponents().isEmpty();
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS:
				return !getPhysicalApplicationComponents().isEmpty();
			case ContentfwkPackage.APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES:
				return !getInformationSystemServices().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationArchitectureImpl
