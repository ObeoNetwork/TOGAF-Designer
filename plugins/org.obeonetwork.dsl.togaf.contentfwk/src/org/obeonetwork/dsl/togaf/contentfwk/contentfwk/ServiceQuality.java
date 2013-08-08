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
 * A representation of the model object '<em><b>Service Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality#getAppliesToServices <em>Applies To Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality#getAppliesToContracts <em>Applies To Contracts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getServiceQuality()
 * @model
 * @generated
 */
public interface ServiceQuality extends Element {
	/**
	 * Returns the value of the '<em><b>Applies To Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getMeetsServiceQualities <em>Meets Service Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getServiceQuality_AppliesToServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getMeetsServiceQualities
	 * @model opposite="meetsServiceQualities"
	 * @generated
	 */
	EList<Service> getAppliesToServices();

	/**
	 * Returns the value of the '<em><b>Applies To Contracts</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getMeetsServiceQuality <em>Meets Service Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To Contracts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Contracts</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getServiceQuality_AppliesToContracts()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getMeetsServiceQuality
	 * @model opposite="meetsServiceQuality"
	 * @generated
	 */
	EList<Contract> getAppliesToContracts();

} // ServiceQuality
