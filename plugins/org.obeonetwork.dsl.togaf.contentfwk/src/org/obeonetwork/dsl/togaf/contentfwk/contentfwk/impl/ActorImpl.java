/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
	 * The default value of the '{@link #getFTEs() <em>FT Es</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTEs()
	 * @generated
	 * @ordered
	 */
	protected static final String FT_ES_EDEFAULT = null;
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
	 * The default value of the '{@link #getActorTasks() <em>Actor Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorTasks()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_TASKS_EDEFAULT = null;

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
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getSuppliesEntities() {
		return (EList<DataEntity>)eDynamicGet(ContentfwkPackage.ACTOR__SUPPLIES_ENTITIES, ContentfwkPackage.Literals.ACTOR__SUPPLIES_ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getConsumesEntities() {
		return (EList<DataEntity>)eDynamicGet(ContentfwkPackage.ACTOR__CONSUMES_ENTITIES, ContentfwkPackage.Literals.ACTOR__CONSUMES_ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit getBelongsTo() {
		return (OrganizationUnit)eDynamicGet(ContentfwkPackage.ACTOR__BELONGS_TO, ContentfwkPackage.Literals.ACTOR__BELONGS_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit basicGetBelongsTo() {
		return (OrganizationUnit)eDynamicGet(ContentfwkPackage.ACTOR__BELONGS_TO, ContentfwkPackage.Literals.ACTOR__BELONGS_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsTo(OrganizationUnit newBelongsTo, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBelongsTo, ContentfwkPackage.ACTOR__BELONGS_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(OrganizationUnit newBelongsTo) {
		eDynamicSet(ContentfwkPackage.ACTOR__BELONGS_TO, ContentfwkPackage.Literals.ACTOR__BELONGS_TO, newBelongsTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getInteractsWithFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.ACTOR__INTERACTS_WITH_FUNCTIONS, ContentfwkPackage.Literals.ACTOR__INTERACTS_WITH_FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getPerformsTaskInRoles() {
		return (EList<Role>)eDynamicGet(ContentfwkPackage.ACTOR__PERFORMS_TASK_IN_ROLES, ContentfwkPackage.Literals.ACTOR__PERFORMS_TASK_IN_ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getParticipatesInProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.ACTOR__PARTICIPATES_IN_PROCESSES, ContentfwkPackage.Literals.ACTOR__PARTICIPATES_IN_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getConsumesServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.ACTOR__CONSUMES_SERVICES, ContentfwkPackage.Literals.ACTOR__CONSUMES_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getResolvesEvents() {
		return (EList<Event>)eDynamicGet(ContentfwkPackage.ACTOR__RESOLVES_EVENTS, ContentfwkPackage.Literals.ACTOR__RESOLVES_EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getGeneratesEvents() {
		return (EList<Event>)eDynamicGet(ContentfwkPackage.ACTOR__GENERATES_EVENTS, ContentfwkPackage.Literals.ACTOR__GENERATES_EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getOperatesInLocation() {
		return (Location)eDynamicGet(ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION, ContentfwkPackage.Literals.ACTOR__OPERATES_IN_LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetOperatesInLocation() {
		return (Location)eDynamicGet(ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION, ContentfwkPackage.Literals.ACTOR__OPERATES_IN_LOCATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatesInLocation(Location newOperatesInLocation, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOperatesInLocation, ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatesInLocation(Location newOperatesInLocation) {
		eDynamicSet(ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION, ContentfwkPackage.Literals.ACTOR__OPERATES_IN_LOCATION, newOperatesInLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFTEs() {
		return (String)eDynamicGet(ContentfwkPackage.ACTOR__FT_ES, ContentfwkPackage.Literals.ACTOR__FT_ES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFTEs(String newFTEs) {
		eDynamicSet(ContentfwkPackage.ACTOR__FT_ES, ContentfwkPackage.Literals.ACTOR__FT_ES, newFTEs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorGoal() {
		return (String)eDynamicGet(ContentfwkPackage.ACTOR__ACTOR_GOAL, ContentfwkPackage.Literals.ACTOR__ACTOR_GOAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorGoal(String newActorGoal) {
		eDynamicSet(ContentfwkPackage.ACTOR__ACTOR_GOAL, ContentfwkPackage.Literals.ACTOR__ACTOR_GOAL, newActorGoal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorTasks() {
		return (String)eDynamicGet(ContentfwkPackage.ACTOR__ACTOR_TASKS, ContentfwkPackage.Literals.ACTOR__ACTOR_TASKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorTasks(String newActorTasks) {
		eDynamicSet(ContentfwkPackage.ACTOR__ACTOR_TASKS, ContentfwkPackage.Literals.ACTOR__ACTOR_TASKS, newActorTasks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getPerformsFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.ACTOR__PERFORMS_FUNCTIONS, ContentfwkPackage.Literals.ACTOR__PERFORMS_FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getDecomposesActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.ACTOR__DECOMPOSES_ACTORS, ContentfwkPackage.Literals.ACTOR__DECOMPOSES_ACTORS, true, true);
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
				OrganizationUnit belongsTo = basicGetBelongsTo();
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
				Location operatesInLocation = basicGetOperatesInLocation();
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
				return !getSuppliesEntities().isEmpty();
			case ContentfwkPackage.ACTOR__CONSUMES_ENTITIES:
				return !getConsumesEntities().isEmpty();
			case ContentfwkPackage.ACTOR__BELONGS_TO:
				return basicGetBelongsTo() != null;
			case ContentfwkPackage.ACTOR__INTERACTS_WITH_FUNCTIONS:
				return !getInteractsWithFunctions().isEmpty();
			case ContentfwkPackage.ACTOR__PERFORMS_TASK_IN_ROLES:
				return !getPerformsTaskInRoles().isEmpty();
			case ContentfwkPackage.ACTOR__PARTICIPATES_IN_PROCESSES:
				return !getParticipatesInProcesses().isEmpty();
			case ContentfwkPackage.ACTOR__CONSUMES_SERVICES:
				return !getConsumesServices().isEmpty();
			case ContentfwkPackage.ACTOR__RESOLVES_EVENTS:
				return !getResolvesEvents().isEmpty();
			case ContentfwkPackage.ACTOR__GENERATES_EVENTS:
				return !getGeneratesEvents().isEmpty();
			case ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION:
				return basicGetOperatesInLocation() != null;
			case ContentfwkPackage.ACTOR__FT_ES:
				return FT_ES_EDEFAULT == null ? getFTEs() != null : !FT_ES_EDEFAULT.equals(getFTEs());
			case ContentfwkPackage.ACTOR__ACTOR_GOAL:
				return ACTOR_GOAL_EDEFAULT == null ? getActorGoal() != null : !ACTOR_GOAL_EDEFAULT.equals(getActorGoal());
			case ContentfwkPackage.ACTOR__ACTOR_TASKS:
				return ACTOR_TASKS_EDEFAULT == null ? getActorTasks() != null : !ACTOR_TASKS_EDEFAULT.equals(getActorTasks());
			case ContentfwkPackage.ACTOR__PERFORMS_FUNCTIONS:
				return !getPerformsFunctions().isEmpty();
			case ContentfwkPackage.ACTOR__DECOMPOSES_ACTORS:
				return !getDecomposesActors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
