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
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl#getDelegates <em>Delegates</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl#getIsDelegatedBy <em>Is Delegated By</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl#getSourceDescr <em>Source Descr</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl#getOwnerDescr <em>Owner Descr</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends CDOObjectImpl implements Element {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSourceDescr() <em>Source Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DESCR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getOwnerDescr() <em>Owner Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_DESCR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.ELEMENT;
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
	public EList<Element> getDelegates() {
		return (EList<Element>)eDynamicGet(ContentfwkPackage.ELEMENT__DELEGATES, ContentfwkPackage.Literals.ELEMENT__DELEGATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> getIsDelegatedBy() {
		return (EList<Element>)eDynamicGet(ContentfwkPackage.ELEMENT__IS_DELEGATED_BY, ContentfwkPackage.Literals.ELEMENT__IS_DELEGATED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(ContentfwkPackage.ELEMENT__NAME, ContentfwkPackage.Literals.ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ContentfwkPackage.ELEMENT__NAME, ContentfwkPackage.Literals.ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(ContentfwkPackage.ELEMENT__DESCRIPTION, ContentfwkPackage.Literals.ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(ContentfwkPackage.ELEMENT__DESCRIPTION, ContentfwkPackage.Literals.ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public String getCategory() {
		return (String)eDynamicGet(ContentfwkPackage.ELEMENT__CATEGORY, ContentfwkPackage.Literals.ELEMENT__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		eDynamicSet(ContentfwkPackage.ELEMENT__CATEGORY, ContentfwkPackage.Literals.ELEMENT__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDescr() {
		return (String)eDynamicGet(ContentfwkPackage.ELEMENT__SOURCE_DESCR, ContentfwkPackage.Literals.ELEMENT__SOURCE_DESCR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDescr(String newSourceDescr) {
		eDynamicSet(ContentfwkPackage.ELEMENT__SOURCE_DESCR, ContentfwkPackage.Literals.ELEMENT__SOURCE_DESCR, newSourceDescr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwnerDescr() {
		return (String)eDynamicGet(ContentfwkPackage.ELEMENT__OWNER_DESCR, ContentfwkPackage.Literals.ELEMENT__OWNER_DESCR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerDescr(String newOwnerDescr) {
		eDynamicSet(ContentfwkPackage.ELEMENT__OWNER_DESCR, ContentfwkPackage.Literals.ELEMENT__OWNER_DESCR, newOwnerDescr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eDynamicGet(ContentfwkPackage.ELEMENT__ID, ContentfwkPackage.Literals.ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eDynamicSet(ContentfwkPackage.ELEMENT__ID, ContentfwkPackage.Literals.ELEMENT__ID, newID);
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
			case ContentfwkPackage.ELEMENT__DELEGATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegates()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ELEMENT__IS_DELEGATED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDelegatedBy()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.ELEMENT__DELEGATES:
				return ((InternalEList<?>)getDelegates()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ELEMENT__IS_DELEGATED_BY:
				return ((InternalEList<?>)getIsDelegatedBy()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.ELEMENT__DELEGATES:
				return getDelegates();
			case ContentfwkPackage.ELEMENT__IS_DELEGATED_BY:
				return getIsDelegatedBy();
			case ContentfwkPackage.ELEMENT__NAME:
				return getName();
			case ContentfwkPackage.ELEMENT__DESCRIPTION:
				return getDescription();
			case ContentfwkPackage.ELEMENT__SOURCE_DESCR:
				return getSourceDescr();
			case ContentfwkPackage.ELEMENT__OWNER_DESCR:
				return getOwnerDescr();
			case ContentfwkPackage.ELEMENT__ID:
				return getID();
			case ContentfwkPackage.ELEMENT__CATEGORY:
				return getCategory();
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
			case ContentfwkPackage.ELEMENT__DELEGATES:
				getDelegates().clear();
				getDelegates().addAll((Collection<? extends Element>)newValue);
				return;
			case ContentfwkPackage.ELEMENT__IS_DELEGATED_BY:
				getIsDelegatedBy().clear();
				getIsDelegatedBy().addAll((Collection<? extends Element>)newValue);
				return;
			case ContentfwkPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ContentfwkPackage.ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContentfwkPackage.ELEMENT__SOURCE_DESCR:
				setSourceDescr((String)newValue);
				return;
			case ContentfwkPackage.ELEMENT__OWNER_DESCR:
				setOwnerDescr((String)newValue);
				return;
			case ContentfwkPackage.ELEMENT__ID:
				setID((String)newValue);
				return;
			case ContentfwkPackage.ELEMENT__CATEGORY:
				setCategory((String)newValue);
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
			case ContentfwkPackage.ELEMENT__DELEGATES:
				getDelegates().clear();
				return;
			case ContentfwkPackage.ELEMENT__IS_DELEGATED_BY:
				getIsDelegatedBy().clear();
				return;
			case ContentfwkPackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContentfwkPackage.ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContentfwkPackage.ELEMENT__SOURCE_DESCR:
				setSourceDescr(SOURCE_DESCR_EDEFAULT);
				return;
			case ContentfwkPackage.ELEMENT__OWNER_DESCR:
				setOwnerDescr(OWNER_DESCR_EDEFAULT);
				return;
			case ContentfwkPackage.ELEMENT__ID:
				setID(ID_EDEFAULT);
				return;
			case ContentfwkPackage.ELEMENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
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
			case ContentfwkPackage.ELEMENT__DELEGATES:
				return !getDelegates().isEmpty();
			case ContentfwkPackage.ELEMENT__IS_DELEGATED_BY:
				return !getIsDelegatedBy().isEmpty();
			case ContentfwkPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ContentfwkPackage.ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ContentfwkPackage.ELEMENT__SOURCE_DESCR:
				return SOURCE_DESCR_EDEFAULT == null ? getSourceDescr() != null : !SOURCE_DESCR_EDEFAULT.equals(getSourceDescr());
			case ContentfwkPackage.ELEMENT__OWNER_DESCR:
				return OWNER_DESCR_EDEFAULT == null ? getOwnerDescr() != null : !OWNER_DESCR_EDEFAULT.equals(getOwnerDescr());
			case ContentfwkPackage.ELEMENT__ID:
				return ID_EDEFAULT == null ? getID() != null : !ID_EDEFAULT.equals(getID());
			case ContentfwkPackage.ELEMENT__CATEGORY:
				return CATEGORY_EDEFAULT == null ? getCategory() != null : !CATEGORY_EDEFAULT.equals(getCategory());
		}
		return super.eIsSet(featureID);
	}

} //ElementImpl
