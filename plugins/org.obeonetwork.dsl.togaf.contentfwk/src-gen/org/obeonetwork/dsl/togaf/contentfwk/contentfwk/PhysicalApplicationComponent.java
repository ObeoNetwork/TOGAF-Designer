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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Application Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getExtendsLogicalApplicationComponents <em>Extends Logical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsHostedInLocation <em>Is Hosted In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCommunicatesWith <em>Communicates With</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLifeCycleStatus <em>Life Cycle Status</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInitialLiveDate <em>Initial Live Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDateOfLastRelease <em>Date Of Last Release</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDateOfNextRelease <em>Date Of Next Release</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getRetirementDate <em>Retirement Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getAvailabilityCharacteristics <em>Availability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getServicesTimes <em>Services Times</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getManageabilityCharacteristics <em>Manageability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getServiceabilityCharacteristics <em>Serviceability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPerformanceCharacteristics <em>Performance Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getReliabilityCharacteristics <em>Reliability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getRecoverabilityCharacteristics <em>Recoverability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLocatabilityCharacteristics <em>Locatability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getSecurityCharacteristics <em>Security Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPrivacyCharacteristics <em>Privacy Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIntegrityCharacteristics <em>Integrity Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCredibilityCharacteristics <em>Credibility Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLocalizationCharacteristics <em>Localization Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInternationalizationCharacteristics <em>Internationalization Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInteroperabilityCharacteristics <em>Interoperability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getScalabilityCharacteristics <em>Scalability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPortabilityCharacteristics <em>Portability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getExtensibilityCharacteristics <em>Extensibility Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCapacityCharacteristics <em>Capacity Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getThroughputPeriod <em>Throughput Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getGrowth <em>Growth</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getGrowthPeriod <em>Growth Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPeakProfileShortTerm <em>Peak Profile Short Term</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPeakProfileLongTerm <em>Peak Profile Long Term</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getEncapsulatesPhysicalDataComponents <em>Encapsulates Physical Data Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsRealizedByPhysicalTechnologyComponents <em>Is Realized By Physical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDecomposesPhysicalApplicationComponent <em>Decomposes Physical Application Component</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsDecomposedByPhysicalApplicationComponents <em>Is Decomposed By Physical Application Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent()
 * @model
 * @generated
 */
public interface PhysicalApplicationComponent extends Element, ApplicationComponent {
	/**
	 * Returns the value of the '<em><b>Extends Logical Application Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getIsExtendedByPhysicalApplicationComponents <em>Is Extended By Physical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends Logical Application Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Logical Application Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_ExtendsLogicalApplicationComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent#getIsExtendedByPhysicalApplicationComponents
	 * @model opposite="isExtendedByPhysicalApplicationComponents"
	 * @generated
	 */
	EList<LogicalApplicationComponent> getExtendsLogicalApplicationComponents();

	/**
	 * Returns the value of the '<em><b>Is Hosted In Location</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalApplicationComponents <em>Contains Physical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Hosted In Location</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Hosted In Location</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_IsHostedInLocation()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location#getContainsPhysicalApplicationComponents
	 * @model opposite="containsPhysicalApplicationComponents"
	 * @generated
	 */
	EList<Location> getIsHostedInLocation();

	/**
	 * Returns the value of the '<em><b>Communicates With</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicates With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicates With</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_CommunicatesWith()
	 * @model
	 * @generated
	 */
	EList<PhysicalApplicationComponent> getCommunicatesWith();

	/**
	 * Returns the value of the '<em><b>Life Cycle Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Life Cycle Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Cycle Status</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus
	 * @see #setLifeCycleStatus(LifeCycleStatus)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_LifeCycleStatus()
	 * @model required="true"
	 * @generated
	 */
	LifeCycleStatus getLifeCycleStatus();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLifeCycleStatus <em>Life Cycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Cycle Status</em>' attribute.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus
	 * @see #getLifeCycleStatus()
	 * @generated
	 */
	void setLifeCycleStatus(LifeCycleStatus value);

	/**
	 * Returns the value of the '<em><b>Initial Live Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Live Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Live Date</em>' attribute.
	 * @see #setInitialLiveDate(Date)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_InitialLiveDate()
	 * @model
	 * @generated
	 */
	Date getInitialLiveDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInitialLiveDate <em>Initial Live Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Live Date</em>' attribute.
	 * @see #getInitialLiveDate()
	 * @generated
	 */
	void setInitialLiveDate(Date value);

