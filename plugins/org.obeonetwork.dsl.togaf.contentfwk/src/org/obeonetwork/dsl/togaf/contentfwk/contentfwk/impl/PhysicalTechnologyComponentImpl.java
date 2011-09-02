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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Technology Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getStandardClass <em>Standard Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getStandardCreationDate <em>Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getLastStandardCreationDate <em>Last Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getNextStandardCreationDate <em>Next Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getRetireDate <em>Retire Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getRealizesApplicationComponents <em>Realizes Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getExtendsLogicalTechnologyComponents <em>Extends Logical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getIsHostedInLocation <em>Is Hosted In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getDecomposesPhysicalTechnologyComponent <em>Decomposes Physical Technology Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getIsDependentOnPhysicalTechnologyComponents <em>Is Dependent On Physical Technology Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalTechnologyComponentImpl extends ElementImpl implements PhysicalTechnologyComponent {
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
	 * The cached value of the '{@link #getRealizesApplicationComponents() <em>Realizes Application Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizesApplicationComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalApplicationComponent> realizesApplicationComponents;

	/**
	 * The cached value of the '{@link #getExtendsLogicalTechnologyComponents() <em>Extends Logical Technology Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsLogicalTechnologyComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalTechnologyComponent> extendsLogicalTechnologyComponents;

	/**
	 * The cached value of the '{@link #getIsHostedInLocation() <em>Is Hosted In Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHostedInLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> isHostedInLocation;

	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
	protected String moduleName = MODULE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecomposesPhysicalTechnologyComponent() <em>Decomposes Physical Technology Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesPhysicalTechnologyComponent()
	 * @generated
	 * @ordered
	 */
	protected PhysicalTechnologyComponent decomposesPhysicalTechnologyComponent;

	/**
	 * The cached value of the '{@link #getIsDependentOnPhysicalTechnologyComponents() <em>Is Dependent On Physical Technology Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDependentOnPhysicalTechnologyComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalTechnologyComponent> isDependentOnPhysicalTechnologyComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalTechnologyComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS, oldStandardClass, standardClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE, oldStandardCreationDate, standardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE, oldLastStandardCreationDate, lastStandardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE, oldNextStandardCreationDate, nextStandardCreationDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE, oldRetireDate, retireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalApplicationComponent> getRealizesApplicationComponents() {
		if (realizesApplicationComponents == null) {
			realizesApplicationComponents = new EObjectResolvingEList<PhysicalApplicationComponent>(PhysicalApplicationComponent.class, this, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_APPLICATION_COMPONENTS);
		}
		return realizesApplicationComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalTechnologyComponent> getExtendsLogicalTechnologyComponents() {
		if (extendsLogicalTechnologyComponents == null) {
			extendsLogicalTechnologyComponents = new EObjectWithInverseResolvingEList.ManyInverse<LogicalTechnologyComponent>(LogicalTechnologyComponent.class, this, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS);
		}
		return extendsLogicalTechnologyComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getIsHostedInLocation() {
		if (isHostedInLocation == null) {
			isHostedInLocation = new EObjectWithInverseResolvingEList.ManyInverse<Location>(Location.class, this, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION, ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS);
		}
		return isHostedInLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(String newModuleName) {
		String oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME, oldModuleName, moduleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalTechnologyComponent getDecomposesPhysicalTechnologyComponent() {
		if (decomposesPhysicalTechnologyComponent != null && decomposesPhysicalTechnologyComponent.eIsProxy()) {
			InternalEObject oldDecomposesPhysicalTechnologyComponent = (InternalEObject)decomposesPhysicalTechnologyComponent;
			decomposesPhysicalTechnologyComponent = (PhysicalTechnologyComponent)eResolveProxy(oldDecomposesPhysicalTechnologyComponent);
			if (decomposesPhysicalTechnologyComponent != oldDecomposesPhysicalTechnologyComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT, oldDecomposesPhysicalTechnologyComponent, decomposesPhysicalTechnologyComponent));
			}
		}
		return decomposesPhysicalTechnologyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalTechnologyComponent basicGetDecomposesPhysicalTechnologyComponent() {
		return decomposesPhysicalTechnologyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesPhysicalTechnologyComponent(PhysicalTechnologyComponent newDecomposesPhysicalTechnologyComponent) {
		PhysicalTechnologyComponent oldDecomposesPhysicalTechnologyComponent = decomposesPhysicalTechnologyComponent;
		decomposesPhysicalTechnologyComponent = newDecomposesPhysicalTechnologyComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT, oldDecomposesPhysicalTechnologyComponent, decomposesPhysicalTechnologyComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalTechnologyComponent> getIsDependentOnPhysicalTechnologyComponents() {
		if (isDependentOnPhysicalTechnologyComponents == null) {
			isDependentOnPhysicalTechnologyComponents = new EObjectResolvingEList<PhysicalTechnologyComponent>(PhysicalTechnologyComponent.class, this, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS);
		}
		return isDependentOnPhysicalTechnologyComponents;
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendsLogicalTechnologyComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsHostedInLocation()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getExtendsLogicalTechnologyComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION:
				return ((InternalEList<?>)getIsHostedInLocation()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				return getStandardClass();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE:
				return getStandardCreationDate();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return getLastStandardCreationDate();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return getNextStandardCreationDate();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE:
				return getRetireDate();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_APPLICATION_COMPONENTS:
				return getRealizesApplicationComponents();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS:
				return getExtendsLogicalTechnologyComponents();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION:
				return getIsHostedInLocation();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME:
				return getProductName();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME:
				return getModuleName();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR:
				return getVendor();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION:
				return getVersion();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT:
				if (resolve) return getDecomposesPhysicalTechnologyComponent();
				return basicGetDecomposesPhysicalTechnologyComponent();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return getIsDependentOnPhysicalTechnologyComponents();
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				setStandardClass((StandardsClass)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE:
				setStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE:
				setRetireDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_APPLICATION_COMPONENTS:
				getRealizesApplicationComponents().clear();
				getRealizesApplicationComponents().addAll((Collection<? extends PhysicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS:
				getExtendsLogicalTechnologyComponents().clear();
				getExtendsLogicalTechnologyComponents().addAll((Collection<? extends LogicalTechnologyComponent>)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION:
				getIsHostedInLocation().clear();
				getIsHostedInLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME:
				setModuleName((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR:
				setVendor((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION:
				setVersion((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT:
				setDecomposesPhysicalTechnologyComponent((PhysicalTechnologyComponent)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS:
				getIsDependentOnPhysicalTechnologyComponents().clear();
				getIsDependentOnPhysicalTechnologyComponents().addAll((Collection<? extends PhysicalTechnologyComponent>)newValue);
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				setStandardClass(STANDARD_CLASS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE:
				setStandardCreationDate(STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate(LAST_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate(NEXT_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE:
				setRetireDate(RETIRE_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_APPLICATION_COMPONENTS:
				getRealizesApplicationComponents().clear();
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS:
				getExtendsLogicalTechnologyComponents().clear();
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION:
				getIsHostedInLocation().clear();
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME:
				setModuleName(MODULE_NAME_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT:
				setDecomposesPhysicalTechnologyComponent((PhysicalTechnologyComponent)null);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS:
				getIsDependentOnPhysicalTechnologyComponents().clear();
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				return standardClass != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? standardCreationDate != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(standardCreationDate);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? lastStandardCreationDate != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(lastStandardCreationDate);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? nextStandardCreationDate != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(nextStandardCreationDate);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? retireDate != null : !RETIRE_DATE_EDEFAULT.equals(retireDate);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_APPLICATION_COMPONENTS:
				return realizesApplicationComponents != null && !realizesApplicationComponents.isEmpty();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS:
				return extendsLogicalTechnologyComponents != null && !extendsLogicalTechnologyComponents.isEmpty();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION:
				return isHostedInLocation != null && !isHostedInLocation.isEmpty();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT:
				return decomposesPhysicalTechnologyComponent != null;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return isDependentOnPhysicalTechnologyComponents != null && !isDependentOnPhysicalTechnologyComponents.isEmpty();
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
				case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS: return ContentfwkPackage.STANDARD__STANDARD_CLASS;
				case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE;
				case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE: return ContentfwkPackage.STANDARD__RETIRE_DATE;
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
				case ContentfwkPackage.STANDARD__STANDARD_CLASS: return ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS;
				case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE: return ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__RETIRE_DATE: return ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE;
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
		result.append(", productName: ");
		result.append(productName);
		result.append(", moduleName: ");
		result.append(moduleName);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //PhysicalTechnologyComponentImpl
