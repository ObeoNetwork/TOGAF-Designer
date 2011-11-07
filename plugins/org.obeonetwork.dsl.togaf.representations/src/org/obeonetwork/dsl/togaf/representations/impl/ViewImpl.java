/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.togaf.representations.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.obeonetwork.dsl.togaf.representations.Representation;
import org.obeonetwork.dsl.togaf.representations.RepresentationsPackage;
import org.obeonetwork.dsl.togaf.representations.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.representations.impl.ViewImpl#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.representations.impl.ViewImpl#getViewpointURI <em>Viewpoint URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends CDOObjectImpl implements View {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepresentationsPackage.Literals.VIEW;
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
		return (EList<Representation>)eGet(RepresentationsPackage.Literals.VIEW__REPRESENTATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewpointURI() {
		return (String)eGet(RepresentationsPackage.Literals.VIEW__VIEWPOINT_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewpointURI(String newViewpointURI) {
		eSet(RepresentationsPackage.Literals.VIEW__VIEWPOINT_URI, newViewpointURI);
	}

} //ViewImpl
