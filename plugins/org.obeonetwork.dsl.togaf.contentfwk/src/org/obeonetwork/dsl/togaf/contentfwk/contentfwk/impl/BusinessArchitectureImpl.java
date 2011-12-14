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
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getDrivers <em>Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getContracts <em>Contracts</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl#getServicesQuality <em>Services Quality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessArchitectureImpl extends ArchitectureImpl implements BusinessArchitecture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Driver> getDrivers() {
		return (EList<Driver>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__DRIVERS, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__DRIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Goal> getGoals() {
		return (EList<Goal>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__GOALS, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__GOALS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Objective> getObjectives() {
		return (EList<Objective>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__OBJECTIVES, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__OBJECTIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationUnit> getUnits() {
		return (EList<OrganizationUnit>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__UNITS, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__ACTORS, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__ROLES, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__FUNCTIONS, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BusinessService> getServices() {
		return (EList<BusinessService>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__PROCESSES, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Control> getControls() {
		return (EList<Control>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTROLS, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__CONTROLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getEvents() {
		return (EList<Event>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__EVENTS, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Location> getLocations() {
		return (EList<Location>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__LOCATIONS, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__LOCATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Product> getProducts() {
		return (EList<Product>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__PRODUCTS, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__PRODUCTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Contract> getContracts() {
		return (EList<Contract>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTRACTS, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__CONTRACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Measure> getMeasures() {
		return (EList<Measure>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__MEASURES, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__MEASURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceQuality> getServicesQuality() {
		return (EList<ServiceQuality>)eDynamicGet(ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES_QUALITY, ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__SERVICES_QUALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__DRIVERS:
				return ((InternalEList<?>)getDrivers()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__OBJECTIVES:
				return ((InternalEList<?>)getObjectives()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTRACTS:
				return ((InternalEList<?>)getContracts()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__MEASURES:
				return ((InternalEList<?>)getMeasures()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES_QUALITY:
				return ((InternalEList<?>)getServicesQuality()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__DRIVERS:
				return getDrivers();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__GOALS:
				return getGoals();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__OBJECTIVES:
				return getObjectives();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__UNITS:
				return getUnits();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ACTORS:
				return getActors();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ROLES:
				return getRoles();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__FUNCTIONS:
				return getFunctions();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES:
				return getServices();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PROCESSES:
				return getProcesses();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTROLS:
				return getControls();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__EVENTS:
				return getEvents();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__LOCATIONS:
				return getLocations();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PRODUCTS:
				return getProducts();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTRACTS:
				return getContracts();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__MEASURES:
				return getMeasures();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES_QUALITY:
				return getServicesQuality();
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
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__DRIVERS:
				getDrivers().clear();
				getDrivers().addAll((Collection<? extends Driver>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__OBJECTIVES:
				getObjectives().clear();
				getObjectives().addAll((Collection<? extends Objective>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends OrganizationUnit>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends BusinessService>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTRACTS:
				getContracts().clear();
				getContracts().addAll((Collection<? extends Contract>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES_QUALITY:
				getServicesQuality().clear();
				getServicesQuality().addAll((Collection<? extends ServiceQuality>)newValue);
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
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__DRIVERS:
				getDrivers().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__GOALS:
				getGoals().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__OBJECTIVES:
				getObjectives().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__UNITS:
				getUnits().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ACTORS:
				getActors().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ROLES:
				getRoles().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__FUNCTIONS:
				getFunctions().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES:
				getServices().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PROCESSES:
				getProcesses().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTROLS:
				getControls().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__EVENTS:
				getEvents().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__LOCATIONS:
				getLocations().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PRODUCTS:
				getProducts().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTRACTS:
				getContracts().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__MEASURES:
				getMeasures().clear();
				return;
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES_QUALITY:
				getServicesQuality().clear();
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
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__DRIVERS:
				return !getDrivers().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__GOALS:
				return !getGoals().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__OBJECTIVES:
				return !getObjectives().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__UNITS:
				return !getUnits().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ACTORS:
				return !getActors().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ROLES:
				return !getRoles().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__FUNCTIONS:
				return !getFunctions().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES:
				return !getServices().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PROCESSES:
				return !getProcesses().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTROLS:
				return !getControls().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__EVENTS:
				return !getEvents().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__LOCATIONS:
				return !getLocations().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PRODUCTS:
				return !getProducts().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTRACTS:
				return !getContracts().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__MEASURES:
				return !getMeasures().isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES_QUALITY:
				return !getServicesQuality().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessArchitectureImpl
