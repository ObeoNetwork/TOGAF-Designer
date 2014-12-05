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
 * A representation of the model object '<em><b>Business Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Supports business capabilities through an explicitly defined interface and is explicitly governed by an organization. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService#getSupportsObjective <em>Supports Objective</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getBusinessService()
 * @model
 * @generated
 */
public interface BusinessService extends Element, Service {
	/**
	 * Returns the value of the '<em><b>Supports Objective</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsSupportedByBusinessService <em>Is Supported By Business Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business services support organizational objectives and are defined at a level of granularity consistent with the level of governance needed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Objective</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getBusinessService_SupportsObjective()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsSupportedByBusinessService
	 * @model opposite="isSupportedByBusinessService"
	 * @generated
	 */
	EList<Objective> getSupportsObjective();

} // BusinessService
