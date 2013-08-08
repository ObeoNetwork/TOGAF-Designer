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
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A person, organization, or system that is outside the consideration of the architecture model, but interacts with it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getSuppliesDataEntities <em>Supplies Data Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getConsumesDataEntities <em>Consumes Data Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getBelongsToOrganizationUnit <em>Belongs To Organization Unit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getInteractsWithFunctions <em>Interacts With Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getPerformsTaskInRoles <em>Performs Task In Roles</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getParticipatesInProcesses <em>Participates In Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getConsumesServices <em>Consumes Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getResolvesEvents <em>Resolves Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getGeneratesEvents <em>Generates Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getOperatesInLocation <em>Operates In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getFTEs <em>FT Es</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getActorGoal <em>Actor Goal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getActorTasks <em>Actor Tasks</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getPerformsFunctions <em>Performs Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getDecomposesActor <em>Decomposes Actor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getIsDecomposedByActors <em>Is Decomposed By Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Element {
	/**
	 * Returns the value of the '<em><b>Supplies Data Entities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsSuppliedByActors <em>Is Supplied By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplies Data Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplies Data Entities</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_SuppliesDataEntities()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsSuppliedByActors
	 * @model opposite="isSuppliedByActors"
	 * @generated
	 */
	EList<DataEntity> getSuppliesDataEntities();

	/**
	 * Returns the value of the '<em><b>Consumes Data Entities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsConsumedByActors <em>Is Consumed By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumes Data Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes Data Entities</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_ConsumesDataEntities()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsConsumedByActors
	 * @model opposite="isConsumedByActors"
	 * @generated
	 */
	EList<DataEntity> getConsumesDataEntities();

	/**
	 * Returns the value of the '<em><b>Belongs To Organization Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getContainsActors <em>Contains Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Organization Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Organization Unit</em>' reference.
	 * @see #setBelongsToOrganizationUnit(OrganizationUnit)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_BelongsToOrganizationUnit()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getContainsActors
	 * @model opposite="containsActors"
	 * @generated
	 */
	OrganizationUnit getBelongsToOrganizationUnit();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getBelongsToOrganizationUnit <em>Belongs To Organization Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Organization Unit</em>' reference.
	 * @see #getBelongsToOrganizationUnit()
	 * @generated
	 */
	void setBelongsToOrganizationUnit(OrganizationUnit value);

	/**
	 * Returns the value of the '<em><b>Interacts With Functions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getSupportsActors <em>Supports Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interacts With Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interacts With Functions</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_InteractsWithFunctions()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getSupportsActors
	 * @model opposite="supportsActors"
	 * @generated
	 */
	EList<Function> getInteractsWithFunctions();

	/**
	 * Returns the value of the '<em><b>Performs Task In Roles</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getIsAssumedByActors <em>Is Assumed By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performs Task In Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs Task In Roles</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_PerformsTaskInRoles()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getIsAssumedByActors
	 * @model opposite="isAssumedByActors"
	 * @generated
	 */
	EList<Role> getPerformsTaskInRoles();

	/**
	 * Returns the value of the '<em><b>Participates In Processes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getInvolvesActors <em>Involves Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participates In Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participates In Processes</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_ParticipatesInProcesses()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getInvolvesActors
	 * @model opposite="involvesActors"
	 * @generated
	 */
	EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getParticipatesInProcesses();

	/**
	 * Returns the value of the '<em><b>Consumes Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsProvidedToActors <em>Is Provided To Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumes Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_ConsumesServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsProvidedToActors
	 * @model opposite="isProvidedToActors"
	 * @generated
	 */
	EList<Service> getConsumesServices();

	/**
	 * Returns the value of the '<em><b>Resolves Events</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByActors <em>Is Resolved By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolves Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolves Events</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_ResolvesEvents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByActors
	 * @model opposite="isResolvedByActors"
	 * @generated
	 */
	EList<Event> getResolvesEvents();

	/**
	 * Returns the value of the '<em><b>Generates Events</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsGeneratedByActors <em>Is Generated By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generates Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generates Events</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_GeneratesEvents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsGeneratedByActors
	 * @model opposite="isGeneratedByActors"
	 * @generated
	 */
	EList<Event> getGeneratesEvents();

	/**
	 * Returns the value of the '<em><b>Operates In Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsActors <em>Contains Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operates In Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operates In Location</em>' reference.
	 * @see #setOperatesInLocation(Location)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_OperatesInLocation()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsActors
	 * @model opposite="containsActors"
	 * @generated
	 */
	Location getOperatesInLocation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getOperatesInLocation <em>Operates In Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operates In Location</em>' reference.
	 * @see #getOperatesInLocation()
	 * @generated
	 */
	void setOperatesInLocation(Location value);

	/**
	 * Returns the value of the '<em><b>FT Es</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated number of FTEs that operate as this Actor. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FT Es</em>' attribute.
	 * @see #setFTEs(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_FTEs()
	 * @model
	 * @generated
	 */
	String getFTEs();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getFTEs <em>FT Es</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FT Es</em>' attribute.
	 * @see #getFTEs()
	 * @generated
	 */
	void setFTEs(String value);

	/**
	 * Returns the value of the '<em><b>Actor Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objectives that this actor has, in general terms. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor Goal</em>' attribute.
	 * @see #setActorGoal(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_ActorGoal()
	 * @model
	 * @generated
	 */
	String getActorGoal();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getActorGoal <em>Actor Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Goal</em>' attribute.
	 * @see #getActorGoal()
	 * @generated
	 */
	void setActorGoal(String value);

	/**
	 * Returns the value of the '<em><b>Actor Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tasks that this actor performs, in general terms. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor Tasks</em>' attribute.
	 * @see #setActorTasks(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_ActorTasks()
	 * @model
	 * @generated
	 */
	String getActorTasks();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getActorTasks <em>Actor Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Tasks</em>' attribute.
	 * @see #getActorTasks()
	 * @generated
	 */
	void setActorTasks(String value);

	/**
	 * Returns the value of the '<em><b>Performs Functions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsPerformedByActors <em>Is Performed By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performs Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs Functions</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_PerformsFunctions()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsPerformedByActors
	 * @model opposite="isPerformedByActors"
	 * @generated
	 */
	EList<Function> getPerformsFunctions();

	/**
	 * Returns the value of the '<em><b>Decomposes Actor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getIsDecomposedByActors <em>Is Decomposed By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Actor</em>' reference.
	 * @see #setDecomposesActor(Actor)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_DecomposesActor()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getIsDecomposedByActors
	 * @model opposite="isDecomposedByActors"
	 * @generated
	 */
	Actor getDecomposesActor();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getDecomposesActor <em>Decomposes Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Actor</em>' reference.
	 * @see #getDecomposesActor()
	 * @generated
	 */
	void setDecomposesActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Is Decomposed By Actors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getDecomposesActor <em>Decomposes Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By Actors</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getActor_IsDecomposedByActors()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getDecomposesActor
	 * @model opposite="decomposesActor"
	 * @generated
	 */
	EList<Actor> getIsDecomposedByActors();

} // Actor
