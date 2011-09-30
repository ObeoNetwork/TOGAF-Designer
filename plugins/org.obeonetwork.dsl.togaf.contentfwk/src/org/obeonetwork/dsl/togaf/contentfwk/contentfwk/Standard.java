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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getLastStandardCreationDate <em>Last Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getNextStandardCreationDate <em>Next Standard Creation Date</em>}</li>
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
	 * Returns the value of the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Standard Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Standard Creation Date</em>' attribute.
	 * @see #setLastStandardCreationDate(Date)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getStandard_LastStandardCreationDate()
	 * @model
	 * @generated
	 */
	Date getLastStandardCreationDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getLastStandardCreationDate <em>Last Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Standard Creation Date</em>' attribute.
	 * @see #getLastStandardCreationDate()
	 * @generated
	 */
	void setLastStandardCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Standard Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Standard Creation Date</em>' attribute.
	 * @see #setNextStandardCreationDate(Date)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getStandard_NextStandardCreationDate()
	 * @model
	 * @generated
	 */
	Date getNextStandardCreationDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getNextStandardCreationDate <em>Next Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Standard Creation Date</em>' attribute.
	 * @see #getNextStandardCreationDate()
	 * @generated
	 */
	void setNextStandardCreationDate(Date value);

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
