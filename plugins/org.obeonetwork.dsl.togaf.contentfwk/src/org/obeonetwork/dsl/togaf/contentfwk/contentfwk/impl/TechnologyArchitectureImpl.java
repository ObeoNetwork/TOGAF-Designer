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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyArchitectureImpl#getPlatformServices <em>Platform Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyArchitectureImpl#getPhysicalComponents <em>Physical Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyArchitectureImpl#getLogicalComponents <em>Logical Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologyArchitectureImpl extends ArchitectureImpl implements TechnologyArchitecture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.TECHNOLOGY_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PlatformService> getPlatformServices() {
		return (EList<PlatformService>)eDynamicGet(ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PLATFORM_SERVICES, ContentfwkPackage.Literals.TECHNOLOGY_ARCHITECTURE__PLATFORM_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalTechnologyComponent> getPhysicalComponents() {
		return (EList<PhysicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PHYSICAL_COMPONENTS, ContentfwkPackage.Literals.TECHNOLOGY_ARCHITECTURE__PHYSICAL_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalTechnologyComponent> getLogicalComponents() {
		return (EList<LogicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__LOGICAL_COMPONENTS, ContentfwkPackage.Literals.TECHNOLOGY_ARCHITECTURE__LOGICAL_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PLATFORM_SERVICES:
				return ((InternalEList<?>)getPlatformServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PHYSICAL_COMPONENTS:
				return ((InternalEList<?>)getPhysicalComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__LOGICAL_COMPONENTS:
				return ((InternalEList<?>)getLogicalComponents()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PLATFORM_SERVICES:
				return getPlatformServices();
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PHYSICAL_COMPONENTS:
				return getPhysicalComponents();
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__LOGICAL_COMPONENTS:
				return getLogicalComponents();
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
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PLATFORM_SERVICES:
				getPlatformServices().clear();
				getPlatformServices().addAll((Collection<? extends PlatformService>)newValue);
				return;
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PHYSICAL_COMPONENTS:
				getPhysicalComponents().clear();
				getPhysicalComponents().addAll((Collection<? extends PhysicalTechnologyComponent>)newValue);
				return;
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__LOGICAL_COMPONENTS:
				getLogicalComponents().clear();
				getLogicalComponents().addAll((Collection<? extends LogicalTechnologyComponent>)newValue);
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
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PLATFORM_SERVICES:
				getPlatformServices().clear();
				return;
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PHYSICAL_COMPONENTS:
				getPhysicalComponents().clear();
				return;
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__LOGICAL_COMPONENTS:
				getLogicalComponents().clear();
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
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PLATFORM_SERVICES:
				return !getPlatformServices().isEmpty();
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__PHYSICAL_COMPONENTS:
				return !getPhysicalComponents().isEmpty();
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE__LOGICAL_COMPONENTS:
				return !getLogicalComponents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TechnologyArchitectureImpl
