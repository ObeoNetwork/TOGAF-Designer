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
 * A representation of the model object '<em><b>Logical Data Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent#getEncapsulatesDataEntities <em>Encapsulates Data Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent#getIsExtendedByPhysicalDataComponents <em>Is Extended By Physical Data Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalDataComponent()
 * @model
 * @generated
 */
public interface LogicalDataComponent extends Element, DataComponent {
	/**
	 * Returns the value of the '<em><b>Encapsulates Data Entities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getResidesWithinLogicalDataComponent <em>Resides Within Logical Data Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulates Data Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates Data Entities</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalDataComponent_EncapsulatesDataEntities()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getResidesWithinLogicalDataComponent
	 * @model opposite="residesWithinLogicalDataComponent"
	 * @generated
	 */
	EList<DataEntity> getEncapsulatesDataEntities();

	/**
	 * Returns the value of the '<em><b>Is Extended By Physical Data Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getExtendsLogicalDataComponents <em>Extends Logical Data Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extended By Physical Data Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended By Physical Data Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalDataComponent_IsExtendedByPhysicalDataComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getExtendsLogicalDataComponents
	 * @model opposite="extendsLogicalDataComponents"
	 * @generated
	 */
	EList<PhysicalDataComponent> getIsExtendedByPhysicalDataComponents();

} // LogicalDataComponent
