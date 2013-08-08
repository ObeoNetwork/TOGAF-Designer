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
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getStandardClass <em>Standard Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getStandardCreationDate <em>Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getLastStandardReviewDate <em>Last Standard Review Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getNextStandardReviewDate <em>Next Standard Review Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getRetireDate <em>Retire Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getIsPerformedByActors <em>Is Performed By Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getIsOwnedByOrganizationUnit <em>Is Owned By Organization Unit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getIsBoundedByServices <em>Is Bounded By Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getSupportsProcesses <em>Supports Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getIsRealizedByProcesses <em>Is Realized By Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getCanBeAccessedByRoles <em>Can Be Accessed By Roles</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getSupportsActors <em>Supports Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getDecomposesFunction <em>Decomposes Function</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getCommunicatesWithFunctions <em>Communicates With Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getIsDecomposedByFunctions <em>Is Decomposed By Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends ElementImpl implements Function {
	/**
	 * The default value of the '{@link #getStandardClass() <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardClass()
	 * @generated
	 * @ordered
	 */
	protected static final StandardsClass STANDARD_CLASS_EDEFAULT = StandardsClass.NON_STANDARD;
	/**
	 * The default value of the '{@link #getStandardCreationDate() <em>Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STANDARD_CREATION_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLastStandardReviewDate() <em>Last Standard Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStandardReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_STANDARD_REVIEW_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNextStandardReviewDate() <em>Next Standard Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NEXT_STANDARD_REVIEW_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRetireDate() <em>Retire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetireDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RETIRE_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardsClass getStandardClass() {
		return (StandardsClass)eDynamicGet(ContentfwkPackage.FUNCTION__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eDynamicSet(ContentfwkPackage.FUNCTION__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.FUNCTION__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.FUNCTION__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, newStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardReviewDate() {
		return (Date)eDynamicGet(ContentfwkPackage.FUNCTION__LAST_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_REVIEW_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardReviewDate(Date newLastStandardReviewDate) {
		eDynamicSet(ContentfwkPackage.FUNCTION__LAST_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_REVIEW_DATE, newLastStandardReviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardReviewDate() {
		return (Date)eDynamicGet(ContentfwkPackage.FUNCTION__NEXT_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_REVIEW_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardReviewDate(Date newNextStandardReviewDate) {
		eDynamicSet(ContentfwkPackage.FUNCTION__NEXT_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_REVIEW_DATE, newNextStandardReviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return (Date)eDynamicGet(ContentfwkPackage.FUNCTION__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		eDynamicSet(ContentfwkPackage.FUNCTION__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, newRetireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getIsPerformedByActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS, ContentfwkPackage.Literals.FUNCTION__IS_PERFORMED_BY_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit getIsOwnedByOrganizationUnit() {
		return (OrganizationUnit)eDynamicGet(ContentfwkPackage.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT, ContentfwkPackage.Literals.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit basicGetIsOwnedByOrganizationUnit() {
		return (OrganizationUnit)eDynamicGet(ContentfwkPackage.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT, ContentfwkPackage.Literals.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsOwnedByOrganizationUnit(OrganizationUnit newIsOwnedByOrganizationUnit, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newIsOwnedByOrganizationUnit, ContentfwkPackage.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOwnedByOrganizationUnit(OrganizationUnit newIsOwnedByOrganizationUnit) {
		eDynamicSet(ContentfwkPackage.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT, ContentfwkPackage.Literals.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT, newIsOwnedByOrganizationUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getIsBoundedByServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES, ContentfwkPackage.Literals.FUNCTION__IS_BOUNDED_BY_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getSupportsProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.FUNCTION__SUPPORTS_PROCESSES, ContentfwkPackage.Literals.FUNCTION__SUPPORTS_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsRealizedByProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.FUNCTION__IS_REALIZED_BY_PROCESSES, ContentfwkPackage.Literals.FUNCTION__IS_REALIZED_BY_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getCanBeAccessedByRoles() {
		return (EList<Role>)eDynamicGet(ContentfwkPackage.FUNCTION__CAN_BE_ACCESSED_BY_ROLES, ContentfwkPackage.Literals.FUNCTION__CAN_BE_ACCESSED_BY_ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getSupportsActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.FUNCTION__SUPPORTS_ACTORS, ContentfwkPackage.Literals.FUNCTION__SUPPORTS_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getDecomposesFunction() {
		return (Function)eDynamicGet(ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION, ContentfwkPackage.Literals.FUNCTION__DECOMPOSES_FUNCTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetDecomposesFunction() {
		return (Function)eDynamicGet(ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION, ContentfwkPackage.Literals.FUNCTION__DECOMPOSES_FUNCTION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecomposesFunction(Function newDecomposesFunction, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDecomposesFunction, ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesFunction(Function newDecomposesFunction) {
		eDynamicSet(ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION, ContentfwkPackage.Literals.FUNCTION__DECOMPOSES_FUNCTION, newDecomposesFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getCommunicatesWithFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.FUNCTION__COMMUNICATES_WITH_FUNCTIONS, ContentfwkPackage.Literals.FUNCTION__COMMUNICATES_WITH_FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getIsDecomposedByFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.FUNCTION__IS_DECOMPOSED_BY_FUNCTIONS, ContentfwkPackage.Literals.FUNCTION__IS_DECOMPOSED_BY_FUNCTIONS, true, true);
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
			case ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsPerformedByActors()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT:
				OrganizationUnit isOwnedByOrganizationUnit = basicGetIsOwnedByOrganizationUnit();
				if (isOwnedByOrganizationUnit != null)
					msgs = ((InternalEObject)isOwnedByOrganizationUnit).eInverseRemove(this, ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS, OrganizationUnit.class, msgs);
				return basicSetIsOwnedByOrganizationUnit((OrganizationUnit)otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsBoundedByServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__SUPPORTS_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportsProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__IS_REALIZED_BY_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRealizedByProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__CAN_BE_ACCESSED_BY_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCanBeAccessedByRoles()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__SUPPORTS_ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportsActors()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION:
				Function decomposesFunction = basicGetDecomposesFunction();
				if (decomposesFunction != null)
					msgs = ((InternalEObject)decomposesFunction).eInverseRemove(this, ContentfwkPackage.FUNCTION__IS_DECOMPOSED_BY_FUNCTIONS, Function.class, msgs);
				return basicSetDecomposesFunction((Function)otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__IS_DECOMPOSED_BY_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDecomposedByFunctions()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS:
				return ((InternalEList<?>)getIsPerformedByActors()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT:
				return basicSetIsOwnedByOrganizationUnit(null, msgs);
			case ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES:
				return ((InternalEList<?>)getIsBoundedByServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__SUPPORTS_PROCESSES:
				return ((InternalEList<?>)getSupportsProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__IS_REALIZED_BY_PROCESSES:
				return ((InternalEList<?>)getIsRealizedByProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__CAN_BE_ACCESSED_BY_ROLES:
				return ((InternalEList<?>)getCanBeAccessedByRoles()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__SUPPORTS_ACTORS:
				return ((InternalEList<?>)getSupportsActors()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION:
				return basicSetDecomposesFunction(null, msgs);
			case ContentfwkPackage.FUNCTION__IS_DECOMPOSED_BY_FUNCTIONS:
				return ((InternalEList<?>)getIsDecomposedByFunctions()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.FUNCTION__STANDARD_CLASS:
				return getStandardClass();
			case ContentfwkPackage.FUNCTION__STANDARD_CREATION_DATE:
				return getStandardCreationDate();
			case ContentfwkPackage.FUNCTION__LAST_STANDARD_REVIEW_DATE:
				return getLastStandardReviewDate();
			case ContentfwkPackage.FUNCTION__NEXT_STANDARD_REVIEW_DATE:
				return getNextStandardReviewDate();
			case ContentfwkPackage.FUNCTION__RETIRE_DATE:
				return getRetireDate();
			case ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS:
				return getIsPerformedByActors();
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT:
				if (resolve) return getIsOwnedByOrganizationUnit();
				return basicGetIsOwnedByOrganizationUnit();
			case ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES:
				return getIsBoundedByServices();
			case ContentfwkPackage.FUNCTION__SUPPORTS_PROCESSES:
				return getSupportsProcesses();
			case ContentfwkPackage.FUNCTION__IS_REALIZED_BY_PROCESSES:
				return getIsRealizedByProcesses();
			case ContentfwkPackage.FUNCTION__CAN_BE_ACCESSED_BY_ROLES:
				return getCanBeAccessedByRoles();
			case ContentfwkPackage.FUNCTION__SUPPORTS_ACTORS:
				return getSupportsActors();
			case ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION:
				if (resolve) return getDecomposesFunction();
				return basicGetDecomposesFunction();
			case ContentfwkPackage.FUNCTION__COMMUNICATES_WITH_FUNCTIONS:
				return getCommunicatesWithFunctions();
			case ContentfwkPackage.FUNCTION__IS_DECOMPOSED_BY_FUNCTIONS:
				return getIsDecomposedByFunctions();
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
			case ContentfwkPackage.FUNCTION__STANDARD_CLASS:
				setStandardClass((StandardsClass)newValue);
				return;
			case ContentfwkPackage.FUNCTION__STANDARD_CREATION_DATE:
				setStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.FUNCTION__LAST_STANDARD_REVIEW_DATE:
				setLastStandardReviewDate((Date)newValue);
				return;
			case ContentfwkPackage.FUNCTION__NEXT_STANDARD_REVIEW_DATE:
				setNextStandardReviewDate((Date)newValue);
				return;
			case ContentfwkPackage.FUNCTION__RETIRE_DATE:
				setRetireDate((Date)newValue);
				return;
			case ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS:
				getIsPerformedByActors().clear();
				getIsPerformedByActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT:
				setIsOwnedByOrganizationUnit((OrganizationUnit)newValue);
				return;
			case ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES:
				getIsBoundedByServices().clear();
				getIsBoundedByServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.FUNCTION__SUPPORTS_PROCESSES:
				getSupportsProcesses().clear();
				getSupportsProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.FUNCTION__IS_REALIZED_BY_PROCESSES:
				getIsRealizedByProcesses().clear();
				getIsRealizedByProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.FUNCTION__CAN_BE_ACCESSED_BY_ROLES:
				getCanBeAccessedByRoles().clear();
				getCanBeAccessedByRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ContentfwkPackage.FUNCTION__SUPPORTS_ACTORS:
				getSupportsActors().clear();
				getSupportsActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION:
				setDecomposesFunction((Function)newValue);
				return;
			case ContentfwkPackage.FUNCTION__COMMUNICATES_WITH_FUNCTIONS:
				getCommunicatesWithFunctions().clear();
				getCommunicatesWithFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ContentfwkPackage.FUNCTION__IS_DECOMPOSED_BY_FUNCTIONS:
				getIsDecomposedByFunctions().clear();
				getIsDecomposedByFunctions().addAll((Collection<? extends Function>)newValue);
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
			case ContentfwkPackage.FUNCTION__STANDARD_CLASS:
				setStandardClass(STANDARD_CLASS_EDEFAULT);
				return;
			case ContentfwkPackage.FUNCTION__STANDARD_CREATION_DATE:
				setStandardCreationDate(STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.FUNCTION__LAST_STANDARD_REVIEW_DATE:
				setLastStandardReviewDate(LAST_STANDARD_REVIEW_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.FUNCTION__NEXT_STANDARD_REVIEW_DATE:
				setNextStandardReviewDate(NEXT_STANDARD_REVIEW_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.FUNCTION__RETIRE_DATE:
				setRetireDate(RETIRE_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS:
				getIsPerformedByActors().clear();
				return;
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT:
				setIsOwnedByOrganizationUnit((OrganizationUnit)null);
				return;
			case ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES:
				getIsBoundedByServices().clear();
				return;
			case ContentfwkPackage.FUNCTION__SUPPORTS_PROCESSES:
				getSupportsProcesses().clear();
				return;
			case ContentfwkPackage.FUNCTION__IS_REALIZED_BY_PROCESSES:
				getIsRealizedByProcesses().clear();
				return;
			case ContentfwkPackage.FUNCTION__CAN_BE_ACCESSED_BY_ROLES:
				getCanBeAccessedByRoles().clear();
				return;
			case ContentfwkPackage.FUNCTION__SUPPORTS_ACTORS:
				getSupportsActors().clear();
				return;
			case ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION:
				setDecomposesFunction((Function)null);
				return;
			case ContentfwkPackage.FUNCTION__COMMUNICATES_WITH_FUNCTIONS:
				getCommunicatesWithFunctions().clear();
				return;
			case ContentfwkPackage.FUNCTION__IS_DECOMPOSED_BY_FUNCTIONS:
				getIsDecomposedByFunctions().clear();
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
			case ContentfwkPackage.FUNCTION__STANDARD_CLASS:
				return getStandardClass() != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.FUNCTION__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? getStandardCreationDate() != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(getStandardCreationDate());
			case ContentfwkPackage.FUNCTION__LAST_STANDARD_REVIEW_DATE:
				return LAST_STANDARD_REVIEW_DATE_EDEFAULT == null ? getLastStandardReviewDate() != null : !LAST_STANDARD_REVIEW_DATE_EDEFAULT.equals(getLastStandardReviewDate());
			case ContentfwkPackage.FUNCTION__NEXT_STANDARD_REVIEW_DATE:
				return NEXT_STANDARD_REVIEW_DATE_EDEFAULT == null ? getNextStandardReviewDate() != null : !NEXT_STANDARD_REVIEW_DATE_EDEFAULT.equals(getNextStandardReviewDate());
			case ContentfwkPackage.FUNCTION__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? getRetireDate() != null : !RETIRE_DATE_EDEFAULT.equals(getRetireDate());
			case ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS:
				return !getIsPerformedByActors().isEmpty();
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_ORGANIZATION_UNIT:
				return basicGetIsOwnedByOrganizationUnit() != null;
			case ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES:
				return !getIsBoundedByServices().isEmpty();
			case ContentfwkPackage.FUNCTION__SUPPORTS_PROCESSES:
				return !getSupportsProcesses().isEmpty();
			case ContentfwkPackage.FUNCTION__IS_REALIZED_BY_PROCESSES:
				return !getIsRealizedByProcesses().isEmpty();
			case ContentfwkPackage.FUNCTION__CAN_BE_ACCESSED_BY_ROLES:
				return !getCanBeAccessedByRoles().isEmpty();
			case ContentfwkPackage.FUNCTION__SUPPORTS_ACTORS:
				return !getSupportsActors().isEmpty();
			case ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION:
				return basicGetDecomposesFunction() != null;
			case ContentfwkPackage.FUNCTION__COMMUNICATES_WITH_FUNCTIONS:
				return !getCommunicatesWithFunctions().isEmpty();
			case ContentfwkPackage.FUNCTION__IS_DECOMPOSED_BY_FUNCTIONS:
				return !getIsDecomposedByFunctions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Standard.class) {
			switch (derivedFeatureID) {
				case ContentfwkPackage.FUNCTION__STANDARD_CLASS: return ContentfwkPackage.STANDARD__STANDARD_CLASS;
				case ContentfwkPackage.FUNCTION__STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE;
				case ContentfwkPackage.FUNCTION__LAST_STANDARD_REVIEW_DATE: return ContentfwkPackage.STANDARD__LAST_STANDARD_REVIEW_DATE;
				case ContentfwkPackage.FUNCTION__NEXT_STANDARD_REVIEW_DATE: return ContentfwkPackage.STANDARD__NEXT_STANDARD_REVIEW_DATE;
				case ContentfwkPackage.FUNCTION__RETIRE_DATE: return ContentfwkPackage.STANDARD__RETIRE_DATE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Standard.class) {
			switch (baseFeatureID) {
				case ContentfwkPackage.STANDARD__STANDARD_CLASS: return ContentfwkPackage.FUNCTION__STANDARD_CLASS;
				case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE: return ContentfwkPackage.FUNCTION__STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__LAST_STANDARD_REVIEW_DATE: return ContentfwkPackage.FUNCTION__LAST_STANDARD_REVIEW_DATE;
				case ContentfwkPackage.STANDARD__NEXT_STANDARD_REVIEW_DATE: return ContentfwkPackage.FUNCTION__NEXT_STANDARD_REVIEW_DATE;
				case ContentfwkPackage.STANDARD__RETIRE_DATE: return ContentfwkPackage.FUNCTION__RETIRE_DATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionImpl
