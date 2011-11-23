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
import java.util.Date;

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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getStandardClass <em>Standard Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getStandardCreationDate <em>Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getLastStandardCreationDate <em>Last Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getNextStandardCreationDate <em>Next Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getRetireDate <em>Retire Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getIsProvidedToActors <em>Is Provided To Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getProvidesGovernedInterfaceToAccessFunctions <em>Provides Governed Interface To Access Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getProvidesEntities <em>Provides Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getConsumesEntities <em>Consumes Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getIsGovernedAndMeasuredByContracts <em>Is Governed And Measured By Contracts</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getResolvesEvents <em>Resolves Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getIsImplementedOnLogicalTechnologyComponents <em>Is Implemented On Logical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getIsRealizedThroughLogicalApplicationComponent <em>Is Realized Through Logical Application Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getIsOwnedAndGovernedByOrganizationUnits <em>Is Owned And Governed By Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getIsTrackedAgainstMeasures <em>Is Tracked Against Measures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getSupportsProcesses <em>Supports Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getIsRealizedByProcesses <em>Is Realized By Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getMeetsQualities <em>Meets Qualities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getConsumesServices <em>Consumes Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getDecomposesServices <em>Decomposes Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl#getSupportsObjective <em>Supports Objective</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessServiceImpl extends ElementImpl implements BusinessService {
	/**
	 * The default value of the '{@link #getStandardClass() <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardClass()
	 * @generated
	 * @ordered
	 */
	protected static final StandardsClass STANDARD_CLASS_EDEFAULT = StandardsClass.NON_STANDARD;
	/**
	 * The default value of the '{@link #getStandardCreationDate() <em>Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STANDARD_CREATION_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLastStandardCreationDate() <em>Last Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_STANDARD_CREATION_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNextStandardCreationDate() <em>Next Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NEXT_STANDARD_CREATION_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRetireDate() <em>Retire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetireDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RETIRE_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.BUSINESS_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardsClass getStandardClass() {
		return (StandardsClass)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eDynamicSet(ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, newStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardCreationDate(Date newLastStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, newLastStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardCreationDate(Date newNextStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, newNextStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return (Date)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		eDynamicSet(ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, newRetireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getIsProvidedToActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__IS_PROVIDED_TO_ACTORS, ContentfwkPackage.Literals.SERVICE__IS_PROVIDED_TO_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getProvidesGovernedInterfaceToAccessFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS, ContentfwkPackage.Literals.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getProvidesEntities() {
		return (EList<DataEntity>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES, ContentfwkPackage.Literals.SERVICE__PROVIDES_ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getConsumesEntities() {
		return (EList<DataEntity>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES, ContentfwkPackage.Literals.SERVICE__CONSUMES_ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contract> getIsGovernedAndMeasuredByContracts() {
		return (EList<Contract>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS, ContentfwkPackage.Literals.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getResolvesEvents() {
		return (EList<Event>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS, ContentfwkPackage.Literals.SERVICE__RESOLVES_EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalTechnologyComponent> getIsImplementedOnLogicalTechnologyComponents() {
		return (EList<LogicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalApplicationComponent> getIsRealizedThroughLogicalApplicationComponent() {
		return (EList<LogicalApplicationComponent>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT, ContentfwkPackage.Literals.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationUnit> getIsOwnedAndGovernedByOrganizationUnits() {
		return (EList<OrganizationUnit>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS, ContentfwkPackage.Literals.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Measure> getIsTrackedAgainstMeasures() {
		return (EList<Measure>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES, ContentfwkPackage.Literals.SERVICE__IS_TRACKED_AGAINST_MEASURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getSupportsProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES, ContentfwkPackage.Literals.SERVICE__SUPPORTS_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsRealizedByProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES, ContentfwkPackage.Literals.SERVICE__IS_REALIZED_BY_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceQuality> getMeetsQualities() {
		return (EList<ServiceQuality>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES, ContentfwkPackage.Literals.SERVICE__MEETS_QUALITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getConsumesServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_SERVICES, ContentfwkPackage.Literals.SERVICE__CONSUMES_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getDecomposesServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__DECOMPOSES_SERVICES, ContentfwkPackage.Literals.SERVICE__DECOMPOSES_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Objective> getSupportsObjective() {
		return (EList<Objective>)eDynamicGet(ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_OBJECTIVE, ContentfwkPackage.Literals.BUSINESS_SERVICE__SUPPORTS_OBJECTIVE, true, true);
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
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidesGovernedInterfaceToAccessFunctions()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidesEntities()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumesEntities()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsGovernedAndMeasuredByContracts()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvesEvents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsImplementedOnLogicalTechnologyComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRealizedThroughLogicalApplicationComponent()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsOwnedAndGovernedByOrganizationUnits()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsTrackedAgainstMeasures()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportsProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRealizedByProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeetsQualities()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				return ((InternalEList<?>)getProvidesGovernedInterfaceToAccessFunctions()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES:
				return ((InternalEList<?>)getProvidesEntities()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES:
				return ((InternalEList<?>)getConsumesEntities()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				return ((InternalEList<?>)getIsGovernedAndMeasuredByContracts()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS:
				return ((InternalEList<?>)getResolvesEvents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getIsImplementedOnLogicalTechnologyComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				return ((InternalEList<?>)getIsRealizedThroughLogicalApplicationComponent()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				return ((InternalEList<?>)getIsOwnedAndGovernedByOrganizationUnits()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES:
				return ((InternalEList<?>)getIsTrackedAgainstMeasures()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES:
				return ((InternalEList<?>)getSupportsProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES:
				return ((InternalEList<?>)getIsRealizedByProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES:
				return ((InternalEList<?>)getMeetsQualities()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CLASS:
				return getStandardClass();
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE:
				return getStandardCreationDate();
			case ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE:
				return getLastStandardCreationDate();
			case ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE:
				return getNextStandardCreationDate();
			case ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE:
				return getRetireDate();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_PROVIDED_TO_ACTORS:
				return getIsProvidedToActors();
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				return getProvidesGovernedInterfaceToAccessFunctions();
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES:
				return getProvidesEntities();
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES:
				return getConsumesEntities();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				return getIsGovernedAndMeasuredByContracts();
			case ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS:
				return getResolvesEvents();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return getIsImplementedOnLogicalTechnologyComponents();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				return getIsRealizedThroughLogicalApplicationComponent();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				return getIsOwnedAndGovernedByOrganizationUnits();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES:
				return getIsTrackedAgainstMeasures();
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES:
				return getSupportsProcesses();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES:
				return getIsRealizedByProcesses();
			case ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES:
				return getMeetsQualities();
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_SERVICES:
				return getConsumesServices();
			case ContentfwkPackage.BUSINESS_SERVICE__DECOMPOSES_SERVICES:
				return getDecomposesServices();
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_OBJECTIVE:
				return getSupportsObjective();
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
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CLASS:
				setStandardClass((StandardsClass)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE:
				setStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE:
				setRetireDate((Date)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_PROVIDED_TO_ACTORS:
				getIsProvidedToActors().clear();
				getIsProvidedToActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				getProvidesGovernedInterfaceToAccessFunctions().clear();
				getProvidesGovernedInterfaceToAccessFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES:
				getProvidesEntities().clear();
				getProvidesEntities().addAll((Collection<? extends DataEntity>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES:
				getConsumesEntities().clear();
				getConsumesEntities().addAll((Collection<? extends DataEntity>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				getIsGovernedAndMeasuredByContracts().clear();
				getIsGovernedAndMeasuredByContracts().addAll((Collection<? extends Contract>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS:
				getResolvesEvents().clear();
				getResolvesEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				getIsImplementedOnLogicalTechnologyComponents().clear();
				getIsImplementedOnLogicalTechnologyComponents().addAll((Collection<? extends LogicalTechnologyComponent>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				getIsRealizedThroughLogicalApplicationComponent().clear();
				getIsRealizedThroughLogicalApplicationComponent().addAll((Collection<? extends LogicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				getIsOwnedAndGovernedByOrganizationUnits().clear();
				getIsOwnedAndGovernedByOrganizationUnits().addAll((Collection<? extends OrganizationUnit>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES:
				getIsTrackedAgainstMeasures().clear();
				getIsTrackedAgainstMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES:
				getSupportsProcesses().clear();
				getSupportsProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES:
				getIsRealizedByProcesses().clear();
				getIsRealizedByProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES:
				getMeetsQualities().clear();
				getMeetsQualities().addAll((Collection<? extends ServiceQuality>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_SERVICES:
				getConsumesServices().clear();
				getConsumesServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__DECOMPOSES_SERVICES:
				getDecomposesServices().clear();
				getDecomposesServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_OBJECTIVE:
				getSupportsObjective().clear();
				getSupportsObjective().addAll((Collection<? extends Objective>)newValue);
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
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CLASS:
				setStandardClass(STANDARD_CLASS_EDEFAULT);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE:
				setStandardCreationDate(STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate(LAST_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate(NEXT_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE:
				setRetireDate(RETIRE_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_PROVIDED_TO_ACTORS:
				getIsProvidedToActors().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				getProvidesGovernedInterfaceToAccessFunctions().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES:
				getProvidesEntities().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES:
				getConsumesEntities().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				getIsGovernedAndMeasuredByContracts().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS:
				getResolvesEvents().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				getIsImplementedOnLogicalTechnologyComponents().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				getIsRealizedThroughLogicalApplicationComponent().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				getIsOwnedAndGovernedByOrganizationUnits().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES:
				getIsTrackedAgainstMeasures().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES:
				getSupportsProcesses().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES:
				getIsRealizedByProcesses().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES:
				getMeetsQualities().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_SERVICES:
				getConsumesServices().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__DECOMPOSES_SERVICES:
				getDecomposesServices().clear();
				return;
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_OBJECTIVE:
				getSupportsObjective().clear();
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
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CLASS:
				return getStandardClass() != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? getStandardCreationDate() != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(getStandardCreationDate());
			case ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? getLastStandardCreationDate() != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(getLastStandardCreationDate());
			case ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? getNextStandardCreationDate() != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(getNextStandardCreationDate());
			case ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? getRetireDate() != null : !RETIRE_DATE_EDEFAULT.equals(getRetireDate());
			case ContentfwkPackage.BUSINESS_SERVICE__IS_PROVIDED_TO_ACTORS:
				return !getIsProvidedToActors().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				return !getProvidesGovernedInterfaceToAccessFunctions().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES:
				return !getProvidesEntities().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES:
				return !getConsumesEntities().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				return !getIsGovernedAndMeasuredByContracts().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS:
				return !getResolvesEvents().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return !getIsImplementedOnLogicalTechnologyComponents().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				return !getIsRealizedThroughLogicalApplicationComponent().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				return !getIsOwnedAndGovernedByOrganizationUnits().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES:
				return !getIsTrackedAgainstMeasures().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES:
				return !getSupportsProcesses().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES:
				return !getIsRealizedByProcesses().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES:
				return !getMeetsQualities().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_SERVICES:
				return !getConsumesServices().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__DECOMPOSES_SERVICES:
				return !getDecomposesServices().isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_OBJECTIVE:
				return !getSupportsObjective().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Standard.class) {
			switch (derivedFeatureID) {
				case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CLASS: return ContentfwkPackage.STANDARD__STANDARD_CLASS;
				case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE;
				case ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE: return ContentfwkPackage.STANDARD__RETIRE_DATE;
				default: return -1;
			}
		}
		if (baseClass == Service.class) {
			switch (derivedFeatureID) {
				case ContentfwkPackage.BUSINESS_SERVICE__IS_PROVIDED_TO_ACTORS: return ContentfwkPackage.SERVICE__IS_PROVIDED_TO_ACTORS;
				case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS: return ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS;
				case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES: return ContentfwkPackage.SERVICE__PROVIDES_ENTITIES;
				case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES: return ContentfwkPackage.SERVICE__CONSUMES_ENTITIES;
				case ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS: return ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS;
				case ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS: return ContentfwkPackage.SERVICE__RESOLVES_EVENTS;
				case ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS: return ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS;
				case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT: return ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT;
				case ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS: return ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS;
				case ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES: return ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES;
				case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES: return ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES;
				case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES: return ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES;
				case ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES: return ContentfwkPackage.SERVICE__MEETS_QUALITIES;
				case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_SERVICES: return ContentfwkPackage.SERVICE__CONSUMES_SERVICES;
				case ContentfwkPackage.BUSINESS_SERVICE__DECOMPOSES_SERVICES: return ContentfwkPackage.SERVICE__DECOMPOSES_SERVICES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Standard.class) {
			switch (baseFeatureID) {
				case ContentfwkPackage.STANDARD__STANDARD_CLASS: return ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CLASS;
				case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE: return ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__RETIRE_DATE: return ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE;
				default: return -1;
			}
		}
		if (baseClass == Service.class) {
			switch (baseFeatureID) {
				case ContentfwkPackage.SERVICE__IS_PROVIDED_TO_ACTORS: return ContentfwkPackage.BUSINESS_SERVICE__IS_PROVIDED_TO_ACTORS;
				case ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS: return ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS;
				case ContentfwkPackage.SERVICE__PROVIDES_ENTITIES: return ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES;
				case ContentfwkPackage.SERVICE__CONSUMES_ENTITIES: return ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES;
				case ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS: return ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS;
				case ContentfwkPackage.SERVICE__RESOLVES_EVENTS: return ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS;
				case ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS: return ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS;
				case ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT: return ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT;
				case ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS: return ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS;
				case ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES: return ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES;
				case ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES: return ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES;
				case ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES: return ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES;
				case ContentfwkPackage.SERVICE__MEETS_QUALITIES: return ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES;
				case ContentfwkPackage.SERVICE__CONSUMES_SERVICES: return ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_SERVICES;
				case ContentfwkPackage.SERVICE__DECOMPOSES_SERVICES: return ContentfwkPackage.BUSINESS_SERVICE__DECOMPOSES_SERVICES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BusinessServiceImpl
