/*******************************************************************************
 * Copyright (c) 2010-2011 Obeo. All Rights Reserved.
 *
 * This file is part of Obeo Knowledge.
 *
 * This software and the attached documentation are the exclusive ownership
 * of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights
 * of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1 L123-12)"
 * By installing this software, you acknowledge being aware of this rights and
 * accept them, and as a consequence you must:
 * - be in possession of a valid license of use conceded by Obeo only.
 * - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries
 * or the authors of this software
 *
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 *
 * Acceleo and Obeo are trademarks owned by Obeo.
 *
 *******************************************************************************/
package org.obeonetwork.dsl.togaf.design.businessServiceInformation.tests;

import fr.obeo.dsl.viewpoint.DDiagram;
import fr.obeo.dsl.viewpoint.DDiagramElement;
import fr.obeo.dsl.viewpoint.EdgeTarget;
import fr.obeo.dsl.viewpoint.tests.support.api.ViewpointDiagramTestCase;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;
import org.obeonetwork.dsl.togaf.design.tests.TOGAFModeler;

public class BusinessServiceInformationDiagramToolsTest extends ViewpointDiagramTestCase implements TOGAFModeler {

	private DDiagram diagram;

	protected void setUp() throws Exception {
		super.setUp();
		genericSetUp(SEMANTIC_MODEL_PATH, MODELER_PATH + "/togaf.odesign");
		initViewpoint(BUSINESS_VP);
		diagram = (DDiagram)getRepresentations(BUSINESS_SERVICE_INFORMATION_D).toArray()[0];
		// EnterpriseArchitecture ea = (EnterpriseArchitecture)semanticModel;
		// ea.getArchitectures().add(ContentfwkFactory.eINSTANCE.createBusinessArchitecture());
	}

	public void testCreateBusinessService() {
		EnterpriseArchitecture ea = (EnterpriseArchitecture)semanticModel;
		BusinessArchitecture ba = (BusinessArchitecture)ea.getArchitectures().get(1);
		assertTrue(applyNodeCreationTool("Business Service", diagram, diagram));
		assertTrue("The Business Service element was not created", ba.getServices().size() > 0);
	}

	public void testEditBusinessServiceNameEdit() {
		EnterpriseArchitecture ea = (EnterpriseArchitecture)semanticModel;
		BusinessArchitecture ba = (BusinessArchitecture)ea.getArchitectures().get(1);
		assertTrue(applyNodeCreationTool("Business Service", diagram, diagram));
		assertTrue("The Business Service element was not created", ba.getServices().size() > 0);
		BusinessService service = ba.getServices().get(0);
		DDiagramElement ddElt = getFirstDiagramElement(diagram, service);
		assertTrue(ddElt != null);
		applyDirectEditTool("EditName", diagram, ddElt, "test");
		assertEquals("The BusinessService has not the right name", "test", service.getName());
	}

	public void testCreateDataEntity() {
		EnterpriseArchitecture ea = (EnterpriseArchitecture)semanticModel;
		DataArchitecture da = (DataArchitecture)ea.getArchitectures().get(2);
		assertTrue(applyNodeCreationTool("Data Entity", diagram, diagram));
		assertTrue("The Business Service element was not created", da.getEntities().size() > 0);
	}

	public void testDataEntityNameEdit() {
		EnterpriseArchitecture ea = (EnterpriseArchitecture)semanticModel;
		DataArchitecture da = (DataArchitecture)ea.getArchitectures().get(2);
		assertTrue(applyNodeCreationTool("Data Entity", diagram, diagram));
		assertTrue("The Data Entity element was not created", da.getEntities().size() > 0);
		DataEntity entity = da.getEntities().get(0);
		assertTrue(applyDirectEditTool("EditName", diagram, getFirstDiagramElement(diagram, entity), "test"));
		assertEquals("The Data Entity has not the right name", "test", entity.getName());
	}

	public void testCreateEdgeConsummeDataEntity() {
		EnterpriseArchitecture ea = (EnterpriseArchitecture)semanticModel;
		BusinessArchitecture ba = (BusinessArchitecture)ea.getArchitectures().get(1);
		DataArchitecture da = (DataArchitecture)ea.getArchitectures().get(2);
		assertTrue("The semantic model is not empty before the tool application", ba.getServices().isEmpty());
		assertTrue("The semantic model is not empty before the tool application", da.getEntities().isEmpty());
		assertTrue(applyNodeCreationTool("Business Service", diagram, diagram));
		assertTrue(applyNodeCreationTool("Data Entity", diagram, diagram));
		BusinessService source = ba.getServices().get(0);
		DataEntity target = da.getEntities().get(0);
		applyEdgeCreationTool("Consumes Data Entity", diagram, (EdgeTarget)getFirstDiagramElement(diagram,
				source), (EdgeTarget)getFirstDiagramElement(diagram, target));
		assertTrue("The consumeEntities reference isn't correctly set.", source.getConsumesEntities()
				.contains(target));

	}

	public void testCreateEdgeProvidesDataEntity() {
		EnterpriseArchitecture ea = (EnterpriseArchitecture)semanticModel;
		BusinessArchitecture ba = (BusinessArchitecture)ea.getArchitectures().get(1);
		DataArchitecture da = (DataArchitecture)ea.getArchitectures().get(2);
		assertTrue("The semantic model is not empty before the tool application", ba.getServices().isEmpty());
		assertTrue("The semantic model is not empty before the tool application", da.getEntities().isEmpty());
		assertTrue(applyNodeCreationTool("Business Service", diagram, diagram));
		assertTrue(applyNodeCreationTool("Data Entity", diagram, diagram));
		BusinessService source = ba.getServices().get(0);
		DataEntity target = da.getEntities().get(0);
		applyEdgeCreationTool("Provides Data Entity", diagram, (EdgeTarget)getFirstDiagramElement(diagram,
				source), (EdgeTarget)getFirstDiagramElement(diagram, target));
		assertTrue("The consumeEntities reference isn't correctly set.", source.getProvidesEntities()
				.contains(target));

	}

	public void testCreateEdgeConsummesService() {
		EnterpriseArchitecture ea = (EnterpriseArchitecture)semanticModel;
		BusinessArchitecture ba = (BusinessArchitecture)ea.getArchitectures().get(1);
		assertTrue("The semantic model is not empty before the tool application", ba.getServices().isEmpty());
		assertTrue(applyNodeCreationTool("Business Service", diagram, diagram));
		assertTrue(applyNodeCreationTool("Business Service", diagram, diagram));
		BusinessService source = ba.getServices().get(0);
		BusinessService target = ba.getServices().get(1);
		applyEdgeCreationTool("Consumes Service", diagram,
				(EdgeTarget)getFirstDiagramElement(diagram, source), (EdgeTarget)getFirstDiagramElement(
						diagram, target));
		assertTrue("The consumeEntities reference isn't correctly set.", source.getConsumesServices()
				.contains(target));
	}
}
