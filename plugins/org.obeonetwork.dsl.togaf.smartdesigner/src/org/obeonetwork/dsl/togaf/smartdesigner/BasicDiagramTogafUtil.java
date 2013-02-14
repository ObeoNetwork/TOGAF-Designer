/**
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.dsl.togaf.smartdesigner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;

/**
 * Utility class for the Togaf Basic Diagram.
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public class BasicDiagramTogafUtil {

	private static final Map<EClass, List<EClass>> architectures = initArchitectures();

	private static final Map<String, Map<String, List<EClass>>> viewpoints = initViewpoints();

	private static Map<EClass, List<EClass>> initArchitectures() {
		Map<EClass, List<EClass>> map = new HashMap<EClass, List<EClass>>();
		List<EClass> list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getAssumption());
		list.add(ContentfwkPackage.eINSTANCE.getCapability());
		list.add(ContentfwkPackage.eINSTANCE.getConstraint());
		list.add(ContentfwkPackage.eINSTANCE.getGap());
		list.add(ContentfwkPackage.eINSTANCE.getPrinciple());
		list.add(ContentfwkPackage.eINSTANCE.getWorkPackage());
		map.put(ContentfwkPackage.eINSTANCE.getStrategicArchitecture(), list);

		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getActor());
		list.add(ContentfwkPackage.eINSTANCE.getBusinessService());
		list.add(ContentfwkPackage.eINSTANCE.getContract());
		list.add(ContentfwkPackage.eINSTANCE.getControl());
		list.add(ContentfwkPackage.eINSTANCE.getDriver());
		list.add(ContentfwkPackage.eINSTANCE.getEvent());
		list.add(ContentfwkPackage.eINSTANCE.getFunction());
		list.add(ContentfwkPackage.eINSTANCE.getGoal());
		list.add(ContentfwkPackage.eINSTANCE.getLocation());
		list.add(ContentfwkPackage.eINSTANCE.getMeasure());
		list.add(ContentfwkPackage.eINSTANCE.getObjective());
		list.add(ContentfwkPackage.eINSTANCE.getOrganizationUnit());
		list.add(ContentfwkPackage.eINSTANCE.getProcess());
		list.add(ContentfwkPackage.eINSTANCE.getProduct());
		list.add(ContentfwkPackage.eINSTANCE.getRole());
		list.add(ContentfwkPackage.eINSTANCE.getServiceQuality());
		map.put(ContentfwkPackage.eINSTANCE.getBusinessArchitecture(), list);

		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getInformationSystemService());
		list.add(ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent());
		list.add(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent());
		map.put(ContentfwkPackage.eINSTANCE.getApplicationArchitecture(), list);

		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getDataEntity());
		list.add(ContentfwkPackage.eINSTANCE.getLogicalDataComponent());
		list.add(ContentfwkPackage.eINSTANCE.getPhysicalDataComponent());
		map.put(ContentfwkPackage.eINSTANCE.getDataArchitecture(), list);

		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getPlatformService());
		list.add(ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent());
		list.add(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent());
		map.put(ContentfwkPackage.eINSTANCE.getTechnologyArchitecture(), list);

		return map;
	}

	private static Map<String, Map<String, List<EClass>>> initViewpoints() {
		Map<String, Map<String, List<EClass>>> result = new HashMap<String, Map<String, List<EClass>>>();

		Map<String, List<EClass>> all = new HashMap<String, List<EClass>>();
		List<EClass> list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getAssumption());
		list.add(ContentfwkPackage.eINSTANCE.getCapability());
		list.add(ContentfwkPackage.eINSTANCE.getConstraint());
		list.add(ContentfwkPackage.eINSTANCE.getGap());
		list.add(ContentfwkPackage.eINSTANCE.getPrinciple());
		list.add(ContentfwkPackage.eINSTANCE.getWorkPackage());
		all.put("Strategic architecture", list);
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getActor());
		list.add(ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent());
		list.add(ContentfwkPackage.eINSTANCE.getBusinessService());
		list.add(ContentfwkPackage.eINSTANCE.getContract());
		list.add(ContentfwkPackage.eINSTANCE.getControl());
		list.add(ContentfwkPackage.eINSTANCE.getDriver());
		list.add(ContentfwkPackage.eINSTANCE.getEvent());
		list.add(ContentfwkPackage.eINSTANCE.getFunction());
		list.add(ContentfwkPackage.eINSTANCE.getGoal());
		list.add(ContentfwkPackage.eINSTANCE.getLocation());
		list.add(ContentfwkPackage.eINSTANCE.getMeasure());
		list.add(ContentfwkPackage.eINSTANCE.getObjective());
		list.add(ContentfwkPackage.eINSTANCE.getOrganizationUnit());
		list.add(ContentfwkPackage.eINSTANCE.getProcess());
		list.add(ContentfwkPackage.eINSTANCE.getProduct());
		list.add(ContentfwkPackage.eINSTANCE.getRole());
		list.add(ContentfwkPackage.eINSTANCE.getServiceQuality());
		all.put("Business architecture", list);
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getInformationSystemService());
		list.add(ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent());
		list.add(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent());
		all.put("Application architecture", list);
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getDataEntity());
		list.add(ContentfwkPackage.eINSTANCE.getLogicalDataComponent());
		list.add(ContentfwkPackage.eINSTANCE.getPhysicalDataComponent());
		all.put("Data architecture", list);
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getPlatformService());
		list.add(ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent());
		list.add(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent());
		all.put("Technology architecture", list);
		result.put(" Architectures", all);

		Map<String, List<EClass>> strategic = new HashMap<String, List<EClass>>();
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getCapability());
		strategic.put("Capability Assessment", list);
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getPrinciple());
		strategic.put("Principles", list);
		list.add(ContentfwkPackage.eINSTANCE.getConstraint());
		list.add(ContentfwkPackage.eINSTANCE.getAssumption());
		list.add(ContentfwkPackage.eINSTANCE.getGap());
		list.add(ContentfwkPackage.eINSTANCE.getWorkPackage());
		strategic.put("Constraints/Assumptions/Gap/WorkPackage", list);
		result.put("Strategic", strategic);

		Map<String, List<EClass>> business = new HashMap<String, List<EClass>>();
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getBusinessService());
		list.add(ContentfwkPackage.eINSTANCE.getFunction());
		list.add(ContentfwkPackage.eINSTANCE.getGoal());
		list.add(ContentfwkPackage.eINSTANCE.getOrganizationUnit());
		list.add(ContentfwkPackage.eINSTANCE.getPlatformService());
		list.add(ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent());
		list.add(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent());
		business.put("Business Footprint diagram", list);
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getBusinessService());
		list.add(ContentfwkPackage.eINSTANCE.getDataEntity());
		business.put("Business Service/Information diagram", list);
		// business.add("Functional Decomposition diagram (TODO)");
		// business.add("Goal/Objective/Service diagram (TODO)");
		// business.add("Use-case diagram (TODO)");
		// business.add("Organization Decomposition diagram (TODO)");
		// business.add("Process Flow diagram (TODO)");
		// business.add("Events diagram (TODO)");
		result.put("Business", business);

		Map<String, List<EClass>> application = new HashMap<String, List<EClass>>();
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent());
		application.put("Application Communication diagram", list);
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent());
		list.add(ContentfwkPackage.eINSTANCE.getActor());
		list.add(ContentfwkPackage.eINSTANCE.getLocation());
		application.put("Application and User Location diagram", list);
		// application.add("Enterprise Manageability diagram (TODO)");
		// application.add("Process/Application Realization diagram (TODO)");
		// application.add("Application Migration diagram (TODO)");
		// application.add("Software Distribution diagram (TODO)");
		// application.add("Software Engineering diagram (TODO)");
		// application.add("Application Use-Case diagram (TODO)");
		result.put("Application", application);

		Map<String, List<EClass>> data = new HashMap<String, List<EClass>>();
		// data.add("Conceptual Data diagram (TODO)");
		// data.add("Logical Data diagram (TODO)");
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getDataEntity());
		data.put("Class diagram",list);
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent());
		list.add(ContentfwkPackage.eINSTANCE.getBusinessService());
		list.add(ContentfwkPackage.eINSTANCE.getDataEntity());
		data.put("Data Dissemination diagram",list);
		// data.add("Data Lifecycle diagram (TODO)");
		// data.add("Data Security diagram (TODO)");
		// data.add("Data Migration diagram (TODO)");
		result.put("Data", data);

		Map<String, List<EClass>> technical = new HashMap<String, List<EClass>>();
		// technical.add("Environments and Locations diagram (TODO)");
		list = new ArrayList<EClass>();
		list.add(ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent());
		list.add(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent());
		list.add(ContentfwkPackage.eINSTANCE.getPlatformService());
		technical.put("Platform Decomposition diagram",list);
		// technical.add("Processing diagram (TODO)");
		// technical.add("Networked Computing/Hardware diagram (TODO)");
		// technical.add("Communications Engineering diagram (TODO)");
		result.put("Technology", technical);
		return result;
	}

	public static Map<EClass, List<EClass>> getArchitectures() {
		return architectures;
	}

	public static Map<String, Map<String, List<EClass>>> getViewpoints() {
		return viewpoints;
	}

}
