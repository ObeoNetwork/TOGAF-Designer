/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package representations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see representations.RepresentationsFactory
 * @model kind="package"
 * @generated
 */
public interface RepresentationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "representations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/dsl/togaf/representations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rep";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepresentationsPackage eINSTANCE = representations.impl.RepresentationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link representations.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see representations.impl.RepresentationImpl
	 * @see representations.impl.RepresentationsPackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link representations.impl.RepresentationsContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see representations.impl.RepresentationsContainerImpl
	 * @see representations.impl.RepresentationsPackageImpl#getRepresentationsContainer()
	 * @generated
	 */
	int REPRESENTATIONS_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONS_CONTAINER__REPRESENTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATIONS_CONTAINER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link representations.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see representations.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link representations.Representation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see representations.Representation#getName()
	 * @see #getRepresentation()
	 * @generated
	 */
	EAttribute getRepresentation_Name();

	/**
	 * Returns the meta object for the attribute '{@link representations.Representation#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see representations.Representation#getContent()
	 * @see #getRepresentation()
	 * @generated
	 */
	EAttribute getRepresentation_Content();

	/**
	 * Returns the meta object for class '{@link representations.RepresentationsContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see representations.RepresentationsContainer
	 * @generated
	 */
	EClass getRepresentationsContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link representations.RepresentationsContainer#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representations</em>'.
	 * @see representations.RepresentationsContainer#getRepresentations()
	 * @see #getRepresentationsContainer()
	 * @generated
	 */
	EReference getRepresentationsContainer_Representations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepresentationsFactory getRepresentationsFactory();

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
		 * The meta object literal for the '{@link representations.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see representations.impl.RepresentationImpl
		 * @see representations.impl.RepresentationsPackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION__NAME = eINSTANCE.getRepresentation_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION__CONTENT = eINSTANCE.getRepresentation_Content();

		/**
		 * The meta object literal for the '{@link representations.impl.RepresentationsContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see representations.impl.RepresentationsContainerImpl
		 * @see representations.impl.RepresentationsPackageImpl#getRepresentationsContainer()
		 * @generated
		 */
		EClass REPRESENTATIONS_CONTAINER = eINSTANCE.getRepresentationsContainer();

		/**
		 * The meta object literal for the '<em><b>Representations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATIONS_CONTAINER__REPRESENTATIONS = eINSTANCE.getRepresentationsContainer_Representations();

	}

} //RepresentationsPackage
