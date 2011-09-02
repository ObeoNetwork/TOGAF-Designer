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

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceItemProvider
	extends StandardItemProvider
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
	public ServiceItemProvider(AdapterFactory adapterFactory) {
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

			addIsProvidedToActorsPropertyDescriptor(object);
			addProvidesGovernedInterfaceToAccessFunctionsPropertyDescriptor(object);
			addProvidesEntitiesPropertyDescriptor(object);
			addConsumesEntitiesPropertyDescriptor(object);
			addIsGovernedAndMeasuredByContractsPropertyDescriptor(object);
			addResolvesEventsPropertyDescriptor(object);
			addIsImplementedOnLogicalTechnologyComponentsPropertyDescriptor(object);
			addIsRealizedThroughLogicalApplicationComponentPropertyDescriptor(object);
			addIsOwnedAndGovernedByOrganizationUnitsPropertyDescriptor(object);
			addIsTrackedAgainstMeasuresPropertyDescriptor(object);
			addSupportsProcessesPropertyDescriptor(object);
			addIsRealizedByProcessesPropertyDescriptor(object);
			addMeetsQualitiesPropertyDescriptor(object);
			addConsumesServicesPropertyDescriptor(object);
			addDecomposesServicesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
	 * This adds a property descriptor for the Provides Entities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesEntitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_providesEntities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_providesEntities_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__PROVIDES_ENTITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumes Entities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumesEntitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_consumesEntities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_consumesEntities_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__CONSUMES_ENTITIES,
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
	 * This adds a property descriptor for the Meets Qualities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeetsQualitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_meetsQualities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_meetsQualities_feature", "_UI_Service_type"),
				 ContentfwkPackage.Literals.SERVICE__MEETS_QUALITIES,
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		StandardsClass labelValue = ((Service)object).getStandardClass();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Service_type") :
			getString("_UI_Service_type") + " " + label;
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
