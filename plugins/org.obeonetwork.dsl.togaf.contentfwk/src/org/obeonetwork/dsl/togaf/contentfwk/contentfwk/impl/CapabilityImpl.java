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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The cached value of the '{@link #getIsDeliveredBy() <em>Is Delivered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeliveredBy()
	 * @generated
	 * @ordered
	 */
	protected WorkPackage isDeliveredBy;

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
	 * The cached value of the '{@link #getBusinessValue() <em>Business Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessValue()
	 * @generated
	 * @ordered
	 */
	protected String businessValue = BUSINESS_VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getIncrements() <em>Increments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrements()
	 * @generated
	 * @ordered
	 */
	protected String increments = INCREMENTS_EDEFAULT;

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
		if (isDeliveredBy != null && isDeliveredBy.eIsProxy()) {
			InternalEObject oldIsDeliveredBy = (InternalEObject)isDeliveredBy;
			isDeliveredBy = (WorkPackage)eResolveProxy(oldIsDeliveredBy);
			if (isDeliveredBy != oldIsDeliveredBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY, oldIsDeliveredBy, isDeliveredBy));
			}
		}
		return isDeliveredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPackage basicGetIsDeliveredBy() {
		return isDeliveredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDeliveredBy(WorkPackage newIsDeliveredBy, NotificationChain msgs) {
		WorkPackage oldIsDeliveredBy = isDeliveredBy;
		isDeliveredBy = newIsDeliveredBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY, oldIsDeliveredBy, newIsDeliveredBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeliveredBy(WorkPackage newIsDeliveredBy) {
		if (newIsDeliveredBy != isDeliveredBy) {
			NotificationChain msgs = null;
			if (isDeliveredBy != null)
				msgs = ((InternalEObject)isDeliveredBy).eInverseRemove(this, ContentfwkPackage.WORK_PACKAGE__DELIVERS_CAPABILITIES, WorkPackage.class, msgs);
			if (newIsDeliveredBy != null)
				msgs = ((InternalEObject)newIsDeliveredBy).eInverseAdd(this, ContentfwkPackage.WORK_PACKAGE__DELIVERS_CAPABILITIES, WorkPackage.class, msgs);
			msgs = basicSetIsDeliveredBy(newIsDeliveredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CAPABILITY__IS_DELIVERED_BY, newIsDeliveredBy, newIsDeliveredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessValue() {
		return businessValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessValue(String newBusinessValue) {
		String oldBusinessValue = businessValue;
		businessValue = newBusinessValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CAPABILITY__BUSINESS_VALUE, oldBusinessValue, businessValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncrements() {
		return increments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrements(String newIncrements) {
		String oldIncrements = increments;
		increments = newIncrements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CAPABILITY__INCREMENTS, oldIncrements, increments));
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
				return isDeliveredBy != null;
			case ContentfwkPackage.CAPABILITY__BUSINESS_VALUE:
				return BUSINESS_VALUE_EDEFAULT == null ? businessValue != null : !BUSINESS_VALUE_EDEFAULT.equals(businessValue);
			case ContentfwkPackage.CAPABILITY__INCREMENTS:
				return INCREMENTS_EDEFAULT == null ? increments != null : !INCREMENTS_EDEFAULT.equals(increments);
		}
		return super.eIsSet(featureID);
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
		result.append(" (businessValue: ");
		result.append(businessValue);
		result.append(", increments: ");
		result.append(increments);
		result.append(')');
		return result.toString();
	}

} //CapabilityImpl
