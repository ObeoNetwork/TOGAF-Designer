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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGovernsAndMeasuresBusinessServices <em>Governs And Measures Business Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getMeetsServiceQuality <em>Meets Service Quality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getBehaviorCharacteristics <em>Behavior Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceNameCaller <em>Service Name Caller</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceNameCalled <em>Service Name Called</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceQualityCharacteristics <em>Service Quality Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getAvailabilityQualityCharacteristics <em>Availability Quality Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServicesTimes <em>Services Times</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getManageabilityCharacteristics <em>Manageability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceabilityCharacteristics <em>Serviceability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPerformanceCharacteristics <em>Performance Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getResponseCharacteristics <em>Response Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getReliabilityCharacteristics <em>Reliability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getQualityOfInformationRequired <em>Quality Of Information Required</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getContractControlRequirements <em>Contract Control Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getResultControlRequirements <em>Result Control Requirements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getRecoverabilityCharacteristics <em>Recoverability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getLocatabilityCharacteristics <em>Locatability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getSecurityCharacteristics <em>Security Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPrivacyCharacteristics <em>Privacy Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getIntegrityCharacteristics <em>Integrity Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getCredibilityCharacteristics <em>Credibility Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getLocalizationCharacteristics <em>Localization Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getInternationalizationCharacteristics <em>Internationalization Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getInteroperabilityCharacteristics <em>Interoperability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getScalabilityCharacteristics <em>Scalability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPortabilityCharacteristics <em>Portability Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getExtensibilityCharacteristics <em>Extensibility Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getCapacityCharacteristics <em>Capacity Characteristics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getThroughputPeriod <em>Throughput Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGrowth <em>Growth</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGrowthPeriod <em>Growth Period</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPeakProfileShortTerm <em>Peak Profile Short Term</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPeakProfileLongTerm <em>Peak Profile Long Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends Element {
	/**
	 * Returns the value of the '<em><b>Governs And Measures Business Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsGovernedAndMeasuredByContracts <em>Is Governed And Measured By Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Governs And Measures Business Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governs And Measures Business Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_GovernsAndMeasuresBusinessServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsGovernedAndMeasuredByContracts
	 * @model opposite="isGovernedAndMeasuredByContracts"
	 * @generated
	 */
	EList<Service> getGovernsAndMeasuresBusinessServices();

	/**
	 * Returns the value of the '<em><b>Meets Service Quality</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality#getAppliesToContracts <em>Applies To Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meets Service Quality</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meets Service Quality</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_MeetsServiceQuality()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality#getAppliesToContracts
	 * @model opposite="appliesToContracts"
	 * @generated
	 */
	EList<ServiceQuality> getMeetsServiceQuality();

	/**
	 * Returns the value of the '<em><b>Behavior Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Characteristics</em>' attribute.
	 * @see #setBehaviorCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_BehaviorCharacteristics()
	 * @model
	 * @generated
	 */
	String getBehaviorCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getBehaviorCharacteristics <em>Behavior Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Characteristics</em>' attribute.
	 * @see #getBehaviorCharacteristics()
	 * @generated
	 */
	void setBehaviorCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Service Name Caller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name Caller</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name Caller</em>' attribute.
	 * @see #setServiceNameCaller(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ServiceNameCaller()
	 * @model
	 * @generated
	 */
	String getServiceNameCaller();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceNameCaller <em>Service Name Caller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name Caller</em>' attribute.
	 * @see #getServiceNameCaller()
	 * @generated
	 */
	void setServiceNameCaller(String value);

	/**
	 * Returns the value of the '<em><b>Service Name Called</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name Called</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name Called</em>' attribute.
	 * @see #setServiceNameCalled(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ServiceNameCalled()
	 * @model
	 * @generated
	 */
	String getServiceNameCalled();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceNameCalled <em>Service Name Called</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name Called</em>' attribute.
	 * @see #getServiceNameCalled()
	 * @generated
	 */
	void setServiceNameCalled(String value);

	/**
	 * Returns the value of the '<em><b>Service Quality Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Quality Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Quality Characteristics</em>' attribute.
	 * @see #setServiceQualityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ServiceQualityCharacteristics()
	 * @model
	 * @generated
	 */
	String getServiceQualityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceQualityCharacteristics <em>Service Quality Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Quality Characteristics</em>' attribute.
	 * @see #getServiceQualityCharacteristics()
	 * @generated
	 */
	void setServiceQualityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Availability Quality Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability Quality Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Quality Characteristics</em>' attribute.
	 * @see #setAvailabilityQualityCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_AvailabilityQualityCharacteristics()
	 * @model
	 * @generated
	 */
	String getAvailabilityQualityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getAvailabilityQualityCharacteristics <em>Availability Quality Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Quality Characteristics</em>' attribute.
	 * @see #getAvailabilityQualityCharacteristics()
	 * @generated
	 */
	void setAvailabilityQualityCharacteristics(String value);

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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ServicesTimes()
	 * @model
	 * @generated
	 */
	String getServicesTimes();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServicesTimes <em>Services Times</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ManageabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getManageabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getManageabilityCharacteristics <em>Manageability Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ServiceabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getServiceabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getServiceabilityCharacteristics <em>Serviceability Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_PerformanceCharacteristics()
	 * @model
	 * @generated
	 */
	String getPerformanceCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPerformanceCharacteristics <em>Performance Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Characteristics</em>' attribute.
	 * @see #getPerformanceCharacteristics()
	 * @generated
	 */
	void setPerformanceCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Response Characteristics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Characteristics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Characteristics</em>' attribute.
	 * @see #setResponseCharacteristics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ResponseCharacteristics()
	 * @model
	 * @generated
	 */
	String getResponseCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getResponseCharacteristics <em>Response Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Characteristics</em>' attribute.
	 * @see #getResponseCharacteristics()
	 * @generated
	 */
	void setResponseCharacteristics(String value);

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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ReliabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getReliabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getReliabilityCharacteristics <em>Reliability Characteristics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability Characteristics</em>' attribute.
	 * @see #getReliabilityCharacteristics()
	 * @generated
	 */
	void setReliabilityCharacteristics(String value);

	/**
	 * Returns the value of the '<em><b>Quality Of Information Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Of Information Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Of Information Required</em>' attribute.
	 * @see #setQualityOfInformationRequired(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_QualityOfInformationRequired()
	 * @model
	 * @generated
	 */
	String getQualityOfInformationRequired();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getQualityOfInformationRequired <em>Quality Of Information Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Of Information Required</em>' attribute.
	 * @see #getQualityOfInformationRequired()
	 * @generated
	 */
	void setQualityOfInformationRequired(String value);

	/**
	 * Returns the value of the '<em><b>Contract Control Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contract Control Requirements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract Control Requirements</em>' attribute.
	 * @see #setContractControlRequirements(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ContractControlRequirements()
	 * @model
	 * @generated
	 */
	String getContractControlRequirements();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getContractControlRequirements <em>Contract Control Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract Control Requirements</em>' attribute.
	 * @see #getContractControlRequirements()
	 * @generated
	 */
	void setContractControlRequirements(String value);

	/**
	 * Returns the value of the '<em><b>Result Control Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Control Requirements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Control Requirements</em>' attribute.
	 * @see #setResultControlRequirements(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ResultControlRequirements()
	 * @model
	 * @generated
	 */
	String getResultControlRequirements();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getResultControlRequirements <em>Result Control Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Control Requirements</em>' attribute.
	 * @see #getResultControlRequirements()
	 * @generated
	 */
	void setResultControlRequirements(String value);

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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_RecoverabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getRecoverabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getRecoverabilityCharacteristics <em>Recoverability Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_LocatabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getLocatabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getLocatabilityCharacteristics <em>Locatability Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_SecurityCharacteristics()
	 * @model
	 * @generated
	 */
	String getSecurityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getSecurityCharacteristics <em>Security Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_PrivacyCharacteristics()
	 * @model
	 * @generated
	 */
	String getPrivacyCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPrivacyCharacteristics <em>Privacy Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_IntegrityCharacteristics()
	 * @model
	 * @generated
	 */
	String getIntegrityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getIntegrityCharacteristics <em>Integrity Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_CredibilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getCredibilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getCredibilityCharacteristics <em>Credibility Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_LocalizationCharacteristics()
	 * @model
	 * @generated
	 */
	String getLocalizationCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getLocalizationCharacteristics <em>Localization Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_InternationalizationCharacteristics()
	 * @model
	 * @generated
	 */
	String getInternationalizationCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getInternationalizationCharacteristics <em>Internationalization Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_InteroperabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getInteroperabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getInteroperabilityCharacteristics <em>Interoperability Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ScalabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getScalabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getScalabilityCharacteristics <em>Scalability Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_PortabilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getPortabilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPortabilityCharacteristics <em>Portability Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ExtensibilityCharacteristics()
	 * @model
	 * @generated
	 */
	String getExtensibilityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getExtensibilityCharacteristics <em>Extensibility Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_CapacityCharacteristics()
	 * @model
	 * @generated
	 */
	String getCapacityCharacteristics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getCapacityCharacteristics <em>Capacity Characteristics</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_Throughput()
	 * @model
	 * @generated
	 */
	String getThroughput();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getThroughput <em>Throughput</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_ThroughputPeriod()
	 * @model
	 * @generated
	 */
	String getThroughputPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getThroughputPeriod <em>Throughput Period</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_Growth()
	 * @model
	 * @generated
	 */
	String getGrowth();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGrowth <em>Growth</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_GrowthPeriod()
	 * @model
	 * @generated
	 */
	String getGrowthPeriod();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getGrowthPeriod <em>Growth Period</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_PeakProfileShortTerm()
	 * @model
	 * @generated
	 */
	String getPeakProfileShortTerm();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPeakProfileShortTerm <em>Peak Profile Short Term</em>}' attribute.
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getContract_PeakProfileLongTerm()
	 * @model
	 * @generated
	 */
	String getPeakProfileLongTerm();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract#getPeakProfileLongTerm <em>Peak Profile Long Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak Profile Long Term</em>' attribute.
	 * @see #getPeakProfileLongTerm()
	 * @generated
	 */
	void setPeakProfileLongTerm(String value);

} // Contract
