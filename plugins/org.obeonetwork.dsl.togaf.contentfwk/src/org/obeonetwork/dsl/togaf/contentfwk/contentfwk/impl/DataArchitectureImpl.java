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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataArchitectureImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataArchitectureImpl#getLogicalComponents <em>Logical Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataArchitectureImpl#getPhysicalComponents <em>Physical Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataArchitectureImpl extends ArchitectureImpl implements DataArchitecture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.DATA_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getEntities() {
		return (EList<DataEntity>)eDynamicGet(ContentfwkPackage.DATA_ARCHITECTURE__ENTITIES, ContentfwkPackage.Literals.DATA_ARCHITECTURE__ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalDataComponent> getLogicalComponents() {
		return (EList<LogicalDataComponent>)eDynamicGet(ContentfwkPackage.DATA_ARCHITECTURE__LOGICAL_COMPONENTS, ContentfwkPackage.Literals.DATA_ARCHITECTURE__LOGICAL_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalDataComponent> getPhysicalComponents() {
		return (EList<PhysicalDataComponent>)eDynamicGet(ContentfwkPackage.DATA_ARCHITECTURE__PHYSICAL_COMPONENTS, ContentfwkPackage.Literals.DATA_ARCHITECTURE__PHYSICAL_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.DATA_ARCHITECTURE__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.DATA_ARCHITECTURE__LOGICAL_COMPONENTS:
				return ((InternalEList<?>)getLogicalComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.DATA_ARCHITECTURE__PHYSICAL_COMPONENTS:
				return ((InternalEList<?>)getPhysicalComponents()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.DATA_ARCHITECTURE__ENTITIES:
				return getEntities();
			case ContentfwkPackage.DATA_ARCHITECTURE__LOGICAL_COMPONENTS:
				return getLogicalComponents();
			case ContentfwkPackage.DATA_ARCHITECTURE__PHYSICAL_COMPONENTS:
				return getPhysicalComponents();
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
			case ContentfwkPackage.DATA_ARCHITECTURE__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends DataEntity>)newValue);
				return;
			case ContentfwkPackage.DATA_ARCHITECTURE__LOGICAL_COMPONENTS:
				getLogicalComponents().clear();
				getLogicalComponents().addAll((Collection<? extends LogicalDataComponent>)newValue);
				return;
			case ContentfwkPackage.DATA_ARCHITECTURE__PHYSICAL_COMPONENTS:
				getPhysicalComponents().clear();
				getPhysicalComponents().addAll((Collection<? extends PhysicalDataComponent>)newValue);
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
			case ContentfwkPackage.DATA_ARCHITECTURE__ENTITIES:
				getEntities().clear();
				return;
			case ContentfwkPackage.DATA_ARCHITECTURE__LOGICAL_COMPONENTS:
				getLogicalComponents().clear();
				return;
			case ContentfwkPackage.DATA_ARCHITECTURE__PHYSICAL_COMPONENTS:
				getPhysicalComponents().clear();
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
			case ContentfwkPackage.DATA_ARCHITECTURE__ENTITIES:
				return !getEntities().isEmpty();
			case ContentfwkPackage.DATA_ARCHITECTURE__LOGICAL_COMPONENTS:
				return !getLogicalComponents().isEmpty();
			case ContentfwkPackage.DATA_ARCHITECTURE__PHYSICAL_COMPONENTS:
				return !getPhysicalComponents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataArchitectureImpl
