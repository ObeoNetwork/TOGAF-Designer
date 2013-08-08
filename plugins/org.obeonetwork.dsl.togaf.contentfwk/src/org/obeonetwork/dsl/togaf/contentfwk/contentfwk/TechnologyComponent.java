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

import org.eclipse.emf.cdo.CDOObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyComponent#getStandardClass <em>Standard Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getTechnologyComponent()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface TechnologyComponent extends CDOObject {

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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getTechnologyComponent_StandardClass()
	 * @model
	 * @generated
	 */
	StandardsClass getStandardClass();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyComponent#getStandardClass <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Class</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass
	 * @see #getStandardClass()
	 * @generated
	 */
	void setStandardClass(StandardsClass value);
} // TechnologyComponent
