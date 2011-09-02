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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts;

/**
 * 
 * 
 */
public class ContentfwkViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * EnterpriseArchitecture view descriptor
	 * 
	 */
	public static class EnterpriseArchitecture {
		public static class Properties {
	
			
			public static String architectures = "contentfwk::EnterpriseArchitecture::properties::architectures";
			
			
			public static String containers = "contentfwk::EnterpriseArchitecture::properties::containers";
			
	
		}
	
	}

	/**
	 * BusinessArchitecture view descriptor
	 * 
	 */
	public static class BusinessArchitecture {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * DataArchitecture view descriptor
	 * 
	 */
	public static class DataArchitecture {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * TechnologyArchitecture view descriptor
	 * 
	 */
	public static class TechnologyArchitecture {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * Driver view descriptor
	 * 
	 */
	public static class Driver {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Driver::Attributes::name";
			
			
			public static String iD = "contentfwk::Driver::Attributes::ID";
			
			
			public static String description = "contentfwk::Driver::Attributes::description";
			
			
			public static String category = "contentfwk::Driver::Attributes::category";
			
			
			public static String source = "contentfwk::Driver::Attributes::source";
			
			
			public static String owner = "contentfwk::Driver::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesDriver = "contentfwk::Driver::Related Elements::decomposes Driver";
			
			
			public static String createsGoals = "contentfwk::Driver::Related Elements::creates Goals";
			
			
			public static String motivatesOrganizationUnits = "contentfwk::Driver::Related Elements::motivates Organization Units";
			
			
			public static String delegates = "contentfwk::Driver::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Driver::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Goal view descriptor
	 * 
	 */
	public static class Goal {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Goal::Attributes::name";
			
			
			public static String iD = "contentfwk::Goal::Attributes::ID";
			
			
			public static String description = "contentfwk::Goal::Attributes::description";
			
			
			public static String category = "contentfwk::Goal::Attributes::category";
			
			
			public static String source = "contentfwk::Goal::Attributes::source";
			
			
			public static String owner = "contentfwk::Goal::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesGoal = "contentfwk::Goal::Related Elements::decomposes Goal";
			
			
			public static String addressesDrivers = "contentfwk::Goal::Related Elements::addresses Drivers";
			
			
			public static String isRealizedThroughObjectives = "contentfwk::Goal::Related Elements::is Realized Through Objectives";
			
			
			public static String delegates = "contentfwk::Goal::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Goal::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Objective view descriptor
	 * 
	 */
	public static class Objective {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Objective::Attributes::name";
			
			
			public static String iD = "contentfwk::Objective::Attributes::ID";
			
			
			public static String description = "contentfwk::Objective::Attributes::description";
			
			
			public static String category = "contentfwk::Objective::Attributes::category";
			
			
			public static String source = "contentfwk::Objective::Attributes::source";
			
			
			public static String owner = "contentfwk::Objective::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesObjective = "contentfwk::Objective::Related Elements::decomposes Objective";
			
			
			public static String realizesGoals = "contentfwk::Objective::Related Elements::realizes Goals";
			
			
			public static String isTrackedAgainstMeasures = "contentfwk::Objective::Related Elements::is Tracked Against Measures";
			
			
			public static String delegates = "contentfwk::Objective::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Objective::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * OrganizationUnit view descriptor
	 * 
	 */
	public static class OrganizationUnit {
		public static class Attributes {
	
			
			public static String name = "contentfwk::OrganizationUnit::Attributes::name";
			
			
			public static String iD = "contentfwk::OrganizationUnit::Attributes::ID";
			
			
			public static String description = "contentfwk::OrganizationUnit::Attributes::description";
			
			
			public static String category = "contentfwk::OrganizationUnit::Attributes::category";
			
			
			public static String source = "contentfwk::OrganizationUnit::Attributes::source";
			
			
			public static String owner = "contentfwk::OrganizationUnit::Attributes::owner";
			
			
			public static String headcount = "contentfwk::OrganizationUnit::Attributes::headcount";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String operatesInLocation = "contentfwk::OrganizationUnit::Related Elements::operates In Location";
			
			
			public static String ownsAndGovernsServices = "contentfwk::OrganizationUnit::Related Elements::owns And Governs Services";
			
			
			public static String containsActors = "contentfwk::OrganizationUnit::Related Elements::contains Actors";
			
			
			public static String ownsFunctions = "contentfwk::OrganizationUnit::Related Elements::owns Functions";
			
			
			public static String participatesInProcesses = "contentfwk::OrganizationUnit::Related Elements::participates In Processes";
			
			
			public static String isMotivatedByDrivers = "contentfwk::OrganizationUnit::Related Elements::is Motivated By Drivers";
			
			
			public static String producesProducts = "contentfwk::OrganizationUnit::Related Elements::produces Products";
			
			
			public static String delegates = "contentfwk::OrganizationUnit::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::OrganizationUnit::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Actor view descriptor
	 * 
	 */
	public static class Actor {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Actor::Attributes::name";
			
			
			public static String iD = "contentfwk::Actor::Attributes::ID";
			
			
			public static String description = "contentfwk::Actor::Attributes::description";
			
			
			public static String category = "contentfwk::Actor::Attributes::category";
			
			
			public static String source = "contentfwk::Actor::Attributes::source";
			
			
			public static String owner = "contentfwk::Actor::Attributes::owner";
			
			
			public static String fTEs = "contentfwk::Actor::Attributes::FTEs";
			
			
			public static String actorGoal = "contentfwk::Actor::Attributes::actor Goal";
			
			
			public static String actorTasks = "contentfwk::Actor::Attributes::actor Tasks";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesActors = "contentfwk::Actor::Related Elements::decomposes Actors";
			
			
			public static String operatesInLocation = "contentfwk::Actor::Related Elements::operates In Location";
			
			
			public static String belongsTo = "contentfwk::Actor::Related Elements::belongs To";
			
			
			public static String performsTaskInRoles = "contentfwk::Actor::Related Elements::performs Task In Roles";
			
			
			public static String interactsWithFunctions = "contentfwk::Actor::Related Elements::interacts With Functions";
			
			
			public static String performsFunctions = "contentfwk::Actor::Related Elements::performs Functions";
			
			
			public static String consumesServices = "contentfwk::Actor::Related Elements::consumes Services";
			
			
			public static String participatesInProcesses = "contentfwk::Actor::Related Elements::participates In Processes";
			
			
			public static String resolvesEvents = "contentfwk::Actor::Related Elements::resolves Events";
			
			
			public static String generatesEvents = "contentfwk::Actor::Related Elements::generates Events";
			
			
			public static String suppliesEntities = "contentfwk::Actor::Related Elements::supplies Entities";
			
			
			public static String consumesEntities = "contentfwk::Actor::Related Elements::consumes Entities";
			
			
			public static String delegates = "contentfwk::Actor::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Actor::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Role view descriptor
	 * 
	 */
	public static class Role {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Role::Attributes::name";
			
			
			public static String iD = "contentfwk::Role::Attributes::ID";
			
			
			public static String description = "contentfwk::Role::Attributes::description";
			
			
			public static String category = "contentfwk::Role::Attributes::category";
			
			
			public static String source = "contentfwk::Role::Attributes::source";
			
			
			public static String owner = "contentfwk::Role::Attributes::owner";
			
			
			public static String estimatedFTEs = "contentfwk::Role::Attributes::estimated FTEs";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesRole = "contentfwk::Role::Related Elements::decomposes Role";
			
			
			public static String isAssumedByActors = "contentfwk::Role::Related Elements::is Assumed By Actors";
			
			
			public static String accessesFunctions = "contentfwk::Role::Related Elements::accesses Functions";
			
			
			public static String delegates = "contentfwk::Role::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Role::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * DataEntity view descriptor
	 * 
	 */
	public static class DataEntity {
		public static class Attributes {
	
			
			public static String name = "contentfwk::DataEntity::Attributes::name";
			
			
			public static String iD = "contentfwk::DataEntity::Attributes::ID";
			
			
			public static String description = "contentfwk::DataEntity::Attributes::description";
			
			
			public static String category = "contentfwk::DataEntity::Attributes::category";
			
			
			public static String source = "contentfwk::DataEntity::Attributes::source";
			
			
			public static String owner = "contentfwk::DataEntity::Attributes::owner";
			
			
			public static String dataEntityCategory = "contentfwk::DataEntity::Attributes::data Entity Category";
			
			
			public static String privacyClassification = "contentfwk::DataEntity::Attributes::privacy Classification";
			
			
			public static String retentionClassification = "contentfwk::DataEntity::Attributes::retention Classification";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposeEntity = "contentfwk::DataEntity::Related Elements::decompose Entity";
			
			
			public static String relatesTo = "contentfwk::DataEntity::Related Elements::relates To";
			
			
			public static String residesWithinLogicalDataComponent = "contentfwk::DataEntity::Related Elements::resides Within Logical Data Component";
			
			
			public static String isProcessesByLogicalApplicationComponents = "contentfwk::DataEntity::Related Elements::is Processes By Logical Application Components";
			
			
			public static String isSuppliedByActors = "contentfwk::DataEntity::Related Elements::is Supplied By Actors";
			
			
			public static String isConsumedByActors = "contentfwk::DataEntity::Related Elements::is Consumed By Actors";
			
			
			public static String isAccessedByServices = "contentfwk::DataEntity::Related Elements::is Accessed By Services";
			
			
			public static String isUpdatedThroughServices = "contentfwk::DataEntity::Related Elements::is Updated Through Services";
			
			
			public static String delegates = "contentfwk::DataEntity::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::DataEntity::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * LogicalApplicationComponent view descriptor
	 * 
	 */
	public static class LogicalApplicationComponent {
		public static class Attributes {
	
			
			public static String name = "contentfwk::LogicalApplicationComponent::Attributes::name";
			
			
			public static String iD = "contentfwk::LogicalApplicationComponent::Attributes::ID";
			
			
			public static String description = "contentfwk::LogicalApplicationComponent::Attributes::description";
			
			
			public static String category = "contentfwk::LogicalApplicationComponent::Attributes::category";
			
			
			public static String source = "contentfwk::LogicalApplicationComponent::Attributes::source";
			
			
			public static String owner = "contentfwk::LogicalApplicationComponent::Attributes::owner";
			
			
			public static String standardClass = "contentfwk::LogicalApplicationComponent::Attributes::standard Class";
			
			
			public static String standardCreationDate = "contentfwk::LogicalApplicationComponent::Attributes::standard Creation Date";
			
			
			public static String lastStandardCreationDate = "contentfwk::LogicalApplicationComponent::Attributes::last Standard Creation Date";
			
			
			public static String nextStandardCreationDate = "contentfwk::LogicalApplicationComponent::Attributes::next Standard Creation Date";
			
			
			public static String retireDate = "contentfwk::LogicalApplicationComponent::Attributes::retire Date";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesLogicalApplicationComponent = "contentfwk::LogicalApplicationComponent::Related Elements::decomposes Logical Application Component";
			
			
			public static String isExtendedByPhysicalApplicationComponents = "contentfwk::LogicalApplicationComponent::Related Elements::is Extended By Physical Application Components";
			
			
			public static String communicatesWith = "contentfwk::LogicalApplicationComponent::Related Elements::communicates With";
			
			
			public static String operatesOnDataEntities = "contentfwk::LogicalApplicationComponent::Related Elements::operates On Data Entities";
			
			
			public static String implementsServices = "contentfwk::LogicalApplicationComponent::Related Elements::implements Services";
			
			
			public static String delegates = "contentfwk::LogicalApplicationComponent::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::LogicalApplicationComponent::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Function view descriptor
	 * 
	 */
	public static class Function {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Function::Attributes::name";
			
			
			public static String iD = "contentfwk::Function::Attributes::ID";
			
			
			public static String description = "contentfwk::Function::Attributes::description";
			
			
			public static String category = "contentfwk::Function::Attributes::category";
			
			
			public static String source = "contentfwk::Function::Attributes::source";
			
			
			public static String owner = "contentfwk::Function::Attributes::owner";
			
			
			public static String standardClass = "contentfwk::Function::Attributes::standardClass";
			
			
			public static String standardCreationDate = "contentfwk::Function::Attributes::standardCreationDate";
			
			
			public static String lastStandardCreationDate = "contentfwk::Function::Attributes::lastStandardCreationDate";
			
			
			public static String nextStandardCreationDate = "contentfwk::Function::Attributes::nextStandardCreationDate";
			
			
			public static String retireDate = "contentfwk::Function::Attributes::retireDate";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String isOwnedByUnit = "contentfwk::Function::Related Elements::is Owned By Unit";
			
			
			public static String decomposesFunction = "contentfwk::Function::Related Elements::decomposes Function";
			
			
			public static String communicatedWithFunctions = "contentfwk::Function::Related Elements::communicated With Functions";
			
			
			public static String isBoundedByServices = "contentfwk::Function::Related Elements::is Bounded By Services";
			
			
			public static String supportsProcesses = "contentfwk::Function::Related Elements::supports Processes";
			
			
			public static String isRealizedByProcesses = "contentfwk::Function::Related Elements::is Realized By Processes";
			
			
			public static String canBeAccessedByRoles = "contentfwk::Function::Related Elements::can Be Accessed By Roles";
			
			
			public static String isPerformedByActors = "contentfwk::Function::Related Elements::is Performed By Actors";
			
			
			public static String supportsActors = "contentfwk::Function::Related Elements::supports Actors";
			
			
			public static String delegates = "contentfwk::Function::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Function::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * BusinessService view descriptor
	 * 
	 */
	public static class BusinessService {
		public static class Attributes {
	
			
			public static String name = "contentfwk::BusinessService::Attributes::name";
			
			
			public static String iD = "contentfwk::BusinessService::Attributes::ID";
			
			
			public static String description = "contentfwk::BusinessService::Attributes::description";
			
			
			public static String category = "contentfwk::BusinessService::Attributes::category";
			
			
			public static String source = "contentfwk::BusinessService::Attributes::source";
			
			
			public static String owner = "contentfwk::BusinessService::Attributes::owner";
			
			
			public static String standardClass = "contentfwk::BusinessService::Attributes::standard Class";
			
			
			public static String standardCreationDate = "contentfwk::BusinessService::Attributes::standard Creation Date";
			
			
			public static String lastStandardCreationDate = "contentfwk::BusinessService::Attributes::last Standard Creation Date";
			
			
			public static String nextStandardCreationDate = "contentfwk::BusinessService::Attributes::next Standard Creation Date";
			
			
			public static String retireDate = "contentfwk::BusinessService::Attributes::retire Date";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String consumesServices = "contentfwk::BusinessService::Related Elements::consumes Services";
			
			
			public static String decomposesServices = "contentfwk::BusinessService::Related Elements::decomposes Services";
			
			
			public static String isProvidedToActors = "contentfwk::BusinessService::Related Elements::is Provided To Actors";
			
			
			public static String isOwnedAndGovernedByOrganizationUnits = "contentfwk::BusinessService::Related Elements::is Owned And Governed By Organization Units";
			
			
			public static String supportsObjective = "contentfwk::BusinessService::Related Elements::supports Objective";
			
			
			public static String meetsQualities = "contentfwk::BusinessService::Related Elements::meets Qualities";
			
			
			public static String isTrackedAgainstMeasures = "contentfwk::BusinessService::Related Elements::is Tracked Against Measures";
			
			
			public static String isGovernedAndMeasuredByContracts = "contentfwk::BusinessService::Related Elements::is Governed And Measured By Contracts";
			
			
			public static String providesGovernedInterfaceToAccessFunctions = "contentfwk::BusinessService::Related Elements::provides Governed Interface To Access Functions";
			
			
			public static String supportsProcesses = "contentfwk::BusinessService::Related Elements::supports Processes";
			
			
			public static String isRealizedByProcesses = "contentfwk::BusinessService::Related Elements::is Realized By Processes";
			
			
			public static String resolvesEvents = "contentfwk::BusinessService::Related Elements::resolves Events";
			
			
			public static String providesEntities = "contentfwk::BusinessService::Related Elements::provides Entities";
			
			
			public static String consumesEntities = "contentfwk::BusinessService::Related Elements::consumes Entities";
			
			
			public static String isRealizedThroughLogicalApplicationComponent = "contentfwk::BusinessService::Related Elements::is Realized Through Logical Application Component";
			
			
			public static String isImplementedOnLogicalTechnologyComponents = "contentfwk::BusinessService::Related Elements::is Implemented On Logical Technology Components";
			
			
			public static String delegates = "contentfwk::BusinessService::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::BusinessService::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Process view descriptor
	 * 
	 */
	public static class Process {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Process::Attributes::name";
			
			
			public static String iD = "contentfwk::Process::Attributes::ID";
			
			
			public static String description = "contentfwk::Process::Attributes::description";
			
			
			public static String category = "contentfwk::Process::Attributes::category";
			
			
			public static String source = "contentfwk::Process::Attributes::source";
			
			
			public static String owner = "contentfwk::Process::Attributes::owner";
			
			
			public static String standardClass = "contentfwk::Process::Attributes::standard Class";
			
			
			public static String standardCreationDate = "contentfwk::Process::Attributes::standard Creation Date";
			
			
			public static String lastStandardCreationDate = "contentfwk::Process::Attributes::last Standard Creation Date";
			
			
			public static String nextStandardCreationDate = "contentfwk::Process::Attributes::next Standard Creation Date";
			
			
			public static String retireDate = "contentfwk::Process::Attributes::retire Date";
			
			
			public static String processCritiality = "contentfwk::Process::Attributes::process Critiality";
			
			
			public static String isAutomated = "contentfwk::Process::Attributes::is Automated";
			
			
			public static String processVolumetrics = "contentfwk::Process::Attributes::process Volumetrics";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesProcess = "contentfwk::Process::Related Elements::decomposes Process";
			
			
			public static String precedesProcesses = "contentfwk::Process::Related Elements::precedes Processes";
			
			
			public static String followsProcesses = "contentfwk::Process::Related Elements::follows Processes";
			
			
			public static String resolvesEvents = "contentfwk::Process::Related Elements::resolves Events";
			
			
			public static String generatesEvents = "contentfwk::Process::Related Elements::generates Events";
			
			
			public static String orchestratesFunctions = "contentfwk::Process::Related Elements::orchestrates Functions";
			
			
			public static String decomposesFunctions = "contentfwk::Process::Related Elements::decomposes Functions";
			
			
			public static String involvesOrganizationUnits = "contentfwk::Process::Related Elements::involves Organization Units";
			
			
			public static String orchestratesServices = "contentfwk::Process::Related Elements::orchestrates Services";
			
			
			public static String decomposesServices = "contentfwk::Process::Related Elements::decomposes Services";
			
			
			public static String involvesActors = "contentfwk::Process::Related Elements::involves Actors";
			
			
			public static String isGuidedByControls = "contentfwk::Process::Related Elements::is Guided By Controls";
			
			
			public static String producesProducts = "contentfwk::Process::Related Elements::produces Products";
			
			
			public static String delegates = "contentfwk::Process::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Process::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * PlatformService view descriptor
	 * 
	 */
	public static class PlatformService {
		public static class Attributes {
	
			
			public static String name = "contentfwk::PlatformService::Attributes::name";
			
			
			public static String iD = "contentfwk::PlatformService::Attributes::ID";
			
			
			public static String description = "contentfwk::PlatformService::Attributes::description";
			
			
			public static String category = "contentfwk::PlatformService::Attributes::category";
			
			
			public static String source = "contentfwk::PlatformService::Attributes::source";
			
			
			public static String owner = "contentfwk::PlatformService::Attributes::owner";
			
			
			public static String standardClass = "contentfwk::PlatformService::Attributes::standard Class";
			
			
			public static String standardCreationDate = "contentfwk::PlatformService::Attributes::standard Creation Date";
			
			
			public static String lastStandardCreationDate = "contentfwk::PlatformService::Attributes::last Standard Creation Date";
			
			
			public static String nextStandardCreationDate = "contentfwk::PlatformService::Attributes::next Standard Creation Date";
			
			
			public static String retireDate = "contentfwk::PlatformService::Attributes::retire Date";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String isSuppliedByLogicalTechnologyComponents = "contentfwk::PlatformService::Related Elements::is Supplied By Logical Technology Components";
			
			
			public static String isRealizedThroughLogicalApplicationComponent = "contentfwk::PlatformService::Related Elements::is Realized Through Logical Application Component";
			
			
			public static String isImplementedOnLogicalTechnologyComponents = "contentfwk::PlatformService::Related Elements::is Implemented On Logical Technology Components";
			
			
			public static String providesEntities = "contentfwk::PlatformService::Related Elements::provides Entities";
			
			
			public static String consumesEntities = "contentfwk::PlatformService::Related Elements::consumes Entities";
			
			
			public static String consumesServices = "contentfwk::PlatformService::Related Elements::consumes Services";
			
			
			public static String decomposesServices = "contentfwk::PlatformService::Related Elements::decomposes Services";
			
			
			public static String providesGovernedInterfaceToAccessFunctions = "contentfwk::PlatformService::Related Elements::provides Governed Interface To Access Functions";
			
			
			public static String supportsProcesses = "contentfwk::PlatformService::Related Elements::supports Processes";
			
			
			public static String isRealizedByProcesses = "contentfwk::PlatformService::Related Elements::is Realized By Processes";
			
			
			public static String resolvesEvents = "contentfwk::PlatformService::Related Elements::resolves Events";
			
			
			public static String isProvidedToActors = "contentfwk::PlatformService::Related Elements::is Provided To Actors";
			
			
			public static String isOwnedAndGovernedByOrganizationUnits = "contentfwk::PlatformService::Related Elements::is Owned And Governed By Organization Units";
			
			
			public static String isGovernedAndMeasuredByContracts = "contentfwk::PlatformService::Related Elements::is Governed And Measured By Contracts";
			
			
			public static String isTrackedAgainstMeasures = "contentfwk::PlatformService::Related Elements::is Tracked Against Measures";
			
			
			public static String meetsQualities = "contentfwk::PlatformService::Related Elements::meets Qualities";
			
			
			public static String delegates = "contentfwk::PlatformService::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::PlatformService::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * PhysicalTechnologyComponent view descriptor
	 * 
	 */
	public static class PhysicalTechnologyComponent {
		public static class Attributes {
	
			
			public static String name = "contentfwk::PhysicalTechnologyComponent::Attributes::name";
			
			
			public static String iD = "contentfwk::PhysicalTechnologyComponent::Attributes::ID";
			
			
			public static String description = "contentfwk::PhysicalTechnologyComponent::Attributes::description";
			
			
			public static String category = "contentfwk::PhysicalTechnologyComponent::Attributes::category";
			
			
			public static String source = "contentfwk::PhysicalTechnologyComponent::Attributes::source";
			
			
			public static String owner = "contentfwk::PhysicalTechnologyComponent::Attributes::owner";
			
			
			public static String standardClass = "contentfwk::PhysicalTechnologyComponent::Attributes::standard Class";
			
			
			public static String standardCreationDate = "contentfwk::PhysicalTechnologyComponent::Attributes::standard Creation Date";
			
			
			public static String lastStandardCreationDate = "contentfwk::PhysicalTechnologyComponent::Attributes::last Standard Creation Date";
			
			
			public static String nextStandardCreationDate = "contentfwk::PhysicalTechnologyComponent::Attributes::next Standard Creation Date";
			
			
			public static String retireDate = "contentfwk::PhysicalTechnologyComponent::Attributes::retire Date";
			
			
			public static String productName = "contentfwk::PhysicalTechnologyComponent::Attributes::product Name";
			
			
			public static String moduleName = "contentfwk::PhysicalTechnologyComponent::Attributes::module Name";
			
			
			public static String vendor = "contentfwk::PhysicalTechnologyComponent::Attributes::vendor";
			
			
			public static String version = "contentfwk::PhysicalTechnologyComponent::Attributes::version";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesPhysicalTechnologyComponent = "contentfwk::PhysicalTechnologyComponent::Related Elements::decomposes Physical Technology Component";
			
			
			public static String realizesApplicationComponents = "contentfwk::PhysicalTechnologyComponent::Related Elements::realizes Application Components";
			
			
			public static String extendsLogicalTechnologyComponents = "contentfwk::PhysicalTechnologyComponent::Related Elements::extends Logical Technology Components";
			
			
			public static String isHostedInLocation = "contentfwk::PhysicalTechnologyComponent::Related Elements::is Hosted In Location";
			
			
			public static String isDependentOnPhysicalTechnologyComponents = "contentfwk::PhysicalTechnologyComponent::Related Elements::is Dependent On Physical Technology Components";
			
			
			public static String delegates = "contentfwk::PhysicalTechnologyComponent::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::PhysicalTechnologyComponent::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Product view descriptor
	 * 
	 */
	public static class Product {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Product::Attributes::name";
			
			
			public static String iD = "contentfwk::Product::Attributes::ID";
			
			
			public static String description = "contentfwk::Product::Attributes::description";
			
			
			public static String category = "contentfwk::Product::Attributes::category";
			
			
			public static String source = "contentfwk::Product::Attributes::source";
			
			
			public static String owner = "contentfwk::Product::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String isProducedByOrganizationUnits = "contentfwk::Product::Related Elements::is Produced By Organization Units";
			
			
			public static String isProducedByProcesses = "contentfwk::Product::Related Elements::is Produced By Processes";
			
			
			public static String delegates = "contentfwk::Product::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Product::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Measure view descriptor
	 * 
	 */
	public static class Measure {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Measure::Attributes::name";
			
			
			public static String iD = "contentfwk::Measure::Attributes::ID";
			
			
			public static String description = "contentfwk::Measure::Attributes::description";
			
			
			public static String category = "contentfwk::Measure::Attributes::category";
			
			
			public static String source = "contentfwk::Measure::Attributes::source";
			
			
			public static String owner = "contentfwk::Measure::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesMeasure = "contentfwk::Measure::Related Elements::decomposes Measure";
			
			
			public static String setsPerformanceCriteriaForObjectives = "contentfwk::Measure::Related Elements::sets Performance Criteria For Objectives";
			
			
			public static String setsPerformanceCriteriaForServices = "contentfwk::Measure::Related Elements::sets Performance Criteria For Services";
			
			
			public static String delegates = "contentfwk::Measure::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Measure::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * ServiceQuality view descriptor
	 * 
	 */
	public static class ServiceQuality {
		public static class Attributes {
	
			
			public static String name = "contentfwk::ServiceQuality::Attributes::name";
			
			
			public static String iD = "contentfwk::ServiceQuality::Attributes::ID";
			
			
			public static String description = "contentfwk::ServiceQuality::Attributes::description";
			
			
			public static String category = "contentfwk::ServiceQuality::Attributes::category";
			
			
			public static String source = "contentfwk::ServiceQuality::Attributes::source";
			
			
			public static String owner = "contentfwk::ServiceQuality::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String appliesToServices = "contentfwk::ServiceQuality::Related Elements::applies To Services";
			
			
			public static String appliesToContracts = "contentfwk::ServiceQuality::Related Elements::applies To Contracts";
			
			
			public static String delegates = "contentfwk::ServiceQuality::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::ServiceQuality::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Contract view descriptor
	 * 
	 */
	public static class Contract {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Contract::Attributes::name";
			
			
			public static String iD = "contentfwk::Contract::Attributes::ID";
			
			
			public static String description = "contentfwk::Contract::Attributes::description";
			
			
			public static String category = "contentfwk::Contract::Attributes::category";
			
			
			public static String source = "contentfwk::Contract::Attributes::source";
			
			
			public static String owner = "contentfwk::Contract::Attributes::owner";
			
			
			public static String serviceNameCaller = "contentfwk::Contract::Attributes::Service Name Caller";
			
			
			public static String serviceNameCalled = "contentfwk::Contract::Attributes::Service Name Called";
			
			
			public static String behaviorCharacteristics = "contentfwk::Contract::Attributes::behavior Characteristics";
			
			
			public static String serviceQualityCharacteristics = "contentfwk::Contract::Attributes::service Quality Characteristics";
			
			
			public static String availabilityQualityCharacteristics = "contentfwk::Contract::Attributes::availability Quality Characteristics";
			
			
			public static String servicesTimes = "contentfwk::Contract::Attributes::services Times";
			
			
			public static String manageabilityCharacteristics = "contentfwk::Contract::Attributes::manageability Characteristics";
			
			
			public static String serviceabilityCharacteristics = "contentfwk::Contract::Attributes::serviceability Characteristics";
			
			
			public static String performanceCharacteristics = "contentfwk::Contract::Attributes::performance Characteristics";
			
			
			public static String responseCharacteristics = "contentfwk::Contract::Attributes::response Characteristics";
			
			
			public static String reliabilityCharacteristics = "contentfwk::Contract::Attributes::reliability Characteristics";
			
			
			public static String qualityOfInformationRequired = "contentfwk::Contract::Attributes::quality Of Information Required";
			
			
			public static String contractControlRequirements = "contentfwk::Contract::Attributes::contract Control Requirements";
			
			
			public static String resultControlRequirements = "contentfwk::Contract::Attributes::result Control Requirements";
			
			
			public static String recoverabilityCharacteristics = "contentfwk::Contract::Attributes::recoverability Characteristics";
			
			
			public static String locatabilityCharacteristics = "contentfwk::Contract::Attributes::locatability Characteristics";
			
			
			public static String securityCharacteristics = "contentfwk::Contract::Attributes::security Characteristics";
			
			
			public static String privacyCharacteristics = "contentfwk::Contract::Attributes::privacy Characteristics";
			
			
			public static String integrityCharacteristics = "contentfwk::Contract::Attributes::integrity Characteristics";
			
			
			public static String credibilityCharacteristics = "contentfwk::Contract::Attributes::credibility Characteristics";
			
			
			public static String localizationCharacteristics = "contentfwk::Contract::Attributes::localization Characteristics";
			
			
			public static String internationalizationCharacteristics = "contentfwk::Contract::Attributes::internationalization Characteristics";
			
			
			public static String interoperabilityCharacteristics = "contentfwk::Contract::Attributes::interoperability Characteristics";
			
			
			public static String scalabilityCharacteristics = "contentfwk::Contract::Attributes::scalability Characteristics";
			
			
			public static String portabilityCharacteristics = "contentfwk::Contract::Attributes::portability Characteristics";
			
			
			public static String extensibilityCharacteristics = "contentfwk::Contract::Attributes::extensibility Characteristics";
			
			
			public static String capacityCharacteristics = "contentfwk::Contract::Attributes::capacity Characteristics";
			
			
			public static String throughput = "contentfwk::Contract::Attributes::throughput";
			
			
			public static String throughputPeriod = "contentfwk::Contract::Attributes::throughput Period";
			
			
			public static String growth = "contentfwk::Contract::Attributes::growth";
			
			
			public static String growthPeriod = "contentfwk::Contract::Attributes::growth Period";
			
			
			public static String peakProfileShortTerm = "contentfwk::Contract::Attributes::peak Profile Short Term";
			
			
			public static String peakProfileLongTerm = "contentfwk::Contract::Attributes::peak Profile Long Term";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String governsAndMeasuresBusinessServices = "contentfwk::Contract::Related Elements::governs And Measures Business Services";
			
			
			public static String meetsServiceQuality = "contentfwk::Contract::Related Elements::meets Service Quality";
			
			
			public static String delegates = "contentfwk::Contract::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Contract::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Event view descriptor
	 * 
	 */
	public static class Event {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Event::Attributes::name";
			
			
			public static String iD = "contentfwk::Event::Attributes::ID";
			
			
			public static String description = "contentfwk::Event::Attributes::description";
			
			
			public static String category = "contentfwk::Event::Attributes::category";
			
			
			public static String source = "contentfwk::Event::Attributes::source";
			
			
			public static String owner = "contentfwk::Event::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String isGeneratedByActors = "contentfwk::Event::Related Elements::is Generated By Actors";
			
			
			public static String isResolvedByActors = "contentfwk::Event::Related Elements::is Resolved By Actors";
			
			
			public static String isResolvedByBusinessServices = "contentfwk::Event::Related Elements::is Resolved By Business Services";
			
			
			public static String isResolvedByProcesses = "contentfwk::Event::Related Elements::is Resolved By Processes";
			
			
			public static String isGeneratedByProcesses = "contentfwk::Event::Related Elements::is Generated By Processes";
			
			
			public static String delegates = "contentfwk::Event::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Event::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Control view descriptor
	 * 
	 */
	public static class Control {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Control::Attributes::name";
			
			
			public static String iD = "contentfwk::Control::Attributes::ID";
			
			
			public static String description = "contentfwk::Control::Attributes::description";
			
			
			public static String category = "contentfwk::Control::Attributes::category";
			
			
			public static String source = "contentfwk::Control::Attributes::source";
			
			
			public static String owner = "contentfwk::Control::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String ensuresCorrectOperationOfProcesses = "contentfwk::Control::Related Elements::ensures Correct Operation Of Processes";
			
			
			public static String delegates = "contentfwk::Control::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Control::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Element view descriptor
	 * 
	 */
	public static class Element {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Element::Attributes::name";
			
			
			public static String iD = "contentfwk::Element::Attributes::ID";
			
			
			public static String description = "contentfwk::Element::Attributes::description";
			
			
			public static String category = "contentfwk::Element::Attributes::category";
			
			
			public static String source = "contentfwk::Element::Attributes::source";
			
			
			public static String owner = "contentfwk::Element::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String delegates = "contentfwk::Element::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Element::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Container view descriptor
	 * 
	 */
	public static class Container {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Container::Attributes::name";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String ownsElements = "contentfwk::Container::Related Elements::owns Elements";
			
	
		}
	
	}

	/**
	 * Location view descriptor
	 * 
	 */
	public static class Location {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Location::Attributes::name";
			
			
			public static String iD = "contentfwk::Location::Attributes::ID";
			
			
			public static String description = "contentfwk::Location::Attributes::description";
			
			
			public static String category = "contentfwk::Location::Attributes::category";
			
			
			public static String source = "contentfwk::Location::Attributes::source";
			
			
			public static String owner = "contentfwk::Location::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesLocation = "contentfwk::Location::Related Elements::decomposes Location";
			
			
			public static String containsActors = "contentfwk::Location::Related Elements::contains Actors";
			
			
			public static String containsOrganizationUnits = "contentfwk::Location::Related Elements::contains Organization Units";
			
			
			public static String containsPhysicalDataComponents = "contentfwk::Location::Related Elements::contains Physical Data Components";
			
			
			public static String containsPhysicalApplicationComponents = "contentfwk::Location::Related Elements::contains Physical Application Components";
			
			
			public static String containsPhysicalTechnologyComponents = "contentfwk::Location::Related Elements::contains Physical Technology Components";
			
			
			public static String delegates = "contentfwk::Location::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Location::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Capability view descriptor
	 * 
	 */
	public static class Capability {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Capability::Attributes::name";
			
			
			public static String iD = "contentfwk::Capability::Attributes::ID";
			
			
			public static String description = "contentfwk::Capability::Attributes::description";
			
			
			public static String category = "contentfwk::Capability::Attributes::category";
			
			
			public static String source = "contentfwk::Capability::Attributes::source";
			
			
			public static String owner = "contentfwk::Capability::Attributes::owner";
			
			
			public static String businessValue = "contentfwk::Capability::Attributes::business Value";
			
			
			public static String increments = "contentfwk::Capability::Attributes::increments";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String isDeliveredBy = "contentfwk::Capability::Related Elements::is Delivered By";
			
			
			public static String delegates = "contentfwk::Capability::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Capability::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Principle view descriptor
	 * 
	 */
	public static class Principle {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Principle::Attributes::name";
			
			
			public static String iD = "contentfwk::Principle::Attributes::ID";
			
			
			public static String description = "contentfwk::Principle::Attributes::description";
			
			
			public static String category = "contentfwk::Principle::Attributes::category";
			
			
			public static String source = "contentfwk::Principle::Attributes::source";
			
			
			public static String owner = "contentfwk::Principle::Attributes::owner";
			
			
			public static String principleCategory = "contentfwk::Principle::Attributes::principle Category";
			
			
			public static String priority = "contentfwk::Principle::Attributes::priority";
			
			
			public static String statementOfPrinciple = "contentfwk::Principle::Attributes::statement Of Principle";
			
			
			public static String rationale = "contentfwk::Principle::Attributes::rationale";
			
			
			public static String implication = "contentfwk::Principle::Attributes::implication";
			
			
			public static String metric = "contentfwk::Principle::Attributes::metric";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String delegates = "contentfwk::Principle::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Principle::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Constraint view descriptor
	 * 
	 */
	public static class Constraint {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Constraint::Attributes::name";
			
			
			public static String iD = "contentfwk::Constraint::Attributes::ID";
			
			
			public static String description = "contentfwk::Constraint::Attributes::description";
			
			
			public static String category = "contentfwk::Constraint::Attributes::category";
			
			
			public static String source = "contentfwk::Constraint::Attributes::source";
			
			
			public static String owner = "contentfwk::Constraint::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String delegates = "contentfwk::Constraint::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Constraint::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Assumption view descriptor
	 * 
	 */
	public static class Assumption {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Assumption::Attributes::name";
			
			
			public static String iD = "contentfwk::Assumption::Attributes::ID";
			
			
			public static String description = "contentfwk::Assumption::Attributes::description";
			
			
			public static String category = "contentfwk::Assumption::Attributes::category";
			
			
			public static String source = "contentfwk::Assumption::Attributes::source";
			
			
			public static String owner = "contentfwk::Assumption::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String delegates = "contentfwk::Assumption::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Assumption::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Requirement view descriptor
	 * 
	 */
	public static class Requirement {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Requirement::Attributes::name";
			
			
			public static String iD = "contentfwk::Requirement::Attributes::ID";
			
			
			public static String description = "contentfwk::Requirement::Attributes::description";
			
			
			public static String category = "contentfwk::Requirement::Attributes::category";
			
			
			public static String source = "contentfwk::Requirement::Attributes::source";
			
			
			public static String owner = "contentfwk::Requirement::Attributes::owner";
			
			
			public static String statementOfRequirement = "contentfwk::Requirement::Attributes::statement Of Requirement";
			
			
			public static String rationale = "contentfwk::Requirement::Attributes::rationale";
			
			
			public static String acceptanceCriteria = "contentfwk::Requirement::Attributes::acceptance Criteria";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String delegates = "contentfwk::Requirement::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Requirement::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * Gap view descriptor
	 * 
	 */
	public static class Gap {
		public static class Attributes {
	
			
			public static String name = "contentfwk::Gap::Attributes::name";
			
			
			public static String iD = "contentfwk::Gap::Attributes::ID";
			
			
			public static String description = "contentfwk::Gap::Attributes::description";
			
			
			public static String category = "contentfwk::Gap::Attributes::category";
			
			
			public static String source = "contentfwk::Gap::Attributes::source";
			
			
			public static String owner = "contentfwk::Gap::Attributes::owner";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String delegates = "contentfwk::Gap::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::Gap::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * WorkPackage view descriptor
	 * 
	 */
	public static class WorkPackage {
		public static class Attributes {
	
			
			public static String name = "contentfwk::WorkPackage::Attributes::name";
			
			
			public static String iD = "contentfwk::WorkPackage::Attributes::ID";
			
			
			public static String description = "contentfwk::WorkPackage::Attributes::description";
			
			
			public static String category = "contentfwk::WorkPackage::Attributes::category";
			
			
			public static String source = "contentfwk::WorkPackage::Attributes::source";
			
			
			public static String owner = "contentfwk::WorkPackage::Attributes::owner";
			
			
			public static String workPackageCategory = "contentfwk::WorkPackage::Attributes::work Package Category";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String deliversCapabilities = "contentfwk::WorkPackage::Related Elements::delivers Capabilities";
			
			
			public static String delegates = "contentfwk::WorkPackage::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::WorkPackage::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * LogicalDataComponent view descriptor
	 * 
	 */
	public static class LogicalDataComponent {
		public static class Attributes {
	
			
			public static String name = "contentfwk::LogicalDataComponent::Attributes::name";
			
			
			public static String iD = "contentfwk::LogicalDataComponent::Attributes::ID";
			
			
			public static String description = "contentfwk::LogicalDataComponent::Attributes::description";
			
			
			public static String category = "contentfwk::LogicalDataComponent::Attributes::category";
			
			
			public static String source = "contentfwk::LogicalDataComponent::Attributes::source";
			
			
			public static String owner = "contentfwk::LogicalDataComponent::Attributes::owner";
			
			
			public static String standardClass = "contentfwk::LogicalDataComponent::Attributes::standard Class";
			
			
			public static String standardCreationDate = "contentfwk::LogicalDataComponent::Attributes::standard Creation Date";
			
			
			public static String lastStandardCreationDate = "contentfwk::LogicalDataComponent::Attributes::last Standard Creation Date";
			
			
			public static String nextStandardCreationDate = "contentfwk::LogicalDataComponent::Attributes::next Standard Creation Date";
			
			
			public static String retireDate = "contentfwk::LogicalDataComponent::Attributes::retire Date";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String encapsulatesDataEntities = "contentfwk::LogicalDataComponent::Related Elements::encapsulates Data Entities";
			
			
			public static String isExtendedByPhysicalDataComponents = "contentfwk::LogicalDataComponent::Related Elements::is Extended By Physical Data Components";
			
			
			public static String delegates = "contentfwk::LogicalDataComponent::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::LogicalDataComponent::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * PhysicalDataComponent view descriptor
	 * 
	 */
	public static class PhysicalDataComponent {
		public static class Attributes {
	
			
			public static String name = "contentfwk::PhysicalDataComponent::Attributes::name";
			
			
			public static String iD = "contentfwk::PhysicalDataComponent::Attributes::ID";
			
			
			public static String description = "contentfwk::PhysicalDataComponent::Attributes::description";
			
			
			public static String category = "contentfwk::PhysicalDataComponent::Attributes::category";
			
			
			public static String source = "contentfwk::PhysicalDataComponent::Attributes::source";
			
			
			public static String owner = "contentfwk::PhysicalDataComponent::Attributes::owner";
			
			
			public static String standardClass = "contentfwk::PhysicalDataComponent::Attributes::standard Class";
			
			
			public static String standardCreationDate = "contentfwk::PhysicalDataComponent::Attributes::standard Creation Date";
			
			
			public static String lastStandardCreationDate = "contentfwk::PhysicalDataComponent::Attributes::last Standard Creation Date";
			
			
			public static String nextStandardCreationDate = "contentfwk::PhysicalDataComponent::Attributes::next Standard Creation Date";
			
			
			public static String retireDate = "contentfwk::PhysicalDataComponent::Attributes::retire Date";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String isHotedInLocation = "contentfwk::PhysicalDataComponent::Related Elements::is Hoted In Location";
			
			
			public static String decomposesPhysicalDataComponent = "contentfwk::PhysicalDataComponent::Related Elements::decomposes Physical Data Component";
			
			
			public static String extendsLogicalDataComponents = "contentfwk::PhysicalDataComponent::Related Elements::extends Logical Data Components";
			
			
			public static String encapsulatesPhysicalApplicationComponents = "contentfwk::PhysicalDataComponent::Related Elements::encapsulates Physical Application Components";
			
			
			public static String delegates = "contentfwk::PhysicalDataComponent::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::PhysicalDataComponent::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * ApplicationArchitecture view descriptor
	 * 
	 */
	public static class ApplicationArchitecture {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * PhysicalApplicationComponent view descriptor
	 * 
	 */
	public static class PhysicalApplicationComponent {
		public static class Attributes {
	
			
			public static String name = "contentfwk::PhysicalApplicationComponent::Attributes::name";
			
			
			public static String iD = "contentfwk::PhysicalApplicationComponent::Attributes::ID";
			
			
			public static String description = "contentfwk::PhysicalApplicationComponent::Attributes::description";
			
			
			public static String category = "contentfwk::PhysicalApplicationComponent::Attributes::category";
			
			
			public static String source = "contentfwk::PhysicalApplicationComponent::Attributes::source";
			
			
			public static String owner = "contentfwk::PhysicalApplicationComponent::Attributes::owner";
			
			
			public static String standardClass = "contentfwk::PhysicalApplicationComponent::Attributes::standard Class";
			
			
			public static String standardCreationDate = "contentfwk::PhysicalApplicationComponent::Attributes::standard Creation Date";
			
			
			public static String lastStandardCreationDate = "contentfwk::PhysicalApplicationComponent::Attributes::lastStandard Creation Date";
			
			
			public static String nextStandardCreationDate = "contentfwk::PhysicalApplicationComponent::Attributes::next Standard Creation Date";
			
			
			public static String retireDate = "contentfwk::PhysicalApplicationComponent::Attributes::retire Date";
			
			
			public static String lifeCycleStatus = "contentfwk::PhysicalApplicationComponent::Attributes::life Cycle Status";
			
			
			public static String initialLiveDate = "contentfwk::PhysicalApplicationComponent::Attributes::initial Live Date";
			
			
			public static String dateOfLastRelease = "contentfwk::PhysicalApplicationComponent::Attributes::date Of Last Release";
			
			
			public static String dateOfNextRelease = "contentfwk::PhysicalApplicationComponent::Attributes::date Of Next Release";
			
			
			public static String retirementDate = "contentfwk::PhysicalApplicationComponent::Attributes::retirement Date";
			
			
			public static String servicesTimes = "contentfwk::PhysicalApplicationComponent::Attributes::services Times";
			
			
			public static String throughput = "contentfwk::PhysicalApplicationComponent::Attributes::throughput";
			
			
			public static String throughputPeriod = "contentfwk::PhysicalApplicationComponent::Attributes::throughput Period";
			
			
			public static String growth = "contentfwk::PhysicalApplicationComponent::Attributes::growth";
			
			
			public static String growthPeriod = "contentfwk::PhysicalApplicationComponent::Attributes::growth Period";
			
			
			public static String peakProfileShortTerm = "contentfwk::PhysicalApplicationComponent::Attributes::peak Profile Short Term";
			
			
			public static String peakProfileLongTerm = "contentfwk::PhysicalApplicationComponent::Attributes::peak Profile Long Term";
			
				public static class Characteristics {
			
					
					public static String availabilityQualityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::availability Quality Characteristics";
					
					
					public static String manageabilityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::manageability Characteristics";
					
					
					public static String serviceabilityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::serviceability Characteristics";
					
					
					public static String performanceCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::performance Characteristics";
					
					
					public static String reliabilityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::reliability Characteristics";
					
					
					public static String recoverabilityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::recoverability Characteristics";
					
					
					public static String locatabilityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::locatability Characteristics";
					
					
					public static String securityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::security Characteristics";
					
					
					public static String privacyCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::privacy Characteristics";
					
					
					public static String integrityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::integrity Characteristics";
					
					
					public static String credibilityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::credibility Characteristics";
					
					
					public static String localizationCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::localization Characteristics";
					
					
					public static String internationalizationCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::internationalization Characteristics";
					
					
					public static String interoperabilityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::interoperability Characteristics";
					
					
					public static String scalabilityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::scalability Characteristics";
					
					
					public static String portabilityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::portability Characteristics";
					
					
					public static String extensibilityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::extensibility Characteristics";
					
					
					public static String capacityCharacteristics = "contentfwk::PhysicalApplicationComponent::Attributes::Characteristics::capacity Characteristics";
					
			
				}
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesPhysicalApplicationComponent = "contentfwk::PhysicalApplicationComponent::Related Elements::decomposes Physical Application Component";
			
			
			public static String encapsulatesPhysicalDataComponents = "contentfwk::PhysicalApplicationComponent::Related Elements::encapsulates Physical Data Components";
			
			
			public static String isRealizedByPhysicalTechnologyComponents = "contentfwk::PhysicalApplicationComponent::Related Elements::is Realized By Physical Technology Components";
			
			
			public static String extendsLogicalApplicationComponents = "contentfwk::PhysicalApplicationComponent::Related Elements::extends Logical Application Components";
			
			
			public static String isHostedInLocation = "contentfwk::PhysicalApplicationComponent::Related Elements::is Hosted In Location";
			
			
			public static String communicatesWith = "contentfwk::PhysicalApplicationComponent::Related Elements::communicates With";
			
			
			public static String delegates = "contentfwk::PhysicalApplicationComponent::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::PhysicalApplicationComponent::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * LogicalTechnologyComponent view descriptor
	 * 
	 */
	public static class LogicalTechnologyComponent {
		public static class Attributes {
	
			
			public static String name = "contentfwk::LogicalTechnologyComponent::Attributes::name";
			
			
			public static String iD = "contentfwk::LogicalTechnologyComponent::Attributes::ID";
			
			
			public static String description = "contentfwk::LogicalTechnologyComponent::Attributes::description";
			
			
			public static String category = "contentfwk::LogicalTechnologyComponent::Attributes::category";
			
			
			public static String source = "contentfwk::LogicalTechnologyComponent::Attributes::source";
			
			
			public static String owner = "contentfwk::LogicalTechnologyComponent::Attributes::owner";
			
			
			public static String standardClass = "contentfwk::LogicalTechnologyComponent::Attributes::standard Class";
			
			
			public static String standardCreationDate = "contentfwk::LogicalTechnologyComponent::Attributes::standard Creation Date";
			
			
			public static String lastStandardCreationDate = "contentfwk::LogicalTechnologyComponent::Attributes::last Standard Creation Date";
			
			
			public static String nextStandardCreationDate = "contentfwk::LogicalTechnologyComponent::Attributes::next Standard Creation Date";
			
			
			public static String retireDate = "contentfwk::LogicalTechnologyComponent::Attributes::retire Date";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesLogicalTechnologyComponent = "contentfwk::LogicalTechnologyComponent::Related Elements::decomposes Logical Technology Component";
			
			
			public static String isRealizedByPhysicalTechnologyComponents = "contentfwk::LogicalTechnologyComponent::Related Elements::is Realized By Physical Technology Components";
			
			
			public static String isDependentOnLogicalTechnologyComponents = "contentfwk::LogicalTechnologyComponent::Related Elements::is Dependent On Logical Technology Components";
			
			
			public static String providesPlatformForServices = "contentfwk::LogicalTechnologyComponent::Related Elements::provides Platform For Services";
			
			
			public static String suppliesPlatformServices = "contentfwk::LogicalTechnologyComponent::Related Elements::supplies Platform Services";
			
			
			public static String delegates = "contentfwk::LogicalTechnologyComponent::Related Elements::delegates";
			
			
			public static String isDelegatedBy = "contentfwk::LogicalTechnologyComponent::Related Elements::is Delegated By";
			
	
		}
	
	}

	/**
	 * StrategicArchitecture view descriptor
	 * 
	 */
	public static class StrategicArchitecture {
		public static class Properties {
	
	
		}
	
	}

	/**
	 * InformationSystemService view descriptor
	 * 
	 */
	public static class InformationSystemService {
		public static class Attributes {
	
			
			public static String name = "contentfwk::InformationSystemService::Attributes::name";
			
			
			public static String standardClass = "contentfwk::InformationSystemService::Attributes::standard Class";
			
			
			public static String standardCreationDate = "contentfwk::InformationSystemService::Attributes::standard Creation Date";
			
			
			public static String lastStandardCreationDate = "contentfwk::InformationSystemService::Attributes::last Standard Creation Date";
			
			
			public static String nextStandardCreationDate = "contentfwk::InformationSystemService::Attributes::next Standard Creation Date";
			
			
			public static String retireDate = "contentfwk::InformationSystemService::Attributes::retire Date";
			
	
		}
	
		public static class RelatedElements {
	
			
			public static String decomposesServices = "contentfwk::InformationSystemService::Related Elements::decomposes Services";
			
			
			public static String consumesServices = "contentfwk::InformationSystemService::Related Elements::consumes Services";
			
			
			public static String isProvidedToActors = "contentfwk::InformationSystemService::Related Elements::is Provided To Actors";
			
			
			public static String isOwnedAndGovernedByOrganizationUnits = "contentfwk::InformationSystemService::Related Elements::is Owned And Governed By Organization Units";
			
			
			public static String providesGovernedInterfaceToAccessFunctions = "contentfwk::InformationSystemService::Related Elements::provides Governed Interface To Access Functions";
			
			
			public static String supportsProcesses = "contentfwk::InformationSystemService::Related Elements::supports Processes";
			
			
			public static String isRealizedByProcesses = "contentfwk::InformationSystemService::Related Elements::is Realized By Processes";
			
			
			public static String resolvesEvents = "contentfwk::InformationSystemService::Related Elements::resolves Events";
			
			
			public static String providesEntities = "contentfwk::InformationSystemService::Related Elements::provides Entities";
			
			
			public static String consumesEntities = "contentfwk::InformationSystemService::Related Elements::consumes Entities";
			
			
			public static String isImplementedOnLogicalTechnologyComponents = "contentfwk::InformationSystemService::Related Elements::is Implemented On Logical Technology Components";
			
			
			public static String isRealizedThroughLogicalApplicationComponent = "contentfwk::InformationSystemService::Related Elements::is Realized Through Logical Application Component";
			
			
			public static String isGovernedAndMeasuredByContracts = "contentfwk::InformationSystemService::Related Elements::is Governed And Measured By Contracts";
			
			
			public static String isTrackedAgainstMeasures = "contentfwk::InformationSystemService::Related Elements::is Tracked Against Measures";
			
			
			public static String meetsQualities = "contentfwk::InformationSystemService::Related Elements::meets Qualities";
			
	
		}
	
	}

	/**
	 * Roles view descriptor
	 * 
	 */
	public static class Roles {
		public static class Roles_ {
	
			
			public static String roles__ = "contentfwk::Roles::roles_::roles__";
			
	
		}
	
	}

	/**
	 * OrganizationActor view descriptor
	 * 
	 */
	public static class OrganizationActor {
		public static class Organizationactors {
	
			
			public static String organizations = "contentfwk::OrganizationActor::organization-actors::organizations";
			
			
			public static String actors = "contentfwk::OrganizationActor::organization-actors::actors";
			
	
		}
	
	}

	/**
	 * BusinessServiceFunction view descriptor
	 * 
	 */
	public static class BusinessServiceFunction {
		public static class Organizationactors {
	
			
			public static String services = "contentfwk::BusinessServiceFunction::organization-actors::services";
			
			
			public static String functions = "contentfwk::BusinessServiceFunction::organization-actors::functions";
			
	
		}
	
	}

	/**
	 * Driver Goal Objective view descriptor
	 * 
	 */
	public static class DriverGoalObjective {
		public static class Driversgoalfsobjectives {
	
			
			public static String drivers = "contentfwk::Driver Goal Objective::drivers-goalfs-objectives::drivers";
			
			
			public static String goals = "contentfwk::Driver Goal Objective::drivers-goalfs-objectives::goals";
			
			
			public static String objectives = "contentfwk::Driver Goal Objective::drivers-goalfs-objectives::objectives";
			
	
		}
	
	}

	/**
	 * Locations view descriptor
	 * 
	 */
	public static class Locations {
		public static class Locations_ {
	
			
			public static String locations__ = "contentfwk::Locations::locations_::locations__";
			
	
		}
	
	}

	/**
	 * Process Event Control Product view descriptor
	 * 
	 */
	public static class ProcessEventControlProduct {
		public static class Processeventcontrolproduct {
	
			
			public static String processes = "contentfwk::Process Event Control Product::process-event-control-product::processes";
			
			
			public static String events = "contentfwk::Process Event Control Product::process-event-control-product::events";
			
			
			public static String controls = "contentfwk::Process Event Control Product::process-event-control-product::controls";
			
			
			public static String products = "contentfwk::Process Event Control Product::process-event-control-product::products";
			
	
		}
	
	}

	/**
	 * Contract Measure Services Quality view descriptor
	 * 
	 */
	public static class ContractMeasureServicesQuality {
		public static class Contractsmeasures {
	
			
			public static String contracts = "contentfwk::Contract Measure Services Quality::contracts-measures::contracts";
			
			
			public static String measures = "contentfwk::Contract Measure Services Quality::contracts-measures::measures";
			
			
			public static String servicesQuality = "contentfwk::Contract Measure Services Quality::contracts-measures::services quality";
			
	
		}
	
	}

	/**
	 * Data Entity Data Component view descriptor
	 * 
	 */
	public static class DataEntityDataComponent {
		public static class Properties {
	
			
			public static String dataEntity = "contentfwk::Data Entity Data Component::properties::dataEntity";
			
			
			public static String logicalDataComponent = "contentfwk::Data Entity Data Component::properties::logical-DataComponent";
			
			
			public static String physicalDataComponent = "contentfwk::Data Entity Data Component::properties::physicalDataComponent";
			
	
		}
	
	}

	/**
	 * Data Entities view descriptor
	 * 
	 */
	public static class DataEntities {
		public static class Properties {
	
			
			public static String dataEntities_ = "contentfwk::Data Entities::properties::Data Entities_";
			
	
		}
	
	}

	/**
	 * Logical Data view descriptor
	 * 
	 */
	public static class LogicalData {
		public static class Properties {
	
			
			public static String logicalData_ = "contentfwk::Logical Data::properties::Logical Data_";
			
	
		}
	
	}

	/**
	 * Physical Data view descriptor
	 * 
	 */
	public static class PhysicalData {
		public static class Properties {
	
			
			public static String physicalData_ = "contentfwk::Physical Data::properties::Physical Data_";
			
	
		}
	
	}

	/**
	 * Application Portofolio view descriptor
	 * 
	 */
	public static class ApplicationPortofolio {
		public static class Properties {
	
			
			public static String logicalApplicationComponent = "contentfwk::Application Portofolio::properties::logicalApplicationComponent";
			
			
			public static String physicalApplicationComponent = "contentfwk::Application Portofolio::properties::physicalApplicationComponent";
			
	
		}
	
	}

	/**
	 * PrinciplesCatalogView view descriptor
	 * 
	 */
	public static class PrinciplesCatalogView {
		public static class Principles {
	
			
			public static String principles_ = "contentfwk::PrinciplesCatalogView::principles::Principles_";
			
	
		}
	
	}

	/**
	 * Information System Services view descriptor
	 * 
	 */
	public static class InformationSystemServices {
		public static class Properties {
	
			
			public static String informationSystemServices_ = "contentfwk::Information System Services::properties::Information System Services_";
			
	
		}
	
	}

	/**
	 * Logical Application Components view descriptor
	 * 
	 */
	public static class LogicalApplicationComponents {
		public static class Properties {
	
			
			public static String logicalApplicationComponents_ = "contentfwk::Logical Application Components::properties::Logical Application Components_";
			
	
		}
	
	}

	/**
	 * Physical Application Components view descriptor
	 * 
	 */
	public static class PhysicalApplicationComponents {
		public static class Properties {
	
			
			public static String physicalApplicationComponents_ = "contentfwk::Physical Application Components::properties::Physical Application Components_";
			
	
		}
	
	}

	/**
	 * Platform Services view descriptor
	 * 
	 */
	public static class PlatformServices {
		public static class Properties {
	
			
			public static String platformServices_ = "contentfwk::Platform Services::properties::Platform Services_";
			
	
		}
	
	}

	/**
	 * Logical Technology Components view descriptor
	 * 
	 */
	public static class LogicalTechnologyComponents {
		public static class Properties {
	
			
			public static String logicalTechnologyComponents_ = "contentfwk::Logical Technology Components::properties::Logical Technology Components_";
			
	
		}
	
	}

	/**
	 * Physical Technology Components view descriptor
	 * 
	 */
	public static class PhysicalTechnologyComponents {
		public static class Properties {
	
			
			public static String physicalTechnologyComponents_ = "contentfwk::Physical Technology Components::properties::Physical Technology Components_";
			
	
		}
	
	}

}
