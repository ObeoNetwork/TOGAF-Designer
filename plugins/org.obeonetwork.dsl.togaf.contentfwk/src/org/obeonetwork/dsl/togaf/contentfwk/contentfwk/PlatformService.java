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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A technical capability required to provide enabling infrastructure that supports the delivery of applications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService#getIsSuppliedByLogicalTechnologyComponents <em>Is Supplied By Logical Technology Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPlatformService()
 * @model
 * @generated
 */
public interface PlatformService extends Element, Service {
	/**
	 * Returns the value of the '<em><b>Is Supplied By Logical Technology Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getSuppliesPlatformServices <em>Supplies Platform Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Supplied By Logical Technology Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Supplied By Logical Technology Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPlatformService_IsSuppliedByLogicalTechnologyComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getSuppliesPlatformServices
	 * @model opposite="suppliesPlatformServices"
	 * @generated
	 */
	EList<LogicalTechnologyComponent> getIsSuppliedByLogicalTechnologyComponents();

} // PlatformService
