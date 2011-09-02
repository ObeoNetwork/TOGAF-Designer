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
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.DataEntityImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataEntityImpl extends ElementImpl implements DataEntity {
	/**
	 * The cached value of the '{@link #getIsSuppliedByActors() <em>Is Supplied By Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSuppliedByActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> isSuppliedByActors;

	/**
	 * The cached value of the '{@link #getIsConsumedByActors() <em>Is Consumed By Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConsumedByActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> isConsumedByActors;

	/**
	 * The cached value of the '{@link #getIsAccessedByServices() <em>Is Accessed By Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAccessedByServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> isAccessedByServices;

	/**
	 * The cached value of the '{@link #getIsUpdatedThroughServices() <em>Is Updated Through Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUpdatedThroughServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> isUpdatedThroughServices;

	/**
	 * The cached value of the '{@link #getResidesWithinLogicalDataComponent() <em>Resides Within Logical Data Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidesWithinLogicalDataComponent()
	 * @generated
	 * @ordered
	 */
	protected LogicalDataComponent residesWithinLogicalDataComponent;

	/**
	 * The cached value of the '{@link #getIsProcessesByLogicalApplicationComponents() <em>Is Processes By Logical Application Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsProcessesByLogicalApplicationComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalApplicationComponent> isProcessesByLogicalApplicationComponents;

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
	 * The cached value of the '{@link #getDataEntityCategory() <em>Data Entity Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEntityCategory()
	 * @generated
	 * @ordered
	 */
	protected DataEntityCategory dataEntityCategory = DATA_ENTITY_CATEGORY_EDEFAULT;

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
	 * The cached value of the '{@link #getPrivacyClassification() <em>Privacy Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyClassification()
	 * @generated
	 * @ordered
	 */
	protected String privacyClassification = PRIVACY_CLASSIFICATION_EDEFAULT;

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
	 * The cached value of the '{@link #getRetentionClassification() <em>Retention Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetentionClassification()
	 * @generated
	 * @ordered
	 */
	protected String retentionClassification = RETENTION_CLASSIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecomposeEntity() <em>Decompose Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposeEntity()
	 * @generated
	 * @ordered
	 */
	protected DataEntity decomposeEntity;

	/**
	 * The cached value of the '{@link #getRelatesTo() <em>Relates To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<DataEntity> relatesTo;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference.
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
	public EList<Actor> getIsSuppliedByActors() {
		if (isSuppliedByActors == null) {
			isSuppliedByActors = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, ContentfwkPackage.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS, ContentfwkPackage.ACTOR__SUPPLIES_ENTITIES);
		}
		return isSuppliedByActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getIsConsumedByActors() {
		if (isConsumedByActors == null) {
			isConsumedByActors = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, ContentfwkPackage.DATA_ENTITY__IS_CONSUMED_BY_ACTORS, ContentfwkPackage.ACTOR__CONSUMES_ENTITIES);
		}
		return isConsumedByActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getIsAccessedByServices() {
		if (isAccessedByServices == null) {
			isAccessedByServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES, ContentfwkPackage.SERVICE__CONSUMES_ENTITIES);
		}
		return isAccessedByServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getIsUpdatedThroughServices() {
		if (isUpdatedThroughServices == null) {
			isUpdatedThroughServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES, ContentfwkPackage.SERVICE__PROVIDES_ENTITIES);
		}
		return isUpdatedThroughServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDataComponent getResidesWithinLogicalDataComponent() {
		if (residesWithinLogicalDataComponent != null && residesWithinLogicalDataComponent.eIsProxy()) {
			InternalEObject oldResidesWithinLogicalDataComponent = (InternalEObject)residesWithinLogicalDataComponent;
			residesWithinLogicalDataComponent = (LogicalDataComponent)eResolveProxy(oldResidesWithinLogicalDataComponent);
			if (residesWithinLogicalDataComponent != oldResidesWithinLogicalDataComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, oldResidesWithinLogicalDataComponent, residesWithinLogicalDataComponent));
			}
		}
		return residesWithinLogicalDataComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDataComponent basicGetResidesWithinLogicalDataComponent() {
		return residesWithinLogicalDataComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResidesWithinLogicalDataComponent(LogicalDataComponent newResidesWithinLogicalDataComponent, NotificationChain msgs) {
		LogicalDataComponent oldResidesWithinLogicalDataComponent = residesWithinLogicalDataComponent;
		residesWithinLogicalDataComponent = newResidesWithinLogicalDataComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, oldResidesWithinLogicalDataComponent, newResidesWithinLogicalDataComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidesWithinLogicalDataComponent(LogicalDataComponent newResidesWithinLogicalDataComponent) {
		if (newResidesWithinLogicalDataComponent != residesWithinLogicalDataComponent) {
			NotificationChain msgs = null;
			if (residesWithinLogicalDataComponent != null)
				msgs = ((InternalEObject)residesWithinLogicalDataComponent).eInverseRemove(this, ContentfwkPackage.LOGICAL_DATA_COMPONENT__ENCAPSULATES_DATA_ENTITIES, LogicalDataComponent.class, msgs);
			if (newResidesWithinLogicalDataComponent != null)
				msgs = ((InternalEObject)newResidesWithinLogicalDataComponent).eInverseAdd(this, ContentfwkPackage.LOGICAL_DATA_COMPONENT__ENCAPSULATES_DATA_ENTITIES, LogicalDataComponent.class, msgs);
			msgs = basicSetResidesWithinLogicalDataComponent(newResidesWithinLogicalDataComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, newResidesWithinLogicalDataComponent, newResidesWithinLogicalDataComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalApplicationComponent> getIsProcessesByLogicalApplicationComponents() {
		if (isProcessesByLogicalApplicationComponents == null) {
			isProcessesByLogicalApplicationComponents = new EObjectWithInverseResolvingEList.ManyInverse<LogicalApplicationComponent>(LogicalApplicationComponent.class, this, ContentfwkPackage.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__OPERATES_ON_DATA_ENTITIES);
		}
		return isProcessesByLogicalApplicationComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntityCategory getDataEntityCategory() {
		return dataEntityCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEntityCategory(DataEntityCategory newDataEntityCategory) {
		DataEntityCategory oldDataEntityCategory = dataEntityCategory;
		dataEntityCategory = newDataEntityCategory == null ? DATA_ENTITY_CATEGORY_EDEFAULT : newDataEntityCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.DATA_ENTITY__DATA_ENTITY_CATEGORY, oldDataEntityCategory, dataEntityCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivacyClassification() {
		return privacyClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacyClassification(String newPrivacyClassification) {
		String oldPrivacyClassification = privacyClassification;
		privacyClassification = newPrivacyClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.DATA_ENTITY__PRIVACY_CLASSIFICATION, oldPrivacyClassification, privacyClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetentionClassification() {
		return retentionClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetentionClassification(String newRetentionClassification) {
		String oldRetentionClassification = retentionClassification;
		retentionClassification = newRetentionClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.DATA_ENTITY__RETENTION_CLASSIFICATION, oldRetentionClassification, retentionClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntity getDecomposeEntity() {
		if (decomposeEntity != null && decomposeEntity.eIsProxy()) {
			InternalEObject oldDecomposeEntity = (InternalEObject)decomposeEntity;
			decomposeEntity = (DataEntity)eResolveProxy(oldDecomposeEntity);
			if (decomposeEntity != oldDecomposeEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.DATA_ENTITY__DECOMPOSE_ENTITY, oldDecomposeEntity, decomposeEntity));
			}
		}
		return decomposeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntity basicGetDecomposeEntity() {
		return decomposeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposeEntity(DataEntity newDecomposeEntity) {
		DataEntity oldDecomposeEntity = decomposeEntity;
		decomposeEntity = newDecomposeEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.DATA_ENTITY__DECOMPOSE_ENTITY, oldDecomposeEntity, decomposeEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataEntity> getRelatesTo() {
		if (relatesTo == null) {
			relatesTo = new EObjectResolvingEList<DataEntity>(DataEntity.class, this, ContentfwkPackage.DATA_ENTITY__RELATES_TO);
		}
		return relatesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAny() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAny(EObject newAny, NotificationChain msgs) {
		EObject oldAny = any;
		any = newAny;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentfwkPackage.DATA_ENTITY__ANY, oldAny, newAny);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(EObject newAny) {
		if (newAny != any) {
			NotificationChain msgs = null;
			if (any != null)
				msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContentfwkPackage.DATA_ENTITY__ANY, null, msgs);
			if (newAny != null)
				msgs = ((InternalEObject)newAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContentfwkPackage.DATA_ENTITY__ANY, null, msgs);
			msgs = basicSetAny(newAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.DATA_ENTITY__ANY, newAny, newAny));
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
			case ContentfwkPackage.DATA_ENTITY__ANY:
				return basicSetAny(null, msgs);
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
			case ContentfwkPackage.DATA_ENTITY__ANY:
				return getAny();
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
			case ContentfwkPackage.DATA_ENTITY__ANY:
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
			case ContentfwkPackage.DATA_ENTITY__ANY:
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
			case ContentfwkPackage.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS:
				return isSuppliedByActors != null && !isSuppliedByActors.isEmpty();
			case ContentfwkPackage.DATA_ENTITY__IS_CONSUMED_BY_ACTORS:
				return isConsumedByActors != null && !isConsumedByActors.isEmpty();
			case ContentfwkPackage.DATA_ENTITY__IS_ACCESSED_BY_SERVICES:
				return isAccessedByServices != null && !isAccessedByServices.isEmpty();
			case ContentfwkPackage.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES:
				return isUpdatedThroughServices != null && !isUpdatedThroughServices.isEmpty();
			case ContentfwkPackage.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT:
				return residesWithinLogicalDataComponent != null;
			case ContentfwkPackage.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS:
				return isProcessesByLogicalApplicationComponents != null && !isProcessesByLogicalApplicationComponents.isEmpty();
			case ContentfwkPackage.DATA_ENTITY__DATA_ENTITY_CATEGORY:
				return dataEntityCategory != DATA_ENTITY_CATEGORY_EDEFAULT;
			case ContentfwkPackage.DATA_ENTITY__PRIVACY_CLASSIFICATION:
				return PRIVACY_CLASSIFICATION_EDEFAULT == null ? privacyClassification != null : !PRIVACY_CLASSIFICATION_EDEFAULT.equals(privacyClassification);
			case ContentfwkPackage.DATA_ENTITY__RETENTION_CLASSIFICATION:
				return RETENTION_CLASSIFICATION_EDEFAULT == null ? retentionClassification != null : !RETENTION_CLASSIFICATION_EDEFAULT.equals(retentionClassification);
			case ContentfwkPackage.DATA_ENTITY__DECOMPOSE_ENTITY:
				return decomposeEntity != null;
			case ContentfwkPackage.DATA_ENTITY__RELATES_TO:
				return relatesTo != null && !relatesTo.isEmpty();
			case ContentfwkPackage.DATA_ENTITY__ANY:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataEntityCategory: ");
		result.append(dataEntityCategory);
		result.append(", privacyClassification: ");
		result.append(privacyClassification);
		result.append(", retentionClassification: ");
		result.append(retentionClassification);
		result.append(')');
		return result.toString();
	}

} //DataEntityImpl
