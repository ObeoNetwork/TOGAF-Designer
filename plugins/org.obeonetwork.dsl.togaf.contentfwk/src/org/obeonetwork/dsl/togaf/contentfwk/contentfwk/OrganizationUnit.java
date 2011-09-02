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
 * A representation of the model object '<em><b>Organization Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A self-contained unit of resources with line management responsibility, goals, objectives, and measures. Organizations may include external parties and business partner organizations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOwnsAndGovernsServices <em>Owns And Governs Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getContainsActors <em>Contains Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOwnsFunctions <em>Owns Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getParticipatesInProcesses <em>Participates In Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getIsMotivatedByDrivers <em>Is Motivated By Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getProducesProducts <em>Produces Products</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOperatesInLocation <em>Operates In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getHeadcount <em>Headcount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getOrganizationUnit()
 * @model
 * @generated
 */
public interface OrganizationUnit extends Element {
	/**
	 * Returns the value of the '<em><b>Owns And Governs Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsOwnedAndGovernedByOrganizationUnits <em>Is Owned And Governed By Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns And Governs Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns And Governs Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getOrganizationUnit_OwnsAndGovernsServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsOwnedAndGovernedByOrganizationUnits
	 * @model opposite="isOwnedAndGovernedByOrganizationUnits"
	 * @generated
	 */
	EList<Service> getOwnsAndGovernsServices();

	/**
	 * Returns the value of the '<em><b>Contains Actors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Actors</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getOrganizationUnit_ContainsActors()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getBelongsTo
	 * @model opposite="belongsTo"
	 * @generated
	 */
	EList<Actor> getContainsActors();

	/**
	 * Returns the value of the '<em><b>Owns Functions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsOwnedByUnit <em>Is Owned By Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Functions</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getOrganizationUnit_OwnsFunctions()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsOwnedByUnit
	 * @model opposite="isOwnedByUnit"
	 * @generated
	 */
	EList<Function> getOwnsFunctions();

	/**
	 * Returns the value of the '<em><b>Participates In Processes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getInvolvesOrganizationUnits <em>Involves Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participates In Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participates In Processes</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getOrganizationUnit_ParticipatesInProcesses()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getInvolvesOrganizationUnits
	 * @model opposite="involvesOrganizationUnits"
	 * @generated
	 */
	EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getParticipatesInProcesses();

	/**
	 * Returns the value of the '<em><b>Is Motivated By Drivers</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getMotivatesOrganizationUnits <em>Motivates Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Motivated By Drivers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Motivated By Drivers</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getOrganizationUnit_IsMotivatedByDrivers()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getMotivatesOrganizationUnits
	 * @model opposite="motivatesOrganizationUnits"
	 * @generated
	 */
	EList<Driver> getIsMotivatedByDrivers();

	/**
	 * Returns the value of the '<em><b>Produces Products</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product#getIsProducedByOrganizationUnits <em>Is Produced By Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces Products</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getOrganizationUnit_ProducesProducts()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product#getIsProducedByOrganizationUnits
	 * @model opposite="isProducedByOrganizationUnits"
	 * @generated
	 */
	EList<Product> getProducesProducts();

	/**
	 * Returns the value of the '<em><b>Operates In Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsOrganizationUnits <em>Contains Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operates In Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operates In Location</em>' reference.
	 * @see #setOperatesInLocation(Location)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getOrganizationUnit_OperatesInLocation()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsOrganizationUnits
	 * @model opposite="containsOrganizationUnits"
	 * @generated
	 */
	Location getOperatesInLocation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOperatesInLocation <em>Operates In Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operates In Location</em>' reference.
	 * @see #getOperatesInLocation()
	 * @generated
	 */
	void setOperatesInLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Headcount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headcount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headcount</em>' attribute.
	 * @see #setHeadcount(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getOrganizationUnit_Headcount()
	 * @model
	 * @generated
	 */
	String getHeadcount();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getHeadcount <em>Headcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headcount</em>' attribute.
	 * @see #getHeadcount()
	 * @generated
	 */
	void setHeadcount(String value);

} // OrganizationUnit
