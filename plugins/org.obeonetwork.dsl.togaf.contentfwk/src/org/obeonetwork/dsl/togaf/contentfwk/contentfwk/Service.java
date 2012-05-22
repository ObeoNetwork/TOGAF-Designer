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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsProvidedToActors <em>Is Provided To Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getProvidesGovernedInterfaceToAccessFunctions <em>Provides Governed Interface To Access Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getProvidesEntities <em>Provides Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getConsumesEntities <em>Consumes Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsGovernedAndMeasuredByContracts <em>Is Governed And Measured By Contracts</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getResolvesEvents <em>Resolves Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsImplementedOnLogicalTechnologyComponents <em>Is Implemented On Logical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsRealizedThroughLogicalApplicationComponent <em>Is Realized Through Logical Application Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsOwnedAndGovernedByOrganizationUnits <em>Is Owned And Governed By Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsTrackedAgainstMeasures <em>Is Tracked Against Measures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getSupportsProcesses <em>Supports Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsRealizedByProcesses <em>Is Realized By Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getMeetsQualities <em>Meets Qualities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getConsumesServices <em>Consumes Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getDecomposesServices <em>Decomposes Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService()
 * @model abstract="true"
 * @generated
 */
public interface Service extends Standard {
	/**
	 * Returns the value of the '<em><b>Is Provided To Actors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Provided To Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Provided To Actors</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_IsProvidedToActors()
	 * @model
	 * @generated
	 */
	EList<Actor> getIsProvidedToActors();

	/**
	 * Returns the value of the '<em><b>Provides Governed Interface To Access Functions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsBoundedByServices <em>Is Bounded By Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Governed Interface To Access Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Governed Interface To Access Functions</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_ProvidesGovernedInterfaceToAccessFunctions()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsBoundedByServices
	 * @model opposite="isBoundedByServices"
	 * @generated
	 */
	EList<Function> getProvidesGovernedInterfaceToAccessFunctions();

	/**
	 * Returns the value of the '<em><b>Provides Entities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsUpdatedThroughServices <em>Is Updated Through Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Entities</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_ProvidesEntities()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsUpdatedThroughServices
	 * @model opposite="isUpdatedThroughServices"
	 * @generated
	 */
	EList<DataEntity> getProvidesEntities();

	/**
	 * Returns the value of the '<em><b>Consumes Entities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsAccessedByServices <em>Is Accessed By Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumes Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes Entities</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_ConsumesEntities()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity#getIsAccessedByServices
	 * @model opposite="isAccessedByServices"
	 * @generated
	 */
	EList<DataEntity> getConsumesEntities();

	/**
	 * Returns the value of the '<em><b>Is Governed And Measured By Contracts</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGovernsAndMeasuresBusinessServices <em>Governs And Measures Business Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Governed And Measured By Contracts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Governed And Measured By Contracts</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_IsGovernedAndMeasuredByContracts()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGovernsAndMeasuresBusinessServices
	 * @model opposite="governsAndMeasuresBusinessServices"
	 * @generated
	 */
	EList<Contract> getIsGovernedAndMeasuredByContracts();

	/**
	 * Returns the value of the '<em><b>Resolves Events</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByBusinessServices <em>Is Resolved By Business Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolves Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolves Events</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_ResolvesEvents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByBusinessServices
	 * @model opposite="isResolvedByBusinessServices"
	 * @generated
	 */
	EList<Event> getResolvesEvents();

	/**
	 * Returns the value of the '<em><b>Is Implemented On Logical Technology Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getProvidesPlatformForServices <em>Provides Platform For Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Implemented On Logical Technology Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Implemented On Logical Technology Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_IsImplementedOnLogicalTechnologyComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent#getProvidesPlatformForServices
	 * @model opposite="providesPlatformForServices"
	 * @generated
	 */
	EList<LogicalTechnologyComponent> getIsImplementedOnLogicalTechnologyComponents();

	/**
	 * Returns the value of the '<em><b>Is Realized Through Logical Application Component</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getImplementsServices <em>Implements Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Realized Through Logical Application Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Realized Through Logical Application Component</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_IsRealizedThroughLogicalApplicationComponent()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getImplementsServices
	 * @model opposite="implementsServices"
	 * @generated
	 */
	EList<LogicalApplicationComponent> getIsRealizedThroughLogicalApplicationComponent();

	/**
	 * Returns the value of the '<em><b>Is Owned And Governed By Organization Units</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOwnsAndGovernsServices <em>Owns And Governs Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Owned And Governed By Organization Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Owned And Governed By Organization Units</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_IsOwnedAndGovernedByOrganizationUnits()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getOwnsAndGovernsServices
	 * @model opposite="ownsAndGovernsServices"
	 * @generated
	 */
	EList<OrganizationUnit> getIsOwnedAndGovernedByOrganizationUnits();

	/**
	 * Returns the value of the '<em><b>Is Tracked Against Measures</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getSetsPerformanceCriteriaForServices <em>Sets Performance Criteria For Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tracked Against Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tracked Against Measures</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_IsTrackedAgainstMeasures()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure#getSetsPerformanceCriteriaForServices
	 * @model opposite="setsPerformanceCriteriaForServices"
	 * @generated
	 */
	EList<Measure> getIsTrackedAgainstMeasures();

	/**
	 * Returns the value of the '<em><b>Supports Processes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesServices <em>Decomposes Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Processes</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_SupportsProcesses()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesServices
	 * @model opposite="decomposesServices"
	 * @generated
	 */
	EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getSupportsProcesses();

	/**
	 * Returns the value of the '<em><b>Is Realized By Processes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getOrchestratesServices <em>Orchestrates Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Realized By Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Realized By Processes</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_IsRealizedByProcesses()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getOrchestratesServices
	 * @model opposite="orchestratesServices"
	 * @generated
	 */
	EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsRealizedByProcesses();

	/**
	 * Returns the value of the '<em><b>Meets Qualities</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality#getAppliesToServices <em>Applies To Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meets Qualities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meets Qualities</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_MeetsQualities()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality#getAppliesToServices
	 * @model opposite="appliesToServices"
	 * @generated
	 */
	EList<ServiceQuality> getMeetsQualities();

	/**
	 * Returns the value of the '<em><b>Consumes Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumes Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_ConsumesServices()
	 * @model
	 * @generated
	 */
	EList<Service> getConsumesServices();

	/**
	 * Returns the value of the '<em><b>Decomposes Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getService_DecomposesServices()
	 * @model
	 * @generated
	 */
	EList<Service> getDecomposesServices();

} // Service
