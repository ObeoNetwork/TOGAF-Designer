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

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StandardImpl#getStandardClass <em>Standard Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StandardImpl#getStandardCreationDate <em>Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StandardImpl#getLastStandardReviewDate <em>Last Standard Review Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StandardImpl#getNextStandardReviewDate <em>Next Standard Review Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StandardImpl#getRetireDate <em>Retire Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StandardImpl extends CDOObjectImpl implements Standard {
	/**
	 * The default value of the '{@link #getStandardClass() <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardClass()
	 * @generated
	 * @ordered
	 */
	protected static final StandardsClass STANDARD_CLASS_EDEFAULT = StandardsClass.NON_STANDARD;
	/**
	 * The default value of the '{@link #getStandardCreationDate() <em>Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STANDARD_CREATION_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLastStandardReviewDate() <em>Last Standard Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStandardReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_STANDARD_REVIEW_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNextStandardReviewDate() <em>Next Standard Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NEXT_STANDARD_REVIEW_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRetireDate() <em>Retire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetireDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RETIRE_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.STANDARD;
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
	public StandardsClass getStandardClass() {
		return (StandardsClass)eDynamicGet(ContentfwkPackage.STANDARD__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eDynamicSet(ContentfwkPackage.STANDARD__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, newStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardReviewDate() {
		return (Date)eDynamicGet(ContentfwkPackage.STANDARD__LAST_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_REVIEW_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardReviewDate(Date newLastStandardReviewDate) {
		eDynamicSet(ContentfwkPackage.STANDARD__LAST_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_REVIEW_DATE, newLastStandardReviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardReviewDate() {
		return (Date)eDynamicGet(ContentfwkPackage.STANDARD__NEXT_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_REVIEW_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardReviewDate(Date newNextStandardReviewDate) {
		eDynamicSet(ContentfwkPackage.STANDARD__NEXT_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_REVIEW_DATE, newNextStandardReviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return (Date)eDynamicGet(ContentfwkPackage.STANDARD__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		eDynamicSet(ContentfwkPackage.STANDARD__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, newRetireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentfwkPackage.STANDARD__STANDARD_CLASS:
				return getStandardClass();
			case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE:
				return getStandardCreationDate();
			case ContentfwkPackage.STANDARD__LAST_STANDARD_REVIEW_DATE:
				return getLastStandardReviewDate();
			case ContentfwkPackage.STANDARD__NEXT_STANDARD_REVIEW_DATE:
				return getNextStandardReviewDate();
			case ContentfwkPackage.STANDARD__RETIRE_DATE:
				return getRetireDate();
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
			case ContentfwkPackage.STANDARD__STANDARD_CLASS:
				setStandardClass((StandardsClass)newValue);
				return;
			case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE:
				setStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.STANDARD__LAST_STANDARD_REVIEW_DATE:
				setLastStandardReviewDate((Date)newValue);
				return;
			case ContentfwkPackage.STANDARD__NEXT_STANDARD_REVIEW_DATE:
				setNextStandardReviewDate((Date)newValue);
				return;
			case ContentfwkPackage.STANDARD__RETIRE_DATE:
				setRetireDate((Date)newValue);
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
			case ContentfwkPackage.STANDARD__STANDARD_CLASS:
				setStandardClass(STANDARD_CLASS_EDEFAULT);
				return;
			case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE:
				setStandardCreationDate(STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.STANDARD__LAST_STANDARD_REVIEW_DATE:
				setLastStandardReviewDate(LAST_STANDARD_REVIEW_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.STANDARD__NEXT_STANDARD_REVIEW_DATE:
				setNextStandardReviewDate(NEXT_STANDARD_REVIEW_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.STANDARD__RETIRE_DATE:
				setRetireDate(RETIRE_DATE_EDEFAULT);
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
			case ContentfwkPackage.STANDARD__STANDARD_CLASS:
				return getStandardClass() != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? getStandardCreationDate() != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(getStandardCreationDate());
			case ContentfwkPackage.STANDARD__LAST_STANDARD_REVIEW_DATE:
				return LAST_STANDARD_REVIEW_DATE_EDEFAULT == null ? getLastStandardReviewDate() != null : !LAST_STANDARD_REVIEW_DATE_EDEFAULT.equals(getLastStandardReviewDate());
			case ContentfwkPackage.STANDARD__NEXT_STANDARD_REVIEW_DATE:
				return NEXT_STANDARD_REVIEW_DATE_EDEFAULT == null ? getNextStandardReviewDate() != null : !NEXT_STANDARD_REVIEW_DATE_EDEFAULT.equals(getNextStandardReviewDate());
			case ContentfwkPackage.STANDARD__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? getRetireDate() != null : !RETIRE_DATE_EDEFAULT.equals(getRetireDate());
		}
		return super.eIsSet(featureID);
	}

} //StandardImpl
