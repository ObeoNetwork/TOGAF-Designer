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

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Technology Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getStandardClass <em>Standard Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getStandardCreationDate <em>Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getLastStandardCreationDate <em>Last Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getNextStandardCreationDate <em>Next Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getRetireDate <em>Retire Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getProvidesPlatformForServices <em>Provides Platform For Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getSuppliesPlatformServices <em>Supplies Platform Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getIsRealizedByPhysicalTechnologyComponents <em>Is Realized By Physical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getDecomposesLogicalTechnologyComponent <em>Decomposes Logical Technology Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getIsDependentOnLogicalTechnologyComponents <em>Is Dependent On Logical Technology Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalTechnologyComponentImpl extends ElementImpl implements LogicalTechnologyComponent {
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
	 * The cached value of the '{@link #getProvidesPlatformForServices() <em>Provides Platform For Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesPlatformForServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> providesPlatformForServices;

	/**
	 * The cached value of the '{@link #getSuppliesPlatformServices() <em>Supplies Platform Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliesPlatformServices()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformService> suppliesPlatformServices;

	/**
	 * The cached value of the '{@link #getIsRealizedByPhysicalTechnologyComponents() <em>Is Realized By Physical Technology Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRealizedByPhysicalTechnologyComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalTechnologyComponent> isRealizedByPhysicalTechnologyComponents;

	/**
	 * The cached value of the '{@link #getDecomposesLogicalTechnologyComponent() <em>Decomposes Logical Technology Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesLogicalTechnologyComponent()
	 * @generated
	 * @ordered
	 */
	protected LogicalTechnologyComponent decomposesLogicalTechnologyComponent;

	/**
	 * The cached value of the '{@link #getIsDependentOnLogicalTechnologyComponents() <em>Is Dependent On Logical Technology Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDependentOnLogicalTechnologyComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalTechnologyComponent> isDependentOnLogicalTechnologyComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalTechnologyComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS, oldStandardClass, standardClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE, oldStandardCreationDate, standardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE, oldLastStandardCreationDate, lastStandardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE, oldNextStandardCreationDate, nextStandardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE, oldRetireDate, retireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getProvidesPlatformForServices() {
		if (providesPlatformForServices == null) {
			providesPlatformForServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES, ContentfwkPackage.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS);
		}
		return providesPlatformForServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformService> getSuppliesPlatformServices() {
		if (suppliesPlatformServices == null) {
			suppliesPlatformServices = new EObjectWithInverseResolvingEList.ManyInverse<PlatformService>(PlatformService.class, this, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES, ContentfwkPackage.PLATFORM_SERVICE__IS_SUPPLIED_BY_LOGICAL_TECHNOLOGY_COMPONENTS);
		}
		return suppliesPlatformServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalTechnologyComponent> getIsRealizedByPhysicalTechnologyComponents() {
		if (isRealizedByPhysicalTechnologyComponents == null) {
			isRealizedByPhysicalTechnologyComponents = new EObjectWithInverseResolvingEList.ManyInverse<PhysicalTechnologyComponent>(PhysicalTechnologyComponent.class, this, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS);
		}
		return isRealizedByPhysicalTechnologyComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalTechnologyComponent getDecomposesLogicalTechnologyComponent() {
		if (decomposesLogicalTechnologyComponent != null && decomposesLogicalTechnologyComponent.eIsProxy()) {
			InternalEObject oldDecomposesLogicalTechnologyComponent = (InternalEObject)decomposesLogicalTechnologyComponent;
			decomposesLogicalTechnologyComponent = (LogicalTechnologyComponent)eResolveProxy(oldDecomposesLogicalTechnologyComponent);
			if (decomposesLogicalTechnologyComponent != oldDecomposesLogicalTechnologyComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT, oldDecomposesLogicalTechnologyComponent, decomposesLogicalTechnologyComponent));
			}
		}
		return decomposesLogicalTechnologyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalTechnologyComponent basicGetDecomposesLogicalTechnologyComponent() {
		return decomposesLogicalTechnologyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesLogicalTechnologyComponent(LogicalTechnologyComponent newDecomposesLogicalTechnologyComponent) {
		LogicalTechnologyComponent oldDecomposesLogicalTechnologyComponent = decomposesLogicalTechnologyComponent;
		decomposesLogicalTechnologyComponent = newDecomposesLogicalTechnologyComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT, oldDecomposesLogicalTechnologyComponent, decomposesLogicalTechnologyComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalTechnologyComponent> getIsDependentOnLogicalTechnologyComponents() {
		if (isDependentOnLogicalTechnologyComponents == null) {
			isDependentOnLogicalTechnologyComponents = new EObjectResolvingEList<LogicalTechnologyComponent>(LogicalTechnologyComponent.class, this, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS);
		}
		return isDependentOnLogicalTechnologyComponents;
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidesPlatformForServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuppliesPlatformServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRealizedByPhysicalTechnologyComponents()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES:
				return ((InternalEList<?>)getProvidesPlatformForServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES:
				return ((InternalEList<?>)getSuppliesPlatformServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getIsRealizedByPhysicalTechnologyComponents()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				return getStandardClass();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE:
				return getStandardCreationDate();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return getLastStandardCreationDate();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return getNextStandardCreationDate();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE:
				return getRetireDate();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES:
				return getProvidesPlatformForServices();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES:
				return getSuppliesPlatformServices();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return getIsRealizedByPhysicalTechnologyComponents();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT:
				if (resolve) return getDecomposesLogicalTechnologyComponent();
				return basicGetDecomposesLogicalTechnologyComponent();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return getIsDependentOnLogicalTechnologyComponents();
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				setStandardClass((StandardsClass)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE:
				setStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE:
				setRetireDate((Date)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES:
				getProvidesPlatformForServices().clear();
				getProvidesPlatformForServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES:
				getSuppliesPlatformServices().clear();
				getSuppliesPlatformServices().addAll((Collection<? extends PlatformService>)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				getIsRealizedByPhysicalTechnologyComponents().clear();
				getIsRealizedByPhysicalTechnologyComponents().addAll((Collection<? extends PhysicalTechnologyComponent>)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT:
				setDecomposesLogicalTechnologyComponent((LogicalTechnologyComponent)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				getIsDependentOnLogicalTechnologyComponents().clear();
				getIsDependentOnLogicalTechnologyComponents().addAll((Collection<? extends LogicalTechnologyComponent>)newValue);
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				setStandardClass(STANDARD_CLASS_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE:
				setStandardCreationDate(STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate(LAST_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate(NEXT_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE:
				setRetireDate(RETIRE_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES:
				getProvidesPlatformForServices().clear();
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES:
				getSuppliesPlatformServices().clear();
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				getIsRealizedByPhysicalTechnologyComponents().clear();
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT:
				setDecomposesLogicalTechnologyComponent((LogicalTechnologyComponent)null);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				getIsDependentOnLogicalTechnologyComponents().clear();
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				return standardClass != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? standardCreationDate != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(standardCreationDate);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? lastStandardCreationDate != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(lastStandardCreationDate);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? nextStandardCreationDate != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(nextStandardCreationDate);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? retireDate != null : !RETIRE_DATE_EDEFAULT.equals(retireDate);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES:
				return providesPlatformForServices != null && !providesPlatformForServices.isEmpty();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES:
				return suppliesPlatformServices != null && !suppliesPlatformServices.isEmpty();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return isRealizedByPhysicalTechnologyComponents != null && !isRealizedByPhysicalTechnologyComponents.isEmpty();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT:
				return decomposesLogicalTechnologyComponent != null;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return isDependentOnLogicalTechnologyComponents != null && !isDependentOnLogicalTechnologyComponents.isEmpty();
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
				case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS: return ContentfwkPackage.STANDARD__STANDARD_CLASS;
				case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE;
				case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE: return ContentfwkPackage.STANDARD__RETIRE_DATE;
				default: return -1;
			}
		}
		if (baseClass == TechnologyComponent.class) {
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
				case ContentfwkPackage.STANDARD__STANDARD_CLASS: return ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS;
				case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE: return ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__RETIRE_DATE: return ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE;
				default: return -1;
			}
		}
		if (baseClass == TechnologyComponent.class) {
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

} //LogicalTechnologyComponentImpl
