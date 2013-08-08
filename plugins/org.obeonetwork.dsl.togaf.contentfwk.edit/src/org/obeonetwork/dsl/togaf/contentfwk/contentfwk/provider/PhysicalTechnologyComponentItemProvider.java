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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalTechnologyComponentItemProvider
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
	public PhysicalTechnologyComponentItemProvider(AdapterFactory adapterFactory) {
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
			addRealizesPhysicalApplicationComponentsPropertyDescriptor(object);
			addExtendsLogicalTechnologyComponentsPropertyDescriptor(object);
			addIsHostedInLocationPropertyDescriptor(object);
			addProductNamePropertyDescriptor(object);
			addModuleNamePropertyDescriptor(object);
			addVendorPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addDecomposesPhysicalTechnologyComponentPropertyDescriptor(object);
			addIsDependentOnPhysicalTechnologyComponentsPropertyDescriptor(object);
			addCategoryTRMPropertyDescriptor(object);
			addIsRequiredByPhysicalTechnologyComponentPropertyDescriptor(object);
			addIsDecomposedByPhysicalTechnologyComponentsPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Realizes Physical Application Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizesPhysicalApplicationComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTechnologyComponent_realizesPhysicalApplicationComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_realizesPhysicalApplicationComponents_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__REALIZES_PHYSICAL_APPLICATION_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extends Logical Technology Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsLogicalTechnologyComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTechnologyComponent_extendsLogicalTechnologyComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_extendsLogicalTechnologyComponents_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__EXTENDS_LOGICAL_TECHNOLOGY_COMPONENTS,
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
				 getString("_UI_PhysicalTechnologyComponent_isHostedInLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_isHostedInLocation_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Product Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTechnologyComponent_productName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_productName_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Module Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModuleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTechnologyComponent_moduleName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_moduleName_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vendor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVendorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTechnologyComponent_vendor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_vendor_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTechnologyComponent_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_version_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decomposes Physical Technology Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposesPhysicalTechnologyComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTechnologyComponent_decomposesPhysicalTechnologyComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_decomposesPhysicalTechnologyComponent_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__DECOMPOSES_PHYSICAL_TECHNOLOGY_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Dependent On Physical Technology Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDependentOnPhysicalTechnologyComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTechnologyComponent_isDependentOnPhysicalTechnologyComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_isDependentOnPhysicalTechnologyComponents_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DEPENDENT_ON_PHYSICAL_TECHNOLOGY_COMPONENTS,
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
				 getString("_UI_PhysicalTechnologyComponent_categoryTRM_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_categoryTRM_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Required By Physical Technology Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRequiredByPhysicalTechnologyComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTechnologyComponent_isRequiredByPhysicalTechnologyComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_isRequiredByPhysicalTechnologyComponent_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__IS_REQUIRED_BY_PHYSICAL_TECHNOLOGY_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Decomposed By Physical Technology Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDecomposedByPhysicalTechnologyComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalTechnologyComponent_isDecomposedByPhysicalTechnologyComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalTechnologyComponent_isDecomposedByPhysicalTechnologyComponents_feature", "_UI_PhysicalTechnologyComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_TECHNOLOGY_COMPONENT__IS_DECOMPOSED_BY_PHYSICAL_TECHNOLOGY_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PhysicalTechnologyComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PhysicalTechnologyComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PhysicalTechnologyComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PhysicalTechnologyComponent_type") :
			getString("_UI_PhysicalTechnologyComponent_type") + " " + label;
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

		switch (notification.getFeatureID(PhysicalTechnologyComponent.class)) {
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__STANDARD_CLASS:
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__PRODUCT_NAME:
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__MODULE_NAME:
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VENDOR:
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__VERSION:
			case ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__CATEGORY_TRM:
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
