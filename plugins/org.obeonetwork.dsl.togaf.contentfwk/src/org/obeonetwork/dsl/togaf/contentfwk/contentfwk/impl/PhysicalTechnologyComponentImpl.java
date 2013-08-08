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
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getRealizesPhysicalApplicationComponents <em>Realizes Physical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getExtendsLogicalTechnologyComponents <em>Extends Logical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getIsHostedInLocation <em>Is Hosted In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getDecomposesPhysicalTechnologyComponent <em>Decomposes Physical Technology Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getIsDependentOnPhysicalTechnologyComponents <em>Is Dependent On Physical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getCategoryTRM <em>Category TRM</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getIsRequiredByPhysicalTechnologyComponent <em>Is Required By Physical Technology Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalTechnologyComponentImpl#getIsDecomposedByPhysicalTechnologyComponents <em>Is Decomposed By Physical Technology Components</em>}</li>
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
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;
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
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;
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
	 * The default value of the '{@link #getCategoryTRM() <em>Category TRM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryTRM()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_TRM_EDEFAULT = null;

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
		return (StandardsClass)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.TECHNOLOGY_COMPONENT__STANDARD_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.TECHNOLOGY_COMPONENT__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalApplicationComponent> getRealizesPhysicalApplicationComponents() {
		return (EList<PhysicalApplicationComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_PHYSICAL_APPLICATION_COMPONENTS, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_PHYSICAL_APPLICATION_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalTechnologyComponent> getExtendsLogicalTechnologyComponents() {
		return (EList<LogicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Location> getIsHostedInLocation() {
		return (EList<Location>)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME, newProductName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleName() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleName(String newModuleName) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME, newModuleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR, newVendor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalTechnologyComponent getDecomposesPhysicalTechnologyComponent() {
		return (PhysicalTechnologyComponent)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalTechnologyComponent basicGetDecomposesPhysicalTechnologyComponent() {
		return (PhysicalTechnologyComponent)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecomposesPhysicalTechnologyComponent(PhysicalTechnologyComponent newDecomposesPhysicalTechnologyComponent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDecomposesPhysicalTechnologyComponent, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesPhysicalTechnologyComponent(PhysicalTechnologyComponent newDecomposesPhysicalTechnologyComponent) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT, newDecomposesPhysicalTechnologyComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalTechnologyComponent> getIsDependentOnPhysicalTechnologyComponents() {
		return (EList<PhysicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoryTRM() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryTRM(String newCategoryTRM) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM, newCategoryTRM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalTechnologyComponent> getIsRequiredByPhysicalTechnologyComponent() {
		return (EList<PhysicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_PHYSICAL_TECHNOLOGY_COMPONENT, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_PHYSICAL_TECHNOLOGY_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalTechnologyComponent> getIsDecomposedByPhysicalTechnologyComponents() {
		return (EList<PhysicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS, true, true);
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_PHYSICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealizesPhysicalApplicationComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendsLogicalTechnologyComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsHostedInLocation()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT:
				PhysicalTechnologyComponent decomposesPhysicalTechnologyComponent = basicGetDecomposesPhysicalTechnologyComponent();
				if (decomposesPhysicalTechnologyComponent != null)
					msgs = ((InternalEObject)decomposesPhysicalTechnologyComponent).eInverseRemove(this, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS, PhysicalTechnologyComponent.class, msgs);
				return basicSetDecomposesPhysicalTechnologyComponent((PhysicalTechnologyComponent)otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDependentOnPhysicalTechnologyComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_PHYSICAL_TECHNOLOGY_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRequiredByPhysicalTechnologyComponent()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDecomposedByPhysicalTechnologyComponents()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_PHYSICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<?>)getRealizesPhysicalApplicationComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getExtendsLogicalTechnologyComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION:
				return ((InternalEList<?>)getIsHostedInLocation()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT:
				return basicSetDecomposesPhysicalTechnologyComponent(null, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getIsDependentOnPhysicalTechnologyComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_PHYSICAL_TECHNOLOGY_COMPONENT:
				return ((InternalEList<?>)getIsRequiredByPhysicalTechnologyComponent()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getIsDecomposedByPhysicalTechnologyComponents()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_PHYSICAL_APPLICATION_COMPONENTS:
				return getRealizesPhysicalApplicationComponents();
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM:
				return getCategoryTRM();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_PHYSICAL_TECHNOLOGY_COMPONENT:
				return getIsRequiredByPhysicalTechnologyComponent();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return getIsDecomposedByPhysicalTechnologyComponents();
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_PHYSICAL_APPLICATION_COMPONENTS:
				getRealizesPhysicalApplicationComponents().clear();
				getRealizesPhysicalApplicationComponents().addAll((Collection<? extends PhysicalApplicationComponent>)newValue);
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM:
				setCategoryTRM((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_PHYSICAL_TECHNOLOGY_COMPONENT:
				getIsRequiredByPhysicalTechnologyComponent().clear();
				getIsRequiredByPhysicalTechnologyComponent().addAll((Collection<? extends PhysicalTechnologyComponent>)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				getIsDecomposedByPhysicalTechnologyComponents().clear();
				getIsDecomposedByPhysicalTechnologyComponents().addAll((Collection<? extends PhysicalTechnologyComponent>)newValue);
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_PHYSICAL_APPLICATION_COMPONENTS:
				getRealizesPhysicalApplicationComponents().clear();
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
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM:
				setCategoryTRM(CATEGORY_TRM_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_PHYSICAL_TECHNOLOGY_COMPONENT:
				getIsRequiredByPhysicalTechnologyComponent().clear();
				return;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				getIsDecomposedByPhysicalTechnologyComponents().clear();
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
				return getStandardClass() != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_PHYSICAL_APPLICATION_COMPONENTS:
				return !getRealizesPhysicalApplicationComponents().isEmpty();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS:
				return !getExtendsLogicalTechnologyComponents().isEmpty();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION:
				return !getIsHostedInLocation().isEmpty();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? getProductName() != null : !PRODUCT_NAME_EDEFAULT.equals(getProductName());
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? getModuleName() != null : !MODULE_NAME_EDEFAULT.equals(getModuleName());
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR:
				return VENDOR_EDEFAULT == null ? getVendor() != null : !VENDOR_EDEFAULT.equals(getVendor());
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT:
				return basicGetDecomposesPhysicalTechnologyComponent() != null;
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return !getIsDependentOnPhysicalTechnologyComponents().isEmpty();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM:
				return CATEGORY_TRM_EDEFAULT == null ? getCategoryTRM() != null : !CATEGORY_TRM_EDEFAULT.equals(getCategoryTRM());
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_PHYSICAL_TECHNOLOGY_COMPONENT:
				return !getIsRequiredByPhysicalTechnologyComponent().isEmpty();
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return !getIsDecomposedByPhysicalTechnologyComponents().isEmpty();
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
		if (baseClass == TechnologyComponent.class) {
			switch (derivedFeatureID) {
				case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS: return ContentfwkPackage.TECHNOLOGY_COMPONENT__STANDARD_CLASS;
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
		if (baseClass == TechnologyComponent.class) {
			switch (baseFeatureID) {
				case ContentfwkPackage.TECHNOLOGY_COMPONENT__STANDARD_CLASS: return ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PhysicalTechnologyComponentImpl
