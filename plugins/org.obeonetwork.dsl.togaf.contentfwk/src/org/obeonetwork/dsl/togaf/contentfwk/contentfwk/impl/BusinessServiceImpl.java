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
		return (StandardsClass)eGet(ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eSet(ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return (Date)eGet(ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		eSet(ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, newStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardCreationDate() {
		return (Date)eGet(ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardCreationDate(Date newLastStandardCreationDate) {
		eSet(ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, newLastStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardCreationDate() {
		return (Date)eGet(ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardCreationDate(Date newNextStandardCreationDate) {
		eSet(ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, newNextStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return (Date)eGet(ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		eSet(ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, newRetireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getIsProvidedToActors() {
		return (EList<Actor>)eGet(ContentfwkPackage.Literals.SERVICE__IS_PROVIDED_TO_ACTORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getProvidesGovernedInterfaceToAccessFunctions() {
		return (EList<Function>)eGet(ContentfwkPackage.Literals.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getProvidesEntities() {
		return (EList<DataEntity>)eGet(ContentfwkPackage.Literals.SERVICE__PROVIDES_ENTITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getConsumesEntities() {
		return (EList<DataEntity>)eGet(ContentfwkPackage.Literals.SERVICE__CONSUMES_ENTITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contract> getIsGovernedAndMeasuredByContracts() {
		return (EList<Contract>)eGet(ContentfwkPackage.Literals.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getResolvesEvents() {
		return (EList<Event>)eGet(ContentfwkPackage.Literals.SERVICE__RESOLVES_EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalTechnologyComponent> getIsImplementedOnLogicalTechnologyComponents() {
		return (EList<LogicalTechnologyComponent>)eGet(ContentfwkPackage.Literals.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalApplicationComponent> getIsRealizedThroughLogicalApplicationComponent() {
		return (EList<LogicalApplicationComponent>)eGet(ContentfwkPackage.Literals.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationUnit> getIsOwnedAndGovernedByOrganizationUnits() {
		return (EList<OrganizationUnit>)eGet(ContentfwkPackage.Literals.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Measure> getIsTrackedAgainstMeasures() {
		return (EList<Measure>)eGet(ContentfwkPackage.Literals.SERVICE__IS_TRACKED_AGAINST_MEASURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getSupportsProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eGet(ContentfwkPackage.Literals.SERVICE__SUPPORTS_PROCESSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsRealizedByProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eGet(ContentfwkPackage.Literals.SERVICE__IS_REALIZED_BY_PROCESSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceQuality> getMeetsQualities() {
		return (EList<ServiceQuality>)eGet(ContentfwkPackage.Literals.SERVICE__MEETS_QUALITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getConsumesServices() {
		return (EList<Service>)eGet(ContentfwkPackage.Literals.SERVICE__CONSUMES_SERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getDecomposesServices() {
		return (EList<Service>)eGet(ContentfwkPackage.Literals.SERVICE__DECOMPOSES_SERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Objective> getSupportsObjective() {
		return (EList<Objective>)eGet(ContentfwkPackage.Literals.BUSINESS_SERVICE__SUPPORTS_OBJECTIVE, true);
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
