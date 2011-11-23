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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PrincipleCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Principle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PrincipleImpl#getPrincipleCategory <em>Principle Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PrincipleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PrincipleImpl#getStatementOfPrinciple <em>Statement Of Principle</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PrincipleImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PrincipleImpl#getImplication <em>Implication</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PrincipleImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrincipleImpl extends StrategicElementImpl implements Principle {
	/**
	 * The default value of the '{@link #getPrincipleCategory() <em>Principle Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipleCategory()
	 * @generated
	 * @ordered
	 */
	protected static final PrincipleCategory PRINCIPLE_CATEGORY_EDEFAULT = PrincipleCategory.GUIDING_PRINCIPLE;
	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getStatementOfPrinciple() <em>Statement Of Principle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOfPrinciple()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_OF_PRINCIPLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getImplication() <em>Implication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplication()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLICATION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrincipleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.PRINCIPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipleCategory getPrincipleCategory() {
		return (PrincipleCategory)eDynamicGet(ContentfwkPackage.PRINCIPLE__PRINCIPLE_CATEGORY, ContentfwkPackage.Literals.PRINCIPLE__PRINCIPLE_CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrincipleCategory(PrincipleCategory newPrincipleCategory) {
		eDynamicSet(ContentfwkPackage.PRINCIPLE__PRINCIPLE_CATEGORY, ContentfwkPackage.Literals.PRINCIPLE__PRINCIPLE_CATEGORY, newPrincipleCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return (String)eDynamicGet(ContentfwkPackage.PRINCIPLE__PRIORITY, ContentfwkPackage.Literals.PRINCIPLE__PRIORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		eDynamicSet(ContentfwkPackage.PRINCIPLE__PRIORITY, ContentfwkPackage.Literals.PRINCIPLE__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatementOfPrinciple() {
		return (String)eDynamicGet(ContentfwkPackage.PRINCIPLE__STATEMENT_OF_PRINCIPLE, ContentfwkPackage.Literals.PRINCIPLE__STATEMENT_OF_PRINCIPLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementOfPrinciple(String newStatementOfPrinciple) {
		eDynamicSet(ContentfwkPackage.PRINCIPLE__STATEMENT_OF_PRINCIPLE, ContentfwkPackage.Literals.PRINCIPLE__STATEMENT_OF_PRINCIPLE, newStatementOfPrinciple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return (String)eDynamicGet(ContentfwkPackage.PRINCIPLE__RATIONALE, ContentfwkPackage.Literals.PRINCIPLE__RATIONALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		eDynamicSet(ContentfwkPackage.PRINCIPLE__RATIONALE, ContentfwkPackage.Literals.PRINCIPLE__RATIONALE, newRationale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplication() {
		return (String)eDynamicGet(ContentfwkPackage.PRINCIPLE__IMPLICATION, ContentfwkPackage.Literals.PRINCIPLE__IMPLICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplication(String newImplication) {
		eDynamicSet(ContentfwkPackage.PRINCIPLE__IMPLICATION, ContentfwkPackage.Literals.PRINCIPLE__IMPLICATION, newImplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetric() {
		return (String)eDynamicGet(ContentfwkPackage.PRINCIPLE__METRIC, ContentfwkPackage.Literals.PRINCIPLE__METRIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(String newMetric) {
		eDynamicSet(ContentfwkPackage.PRINCIPLE__METRIC, ContentfwkPackage.Literals.PRINCIPLE__METRIC, newMetric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentfwkPackage.PRINCIPLE__PRINCIPLE_CATEGORY:
				return getPrincipleCategory();
			case ContentfwkPackage.PRINCIPLE__PRIORITY:
				return getPriority();
			case ContentfwkPackage.PRINCIPLE__STATEMENT_OF_PRINCIPLE:
				return getStatementOfPrinciple();
			case ContentfwkPackage.PRINCIPLE__RATIONALE:
				return getRationale();
			case ContentfwkPackage.PRINCIPLE__IMPLICATION:
				return getImplication();
			case ContentfwkPackage.PRINCIPLE__METRIC:
				return getMetric();
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
			case ContentfwkPackage.PRINCIPLE__PRINCIPLE_CATEGORY:
				setPrincipleCategory((PrincipleCategory)newValue);
				return;
			case ContentfwkPackage.PRINCIPLE__PRIORITY:
				setPriority((String)newValue);
				return;
			case ContentfwkPackage.PRINCIPLE__STATEMENT_OF_PRINCIPLE:
				setStatementOfPrinciple((String)newValue);
				return;
			case ContentfwkPackage.PRINCIPLE__RATIONALE:
				setRationale((String)newValue);
				return;
			case ContentfwkPackage.PRINCIPLE__IMPLICATION:
				setImplication((String)newValue);
				return;
			case ContentfwkPackage.PRINCIPLE__METRIC:
				setMetric((String)newValue);
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
			case ContentfwkPackage.PRINCIPLE__PRINCIPLE_CATEGORY:
				setPrincipleCategory(PRINCIPLE_CATEGORY_EDEFAULT);
				return;
			case ContentfwkPackage.PRINCIPLE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case ContentfwkPackage.PRINCIPLE__STATEMENT_OF_PRINCIPLE:
				setStatementOfPrinciple(STATEMENT_OF_PRINCIPLE_EDEFAULT);
				return;
			case ContentfwkPackage.PRINCIPLE__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case ContentfwkPackage.PRINCIPLE__IMPLICATION:
				setImplication(IMPLICATION_EDEFAULT);
				return;
			case ContentfwkPackage.PRINCIPLE__METRIC:
				setMetric(METRIC_EDEFAULT);
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
			case ContentfwkPackage.PRINCIPLE__PRINCIPLE_CATEGORY:
				return getPrincipleCategory() != PRINCIPLE_CATEGORY_EDEFAULT;
			case ContentfwkPackage.PRINCIPLE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? getPriority() != null : !PRIORITY_EDEFAULT.equals(getPriority());
			case ContentfwkPackage.PRINCIPLE__STATEMENT_OF_PRINCIPLE:
				return STATEMENT_OF_PRINCIPLE_EDEFAULT == null ? getStatementOfPrinciple() != null : !STATEMENT_OF_PRINCIPLE_EDEFAULT.equals(getStatementOfPrinciple());
			case ContentfwkPackage.PRINCIPLE__RATIONALE:
				return RATIONALE_EDEFAULT == null ? getRationale() != null : !RATIONALE_EDEFAULT.equals(getRationale());
			case ContentfwkPackage.PRINCIPLE__IMPLICATION:
				return IMPLICATION_EDEFAULT == null ? getImplication() != null : !IMPLICATION_EDEFAULT.equals(getImplication());
			case ContentfwkPackage.PRINCIPLE__METRIC:
				return METRIC_EDEFAULT == null ? getMetric() != null : !METRIC_EDEFAULT.equals(getMetric());
		}
		return super.eIsSet(featureID);
	}

} //PrincipleImpl
