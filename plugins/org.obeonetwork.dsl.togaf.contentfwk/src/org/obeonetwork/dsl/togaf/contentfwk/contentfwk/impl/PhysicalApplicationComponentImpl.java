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
		return (StandardsClass)eGet(ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eSet(ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return (Date)eGet(ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		eSet(ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, newStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardCreationDate() {
		return (Date)eGet(ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardCreationDate(Date newLastStandardCreationDate) {
		eSet(ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE, newLastStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardCreationDate() {
		return (Date)eGet(ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardCreationDate(Date newNextStandardCreationDate) {
		eSet(ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE, newNextStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return (Date)eGet(ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		eSet(ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, newRetireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LogicalApplicationComponent> getExtendsLogicalApplicationComponents() {
		return (EList<LogicalApplicationComponent>)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Location> getIsHostedInLocation() {
		return (EList<Location>)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalApplicationComponent> getCommunicatesWith() {
		return (EList<PhysicalApplicationComponent>)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycleStatus getLifeCycleStatus() {
		return (LifeCycleStatus)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCycleStatus(LifeCycleStatus newLifeCycleStatus) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS, newLifeCycleStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getInitialLiveDate() {
		return (Date)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialLiveDate(Date newInitialLiveDate) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE, newInitialLiveDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfLastRelease() {
		return (Date)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfLastRelease(Date newDateOfLastRelease) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE, newDateOfLastRelease);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfNextRelease() {
		return (Date)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfNextRelease(Date newDateOfNextRelease) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE, newDateOfNextRelease);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetirementDate() {
		return (Date)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetirementDate(Date newRetirementDate) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE, newRetirementDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailabilityQualityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityQualityCharacteristics(String newAvailabilityQualityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_QUALITY_CHARACTERISTICS, newAvailabilityQualityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServicesTimes() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicesTimes(String newServicesTimes) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES, newServicesTimes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManageabilityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManageabilityCharacteristics(String newManageabilityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS, newManageabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceabilityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceabilityCharacteristics(String newServiceabilityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS, newServiceabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerformanceCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceCharacteristics(String newPerformanceCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS, newPerformanceCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReliabilityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliabilityCharacteristics(String newReliabilityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS, newReliabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecoverabilityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoverabilityCharacteristics(String newRecoverabilityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS, newRecoverabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocatabilityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocatabilityCharacteristics(String newLocatabilityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS, newLocatabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityCharacteristics(String newSecurityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS, newSecurityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivacyCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacyCharacteristics(String newPrivacyCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS, newPrivacyCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntegrityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrityCharacteristics(String newIntegrityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS, newIntegrityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCredibilityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredibilityCharacteristics(String newCredibilityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS, newCredibilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalizationCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizationCharacteristics(String newLocalizationCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS, newLocalizationCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternationalizationCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternationalizationCharacteristics(String newInternationalizationCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS, newInternationalizationCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInteroperabilityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteroperabilityCharacteristics(String newInteroperabilityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS, newInteroperabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalabilityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalabilityCharacteristics(String newScalabilityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS, newScalabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortabilityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortabilityCharacteristics(String newPortabilityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS, newPortabilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensibilityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensibilityCharacteristics(String newExtensibilityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS, newExtensibilityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacityCharacteristics() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityCharacteristics(String newCapacityCharacteristics) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS, newCapacityCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThroughput() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(String newThroughput) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT, newThroughput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThroughputPeriod() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughputPeriod(String newThroughputPeriod) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD, newThroughputPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrowth() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__GROWTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrowth(String newGrowth) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__GROWTH, newGrowth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrowthPeriod() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrowthPeriod(String newGrowthPeriod) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD, newGrowthPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeakProfileShortTerm() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeakProfileShortTerm(String newPeakProfileShortTerm) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM, newPeakProfileShortTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeakProfileLongTerm() {
		return (String)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeakProfileLongTerm(String newPeakProfileLongTerm) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM, newPeakProfileLongTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalDataComponent> getEncapsulatesPhysicalDataComponents() {
		return (EList<PhysicalDataComponent>)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalTechnologyComponent> getIsRealizedByPhysicalTechnologyComponents() {
		return (EList<PhysicalTechnologyComponent>)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalApplicationComponent getDecomposesPhysicalApplicationComponent() {
		return (PhysicalApplicationComponent)eGet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesPhysicalApplicationComponent(PhysicalApplicationComponent newDecomposesPhysicalApplicationComponent) {
		eSet(ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT, newDecomposesPhysicalApplicationComponent);
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
