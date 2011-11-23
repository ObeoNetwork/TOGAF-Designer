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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnterpriseArchitectureItemProvider
	extends ItemProviderAdapter
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
	public EnterpriseArchitectureItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ARCHITECTURES);
			childrenFeatures.add(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__CONTAINERS);
			childrenFeatures.add(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY);
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
	 * This returns EnterpriseArchitecture.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EnterpriseArchitecture"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_EnterpriseArchitecture_type");
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

		switch (notification.getFeatureID(EnterpriseArchitecture.class)) {
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ARCHITECTURES:
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__CONTAINERS:
			case ContentfwkPackage.ENTERPRISE_ARCHITECTURE__ANY:
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
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ARCHITECTURES,
				 ContentfwkFactory.eINSTANCE.createBusinessArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ARCHITECTURES,
				 ContentfwkFactory.eINSTANCE.createDataArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ARCHITECTURES,
				 ContentfwkFactory.eINSTANCE.createTechnologyArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ARCHITECTURES,
				 ContentfwkFactory.eINSTANCE.createApplicationArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ARCHITECTURES,
				 ContentfwkFactory.eINSTANCE.createStrategicArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__CONTAINERS,
				 ContentfwkFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createEnterpriseArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createBusinessArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createDataArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createTechnologyArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createDriver()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createOrganizationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createDataEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createLogicalApplicationComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createBusinessService()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createPlatformService()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createPhysicalTechnologyComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createServiceQuality()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createContract()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createControl()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createPrinciple()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createGap()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createWorkPackage()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createLogicalDataComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createPhysicalDataComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createApplicationArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createPhysicalApplicationComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createLogicalTechnologyComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createStrategicArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY,
				 ContentfwkFactory.eINSTANCE.createInformationSystemService()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ARCHITECTURES ||
			childFeature == ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__ANY ||
			childFeature == ContentfwkPackage.Literals.ENTERPRISE_ARCHITECTURE__CONTAINERS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
