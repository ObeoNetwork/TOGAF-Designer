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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage#getWorkPackageCategory <em>Work Package Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage#getDeliversCapabilities <em>Delivers Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getWorkPackage()
 * @model
 * @generated
 */
public interface WorkPackage extends StrategicElement {
	/**
	 * Returns the value of the '<em><b>Work Package Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Package Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Package Category</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory
	 * @see #setWorkPackageCategory(WorkPackageCategory)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getWorkPackage_WorkPackageCategory()
	 * @model required="true"
	 * @generated
	 */
	WorkPackageCategory getWorkPackageCategory();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage#getWorkPackageCategory <em>Work Package Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Package Category</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory
	 * @see #getWorkPackageCategory()
	 * @generated
	 */
	void setWorkPackageCategory(WorkPackageCategory value);

	/**
	 * Returns the value of the '<em><b>Delivers Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getIsDeliveredBy <em>Is Delivered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivers Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivers Capabilities</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getWorkPackage_DeliversCapabilities()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getIsDeliveredBy
	 * @model opposite="isDeliveredBy"
	 * @generated
	 */
	EList<Capability> getDeliversCapabilities();

} // WorkPackage
