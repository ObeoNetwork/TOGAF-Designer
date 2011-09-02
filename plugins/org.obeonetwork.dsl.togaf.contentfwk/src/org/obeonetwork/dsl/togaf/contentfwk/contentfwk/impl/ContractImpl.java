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
	 * The cached value of the '{@link #getGovernsAndMeasuresBusinessServices() <em>Governs And Measures Business Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernsAndMeasuresBusinessServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> governsAndMeasuresBusinessServices;

	/**
	 * The cached value of the '{@link #getMeetsServiceQuality() <em>Meets Service Quality</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetsServiceQuality()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceQuality> meetsServiceQuality;

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
	 * The cached value of the '{@link #getBehaviorCharacteristics() <em>Behavior Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String behaviorCharacteristics = BEHAVIOR_CHARACTERISTICS_EDEFAULT;

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
	 * The cached value of the '{@link #getServiceNameCaller() <em>Service Name Caller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameCaller()
	 * @generated
	 * @ordered
	 */
	protected String serviceNameCaller = SERVICE_NAME_CALLER_EDEFAULT;

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
	 * The cached value of the '{@link #getServiceNameCalled() <em>Service Name Called</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameCalled()
	 * @generated
	 * @ordered
	 */
	protected String serviceNameCalled = SERVICE_NAME_CALLED_EDEFAULT;

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
	 * The cached value of the '{@link #getServiceQualityCharacteristics() <em>Service Quality Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceQualityCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String serviceQualityCharacteristics = SERVICE_QUALITY_CHARACTERISTICS_EDEFAULT;

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
	 * The default value of the '{@link #getResponseCharacteristics() <em>Response Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_CHARACTERISTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseCharacteristics() <em>Response Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected String responseCharacteristics = RESPONSE_CHARACTERISTICS_EDEFAULT;

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
	 * The default value of the '{@link #getQualityOfInformationRequired() <em>Quality Of Information Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityOfInformationRequired()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALITY_OF_INFORMATION_REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualityOfInformationRequired() <em>Quality Of Information Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityOfInformationRequired()
	 * @generated
	 * @ordered
	 */
	protected String qualityOfInformationRequired = QUALITY_OF_INFORMATION_REQUIRED_EDEFAULT;

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
	 * The cached value of the '{@link #getContractControlRequirements() <em>Contract Control Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractControlRequirements()
	 * @generated
	 * @ordered
	 */
	protected String contractControlRequirements = CONTRACT_CONTROL_REQUIREMENTS_EDEFAULT;

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
	 * The cached value of the '{@link #getResultControlRequirements() <em>Result Control Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultControlRequirements()
	 * @generated
	 * @ordered
	 */
	protected String resultControlRequirements = RESULT_CONTROL_REQUIREMENTS_EDEFAULT;

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
	public EList<Service> getGovernsAndMeasuresBusinessServices() {
		if (governsAndMeasuresBusinessServices == null) {
			governsAndMeasuresBusinessServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ContentfwkPackage.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES, ContentfwkPackage.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS);
		}
		return governsAndMeasuresBusinessServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceQuality> getMeetsServiceQuality() {
		if (meetsServiceQuality == null) {
			meetsServiceQuality = new EObjectWithInverseResolvingEList.ManyInverse<ServiceQuality>(ServiceQuality.class, this, ContentfwkPackage.CONTRACT__MEETS_SERVICE_QUALITY, ContentfwkPackage.SERVICE_QUALITY__APPLIES_TO_CONTRACTS);
		}
		return meetsServiceQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehaviorCharacteristics() {
		return behaviorCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviorCharacteristics(String newBehaviorCharacteristics) {
		String oldBehaviorCharacteristics = behaviorCharacteristics;
		behaviorCharacteristics = newBehaviorCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__BEHAVIOR_CHARACTERISTICS, oldBehaviorCharacteristics, behaviorCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNameCaller() {
		return serviceNameCaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNameCaller(String newServiceNameCaller) {
		String oldServiceNameCaller = serviceNameCaller;
		serviceNameCaller = newServiceNameCaller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLER, oldServiceNameCaller, serviceNameCaller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNameCalled() {
		return serviceNameCalled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNameCalled(String newServiceNameCalled) {
		String oldServiceNameCalled = serviceNameCalled;
		serviceNameCalled = newServiceNameCalled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLED, oldServiceNameCalled, serviceNameCalled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceQualityCharacteristics() {
		return serviceQualityCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceQualityCharacteristics(String newServiceQualityCharacteristics) {
		String oldServiceQualityCharacteristics = serviceQualityCharacteristics;
		serviceQualityCharacteristics = newServiceQualityCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS, oldServiceQualityCharacteristics, serviceQualityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS, oldAvailabilityQualityCharacteristics, availabilityQualityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__SERVICES_TIMES, oldServicesTimes, servicesTimes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__MANAGEABILITY_CHARACTERISTICS, oldManageabilityCharacteristics, manageabilityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__SERVICEABILITY_CHARACTERISTICS, oldServiceabilityCharacteristics, serviceabilityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__PERFORMANCE_CHARACTERISTICS, oldPerformanceCharacteristics, performanceCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponseCharacteristics() {
		return responseCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseCharacteristics(String newResponseCharacteristics) {
		String oldResponseCharacteristics = responseCharacteristics;
		responseCharacteristics = newResponseCharacteristics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__RESPONSE_CHARACTERISTICS, oldResponseCharacteristics, responseCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__RELIABILITY_CHARACTERISTICS, oldReliabilityCharacteristics, reliabilityCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualityOfInformationRequired() {
		return qualityOfInformationRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityOfInformationRequired(String newQualityOfInformationRequired) {
		String oldQualityOfInformationRequired = qualityOfInformationRequired;
		qualityOfInformationRequired = newQualityOfInformationRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED, oldQualityOfInformationRequired, qualityOfInformationRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContractControlRequirements() {
		return contractControlRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContractControlRequirements(String newContractControlRequirements) {
		String oldContractControlRequirements = contractControlRequirements;
		contractControlRequirements = newContractControlRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS, oldContractControlRequirements, contractControlRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultControlRequirements() {
		return resultControlRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultControlRequirements(String newResultControlRequirements) {
		String oldResultControlRequirements = resultControlRequirements;
		resultControlRequirements = newResultControlRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__RESULT_CONTROL_REQUIREMENTS, oldResultControlRequirements, resultControlRequirements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__RECOVERABILITY_CHARACTERISTICS, oldRecoverabilityCharacteristics, recoverabilityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__LOCATABILITY_CHARACTERISTICS, oldLocatabilityCharacteristics, locatabilityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__SECURITY_CHARACTERISTICS, oldSecurityCharacteristics, securityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__PRIVACY_CHARACTERISTICS, oldPrivacyCharacteristics, privacyCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__INTEGRITY_CHARACTERISTICS, oldIntegrityCharacteristics, integrityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__CREDIBILITY_CHARACTERISTICS, oldCredibilityCharacteristics, credibilityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__LOCALIZATION_CHARACTERISTICS, oldLocalizationCharacteristics, localizationCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS, oldInternationalizationCharacteristics, internationalizationCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__INTEROPERABILITY_CHARACTERISTICS, oldInteroperabilityCharacteristics, interoperabilityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__SCALABILITY_CHARACTERISTICS, oldScalabilityCharacteristics, scalabilityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__PORTABILITY_CHARACTERISTICS, oldPortabilityCharacteristics, portabilityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__EXTENSIBILITY_CHARACTERISTICS, oldExtensibilityCharacteristics, extensibilityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__CAPACITY_CHARACTERISTICS, oldCapacityCharacteristics, capacityCharacteristics));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__THROUGHPUT, oldThroughput, throughput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__THROUGHPUT_PERIOD, oldThroughputPeriod, throughputPeriod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__GROWTH, oldGrowth, growth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__GROWTH_PERIOD, oldGrowthPeriod, growthPeriod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__PEAK_PROFILE_SHORT_TERM, oldPeakProfileShortTerm, peakProfileShortTerm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.CONTRACT__PEAK_PROFILE_LONG_TERM, oldPeakProfileLongTerm, peakProfileLongTerm));
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
				return governsAndMeasuresBusinessServices != null && !governsAndMeasuresBusinessServices.isEmpty();
			case ContentfwkPackage.CONTRACT__MEETS_SERVICE_QUALITY:
				return meetsServiceQuality != null && !meetsServiceQuality.isEmpty();
			case ContentfwkPackage.CONTRACT__BEHAVIOR_CHARACTERISTICS:
				return BEHAVIOR_CHARACTERISTICS_EDEFAULT == null ? behaviorCharacteristics != null : !BEHAVIOR_CHARACTERISTICS_EDEFAULT.equals(behaviorCharacteristics);
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLER:
				return SERVICE_NAME_CALLER_EDEFAULT == null ? serviceNameCaller != null : !SERVICE_NAME_CALLER_EDEFAULT.equals(serviceNameCaller);
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLED:
				return SERVICE_NAME_CALLED_EDEFAULT == null ? serviceNameCalled != null : !SERVICE_NAME_CALLED_EDEFAULT.equals(serviceNameCalled);
			case ContentfwkPackage.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS:
				return SERVICE_QUALITY_CHARACTERISTICS_EDEFAULT == null ? serviceQualityCharacteristics != null : !SERVICE_QUALITY_CHARACTERISTICS_EDEFAULT.equals(serviceQualityCharacteristics);
			case ContentfwkPackage.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS:
				return AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT == null ? availabilityQualityCharacteristics != null : !AVAILABILITY_QUALITY_CHARACTERISTICS_EDEFAULT.equals(availabilityQualityCharacteristics);
			case ContentfwkPackage.CONTRACT__SERVICES_TIMES:
				return SERVICES_TIMES_EDEFAULT == null ? servicesTimes != null : !SERVICES_TIMES_EDEFAULT.equals(servicesTimes);
			case ContentfwkPackage.CONTRACT__MANAGEABILITY_CHARACTERISTICS:
				return MANAGEABILITY_CHARACTERISTICS_EDEFAULT == null ? manageabilityCharacteristics != null : !MANAGEABILITY_CHARACTERISTICS_EDEFAULT.equals(manageabilityCharacteristics);
			case ContentfwkPackage.CONTRACT__SERVICEABILITY_CHARACTERISTICS:
				return SERVICEABILITY_CHARACTERISTICS_EDEFAULT == null ? serviceabilityCharacteristics != null : !SERVICEABILITY_CHARACTERISTICS_EDEFAULT.equals(serviceabilityCharacteristics);
			case ContentfwkPackage.CONTRACT__PERFORMANCE_CHARACTERISTICS:
				return PERFORMANCE_CHARACTERISTICS_EDEFAULT == null ? performanceCharacteristics != null : !PERFORMANCE_CHARACTERISTICS_EDEFAULT.equals(performanceCharacteristics);
			case ContentfwkPackage.CONTRACT__RESPONSE_CHARACTERISTICS:
				return RESPONSE_CHARACTERISTICS_EDEFAULT == null ? responseCharacteristics != null : !RESPONSE_CHARACTERISTICS_EDEFAULT.equals(responseCharacteristics);
			case ContentfwkPackage.CONTRACT__RELIABILITY_CHARACTERISTICS:
				return RELIABILITY_CHARACTERISTICS_EDEFAULT == null ? reliabilityCharacteristics != null : !RELIABILITY_CHARACTERISTICS_EDEFAULT.equals(reliabilityCharacteristics);
			case ContentfwkPackage.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED:
				return QUALITY_OF_INFORMATION_REQUIRED_EDEFAULT == null ? qualityOfInformationRequired != null : !QUALITY_OF_INFORMATION_REQUIRED_EDEFAULT.equals(qualityOfInformationRequired);
			case ContentfwkPackage.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS:
				return CONTRACT_CONTROL_REQUIREMENTS_EDEFAULT == null ? contractControlRequirements != null : !CONTRACT_CONTROL_REQUIREMENTS_EDEFAULT.equals(contractControlRequirements);
			case ContentfwkPackage.CONTRACT__RESULT_CONTROL_REQUIREMENTS:
				return RESULT_CONTROL_REQUIREMENTS_EDEFAULT == null ? resultControlRequirements != null : !RESULT_CONTROL_REQUIREMENTS_EDEFAULT.equals(resultControlRequirements);
			case ContentfwkPackage.CONTRACT__RECOVERABILITY_CHARACTERISTICS:
				return RECOVERABILITY_CHARACTERISTICS_EDEFAULT == null ? recoverabilityCharacteristics != null : !RECOVERABILITY_CHARACTERISTICS_EDEFAULT.equals(recoverabilityCharacteristics);
			case ContentfwkPackage.CONTRACT__LOCATABILITY_CHARACTERISTICS:
				return LOCATABILITY_CHARACTERISTICS_EDEFAULT == null ? locatabilityCharacteristics != null : !LOCATABILITY_CHARACTERISTICS_EDEFAULT.equals(locatabilityCharacteristics);
			case ContentfwkPackage.CONTRACT__SECURITY_CHARACTERISTICS:
				return SECURITY_CHARACTERISTICS_EDEFAULT == null ? securityCharacteristics != null : !SECURITY_CHARACTERISTICS_EDEFAULT.equals(securityCharacteristics);
			case ContentfwkPackage.CONTRACT__PRIVACY_CHARACTERISTICS:
				return PRIVACY_CHARACTERISTICS_EDEFAULT == null ? privacyCharacteristics != null : !PRIVACY_CHARACTERISTICS_EDEFAULT.equals(privacyCharacteristics);
			case ContentfwkPackage.CONTRACT__INTEGRITY_CHARACTERISTICS:
				return INTEGRITY_CHARACTERISTICS_EDEFAULT == null ? integrityCharacteristics != null : !INTEGRITY_CHARACTERISTICS_EDEFAULT.equals(integrityCharacteristics);
			case ContentfwkPackage.CONTRACT__CREDIBILITY_CHARACTERISTICS:
				return CREDIBILITY_CHARACTERISTICS_EDEFAULT == null ? credibilityCharacteristics != null : !CREDIBILITY_CHARACTERISTICS_EDEFAULT.equals(credibilityCharacteristics);
			case ContentfwkPackage.CONTRACT__LOCALIZATION_CHARACTERISTICS:
				return LOCALIZATION_CHARACTERISTICS_EDEFAULT == null ? localizationCharacteristics != null : !LOCALIZATION_CHARACTERISTICS_EDEFAULT.equals(localizationCharacteristics);
			case ContentfwkPackage.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS:
				return INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT == null ? internationalizationCharacteristics != null : !INTERNATIONALIZATION_CHARACTERISTICS_EDEFAULT.equals(internationalizationCharacteristics);
			case ContentfwkPackage.CONTRACT__INTEROPERABILITY_CHARACTERISTICS:
				return INTEROPERABILITY_CHARACTERISTICS_EDEFAULT == null ? interoperabilityCharacteristics != null : !INTEROPERABILITY_CHARACTERISTICS_EDEFAULT.equals(interoperabilityCharacteristics);
			case ContentfwkPackage.CONTRACT__SCALABILITY_CHARACTERISTICS:
				return SCALABILITY_CHARACTERISTICS_EDEFAULT == null ? scalabilityCharacteristics != null : !SCALABILITY_CHARACTERISTICS_EDEFAULT.equals(scalabilityCharacteristics);
			case ContentfwkPackage.CONTRACT__PORTABILITY_CHARACTERISTICS:
				return PORTABILITY_CHARACTERISTICS_EDEFAULT == null ? portabilityCharacteristics != null : !PORTABILITY_CHARACTERISTICS_EDEFAULT.equals(portabilityCharacteristics);
			case ContentfwkPackage.CONTRACT__EXTENSIBILITY_CHARACTERISTICS:
				return EXTENSIBILITY_CHARACTERISTICS_EDEFAULT == null ? extensibilityCharacteristics != null : !EXTENSIBILITY_CHARACTERISTICS_EDEFAULT.equals(extensibilityCharacteristics);
			case ContentfwkPackage.CONTRACT__CAPACITY_CHARACTERISTICS:
				return CAPACITY_CHARACTERISTICS_EDEFAULT == null ? capacityCharacteristics != null : !CAPACITY_CHARACTERISTICS_EDEFAULT.equals(capacityCharacteristics);
			case ContentfwkPackage.CONTRACT__THROUGHPUT:
				return THROUGHPUT_EDEFAULT == null ? throughput != null : !THROUGHPUT_EDEFAULT.equals(throughput);
			case ContentfwkPackage.CONTRACT__THROUGHPUT_PERIOD:
				return THROUGHPUT_PERIOD_EDEFAULT == null ? throughputPeriod != null : !THROUGHPUT_PERIOD_EDEFAULT.equals(throughputPeriod);
			case ContentfwkPackage.CONTRACT__GROWTH:
				return GROWTH_EDEFAULT == null ? growth != null : !GROWTH_EDEFAULT.equals(growth);
			case ContentfwkPackage.CONTRACT__GROWTH_PERIOD:
				return GROWTH_PERIOD_EDEFAULT == null ? growthPeriod != null : !GROWTH_PERIOD_EDEFAULT.equals(growthPeriod);
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_SHORT_TERM:
				return PEAK_PROFILE_SHORT_TERM_EDEFAULT == null ? peakProfileShortTerm != null : !PEAK_PROFILE_SHORT_TERM_EDEFAULT.equals(peakProfileShortTerm);
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_LONG_TERM:
				return PEAK_PROFILE_LONG_TERM_EDEFAULT == null ? peakProfileLongTerm != null : !PEAK_PROFILE_LONG_TERM_EDEFAULT.equals(peakProfileLongTerm);
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
		result.append(" (behaviorCharacteristics: ");
		result.append(behaviorCharacteristics);
		result.append(", ServiceNameCaller: ");
		result.append(serviceNameCaller);
		result.append(", ServiceNameCalled: ");
		result.append(serviceNameCalled);
		result.append(", serviceQualityCharacteristics: ");
		result.append(serviceQualityCharacteristics);
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
		result.append(", responseCharacteristics: ");
		result.append(responseCharacteristics);
		result.append(", reliabilityCharacteristics: ");
		result.append(reliabilityCharacteristics);
		result.append(", qualityOfInformationRequired: ");
		result.append(qualityOfInformationRequired);
		result.append(", contractControlRequirements: ");
		result.append(contractControlRequirements);
		result.append(", resultControlRequirements: ");
		result.append(resultControlRequirements);
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

} //ContractImpl
