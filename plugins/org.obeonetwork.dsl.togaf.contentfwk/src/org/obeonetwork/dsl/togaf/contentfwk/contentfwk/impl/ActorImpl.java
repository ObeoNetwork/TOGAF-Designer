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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getSuppliesEntities <em>Supplies Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getConsumesEntities <em>Consumes Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getInteractsWithFunctions <em>Interacts With Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getPerformsTaskInRoles <em>Performs Task In Roles</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getParticipatesInProcesses <em>Participates In Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getConsumesServices <em>Consumes Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getResolvesEvents <em>Resolves Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getGeneratesEvents <em>Generates Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getOperatesInLocation <em>Operates In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getFTEs <em>FT Es</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getActorGoal <em>Actor Goal</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getActorTasks <em>Actor Tasks</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getPerformsFunctions <em>Performs Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl#getDecomposesActors <em>Decomposes Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends ElementImpl implements Actor {
	/**
	 * The cached value of the '{@link #getSuppliesEntities() <em>Supplies Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliesEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<DataEntity> suppliesEntities;

	/**
	 * The cached value of the '{@link #getConsumesEntities() <em>Consumes Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumesEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<DataEntity> consumesEntities;

	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected OrganizationUnit belongsTo;

	/**
	 * The cached value of the '{@link #getInteractsWithFunctions() <em>Interacts With Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractsWithFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> interactsWithFunctions;

	/**
	 * The cached value of the '{@link #getPerformsTaskInRoles() <em>Performs Task In Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformsTaskInRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> performsTaskInRoles;

	/**
	 * The cached value of the '{@link #getParticipatesInProcesses() <em>Participates In Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatesInProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> participatesInProcesses;

	/**
	 * The cached value of the '{@link #getConsumesServices() <em>Consumes Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumesServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> consumesServices;

	/**
	 * The cached value of the '{@link #getResolvesEvents() <em>Resolves Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvesEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> resolvesEvents;

	/**
	 * The cached value of the '{@link #getGeneratesEvents() <em>Generates Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratesEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> generatesEvents;

	/**
	 * The cached value of the '{@link #getOperatesInLocation() <em>Operates In Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatesInLocation()
	 * @generated
	 * @ordered
	 */
	protected Location operatesInLocation;

	/**
	 * The default value of the '{@link #getFTEs() <em>FT Es</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTEs()
	 * @generated
	 * @ordered
	 */
	protected static final String FT_ES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFTEs() <em>FT Es</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTEs()
	 * @generated
	 * @ordered
	 */
	protected String ftEs = FT_ES_EDEFAULT;

	/**
	 * The default value of the '{@link #getActorGoal() <em>Actor Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorGoal()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActorGoal() <em>Actor Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorGoal()
	 * @generated
	 * @ordered
	 */
	protected String actorGoal = ACTOR_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActorTasks() <em>Actor Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorTasks()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_TASKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActorTasks() <em>Actor Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorTasks()
	 * @generated
	 * @ordered
	 */
	protected String actorTasks = ACTOR_TASKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerformsFunctions() <em>Performs Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformsFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> performsFunctions;

	/**
	 * The cached value of the '{@link #getDecomposesActors() <em>Decomposes Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> decomposesActors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataEntity> getSuppliesEntities() {
		if (suppliesEntities == null) {
			suppliesEntities = new EObjectWithInverseResolvingEList.ManyInverse<DataEntity>(DataEntity.class, this, ContentfwkPackage.ACTOR__SUPPLIES_ENTITIES, ContentfwkPackage.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS);
		}
		return suppliesEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataEntity> getConsumesEntities() {
		if (consumesEntities == null) {
			consumesEntities = new EObjectWithInverseResolvingEList.ManyInverse<DataEntity>(DataEntity.class, this, ContentfwkPackage.ACTOR__CONSUMES_ENTITIES, ContentfwkPackage.DATA_ENTITY__IS_CONSUMED_BY_ACTORS);
		}
		return consumesEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit getBelongsTo() {
		if (belongsTo != null && belongsTo.eIsProxy()) {
			InternalEObject oldBelongsTo = (InternalEObject)belongsTo;
			belongsTo = (OrganizationUnit)eResolveProxy(oldBelongsTo);
			if (belongsTo != oldBelongsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.ACTOR__BELONGS_TO, oldBelongsTo, belongsTo));
			}
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit basicGetBelongsTo() {
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsTo(OrganizationUnit newBelongsTo, NotificationChain msgs) {
		OrganizationUnit oldBelongsTo = belongsTo;
		belongsTo = newBelongsTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ACTOR__BELONGS_TO, oldBelongsTo, newBelongsTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(OrganizationUnit newBelongsTo) {
		if (newBelongsTo != belongsTo) {
			NotificationChain msgs = null;
			if (belongsTo != null)
				msgs = ((InternalEObject)belongsTo).eInverseRemove(this, ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS, OrganizationUnit.class, msgs);
			if (newBelongsTo != null)
				msgs = ((InternalEObject)newBelongsTo).eInverseAdd(this, ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS, OrganizationUnit.class, msgs);
			msgs = basicSetBelongsTo(newBelongsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ACTOR__BELONGS_TO, newBelongsTo, newBelongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getInteractsWithFunctions() {
		if (interactsWithFunctions == null) {
			interactsWithFunctions = new EObjectWithInverseResolvingEList.ManyInverse<Function>(Function.class, this, ContentfwkPackage.ACTOR__INTERACTS_WITH_FUNCTIONS, ContentfwkPackage.FUNCTION__SUPPORTS_ACTORS);
		}
		return interactsWithFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getPerformsTaskInRoles() {
		if (performsTaskInRoles == null) {
			performsTaskInRoles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, ContentfwkPackage.ACTOR__PERFORMS_TASK_IN_ROLES, ContentfwkPackage.ROLE__IS_ASSUMED_BY_ACTORS);
		}
		return performsTaskInRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getParticipatesInProcesses() {
		if (participatesInProcesses == null) {
			participatesInProcesses = new EObjectWithInverseResolvingEList.ManyInverse<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.ACTOR__PARTICIPATES_IN_PROCESSES, ContentfwkPackage.PROCESS__INVOLVES_ACTORS);
		}
		return participatesInProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getConsumesServices() {
		if (consumesServices == null) {
			consumesServices = new EObjectResolvingEList<Service>(Service.class, this, ContentfwkPackage.ACTOR__CONSUMES_SERVICES);
		}
		return consumesServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getResolvesEvents() {
		if (resolvesEvents == null) {
			resolvesEvents = new EObjectWithInverseResolvingEList.ManyInverse<Event>(Event.class, this, ContentfwkPackage.ACTOR__RESOLVES_EVENTS, ContentfwkPackage.EVENT__IS_RESOLVED_BY_ACTORS);
		}
		return resolvesEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getGeneratesEvents() {
		if (generatesEvents == null) {
			generatesEvents = new EObjectWithInverseResolvingEList<Event>(Event.class, this, ContentfwkPackage.ACTOR__GENERATES_EVENTS, ContentfwkPackage.EVENT__IS_GENERATED_BY_ACTORS);
		}
		return generatesEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getOperatesInLocation() {
		if (operatesInLocation != null && operatesInLocation.eIsProxy()) {
			InternalEObject oldOperatesInLocation = (InternalEObject)operatesInLocation;
			operatesInLocation = (Location)eResolveProxy(oldOperatesInLocation);
			if (operatesInLocation != oldOperatesInLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION, oldOperatesInLocation, operatesInLocation));
			}
		}
		return operatesInLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetOperatesInLocation() {
		return operatesInLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatesInLocation(Location newOperatesInLocation, NotificationChain msgs) {
		Location oldOperatesInLocation = operatesInLocation;
		operatesInLocation = newOperatesInLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION, oldOperatesInLocation, newOperatesInLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatesInLocation(Location newOperatesInLocation) {
		if (newOperatesInLocation != operatesInLocation) {
			NotificationChain msgs = null;
			if (operatesInLocation != null)
				msgs = ((InternalEObject)operatesInLocation).eInverseRemove(this, ContentfwkPackage.LOCATION__CONTAINS_ACTORS, Location.class, msgs);
			if (newOperatesInLocation != null)
				msgs = ((InternalEObject)newOperatesInLocation).eInverseAdd(this, ContentfwkPackage.LOCATION__CONTAINS_ACTORS, Location.class, msgs);
			msgs = basicSetOperatesInLocation(newOperatesInLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION, newOperatesInLocation, newOperatesInLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFTEs() {
		return ftEs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFTEs(String newFTEs) {
		String oldFTEs = ftEs;
		ftEs = newFTEs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ACTOR__FT_ES, oldFTEs, ftEs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorGoal() {
		return actorGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorGoal(String newActorGoal) {
		String oldActorGoal = actorGoal;
		actorGoal = newActorGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ACTOR__ACTOR_GOAL, oldActorGoal, actorGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorTasks() {
		return actorTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorTasks(String newActorTasks) {
		String oldActorTasks = actorTasks;
		actorTasks = newActorTasks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ACTOR__ACTOR_TASKS, oldActorTasks, actorTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getPerformsFunctions() {
		if (performsFunctions == null) {
			performsFunctions = new EObjectWithInverseResolvingEList.ManyInverse<Function>(Function.class, this, ContentfwkPackage.ACTOR__PERFORMS_FUNCTIONS, ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS);
		}
		return performsFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getDecomposesActors() {
		if (decomposesActors == null) {
			decomposesActors = new EObjectResolvingEList<Actor>(Actor.class, this, ContentfwkPackage.ACTOR__DECOMPOSES_ACTORS);
		}
		return decomposesActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.ACTOR__SUPPLIES_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuppliesEntities()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__CONSUMES_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumesEntities()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__BELONGS_TO:
				if (belongsTo != null)
					msgs = ((InternalEObject)belongsTo).eInverseRemove(this, ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS, OrganizationUnit.class, msgs);
				return basicSetBelongsTo((OrganizationUnit)otherEnd, msgs);
			case ContentfwkPackage.ACTOR__INTERACTS_WITH_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInteractsWithFunctions()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__PERFORMS_TASK_IN_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerformsTaskInRoles()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__PARTICIPATES_IN_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipatesInProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__RESOLVES_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvesEvents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__GENERATES_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratesEvents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION:
				if (operatesInLocation != null)
					msgs = ((InternalEObject)operatesInLocation).eInverseRemove(this, ContentfwkPackage.LOCATION__CONTAINS_ACTORS, Location.class, msgs);
				return basicSetOperatesInLocation((Location)otherEnd, msgs);
			case ContentfwkPackage.ACTOR__PERFORMS_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerformsFunctions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.ACTOR__SUPPLIES_ENTITIES:
				return ((InternalEList<?>)getSuppliesEntities()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__CONSUMES_ENTITIES:
				return ((InternalEList<?>)getConsumesEntities()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__BELONGS_TO:
				return basicSetBelongsTo(null, msgs);
			case ContentfwkPackage.ACTOR__INTERACTS_WITH_FUNCTIONS:
				return ((InternalEList<?>)getInteractsWithFunctions()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__PERFORMS_TASK_IN_ROLES:
				return ((InternalEList<?>)getPerformsTaskInRoles()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__PARTICIPATES_IN_PROCESSES:
				return ((InternalEList<?>)getParticipatesInProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__RESOLVES_EVENTS:
				return ((InternalEList<?>)getResolvesEvents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__GENERATES_EVENTS:
				return ((InternalEList<?>)getGeneratesEvents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION:
				return basicSetOperatesInLocation(null, msgs);
			case ContentfwkPackage.ACTOR__PERFORMS_FUNCTIONS:
				return ((InternalEList<?>)getPerformsFunctions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentfwkPackage.ACTOR__SUPPLIES_ENTITIES:
				return getSuppliesEntities();
			case ContentfwkPackage.ACTOR__CONSUMES_ENTITIES:
				return getConsumesEntities();
			case ContentfwkPackage.ACTOR__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
			case ContentfwkPackage.ACTOR__INTERACTS_WITH_FUNCTIONS:
				return getInteractsWithFunctions();
			case ContentfwkPackage.ACTOR__PERFORMS_TASK_IN_ROLES:
				return getPerformsTaskInRoles();
			case ContentfwkPackage.ACTOR__PARTICIPATES_IN_PROCESSES:
				return getParticipatesInProcesses();
			case ContentfwkPackage.ACTOR__CONSUMES_SERVICES:
				return getConsumesServices();
			case ContentfwkPackage.ACTOR__RESOLVES_EVENTS:
				return getResolvesEvents();
			case ContentfwkPackage.ACTOR__GENERATES_EVENTS:
				return getGeneratesEvents();
			case ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION:
				if (resolve) return getOperatesInLocation();
				return basicGetOperatesInLocation();
			case ContentfwkPackage.ACTOR__FT_ES:
				return getFTEs();
			case ContentfwkPackage.ACTOR__ACTOR_GOAL:
				return getActorGoal();
			case ContentfwkPackage.ACTOR__ACTOR_TASKS:
				return getActorTasks();
			case ContentfwkPackage.ACTOR__PERFORMS_FUNCTIONS:
				return getPerformsFunctions();
			case ContentfwkPackage.ACTOR__DECOMPOSES_ACTORS:
				return getDecomposesActors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentfwkPackage.ACTOR__SUPPLIES_ENTITIES:
				getSuppliesEntities().clear();
				getSuppliesEntities().addAll((Collection<? extends DataEntity>)newValue);
				return;
			case ContentfwkPackage.ACTOR__CONSUMES_ENTITIES:
				getConsumesEntities().clear();
				getConsumesEntities().addAll((Collection<? extends DataEntity>)newValue);
				return;
			case ContentfwkPackage.ACTOR__BELONGS_TO:
				setBelongsTo((OrganizationUnit)newValue);
				return;
			case ContentfwkPackage.ACTOR__INTERACTS_WITH_FUNCTIONS:
				getInteractsWithFunctions().clear();
				getInteractsWithFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ContentfwkPackage.ACTOR__PERFORMS_TASK_IN_ROLES:
				getPerformsTaskInRoles().clear();
				getPerformsTaskInRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ContentfwkPackage.ACTOR__PARTICIPATES_IN_PROCESSES:
				getParticipatesInProcesses().clear();
				getParticipatesInProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.ACTOR__CONSUMES_SERVICES:
				getConsumesServices().clear();
				getConsumesServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.ACTOR__RESOLVES_EVENTS:
				getResolvesEvents().clear();
				getResolvesEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ContentfwkPackage.ACTOR__GENERATES_EVENTS:
				getGeneratesEvents().clear();
				getGeneratesEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION:
				setOperatesInLocation((Location)newValue);
				return;
			case ContentfwkPackage.ACTOR__FT_ES:
				setFTEs((String)newValue);
				return;
			case ContentfwkPackage.ACTOR__ACTOR_GOAL:
				setActorGoal((String)newValue);
				return;
			case ContentfwkPackage.ACTOR__ACTOR_TASKS:
				setActorTasks((String)newValue);
				return;
			case ContentfwkPackage.ACTOR__PERFORMS_FUNCTIONS:
				getPerformsFunctions().clear();
				getPerformsFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ContentfwkPackage.ACTOR__DECOMPOSES_ACTORS:
				getDecomposesActors().clear();
				getDecomposesActors().addAll((Collection<? extends Actor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContentfwkPackage.ACTOR__SUPPLIES_ENTITIES:
				getSuppliesEntities().clear();
				return;
			case ContentfwkPackage.ACTOR__CONSUMES_ENTITIES:
				getConsumesEntities().clear();
				return;
			case ContentfwkPackage.ACTOR__BELONGS_TO:
				setBelongsTo((OrganizationUnit)null);
				return;
			case ContentfwkPackage.ACTOR__INTERACTS_WITH_FUNCTIONS:
				getInteractsWithFunctions().clear();
				return;
			case ContentfwkPackage.ACTOR__PERFORMS_TASK_IN_ROLES:
				getPerformsTaskInRoles().clear();
				return;
			case ContentfwkPackage.ACTOR__PARTICIPATES_IN_PROCESSES:
				getParticipatesInProcesses().clear();
				return;
			case ContentfwkPackage.ACTOR__CONSUMES_SERVICES:
				getConsumesServices().clear();
				return;
			case ContentfwkPackage.ACTOR__RESOLVES_EVENTS:
				getResolvesEvents().clear();
				return;
			case ContentfwkPackage.ACTOR__GENERATES_EVENTS:
				getGeneratesEvents().clear();
				return;
			case ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION:
				setOperatesInLocation((Location)null);
				return;
			case ContentfwkPackage.ACTOR__FT_ES:
				setFTEs(FT_ES_EDEFAULT);
				return;
			case ContentfwkPackage.ACTOR__ACTOR_GOAL:
				setActorGoal(ACTOR_GOAL_EDEFAULT);
				return;
			case ContentfwkPackage.ACTOR__ACTOR_TASKS:
				setActorTasks(ACTOR_TASKS_EDEFAULT);
				return;
			case ContentfwkPackage.ACTOR__PERFORMS_FUNCTIONS:
				getPerformsFunctions().clear();
				return;
			case ContentfwkPackage.ACTOR__DECOMPOSES_ACTORS:
				getDecomposesActors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContentfwkPackage.ACTOR__SUPPLIES_ENTITIES:
				return suppliesEntities != null && !suppliesEntities.isEmpty();
			case ContentfwkPackage.ACTOR__CONSUMES_ENTITIES:
				return consumesEntities != null && !consumesEntities.isEmpty();
			case ContentfwkPackage.ACTOR__BELONGS_TO:
				return belongsTo != null;
			case ContentfwkPackage.ACTOR__INTERACTS_WITH_FUNCTIONS:
				return interactsWithFunctions != null && !interactsWithFunctions.isEmpty();
			case ContentfwkPackage.ACTOR__PERFORMS_TASK_IN_ROLES:
				return performsTaskInRoles != null && !performsTaskInRoles.isEmpty();
			case ContentfwkPackage.ACTOR__PARTICIPATES_IN_PROCESSES:
				return participatesInProcesses != null && !participatesInProcesses.isEmpty();
			case ContentfwkPackage.ACTOR__CONSUMES_SERVICES:
				return consumesServices != null && !consumesServices.isEmpty();
			case ContentfwkPackage.ACTOR__RESOLVES_EVENTS:
				return resolvesEvents != null && !resolvesEvents.isEmpty();
			case ContentfwkPackage.ACTOR__GENERATES_EVENTS:
				return generatesEvents != null && !generatesEvents.isEmpty();
			case ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION:
				return operatesInLocation != null;
			case ContentfwkPackage.ACTOR__FT_ES:
				return FT_ES_EDEFAULT == null ? ftEs != null : !FT_ES_EDEFAULT.equals(ftEs);
			case ContentfwkPackage.ACTOR__ACTOR_GOAL:
				return ACTOR_GOAL_EDEFAULT == null ? actorGoal != null : !ACTOR_GOAL_EDEFAULT.equals(actorGoal);
			case ContentfwkPackage.ACTOR__ACTOR_TASKS:
				return ACTOR_TASKS_EDEFAULT == null ? actorTasks != null : !ACTOR_TASKS_EDEFAULT.equals(actorTasks);
			case ContentfwkPackage.ACTOR__PERFORMS_FUNCTIONS:
				return performsFunctions != null && !performsFunctions.isEmpty();
			case ContentfwkPackage.ACTOR__DECOMPOSES_ACTORS:
				return decomposesActors != null && !decomposesActors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (FTEs: ");
		result.append(ftEs);
		result.append(", actorGoal: ");
		result.append(actorGoal);
		result.append(", actorTasks: ");
		result.append(actorTasks);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
