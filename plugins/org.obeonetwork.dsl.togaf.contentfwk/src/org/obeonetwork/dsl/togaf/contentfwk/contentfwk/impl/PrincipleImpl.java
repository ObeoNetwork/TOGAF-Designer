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
	 * The cached value of the '{@link #getPrincipleCategory() <em>Principle Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipleCategory()
	 * @generated
	 * @ordered
	 */
	protected PrincipleCategory principleCategory = PRINCIPLE_CATEGORY_EDEFAULT;

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
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

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
	 * The cached value of the '{@link #getStatementOfPrinciple() <em>Statement Of Principle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOfPrinciple()
	 * @generated
	 * @ordered
	 */
	protected String statementOfPrinciple = STATEMENT_OF_PRINCIPLE_EDEFAULT;

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
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

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
	 * The cached value of the '{@link #getImplication() <em>Implication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplication()
	 * @generated
	 * @ordered
	 */
	protected String implication = IMPLICATION_EDEFAULT;

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
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected String metric = METRIC_EDEFAULT;

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
		return principleCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrincipleCategory(PrincipleCategory newPrincipleCategory) {
		PrincipleCategory oldPrincipleCategory = principleCategory;
		principleCategory = newPrincipleCategory == null ? PRINCIPLE_CATEGORY_EDEFAULT : newPrincipleCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PRINCIPLE__PRINCIPLE_CATEGORY, oldPrincipleCategory, principleCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PRINCIPLE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatementOfPrinciple() {
		return statementOfPrinciple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementOfPrinciple(String newStatementOfPrinciple) {
		String oldStatementOfPrinciple = statementOfPrinciple;
		statementOfPrinciple = newStatementOfPrinciple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PRINCIPLE__STATEMENT_OF_PRINCIPLE, oldStatementOfPrinciple, statementOfPrinciple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PRINCIPLE__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplication() {
		return implication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplication(String newImplication) {
		String oldImplication = implication;
		implication = newImplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PRINCIPLE__IMPLICATION, oldImplication, implication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(String newMetric) {
		String oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PRINCIPLE__METRIC, oldMetric, metric));
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
				return principleCategory != PRINCIPLE_CATEGORY_EDEFAULT;
			case ContentfwkPackage.PRINCIPLE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case ContentfwkPackage.PRINCIPLE__STATEMENT_OF_PRINCIPLE:
				return STATEMENT_OF_PRINCIPLE_EDEFAULT == null ? statementOfPrinciple != null : !STATEMENT_OF_PRINCIPLE_EDEFAULT.equals(statementOfPrinciple);
			case ContentfwkPackage.PRINCIPLE__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case ContentfwkPackage.PRINCIPLE__IMPLICATION:
				return IMPLICATION_EDEFAULT == null ? implication != null : !IMPLICATION_EDEFAULT.equals(implication);
			case ContentfwkPackage.PRINCIPLE__METRIC:
				return METRIC_EDEFAULT == null ? metric != null : !METRIC_EDEFAULT.equals(metric);
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
		result.append(" (principleCategory: ");
		result.append(principleCategory);
		result.append(", priority: ");
		result.append(priority);
		result.append(", statementOfPrinciple: ");
		result.append(statementOfPrinciple);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", implication: ");
		result.append(implication);
		result.append(", metric: ");
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} //PrincipleImpl
