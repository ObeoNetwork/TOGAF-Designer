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
	 * The default value of the '{@link #getLifeCycleStatus() <em>Life Cycle Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycleStatus()
	 * @generated
	 * @ordered
	 */
	protected static final LifeCycleStatus LIFE_CYCLE_STATUS_EDEFAULT = LifeCycleStatus.PROPOSED;
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
	 * The default value of the '{@link #getDateOfLastRelease() <em>Date Of Last Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfLastRelease()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_LAST_RELEASE_EDEFAULT = null;
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
	 * The default value of the '{@link #getRetirementDate() <em>Retirement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetirementDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RETIREMENT_DATE_EDEFAULT = null;
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
	 * The default value of the '{@link #getServicesTimes() <em>Services Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicesTimes()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICES_TIMES_EDEFAULT = null;
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
	 * The default value of the '{@link #getServiceabilityCharacteristics() <em>Serviceability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICEABILITY_CHARACTERISTICS_EDEFAULT = null;
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
	 * The default value of the '{@link #getReliabilityCharacteristics() <em>Reliability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String RELIABILITY_CHARACTERISTICS_EDEFAULT = null;
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
	 * The default value of the '{@link #getLocatabilityCharacteristics() <em>Locatability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATABILITY_CHARACTERISTICS_EDEFAULT = null;
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
	 * The default value of the '{@link #getPrivacyCharacteristics() <em>Privacy Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVACY_CHARACTERISTICS_EDEFAULT = null;
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
	 * The default value of the '{@link #getCredibilityCharacteristics() <em>Credibility Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredibilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDIBILITY_CHARACTERISTICS_EDEFAULT = null;
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
	 * The default value of the '{@link #getInternationalizationCharacteristics() <em>Internationalization Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternationalizationCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT = null;
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
	 * The default value of the '{@link #getScalabilityCharacteristics() <em>Scalability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalabilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALABILITY_CHARACTERISTICS_EDEFAULT = null;
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
	 * The default value of the '{@link #getExtensibilityCharacteristics() <em>Extensibility Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensibilityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSIBILITY_CHARACTERISTICS_EDEFAULT = null;
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
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final String THROUGHPUT_EDEFAULT = null;
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
	 * The default value of the '{@link #getGrowth() <em>Growth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrowth()
	 * @generated
	 * @ordered
	 */
	protected static final String GROWTH_EDEFAULT = null;
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
	 * The default value of the '{@link #getPeakProfileShortTerm() <em>Peak Profile Short Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakProfileShortTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String PEAK_PROFILE_SHORT_TERM_EDEFAULT = null;
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
		return (StandardsClass)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, newStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardCreationDate(Date newLastStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, newLastStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardCreationDate(Date newNextStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, newNextStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, newRetireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalApplicationComponent> getExtendsLogicalApplicationComponents() {
		return (EList<LogicalApplicationComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Location> getIsHostedInLocation() {
		return (EList<Location>)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalApplicationComponent> getCommunicatesWith() {
		return (EList<PhysicalApplicationComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycleStatus getLifeCycleStatus() {
		return (LifeCycleStatus)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCycleStatus(LifeCycleStatus newLifeCycleStatus) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS, newLifeCycleStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getInitialLiveDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialLiveDate(Date newInitialLiveDate) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE, newInitialLiveDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfLastRelease() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfLastRelease(Date newDateOfLastRelease) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE, newDateOfLastRelease);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfNextRelease() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfNextRelease(Date newDateOfNextRelease) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE, newDateOfNextRelease);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetirementDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetirementDate(Date newRetirementDate) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE, newRetirementDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailabilityQualityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityQualityCharacteristics(String newAvailabilityQualityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS, newAvailabilityQualityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServicesTimes() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicesTimes(String newServicesTimes) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES, newServicesTimes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManageabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManageabilityCharacteristics(String newManageabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS, newManageabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceabilityCharacteristics(String newServiceabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS, newServiceabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerformanceCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceCharacteristics(String newPerformanceCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS, newPerformanceCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReliabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliabilityCharacteristics(String newReliabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS, newReliabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecoverabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoverabilityCharacteristics(String newRecoverabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS, newRecoverabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocatabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocatabilityCharacteristics(String newLocatabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS, newLocatabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityCharacteristics(String newSecurityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS, newSecurityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivacyCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacyCharacteristics(String newPrivacyCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS, newPrivacyCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntegrityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrityCharacteristics(String newIntegrityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS, newIntegrityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCredibilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredibilityCharacteristics(String newCredibilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS, newCredibilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalizationCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizationCharacteristics(String newLocalizationCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS, newLocalizationCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternationalizationCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternationalizationCharacteristics(String newInternationalizationCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS, newInternationalizationCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInteroperabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteroperabilityCharacteristics(String newInteroperabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS, newInteroperabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalabilityCharacteristics(String newScalabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS, newScalabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortabilityCharacteristics(String newPortabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS, newPortabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensibilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensibilityCharacteristics(String newExtensibilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS, newExtensibilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityCharacteristics(String newCapacityCharacteristics) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS, newCapacityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThroughput() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(String newThroughput) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT, newThroughput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThroughputPeriod() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughputPeriod(String newThroughputPeriod) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD, newThroughputPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrowth() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__GROWTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrowth(String newGrowth) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__GROWTH, newGrowth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrowthPeriod() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrowthPeriod(String newGrowthPeriod) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD, newGrowthPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeakProfileShortTerm() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeakProfileShortTerm(String newPeakProfileShortTerm) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM, newPeakProfileShortTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeakProfileLongTerm() {
		return (String)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeakProfileLongTerm(String newPeakProfileLongTerm) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM, newPeakProfileLongTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalDataComponent> getEncapsulatesPhysicalDataComponents() {
		return (EList<PhysicalDataComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalTechnologyComponent> getIsRealizedByPhysicalTechnologyComponents() {
		return (EList<PhysicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalApplicationComponent getDecomposesPhysicalApplicationComponent() {
		return (PhysicalApplicationComponent)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalApplicationComponent basicGetDecomposesPhysicalApplicationComponent() {
		return (PhysicalApplicationComponent)eDynamicGet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesPhysicalApplicationComponent(PhysicalApplicationComponent newDecomposesPhysicalApplicationComponent) {
		eDynamicSet(ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT, ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT, newDecomposesPhysicalApplicationComponent);
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
				return getStandardClass() != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? getStandardCreationDate() != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(getStandardCreationDate());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? getLastStandardCreationDate() != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(getLastStandardCreationDate());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? getNextStandardCreationDate() != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(getNextStandardCreationDate());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? getRetireDate() != null : !RETIRE_DATE_EDEFAULT.equals(getRetireDate());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS:
				return !getExtendsLogicalApplicationComponents().isEmpty();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION:
				return !getIsHostedInLocation().isEmpty();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH:
				return !getCommunicatesWith().isEmpty();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS:
				return getLifeCycleStatus() != LIFE_CYCLE_STATUS_EDEFAULT;
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE:
				return INITIAL_LIVE_DATE_EDEFAULT == null ? getInitialLiveDate() != null : !INITIAL_LIVE_DATE_EDEFAULT.equals(getInitialLiveDate());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE:
				return DATE_OF_LAST_RELEASE_EDEFAULT == null ? getDateOfLastRelease() != null : !DATE_OF_LAST_RELEASE_EDEFAULT.equals(getDateOfLastRelease());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE:
				return DATE_OF_NEXT_RELEASE_EDEFAULT == null ? getDateOfNextRelease() != null : !DATE_OF_NEXT_RELEASE_EDEFAULT.equals(getDateOfNextRelease());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE:
				return RETIREMENT_DATE_EDEFAULT == null ? getRetirementDate() != null : !RETIREMENT_DATE_EDEFAULT.equals(getRetirementDate());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS:
				return AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT == null ? getAvailabilityQualityCharacteristics() != null : !AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT.equals(getAvailabilityQualityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES:
				return SERVICES_TIMES_EDEFAULT == null ? getServicesTimes() != null : !SERVICES_TIMES_EDEFAULT.equals(getServicesTimes());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS:
				return MANAGEABILITY_CHARACTERISTICS_EDEFAULT == null ? getManageabilityCharacteristics() != null : !MANAGEABILITY_CHARACTERISTICS_EDEFAULT.equals(getManageabilityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS:
				return SERVICEABILITY_CHARACTERISTICS_EDEFAULT == null ? getServiceabilityCharacteristics() != null : !SERVICEABILITY_CHARACTERISTICS_EDEFAULT.equals(getServiceabilityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS:
				return PERFORMANCE_CHARACTERISTICS_EDEFAULT == null ? getPerformanceCharacteristics() != null : !PERFORMANCE_CHARACTERISTICS_EDEFAULT.equals(getPerformanceCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS:
				return RELIABILITY_CHARACTERISTICS_EDEFAULT == null ? getReliabilityCharacteristics() != null : !RELIABILITY_CHARACTERISTICS_EDEFAULT.equals(getReliabilityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS:
				return RECOVERABILITY_CHARACTERISTICS_EDEFAULT == null ? getRecoverabilityCharacteristics() != null : !RECOVERABILITY_CHARACTERISTICS_EDEFAULT.equals(getRecoverabilityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS:
				return LOCATABILITY_CHARACTERISTICS_EDEFAULT == null ? getLocatabilityCharacteristics() != null : !LOCATABILITY_CHARACTERISTICS_EDEFAULT.equals(getLocatabilityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS:
				return SECURITY_CHARACTERISTICS_EDEFAULT == null ? getSecurityCharacteristics() != null : !SECURITY_CHARACTERISTICS_EDEFAULT.equals(getSecurityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS:
				return PRIVACY_CHARACTERISTICS_EDEFAULT == null ? getPrivacyCharacteristics() != null : !PRIVACY_CHARACTERISTICS_EDEFAULT.equals(getPrivacyCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS:
				return INTEGRITY_CHARACTERISTICS_EDEFAULT == null ? getIntegrityCharacteristics() != null : !INTEGRITY_CHARACTERISTICS_EDEFAULT.equals(getIntegrityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS:
				return CREDIBILITY_CHARACTERISTICS_EDEFAULT == null ? getCredibilityCharacteristics() != null : !CREDIBILITY_CHARACTERISTICS_EDEFAULT.equals(getCredibilityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS:
				return LOCALIZATION_CHARACTERISTICS_EDEFAULT == null ? getLocalizationCharacteristics() != null : !LOCALIZATION_CHARACTERISTICS_EDEFAULT.equals(getLocalizationCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS:
				return INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT == null ? getInternationalizationCharacteristics() != null : !INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT.equals(getInternationalizationCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS:
				return INTEROPERABILITY_CHARACTERISTICS_EDEFAULT == null ? getInteroperabilityCharacteristics() != null : !INTEROPERABILITY_CHARACTERISTICS_EDEFAULT.equals(getInteroperabilityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS:
				return SCALABILITY_CHARACTERISTICS_EDEFAULT == null ? getScalabilityCharacteristics() != null : !SCALABILITY_CHARACTERISTICS_EDEFAULT.equals(getScalabilityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS:
				return PORTABILITY_CHARACTERISTICS_EDEFAULT == null ? getPortabilityCharacteristics() != null : !PORTABILITY_CHARACTERISTICS_EDEFAULT.equals(getPortabilityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS:
				return EXTENSIBILITY_CHARACTERISTICS_EDEFAULT == null ? getExtensibilityCharacteristics() != null : !EXTENSIBILITY_CHARACTERISTICS_EDEFAULT.equals(getExtensibilityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS:
				return CAPACITY_CHARACTERISTICS_EDEFAULT == null ? getCapacityCharacteristics() != null : !CAPACITY_CHARACTERISTICS_EDEFAULT.equals(getCapacityCharacteristics());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT:
				return THROUGHPUT_EDEFAULT == null ? getThroughput() != null : !THROUGHPUT_EDEFAULT.equals(getThroughput());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD:
				return THROUGHPUT_PERIOD_EDEFAULT == null ? getThroughputPeriod() != null : !THROUGHPUT_PERIOD_EDEFAULT.equals(getThroughputPeriod());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH:
				return GROWTH_EDEFAULT == null ? getGrowth() != null : !GROWTH_EDEFAULT.equals(getGrowth());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD:
				return GROWTH_PERIOD_EDEFAULT == null ? getGrowthPeriod() != null : !GROWTH_PERIOD_EDEFAULT.equals(getGrowthPeriod());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM:
				return PEAK_PROFILE_SHORT_TERM_EDEFAULT == null ? getPeakProfileShortTerm() != null : !PEAK_PROFILE_SHORT_TERM_EDEFAULT.equals(getPeakProfileShortTerm());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM:
				return PEAK_PROFILE_LONG_TERM_EDEFAULT == null ? getPeakProfileLongTerm() != null : !PEAK_PROFILE_LONG_TERM_EDEFAULT.equals(getPeakProfileLongTerm());
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS:
				return !getEncapsulatesPhysicalDataComponents().isEmpty();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return !getIsRealizedByPhysicalTechnologyComponents().isEmpty();
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT:
				return basicGetDecomposesPhysicalApplicationComponent() != null;
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

} //PhysicalApplicationComponentImpl
