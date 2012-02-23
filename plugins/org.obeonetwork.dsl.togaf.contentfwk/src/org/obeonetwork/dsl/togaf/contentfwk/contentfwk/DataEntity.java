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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An encapsulation of data that is recognized by a business domain expert as a discrete concept. Data entities can be tied to applications, repositories, and services and may be structured according to implementation considerations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsSuppliedByActors <em>Is Supplied By Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsConsumedByActors <em>Is Consumed By Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsAccessedByServices <em>Is Accessed By Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsUpdatedThroughServices <em>Is Updated Through Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getResidesWithinLogicalDataComponent <em>Resides Within Logical Data Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsProcessesByLogicalApplicationComponents <em>Is Processes By Logical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getDataEntityCategory <em>Data Entity Category</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getPrivacyClassification <em>Privacy Classification</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getRetentionClassification <em>Retention Classification</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getDecomposeEntity <em>Decompose Entity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getRelatesTo <em>Relates To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity()
 * @model
 * @generated
 */
public interface DataEntity extends Element {
	/**
	 * Returns the value of the '<em><b>Is Supplied By Actors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getSuppliesEntities <em>Supplies Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Supplied By Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Supplied By Actors</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_IsSuppliedByActors()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getSuppliesEntities
	 * @model opposite="suppliesEntities"
	 * @generated
	 */
	EList<Actor> getIsSuppliedByActors();

	/**
	 * Returns the value of the '<em><b>Is Consumed By Actors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getConsumesEntities <em>Consumes Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Consumed By Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Consumed By Actors</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_IsConsumedByActors()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getConsumesEntities
	 * @model opposite="consumesEntities"
	 * @generated
	 */
	EList<Actor> getIsConsumedByActors();

	/**
	 * Returns the value of the '<em><b>Is Accessed By Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getConsumesEntities <em>Consumes Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Accessed By Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Accessed By Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_IsAccessedByServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getConsumesEntities
	 * @model opposite="consumesEntities"
	 * @generated
	 */
	EList<Service> getIsAccessedByServices();

	/**
	 * Returns the value of the '<em><b>Is Updated Through Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getProvidesEntities <em>Provides Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Updated Through Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Updated Through Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_IsUpdatedThroughServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getProvidesEntities
	 * @model opposite="providesEntities"
	 * @generated
	 */
	EList<Service> getIsUpdatedThroughServices();

	/**
	 * Returns the value of the '<em><b>Resides Within Logical Data Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent#getEncapsulatesDataEntities <em>Encapsulates Data Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resides Within Logical Data Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resides Within Logical Data Component</em>' reference.
	 * @see #setResidesWithinLogicalDataComponent(LogicalDataComponent)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_ResidesWithinLogicalDataComponent()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent#getEncapsulatesDataEntities
	 * @model opposite="encapsulatesDataEntities"
	 * @generated
	 */
	LogicalDataComponent getResidesWithinLogicalDataComponent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getResidesWithinLogicalDataComponent <em>Resides Within Logical Data Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resides Within Logical Data Component</em>' reference.
	 * @see #getResidesWithinLogicalDataComponent()
	 * @generated
	 */
	void setResidesWithinLogicalDataComponent(LogicalDataComponent value);

	/**
	 * Returns the value of the '<em><b>Is Processes By Logical Application Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getOperatesOnDataEntities <em>Operates On Data Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Processes By Logical Application Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Processes By Logical Application Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_IsProcessesByLogicalApplicationComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getOperatesOnDataEntities
	 * @model opposite="operatesOnDataEntities"
	 * @generated
	 */
	EList<LogicalApplicationComponent> getIsProcessesByLogicalApplicationComponents();

	/**
	 * Returns the value of the '<em><b>Data Entity Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Entity Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Entity Category</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory
	 * @see #setDataEntityCategory(DataEntityCategory)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_DataEntityCategory()
	 * @model
	 * @generated
	 */
	DataEntityCategory getDataEntityCategory();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getDataEntityCategory <em>Data Entity Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Entity Category</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory
	 * @see #getDataEntityCategory()
	 * @generated
	 */
	void setDataEntityCategory(DataEntityCategory value);

	/**
	 * Returns the value of the '<em><b>Privacy Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privacy Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privacy Classification</em>' attribute.
	 * @see #setPrivacyClassification(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_PrivacyClassification()
	 * @model
	 * @generated
	 */
	String getPrivacyClassification();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getPrivacyClassification <em>Privacy Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privacy Classification</em>' attribute.
	 * @see #getPrivacyClassification()
	 * @generated
	 */
	void setPrivacyClassification(String value);

	/**
	 * Returns the value of the '<em><b>Retention Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retention Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retention Classification</em>' attribute.
	 * @see #setRetentionClassification(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_RetentionClassification()
	 * @model
	 * @generated
	 */
	String getRetentionClassification();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getRetentionClassification <em>Retention Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention Classification</em>' attribute.
	 * @see #getRetentionClassification()
	 * @generated
	 */
	void setRetentionClassification(String value);

	/**
	 * Returns the value of the '<em><b>Decompose Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decompose Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decompose Entity</em>' reference.
	 * @see #setDecomposeEntity(DataEntity)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_DecomposeEntity()
	 * @model
	 * @generated
	 */
	DataEntity getDecomposeEntity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getDecomposeEntity <em>Decompose Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decompose Entity</em>' reference.
	 * @see #getDecomposeEntity()
	 * @generated
	 */
	void setDecomposeEntity(DataEntity value);

	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates To</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getDataEntity_RelatesTo()
	 * @model
	 * @generated
	 */
	EList<DataEntity> getRelatesTo();

} // DataEntity
