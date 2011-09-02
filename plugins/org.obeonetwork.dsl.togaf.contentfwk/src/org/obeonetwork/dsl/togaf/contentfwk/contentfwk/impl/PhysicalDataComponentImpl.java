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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Data Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl#getStandardClass <em>Standard Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl#getStandardCreationDate <em>Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl#getLastStandardCreationDate <em>Last Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl#getNextStandardCreationDate <em>Next Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl#getRetireDate <em>Retire Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl#getExtendsLogicalDataComponents <em>Extends Logical Data Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl#getIsHotedInLocation <em>Is Hoted In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl#getDecomposesPhysicalDataComponent <em>Decomposes Physical Data Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalDataComponentImpl#getEncapsulatesPhysicalApplicationComponents <em>Encapsulates Physical Application Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalDataComponentImpl extends ElementImpl implements PhysicalDataComponent {
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
	 * The cached value of the '{@link #getExtendsLogicalDataComponents() <em>Extends Logical Data Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsLogicalDataComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalDataComponent> extendsLogicalDataComponents;

	/**
	 * The cached value of the '{@link #getIsHotedInLocation() <em>Is Hoted In Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHotedInLocation()
	 * @generated
	 * @ordered
	 */
	protected Location isHotedInLocation;

	/**
	 * The cached value of the '{@link #getDecomposesPhysicalDataComponent() <em>Decomposes Physical Data Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesPhysicalDataComponent()
	 * @generated
	 * @ordered
	 */
	protected PhysicalDataComponent decomposesPhysicalDataComponent;

	/**
	 * The cached value of the '{@link #getEncapsulatesPhysicalApplicationComponents() <em>Encapsulates Physical Application Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatesPhysicalApplicationComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalApplicationComponent> encapsulatesPhysicalApplicationComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalDataComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CLASS, oldStandardClass, standardClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE, oldStandardCreationDate, standardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE, oldLastStandardCreationDate, lastStandardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE, oldNextStandardCreationDate, nextStandardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE, oldRetireDate, retireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalDataComponent> getExtendsLogicalDataComponents() {
		if (extendsLogicalDataComponents == null) {
			extendsLogicalDataComponents = new EObjectWithInverseResolvingEList.ManyInverse<LogicalDataComponent>(LogicalDataComponent.class, this, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS, ContentfwkPackage.LOGICAL_DATA_COMPONENT__IS_EXTENDED_BY_PHYSICAL_DATA_COMPONENTS);
		}
		return extendsLogicalDataComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getIsHotedInLocation() {
		if (isHotedInLocation != null && isHotedInLocation.eIsProxy()) {
			InternalEObject oldIsHotedInLocation = (InternalEObject)isHotedInLocation;
			isHotedInLocation = (Location)eResolveProxy(oldIsHotedInLocation);
			if (isHotedInLocation != oldIsHotedInLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION, oldIsHotedInLocation, isHotedInLocation));
			}
		}
		return isHotedInLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetIsHotedInLocation() {
		return isHotedInLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsHotedInLocation(Location newIsHotedInLocation, NotificationChain msgs) {
		Location oldIsHotedInLocation = isHotedInLocation;
		isHotedInLocation = newIsHotedInLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION, oldIsHotedInLocation, newIsHotedInLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHotedInLocation(Location newIsHotedInLocation) {
		if (newIsHotedInLocation != isHotedInLocation) {
			NotificationChain msgs = null;
			if (isHotedInLocation != null)
				msgs = ((InternalEObject)isHotedInLocation).eInverseRemove(this, ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS, Location.class, msgs);
			if (newIsHotedInLocation != null)
				msgs = ((InternalEObject)newIsHotedInLocation).eInverseAdd(this, ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS, Location.class, msgs);
			msgs = basicSetIsHotedInLocation(newIsHotedInLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION, newIsHotedInLocation, newIsHotedInLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDataComponent getDecomposesPhysicalDataComponent() {
		if (decomposesPhysicalDataComponent != null && decomposesPhysicalDataComponent.eIsProxy()) {
			InternalEObject oldDecomposesPhysicalDataComponent = (InternalEObject)decomposesPhysicalDataComponent;
			decomposesPhysicalDataComponent = (PhysicalDataComponent)eResolveProxy(oldDecomposesPhysicalDataComponent);
			if (decomposesPhysicalDataComponent != oldDecomposesPhysicalDataComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT, oldDecomposesPhysicalDataComponent, decomposesPhysicalDataComponent));
			}
		}
		return decomposesPhysicalDataComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDataComponent basicGetDecomposesPhysicalDataComponent() {
		return decomposesPhysicalDataComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesPhysicalDataComponent(PhysicalDataComponent newDecomposesPhysicalDataComponent) {
		PhysicalDataComponent oldDecomposesPhysicalDataComponent = decomposesPhysicalDataComponent;
		decomposesPhysicalDataComponent = newDecomposesPhysicalDataComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT, oldDecomposesPhysicalDataComponent, decomposesPhysicalDataComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalApplicationComponent> getEncapsulatesPhysicalApplicationComponents() {
		if (encapsulatesPhysicalApplicationComponents == null) {
			encapsulatesPhysicalApplicationComponents = new EObjectResolvingEList<PhysicalApplicationComponent>(PhysicalApplicationComponent.class, this, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS);
		}
		return encapsulatesPhysicalApplicationComponents;
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
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendsLogicalDataComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION:
				if (isHotedInLocation != null)
					msgs = ((InternalEObject)isHotedInLocation).eInverseRemove(this, ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS, Location.class, msgs);
				return basicSetIsHotedInLocation((Location)otherEnd, msgs);
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
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS:
				return ((InternalEList<?>)getExtendsLogicalDataComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION:
				return basicSetIsHotedInLocation(null, msgs);
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
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CLASS:
				return getStandardClass();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE:
				return getStandardCreationDate();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return getLastStandardCreationDate();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return getNextStandardCreationDate();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE:
				return getRetireDate();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS:
				return getExtendsLogicalDataComponents();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION:
				if (resolve) return getIsHotedInLocation();
				return basicGetIsHotedInLocation();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT:
				if (resolve) return getDecomposesPhysicalDataComponent();
				return basicGetDecomposesPhysicalDataComponent();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS:
				return getEncapsulatesPhysicalApplicationComponents();
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
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CLASS:
				setStandardClass((StandardsClass)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE:
				setStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE:
				setRetireDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS:
				getExtendsLogicalDataComponents().clear();
				getExtendsLogicalDataComponents().addAll((Collection<? extends LogicalDataComponent>)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION:
				setIsHotedInLocation((Location)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT:
				setDecomposesPhysicalDataComponent((PhysicalDataComponent)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS:
				getEncapsulatesPhysicalApplicationComponents().clear();
				getEncapsulatesPhysicalApplicationComponents().addAll((Collection<? extends PhysicalApplicationComponent>)newValue);
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
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CLASS:
				setStandardClass(STANDARD_CLASS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE:
				setStandardCreationDate(STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate(LAST_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate(NEXT_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE:
				setRetireDate(RETIRE_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS:
				getExtendsLogicalDataComponents().clear();
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION:
				setIsHotedInLocation((Location)null);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT:
				setDecomposesPhysicalDataComponent((PhysicalDataComponent)null);
				return;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS:
				getEncapsulatesPhysicalApplicationComponents().clear();
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
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CLASS:
				return standardClass != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? standardCreationDate != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(standardCreationDate);
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? lastStandardCreationDate != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(lastStandardCreationDate);
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? nextStandardCreationDate != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(nextStandardCreationDate);
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? retireDate != null : !RETIRE_DATE_EDEFAULT.equals(retireDate);
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS:
				return extendsLogicalDataComponents != null && !extendsLogicalDataComponents.isEmpty();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION:
				return isHotedInLocation != null;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT:
				return decomposesPhysicalDataComponent != null;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS:
				return encapsulatesPhysicalApplicationComponents != null && !encapsulatesPhysicalApplicationComponents.isEmpty();
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
				case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CLASS: return ContentfwkPackage.STANDARD__STANDARD_CLASS;
				case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE;
				case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE: return ContentfwkPackage.STANDARD__RETIRE_DATE;
				default: return -1;
			}
		}
		if (baseClass == DataComponent.class) {
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
				case ContentfwkPackage.STANDARD__STANDARD_CLASS: return ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CLASS;
				case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE: return ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__RETIRE_DATE: return ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE;
				default: return -1;
			}
		}
		if (baseClass == DataComponent.class) {
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

} //PhysicalDataComponentImpl
