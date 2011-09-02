/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package stakeholder.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;

import stakeholder.RelevantArtifact;
import stakeholder.Stakeholder;
import stakeholder.StakeholderClass;
import stakeholder.StakeholderFactory;
import stakeholder.StakeholderPackage;
import stakeholder.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StakeholderPackageImpl extends EPackageImpl implements StakeholderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stakeholderClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relevantArtifactEEnum = null;

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
	 * @see stakeholder.StakeholderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StakeholderPackageImpl() {
		super(eNS_URI, StakeholderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StakeholderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StakeholderPackage init() {
		if (isInited) return (StakeholderPackage)EPackage.Registry.INSTANCE.getEPackage(StakeholderPackage.eNS_URI);

		// Obtain or create and register package
		StakeholderPackageImpl theStakeholderPackage = (StakeholderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StakeholderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StakeholderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ContentfwkPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStakeholderPackage.createPackageContents();

		// Initialize created meta-data
		theStakeholderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStakeholderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StakeholderPackage.eNS_URI, theStakeholderPackage);
		return theStakeholderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeholder() {
		return stakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStakeholder_Involvement() {
		return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStakeholder_Class() {
		return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStakeholder_RelevantArtifacts() {
		return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_Next() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStakeholderClass() {
		return stakeholderClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelevantArtifact() {
		return relevantArtifactEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeholderFactory getStakeholderFactory() {
		return (StakeholderFactory)getEFactoryInstance();
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
		stakeholderEClass = createEClass(STAKEHOLDER);
		createEAttribute(stakeholderEClass, STAKEHOLDER__INVOLVEMENT);
		createEAttribute(stakeholderEClass, STAKEHOLDER__CLASS);
		createEAttribute(stakeholderEClass, STAKEHOLDER__RELEVANT_ARTIFACTS);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__NEXT);

		// Create enums
		stakeholderClassEEnum = createEEnum(STAKEHOLDER_CLASS);
		relevantArtifactEEnum = createEEnum(RELEVANT_ARTIFACT);
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

		// Obtain other dependent packages
		ContentfwkPackage theContentfwkPackage = (ContentfwkPackage)EPackage.Registry.INSTANCE.getEPackage(ContentfwkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stakeholderEClass.getESuperTypes().add(theContentfwkPackage.getStrategicElement());
		valueEClass.getESuperTypes().add(theContentfwkPackage.getStrategicElement());

		// Initialize classes and features; add operations and parameters
		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStakeholder_Involvement(), ecorePackage.getEString(), "involvement", null, 1, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStakeholder_Class(), this.getStakeholderClass(), "class", null, 1, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStakeholder_RelevantArtifacts(), this.getRelevantArtifact(), "relevantArtifacts", "", 1, -1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_Next(), this.getValue(), null, "next", null, 0, -1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stakeholderClassEEnum, StakeholderClass.class, "StakeholderClass");
		addEEnumLiteral(stakeholderClassEEnum, StakeholderClass.OTHER);
		addEEnumLiteral(stakeholderClassEEnum, StakeholderClass.KEEP_SATISFIED);
		addEEnumLiteral(stakeholderClassEEnum, StakeholderClass.KEEP_INFORMED);

		initEEnum(relevantArtifactEEnum, RelevantArtifact.class, "RelevantArtifact");
		addEEnumLiteral(relevantArtifactEEnum, RelevantArtifact.OTHER);
		addEEnumLiteral(relevantArtifactEEnum, RelevantArtifact.GOAL_OBJECTIVE_SERVICE_MODEL);
		addEEnumLiteral(relevantArtifactEEnum, RelevantArtifact.ORGANIZATION_CHART);
		addEEnumLiteral(relevantArtifactEEnum, RelevantArtifact.ROADMAPS);
		addEEnumLiteral(relevantArtifactEEnum, RelevantArtifact.APPLICATION_COMMUNICATION);
		addEEnumLiteral(relevantArtifactEEnum, RelevantArtifact.FUNCTIONAL_DECOMPOSITION);
		addEEnumLiteral(relevantArtifactEEnum, RelevantArtifact.ORGANIZATION_ACTOR_LOCATION);
		addEEnumLiteral(relevantArtifactEEnum, RelevantArtifact.BUSINESS_FOOTPRINT);

		// Create resource
		createResource(eNS_URI);
	}

} //StakeholderPackageImpl
