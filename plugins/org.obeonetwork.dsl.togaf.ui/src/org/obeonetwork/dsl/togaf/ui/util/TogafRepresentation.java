package org.obeonetwork.dsl.togaf.ui.util;

public enum TogafRepresentation {

	// Business Phase
	GOAL_OBJECTIVE_SERVICE_DIAG("Goal/Objective/Service Diagram"), //
	ORGANIZATION_DECOMPOSITION_DIAG("Organization Decomposition Diagram"), //
	ACTOR_ROLE_MATRIX("Actor/Role Matrix"), //
	FUNCTIONAL_DECOMPOSITION_DIAG("Functional Decomposition Diagram "), //
	BUSINESS_INTERACTION_MATRIX("Business Interaction Matrix"), //
	EVENT_DIAG("EventDiagram"), //
	BUSINESS_SERVICE_INFORMATION_DIAG("Business Service / Information Diagram"), //
	BUSINESS_FOOTPRINT_DIAG("Business Footprint Diagram"), //
	BUSINESS_USE_CASE_DIAG("Business Use-Case Diagram"), //
	// Data Phase
	DATA_ENTITY_BUSINESS_FUNCTION_MATRIX("Data Entity/Business Function Matrix"), //
	SYSTEM_DATA_MATRIX("System/Data Matrix"), //
	DATA_DISSEMINATION_DIAG("Data Dissemination Diagram"), //
	CLASS_DIAG("Class Diagram"), //
	// Application Phase
	SYSTEM_ORGANIZATION_MATRIX__LOGICAL(
			"System/Organization Matrix (Logical App Map)"), //
	SYSTEM_ORGANIZATION_MATRIX__PHYSICAL(
			"System/Organization Matrix (Physical App Map)"), //
	ROLE_SYSTEM_MATRIX_LOGICAL("Role/System Matrix (Logical App Map)"), //
	ROLE_SYSTEM_MATRIX__PHYSICAL("Role/System Matrix (Physical App Map)"), //
	SYSTEM_FUNCTION_MATRIX__LOGICAL("Systems/Function Matrix (Logical App Map)"), //
	SYSTEM_FUNCTION_MATRIX__PHYSICAL(
			"Systems/Function Matrix (Physical App Map)"), //
	APPLICATION_COMMUNICATION_DIAG("Application Communication Diagram"), //
	APPLICATION_AND_USER_LOCATION_DIAG("Application & User Location Diagram"), //
	SYSTEM_USE_CASE_DIAG("System Use Case Diagram"), //
	// Technology Phase
	ENVIRONMENTS_AND_LOCATION_DIAG("Environments and Locations Diagram"), //
	PLATFORM_DECOMPOSITION_DIAG("Platform Decomposition Diagram"), //
	SYSTEM_TECHNOLOGY_MATRIX("System/Technology Matrix")//
	;

	private final String id;

	private TogafRepresentation(String id) {
		this.id = id;
	}

	public String getID() {
		return this.id;
	}
}
