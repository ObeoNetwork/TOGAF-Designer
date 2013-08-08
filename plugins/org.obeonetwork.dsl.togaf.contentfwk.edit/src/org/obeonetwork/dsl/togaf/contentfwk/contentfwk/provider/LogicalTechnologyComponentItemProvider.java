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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalTechnologyComponentItemProvider
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
	public LogicalTechnologyComponentItemProvider(AdapterFactory adapterFactory) {
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
			addProvidesPlatformForServicesPropertyDescriptor(object);
			addSuppliesPlatformServicesPropertyDescriptor(object);
			addIsRealizedByPhysicalTechnologyComponentsPropertyDescriptor(object);
			addDecomposesLogicalTechnologyComponentPropertyDescriptor(object);
			addIsDependentOnLogicalTechnologyComponentsPropertyDescriptor(object);
			addCategoryTRMPropertyDescriptor(object);
			addIsExtendedByPhysicalTechnologyComponentPropertyDescriptor(object);
			addIsRequiredByLogicalTechnologyComponentsPropertyDescriptor(object);
			addIsDecomposedByLogicalTechnologyComponentsPropertyDescriptor(object);
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
				 getString("_UI_TechnologyComponent_standardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TechnologyComponent_standardClass_feature", "_UI_TechnologyComponent_type"),
				 ContentfwkPackage.Literals.TECHNOLOGY_COMPONENT__STANDARD_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provides Platform For Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidesPlatformForServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalTechnologyComponent_providesPlatformForServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalTechnologyComponent_providesPlatformForServices_feature", "_UI_LogicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__PROVIDES_PLATFORM_FOR_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supplies Platform Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuppliesPlatformServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalTechnologyComponent_suppliesPlatformServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalTechnologyComponent_suppliesPlatformServices_feature", "_UI_LogicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__SUPPLIES_PLATFORM_SERVICES,
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
				 getString("_UI_LogicalTechnologyComponent_isRealizedByPhysicalTechnologyComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalTechnologyComponent_isRealizedByPhysicalTechnologyComponents_feature", "_UI_LogicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__IS_REALIZED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decomposes Logical Technology Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposesLogicalTechnologyComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalTechnologyComponent_decomposesLogicalTechnologyComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalTechnologyComponent_decomposesLogicalTechnologyComponent_feature", "_UI_LogicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_LOGICAL_TECHNOLOGY_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Dependent On Logical Technology Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDependentOnLogicalTechnologyComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalTechnologyComponent_isDependentOnLogicalTechnologyComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalTechnologyComponent_isDependentOnLogicalTechnologyComponents_feature", "_UI_LogicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_LOGICAL_TECHNOLOGY_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category TRM feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryTRMPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalTechnologyComponent_categoryTRM_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalTechnologyComponent_categoryTRM_feature", "_UI_LogicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Extended By Physical Technology Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExtendedByPhysicalTechnologyComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalTechnologyComponent_isExtendedByPhysicalTechnologyComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalTechnologyComponent_isExtendedByPhysicalTechnologyComponent_feature", "_UI_LogicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__IS_EXTENDED_BY_PHYSICAL_TECHNOLOGY_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Required By Logical Technology Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRequiredByLogicalTechnologyComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalTechnologyComponent_isRequiredByLogicalTechnologyComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalTechnologyComponent_isRequiredByLogicalTechnologyComponents_feature", "_UI_LogicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_LOGICAL_TECHNOLOGY_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Decomposed By Logical Technology Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDecomposedByLogicalTechnologyComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LogicalTechnologyComponent_isDecomposedByLogicalTechnologyComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LogicalTechnologyComponent_isDecomposedByLogicalTechnologyComponents_feature", "_UI_LogicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.LOGICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_LOGICAL_TECHNOLOGY_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns LogicalTechnologyComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogicalTechnologyComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LogicalTechnologyComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LogicalTechnologyComponent_type") :
			getString("_UI_LogicalTechnologyComponent_type") + " " + label;
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

		switch (notification.getFeatureID(LogicalTechnologyComponent.class)) {
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS:
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM:
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
