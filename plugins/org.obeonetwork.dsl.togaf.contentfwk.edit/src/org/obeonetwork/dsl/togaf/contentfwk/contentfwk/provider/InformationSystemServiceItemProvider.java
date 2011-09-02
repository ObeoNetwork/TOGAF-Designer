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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationSystemServiceItemProvider
	extends ServiceItemProvider
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
	public InformationSystemServiceItemProvider(AdapterFactory adapterFactory) {
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

			addDelegatesPropertyDescriptor(object);
			addIsDelegatedByPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addSourceDescrPropertyDescriptor(object);
			addOwnerDescrPropertyDescriptor(object);
			addIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Delegates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelegatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_delegates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_delegates_feature", "_UI_Element_type"),
				 ContentfwkPackage.Literals.ELEMENT__DELEGATES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Delegated By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDelegatedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_isDelegatedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_isDelegatedBy_feature", "_UI_Element_type"),
				 ContentfwkPackage.Literals.ELEMENT__IS_DELEGATED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_name_feature", "_UI_Element_type"),
				 ContentfwkPackage.Literals.ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_description_feature", "_UI_Element_type"),
				 ContentfwkPackage.Literals.ELEMENT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_category_feature", "_UI_Element_type"),
				 ContentfwkPackage.Literals.ELEMENT__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Descr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceDescrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_sourceDescr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_sourceDescr_feature", "_UI_Element_type"),
				 ContentfwkPackage.Literals.ELEMENT__SOURCE_DESCR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owner Descr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerDescrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_ownerDescr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_ownerDescr_feature", "_UI_Element_type"),
				 ContentfwkPackage.Literals.ELEMENT__OWNER_DESCR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_ID_feature", "_UI_Element_type"),
				 ContentfwkPackage.Literals.ELEMENT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns InformationSystemService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InformationSystemService"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InformationSystemService)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InformationSystemService_type") :
			getString("_UI_InformationSystemService_type") + " " + label;
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

		switch (notification.getFeatureID(InformationSystemService.class)) {
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__NAME:
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__DESCRIPTION:
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__CATEGORY:
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__SOURCE_DESCR:
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__OWNER_DESCR:
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContentfwkPackage.INFORMATION_SYSTEM_SERVICE__ANY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createEnterpriseArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createBusinessArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createDataArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createTechnologyArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createDriver()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createOrganizationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createDataEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createLogicalApplicationComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createBusinessService()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createPlatformService()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createPhysicalTechnologyComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createServiceQuality()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createContract()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createControl()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createPrinciple()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createGap()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createWorkPackage()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createLogicalDataComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createPhysicalDataComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createApplicationArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createPhysicalApplicationComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createLogicalTechnologyComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createStrategicArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.INFORMATION_SYSTEM_SERVICE__ANY,
				 ContentfwkFactory.eINSTANCE.createInformationSystemService()));
	}

}