	/**
	 * Returns the value of the '<em><b>Date Of Last Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Last Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Last Release</em>' attribute.
	 * @see #setDateOfLastRelease(Date)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_DateOfLastRelease()
	 * @model
	 * @generated
	 */
	Date getDateOfLastRelease();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDateOfLastRelease <em>Date Of Last Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Last Release</em>' attribute.
	 * @see #getDateOfLastRelease()
	 * @generated
	 */
	void setDateOfLastRelease(Date value);

	/**
	 * Returns the value of the '<em><b>Date Of Next Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Next Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Next Release</em>' attribute.
	 * @see #setDateOfNextRelease(Date)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_DateOfNextRelease()
	 * @model
	 * @generated
	 */
	Date getDateOfNextRelease();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDateOfNextRelease <em>Date Of Next Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Next Release</em>' attribute.
	 * @see #getDateOfNextRelease()
	 * @generated
	 */
	void setDateOfNextRelease(Date value);

	/**
	 * Returns the value of the '<em><b>Retirement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retirement Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retirement Date</em>' attribute.
	 * @see #setRetirementDate(Date)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_RetirementDate()
	 * @model
	 * @generated
	 */
	Date getRetirementDate();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getRetirementDate <em>Retirement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retirement Date</em>' attribute.
	 * @see #getRetirementDate()
	 * @generated
	 */
	void setRetirementDate(Date value);

	/**
	 * Returns the value of the '<em><b>Availability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Characteristics</em>' attribute.
	 * @see #setAvailabilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_AvailabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getAvailabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getAvailabilityCharacteristics <em>Availability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Characteristics</em>' attribute.
	 * @see #getAvailabilityCharacteristics()
	 * @generated
	 */
	void setAvailabilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Services Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services Times</em>' attribute.
	 * @see #setServicesTimes(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_ServicesTimes()
	 * @model
	 * @generated
	 */
	String getServicesTimes();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getServicesTimes <em>Services Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services Times</em>' attribute.
	 * @see #getServicesTimes()
	 * @generated
	 */
	void setServicesTimes(String value);

