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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers;

import java.util.List;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.BusinessArchitectureLocationsPropertiesEditionComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.BusinessArchitectureOrganizationActorPropertiesEditionComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.BusinessArchitectureProcessEventControlProductPropertiesEditionComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.BusinessArchitecturePropertiesEditionComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.BusinessArchitectureRolesPropertiesEditionComponent;

/**
 * 
 * 
 */
public class BusinessArchitecturePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public BusinessArchitecturePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public BusinessArchitecturePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof BusinessArchitecture) 
					&& (ContentfwkPackage.eINSTANCE.getBusinessArchitecture() == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof BusinessArchitecture) && (BusinessArchitectureOrganizationActorPropertiesEditionComponent.ORGANIZATIONACTOR_PART.equals(part) || BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent.BUSINESSSERVICEFUNCTION_PART.equals(part) || BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent.DRIVERGOALOBJECTIVE_PART.equals(part) || BusinessArchitectureLocationsPropertiesEditionComponent.LOCATIONS_PART.equals(part) || BusinessArchitectureProcessEventControlProductPropertiesEditionComponent.PROCESSEVENTCONTROLPRODUCT_PART.equals(part) || BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.CONTRACTMEASURESERVICESQUALITY_PART.equals(part) || BusinessArchitectureRolesPropertiesEditionComponent.ROLES_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof BusinessArchitecture) && (refinement == BusinessArchitectureOrganizationActorPropertiesEditionComponent.class || refinement == BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent.class || refinement == BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent.class || refinement == BusinessArchitectureLocationsPropertiesEditionComponent.class || refinement == BusinessArchitectureProcessEventControlProductPropertiesEditionComponent.class || refinement == BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.class || refinement == BusinessArchitectureRolesPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof BusinessArchitecture) && ((BusinessArchitectureOrganizationActorPropertiesEditionComponent.ORGANIZATIONACTOR_PART.equals(part) && refinement == BusinessArchitectureOrganizationActorPropertiesEditionComponent.class) || (BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent.BUSINESSSERVICEFUNCTION_PART.equals(part) && refinement == BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent.class) || (BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent.DRIVERGOALOBJECTIVE_PART.equals(part) && refinement == BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent.class) || (BusinessArchitectureLocationsPropertiesEditionComponent.LOCATIONS_PART.equals(part) && refinement == BusinessArchitectureLocationsPropertiesEditionComponent.class) || (BusinessArchitectureProcessEventControlProductPropertiesEditionComponent.PROCESSEVENTCONTROLPRODUCT_PART.equals(part) && refinement == BusinessArchitectureProcessEventControlProductPropertiesEditionComponent.class) || (BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.CONTRACTMEASURESERVICESQUALITY_PART.equals(part) && refinement == BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.class) || (BusinessArchitectureRolesPropertiesEditionComponent.ROLES_PART.equals(part) && refinement == BusinessArchitectureRolesPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof BusinessArchitecture) {
			return new BusinessArchitecturePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof BusinessArchitecture) {
			if (BusinessArchitectureOrganizationActorPropertiesEditionComponent.ORGANIZATIONACTOR_PART.equals(part))
				return new BusinessArchitectureOrganizationActorPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent.BUSINESSSERVICEFUNCTION_PART.equals(part))
				return new BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent.DRIVERGOALOBJECTIVE_PART.equals(part))
				return new BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureLocationsPropertiesEditionComponent.LOCATIONS_PART.equals(part))
				return new BusinessArchitectureLocationsPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureProcessEventControlProductPropertiesEditionComponent.PROCESSEVENTCONTROLPRODUCT_PART.equals(part))
				return new BusinessArchitectureProcessEventControlProductPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.CONTRACTMEASURESERVICESQUALITY_PART.equals(part))
				return new BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureRolesPropertiesEditionComponent.ROLES_PART.equals(part))
				return new BusinessArchitectureRolesPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof BusinessArchitecture) {
			if (BusinessArchitectureOrganizationActorPropertiesEditionComponent.ORGANIZATIONACTOR_PART.equals(part)
				&& refinement == BusinessArchitectureOrganizationActorPropertiesEditionComponent.class)
				return new BusinessArchitectureOrganizationActorPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent.BUSINESSSERVICEFUNCTION_PART.equals(part)
				&& refinement == BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent.class)
				return new BusinessArchitectureBusinessServiceFunctionPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent.DRIVERGOALOBJECTIVE_PART.equals(part)
				&& refinement == BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent.class)
				return new BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureLocationsPropertiesEditionComponent.LOCATIONS_PART.equals(part)
				&& refinement == BusinessArchitectureLocationsPropertiesEditionComponent.class)
				return new BusinessArchitectureLocationsPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureProcessEventControlProductPropertiesEditionComponent.PROCESSEVENTCONTROLPRODUCT_PART.equals(part)
				&& refinement == BusinessArchitectureProcessEventControlProductPropertiesEditionComponent.class)
				return new BusinessArchitectureProcessEventControlProductPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.CONTRACTMEASURESERVICESQUALITY_PART.equals(part)
				&& refinement == BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent.class)
				return new BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (BusinessArchitectureRolesPropertiesEditionComponent.ROLES_PART.equals(part)
				&& refinement == BusinessArchitectureRolesPropertiesEditionComponent.class)
				return new BusinessArchitectureRolesPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

}
