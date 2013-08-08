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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture;
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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackageCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentfwkFactoryImpl extends EFactoryImpl implements ContentfwkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContentfwkFactory init() {
		try {
			ContentfwkFactory theContentfwkFactory = (ContentfwkFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeonetwork.org/dsl/togaf/contentfwk/9.0.0"); 
			if (theContentfwkFactory != null) {
				return theContentfwkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContentfwkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentfwkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE: return (EObject)createEnterpriseArchitecture();
			case ContentfwkPackage.BUSINESS_ARCHITECTURE: return (EObject)createBusinessArchitecture();
			case ContentfwkPackage.DATA_ARCHITECTURE: return (EObject)createDataArchitecture();
			case ContentfwkPackage.TECHNOLOGY_ARCHITECTURE: return (EObject)createTechnologyArchitecture();
			case ContentfwkPackage.DRIVER: return (EObject)createDriver();
			case ContentfwkPackage.GOAL: return (EObject)createGoal();
			case ContentfwkPackage.OBJECTIVE: return (EObject)createObjective();
			case ContentfwkPackage.ORGANIZATION_UNIT: return (EObject)createOrganizationUnit();
			case ContentfwkPackage.ACTOR: return (EObject)createActor();
			case ContentfwkPackage.ROLE: return (EObject)createRole();
			case ContentfwkPackage.DATA_ENTITY: return (EObject)createDataEntity();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT: return (EObject)createLogicalApplicationComponent();
			case ContentfwkPackage.FUNCTION: return (EObject)createFunction();
			case ContentfwkPackage.BUSINESS_SERVICE: return (EObject)createBusinessService();
			case ContentfwkPackage.PROCESS: return (EObject)createProcess();
			case ContentfwkPackage.PLATFORM_SERVICE: return (EObject)createPlatformService();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT: return (EObject)createPhysicalTechnologyComponent();
			case ContentfwkPackage.PRODUCT: return (EObject)createProduct();
			case ContentfwkPackage.MEASURE: return (EObject)createMeasure();
			case ContentfwkPackage.SERVICE_QUALITY: return (EObject)createServiceQuality();
			case ContentfwkPackage.CONTRACT: return (EObject)createContract();
			case ContentfwkPackage.EVENT: return (EObject)createEvent();
			case ContentfwkPackage.CONTROL: return (EObject)createControl();
			case ContentfwkPackage.ELEMENT: return (EObject)createElement();
			case ContentfwkPackage.LOCATION: return (EObject)createLocation();
			case ContentfwkPackage.CAPABILITY: return (EObject)createCapability();
			case ContentfwkPackage.PRINCIPLE: return (EObject)createPrinciple();
			case ContentfwkPackage.CONSTRAINT: return (EObject)createConstraint();
			case ContentfwkPackage.ASSUMPTION: return (EObject)createAssumption();
			case ContentfwkPackage.REQUIREMENT: return (EObject)createRequirement();
			case ContentfwkPackage.GAP: return (EObject)createGap();
			case ContentfwkPackage.WORK_PACKAGE: return (EObject)createWorkPackage();
			case ContentfwkPackage.LOGICAL_DATA_COMPONENT: return (EObject)createLogicalDataComponent();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT: return (EObject)createPhysicalDataComponent();
			case ContentfwkPackage.APPLICATION_ARCHITECTURE: return (EObject)createApplicationArchitecture();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT: return (EObject)createPhysicalApplicationComponent();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT: return (EObject)createLogicalTechnologyComponent();
			case ContentfwkPackage.STRATEGIC_ARCHITECTURE: return (EObject)createStrategicArchitecture();
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE: return (EObject)createInformationSystemService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ContentfwkPackage.PRINCIPLE_CATEGORY:
				return createPrincipleCategoryFromString(eDataType, initialValue);
			case ContentfwkPackage.STANDARDS_CLASS:
				return createStandardsClassFromString(eDataType, initialValue);
			case ContentfwkPackage.LIFE_CYCLE_STATUS:
				return createLifeCycleStatusFromString(eDataType, initialValue);
			case ContentfwkPackage.DATA_ENTITY_CATEGORY:
				return createDataEntityCategoryFromString(eDataType, initialValue);
			case ContentfwkPackage.WORK_PACKAGE_CATEGORY:
				return createWorkPackageCategoryFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ContentfwkPackage.PRINCIPLE_CATEGORY:
				return convertPrincipleCategoryToString(eDataType, instanceValue);
			case ContentfwkPackage.STANDARDS_CLASS:
				return convertStandardsClassToString(eDataType, instanceValue);
			case ContentfwkPackage.LIFE_CYCLE_STATUS:
				return convertLifeCycleStatusToString(eDataType, instanceValue);
			case ContentfwkPackage.DATA_ENTITY_CATEGORY:
				return convertDataEntityCategoryToString(eDataType, instanceValue);
			case ContentfwkPackage.WORK_PACKAGE_CATEGORY:
				return convertWorkPackageCategoryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseArchitecture createEnterpriseArchitecture() {
		EnterpriseArchitectureImpl enterpriseArchitecture = new EnterpriseArchitectureImpl();
		return enterpriseArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessArchitecture createBusinessArchitecture() {
		BusinessArchitectureImpl businessArchitecture = new BusinessArchitectureImpl();
		return businessArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataArchitecture createDataArchitecture() {
		DataArchitectureImpl dataArchitecture = new DataArchitectureImpl();
		return dataArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologyArchitecture createTechnologyArchitecture() {
		TechnologyArchitectureImpl technologyArchitecture = new TechnologyArchitectureImpl();
		return technologyArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver createDriver() {
		DriverImpl driver = new DriverImpl();
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective createObjective() {
		ObjectiveImpl objective = new ObjectiveImpl();
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit createOrganizationUnit() {
		OrganizationUnitImpl organizationUnit = new OrganizationUnitImpl();
		return organizationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntity createDataEntity() {
		DataEntityImpl dataEntity = new DataEntityImpl();
		return dataEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalApplicationComponent createLogicalApplicationComponent() {
		LogicalApplicationComponentImpl logicalApplicationComponent = new LogicalApplicationComponentImpl();
		return logicalApplicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessService createBusinessService() {
		BusinessServiceImpl businessService = new BusinessServiceImpl();
		return businessService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformService createPlatformService() {
		PlatformServiceImpl platformService = new PlatformServiceImpl();
		return platformService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalTechnologyComponent createPhysicalTechnologyComponent() {
		PhysicalTechnologyComponentImpl physicalTechnologyComponent = new PhysicalTechnologyComponentImpl();
		return physicalTechnologyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceQuality createServiceQuality() {
		ServiceQualityImpl serviceQuality = new ServiceQualityImpl();
		return serviceQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principle createPrinciple() {
		PrincipleImpl principle = new PrincipleImpl();
		return principle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gap createGap() {
		GapImpl gap = new GapImpl();
		return gap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPackage createWorkPackage() {
		WorkPackageImpl workPackage = new WorkPackageImpl();
		return workPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDataComponent createLogicalDataComponent() {
		LogicalDataComponentImpl logicalDataComponent = new LogicalDataComponentImpl();
		return logicalDataComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDataComponent createPhysicalDataComponent() {
		PhysicalDataComponentImpl physicalDataComponent = new PhysicalDataComponentImpl();
		return physicalDataComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationArchitecture createApplicationArchitecture() {
		ApplicationArchitectureImpl applicationArchitecture = new ApplicationArchitectureImpl();
		return applicationArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalApplicationComponent createPhysicalApplicationComponent() {
		PhysicalApplicationComponentImpl physicalApplicationComponent = new PhysicalApplicationComponentImpl();
		return physicalApplicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalTechnologyComponent createLogicalTechnologyComponent() {
		LogicalTechnologyComponentImpl logicalTechnologyComponent = new LogicalTechnologyComponentImpl();
		return logicalTechnologyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategicArchitecture createStrategicArchitecture() {
		StrategicArchitectureImpl strategicArchitecture = new StrategicArchitectureImpl();
		return strategicArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationSystemService createInformationSystemService() {
		InformationSystemServiceImpl informationSystemService = new InformationSystemServiceImpl();
		return informationSystemService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipleCategory createPrincipleCategoryFromString(EDataType eDataType, String initialValue) {
		PrincipleCategory result = PrincipleCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrincipleCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardsClass createStandardsClassFromString(EDataType eDataType, String initialValue) {
		StandardsClass result = StandardsClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardsClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycleStatus createLifeCycleStatusFromString(EDataType eDataType, String initialValue) {
		LifeCycleStatus result = LifeCycleStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLifeCycleStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntityCategory createDataEntityCategoryFromString(EDataType eDataType, String initialValue) {
		DataEntityCategory result = DataEntityCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataEntityCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPackageCategory createWorkPackageCategoryFromString(EDataType eDataType, String initialValue) {
		WorkPackageCategory result = WorkPackageCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkPackageCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentfwkPackage getContentfwkPackage() {
		return (ContentfwkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContentfwkPackage getPackage() {
		return ContentfwkPackage.eINSTANCE;
	}

} //ContentfwkFactoryImpl
