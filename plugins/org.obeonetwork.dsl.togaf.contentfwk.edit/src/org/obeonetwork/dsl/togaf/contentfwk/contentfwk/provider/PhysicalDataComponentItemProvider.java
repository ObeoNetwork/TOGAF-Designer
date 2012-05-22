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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalDataComponentItemProvider
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
	public PhysicalDataComponentItemProvider(AdapterFactory adapterFactory) {
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
			addLastStandardCreationDatePropertyDescriptor(object);
			addNextStandardCreationDatePropertyDescriptor(object);
			addRetireDatePropertyDescriptor(object);
			addExtendsLogicalDataComponentsPropertyDescriptor(object);
			addIsHotedInLocationPropertyDescriptor(object);
			addDecomposesPhysicalDataComponentPropertyDescriptor(object);
			addEncapsulatesPhysicalApplicationComponentsPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Last Standard Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastStandardCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Standard_lastStandardCreationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Standard_lastStandardCreationDate_feature", "_UI_Standard_type"),
				 ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Standard Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextStandardCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Standard_nextStandardCreationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Standard_nextStandardCreationDate_feature", "_UI_Standard_type"),
				 ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_CREATION_DATE,
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
	 * This adds a property descriptor for the Extends Logical Data Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendsLogicalDataComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalDataComponent_extendsLogicalDataComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalDataComponent_extendsLogicalDataComponents_feature", "_UI_PhysicalDataComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__EXTENDS_LOGICAL_DATA_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Hoted In Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsHotedInLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalDataComponent_isHotedInLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalDataComponent_isHotedInLocation_feature", "_UI_PhysicalDataComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decomposes Physical Data Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposesPhysicalDataComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalDataComponent_decomposesPhysicalDataComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalDataComponent_decomposesPhysicalDataComponent_feature", "_UI_PhysicalDataComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__DECOMPOSES_PHYSICAL_DATA_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encapsulates Physical Application Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncapsulatesPhysicalApplicationComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhysicalDataComponent_encapsulatesPhysicalApplicationComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhysicalDataComponent_encapsulatesPhysicalApplicationComponents_feature", "_UI_PhysicalDataComponent_type"),
				 ContentfwkPackage.Literals.PHYSICAL_DATA_COMPONENT__ENCAPSULATES_PHYSICAL_APPLICATION_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns PhysicalDataComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PhysicalDataComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PhysicalDataComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PhysicalDataComponent_type") :
			getString("_UI_PhysicalDataComponent_type") + " " + label;
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

		switch (notification.getFeatureID(PhysicalDataComponent.class)) {
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CLASS:
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__STANDARD_CREATION_DATE:
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__LAST_STANDARD_CREATION_DATE:
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__NEXT_STANDARD_CREATION_DATE:
			case ContentfwkPackage.PHYSICAL_DATA_COMPONENT__RETIRE_DATE:
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
