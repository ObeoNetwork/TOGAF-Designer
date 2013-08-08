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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement#getStatementOfRequirement <em>Statement Of Requirement</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement#getAcceptanceCriteria <em>Acceptance Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends StrategicElement {
	/**
	 * Returns the value of the '<em><b>Statement Of Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statement of what the requirement is, including a definition of whether the requirement shall be met, should be met, or may be met. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement Of Requirement</em>' attribute.
	 * @see #setStatementOfRequirement(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getRequirement_StatementOfRequirement()
	 * @model
	 * @generated
	 */
	String getStatementOfRequirement();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement#getStatementOfRequirement <em>Statement Of Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Of Requirement</em>' attribute.
	 * @see #getStatementOfRequirement()
	 * @generated
	 */
	void setStatementOfRequirement(String value);

	/**
	 * Returns the value of the '<em><b>Acceptance Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statement of what tests will be carried out to ensure that the requirement will be met. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acceptance Criteria</em>' attribute.
	 * @see #setAcceptanceCriteria(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getRequirement_AcceptanceCriteria()
	 * @model
	 * @generated
	 */
	String getAcceptanceCriteria();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement#getAcceptanceCriteria <em>Acceptance Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Criteria</em>' attribute.
	 * @see #getAcceptanceCriteria()
	 * @generated
	 */
	void setAcceptanceCriteria(String value);

} // Requirement
