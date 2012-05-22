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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContractItemProvider
	extends ElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addGovernsAndMeasuresBusinessServicesPropertyDescriptor(object);
			addMeetsServiceQualityPropertyDescriptor(object);
			addBehaviorCharacteristicsPropertyDescriptor(object);
			addServiceNameCallerPropertyDescriptor(object);
			addServiceNameCalledPropertyDescriptor(object);
			addServiceQualityCharacteristicsPropertyDescriptor(object);
			addAvailabilityQualityCharacteristicsPropertyDescriptor(object);
			addServicesTimesPropertyDescriptor(object);
			addManageabilityCharacteristicsPropertyDescriptor(object);
			addServiceabilityCharacteristicsPropertyDescriptor(object);
			addPerformanceCharacteristicsPropertyDescriptor(object);
			addResponseCharacteristicsPropertyDescriptor(object);
			addReliabilityCharacteristicsPropertyDescriptor(object);
			addQualityOfInformationRequiredPropertyDescriptor(object);
			addContractControlRequirementsPropertyDescriptor(object);
			addResultControlRequirementsPropertyDescriptor(object);
			addRecoverabilityCharacteristicsPropertyDescriptor(object);
			addLocatabilityCharacteristicsPropertyDescriptor(object);
			addSecurityCharacteristicsPropertyDescriptor(object);
			addPrivacyCharacteristicsPropertyDescriptor(object);
			addIntegrityCharacteristicsPropertyDescriptor(object);
			addCredibilityCharacteristicsPropertyDescriptor(object);
			addLocalizationCharacteristicsPropertyDescriptor(object);
			addInternationalizationCharacteristicsPropertyDescriptor(object);
			addInteroperabilityCharacteristicsPropertyDescriptor(object);
			addScalabilityCharacteristicsPropertyDescriptor(object);
			addPortabilityCharacteristicsPropertyDescriptor(object);
			addExtensibilityCharacteristicsPropertyDescriptor(object);
			addCapacityCharacteristicsPropertyDescriptor(object);
			addThroughputPropertyDescriptor(object);
			addThroughputPeriodPropertyDescriptor(object);
			addGrowthPropertyDescriptor(object);
			addGrowthPeriodPropertyDescriptor(object);
			addPeakProfileShortTermPropertyDescriptor(object);
			addPeakProfileLongTermPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Governs And Measures Business Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGovernsAndMeasuresBusinessServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_governsAndMeasuresBusinessServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_governsAndMeasuresBusinessServices_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__GOVERNS_AND_MEASURES_BUSINESS_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meets Service Quality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeetsServiceQualityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_meetsServiceQuality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_meetsServiceQuality_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__MEETS_SERVICE_QUALITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Behavior Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviorCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_behaviorCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_behaviorCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__BEHAVIOR_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Name Caller feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceNameCallerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_ServiceNameCaller_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_ServiceNameCaller_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__SERVICE_NAME_CALLER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Name Called feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceNameCalledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_ServiceNameCalled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_ServiceNameCalled_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__SERVICE_NAME_CALLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Quality Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceQualityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_serviceQualityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_serviceQualityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Availability Quality Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailabilityQualityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_availabilityQualityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_availabilityQualityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Services Times feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicesTimesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_servicesTimes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_servicesTimes_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__SERVICES_TIMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manageability Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManageabilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_manageabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_manageabilityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__MANAGEABILITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Serviceability Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceabilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_serviceabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_serviceabilityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__SERVICEABILITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Performance Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformanceCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_performanceCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_performanceCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__PERFORMANCE_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Response Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_responseCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_responseCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__RESPONSE_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reliability Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReliabilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_reliabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_reliabilityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__RELIABILITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quality Of Information Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualityOfInformationRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_qualityOfInformationRequired_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_qualityOfInformationRequired_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contract Control Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContractControlRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_contractControlRequirements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_contractControlRequirements_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Result Control Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultControlRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_resultControlRequirements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_resultControlRequirements_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__RESULT_CONTROL_REQUIREMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recoverability Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecoverabilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_recoverabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_recoverabilityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__RECOVERABILITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Locatability Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocatabilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_locatabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_locatabilityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__LOCATABILITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_securityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_securityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__SECURITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Privacy Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivacyCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_privacyCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_privacyCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__PRIVACY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Integrity Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntegrityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_integrityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_integrityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__INTEGRITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Credibility Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCredibilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_credibilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_credibilityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__CREDIBILITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Localization Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalizationCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_localizationCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_localizationCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__LOCALIZATION_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Internationalization Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternationalizationCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_internationalizationCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_internationalizationCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interoperability Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInteroperabilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_interoperabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_interoperabilityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__INTEROPERABILITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scalability Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalabilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_scalabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_scalabilityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__SCALABILITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Portability Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortabilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_portabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_portabilityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__PORTABILITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extensibility Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensibilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_extensibilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_extensibilityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__EXTENSIBILITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacity Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_capacityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_capacityCharacteristics_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__CAPACITY_CHARACTERISTICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Throughput feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThroughputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_throughput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_throughput_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__THROUGHPUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Throughput Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThroughputPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_throughputPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_throughputPeriod_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__THROUGHPUT_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Growth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrowthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_growth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_growth_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__GROWTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Growth Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrowthPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_growthPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_growthPeriod_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__GROWTH_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Peak Profile Short Term feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeakProfileShortTermPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_peakProfileShortTerm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_peakProfileShortTerm_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__PEAK_PROFILE_SHORT_TERM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Peak Profile Long Term feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeakProfileLongTermPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Contract_peakProfileLongTerm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Contract_peakProfileLongTerm_feature", "_UI_Contract_type"),
				 ContentfwkPackage.Literals.CONTRACT__PEAK_PROFILE_LONG_TERM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Contract.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Contract"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Contract)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Contract_type") :
			getString("_UI_Contract_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Contract.class)) {
			case ContentfwkPackage.CONTRACT__BEHAVIOR_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLER:
			case ContentfwkPackage.CONTRACT__SERVICE_NAME_CALLED:
			case ContentfwkPackage.CONTRACT__SERVICE_QUALITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__AVAILABILITY_QUALITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__SERVICES_TIMES:
			case ContentfwkPackage.CONTRACT__MANAGEABILITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__SERVICEABILITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__PERFORMANCE_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__RESPONSE_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__RELIABILITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__QUALITY_OF_INFORMATION_REQUIRED:
			case ContentfwkPackage.CONTRACT__CONTRACT_CONTROL_REQUIREMENTS:
			case ContentfwkPackage.CONTRACT__RESULT_CONTROL_REQUIREMENTS:
			case ContentfwkPackage.CONTRACT__RECOVERABILITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__LOCATABILITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__SECURITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__PRIVACY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__INTEGRITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__CREDIBILITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__LOCALIZATION_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__INTERNATIONALIZATION_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__INTEROPERABILITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__SCALABILITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__PORTABILITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__EXTENSIBILITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__CAPACITY_CHARACTERISTICS:
			case ContentfwkPackage.CONTRACT__THROUGHPUT:
			case ContentfwkPackage.CONTRACT__THROUGHPUT_PERIOD:
			case ContentfwkPackage.CONTRACT__GROWTH:
			case ContentfwkPackage.CONTRACT__GROWTH_PERIOD:
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_SHORT_TERM:
			case ContentfwkPackage.CONTRACT__PEAK_PROFILE_LONG_TERM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
