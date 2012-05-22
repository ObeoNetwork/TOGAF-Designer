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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataEntityItemProvider
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
	public DataEntityItemProvider(AdapterFactory adapterFactory) {
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

			addIsSuppliedByActorsPropertyDescriptor(object);
			addIsConsumedByActorsPropertyDescriptor(object);
			addIsAccessedByServicesPropertyDescriptor(object);
			addIsUpdatedThroughServicesPropertyDescriptor(object);
			addResidesWithinLogicalDataComponentPropertyDescriptor(object);
			addIsProcessesByLogicalApplicationComponentsPropertyDescriptor(object);
			addDataEntityCategoryPropertyDescriptor(object);
			addPrivacyClassificationPropertyDescriptor(object);
			addRetentionClassificationPropertyDescriptor(object);
			addDecomposeEntityPropertyDescriptor(object);
			addRelatesToPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Supplied By Actors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSuppliedByActorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_isSuppliedByActors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_isSuppliedByActors_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__IS_SUPPLIED_BY_ACTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Consumed By Actors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsConsumedByActorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_isConsumedByActors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_isConsumedByActors_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__IS_CONSUMED_BY_ACTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Accessed By Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAccessedByServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_isAccessedByServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_isAccessedByServices_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__IS_ACCESSED_BY_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Updated Through Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUpdatedThroughServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_isUpdatedThroughServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_isUpdatedThroughServices_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__IS_UPDATED_THROUGH_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resides Within Logical Data Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidesWithinLogicalDataComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_residesWithinLogicalDataComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_residesWithinLogicalDataComponent_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__RESIDES_WITHIN_LOGICAL_DATA_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Processes By Logical Application Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsProcessesByLogicalApplicationComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_isProcessesByLogicalApplicationComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_isProcessesByLogicalApplicationComponents_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__IS_PROCESSES_BY_LOGICAL_APPLICATION_COMPONENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Entity Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataEntityCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_dataEntityCategory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_dataEntityCategory_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__DATA_ENTITY_CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Privacy Classification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivacyClassificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_privacyClassification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_privacyClassification_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__PRIVACY_CLASSIFICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Retention Classification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetentionClassificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_retentionClassification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_retentionClassification_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__RETENTION_CLASSIFICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decompose Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposeEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_decomposeEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_decomposeEntity_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__DECOMPOSE_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relates To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatesToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataEntity_relatesTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataEntity_relatesTo_feature", "_UI_DataEntity_type"),
				 ContentfwkPackage.Literals.DATA_ENTITY__RELATES_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns DataEntity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataEntity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataEntity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataEntity_type") :
			getString("_UI_DataEntity_type") + " " + label;
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

		switch (notification.getFeatureID(DataEntity.class)) {
			case ContentfwkPackage.DATA_ENTITY__DATA_ENTITY_CATEGORY:
			case ContentfwkPackage.DATA_ENTITY__PRIVACY_CLASSIFICATION:
			case ContentfwkPackage.DATA_ENTITY__RETENTION_CLASSIFICATION:
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
