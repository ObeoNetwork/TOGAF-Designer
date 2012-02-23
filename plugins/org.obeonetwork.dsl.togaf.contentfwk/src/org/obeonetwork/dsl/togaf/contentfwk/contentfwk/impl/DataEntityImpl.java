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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getIsSuppliedByActors <em>Is Supplied By Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getIsConsumedByActors <em>Is Consumed By Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getIsAccessedByServices <em>Is Accessed By Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getIsUpdatedThroughServices <em>Is Updated Through Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getResidesWithinLogicalDataComponent <em>Resides Within Logical Data Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getIsProcessesByLogicalApplicationComponents <em>Is Processes By Logical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getDataEntityCategory <em>Data Entity Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getPrivacyClassification <em>Privacy Classification</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getRetentionClassification <em>Retention Classification</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getDecomposeEntity <em>Decompose Entity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getRelatesTo <em>Relates To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataEntityImpl extends ElementImpl implements DataEntity {
	/**
	 * The default value of the '{@link #getDataEntityCategory() <em>Data Entity Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEntityCategory()
	 * @generated
	 * @ordered
	 */
	protected static final DataEntityCategory DATA_ENTITY_CATEGORY_EDEFAULT = DataEntityCategory.MESSAGE;
	/**
	 * The default value of the '{@link #getPrivacyClassification() <em>Privacy Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVACY_CLASSIFICATION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRetentionClassification() <em>Retention Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetentionClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String RETENTION_CLASSIFICATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.DATA_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getIsSuppliedByActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS, ContentfwkPackage.Literals.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getIsConsumedByActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.DATA_ENTITY__IS_CONSUMED_BY_ACTORS, ContentfwkPackage.Literals.DATA_ENTITY__IS_CONSUMED_BY_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getIsAccessedByServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES, ContentfwkPackage.Literals.DATA_ENTITY__IS_ACCESSED_BY_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getIsUpdatedThroughServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES, ContentfwkPackage.Literals.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDataComponent getResidesWithinLogicalDataComponent() {
		return (LogicalDataComponent)eDynamicGet(ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, ContentfwkPackage.Literals.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDataComponent basicGetResidesWithinLogicalDataComponent() {
		return (LogicalDataComponent)eDynamicGet(ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, ContentfwkPackage.Literals.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResidesWithinLogicalDataComponent(LogicalDataComponent newResidesWithinLogicalDataComponent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResidesWithinLogicalDataComponent, ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidesWithinLogicalDataComponent(LogicalDataComponent newResidesWithinLogicalDataComponent) {
		eDynamicSet(ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, ContentfwkPackage.Literals.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, newResidesWithinLogicalDataComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalApplicationComponent> getIsProcessesByLogicalApplicationComponents() {
		return (EList<LogicalApplicationComponent>)eDynamicGet(ContentfwkPackage.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS, ContentfwkPackage.Literals.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntityCategory getDataEntityCategory() {
		return (DataEntityCategory)eDynamicGet(ContentfwkPackage.DATA_ENTITY__DATA_ENTITY_CATEGORY, ContentfwkPackage.Literals.DATA_ENTITY__DATA_ENTITY_CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEntityCategory(DataEntityCategory newDataEntityCategory) {
		eDynamicSet(ContentfwkPackage.DATA_ENTITY__DATA_ENTITY_CATEGORY, ContentfwkPackage.Literals.DATA_ENTITY__DATA_ENTITY_CATEGORY, newDataEntityCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivacyClassification() {
		return (String)eDynamicGet(ContentfwkPackage.DATA_ENTITY__PRIVACY_CLASSIFICATION, ContentfwkPackage.Literals.DATA_ENTITY__PRIVACY_CLASSIFICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacyClassification(String newPrivacyClassification) {
		eDynamicSet(ContentfwkPackage.DATA_ENTITY__PRIVACY_CLASSIFICATION, ContentfwkPackage.Literals.DATA_ENTITY__PRIVACY_CLASSIFICATION, newPrivacyClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetentionClassification() {
		return (String)eDynamicGet(ContentfwkPackage.DATA_ENTITY__RETENTION_CLASSIFICATION, ContentfwkPackage.Literals.DATA_ENTITY__RETENTION_CLASSIFICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetentionClassification(String newRetentionClassification) {
		eDynamicSet(ContentfwkPackage.DATA_ENTITY__RETENTION_CLASSIFICATION, ContentfwkPackage.Literals.DATA_ENTITY__RETENTION_CLASSIFICATION, newRetentionClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntity getDecomposeEntity() {
		return (DataEntity)eDynamicGet(ContentfwkPackage.DATA_ENTITY__DECOMPOSE_ENTITY, ContentfwkPackage.Literals.DATA_ENTITY__DECOMPOSE_ENTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntity basicGetDecomposeEntity() {
		return (DataEntity)eDynamicGet(ContentfwkPackage.DATA_ENTITY__DECOMPOSE_ENTITY, ContentfwkPackage.Literals.DATA_ENTITY__DECOMPOSE_ENTITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposeEntity(DataEntity newDecomposeEntity) {
		eDynamicSet(ContentfwkPackage.DATA_ENTITY__DECOMPOSE_ENTITY, ContentfwkPackage.Literals.DATA_ENTITY__DECOMPOSE_ENTITY, newDecomposeEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getRelatesTo() {
		return (EList<DataEntity>)eDynamicGet(ContentfwkPackage.DATA_ENTITY__RELATES_TO, ContentfwkPackage.Literals.DATA_ENTITY__RELATES_TO, true, true);
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
			case ContentfwkPackage.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSuppliedByActors()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.DATA_ENTITY__IS_CONSUMED_BY_ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsConsumedByActors()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsAccessedByServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsUpdatedThroughServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT:
				LogicalDataComponent residesWithinLogicalDataComponent = basicGetResidesWithinLogicalDataComponent();
				if (residesWithinLogicalDataComponent != null)
					msgs = ((InternalEObject)residesWithinLogicalDataComponent).eInverseRemove(this, ContentfwkPackage.LOGICAL_DATA_COMPONENT__ENCAPSULATES_DATA_ENTITIES, LogicalDataComponent.class, msgs);
				return basicSetResidesWithinLogicalDataComponent((LogicalDataComponent)otherEnd, msgs);
			case ContentfwkPackage.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsProcessesByLogicalApplicationComponents()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS:
				return ((InternalEList<?>)getIsSuppliedByActors()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.DATA_ENTITY__IS_CONSUMED_BY_ACTORS:
				return ((InternalEList<?>)getIsConsumedByActors()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES:
				return ((InternalEList<?>)getIsAccessedByServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES:
				return ((InternalEList<?>)getIsUpdatedThroughServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT:
				return basicSetResidesWithinLogicalDataComponent(null, msgs);
			case ContentfwkPackage.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<?>)getIsProcessesByLogicalApplicationComponents()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS:
				return getIsSuppliedByActors();
			case ContentfwkPackage.DATA_ENTITY__IS_CONSUMED_BY_ACTORS:
				return getIsConsumedByActors();
			case ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES:
				return getIsAccessedByServices();
			case ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES:
				return getIsUpdatedThroughServices();
			case ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT:
				if (resolve) return getResidesWithinLogicalDataComponent();
				return basicGetResidesWithinLogicalDataComponent();
			case ContentfwkPackage.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS:
				return getIsProcessesByLogicalApplicationComponents();
			case ContentfwkPackage.DATA_ENTITY__DATA_ENTITY_CATEGORY:
				return getDataEntityCategory();
			case ContentfwkPackage.DATA_ENTITY__PRIVACY_CLASSIFICATION:
				return getPrivacyClassification();
			case ContentfwkPackage.DATA_ENTITY__RETENTION_CLASSIFICATION:
				return getRetentionClassification();
			case ContentfwkPackage.DATA_ENTITY__DECOMPOSE_ENTITY:
				if (resolve) return getDecomposeEntity();
				return basicGetDecomposeEntity();
			case ContentfwkPackage.DATA_ENTITY__RELATES_TO:
				return getRelatesTo();
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
			case ContentfwkPackage.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS:
				getIsSuppliedByActors().clear();
				getIsSuppliedByActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.DATA_ENTITY__IS_CONSUMED_BY_ACTORS:
				getIsConsumedByActors().clear();
				getIsConsumedByActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES:
				getIsAccessedByServices().clear();
				getIsAccessedByServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES:
				getIsUpdatedThroughServices().clear();
				getIsUpdatedThroughServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT:
				setResidesWithinLogicalDataComponent((LogicalDataComponent)newValue);
				return;
			case ContentfwkPackage.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS:
				getIsProcessesByLogicalApplicationComponents().clear();
				getIsProcessesByLogicalApplicationComponents().addAll((Collection<? extends LogicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.DATA_ENTITY__DATA_ENTITY_CATEGORY:
				setDataEntityCategory((DataEntityCategory)newValue);
				return;
			case ContentfwkPackage.DATA_ENTITY__PRIVACY_CLASSIFICATION:
				setPrivacyClassification((String)newValue);
				return;
			case ContentfwkPackage.DATA_ENTITY__RETENTION_CLASSIFICATION:
				setRetentionClassification((String)newValue);
				return;
			case ContentfwkPackage.DATA_ENTITY__DECOMPOSE_ENTITY:
				setDecomposeEntity((DataEntity)newValue);
				return;
			case ContentfwkPackage.DATA_ENTITY__RELATES_TO:
				getRelatesTo().clear();
				getRelatesTo().addAll((Collection<? extends DataEntity>)newValue);
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
			case ContentfwkPackage.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS:
				getIsSuppliedByActors().clear();
				return;
			case ContentfwkPackage.DATA_ENTITY__IS_CONSUMED_BY_ACTORS:
				getIsConsumedByActors().clear();
				return;
			case ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES:
				getIsAccessedByServices().clear();
				return;
			case ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES:
				getIsUpdatedThroughServices().clear();
				return;
			case ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT:
				setResidesWithinLogicalDataComponent((LogicalDataComponent)null);
				return;
			case ContentfwkPackage.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS:
				getIsProcessesByLogicalApplicationComponents().clear();
				return;
			case ContentfwkPackage.DATA_ENTITY__DATA_ENTITY_CATEGORY:
				setDataEntityCategory(DATA_ENTITY_CATEGORY_EDEFAULT);
				return;
			case ContentfwkPackage.DATA_ENTITY__PRIVACY_CLASSIFICATION:
				setPrivacyClassification(PRIVACY_CLASSIFICATION_EDEFAULT);
				return;
			case ContentfwkPackage.DATA_ENTITY__RETENTION_CLASSIFICATION:
				setRetentionClassification(RETENTION_CLASSIFICATION_EDEFAULT);
				return;
			case ContentfwkPackage.DATA_ENTITY__DECOMPOSE_ENTITY:
				setDecomposeEntity((DataEntity)null);
				return;
			case ContentfwkPackage.DATA_ENTITY__RELATES_TO:
				getRelatesTo().clear();
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
			case ContentfwkPackage.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS:
				return !getIsSuppliedByActors().isEmpty();
			case ContentfwkPackage.DATA_ENTITY__IS_CONSUMED_BY_ACTORS:
				return !getIsConsumedByActors().isEmpty();
			case ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES:
				return !getIsAccessedByServices().isEmpty();
			case ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES:
				return !getIsUpdatedThroughServices().isEmpty();
			case ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT:
				return basicGetResidesWithinLogicalDataComponent() != null;
			case ContentfwkPackage.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS:
				return !getIsProcessesByLogicalApplicationComponents().isEmpty();
			case ContentfwkPackage.DATA_ENTITY__DATA_ENTITY_CATEGORY:
				return getDataEntityCategory() != DATA_ENTITY_CATEGORY_EDEFAULT;
			case ContentfwkPackage.DATA_ENTITY__PRIVACY_CLASSIFICATION:
				return PRIVACY_CLASSIFICATION_EDEFAULT == null ? getPrivacyClassification() != null : !PRIVACY_CLASSIFICATION_EDEFAULT.equals(getPrivacyClassification());
			case ContentfwkPackage.DATA_ENTITY__RETENTION_CLASSIFICATION:
				return RETENTION_CLASSIFICATION_EDEFAULT == null ? getRetentionClassification() != null : !RETENTION_CLASSIFICATION_EDEFAULT.equals(getRetentionClassification());
			case ContentfwkPackage.DATA_ENTITY__DECOMPOSE_ENTITY:
				return basicGetDecomposeEntity() != null;
			case ContentfwkPackage.DATA_ENTITY__RELATES_TO:
				return !getRelatesTo().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataEntityImpl
