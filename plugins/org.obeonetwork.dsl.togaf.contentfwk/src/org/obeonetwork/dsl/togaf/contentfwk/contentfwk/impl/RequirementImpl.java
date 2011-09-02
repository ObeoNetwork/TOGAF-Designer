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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RequirementImpl#getStatementOfRequirement <em>Statement Of Requirement</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RequirementImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RequirementImpl#getAcceptanceCriteria <em>Acceptance Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends StrategicElementImpl implements Requirement {
	/**
	 * The default value of the '{@link #getStatementOfRequirement() <em>Statement Of Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOfRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_OF_REQUIREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementOfRequirement() <em>Statement Of Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOfRequirement()
	 * @generated
	 * @ordered
	 */
	protected String statementOfRequirement = STATEMENT_OF_REQUIREMENT_EDEFAULT;

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
	 * The default value of the '{@link #getAcceptanceCriteria() <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPTANCE_CRITERIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcceptanceCriteria() <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceCriteria()
	 * @generated
	 * @ordered
	 */
	protected String acceptanceCriteria = ACCEPTANCE_CRITERIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatementOfRequirement() {
		return statementOfRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementOfRequirement(String newStatementOfRequirement) {
		String oldStatementOfRequirement = statementOfRequirement;
		statementOfRequirement = newStatementOfRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.REQUIREMENT__STATEMENT_OF_REQUIREMENT, oldStatementOfRequirement, statementOfRequirement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.REQUIREMENT__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcceptanceCriteria() {
		return acceptanceCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceCriteria(String newAcceptanceCriteria) {
		String oldAcceptanceCriteria = acceptanceCriteria;
		acceptanceCriteria = newAcceptanceCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.REQUIREMENT__ACCEPTANCE_CRITERIA, oldAcceptanceCriteria, acceptanceCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentfwkPackage.REQUIREMENT__STATEMENT_OF_REQUIREMENT:
				return getStatementOfRequirement();
			case ContentfwkPackage.REQUIREMENT__RATIONALE:
				return getRationale();
			case ContentfwkPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				return getAcceptanceCriteria();
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
			case ContentfwkPackage.REQUIREMENT__STATEMENT_OF_REQUIREMENT:
				setStatementOfRequirement((String)newValue);
				return;
			case ContentfwkPackage.REQUIREMENT__RATIONALE:
				setRationale((String)newValue);
				return;
			case ContentfwkPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				setAcceptanceCriteria((String)newValue);
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
			case ContentfwkPackage.REQUIREMENT__STATEMENT_OF_REQUIREMENT:
				setStatementOfRequirement(STATEMENT_OF_REQUIREMENT_EDEFAULT);
				return;
			case ContentfwkPackage.REQUIREMENT__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case ContentfwkPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				setAcceptanceCriteria(ACCEPTANCE_CRITERIA_EDEFAULT);
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
			case ContentfwkPackage.REQUIREMENT__STATEMENT_OF_REQUIREMENT:
				return STATEMENT_OF_REQUIREMENT_EDEFAULT == null ? statementOfRequirement != null : !STATEMENT_OF_REQUIREMENT_EDEFAULT.equals(statementOfRequirement);
			case ContentfwkPackage.REQUIREMENT__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case ContentfwkPackage.REQUIREMENT__ACCEPTANCE_CRITERIA:
				return ACCEPTANCE_CRITERIA_EDEFAULT == null ? acceptanceCriteria != null : !ACCEPTANCE_CRITERIA_EDEFAULT.equals(acceptanceCriteria);
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
		result.append(" (statementOfRequirement: ");
		result.append(statementOfRequirement);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", acceptanceCriteria: ");
		result.append(acceptanceCriteria);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
