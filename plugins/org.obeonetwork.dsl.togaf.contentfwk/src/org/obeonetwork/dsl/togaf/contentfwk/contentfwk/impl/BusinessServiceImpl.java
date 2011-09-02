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
	 * The cached value of the '{@link #getStandardClass() <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardClass()
	 * @generated
	 * @ordered
	 */
	protected StandardsClass standardClass = STANDARD_CLASS_EDEFAULT;

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
	 * The cached value of the '{@link #getStandardCreationDate() <em>Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date standardCreationDate = STANDARD_CREATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getLastStandardCreationDate() <em>Last Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastStandardCreationDate = LAST_STANDARD_CREATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getNextStandardCreationDate() <em>Next Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date nextStandardCreationDate = NEXT_STANDARD_CREATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getRetireDate() <em>Retire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetireDate()
	 * @generated
	 * @ordered
	 */
	protected Date retireDate = RETIRE_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getSupportsObjective() <em>Supports Objective</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsObjective()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> supportsObjective;

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
		return standardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		StandardsClass oldStandardClass = standardClass;
		standardClass = newStandardClass == null ? STANDARD_CLASS_EDEFAULT : newStandardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CLASS, oldStandardClass, standardClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return standardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		Date oldStandardCreationDate = standardCreationDate;
		standardCreationDate = newStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE, oldStandardCreationDate, standardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardCreationDate() {
		return lastStandardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardCreationDate(Date newLastStandardCreationDate) {
		Date oldLastStandardCreationDate = lastStandardCreationDate;
		lastStandardCreationDate = newLastStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE, oldLastStandardCreationDate, lastStandardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardCreationDate() {
		return nextStandardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardCreationDate(Date newNextStandardCreationDate) {
		Date oldNextStandardCreationDate = nextStandardCreationDate;
		nextStandardCreationDate = newNextStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE, oldNextStandardCreationDate, nextStandardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return retireDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		Date oldRetireDate = retireDate;
		retireDate = newRetireDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE, oldRetireDate, retireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getIsProvidedToActors() {
		if (isProvidedToActors == null) {
			isProvidedToActors = new EObjectResolvingEList<Actor>(Actor.class, this, ContentfwkPackage.BUSINESS_SERVICE__IS_PROVIDED_TO_ACTORS);
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
			providesGovernedInterfaceToAccessFunctions = new EObjectWithInverseResolvingEList.ManyInverse<Function>(Function.class, this, ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS, ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES);
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
			providesEntities = new EObjectWithInverseResolvingEList.ManyInverse<DataEntity>(DataEntity.class, this, ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES, ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES);
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
			consumesEntities = new EObjectWithInverseResolvingEList.ManyInverse<DataEntity>(DataEntity.class, this, ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES, ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES);
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
			isGovernedAndMeasuredByContracts = new EObjectWithInverseResolvingEList.ManyInverse<Contract>(Contract.class, this, ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS, ContentfwkPackage.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES);
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
			resolvesEvents = new EObjectWithInverseResolvingEList.ManyInverse<Event>(Event.class, this, ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS, ContentfwkPackage.EVENT__IS_RESOLVED_BY_BUSINESS_SERVICES);
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
			isImplementedOnLogicalTechnologyComponents = new EObjectWithInverseResolvingEList.ManyInverse<LogicalTechnologyComponent>(LogicalTechnologyComponent.class, this, ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES);
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
			isRealizedThroughLogicalApplicationComponent = new EObjectWithInverseResolvingEList.ManyInverse<LogicalApplicationComponent>(LogicalApplicationComponent.class, this, ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES);
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
			isOwnedAndGovernedByOrganizationUnits = new EObjectWithInverseResolvingEList.ManyInverse<OrganizationUnit>(OrganizationUnit.class, this, ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS, ContentfwkPackage.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES);
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
			isTrackedAgainstMeasures = new EObjectWithInverseResolvingEList.ManyInverse<Measure>(Measure.class, this, ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES, ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES);
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
			supportsProcesses = new EObjectWithInverseResolvingEList.ManyInverse<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES, ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES);
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
			isRealizedByProcesses = new EObjectWithInverseResolvingEList.ManyInverse<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES, ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES);
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
			meetsQualities = new EObjectWithInverseResolvingEList.ManyInverse<ServiceQuality>(ServiceQuality.class, this, ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES, ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_SERVICES);
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
			consumesServices = new EObjectResolvingEList<Service>(Service.class, this, ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_SERVICES);
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
			decomposesServices = new EObjectResolvingEList<Service>(Service.class, this, ContentfwkPackage.BUSINESS_SERVICE__DECOMPOSES_SERVICES);
		}
		return decomposesServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getSupportsObjective() {
		if (supportsObjective == null) {
			supportsObjective = new EObjectResolvingEList<Objective>(Objective.class, this, ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_OBJECTIVE);
		}
		return supportsObjective;
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
				return standardClass != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? standardCreationDate != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(standardCreationDate);
			case ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? lastStandardCreationDate != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(lastStandardCreationDate);
			case ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? nextStandardCreationDate != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(nextStandardCreationDate);
			case ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? retireDate != null : !RETIRE_DATE_EDEFAULT.equals(retireDate);
			case ContentfwkPackage.BUSINESS_SERVICE__IS_PROVIDED_TO_ACTORS:
				return isProvidedToActors != null && !isProvidedToActors.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS:
				return providesGovernedInterfaceToAccessFunctions != null && !providesGovernedInterfaceToAccessFunctions.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__PROVIDES_ENTITIES:
				return providesEntities != null && !providesEntities.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_ENTITIES:
				return consumesEntities != null && !consumesEntities.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS:
				return isGovernedAndMeasuredByContracts != null && !isGovernedAndMeasuredByContracts.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__RESOLVES_EVENTS:
				return resolvesEvents != null && !resolvesEvents.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return isImplementedOnLogicalTechnologyComponents != null && !isImplementedOnLogicalTechnologyComponents.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT:
				return isRealizedThroughLogicalApplicationComponent != null && !isRealizedThroughLogicalApplicationComponent.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS:
				return isOwnedAndGovernedByOrganizationUnits != null && !isOwnedAndGovernedByOrganizationUnits.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES:
				return isTrackedAgainstMeasures != null && !isTrackedAgainstMeasures.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_PROCESSES:
				return supportsProcesses != null && !supportsProcesses.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES:
				return isRealizedByProcesses != null && !isRealizedByProcesses.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__MEETS_QUALITIES:
				return meetsQualities != null && !meetsQualities.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__CONSUMES_SERVICES:
				return consumesServices != null && !consumesServices.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__DECOMPOSES_SERVICES:
				return decomposesServices != null && !decomposesServices.isEmpty();
			case ContentfwkPackage.BUSINESS_SERVICE__SUPPORTS_OBJECTIVE:
				return supportsObjective != null && !supportsObjective.isEmpty();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (standardClass: ");
		result.append(standardClass);
		result.append(", standardCreationDate: ");
		result.append(standardCreationDate);
		result.append(", lastStandardCreationDate: ");
		result.append(lastStandardCreationDate);
		result.append(", nextStandardCreationDate: ");
		result.append(nextStandardCreationDate);
		result.append(", retireDate: ");
		result.append(retireDate);
		result.append(')');
		return result.toString();
	}

} //BusinessServiceImpl
