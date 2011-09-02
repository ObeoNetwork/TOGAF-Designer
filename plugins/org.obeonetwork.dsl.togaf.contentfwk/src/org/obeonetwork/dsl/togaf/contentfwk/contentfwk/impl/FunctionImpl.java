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
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getLastStandardCreationDate <em>Last Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getNextStandardCreationDate <em>Next Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getRetireDate <em>Retire Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getIsPerformedByActors <em>Is Performed By Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getIsOwnedByUnit <em>Is Owned By Unit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getIsBoundedByServices <em>Is Bounded By Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getSupportsProcesses <em>Supports Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getIsRealizedByProcesses <em>Is Realized By Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getCanBeAccessedByRoles <em>Can Be Accessed By Roles</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getSupportsActors <em>Supports Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getDecomposesFunction <em>Decomposes Function</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.FunctionImpl#getCommunicatedWithFunctions <em>Communicated With Functions</em>}</li>
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
	 * The cached value of the '{@link #getStandardClass() <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardClass()
	 * @generated
	 * @ordered
	 */
	protected StandardsClass standardClass = STANDARD_CLASS_EDEFAULT;

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
	 * The cached value of the '{@link #getStandardCreationDate() <em>Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date standardCreationDate = STANDARD_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastStandardCreationDate() <em>Last Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_STANDARD_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastStandardCreationDate() <em>Last Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastStandardCreationDate = LAST_STANDARD_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextStandardCreationDate() <em>Next Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NEXT_STANDARD_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextStandardCreationDate() <em>Next Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date nextStandardCreationDate = NEXT_STANDARD_CREATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getRetireDate() <em>Retire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetireDate()
	 * @generated
	 * @ordered
	 */
	protected Date retireDate = RETIRE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsPerformedByActors() <em>Is Performed By Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPerformedByActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> isPerformedByActors;

	/**
	 * The cached value of the '{@link #getIsOwnedByUnit() <em>Is Owned By Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOwnedByUnit()
	 * @generated
	 * @ordered
	 */
	protected OrganizationUnit isOwnedByUnit;

	/**
	 * The cached value of the '{@link #getIsBoundedByServices() <em>Is Bounded By Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBoundedByServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> isBoundedByServices;

	/**
	 * The cached value of the '{@link #getSupportsProcesses() <em>Supports Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> supportsProcesses;

	/**
	 * The cached value of the '{@link #getIsRealizedByProcesses() <em>Is Realized By Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRealizedByProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> isRealizedByProcesses;

	/**
	 * The cached value of the '{@link #getCanBeAccessedByRoles() <em>Can Be Accessed By Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanBeAccessedByRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> canBeAccessedByRoles;

	/**
	 * The cached value of the '{@link #getSupportsActors() <em>Supports Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> supportsActors;

	/**
	 * The cached value of the '{@link #getDecomposesFunction() <em>Decomposes Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesFunction()
	 * @generated
	 * @ordered
	 */
	protected Function decomposesFunction;

	/**
	 * The cached value of the '{@link #getCommunicatedWithFunctions() <em>Communicated With Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicatedWithFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> communicatedWithFunctions;

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
		return standardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		StandardsClass oldStandardClass = standardClass;
		standardClass = newStandardClass == null ? STANDARD_CLASS_EDEFAULT : newStandardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.FUNCTION__STANDARD_CLASS, oldStandardClass, standardClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return standardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		Date oldStandardCreationDate = standardCreationDate;
		standardCreationDate = newStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.FUNCTION__STANDARD_CREATION_DATE, oldStandardCreationDate, standardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardCreationDate() {
		return lastStandardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardCreationDate(Date newLastStandardCreationDate) {
		Date oldLastStandardCreationDate = lastStandardCreationDate;
		lastStandardCreationDate = newLastStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.FUNCTION__LAST_STANDARD_CREATION_DATE, oldLastStandardCreationDate, lastStandardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardCreationDate() {
		return nextStandardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardCreationDate(Date newNextStandardCreationDate) {
		Date oldNextStandardCreationDate = nextStandardCreationDate;
		nextStandardCreationDate = newNextStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.FUNCTION__NEXT_STANDARD_CREATION_DATE, oldNextStandardCreationDate, nextStandardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return retireDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		Date oldRetireDate = retireDate;
		retireDate = newRetireDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.FUNCTION__RETIRE_DATE, oldRetireDate, retireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getIsPerformedByActors() {
		if (isPerformedByActors == null) {
			isPerformedByActors = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS, ContentfwkPackage.ACTOR__PERFORMS_FUNCTIONS);
		}
		return isPerformedByActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit getIsOwnedByUnit() {
		if (isOwnedByUnit != null && isOwnedByUnit.eIsProxy()) {
			InternalEObject oldIsOwnedByUnit = (InternalEObject)isOwnedByUnit;
			isOwnedByUnit = (OrganizationUnit)eResolveProxy(oldIsOwnedByUnit);
			if (isOwnedByUnit != oldIsOwnedByUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.FUNCTION__IS_OWNED_BY_UNIT, oldIsOwnedByUnit, isOwnedByUnit));
			}
		}
		return isOwnedByUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit basicGetIsOwnedByUnit() {
		return isOwnedByUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsOwnedByUnit(OrganizationUnit newIsOwnedByUnit, NotificationChain msgs) {
		OrganizationUnit oldIsOwnedByUnit = isOwnedByUnit;
		isOwnedByUnit = newIsOwnedByUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentfwkPackage.FUNCTION__IS_OWNED_BY_UNIT, oldIsOwnedByUnit, newIsOwnedByUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOwnedByUnit(OrganizationUnit newIsOwnedByUnit) {
		if (newIsOwnedByUnit != isOwnedByUnit) {
			NotificationChain msgs = null;
			if (isOwnedByUnit != null)
				msgs = ((InternalEObject)isOwnedByUnit).eInverseRemove(this, ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS, OrganizationUnit.class, msgs);
			if (newIsOwnedByUnit != null)
				msgs = ((InternalEObject)newIsOwnedByUnit).eInverseAdd(this, ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS, OrganizationUnit.class, msgs);
			msgs = basicSetIsOwnedByUnit(newIsOwnedByUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.FUNCTION__IS_OWNED_BY_UNIT, newIsOwnedByUnit, newIsOwnedByUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getIsBoundedByServices() {
		if (isBoundedByServices == null) {
			isBoundedByServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES, ContentfwkPackage.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS);
		}
		return isBoundedByServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getSupportsProcesses() {
		if (supportsProcesses == null) {
			supportsProcesses = new EObjectWithInverseResolvingEList.ManyInverse<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.FUNCTION__SUPPORTS_PROCESSES, ContentfwkPackage.PROCESS__DECOMPOSES_FUNCTIONS);
		}
		return supportsProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsRealizedByProcesses() {
		if (isRealizedByProcesses == null) {
			isRealizedByProcesses = new EObjectWithInverseResolvingEList.ManyInverse<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.FUNCTION__IS_REALIZED_BY_PROCESSES, ContentfwkPackage.PROCESS__ORCHESTRATES_FUNCTIONS);
		}
		return isRealizedByProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getCanBeAccessedByRoles() {
		if (canBeAccessedByRoles == null) {
			canBeAccessedByRoles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, ContentfwkPackage.FUNCTION__CAN_BE_ACCESSED_BY_ROLES, ContentfwkPackage.ROLE__ACCESSES_FUNCTIONS);
		}
		return canBeAccessedByRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getSupportsActors() {
		if (supportsActors == null) {
			supportsActors = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, ContentfwkPackage.FUNCTION__SUPPORTS_ACTORS, ContentfwkPackage.ACTOR__INTERACTS_WITH_FUNCTIONS);
		}
		return supportsActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getDecomposesFunction() {
		if (decomposesFunction != null && decomposesFunction.eIsProxy()) {
			InternalEObject oldDecomposesFunction = (InternalEObject)decomposesFunction;
			decomposesFunction = (Function)eResolveProxy(oldDecomposesFunction);
			if (decomposesFunction != oldDecomposesFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION, oldDecomposesFunction, decomposesFunction));
			}
		}
		return decomposesFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetDecomposesFunction() {
		return decomposesFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesFunction(Function newDecomposesFunction) {
		Function oldDecomposesFunction = decomposesFunction;
		decomposesFunction = newDecomposesFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION, oldDecomposesFunction, decomposesFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getCommunicatedWithFunctions() {
		if (communicatedWithFunctions == null) {
			communicatedWithFunctions = new EObjectResolvingEList<Function>(Function.class, this, ContentfwkPackage.FUNCTION__COMMUNICATED_WITH_FUNCTIONS);
		}
		return communicatedWithFunctions;
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
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_UNIT:
				if (isOwnedByUnit != null)
					msgs = ((InternalEObject)isOwnedByUnit).eInverseRemove(this, ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS, OrganizationUnit.class, msgs);
				return basicSetIsOwnedByUnit((OrganizationUnit)otherEnd, msgs);
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
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_UNIT:
				return basicSetIsOwnedByUnit(null, msgs);
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
			case ContentfwkPackage.FUNCTION__LAST_STANDARD_CREATION_DATE:
				return getLastStandardCreationDate();
			case ContentfwkPackage.FUNCTION__NEXT_STANDARD_CREATION_DATE:
				return getNextStandardCreationDate();
			case ContentfwkPackage.FUNCTION__RETIRE_DATE:
				return getRetireDate();
			case ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS:
				return getIsPerformedByActors();
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_UNIT:
				if (resolve) return getIsOwnedByUnit();
				return basicGetIsOwnedByUnit();
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
			case ContentfwkPackage.FUNCTION__COMMUNICATED_WITH_FUNCTIONS:
				return getCommunicatedWithFunctions();
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
			case ContentfwkPackage.FUNCTION__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.FUNCTION__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.FUNCTION__RETIRE_DATE:
				setRetireDate((Date)newValue);
				return;
			case ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS:
				getIsPerformedByActors().clear();
				getIsPerformedByActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_UNIT:
				setIsOwnedByUnit((OrganizationUnit)newValue);
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
			case ContentfwkPackage.FUNCTION__COMMUNICATED_WITH_FUNCTIONS:
				getCommunicatedWithFunctions().clear();
				getCommunicatedWithFunctions().addAll((Collection<? extends Function>)newValue);
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
			case ContentfwkPackage.FUNCTION__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate(LAST_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.FUNCTION__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate(NEXT_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.FUNCTION__RETIRE_DATE:
				setRetireDate(RETIRE_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS:
				getIsPerformedByActors().clear();
				return;
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_UNIT:
				setIsOwnedByUnit((OrganizationUnit)null);
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
			case ContentfwkPackage.FUNCTION__COMMUNICATED_WITH_FUNCTIONS:
				getCommunicatedWithFunctions().clear();
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
				return standardClass != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.FUNCTION__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? standardCreationDate != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(standardCreationDate);
			case ContentfwkPackage.FUNCTION__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? lastStandardCreationDate != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(lastStandardCreationDate);
			case ContentfwkPackage.FUNCTION__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? nextStandardCreationDate != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(nextStandardCreationDate);
			case ContentfwkPackage.FUNCTION__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? retireDate != null : !RETIRE_DATE_EDEFAULT.equals(retireDate);
			case ContentfwkPackage.FUNCTION__IS_PERFORMED_BY_ACTORS:
				return isPerformedByActors != null && !isPerformedByActors.isEmpty();
			case ContentfwkPackage.FUNCTION__IS_OWNED_BY_UNIT:
				return isOwnedByUnit != null;
			case ContentfwkPackage.FUNCTION__IS_BOUNDED_BY_SERVICES:
				return isBoundedByServices != null && !isBoundedByServices.isEmpty();
			case ContentfwkPackage.FUNCTION__SUPPORTS_PROCESSES:
				return supportsProcesses != null && !supportsProcesses.isEmpty();
			case ContentfwkPackage.FUNCTION__IS_REALIZED_BY_PROCESSES:
				return isRealizedByProcesses != null && !isRealizedByProcesses.isEmpty();
			case ContentfwkPackage.FUNCTION__CAN_BE_ACCESSED_BY_ROLES:
				return canBeAccessedByRoles != null && !canBeAccessedByRoles.isEmpty();
			case ContentfwkPackage.FUNCTION__SUPPORTS_ACTORS:
				return supportsActors != null && !supportsActors.isEmpty();
			case ContentfwkPackage.FUNCTION__DECOMPOSES_FUNCTION:
				return decomposesFunction != null;
			case ContentfwkPackage.FUNCTION__COMMUNICATED_WITH_FUNCTIONS:
				return communicatedWithFunctions != null && !communicatedWithFunctions.isEmpty();
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
				case ContentfwkPackage.FUNCTION__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.FUNCTION__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE;
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
				case ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.FUNCTION__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.FUNCTION__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__RETIRE_DATE: return ContentfwkPackage.FUNCTION__RETIRE_DATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (standardClass: ");
		result.append(standardClass);
		result.append(", standardCreationDate: ");
		result.append(standardCreationDate);
		result.append(", lastStandardCreationDate: ");
		result.append(lastStandardCreationDate);
		result.append(", nextStandardCreationDate: ");
		result.append(nextStandardCreationDate);
		result.append(", retireDate: ");
		result.append(retireDate);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
