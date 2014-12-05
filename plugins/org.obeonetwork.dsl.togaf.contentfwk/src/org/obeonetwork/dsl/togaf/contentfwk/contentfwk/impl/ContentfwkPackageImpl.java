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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Architecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Assumption;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Constraint;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Gap;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PrincipleCategory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicElement;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentfwkPackageImpl extends EPackageImpl implements ContentfwkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalApplicationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalTechnologyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceQualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategicElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalDataComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalDataComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalApplicationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalTechnologyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategicArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationSystemServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum principleCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardsClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifeCycleStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataEntityCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workPackageCategoryEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContentfwkPackageImpl() {
		super(eNS_URI, ContentfwkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ContentfwkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContentfwkPackage init() {
		if (isInited) return (ContentfwkPackage)EPackage.Registry.INSTANCE.getEPackage(ContentfwkPackage.eNS_URI);

		// Obtain or create and register package
		ContentfwkPackageImpl theContentfwkPackage = (ContentfwkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContentfwkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContentfwkPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theContentfwkPackage.createPackageContents();

		// Initialize created meta-data
		theContentfwkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContentfwkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContentfwkPackage.eNS_URI, theContentfwkPackage);
		return theContentfwkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnterpriseArchitecture() {
		return enterpriseArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnterpriseArchitecture_Architectures() {
		return (EReference)enterpriseArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecture() {
		return architectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessArchitecture() {
		return businessArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Drivers() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Goals() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Objectives() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Units() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Actors() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Roles() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Functions() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Services() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Processes() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Controls() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Events() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Locations() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Products() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Contracts() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_Measures() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessArchitecture_ServicesQuality() {
		return (EReference)businessArchitectureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataArchitecture() {
		return dataArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataArchitecture_Entities() {
		return (EReference)dataArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataArchitecture_LogicalComponents() {
		return (EReference)dataArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataArchitecture_PhysicalComponents() {
		return (EReference)dataArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologyArchitecture() {
		return technologyArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologyArchitecture_PlatformServices() {
		return (EReference)technologyArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologyArchitecture_PhysicalComponents() {
		return (EReference)technologyArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnologyArchitecture_LogicalComponents() {
		return (EReference)technologyArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDriver() {
		return driverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriver_CreatesGoals() {
		return (EReference)driverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriver_MotivatesOrganizationUnits() {
		return (EReference)driverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriver_DecomposesDriver() {
		return (EReference)driverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriver_IsDecomposedByDrivers() {
		return (EReference)driverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_AddressesDrivers() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_IsRealizedThroughObjectives() {
		return (EReference)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_DecomposesGoal() {
		return (EReference)goalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_IsDecomposedByGoals() {
		return (EReference)goalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjective() {
		return objectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_RealizesGoals() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_IsTrackedAgainstMeasures() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_DecomposesObjective() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_IsSupportedByBusinessService() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_IsDecomposedByObjectives() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationUnit() {
		return organizationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OwnsAndGovernsServices() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_ContainsActors() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OwnsFunctions() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_ParticipatesInProcesses() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_IsMotivatedByDrivers() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_ProducesProducts() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OperatesInLocation() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationUnit_Headcount() {
		return (EAttribute)organizationUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_DecomposesOrganizationUnit() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_IsDecomposedByOrganizationUnits() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_SuppliesDataEntities() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ConsumesDataEntities() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_BelongsToOrganizationUnit() {
		return (EReference)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_InteractsWithFunctions() {
		return (EReference)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_PerformsTaskInRoles() {
		return (EReference)actorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ParticipatesInProcesses() {
		return (EReference)actorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ConsumesServices() {
		return (EReference)actorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ResolvesEvents() {
		return (EReference)actorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_GeneratesEvents() {
		return (EReference)actorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_OperatesInLocation() {
		return (EReference)actorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_FTEs() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_ActorGoal() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_ActorTasks() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_PerformsFunctions() {
		return (EReference)actorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_DecomposesActor() {
		return (EReference)actorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_IsDecomposedByActors() {
		return (EReference)actorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_IsAssumedByActors() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_AccessesFunctions() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_EstimatedFTEs() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_DecomposesRole() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_IsDecomposedByRoles() {
		return (EReference)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataEntity() {
		return dataEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEntity_IsSuppliedByActors() {
		return (EReference)dataEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEntity_IsConsumedByActors() {
		return (EReference)dataEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEntity_IsAccessedByServices() {
		return (EReference)dataEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEntity_IsUpdatedThroughServices() {
		return (EReference)dataEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEntity_ResidesWithinLogicalDataComponent() {
		return (EReference)dataEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEntity_IsProcessesByLogicalApplicationComponents() {
		return (EReference)dataEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataEntity_DataEntityCategory() {
		return (EAttribute)dataEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataEntity_PrivacyClassification() {
		return (EAttribute)dataEntityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataEntity_RetentionClassification() {
		return (EAttribute)dataEntityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEntity_DecomposesDataEntity() {
		return (EReference)dataEntityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEntity_RelatesToDataEntities() {
		return (EReference)dataEntityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataEntity_IsDecomposedByDataEntities() {
		return (EReference)dataEntityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalApplicationComponent() {
		return logicalApplicationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalApplicationComponent_ImplementsServices() {
		return (EReference)logicalApplicationComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalApplicationComponent_OperatesOnDataEntities() {
		return (EReference)logicalApplicationComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalApplicationComponent_IsExtendedByPhysicalApplicationComponents() {
		return (EReference)logicalApplicationComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalApplicationComponent_CommunicatesWith() {
		return (EReference)logicalApplicationComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalApplicationComponent_DecomposesLogicalApplicationComponent() {
		return (EReference)logicalApplicationComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalApplicationComponent_IsDecomposedByLogicalApplicationComponents() {
		return (EReference)logicalApplicationComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_IsPerformedByActors() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_IsOwnedByOrganizationUnit() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_IsBoundedByServices() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_SupportsProcesses() {
		return (EReference)functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_IsRealizedByProcesses() {
		return (EReference)functionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_CanBeAccessedByRoles() {
		return (EReference)functionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_SupportsActors() {
		return (EReference)functionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_DecomposesFunction() {
		return (EReference)functionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_CommunicatesWithFunctions() {
		return (EReference)functionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_IsDecomposedByFunctions() {
		return (EReference)functionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessService() {
		return businessServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessService_SupportsObjective() {
		return (EReference)businessServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_OrchestratesFunctions() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_DecomposesFunctions() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_InvolvesOrganizationUnits() {
		return (EReference)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_OrchestratesServices() {
		return (EReference)processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_DecomposesServices() {
		return (EReference)processEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_InvolvesActors() {
		return (EReference)processEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_IsGuidedByControls() {
		return (EReference)processEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_ResolvesEvents() {
		return (EReference)processEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_GeneratesEvents() {
		return (EReference)processEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_ProducesProducts() {
		return (EReference)processEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_ProcessCritiality() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_IsAutomated() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_ProcessVolumetrics() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_DecomposesProcess() {
		return (EReference)processEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_PrecedesProcesses() {
		return (EReference)processEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_FollowsProcesses() {
		return (EReference)processEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_IsDecomposedByProcesses() {
		return (EReference)processEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformService() {
		return platformServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformService_IsSuppliedByLogicalTechnologyComponents() {
		return (EReference)platformServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformService_CategoryTRM() {
		return (EAttribute)platformServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformService_StandardClass() {
		return (EAttribute)platformServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalTechnologyComponent() {
		return physicalTechnologyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalTechnologyComponent_RealizesPhysicalApplicationComponents() {
		return (EReference)physicalTechnologyComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalTechnologyComponent_ExtendsLogicalTechnologyComponents() {
		return (EReference)physicalTechnologyComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalTechnologyComponent_IsHostedInLocation() {
		return (EReference)physicalTechnologyComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalTechnologyComponent_ProductName() {
		return (EAttribute)physicalTechnologyComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalTechnologyComponent_ModuleName() {
		return (EAttribute)physicalTechnologyComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalTechnologyComponent_Vendor() {
		return (EAttribute)physicalTechnologyComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalTechnologyComponent_Version() {
		return (EAttribute)physicalTechnologyComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalTechnologyComponent_DecomposesPhysicalTechnologyComponent() {
		return (EReference)physicalTechnologyComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalTechnologyComponent_IsDependentOnPhysicalTechnologyComponents() {
		return (EReference)physicalTechnologyComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalTechnologyComponent_CategoryTRM() {
		return (EAttribute)physicalTechnologyComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalTechnologyComponent_IsRequiredByPhysicalTechnologyComponent() {
		return (EReference)physicalTechnologyComponentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalTechnologyComponent_IsDecomposedByPhysicalTechnologyComponents() {
		return (EReference)physicalTechnologyComponentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_IsProducedByOrganizationUnits() {
		return (EReference)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_IsProducedByProcesses() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_SetsPerformanceCriteriaForObjectives() {
		return (EReference)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_SetsPerformanceCriteriaForServices() {
		return (EReference)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_DecomposesMeasure() {
		return (EReference)measureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_IsDecomposedByMeasures() {
		return (EReference)measureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceQuality() {
		return serviceQualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceQuality_AppliesToServices() {
		return (EReference)serviceQualityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceQuality_AppliesToContracts() {
		return (EReference)serviceQualityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_GovernsAndMeasuresBusinessServices() {
		return (EReference)contractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_MeetsServiceQuality() {
		return (EReference)contractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_BehaviorCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ServiceNameCaller() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ServiceNameCalled() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ServiceQualityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_AvailabilityQualityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ServicesTimes() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ManageabilityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ServiceabilityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_PerformanceCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ResponseCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ReliabilityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_QualityOfInformationRequired() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ContractControlRequirements() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ResultControlRequirements() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_RecoverabilityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_LocatabilityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_SecurityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_PrivacyCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_IntegrityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_CredibilityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_LocalizationCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_InternationalizationCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_InteroperabilityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ScalabilityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_PortabilityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ExtensibilityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_CapacityCharacteristics() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_Throughput() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_ThroughputPeriod() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_Growth() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_GrowthPeriod() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_PeakProfileShortTerm() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContract_PeakProfileLongTerm() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_IsResolvedByServices() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_IsResolvedByProcesses() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_IsGeneratedByProcesses() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_IsResolvedByActors() {
		return (EReference)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_IsGeneratedByActors() {
		return (EReference)eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_EnsuresCorrectOperationOfProcesses() {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Delegates() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_IsDelegatedBy() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Description() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Category() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_SourceDescr() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_OwnerDescr() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ID() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_ContainsActors() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_ContainsOrganizationUnits() {
		return (EReference)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_ContainsPhysicalDataComponents() {
		return (EReference)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_ContainsPhysicalApplicationComponents() {
		return (EReference)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_ContainsPhysicalTechnologyComponents() {
		return (EReference)locationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_DecomposesLocation() {
		return (EReference)locationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_IsDecomposedByLocations() {
		return (EReference)locationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_IsDeliveredBy() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_BusinessValue() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Increments() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategicElement() {
		return strategicElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrinciple() {
		return principleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinciple_PrincipleCategory() {
		return (EAttribute)principleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinciple_Priority() {
		return (EAttribute)principleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinciple_StatementOfPrinciple() {
		return (EAttribute)principleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinciple_Rationale() {
		return (EAttribute)principleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinciple_Implication() {
		return (EAttribute)principleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrinciple_Metric() {
		return (EAttribute)principleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_StatementOfRequirement() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Rationale() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_AcceptanceCriteria() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGap() {
		return gapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkPackage() {
		return workPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkPackage_WorkPackageCategory() {
		return (EAttribute)workPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkPackage_DeliversCapabilities() {
		return (EReference)workPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkPackage_CapabilityDelivered() {
		return (EAttribute)workPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalDataComponent() {
		return logicalDataComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDataComponent_EncapsulatesDataEntities() {
		return (EReference)logicalDataComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDataComponent_IsExtendedByPhysicalDataComponents() {
		return (EReference)logicalDataComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalDataComponent() {
		return physicalDataComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDataComponent_ExtendsLogicalDataComponents() {
		return (EReference)physicalDataComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDataComponent_IsHotedInLocation() {
		return (EReference)physicalDataComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDataComponent_DecomposesPhysicalDataComponent() {
		return (EReference)physicalDataComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDataComponent_EncapsulatesPhysicalApplicationComponents() {
		return (EReference)physicalDataComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalDataComponent_IsDecomposedByPhysicalDataComponents() {
		return (EReference)physicalDataComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationArchitecture() {
		return applicationArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArchitecture_LogicalApplicationComponents() {
		return (EReference)applicationArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArchitecture_PhysicalApplicationComponents() {
		return (EReference)applicationArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationArchitecture_InformationSystemServices() {
		return (EReference)applicationArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalApplicationComponent() {
		return physicalApplicationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalApplicationComponent_ExtendsLogicalApplicationComponents() {
		return (EReference)physicalApplicationComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalApplicationComponent_IsHostedInLocation() {
		return (EReference)physicalApplicationComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalApplicationComponent_CommunicatesWith() {
		return (EReference)physicalApplicationComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_LifeCycleStatus() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_InitialLiveDate() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_DateOfLastRelease() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_DateOfNextRelease() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_RetirementDate() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_AvailabilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_ServicesTimes() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_ManageabilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_ServiceabilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_PerformanceCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_ReliabilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_RecoverabilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_LocatabilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_SecurityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_PrivacyCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_IntegrityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_CredibilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_LocalizationCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_InternationalizationCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_InteroperabilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_ScalabilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_PortabilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_ExtensibilityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_CapacityCharacteristics() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_Throughput() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_ThroughputPeriod() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_Growth() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_GrowthPeriod() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_PeakProfileShortTerm() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalApplicationComponent_PeakProfileLongTerm() {
		return (EAttribute)physicalApplicationComponentEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalApplicationComponent_EncapsulatesPhysicalDataComponents() {
		return (EReference)physicalApplicationComponentEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalApplicationComponent_IsRealizedByPhysicalTechnologyComponents() {
		return (EReference)physicalApplicationComponentEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalApplicationComponent_DecomposesPhysicalApplicationComponent() {
		return (EReference)physicalApplicationComponentEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalApplicationComponent_IsDecomposedByPhysicalApplicationComponents() {
		return (EReference)physicalApplicationComponentEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalTechnologyComponent() {
		return logicalTechnologyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalTechnologyComponent_ProvidesPlatformForServices() {
		return (EReference)logicalTechnologyComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalTechnologyComponent_SuppliesPlatformServices() {
		return (EReference)logicalTechnologyComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalTechnologyComponent_IsRealizedByPhysicalTechnologyComponents() {
		return (EReference)logicalTechnologyComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalTechnologyComponent_DecomposesLogicalTechnologyComponent() {
		return (EReference)logicalTechnologyComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalTechnologyComponent_IsDependentOnLogicalTechnologyComponents() {
		return (EReference)logicalTechnologyComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalTechnologyComponent_CategoryTRM() {
		return (EAttribute)logicalTechnologyComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalTechnologyComponent_IsExtendedByPhysicalTechnologyComponent() {
		return (EReference)logicalTechnologyComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalTechnologyComponent_IsRequiredByLogicalTechnologyComponents() {
		return (EReference)logicalTechnologyComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalTechnologyComponent_IsDecomposedByLogicalTechnologyComponents() {
		return (EReference)logicalTechnologyComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategicArchitecture() {
		return strategicArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategicArchitecture_Capabilities() {
		return (EReference)strategicArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategicArchitecture_StrategicElements() {
		return (EReference)strategicArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandard() {
		return standardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_StandardClass() {
		return (EAttribute)standardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_StandardCreationDate() {
		return (EAttribute)standardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_LastStandardReviewDate() {
		return (EAttribute)standardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_NextStandardReviewDate() {
		return (EAttribute)standardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandard_RetireDate() {
		return (EAttribute)standardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_IsProvidedToActors() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ProvidesGovernedInterfaceToAccessFunctions() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ProvidesDataEntities() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ConsumesDataEntities() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_IsGovernedAndMeasuredByContracts() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ResolvesEvents() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_IsImplementedOnLogicalTechnologyComponents() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_IsRealizedThroughLogicalApplicationComponent() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_IsOwnedAndGovernedByOrganizationUnits() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_IsTrackedAgainstMeasures() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_SupportsProcesses() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_IsRealizedByProcesses() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_MeetsServiceQualities() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ConsumesServices() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_DecomposesServices() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_IsDecomposedByServices() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationComponent() {
		return applicationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationSystemService() {
		return informationSystemServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataComponent() {
		return dataComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnologyComponent() {
		return technologyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrincipleCategory() {
		return principleCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStandardsClass() {
		return standardsClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLifeCycleStatus() {
		return lifeCycleStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataEntityCategory() {
		return dataEntityCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkPackageCategory() {
		return workPackageCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentfwkFactory getContentfwkFactory() {
		return (ContentfwkFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		enterpriseArchitectureEClass = createEClass(ENTERPRISE_ARCHITECTURE);
		createEReference(enterpriseArchitectureEClass, ENTERPRISE_ARCHITECTURE__ARCHITECTURES);

		architectureEClass = createEClass(ARCHITECTURE);

		businessArchitectureEClass = createEClass(BUSINESS_ARCHITECTURE);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__DRIVERS);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__GOALS);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__OBJECTIVES);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__UNITS);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__ACTORS);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__ROLES);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__FUNCTIONS);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__SERVICES);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__PROCESSES);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__CONTROLS);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__EVENTS);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__LOCATIONS);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__PRODUCTS);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__CONTRACTS);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__MEASURES);
		createEReference(businessArchitectureEClass, BUSINESS_ARCHITECTURE__SERVICES_QUALITY);

		dataArchitectureEClass = createEClass(DATA_ARCHITECTURE);
		createEReference(dataArchitectureEClass, DATA_ARCHITECTURE__ENTITIES);
		createEReference(dataArchitectureEClass, DATA_ARCHITECTURE__LOGICAL_COMPONENTS);
		createEReference(dataArchitectureEClass, DATA_ARCHITECTURE__PHYSICAL_COMPONENTS);

		technologyArchitectureEClass = createEClass(TECHNOLOGY_ARCHITECTURE);
		createEReference(technologyArchitectureEClass, TECHNOLOGY_ARCHITECTURE__PLATFORM_SERVICES);
		createEReference(technologyArchitectureEClass, TECHNOLOGY_ARCHITECTURE__PHYSICAL_COMPONENTS);
		createEReference(technologyArchitectureEClass, TECHNOLOGY_ARCHITECTURE__LOGICAL_COMPONENTS);

		driverEClass = createEClass(DRIVER);
		createEReference(driverEClass, DRIVER__CREATES_GOALS);
		createEReference(driverEClass, DRIVER__MOTIVATES_ORGANIZATION_UNITS);
		createEReference(driverEClass, DRIVER__DECOMPOSES_DRIVER);
		createEReference(driverEClass, DRIVER__IS_DECOMPOSED_BY_DRIVERS);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__ADDRESSES_DRIVERS);
		createEReference(goalEClass, GOAL__IS_REALIZED_THROUGH_OBJECTIVES);
		createEReference(goalEClass, GOAL__DECOMPOSES_GOAL);
		createEReference(goalEClass, GOAL__IS_DECOMPOSED_BY_GOALS);

		objectiveEClass = createEClass(OBJECTIVE);
		createEReference(objectiveEClass, OBJECTIVE__REALIZES_GOALS);
		createEReference(objectiveEClass, OBJECTIVE__IS_TRACKED_AGAINST_MEASURES);
		createEReference(objectiveEClass, OBJECTIVE__DECOMPOSES_OBJECTIVE);
		createEReference(objectiveEClass, OBJECTIVE__IS_SUPPORTED_BY_BUSINESS_SERVICE);
		createEReference(objectiveEClass, OBJECTIVE__IS_DECOMPOSED_BY_OBJECTIVES);

		organizationUnitEClass = createEClass(ORGANIZATION_UNIT);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__CONTAINS_ACTORS);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__OWNS_FUNCTIONS);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__PRODUCES_PRODUCTS);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__OPERATES_IN_LOCATION);
		createEAttribute(organizationUnitEClass, ORGANIZATION_UNIT__HEADCOUNT);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__IS_DECOMPOSED_BY_ORGANIZATION_UNITS);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__SUPPLIES_DATA_ENTITIES);
		createEReference(actorEClass, ACTOR__CONSUMES_DATA_ENTITIES);
		createEReference(actorEClass, ACTOR__BELONGS_TO_ORGANIZATION_UNIT);
		createEReference(actorEClass, ACTOR__INTERACTS_WITH_FUNCTIONS);
		createEReference(actorEClass, ACTOR__PERFORMS_TASK_IN_ROLES);
		createEReference(actorEClass, ACTOR__PARTICIPATES_IN_PROCESSES);
		createEReference(actorEClass, ACTOR__CONSUMES_SERVICES);
		createEReference(actorEClass, ACTOR__RESOLVES_EVENTS);
		createEReference(actorEClass, ACTOR__GENERATES_EVENTS);
		createEReference(actorEClass, ACTOR__OPERATES_IN_LOCATION);
		createEAttribute(actorEClass, ACTOR__FT_ES);
		createEAttribute(actorEClass, ACTOR__ACTOR_GOAL);
		createEAttribute(actorEClass, ACTOR__ACTOR_TASKS);
		createEReference(actorEClass, ACTOR__PERFORMS_FUNCTIONS);
		createEReference(actorEClass, ACTOR__DECOMPOSES_ACTOR);
		createEReference(actorEClass, ACTOR__IS_DECOMPOSED_BY_ACTORS);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__IS_ASSUMED_BY_ACTORS);
		createEReference(roleEClass, ROLE__ACCESSES_FUNCTIONS);
		createEAttribute(roleEClass, ROLE__ESTIMATED_FT_ES);
		createEReference(roleEClass, ROLE__DECOMPOSES_ROLE);
		createEReference(roleEClass, ROLE__IS_DECOMPOSED_BY_ROLES);

		dataEntityEClass = createEClass(DATA_ENTITY);
		createEReference(dataEntityEClass, DATA_ENTITY__IS_SUPPLIED_BY_ACTORS);
		createEReference(dataEntityEClass, DATA_ENTITY__IS_CONSUMED_BY_ACTORS);
		createEReference(dataEntityEClass, DATA_ENTITY__IS_ACCESSED_BY_SERVICES);
		createEReference(dataEntityEClass, DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES);
		createEReference(dataEntityEClass, DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT);
		createEReference(dataEntityEClass, DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS);
		createEAttribute(dataEntityEClass, DATA_ENTITY__DATA_ENTITY_CATEGORY);
		createEAttribute(dataEntityEClass, DATA_ENTITY__PRIVACY_CLASSIFICATION);
		createEAttribute(dataEntityEClass, DATA_ENTITY__RETENTION_CLASSIFICATION);
		createEReference(dataEntityEClass, DATA_ENTITY__DECOMPOSES_DATA_ENTITY);
		createEReference(dataEntityEClass, DATA_ENTITY__RELATES_TO_DATA_ENTITIES);
		createEReference(dataEntityEClass, DATA_ENTITY__IS_DECOMPOSED_BY_DATA_ENTITIES);

		logicalApplicationComponentEClass = createEClass(LOGICAL_APPLICATION_COMPONENT);
		createEReference(logicalApplicationComponentEClass, LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES);
		createEReference(logicalApplicationComponentEClass, LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES);
		createEReference(logicalApplicationComponentEClass, LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS);
		createEReference(logicalApplicationComponentEClass, LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH);
		createEReference(logicalApplicationComponentEClass, LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT);
		createEReference(logicalApplicationComponentEClass, LOGICAL_APPLICATION_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_APPLICATION_COMPONENTS);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__IS_PERFORMED_BY_ACTORS);
		createEReference(functionEClass, FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT);
		createEReference(functionEClass, FUNCTION__IS_BOUNDED_BY_SERVICES);
		createEReference(functionEClass, FUNCTION__SUPPORTS_PROCESSES);
		createEReference(functionEClass, FUNCTION__IS_REALIZED_BY_PROCESSES);
		createEReference(functionEClass, FUNCTION__CAN_BE_ACCESSED_BY_ROLES);
		createEReference(functionEClass, FUNCTION__SUPPORTS_ACTORS);
		createEReference(functionEClass, FUNCTION__DECOMPOSES_FUNCTION);
		createEReference(functionEClass, FUNCTION__COMMUNICATES_WITH_FUNCTIONS);
		createEReference(functionEClass, FUNCTION__IS_DECOMPOSED_BY_FUNCTIONS);

		businessServiceEClass = createEClass(BUSINESS_SERVICE);
		createEReference(businessServiceEClass, BUSINESS_SERVICE__SUPPORTS_OBJECTIVE);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__ORCHESTRATES_FUNCTIONS);
		createEReference(processEClass, PROCESS__DECOMPOSES_FUNCTIONS);
		createEReference(processEClass, PROCESS__INVOLVES_ORGANIZATION_UNITS);
		createEReference(processEClass, PROCESS__ORCHESTRATES_SERVICES);
		createEReference(processEClass, PROCESS__DECOMPOSES_SERVICES);
		createEReference(processEClass, PROCESS__INVOLVES_ACTORS);
		createEReference(processEClass, PROCESS__IS_GUIDED_BY_CONTROLS);
		createEReference(processEClass, PROCESS__RESOLVES_EVENTS);
		createEReference(processEClass, PROCESS__GENERATES_EVENTS);
		createEReference(processEClass, PROCESS__PRODUCES_PRODUCTS);
		createEAttribute(processEClass, PROCESS__PROCESS_CRITIALITY);
		createEAttribute(processEClass, PROCESS__IS_AUTOMATED);
		createEAttribute(processEClass, PROCESS__PROCESS_VOLUMETRICS);
		createEReference(processEClass, PROCESS__DECOMPOSES_PROCESS);
		createEReference(processEClass, PROCESS__PRECEDES_PROCESSES);
		createEReference(processEClass, PROCESS__FOLLOWS_PROCESSES);
		createEReference(processEClass, PROCESS__IS_DECOMPOSED_BY_PROCESSES);

		platformServiceEClass = createEClass(PLATFORM_SERVICE);
		createEReference(platformServiceEClass, PLATFORM_SERVICE__IS_SUPPLIED_BY_LOGICAL_TECHNOLOGY_COMPONENTS);
		createEAttribute(platformServiceEClass, PLATFORM_SERVICE__CATEGORY_TRM);
		createEAttribute(platformServiceEClass, PLATFORM_SERVICE__STANDARD_CLASS);

		physicalTechnologyComponentEClass = createEClass(PHYSICAL_TECHNOLOGY_COMPONENT);
		createEReference(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_PHYSICAL_APPLICATION_COMPONENTS);
		createEReference(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS);
		createEReference(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION);
		createEAttribute(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME);
		createEAttribute(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME);
		createEAttribute(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR);
		createEAttribute(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__VERSION);
		createEReference(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT);
		createEReference(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS);
		createEAttribute(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM);
		createEReference(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_PHYSICAL_TECHNOLOGY_COMPONENT);
		createEReference(physicalTechnologyComponentEClass, PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS);
		createEReference(productEClass, PRODUCT__IS_PRODUCED_BY_PROCESSES);

		measureEClass = createEClass(MEASURE);
		createEReference(measureEClass, MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES);
		createEReference(measureEClass, MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_SERVICES);
		createEReference(measureEClass, MEASURE__DECOMPOSES_MEASURE);
		createEReference(measureEClass, MEASURE__IS_DECOMPOSED_BY_MEASURES);

		serviceQualityEClass = createEClass(SERVICE_QUALITY);
		createEReference(serviceQualityEClass, SERVICE_QUALITY__APPLIES_TO_SERVICES);
		createEReference(serviceQualityEClass, SERVICE_QUALITY__APPLIES_TO_CONTRACTS);

		contractEClass = createEClass(CONTRACT);
		createEReference(contractEClass, CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES);
		createEReference(contractEClass, CONTRACT__MEETS_SERVICE_QUALITY);
		createEAttribute(contractEClass, CONTRACT__BEHAVIOR_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__SERVICE_NAME_CALLER);
		createEAttribute(contractEClass, CONTRACT__SERVICE_NAME_CALLED);
		createEAttribute(contractEClass, CONTRACT__SERVICE_QUALITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__SERVICES_TIMES);
		createEAttribute(contractEClass, CONTRACT__MANAGEABILITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__SERVICEABILITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__PERFORMANCE_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__RESPONSE_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__RELIABILITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__QUALITY_OF_INFORMATION_REQUIRED);
		createEAttribute(contractEClass, CONTRACT__CONTRACT_CONTROL_REQUIREMENTS);
		createEAttribute(contractEClass, CONTRACT__RESULT_CONTROL_REQUIREMENTS);
		createEAttribute(contractEClass, CONTRACT__RECOVERABILITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__LOCATABILITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__SECURITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__PRIVACY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__INTEGRITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__CREDIBILITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__LOCALIZATION_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__INTEROPERABILITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__SCALABILITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__PORTABILITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__EXTENSIBILITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__CAPACITY_CHARACTERISTICS);
		createEAttribute(contractEClass, CONTRACT__THROUGHPUT);
		createEAttribute(contractEClass, CONTRACT__THROUGHPUT_PERIOD);
		createEAttribute(contractEClass, CONTRACT__GROWTH);
		createEAttribute(contractEClass, CONTRACT__GROWTH_PERIOD);
		createEAttribute(contractEClass, CONTRACT__PEAK_PROFILE_SHORT_TERM);
		createEAttribute(contractEClass, CONTRACT__PEAK_PROFILE_LONG_TERM);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__IS_RESOLVED_BY_SERVICES);
		createEReference(eventEClass, EVENT__IS_RESOLVED_BY_PROCESSES);
		createEReference(eventEClass, EVENT__IS_GENERATED_BY_PROCESSES);
		createEReference(eventEClass, EVENT__IS_RESOLVED_BY_ACTORS);
		createEReference(eventEClass, EVENT__IS_GENERATED_BY_ACTORS);

		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__ENSURES_CORRECT_OPERATION_OF_PROCESSES);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__DELEGATES);
		createEReference(elementEClass, ELEMENT__IS_DELEGATED_BY);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__DESCRIPTION);
		createEAttribute(elementEClass, ELEMENT__SOURCE_DESCR);
		createEAttribute(elementEClass, ELEMENT__OWNER_DESCR);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEAttribute(elementEClass, ELEMENT__CATEGORY);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__CONTAINS_ACTORS);
		createEReference(locationEClass, LOCATION__CONTAINS_ORGANIZATION_UNITS);
		createEReference(locationEClass, LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS);
		createEReference(locationEClass, LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS);
		createEReference(locationEClass, LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS);
		createEReference(locationEClass, LOCATION__DECOMPOSES_LOCATION);
		createEReference(locationEClass, LOCATION__IS_DECOMPOSED_BY_LOCATIONS);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__IS_DELIVERED_BY);
		createEAttribute(capabilityEClass, CAPABILITY__BUSINESS_VALUE);
		createEAttribute(capabilityEClass, CAPABILITY__INCREMENTS);

		strategicElementEClass = createEClass(STRATEGIC_ELEMENT);

		principleEClass = createEClass(PRINCIPLE);
		createEAttribute(principleEClass, PRINCIPLE__PRINCIPLE_CATEGORY);
		createEAttribute(principleEClass, PRINCIPLE__PRIORITY);
		createEAttribute(principleEClass, PRINCIPLE__STATEMENT_OF_PRINCIPLE);
		createEAttribute(principleEClass, PRINCIPLE__RATIONALE);
		createEAttribute(principleEClass, PRINCIPLE__IMPLICATION);
		createEAttribute(principleEClass, PRINCIPLE__METRIC);

		constraintEClass = createEClass(CONSTRAINT);

		assumptionEClass = createEClass(ASSUMPTION);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__STATEMENT_OF_REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__RATIONALE);
		createEAttribute(requirementEClass, REQUIREMENT__ACCEPTANCE_CRITERIA);

		gapEClass = createEClass(GAP);

		workPackageEClass = createEClass(WORK_PACKAGE);
		createEAttribute(workPackageEClass, WORK_PACKAGE__WORK_PACKAGE_CATEGORY);
		createEReference(workPackageEClass, WORK_PACKAGE__DELIVERS_CAPABILITIES);
		createEAttribute(workPackageEClass, WORK_PACKAGE__CAPABILITY_DELIVERED);

		logicalDataComponentEClass = createEClass(LOGICAL_DATA_COMPONENT);
		createEReference(logicalDataComponentEClass, LOGICAL_DATA_COMPONENT__ENCAPSULATES_DATA_ENTITIES);
		createEReference(logicalDataComponentEClass, LOGICAL_DATA_COMPONENT__IS_EXTENDED_BY_PHYSICAL_DATA_COMPONENTS);

		physicalDataComponentEClass = createEClass(PHYSICAL_DATA_COMPONENT);
		createEReference(physicalDataComponentEClass, PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS);
		createEReference(physicalDataComponentEClass, PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION);
		createEReference(physicalDataComponentEClass, PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT);
		createEReference(physicalDataComponentEClass, PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS);
		createEReference(physicalDataComponentEClass, PHYSICAL_DATA_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_DATA_COMPONENTS);

		applicationArchitectureEClass = createEClass(APPLICATION_ARCHITECTURE);
		createEReference(applicationArchitectureEClass, APPLICATION_ARCHITECTURE__LOGICAL_APPLICATION_COMPONENTS);
		createEReference(applicationArchitectureEClass, APPLICATION_ARCHITECTURE__PHYSICAL_APPLICATION_COMPONENTS);
		createEReference(applicationArchitectureEClass, APPLICATION_ARCHITECTURE__INFORMATION_SYSTEM_SERVICES);

		physicalApplicationComponentEClass = createEClass(PHYSICAL_APPLICATION_COMPONENT);
		createEReference(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS);
		createEReference(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION);
		createEReference(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__GROWTH);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM);
		createEAttribute(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM);
		createEReference(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS);
		createEReference(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS);
		createEReference(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT);
		createEReference(physicalApplicationComponentEClass, PHYSICAL_APPLICATION_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_APPLICATION_COMPONENTS);

		logicalTechnologyComponentEClass = createEClass(LOGICAL_TECHNOLOGY_COMPONENT);
		createEReference(logicalTechnologyComponentEClass, LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES);
		createEReference(logicalTechnologyComponentEClass, LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES);
		createEReference(logicalTechnologyComponentEClass, LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS);
		createEReference(logicalTechnologyComponentEClass, LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT);
		createEReference(logicalTechnologyComponentEClass, LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS);
		createEAttribute(logicalTechnologyComponentEClass, LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM);
		createEReference(logicalTechnologyComponentEClass, LOGICAL_TECHNOLOGY_COMPONENT__IS_EXTENDED_BY_PHYSICAL_TECHNOLOGY_COMPONENT);
		createEReference(logicalTechnologyComponentEClass, LOGICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_LOGICAL_TECHNOLOGY_COMPONENTS);
		createEReference(logicalTechnologyComponentEClass, LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS);

		strategicArchitectureEClass = createEClass(STRATEGIC_ARCHITECTURE);
		createEReference(strategicArchitectureEClass, STRATEGIC_ARCHITECTURE__CAPABILITIES);
		createEReference(strategicArchitectureEClass, STRATEGIC_ARCHITECTURE__STRATEGIC_ELEMENTS);

		standardEClass = createEClass(STANDARD);
		createEAttribute(standardEClass, STANDARD__STANDARD_CLASS);
		createEAttribute(standardEClass, STANDARD__STANDARD_CREATION_DATE);
		createEAttribute(standardEClass, STANDARD__LAST_STANDARD_REVIEW_DATE);
		createEAttribute(standardEClass, STANDARD__NEXT_STANDARD_REVIEW_DATE);
		createEAttribute(standardEClass, STANDARD__RETIRE_DATE);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__IS_PROVIDED_TO_ACTORS);
		createEReference(serviceEClass, SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS);
		createEReference(serviceEClass, SERVICE__PROVIDES_DATA_ENTITIES);
		createEReference(serviceEClass, SERVICE__CONSUMES_DATA_ENTITIES);
		createEReference(serviceEClass, SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS);
		createEReference(serviceEClass, SERVICE__RESOLVES_EVENTS);
		createEReference(serviceEClass, SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS);
		createEReference(serviceEClass, SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT);
		createEReference(serviceEClass, SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS);
		createEReference(serviceEClass, SERVICE__IS_TRACKED_AGAINST_MEASURES);
		createEReference(serviceEClass, SERVICE__SUPPORTS_PROCESSES);
		createEReference(serviceEClass, SERVICE__IS_REALIZED_BY_PROCESSES);
		createEReference(serviceEClass, SERVICE__MEETS_SERVICE_QUALITIES);
		createEReference(serviceEClass, SERVICE__CONSUMES_SERVICES);
		createEReference(serviceEClass, SERVICE__DECOMPOSES_SERVICES);
		createEReference(serviceEClass, SERVICE__IS_DECOMPOSED_BY_SERVICES);

		applicationComponentEClass = createEClass(APPLICATION_COMPONENT);

		informationSystemServiceEClass = createEClass(INFORMATION_SYSTEM_SERVICE);

		dataComponentEClass = createEClass(DATA_COMPONENT);

		technologyComponentEClass = createEClass(TECHNOLOGY_COMPONENT);

		// Create enums
		principleCategoryEEnum = createEEnum(PRINCIPLE_CATEGORY);
		standardsClassEEnum = createEEnum(STANDARDS_CLASS);
		lifeCycleStatusEEnum = createEEnum(LIFE_CYCLE_STATUS);
		dataEntityCategoryEEnum = createEEnum(DATA_ENTITY_CATEGORY);
		workPackageCategoryEEnum = createEEnum(WORK_PACKAGE_CATEGORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		businessArchitectureEClass.getESuperTypes().add(this.getArchitecture());
		dataArchitectureEClass.getESuperTypes().add(this.getArchitecture());
		technologyArchitectureEClass.getESuperTypes().add(this.getArchitecture());
		driverEClass.getESuperTypes().add(this.getElement());
		goalEClass.getESuperTypes().add(this.getElement());
		objectiveEClass.getESuperTypes().add(this.getElement());
		organizationUnitEClass.getESuperTypes().add(this.getElement());
		actorEClass.getESuperTypes().add(this.getElement());
		roleEClass.getESuperTypes().add(this.getElement());
		dataEntityEClass.getESuperTypes().add(this.getElement());
		logicalApplicationComponentEClass.getESuperTypes().add(this.getElement());
		logicalApplicationComponentEClass.getESuperTypes().add(this.getApplicationComponent());
		functionEClass.getESuperTypes().add(this.getElement());
		functionEClass.getESuperTypes().add(this.getStandard());
		businessServiceEClass.getESuperTypes().add(this.getElement());
		businessServiceEClass.getESuperTypes().add(this.getService());
		processEClass.getESuperTypes().add(this.getElement());
		processEClass.getESuperTypes().add(this.getStandard());
		platformServiceEClass.getESuperTypes().add(this.getElement());
		physicalTechnologyComponentEClass.getESuperTypes().add(this.getElement());
		physicalTechnologyComponentEClass.getESuperTypes().add(this.getTechnologyComponent());
		productEClass.getESuperTypes().add(this.getElement());
		measureEClass.getESuperTypes().add(this.getElement());
		serviceQualityEClass.getESuperTypes().add(this.getElement());
		contractEClass.getESuperTypes().add(this.getElement());
		eventEClass.getESuperTypes().add(this.getElement());
		controlEClass.getESuperTypes().add(this.getElement());
		locationEClass.getESuperTypes().add(this.getElement());
		capabilityEClass.getESuperTypes().add(this.getElement());
		strategicElementEClass.getESuperTypes().add(this.getElement());
		principleEClass.getESuperTypes().add(this.getStrategicElement());
		constraintEClass.getESuperTypes().add(this.getStrategicElement());
		assumptionEClass.getESuperTypes().add(this.getStrategicElement());
		requirementEClass.getESuperTypes().add(this.getStrategicElement());
		gapEClass.getESuperTypes().add(this.getStrategicElement());
		workPackageEClass.getESuperTypes().add(this.getStrategicElement());
		logicalDataComponentEClass.getESuperTypes().add(this.getElement());
		logicalDataComponentEClass.getESuperTypes().add(this.getDataComponent());
		physicalDataComponentEClass.getESuperTypes().add(this.getElement());
		physicalDataComponentEClass.getESuperTypes().add(this.getDataComponent());
		applicationArchitectureEClass.getESuperTypes().add(this.getArchitecture());
		physicalApplicationComponentEClass.getESuperTypes().add(this.getElement());
		physicalApplicationComponentEClass.getESuperTypes().add(this.getApplicationComponent());
		logicalTechnologyComponentEClass.getESuperTypes().add(this.getElement());
		logicalTechnologyComponentEClass.getESuperTypes().add(this.getTechnologyComponent());
		strategicArchitectureEClass.getESuperTypes().add(this.getArchitecture());
		serviceEClass.getESuperTypes().add(this.getStandard());
		applicationComponentEClass.getESuperTypes().add(this.getStandard());
		informationSystemServiceEClass.getESuperTypes().add(this.getService());
		informationSystemServiceEClass.getESuperTypes().add(this.getElement());
		dataComponentEClass.getESuperTypes().add(this.getStandard());
		technologyComponentEClass.getESuperTypes().add(this.getStandard());

		// Initialize classes and features; add operations and parameters
		initEClass(enterpriseArchitectureEClass, EnterpriseArchitecture.class, "EnterpriseArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnterpriseArchitecture_Architectures(), this.getArchitecture(), null, "architectures", null, 0, -1, EnterpriseArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureEClass, Architecture.class, "Architecture", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessArchitectureEClass, BusinessArchitecture.class, "BusinessArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessArchitecture_Drivers(), this.getDriver(), null, "drivers", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Goals(), this.getGoal(), null, "goals", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Objectives(), this.getObjective(), null, "objectives", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Units(), this.getOrganizationUnit(), null, "units", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Actors(), this.getActor(), null, "actors", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Roles(), this.getRole(), null, "roles", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Functions(), this.getFunction(), null, "functions", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Services(), this.getBusinessService(), null, "services", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Processes(), this.getProcess(), null, "processes", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Controls(), this.getControl(), null, "controls", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Events(), this.getEvent(), null, "events", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Locations(), this.getLocation(), null, "locations", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Products(), this.getProduct(), null, "products", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Contracts(), this.getContract(), null, "contracts", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_Measures(), this.getMeasure(), null, "measures", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessArchitecture_ServicesQuality(), this.getServiceQuality(), null, "servicesQuality", null, 0, -1, BusinessArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataArchitectureEClass, DataArchitecture.class, "DataArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataArchitecture_Entities(), this.getDataEntity(), null, "entities", null, 0, -1, DataArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataArchitecture_LogicalComponents(), this.getLogicalDataComponent(), null, "logicalComponents", null, 0, -1, DataArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataArchitecture_PhysicalComponents(), this.getPhysicalDataComponent(), null, "physicalComponents", null, 0, -1, DataArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyArchitectureEClass, TechnologyArchitecture.class, "TechnologyArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnologyArchitecture_PlatformServices(), this.getPlatformService(), null, "platformServices", null, 0, -1, TechnologyArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologyArchitecture_PhysicalComponents(), this.getPhysicalTechnologyComponent(), null, "physicalComponents", null, 0, -1, TechnologyArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologyArchitecture_LogicalComponents(), this.getLogicalTechnologyComponent(), null, "logicalComponents", null, 0, -1, TechnologyArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDriver_CreatesGoals(), this.getGoal(), this.getGoal_AddressesDrivers(), "createsGoals", null, 0, -1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDriver_MotivatesOrganizationUnits(), this.getOrganizationUnit(), this.getOrganizationUnit_IsMotivatedByDrivers(), "motivatesOrganizationUnits", null, 0, -1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDriver_DecomposesDriver(), this.getDriver(), this.getDriver_IsDecomposedByDrivers(), "decomposesDriver", null, 0, 1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDriver_IsDecomposedByDrivers(), this.getDriver(), this.getDriver_DecomposesDriver(), "isDecomposedByDrivers", null, 0, -1, Driver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_AddressesDrivers(), this.getDriver(), this.getDriver_CreatesGoals(), "addressesDrivers", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_IsRealizedThroughObjectives(), this.getObjective(), this.getObjective_RealizesGoals(), "isRealizedThroughObjectives", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_DecomposesGoal(), this.getGoal(), this.getGoal_IsDecomposedByGoals(), "decomposesGoal", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_IsDecomposedByGoals(), this.getGoal(), this.getGoal_DecomposesGoal(), "isDecomposedByGoals", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjective_RealizesGoals(), this.getGoal(), this.getGoal_IsRealizedThroughObjectives(), "realizesGoals", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_IsTrackedAgainstMeasures(), this.getMeasure(), this.getMeasure_SetsPerformanceCriteriaForObjectives(), "isTrackedAgainstMeasures", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_DecomposesObjective(), this.getObjective(), this.getObjective_IsDecomposedByObjectives(), "decomposesObjective", null, 0, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_IsSupportedByBusinessService(), this.getBusinessService(), this.getBusinessService_SupportsObjective(), "isSupportedByBusinessService", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_IsDecomposedByObjectives(), this.getObjective(), this.getObjective_DecomposesObjective(), "isDecomposedByObjectives", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationUnitEClass, OrganizationUnit.class, "OrganizationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationUnit_OwnsAndGovernsServices(), this.getService(), this.getService_IsOwnedAndGovernedByOrganizationUnits(), "ownsAndGovernsServices", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationUnit_ContainsActors(), this.getActor(), this.getActor_BelongsToOrganizationUnit(), "containsActors", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationUnit_OwnsFunctions(), this.getFunction(), this.getFunction_IsOwnedByOrganizationUnit(), "ownsFunctions", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationUnit_ParticipatesInProcesses(), this.getProcess(), this.getProcess_InvolvesOrganizationUnits(), "participatesInProcesses", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationUnit_IsMotivatedByDrivers(), this.getDriver(), this.getDriver_MotivatesOrganizationUnits(), "isMotivatedByDrivers", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationUnit_ProducesProducts(), this.getProduct(), this.getProduct_IsProducedByOrganizationUnits(), "producesProducts", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationUnit_OperatesInLocation(), this.getLocation(), this.getLocation_ContainsOrganizationUnits(), "operatesInLocation", null, 0, 1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationUnit_Headcount(), ecorePackage.getEString(), "headcount", null, 0, 1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationUnit_DecomposesOrganizationUnit(), this.getOrganizationUnit(), this.getOrganizationUnit_IsDecomposedByOrganizationUnits(), "decomposesOrganizationUnit", null, 0, 1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationUnit_IsDecomposedByOrganizationUnits(), this.getOrganizationUnit(), this.getOrganizationUnit_DecomposesOrganizationUnit(), "isDecomposedByOrganizationUnits", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_SuppliesDataEntities(), this.getDataEntity(), this.getDataEntity_IsSuppliedByActors(), "suppliesDataEntities", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ConsumesDataEntities(), this.getDataEntity(), this.getDataEntity_IsConsumedByActors(), "consumesDataEntities", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_BelongsToOrganizationUnit(), this.getOrganizationUnit(), this.getOrganizationUnit_ContainsActors(), "belongsToOrganizationUnit", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_InteractsWithFunctions(), this.getFunction(), this.getFunction_SupportsActors(), "interactsWithFunctions", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_PerformsTaskInRoles(), this.getRole(), this.getRole_IsAssumedByActors(), "performsTaskInRoles", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ParticipatesInProcesses(), this.getProcess(), this.getProcess_InvolvesActors(), "participatesInProcesses", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ConsumesServices(), this.getService(), this.getService_IsProvidedToActors(), "consumesServices", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ResolvesEvents(), this.getEvent(), this.getEvent_IsResolvedByActors(), "resolvesEvents", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_GeneratesEvents(), this.getEvent(), this.getEvent_IsGeneratedByActors(), "generatesEvents", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_OperatesInLocation(), this.getLocation(), this.getLocation_ContainsActors(), "operatesInLocation", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_FTEs(), ecorePackage.getEString(), "FTEs", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_ActorGoal(), ecorePackage.getEString(), "actorGoal", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_ActorTasks(), ecorePackage.getEString(), "actorTasks", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_PerformsFunctions(), this.getFunction(), this.getFunction_IsPerformedByActors(), "performsFunctions", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_DecomposesActor(), this.getActor(), this.getActor_IsDecomposedByActors(), "decomposesActor", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_IsDecomposedByActors(), this.getActor(), this.getActor_DecomposesActor(), "isDecomposedByActors", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_IsAssumedByActors(), this.getActor(), this.getActor_PerformsTaskInRoles(), "isAssumedByActors", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_AccessesFunctions(), this.getFunction(), this.getFunction_CanBeAccessedByRoles(), "accessesFunctions", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_EstimatedFTEs(), ecorePackage.getEString(), "estimatedFTEs", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_DecomposesRole(), this.getRole(), this.getRole_IsDecomposedByRoles(), "decomposesRole", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_IsDecomposedByRoles(), this.getRole(), this.getRole_DecomposesRole(), "isDecomposedByRoles", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEntityEClass, DataEntity.class, "DataEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataEntity_IsSuppliedByActors(), this.getActor(), this.getActor_SuppliesDataEntities(), "isSuppliedByActors", null, 0, -1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataEntity_IsConsumedByActors(), this.getActor(), this.getActor_ConsumesDataEntities(), "isConsumedByActors", null, 0, -1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataEntity_IsAccessedByServices(), this.getService(), this.getService_ConsumesDataEntities(), "isAccessedByServices", null, 0, -1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataEntity_IsUpdatedThroughServices(), this.getService(), this.getService_ProvidesDataEntities(), "isUpdatedThroughServices", null, 0, -1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataEntity_ResidesWithinLogicalDataComponent(), this.getLogicalDataComponent(), this.getLogicalDataComponent_EncapsulatesDataEntities(), "residesWithinLogicalDataComponent", null, 0, 1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataEntity_IsProcessesByLogicalApplicationComponents(), this.getLogicalApplicationComponent(), this.getLogicalApplicationComponent_OperatesOnDataEntities(), "isProcessesByLogicalApplicationComponents", null, 0, -1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataEntity_DataEntityCategory(), this.getDataEntityCategory(), "dataEntityCategory", null, 0, 1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataEntity_PrivacyClassification(), ecorePackage.getEString(), "privacyClassification", null, 0, 1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataEntity_RetentionClassification(), ecorePackage.getEString(), "retentionClassification", null, 0, 1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataEntity_DecomposesDataEntity(), this.getDataEntity(), null, "decomposesDataEntity", null, 0, 1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataEntity_RelatesToDataEntities(), this.getDataEntity(), null, "relatesToDataEntities", null, 0, -1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataEntity_IsDecomposedByDataEntities(), this.getDataEntity(), null, "isDecomposedByDataEntities", null, 0, -1, DataEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalApplicationComponentEClass, LogicalApplicationComponent.class, "LogicalApplicationComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalApplicationComponent_ImplementsServices(), this.getService(), this.getService_IsRealizedThroughLogicalApplicationComponent(), "implementsServices", null, 0, -1, LogicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalApplicationComponent_OperatesOnDataEntities(), this.getDataEntity(), this.getDataEntity_IsProcessesByLogicalApplicationComponents(), "operatesOnDataEntities", null, 0, -1, LogicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalApplicationComponent_IsExtendedByPhysicalApplicationComponents(), this.getPhysicalApplicationComponent(), this.getPhysicalApplicationComponent_ExtendsLogicalApplicationComponents(), "isExtendedByPhysicalApplicationComponents", null, 0, -1, LogicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalApplicationComponent_CommunicatesWith(), this.getLogicalApplicationComponent(), null, "communicatesWith", null, 0, -1, LogicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalApplicationComponent_DecomposesLogicalApplicationComponent(), this.getLogicalApplicationComponent(), this.getLogicalApplicationComponent_IsDecomposedByLogicalApplicationComponents(), "decomposesLogicalApplicationComponent", null, 0, 1, LogicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalApplicationComponent_IsDecomposedByLogicalApplicationComponents(), this.getLogicalApplicationComponent(), this.getLogicalApplicationComponent_DecomposesLogicalApplicationComponent(), "isDecomposedByLogicalApplicationComponents", null, 0, -1, LogicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_IsPerformedByActors(), this.getActor(), this.getActor_PerformsFunctions(), "isPerformedByActors", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_IsOwnedByOrganizationUnit(), this.getOrganizationUnit(), this.getOrganizationUnit_OwnsFunctions(), "isOwnedByOrganizationUnit", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_IsBoundedByServices(), this.getService(), this.getService_ProvidesGovernedInterfaceToAccessFunctions(), "isBoundedByServices", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_SupportsProcesses(), this.getProcess(), this.getProcess_DecomposesFunctions(), "supportsProcesses", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_IsRealizedByProcesses(), this.getProcess(), this.getProcess_OrchestratesFunctions(), "isRealizedByProcesses", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_CanBeAccessedByRoles(), this.getRole(), this.getRole_AccessesFunctions(), "canBeAccessedByRoles", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_SupportsActors(), this.getActor(), this.getActor_InteractsWithFunctions(), "supportsActors", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_DecomposesFunction(), this.getFunction(), this.getFunction_IsDecomposedByFunctions(), "decomposesFunction", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_CommunicatesWithFunctions(), this.getFunction(), null, "communicatesWithFunctions", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_IsDecomposedByFunctions(), this.getFunction(), this.getFunction_DecomposesFunction(), "isDecomposedByFunctions", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessServiceEClass, BusinessService.class, "BusinessService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessService_SupportsObjective(), this.getObjective(), this.getObjective_IsSupportedByBusinessService(), "supportsObjective", null, 0, -1, BusinessService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_OrchestratesFunctions(), this.getFunction(), this.getFunction_IsRealizedByProcesses(), "orchestratesFunctions", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_DecomposesFunctions(), this.getFunction(), this.getFunction_SupportsProcesses(), "decomposesFunctions", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_InvolvesOrganizationUnits(), this.getOrganizationUnit(), this.getOrganizationUnit_ParticipatesInProcesses(), "involvesOrganizationUnits", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_OrchestratesServices(), this.getService(), this.getService_IsRealizedByProcesses(), "orchestratesServices", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_DecomposesServices(), this.getService(), this.getService_SupportsProcesses(), "decomposesServices", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_InvolvesActors(), this.getActor(), this.getActor_ParticipatesInProcesses(), "involvesActors", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_IsGuidedByControls(), this.getControl(), this.getControl_EnsuresCorrectOperationOfProcesses(), "isGuidedByControls", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_ResolvesEvents(), this.getEvent(), this.getEvent_IsResolvedByProcesses(), "resolvesEvents", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_GeneratesEvents(), this.getEvent(), this.getEvent_IsGeneratedByProcesses(), "generatesEvents", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_ProducesProducts(), this.getProduct(), this.getProduct_IsProducedByProcesses(), "producesProducts", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_ProcessCritiality(), ecorePackage.getEString(), "processCritiality", null, 0, 1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_IsAutomated(), ecorePackage.getEBoolean(), "isAutomated", null, 0, 1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_ProcessVolumetrics(), ecorePackage.getEString(), "processVolumetrics", null, 0, 1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_DecomposesProcess(), this.getProcess(), this.getProcess_IsDecomposedByProcesses(), "decomposesProcess", null, 0, 1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_PrecedesProcesses(), this.getProcess(), this.getProcess_FollowsProcesses(), "precedesProcesses", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_FollowsProcesses(), this.getProcess(), this.getProcess_PrecedesProcesses(), "followsProcesses", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_IsDecomposedByProcesses(), this.getProcess(), this.getProcess_DecomposesProcess(), "isDecomposedByProcesses", null, 0, -1, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformServiceEClass, PlatformService.class, "PlatformService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformService_IsSuppliedByLogicalTechnologyComponents(), this.getLogicalTechnologyComponent(), this.getLogicalTechnologyComponent_SuppliesPlatformServices(), "isSuppliedByLogicalTechnologyComponents", null, 0, -1, PlatformService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatformService_CategoryTRM(), ecorePackage.getEString(), "categoryTRM", null, 0, 1, PlatformService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatformService_StandardClass(), this.getStandardsClass(), "standardClass", null, 0, 1, PlatformService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalTechnologyComponentEClass, PhysicalTechnologyComponent.class, "PhysicalTechnologyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalTechnologyComponent_RealizesPhysicalApplicationComponents(), this.getPhysicalApplicationComponent(), this.getPhysicalApplicationComponent_IsRealizedByPhysicalTechnologyComponents(), "realizesPhysicalApplicationComponents", null, 0, -1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalTechnologyComponent_ExtendsLogicalTechnologyComponents(), this.getLogicalTechnologyComponent(), this.getLogicalTechnologyComponent_IsRealizedByPhysicalTechnologyComponents(), "extendsLogicalTechnologyComponents", null, 0, -1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalTechnologyComponent_IsHostedInLocation(), this.getLocation(), this.getLocation_ContainsPhysicalTechnologyComponents(), "isHostedInLocation", null, 0, -1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalTechnologyComponent_ProductName(), ecorePackage.getEString(), "productName", null, 0, 1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalTechnologyComponent_ModuleName(), ecorePackage.getEString(), "moduleName", null, 0, 1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalTechnologyComponent_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalTechnologyComponent_Version(), ecorePackage.getEString(), "version", null, 0, 1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalTechnologyComponent_DecomposesPhysicalTechnologyComponent(), this.getPhysicalTechnologyComponent(), this.getPhysicalTechnologyComponent_IsDecomposedByPhysicalTechnologyComponents(), "decomposesPhysicalTechnologyComponent", null, 0, 1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalTechnologyComponent_IsDependentOnPhysicalTechnologyComponents(), this.getPhysicalTechnologyComponent(), this.getPhysicalTechnologyComponent_IsRequiredByPhysicalTechnologyComponent(), "isDependentOnPhysicalTechnologyComponents", null, 0, -1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalTechnologyComponent_CategoryTRM(), ecorePackage.getEString(), "categoryTRM", null, 0, 1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalTechnologyComponent_IsRequiredByPhysicalTechnologyComponent(), this.getPhysicalTechnologyComponent(), this.getPhysicalTechnologyComponent_IsDependentOnPhysicalTechnologyComponents(), "isRequiredByPhysicalTechnologyComponent", null, 0, -1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalTechnologyComponent_IsDecomposedByPhysicalTechnologyComponents(), this.getPhysicalTechnologyComponent(), this.getPhysicalTechnologyComponent_DecomposesPhysicalTechnologyComponent(), "isDecomposedByPhysicalTechnologyComponents", null, 0, -1, PhysicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_IsProducedByOrganizationUnits(), this.getOrganizationUnit(), this.getOrganizationUnit_ProducesProducts(), "isProducedByOrganizationUnits", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_IsProducedByProcesses(), this.getProcess(), this.getProcess_ProducesProducts(), "isProducedByProcesses", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasure_SetsPerformanceCriteriaForObjectives(), this.getObjective(), this.getObjective_IsTrackedAgainstMeasures(), "setsPerformanceCriteriaForObjectives", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_SetsPerformanceCriteriaForServices(), this.getService(), this.getService_IsTrackedAgainstMeasures(), "setsPerformanceCriteriaForServices", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_DecomposesMeasure(), this.getMeasure(), this.getMeasure_IsDecomposedByMeasures(), "decomposesMeasure", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_IsDecomposedByMeasures(), this.getMeasure(), this.getMeasure_DecomposesMeasure(), "isDecomposedByMeasures", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceQualityEClass, ServiceQuality.class, "ServiceQuality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceQuality_AppliesToServices(), this.getService(), this.getService_MeetsServiceQualities(), "appliesToServices", null, 0, -1, ServiceQuality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceQuality_AppliesToContracts(), this.getContract(), this.getContract_MeetsServiceQuality(), "appliesToContracts", null, 0, -1, ServiceQuality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractEClass, Contract.class, "Contract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContract_GovernsAndMeasuresBusinessServices(), this.getService(), this.getService_IsGovernedAndMeasuredByContracts(), "governsAndMeasuresBusinessServices", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_MeetsServiceQuality(), this.getServiceQuality(), this.getServiceQuality_AppliesToContracts(), "meetsServiceQuality", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_BehaviorCharacteristics(), ecorePackage.getEString(), "behaviorCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ServiceNameCaller(), ecorePackage.getEString(), "serviceNameCaller", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ServiceNameCalled(), ecorePackage.getEString(), "serviceNameCalled", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ServiceQualityCharacteristics(), ecorePackage.getEString(), "serviceQualityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_AvailabilityQualityCharacteristics(), ecorePackage.getEString(), "availabilityQualityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ServicesTimes(), ecorePackage.getEString(), "servicesTimes", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ManageabilityCharacteristics(), ecorePackage.getEString(), "manageabilityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ServiceabilityCharacteristics(), ecorePackage.getEString(), "serviceabilityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_PerformanceCharacteristics(), ecorePackage.getEString(), "performanceCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ResponseCharacteristics(), ecorePackage.getEString(), "responseCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ReliabilityCharacteristics(), ecorePackage.getEString(), "reliabilityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_QualityOfInformationRequired(), ecorePackage.getEString(), "qualityOfInformationRequired", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ContractControlRequirements(), ecorePackage.getEString(), "contractControlRequirements", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ResultControlRequirements(), ecorePackage.getEString(), "resultControlRequirements", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_RecoverabilityCharacteristics(), ecorePackage.getEString(), "recoverabilityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_LocatabilityCharacteristics(), ecorePackage.getEString(), "locatabilityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_SecurityCharacteristics(), ecorePackage.getEString(), "securityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_PrivacyCharacteristics(), ecorePackage.getEString(), "privacyCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_IntegrityCharacteristics(), ecorePackage.getEString(), "integrityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_CredibilityCharacteristics(), ecorePackage.getEString(), "credibilityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_LocalizationCharacteristics(), ecorePackage.getEString(), "localizationCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_InternationalizationCharacteristics(), ecorePackage.getEString(), "internationalizationCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_InteroperabilityCharacteristics(), ecorePackage.getEString(), "interoperabilityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ScalabilityCharacteristics(), ecorePackage.getEString(), "scalabilityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_PortabilityCharacteristics(), ecorePackage.getEString(), "portabilityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ExtensibilityCharacteristics(), ecorePackage.getEString(), "extensibilityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_CapacityCharacteristics(), ecorePackage.getEString(), "capacityCharacteristics", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_Throughput(), ecorePackage.getEString(), "throughput", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_ThroughputPeriod(), ecorePackage.getEString(), "throughputPeriod", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_Growth(), ecorePackage.getEString(), "growth", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_GrowthPeriod(), ecorePackage.getEString(), "growthPeriod", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_PeakProfileShortTerm(), ecorePackage.getEString(), "peakProfileShortTerm", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_PeakProfileLongTerm(), ecorePackage.getEString(), "peakProfileLongTerm", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_IsResolvedByServices(), this.getService(), this.getService_ResolvesEvents(), "isResolvedByServices", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_IsResolvedByProcesses(), this.getProcess(), this.getProcess_ResolvesEvents(), "isResolvedByProcesses", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_IsGeneratedByProcesses(), this.getProcess(), this.getProcess_GeneratesEvents(), "isGeneratedByProcesses", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_IsResolvedByActors(), this.getActor(), this.getActor_ResolvesEvents(), "isResolvedByActors", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_IsGeneratedByActors(), this.getActor(), this.getActor_GeneratesEvents(), "isGeneratedByActors", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_EnsuresCorrectOperationOfProcesses(), this.getProcess(), this.getProcess_IsGuidedByControls(), "ensuresCorrectOperationOfProcesses", null, 0, -1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Delegates(), this.getElement(), this.getElement_IsDelegatedBy(), "delegates", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_IsDelegatedBy(), this.getElement(), this.getElement_Delegates(), "isDelegatedBy", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_SourceDescr(), ecorePackage.getEString(), "sourceDescr", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_OwnerDescr(), ecorePackage.getEString(), "ownerDescr", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Category(), ecorePackage.getEString(), "category", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(elementEClass, null, "forceID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "newID", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_ContainsActors(), this.getActor(), this.getActor_OperatesInLocation(), "containsActors", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_ContainsOrganizationUnits(), this.getOrganizationUnit(), this.getOrganizationUnit_OperatesInLocation(), "containsOrganizationUnits", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_ContainsPhysicalDataComponents(), this.getPhysicalDataComponent(), this.getPhysicalDataComponent_IsHotedInLocation(), "containsPhysicalDataComponents", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_ContainsPhysicalApplicationComponents(), this.getPhysicalApplicationComponent(), this.getPhysicalApplicationComponent_IsHostedInLocation(), "containsPhysicalApplicationComponents", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_ContainsPhysicalTechnologyComponents(), this.getPhysicalTechnologyComponent(), this.getPhysicalTechnologyComponent_IsHostedInLocation(), "containsPhysicalTechnologyComponents", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_DecomposesLocation(), this.getLocation(), this.getLocation_IsDecomposedByLocations(), "decomposesLocation", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_IsDecomposedByLocations(), this.getLocation(), this.getLocation_DecomposesLocation(), "isDecomposedByLocations", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_IsDeliveredBy(), this.getWorkPackage(), this.getWorkPackage_DeliversCapabilities(), "isDeliveredBy", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_BusinessValue(), ecorePackage.getEString(), "businessValue", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_Increments(), ecorePackage.getEString(), "increments", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategicElementEClass, StrategicElement.class, "StrategicElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(principleEClass, Principle.class, "Principle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrinciple_PrincipleCategory(), this.getPrincipleCategory(), "principleCategory", null, 1, 1, Principle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinciple_Priority(), ecorePackage.getEString(), "priority", null, 0, 1, Principle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinciple_StatementOfPrinciple(), ecorePackage.getEString(), "statementOfPrinciple", null, 0, 1, Principle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinciple_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, Principle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinciple_Implication(), ecorePackage.getEString(), "implication", null, 0, 1, Principle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrinciple_Metric(), ecorePackage.getEString(), "metric", null, 0, 1, Principle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_StatementOfRequirement(), ecorePackage.getEString(), "statementOfRequirement", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_AcceptanceCriteria(), ecorePackage.getEString(), "acceptanceCriteria", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gapEClass, Gap.class, "Gap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workPackageEClass, WorkPackage.class, "WorkPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkPackage_WorkPackageCategory(), this.getWorkPackageCategory(), "workPackageCategory", null, 1, 1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkPackage_DeliversCapabilities(), this.getCapability(), this.getCapability_IsDeliveredBy(), "deliversCapabilities", null, 0, -1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkPackage_CapabilityDelivered(), ecorePackage.getEString(), "capabilityDelivered", null, 0, 1, WorkPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalDataComponentEClass, LogicalDataComponent.class, "LogicalDataComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalDataComponent_EncapsulatesDataEntities(), this.getDataEntity(), this.getDataEntity_ResidesWithinLogicalDataComponent(), "encapsulatesDataEntities", null, 0, -1, LogicalDataComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalDataComponent_IsExtendedByPhysicalDataComponents(), this.getPhysicalDataComponent(), this.getPhysicalDataComponent_ExtendsLogicalDataComponents(), "isExtendedByPhysicalDataComponents", null, 0, -1, LogicalDataComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalDataComponentEClass, PhysicalDataComponent.class, "PhysicalDataComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalDataComponent_ExtendsLogicalDataComponents(), this.getLogicalDataComponent(), this.getLogicalDataComponent_IsExtendedByPhysicalDataComponents(), "extendsLogicalDataComponents", null, 0, -1, PhysicalDataComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalDataComponent_IsHotedInLocation(), this.getLocation(), this.getLocation_ContainsPhysicalDataComponents(), "isHotedInLocation", null, 0, 1, PhysicalDataComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalDataComponent_DecomposesPhysicalDataComponent(), this.getPhysicalDataComponent(), this.getPhysicalDataComponent_IsDecomposedByPhysicalDataComponents(), "decomposesPhysicalDataComponent", null, 0, 1, PhysicalDataComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalDataComponent_EncapsulatesPhysicalApplicationComponents(), this.getPhysicalApplicationComponent(), this.getPhysicalApplicationComponent_EncapsulatesPhysicalDataComponents(), "encapsulatesPhysicalApplicationComponents", null, 0, -1, PhysicalDataComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalDataComponent_IsDecomposedByPhysicalDataComponents(), this.getPhysicalDataComponent(), this.getPhysicalDataComponent_DecomposesPhysicalDataComponent(), "isDecomposedByPhysicalDataComponents", null, 0, -1, PhysicalDataComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationArchitectureEClass, ApplicationArchitecture.class, "ApplicationArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationArchitecture_LogicalApplicationComponents(), this.getLogicalApplicationComponent(), null, "logicalApplicationComponents", null, 0, -1, ApplicationArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArchitecture_PhysicalApplicationComponents(), this.getPhysicalApplicationComponent(), null, "physicalApplicationComponents", null, 0, -1, ApplicationArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationArchitecture_InformationSystemServices(), this.getInformationSystemService(), null, "informationSystemServices", null, 0, -1, ApplicationArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalApplicationComponentEClass, PhysicalApplicationComponent.class, "PhysicalApplicationComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalApplicationComponent_ExtendsLogicalApplicationComponents(), this.getLogicalApplicationComponent(), this.getLogicalApplicationComponent_IsExtendedByPhysicalApplicationComponents(), "extendsLogicalApplicationComponents", null, 0, -1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalApplicationComponent_IsHostedInLocation(), this.getLocation(), this.getLocation_ContainsPhysicalApplicationComponents(), "isHostedInLocation", null, 0, -1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalApplicationComponent_CommunicatesWith(), this.getPhysicalApplicationComponent(), null, "communicatesWith", null, 0, -1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_LifeCycleStatus(), this.getLifeCycleStatus(), "lifeCycleStatus", null, 1, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_InitialLiveDate(), ecorePackage.getEDate(), "initialLiveDate", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_DateOfLastRelease(), ecorePackage.getEDate(), "dateOfLastRelease", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_DateOfNextRelease(), ecorePackage.getEDate(), "dateOfNextRelease", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_RetirementDate(), ecorePackage.getEDate(), "retirementDate", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_AvailabilityCharacteristics(), ecorePackage.getEString(), "availabilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_ServicesTimes(), ecorePackage.getEString(), "servicesTimes", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_ManageabilityCharacteristics(), ecorePackage.getEString(), "manageabilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_ServiceabilityCharacteristics(), ecorePackage.getEString(), "serviceabilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_PerformanceCharacteristics(), ecorePackage.getEString(), "performanceCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_ReliabilityCharacteristics(), ecorePackage.getEString(), "reliabilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_RecoverabilityCharacteristics(), ecorePackage.getEString(), "recoverabilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_LocatabilityCharacteristics(), ecorePackage.getEString(), "locatabilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_SecurityCharacteristics(), ecorePackage.getEString(), "securityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_PrivacyCharacteristics(), ecorePackage.getEString(), "privacyCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_IntegrityCharacteristics(), ecorePackage.getEString(), "integrityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_CredibilityCharacteristics(), ecorePackage.getEString(), "credibilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_LocalizationCharacteristics(), ecorePackage.getEString(), "localizationCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_InternationalizationCharacteristics(), ecorePackage.getEString(), "internationalizationCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_InteroperabilityCharacteristics(), ecorePackage.getEString(), "interoperabilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_ScalabilityCharacteristics(), ecorePackage.getEString(), "scalabilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_PortabilityCharacteristics(), ecorePackage.getEString(), "portabilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_ExtensibilityCharacteristics(), ecorePackage.getEString(), "extensibilityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_CapacityCharacteristics(), ecorePackage.getEString(), "capacityCharacteristics", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_Throughput(), ecorePackage.getEString(), "throughput", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_ThroughputPeriod(), ecorePackage.getEString(), "throughputPeriod", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_Growth(), ecorePackage.getEString(), "growth", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_GrowthPeriod(), ecorePackage.getEString(), "growthPeriod", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_PeakProfileShortTerm(), ecorePackage.getEString(), "peakProfileShortTerm", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalApplicationComponent_PeakProfileLongTerm(), ecorePackage.getEString(), "peakProfileLongTerm", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalApplicationComponent_EncapsulatesPhysicalDataComponents(), this.getPhysicalDataComponent(), this.getPhysicalDataComponent_EncapsulatesPhysicalApplicationComponents(), "encapsulatesPhysicalDataComponents", null, 0, -1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalApplicationComponent_IsRealizedByPhysicalTechnologyComponents(), this.getPhysicalTechnologyComponent(), this.getPhysicalTechnologyComponent_RealizesPhysicalApplicationComponents(), "isRealizedByPhysicalTechnologyComponents", null, 0, -1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalApplicationComponent_DecomposesPhysicalApplicationComponent(), this.getPhysicalApplicationComponent(), this.getPhysicalApplicationComponent_IsDecomposedByPhysicalApplicationComponents(), "decomposesPhysicalApplicationComponent", null, 0, 1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalApplicationComponent_IsDecomposedByPhysicalApplicationComponents(), this.getPhysicalApplicationComponent(), this.getPhysicalApplicationComponent_DecomposesPhysicalApplicationComponent(), "isDecomposedByPhysicalApplicationComponents", null, 0, -1, PhysicalApplicationComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalTechnologyComponentEClass, LogicalTechnologyComponent.class, "LogicalTechnologyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalTechnologyComponent_ProvidesPlatformForServices(), this.getService(), this.getService_IsImplementedOnLogicalTechnologyComponents(), "providesPlatformForServices", null, 0, -1, LogicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalTechnologyComponent_SuppliesPlatformServices(), this.getPlatformService(), this.getPlatformService_IsSuppliedByLogicalTechnologyComponents(), "suppliesPlatformServices", null, 0, -1, LogicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalTechnologyComponent_IsRealizedByPhysicalTechnologyComponents(), this.getPhysicalTechnologyComponent(), this.getPhysicalTechnologyComponent_ExtendsLogicalTechnologyComponents(), "isRealizedByPhysicalTechnologyComponents", null, 0, -1, LogicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalTechnologyComponent_DecomposesLogicalTechnologyComponent(), this.getLogicalTechnologyComponent(), this.getLogicalTechnologyComponent_IsDecomposedByLogicalTechnologyComponents(), "decomposesLogicalTechnologyComponent", null, 0, 1, LogicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalTechnologyComponent_IsDependentOnLogicalTechnologyComponents(), this.getLogicalTechnologyComponent(), this.getLogicalTechnologyComponent_IsRequiredByLogicalTechnologyComponents(), "isDependentOnLogicalTechnologyComponents", null, 0, -1, LogicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalTechnologyComponent_CategoryTRM(), ecorePackage.getEString(), "categoryTRM", null, 0, 1, LogicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalTechnologyComponent_IsExtendedByPhysicalTechnologyComponent(), this.getPhysicalTechnologyComponent(), null, "isExtendedByPhysicalTechnologyComponent", null, 0, -1, LogicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalTechnologyComponent_IsRequiredByLogicalTechnologyComponents(), this.getLogicalTechnologyComponent(), this.getLogicalTechnologyComponent_IsDependentOnLogicalTechnologyComponents(), "isRequiredByLogicalTechnologyComponents", null, 0, -1, LogicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalTechnologyComponent_IsDecomposedByLogicalTechnologyComponents(), this.getLogicalTechnologyComponent(), this.getLogicalTechnologyComponent_DecomposesLogicalTechnologyComponent(), "isDecomposedByLogicalTechnologyComponents", null, 0, -1, LogicalTechnologyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategicArchitectureEClass, StrategicArchitecture.class, "StrategicArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategicArchitecture_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, StrategicArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStrategicArchitecture_StrategicElements(), this.getStrategicElement(), null, "strategicElements", null, 0, -1, StrategicArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardEClass, Standard.class, "Standard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandard_StandardClass(), this.getStandardsClass(), "standardClass", null, 0, 1, Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_StandardCreationDate(), ecorePackage.getEDate(), "standardCreationDate", null, 0, 1, Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_LastStandardReviewDate(), ecorePackage.getEDate(), "lastStandardReviewDate", null, 0, 1, Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_NextStandardReviewDate(), ecorePackage.getEDate(), "nextStandardReviewDate", null, 0, 1, Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandard_RetireDate(), ecorePackage.getEDate(), "retireDate", null, 0, 1, Standard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_IsProvidedToActors(), this.getActor(), this.getActor_ConsumesServices(), "isProvidedToActors", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ProvidesGovernedInterfaceToAccessFunctions(), this.getFunction(), this.getFunction_IsBoundedByServices(), "providesGovernedInterfaceToAccessFunctions", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ProvidesDataEntities(), this.getDataEntity(), this.getDataEntity_IsUpdatedThroughServices(), "providesDataEntities", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ConsumesDataEntities(), this.getDataEntity(), this.getDataEntity_IsAccessedByServices(), "consumesDataEntities", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_IsGovernedAndMeasuredByContracts(), this.getContract(), this.getContract_GovernsAndMeasuresBusinessServices(), "isGovernedAndMeasuredByContracts", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ResolvesEvents(), this.getEvent(), this.getEvent_IsResolvedByServices(), "resolvesEvents", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_IsImplementedOnLogicalTechnologyComponents(), this.getLogicalTechnologyComponent(), this.getLogicalTechnologyComponent_ProvidesPlatformForServices(), "isImplementedOnLogicalTechnologyComponents", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_IsRealizedThroughLogicalApplicationComponent(), this.getLogicalApplicationComponent(), this.getLogicalApplicationComponent_ImplementsServices(), "isRealizedThroughLogicalApplicationComponent", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_IsOwnedAndGovernedByOrganizationUnits(), this.getOrganizationUnit(), this.getOrganizationUnit_OwnsAndGovernsServices(), "isOwnedAndGovernedByOrganizationUnits", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_IsTrackedAgainstMeasures(), this.getMeasure(), this.getMeasure_SetsPerformanceCriteriaForServices(), "isTrackedAgainstMeasures", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_SupportsProcesses(), this.getProcess(), this.getProcess_DecomposesServices(), "supportsProcesses", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_IsRealizedByProcesses(), this.getProcess(), this.getProcess_OrchestratesServices(), "isRealizedByProcesses", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_MeetsServiceQualities(), this.getServiceQuality(), this.getServiceQuality_AppliesToServices(), "meetsServiceQualities", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ConsumesServices(), this.getService(), null, "consumesServices", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_DecomposesServices(), this.getService(), this.getService_IsDecomposedByServices(), "decomposesServices", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_IsDecomposedByServices(), this.getService(), this.getService_DecomposesServices(), "isDecomposedByServices", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationComponentEClass, ApplicationComponent.class, "ApplicationComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationSystemServiceEClass, InformationSystemService.class, "InformationSystemService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataComponentEClass, DataComponent.class, "DataComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(technologyComponentEClass, TechnologyComponent.class, "TechnologyComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(principleCategoryEEnum, PrincipleCategory.class, "PrincipleCategory");
		addEEnumLiteral(principleCategoryEEnum, PrincipleCategory.GUIDING_PRINCIPLE);
		addEEnumLiteral(principleCategoryEEnum, PrincipleCategory.BUSINESS_PRINCIPLE);
		addEEnumLiteral(principleCategoryEEnum, PrincipleCategory.DATA_PRINCIPLE);
		addEEnumLiteral(principleCategoryEEnum, PrincipleCategory.APPLICATION_PRINCIPLE);
		addEEnumLiteral(principleCategoryEEnum, PrincipleCategory.INTEGRATION_PRINCIPLE);
		addEEnumLiteral(principleCategoryEEnum, PrincipleCategory.TECHNOLOGY_PRINCIPLE);

		initEEnum(standardsClassEEnum, StandardsClass.class, "StandardsClass");
		addEEnumLiteral(standardsClassEEnum, StandardsClass.NON_STANDARD);
		addEEnumLiteral(standardsClassEEnum, StandardsClass.PROPOSED);
		addEEnumLiteral(standardsClassEEnum, StandardsClass.PROVISIONAL);
		addEEnumLiteral(standardsClassEEnum, StandardsClass.STANDARD);
		addEEnumLiteral(standardsClassEEnum, StandardsClass.PHASING_OUT);
		addEEnumLiteral(standardsClassEEnum, StandardsClass.RETIRED);

		initEEnum(lifeCycleStatusEEnum, LifeCycleStatus.class, "LifeCycleStatus");
		addEEnumLiteral(lifeCycleStatusEEnum, LifeCycleStatus.PROPOSED);
		addEEnumLiteral(lifeCycleStatusEEnum, LifeCycleStatus.IN_DEVELOPMENT);
		addEEnumLiteral(lifeCycleStatusEEnum, LifeCycleStatus.LIVE);
		addEEnumLiteral(lifeCycleStatusEEnum, LifeCycleStatus.PHASING_OUT);
		addEEnumLiteral(lifeCycleStatusEEnum, LifeCycleStatus.RETIRED);

		initEEnum(dataEntityCategoryEEnum, DataEntityCategory.class, "DataEntityCategory");
		addEEnumLiteral(dataEntityCategoryEEnum, DataEntityCategory.MESSAGE);
		addEEnumLiteral(dataEntityCategoryEEnum, DataEntityCategory.INTERNALLY_STORED_ENTITY);

		initEEnum(workPackageCategoryEEnum, WorkPackageCategory.class, "WorkPackageCategory");
		addEEnumLiteral(workPackageCategoryEEnum, WorkPackageCategory.WORK_PACKAGE);
		addEEnumLiteral(workPackageCategoryEEnum, WorkPackageCategory.WORK_STREAM);
		addEEnumLiteral(workPackageCategoryEEnum, WorkPackageCategory.PROJECT);
		addEEnumLiteral(workPackageCategoryEEnum, WorkPackageCategory.PROGRAM);
		addEEnumLiteral(workPackageCategoryEEnum, WorkPackageCategory.PORTOFOLIO);

		// Create resource
		createResource(eNS_URI);
	}

} //ContentfwkPackageImpl
