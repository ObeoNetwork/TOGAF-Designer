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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessServiceItemProvider
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
	public BusinessServiceItemProvider(AdapterFactory adapterFactory) {
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
			addIsProvidedToActorsPropertyDescriptor(object);
			addProvidesGovernedInterfaceToAccessFunctionsPropertyDescriptor(object);
			addProvidesDataEntitiesPropertyDescriptor(object);
			addConsumesDataEntitiesPropertyDescriptor(object);
			addIsGovernedAndMeasuredByContractsPropertyDescriptor(object);
			addResolvesEventsPropertyDescriptor(object);
			addIsImplementedOnLogicalTechnologyComponentsPropertyDescriptor(object);
			addIsRealizedThroughLogicalApplicationComponentPropertyDescriptor(object);
			addIsOwnedAndGovernedByOrganizationUnitsPropertyDescriptor(object);
			addIsTrackedAgainstMeasuresPropertyDescriptor(object);
			addSupportsProcessesPropertyDescriptor(object);
			addIsRealizedByProcessesPropertyDescriptor(object);
			addMeetsServiceQualitiesPropertyDescriptor(object);
			addConsumesServicesPropertyDescriptor(object);
			addDecomposesServicesPropertyDescriptor(object);
			addIsDecomposedByServicesPropertyDescriptor(object);
			addSupportsObjectivePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Is Provided To Actors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsProvidedToActorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_isProvidedToActors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_isProvidedToActors_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__IS_PROVIDED_TO_ACTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provides Governed Interface To Access Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesGovernedInterfaceToAccessFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_providesGovernedInterfaceToAccessFunctions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_providesGovernedInterfaceToAccessFunctions_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__PROVIDES_GOVERNED_INTERFACE_TO_ACCESS_FUNCTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provides Data Entities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesDataEntitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_providesDataEntities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_providesDataEntities_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__PROVIDES_DATA_ENTITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumes Data Entities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumesDataEntitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_consumesDataEntities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_consumesDataEntities_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__CONSUMES_DATA_ENTITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Governed And Measured By Contracts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsGovernedAndMeasuredByContractsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_isGovernedAndMeasuredByContracts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_isGovernedAndMeasuredByContracts_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__IS_GOVERNED_AND_MEASURED_BY_CONTRACTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolves Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolvesEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_resolvesEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_resolvesEvents_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__RESOLVES_EVENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Implemented On Logical Technology Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsImplementedOnLogicalTechnologyComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_isImplementedOnLogicalTechnologyComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_isImplementedOnLogicalTechnologyComponents_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__IS_IMPLEMENTED_ON_LOGICAL_TECHNOLOGY_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Realized Through Logical Application Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRealizedThroughLogicalApplicationComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_isRealizedThroughLogicalApplicationComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_isRealizedThroughLogicalApplicationComponent_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__IS_REALIZED_THROUGH_LOGICAL_APPLICATION_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Owned And Governed By Organization Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOwnedAndGovernedByOrganizationUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_isOwnedAndGovernedByOrganizationUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_isOwnedAndGovernedByOrganizationUnits_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Tracked Against Measures feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTrackedAgainstMeasuresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_isTrackedAgainstMeasures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_isTrackedAgainstMeasures_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__IS_TRACKED_AGAINST_MEASURES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supports Processes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportsProcessesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_supportsProcesses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_supportsProcesses_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__SUPPORTS_PROCESSES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Realized By Processes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRealizedByProcessesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_isRealizedByProcesses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_isRealizedByProcesses_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__IS_REALIZED_BY_PROCESSES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meets Service Qualities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeetsServiceQualitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_meetsServiceQualities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_meetsServiceQualities_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__MEETS_SERVICE_QUALITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumes Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumesServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_consumesServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_consumesServices_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__CONSUMES_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decomposes Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposesServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_decomposesServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_decomposesServices_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__DECOMPOSES_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Decomposed By Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDecomposedByServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_isDecomposedByServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_isDecomposedByServices_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__IS_DECOMPOSED_BY_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supports Objective feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportsObjectivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessService_supportsObjective_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessService_supportsObjective_feature", "_UI_BusinessService_type"),
				 ContentfwkPackage.Literals.BUSINESS_SERVICE__SUPPORTS_OBJECTIVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns BusinessService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessService"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BusinessService)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusinessService_type") :
			getString("_UI_BusinessService_type") + " " + label;
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

		switch (notification.getFeatureID(BusinessService.class)) {
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CLASS:
			case ContentfwkPackage.BUSINESS_SERVICE__STANDARD_CREATION_DATE:
			case ContentfwkPackage.BUSINESS_SERVICE__LAST_STANDARD_REVIEW_DATE:
			case ContentfwkPackage.BUSINESS_SERVICE__NEXT_STANDARD_REVIEW_DATE:
			case ContentfwkPackage.BUSINESS_SERVICE__RETIRE_DATE:
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
