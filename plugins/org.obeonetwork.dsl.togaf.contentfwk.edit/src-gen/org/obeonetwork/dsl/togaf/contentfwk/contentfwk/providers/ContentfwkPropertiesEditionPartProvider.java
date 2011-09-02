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

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ActorPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ApplicationArchitecturePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ApplicationPortofolioPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.AssumptionPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.BusinessArchitecturePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.BusinessServiceFunctionPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.BusinessServicePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.CapabilityPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ConstraintPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ContainerPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ContractMeasureServicesQualityPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ContractPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ControlPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.DataArchitecturePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.DataEntitiesPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.DataEntityDataComponentPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.DataEntityPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.DriverGoalObjectivePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.DriverPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ElementPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.EnterpriseArchitecturePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.EventPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.FunctionPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.GapPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.GoalPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.InformationSystemServicePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.InformationSystemServicesPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.LocationPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.LocationsPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.LogicalApplicationComponentPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.LogicalApplicationComponentsPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.LogicalDataComponentPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.LogicalDataPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.LogicalTechnologyComponentPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.LogicalTechnologyComponentsPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.MeasurePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ObjectivePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.OrganizationActorPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.OrganizationUnitPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.PhysicalApplicationComponentPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.PhysicalApplicationComponentsPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.PhysicalDataComponentPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.PhysicalDataPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.PhysicalTechnologyComponentPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.PhysicalTechnologyComponentsPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.PlatformServicePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.PlatformServicesPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.PrinciplePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.PrinciplesCatalogViewPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ProcessEventControlProductPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ProcessPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ProductPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.RequirementPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.RolePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.RolesPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.ServiceQualityPropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.StrategicArchitecturePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.TechnologyArchitecturePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms.WorkPackagePropertiesEditionPartForm;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ActorPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ApplicationArchitecturePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ApplicationPortofolioPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.AssumptionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.BusinessArchitecturePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.BusinessServiceFunctionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.BusinessServicePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.CapabilityPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ConstraintPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ContainerPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ContractMeasureServicesQualityPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ContractPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ControlPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.DataArchitecturePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.DataEntitiesPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.DataEntityDataComponentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.DataEntityPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.DriverGoalObjectivePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.DriverPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ElementPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.EnterpriseArchitecturePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.EventPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.FunctionPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.GapPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.GoalPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.InformationSystemServicePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.InformationSystemServicesPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.LocationPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.LocationsPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.LogicalApplicationComponentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.LogicalApplicationComponentsPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.LogicalDataComponentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.LogicalDataPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.LogicalTechnologyComponentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.LogicalTechnologyComponentsPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.MeasurePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ObjectivePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.OrganizationActorPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.OrganizationUnitPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.PhysicalApplicationComponentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.PhysicalApplicationComponentsPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.PhysicalDataComponentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.PhysicalDataPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.PhysicalTechnologyComponentPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.PhysicalTechnologyComponentsPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.PlatformServicePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.PlatformServicesPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.PrinciplePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.PrinciplesCatalogViewPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ProcessEventControlProductPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ProcessPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ProductPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.RequirementPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.RolePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.RolesPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.ServiceQualityPropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.StrategicArchitecturePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.TechnologyArchitecturePropertiesEditionPartImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl.WorkPackagePropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class ContentfwkPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ContentfwkViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ContentfwkViewsRepository.EnterpriseArchitecture.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new EnterpriseArchitecturePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new EnterpriseArchitecturePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.BusinessArchitecture.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new BusinessArchitecturePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new BusinessArchitecturePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.DataArchitecture.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new DataArchitecturePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new DataArchitecturePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.TechnologyArchitecture.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new TechnologyArchitecturePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new TechnologyArchitecturePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Driver.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new DriverPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new DriverPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Goal.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new GoalPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new GoalPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Objective.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ObjectivePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ObjectivePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.OrganizationUnit.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new OrganizationUnitPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new OrganizationUnitPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Actor.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ActorPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ActorPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Role.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new RolePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new RolePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.DataEntity.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new DataEntityPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new DataEntityPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.LogicalApplicationComponent.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new LogicalApplicationComponentPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new LogicalApplicationComponentPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Function.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new FunctionPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new FunctionPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.BusinessService.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new BusinessServicePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new BusinessServicePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Process.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ProcessPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ProcessPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.PlatformService.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new PlatformServicePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new PlatformServicePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new PhysicalTechnologyComponentPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new PhysicalTechnologyComponentPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Product.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ProductPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ProductPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Measure.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new MeasurePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new MeasurePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.ServiceQuality.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ServiceQualityPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ServiceQualityPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Contract.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ContractPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ContractPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Event.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new EventPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new EventPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Control.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ControlPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ControlPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Element.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ElementPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ElementPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Container.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ContainerPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ContainerPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Location.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new LocationPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new LocationPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Capability.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new CapabilityPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new CapabilityPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Principle.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new PrinciplePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new PrinciplePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Constraint.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ConstraintPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ConstraintPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Assumption.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new AssumptionPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new AssumptionPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Requirement.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new RequirementPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new RequirementPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Gap.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new GapPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new GapPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.WorkPackage.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new WorkPackagePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new WorkPackagePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.LogicalDataComponent.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new LogicalDataComponentPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new LogicalDataComponentPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.PhysicalDataComponent.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new PhysicalDataComponentPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new PhysicalDataComponentPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.ApplicationArchitecture.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ApplicationArchitecturePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ApplicationArchitecturePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new PhysicalApplicationComponentPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new PhysicalApplicationComponentPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new LogicalTechnologyComponentPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new LogicalTechnologyComponentPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.StrategicArchitecture.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new StrategicArchitecturePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new StrategicArchitecturePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.InformationSystemService.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new InformationSystemServicePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new InformationSystemServicePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Roles.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new RolesPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new RolesPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.OrganizationActor.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new OrganizationActorPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new OrganizationActorPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.BusinessServiceFunction.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new BusinessServiceFunctionPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new BusinessServiceFunctionPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.DriverGoalObjective.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new DriverGoalObjectivePropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new DriverGoalObjectivePropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.Locations.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new LocationsPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new LocationsPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.ProcessEventControlProduct.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ProcessEventControlProductPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ProcessEventControlProductPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.ContractMeasureServicesQuality.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ContractMeasureServicesQualityPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ContractMeasureServicesQualityPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.DataEntityDataComponent.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new DataEntityDataComponentPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new DataEntityDataComponentPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.DataEntities.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new DataEntitiesPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new DataEntitiesPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.LogicalData.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new LogicalDataPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new LogicalDataPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.PhysicalData.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new PhysicalDataPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new PhysicalDataPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.ApplicationPortofolio.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new ApplicationPortofolioPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new ApplicationPortofolioPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.PrinciplesCatalogView.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new PrinciplesCatalogViewPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new PrinciplesCatalogViewPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.InformationSystemServices.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new InformationSystemServicesPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new InformationSystemServicesPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.LogicalApplicationComponents.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new LogicalApplicationComponentsPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new LogicalApplicationComponentsPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.PhysicalApplicationComponents.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new PhysicalApplicationComponentsPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new PhysicalApplicationComponentsPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.PlatformServices.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new PlatformServicesPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new PlatformServicesPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.LogicalTechnologyComponents.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new LogicalTechnologyComponentsPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new LogicalTechnologyComponentsPropertiesEditionPartForm(component);
		}
		if (key == ContentfwkViewsRepository.PhysicalTechnologyComponents.class) {
			if (kind == ContentfwkViewsRepository.SWT_KIND)
				return new PhysicalTechnologyComponentsPropertiesEditionPartImpl(component);
			if (kind == ContentfwkViewsRepository.FORM_KIND)
				return new PhysicalTechnologyComponentsPropertiesEditionPartForm(component);
		}
		return null;
	}

}
