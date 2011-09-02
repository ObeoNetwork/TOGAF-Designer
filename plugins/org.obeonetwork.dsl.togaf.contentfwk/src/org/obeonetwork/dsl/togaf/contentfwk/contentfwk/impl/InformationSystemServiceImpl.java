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
	 * The cached value of the '{@link #getDelegates() <em>Delegates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegates()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> delegates;

	/**
	 * The cached value of the '{@link #getIsDelegatedBy() <em>Is Delegated By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDelegatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> isDelegatedBy;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

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
	 * The cached value of the '{@link #getSourceDescr() <em>Source Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDescr()
	 * @generated
	 * @ordered
	 */
	protected String sourceDescr = SOURCE_DESCR_EDEFAULT;

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
	 * The cached value of the '{@link #getOwnerDescr() <em>Owner Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerDescr()
	 * @generated
	 * @ordered
	 */
	protected String ownerDescr = OWNER_DESCR_EDEFAULT;

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
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected EObject any;

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
	public EList<Element> getDelegates() {
		if (delegates == null) {
			delegates = new EObjectWithInverseResolvingEList.ManyInverse<Element>(Element.class, this, ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES, ContentfwkPackage.ELEMENT__IS_DELEGATED_BY);
		}
		return delegates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getIsDelegatedBy() {
		if (isDelegatedBy == null) {
			isDelegatedBy = new EObjectWithInverseResolvingEList.ManyInverse<Element>(Element.class, this, ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY, ContentfwkPackage.ELEMENT__DELEGATES);
		}
		return isDelegatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDescr() {
		return sourceDescr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDescr(String newSourceDescr) {
		String oldSourceDescr = sourceDescr;
		sourceDescr = newSourceDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR, oldSourceDescr, sourceDescr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwnerDescr() {
		return ownerDescr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerDescr(String newOwnerDescr) {
		String oldOwnerDescr = ownerDescr;
		ownerDescr = newOwnerDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR, oldOwnerDescr, ownerDescr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAny() {
		if (any != null && any.eIsProxy()) {
			InternalEObject oldAny = (InternalEObject)any;
			any = eResolveProxy(oldAny);
			if (any != oldAny) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ANY, oldAny, any));
			}
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetAny() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(EObject newAny) {
		EObject oldAny = any;
		any = newAny;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ANY, oldAny, any));
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
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegates()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
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
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
				return ((InternalEList<?>)getDelegates()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
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
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
				return getDelegates();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
				return getIsDelegatedBy();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME:
				return getName();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION:
				return getDescription();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY:
				return getCategory();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR:
				return getSourceDescr();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR:
				return getOwnerDescr();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID:
				return getID();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ANY:
				if (resolve) return getAny();
				return basicGetAny();
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
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
				getDelegates().clear();
				getDelegates().addAll((Collection<? extends Element>)newValue);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
				getIsDelegatedBy().clear();
				getIsDelegatedBy().addAll((Collection<? extends Element>)newValue);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME:
				setName((String)newValue);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY:
				setCategory((String)newValue);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR:
				setSourceDescr((String)newValue);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR:
				setOwnerDescr((String)newValue);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID:
				setID((String)newValue);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ANY:
				setAny((EObject)newValue);
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
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
				getDelegates().clear();
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
				getIsDelegatedBy().clear();
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR:
				setSourceDescr(SOURCE_DESCR_EDEFAULT);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR:
				setOwnerDescr(OWNER_DESCR_EDEFAULT);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID:
				setID(ID_EDEFAULT);
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ANY:
				setAny((EObject)null);
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
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
				return delegates != null && !delegates.isEmpty();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
				return isDelegatedBy != null && !isDelegatedBy.isEmpty();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR:
				return SOURCE_DESCR_EDEFAULT == null ? sourceDescr != null : !SOURCE_DESCR_EDEFAULT.equals(sourceDescr);
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR:
				return OWNER_DESCR_EDEFAULT == null ? ownerDescr != null : !OWNER_DESCR_EDEFAULT.equals(ownerDescr);
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ANY:
				return any != null;
		}
		return super.eIsSet(featureID);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", category: ");
		result.append(category);
		result.append(", sourceDescr: ");
		result.append(sourceDescr);
		result.append(", ownerDescr: ");
		result.append(ownerDescr);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //InformationSystemServiceImpl
