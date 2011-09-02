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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getIsProvidedToActors <em>Is Provided To Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getProvidesGovernedInterfaceToAccessFunctions <em>Provides Governed Interface To Access Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getProvidesEntities <em>Provides Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getConsumesEntities <em>Consumes Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getIsGovernedAndMeasuredByContracts <em>Is Governed And Measured By Contracts</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getResolvesEvents <em>Resolves Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getIsImplementedOnLogicalTechnologyComponents <em>Is Implemented On Logical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getIsRealizedThroughLogicalApplicationComponent <em>Is Realized Through Logical Application Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getIsOwnedAndGovernedByOrganizationUnits <em>Is Owned And Governed By Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getIsTrackedAgainstMeasures <em>Is Tracked Against Measures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getSupportsProcesses <em>Supports Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getIsRealizedByProcesses <em>Is Realized By Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getMeetsQualities <em>Meets Qualities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getConsumesServices <em>Consumes Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl#getDecomposesServices <em>Decomposes Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ServiceImpl extends StandardImpl implements Service {
	/**
	 * The cached value of the '{@link #getIsProvidedToActors() <em>Is Provided To Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsProvidedToActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> isProvidedToActors;

	/**
	 * The cached value of the '{@link #getProvidesGovernedInterfaceToAccessFunctions() <em>Provides Governed Interface To Access Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesGovernedInterfaceToAccessFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> providesGovernedInterfaceToAccessFunctions;

	/**
	 * The cached value of the '{@link #getProvidesEntities() <em>Provides Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<DataEntity> providesEntities;

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
	 * The cached value of the '{@link #getIsGovernedAndMeasuredByContracts() <em>Is Governed And Measured By Contracts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGovernedAndMeasuredByContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> isGovernedAndMeasuredByContracts;

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
	 * The cached value of the '{@link #getIsImplementedOnLogicalTechnologyComponents() <em>Is Implemented On Logical Technology Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsImplementedOnLogicalTechnologyComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalTechnologyComponent> isImplementedOnLogicalTechnologyComponents;

	/**
	 * The cached value of the '{@link #getIsRealizedThroughLogicalApplicationComponent() <em>Is Realized Through Logical Application Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRealizedThroughLogicalApplicationComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalApplicationComponent> isRealizedThroughLogicalApplicationComponent;

	/**
	 * The cached value of the '{@link #getIsOwnedAndGovernedByOrganizationUnits() <em>Is Owned And Governed By Organization Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOwnedAndGovernedByOrganizationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationUnit> isOwnedAndGovernedByOrganizationUnits;

	/**
	 * The cached value of the '{@link #getIsTrackedAgainstMeasures() <em>Is Tracked Against Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTrackedAgainstMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> isTrackedAgainstMeasures;

	/**
	 * The cached value of the '{@link #getSupportsProcesses() <em>Supports Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> supportsProcesses;

	/**
	 * The cached value of the '{@link #getIsRealizedByProcesses() <em>Is Realized By Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRealizedByProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> isRealizedByProcesses;

	/**
	 * The cached value of the '{@link #getMeetsQualities() <em>Meets Qualities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetsQualities()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceQuality> meetsQualities;

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
	 * The cached value of the '{@link #getDecomposesServices() <em>Decomposes Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> decomposesServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getIsProvidedToActors() {
		if (isProvidedToActors == null) {
			isProvidedToActors = new EObjectResolvingEList<Actor>(Actor.class, this, ContentfwkPackage.SERVICE__IS_PROVIDED_TO_ACTORS);
		}
		return isProvidedToActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getProvidesGovernedInterfaceToAccessFunctions() {
		if (providesGovernedInterfaceToAccessFunctions == null) {
			providesGovernedInterfaceToAccessFunctions = new EObjectWithInverseResolvingEList.ManyInverse<Function>(Function.class, this, ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS, ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES);
		}
		return providesGovernedInterfaceToAccessFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataEntity> getProvidesEntities() {
		if (providesEntities == null) {
			providesEntities = new EObjectWithInverseResolvingEList.ManyInverse<DataEntity>(DataEntity.class, this, ContentfwkPackage.SERVICE__PROVIDES_ENTITIES, ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES);
		}
		return providesEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataEntity> getConsumesEntities() {
		if (consumesEntities == null) {
			consumesEntities = new EObjectWithInverseResolvingEList.ManyInverse<DataEntity>(DataEntity.class, this, ContentfwkPackage.SERVICE__CONSUMES_ENTITIES, ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES);
		}
		return consumesEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contract> getIsGovernedAndMeasuredByContracts() {
		if (isGovernedAndMeasuredByContracts == null) {
			isGovernedAndMeasuredByContracts = new EObjectWithInverseResolvingEList.ManyInverse<Contract>(Contract.class, this, ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS, ContentfwkPackage.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES);
		}
		return isGovernedAndMeasuredByContracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getResolvesEvents() {
		if (resolvesEvents == null) {
			resolvesEvents = new EObjectWithInverseResolvingEList.ManyInverse<Event>(Event.class, this, ContentfwkPackage.SERVICE__RESOLVES_EVENTS, ContentfwkPackage.EVENT__IS_RESOLVED_BY_BUSINESS_SERVICES);
		}
		return resolvesEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalTechnologyComponent> getIsImplementedOnLogicalTechnologyComponents() {
		if (isImplementedOnLogicalTechnologyComponents == null) {
			isImplementedOnLogicalTechnologyComponents = new EObjectWithInverseResolvingEList.ManyInverse<LogicalTechnologyComponent>(LogicalTechnologyComponent.class, this, ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES);
		}
		return isImplementedOnLogicalTechnologyComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalApplicationComponent> getIsRealizedThroughLogicalApplicationComponent() {
		if (isRealizedThroughLogicalApplicationComponent == null) {
			isRealizedThroughLogicalApplicationComponent = new EObjectWithInverseResolvingEList.ManyInverse<LogicalApplicationComponent>(LogicalApplicationComponent.class, this, ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES);
		}
		return isRealizedThroughLogicalApplicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationUnit> getIsOwnedAndGovernedByOrganizationUnits() {
		if (isOwnedAndGovernedByOrganizationUnits == null) {
			isOwnedAndGovernedByOrganizationUnits = new EObjectWithInverseResolvingEList.ManyInverse<OrganizationUnit>(OrganizationUnit.class, this, ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS, ContentfwkPackage.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES);
		}
		return isOwnedAndGovernedByOrganizationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getIsTrackedAgainstMeasures() {
		if (isTrackedAgainstMeasures == null) {
			isTrackedAgainstMeasures = new EObjectWithInverseResolvingEList.ManyInverse<Measure>(Measure.class, this, ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES, ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES);
		}
		return isTrackedAgainstMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getSupportsProcesses() {
		if (supportsProcesses == null) {
			supportsProcesses = new EObjectWithInverseResolvingEList.ManyInverse<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES, ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES);
		}
		return supportsProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsRealizedByProcesses() {
		if (isRealizedByProcesses == null) {
			isRealizedByProcesses = new EObjectWithInverseResolvingEList.ManyInverse<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES, ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES);
		}
		return isRealizedByProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceQuality> getMeetsQualities() {
		if (meetsQualities == null) {
			meetsQualities = new EObjectWithInverseResolvingEList.ManyInverse<ServiceQuality>(ServiceQuality.class, this, ContentfwkPackage.SERVICE__MEETS_QUALITIES, ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_SERVICES);
		}
		return meetsQualities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getConsumesServices() {
		if (consumesServices == null) {
			consumesServices = new EObjectResolvingEList<Service>(Service.class, this, ContentfwkPackage.SERVICE__CONSUMES_SERVICES);
		}
		return consumesServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getDecomposesServices() {
		if (decomposesServices == null) {
			decomposesServices = new EObjectResolvingEList<Service>(Service.class, this, ContentfwkPackage.SERVICE__DECOMPOSES_SERVICES);
		}
		return decomposesServices;
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
			case ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidesGovernedInterfaceToAccessFunctions()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__PROVIDES_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidesEntities()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__CONSUMES_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumesEntities()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsGovernedAndMeasuredByContracts()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__RESOLVES_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvesEvents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsImplementedOnLogicalTechnologyComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRealizedThroughLogicalApplicationComponent()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsOwnedAndGovernedByOrganizationUnits()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsTrackedAgainstMeasures()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportsProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRealizedByProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__MEETS_QUALITIES:
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
			case ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				return ((InternalEList<?>)getProvidesGovernedInterfaceToAccessFunctions()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__PROVIDES_ENTITIES:
				return ((InternalEList<?>)getProvidesEntities()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__CONSUMES_ENTITIES:
				return ((InternalEList<?>)getConsumesEntities()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				return ((InternalEList<?>)getIsGovernedAndMeasuredByContracts()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__RESOLVES_EVENTS:
				return ((InternalEList<?>)getResolvesEvents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getIsImplementedOnLogicalTechnologyComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				return ((InternalEList<?>)getIsRealizedThroughLogicalApplicationComponent()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				return ((InternalEList<?>)getIsOwnedAndGovernedByOrganizationUnits()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES:
				return ((InternalEList<?>)getIsTrackedAgainstMeasures()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES:
				return ((InternalEList<?>)getSupportsProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES:
				return ((InternalEList<?>)getIsRealizedByProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.SERVICE__MEETS_QUALITIES:
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
			case ContentfwkPackage.SERVICE__IS_PROVIDED_TO_ACTORS:
				return getIsProvidedToActors();
			case ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				return getProvidesGovernedInterfaceToAccessFunctions();
			case ContentfwkPackage.SERVICE__PROVIDES_ENTITIES:
				return getProvidesEntities();
			case ContentfwkPackage.SERVICE__CONSUMES_ENTITIES:
				return getConsumesEntities();
			case ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				return getIsGovernedAndMeasuredByContracts();
			case ContentfwkPackage.SERVICE__RESOLVES_EVENTS:
				return getResolvesEvents();
			case ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return getIsImplementedOnLogicalTechnologyComponents();
			case ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				return getIsRealizedThroughLogicalApplicationComponent();
			case ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				return getIsOwnedAndGovernedByOrganizationUnits();
			case ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES:
				return getIsTrackedAgainstMeasures();
			case ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES:
				return getSupportsProcesses();
			case ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES:
				return getIsRealizedByProcesses();
			case ContentfwkPackage.SERVICE__MEETS_QUALITIES:
				return getMeetsQualities();
			case ContentfwkPackage.SERVICE__CONSUMES_SERVICES:
				return getConsumesServices();
			case ContentfwkPackage.SERVICE__DECOMPOSES_SERVICES:
				return getDecomposesServices();
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
			case ContentfwkPackage.SERVICE__IS_PROVIDED_TO_ACTORS:
				getIsProvidedToActors().clear();
				getIsProvidedToActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				getProvidesGovernedInterfaceToAccessFunctions().clear();
				getProvidesGovernedInterfaceToAccessFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ContentfwkPackage.SERVICE__PROVIDES_ENTITIES:
				getProvidesEntities().clear();
				getProvidesEntities().addAll((Collection<? extends DataEntity>)newValue);
				return;
			case ContentfwkPackage.SERVICE__CONSUMES_ENTITIES:
				getConsumesEntities().clear();
				getConsumesEntities().addAll((Collection<? extends DataEntity>)newValue);
				return;
			case ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				getIsGovernedAndMeasuredByContracts().clear();
				getIsGovernedAndMeasuredByContracts().addAll((Collection<? extends Contract>)newValue);
				return;
			case ContentfwkPackage.SERVICE__RESOLVES_EVENTS:
				getResolvesEvents().clear();
				getResolvesEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				getIsImplementedOnLogicalTechnologyComponents().clear();
				getIsImplementedOnLogicalTechnologyComponents().addAll((Collection<? extends LogicalTechnologyComponent>)newValue);
				return;
			case ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				getIsRealizedThroughLogicalApplicationComponent().clear();
				getIsRealizedThroughLogicalApplicationComponent().addAll((Collection<? extends LogicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				getIsOwnedAndGovernedByOrganizationUnits().clear();
				getIsOwnedAndGovernedByOrganizationUnits().addAll((Collection<? extends OrganizationUnit>)newValue);
				return;
			case ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES:
				getIsTrackedAgainstMeasures().clear();
				getIsTrackedAgainstMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES:
				getSupportsProcesses().clear();
				getSupportsProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES:
				getIsRealizedByProcesses().clear();
				getIsRealizedByProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.SERVICE__MEETS_QUALITIES:
				getMeetsQualities().clear();
				getMeetsQualities().addAll((Collection<? extends ServiceQuality>)newValue);
				return;
			case ContentfwkPackage.SERVICE__CONSUMES_SERVICES:
				getConsumesServices().clear();
				getConsumesServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.SERVICE__DECOMPOSES_SERVICES:
				getDecomposesServices().clear();
				getDecomposesServices().addAll((Collection<? extends Service>)newValue);
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
			case ContentfwkPackage.SERVICE__IS_PROVIDED_TO_ACTORS:
				getIsProvidedToActors().clear();
				return;
			case ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				getProvidesGovernedInterfaceToAccessFunctions().clear();
				return;
			case ContentfwkPackage.SERVICE__PROVIDES_ENTITIES:
				getProvidesEntities().clear();
				return;
			case ContentfwkPackage.SERVICE__CONSUMES_ENTITIES:
				getConsumesEntities().clear();
				return;
			case ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				getIsGovernedAndMeasuredByContracts().clear();
				return;
			case ContentfwkPackage.SERVICE__RESOLVES_EVENTS:
				getResolvesEvents().clear();
				return;
			case ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				getIsImplementedOnLogicalTechnologyComponents().clear();
				return;
			case ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				getIsRealizedThroughLogicalApplicationComponent().clear();
				return;
			case ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				getIsOwnedAndGovernedByOrganizationUnits().clear();
				return;
			case ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES:
				getIsTrackedAgainstMeasures().clear();
				return;
			case ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES:
				getSupportsProcesses().clear();
				return;
			case ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES:
				getIsRealizedByProcesses().clear();
				return;
			case ContentfwkPackage.SERVICE__MEETS_QUALITIES:
				getMeetsQualities().clear();
				return;
			case ContentfwkPackage.SERVICE__CONSUMES_SERVICES:
				getConsumesServices().clear();
				return;
			case ContentfwkPackage.SERVICE__DECOMPOSES_SERVICES:
				getDecomposesServices().clear();
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
			case ContentfwkPackage.SERVICE__IS_PROVIDED_TO_ACTORS:
				return isProvidedToActors != null && !isProvidedToActors.isEmpty();
			case ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				return providesGovernedInterfaceToAccessFunctions != null && !providesGovernedInterfaceToAccessFunctions.isEmpty();
			case ContentfwkPackage.SERVICE__PROVIDES_ENTITIES:
				return providesEntities != null && !providesEntities.isEmpty();
			case ContentfwkPackage.SERVICE__CONSUMES_ENTITIES:
				return consumesEntities != null && !consumesEntities.isEmpty();
			case ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				return isGovernedAndMeasuredByContracts != null && !isGovernedAndMeasuredByContracts.isEmpty();
			case ContentfwkPackage.SERVICE__RESOLVES_EVENTS:
				return resolvesEvents != null && !resolvesEvents.isEmpty();
			case ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return isImplementedOnLogicalTechnologyComponents != null && !isImplementedOnLogicalTechnologyComponents.isEmpty();
			case ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				return isRealizedThroughLogicalApplicationComponent != null && !isRealizedThroughLogicalApplicationComponent.isEmpty();
			case ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				return isOwnedAndGovernedByOrganizationUnits != null && !isOwnedAndGovernedByOrganizationUnits.isEmpty();
			case ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES:
				return isTrackedAgainstMeasures != null && !isTrackedAgainstMeasures.isEmpty();
			case ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES:
				return supportsProcesses != null && !supportsProcesses.isEmpty();
			case ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES:
				return isRealizedByProcesses != null && !isRealizedByProcesses.isEmpty();
			case ContentfwkPackage.SERVICE__MEETS_QUALITIES:
				return meetsQualities != null && !meetsQualities.isEmpty();
			case ContentfwkPackage.SERVICE__CONSUMES_SERVICES:
				return consumesServices != null && !consumesServices.isEmpty();
			case ContentfwkPackage.SERVICE__DECOMPOSES_SERVICES:
				return decomposesServices != null && !decomposesServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
