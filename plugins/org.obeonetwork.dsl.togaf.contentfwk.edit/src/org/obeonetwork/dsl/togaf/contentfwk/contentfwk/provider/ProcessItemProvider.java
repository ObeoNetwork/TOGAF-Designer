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

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider
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
	public ProcessItemProvider(AdapterFactory adapterFactory) {
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
			addOrchestratesFunctionsPropertyDescriptor(object);
			addDecomposesFunctionsPropertyDescriptor(object);
			addInvolvesOrganizationUnitsPropertyDescriptor(object);
			addOrchestratesServicesPropertyDescriptor(object);
			addDecomposesServicesPropertyDescriptor(object);
			addInvolvesActorsPropertyDescriptor(object);
			addIsGuidedByControlsPropertyDescriptor(object);
			addResolvesEventsPropertyDescriptor(object);
			addGeneratesEventsPropertyDescriptor(object);
			addProducesProductsPropertyDescriptor(object);
			addProcessCritialityPropertyDescriptor(object);
			addIsAutomatedPropertyDescriptor(object);
			addProcessVolumetricsPropertyDescriptor(object);
			addDecomposesProcessPropertyDescriptor(object);
			addPrecedesProcessesPropertyDescriptor(object);
			addFollowsProcessesPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Orchestrates Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrchestratesFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_orchestratesFunctions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_orchestratesFunctions_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__ORCHESTRATES_FUNCTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decomposes Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposesFunctionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_decomposesFunctions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_decomposesFunctions_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__DECOMPOSES_FUNCTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Involves Organization Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvolvesOrganizationUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_involvesOrganizationUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_involvesOrganizationUnits_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__INVOLVES_ORGANIZATION_UNITS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Orchestrates Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrchestratesServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_orchestratesServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_orchestratesServices_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__ORCHESTRATES_SERVICES,
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
				 getString("_UI_Process_decomposesServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_decomposesServices_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__DECOMPOSES_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Involves Actors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvolvesActorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_involvesActors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_involvesActors_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__INVOLVES_ACTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Guided By Controls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsGuidedByControlsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_isGuidedByControls_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_isGuidedByControls_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__IS_GUIDED_BY_CONTROLS,
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
				 getString("_UI_Process_resolvesEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_resolvesEvents_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__RESOLVES_EVENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generates Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratesEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_generatesEvents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_generatesEvents_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__GENERATES_EVENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Produces Products feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProducesProductsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_producesProducts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_producesProducts_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__PRODUCES_PRODUCTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Process Critiality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessCritialityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_processCritiality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_processCritiality_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__PROCESS_CRITIALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Automated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAutomatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_isAutomated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_isAutomated_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__IS_AUTOMATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Process Volumetrics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessVolumetricsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_processVolumetrics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_processVolumetrics_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__PROCESS_VOLUMETRICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decomposes Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposesProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_decomposesProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_decomposesProcess_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__DECOMPOSES_PROCESS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Precedes Processes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrecedesProcessesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_precedesProcesses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_precedesProcesses_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__PRECEDES_PROCESSES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Follows Processes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFollowsProcessesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_followsProcesses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_followsProcesses_feature", "_UI_Process_type"),
				 ContentfwkPackage.Literals.PROCESS__FOLLOWS_PROCESSES,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ContentfwkPackage.Literals.PROCESS__ANY);
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
	 * This returns Process.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Process"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Process_type") :
			getString("_UI_Process_type") + " " + label;
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

		switch (notification.getFeatureID(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class)) {
			case ContentfwkPackage.PROCESS__STANDARD_CLASS:
			case ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE:
			case ContentfwkPackage.PROCESS__LAST_STANDARD_CREATION_DATE:
			case ContentfwkPackage.PROCESS__NEXT_STANDARD_CREATION_DATE:
			case ContentfwkPackage.PROCESS__RETIRE_DATE:
			case ContentfwkPackage.PROCESS__PROCESS_CRITIALITY:
			case ContentfwkPackage.PROCESS__IS_AUTOMATED:
			case ContentfwkPackage.PROCESS__PROCESS_VOLUMETRICS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContentfwkPackage.PROCESS__ANY:
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
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createEnterpriseArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createBusinessArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createDataArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createTechnologyArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createDriver()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createOrganizationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createDataEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createLogicalApplicationComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createBusinessService()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createPlatformService()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createPhysicalTechnologyComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createServiceQuality()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createContract()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createControl()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createPrinciple()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createGap()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createWorkPackage()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createLogicalDataComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createPhysicalDataComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createApplicationArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createPhysicalApplicationComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createLogicalTechnologyComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createStrategicArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(ContentfwkPackage.Literals.PROCESS__ANY,
				 ContentfwkFactory.eINSTANCE.createInformationSystemService()));
	}

}
