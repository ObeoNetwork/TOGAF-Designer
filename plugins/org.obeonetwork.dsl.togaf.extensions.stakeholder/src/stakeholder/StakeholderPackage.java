/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package stakeholder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;

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
 * @see stakeholder.StakeholderFactory
 * @model kind="package"
 * @generated
 */
public interface StakeholderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stakeholder";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/dsl/togaf/stakeholder/0.7.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stakeholder";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StakeholderPackage eINSTANCE = stakeholder.impl.StakeholderPackageImpl.init();

	/**
	 * The meta object id for the '{@link stakeholder.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stakeholder.impl.StakeholderImpl
	 * @see stakeholder.impl.StakeholderPackageImpl#getStakeholder()
	 * @generated
	 */
	int STAKEHOLDER = 0;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__DELEGATES = ContentfwkPackage.STRATEGIC_ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__IS_DELEGATED_BY = ContentfwkPackage.STRATEGIC_ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__NAME = ContentfwkPackage.STRATEGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__DESCRIPTION = ContentfwkPackage.STRATEGIC_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CATEGORY = ContentfwkPackage.STRATEGIC_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__SOURCE_DESCR = ContentfwkPackage.STRATEGIC_ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__OWNER_DESCR = ContentfwkPackage.STRATEGIC_ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__ID = ContentfwkPackage.STRATEGIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Involvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__INVOLVEMENT = ContentfwkPackage.STRATEGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CLASS = ContentfwkPackage.STRATEGIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relevant Artifacts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__RELEVANT_ARTIFACTS = ContentfwkPackage.STRATEGIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = ContentfwkPackage.STRATEGIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link stakeholder.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stakeholder.impl.ValueImpl
	 * @see stakeholder.impl.StakeholderPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

	/**
	 * The feature id for the '<em><b>Delegates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DELEGATES = ContentfwkPackage.STRATEGIC_ELEMENT__DELEGATES;

	/**
	 * The feature id for the '<em><b>Is Delegated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__IS_DELEGATED_BY = ContentfwkPackage.STRATEGIC_ELEMENT__IS_DELEGATED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = ContentfwkPackage.STRATEGIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DESCRIPTION = ContentfwkPackage.STRATEGIC_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CATEGORY = ContentfwkPackage.STRATEGIC_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Source Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__SOURCE_DESCR = ContentfwkPackage.STRATEGIC_ELEMENT__SOURCE_DESCR;

	/**
	 * The feature id for the '<em><b>Owner Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__OWNER_DESCR = ContentfwkPackage.STRATEGIC_ELEMENT__OWNER_DESCR;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ID = ContentfwkPackage.STRATEGIC_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NEXT = ContentfwkPackage.STRATEGIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = ContentfwkPackage.STRATEGIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link stakeholder.StakeholderClass <em>Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stakeholder.StakeholderClass
	 * @see stakeholder.impl.StakeholderPackageImpl#getStakeholderClass()
	 * @generated
	 */
	int STAKEHOLDER_CLASS = 2;

	/**
	 * The meta object id for the '{@link stakeholder.RelevantArtifact <em>Relevant Artifact</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stakeholder.RelevantArtifact
	 * @see stakeholder.impl.StakeholderPackageImpl#getRelevantArtifact()
	 * @generated
	 */
	int RELEVANT_ARTIFACT = 3;


	/**
	 * Returns the meta object for class '{@link stakeholder.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see stakeholder.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for the attribute '{@link stakeholder.Stakeholder#getInvolvement <em>Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Involvement</em>'.
	 * @see stakeholder.Stakeholder#getInvolvement()
	 * @see #getStakeholder()
	 * @generated
	 */
	EAttribute getStakeholder_Involvement();

	/**
	 * Returns the meta object for the attribute '{@link stakeholder.Stakeholder#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see stakeholder.Stakeholder#getClass_()
	 * @see #getStakeholder()
	 * @generated
	 */
	EAttribute getStakeholder_Class();

	/**
	 * Returns the meta object for the attribute list '{@link stakeholder.Stakeholder#getRelevantArtifacts <em>Relevant Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Relevant Artifacts</em>'.
	 * @see stakeholder.Stakeholder#getRelevantArtifacts()
	 * @see #getStakeholder()
	 * @generated
	 */
	EAttribute getStakeholder_RelevantArtifacts();

	/**
	 * Returns the meta object for class '{@link stakeholder.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see stakeholder.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link stakeholder.Value#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see stakeholder.Value#getNext()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Next();

	/**
	 * Returns the meta object for enum '{@link stakeholder.StakeholderClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class</em>'.
	 * @see stakeholder.StakeholderClass
	 * @generated
	 */
	EEnum getStakeholderClass();

	/**
	 * Returns the meta object for enum '{@link stakeholder.RelevantArtifact <em>Relevant Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relevant Artifact</em>'.
	 * @see stakeholder.RelevantArtifact
	 * @generated
	 */
	EEnum getRelevantArtifact();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StakeholderFactory getStakeholderFactory();

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
		 * The meta object literal for the '{@link stakeholder.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stakeholder.impl.StakeholderImpl
		 * @see stakeholder.impl.StakeholderPackageImpl#getStakeholder()
		 * @generated
		 */
		EClass STAKEHOLDER = eINSTANCE.getStakeholder();

		/**
		 * The meta object literal for the '<em><b>Involvement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAKEHOLDER__INVOLVEMENT = eINSTANCE.getStakeholder_Involvement();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAKEHOLDER__CLASS = eINSTANCE.getStakeholder_Class();

		/**
		 * The meta object literal for the '<em><b>Relevant Artifacts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAKEHOLDER__RELEVANT_ARTIFACTS = eINSTANCE.getStakeholder_RelevantArtifacts();

		/**
		 * The meta object literal for the '{@link stakeholder.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stakeholder.impl.ValueImpl
		 * @see stakeholder.impl.StakeholderPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__NEXT = eINSTANCE.getValue_Next();

		/**
		 * The meta object literal for the '{@link stakeholder.StakeholderClass <em>Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stakeholder.StakeholderClass
		 * @see stakeholder.impl.StakeholderPackageImpl#getStakeholderClass()
		 * @generated
		 */
		EEnum STAKEHOLDER_CLASS = eINSTANCE.getStakeholderClass();

		/**
		 * The meta object literal for the '{@link stakeholder.RelevantArtifact <em>Relevant Artifact</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stakeholder.RelevantArtifact
		 * @see stakeholder.impl.StakeholderPackageImpl#getRelevantArtifact()
		 * @generated
		 */
		EEnum RELEVANT_ARTIFACT = eINSTANCE.getRelevantArtifact();

	}

} //StakeholderPackage
