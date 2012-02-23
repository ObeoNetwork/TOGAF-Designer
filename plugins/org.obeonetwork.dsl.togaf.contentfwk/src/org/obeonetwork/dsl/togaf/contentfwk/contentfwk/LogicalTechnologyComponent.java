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
 * A representation of the model object '<em><b>Logical Technology Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getProvidesPlatformForServices <em>Provides Platform For Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getSuppliesPlatformServices <em>Supplies Platform Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getIsRealizedByPhysicalTechnologyComponents <em>Is Realized By Physical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getDecomposesLogicalTechnologyComponent <em>Decomposes Logical Technology Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getIsDependentOnLogicalTechnologyComponents <em>Is Dependent On Logical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getCategoryTRM <em>Category TRM</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalTechnologyComponent()
 * @model
 * @generated
 */
public interface LogicalTechnologyComponent extends Element, TechnologyComponent {
	/**
	 * Returns the value of the '<em><b>Provides Platform For Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsImplementedOnLogicalTechnologyComponents <em>Is Implemented On Logical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Platform For Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Platform For Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalTechnologyComponent_ProvidesPlatformForServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsImplementedOnLogicalTechnologyComponents
	 * @model opposite="isImplementedOnLogicalTechnologyComponents"
	 * @generated
	 */
	EList<Service> getProvidesPlatformForServices();

	/**
	 * Returns the value of the '<em><b>Supplies Platform Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService#getIsSuppliedByLogicalTechnologyComponents <em>Is Supplied By Logical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplies Platform Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplies Platform Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalTechnologyComponent_SuppliesPlatformServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService#getIsSuppliedByLogicalTechnologyComponents
	 * @model opposite="isSuppliedByLogicalTechnologyComponents"
	 * @generated
	 */
	EList<PlatformService> getSuppliesPlatformServices();

	/**
	 * Returns the value of the '<em><b>Is Realized By Physical Technology Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getExtendsLogicalTechnologyComponents <em>Extends Logical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Realized By Physical Technology Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Realized By Physical Technology Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalTechnologyComponent_IsRealizedByPhysicalTechnologyComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getExtendsLogicalTechnologyComponents
	 * @model opposite="extendsLogicalTechnologyComponents"
	 * @generated
	 */
	EList<PhysicalTechnologyComponent> getIsRealizedByPhysicalTechnologyComponents();

	/**
	 * Returns the value of the '<em><b>Decomposes Logical Technology Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Logical Technology Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Logical Technology Component</em>' reference.
	 * @see #setDecomposesLogicalTechnologyComponent(LogicalTechnologyComponent)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalTechnologyComponent_DecomposesLogicalTechnologyComponent()
	 * @model
	 * @generated
	 */
	LogicalTechnologyComponent getDecomposesLogicalTechnologyComponent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getDecomposesLogicalTechnologyComponent <em>Decomposes Logical Technology Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Logical Technology Component</em>' reference.
	 * @see #getDecomposesLogicalTechnologyComponent()
	 * @generated
	 */
	void setDecomposesLogicalTechnologyComponent(LogicalTechnologyComponent value);

	/**
	 * Returns the value of the '<em><b>Is Dependent On Logical Technology Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dependent On Logical Technology Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dependent On Logical Technology Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalTechnologyComponent_IsDependentOnLogicalTechnologyComponents()
	 * @model
	 * @generated
	 */
	EList<LogicalTechnologyComponent> getIsDependentOnLogicalTechnologyComponents();

	/**
	 * Returns the value of the '<em><b>Category TRM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category TRM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category TRM</em>' attribute.
	 * @see #setCategoryTRM(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLogicalTechnologyComponent_CategoryTRM()
	 * @model
	 * @generated
	 */
	String getCategoryTRM();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getCategoryTRM <em>Category TRM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category TRM</em>' attribute.
	 * @see #getCategoryTRM()
	 * @generated
	 */
	void setCategoryTRM(String value);

} // LogicalTechnologyComponent
