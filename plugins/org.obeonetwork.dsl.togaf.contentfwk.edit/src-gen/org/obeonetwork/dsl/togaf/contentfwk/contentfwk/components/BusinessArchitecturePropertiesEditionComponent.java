/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.BusinessServiceFunctionPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.RolesPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class BusinessArchitecturePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The OrganizationActor part
	 * 
	 */
	private OrganizationActorPropertiesEditionPart organizationActorPart;

	/**
	 * The BusinessArchitectureOrganizationActorPropertiesEditionComponent sub component
	 * 
	 */
	protected BusinessArchitectureOrganizationActorPropertiesEditionComponent businessArchitectureOrganizationActorPropertiesEditionComponent;

	/**
	 * The BusinessServiceFunction part
	 * 
	 */
	private BusinessServiceFunctionPropertiesEditionPart businessServiceFunctionPart;

	/**
	 * The BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent sub component
	 * 
	 */
	protected BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent businessArchitectureBusinessServiceFunctionPropertiesEditionComponent;

	/**
	 * The Driver Goal Objective part
	 * 
	 */
	private DriverGoalObjectivePropertiesEditionPart driverGoalObjectivePart;

	/**
	 * The BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent sub component
	 * 
	 */
	protected BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent businessArchitectureDriverGoalObjectivePropertiesEditionComponent;

	/**
	 * The Locations part
	 * 
	 */
	private LocationsPropertiesEditionPart locationsPart;

	/**
	 * The BusinessArchitectureLocationsPropertiesEditionComponent sub component
	 * 
	 */
	protected BusinessArchitectureLocationsPropertiesEditionComponent businessArchitectureLocationsPropertiesEditionComponent;

	/**
	 * The Process Event Control Product part
	 * 
	 */
	private ProcessEventControlProductPropertiesEditionPart processEventControlProductPart;

	/**
	 * The BusinessArchitectureProcessEventControlProductPropertiesEditionComponent sub component
	 * 
	 */
	protected BusinessArchitectureProcessEventControlProductPropertiesEditionComponent businessArchitectureProcessEventControlProductPropertiesEditionComponent;

	/**
	 * The Contract Measure Services Quality part
	 * 
	 */
	private ContractMeasureServicesQualityPropertiesEditionPart contractMeasureServicesQualityPart;

	/**
	 * The BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent sub component
	 * 
	 */
	protected BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent businessArchitectureContractMeasureServicesQualityPropertiesEditionComponent;

	/**
	 * The Roles part
	 * 
	 */
	private RolesPropertiesEditionPart rolesPart;

	/**
	 * The BusinessArchitectureRolesPropertiesEditionComponent sub component
	 * 
	 */
	protected BusinessArchitectureRolesPropertiesEditionComponent businessArchitectureRolesPropertiesEditionComponent;
	/**
	 * Parameterized constructor
	 * 
	 * @param businessArchitecture the EObject to edit
	 * 
	 */
	public BusinessArchitecturePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject businessArchitecture, String editing_mode) {
		super(editingContext, editing_mode);
		if (businessArchitecture instanceof BusinessArchitecture) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(businessArchitecture, PropertiesEditingProvider.class);
			businessArchitectureOrganizationActorPropertiesEditionComponent = (BusinessArchitectureOrganizationActorPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, BusinessArchitectureOrganizationActorPropertiesEditionComponent.ORGANIZATIONACTOR_PART, BusinessArchitectureOrganizationActorPropertiesEditionComponent.class);
			addSubComponent(businessArchitectureOrganizationActorPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(businessArchitecture, PropertiesEditingProvider.class);
			businessArchitectureBusinessServiceFunctionPropertiesEditionComponent = (BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent.BUSINESSSERVICEFUNCTION_PART, BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent.class);
			addSubComponent(businessArchitectureBusinessServiceFunctionPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(businessArchitecture, PropertiesEditingProvider.class);
			businessArchitectureDriverGoalObjectivePropertiesEditionComponent = (BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent.DRIVERGOALOBJECTIVE_PART, BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent.class);
			addSubComponent(businessArchitectureDriverGoalObjectivePropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(businessArchitecture, PropertiesEditingProvider.class);
			businessArchitectureLocationsPropertiesEditionComponent = (BusinessArchitectureLocationsPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, BusinessArchitectureLocationsPropertiesEditionComponent.LOCATIONS_PART, BusinessArchitectureLocationsPropertiesEditionComponent.class);
			addSubComponent(businessArchitectureLocationsPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(businessArchitecture, PropertiesEditingProvider.class);
			businessArchitectureProcessEventControlProductPropertiesEditionComponent = (BusinessArchitectureProcessEventControlProductPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, BusinessArchitectureProcessEventControlProductPropertiesEditionComponent.PROCESSEVENTCONTROLPRODUCT_PART, BusinessArchitectureProcessEventControlProductPropertiesEditionComponent.class);
			addSubComponent(businessArchitectureProcessEventControlProductPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(businessArchitecture, PropertiesEditingProvider.class);
			businessArchitectureContractMeasureServicesQualityPropertiesEditionComponent = (BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.CONTRACTMEASURESERVICESQUALITY_PART, BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.class);
			addSubComponent(businessArchitectureContractMeasureServicesQualityPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(businessArchitecture, PropertiesEditingProvider.class);
			businessArchitectureRolesPropertiesEditionComponent = (BusinessArchitectureRolesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, BusinessArchitectureRolesPropertiesEditionComponent.ROLES_PART, BusinessArchitectureRolesPropertiesEditionComponent.class);
			addSubComponent(businessArchitectureRolesPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      getPropertiesEditionPart(int, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (BusinessArchitectureOrganizationActorPropertiesEditionComponent.ORGANIZATIONACTOR_PART.equals(key)) {
			organizationActorPart = (OrganizationActorPropertiesEditionPart)businessArchitectureOrganizationActorPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)organizationActorPart;
		}
		if (BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent.BUSINESSSERVICEFUNCTION_PART.equals(key)) {
			businessServiceFunctionPart = (BusinessServiceFunctionPropertiesEditionPart)businessArchitectureBusinessServiceFunctionPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)businessServiceFunctionPart;
		}
		if (BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent.DRIVERGOALOBJECTIVE_PART.equals(key)) {
			driverGoalObjectivePart = (DriverGoalObjectivePropertiesEditionPart)businessArchitectureDriverGoalObjectivePropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)driverGoalObjectivePart;
		}
		if (BusinessArchitectureLocationsPropertiesEditionComponent.LOCATIONS_PART.equals(key)) {
			locationsPart = (LocationsPropertiesEditionPart)businessArchitectureLocationsPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)locationsPart;
		}
		if (BusinessArchitectureProcessEventControlProductPropertiesEditionComponent.PROCESSEVENTCONTROLPRODUCT_PART.equals(key)) {
			processEventControlProductPart = (ProcessEventControlProductPropertiesEditionPart)businessArchitectureProcessEventControlProductPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)processEventControlProductPart;
		}
		if (BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.CONTRACTMEASURESERVICESQUALITY_PART.equals(key)) {
			contractMeasureServicesQualityPart = (ContractMeasureServicesQualityPropertiesEditionPart)businessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)contractMeasureServicesQualityPart;
		}
		if (BusinessArchitectureRolesPropertiesEditionComponent.ROLES_PART.equals(key)) {
			rolesPart = (RolesPropertiesEditionPart)businessArchitectureRolesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)rolesPart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Object key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (ContentfwkViewsRepository.OrganizationActor.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			organizationActorPart = (OrganizationActorPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.BusinessServiceFunction.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			businessServiceFunctionPart = (BusinessServiceFunctionPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.DriverGoalObjective.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			driverGoalObjectivePart = (DriverGoalObjectivePropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.Locations.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			locationsPart = (LocationsPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.ProcessEventControlProduct.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			processEventControlProductPart = (ProcessEventControlProductPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.ContractMeasureServicesQuality.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			contractMeasureServicesQualityPart = (ContractMeasureServicesQualityPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.Roles.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			rolesPart = (RolesPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == ContentfwkViewsRepository.OrganizationActor.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.BusinessServiceFunction.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.DriverGoalObjective.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.Locations.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.ProcessEventControlProduct.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.ContractMeasureServicesQuality.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.Roles.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
