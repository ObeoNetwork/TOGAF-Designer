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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalApplicationComponentItemProvider
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
	public PhysicalApplicationComponentItemProvider(AdapterFactory adapterFactory) {
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

			addStandardClassPropertyDescriptor(object);
			addStandardCreationDatePropertyDescriptor(object);
			addLastStandardReviewDatePropertyDescriptor(object);
			addNextStandardReviewDatePropertyDescriptor(object);
			addRetireDatePropertyDescriptor(object);
			addExtendsLogicalApplicationComponentsPropertyDescriptor(object);
			addIsHostedInLocationPropertyDescriptor(object);
			addCommunicatesWithPropertyDescriptor(object);
			addLifeCycleStatusPropertyDescriptor(object);
			addInitialLiveDatePropertyDescriptor(object);
			addDateOfLastReleasePropertyDescriptor(object);
			addDateOfNextReleasePropertyDescriptor(object);
			addRetirementDatePropertyDescriptor(object);
			addAvailabilityCharacteristicsPropertyDescriptor(object);
			addServicesTimesPropertyDescriptor(object);
			addManageabilityCharacteristicsPropertyDescriptor(object);
			addServiceabilityCharacteristicsPropertyDescriptor(object);
			addPerformanceCharacteristicsPropertyDescriptor(object);
			addReliabilityCharacteristicsPropertyDescriptor(object);
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
			addEncapsulatesPhysicalDataComponentsPropertyDescriptor(object);
			addIsRealizedByPhysicalTechnologyComponentsPropertyDescriptor(object);
			addDecomposesPhysicalApplicationComponentPropertyDescriptor(object);
			addIsDecomposedByPhysicalApplicationComponentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Standard Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandardClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Standard_standardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Standard_standardClass_feature", "_UI_Standard_type"),
				 ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Standard Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandardCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Standard_standardCreationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Standard_standardCreationDate_feature", "_UI_Standard_type"),
				 ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Standard Review Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastStandardReviewDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Standard_lastStandardReviewDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Standard_lastStandardReviewDate_feature", "_UI_Standard_type"),
				 ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_REVIEW_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Standard Review Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextStandardReviewDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Standard_nextStandardReviewDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Standard_nextStandardReviewDate_feature", "_UI_Standard_type"),
				 ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_REVIEW_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Retire Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetireDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Standard_retireDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Standard_retireDate_feature", "_UI_Standard_type"),
				 ContentfwkPackage.Literals.STANDARD__RETIRE_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extends Logical Application Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsLogicalApplicationComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_extendsLogicalApplicationComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_extendsLogicalApplicationComponents_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__EXTENDS_LOGICAL_APPLICATION_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Hosted In Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsHostedInLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_isHostedInLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_isHostedInLocation_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Communicates With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicatesWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_communicatesWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_communicatesWith_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Life Cycle Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLifeCycleStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_lifeCycleStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_lifeCycleStatus_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Live Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialLiveDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_initialLiveDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_initialLiveDate_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Of Last Release feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateOfLastReleasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_dateOfLastRelease_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_dateOfLastRelease_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Of Next Release feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateOfNextReleasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_dateOfNextRelease_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_dateOfNextRelease_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Retirement Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetirementDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_retirementDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_retirementDate_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Availability Characteristics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailabilityCharacteristicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_availabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_availabilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_servicesTimes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_servicesTimes_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES,
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
				 getString("_UI_PhysicalApplicationComponent_manageabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_manageabilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_serviceabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_serviceabilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_performanceCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_performanceCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_reliabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_reliabilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_recoverabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_recoverabilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_locatabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_locatabilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_securityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_securityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_privacyCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_privacyCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_integrityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_integrityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_credibilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_credibilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_localizationCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_localizationCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_internationalizationCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_internationalizationCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_interoperabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_interoperabilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_scalabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_scalabilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_portabilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_portabilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_extensibilityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_extensibilityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_capacityCharacteristics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_capacityCharacteristics_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS,
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
				 getString("_UI_PhysicalApplicationComponent_throughput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_throughput_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT,
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
				 getString("_UI_PhysicalApplicationComponent_throughputPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_throughputPeriod_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD,
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
				 getString("_UI_PhysicalApplicationComponent_growth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_growth_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__GROWTH,
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
				 getString("_UI_PhysicalApplicationComponent_growthPeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_growthPeriod_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD,
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
				 getString("_UI_PhysicalApplicationComponent_peakProfileShortTerm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_peakProfileShortTerm_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM,
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
				 getString("_UI_PhysicalApplicationComponent_peakProfileLongTerm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_peakProfileLongTerm_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encapsulates Physical Data Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncapsulatesPhysicalDataComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_encapsulatesPhysicalDataComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_encapsulatesPhysicalDataComponents_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__ENCAPSULATES_PHYSICAL_DATA_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Realized By Physical Technology Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRealizedByPhysicalTechnologyComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_isRealizedByPhysicalTechnologyComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_isRealizedByPhysicalTechnologyComponents_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decomposes Physical Application Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposesPhysicalApplicationComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_decomposesPhysicalApplicationComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_decomposesPhysicalApplicationComponent_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__DECOMPOSES_PHYSICAL_APPLICATION_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Decomposed By Physical Application Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDecomposedByPhysicalApplicationComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalApplicationComponent_isDecomposedByPhysicalApplicationComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalApplicationComponent_isDecomposedByPhysicalApplicationComponents_feature", "_UI_PhysicalApplicationComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_APPLICATION_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_APPLICATION_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PhysicalApplicationComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PhysicalApplicationComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PhysicalApplicationComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PhysicalApplicationComponent_type") :
			getString("_UI_PhysicalApplicationComponent_type") + " " + label;
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

		switch (notification.getFeatureID(PhysicalApplicationComponent.class)) {
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CLASS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__STANDARD_CREATION_DATE:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LAST_STANDARD_REVIEW_DATE:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__NEXT_STANDARD_REVIEW_DATE:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIRE_DATE:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LIFE_CYCLE_STATUS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INITIAL_LIVE_DATE:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_LAST_RELEASE:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__DATE_OF_NEXT_RELEASE:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RETIREMENT_DATE:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__AVAILABILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICES_TIMES:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__MANAGEABILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SERVICEABILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PERFORMANCE_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RELIABILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__RECOVERABILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCATABILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SECURITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PRIVACY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEGRITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CREDIBILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__LOCALIZATION_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTERNATIONALIZATION_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__INTEROPERABILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__SCALABILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PORTABILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__EXTENSIBILITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__CAPACITY_CHARACTERISTICS:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__THROUGHPUT_PERIOD:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__GROWTH_PERIOD:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_SHORT_TERM:
			case ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__PEAK_PROFILE_LONG_TERM:
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
