/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package representations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import representations.Representation;
import representations.RepresentationsContainer;
import representations.RepresentationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link representations.impl.RepresentationsContainerImpl#getRepresentations <em>Representations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepresentationsContainerImpl extends CDOObjectImpl implements RepresentationsContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationsContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepresentationsPackage.Literals.REPRESENTATIONS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Representation> getRepresentations() {
		return (EList<Representation>)eGet(RepresentationsPackage.Literals.REPRESENTATIONS_CONTAINER__REPRESENTATIONS, true);
	}

} //RepresentationsContainerImpl
