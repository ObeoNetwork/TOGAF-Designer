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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Application Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getStandardClass <em>Standard Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getStandardCreationDate <em>Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getLastStandardCreationDate <em>Last Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getNextStandardCreationDate <em>Next Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getRetireDate <em>Retire Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getExtendsLogicalApplicationComponents <em>Extends Logical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getIsHostedInLocation <em>Is Hosted In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getCommunicatesWith <em>Communicates With</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getLifeCycleStatus <em>Life Cycle Status</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getInitialLiveDate <em>Initial Live Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getDateOfLastRelease <em>Date Of Last Release</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getDateOfNextRelease <em>Date Of Next Release</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getRetirementDate <em>Retirement Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getAvailabilityQualityCharacteristics <em>Availability Quality Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getServicesTimes <em>Services Times</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getManageabilityCharacteristics <em>Manageability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getServiceabilityCharacteristics <em>Serviceability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getPerformanceCharacteristics <em>Performance Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getReliabilityCharacteristics <em>Reliability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getRecoverabilityCharacteristics <em>Recoverability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getLocatabilityCharacteristics <em>Locatability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getSecurityCharacteristics <em>Security Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getPrivacyCharacteristics <em>Privacy Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getIntegrityCharacteristics <em>Integrity Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getCredibilityCharacteristics <em>Credibility Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getLocalizationCharacteristics <em>Localization Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getInternationalizationCharacteristics <em>Internationalization Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getInteroperabilityCharacteristics <em>Interoperability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getScalabilityCharacteristics <em>Scalability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getPortabilityCharacteristics <em>Portability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getExtensibilityCharacteristics <em>Extensibility Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getCapacityCharacteristics <em>Capacity Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getThroughputPeriod <em>Throughput Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getGrowth <em>Growth</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getGrowthPeriod <em>Growth Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getPeakProfileShortTerm <em>Peak Profile Short Term</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getPeakProfileLongTerm <em>Peak Profile Long Term</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getEncapsulatesPhysicalDataComponents <em>Encapsulates Physical Data Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getIsRealizedByPhysicalTechnologyComponents <em>Is Realized By Physical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.PhysicalApplicationComponentImpl#getDecomposesPhysicalApplicationComponent <em>Decomposes Physical Application Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalApplicationComponentImpl extends ElementImpl implements PhysicalApplicationComponent {
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
	 * The cached value of the '{@link #getStandardClass() <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardClass()
	 * @generated
	 * @ordered
	 */
	protected StandardsClass standardClass = STANDARD_CLASS_EDEFAULT;

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
	 * The cached value of the '{@link #getStandardCreationDate() <em>Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date standardCreationDate = STANDARD_CREATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getLastStandardCreationDate() <em>Last Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastStandardCreationDate = LAST_STANDARD_CREATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getNextStandardCreationDate() <em>Next Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date nextStandardCreationDate = NEXT_STANDARD_CREATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getRetireDate() <em>Retire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetireDate()
	 * @generated
	 * @ordered
	 */
	protected Date retireDate = RETIRE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendsLogicalApplicationComponents() <em>Extends Logical Application Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsLogicalApplicationComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalApplicationComponent> extendsLogicalApplicationComponents;

	/**
	 * The cached value of the '{@link #getIsHostedInLocation() <em>Is Hosted In Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHostedInLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> isHostedInLocation;

	/**
	 * The cached value of the '{@link #getCommunicatesWith() <em>Communicates With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicatesWith()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalApplicationComponent> communicatesWith;

	/**
	 * The default value of the '{@link #getLifeCycleStatus() <em>Life Cycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycleStatus()
	 * @generated
	 * @ordered
	 */
	protected static final LifeCycleStatus LIFE_CYCLE_STATUS_EDEFAULT = LifeCycleStatus.PROPOSED;

	/**
	 * The cached value of the '{@link #getLifeCycleStatus() <em>Life Cycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycleStatus()
	 * @generated
	 * @ordered
	 */
	protected LifeCycleStatus lifeCycleStatus = LIFE_CYCLE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialLiveDate() <em>Initial Live Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date INITIAL_LIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialLiveDate() <em>Initial Live Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLiveDate()
	 * @generated
	 * @ordered
	 */
	protected Date initialLiveDate = INITIAL_LIVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfLastRelease() <em>Date Of Last Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfLastRelease()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_LAST_RELEASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfLastRelease() <em>Date Of Last Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfLastRelease()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfLastRelease = DATE_OF_LAST_RELEASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfNextRelease() <em>Date Of Next Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfNextRelease()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_NEXT_RELEASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfNextRelease() <em>Date Of Next Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfNextRelease()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfNextRelease = DATE_OF_NEXT_RELEASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetirementDate() <em>Retirement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetirementDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RETIREMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetirementDate() <em>Retirement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetirementDate()
	 * @generated
	 * @ordered
	 */
	protected Date retirementDate = RETIREMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityQualityCharacteristics() <em>Availability Quality Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityQualityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityQualityCharacteristics() <em>Availability Quality Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityQualityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String availabilityQualityCharacteristics = AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServicesTimes() <em>Services Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicesTimes()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICES_TIMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServicesTimes() <em>Services Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicesTimes()
	 * @generated
	 * @ordered
	 */
	protected String servicesTimes = SERVICES_TIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getManageabilityCharacteristics() <em>Manageability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManageabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGEABILITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManageabilityCharacteristics() <em>Manageability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManageabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String manageabilityCharacteristics = MANAGEABILITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceabilityCharacteristics() <em>Serviceability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICEABILITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceabilityCharacteristics() <em>Serviceability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String serviceabilityCharacteristics = SERVICEABILITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformanceCharacteristics() <em>Performance Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformanceCharacteristics() <em>Performance Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String performanceCharacteristics = PERFORMANCE_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReliabilityCharacteristics() <em>Reliability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String RELIABILITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReliabilityCharacteristics() <em>Reliability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String reliabilityCharacteristics = RELIABILITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoverabilityCharacteristics() <em>Recoverability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoverabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOVERABILITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecoverabilityCharacteristics() <em>Recoverability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoverabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String recoverabilityCharacteristics = RECOVERABILITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocatabilityCharacteristics() <em>Locatability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATABILITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocatabilityCharacteristics() <em>Locatability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String locatabilityCharacteristics = LOCATABILITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityCharacteristics() <em>Security Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityCharacteristics() <em>Security Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String securityCharacteristics = SECURITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivacyCharacteristics() <em>Privacy Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVACY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivacyCharacteristics() <em>Privacy Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String privacyCharacteristics = PRIVACY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegrityCharacteristics() <em>Integrity Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String INTEGRITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegrityCharacteristics() <em>Integrity Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String integrityCharacteristics = INTEGRITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredibilityCharacteristics() <em>Credibility Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredibilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDIBILITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCredibilityCharacteristics() <em>Credibility Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredibilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String credibilityCharacteristics = CREDIBILITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalizationCharacteristics() <em>Localization Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizationCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALIZATION_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalizationCharacteristics() <em>Localization Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizationCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String localizationCharacteristics = LOCALIZATION_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternationalizationCharacteristics() <em>Internationalization Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternationalizationCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternationalizationCharacteristics() <em>Internationalization Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternationalizationCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String internationalizationCharacteristics = INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInteroperabilityCharacteristics() <em>Interoperability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteroperabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String INTEROPERABILITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInteroperabilityCharacteristics() <em>Interoperability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteroperabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String interoperabilityCharacteristics = INTEROPERABILITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalabilityCharacteristics() <em>Scalability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALABILITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScalabilityCharacteristics() <em>Scalability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String scalabilityCharacteristics = SCALABILITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortabilityCharacteristics() <em>Portability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTABILITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortabilityCharacteristics() <em>Portability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String portabilityCharacteristics = PORTABILITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtensibilityCharacteristics() <em>Extensibility Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensibilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSIBILITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensibilityCharacteristics() <em>Extensibility Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensibilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String extensibilityCharacteristics = EXTENSIBILITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacityCharacteristics() <em>Capacity Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityCharacteristics() <em>Capacity Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String capacityCharacteristics = CAPACITY_CHARACTERISTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final String THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected String throughput = THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughputPeriod() <em>Throughput Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String THROUGHPUT_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughputPeriod() <em>Throughput Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputPeriod()
	 * @generated
	 * @ordered
	 */
	protected String throughputPeriod = THROUGHPUT_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrowth() <em>Growth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrowth()
	 * @generated
	 * @ordered
	 */
	protected static final String GROWTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrowth() <em>Growth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrowth()
	 * @generated
	 * @ordered
	 */
	protected String growth = GROWTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrowthPeriod() <em>Growth Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrowthPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String GROWTH_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrowthPeriod() <em>Growth Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrowthPeriod()
	 * @generated
	 * @ordered
	 */
	protected String growthPeriod = GROWTH_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeakProfileShortTerm() <em>Peak Profile Short Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakProfileShortTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String PEAK_PROFILE_SHORT_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeakProfileShortTerm() <em>Peak Profile Short Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakProfileShortTerm()
	 * @generated
	 * @ordered
	 */
	protected String peakProfileShortTerm = PEAK_PROFILE_SHORT_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeakProfileLongTerm() <em>Peak Profile Long Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakProfileLongTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String PEAK_PROFILE_LONG_TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeakProfileLongTerm() <em>Peak Profile Long Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakProfileLongTerm()
	 * @generated
	 * @ordered
	 */
	protected String peakProfileLongTerm = PEAK_PROFILE_LONG_TERM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEncapsulatesPhysicalDataComponents() <em>Encapsulates Physical Data Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatesPhysicalDataComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalDataComponent> encapsulatesPhysicalDataComponents;

	/**
	 * The cached value of the '{@link #getIsRealizedByPhysicalTechnologyComponents() <em>Is Realized By Physical Technology Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRealizedByPhysicalTechnologyComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalTechnologyComponent> isRealizedByPhysicalTechnologyComponents;

	/**
	 * The cached value of the '{@link #getDecomposesPhysicalApplicationComponent() <em>Decomposes Physical Application Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesPhysicalApplicationComponent()
	 * @generated
	 * @ordered
	 */
	protected PhysicalApplicationComponent decomposesPhysicalApplicationComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalApplicationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardsClass getStandardClass() {
		return standardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		StandardsClass oldStandardClass = standardClass;
		standardClass = newStandardClass == null ? STANDARD_CLASS_EDEFAULT : newStandardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS, oldStandardClass, standardClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return standardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		Date oldStandardCreationDate = standardCreationDate;
		standardCreationDate = newStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE, oldStandardCreationDate, standardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardCreationDate() {
		return lastStandardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardCreationDate(Date newLastStandardCreationDate) {
		Date oldLastStandardCreationDate = lastStandardCreationDate;
		lastStandardCreationDate = newLastStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE, oldLastStandardCreationDate, lastStandardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardCreationDate() {
		return nextStandardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardCreationDate(Date newNextStandardCreationDate) {
		Date oldNextStandardCreationDate = nextStandardCreationDate;
		nextStandardCreationDate = newNextStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE, oldNextStandardCreationDate, nextStandardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return retireDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		Date oldRetireDate = retireDate;
		retireDate = newRetireDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE, oldRetireDate, retireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalApplicationComponent> getExtendsLogicalApplicationComponents() {
		if (extendsLogicalApplicationComponents == null) {
			extendsLogicalApplicationComponents = new EObjectWithInverseResolvingEList.ManyInverse<LogicalApplicationComponent>(LogicalApplicationComponent.class, this, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS, ContentfwkPackage.LOGICAL_APPLICATION_COMPONENT__IS_EXTENDED_BY_PHYSICAL_APPLICATION_COMPONENTS);
		}
		return extendsLogicalApplicationComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getIsHostedInLocation() {
		if (isHostedInLocation == null) {
			isHostedInLocation = new EObjectWithInverseResolvingEList.ManyInverse<Location>(Location.class, this, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION, ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS);
		}
		return isHostedInLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalApplicationComponent> getCommunicatesWith() {
		if (communicatesWith == null) {
			communicatesWith = new EObjectResolvingEList<PhysicalApplicationComponent>(PhysicalApplicationComponent.class, this, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH);
		}
		return communicatesWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycleStatus getLifeCycleStatus() {
		return lifeCycleStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCycleStatus(LifeCycleStatus newLifeCycleStatus) {
		LifeCycleStatus oldLifeCycleStatus = lifeCycleStatus;
		lifeCycleStatus = newLifeCycleStatus == null ? LIFE_CYCLE_STATUS_EDEFAULT : newLifeCycleStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS, oldLifeCycleStatus, lifeCycleStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getInitialLiveDate() {
		return initialLiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialLiveDate(Date newInitialLiveDate) {
		Date oldInitialLiveDate = initialLiveDate;
		initialLiveDate = newInitialLiveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE, oldInitialLiveDate, initialLiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfLastRelease() {
		return dateOfLastRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfLastRelease(Date newDateOfLastRelease) {
		Date oldDateOfLastRelease = dateOfLastRelease;
		dateOfLastRelease = newDateOfLastRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE, oldDateOfLastRelease, dateOfLastRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfNextRelease() {
		return dateOfNextRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfNextRelease(Date newDateOfNextRelease) {
		Date oldDateOfNextRelease = dateOfNextRelease;
		dateOfNextRelease = newDateOfNextRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE, oldDateOfNextRelease, dateOfNextRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetirementDate() {
		return retirementDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetirementDate(Date newRetirementDate) {
		Date oldRetirementDate = retirementDate;
		retirementDate = newRetirementDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE, oldRetirementDate, retirementDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailabilityQualityCharacteristics() {
		return availabilityQualityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityQualityCharacteristics(String newAvailabilityQualityCharacteristics) {
		String oldAvailabilityQualityCharacteristics = availabilityQualityCharacteristics;
		availabilityQualityCharacteristics = newAvailabilityQualityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS, oldAvailabilityQualityCharacteristics, availabilityQualityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServicesTimes() {
		return servicesTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicesTimes(String newServicesTimes) {
		String oldServicesTimes = servicesTimes;
		servicesTimes = newServicesTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES, oldServicesTimes, servicesTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManageabilityCharacteristics() {
		return manageabilityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManageabilityCharacteristics(String newManageabilityCharacteristics) {
		String oldManageabilityCharacteristics = manageabilityCharacteristics;
		manageabilityCharacteristics = newManageabilityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS, oldManageabilityCharacteristics, manageabilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceabilityCharacteristics() {
		return serviceabilityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceabilityCharacteristics(String newServiceabilityCharacteristics) {
		String oldServiceabilityCharacteristics = serviceabilityCharacteristics;
		serviceabilityCharacteristics = newServiceabilityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS, oldServiceabilityCharacteristics, serviceabilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerformanceCharacteristics() {
		return performanceCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceCharacteristics(String newPerformanceCharacteristics) {
		String oldPerformanceCharacteristics = performanceCharacteristics;
		performanceCharacteristics = newPerformanceCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS, oldPerformanceCharacteristics, performanceCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReliabilityCharacteristics() {
		return reliabilityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliabilityCharacteristics(String newReliabilityCharacteristics) {
		String oldReliabilityCharacteristics = reliabilityCharacteristics;
		reliabilityCharacteristics = newReliabilityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS, oldReliabilityCharacteristics, reliabilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecoverabilityCharacteristics() {
		return recoverabilityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoverabilityCharacteristics(String newRecoverabilityCharacteristics) {
		String oldRecoverabilityCharacteristics = recoverabilityCharacteristics;
		recoverabilityCharacteristics = newRecoverabilityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS, oldRecoverabilityCharacteristics, recoverabilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocatabilityCharacteristics() {
		return locatabilityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocatabilityCharacteristics(String newLocatabilityCharacteristics) {
		String oldLocatabilityCharacteristics = locatabilityCharacteristics;
		locatabilityCharacteristics = newLocatabilityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS, oldLocatabilityCharacteristics, locatabilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityCharacteristics() {
		return securityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityCharacteristics(String newSecurityCharacteristics) {
		String oldSecurityCharacteristics = securityCharacteristics;
		securityCharacteristics = newSecurityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS, oldSecurityCharacteristics, securityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivacyCharacteristics() {
		return privacyCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacyCharacteristics(String newPrivacyCharacteristics) {
		String oldPrivacyCharacteristics = privacyCharacteristics;
		privacyCharacteristics = newPrivacyCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS, oldPrivacyCharacteristics, privacyCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntegrityCharacteristics() {
		return integrityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrityCharacteristics(String newIntegrityCharacteristics) {
		String oldIntegrityCharacteristics = integrityCharacteristics;
		integrityCharacteristics = newIntegrityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS, oldIntegrityCharacteristics, integrityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCredibilityCharacteristics() {
		return credibilityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredibilityCharacteristics(String newCredibilityCharacteristics) {
		String oldCredibilityCharacteristics = credibilityCharacteristics;
		credibilityCharacteristics = newCredibilityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS, oldCredibilityCharacteristics, credibilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalizationCharacteristics() {
		return localizationCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizationCharacteristics(String newLocalizationCharacteristics) {
		String oldLocalizationCharacteristics = localizationCharacteristics;
		localizationCharacteristics = newLocalizationCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS, oldLocalizationCharacteristics, localizationCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternationalizationCharacteristics() {
		return internationalizationCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternationalizationCharacteristics(String newInternationalizationCharacteristics) {
		String oldInternationalizationCharacteristics = internationalizationCharacteristics;
		internationalizationCharacteristics = newInternationalizationCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS, oldInternationalizationCharacteristics, internationalizationCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInteroperabilityCharacteristics() {
		return interoperabilityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteroperabilityCharacteristics(String newInteroperabilityCharacteristics) {
		String oldInteroperabilityCharacteristics = interoperabilityCharacteristics;
		interoperabilityCharacteristics = newInteroperabilityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS, oldInteroperabilityCharacteristics, interoperabilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalabilityCharacteristics() {
		return scalabilityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalabilityCharacteristics(String newScalabilityCharacteristics) {
		String oldScalabilityCharacteristics = scalabilityCharacteristics;
		scalabilityCharacteristics = newScalabilityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS, oldScalabilityCharacteristics, scalabilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortabilityCharacteristics() {
		return portabilityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortabilityCharacteristics(String newPortabilityCharacteristics) {
		String oldPortabilityCharacteristics = portabilityCharacteristics;
		portabilityCharacteristics = newPortabilityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS, oldPortabilityCharacteristics, portabilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensibilityCharacteristics() {
		return extensibilityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensibilityCharacteristics(String newExtensibilityCharacteristics) {
		String oldExtensibilityCharacteristics = extensibilityCharacteristics;
		extensibilityCharacteristics = newExtensibilityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS, oldExtensibilityCharacteristics, extensibilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacityCharacteristics() {
		return capacityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityCharacteristics(String newCapacityCharacteristics) {
		String oldCapacityCharacteristics = capacityCharacteristics;
		capacityCharacteristics = newCapacityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS, oldCapacityCharacteristics, capacityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(String newThroughput) {
		String oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT, oldThroughput, throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThroughputPeriod() {
		return throughputPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughputPeriod(String newThroughputPeriod) {
		String oldThroughputPeriod = throughputPeriod;
		throughputPeriod = newThroughputPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD, oldThroughputPeriod, throughputPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrowth() {
		return growth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrowth(String newGrowth) {
		String oldGrowth = growth;
		growth = newGrowth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH, oldGrowth, growth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrowthPeriod() {
		return growthPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrowthPeriod(String newGrowthPeriod) {
		String oldGrowthPeriod = growthPeriod;
		growthPeriod = newGrowthPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD, oldGrowthPeriod, growthPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeakProfileShortTerm() {
		return peakProfileShortTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeakProfileShortTerm(String newPeakProfileShortTerm) {
		String oldPeakProfileShortTerm = peakProfileShortTerm;
		peakProfileShortTerm = newPeakProfileShortTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM, oldPeakProfileShortTerm, peakProfileShortTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeakProfileLongTerm() {
		return peakProfileLongTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeakProfileLongTerm(String newPeakProfileLongTerm) {
		String oldPeakProfileLongTerm = peakProfileLongTerm;
		peakProfileLongTerm = newPeakProfileLongTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM, oldPeakProfileLongTerm, peakProfileLongTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalDataComponent> getEncapsulatesPhysicalDataComponents() {
		if (encapsulatesPhysicalDataComponents == null) {
			encapsulatesPhysicalDataComponents = new EObjectResolvingEList<PhysicalDataComponent>(PhysicalDataComponent.class, this, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS);
		}
		return encapsulatesPhysicalDataComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalTechnologyComponent> getIsRealizedByPhysicalTechnologyComponents() {
		if (isRealizedByPhysicalTechnologyComponents == null) {
			isRealizedByPhysicalTechnologyComponents = new EObjectResolvingEList<PhysicalTechnologyComponent>(PhysicalTechnologyComponent.class, this, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS);
		}
		return isRealizedByPhysicalTechnologyComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalApplicationComponent getDecomposesPhysicalApplicationComponent() {
		if (decomposesPhysicalApplicationComponent != null && decomposesPhysicalApplicationComponent.eIsProxy()) {
			InternalEObject oldDecomposesPhysicalApplicationComponent = (InternalEObject)decomposesPhysicalApplicationComponent;
			decomposesPhysicalApplicationComponent = (PhysicalApplicationComponent)eResolveProxy(oldDecomposesPhysicalApplicationComponent);
			if (decomposesPhysicalApplicationComponent != oldDecomposesPhysicalApplicationComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT, oldDecomposesPhysicalApplicationComponent, decomposesPhysicalApplicationComponent));
			}
		}
		return decomposesPhysicalApplicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalApplicationComponent basicGetDecomposesPhysicalApplicationComponent() {
		return decomposesPhysicalApplicationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesPhysicalApplicationComponent(PhysicalApplicationComponent newDecomposesPhysicalApplicationComponent) {
		PhysicalApplicationComponent oldDecomposesPhysicalApplicationComponent = decomposesPhysicalApplicationComponent;
		decomposesPhysicalApplicationComponent = newDecomposesPhysicalApplicationComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT, oldDecomposesPhysicalApplicationComponent, decomposesPhysicalApplicationComponent));
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
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendsLogicalApplicationComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsHostedInLocation()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<?>)getExtendsLogicalApplicationComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION:
				return ((InternalEList<?>)getIsHostedInLocation()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS:
				return getStandardClass();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
				return getStandardCreationDate();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return getLastStandardCreationDate();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return getNextStandardCreationDate();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE:
				return getRetireDate();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS:
				return getExtendsLogicalApplicationComponents();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION:
				return getIsHostedInLocation();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH:
				return getCommunicatesWith();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS:
				return getLifeCycleStatus();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE:
				return getInitialLiveDate();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE:
				return getDateOfLastRelease();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE:
				return getDateOfNextRelease();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE:
				return getRetirementDate();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS:
				return getAvailabilityQualityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES:
				return getServicesTimes();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS:
				return getManageabilityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS:
				return getServiceabilityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS:
				return getPerformanceCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS:
				return getReliabilityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS:
				return getRecoverabilityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS:
				return getLocatabilityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS:
				return getSecurityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS:
				return getPrivacyCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS:
				return getIntegrityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS:
				return getCredibilityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS:
				return getLocalizationCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS:
				return getInternationalizationCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS:
				return getInteroperabilityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS:
				return getScalabilityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS:
				return getPortabilityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS:
				return getExtensibilityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS:
				return getCapacityCharacteristics();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT:
				return getThroughput();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD:
				return getThroughputPeriod();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH:
				return getGrowth();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD:
				return getGrowthPeriod();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM:
				return getPeakProfileShortTerm();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM:
				return getPeakProfileLongTerm();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS:
				return getEncapsulatesPhysicalDataComponents();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return getIsRealizedByPhysicalTechnologyComponents();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT:
				if (resolve) return getDecomposesPhysicalApplicationComponent();
				return basicGetDecomposesPhysicalApplicationComponent();
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
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS:
				setStandardClass((StandardsClass)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
				setStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE:
				setRetireDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS:
				getExtendsLogicalApplicationComponents().clear();
				getExtendsLogicalApplicationComponents().addAll((Collection<? extends LogicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION:
				getIsHostedInLocation().clear();
				getIsHostedInLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH:
				getCommunicatesWith().clear();
				getCommunicatesWith().addAll((Collection<? extends PhysicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS:
				setLifeCycleStatus((LifeCycleStatus)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE:
				setInitialLiveDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE:
				setDateOfLastRelease((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE:
				setDateOfNextRelease((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE:
				setRetirementDate((Date)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS:
				setAvailabilityQualityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES:
				setServicesTimes((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS:
				setManageabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS:
				setServiceabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS:
				setPerformanceCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS:
				setReliabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS:
				setRecoverabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS:
				setLocatabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS:
				setSecurityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS:
				setPrivacyCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS:
				setIntegrityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS:
				setCredibilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS:
				setLocalizationCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS:
				setInternationalizationCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS:
				setInteroperabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS:
				setScalabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS:
				setPortabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS:
				setExtensibilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS:
				setCapacityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT:
				setThroughput((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD:
				setThroughputPeriod((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH:
				setGrowth((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD:
				setGrowthPeriod((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM:
				setPeakProfileShortTerm((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM:
				setPeakProfileLongTerm((String)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS:
				getEncapsulatesPhysicalDataComponents().clear();
				getEncapsulatesPhysicalDataComponents().addAll((Collection<? extends PhysicalDataComponent>)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				getIsRealizedByPhysicalTechnologyComponents().clear();
				getIsRealizedByPhysicalTechnologyComponents().addAll((Collection<? extends PhysicalTechnologyComponent>)newValue);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT:
				setDecomposesPhysicalApplicationComponent((PhysicalApplicationComponent)newValue);
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
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS:
				setStandardClass(STANDARD_CLASS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
				setStandardCreationDate(STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate(LAST_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate(NEXT_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE:
				setRetireDate(RETIRE_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS:
				getExtendsLogicalApplicationComponents().clear();
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION:
				getIsHostedInLocation().clear();
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH:
				getCommunicatesWith().clear();
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS:
				setLifeCycleStatus(LIFE_CYCLE_STATUS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE:
				setInitialLiveDate(INITIAL_LIVE_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE:
				setDateOfLastRelease(DATE_OF_LAST_RELEASE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE:
				setDateOfNextRelease(DATE_OF_NEXT_RELEASE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE:
				setRetirementDate(RETIREMENT_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS:
				setAvailabilityQualityCharacteristics(AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES:
				setServicesTimes(SERVICES_TIMES_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS:
				setManageabilityCharacteristics(MANAGEABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS:
				setServiceabilityCharacteristics(SERVICEABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS:
				setPerformanceCharacteristics(PERFORMANCE_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS:
				setReliabilityCharacteristics(RELIABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS:
				setRecoverabilityCharacteristics(RECOVERABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS:
				setLocatabilityCharacteristics(LOCATABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS:
				setSecurityCharacteristics(SECURITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS:
				setPrivacyCharacteristics(PRIVACY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS:
				setIntegrityCharacteristics(INTEGRITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS:
				setCredibilityCharacteristics(CREDIBILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS:
				setLocalizationCharacteristics(LOCALIZATION_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS:
				setInternationalizationCharacteristics(INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS:
				setInteroperabilityCharacteristics(INTEROPERABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS:
				setScalabilityCharacteristics(SCALABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS:
				setPortabilityCharacteristics(PORTABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS:
				setExtensibilityCharacteristics(EXTENSIBILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS:
				setCapacityCharacteristics(CAPACITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT:
				setThroughput(THROUGHPUT_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD:
				setThroughputPeriod(THROUGHPUT_PERIOD_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH:
				setGrowth(GROWTH_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD:
				setGrowthPeriod(GROWTH_PERIOD_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM:
				setPeakProfileShortTerm(PEAK_PROFILE_SHORT_TERM_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM:
				setPeakProfileLongTerm(PEAK_PROFILE_LONG_TERM_EDEFAULT);
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS:
				getEncapsulatesPhysicalDataComponents().clear();
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				getIsRealizedByPhysicalTechnologyComponents().clear();
				return;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT:
				setDecomposesPhysicalApplicationComponent((PhysicalApplicationComponent)null);
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
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS:
				return standardClass != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? standardCreationDate != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(standardCreationDate);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? lastStandardCreationDate != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(lastStandardCreationDate);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? nextStandardCreationDate != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(nextStandardCreationDate);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? retireDate != null : !RETIRE_DATE_EDEFAULT.equals(retireDate);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS:
				return extendsLogicalApplicationComponents != null && !extendsLogicalApplicationComponents.isEmpty();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION:
				return isHostedInLocation != null && !isHostedInLocation.isEmpty();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH:
				return communicatesWith != null && !communicatesWith.isEmpty();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS:
				return lifeCycleStatus != LIFE_CYCLE_STATUS_EDEFAULT;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE:
				return INITIAL_LIVE_DATE_EDEFAULT == null ? initialLiveDate != null : !INITIAL_LIVE_DATE_EDEFAULT.equals(initialLiveDate);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE:
				return DATE_OF_LAST_RELEASE_EDEFAULT == null ? dateOfLastRelease != null : !DATE_OF_LAST_RELEASE_EDEFAULT.equals(dateOfLastRelease);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE:
				return DATE_OF_NEXT_RELEASE_EDEFAULT == null ? dateOfNextRelease != null : !DATE_OF_NEXT_RELEASE_EDEFAULT.equals(dateOfNextRelease);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE:
				return RETIREMENT_DATE_EDEFAULT == null ? retirementDate != null : !RETIREMENT_DATE_EDEFAULT.equals(retirementDate);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS:
				return AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT == null ? availabilityQualityCharacteristics != null : !AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT.equals(availabilityQualityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES:
				return SERVICES_TIMES_EDEFAULT == null ? servicesTimes != null : !SERVICES_TIMES_EDEFAULT.equals(servicesTimes);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS:
				return MANAGEABILITY_CHARACTERISTICS_EDEFAULT == null ? manageabilityCharacteristics != null : !MANAGEABILITY_CHARACTERISTICS_EDEFAULT.equals(manageabilityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS:
				return SERVICEABILITY_CHARACTERISTICS_EDEFAULT == null ? serviceabilityCharacteristics != null : !SERVICEABILITY_CHARACTERISTICS_EDEFAULT.equals(serviceabilityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS:
				return PERFORMANCE_CHARACTERISTICS_EDEFAULT == null ? performanceCharacteristics != null : !PERFORMANCE_CHARACTERISTICS_EDEFAULT.equals(performanceCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS:
				return RELIABILITY_CHARACTERISTICS_EDEFAULT == null ? reliabilityCharacteristics != null : !RELIABILITY_CHARACTERISTICS_EDEFAULT.equals(reliabilityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS:
				return RECOVERABILITY_CHARACTERISTICS_EDEFAULT == null ? recoverabilityCharacteristics != null : !RECOVERABILITY_CHARACTERISTICS_EDEFAULT.equals(recoverabilityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS:
				return LOCATABILITY_CHARACTERISTICS_EDEFAULT == null ? locatabilityCharacteristics != null : !LOCATABILITY_CHARACTERISTICS_EDEFAULT.equals(locatabilityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS:
				return SECURITY_CHARACTERISTICS_EDEFAULT == null ? securityCharacteristics != null : !SECURITY_CHARACTERISTICS_EDEFAULT.equals(securityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS:
				return PRIVACY_CHARACTERISTICS_EDEFAULT == null ? privacyCharacteristics != null : !PRIVACY_CHARACTERISTICS_EDEFAULT.equals(privacyCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS:
				return INTEGRITY_CHARACTERISTICS_EDEFAULT == null ? integrityCharacteristics != null : !INTEGRITY_CHARACTERISTICS_EDEFAULT.equals(integrityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS:
				return CREDIBILITY_CHARACTERISTICS_EDEFAULT == null ? credibilityCharacteristics != null : !CREDIBILITY_CHARACTERISTICS_EDEFAULT.equals(credibilityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS:
				return LOCALIZATION_CHARACTERISTICS_EDEFAULT == null ? localizationCharacteristics != null : !LOCALIZATION_CHARACTERISTICS_EDEFAULT.equals(localizationCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS:
				return INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT == null ? internationalizationCharacteristics != null : !INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT.equals(internationalizationCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS:
				return INTEROPERABILITY_CHARACTERISTICS_EDEFAULT == null ? interoperabilityCharacteristics != null : !INTEROPERABILITY_CHARACTERISTICS_EDEFAULT.equals(interoperabilityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS:
				return SCALABILITY_CHARACTERISTICS_EDEFAULT == null ? scalabilityCharacteristics != null : !SCALABILITY_CHARACTERISTICS_EDEFAULT.equals(scalabilityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS:
				return PORTABILITY_CHARACTERISTICS_EDEFAULT == null ? portabilityCharacteristics != null : !PORTABILITY_CHARACTERISTICS_EDEFAULT.equals(portabilityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS:
				return EXTENSIBILITY_CHARACTERISTICS_EDEFAULT == null ? extensibilityCharacteristics != null : !EXTENSIBILITY_CHARACTERISTICS_EDEFAULT.equals(extensibilityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS:
				return CAPACITY_CHARACTERISTICS_EDEFAULT == null ? capacityCharacteristics != null : !CAPACITY_CHARACTERISTICS_EDEFAULT.equals(capacityCharacteristics);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT:
				return THROUGHPUT_EDEFAULT == null ? throughput != null : !THROUGHPUT_EDEFAULT.equals(throughput);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD:
				return THROUGHPUT_PERIOD_EDEFAULT == null ? throughputPeriod != null : !THROUGHPUT_PERIOD_EDEFAULT.equals(throughputPeriod);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH:
				return GROWTH_EDEFAULT == null ? growth != null : !GROWTH_EDEFAULT.equals(growth);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD:
				return GROWTH_PERIOD_EDEFAULT == null ? growthPeriod != null : !GROWTH_PERIOD_EDEFAULT.equals(growthPeriod);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM:
				return PEAK_PROFILE_SHORT_TERM_EDEFAULT == null ? peakProfileShortTerm != null : !PEAK_PROFILE_SHORT_TERM_EDEFAULT.equals(peakProfileShortTerm);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM:
				return PEAK_PROFILE_LONG_TERM_EDEFAULT == null ? peakProfileLongTerm != null : !PEAK_PROFILE_LONG_TERM_EDEFAULT.equals(peakProfileLongTerm);
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS:
				return encapsulatesPhysicalDataComponents != null && !encapsulatesPhysicalDataComponents.isEmpty();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return isRealizedByPhysicalTechnologyComponents != null && !isRealizedByPhysicalTechnologyComponents.isEmpty();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT:
				return decomposesPhysicalApplicationComponent != null;
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
				case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS: return ContentfwkPackage.STANDARD__STANDARD_CLASS;
				case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE;
				case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE: return ContentfwkPackage.STANDARD__RETIRE_DATE;
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
				case ContentfwkPackage.STANDARD__STANDARD_CLASS: return ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS;
				case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE: return ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__RETIRE_DATE: return ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (standardClass: ");
		result.append(standardClass);
		result.append(", standardCreationDate: ");
		result.append(standardCreationDate);
		result.append(", lastStandardCreationDate: ");
		result.append(lastStandardCreationDate);
		result.append(", nextStandardCreationDate: ");
		result.append(nextStandardCreationDate);
		result.append(", retireDate: ");
		result.append(retireDate);
		result.append(", lifeCycleStatus: ");
		result.append(lifeCycleStatus);
		result.append(", initialLiveDate: ");
		result.append(initialLiveDate);
		result.append(", dateOfLastRelease: ");
		result.append(dateOfLastRelease);
		result.append(", dateOfNextRelease: ");
		result.append(dateOfNextRelease);
		result.append(", retirementDate: ");
		result.append(retirementDate);
		result.append(", availabilityQualityCharacteristics: ");
		result.append(availabilityQualityCharacteristics);
		result.append(", servicesTimes: ");
		result.append(servicesTimes);
		result.append(", manageabilityCharacteristics: ");
		result.append(manageabilityCharacteristics);
		result.append(", serviceabilityCharacteristics: ");
		result.append(serviceabilityCharacteristics);
		result.append(", performanceCharacteristics: ");
		result.append(performanceCharacteristics);
		result.append(", reliabilityCharacteristics: ");
		result.append(reliabilityCharacteristics);
		result.append(", recoverabilityCharacteristics: ");
		result.append(recoverabilityCharacteristics);
		result.append(", locatabilityCharacteristics: ");
		result.append(locatabilityCharacteristics);
		result.append(", securityCharacteristics: ");
		result.append(securityCharacteristics);
		result.append(", privacyCharacteristics: ");
		result.append(privacyCharacteristics);
		result.append(", integrityCharacteristics: ");
		result.append(integrityCharacteristics);
		result.append(", credibilityCharacteristics: ");
		result.append(credibilityCharacteristics);
		result.append(", localizationCharacteristics: ");
		result.append(localizationCharacteristics);
		result.append(", internationalizationCharacteristics: ");
		result.append(internationalizationCharacteristics);
		result.append(", interoperabilityCharacteristics: ");
		result.append(interoperabilityCharacteristics);
		result.append(", scalabilityCharacteristics: ");
		result.append(scalabilityCharacteristics);
		result.append(", portabilityCharacteristics: ");
		result.append(portabilityCharacteristics);
		result.append(", extensibilityCharacteristics: ");
		result.append(extensibilityCharacteristics);
		result.append(", capacityCharacteristics: ");
		result.append(capacityCharacteristics);
		result.append(", throughput: ");
		result.append(throughput);
		result.append(", throughputPeriod: ");
		result.append(throughputPeriod);
		result.append(", growth: ");
		result.append(growth);
		result.append(", growthPeriod: ");
		result.append(growthPeriod);
		result.append(", peakProfileShortTerm: ");
		result.append(peakProfileShortTerm);
		result.append(", peakProfileLongTerm: ");
		result.append(peakProfileLongTerm);
		result.append(')');
		return result.toString();
	}

} //PhysicalApplicationComponentImpl