	/**
	 * Returns the value of the '<em><b>Manageability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manageability Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manageability Characteristics</em>' attribute.
	 * @see #setManageabilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_ManageabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getManageabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getManageabilityCharacteristics <em>Manageability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manageability Characteristics</em>' attribute.
	 * @see #getManageabilityCharacteristics()
	 * @generated
	 */
	void setManageabilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Serviceability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviceability Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceability Characteristics</em>' attribute.
	 * @see #setServiceabilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_ServiceabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getServiceabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getServiceabilityCharacteristics <em>Serviceability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviceability Characteristics</em>' attribute.
	 * @see #getServiceabilityCharacteristics()
	 * @generated
	 */
	void setServiceabilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Performance Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Characteristics</em>' attribute.
	 * @see #setPerformanceCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_PerformanceCharacteristics()
	 * @model
	 * @generated
	 */
	String getPerformanceCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPerformanceCharacteristics <em>Performance Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Characteristics</em>' attribute.
	 * @see #getPerformanceCharacteristics()
	 * @generated
	 */
	void setPerformanceCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Reliability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability Characteristics</em>' attribute.
	 * @see #setReliabilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_ReliabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getReliabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getReliabilityCharacteristics <em>Reliability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability Characteristics</em>' attribute.
	 * @see #getReliabilityCharacteristics()
	 * @generated
	 */
	void setReliabilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Recoverability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recoverability Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recoverability Characteristics</em>' attribute.
	 * @see #setRecoverabilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_RecoverabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getRecoverabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getRecoverabilityCharacteristics <em>Recoverability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recoverability Characteristics</em>' attribute.
	 * @see #getRecoverabilityCharacteristics()
	 * @generated
	 */
	void setRecoverabilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Locatability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locatability Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locatability Characteristics</em>' attribute.
	 * @see #setLocatabilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_LocatabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getLocatabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLocatabilityCharacteristics <em>Locatability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locatability Characteristics</em>' attribute.
	 * @see #getLocatabilityCharacteristics()
	 * @generated
	 */
	void setLocatabilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Security Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Characteristics</em>' attribute.
	 * @see #setSecurityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_SecurityCharacteristics()
	 * @model
	 * @generated
	 */
	String getSecurityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getSecurityCharacteristics <em>Security Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Characteristics</em>' attribute.
	 * @see #getSecurityCharacteristics()
	 * @generated
	 */
	void setSecurityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Privacy Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privacy Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privacy Characteristics</em>' attribute.
	 * @see #setPrivacyCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_PrivacyCharacteristics()
	 * @model
	 * @generated
	 */
	String getPrivacyCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPrivacyCharacteristics <em>Privacy Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privacy Characteristics</em>' attribute.
	 * @see #getPrivacyCharacteristics()
	 * @generated
	 */
	void setPrivacyCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Integrity Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrity Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrity Characteristics</em>' attribute.
	 * @see #setIntegrityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_IntegrityCharacteristics()
	 * @model
	 * @generated
	 */
	String getIntegrityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIntegrityCharacteristics <em>Integrity Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity Characteristics</em>' attribute.
	 * @see #getIntegrityCharacteristics()
	 * @generated
	 */
	void setIntegrityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Credibility Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credibility Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credibility Characteristics</em>' attribute.
	 * @see #setCredibilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_CredibilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getCredibilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCredibilityCharacteristics <em>Credibility Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credibility Characteristics</em>' attribute.
	 * @see #getCredibilityCharacteristics()
	 * @generated
	 */
	void setCredibilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Localization Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localization Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localization Characteristics</em>' attribute.
	 * @see #setLocalizationCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_LocalizationCharacteristics()
	 * @model
	 * @generated
	 */
	String getLocalizationCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getLocalizationCharacteristics <em>Localization Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localization Characteristics</em>' attribute.
	 * @see #getLocalizationCharacteristics()
	 * @generated
	 */
	void setLocalizationCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Internationalization Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internationalization Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internationalization Characteristics</em>' attribute.
	 * @see #setInternationalizationCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_InternationalizationCharacteristics()
	 * @model
	 * @generated
	 */
	String getInternationalizationCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInternationalizationCharacteristics <em>Internationalization Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internationalization Characteristics</em>' attribute.
	 * @see #getInternationalizationCharacteristics()
	 * @generated
	 */
	void setInternationalizationCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Interoperability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interoperability Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interoperability Characteristics</em>' attribute.
	 * @see #setInteroperabilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_InteroperabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getInteroperabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getInteroperabilityCharacteristics <em>Interoperability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interoperability Characteristics</em>' attribute.
	 * @see #getInteroperabilityCharacteristics()
	 * @generated
	 */
	void setInteroperabilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Scalability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalability Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalability Characteristics</em>' attribute.
	 * @see #setScalabilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_ScalabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getScalabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getScalabilityCharacteristics <em>Scalability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalability Characteristics</em>' attribute.
	 * @see #getScalabilityCharacteristics()
	 * @generated
	 */
	void setScalabilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Portability Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portability Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portability Characteristics</em>' attribute.
	 * @see #setPortabilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_PortabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getPortabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPortabilityCharacteristics <em>Portability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portability Characteristics</em>' attribute.
	 * @see #getPortabilityCharacteristics()
	 * @generated
	 */
	void setPortabilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Extensibility Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensibility Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensibility Characteristics</em>' attribute.
	 * @see #setExtensibilityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_ExtensibilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getExtensibilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getExtensibilityCharacteristics <em>Extensibility Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensibility Characteristics</em>' attribute.
	 * @see #getExtensibilityCharacteristics()
	 * @generated
	 */
	void setExtensibilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Capacity Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity Characteristics</em>' attribute.
	 * @see #setCapacityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_CapacityCharacteristics()
	 * @model
	 * @generated
	 */
	String getCapacityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getCapacityCharacteristics <em>Capacity Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity Characteristics</em>' attribute.
	 * @see #getCapacityCharacteristics()
	 * @generated
	 */
	void setCapacityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see #setThroughput(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_Throughput()
	 * @model
	 * @generated
	 */
	String getThroughput();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(String value);

	/**
	 * Returns the value of the '<em><b>Throughput Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput Period</em>' attribute.
	 * @see #setThroughputPeriod(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_ThroughputPeriod()
	 * @model
	 * @generated
	 */
	String getThroughputPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getThroughputPeriod <em>Throughput Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput Period</em>' attribute.
	 * @see #getThroughputPeriod()
	 * @generated
	 */
	void setThroughputPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Growth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Growth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Growth</em>' attribute.
	 * @see #setGrowth(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_Growth()
	 * @model
	 * @generated
	 */
	String getGrowth();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getGrowth <em>Growth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Growth</em>' attribute.
	 * @see #getGrowth()
	 * @generated
	 */
	void setGrowth(String value);

