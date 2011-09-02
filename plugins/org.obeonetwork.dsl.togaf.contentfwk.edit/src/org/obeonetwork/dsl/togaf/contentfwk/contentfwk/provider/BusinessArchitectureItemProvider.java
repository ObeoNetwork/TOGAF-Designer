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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessArchitectureItemProvider
	extends ArchitectureItemProvider
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
	public BusinessArchitectureItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__DRIVERS);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__GOALS);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__OBJECTIVES);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__UNITS);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__ACTORS);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__ROLES);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__FUNCTIONS);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__SERVICES);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__PROCESSES);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__CONTROLS);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__EVENTS);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__LOCATIONS);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__PRODUCTS);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__CONTRACTS);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__MEASURES);
			childrenFeatures.add(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__SERVICES_QUALITY);
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
	 * This returns BusinessArchitecture.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessArchitecture"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BusinessArchitecture_type");
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

		switch (notification.getFeatureID(BusinessArchitecture.class)) {
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__DRIVERS:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__GOALS:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__OBJECTIVES:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__UNITS:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ACTORS:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__ROLES:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__FUNCTIONS:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PROCESSES:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTROLS:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__EVENTS:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__LOCATIONS:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__PRODUCTS:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__CONTRACTS:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__MEASURES:
			case ContentfwkPackage.BUSINESS_ARCHITECTURE__SERVICES_QUALITY:
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
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__DRIVERS,
				 ContentfwkFactory.eINSTANCE.createDriver()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__GOALS,
				 ContentfwkFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__OBJECTIVES,
				 ContentfwkFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__UNITS,
				 ContentfwkFactory.eINSTANCE.createOrganizationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__ACTORS,
				 ContentfwkFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__ROLES,
				 ContentfwkFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__FUNCTIONS,
				 ContentfwkFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__SERVICES,
				 ContentfwkFactory.eINSTANCE.createBusinessService()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__PROCESSES,
				 ContentfwkFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__CONTROLS,
				 ContentfwkFactory.eINSTANCE.createControl()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__EVENTS,
				 ContentfwkFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__LOCATIONS,
				 ContentfwkFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__PRODUCTS,
				 ContentfwkFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__CONTRACTS,
				 ContentfwkFactory.eINSTANCE.createContract()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__MEASURES,
				 ContentfwkFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE__SERVICES_QUALITY,
				 ContentfwkFactory.eINSTANCE.createServiceQuality()));
	}

}
