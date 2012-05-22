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
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsActors <em>Contains Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsOrganizationUnits <em>Contains Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalDataComponents <em>Contains Physical Data Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalApplicationComponents <em>Contains Physical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalTechnologyComponents <em>Contains Physical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getDecomposesLocation <em>Decomposes Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends Element {
	/**
	 * Returns the value of the '<em><b>Contains Actors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getOperatesInLocation <em>Operates In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Actors</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLocation_ContainsActors()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getOperatesInLocation
	 * @model opposite="operatesInLocation"
	 * @generated
	 */
	EList<Actor> getContainsActors();

	/**
	 * Returns the value of the '<em><b>Contains Organization Units</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOperatesInLocation <em>Operates In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Organization Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Organization Units</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLocation_ContainsOrganizationUnits()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOperatesInLocation
	 * @model opposite="operatesInLocation"
	 * @generated
	 */
	EList<OrganizationUnit> getContainsOrganizationUnits();

	/**
	 * Returns the value of the '<em><b>Contains Physical Data Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getIsHotedInLocation <em>Is Hoted In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Physical Data Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Physical Data Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLocation_ContainsPhysicalDataComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getIsHotedInLocation
	 * @model opposite="isHotedInLocation"
	 * @generated
	 */
	EList<PhysicalDataComponent> getContainsPhysicalDataComponents();

	/**
	 * Returns the value of the '<em><b>Contains Physical Application Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsHostedInLocation <em>Is Hosted In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Physical Application Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Physical Application Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLocation_ContainsPhysicalApplicationComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsHostedInLocation
	 * @model opposite="isHostedInLocation"
	 * @generated
	 */
	EList<PhysicalApplicationComponent> getContainsPhysicalApplicationComponents();

	/**
	 * Returns the value of the '<em><b>Contains Physical Technology Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsHostedInLocation <em>Is Hosted In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Physical Technology Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Physical Technology Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLocation_ContainsPhysicalTechnologyComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsHostedInLocation
	 * @model opposite="isHostedInLocation"
	 * @generated
	 */
	EList<PhysicalTechnologyComponent> getContainsPhysicalTechnologyComponents();

	/**
	 * Returns the value of the '<em><b>Decomposes Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Location</em>' reference.
	 * @see #setDecomposesLocation(Location)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getLocation_DecomposesLocation()
	 * @model
	 * @generated
	 */
	Location getDecomposesLocation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getDecomposesLocation <em>Decomposes Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Location</em>' reference.
	 * @see #getDecomposesLocation()
	 * @generated
	 */
	void setDecomposesLocation(Location value);

} // Location
