package org.obeonetwork.dsl.togaf.design.tests;

public interface TOGAFModeler {

	/**
	 * The root path where the .odesign files used for the tests are stored.
	 */
	String MODELER_PATH = "/" + org.obeonetwork.dsl.togaf.design.Activator.PLUGIN_ID + "/description";

	String SEMANTIC_PATH = "/model/";

	/**
	 * The path of the semantic model used for the test.
	 */
	String SEMANTIC_MODEL_FILENAME = "test.togaf";

	String RESOURCE_MODEL_FILENAME = "test.aird";

	String SEMANTIC_MODEL_PATH = "/" + Activator.PLUGIN_ID + SEMANTIC_PATH + SEMANTIC_MODEL_FILENAME;

	String RESOURCE_MODEL_PATH = "/" + Activator.PLUGIN_ID + SEMANTIC_PATH + RESOURCE_MODEL_FILENAME;

	/*
	 * View point names.
	 */

	String ARCHITECTURE_VP = "architecture";

	String BUSINESS_VP = "business";

	String DATA_VP = "data";

	String APPLICATION_VP = "application";

	String TECHNOLOGY_VP = "technology";

	/*
	 * Diagram names
	 */
	String VALUE_CHAIN_D = "ValueChain";

	String GOAL_OBJECTIVE_SERVICE_D = "Goal/Objective/Service Diagram";

	String BUSINESS_SERVICE_INFORMATION_D = "Business Service / Information Diagram";

}
