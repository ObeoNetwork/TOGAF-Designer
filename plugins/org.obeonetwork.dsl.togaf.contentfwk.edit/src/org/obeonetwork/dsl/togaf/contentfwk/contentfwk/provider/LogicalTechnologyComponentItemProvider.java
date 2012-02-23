/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
			addStandardCreationDatePropertyDescriptor(object);
			addLastStandardCreationDatePropertyDescriptor(object);
			addNextStandardCreationDatePropertyDescriptor(object);
			addRetireDatePropertyDescriptor(object);
			addProvidesPlatformForServicesPropertyDescriptor(object);
			addSuppliesPlatformServicesPropertyDescriptor(object);
			addIsRealizedByPhysicalTechnologyComponentsPropertyDescriptor(object);
			addDecomposesLogicalTechnologyComponentPropertyDescriptor(object);
			addIsDependentOnLogicalTechnologyComponentsPropertyDescriptor(object);
			addCategoryTRMPropertyDescriptor(object);
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
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__STANDARD_CREATION_DATE:
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__LAST_STANDARD_CREATION_DATE:
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__NEXT_STANDARD_CREATION_DATE:
			case ContentfwkPackage.LOGICAL_TECHNOLOGY_COMPONENT__RETIRE_DATE:
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
