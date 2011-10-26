/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package representations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import representations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepresentationsFactoryImpl extends EFactoryImpl implements RepresentationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepresentationsFactory init() {
		try {
			RepresentationsFactory theRepresentationsFactory = (RepresentationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeonetwork.org/dsl/togaf/representations/1.0"); 
			if (theRepresentationsFactory != null) {
				return theRepresentationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RepresentationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationsFactoryImpl() {
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
			case RepresentationsPackage.REPRESENTATION: return (EObject)createRepresentation();
			case RepresentationsPackage.REPRESENTATIONS_CONTAINER: return (EObject)createRepresentationsContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation createRepresentation() {
		RepresentationImpl representation = new RepresentationImpl();
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationsContainer createRepresentationsContainer() {
		RepresentationsContainerImpl representationsContainer = new RepresentationsContainerImpl();
		return representationsContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationsPackage getRepresentationsPackage() {
		return (RepresentationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RepresentationsPackage getPackage() {
		return RepresentationsPackage.eINSTANCE;
	}

} //RepresentationsFactoryImpl
