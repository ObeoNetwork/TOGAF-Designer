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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
	 * The default value of the '{@link #getStandardCreationDate() <em>Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STANDARD_CREATION_DATE_EDEFAULT = null;
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
	 * The default value of the '{@link #getNextStandardCreationDate() <em>Next Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NEXT_STANDARD_CREATION_DATE_EDEFAULT = null;
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
		return (StandardsClass)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eDynamicSet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, newStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardCreationDate(Date newLastStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, newLastStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardCreationDate(Date newNextStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, newNextStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return (Date)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		eDynamicSet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, newRetireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getImplementsServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES, ContentfwkPackage.Literals.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getOperatesOnDataEntities() {
		return (EList<DataEntity>)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES, ContentfwkPackage.Literals.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalApplicationComponent> getIsExtendedByPhysicalApplicationComponents() {
		return (EList<PhysicalApplicationComponent>)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS, ContentfwkPackage.Literals.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalApplicationComponent> getCommunicatesWith() {
		return (EList<LogicalApplicationComponent>)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH, ContentfwkPackage.Literals.LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalApplicationComponent getDecomposesLogicalApplicationComponent() {
		return (LogicalApplicationComponent)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT, ContentfwkPackage.Literals.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalApplicationComponent basicGetDecomposesLogicalApplicationComponent() {
		return (LogicalApplicationComponent)eDynamicGet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT, ContentfwkPackage.Literals.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesLogicalApplicationComponent(LogicalApplicationComponent newDecomposesLogicalApplicationComponent) {
		eDynamicSet(ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT, ContentfwkPackage.Literals.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT, newDecomposesLogicalApplicationComponent);
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
				return getStandardClass() != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? getStandardCreationDate() != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(getStandardCreationDate());
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? getLastStandardCreationDate() != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(getLastStandardCreationDate());
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? getNextStandardCreationDate() != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(getNextStandardCreationDate());
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? getRetireDate() != null : !RETIRE_DATE_EDEFAULT.equals(getRetireDate());
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IMPLEMENTS_SERVICES:
				return !getImplementsServices().isEmpty();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES:
				return !getOperatesOnDataEntities().isEmpty();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS:
				return !getIsExtendedByPhysicalApplicationComponents().isEmpty();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH:
				return !getCommunicatesWith().isEmpty();
			case ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__DECOMPOSES_LOGICAL_APPLICATION_COMPONENT:
				return basicGetDecomposesLogicalApplicationComponent() != null;
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

} //LogicalApplicationComponentImpl
