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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information System Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getDelegates <em>Delegates</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getIsDelegatedBy <em>Is Delegated By</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getSourceDescr <em>Source Descr</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getOwnerDescr <em>Owner Descr</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationSystemServiceImpl extends ServiceImpl implements InformationSystemService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationSystemServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> getDelegates() {
		return (EList<Element>)eGet(ContentfwkPackage.Literals.ELEMENT__DELEGATES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> getIsDelegatedBy() {
		return (EList<Element>)eGet(ContentfwkPackage.Literals.ELEMENT__IS_DELEGATED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ContentfwkPackage.Literals.ELEMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ContentfwkPackage.Literals.ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(ContentfwkPackage.Literals.ELEMENT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(ContentfwkPackage.Literals.ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return (String)eGet(ContentfwkPackage.Literals.ELEMENT__CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		eSet(ContentfwkPackage.Literals.ELEMENT__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDescr() {
		return (String)eGet(ContentfwkPackage.Literals.ELEMENT__SOURCE_DESCR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDescr(String newSourceDescr) {
		eSet(ContentfwkPackage.Literals.ELEMENT__SOURCE_DESCR, newSourceDescr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwnerDescr() {
		return (String)eGet(ContentfwkPackage.Literals.ELEMENT__OWNER_DESCR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerDescr(String newOwnerDescr) {
		eSet(ContentfwkPackage.Literals.ELEMENT__OWNER_DESCR, newOwnerDescr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eGet(ContentfwkPackage.Literals.ELEMENT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(ContentfwkPackage.Literals.ELEMENT__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAny() {
		return (EObject)eGet(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(EObject newAny) {
		eSet(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY, newAny);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
				case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES: return ContentfwkPackage.ELEMENT__DELEGATES;
				case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY: return ContentfwkPackage.ELEMENT__IS_DELEGATED_BY;
				case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME: return ContentfwkPackage.ELEMENT__NAME;
				case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION: return ContentfwkPackage.ELEMENT__DESCRIPTION;
				case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY: return ContentfwkPackage.ELEMENT__CATEGORY;
				case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR: return ContentfwkPackage.ELEMENT__SOURCE_DESCR;
				case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR: return ContentfwkPackage.ELEMENT__OWNER_DESCR;
				case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID: return ContentfwkPackage.ELEMENT__ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
				case ContentfwkPackage.ELEMENT__DELEGATES: return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES;
				case ContentfwkPackage.ELEMENT__IS_DELEGATED_BY: return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY;
				case ContentfwkPackage.ELEMENT__NAME: return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME;
				case ContentfwkPackage.ELEMENT__DESCRIPTION: return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION;
				case ContentfwkPackage.ELEMENT__CATEGORY: return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY;
				case ContentfwkPackage.ELEMENT__SOURCE_DESCR: return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR;
				case ContentfwkPackage.ELEMENT__OWNER_DESCR: return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR;
				case ContentfwkPackage.ELEMENT__ID: return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InformationSystemServiceImpl
