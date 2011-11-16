package org.obeonetwork.dsl.togaf.ui.util;

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;

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
    SYSTEM_ORGANIZATION_MATRIX__LOGICAL("System/Organization Matrix (Logical App Map)"), //
    SYSTEM_ORGANIZATION_MATRIX__PHYSICAL("System/Organization Matrix (Physical App Map)"), //
    ROLE_SYSTEM_MATRIX_LOGICAL("Role/System Matrix (Logical App Map)"), //
    ROLE_SYSTEM_MATRIX__PHYSICAL("Role/System Matrix (Physical App Map)"), //
    SYSTEM_FUNCTION_MATRIX__LOGICAL("Systems/Function Matrix (Logical App Map)"), //
    SYSTEM_FUNCTION_MATRIX__PHYSICAL("Systems/Function Matrix (Physical App Map)"), //
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

    public static String getViewpoint(String diagName) {
	if (TogafRepresentation.GOAL_OBJECTIVE_SERVICE_DIAG.getID().equals(diagName)
		|| TogafRepresentation.ORGANIZATION_DECOMPOSITION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.ACTOR_ROLE_MATRIX.getID().equals(diagName)
		|| TogafRepresentation.FUNCTIONAL_DECOMPOSITION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.BUSINESS_INTERACTION_MATRIX.getID().equals(diagName)
		|| TogafRepresentation.EVENT_DIAG.getID().equals(diagName)
		|| TogafRepresentation.BUSINESS_SERVICE_INFORMATION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.BUSINESS_FOOTPRINT_DIAG.getID().equals(diagName)
		|| TogafRepresentation.BUSINESS_USE_CASE_DIAG.getID().equals(diagName))
	    return "business";
	else if (TogafRepresentation.DATA_ENTITY_BUSINESS_FUNCTION_MATRIX.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_DATA_MATRIX.getID().equals(diagName)
		|| TogafRepresentation.DATA_DISSEMINATION_DIAG.getID().equals(diagName) || TogafRepresentation.CLASS_DIAG.getID().equals(diagName))
	    return "data";
	else if (TogafRepresentation.SYSTEM_ORGANIZATION_MATRIX__LOGICAL.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_ORGANIZATION_MATRIX__PHYSICAL.getID().equals(diagName)
		|| TogafRepresentation.ROLE_SYSTEM_MATRIX_LOGICAL.getID().equals(diagName)
		|| TogafRepresentation.ROLE_SYSTEM_MATRIX__PHYSICAL.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_FUNCTION_MATRIX__LOGICAL.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_FUNCTION_MATRIX__PHYSICAL.getID().equals(diagName)
		|| TogafRepresentation.APPLICATION_COMMUNICATION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.APPLICATION_AND_USER_LOCATION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_USE_CASE_DIAG.getID().equals(diagName))
	    return "application";
	else if (TogafRepresentation.ENVIRONMENTS_AND_LOCATION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.PLATFORM_DECOMPOSITION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_TECHNOLOGY_MATRIX.getID().equals(diagName))
	    return "technology";
	return null;
    }

    public static EClass getArchitectureKind(String diagName) {
	EClass result = null;
	if (TogafRepresentation.GOAL_OBJECTIVE_SERVICE_DIAG.getID().equals(diagName)
		|| TogafRepresentation.ORGANIZATION_DECOMPOSITION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.ACTOR_ROLE_MATRIX.getID().equals(diagName)
		|| TogafRepresentation.FUNCTIONAL_DECOMPOSITION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.BUSINESS_INTERACTION_MATRIX.getID().equals(diagName)
		|| TogafRepresentation.EVENT_DIAG.getID().equals(diagName)
		|| TogafRepresentation.BUSINESS_SERVICE_INFORMATION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.BUSINESS_FOOTPRINT_DIAG.getID().equals(diagName))
	    result = ContentfwkPackage.Literals.BUSINESS_ARCHITECTURE;
	else if (TogafRepresentation.DATA_ENTITY_BUSINESS_FUNCTION_MATRIX.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_DATA_MATRIX.getID().equals(diagName)
		|| TogafRepresentation.DATA_DISSEMINATION_DIAG.getID().equals(diagName) || TogafRepresentation.CLASS_DIAG.getID().equals(diagName))
	    result = ContentfwkPackage.Literals.DATA_ARCHITECTURE;
	else if (TogafRepresentation.SYSTEM_ORGANIZATION_MATRIX__LOGICAL.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_ORGANIZATION_MATRIX__PHYSICAL.getID().equals(diagName)
		|| TogafRepresentation.ROLE_SYSTEM_MATRIX_LOGICAL.getID().equals(diagName)
		|| TogafRepresentation.ROLE_SYSTEM_MATRIX__PHYSICAL.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_FUNCTION_MATRIX__LOGICAL.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_FUNCTION_MATRIX__PHYSICAL.getID().equals(diagName)
		|| TogafRepresentation.APPLICATION_COMMUNICATION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.APPLICATION_AND_USER_LOCATION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_USE_CASE_DIAG.getID().equals(diagName))
	    result = ContentfwkPackage.Literals.APPLICATION_ARCHITECTURE;
	else if (TogafRepresentation.ENVIRONMENTS_AND_LOCATION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.PLATFORM_DECOMPOSITION_DIAG.getID().equals(diagName)
		|| TogafRepresentation.SYSTEM_TECHNOLOGY_MATRIX.getID().equals(diagName))
	    result = ContentfwkPackage.Literals.TECHNOLOGY_ARCHITECTURE;
	return result;
    }
}
