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
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An actor assumes a role to perform a task.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getIsAssumedByActors <em>Is Assumed By Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getAccessesFunctions <em>Accesses Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getEstimatedFTEs <em>Estimated FT Es</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getDecomposesRole <em>Decomposes Role</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getIsDecomposedByRoles <em>Is Decomposed By Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Element {
	/**
	 * Returns the value of the '<em><b>Is Assumed By Actors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getPerformsTaskInRoles <em>Performs Task In Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Assumed By Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Assumed By Actors</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getRole_IsAssumedByActors()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getPerformsTaskInRoles
	 * @model opposite="performsTaskInRoles"
	 * @generated
	 */
	EList<Actor> getIsAssumedByActors();

	/**
	 * Returns the value of the '<em><b>Accesses Functions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getCanBeAccessedByRoles <em>Can Be Accessed By Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses Functions</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getRole_AccessesFunctions()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getCanBeAccessedByRoles
	 * @model opposite="canBeAccessedByRoles"
	 * @generated
	 */
	EList<Function> getAccessesFunctions();

	/**
	 * Returns the value of the '<em><b>Estimated FT Es</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated number of FTEs that operate as this Actor. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated FT Es</em>' attribute.
	 * @see #setEstimatedFTEs(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getRole_EstimatedFTEs()
	 * @model
	 * @generated
	 */
	String getEstimatedFTEs();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getEstimatedFTEs <em>Estimated FT Es</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated FT Es</em>' attribute.
	 * @see #getEstimatedFTEs()
	 * @generated
	 */
	void setEstimatedFTEs(String value);

	/**
	 * Returns the value of the '<em><b>Decomposes Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getIsDecomposedByRoles <em>Is Decomposed By Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Role</em>' reference.
	 * @see #setDecomposesRole(Role)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getRole_DecomposesRole()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getIsDecomposedByRoles
	 * @model opposite="isDecomposedByRoles"
	 * @generated
	 */
	Role getDecomposesRole();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getDecomposesRole <em>Decomposes Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Role</em>' reference.
	 * @see #getDecomposesRole()
	 * @generated
	 */
	void setDecomposesRole(Role value);

	/**
	 * Returns the value of the '<em><b>Is Decomposed By Roles</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getDecomposesRole <em>Decomposes Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By Roles</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getRole_IsDecomposedByRoles()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getDecomposesRole
	 * @model opposite="decomposesRole"
	 * @generated
	 */
	EList<Role> getIsDecomposedByRoles();

} // Role
