/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
		return (EList<DataEntity>)eGet(ContentfwkPackage.Literals.ACTOR__SUPPLIES_ENTITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getConsumesEntities() {
		return (EList<DataEntity>)eGet(ContentfwkPackage.Literals.ACTOR__CONSUMES_ENTITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit getBelongsTo() {
		return (OrganizationUnit)eGet(ContentfwkPackage.Literals.ACTOR__BELONGS_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(OrganizationUnit newBelongsTo) {
		eSet(ContentfwkPackage.Literals.ACTOR__BELONGS_TO, newBelongsTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getInteractsWithFunctions() {
		return (EList<Function>)eGet(ContentfwkPackage.Literals.ACTOR__INTERACTS_WITH_FUNCTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getPerformsTaskInRoles() {
		return (EList<Role>)eGet(ContentfwkPackage.Literals.ACTOR__PERFORMS_TASK_IN_ROLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getParticipatesInProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eGet(ContentfwkPackage.Literals.ACTOR__PARTICIPATES_IN_PROCESSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getConsumesServices() {
		return (EList<Service>)eGet(ContentfwkPackage.Literals.ACTOR__CONSUMES_SERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getResolvesEvents() {
		return (EList<Event>)eGet(ContentfwkPackage.Literals.ACTOR__RESOLVES_EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getGeneratesEvents() {
		return (EList<Event>)eGet(ContentfwkPackage.Literals.ACTOR__GENERATES_EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getOperatesInLocation() {
		return (Location)eGet(ContentfwkPackage.Literals.ACTOR__OPERATES_IN_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatesInLocation(Location newOperatesInLocation) {
		eSet(ContentfwkPackage.Literals.ACTOR__OPERATES_IN_LOCATION, newOperatesInLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFTEs() {
		return (String)eGet(ContentfwkPackage.Literals.ACTOR__FT_ES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFTEs(String newFTEs) {
		eSet(ContentfwkPackage.Literals.ACTOR__FT_ES, newFTEs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorGoal() {
		return (String)eGet(ContentfwkPackage.Literals.ACTOR__ACTOR_GOAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorGoal(String newActorGoal) {
		eSet(ContentfwkPackage.Literals.ACTOR__ACTOR_GOAL, newActorGoal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActorTasks() {
		return (String)eGet(ContentfwkPackage.Literals.ACTOR__ACTOR_TASKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorTasks(String newActorTasks) {
		eSet(ContentfwkPackage.Literals.ACTOR__ACTOR_TASKS, newActorTasks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getPerformsFunctions() {
		return (EList<Function>)eGet(ContentfwkPackage.Literals.ACTOR__PERFORMS_FUNCTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getDecomposesActors() {
		return (EList<Actor>)eGet(ContentfwkPackage.Literals.ACTOR__DECOMPOSES_ACTORS, true);
	}

} //ActorImpl
