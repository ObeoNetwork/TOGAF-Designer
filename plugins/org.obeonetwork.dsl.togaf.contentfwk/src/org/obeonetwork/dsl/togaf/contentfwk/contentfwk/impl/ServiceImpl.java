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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
	@SuppressWarnings("unchecked")
	public EList<Actor> getIsProvidedToActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.SERVICE__IS_PROVIDED_TO_ACTORS, ContentfwkPackage.Literals.SERVICE__IS_PROVIDED_TO_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getProvidesGovernedInterfaceToAccessFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS, ContentfwkPackage.Literals.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getProvidesEntities() {
		return (EList<DataEntity>)eDynamicGet(ContentfwkPackage.SERVICE__PROVIDES_ENTITIES, ContentfwkPackage.Literals.SERVICE__PROVIDES_ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getConsumesEntities() {
		return (EList<DataEntity>)eDynamicGet(ContentfwkPackage.SERVICE__CONSUMES_ENTITIES, ContentfwkPackage.Literals.SERVICE__CONSUMES_ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contract> getIsGovernedAndMeasuredByContracts() {
		return (EList<Contract>)eDynamicGet(ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS, ContentfwkPackage.Literals.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getResolvesEvents() {
		return (EList<Event>)eDynamicGet(ContentfwkPackage.SERVICE__RESOLVES_EVENTS, ContentfwkPackage.Literals.SERVICE__RESOLVES_EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalTechnologyComponent> getIsImplementedOnLogicalTechnologyComponents() {
		return (EList<LogicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalApplicationComponent> getIsRealizedThroughLogicalApplicationComponent() {
		return (EList<LogicalApplicationComponent>)eDynamicGet(ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT, ContentfwkPackage.Literals.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationUnit> getIsOwnedAndGovernedByOrganizationUnits() {
		return (EList<OrganizationUnit>)eDynamicGet(ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS, ContentfwkPackage.Literals.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Measure> getIsTrackedAgainstMeasures() {
		return (EList<Measure>)eDynamicGet(ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES, ContentfwkPackage.Literals.SERVICE__IS_TRACKED_AGAINST_MEASURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getSupportsProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES, ContentfwkPackage.Literals.SERVICE__SUPPORTS_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsRealizedByProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES, ContentfwkPackage.Literals.SERVICE__IS_REALIZED_BY_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceQuality> getMeetsQualities() {
		return (EList<ServiceQuality>)eDynamicGet(ContentfwkPackage.SERVICE__MEETS_QUALITIES, ContentfwkPackage.Literals.SERVICE__MEETS_QUALITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getConsumesServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.SERVICE__CONSUMES_SERVICES, ContentfwkPackage.Literals.SERVICE__CONSUMES_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getDecomposesServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.SERVICE__DECOMPOSES_SERVICES, ContentfwkPackage.Literals.SERVICE__DECOMPOSES_SERVICES, true, true);
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
				return !getIsProvidedToActors().isEmpty();
			case ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				return !getProvidesGovernedInterfaceToAccessFunctions().isEmpty();
			case ContentfwkPackage.SERVICE__PROVIDES_ENTITIES:
				return !getProvidesEntities().isEmpty();
			case ContentfwkPackage.SERVICE__CONSUMES_ENTITIES:
				return !getConsumesEntities().isEmpty();
			case ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				return !getIsGovernedAndMeasuredByContracts().isEmpty();
			case ContentfwkPackage.SERVICE__RESOLVES_EVENTS:
				return !getResolvesEvents().isEmpty();
			case ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return !getIsImplementedOnLogicalTechnologyComponents().isEmpty();
			case ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				return !getIsRealizedThroughLogicalApplicationComponent().isEmpty();
			case ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				return !getIsOwnedAndGovernedByOrganizationUnits().isEmpty();
			case ContentfwkPackage.SERVICE__IS_TRACKED_AGAINST_MEASURES:
				return !getIsTrackedAgainstMeasures().isEmpty();
			case ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES:
				return !getSupportsProcesses().isEmpty();
			case ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES:
				return !getIsRealizedByProcesses().isEmpty();
			case ContentfwkPackage.SERVICE__MEETS_QUALITIES:
				return !getMeetsQualities().isEmpty();
			case ContentfwkPackage.SERVICE__CONSUMES_SERVICES:
				return !getConsumesServices().isEmpty();
			case ContentfwkPackage.SERVICE__DECOMPOSES_SERVICES:
				return !getDecomposesServices().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
