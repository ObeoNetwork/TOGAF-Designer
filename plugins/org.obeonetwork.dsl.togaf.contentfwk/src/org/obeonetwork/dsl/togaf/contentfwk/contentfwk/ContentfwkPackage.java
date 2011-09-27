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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory
 * @model kind="package"
 * @generated
 */
public interface ContentfwkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contentfwk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/dsl/togaf/contentfwk/9.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "contentfwk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentfwkPackage eINSTANCE = org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl <em>Enterprise Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getEnterpriseArchitecture()
	 * @generated
	 */
	int ENTERPRISE_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Architectures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHITECTURE__ARCHITECTURES = 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHITECTURE__CONTAINERS = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHITECTURE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Enterprise Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_ARCHITECTURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ArchitectureImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 1;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl <em>Business Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getBusinessArchitecture()
	 * @generated
	 */
	int BUSINESS_ARCHITECTURE = 2;

	/**
	 * The feature id for the '<em><b>Drivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__DRIVERS = ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__GOALS = ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__OBJECTIVES = ARCHITECTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__UNITS = ARCHITECTURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__ACTORS = ARCHITECTURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__ROLES = ARCHITECTURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__FUNCTIONS = ARCHITECTURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__SERVICES = ARCHITECTURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__PROCESSES = ARCHITECTURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__CONTROLS = ARCHITECTURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__EVENTS = ARCHITECTURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__LOCATIONS = ARCHITECTURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__PRODUCTS = ARCHITECTURE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Contracts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__CONTRACTS = ARCHITECTURE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__MEASURES = ARCHITECTURE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Services Quality</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE__SERVICES_QUALITY = ARCHITECTURE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Business Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ARCHITECTURE_FEATURE_COUNT = ARCHITECTURE_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataArchitectureImpl <em>Data Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataArchitectureImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getDataArchitecture()
	 * @generated
	 */
	int DATA_ARCHITECTURE = 3;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE__ENTITIES = ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE__LOGICAL_COMPONENTS = ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Physical Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE__PHYSICAL_COMPONENTS = ARCHITECTURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE_FEATURE_COUNT = ARCHITECTURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyArchitectureImpl <em>Technology Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyArchitectureImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getTechnologyArchitecture()
	 * @generated
	 */
	int TECHNOLOGY_ARCHITECTURE = 4;

	/**
	 * The feature id for the '<em><b>Platform Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ARCHITECTURE__PLATFORM_SERVICES = ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ARCHITECTURE__PHYSICAL_COMPONENTS = ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ARCHITECTURE__LOGICAL_COMPONENTS = ARCHITECTURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Technology Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_ARCHITECTURE_FEATURE_COUNT = ARCHITECTURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DELEGATES = 0;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_DELEGATED_BY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SOURCE_DESCR = 5;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNER_DESCR = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 7;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DriverImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 5;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Creates Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__CREATES_GOALS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Motivates Organization Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__MOTIVATES_ORGANIZATION_UNITS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decomposes Driver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DECOMPOSES_DRIVER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GoalImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 6;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Addresses Drivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ADDRESSES_DRIVERS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Realized Through Objectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_REALIZED_THROUGH_OBJECTIVES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decomposes Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DECOMPOSES_GOAL = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl <em>Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getObjective()
	 * @generated
	 */
	int OBJECTIVE = 7;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Realizes Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__REALIZES_GOALS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Tracked Against Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__IS_TRACKED_AGAINST_MEASURES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decomposes Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__DECOMPOSES_OBJECTIVE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl <em>Organization Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getOrganizationUnit()
	 * @generated
	 */
	int ORGANIZATION_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owns And Governs Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__CONTAINS_ACTORS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owns Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__OWNS_FUNCTIONS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Participates In Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Motivated By Drivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Produces Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__PRODUCES_PRODUCTS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operates In Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__OPERATES_IN_LOCATION = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Headcount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__HEADCOUNT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Organization Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 9;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Supplies Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUPPLIES_ENTITIES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumes Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONSUMES_ENTITIES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__BELONGS_TO = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interacts With Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INTERACTS_WITH_FUNCTIONS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Performs Task In Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PERFORMS_TASK_IN_ROLES = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Participates In Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PARTICIPATES_IN_PROCESSES = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Consumes Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONSUMES_SERVICES = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resolves Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__RESOLVES_EVENTS = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Generates Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__GENERATES_EVENTS = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operates In Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OPERATES_IN_LOCATION = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>FT Es</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__FT_ES = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Actor Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTOR_GOAL = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Actor Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTOR_TASKS = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Performs Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PERFORMS_FUNCTIONS = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Decomposes Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DECOMPOSES_ACTORS = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RoleImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 10;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Assumed By Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IS_ASSUMED_BY_ACTORS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accesses Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ACCESSES_FUNCTIONS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Estimated FT Es</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ESTIMATED_FT_ES = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Decomposes Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DECOMPOSES_ROLE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl <em>Data Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getDataEntity()
	 * @generated
	 */
	int DATA_ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Supplied By Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__IS_SUPPLIED_BY_ACTORS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Consumed By Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__IS_CONSUMED_BY_ACTORS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Accessed By Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__IS_ACCESSED_BY_SERVICES = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Updated Through Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resides Within Logical Data Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Processes By Logical Application Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Entity Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__DATA_ENTITY_CATEGORY = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Privacy Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__PRIVACY_CLASSIFICATION = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Retention Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__RETENTION_CLASSIFICATION = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Decompose Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__DECOMPOSE_ENTITY = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Relates To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__RELATES_TO = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__ANY = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Data Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl <em>Logical Application Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getLogicalApplicationComponent()
	 * @generated
	 */
	int LOGICAL_APPLICATION_COMPONENT = 12;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__STANDARD_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Implements Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operates On Data Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Extended By Physical Application Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Communicates With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Decomposes Logical Application Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT__ANY = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Logical Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_APPLICATION_COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__STANDARD_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LAST_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NEXT_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETIRE_DATE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Performed By Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_PERFORMED_BY_ACTORS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Owned By Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_OWNED_BY_UNIT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Bounded By Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_BOUNDED_BY_SERVICES = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Supports Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SUPPORTS_PROCESSES = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Realized By Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_REALIZED_BY_PROCESSES = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Can Be Accessed By Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CAN_BE_ACCESSED_BY_ROLES = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Supports Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SUPPORTS_ACTORS = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Decomposes Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DECOMPOSES_FUNCTION = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Communicated With Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COMMUNICATED_WITH_FUNCTIONS = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl <em>Business Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getBusinessService()
	 * @generated
	 */
	int BUSINESS_SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__STANDARD_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__LAST_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__NEXT_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__RETIRE_DATE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Provided To Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__IS_PROVIDED_TO_ACTORS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Provides Governed Interface To Access Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Provides Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__PROVIDES_ENTITIES = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Consumes Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__CONSUMES_ENTITIES = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Governed And Measured By Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resolves Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__RESOLVES_EVENTS = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Implemented On Logical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Realized Through Logical Application Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Owned And Governed By Organization Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Tracked Against Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__IS_TRACKED_AGAINST_MEASURES = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Supports Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__SUPPORTS_PROCESSES = ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Realized By Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__IS_REALIZED_BY_PROCESSES = ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Meets Qualities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__MEETS_QUALITIES = ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Consumes Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__CONSUMES_SERVICES = ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Decomposes Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__DECOMPOSES_SERVICES = ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Supports Objective</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE__SUPPORTS_OBJECTIVE = ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Business Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_SERVICE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 15;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STANDARD_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LAST_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NEXT_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RETIRE_DATE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Orchestrates Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ORCHESTRATES_FUNCTIONS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Decomposes Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DECOMPOSES_FUNCTIONS = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Involves Organization Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INVOLVES_ORGANIZATION_UNITS = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Orchestrates Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ORCHESTRATES_SERVICES = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Decomposes Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DECOMPOSES_SERVICES = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Involves Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INVOLVES_ACTORS = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Guided By Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_GUIDED_BY_CONTROLS = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Resolves Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RESOLVES_EVENTS = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Generates Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__GENERATES_EVENTS = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Produces Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PRODUCES_PRODUCTS = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Process Critiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_CRITIALITY = ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Automated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_AUTOMATED = ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Process Volumetrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_VOLUMETRICS = ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Decomposes Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DECOMPOSES_PROCESS = ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Precedes Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PRECEDES_PROCESSES = ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Follows Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FOLLOWS_PROCESSES = ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ANY = ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PlatformServiceImpl <em>Platform Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PlatformServiceImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPlatformService()
	 * @generated
	 */
	int PLATFORM_SERVICE = 16;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__STANDARD_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__LAST_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__NEXT_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__RETIRE_DATE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Provided To Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__IS_PROVIDED_TO_ACTORS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Provides Governed Interface To Access Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Provides Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__PROVIDES_ENTITIES = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Consumes Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__CONSUMES_ENTITIES = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Governed And Measured By Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resolves Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__RESOLVES_EVENTS = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Implemented On Logical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Realized Through Logical Application Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Owned And Governed By Organization Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Tracked Against Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__IS_TRACKED_AGAINST_MEASURES = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Supports Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__SUPPORTS_PROCESSES = ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Realized By Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__IS_REALIZED_BY_PROCESSES = ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Meets Qualities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__MEETS_QUALITIES = ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Consumes Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__CONSUMES_SERVICES = ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Decomposes Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__DECOMPOSES_SERVICES = ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Is Supplied By Logical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__IS_SUPPLIED_BY_LOGICAL_TECHNOLOGY_COMPONENTS = ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Platform Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl <em>Physical Technology Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPhysicalTechnologyComponent()
	 * @generated
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT = 17;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Realizes Application Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_APPLICATION_COMPONENTS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extends Logical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Hosted In Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__VERSION = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Decomposes Physical Technology Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Dependent On Physical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Physical Technology Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TECHNOLOGY_COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProductImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 18;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Produced By Organization Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Produced By Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IS_PRODUCED_BY_PROCESSES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.MeasureImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 19;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sets Performance Criteria For Objectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sets Performance Criteria For Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decomposes Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DECOMPOSES_MEASURE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceQualityImpl <em>Service Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceQualityImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getServiceQuality()
	 * @generated
	 */
	int SERVICE_QUALITY = 20;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Applies To Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY__APPLIES_TO_SERVICES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applies To Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY__APPLIES_TO_CONTRACTS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_QUALITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 21;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Governs And Measures Business Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meets Service Quality</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__MEETS_SERVICE_QUALITY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Behavior Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__BEHAVIOR_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Name Caller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SERVICE_NAME_CALLER = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Name Called</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SERVICE_NAME_CALLED = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Quality Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SERVICE_QUALITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Availability Quality Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Services Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SERVICES_TIMES = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Manageability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__MANAGEABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Serviceability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SERVICEABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Performance Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PERFORMANCE_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Response Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__RESPONSE_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Reliability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__RELIABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Quality Of Information Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__QUALITY_OF_INFORMATION_REQUIRED = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Contract Control Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CONTRACT_CONTROL_REQUIREMENTS = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Result Control Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__RESULT_CONTROL_REQUIREMENTS = ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Recoverability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__RECOVERABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Locatability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__LOCATABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Security Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SECURITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Privacy Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PRIVACY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Integrity Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__INTEGRITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Credibility Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CREDIBILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Localization Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__LOCALIZATION_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Internationalization Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Interoperability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__INTEROPERABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Scalability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SCALABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Portability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PORTABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Extensibility Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__EXTENSIBILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Capacity Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CAPACITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__THROUGHPUT = ELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Throughput Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__THROUGHPUT_PERIOD = ELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Growth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__GROWTH = ELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Growth Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__GROWTH_PERIOD = ELEMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Peak Profile Short Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PEAK_PROFILE_SHORT_TERM = ELEMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Peak Profile Long Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PEAK_PROFILE_LONG_TERM = ELEMENT_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 35;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EventImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 22;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Resolved By Business Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_RESOLVED_BY_BUSINESS_SERVICES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Resolved By Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_RESOLVED_BY_PROCESSES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Generated By Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_GENERATED_BY_PROCESSES = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Resolved By Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_RESOLVED_BY_ACTORS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Generated By Actors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IS_GENERATED_BY_ACTORS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ControlImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 23;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Ensures Correct Operation Of Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ENSURES_CORRECT_OPERATION_OF_PROCESSES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContainerImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owns Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNS_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 26;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Contains Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINS_ACTORS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains Organization Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINS_ORGANIZATION_UNITS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contains Physical Data Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contains Physical Application Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contains Physical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Decomposes Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DECOMPOSES_LOCATION = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.CapabilityImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 27;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Delivered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_DELIVERED_BY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__BUSINESS_VALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Increments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INCREMENTS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicElementImpl <em>Strategic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicElementImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getStrategicElement()
	 * @generated
	 */
	int STRATEGIC_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ELEMENT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ELEMENT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ELEMENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ELEMENT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ELEMENT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ELEMENT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Strategic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PrincipleImpl <em>Principle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PrincipleImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPrinciple()
	 * @generated
	 */
	int PRINCIPLE = 29;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__DELEGATES = STRATEGIC_ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__IS_DELEGATED_BY = STRATEGIC_ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__NAME = STRATEGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__DESCRIPTION = STRATEGIC_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__CATEGORY = STRATEGIC_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__SOURCE_DESCR = STRATEGIC_ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__OWNER_DESCR = STRATEGIC_ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__ID = STRATEGIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Principle Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__PRINCIPLE_CATEGORY = STRATEGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__PRIORITY = STRATEGIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statement Of Principle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__STATEMENT_OF_PRINCIPLE = STRATEGIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__RATIONALE = STRATEGIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Implication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__IMPLICATION = STRATEGIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE__METRIC = STRATEGIC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Principle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPLE_FEATURE_COUNT = STRATEGIC_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ConstraintImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 30;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DELEGATES = STRATEGIC_ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__IS_DELEGATED_BY = STRATEGIC_ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = STRATEGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = STRATEGIC_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CATEGORY = STRATEGIC_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SOURCE_DESCR = STRATEGIC_ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNER_DESCR = STRATEGIC_ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = STRATEGIC_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = STRATEGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.AssumptionImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 31;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DELEGATES = STRATEGIC_ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IS_DELEGATED_BY = STRATEGIC_ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NAME = STRATEGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = STRATEGIC_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CATEGORY = STRATEGIC_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__SOURCE_DESCR = STRATEGIC_ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__OWNER_DESCR = STRATEGIC_ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ID = STRATEGIC_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = STRATEGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RequirementImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 32;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DELEGATES = STRATEGIC_ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_DELEGATED_BY = STRATEGIC_ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = STRATEGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = STRATEGIC_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CATEGORY = STRATEGIC_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SOURCE_DESCR = STRATEGIC_ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNER_DESCR = STRATEGIC_ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = STRATEGIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Statement Of Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATEMENT_OF_REQUIREMENT = STRATEGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RATIONALE = STRATEGIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Acceptance Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ACCEPTANCE_CRITERIA = STRATEGIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = STRATEGIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GapImpl <em>Gap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GapImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getGap()
	 * @generated
	 */
	int GAP = 33;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__DELEGATES = STRATEGIC_ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__IS_DELEGATED_BY = STRATEGIC_ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__NAME = STRATEGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__DESCRIPTION = STRATEGIC_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__CATEGORY = STRATEGIC_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__SOURCE_DESCR = STRATEGIC_ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__OWNER_DESCR = STRATEGIC_ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__ID = STRATEGIC_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Gap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_FEATURE_COUNT = STRATEGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.WorkPackageImpl <em>Work Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.WorkPackageImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getWorkPackage()
	 * @generated
	 */
	int WORK_PACKAGE = 34;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__DELEGATES = STRATEGIC_ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__IS_DELEGATED_BY = STRATEGIC_ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__NAME = STRATEGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__DESCRIPTION = STRATEGIC_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__CATEGORY = STRATEGIC_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__SOURCE_DESCR = STRATEGIC_ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__OWNER_DESCR = STRATEGIC_ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__ID = STRATEGIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Work Package Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__WORK_PACKAGE_CATEGORY = STRATEGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delivers Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE__DELIVERS_CAPABILITIES = STRATEGIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PACKAGE_FEATURE_COUNT = STRATEGIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalDataComponentImpl <em>Logical Data Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalDataComponentImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getLogicalDataComponent()
	 * @generated
	 */
	int LOGICAL_DATA_COMPONENT = 35;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__STANDARD_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__RETIRE_DATE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Encapsulates Data Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__ENCAPSULATES_DATA_ENTITIES = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Extended By Physical Data Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT__IS_EXTENDED_BY_PHYSICAL_DATA_COMPONENTS = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Logical Data Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DATA_COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl <em>Physical Data Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPhysicalDataComponent()
	 * @generated
	 */
	int PHYSICAL_DATA_COMPONENT = 36;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__STANDARD_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__RETIRE_DATE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends Logical Data Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Hoted In Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Decomposes Physical Data Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Encapsulates Physical Application Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Physical Data Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DATA_COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationArchitectureImpl <em>Application Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationArchitectureImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getApplicationArchitecture()
	 * @generated
	 */
	int APPLICATION_ARCHITECTURE = 37;

	/**
	 * The feature id for the '<em><b>Logical Application Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS = ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physical Application Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS = ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Information System Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES = ARCHITECTURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Any Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ARCHITECTURE__ANY_REF = ARCHITECTURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Application Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ARCHITECTURE_FEATURE_COUNT = ARCHITECTURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl <em>Physical Application Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPhysicalApplicationComponent()
	 * @generated
	 */
	int PHYSICAL_APPLICATION_COMPONENT = 38;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends Logical Application Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Hosted In Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Communicates With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Life Cycle Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Initial Live Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Date Of Last Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Date Of Next Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Retirement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Availability Quality Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Services Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES = ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Manageability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Serviceability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Performance Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Reliability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Recoverability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Locatability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Security Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Privacy Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Integrity Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Credibility Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Localization Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Internationalization Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Interoperability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Scalability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Portability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Extensibility Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Capacity Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS = ELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT = ELEMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Throughput Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD = ELEMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Growth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__GROWTH = ELEMENT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Growth Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD = ELEMENT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Peak Profile Short Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM = ELEMENT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Peak Profile Long Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM = ELEMENT_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Encapsulates Physical Data Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS = ELEMENT_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Is Realized By Physical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS = ELEMENT_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Decomposes Physical Application Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT = ELEMENT_FEATURE_COUNT + 40;

	/**
	 * The number of structural features of the '<em>Physical Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_APPLICATION_COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 41;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl <em>Logical Technology Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getLogicalTechnologyComponent()
	 * @generated
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT = 39;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__DELEGATES = ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__IS_DELEGATED_BY = ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY = ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__SOURCE_DESCR = ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__OWNER_DESCR = ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Provides Platform For Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Supplies Platform Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Realized By Physical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Decomposes Logical Technology Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Dependent On Logical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Logical Technology Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_TECHNOLOGY_COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicArchitectureImpl <em>Strategic Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicArchitectureImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getStrategicArchitecture()
	 * @generated
	 */
	int STRATEGIC_ARCHITECTURE = 40;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ARCHITECTURE__CAPABILITIES = ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategic Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ARCHITECTURE__STRATEGIC_ELEMENTS = ARCHITECTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Strategic Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIC_ARCHITECTURE_FEATURE_COUNT = ARCHITECTURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StandardImpl <em>Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StandardImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getStandard()
	 * @generated
	 */
	int STANDARD = 41;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__STANDARD_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__STANDARD_CREATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__LAST_STANDARD_CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__NEXT_STANDARD_CREATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__RETIRE_DATE = 4;

	/**
	 * The number of structural features of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 42;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__STANDARD_CLASS = STANDARD__STANDARD_CLASS;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__STANDARD_CREATION_DATE = STANDARD__STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LAST_STANDARD_CREATION_DATE = STANDARD__LAST_STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NEXT_STANDARD_CREATION_DATE = STANDARD__NEXT_STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RETIRE_DATE = STANDARD__RETIRE_DATE;

	/**
	 * The feature id for the '<em><b>Is Provided To Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_PROVIDED_TO_ACTORS = STANDARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provides Governed Interface To Access Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS = STANDARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provides Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROVIDES_ENTITIES = STANDARD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consumes Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONSUMES_ENTITIES = STANDARD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Governed And Measured By Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS = STANDARD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resolves Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RESOLVES_EVENTS = STANDARD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Implemented On Logical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS = STANDARD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Realized Through Logical Application Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT = STANDARD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Owned And Governed By Organization Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS = STANDARD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Tracked Against Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_TRACKED_AGAINST_MEASURES = STANDARD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Supports Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SUPPORTS_PROCESSES = STANDARD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Realized By Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IS_REALIZED_BY_PROCESSES = STANDARD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Meets Qualities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MEETS_QUALITIES = STANDARD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Consumes Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONSUMES_SERVICES = STANDARD_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Decomposes Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DECOMPOSES_SERVICES = STANDARD_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = STANDARD_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationComponentImpl <em>Application Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationComponentImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getApplicationComponent()
	 * @generated
	 */
	int APPLICATION_COMPONENT = 43;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__STANDARD_CLASS = STANDARD__STANDARD_CLASS;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__STANDARD_CREATION_DATE = STANDARD__STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE = STANDARD__LAST_STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE = STANDARD__NEXT_STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__RETIRE_DATE = STANDARD__RETIRE_DATE;

	/**
	 * The number of structural features of the '<em>Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_FEATURE_COUNT = STANDARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl <em>Information System Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getInformationSystemService()
	 * @generated
	 */
	int INFORMATION_SYSTEM_SERVICE = 44;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__STANDARD_CLASS = SERVICE__STANDARD_CLASS;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__STANDARD_CREATION_DATE = SERVICE__STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__LAST_STANDARD_CREATION_DATE = SERVICE__LAST_STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__NEXT_STANDARD_CREATION_DATE = SERVICE__NEXT_STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__RETIRE_DATE = SERVICE__RETIRE_DATE;

	/**
	 * The feature id for the '<em><b>Is Provided To Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__IS_PROVIDED_TO_ACTORS = SERVICE__IS_PROVIDED_TO_ACTORS;

	/**
	 * The feature id for the '<em><b>Provides Governed Interface To Access Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS = SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Provides Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__PROVIDES_ENTITIES = SERVICE__PROVIDES_ENTITIES;

	/**
	 * The feature id for the '<em><b>Consumes Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__CONSUMES_ENTITIES = SERVICE__CONSUMES_ENTITIES;

	/**
	 * The feature id for the '<em><b>Is Governed And Measured By Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS = SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS;

	/**
	 * The feature id for the '<em><b>Resolves Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__RESOLVES_EVENTS = SERVICE__RESOLVES_EVENTS;

	/**
	 * The feature id for the '<em><b>Is Implemented On Logical Technology Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS = SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Is Realized Through Logical Application Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT = SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT;

	/**
	 * The feature id for the '<em><b>Is Owned And Governed By Organization Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS = SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS;

	/**
	 * The feature id for the '<em><b>Is Tracked Against Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__IS_TRACKED_AGAINST_MEASURES = SERVICE__IS_TRACKED_AGAINST_MEASURES;

	/**
	 * The feature id for the '<em><b>Supports Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__SUPPORTS_PROCESSES = SERVICE__SUPPORTS_PROCESSES;

	/**
	 * The feature id for the '<em><b>Is Realized By Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__IS_REALIZED_BY_PROCESSES = SERVICE__IS_REALIZED_BY_PROCESSES;

	/**
	 * The feature id for the '<em><b>Meets Qualities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__MEETS_QUALITIES = SERVICE__MEETS_QUALITIES;

	/**
	 * The feature id for the '<em><b>Consumes Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__CONSUMES_SERVICES = SERVICE__CONSUMES_SERVICES;

	/**
	 * The feature id for the '<em><b>Decomposes Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__DECOMPOSES_SERVICES = SERVICE__DECOMPOSES_SERVICES;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__DELEGATES = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__IS_DELEGATED_BY = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__NAME = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__DESCRIPTION = SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__CATEGORY = SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR = SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__OWNER_DESCR = SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__ID = SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE__ANY = SERVICE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Information System Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_SYSTEM_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataComponentImpl <em>Data Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataComponentImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getDataComponent()
	 * @generated
	 */
	int DATA_COMPONENT = 45;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPONENT__STANDARD_CLASS = STANDARD__STANDARD_CLASS;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPONENT__STANDARD_CREATION_DATE = STANDARD__STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPONENT__LAST_STANDARD_CREATION_DATE = STANDARD__LAST_STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE = STANDARD__NEXT_STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPONENT__RETIRE_DATE = STANDARD__RETIRE_DATE;

	/**
	 * The number of structural features of the '<em>Data Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COMPONENT_FEATURE_COUNT = STANDARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyComponentImpl <em>Technology Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyComponentImpl
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getTechnologyComponent()
	 * @generated
	 */
	int TECHNOLOGY_COMPONENT = 46;

	/**
	 * The feature id for the '<em><b>Standard Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_COMPONENT__STANDARD_CLASS = STANDARD__STANDARD_CLASS;

	/**
	 * The feature id for the '<em><b>Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE = STANDARD__STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Last Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE = STANDARD__LAST_STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Next Standard Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE = STANDARD__NEXT_STANDARD_CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Retire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_COMPONENT__RETIRE_DATE = STANDARD__RETIRE_DATE;

	/**
	 * The number of structural features of the '<em>Technology Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_COMPONENT_FEATURE_COUNT = STANDARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PrincipleCategory <em>Principle Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PrincipleCategory
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPrincipleCategory()
	 * @generated
	 */
	int PRINCIPLE_CATEGORY = 47;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass <em>Standards Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getStandardsClass()
	 * @generated
	 */
	int STANDARDS_CLASS = 48;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus <em>Life Cycle Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getLifeCycleStatus()
	 * @generated
	 */
	int LIFE_CYCLE_STATUS = 49;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory <em>Data Entity Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getDataEntityCategory()
	 * @generated
	 */
	int DATA_ENTITY_CATEGORY = 50;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory <em>Work Package Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getWorkPackageCategory()
	 * @generated
	 */
	int WORK_PACKAGE_CATEGORY = 51;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture <em>Enterprise Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Architecture</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture
	 * @generated
	 */
	EClass getEnterpriseArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture#getArchitectures <em>Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architectures</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture#getArchitectures()
	 * @see #getEnterpriseArchitecture()
	 * @generated
	 */
	EReference getEnterpriseArchitecture_Architectures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture#getContainers()
	 * @see #getEnterpriseArchitecture()
	 * @generated
	 */
	EReference getEnterpriseArchitecture_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture#getAny()
	 * @see #getEnterpriseArchitecture()
	 * @generated
	 */
	EReference getEnterpriseArchitecture_Any();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture <em>Business Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Architecture</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture
	 * @generated
	 */
	EClass getBusinessArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getDrivers <em>Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drivers</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getDrivers()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Drivers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getGoals()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectives</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getObjectives()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Objectives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getUnits()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Units();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getActors()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getRoles()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getFunctions()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getServices()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getProcesses()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getControls()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getEvents()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getLocations()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getProducts()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getContracts <em>Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contracts</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getContracts()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Contracts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measures</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getMeasures()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_Measures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getServicesQuality <em>Services Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services Quality</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture#getServicesQuality()
	 * @see #getBusinessArchitecture()
	 * @generated
	 */
	EReference getBusinessArchitecture_ServicesQuality();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture <em>Data Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Architecture</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture
	 * @generated
	 */
	EClass getDataArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture#getEntities()
	 * @see #getDataArchitecture()
	 * @generated
	 */
	EReference getDataArchitecture_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture#getLogicalComponents <em>Logical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture#getLogicalComponents()
	 * @see #getDataArchitecture()
	 * @generated
	 */
	EReference getDataArchitecture_LogicalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture#getPhysicalComponents <em>Physical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture#getPhysicalComponents()
	 * @see #getDataArchitecture()
	 * @generated
	 */
	EReference getDataArchitecture_PhysicalComponents();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture <em>Technology Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Architecture</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture
	 * @generated
	 */
	EClass getTechnologyArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture#getPlatformServices <em>Platform Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platform Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture#getPlatformServices()
	 * @see #getTechnologyArchitecture()
	 * @generated
	 */
	EReference getTechnologyArchitecture_PlatformServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture#getPhysicalComponents <em>Physical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture#getPhysicalComponents()
	 * @see #getTechnologyArchitecture()
	 * @generated
	 */
	EReference getTechnologyArchitecture_PhysicalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture#getLogicalComponents <em>Logical Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture#getLogicalComponents()
	 * @see #getTechnologyArchitecture()
	 * @generated
	 */
	EReference getTechnologyArchitecture_LogicalComponents();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getCreatesGoals <em>Creates Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Creates Goals</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getCreatesGoals()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_CreatesGoals();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getMotivatesOrganizationUnits <em>Motivates Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Motivates Organization Units</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getMotivatesOrganizationUnits()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_MotivatesOrganizationUnits();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getDecomposesDriver <em>Decomposes Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Driver</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver#getDecomposesDriver()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_DecomposesDriver();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getAddressesDrivers <em>Addresses Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addresses Drivers</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getAddressesDrivers()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_AddressesDrivers();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getIsRealizedThroughObjectives <em>Is Realized Through Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Realized Through Objectives</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getIsRealizedThroughObjectives()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_IsRealizedThroughObjectives();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getDecomposesGoal <em>Decomposes Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Goal</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal#getDecomposesGoal()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_DecomposesGoal();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective
	 * @generated
	 */
	EClass getObjective();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getRealizesGoals <em>Realizes Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizes Goals</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getRealizesGoals()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_RealizesGoals();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsTrackedAgainstMeasures <em>Is Tracked Against Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Tracked Against Measures</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getIsTrackedAgainstMeasures()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_IsTrackedAgainstMeasures();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getDecomposesObjective <em>Decomposes Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Objective</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective#getDecomposesObjective()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_DecomposesObjective();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit <em>Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Unit</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit
	 * @generated
	 */
	EClass getOrganizationUnit();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOwnsAndGovernsServices <em>Owns And Governs Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns And Governs Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOwnsAndGovernsServices()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OwnsAndGovernsServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getContainsActors <em>Contains Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getContainsActors()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_ContainsActors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOwnsFunctions <em>Owns Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns Functions</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOwnsFunctions()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OwnsFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getParticipatesInProcesses <em>Participates In Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participates In Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getParticipatesInProcesses()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_ParticipatesInProcesses();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getIsMotivatedByDrivers <em>Is Motivated By Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Motivated By Drivers</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getIsMotivatedByDrivers()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_IsMotivatedByDrivers();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getProducesProducts <em>Produces Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produces Products</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getProducesProducts()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_ProducesProducts();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOperatesInLocation <em>Operates In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operates In Location</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOperatesInLocation()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OperatesInLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getHeadcount <em>Headcount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headcount</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getHeadcount()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EAttribute getOrganizationUnit_Headcount();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getSuppliesEntities <em>Supplies Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supplies Entities</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getSuppliesEntities()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_SuppliesEntities();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getConsumesEntities <em>Consumes Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumes Entities</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getConsumesEntities()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ConsumesEntities();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getBelongsTo()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_BelongsTo();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getInteractsWithFunctions <em>Interacts With Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interacts With Functions</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getInteractsWithFunctions()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_InteractsWithFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getPerformsTaskInRoles <em>Performs Task In Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performs Task In Roles</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getPerformsTaskInRoles()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_PerformsTaskInRoles();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getParticipatesInProcesses <em>Participates In Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participates In Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getParticipatesInProcesses()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ParticipatesInProcesses();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getConsumesServices <em>Consumes Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumes Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getConsumesServices()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ConsumesServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getResolvesEvents <em>Resolves Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolves Events</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getResolvesEvents()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_ResolvesEvents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getGeneratesEvents <em>Generates Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generates Events</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getGeneratesEvents()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_GeneratesEvents();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getOperatesInLocation <em>Operates In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operates In Location</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getOperatesInLocation()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_OperatesInLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getFTEs <em>FT Es</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FT Es</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getFTEs()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_FTEs();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getActorGoal <em>Actor Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Goal</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getActorGoal()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ActorGoal();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getActorTasks <em>Actor Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Tasks</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getActorTasks()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ActorTasks();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getPerformsFunctions <em>Performs Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performs Functions</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getPerformsFunctions()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_PerformsFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getDecomposesActors <em>Decomposes Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decomposes Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getDecomposesActors()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_DecomposesActors();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getIsAssumedByActors <em>Is Assumed By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Assumed By Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getIsAssumedByActors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_IsAssumedByActors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getAccessesFunctions <em>Accesses Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesses Functions</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getAccessesFunctions()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_AccessesFunctions();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getEstimatedFTEs <em>Estimated FT Es</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated FT Es</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getEstimatedFTEs()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_EstimatedFTEs();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getDecomposesRole <em>Decomposes Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Role</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role#getDecomposesRole()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_DecomposesRole();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity <em>Data Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Entity</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity
	 * @generated
	 */
	EClass getDataEntity();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsSuppliedByActors <em>Is Supplied By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Supplied By Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsSuppliedByActors()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_IsSuppliedByActors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsConsumedByActors <em>Is Consumed By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Consumed By Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsConsumedByActors()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_IsConsumedByActors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsAccessedByServices <em>Is Accessed By Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Accessed By Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsAccessedByServices()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_IsAccessedByServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsUpdatedThroughServices <em>Is Updated Through Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Updated Through Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsUpdatedThroughServices()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_IsUpdatedThroughServices();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getResidesWithinLogicalDataComponent <em>Resides Within Logical Data Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resides Within Logical Data Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getResidesWithinLogicalDataComponent()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_ResidesWithinLogicalDataComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsProcessesByLogicalApplicationComponents <em>Is Processes By Logical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Processes By Logical Application Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsProcessesByLogicalApplicationComponents()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_IsProcessesByLogicalApplicationComponents();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getDataEntityCategory <em>Data Entity Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Entity Category</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getDataEntityCategory()
	 * @see #getDataEntity()
	 * @generated
	 */
	EAttribute getDataEntity_DataEntityCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getPrivacyClassification <em>Privacy Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privacy Classification</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getPrivacyClassification()
	 * @see #getDataEntity()
	 * @generated
	 */
	EAttribute getDataEntity_PrivacyClassification();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getRetentionClassification <em>Retention Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retention Classification</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getRetentionClassification()
	 * @see #getDataEntity()
	 * @generated
	 */
	EAttribute getDataEntity_RetentionClassification();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getDecomposeEntity <em>Decompose Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decompose Entity</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getDecomposeEntity()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_DecomposeEntity();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates To</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getRelatesTo()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_RelatesTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getAny()
	 * @see #getDataEntity()
	 * @generated
	 */
	EReference getDataEntity_Any();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent <em>Logical Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Application Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent
	 * @generated
	 */
	EClass getLogicalApplicationComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getImplementsServices <em>Implements Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getImplementsServices()
	 * @see #getLogicalApplicationComponent()
	 * @generated
	 */
	EReference getLogicalApplicationComponent_ImplementsServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getOperatesOnDataEntities <em>Operates On Data Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operates On Data Entities</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getOperatesOnDataEntities()
	 * @see #getLogicalApplicationComponent()
	 * @generated
	 */
	EReference getLogicalApplicationComponent_OperatesOnDataEntities();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getIsExtendedByPhysicalApplicationComponents <em>Is Extended By Physical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Extended By Physical Application Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getIsExtendedByPhysicalApplicationComponents()
	 * @see #getLogicalApplicationComponent()
	 * @generated
	 */
	EReference getLogicalApplicationComponent_IsExtendedByPhysicalApplicationComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getCommunicatesWith <em>Communicates With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communicates With</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getCommunicatesWith()
	 * @see #getLogicalApplicationComponent()
	 * @generated
	 */
	EReference getLogicalApplicationComponent_CommunicatesWith();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getDecomposesLogicalApplicationComponent <em>Decomposes Logical Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Logical Application Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getDecomposesLogicalApplicationComponent()
	 * @see #getLogicalApplicationComponent()
	 * @generated
	 */
	EReference getLogicalApplicationComponent_DecomposesLogicalApplicationComponent();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Any</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getAny()
	 * @see #getLogicalApplicationComponent()
	 * @generated
	 */
	EReference getLogicalApplicationComponent_Any();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsPerformedByActors <em>Is Performed By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Performed By Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsPerformedByActors()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_IsPerformedByActors();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsOwnedByUnit <em>Is Owned By Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Owned By Unit</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsOwnedByUnit()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_IsOwnedByUnit();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsBoundedByServices <em>Is Bounded By Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Bounded By Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsBoundedByServices()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_IsBoundedByServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getSupportsProcesses <em>Supports Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supports Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getSupportsProcesses()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_SupportsProcesses();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsRealizedByProcesses <em>Is Realized By Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Realized By Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsRealizedByProcesses()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_IsRealizedByProcesses();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getCanBeAccessedByRoles <em>Can Be Accessed By Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Can Be Accessed By Roles</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getCanBeAccessedByRoles()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_CanBeAccessedByRoles();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getSupportsActors <em>Supports Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supports Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getSupportsActors()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_SupportsActors();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getDecomposesFunction <em>Decomposes Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Function</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getDecomposesFunction()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_DecomposesFunction();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getCommunicatedWithFunctions <em>Communicated With Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communicated With Functions</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getCommunicatedWithFunctions()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_CommunicatedWithFunctions();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService <em>Business Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Service</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService
	 * @generated
	 */
	EClass getBusinessService();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService#getSupportsObjective <em>Supports Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supports Objective</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService#getSupportsObjective()
	 * @see #getBusinessService()
	 * @generated
	 */
	EReference getBusinessService_SupportsObjective();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getOrchestratesFunctions <em>Orchestrates Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orchestrates Functions</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getOrchestratesFunctions()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OrchestratesFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesFunctions <em>Decomposes Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decomposes Functions</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesFunctions()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_DecomposesFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getInvolvesOrganizationUnits <em>Involves Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involves Organization Units</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getInvolvesOrganizationUnits()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_InvolvesOrganizationUnits();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getOrchestratesServices <em>Orchestrates Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orchestrates Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getOrchestratesServices()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OrchestratesServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesServices <em>Decomposes Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decomposes Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesServices()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_DecomposesServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getInvolvesActors <em>Involves Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involves Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getInvolvesActors()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_InvolvesActors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getIsGuidedByControls <em>Is Guided By Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Guided By Controls</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getIsGuidedByControls()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_IsGuidedByControls();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getResolvesEvents <em>Resolves Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolves Events</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getResolvesEvents()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ResolvesEvents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getGeneratesEvents <em>Generates Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generates Events</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getGeneratesEvents()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_GeneratesEvents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProducesProducts <em>Produces Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produces Products</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProducesProducts()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ProducesProducts();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProcessCritiality <em>Process Critiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Critiality</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProcessCritiality()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ProcessCritiality();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#isIsAutomated <em>Is Automated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Automated</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#isIsAutomated()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_IsAutomated();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProcessVolumetrics <em>Process Volumetrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Volumetrics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProcessVolumetrics()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ProcessVolumetrics();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesProcess <em>Decomposes Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Process</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesProcess()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_DecomposesProcess();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getPrecedesProcesses <em>Precedes Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precedes Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getPrecedesProcesses()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_PrecedesProcesses();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getFollowsProcesses <em>Follows Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Follows Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getFollowsProcesses()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FollowsProcesses();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getAny()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Any();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService <em>Platform Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Service</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService
	 * @generated
	 */
	EClass getPlatformService();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService#getIsSuppliedByLogicalTechnologyComponents <em>Is Supplied By Logical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Supplied By Logical Technology Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService#getIsSuppliedByLogicalTechnologyComponents()
	 * @see #getPlatformService()
	 * @generated
	 */
	EReference getPlatformService_IsSuppliedByLogicalTechnologyComponents();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent <em>Physical Technology Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Technology Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent
	 * @generated
	 */
	EClass getPhysicalTechnologyComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getRealizesApplicationComponents <em>Realizes Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizes Application Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getRealizesApplicationComponents()
	 * @see #getPhysicalTechnologyComponent()
	 * @generated
	 */
	EReference getPhysicalTechnologyComponent_RealizesApplicationComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getExtendsLogicalTechnologyComponents <em>Extends Logical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends Logical Technology Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getExtendsLogicalTechnologyComponents()
	 * @see #getPhysicalTechnologyComponent()
	 * @generated
	 */
	EReference getPhysicalTechnologyComponent_ExtendsLogicalTechnologyComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsHostedInLocation <em>Is Hosted In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Hosted In Location</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsHostedInLocation()
	 * @see #getPhysicalTechnologyComponent()
	 * @generated
	 */
	EReference getPhysicalTechnologyComponent_IsHostedInLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getProductName()
	 * @see #getPhysicalTechnologyComponent()
	 * @generated
	 */
	EAttribute getPhysicalTechnologyComponent_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getModuleName()
	 * @see #getPhysicalTechnologyComponent()
	 * @generated
	 */
	EAttribute getPhysicalTechnologyComponent_ModuleName();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getVendor()
	 * @see #getPhysicalTechnologyComponent()
	 * @generated
	 */
	EAttribute getPhysicalTechnologyComponent_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getVersion()
	 * @see #getPhysicalTechnologyComponent()
	 * @generated
	 */
	EAttribute getPhysicalTechnologyComponent_Version();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getDecomposesPhysicalTechnologyComponent <em>Decomposes Physical Technology Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Physical Technology Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getDecomposesPhysicalTechnologyComponent()
	 * @see #getPhysicalTechnologyComponent()
	 * @generated
	 */
	EReference getPhysicalTechnologyComponent_DecomposesPhysicalTechnologyComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsDependentOnPhysicalTechnologyComponents <em>Is Dependent On Physical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Dependent On Physical Technology Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getIsDependentOnPhysicalTechnologyComponents()
	 * @see #getPhysicalTechnologyComponent()
	 * @generated
	 */
	EReference getPhysicalTechnologyComponent_IsDependentOnPhysicalTechnologyComponents();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product#getIsProducedByOrganizationUnits <em>Is Produced By Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Produced By Organization Units</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product#getIsProducedByOrganizationUnits()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_IsProducedByOrganizationUnits();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product#getIsProducedByProcesses <em>Is Produced By Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Produced By Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product#getIsProducedByProcesses()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_IsProducedByProcesses();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getSetsPerformanceCriteriaForObjectives <em>Sets Performance Criteria For Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sets Performance Criteria For Objectives</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getSetsPerformanceCriteriaForObjectives()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_SetsPerformanceCriteriaForObjectives();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getSetsPerformanceCriteriaForServices <em>Sets Performance Criteria For Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sets Performance Criteria For Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getSetsPerformanceCriteriaForServices()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_SetsPerformanceCriteriaForServices();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getDecomposesMeasure <em>Decomposes Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Measure</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getDecomposesMeasure()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_DecomposesMeasure();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality <em>Service Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Quality</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality
	 * @generated
	 */
	EClass getServiceQuality();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality#getAppliesToServices <em>Applies To Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies To Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality#getAppliesToServices()
	 * @see #getServiceQuality()
	 * @generated
	 */
	EReference getServiceQuality_AppliesToServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality#getAppliesToContracts <em>Applies To Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies To Contracts</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality#getAppliesToContracts()
	 * @see #getServiceQuality()
	 * @generated
	 */
	EReference getServiceQuality_AppliesToContracts();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGovernsAndMeasuresBusinessServices <em>Governs And Measures Business Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Governs And Measures Business Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGovernsAndMeasuresBusinessServices()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_GovernsAndMeasuresBusinessServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getMeetsServiceQuality <em>Meets Service Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meets Service Quality</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getMeetsServiceQuality()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_MeetsServiceQuality();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getBehaviorCharacteristics <em>Behavior Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getBehaviorCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_BehaviorCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceNameCaller <em>Service Name Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name Caller</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceNameCaller()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ServiceNameCaller();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceNameCalled <em>Service Name Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name Called</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceNameCalled()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ServiceNameCalled();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceQualityCharacteristics <em>Service Quality Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Quality Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceQualityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ServiceQualityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getAvailabilityQualityCharacteristics <em>Availability Quality Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Quality Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getAvailabilityQualityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_AvailabilityQualityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServicesTimes <em>Services Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Services Times</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServicesTimes()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ServicesTimes();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getManageabilityCharacteristics <em>Manageability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manageability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getManageabilityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ManageabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceabilityCharacteristics <em>Serviceability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serviceability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceabilityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ServiceabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPerformanceCharacteristics <em>Performance Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPerformanceCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_PerformanceCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getResponseCharacteristics <em>Response Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getResponseCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ResponseCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getReliabilityCharacteristics <em>Reliability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getReliabilityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ReliabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getQualityOfInformationRequired <em>Quality Of Information Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality Of Information Required</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getQualityOfInformationRequired()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_QualityOfInformationRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getContractControlRequirements <em>Contract Control Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contract Control Requirements</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getContractControlRequirements()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ContractControlRequirements();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getResultControlRequirements <em>Result Control Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Control Requirements</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getResultControlRequirements()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ResultControlRequirements();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getRecoverabilityCharacteristics <em>Recoverability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recoverability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getRecoverabilityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_RecoverabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getLocatabilityCharacteristics <em>Locatability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locatability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getLocatabilityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_LocatabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getSecurityCharacteristics <em>Security Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getSecurityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_SecurityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPrivacyCharacteristics <em>Privacy Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privacy Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPrivacyCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_PrivacyCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getIntegrityCharacteristics <em>Integrity Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getIntegrityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_IntegrityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getCredibilityCharacteristics <em>Credibility Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credibility Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getCredibilityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_CredibilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getLocalizationCharacteristics <em>Localization Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Localization Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getLocalizationCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_LocalizationCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getInternationalizationCharacteristics <em>Internationalization Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internationalization Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getInternationalizationCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_InternationalizationCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getInteroperabilityCharacteristics <em>Interoperability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interoperability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getInteroperabilityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_InteroperabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getScalabilityCharacteristics <em>Scalability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getScalabilityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ScalabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPortabilityCharacteristics <em>Portability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPortabilityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_PortabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getExtensibilityCharacteristics <em>Extensibility Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extensibility Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getExtensibilityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ExtensibilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getCapacityCharacteristics <em>Capacity Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getCapacityCharacteristics()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_CapacityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getThroughput()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getThroughputPeriod <em>Throughput Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Period</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getThroughputPeriod()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ThroughputPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGrowth <em>Growth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Growth</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGrowth()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Growth();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGrowthPeriod <em>Growth Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Growth Period</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGrowthPeriod()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_GrowthPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPeakProfileShortTerm <em>Peak Profile Short Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peak Profile Short Term</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPeakProfileShortTerm()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_PeakProfileShortTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPeakProfileLongTerm <em>Peak Profile Long Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peak Profile Long Term</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPeakProfileLongTerm()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_PeakProfileLongTerm();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByBusinessServices <em>Is Resolved By Business Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Resolved By Business Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByBusinessServices()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_IsResolvedByBusinessServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByProcesses <em>Is Resolved By Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Resolved By Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByProcesses()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_IsResolvedByProcesses();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsGeneratedByProcesses <em>Is Generated By Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Generated By Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsGeneratedByProcesses()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_IsGeneratedByProcesses();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByActors <em>Is Resolved By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Resolved By Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByActors()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_IsResolvedByActors();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsGeneratedByActors <em>Is Generated By Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Generated By Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsGeneratedByActors()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_IsGeneratedByActors();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control#getEnsuresCorrectOperationOfProcesses <em>Ensures Correct Operation Of Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ensures Correct Operation Of Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control#getEnsuresCorrectOperationOfProcesses()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_EnsuresCorrectOperationOfProcesses();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getDelegates <em>Delegates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegates</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getDelegates()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Delegates();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getIsDelegatedBy <em>Is Delegated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Delegated By</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getIsDelegatedBy()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_IsDelegatedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getDescription()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getCategory()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getSourceDescr <em>Source Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Descr</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getSourceDescr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_SourceDescr();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getOwnerDescr <em>Owner Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner Descr</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getOwnerDescr()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_OwnerDescr();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element#getID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ID();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Container#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Container#getName()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Container#getOwnsElements <em>Owns Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns Elements</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Container#getOwnsElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_OwnsElements();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsActors <em>Contains Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsActors()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ContainsActors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsOrganizationUnits <em>Contains Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Organization Units</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsOrganizationUnits()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ContainsOrganizationUnits();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalDataComponents <em>Contains Physical Data Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Physical Data Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalDataComponents()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ContainsPhysicalDataComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalApplicationComponents <em>Contains Physical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Physical Application Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalApplicationComponents()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ContainsPhysicalApplicationComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalTechnologyComponents <em>Contains Physical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Physical Technology Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalTechnologyComponents()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ContainsPhysicalTechnologyComponents();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getDecomposesLocation <em>Decomposes Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Location</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getDecomposesLocation()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_DecomposesLocation();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getIsDeliveredBy <em>Is Delivered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Delivered By</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getIsDeliveredBy()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IsDeliveredBy();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getBusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Value</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getBusinessValue()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_BusinessValue();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getIncrements <em>Increments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increments</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability#getIncrements()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Increments();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicElement <em>Strategic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategic Element</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicElement
	 * @generated
	 */
	EClass getStrategicElement();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle <em>Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principle</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle
	 * @generated
	 */
	EClass getPrinciple();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getPrincipleCategory <em>Principle Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principle Category</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getPrincipleCategory()
	 * @see #getPrinciple()
	 * @generated
	 */
	EAttribute getPrinciple_PrincipleCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getPriority()
	 * @see #getPrinciple()
	 * @generated
	 */
	EAttribute getPrinciple_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getStatementOfPrinciple <em>Statement Of Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Of Principle</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getStatementOfPrinciple()
	 * @see #getPrinciple()
	 * @generated
	 */
	EAttribute getPrinciple_StatementOfPrinciple();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getRationale()
	 * @see #getPrinciple()
	 * @generated
	 */
	EAttribute getPrinciple_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getImplication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implication</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getImplication()
	 * @see #getPrinciple()
	 * @generated
	 */
	EAttribute getPrinciple_Implication();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle#getMetric()
	 * @see #getPrinciple()
	 * @generated
	 */
	EAttribute getPrinciple_Metric();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement#getStatementOfRequirement <em>Statement Of Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Of Requirement</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement#getStatementOfRequirement()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_StatementOfRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement#getRationale()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement#getAcceptanceCriteria <em>Acceptance Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance Criteria</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement#getAcceptanceCriteria()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_AcceptanceCriteria();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Gap <em>Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gap</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Gap
	 * @generated
	 */
	EClass getGap();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage <em>Work Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Package</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage
	 * @generated
	 */
	EClass getWorkPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage#getWorkPackageCategory <em>Work Package Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Package Category</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage#getWorkPackageCategory()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EAttribute getWorkPackage_WorkPackageCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage#getDeliversCapabilities <em>Delivers Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delivers Capabilities</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage#getDeliversCapabilities()
	 * @see #getWorkPackage()
	 * @generated
	 */
	EReference getWorkPackage_DeliversCapabilities();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent <em>Logical Data Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Data Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent
	 * @generated
	 */
	EClass getLogicalDataComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent#getEncapsulatesDataEntities <em>Encapsulates Data Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulates Data Entities</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent#getEncapsulatesDataEntities()
	 * @see #getLogicalDataComponent()
	 * @generated
	 */
	EReference getLogicalDataComponent_EncapsulatesDataEntities();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent#getIsExtendedByPhysicalDataComponents <em>Is Extended By Physical Data Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Extended By Physical Data Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent#getIsExtendedByPhysicalDataComponents()
	 * @see #getLogicalDataComponent()
	 * @generated
	 */
	EReference getLogicalDataComponent_IsExtendedByPhysicalDataComponents();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent <em>Physical Data Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Data Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent
	 * @generated
	 */
	EClass getPhysicalDataComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getExtendsLogicalDataComponents <em>Extends Logical Data Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends Logical Data Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getExtendsLogicalDataComponents()
	 * @see #getPhysicalDataComponent()
	 * @generated
	 */
	EReference getPhysicalDataComponent_ExtendsLogicalDataComponents();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getIsHotedInLocation <em>Is Hoted In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Hoted In Location</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getIsHotedInLocation()
	 * @see #getPhysicalDataComponent()
	 * @generated
	 */
	EReference getPhysicalDataComponent_IsHotedInLocation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getDecomposesPhysicalDataComponent <em>Decomposes Physical Data Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Physical Data Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getDecomposesPhysicalDataComponent()
	 * @see #getPhysicalDataComponent()
	 * @generated
	 */
	EReference getPhysicalDataComponent_DecomposesPhysicalDataComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getEncapsulatesPhysicalApplicationComponents <em>Encapsulates Physical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulates Physical Application Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getEncapsulatesPhysicalApplicationComponents()
	 * @see #getPhysicalDataComponent()
	 * @generated
	 */
	EReference getPhysicalDataComponent_EncapsulatesPhysicalApplicationComponents();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture <em>Application Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Architecture</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture
	 * @generated
	 */
	EClass getApplicationArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture#getLogicalApplicationComponents <em>Logical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Application Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture#getLogicalApplicationComponents()
	 * @see #getApplicationArchitecture()
	 * @generated
	 */
	EReference getApplicationArchitecture_LogicalApplicationComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture#getPhysicalApplicationComponents <em>Physical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physical Application Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture#getPhysicalApplicationComponents()
	 * @see #getApplicationArchitecture()
	 * @generated
	 */
	EReference getApplicationArchitecture_PhysicalApplicationComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture#getInformationSystemServices <em>Information System Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information System Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture#getInformationSystemServices()
	 * @see #getApplicationArchitecture()
	 * @generated
	 */
	EReference getApplicationArchitecture_InformationSystemServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture#getAnyRef <em>Any Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Ref</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture#getAnyRef()
	 * @see #getApplicationArchitecture()
	 * @generated
	 */
	EReference getApplicationArchitecture_AnyRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent <em>Physical Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Application Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent
	 * @generated
	 */
	EClass getPhysicalApplicationComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getExtendsLogicalApplicationComponents <em>Extends Logical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends Logical Application Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getExtendsLogicalApplicationComponents()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EReference getPhysicalApplicationComponent_ExtendsLogicalApplicationComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsHostedInLocation <em>Is Hosted In Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Hosted In Location</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsHostedInLocation()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EReference getPhysicalApplicationComponent_IsHostedInLocation();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCommunicatesWith <em>Communicates With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communicates With</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCommunicatesWith()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EReference getPhysicalApplicationComponent_CommunicatesWith();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLifeCycleStatus <em>Life Cycle Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life Cycle Status</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLifeCycleStatus()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_LifeCycleStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInitialLiveDate <em>Initial Live Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Live Date</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInitialLiveDate()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_InitialLiveDate();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDateOfLastRelease <em>Date Of Last Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Last Release</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDateOfLastRelease()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_DateOfLastRelease();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDateOfNextRelease <em>Date Of Next Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Next Release</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDateOfNextRelease()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_DateOfNextRelease();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getRetirementDate <em>Retirement Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retirement Date</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getRetirementDate()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_RetirementDate();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getAvailabilityQualityCharacteristics <em>Availability Quality Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Quality Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getAvailabilityQualityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_AvailabilityQualityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getServicesTimes <em>Services Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Services Times</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getServicesTimes()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_ServicesTimes();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getManageabilityCharacteristics <em>Manageability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manageability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getManageabilityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_ManageabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getServiceabilityCharacteristics <em>Serviceability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serviceability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getServiceabilityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_ServiceabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPerformanceCharacteristics <em>Performance Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPerformanceCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_PerformanceCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getReliabilityCharacteristics <em>Reliability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getReliabilityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_ReliabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getRecoverabilityCharacteristics <em>Recoverability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recoverability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getRecoverabilityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_RecoverabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLocatabilityCharacteristics <em>Locatability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locatability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLocatabilityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_LocatabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getSecurityCharacteristics <em>Security Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getSecurityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_SecurityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPrivacyCharacteristics <em>Privacy Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privacy Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPrivacyCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_PrivacyCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIntegrityCharacteristics <em>Integrity Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIntegrityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_IntegrityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCredibilityCharacteristics <em>Credibility Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credibility Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCredibilityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_CredibilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLocalizationCharacteristics <em>Localization Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Localization Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLocalizationCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_LocalizationCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInternationalizationCharacteristics <em>Internationalization Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internationalization Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInternationalizationCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_InternationalizationCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInteroperabilityCharacteristics <em>Interoperability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interoperability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInteroperabilityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_InteroperabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getScalabilityCharacteristics <em>Scalability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getScalabilityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_ScalabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPortabilityCharacteristics <em>Portability Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portability Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPortabilityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_PortabilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getExtensibilityCharacteristics <em>Extensibility Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extensibility Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getExtensibilityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_ExtensibilityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCapacityCharacteristics <em>Capacity Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity Characteristics</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCapacityCharacteristics()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_CapacityCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getThroughput()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getThroughputPeriod <em>Throughput Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput Period</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getThroughputPeriod()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_ThroughputPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getGrowth <em>Growth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Growth</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getGrowth()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_Growth();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getGrowthPeriod <em>Growth Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Growth Period</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getGrowthPeriod()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_GrowthPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPeakProfileShortTerm <em>Peak Profile Short Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peak Profile Short Term</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPeakProfileShortTerm()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_PeakProfileShortTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPeakProfileLongTerm <em>Peak Profile Long Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peak Profile Long Term</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPeakProfileLongTerm()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EAttribute getPhysicalApplicationComponent_PeakProfileLongTerm();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getEncapsulatesPhysicalDataComponents <em>Encapsulates Physical Data Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encapsulates Physical Data Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getEncapsulatesPhysicalDataComponents()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EReference getPhysicalApplicationComponent_EncapsulatesPhysicalDataComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsRealizedByPhysicalTechnologyComponents <em>Is Realized By Physical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Realized By Physical Technology Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsRealizedByPhysicalTechnologyComponents()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EReference getPhysicalApplicationComponent_IsRealizedByPhysicalTechnologyComponents();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDecomposesPhysicalApplicationComponent <em>Decomposes Physical Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Physical Application Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDecomposesPhysicalApplicationComponent()
	 * @see #getPhysicalApplicationComponent()
	 * @generated
	 */
	EReference getPhysicalApplicationComponent_DecomposesPhysicalApplicationComponent();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent <em>Logical Technology Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Technology Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent
	 * @generated
	 */
	EClass getLogicalTechnologyComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getProvidesPlatformForServices <em>Provides Platform For Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides Platform For Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getProvidesPlatformForServices()
	 * @see #getLogicalTechnologyComponent()
	 * @generated
	 */
	EReference getLogicalTechnologyComponent_ProvidesPlatformForServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getSuppliesPlatformServices <em>Supplies Platform Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supplies Platform Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getSuppliesPlatformServices()
	 * @see #getLogicalTechnologyComponent()
	 * @generated
	 */
	EReference getLogicalTechnologyComponent_SuppliesPlatformServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getIsRealizedByPhysicalTechnologyComponents <em>Is Realized By Physical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Realized By Physical Technology Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getIsRealizedByPhysicalTechnologyComponents()
	 * @see #getLogicalTechnologyComponent()
	 * @generated
	 */
	EReference getLogicalTechnologyComponent_IsRealizedByPhysicalTechnologyComponents();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getDecomposesLogicalTechnologyComponent <em>Decomposes Logical Technology Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposes Logical Technology Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getDecomposesLogicalTechnologyComponent()
	 * @see #getLogicalTechnologyComponent()
	 * @generated
	 */
	EReference getLogicalTechnologyComponent_DecomposesLogicalTechnologyComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getIsDependentOnLogicalTechnologyComponents <em>Is Dependent On Logical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Dependent On Logical Technology Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getIsDependentOnLogicalTechnologyComponents()
	 * @see #getLogicalTechnologyComponent()
	 * @generated
	 */
	EReference getLogicalTechnologyComponent_IsDependentOnLogicalTechnologyComponents();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture <em>Strategic Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategic Architecture</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture
	 * @generated
	 */
	EClass getStrategicArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture#getCapabilities()
	 * @see #getStrategicArchitecture()
	 * @generated
	 */
	EReference getStrategicArchitecture_Capabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture#getStrategicElements <em>Strategic Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategic Elements</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture#getStrategicElements()
	 * @see #getStrategicArchitecture()
	 * @generated
	 */
	EReference getStrategicArchitecture_StrategicElements();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard
	 * @generated
	 */
	EClass getStandard();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getStandardClass <em>Standard Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Class</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getStandardClass()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_StandardClass();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getStandardCreationDate <em>Standard Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Creation Date</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getStandardCreationDate()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_StandardCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getLastStandardCreationDate <em>Last Standard Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Standard Creation Date</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getLastStandardCreationDate()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_LastStandardCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getNextStandardCreationDate <em>Next Standard Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Standard Creation Date</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getNextStandardCreationDate()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_NextStandardCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getRetireDate <em>Retire Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retire Date</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard#getRetireDate()
	 * @see #getStandard()
	 * @generated
	 */
	EAttribute getStandard_RetireDate();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsProvidedToActors <em>Is Provided To Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Provided To Actors</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsProvidedToActors()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_IsProvidedToActors();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getProvidesGovernedInterfaceToAccessFunctions <em>Provides Governed Interface To Access Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides Governed Interface To Access Functions</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getProvidesGovernedInterfaceToAccessFunctions()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ProvidesGovernedInterfaceToAccessFunctions();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getProvidesEntities <em>Provides Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides Entities</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getProvidesEntities()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ProvidesEntities();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getConsumesEntities <em>Consumes Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumes Entities</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getConsumesEntities()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ConsumesEntities();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsGovernedAndMeasuredByContracts <em>Is Governed And Measured By Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Governed And Measured By Contracts</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsGovernedAndMeasuredByContracts()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_IsGovernedAndMeasuredByContracts();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getResolvesEvents <em>Resolves Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolves Events</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getResolvesEvents()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ResolvesEvents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsImplementedOnLogicalTechnologyComponents <em>Is Implemented On Logical Technology Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Implemented On Logical Technology Components</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsImplementedOnLogicalTechnologyComponents()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_IsImplementedOnLogicalTechnologyComponents();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsRealizedThroughLogicalApplicationComponent <em>Is Realized Through Logical Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Realized Through Logical Application Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsRealizedThroughLogicalApplicationComponent()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_IsRealizedThroughLogicalApplicationComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsOwnedAndGovernedByOrganizationUnits <em>Is Owned And Governed By Organization Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Owned And Governed By Organization Units</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsOwnedAndGovernedByOrganizationUnits()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_IsOwnedAndGovernedByOrganizationUnits();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsTrackedAgainstMeasures <em>Is Tracked Against Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Tracked Against Measures</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsTrackedAgainstMeasures()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_IsTrackedAgainstMeasures();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getSupportsProcesses <em>Supports Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supports Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getSupportsProcesses()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_SupportsProcesses();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsRealizedByProcesses <em>Is Realized By Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Realized By Processes</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsRealizedByProcesses()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_IsRealizedByProcesses();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getMeetsQualities <em>Meets Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meets Qualities</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getMeetsQualities()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_MeetsQualities();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getConsumesServices <em>Consumes Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumes Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getConsumesServices()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ConsumesServices();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getDecomposesServices <em>Decomposes Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decomposes Services</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getDecomposesServices()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DecomposesServices();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationComponent <em>Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationComponent
	 * @generated
	 */
	EClass getApplicationComponent();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService <em>Information System Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information System Service</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService
	 * @generated
	 */
	EClass getInformationSystemService();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Any</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService#getAny()
	 * @see #getInformationSystemService()
	 * @generated
	 */
	EReference getInformationSystemService_Any();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataComponent <em>Data Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataComponent
	 * @generated
	 */
	EClass getDataComponent();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyComponent <em>Technology Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Component</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyComponent
	 * @generated
	 */
	EClass getTechnologyComponent();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PrincipleCategory <em>Principle Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Principle Category</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PrincipleCategory
	 * @generated
	 */
	EEnum getPrincipleCategory();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass <em>Standards Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standards Class</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass
	 * @generated
	 */
	EEnum getStandardsClass();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus <em>Life Cycle Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Life Cycle Status</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus
	 * @generated
	 */
	EEnum getLifeCycleStatus();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory <em>Data Entity Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Entity Category</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory
	 * @generated
	 */
	EEnum getDataEntityCategory();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory <em>Work Package Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Package Category</em>'.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory
	 * @generated
	 */
	EEnum getWorkPackageCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContentfwkFactory getContentfwkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl <em>Enterprise Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EnterpriseArchitectureImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getEnterpriseArchitecture()
		 * @generated
		 */
		EClass ENTERPRISE_ARCHITECTURE = eINSTANCE.getEnterpriseArchitecture();

		/**
		 * The meta object literal for the '<em><b>Architectures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_ARCHITECTURE__ARCHITECTURES = eINSTANCE.getEnterpriseArchitecture_Architectures();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_ARCHITECTURE__CONTAINERS = eINSTANCE.getEnterpriseArchitecture_Containers();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_ARCHITECTURE__ANY = eINSTANCE.getEnterpriseArchitecture_Any();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ArchitectureImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl <em>Business Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessArchitectureImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getBusinessArchitecture()
		 * @generated
		 */
		EClass BUSINESS_ARCHITECTURE = eINSTANCE.getBusinessArchitecture();

		/**
		 * The meta object literal for the '<em><b>Drivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__DRIVERS = eINSTANCE.getBusinessArchitecture_Drivers();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__GOALS = eINSTANCE.getBusinessArchitecture_Goals();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__OBJECTIVES = eINSTANCE.getBusinessArchitecture_Objectives();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__UNITS = eINSTANCE.getBusinessArchitecture_Units();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__ACTORS = eINSTANCE.getBusinessArchitecture_Actors();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__ROLES = eINSTANCE.getBusinessArchitecture_Roles();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__FUNCTIONS = eINSTANCE.getBusinessArchitecture_Functions();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__SERVICES = eINSTANCE.getBusinessArchitecture_Services();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__PROCESSES = eINSTANCE.getBusinessArchitecture_Processes();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__CONTROLS = eINSTANCE.getBusinessArchitecture_Controls();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__EVENTS = eINSTANCE.getBusinessArchitecture_Events();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__LOCATIONS = eINSTANCE.getBusinessArchitecture_Locations();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__PRODUCTS = eINSTANCE.getBusinessArchitecture_Products();

		/**
		 * The meta object literal for the '<em><b>Contracts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__CONTRACTS = eINSTANCE.getBusinessArchitecture_Contracts();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__MEASURES = eINSTANCE.getBusinessArchitecture_Measures();

		/**
		 * The meta object literal for the '<em><b>Services Quality</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ARCHITECTURE__SERVICES_QUALITY = eINSTANCE.getBusinessArchitecture_ServicesQuality();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataArchitectureImpl <em>Data Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataArchitectureImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getDataArchitecture()
		 * @generated
		 */
		EClass DATA_ARCHITECTURE = eINSTANCE.getDataArchitecture();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ARCHITECTURE__ENTITIES = eINSTANCE.getDataArchitecture_Entities();

		/**
		 * The meta object literal for the '<em><b>Logical Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ARCHITECTURE__LOGICAL_COMPONENTS = eINSTANCE.getDataArchitecture_LogicalComponents();

		/**
		 * The meta object literal for the '<em><b>Physical Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ARCHITECTURE__PHYSICAL_COMPONENTS = eINSTANCE.getDataArchitecture_PhysicalComponents();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyArchitectureImpl <em>Technology Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyArchitectureImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getTechnologyArchitecture()
		 * @generated
		 */
		EClass TECHNOLOGY_ARCHITECTURE = eINSTANCE.getTechnologyArchitecture();

		/**
		 * The meta object literal for the '<em><b>Platform Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_ARCHITECTURE__PLATFORM_SERVICES = eINSTANCE.getTechnologyArchitecture_PlatformServices();

		/**
		 * The meta object literal for the '<em><b>Physical Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_ARCHITECTURE__PHYSICAL_COMPONENTS = eINSTANCE.getTechnologyArchitecture_PhysicalComponents();

		/**
		 * The meta object literal for the '<em><b>Logical Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_ARCHITECTURE__LOGICAL_COMPONENTS = eINSTANCE.getTechnologyArchitecture_LogicalComponents();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DriverImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getDriver()
		 * @generated
		 */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
		 * The meta object literal for the '<em><b>Creates Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__CREATES_GOALS = eINSTANCE.getDriver_CreatesGoals();

		/**
		 * The meta object literal for the '<em><b>Motivates Organization Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__MOTIVATES_ORGANIZATION_UNITS = eINSTANCE.getDriver_MotivatesOrganizationUnits();

		/**
		 * The meta object literal for the '<em><b>Decomposes Driver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__DECOMPOSES_DRIVER = eINSTANCE.getDriver_DecomposesDriver();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GoalImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Addresses Drivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ADDRESSES_DRIVERS = eINSTANCE.getGoal_AddressesDrivers();

		/**
		 * The meta object literal for the '<em><b>Is Realized Through Objectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__IS_REALIZED_THROUGH_OBJECTIVES = eINSTANCE.getGoal_IsRealizedThroughObjectives();

		/**
		 * The meta object literal for the '<em><b>Decomposes Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__DECOMPOSES_GOAL = eINSTANCE.getGoal_DecomposesGoal();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl <em>Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getObjective()
		 * @generated
		 */
		EClass OBJECTIVE = eINSTANCE.getObjective();

		/**
		 * The meta object literal for the '<em><b>Realizes Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__REALIZES_GOALS = eINSTANCE.getObjective_RealizesGoals();

		/**
		 * The meta object literal for the '<em><b>Is Tracked Against Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__IS_TRACKED_AGAINST_MEASURES = eINSTANCE.getObjective_IsTrackedAgainstMeasures();

		/**
		 * The meta object literal for the '<em><b>Decomposes Objective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__DECOMPOSES_OBJECTIVE = eINSTANCE.getObjective_DecomposesObjective();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl <em>Organization Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getOrganizationUnit()
		 * @generated
		 */
		EClass ORGANIZATION_UNIT = eINSTANCE.getOrganizationUnit();

		/**
		 * The meta object literal for the '<em><b>Owns And Governs Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES = eINSTANCE.getOrganizationUnit_OwnsAndGovernsServices();

		/**
		 * The meta object literal for the '<em><b>Contains Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__CONTAINS_ACTORS = eINSTANCE.getOrganizationUnit_ContainsActors();

		/**
		 * The meta object literal for the '<em><b>Owns Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__OWNS_FUNCTIONS = eINSTANCE.getOrganizationUnit_OwnsFunctions();

		/**
		 * The meta object literal for the '<em><b>Participates In Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES = eINSTANCE.getOrganizationUnit_ParticipatesInProcesses();

		/**
		 * The meta object literal for the '<em><b>Is Motivated By Drivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS = eINSTANCE.getOrganizationUnit_IsMotivatedByDrivers();

		/**
		 * The meta object literal for the '<em><b>Produces Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__PRODUCES_PRODUCTS = eINSTANCE.getOrganizationUnit_ProducesProducts();

		/**
		 * The meta object literal for the '<em><b>Operates In Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__OPERATES_IN_LOCATION = eINSTANCE.getOrganizationUnit_OperatesInLocation();

		/**
		 * The meta object literal for the '<em><b>Headcount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_UNIT__HEADCOUNT = eINSTANCE.getOrganizationUnit_Headcount();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ActorImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Supplies Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__SUPPLIES_ENTITIES = eINSTANCE.getActor_SuppliesEntities();

		/**
		 * The meta object literal for the '<em><b>Consumes Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__CONSUMES_ENTITIES = eINSTANCE.getActor_ConsumesEntities();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__BELONGS_TO = eINSTANCE.getActor_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Interacts With Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__INTERACTS_WITH_FUNCTIONS = eINSTANCE.getActor_InteractsWithFunctions();

		/**
		 * The meta object literal for the '<em><b>Performs Task In Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PERFORMS_TASK_IN_ROLES = eINSTANCE.getActor_PerformsTaskInRoles();

		/**
		 * The meta object literal for the '<em><b>Participates In Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PARTICIPATES_IN_PROCESSES = eINSTANCE.getActor_ParticipatesInProcesses();

		/**
		 * The meta object literal for the '<em><b>Consumes Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__CONSUMES_SERVICES = eINSTANCE.getActor_ConsumesServices();

		/**
		 * The meta object literal for the '<em><b>Resolves Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__RESOLVES_EVENTS = eINSTANCE.getActor_ResolvesEvents();

		/**
		 * The meta object literal for the '<em><b>Generates Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__GENERATES_EVENTS = eINSTANCE.getActor_GeneratesEvents();

		/**
		 * The meta object literal for the '<em><b>Operates In Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__OPERATES_IN_LOCATION = eINSTANCE.getActor_OperatesInLocation();

		/**
		 * The meta object literal for the '<em><b>FT Es</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__FT_ES = eINSTANCE.getActor_FTEs();

		/**
		 * The meta object literal for the '<em><b>Actor Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ACTOR_GOAL = eINSTANCE.getActor_ActorGoal();

		/**
		 * The meta object literal for the '<em><b>Actor Tasks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ACTOR_TASKS = eINSTANCE.getActor_ActorTasks();

		/**
		 * The meta object literal for the '<em><b>Performs Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PERFORMS_FUNCTIONS = eINSTANCE.getActor_PerformsFunctions();

		/**
		 * The meta object literal for the '<em><b>Decomposes Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__DECOMPOSES_ACTORS = eINSTANCE.getActor_DecomposesActors();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RoleImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Is Assumed By Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__IS_ASSUMED_BY_ACTORS = eINSTANCE.getRole_IsAssumedByActors();

		/**
		 * The meta object literal for the '<em><b>Accesses Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ACCESSES_FUNCTIONS = eINSTANCE.getRole_AccessesFunctions();

		/**
		 * The meta object literal for the '<em><b>Estimated FT Es</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ESTIMATED_FT_ES = eINSTANCE.getRole_EstimatedFTEs();

		/**
		 * The meta object literal for the '<em><b>Decomposes Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__DECOMPOSES_ROLE = eINSTANCE.getRole_DecomposesRole();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl <em>Data Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getDataEntity()
		 * @generated
		 */
		EClass DATA_ENTITY = eINSTANCE.getDataEntity();

		/**
		 * The meta object literal for the '<em><b>Is Supplied By Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__IS_SUPPLIED_BY_ACTORS = eINSTANCE.getDataEntity_IsSuppliedByActors();

		/**
		 * The meta object literal for the '<em><b>Is Consumed By Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__IS_CONSUMED_BY_ACTORS = eINSTANCE.getDataEntity_IsConsumedByActors();

		/**
		 * The meta object literal for the '<em><b>Is Accessed By Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__IS_ACCESSED_BY_SERVICES = eINSTANCE.getDataEntity_IsAccessedByServices();

		/**
		 * The meta object literal for the '<em><b>Is Updated Through Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES = eINSTANCE.getDataEntity_IsUpdatedThroughServices();

		/**
		 * The meta object literal for the '<em><b>Resides Within Logical Data Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT = eINSTANCE.getDataEntity_ResidesWithinLogicalDataComponent();

		/**
		 * The meta object literal for the '<em><b>Is Processes By Logical Application Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS = eINSTANCE.getDataEntity_IsProcessesByLogicalApplicationComponents();

		/**
		 * The meta object literal for the '<em><b>Data Entity Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ENTITY__DATA_ENTITY_CATEGORY = eINSTANCE.getDataEntity_DataEntityCategory();

		/**
		 * The meta object literal for the '<em><b>Privacy Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ENTITY__PRIVACY_CLASSIFICATION = eINSTANCE.getDataEntity_PrivacyClassification();

		/**
		 * The meta object literal for the '<em><b>Retention Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ENTITY__RETENTION_CLASSIFICATION = eINSTANCE.getDataEntity_RetentionClassification();

		/**
		 * The meta object literal for the '<em><b>Decompose Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__DECOMPOSE_ENTITY = eINSTANCE.getDataEntity_DecomposeEntity();

		/**
		 * The meta object literal for the '<em><b>Relates To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__RELATES_TO = eINSTANCE.getDataEntity_RelatesTo();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ENTITY__ANY = eINSTANCE.getDataEntity_Any();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl <em>Logical Application Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getLogicalApplicationComponent()
		 * @generated
		 */
		EClass LOGICAL_APPLICATION_COMPONENT = eINSTANCE.getLogicalApplicationComponent();

		/**
		 * The meta object literal for the '<em><b>Implements Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES = eINSTANCE.getLogicalApplicationComponent_ImplementsServices();

		/**
		 * The meta object literal for the '<em><b>Operates On Data Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES = eINSTANCE.getLogicalApplicationComponent_OperatesOnDataEntities();

		/**
		 * The meta object literal for the '<em><b>Is Extended By Physical Application Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS = eINSTANCE.getLogicalApplicationComponent_IsExtendedByPhysicalApplicationComponents();

		/**
		 * The meta object literal for the '<em><b>Communicates With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH = eINSTANCE.getLogicalApplicationComponent_CommunicatesWith();

		/**
		 * The meta object literal for the '<em><b>Decomposes Logical Application Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT = eINSTANCE.getLogicalApplicationComponent_DecomposesLogicalApplicationComponent();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_APPLICATION_COMPONENT__ANY = eINSTANCE.getLogicalApplicationComponent_Any();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Is Performed By Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__IS_PERFORMED_BY_ACTORS = eINSTANCE.getFunction_IsPerformedByActors();

		/**
		 * The meta object literal for the '<em><b>Is Owned By Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__IS_OWNED_BY_UNIT = eINSTANCE.getFunction_IsOwnedByUnit();

		/**
		 * The meta object literal for the '<em><b>Is Bounded By Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__IS_BOUNDED_BY_SERVICES = eINSTANCE.getFunction_IsBoundedByServices();

		/**
		 * The meta object literal for the '<em><b>Supports Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__SUPPORTS_PROCESSES = eINSTANCE.getFunction_SupportsProcesses();

		/**
		 * The meta object literal for the '<em><b>Is Realized By Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__IS_REALIZED_BY_PROCESSES = eINSTANCE.getFunction_IsRealizedByProcesses();

		/**
		 * The meta object literal for the '<em><b>Can Be Accessed By Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__CAN_BE_ACCESSED_BY_ROLES = eINSTANCE.getFunction_CanBeAccessedByRoles();

		/**
		 * The meta object literal for the '<em><b>Supports Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__SUPPORTS_ACTORS = eINSTANCE.getFunction_SupportsActors();

		/**
		 * The meta object literal for the '<em><b>Decomposes Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__DECOMPOSES_FUNCTION = eINSTANCE.getFunction_DecomposesFunction();

		/**
		 * The meta object literal for the '<em><b>Communicated With Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__COMMUNICATED_WITH_FUNCTIONS = eINSTANCE.getFunction_CommunicatedWithFunctions();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl <em>Business Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.BusinessServiceImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getBusinessService()
		 * @generated
		 */
		EClass BUSINESS_SERVICE = eINSTANCE.getBusinessService();

		/**
		 * The meta object literal for the '<em><b>Supports Objective</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_SERVICE__SUPPORTS_OBJECTIVE = eINSTANCE.getBusinessService_SupportsObjective();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Orchestrates Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ORCHESTRATES_FUNCTIONS = eINSTANCE.getProcess_OrchestratesFunctions();

		/**
		 * The meta object literal for the '<em><b>Decomposes Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__DECOMPOSES_FUNCTIONS = eINSTANCE.getProcess_DecomposesFunctions();

		/**
		 * The meta object literal for the '<em><b>Involves Organization Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INVOLVES_ORGANIZATION_UNITS = eINSTANCE.getProcess_InvolvesOrganizationUnits();

		/**
		 * The meta object literal for the '<em><b>Orchestrates Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ORCHESTRATES_SERVICES = eINSTANCE.getProcess_OrchestratesServices();

		/**
		 * The meta object literal for the '<em><b>Decomposes Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__DECOMPOSES_SERVICES = eINSTANCE.getProcess_DecomposesServices();

		/**
		 * The meta object literal for the '<em><b>Involves Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INVOLVES_ACTORS = eINSTANCE.getProcess_InvolvesActors();

		/**
		 * The meta object literal for the '<em><b>Is Guided By Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__IS_GUIDED_BY_CONTROLS = eINSTANCE.getProcess_IsGuidedByControls();

		/**
		 * The meta object literal for the '<em><b>Resolves Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RESOLVES_EVENTS = eINSTANCE.getProcess_ResolvesEvents();

		/**
		 * The meta object literal for the '<em><b>Generates Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__GENERATES_EVENTS = eINSTANCE.getProcess_GeneratesEvents();

		/**
		 * The meta object literal for the '<em><b>Produces Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PRODUCES_PRODUCTS = eINSTANCE.getProcess_ProducesProducts();

		/**
		 * The meta object literal for the '<em><b>Process Critiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__PROCESS_CRITIALITY = eINSTANCE.getProcess_ProcessCritiality();

		/**
		 * The meta object literal for the '<em><b>Is Automated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__IS_AUTOMATED = eINSTANCE.getProcess_IsAutomated();

		/**
		 * The meta object literal for the '<em><b>Process Volumetrics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__PROCESS_VOLUMETRICS = eINSTANCE.getProcess_ProcessVolumetrics();

		/**
		 * The meta object literal for the '<em><b>Decomposes Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__DECOMPOSES_PROCESS = eINSTANCE.getProcess_DecomposesProcess();

		/**
		 * The meta object literal for the '<em><b>Precedes Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PRECEDES_PROCESSES = eINSTANCE.getProcess_PrecedesProcesses();

		/**
		 * The meta object literal for the '<em><b>Follows Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FOLLOWS_PROCESSES = eINSTANCE.getProcess_FollowsProcesses();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ANY = eINSTANCE.getProcess_Any();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PlatformServiceImpl <em>Platform Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PlatformServiceImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPlatformService()
		 * @generated
		 */
		EClass PLATFORM_SERVICE = eINSTANCE.getPlatformService();

		/**
		 * The meta object literal for the '<em><b>Is Supplied By Logical Technology Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_SERVICE__IS_SUPPLIED_BY_LOGICAL_TECHNOLOGY_COMPONENTS = eINSTANCE.getPlatformService_IsSuppliedByLogicalTechnologyComponents();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl <em>Physical Technology Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPhysicalTechnologyComponent()
		 * @generated
		 */
		EClass PHYSICAL_TECHNOLOGY_COMPONENT = eINSTANCE.getPhysicalTechnologyComponent();

		/**
		 * The meta object literal for the '<em><b>Realizes Application Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_APPLICATION_COMPONENTS = eINSTANCE.getPhysicalTechnologyComponent_RealizesApplicationComponents();

		/**
		 * The meta object literal for the '<em><b>Extends Logical Technology Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS = eINSTANCE.getPhysicalTechnologyComponent_ExtendsLogicalTechnologyComponents();

		/**
		 * The meta object literal for the '<em><b>Is Hosted In Location</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION = eINSTANCE.getPhysicalTechnologyComponent_IsHostedInLocation();

		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME = eINSTANCE.getPhysicalTechnologyComponent_ProductName();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME = eINSTANCE.getPhysicalTechnologyComponent_ModuleName();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR = eINSTANCE.getPhysicalTechnologyComponent_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_TECHNOLOGY_COMPONENT__VERSION = eINSTANCE.getPhysicalTechnologyComponent_Version();

		/**
		 * The meta object literal for the '<em><b>Decomposes Physical Technology Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT = eINSTANCE.getPhysicalTechnologyComponent_DecomposesPhysicalTechnologyComponent();

		/**
		 * The meta object literal for the '<em><b>Is Dependent On Physical Technology Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS = eINSTANCE.getPhysicalTechnologyComponent_IsDependentOnPhysicalTechnologyComponents();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProductImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Is Produced By Organization Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS = eINSTANCE.getProduct_IsProducedByOrganizationUnits();

		/**
		 * The meta object literal for the '<em><b>Is Produced By Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__IS_PRODUCED_BY_PROCESSES = eINSTANCE.getProduct_IsProducedByProcesses();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.MeasureImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Sets Performance Criteria For Objectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES = eINSTANCE.getMeasure_SetsPerformanceCriteriaForObjectives();

		/**
		 * The meta object literal for the '<em><b>Sets Performance Criteria For Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES = eINSTANCE.getMeasure_SetsPerformanceCriteriaForServices();

		/**
		 * The meta object literal for the '<em><b>Decomposes Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__DECOMPOSES_MEASURE = eINSTANCE.getMeasure_DecomposesMeasure();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceQualityImpl <em>Service Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceQualityImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getServiceQuality()
		 * @generated
		 */
		EClass SERVICE_QUALITY = eINSTANCE.getServiceQuality();

		/**
		 * The meta object literal for the '<em><b>Applies To Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_QUALITY__APPLIES_TO_SERVICES = eINSTANCE.getServiceQuality_AppliesToServices();

		/**
		 * The meta object literal for the '<em><b>Applies To Contracts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_QUALITY__APPLIES_TO_CONTRACTS = eINSTANCE.getServiceQuality_AppliesToContracts();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Governs And Measures Business Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES = eINSTANCE.getContract_GovernsAndMeasuresBusinessServices();

		/**
		 * The meta object literal for the '<em><b>Meets Service Quality</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__MEETS_SERVICE_QUALITY = eINSTANCE.getContract_MeetsServiceQuality();

		/**
		 * The meta object literal for the '<em><b>Behavior Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__BEHAVIOR_CHARACTERISTICS = eINSTANCE.getContract_BehaviorCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Service Name Caller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__SERVICE_NAME_CALLER = eINSTANCE.getContract_ServiceNameCaller();

		/**
		 * The meta object literal for the '<em><b>Service Name Called</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__SERVICE_NAME_CALLED = eINSTANCE.getContract_ServiceNameCalled();

		/**
		 * The meta object literal for the '<em><b>Service Quality Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__SERVICE_QUALITY_CHARACTERISTICS = eINSTANCE.getContract_ServiceQualityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Availability Quality Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS = eINSTANCE.getContract_AvailabilityQualityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Services Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__SERVICES_TIMES = eINSTANCE.getContract_ServicesTimes();

		/**
		 * The meta object literal for the '<em><b>Manageability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__MANAGEABILITY_CHARACTERISTICS = eINSTANCE.getContract_ManageabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Serviceability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__SERVICEABILITY_CHARACTERISTICS = eINSTANCE.getContract_ServiceabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Performance Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__PERFORMANCE_CHARACTERISTICS = eINSTANCE.getContract_PerformanceCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Response Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__RESPONSE_CHARACTERISTICS = eINSTANCE.getContract_ResponseCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Reliability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__RELIABILITY_CHARACTERISTICS = eINSTANCE.getContract_ReliabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Quality Of Information Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__QUALITY_OF_INFORMATION_REQUIRED = eINSTANCE.getContract_QualityOfInformationRequired();

		/**
		 * The meta object literal for the '<em><b>Contract Control Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__CONTRACT_CONTROL_REQUIREMENTS = eINSTANCE.getContract_ContractControlRequirements();

		/**
		 * The meta object literal for the '<em><b>Result Control Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__RESULT_CONTROL_REQUIREMENTS = eINSTANCE.getContract_ResultControlRequirements();

		/**
		 * The meta object literal for the '<em><b>Recoverability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__RECOVERABILITY_CHARACTERISTICS = eINSTANCE.getContract_RecoverabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Locatability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__LOCATABILITY_CHARACTERISTICS = eINSTANCE.getContract_LocatabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Security Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__SECURITY_CHARACTERISTICS = eINSTANCE.getContract_SecurityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Privacy Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__PRIVACY_CHARACTERISTICS = eINSTANCE.getContract_PrivacyCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Integrity Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__INTEGRITY_CHARACTERISTICS = eINSTANCE.getContract_IntegrityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Credibility Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__CREDIBILITY_CHARACTERISTICS = eINSTANCE.getContract_CredibilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Localization Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__LOCALIZATION_CHARACTERISTICS = eINSTANCE.getContract_LocalizationCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Internationalization Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS = eINSTANCE.getContract_InternationalizationCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Interoperability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__INTEROPERABILITY_CHARACTERISTICS = eINSTANCE.getContract_InteroperabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Scalability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__SCALABILITY_CHARACTERISTICS = eINSTANCE.getContract_ScalabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Portability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__PORTABILITY_CHARACTERISTICS = eINSTANCE.getContract_PortabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Extensibility Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__EXTENSIBILITY_CHARACTERISTICS = eINSTANCE.getContract_ExtensibilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Capacity Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__CAPACITY_CHARACTERISTICS = eINSTANCE.getContract_CapacityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__THROUGHPUT = eINSTANCE.getContract_Throughput();

		/**
		 * The meta object literal for the '<em><b>Throughput Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__THROUGHPUT_PERIOD = eINSTANCE.getContract_ThroughputPeriod();

		/**
		 * The meta object literal for the '<em><b>Growth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__GROWTH = eINSTANCE.getContract_Growth();

		/**
		 * The meta object literal for the '<em><b>Growth Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__GROWTH_PERIOD = eINSTANCE.getContract_GrowthPeriod();

		/**
		 * The meta object literal for the '<em><b>Peak Profile Short Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__PEAK_PROFILE_SHORT_TERM = eINSTANCE.getContract_PeakProfileShortTerm();

		/**
		 * The meta object literal for the '<em><b>Peak Profile Long Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__PEAK_PROFILE_LONG_TERM = eINSTANCE.getContract_PeakProfileLongTerm();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.EventImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Is Resolved By Business Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__IS_RESOLVED_BY_BUSINESS_SERVICES = eINSTANCE.getEvent_IsResolvedByBusinessServices();

		/**
		 * The meta object literal for the '<em><b>Is Resolved By Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__IS_RESOLVED_BY_PROCESSES = eINSTANCE.getEvent_IsResolvedByProcesses();

		/**
		 * The meta object literal for the '<em><b>Is Generated By Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__IS_GENERATED_BY_PROCESSES = eINSTANCE.getEvent_IsGeneratedByProcesses();

		/**
		 * The meta object literal for the '<em><b>Is Resolved By Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__IS_RESOLVED_BY_ACTORS = eINSTANCE.getEvent_IsResolvedByActors();

		/**
		 * The meta object literal for the '<em><b>Is Generated By Actors</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__IS_GENERATED_BY_ACTORS = eINSTANCE.getEvent_IsGeneratedByActors();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ControlImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Ensures Correct Operation Of Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__ENSURES_CORRECT_OPERATION_OF_PROCESSES = eINSTANCE.getControl_EnsuresCorrectOperationOfProcesses();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ElementImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Delegates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__DELEGATES = eINSTANCE.getElement_Delegates();

		/**
		 * The meta object literal for the '<em><b>Is Delegated By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__IS_DELEGATED_BY = eINSTANCE.getElement_IsDelegatedBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DESCRIPTION = eINSTANCE.getElement_Description();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CATEGORY = eINSTANCE.getElement_Category();

		/**
		 * The meta object literal for the '<em><b>Source Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__SOURCE_DESCR = eINSTANCE.getElement_SourceDescr();

		/**
		 * The meta object literal for the '<em><b>Owner Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__OWNER_DESCR = eINSTANCE.getElement_OwnerDescr();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_ID();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContainerImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Owns Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__OWNS_ELEMENTS = eINSTANCE.getContainer_OwnsElements();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Contains Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONTAINS_ACTORS = eINSTANCE.getLocation_ContainsActors();

		/**
		 * The meta object literal for the '<em><b>Contains Organization Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONTAINS_ORGANIZATION_UNITS = eINSTANCE.getLocation_ContainsOrganizationUnits();

		/**
		 * The meta object literal for the '<em><b>Contains Physical Data Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS = eINSTANCE.getLocation_ContainsPhysicalDataComponents();

		/**
		 * The meta object literal for the '<em><b>Contains Physical Application Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS = eINSTANCE.getLocation_ContainsPhysicalApplicationComponents();

		/**
		 * The meta object literal for the '<em><b>Contains Physical Technology Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS = eINSTANCE.getLocation_ContainsPhysicalTechnologyComponents();

		/**
		 * The meta object literal for the '<em><b>Decomposes Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__DECOMPOSES_LOCATION = eINSTANCE.getLocation_DecomposesLocation();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.CapabilityImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Is Delivered By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__IS_DELIVERED_BY = eINSTANCE.getCapability_IsDeliveredBy();

		/**
		 * The meta object literal for the '<em><b>Business Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__BUSINESS_VALUE = eINSTANCE.getCapability_BusinessValue();

		/**
		 * The meta object literal for the '<em><b>Increments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__INCREMENTS = eINSTANCE.getCapability_Increments();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicElementImpl <em>Strategic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicElementImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getStrategicElement()
		 * @generated
		 */
		EClass STRATEGIC_ELEMENT = eINSTANCE.getStrategicElement();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PrincipleImpl <em>Principle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PrincipleImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPrinciple()
		 * @generated
		 */
		EClass PRINCIPLE = eINSTANCE.getPrinciple();

		/**
		 * The meta object literal for the '<em><b>Principle Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPLE__PRINCIPLE_CATEGORY = eINSTANCE.getPrinciple_PrincipleCategory();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPLE__PRIORITY = eINSTANCE.getPrinciple_Priority();

		/**
		 * The meta object literal for the '<em><b>Statement Of Principle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPLE__STATEMENT_OF_PRINCIPLE = eINSTANCE.getPrinciple_StatementOfPrinciple();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPLE__RATIONALE = eINSTANCE.getPrinciple_Rationale();

		/**
		 * The meta object literal for the '<em><b>Implication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPLE__IMPLICATION = eINSTANCE.getPrinciple_Implication();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPLE__METRIC = eINSTANCE.getPrinciple_Metric();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ConstraintImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.AssumptionImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RequirementImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Statement Of Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STATEMENT_OF_REQUIREMENT = eINSTANCE.getRequirement_StatementOfRequirement();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__RATIONALE = eINSTANCE.getRequirement_Rationale();

		/**
		 * The meta object literal for the '<em><b>Acceptance Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ACCEPTANCE_CRITERIA = eINSTANCE.getRequirement_AcceptanceCriteria();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GapImpl <em>Gap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.GapImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getGap()
		 * @generated
		 */
		EClass GAP = eINSTANCE.getGap();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.WorkPackageImpl <em>Work Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.WorkPackageImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getWorkPackage()
		 * @generated
		 */
		EClass WORK_PACKAGE = eINSTANCE.getWorkPackage();

		/**
		 * The meta object literal for the '<em><b>Work Package Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PACKAGE__WORK_PACKAGE_CATEGORY = eINSTANCE.getWorkPackage_WorkPackageCategory();

		/**
		 * The meta object literal for the '<em><b>Delivers Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PACKAGE__DELIVERS_CAPABILITIES = eINSTANCE.getWorkPackage_DeliversCapabilities();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalDataComponentImpl <em>Logical Data Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalDataComponentImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getLogicalDataComponent()
		 * @generated
		 */
		EClass LOGICAL_DATA_COMPONENT = eINSTANCE.getLogicalDataComponent();

		/**
		 * The meta object literal for the '<em><b>Encapsulates Data Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DATA_COMPONENT__ENCAPSULATES_DATA_ENTITIES = eINSTANCE.getLogicalDataComponent_EncapsulatesDataEntities();

		/**
		 * The meta object literal for the '<em><b>Is Extended By Physical Data Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DATA_COMPONENT__IS_EXTENDED_BY_PHYSICAL_DATA_COMPONENTS = eINSTANCE.getLogicalDataComponent_IsExtendedByPhysicalDataComponents();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl <em>Physical Data Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPhysicalDataComponent()
		 * @generated
		 */
		EClass PHYSICAL_DATA_COMPONENT = eINSTANCE.getPhysicalDataComponent();

		/**
		 * The meta object literal for the '<em><b>Extends Logical Data Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS = eINSTANCE.getPhysicalDataComponent_ExtendsLogicalDataComponents();

		/**
		 * The meta object literal for the '<em><b>Is Hoted In Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION = eINSTANCE.getPhysicalDataComponent_IsHotedInLocation();

		/**
		 * The meta object literal for the '<em><b>Decomposes Physical Data Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT = eINSTANCE.getPhysicalDataComponent_DecomposesPhysicalDataComponent();

		/**
		 * The meta object literal for the '<em><b>Encapsulates Physical Application Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS = eINSTANCE.getPhysicalDataComponent_EncapsulatesPhysicalApplicationComponents();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationArchitectureImpl <em>Application Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationArchitectureImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getApplicationArchitecture()
		 * @generated
		 */
		EClass APPLICATION_ARCHITECTURE = eINSTANCE.getApplicationArchitecture();

		/**
		 * The meta object literal for the '<em><b>Logical Application Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS = eINSTANCE.getApplicationArchitecture_LogicalApplicationComponents();

		/**
		 * The meta object literal for the '<em><b>Physical Application Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS = eINSTANCE.getApplicationArchitecture_PhysicalApplicationComponents();

		/**
		 * The meta object literal for the '<em><b>Information System Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES = eINSTANCE.getApplicationArchitecture_InformationSystemServices();

		/**
		 * The meta object literal for the '<em><b>Any Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_ARCHITECTURE__ANY_REF = eINSTANCE.getApplicationArchitecture_AnyRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl <em>Physical Application Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPhysicalApplicationComponent()
		 * @generated
		 */
		EClass PHYSICAL_APPLICATION_COMPONENT = eINSTANCE.getPhysicalApplicationComponent();

		/**
		 * The meta object literal for the '<em><b>Extends Logical Application Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS = eINSTANCE.getPhysicalApplicationComponent_ExtendsLogicalApplicationComponents();

		/**
		 * The meta object literal for the '<em><b>Is Hosted In Location</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION = eINSTANCE.getPhysicalApplicationComponent_IsHostedInLocation();

		/**
		 * The meta object literal for the '<em><b>Communicates With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH = eINSTANCE.getPhysicalApplicationComponent_CommunicatesWith();

		/**
		 * The meta object literal for the '<em><b>Life Cycle Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS = eINSTANCE.getPhysicalApplicationComponent_LifeCycleStatus();

		/**
		 * The meta object literal for the '<em><b>Initial Live Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE = eINSTANCE.getPhysicalApplicationComponent_InitialLiveDate();

		/**
		 * The meta object literal for the '<em><b>Date Of Last Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE = eINSTANCE.getPhysicalApplicationComponent_DateOfLastRelease();

		/**
		 * The meta object literal for the '<em><b>Date Of Next Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE = eINSTANCE.getPhysicalApplicationComponent_DateOfNextRelease();

		/**
		 * The meta object literal for the '<em><b>Retirement Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE = eINSTANCE.getPhysicalApplicationComponent_RetirementDate();

		/**
		 * The meta object literal for the '<em><b>Availability Quality Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_AvailabilityQualityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Services Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES = eINSTANCE.getPhysicalApplicationComponent_ServicesTimes();

		/**
		 * The meta object literal for the '<em><b>Manageability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_ManageabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Serviceability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_ServiceabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Performance Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_PerformanceCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Reliability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_ReliabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Recoverability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_RecoverabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Locatability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_LocatabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Security Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_SecurityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Privacy Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_PrivacyCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Integrity Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_IntegrityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Credibility Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_CredibilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Localization Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_LocalizationCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Internationalization Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_InternationalizationCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Interoperability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_InteroperabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Scalability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_ScalabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Portability Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_PortabilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Extensibility Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_ExtensibilityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Capacity Characteristics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS = eINSTANCE.getPhysicalApplicationComponent_CapacityCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT = eINSTANCE.getPhysicalApplicationComponent_Throughput();

		/**
		 * The meta object literal for the '<em><b>Throughput Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD = eINSTANCE.getPhysicalApplicationComponent_ThroughputPeriod();

		/**
		 * The meta object literal for the '<em><b>Growth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__GROWTH = eINSTANCE.getPhysicalApplicationComponent_Growth();

		/**
		 * The meta object literal for the '<em><b>Growth Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD = eINSTANCE.getPhysicalApplicationComponent_GrowthPeriod();

		/**
		 * The meta object literal for the '<em><b>Peak Profile Short Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM = eINSTANCE.getPhysicalApplicationComponent_PeakProfileShortTerm();

		/**
		 * The meta object literal for the '<em><b>Peak Profile Long Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM = eINSTANCE.getPhysicalApplicationComponent_PeakProfileLongTerm();

		/**
		 * The meta object literal for the '<em><b>Encapsulates Physical Data Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS = eINSTANCE.getPhysicalApplicationComponent_EncapsulatesPhysicalDataComponents();

		/**
		 * The meta object literal for the '<em><b>Is Realized By Physical Technology Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS = eINSTANCE.getPhysicalApplicationComponent_IsRealizedByPhysicalTechnologyComponents();

		/**
		 * The meta object literal for the '<em><b>Decomposes Physical Application Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT = eINSTANCE.getPhysicalApplicationComponent_DecomposesPhysicalApplicationComponent();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl <em>Logical Technology Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getLogicalTechnologyComponent()
		 * @generated
		 */
		EClass LOGICAL_TECHNOLOGY_COMPONENT = eINSTANCE.getLogicalTechnologyComponent();

		/**
		 * The meta object literal for the '<em><b>Provides Platform For Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES = eINSTANCE.getLogicalTechnologyComponent_ProvidesPlatformForServices();

		/**
		 * The meta object literal for the '<em><b>Supplies Platform Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES = eINSTANCE.getLogicalTechnologyComponent_SuppliesPlatformServices();

		/**
		 * The meta object literal for the '<em><b>Is Realized By Physical Technology Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS = eINSTANCE.getLogicalTechnologyComponent_IsRealizedByPhysicalTechnologyComponents();

		/**
		 * The meta object literal for the '<em><b>Decomposes Logical Technology Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT = eINSTANCE.getLogicalTechnologyComponent_DecomposesLogicalTechnologyComponent();

		/**
		 * The meta object literal for the '<em><b>Is Dependent On Logical Technology Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS = eINSTANCE.getLogicalTechnologyComponent_IsDependentOnLogicalTechnologyComponents();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicArchitectureImpl <em>Strategic Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicArchitectureImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getStrategicArchitecture()
		 * @generated
		 */
		EClass STRATEGIC_ARCHITECTURE = eINSTANCE.getStrategicArchitecture();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGIC_ARCHITECTURE__CAPABILITIES = eINSTANCE.getStrategicArchitecture_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Strategic Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGIC_ARCHITECTURE__STRATEGIC_ELEMENTS = eINSTANCE.getStrategicArchitecture_StrategicElements();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StandardImpl <em>Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StandardImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getStandard()
		 * @generated
		 */
		EClass STANDARD = eINSTANCE.getStandard();

		/**
		 * The meta object literal for the '<em><b>Standard Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__STANDARD_CLASS = eINSTANCE.getStandard_StandardClass();

		/**
		 * The meta object literal for the '<em><b>Standard Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__STANDARD_CREATION_DATE = eINSTANCE.getStandard_StandardCreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Standard Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__LAST_STANDARD_CREATION_DATE = eINSTANCE.getStandard_LastStandardCreationDate();

		/**
		 * The meta object literal for the '<em><b>Next Standard Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__NEXT_STANDARD_CREATION_DATE = eINSTANCE.getStandard_NextStandardCreationDate();

		/**
		 * The meta object literal for the '<em><b>Retire Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD__RETIRE_DATE = eINSTANCE.getStandard_RetireDate();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ServiceImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Is Provided To Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IS_PROVIDED_TO_ACTORS = eINSTANCE.getService_IsProvidedToActors();

		/**
		 * The meta object literal for the '<em><b>Provides Governed Interface To Access Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS = eINSTANCE.getService_ProvidesGovernedInterfaceToAccessFunctions();

		/**
		 * The meta object literal for the '<em><b>Provides Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PROVIDES_ENTITIES = eINSTANCE.getService_ProvidesEntities();

		/**
		 * The meta object literal for the '<em><b>Consumes Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CONSUMES_ENTITIES = eINSTANCE.getService_ConsumesEntities();

		/**
		 * The meta object literal for the '<em><b>Is Governed And Measured By Contracts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS = eINSTANCE.getService_IsGovernedAndMeasuredByContracts();

		/**
		 * The meta object literal for the '<em><b>Resolves Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__RESOLVES_EVENTS = eINSTANCE.getService_ResolvesEvents();

		/**
		 * The meta object literal for the '<em><b>Is Implemented On Logical Technology Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS = eINSTANCE.getService_IsImplementedOnLogicalTechnologyComponents();

		/**
		 * The meta object literal for the '<em><b>Is Realized Through Logical Application Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT = eINSTANCE.getService_IsRealizedThroughLogicalApplicationComponent();

		/**
		 * The meta object literal for the '<em><b>Is Owned And Governed By Organization Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS = eINSTANCE.getService_IsOwnedAndGovernedByOrganizationUnits();

		/**
		 * The meta object literal for the '<em><b>Is Tracked Against Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IS_TRACKED_AGAINST_MEASURES = eINSTANCE.getService_IsTrackedAgainstMeasures();

		/**
		 * The meta object literal for the '<em><b>Supports Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SUPPORTS_PROCESSES = eINSTANCE.getService_SupportsProcesses();

		/**
		 * The meta object literal for the '<em><b>Is Realized By Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IS_REALIZED_BY_PROCESSES = eINSTANCE.getService_IsRealizedByProcesses();

		/**
		 * The meta object literal for the '<em><b>Meets Qualities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__MEETS_QUALITIES = eINSTANCE.getService_MeetsQualities();

		/**
		 * The meta object literal for the '<em><b>Consumes Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CONSUMES_SERVICES = eINSTANCE.getService_ConsumesServices();

		/**
		 * The meta object literal for the '<em><b>Decomposes Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DECOMPOSES_SERVICES = eINSTANCE.getService_DecomposesServices();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationComponentImpl <em>Application Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ApplicationComponentImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getApplicationComponent()
		 * @generated
		 */
		EClass APPLICATION_COMPONENT = eINSTANCE.getApplicationComponent();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl <em>Information System Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.InformationSystemServiceImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getInformationSystemService()
		 * @generated
		 */
		EClass INFORMATION_SYSTEM_SERVICE = eINSTANCE.getInformationSystemService();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_SYSTEM_SERVICE__ANY = eINSTANCE.getInformationSystemService_Any();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataComponentImpl <em>Data Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataComponentImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getDataComponent()
		 * @generated
		 */
		EClass DATA_COMPONENT = eINSTANCE.getDataComponent();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyComponentImpl <em>Technology Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyComponentImpl
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getTechnologyComponent()
		 * @generated
		 */
		EClass TECHNOLOGY_COMPONENT = eINSTANCE.getTechnologyComponent();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PrincipleCategory <em>Principle Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PrincipleCategory
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getPrincipleCategory()
		 * @generated
		 */
		EEnum PRINCIPLE_CATEGORY = eINSTANCE.getPrincipleCategory();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass <em>Standards Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getStandardsClass()
		 * @generated
		 */
		EEnum STANDARDS_CLASS = eINSTANCE.getStandardsClass();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus <em>Life Cycle Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getLifeCycleStatus()
		 * @generated
		 */
		EEnum LIFE_CYCLE_STATUS = eINSTANCE.getLifeCycleStatus();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory <em>Data Entity Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getDataEntityCategory()
		 * @generated
		 */
		EEnum DATA_ENTITY_CATEGORY = eINSTANCE.getDataEntityCategory();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory <em>Work Package Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory
		 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContentfwkPackageImpl#getWorkPackageCategory()
		 * @generated
		 */
		EEnum WORK_PACKAGE_CATEGORY = eINSTANCE.getWorkPackageCategory();

	}

} //ContentfwkPackage
