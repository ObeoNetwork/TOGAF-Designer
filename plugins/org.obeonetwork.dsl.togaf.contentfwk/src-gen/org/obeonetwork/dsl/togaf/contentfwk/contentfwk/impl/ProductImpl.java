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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProductImpl#getIsProducedByOrganizationUnits <em>Is Produced By Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProductImpl#getIsProducedByProcesses <em>Is Produced By Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends ElementImpl implements Product {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationUnit> getIsProducedByOrganizationUnits() {
		return (EList<OrganizationUnit>)eDynamicGet(ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS, ContentfwkPackage.Literals.PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsProducedByProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_PROCESSES, ContentfwkPackage.Literals.PRODUCT__IS_PRODUCED_BY_PROCESSES, true, true);
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
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsProducedByOrganizationUnits()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsProducedByProcesses()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS:
				return ((InternalEList<?>)getIsProducedByOrganizationUnits()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_PROCESSES:
				return ((InternalEList<?>)getIsProducedByProcesses()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS:
				return getIsProducedByOrganizationUnits();
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_PROCESSES:
				return getIsProducedByProcesses();
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
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS:
				getIsProducedByOrganizationUnits().clear();
				getIsProducedByOrganizationUnits().addAll((Collection<? extends OrganizationUnit>)newValue);
				return;
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_PROCESSES:
				getIsProducedByProcesses().clear();
				getIsProducedByProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
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
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS:
				getIsProducedByOrganizationUnits().clear();
				return;
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_PROCESSES:
				getIsProducedByProcesses().clear();
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
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS:
				return !getIsProducedByOrganizationUnits().isEmpty();
			case ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_PROCESSES:
				return !getIsProducedByProcesses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl
