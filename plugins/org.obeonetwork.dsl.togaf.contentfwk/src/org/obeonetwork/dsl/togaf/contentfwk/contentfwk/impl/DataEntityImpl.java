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
		return (EList<Actor>)eGet(ContentfwkPackage.Literals.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getIsConsumedByActors() {
		return (EList<Actor>)eGet(ContentfwkPackage.Literals.DATA_ENTITY__IS_CONSUMED_BY_ACTORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getIsAccessedByServices() {
		return (EList<Service>)eGet(ContentfwkPackage.Literals.DATA_ENTITY__IS_ACCESSED_BY_SERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getIsUpdatedThroughServices() {
		return (EList<Service>)eGet(ContentfwkPackage.Literals.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalDataComponent getResidesWithinLogicalDataComponent() {
		return (LogicalDataComponent)eGet(ContentfwkPackage.Literals.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidesWithinLogicalDataComponent(LogicalDataComponent newResidesWithinLogicalDataComponent) {
		eSet(ContentfwkPackage.Literals.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT, newResidesWithinLogicalDataComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalApplicationComponent> getIsProcessesByLogicalApplicationComponents() {
		return (EList<LogicalApplicationComponent>)eGet(ContentfwkPackage.Literals.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntityCategory getDataEntityCategory() {
		return (DataEntityCategory)eGet(ContentfwkPackage.Literals.DATA_ENTITY__DATA_ENTITY_CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEntityCategory(DataEntityCategory newDataEntityCategory) {
		eSet(ContentfwkPackage.Literals.DATA_ENTITY__DATA_ENTITY_CATEGORY, newDataEntityCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivacyClassification() {
		return (String)eGet(ContentfwkPackage.Literals.DATA_ENTITY__PRIVACY_CLASSIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacyClassification(String newPrivacyClassification) {
		eSet(ContentfwkPackage.Literals.DATA_ENTITY__PRIVACY_CLASSIFICATION, newPrivacyClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetentionClassification() {
		return (String)eGet(ContentfwkPackage.Literals.DATA_ENTITY__RETENTION_CLASSIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetentionClassification(String newRetentionClassification) {
		eSet(ContentfwkPackage.Literals.DATA_ENTITY__RETENTION_CLASSIFICATION, newRetentionClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEntity getDecomposeEntity() {
		return (DataEntity)eGet(ContentfwkPackage.Literals.DATA_ENTITY__DECOMPOSE_ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposeEntity(DataEntity newDecomposeEntity) {
		eSet(ContentfwkPackage.Literals.DATA_ENTITY__DECOMPOSE_ENTITY, newDecomposeEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataEntity> getRelatesTo() {
		return (EList<DataEntity>)eGet(ContentfwkPackage.Literals.DATA_ENTITY__RELATES_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAny() {
		return (EObject)eGet(ContentfwkPackage.Literals.DATA_ENTITY__ANY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(EObject newAny) {
		eSet(ContentfwkPackage.Literals.DATA_ENTITY__ANY, newAny);
	}

} //DataEntityImpl
