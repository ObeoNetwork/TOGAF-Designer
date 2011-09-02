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

import org.eclipse.emf.common.notify.Adapter;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory;


/**
 * 
 * 
 */
public class ContentfwkEEFAdapterFactory extends ContentfwkAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createEnterpriseArchitectureAdapter()
	 * 
	 */
	public Adapter createEnterpriseArchitectureAdapter() {
		return new EnterpriseArchitecturePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createBusinessArchitectureAdapter()
	 * 
	 */
	public Adapter createBusinessArchitectureAdapter() {
		return new BusinessArchitecturePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createDataArchitectureAdapter()
	 * 
	 */
	public Adapter createDataArchitectureAdapter() {
		return new DataArchitecturePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createTechnologyArchitectureAdapter()
	 * 
	 */
	public Adapter createTechnologyArchitectureAdapter() {
		return new TechnologyArchitecturePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createElementAdapter()
	 * 
	 */
	public Adapter createElementAdapter() {
		return new ElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createDriverAdapter()
	 * 
	 */
	public Adapter createDriverAdapter() {
		return new DriverPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createGoalAdapter()
	 * 
	 */
	public Adapter createGoalAdapter() {
		return new GoalPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createObjectiveAdapter()
	 * 
	 */
	public Adapter createObjectiveAdapter() {
		return new ObjectivePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createOrganizationUnitAdapter()
	 * 
	 */
	public Adapter createOrganizationUnitAdapter() {
		return new OrganizationUnitPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createActorAdapter()
	 * 
	 */
	public Adapter createActorAdapter() {
		return new ActorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createRoleAdapter()
	 * 
	 */
	public Adapter createRoleAdapter() {
		return new RolePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createDataEntityAdapter()
	 * 
	 */
	public Adapter createDataEntityAdapter() {
		return new DataEntityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createLogicalApplicationComponentAdapter()
	 * 
	 */
	public Adapter createLogicalApplicationComponentAdapter() {
		return new LogicalApplicationComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createFunctionAdapter()
	 * 
	 */
	public Adapter createFunctionAdapter() {
		return new FunctionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createBusinessServiceAdapter()
	 * 
	 */
	public Adapter createBusinessServiceAdapter() {
		return new BusinessServicePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createProcessAdapter()
	 * 
	 */
	public Adapter createProcessAdapter() {
		return new ProcessPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createPlatformServiceAdapter()
	 * 
	 */
	public Adapter createPlatformServiceAdapter() {
		return new PlatformServicePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createPhysicalTechnologyComponentAdapter()
	 * 
	 */
	public Adapter createPhysicalTechnologyComponentAdapter() {
		return new PhysicalTechnologyComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createProductAdapter()
	 * 
	 */
	public Adapter createProductAdapter() {
		return new ProductPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createMeasureAdapter()
	 * 
	 */
	public Adapter createMeasureAdapter() {
		return new MeasurePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createServiceQualityAdapter()
	 * 
	 */
	public Adapter createServiceQualityAdapter() {
		return new ServiceQualityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createContractAdapter()
	 * 
	 */
	public Adapter createContractAdapter() {
		return new ContractPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createEventAdapter()
	 * 
	 */
	public Adapter createEventAdapter() {
		return new EventPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createControlAdapter()
	 * 
	 */
	public Adapter createControlAdapter() {
		return new ControlPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createContainerAdapter()
	 * 
	 */
	public Adapter createContainerAdapter() {
		return new ContainerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createLocationAdapter()
	 * 
	 */
	public Adapter createLocationAdapter() {
		return new LocationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createCapabilityAdapter()
	 * 
	 */
	public Adapter createCapabilityAdapter() {
		return new CapabilityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createPrincipleAdapter()
	 * 
	 */
	public Adapter createPrincipleAdapter() {
		return new PrinciplePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createConstraintAdapter()
	 * 
	 */
	public Adapter createConstraintAdapter() {
		return new ConstraintPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createAssumptionAdapter()
	 * 
	 */
	public Adapter createAssumptionAdapter() {
		return new AssumptionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createRequirementAdapter()
	 * 
	 */
	public Adapter createRequirementAdapter() {
		return new RequirementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createGapAdapter()
	 * 
	 */
	public Adapter createGapAdapter() {
		return new GapPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createWorkPackageAdapter()
	 * 
	 */
	public Adapter createWorkPackageAdapter() {
		return new WorkPackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createLogicalDataComponentAdapter()
	 * 
	 */
	public Adapter createLogicalDataComponentAdapter() {
		return new LogicalDataComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createPhysicalDataComponentAdapter()
	 * 
	 */
	public Adapter createPhysicalDataComponentAdapter() {
		return new PhysicalDataComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createApplicationArchitectureAdapter()
	 * 
	 */
	public Adapter createApplicationArchitectureAdapter() {
		return new ApplicationArchitecturePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createPhysicalApplicationComponentAdapter()
	 * 
	 */
	public Adapter createPhysicalApplicationComponentAdapter() {
		return new PhysicalApplicationComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createLogicalTechnologyComponentAdapter()
	 * 
	 */
	public Adapter createLogicalTechnologyComponentAdapter() {
		return new LogicalTechnologyComponentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createStrategicArchitectureAdapter()
	 * 
	 */
	public Adapter createStrategicArchitectureAdapter() {
		return new StrategicArchitecturePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.ContentfwkAdapterFactory#createInformationSystemServiceAdapter()
	 * 
	 */
	public Adapter createInformationSystemServiceAdapter() {
		return new InformationSystemServicePropertiesEditionProvider();
	}

}
