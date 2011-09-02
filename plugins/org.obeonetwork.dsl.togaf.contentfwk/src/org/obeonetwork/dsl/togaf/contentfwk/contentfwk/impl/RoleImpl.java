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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
	 * The cached value of the '{@link #getIsAssumedByActors() <em>Is Assumed By Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAssumedByActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> isAssumedByActors;

	/**
	 * The cached value of the '{@link #getAccessesFunctions() <em>Accesses Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessesFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> accessesFunctions;

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
	 * The cached value of the '{@link #getEstimatedFTEs() <em>Estimated FT Es</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedFTEs()
	 * @generated
	 * @ordered
	 */
	protected String estimatedFTEs = ESTIMATED_FT_ES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecomposesRole() <em>Decomposes Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesRole()
	 * @generated
	 * @ordered
	 */
	protected Role decomposesRole;

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
	public EList<Actor> getIsAssumedByActors() {
		if (isAssumedByActors == null) {
			isAssumedByActors = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, ContentfwkPackage.ROLE__IS_ASSUMED_BY_ACTORS, ContentfwkPackage.ACTOR__PERFORMS_TASK_IN_ROLES);
		}
		return isAssumedByActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getAccessesFunctions() {
		if (accessesFunctions == null) {
			accessesFunctions = new EObjectWithInverseResolvingEList.ManyInverse<Function>(Function.class, this, ContentfwkPackage.ROLE__ACCESSES_FUNCTIONS, ContentfwkPackage.FUNCTION__CAN_BE_ACCESSED_BY_ROLES);
		}
		return accessesFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstimatedFTEs() {
		return estimatedFTEs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedFTEs(String newEstimatedFTEs) {
		String oldEstimatedFTEs = estimatedFTEs;
		estimatedFTEs = newEstimatedFTEs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ROLE__ESTIMATED_FT_ES, oldEstimatedFTEs, estimatedFTEs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getDecomposesRole() {
		if (decomposesRole != null && decomposesRole.eIsProxy()) {
			InternalEObject oldDecomposesRole = (InternalEObject)decomposesRole;
			decomposesRole = (Role)eResolveProxy(oldDecomposesRole);
			if (decomposesRole != oldDecomposesRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.ROLE__DECOMPOSES_ROLE, oldDecomposesRole, decomposesRole));
			}
		}
		return decomposesRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetDecomposesRole() {
		return decomposesRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesRole(Role newDecomposesRole) {
		Role oldDecomposesRole = decomposesRole;
		decomposesRole = newDecomposesRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ROLE__DECOMPOSES_ROLE, oldDecomposesRole, decomposesRole));
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
				return isAssumedByActors != null && !isAssumedByActors.isEmpty();
			case ContentfwkPackage.ROLE__ACCESSES_FUNCTIONS:
				return accessesFunctions != null && !accessesFunctions.isEmpty();
			case ContentfwkPackage.ROLE__ESTIMATED_FT_ES:
				return ESTIMATED_FT_ES_EDEFAULT == null ? estimatedFTEs != null : !ESTIMATED_FT_ES_EDEFAULT.equals(estimatedFTEs);
			case ContentfwkPackage.ROLE__DECOMPOSES_ROLE:
				return decomposesRole != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (estimatedFTEs: ");
		result.append(estimatedFTEs);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
