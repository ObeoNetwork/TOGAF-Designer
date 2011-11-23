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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getGovernsAndMeasuresBusinessServices <em>Governs And Measures Business Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getMeetsServiceQuality <em>Meets Service Quality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getBehaviorCharacteristics <em>Behavior Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getServiceNameCaller <em>Service Name Caller</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getServiceNameCalled <em>Service Name Called</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getServiceQualityCharacteristics <em>Service Quality Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getAvailabilityQualityCharacteristics <em>Availability Quality Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getServicesTimes <em>Services Times</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getManageabilityCharacteristics <em>Manageability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getServiceabilityCharacteristics <em>Serviceability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getPerformanceCharacteristics <em>Performance Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getResponseCharacteristics <em>Response Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getReliabilityCharacteristics <em>Reliability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getQualityOfInformationRequired <em>Quality Of Information Required</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getContractControlRequirements <em>Contract Control Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getResultControlRequirements <em>Result Control Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getRecoverabilityCharacteristics <em>Recoverability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getLocatabilityCharacteristics <em>Locatability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getSecurityCharacteristics <em>Security Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getPrivacyCharacteristics <em>Privacy Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getIntegrityCharacteristics <em>Integrity Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getCredibilityCharacteristics <em>Credibility Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getLocalizationCharacteristics <em>Localization Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getInternationalizationCharacteristics <em>Internationalization Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getInteroperabilityCharacteristics <em>Interoperability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getScalabilityCharacteristics <em>Scalability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getPortabilityCharacteristics <em>Portability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getExtensibilityCharacteristics <em>Extensibility Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getCapacityCharacteristics <em>Capacity Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getThroughputPeriod <em>Throughput Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getGrowth <em>Growth</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getGrowthPeriod <em>Growth Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getPeakProfileShortTerm <em>Peak Profile Short Term</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ContractImpl#getPeakProfileLongTerm <em>Peak Profile Long Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractImpl extends ElementImpl implements Contract {
	/**
	 * The default value of the '{@link #getBehaviorCharacteristics() <em>Behavior Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR_CHARACTERISTICS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getServiceNameCaller() <em>Service Name Caller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameCaller()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_CALLER_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getServiceNameCalled() <em>Service Name Called</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameCalled()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_CALLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getServiceQualityCharacteristics() <em>Service Quality Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceQualityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_QUALITY_CHARACTERISTICS_EDEFAULT = null;
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
	 * The default value of the '{@link #getResponseCharacteristics() <em>Response Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_CHARACTERISTICS_EDEFAULT = null;
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
	 * The default value of the '{@link #getQualityOfInformationRequired() <em>Quality Of Information Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityOfInformationRequired()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALITY_OF_INFORMATION_REQUIRED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getContractControlRequirements() <em>Contract Control Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractControlRequirements()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRACT_CONTROL_REQUIREMENTS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getResultControlRequirements() <em>Result Control Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultControlRequirements()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_CONTROL_REQUIREMENTS_EDEFAULT = null;
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
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getGovernsAndMeasuresBusinessServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES, ContentfwkPackage.Literals.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceQuality> getMeetsServiceQuality() {
		return (EList<ServiceQuality>)eDynamicGet(ContentfwkPackage.CONTRACT__MEETS_SERVICE_QUALITY, ContentfwkPackage.Literals.CONTRACT__MEETS_SERVICE_QUALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehaviorCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__BEHAVIOR_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__BEHAVIOR_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviorCharacteristics(String newBehaviorCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__BEHAVIOR_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__BEHAVIOR_CHARACTERISTICS, newBehaviorCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNameCaller() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLER, ContentfwkPackage.Literals.CONTRACT__SERVICE_NAME_CALLER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNameCaller(String newServiceNameCaller) {
		eDynamicSet(ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLER, ContentfwkPackage.Literals.CONTRACT__SERVICE_NAME_CALLER, newServiceNameCaller);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNameCalled() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLED, ContentfwkPackage.Literals.CONTRACT__SERVICE_NAME_CALLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNameCalled(String newServiceNameCalled) {
		eDynamicSet(ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLED, ContentfwkPackage.Literals.CONTRACT__SERVICE_NAME_CALLED, newServiceNameCalled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceQualityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceQualityCharacteristics(String newServiceQualityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS, newServiceQualityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailabilityQualityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityQualityCharacteristics(String newAvailabilityQualityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS, newAvailabilityQualityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServicesTimes() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__SERVICES_TIMES, ContentfwkPackage.Literals.CONTRACT__SERVICES_TIMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicesTimes(String newServicesTimes) {
		eDynamicSet(ContentfwkPackage.CONTRACT__SERVICES_TIMES, ContentfwkPackage.Literals.CONTRACT__SERVICES_TIMES, newServicesTimes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManageabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__MANAGEABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__MANAGEABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManageabilityCharacteristics(String newManageabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__MANAGEABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__MANAGEABILITY_CHARACTERISTICS, newManageabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__SERVICEABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__SERVICEABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceabilityCharacteristics(String newServiceabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__SERVICEABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__SERVICEABILITY_CHARACTERISTICS, newServiceabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerformanceCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__PERFORMANCE_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__PERFORMANCE_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceCharacteristics(String newPerformanceCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__PERFORMANCE_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__PERFORMANCE_CHARACTERISTICS, newPerformanceCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponseCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__RESPONSE_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__RESPONSE_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseCharacteristics(String newResponseCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__RESPONSE_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__RESPONSE_CHARACTERISTICS, newResponseCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReliabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__RELIABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__RELIABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliabilityCharacteristics(String newReliabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__RELIABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__RELIABILITY_CHARACTERISTICS, newReliabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualityOfInformationRequired() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED, ContentfwkPackage.Literals.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityOfInformationRequired(String newQualityOfInformationRequired) {
		eDynamicSet(ContentfwkPackage.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED, ContentfwkPackage.Literals.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED, newQualityOfInformationRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContractControlRequirements() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS, ContentfwkPackage.Literals.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContractControlRequirements(String newContractControlRequirements) {
		eDynamicSet(ContentfwkPackage.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS, ContentfwkPackage.Literals.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS, newContractControlRequirements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultControlRequirements() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__RESULT_CONTROL_REQUIREMENTS, ContentfwkPackage.Literals.CONTRACT__RESULT_CONTROL_REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultControlRequirements(String newResultControlRequirements) {
		eDynamicSet(ContentfwkPackage.CONTRACT__RESULT_CONTROL_REQUIREMENTS, ContentfwkPackage.Literals.CONTRACT__RESULT_CONTROL_REQUIREMENTS, newResultControlRequirements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecoverabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__RECOVERABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__RECOVERABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoverabilityCharacteristics(String newRecoverabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__RECOVERABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__RECOVERABILITY_CHARACTERISTICS, newRecoverabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocatabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__LOCATABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__LOCATABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocatabilityCharacteristics(String newLocatabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__LOCATABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__LOCATABILITY_CHARACTERISTICS, newLocatabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__SECURITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__SECURITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityCharacteristics(String newSecurityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__SECURITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__SECURITY_CHARACTERISTICS, newSecurityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivacyCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__PRIVACY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__PRIVACY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacyCharacteristics(String newPrivacyCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__PRIVACY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__PRIVACY_CHARACTERISTICS, newPrivacyCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntegrityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__INTEGRITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__INTEGRITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrityCharacteristics(String newIntegrityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__INTEGRITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__INTEGRITY_CHARACTERISTICS, newIntegrityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCredibilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__CREDIBILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__CREDIBILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredibilityCharacteristics(String newCredibilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__CREDIBILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__CREDIBILITY_CHARACTERISTICS, newCredibilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalizationCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__LOCALIZATION_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__LOCALIZATION_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizationCharacteristics(String newLocalizationCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__LOCALIZATION_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__LOCALIZATION_CHARACTERISTICS, newLocalizationCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternationalizationCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternationalizationCharacteristics(String newInternationalizationCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS, newInternationalizationCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInteroperabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__INTEROPERABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__INTEROPERABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteroperabilityCharacteristics(String newInteroperabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__INTEROPERABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__INTEROPERABILITY_CHARACTERISTICS, newInteroperabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__SCALABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__SCALABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalabilityCharacteristics(String newScalabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__SCALABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__SCALABILITY_CHARACTERISTICS, newScalabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortabilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__PORTABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__PORTABILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortabilityCharacteristics(String newPortabilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__PORTABILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__PORTABILITY_CHARACTERISTICS, newPortabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensibilityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__EXTENSIBILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__EXTENSIBILITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensibilityCharacteristics(String newExtensibilityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__EXTENSIBILITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__EXTENSIBILITY_CHARACTERISTICS, newExtensibilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacityCharacteristics() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__CAPACITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__CAPACITY_CHARACTERISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityCharacteristics(String newCapacityCharacteristics) {
		eDynamicSet(ContentfwkPackage.CONTRACT__CAPACITY_CHARACTERISTICS, ContentfwkPackage.Literals.CONTRACT__CAPACITY_CHARACTERISTICS, newCapacityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThroughput() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__THROUGHPUT, ContentfwkPackage.Literals.CONTRACT__THROUGHPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(String newThroughput) {
		eDynamicSet(ContentfwkPackage.CONTRACT__THROUGHPUT, ContentfwkPackage.Literals.CONTRACT__THROUGHPUT, newThroughput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThroughputPeriod() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__THROUGHPUT_PERIOD, ContentfwkPackage.Literals.CONTRACT__THROUGHPUT_PERIOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughputPeriod(String newThroughputPeriod) {
		eDynamicSet(ContentfwkPackage.CONTRACT__THROUGHPUT_PERIOD, ContentfwkPackage.Literals.CONTRACT__THROUGHPUT_PERIOD, newThroughputPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrowth() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__GROWTH, ContentfwkPackage.Literals.CONTRACT__GROWTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrowth(String newGrowth) {
		eDynamicSet(ContentfwkPackage.CONTRACT__GROWTH, ContentfwkPackage.Literals.CONTRACT__GROWTH, newGrowth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrowthPeriod() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__GROWTH_PERIOD, ContentfwkPackage.Literals.CONTRACT__GROWTH_PERIOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrowthPeriod(String newGrowthPeriod) {
		eDynamicSet(ContentfwkPackage.CONTRACT__GROWTH_PERIOD, ContentfwkPackage.Literals.CONTRACT__GROWTH_PERIOD, newGrowthPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeakProfileShortTerm() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__PEAK_PROFILE_SHORT_TERM, ContentfwkPackage.Literals.CONTRACT__PEAK_PROFILE_SHORT_TERM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeakProfileShortTerm(String newPeakProfileShortTerm) {
		eDynamicSet(ContentfwkPackage.CONTRACT__PEAK_PROFILE_SHORT_TERM, ContentfwkPackage.Literals.CONTRACT__PEAK_PROFILE_SHORT_TERM, newPeakProfileShortTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeakProfileLongTerm() {
		return (String)eDynamicGet(ContentfwkPackage.CONTRACT__PEAK_PROFILE_LONG_TERM, ContentfwkPackage.Literals.CONTRACT__PEAK_PROFILE_LONG_TERM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeakProfileLongTerm(String newPeakProfileLongTerm) {
		eDynamicSet(ContentfwkPackage.CONTRACT__PEAK_PROFILE_LONG_TERM, ContentfwkPackage.Literals.CONTRACT__PEAK_PROFILE_LONG_TERM, newPeakProfileLongTerm);
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
			case ContentfwkPackage.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGovernsAndMeasuresBusinessServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.CONTRACT__MEETS_SERVICE_QUALITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeetsServiceQuality()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES:
				return ((InternalEList<?>)getGovernsAndMeasuresBusinessServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.CONTRACT__MEETS_SERVICE_QUALITY:
				return ((InternalEList<?>)getMeetsServiceQuality()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES:
				return getGovernsAndMeasuresBusinessServices();
			case ContentfwkPackage.CONTRACT__MEETS_SERVICE_QUALITY:
				return getMeetsServiceQuality();
			case ContentfwkPackage.CONTRACT__BEHAVIOR_CHARACTERISTICS:
				return getBehaviorCharacteristics();
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLER:
				return getServiceNameCaller();
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLED:
				return getServiceNameCalled();
			case ContentfwkPackage.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS:
				return getServiceQualityCharacteristics();
			case ContentfwkPackage.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS:
				return getAvailabilityQualityCharacteristics();
			case ContentfwkPackage.CONTRACT__SERVICES_TIMES:
				return getServicesTimes();
			case ContentfwkPackage.CONTRACT__MANAGEABILITY_CHARACTERISTICS:
				return getManageabilityCharacteristics();
			case ContentfwkPackage.CONTRACT__SERVICEABILITY_CHARACTERISTICS:
				return getServiceabilityCharacteristics();
			case ContentfwkPackage.CONTRACT__PERFORMANCE_CHARACTERISTICS:
				return getPerformanceCharacteristics();
			case ContentfwkPackage.CONTRACT__RESPONSE_CHARACTERISTICS:
				return getResponseCharacteristics();
			case ContentfwkPackage.CONTRACT__RELIABILITY_CHARACTERISTICS:
				return getReliabilityCharacteristics();
			case ContentfwkPackage.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED:
				return getQualityOfInformationRequired();
			case ContentfwkPackage.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS:
				return getContractControlRequirements();
			case ContentfwkPackage.CONTRACT__RESULT_CONTROL_REQUIREMENTS:
				return getResultControlRequirements();
			case ContentfwkPackage.CONTRACT__RECOVERABILITY_CHARACTERISTICS:
				return getRecoverabilityCharacteristics();
			case ContentfwkPackage.CONTRACT__LOCATABILITY_CHARACTERISTICS:
				return getLocatabilityCharacteristics();
			case ContentfwkPackage.CONTRACT__SECURITY_CHARACTERISTICS:
				return getSecurityCharacteristics();
			case ContentfwkPackage.CONTRACT__PRIVACY_CHARACTERISTICS:
				return getPrivacyCharacteristics();
			case ContentfwkPackage.CONTRACT__INTEGRITY_CHARACTERISTICS:
				return getIntegrityCharacteristics();
			case ContentfwkPackage.CONTRACT__CREDIBILITY_CHARACTERISTICS:
				return getCredibilityCharacteristics();
			case ContentfwkPackage.CONTRACT__LOCALIZATION_CHARACTERISTICS:
				return getLocalizationCharacteristics();
			case ContentfwkPackage.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS:
				return getInternationalizationCharacteristics();
			case ContentfwkPackage.CONTRACT__INTEROPERABILITY_CHARACTERISTICS:
				return getInteroperabilityCharacteristics();
			case ContentfwkPackage.CONTRACT__SCALABILITY_CHARACTERISTICS:
				return getScalabilityCharacteristics();
			case ContentfwkPackage.CONTRACT__PORTABILITY_CHARACTERISTICS:
				return getPortabilityCharacteristics();
			case ContentfwkPackage.CONTRACT__EXTENSIBILITY_CHARACTERISTICS:
				return getExtensibilityCharacteristics();
			case ContentfwkPackage.CONTRACT__CAPACITY_CHARACTERISTICS:
				return getCapacityCharacteristics();
			case ContentfwkPackage.CONTRACT__THROUGHPUT:
				return getThroughput();
			case ContentfwkPackage.CONTRACT__THROUGHPUT_PERIOD:
				return getThroughputPeriod();
			case ContentfwkPackage.CONTRACT__GROWTH:
				return getGrowth();
			case ContentfwkPackage.CONTRACT__GROWTH_PERIOD:
				return getGrowthPeriod();
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_SHORT_TERM:
				return getPeakProfileShortTerm();
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_LONG_TERM:
				return getPeakProfileLongTerm();
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
			case ContentfwkPackage.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES:
				getGovernsAndMeasuresBusinessServices().clear();
				getGovernsAndMeasuresBusinessServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.CONTRACT__MEETS_SERVICE_QUALITY:
				getMeetsServiceQuality().clear();
				getMeetsServiceQuality().addAll((Collection<? extends ServiceQuality>)newValue);
				return;
			case ContentfwkPackage.CONTRACT__BEHAVIOR_CHARACTERISTICS:
				setBehaviorCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLER:
				setServiceNameCaller((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLED:
				setServiceNameCalled((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS:
				setServiceQualityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS:
				setAvailabilityQualityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__SERVICES_TIMES:
				setServicesTimes((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__MANAGEABILITY_CHARACTERISTICS:
				setManageabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__SERVICEABILITY_CHARACTERISTICS:
				setServiceabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__PERFORMANCE_CHARACTERISTICS:
				setPerformanceCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__RESPONSE_CHARACTERISTICS:
				setResponseCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__RELIABILITY_CHARACTERISTICS:
				setReliabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED:
				setQualityOfInformationRequired((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS:
				setContractControlRequirements((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__RESULT_CONTROL_REQUIREMENTS:
				setResultControlRequirements((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__RECOVERABILITY_CHARACTERISTICS:
				setRecoverabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__LOCATABILITY_CHARACTERISTICS:
				setLocatabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__SECURITY_CHARACTERISTICS:
				setSecurityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__PRIVACY_CHARACTERISTICS:
				setPrivacyCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__INTEGRITY_CHARACTERISTICS:
				setIntegrityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__CREDIBILITY_CHARACTERISTICS:
				setCredibilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__LOCALIZATION_CHARACTERISTICS:
				setLocalizationCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS:
				setInternationalizationCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__INTEROPERABILITY_CHARACTERISTICS:
				setInteroperabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__SCALABILITY_CHARACTERISTICS:
				setScalabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__PORTABILITY_CHARACTERISTICS:
				setPortabilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__EXTENSIBILITY_CHARACTERISTICS:
				setExtensibilityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__CAPACITY_CHARACTERISTICS:
				setCapacityCharacteristics((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__THROUGHPUT:
				setThroughput((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__THROUGHPUT_PERIOD:
				setThroughputPeriod((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__GROWTH:
				setGrowth((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__GROWTH_PERIOD:
				setGrowthPeriod((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_SHORT_TERM:
				setPeakProfileShortTerm((String)newValue);
				return;
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_LONG_TERM:
				setPeakProfileLongTerm((String)newValue);
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
			case ContentfwkPackage.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES:
				getGovernsAndMeasuresBusinessServices().clear();
				return;
			case ContentfwkPackage.CONTRACT__MEETS_SERVICE_QUALITY:
				getMeetsServiceQuality().clear();
				return;
			case ContentfwkPackage.CONTRACT__BEHAVIOR_CHARACTERISTICS:
				setBehaviorCharacteristics(BEHAVIOR_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLER:
				setServiceNameCaller(SERVICE_NAME_CALLER_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLED:
				setServiceNameCalled(SERVICE_NAME_CALLED_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS:
				setServiceQualityCharacteristics(SERVICE_QUALITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS:
				setAvailabilityQualityCharacteristics(AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__SERVICES_TIMES:
				setServicesTimes(SERVICES_TIMES_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__MANAGEABILITY_CHARACTERISTICS:
				setManageabilityCharacteristics(MANAGEABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__SERVICEABILITY_CHARACTERISTICS:
				setServiceabilityCharacteristics(SERVICEABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__PERFORMANCE_CHARACTERISTICS:
				setPerformanceCharacteristics(PERFORMANCE_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__RESPONSE_CHARACTERISTICS:
				setResponseCharacteristics(RESPONSE_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__RELIABILITY_CHARACTERISTICS:
				setReliabilityCharacteristics(RELIABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED:
				setQualityOfInformationRequired(QUALITY_OF_INFORMATION_REQUIRED_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS:
				setContractControlRequirements(CONTRACT_CONTROL_REQUIREMENTS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__RESULT_CONTROL_REQUIREMENTS:
				setResultControlRequirements(RESULT_CONTROL_REQUIREMENTS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__RECOVERABILITY_CHARACTERISTICS:
				setRecoverabilityCharacteristics(RECOVERABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__LOCATABILITY_CHARACTERISTICS:
				setLocatabilityCharacteristics(LOCATABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__SECURITY_CHARACTERISTICS:
				setSecurityCharacteristics(SECURITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__PRIVACY_CHARACTERISTICS:
				setPrivacyCharacteristics(PRIVACY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__INTEGRITY_CHARACTERISTICS:
				setIntegrityCharacteristics(INTEGRITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__CREDIBILITY_CHARACTERISTICS:
				setCredibilityCharacteristics(CREDIBILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__LOCALIZATION_CHARACTERISTICS:
				setLocalizationCharacteristics(LOCALIZATION_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS:
				setInternationalizationCharacteristics(INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__INTEROPERABILITY_CHARACTERISTICS:
				setInteroperabilityCharacteristics(INTEROPERABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__SCALABILITY_CHARACTERISTICS:
				setScalabilityCharacteristics(SCALABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__PORTABILITY_CHARACTERISTICS:
				setPortabilityCharacteristics(PORTABILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__EXTENSIBILITY_CHARACTERISTICS:
				setExtensibilityCharacteristics(EXTENSIBILITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__CAPACITY_CHARACTERISTICS:
				setCapacityCharacteristics(CAPACITY_CHARACTERISTICS_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__THROUGHPUT:
				setThroughput(THROUGHPUT_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__THROUGHPUT_PERIOD:
				setThroughputPeriod(THROUGHPUT_PERIOD_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__GROWTH:
				setGrowth(GROWTH_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__GROWTH_PERIOD:
				setGrowthPeriod(GROWTH_PERIOD_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_SHORT_TERM:
				setPeakProfileShortTerm(PEAK_PROFILE_SHORT_TERM_EDEFAULT);
				return;
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_LONG_TERM:
				setPeakProfileLongTerm(PEAK_PROFILE_LONG_TERM_EDEFAULT);
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
			case ContentfwkPackage.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES:
				return !getGovernsAndMeasuresBusinessServices().isEmpty();
			case ContentfwkPackage.CONTRACT__MEETS_SERVICE_QUALITY:
				return !getMeetsServiceQuality().isEmpty();
			case ContentfwkPackage.CONTRACT__BEHAVIOR_CHARACTERISTICS:
				return BEHAVIOR_CHARACTERISTICS_EDEFAULT == null ? getBehaviorCharacteristics() != null : !BEHAVIOR_CHARACTERISTICS_EDEFAULT.equals(getBehaviorCharacteristics());
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLER:
				return SERVICE_NAME_CALLER_EDEFAULT == null ? getServiceNameCaller() != null : !SERVICE_NAME_CALLER_EDEFAULT.equals(getServiceNameCaller());
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLED:
				return SERVICE_NAME_CALLED_EDEFAULT == null ? getServiceNameCalled() != null : !SERVICE_NAME_CALLED_EDEFAULT.equals(getServiceNameCalled());
			case ContentfwkPackage.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS:
				return SERVICE_QUALITY_CHARACTERISTICS_EDEFAULT == null ? getServiceQualityCharacteristics() != null : !SERVICE_QUALITY_CHARACTERISTICS_EDEFAULT.equals(getServiceQualityCharacteristics());
			case ContentfwkPackage.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS:
				return AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT == null ? getAvailabilityQualityCharacteristics() != null : !AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT.equals(getAvailabilityQualityCharacteristics());
			case ContentfwkPackage.CONTRACT__SERVICES_TIMES:
				return SERVICES_TIMES_EDEFAULT == null ? getServicesTimes() != null : !SERVICES_TIMES_EDEFAULT.equals(getServicesTimes());
			case ContentfwkPackage.CONTRACT__MANAGEABILITY_CHARACTERISTICS:
				return MANAGEABILITY_CHARACTERISTICS_EDEFAULT == null ? getManageabilityCharacteristics() != null : !MANAGEABILITY_CHARACTERISTICS_EDEFAULT.equals(getManageabilityCharacteristics());
			case ContentfwkPackage.CONTRACT__SERVICEABILITY_CHARACTERISTICS:
				return SERVICEABILITY_CHARACTERISTICS_EDEFAULT == null ? getServiceabilityCharacteristics() != null : !SERVICEABILITY_CHARACTERISTICS_EDEFAULT.equals(getServiceabilityCharacteristics());
			case ContentfwkPackage.CONTRACT__PERFORMANCE_CHARACTERISTICS:
				return PERFORMANCE_CHARACTERISTICS_EDEFAULT == null ? getPerformanceCharacteristics() != null : !PERFORMANCE_CHARACTERISTICS_EDEFAULT.equals(getPerformanceCharacteristics());
			case ContentfwkPackage.CONTRACT__RESPONSE_CHARACTERISTICS:
				return RESPONSE_CHARACTERISTICS_EDEFAULT == null ? getResponseCharacteristics() != null : !RESPONSE_CHARACTERISTICS_EDEFAULT.equals(getResponseCharacteristics());
			case ContentfwkPackage.CONTRACT__RELIABILITY_CHARACTERISTICS:
				return RELIABILITY_CHARACTERISTICS_EDEFAULT == null ? getReliabilityCharacteristics() != null : !RELIABILITY_CHARACTERISTICS_EDEFAULT.equals(getReliabilityCharacteristics());
			case ContentfwkPackage.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED:
				return QUALITY_OF_INFORMATION_REQUIRED_EDEFAULT == null ? getQualityOfInformationRequired() != null : !QUALITY_OF_INFORMATION_REQUIRED_EDEFAULT.equals(getQualityOfInformationRequired());
			case ContentfwkPackage.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS:
				return CONTRACT_CONTROL_REQUIREMENTS_EDEFAULT == null ? getContractControlRequirements() != null : !CONTRACT_CONTROL_REQUIREMENTS_EDEFAULT.equals(getContractControlRequirements());
			case ContentfwkPackage.CONTRACT__RESULT_CONTROL_REQUIREMENTS:
				return RESULT_CONTROL_REQUIREMENTS_EDEFAULT == null ? getResultControlRequirements() != null : !RESULT_CONTROL_REQUIREMENTS_EDEFAULT.equals(getResultControlRequirements());
			case ContentfwkPackage.CONTRACT__RECOVERABILITY_CHARACTERISTICS:
				return RECOVERABILITY_CHARACTERISTICS_EDEFAULT == null ? getRecoverabilityCharacteristics() != null : !RECOVERABILITY_CHARACTERISTICS_EDEFAULT.equals(getRecoverabilityCharacteristics());
			case ContentfwkPackage.CONTRACT__LOCATABILITY_CHARACTERISTICS:
				return LOCATABILITY_CHARACTERISTICS_EDEFAULT == null ? getLocatabilityCharacteristics() != null : !LOCATABILITY_CHARACTERISTICS_EDEFAULT.equals(getLocatabilityCharacteristics());
			case ContentfwkPackage.CONTRACT__SECURITY_CHARACTERISTICS:
				return SECURITY_CHARACTERISTICS_EDEFAULT == null ? getSecurityCharacteristics() != null : !SECURITY_CHARACTERISTICS_EDEFAULT.equals(getSecurityCharacteristics());
			case ContentfwkPackage.CONTRACT__PRIVACY_CHARACTERISTICS:
				return PRIVACY_CHARACTERISTICS_EDEFAULT == null ? getPrivacyCharacteristics() != null : !PRIVACY_CHARACTERISTICS_EDEFAULT.equals(getPrivacyCharacteristics());
			case ContentfwkPackage.CONTRACT__INTEGRITY_CHARACTERISTICS:
				return INTEGRITY_CHARACTERISTICS_EDEFAULT == null ? getIntegrityCharacteristics() != null : !INTEGRITY_CHARACTERISTICS_EDEFAULT.equals(getIntegrityCharacteristics());
			case ContentfwkPackage.CONTRACT__CREDIBILITY_CHARACTERISTICS:
				return CREDIBILITY_CHARACTERISTICS_EDEFAULT == null ? getCredibilityCharacteristics() != null : !CREDIBILITY_CHARACTERISTICS_EDEFAULT.equals(getCredibilityCharacteristics());
			case ContentfwkPackage.CONTRACT__LOCALIZATION_CHARACTERISTICS:
				return LOCALIZATION_CHARACTERISTICS_EDEFAULT == null ? getLocalizationCharacteristics() != null : !LOCALIZATION_CHARACTERISTICS_EDEFAULT.equals(getLocalizationCharacteristics());
			case ContentfwkPackage.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS:
				return INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT == null ? getInternationalizationCharacteristics() != null : !INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT.equals(getInternationalizationCharacteristics());
			case ContentfwkPackage.CONTRACT__INTEROPERABILITY_CHARACTERISTICS:
				return INTEROPERABILITY_CHARACTERISTICS_EDEFAULT == null ? getInteroperabilityCharacteristics() != null : !INTEROPERABILITY_CHARACTERISTICS_EDEFAULT.equals(getInteroperabilityCharacteristics());
			case ContentfwkPackage.CONTRACT__SCALABILITY_CHARACTERISTICS:
				return SCALABILITY_CHARACTERISTICS_EDEFAULT == null ? getScalabilityCharacteristics() != null : !SCALABILITY_CHARACTERISTICS_EDEFAULT.equals(getScalabilityCharacteristics());
			case ContentfwkPackage.CONTRACT__PORTABILITY_CHARACTERISTICS:
				return PORTABILITY_CHARACTERISTICS_EDEFAULT == null ? getPortabilityCharacteristics() != null : !PORTABILITY_CHARACTERISTICS_EDEFAULT.equals(getPortabilityCharacteristics());
			case ContentfwkPackage.CONTRACT__EXTENSIBILITY_CHARACTERISTICS:
				return EXTENSIBILITY_CHARACTERISTICS_EDEFAULT == null ? getExtensibilityCharacteristics() != null : !EXTENSIBILITY_CHARACTERISTICS_EDEFAULT.equals(getExtensibilityCharacteristics());
			case ContentfwkPackage.CONTRACT__CAPACITY_CHARACTERISTICS:
				return CAPACITY_CHARACTERISTICS_EDEFAULT == null ? getCapacityCharacteristics() != null : !CAPACITY_CHARACTERISTICS_EDEFAULT.equals(getCapacityCharacteristics());
			case ContentfwkPackage.CONTRACT__THROUGHPUT:
				return THROUGHPUT_EDEFAULT == null ? getThroughput() != null : !THROUGHPUT_EDEFAULT.equals(getThroughput());
			case ContentfwkPackage.CONTRACT__THROUGHPUT_PERIOD:
				return THROUGHPUT_PERIOD_EDEFAULT == null ? getThroughputPeriod() != null : !THROUGHPUT_PERIOD_EDEFAULT.equals(getThroughputPeriod());
			case ContentfwkPackage.CONTRACT__GROWTH:
				return GROWTH_EDEFAULT == null ? getGrowth() != null : !GROWTH_EDEFAULT.equals(getGrowth());
			case ContentfwkPackage.CONTRACT__GROWTH_PERIOD:
				return GROWTH_PERIOD_EDEFAULT == null ? getGrowthPeriod() != null : !GROWTH_PERIOD_EDEFAULT.equals(getGrowthPeriod());
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_SHORT_TERM:
				return PEAK_PROFILE_SHORT_TERM_EDEFAULT == null ? getPeakProfileShortTerm() != null : !PEAK_PROFILE_SHORT_TERM_EDEFAULT.equals(getPeakProfileShortTerm());
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_LONG_TERM:
				return PEAK_PROFILE_LONG_TERM_EDEFAULT == null ? getPeakProfileLongTerm() != null : !PEAK_PROFILE_LONG_TERM_EDEFAULT.equals(getPeakProfileLongTerm());
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
