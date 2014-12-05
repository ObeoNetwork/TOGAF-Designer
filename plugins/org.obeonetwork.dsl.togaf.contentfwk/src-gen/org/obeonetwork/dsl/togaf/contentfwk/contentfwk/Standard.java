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

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getStandardClass <em>Standard Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getStandardCreationDate <em>Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getLastStandardReviewDate <em>Last Standard Review Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getNextStandardReviewDate <em>Next Standard Review Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getRetireDate <em>Retire Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getStandard()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Standard extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Standard Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Class</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass
	 * @see #setStandardClass(StandardsClass)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getStandard_StandardClass()
	 * @model
	 * @generated
	 */
	StandardsClass getStandardClass();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getStandardClass <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Class</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass
	 * @see #getStandardClass()
	 * @generated
	 */
	void setStandardClass(StandardsClass value);

	/**
	 * Returns the value of the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Creation Date</em>' attribute.
	 * @see #setStandardCreationDate(Date)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getStandard_StandardCreationDate()
	 * @model
	 * @generated
	 */
	Date getStandardCreationDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getStandardCreationDate <em>Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Creation Date</em>' attribute.
	 * @see #getStandardCreationDate()
	 * @generated
	 */
	void setStandardCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Standard Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Standard Review Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Standard Review Date</em>' attribute.
	 * @see #setLastStandardReviewDate(Date)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getStandard_LastStandardReviewDate()
	 * @model
	 * @generated
	 */
	Date getLastStandardReviewDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getLastStandardReviewDate <em>Last Standard Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Standard Review Date</em>' attribute.
	 * @see #getLastStandardReviewDate()
	 * @generated
	 */
	void setLastStandardReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Next Standard Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Standard Review Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Standard Review Date</em>' attribute.
	 * @see #setNextStandardReviewDate(Date)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getStandard_NextStandardReviewDate()
	 * @model
	 * @generated
	 */
	Date getNextStandardReviewDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getNextStandardReviewDate <em>Next Standard Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Standard Review Date</em>' attribute.
	 * @see #getNextStandardReviewDate()
	 * @generated
	 */
	void setNextStandardReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retire Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retire Date</em>' attribute.
	 * @see #setRetireDate(Date)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getStandard_RetireDate()
	 * @model
	 * @generated
	 */
	Date getRetireDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getRetireDate <em>Retire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retire Date</em>' attribute.
	 * @see #getRetireDate()
	 * @generated
	 */
	void setRetireDate(Date value);

} // Standard
