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
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Delivers business capabilities closely aligned to an organization, but not explicitly governed by the organization. The term "function" is used to describe a unit of business capability at all levels of granularity, encapsulating terms such as value chain, process area, capability, business function, etc. Any bounded unit of business function should be described as a function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsPerformedByActors <em>Is Performed By Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsOwnedByOrganizationUnit <em>Is Owned By Organization Unit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsBoundedByServices <em>Is Bounded By Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getSupportsProcesses <em>Supports Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsRealizedByProcesses <em>Is Realized By Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getCanBeAccessedByRoles <em>Can Be Accessed By Roles</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getSupportsActors <em>Supports Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getDecomposesFunction <em>Decomposes Function</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getCommunicatesWithFunctions <em>Communicates With Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsDecomposedByFunctions <em>Is Decomposed By Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Element, Standard {
	/**
	 * Returns the value of the '<em><b>Is Performed By Actors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getPerformsFunctions <em>Performs Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Performed By Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Performed By Actors</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction_IsPerformedByActors()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getPerformsFunctions
	 * @model opposite="performsFunctions"
	 * @generated
	 */
	EList<Actor> getIsPerformedByActors();

	/**
	 * Returns the value of the '<em><b>Is Owned By Organization Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOwnsFunctions <em>Owns Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Owned By Organization Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Owned By Organization Unit</em>' reference.
	 * @see #setIsOwnedByOrganizationUnit(OrganizationUnit)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction_IsOwnedByOrganizationUnit()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOwnsFunctions
	 * @model opposite="ownsFunctions"
	 * @generated
	 */
	OrganizationUnit getIsOwnedByOrganizationUnit();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsOwnedByOrganizationUnit <em>Is Owned By Organization Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Owned By Organization Unit</em>' reference.
	 * @see #getIsOwnedByOrganizationUnit()
	 * @generated
	 */
	void setIsOwnedByOrganizationUnit(OrganizationUnit value);

	/**
	 * Returns the value of the '<em><b>Is Bounded By Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getProvidesGovernedInterfaceToAccessFunctions <em>Provides Governed Interface To Access Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Bounded By Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bounded By Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction_IsBoundedByServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getProvidesGovernedInterfaceToAccessFunctions
	 * @model opposite="providesGovernedInterfaceToAccessFunctions"
	 * @generated
	 */
	EList<Service> getIsBoundedByServices();

	/**
	 * Returns the value of the '<em><b>Supports Processes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesFunctions <em>Decomposes Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Processes</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction_SupportsProcesses()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesFunctions
	 * @model opposite="decomposesFunctions"
	 * @generated
	 */
	EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getSupportsProcesses();

	/**
	 * Returns the value of the '<em><b>Is Realized By Processes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getOrchestratesFunctions <em>Orchestrates Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Realized By Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Realized By Processes</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction_IsRealizedByProcesses()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getOrchestratesFunctions
	 * @model opposite="orchestratesFunctions"
	 * @generated
	 */
	EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsRealizedByProcesses();

	/**
	 * Returns the value of the '<em><b>Can Be Accessed By Roles</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getAccessesFunctions <em>Accesses Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Be Accessed By Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Be Accessed By Roles</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction_CanBeAccessedByRoles()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getAccessesFunctions
	 * @model opposite="accessesFunctions"
	 * @generated
	 */
	EList<Role> getCanBeAccessedByRoles();

	/**
	 * Returns the value of the '<em><b>Supports Actors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getInteractsWithFunctions <em>Interacts With Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Actors</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction_SupportsActors()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getInteractsWithFunctions
	 * @model opposite="interactsWithFunctions"
	 * @generated
	 */
	EList<Actor> getSupportsActors();

	/**
	 * Returns the value of the '<em><b>Decomposes Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsDecomposedByFunctions <em>Is Decomposed By Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Function</em>' reference.
	 * @see #setDecomposesFunction(Function)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction_DecomposesFunction()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsDecomposedByFunctions
	 * @model opposite="isDecomposedByFunctions"
	 * @generated
	 */
	Function getDecomposesFunction();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getDecomposesFunction <em>Decomposes Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Function</em>' reference.
	 * @see #getDecomposesFunction()
	 * @generated
	 */
	void setDecomposesFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Communicates With Functions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicates With Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicates With Functions</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction_CommunicatesWithFunctions()
	 * @model
	 * @generated
	 */
	EList<Function> getCommunicatesWithFunctions();

	/**
	 * Returns the value of the '<em><b>Is Decomposed By Functions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getDecomposesFunction <em>Decomposes Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By Functions</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getFunction_IsDecomposedByFunctions()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getDecomposesFunction
	 * @model opposite="decomposesFunction"
	 * @generated
	 */
	EList<Function> getIsDecomposedByFunctions();

} // Function
