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
 * A representation of the model object '<em><b>Physical Data Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getExtendsLogicalDataComponents <em>Extends Logical Data Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getIsHotedInLocation <em>Is Hoted In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getDecomposesPhysicalDataComponent <em>Decomposes Physical Data Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getEncapsulatesPhysicalApplicationComponents <em>Encapsulates Physical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getIsDecomposedByPhysicalDataComponents <em>Is Decomposed By Physical Data Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalDataComponent()
 * @model
 * @generated
 */
public interface PhysicalDataComponent extends Element, DataComponent {
	/**
	 * Returns the value of the '<em><b>Extends Logical Data Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent#getIsExtendedByPhysicalDataComponents <em>Is Extended By Physical Data Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends Logical Data Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Logical Data Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalDataComponent_ExtendsLogicalDataComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent#getIsExtendedByPhysicalDataComponents
	 * @model opposite="isExtendedByPhysicalDataComponents"
	 * @generated
	 */
	EList<LogicalDataComponent> getExtendsLogicalDataComponents();

	/**
	 * Returns the value of the '<em><b>Is Hoted In Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalDataComponents <em>Contains Physical Data Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Hoted In Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Hoted In Location</em>' reference.
	 * @see #setIsHotedInLocation(Location)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalDataComponent_IsHotedInLocation()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalDataComponents
	 * @model opposite="containsPhysicalDataComponents"
	 * @generated
	 */
	Location getIsHotedInLocation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getIsHotedInLocation <em>Is Hoted In Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Hoted In Location</em>' reference.
	 * @see #getIsHotedInLocation()
	 * @generated
	 */
	void setIsHotedInLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Decomposes Physical Data Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getIsDecomposedByPhysicalDataComponents <em>Is Decomposed By Physical Data Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Physical Data Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Physical Data Component</em>' reference.
	 * @see #setDecomposesPhysicalDataComponent(PhysicalDataComponent)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalDataComponent_DecomposesPhysicalDataComponent()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getIsDecomposedByPhysicalDataComponents
	 * @model opposite="isDecomposedByPhysicalDataComponents"
	 * @generated
	 */
	PhysicalDataComponent getDecomposesPhysicalDataComponent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getDecomposesPhysicalDataComponent <em>Decomposes Physical Data Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Physical Data Component</em>' reference.
	 * @see #getDecomposesPhysicalDataComponent()
	 * @generated
	 */
	void setDecomposesPhysicalDataComponent(PhysicalDataComponent value);

	/**
	 * Returns the value of the '<em><b>Encapsulates Physical Application Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getEncapsulatesPhysicalDataComponents <em>Encapsulates Physical Data Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulates Physical Application Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates Physical Application Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalDataComponent_EncapsulatesPhysicalApplicationComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getEncapsulatesPhysicalDataComponents
	 * @model opposite="encapsulatesPhysicalDataComponents"
	 * @generated
	 */
	EList<PhysicalApplicationComponent> getEncapsulatesPhysicalApplicationComponents();

	/**
	 * Returns the value of the '<em><b>Is Decomposed By Physical Data Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getDecomposesPhysicalDataComponent <em>Decomposes Physical Data Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By Physical Data Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By Physical Data Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalDataComponent_IsDecomposedByPhysicalDataComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getDecomposesPhysicalDataComponent
	 * @model opposite="decomposesPhysicalDataComponent"
	 * @generated
	 */
	EList<PhysicalDataComponent> getIsDecomposedByPhysicalDataComponents();

} // PhysicalDataComponent
