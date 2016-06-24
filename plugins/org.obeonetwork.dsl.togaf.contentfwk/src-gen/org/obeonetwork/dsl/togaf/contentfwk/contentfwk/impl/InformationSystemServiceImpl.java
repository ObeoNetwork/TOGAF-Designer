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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkPreferences;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkPreferences.ElementIdInitializationPolicy;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.IdUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Information System Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getDelegates
 * <em>Delegates</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getIsDelegatedBy
 * <em>Is Delegated By</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getSourceDescr
 * <em>Source Descr</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getOwnerDescr
 * <em>Owner Descr</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getID
 * <em>ID</em>}</li>
 * <li>
 * {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl#getCategory
 * <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationSystemServiceImpl extends ServiceImpl implements InformationSystemService {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSourceDescr() <em>Source Descr</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSourceDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DESCR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOwnerDescr() <em>Owner Descr</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOwnerDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_DESCR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected InformationSystemServiceImpl() {
		super();
		if (ContentfwkPreferences.getElementIdInitializationPolicy() == ElementIdInitializationPolicy.CREATION_TIME) {
			forceID(IdUtil.generateId());
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> getDelegates() {
		return (EList<Element>) eDynamicGet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES,
				ContentfwkPackage.Literals.ELEMENT__DELEGATES, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> getIsDelegatedBy() {
		return (EList<Element>) eDynamicGet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY,
				ContentfwkPackage.Literals.ELEMENT__IS_DELEGATED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return (String) eDynamicGet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME,
				ContentfwkPackage.Literals.ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME, ContentfwkPackage.Literals.ELEMENT__NAME,
				newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return (String) eDynamicGet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION,
				ContentfwkPackage.Literals.ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION,
				ContentfwkPackage.Literals.ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public String getCategory() {
		return (String) eDynamicGet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY,
				ContentfwkPackage.Literals.ELEMENT__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCategory(String newCategory) {
		eDynamicSet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY,
				ContentfwkPackage.Literals.ELEMENT__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#forceID(String)
	 *      <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void forceID(String newID) {
		eDynamicSet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID, ContentfwkPackage.Literals.ELEMENT__ID, newID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSourceDescr() {
		return (String) eDynamicGet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR,
				ContentfwkPackage.Literals.ELEMENT__SOURCE_DESCR, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceDescr(String newSourceDescr) {
		eDynamicSet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR,
				ContentfwkPackage.Literals.ELEMENT__SOURCE_DESCR, newSourceDescr);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getOwnerDescr() {
		return (String) eDynamicGet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR,
				ContentfwkPackage.Literals.ELEMENT__OWNER_DESCR, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOwnerDescr(String newOwnerDescr) {
		eDynamicSet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR,
				ContentfwkPackage.Literals.ELEMENT__OWNER_DESCR, newOwnerDescr);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getID() {
		return (String) eDynamicGet(ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID,
				ContentfwkPackage.Literals.ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setID(String newID) {
		Resource eResource = eResource();
		String oldID = getID();
		if (IdUtil.canIdBeSet(eResource, newID, cdoID())) {
			forceID(newID);
			IdUtil.updateResourceIds(eResource, oldID, newID);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDelegates()).basicAdd(otherEnd, msgs);
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsDelegatedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
			return ((InternalEList<?>) getDelegates()).basicRemove(otherEnd, msgs);
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
			return ((InternalEList<?>) getIsDelegatedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR:
			return getSourceDescr();
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR:
			return getOwnerDescr();
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID:
			return getID();
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY:
			return getCategory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
			getDelegates().clear();
			getDelegates().addAll((Collection<? extends Element>) newValue);
			return;
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
			getIsDelegatedBy().clear();
			getIsDelegatedBy().addAll((Collection<? extends Element>) newValue);
			return;
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME:
			setName((String) newValue);
			return;
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR:
			setSourceDescr((String) newValue);
			return;
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR:
			setOwnerDescr((String) newValue);
			return;
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID:
			setID((String) newValue);
			return;
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY:
			setCategory((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR:
			setSourceDescr(SOURCE_DESCR_EDEFAULT);
			return;
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR:
			setOwnerDescr(OWNER_DESCR_EDEFAULT);
			return;
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID:
			setID(ID_EDEFAULT);
			return;
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
			return !getDelegates().isEmpty();
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
			return !getIsDelegatedBy().isEmpty();
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? getDescription() != null
					: !DESCRIPTION_EDEFAULT.equals(getDescription());
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR:
			return SOURCE_DESCR_EDEFAULT == null ? getSourceDescr() != null
					: !SOURCE_DESCR_EDEFAULT.equals(getSourceDescr());
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR:
			return OWNER_DESCR_EDEFAULT == null ? getOwnerDescr() != null
					: !OWNER_DESCR_EDEFAULT.equals(getOwnerDescr());
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID:
			return ID_EDEFAULT == null ? getID() != null : !ID_EDEFAULT.equals(getID());
		case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY:
			return CATEGORY_EDEFAULT == null ? getCategory() != null : !CATEGORY_EDEFAULT.equals(getCategory());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES:
				return ContentfwkPackage.ELEMENT__DELEGATES;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY:
				return ContentfwkPackage.ELEMENT__IS_DELEGATED_BY;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME:
				return ContentfwkPackage.ELEMENT__NAME;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION:
				return ContentfwkPackage.ELEMENT__DESCRIPTION;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR:
				return ContentfwkPackage.ELEMENT__SOURCE_DESCR;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR:
				return ContentfwkPackage.ELEMENT__OWNER_DESCR;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID:
				return ContentfwkPackage.ELEMENT__ID;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY:
				return ContentfwkPackage.ELEMENT__CATEGORY;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
			case ContentfwkPackage.ELEMENT__DELEGATES:
				return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DELEGATES;
			case ContentfwkPackage.ELEMENT__IS_DELEGATED_BY:
				return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY;
			case ContentfwkPackage.ELEMENT__NAME:
				return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME;
			case ContentfwkPackage.ELEMENT__DESCRIPTION:
				return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION;
			case ContentfwkPackage.ELEMENT__SOURCE_DESCR:
				return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR;
			case ContentfwkPackage.ELEMENT__OWNER_DESCR:
				return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR;
			case ContentfwkPackage.ELEMENT__ID:
				return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID;
			case ContentfwkPackage.ELEMENT__CATEGORY:
				return ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // InformationSystemServiceImpl
