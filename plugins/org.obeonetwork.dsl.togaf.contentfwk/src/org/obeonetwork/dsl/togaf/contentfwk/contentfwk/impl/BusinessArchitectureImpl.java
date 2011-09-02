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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
	 * The cached value of the '{@link #getDrivers() <em>Drivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Driver> drivers;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getObjectives() <em>Objectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> objectives;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationUnit> units;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessService> services;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> processes;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getContracts() <em>Contracts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> contracts;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The cached value of the '{@link #getServicesQuality() <em>Services Quality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicesQuality()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceQuality> servicesQuality;

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
	public EList<Driver> getDrivers() {
		if (drivers == null) {
			drivers = new EObjectContainmentEList<Driver>(Driver.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__DRIVERS);
		}
		return drivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<Goal>(Goal.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getObjectives() {
		if (objectives == null) {
			objectives = new EObjectContainmentEList<Objective>(Objective.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__OBJECTIVES);
		}
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationUnit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList<OrganizationUnit>(OrganizationUnit.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__UNITS);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessService> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<BusinessService>(BusinessService.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<Control>(Control.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contract> getContracts() {
		if (contracts == null) {
			contracts = new EObjectContainmentEList<Contract>(Contract.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTRACTS);
		}
		return contracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectContainmentEList<Measure>(Measure.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceQuality> getServicesQuality() {
		if (servicesQuality == null) {
			servicesQuality = new EObjectContainmentEList<ServiceQuality>(ServiceQuality.class, this, ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES_QUALITY);
		}
		return servicesQuality;
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
				return drivers != null && !drivers.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__GOALS:
				return goals != null && !goals.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__OBJECTIVES:
				return objectives != null && !objectives.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__UNITS:
				return units != null && !units.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ACTORS:
				return actors != null && !actors.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ROLES:
				return roles != null && !roles.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES:
				return services != null && !services.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PROCESSES:
				return processes != null && !processes.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTROLS:
				return controls != null && !controls.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__EVENTS:
				return events != null && !events.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PRODUCTS:
				return products != null && !products.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTRACTS:
				return contracts != null && !contracts.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__MEASURES:
				return measures != null && !measures.isEmpty();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES_QUALITY:
				return servicesQuality != null && !servicesQuality.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessArchitectureImpl
