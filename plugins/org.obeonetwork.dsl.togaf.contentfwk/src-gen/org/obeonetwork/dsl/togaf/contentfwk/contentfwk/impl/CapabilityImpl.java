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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.CapabilityImpl#getIsDeliveredBy <em>Is Delivered By</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.CapabilityImpl#getBusinessValue <em>Business Value</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.CapabilityImpl#getIncrements <em>Increments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityImpl extends ElementImpl implements Capability {
	/**
	 * The default value of the '{@link #getBusinessValue() <em>Business Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessValue()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_VALUE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIncrements() <em>Increments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrements()
	 * @generated
	 * @ordered
	 */
	protected static final String INCREMENTS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPackage getIsDeliveredBy() {
		return (WorkPackage)eDynamicGet(ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY, ContentfwkPackage.Literals.CAPABILITY__IS_DELIVERED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPackage basicGetIsDeliveredBy() {
		return (WorkPackage)eDynamicGet(ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY, ContentfwkPackage.Literals.CAPABILITY__IS_DELIVERED_BY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDeliveredBy(WorkPackage newIsDeliveredBy, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newIsDeliveredBy, ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeliveredBy(WorkPackage newIsDeliveredBy) {
		eDynamicSet(ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY, ContentfwkPackage.Literals.CAPABILITY__IS_DELIVERED_BY, newIsDeliveredBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessValue() {
		return (String)eDynamicGet(ContentfwkPackage.CAPABILITY__BUSINESS_VALUE, ContentfwkPackage.Literals.CAPABILITY__BUSINESS_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessValue(String newBusinessValue) {
		eDynamicSet(ContentfwkPackage.CAPABILITY__BUSINESS_VALUE, ContentfwkPackage.Literals.CAPABILITY__BUSINESS_VALUE, newBusinessValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncrements() {
		return (String)eDynamicGet(ContentfwkPackage.CAPABILITY__INCREMENTS, ContentfwkPackage.Literals.CAPABILITY__INCREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrements(String newIncrements) {
		eDynamicSet(ContentfwkPackage.CAPABILITY__INCREMENTS, ContentfwkPackage.Literals.CAPABILITY__INCREMENTS, newIncrements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY:
				WorkPackage isDeliveredBy = basicGetIsDeliveredBy();
				if (isDeliveredBy != null)
					msgs = ((InternalEObject)isDeliveredBy).eInverseRemove(this, ContentfwkPackage.WORK_PACKAGE__DELIVERS_CAPABILITIES, WorkPackage.class, msgs);
				return basicSetIsDeliveredBy((WorkPackage)otherEnd, msgs);
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
			case ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY:
				return basicSetIsDeliveredBy(null, msgs);
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
			case ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY:
				if (resolve) return getIsDeliveredBy();
				return basicGetIsDeliveredBy();
			case ContentfwkPackage.CAPABILITY__BUSINESS_VALUE:
				return getBusinessValue();
			case ContentfwkPackage.CAPABILITY__INCREMENTS:
				return getIncrements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY:
				setIsDeliveredBy((WorkPackage)newValue);
				return;
			case ContentfwkPackage.CAPABILITY__BUSINESS_VALUE:
				setBusinessValue((String)newValue);
				return;
			case ContentfwkPackage.CAPABILITY__INCREMENTS:
				setIncrements((String)newValue);
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
			case ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY:
				setIsDeliveredBy((WorkPackage)null);
				return;
			case ContentfwkPackage.CAPABILITY__BUSINESS_VALUE:
				setBusinessValue(BUSINESS_VALUE_EDEFAULT);
				return;
			case ContentfwkPackage.CAPABILITY__INCREMENTS:
				setIncrements(INCREMENTS_EDEFAULT);
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
			case ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY:
				return basicGetIsDeliveredBy() != null;
			case ContentfwkPackage.CAPABILITY__BUSINESS_VALUE:
				return BUSINESS_VALUE_EDEFAULT == null ? getBusinessValue() != null : !BUSINESS_VALUE_EDEFAULT.equals(getBusinessValue());
			case ContentfwkPackage.CAPABILITY__INCREMENTS:
				return INCREMENTS_EDEFAULT == null ? getIncrements() != null : !INCREMENTS_EDEFAULT.equals(getIncrements());
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
