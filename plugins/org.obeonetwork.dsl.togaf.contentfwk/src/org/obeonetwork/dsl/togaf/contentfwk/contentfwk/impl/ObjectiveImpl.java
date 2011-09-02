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

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl#getRealizesGoals <em>Realizes Goals</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl#getIsTrackedAgainstMeasures <em>Is Tracked Against Measures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ObjectiveImpl#getDecomposesObjective <em>Decomposes Objective</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectiveImpl extends ElementImpl implements Objective {
	/**
	 * The cached value of the '{@link #getRealizesGoals() <em>Realizes Goals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizesGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> realizesGoals;

	/**
	 * The cached value of the '{@link #getIsTrackedAgainstMeasures() <em>Is Tracked Against Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTrackedAgainstMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> isTrackedAgainstMeasures;

	/**
	 * The cached value of the '{@link #getDecomposesObjective() <em>Decomposes Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesObjective()
	 * @generated
	 * @ordered
	 */
	protected Objective decomposesObjective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getRealizesGoals() {
		if (realizesGoals == null) {
			realizesGoals = new EObjectWithInverseResolvingEList.ManyInverse<Goal>(Goal.class, this, ContentfwkPackage.OBJECTIVE__REALIZES_GOALS, ContentfwkPackage.GOAL__IS_REALIZED_THROUGH_OBJECTIVES);
		}
		return realizesGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getIsTrackedAgainstMeasures() {
		if (isTrackedAgainstMeasures == null) {
			isTrackedAgainstMeasures = new EObjectWithInverseResolvingEList.ManyInverse<Measure>(Measure.class, this, ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES, ContentfwkPackage.MEASURE__SETS_PERFORMANCE_CRITERIA_FOR_OBJECTIVES);
		}
		return isTrackedAgainstMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective getDecomposesObjective() {
		if (decomposesObjective != null && decomposesObjective.eIsProxy()) {
			InternalEObject oldDecomposesObjective = (InternalEObject)decomposesObjective;
			decomposesObjective = (Objective)eResolveProxy(oldDecomposesObjective);
			if (decomposesObjective != oldDecomposesObjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE, oldDecomposesObjective, decomposesObjective));
			}
		}
		return decomposesObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective basicGetDecomposesObjective() {
		return decomposesObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesObjective(Objective newDecomposesObjective) {
		Objective oldDecomposesObjective = decomposesObjective;
		decomposesObjective = newDecomposesObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE, oldDecomposesObjective, decomposesObjective));
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
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizesGoals()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsTrackedAgainstMeasures()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				return ((InternalEList<?>)getRealizesGoals()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				return ((InternalEList<?>)getIsTrackedAgainstMeasures()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				return getRealizesGoals();
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				return getIsTrackedAgainstMeasures();
			case ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE:
				if (resolve) return getDecomposesObjective();
				return basicGetDecomposesObjective();
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
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				getRealizesGoals().clear();
				getRealizesGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				getIsTrackedAgainstMeasures().clear();
				getIsTrackedAgainstMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE:
				setDecomposesObjective((Objective)newValue);
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
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				getRealizesGoals().clear();
				return;
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				getIsTrackedAgainstMeasures().clear();
				return;
			case ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE:
				setDecomposesObjective((Objective)null);
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
			case ContentfwkPackage.OBJECTIVE__REALIZES_GOALS:
				return realizesGoals != null && !realizesGoals.isEmpty();
			case ContentfwkPackage.OBJECTIVE__IS_TRACKED_AGAINST_MEASURES:
				return isTrackedAgainstMeasures != null && !isTrackedAgainstMeasures.isEmpty();
			case ContentfwkPackage.OBJECTIVE__DECOMPOSES_OBJECTIVE:
				return decomposesObjective != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectiveImpl
