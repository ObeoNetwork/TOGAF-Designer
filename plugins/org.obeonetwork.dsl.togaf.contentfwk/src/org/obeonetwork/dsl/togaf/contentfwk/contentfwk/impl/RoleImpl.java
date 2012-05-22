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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RoleImpl#getIsAssumedByActors <em>Is Assumed By Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RoleImpl#getAccessesFunctions <em>Accesses Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RoleImpl#getEstimatedFTEs <em>Estimated FT Es</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.RoleImpl#getDecomposesRole <em>Decomposes Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends ElementImpl implements Role {
	/**
	 * The default value of the '{@link #getEstimatedFTEs() <em>Estimated FT Es</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedFTEs()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTIMATED_FT_ES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getIsAssumedByActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.ROLE__IS_ASSUMED_BY_ACTORS, ContentfwkPackage.Literals.ROLE__IS_ASSUMED_BY_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getAccessesFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.ROLE__ACCESSES_FUNCTIONS, ContentfwkPackage.Literals.ROLE__ACCESSES_FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstimatedFTEs() {
		return (String)eDynamicGet(ContentfwkPackage.ROLE__ESTIMATED_FT_ES, ContentfwkPackage.Literals.ROLE__ESTIMATED_FT_ES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedFTEs(String newEstimatedFTEs) {
		eDynamicSet(ContentfwkPackage.ROLE__ESTIMATED_FT_ES, ContentfwkPackage.Literals.ROLE__ESTIMATED_FT_ES, newEstimatedFTEs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getDecomposesRole() {
		return (Role)eDynamicGet(ContentfwkPackage.ROLE__DECOMPOSES_ROLE, ContentfwkPackage.Literals.ROLE__DECOMPOSES_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetDecomposesRole() {
		return (Role)eDynamicGet(ContentfwkPackage.ROLE__DECOMPOSES_ROLE, ContentfwkPackage.Literals.ROLE__DECOMPOSES_ROLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesRole(Role newDecomposesRole) {
		eDynamicSet(ContentfwkPackage.ROLE__DECOMPOSES_ROLE, ContentfwkPackage.Literals.ROLE__DECOMPOSES_ROLE, newDecomposesRole);
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
			case ContentfwkPackage.ROLE__IS_ASSUMED_BY_ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsAssumedByActors()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ROLE__ACCESSES_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccessesFunctions()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.ROLE__IS_ASSUMED_BY_ACTORS:
				return ((InternalEList<?>)getIsAssumedByActors()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ROLE__ACCESSES_FUNCTIONS:
				return ((InternalEList<?>)getAccessesFunctions()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.ROLE__IS_ASSUMED_BY_ACTORS:
				return getIsAssumedByActors();
			case ContentfwkPackage.ROLE__ACCESSES_FUNCTIONS:
				return getAccessesFunctions();
			case ContentfwkPackage.ROLE__ESTIMATED_FT_ES:
				return getEstimatedFTEs();
			case ContentfwkPackage.ROLE__DECOMPOSES_ROLE:
				if (resolve) return getDecomposesRole();
				return basicGetDecomposesRole();
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
			case ContentfwkPackage.ROLE__IS_ASSUMED_BY_ACTORS:
				getIsAssumedByActors().clear();
				getIsAssumedByActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.ROLE__ACCESSES_FUNCTIONS:
				getAccessesFunctions().clear();
				getAccessesFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ContentfwkPackage.ROLE__ESTIMATED_FT_ES:
				setEstimatedFTEs((String)newValue);
				return;
			case ContentfwkPackage.ROLE__DECOMPOSES_ROLE:
				setDecomposesRole((Role)newValue);
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
			case ContentfwkPackage.ROLE__IS_ASSUMED_BY_ACTORS:
				getIsAssumedByActors().clear();
				return;
			case ContentfwkPackage.ROLE__ACCESSES_FUNCTIONS:
				getAccessesFunctions().clear();
				return;
			case ContentfwkPackage.ROLE__ESTIMATED_FT_ES:
				setEstimatedFTEs(ESTIMATED_FT_ES_EDEFAULT);
				return;
			case ContentfwkPackage.ROLE__DECOMPOSES_ROLE:
				setDecomposesRole((Role)null);
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
			case ContentfwkPackage.ROLE__IS_ASSUMED_BY_ACTORS:
				return !getIsAssumedByActors().isEmpty();
			case ContentfwkPackage.ROLE__ACCESSES_FUNCTIONS:
				return !getAccessesFunctions().isEmpty();
			case ContentfwkPackage.ROLE__ESTIMATED_FT_ES:
				return ESTIMATED_FT_ES_EDEFAULT == null ? getEstimatedFTEs() != null : !ESTIMATED_FT_ES_EDEFAULT.equals(getEstimatedFTEs());
			case ContentfwkPackage.ROLE__DECOMPOSES_ROLE:
				return basicGetDecomposesRole() != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
