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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Application Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getImplementsServices <em>Implements Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getOperatesOnDataEntities <em>Operates On Data Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getIsExtendedByPhysicalApplicationComponents <em>Is Extended By Physical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getCommunicatesWith <em>Communicates With</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getDecomposesLogicalApplicationComponent <em>Decomposes Logical Application Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getIsDecomposedByLogicalApplicationComponents <em>Is Decomposed By Logical Application Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalApplicationComponent()
 * @model
 * @generated
 */
public interface LogicalApplicationComponent extends Element, ApplicationComponent {
	/**
	 * Returns the value of the '<em><b>Implements Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsRealizedThroughLogicalApplicationComponent <em>Is Realized Through Logical Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalApplicationComponent_ImplementsServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsRealizedThroughLogicalApplicationComponent
	 * @model opposite="isRealizedThroughLogicalApplicationComponent"
	 * @generated
	 */
	EList<Service> getImplementsServices();

	/**
	 * Returns the value of the '<em><b>Operates On Data Entities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsProcessesByLogicalApplicationComponents <em>Is Processes By Logical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operates On Data Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operates On Data Entities</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalApplicationComponent_OperatesOnDataEntities()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsProcessesByLogicalApplicationComponents
	 * @model opposite="isProcessesByLogicalApplicationComponents"
	 * @generated
	 */
	EList<DataEntity> getOperatesOnDataEntities();

	/**
	 * Returns the value of the '<em><b>Is Extended By Physical Application Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getExtendsLogicalApplicationComponents <em>Extends Logical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extended By Physical Application Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended By Physical Application Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalApplicationComponent_IsExtendedByPhysicalApplicationComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getExtendsLogicalApplicationComponents
	 * @model opposite="extendsLogicalApplicationComponents"
	 * @generated
	 */
	EList<PhysicalApplicationComponent> getIsExtendedByPhysicalApplicationComponents();

	/**
	 * Returns the value of the '<em><b>Communicates With</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicates With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicates With</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalApplicationComponent_CommunicatesWith()
	 * @model
	 * @generated
	 */
	EList<LogicalApplicationComponent> getCommunicatesWith();

	/**
	 * Returns the value of the '<em><b>Decomposes Logical Application Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getIsDecomposedByLogicalApplicationComponents <em>Is Decomposed By Logical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Logical Application Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Logical Application Component</em>' reference.
	 * @see #setDecomposesLogicalApplicationComponent(LogicalApplicationComponent)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalApplicationComponent_DecomposesLogicalApplicationComponent()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getIsDecomposedByLogicalApplicationComponents
	 * @model opposite="isDecomposedByLogicalApplicationComponents"
	 * @generated
	 */
	LogicalApplicationComponent getDecomposesLogicalApplicationComponent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getDecomposesLogicalApplicationComponent <em>Decomposes Logical Application Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Logical Application Component</em>' reference.
	 * @see #getDecomposesLogicalApplicationComponent()
	 * @generated
	 */
	void setDecomposesLogicalApplicationComponent(LogicalApplicationComponent value);

	/**
	 * Returns the value of the '<em><b>Is Decomposed By Logical Application Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getDecomposesLogicalApplicationComponent <em>Decomposes Logical Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By Logical Application Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By Logical Application Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalApplicationComponent_IsDecomposedByLogicalApplicationComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getDecomposesLogicalApplicationComponent
	 * @model opposite="decomposesLogicalApplicationComponent"
	 * @generated
	 */
	EList<LogicalApplicationComponent> getIsDecomposedByLogicalApplicationComponents();

} // LogicalApplicationComponent
