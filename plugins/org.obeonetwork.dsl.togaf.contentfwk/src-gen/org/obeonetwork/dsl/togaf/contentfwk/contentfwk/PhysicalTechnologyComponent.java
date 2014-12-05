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
 * A representation of the model object '<em><b>Physical Technology Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getRealizesPhysicalApplicationComponents <em>Realizes Physical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getExtendsLogicalTechnologyComponents <em>Extends Logical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsHostedInLocation <em>Is Hosted In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getDecomposesPhysicalTechnologyComponent <em>Decomposes Physical Technology Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsDependentOnPhysicalTechnologyComponents <em>Is Dependent On Physical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getCategoryTRM <em>Category TRM</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsRequiredByPhysicalTechnologyComponent <em>Is Required By Physical Technology Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsDecomposedByPhysicalTechnologyComponents <em>Is Decomposed By Physical Technology Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent()
 * @model
 * @generated
 */
public interface PhysicalTechnologyComponent extends Element, TechnologyComponent {
	/**
	 * Returns the value of the '<em><b>Realizes Physical Application Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsRealizedByPhysicalTechnologyComponents <em>Is Realized By Physical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes Physical Application Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes Physical Application Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_RealizesPhysicalApplicationComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsRealizedByPhysicalTechnologyComponents
	 * @model opposite="isRealizedByPhysicalTechnologyComponents"
	 * @generated
	 */
	EList<PhysicalApplicationComponent> getRealizesPhysicalApplicationComponents();

	/**
	 * Returns the value of the '<em><b>Extends Logical Technology Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getIsRealizedByPhysicalTechnologyComponents <em>Is Realized By Physical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends Logical Technology Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Logical Technology Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_ExtendsLogicalTechnologyComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getIsRealizedByPhysicalTechnologyComponents
	 * @model opposite="isRealizedByPhysicalTechnologyComponents"
	 * @generated
	 */
	EList<LogicalTechnologyComponent> getExtendsLogicalTechnologyComponents();

	/**
	 * Returns the value of the '<em><b>Is Hosted In Location</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalTechnologyComponents <em>Contains Physical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Hosted In Location</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Hosted In Location</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_IsHostedInLocation()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalTechnologyComponents
	 * @model opposite="containsPhysicalTechnologyComponents"
	 * @generated
	 */
	EList<Location> getIsHostedInLocation();

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_ProductName()
	 * @model
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_ModuleName()
	 * @model
	 * @generated
	 */
	String getModuleName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
	void setModuleName(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_Vendor()
	 * @model
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Decomposes Physical Technology Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsDecomposedByPhysicalTechnologyComponents <em>Is Decomposed By Physical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Physical Technology Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Physical Technology Component</em>' reference.
	 * @see #setDecomposesPhysicalTechnologyComponent(PhysicalTechnologyComponent)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_DecomposesPhysicalTechnologyComponent()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsDecomposedByPhysicalTechnologyComponents
	 * @model opposite="isDecomposedByPhysicalTechnologyComponents"
	 * @generated
	 */
	PhysicalTechnologyComponent getDecomposesPhysicalTechnologyComponent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getDecomposesPhysicalTechnologyComponent <em>Decomposes Physical Technology Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Physical Technology Component</em>' reference.
	 * @see #getDecomposesPhysicalTechnologyComponent()
	 * @generated
	 */
	void setDecomposesPhysicalTechnologyComponent(PhysicalTechnologyComponent value);

	/**
	 * Returns the value of the '<em><b>Is Dependent On Physical Technology Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsRequiredByPhysicalTechnologyComponent <em>Is Required By Physical Technology Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dependent On Physical Technology Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dependent On Physical Technology Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_IsDependentOnPhysicalTechnologyComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsRequiredByPhysicalTechnologyComponent
	 * @model opposite="isRequiredByPhysicalTechnologyComponent"
	 * @generated
	 */
	EList<PhysicalTechnologyComponent> getIsDependentOnPhysicalTechnologyComponents();

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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_CategoryTRM()
	 * @model
	 * @generated
	 */
	String getCategoryTRM();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getCategoryTRM <em>Category TRM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category TRM</em>' attribute.
	 * @see #getCategoryTRM()
	 * @generated
	 */
	void setCategoryTRM(String value);

	/**
	 * Returns the value of the '<em><b>Is Required By Physical Technology Component</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsDependentOnPhysicalTechnologyComponents <em>Is Dependent On Physical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Required By Physical Technology Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required By Physical Technology Component</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_IsRequiredByPhysicalTechnologyComponent()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsDependentOnPhysicalTechnologyComponents
	 * @model opposite="isDependentOnPhysicalTechnologyComponents"
	 * @generated
	 */
	EList<PhysicalTechnologyComponent> getIsRequiredByPhysicalTechnologyComponent();

	/**
	 * Returns the value of the '<em><b>Is Decomposed By Physical Technology Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getDecomposesPhysicalTechnologyComponent <em>Decomposes Physical Technology Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By Physical Technology Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By Physical Technology Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalTechnologyComponent_IsDecomposedByPhysicalTechnologyComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getDecomposesPhysicalTechnologyComponent
	 * @model opposite="decomposesPhysicalTechnologyComponent"
	 * @generated
	 */
	EList<PhysicalTechnologyComponent> getIsDecomposedByPhysicalTechnologyComponents();

} // PhysicalTechnologyComponent
