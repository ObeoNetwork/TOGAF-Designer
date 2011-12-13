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
package org.obeonetwork.dsl.togaf.ui.util.meta;

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;

/**
 * @author sdrapeau
 * 
 */
public enum TogafRepresentation {

    // Business Phase
    GOAL_OBJECTIVE_SERVICE_DIAG("Goal/Objective/Service Diagram"), // //$NON-NLS-1$
    ORGANIZATION_DECOMPOSITION_DIAG("Organization Decomposition Diagram"), // //$NON-NLS-1$
    ACTOR_ROLE_MATRIX("Actor/Role Matrix"), // //$NON-NLS-1$
    FUNCTIONAL_DECOMPOSITION_DIAG("Functional Decomposition Diagram "), // //$NON-NLS-1$
    BUSINESS_INTERACTION_MATRIX("Business Interaction Matrix"), // //$NON-NLS-1$
    EVENT_DIAG("EventDiagram"), // //$NON-NLS-1$
    BUSINESS_SERVICE_INFORMATION_DIAG("Business Service / Information Diagram"), // //$NON-NLS-1$
    BUSINESS_FOOTPRINT_DIAG("Business Footprint Diagram"), // //$NON-NLS-1$
    BUSINESS_USE_CASE_DIAG("Business Use-Case Diagram"), // //$NON-NLS-1$
    // Data Phase
    DATA_ENTITY_BUSINESS_FUNCTION_MATRIX("Data Entity/Business Function Matrix"), // //$NON-NLS-1$
    SYSTEM_DATA_MATRIX("System/Data Matrix"), // //$NON-NLS-1$
    DATA_DISSEMINATION_DIAG("Data Dissemination Diagram"), // //$NON-NLS-1$
    CLASS_DIAG("Class Diagram"), // //$NON-NLS-1$
    // Application Phase
    SYSTEM_ORGANIZATION_MATRIX__LOGICAL("System/Organization Matrix (Logical App Map)"), // //$NON-NLS-1$
    SYSTEM_ORGANIZATION_MATRIX__PHYSICAL("System/Organization Matrix (Physical App Map)"), // //$NON-NLS-1$
    ROLE_SYSTEM_MATRIX_LOGICAL("Role/System Matrix (Logical App Map)"), // //$NON-NLS-1$
    ROLE_SYSTEM_MATRIX__PHYSICAL("Role/System Matrix (Physical App Map)"), // //$NON-NLS-1$
    SYSTEM_FUNCTION_MATRIX__LOGICAL("Systems/Function Matrix (Logical App Map)"), // //$NON-NLS-1$
    SYSTEM_FUNCTION_MATRIX__PHYSICAL("Systems/Function Matrix (Physical App Map)"), // //$NON-NLS-1$
    APPLICATION_COMMUNICATION_DIAG("Application Communication Diagram"), // //$NON-NLS-1$
    APPLICATION_AND_USER_LOCATION_DIAG("Application & User Location Diagram"), // //$NON-NLS-1$
    SYSTEM_USE_CASE_DIAG("System Use Case Diagram"), // //$NON-NLS-1$
    // Technology Phase
    ENVIRONMENTS_AND_LOCATION_DIAG("Environments and Locations Diagram"), // //$NON-NLS-1$
    PLATFORM_DECOMPOSITION_DIAG("Platform Decomposition Diagram"), // //$NON-NLS-1$
    SYSTEM_TECHNOLOGY_MATRIX("System/Technology Matrix")// //$NON-NLS-1$
    ;

    private final String id;

    private TogafRepresentation(String id) {
	this.id = id;
    }

    public String getID() {
	return this.id;
    }

    /**
     * Returns the name of the viewpoint defining the representation identified by the name <code>representationName</code>.
     * 
     * @param representationName
     * @return
     */
    public static String getViewpoint(String representationName) {
	if (TogafRepresentation.GOAL_OBJECTIVE_SERVICE_DIAG.getID().equals(representationName)
		|| TogafRepresentation.ORGANIZATION_DECOMPOSITION_DIAG.getID().equals(representationName)
		|| TogafRepresentation.ACTOR_ROLE_MATRIX.getID().equals(representationName)
		|| TogafRepresentation.FUNCTIONAL_DECOMPOSITION_DIAG.getID().equals(representationName)
		|| TogafRepresentation.BUSINESS_INTERACTION_MATRIX.getID().equals(representationName)
		|| TogafRepresentation.EVENT_DIAG.getID().equals(representationName)
		|| TogafRepresentation.BUSINESS_SERVICE_INFORMATION_DIAG.getID().equals(representationName)
		|| TogafRepresentation.BUSINESS_FOOTPRINT_DIAG.getID().equals(representationName)
		|| TogafRepresentation.BUSINESS_USE_CASE_DIAG.getID().equals(representationName))
	    return "business"; //$NON-NLS-1$
	else if (TogafRepresentation.DATA_ENTITY_BUSINESS_FUNCTION_MATRIX.getID().equals(representationName)
		|| TogafRepresentation.SYSTEM_DATA_MATRIX.getID().equals(representationName)
		|| TogafRepresentation.DATA_DISSEMINATION_DIAG.getID().equals(representationName)
		|| TogafRepresentation.CLASS_DIAG.getID().equals(representationName))
	    return "data"; //$NON-NLS-1$
	else if (TogafRepresentation.SYSTEM_ORGANIZATION_MATRIX__LOGICAL.getID().equals(representationName)
		|| TogafRepresentation.SYSTEM_ORGANIZATION_MATRIX__PHYSICAL.getID().equals(representationName)
		|| TogafRepresentation.ROLE_SYSTEM_MATRIX_LOGICAL.getID().equals(representationName)
		|| TogafRepresentation.ROLE_SYSTEM_MATRIX__PHYSICAL.getID().equals(representationName)
		|| TogafRepresentation.SYSTEM_FUNCTION_MATRIX__LOGICAL.getID().equals(representationName)
		|| TogafRepresentation.SYSTEM_FUNCTION_MATRIX__PHYSICAL.getID().equals(representationName)
		|| TogafRepresentation.APPLICATION_COMMUNICATION_DIAG.getID().equals(representationName)
		|| TogafRepresentation.APPLICATION_AND_USER_LOCATION_DIAG.getID().equals(representationName)
		|| TogafRepresentation.SYSTEM_USE_CASE_DIAG.getID().equals(representationName))
	    return "application"; //$NON-NLS-1$
	else if (TogafRepresentation.ENVIRONMENTS_AND_LOCATION_DIAG.getID().equals(representationName)
		|| TogafRepresentation.PLATFORM_DECOMPOSITION_DIAG.getID().equals(representationName)
		|| TogafRepresentation.SYSTEM_TECHNOLOGY_MATRIX.getID().equals(representationName))
	    return "technology"; //$NON-NLS-1$
	return null;
    }

    /**
     * @param diagName
     * @return
     */
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
