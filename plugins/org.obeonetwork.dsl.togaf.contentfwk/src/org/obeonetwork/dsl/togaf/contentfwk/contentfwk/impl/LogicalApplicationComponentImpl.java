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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Application Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getStandardClass <em>Standard Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getStandardCreationDate <em>Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getLastStandardCreationDate <em>Last Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getNextStandardCreationDate <em>Next Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getRetireDate <em>Retire Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getImplementsServices <em>Implements Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getOperatesOnDataEntities <em>Operates On Data Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getIsExtendedByPhysicalApplicationComponents <em>Is Extended By Physical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getCommunicatesWith <em>Communicates With</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getDecomposesLogicalApplicationComponent <em>Decomposes Logical Application Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalApplicationComponentImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalApplicationComponentImpl extends ElementImpl implements LogicalApplicationComponent {
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
	 * The cached value of the '{@link #getImplementsServices() <em>Implements Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> implementsServices;

	/**
	 * The cached value of the '{@link #getOperatesOnDataEntities() <em>Operates On Data Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatesOnDataEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<DataEntity> operatesOnDataEntities;

	/**
	 * The cached value of the '{@link #getIsExtendedByPhysicalApplicationComponents() <em>Is Extended By Physical Application Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtendedByPhysicalApplicationComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalApplicationComponent> isExtendedByPhysicalApplicationComponents;

	/**
	 * The cached value of the '{@link #getCommunicatesWith() <em>Communicates With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicatesWith()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalApplicationComponent> communicatesWith;

	/**
	 * The cached value of the '{@link #getDecomposesLogicalApplicationComponent() <em>Decomposes Logical Application Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesLogicalApplicationComponent()
	 * @generated
	 * @ordered
	 */
	protected LogicalApplicationComponent decomposesLogicalApplicationComponent;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected EObject any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalApplicationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.LOGICAL_APPLICATION_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CLASS, oldStandardClass, standardClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE, oldStandardCreationDate, standardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE, oldLastStandardCreationDate, lastStandardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE, oldNextStandardCreationDate, nextStandardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE, oldRetireDate, retireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getImplementsServices() {
		if (implementsServices == null) {
			implementsServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES, ContentfwkPackage.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT);
		}
		return implementsServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataEntity> getOperatesOnDataEntities() {
		if (operatesOnDataEntities == null) {
			operatesOnDataEntities = new EObjectWithInverseResolvingEList.ManyInverse<DataEntity>(DataEntity.class, this, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES, ContentfwkPackage.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS);
		}
		return operatesOnDataEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalApplicationComponent> getIsExtendedByPhysicalApplicationComponents() {
		if (isExtendedByPhysicalApplicationComponents == null) {
			isExtendedByPhysicalApplicationComponents = new EObjectWithInverseResolvingEList.ManyInverse<PhysicalApplicationComponent>(PhysicalApplicationComponent.class, this, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS);
		}
		return isExtendedByPhysicalApplicationComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalApplicationComponent> getCommunicatesWith() {
		if (communicatesWith == null) {
			communicatesWith = new EObjectResolvingEList<LogicalApplicationComponent>(LogicalApplicationComponent.class, this, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH);
		}
		return communicatesWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalApplicationComponent getDecomposesLogicalApplicationComponent() {
		if (decomposesLogicalApplicationComponent != null && decomposesLogicalApplicationComponent.eIsProxy()) {
			InternalEObject oldDecomposesLogicalApplicationComponent = (InternalEObject)decomposesLogicalApplicationComponent;
			decomposesLogicalApplicationComponent = (LogicalApplicationComponent)eResolveProxy(oldDecomposesLogicalApplicationComponent);
			if (decomposesLogicalApplicationComponent != oldDecomposesLogicalApplicationComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT, oldDecomposesLogicalApplicationComponent, decomposesLogicalApplicationComponent));
			}
		}
		return decomposesLogicalApplicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalApplicationComponent basicGetDecomposesLogicalApplicationComponent() {
		return decomposesLogicalApplicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesLogicalApplicationComponent(LogicalApplicationComponent newDecomposesLogicalApplicationComponent) {
		LogicalApplicationComponent oldDecomposesLogicalApplicationComponent = decomposesLogicalApplicationComponent;
		decomposesLogicalApplicationComponent = newDecomposesLogicalApplicationComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT, oldDecomposesLogicalApplicationComponent, decomposesLogicalApplicationComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAny() {
		if (any != null && any.eIsProxy()) {
			InternalEObject oldAny = (InternalEObject)any;
			any = eResolveProxy(oldAny);
			if (any != oldAny) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__ANY, oldAny, any));
			}
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetAny() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(EObject newAny) {
		EObject oldAny = any;
		any = newAny;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__ANY, oldAny, any));
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
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementsServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatesOnDataEntities()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsExtendedByPhysicalApplicationComponents()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES:
				return ((InternalEList<?>)getImplementsServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES:
				return ((InternalEList<?>)getOperatesOnDataEntities()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<?>)getIsExtendedByPhysicalApplicationComponents()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CLASS:
				return getStandardClass();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
				return getStandardCreationDate();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return getLastStandardCreationDate();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return getNextStandardCreationDate();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE:
				return getRetireDate();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES:
				return getImplementsServices();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES:
				return getOperatesOnDataEntities();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS:
				return getIsExtendedByPhysicalApplicationComponents();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH:
				return getCommunicatesWith();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT:
				if (resolve) return getDecomposesLogicalApplicationComponent();
				return basicGetDecomposesLogicalApplicationComponent();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__ANY:
				if (resolve) return getAny();
				return basicGetAny();
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
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CLASS:
				setStandardClass((StandardsClass)newValue);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
				setStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE:
				setRetireDate((Date)newValue);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES:
				getImplementsServices().clear();
				getImplementsServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES:
				getOperatesOnDataEntities().clear();
				getOperatesOnDataEntities().addAll((Collection<? extends DataEntity>)newValue);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS:
				getIsExtendedByPhysicalApplicationComponents().clear();
				getIsExtendedByPhysicalApplicationComponents().addAll((Collection<? extends PhysicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH:
				getCommunicatesWith().clear();
				getCommunicatesWith().addAll((Collection<? extends LogicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT:
				setDecomposesLogicalApplicationComponent((LogicalApplicationComponent)newValue);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__ANY:
				setAny((EObject)newValue);
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
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CLASS:
				setStandardClass(STANDARD_CLASS_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
				setStandardCreationDate(STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate(LAST_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate(NEXT_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE:
				setRetireDate(RETIRE_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES:
				getImplementsServices().clear();
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES:
				getOperatesOnDataEntities().clear();
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS:
				getIsExtendedByPhysicalApplicationComponents().clear();
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH:
				getCommunicatesWith().clear();
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT:
				setDecomposesLogicalApplicationComponent((LogicalApplicationComponent)null);
				return;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__ANY:
				setAny((EObject)null);
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
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CLASS:
				return standardClass != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? standardCreationDate != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(standardCreationDate);
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? lastStandardCreationDate != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(lastStandardCreationDate);
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? nextStandardCreationDate != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(nextStandardCreationDate);
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? retireDate != null : !RETIRE_DATE_EDEFAULT.equals(retireDate);
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES:
				return implementsServices != null && !implementsServices.isEmpty();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES:
				return operatesOnDataEntities != null && !operatesOnDataEntities.isEmpty();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS:
				return isExtendedByPhysicalApplicationComponents != null && !isExtendedByPhysicalApplicationComponents.isEmpty();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH:
				return communicatesWith != null && !communicatesWith.isEmpty();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT:
				return decomposesLogicalApplicationComponent != null;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__ANY:
				return any != null;
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
				case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CLASS: return ContentfwkPackage.STANDARD__STANDARD_CLASS;
				case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE;
				case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE: return ContentfwkPackage.STANDARD__RETIRE_DATE;
				default: return -1;
			}
		}
		if (baseClass == ApplicationComponent.class) {
			switch (derivedFeatureID) {
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
				case ContentfwkPackage.STANDARD__STANDARD_CLASS: return ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CLASS;
				case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE: return ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__RETIRE_DATE: return ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE;
				default: return -1;
			}
		}
		if (baseClass == ApplicationComponent.class) {
			switch (baseFeatureID) {
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

} //LogicalApplicationComponentImpl
