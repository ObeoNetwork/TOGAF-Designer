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
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getProvidesPlatformForServices <em>Provides Platform For Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getSuppliesPlatformServices <em>Supplies Platform Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getIsRealizedByPhysicalTechnologyComponents <em>Is Realized By Physical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getDecomposesLogicalTechnologyComponent <em>Decomposes Logical Technology Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getIsDependentOnLogicalTechnologyComponents <em>Is Dependent On Logical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getCategoryTRM <em>Category TRM</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getIsExtendedByPhysicalTechnologyComponent <em>Is Extended By Physical Technology Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getIsRequiredByLogicalTechnologyComponents <em>Is Required By Logical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LogicalTechnologyComponentImpl#getIsDecomposedByLogicalTechnologyComponents <em>Is Decomposed By Logical Technology Components</em>}</li>
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
		return (StandardsClass)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.TECHNOLOGY_COMPONENT__STANDARD_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eDynamicSet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.TECHNOLOGY_COMPONENT__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getProvidesPlatformForServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PlatformService> getSuppliesPlatformServices() {
		return (EList<PlatformService>)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalTechnologyComponent> getIsRealizedByPhysicalTechnologyComponents() {
		return (EList<PhysicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalTechnologyComponent getDecomposesLogicalTechnologyComponent() {
		return (LogicalTechnologyComponent)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalTechnologyComponent basicGetDecomposesLogicalTechnologyComponent() {
		return (LogicalTechnologyComponent)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecomposesLogicalTechnologyComponent(LogicalTechnologyComponent newDecomposesLogicalTechnologyComponent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDecomposesLogicalTechnologyComponent, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesLogicalTechnologyComponent(LogicalTechnologyComponent newDecomposesLogicalTechnologyComponent) {
		eDynamicSet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT, newDecomposesLogicalTechnologyComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalTechnologyComponent> getIsDependentOnLogicalTechnologyComponents() {
		return (EList<LogicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoryTRM() {
		return (String)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryTRM(String newCategoryTRM) {
		eDynamicSet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM, newCategoryTRM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalTechnologyComponent> getIsExtendedByPhysicalTechnologyComponent() {
		return (EList<PhysicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_EXTENDED_BY_PHYSICAL_TECHNOLOGY_COMPONENT, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__IS_EXTENDED_BY_PHYSICAL_TECHNOLOGY_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalTechnologyComponent> getIsRequiredByLogicalTechnologyComponents() {
		return (EList<LogicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_LOGICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_LOGICAL_TECHNOLOGY_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalTechnologyComponent> getIsDecomposedByLogicalTechnologyComponents() {
		return (EList<LogicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS, true, true);
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT:
				LogicalTechnologyComponent decomposesLogicalTechnologyComponent = basicGetDecomposesLogicalTechnologyComponent();
				if (decomposesLogicalTechnologyComponent != null)
					msgs = ((InternalEObject)decomposesLogicalTechnologyComponent).eInverseRemove(this, ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS, LogicalTechnologyComponent.class, msgs);
				return basicSetDecomposesLogicalTechnologyComponent((LogicalTechnologyComponent)otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDependentOnLogicalTechnologyComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRequiredByLogicalTechnologyComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDecomposedByLogicalTechnologyComponents()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT:
				return basicSetDecomposesLogicalTechnologyComponent(null, msgs);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getIsDependentOnLogicalTechnologyComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getIsRequiredByLogicalTechnologyComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getIsDecomposedByLogicalTechnologyComponents()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM:
				return getCategoryTRM();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_EXTENDED_BY_PHYSICAL_TECHNOLOGY_COMPONENT:
				return getIsExtendedByPhysicalTechnologyComponent();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				return getIsRequiredByLogicalTechnologyComponents();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				return getIsDecomposedByLogicalTechnologyComponents();
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM:
				setCategoryTRM((String)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_EXTENDED_BY_PHYSICAL_TECHNOLOGY_COMPONENT:
				getIsExtendedByPhysicalTechnologyComponent().clear();
				getIsExtendedByPhysicalTechnologyComponent().addAll((Collection<? extends PhysicalTechnologyComponent>)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				getIsRequiredByLogicalTechnologyComponents().clear();
				getIsRequiredByLogicalTechnologyComponents().addAll((Collection<? extends LogicalTechnologyComponent>)newValue);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				getIsDecomposedByLogicalTechnologyComponents().clear();
				getIsDecomposedByLogicalTechnologyComponents().addAll((Collection<? extends LogicalTechnologyComponent>)newValue);
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM:
				setCategoryTRM(CATEGORY_TRM_EDEFAULT);
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_EXTENDED_BY_PHYSICAL_TECHNOLOGY_COMPONENT:
				getIsExtendedByPhysicalTechnologyComponent().clear();
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				getIsRequiredByLogicalTechnologyComponents().clear();
				return;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				getIsDecomposedByLogicalTechnologyComponents().clear();
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
				return getStandardClass() != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES:
				return !getProvidesPlatformForServices().isEmpty();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES:
				return !getSuppliesPlatformServices().isEmpty();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return !getIsRealizedByPhysicalTechnologyComponents().isEmpty();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT:
				return basicGetDecomposesLogicalTechnologyComponent() != null;
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS:
				return !getIsDependentOnLogicalTechnologyComponents().isEmpty();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM:
				return CATEGORY_TRM_EDEFAULT == null ? getCategoryTRM() != null : !CATEGORY_TRM_EDEFAULT.equals(getCategoryTRM());
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_EXTENDED_BY_PHYSICAL_TECHNOLOGY_COMPONENT:
				return !getIsExtendedByPhysicalTechnologyComponent().isEmpty();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				return !getIsRequiredByLogicalTechnologyComponents().isEmpty();
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS:
				return !getIsDecomposedByLogicalTechnologyComponents().isEmpty();
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
				case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS: return ContentfwkPackage.TECHNOLOGY_COMPONENT__STANDARD_CLASS;
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
				case ContentfwkPackage.TECHNOLOGY_COMPONENT__STANDARD_CLASS: return ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LogicalTechnologyComponentImpl
