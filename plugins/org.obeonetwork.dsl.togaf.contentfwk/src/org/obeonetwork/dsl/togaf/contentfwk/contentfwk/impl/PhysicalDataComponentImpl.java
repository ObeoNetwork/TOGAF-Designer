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
		return (StandardsClass)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, newStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardCreationDate(Date newLastStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, newLastStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardCreationDate(Date newNextStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, newNextStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, newRetireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalDataComponent> getExtendsLogicalDataComponents() {
		return (EList<LogicalDataComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS, ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getIsHotedInLocation() {
		return (Location)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION, ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetIsHotedInLocation() {
		return (Location)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION, ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsHotedInLocation(Location newIsHotedInLocation, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newIsHotedInLocation, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHotedInLocation(Location newIsHotedInLocation) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION, ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION, newIsHotedInLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDataComponent getDecomposesPhysicalDataComponent() {
		return (PhysicalDataComponent)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT, ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDataComponent basicGetDecomposesPhysicalDataComponent() {
		return (PhysicalDataComponent)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT, ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesPhysicalDataComponent(PhysicalDataComponent newDecomposesPhysicalDataComponent) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT, ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT, newDecomposesPhysicalDataComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalApplicationComponent> getEncapsulatesPhysicalApplicationComponents() {
		return (EList<PhysicalApplicationComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS, ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS, true, true);
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
				Location isHotedInLocation = basicGetIsHotedInLocation();
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
				return getStandardClass() != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? getStandardCreationDate() != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(getStandardCreationDate());
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? getLastStandardCreationDate() != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(getLastStandardCreationDate());
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? getNextStandardCreationDate() != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(getNextStandardCreationDate());
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? getRetireDate() != null : !RETIRE_DATE_EDEFAULT.equals(getRetireDate());
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS:
				return !getExtendsLogicalDataComponents().isEmpty();
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION:
				return basicGetIsHotedInLocation() != null;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT:
				return basicGetDecomposesPhysicalDataComponent() != null;
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS:
				return !getEncapsulatesPhysicalApplicationComponents().isEmpty();
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

} //PhysicalDataComponentImpl