	/**
	 * Returns the value of the '<em><b>Growth Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Growth Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Growth Period</em>' attribute.
	 * @see #setGrowthPeriod(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_GrowthPeriod()
	 * @model
	 * @generated
	 */
	String getGrowthPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getGrowthPeriod <em>Growth Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Growth Period</em>' attribute.
	 * @see #getGrowthPeriod()
	 * @generated
	 */
	void setGrowthPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Peak Profile Short Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peak Profile Short Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peak Profile Short Term</em>' attribute.
	 * @see #setPeakProfileShortTerm(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_PeakProfileShortTerm()
	 * @model
	 * @generated
	 */
	String getPeakProfileShortTerm();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPeakProfileShortTerm <em>Peak Profile Short Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak Profile Short Term</em>' attribute.
	 * @see #getPeakProfileShortTerm()
	 * @generated
	 */
	void setPeakProfileShortTerm(String value);

	/**
	 * Returns the value of the '<em><b>Peak Profile Long Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peak Profile Long Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peak Profile Long Term</em>' attribute.
	 * @see #setPeakProfileLongTerm(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_PeakProfileLongTerm()
	 * @model
	 * @generated
	 */
	String getPeakProfileLongTerm();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getPeakProfileLongTerm <em>Peak Profile Long Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak Profile Long Term</em>' attribute.
	 * @see #getPeakProfileLongTerm()
	 * @generated
	 */
	void setPeakProfileLongTerm(String value);

	/**
	 * Returns the value of the '<em><b>Encapsulates Physical Data Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getEncapsulatesPhysicalApplicationComponents <em>Encapsulates Physical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encapsulates Physical Data Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates Physical Data Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_EncapsulatesPhysicalDataComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent#getEncapsulatesPhysicalApplicationComponents
	 * @model opposite="encapsulatesPhysicalApplicationComponents"
	 * @generated
	 */
	EList<PhysicalDataComponent> getEncapsulatesPhysicalDataComponents();

	/**
	 * Returns the value of the '<em><b>Is Realized By Physical Technology Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getRealizesPhysicalApplicationComponents <em>Realizes Physical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Realized By Physical Technology Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Realized By Physical Technology Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_IsRealizedByPhysicalTechnologyComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent#getRealizesPhysicalApplicationComponents
	 * @model opposite="realizesPhysicalApplicationComponents"
	 * @generated
	 */
	EList<PhysicalTechnologyComponent> getIsRealizedByPhysicalTechnologyComponents();

	/**
	 * Returns the value of the '<em><b>Decomposes Physical Application Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsDecomposedByPhysicalApplicationComponents <em>Is Decomposed By Physical Application Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Physical Application Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Physical Application Component</em>' reference.
	 * @see #setDecomposesPhysicalApplicationComponent(PhysicalApplicationComponent)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_DecomposesPhysicalApplicationComponent()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getIsDecomposedByPhysicalApplicationComponents
	 * @model opposite="isDecomposedByPhysicalApplicationComponents"
	 * @generated
	 */
	PhysicalApplicationComponent getDecomposesPhysicalApplicationComponent();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDecomposesPhysicalApplicationComponent <em>Decomposes Physical Application Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Physical Application Component</em>' reference.
	 * @see #getDecomposesPhysicalApplicationComponent()
	 * @generated
	 */
	void setDecomposesPhysicalApplicationComponent(PhysicalApplicationComponent value);

	/**
	 * Returns the value of the '<em><b>Is Decomposed By Physical Application Components</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDecomposesPhysicalApplicationComponent <em>Decomposes Physical Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By Physical Application Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By Physical Application Components</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPhysicalApplicationComponent_IsDecomposedByPhysicalApplicationComponents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent#getDecomposesPhysicalApplicationComponent
	 * @model opposite="decomposesPhysicalApplicationComponent"
	 * @generated
	 */
	EList<PhysicalApplicationComponent> getIsDecomposedByPhysicalApplicationComponents();

} // PhysicalApplicationComponent
