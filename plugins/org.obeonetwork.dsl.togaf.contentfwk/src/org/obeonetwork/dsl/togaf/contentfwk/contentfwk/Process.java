/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A process is a flow of interactions between functions and services and cannot be physically deployed. All processes should describe the flow of execution for a function and therefore the deployment of a process is through the function it supports; i.e., an application implements a function that has a process, not an application implements a process.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getOrchestratesFunctions <em>Orchestrates Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesFunctions <em>Decomposes Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getInvolvesOrganizationUnits <em>Involves Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getOrchestratesServices <em>Orchestrates Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesServices <em>Decomposes Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getInvolvesActors <em>Involves Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getIsGuidedByControls <em>Is Guided By Controls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getResolvesEvents <em>Resolves Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getGeneratesEvents <em>Generates Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProducesProducts <em>Produces Products</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProcessCritiality <em>Process Critiality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#isIsAutomated <em>Is Automated</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProcessVolumetrics <em>Process Volumetrics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesProcess <em>Decomposes Process</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getPrecedesProcesses <em>Precedes Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getFollowsProcesses <em>Follows Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Element, Standard {
	/**
	 * Returns the value of the '<em><b>Orchestrates Functions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsRealizedByProcesses <em>Is Realized By Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orchestrates Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orchestrates Functions</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_OrchestratesFunctions()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getIsRealizedByProcesses
	 * @model opposite="isRealizedByProcesses"
	 * @generated
	 */
	EList<Function> getOrchestratesFunctions();

	/**
	 * Returns the value of the '<em><b>Decomposes Functions</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getSupportsProcesses <em>Supports Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Functions</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_DecomposesFunctions()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function#getSupportsProcesses
	 * @model opposite="supportsProcesses"
	 * @generated
	 */
	EList<Function> getDecomposesFunctions();

	/**
	 * Returns the value of the '<em><b>Involves Organization Units</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getParticipatesInProcesses <em>Participates In Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involves Organization Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involves Organization Units</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_InvolvesOrganizationUnits()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getParticipatesInProcesses
	 * @model opposite="participatesInProcesses"
	 * @generated
	 */
	EList<OrganizationUnit> getInvolvesOrganizationUnits();

	/**
	 * Returns the value of the '<em><b>Orchestrates Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsRealizedByProcesses <em>Is Realized By Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orchestrates Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orchestrates Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_OrchestratesServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getIsRealizedByProcesses
	 * @model opposite="isRealizedByProcesses"
	 * @generated
	 */
	EList<Service> getOrchestratesServices();

	/**
	 * Returns the value of the '<em><b>Decomposes Services</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getSupportsProcesses <em>Supports Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Services</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_DecomposesServices()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service#getSupportsProcesses
	 * @model opposite="supportsProcesses"
	 * @generated
	 */
	EList<Service> getDecomposesServices();

	/**
	 * Returns the value of the '<em><b>Involves Actors</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getParticipatesInProcesses <em>Participates In Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involves Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involves Actors</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_InvolvesActors()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor#getParticipatesInProcesses
	 * @model opposite="participatesInProcesses"
	 * @generated
	 */
	EList<Actor> getInvolvesActors();

	/**
	 * Returns the value of the '<em><b>Is Guided By Controls</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control#getEnsuresCorrectOperationOfProcesses <em>Ensures Correct Operation Of Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Guided By Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Guided By Controls</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_IsGuidedByControls()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control#getEnsuresCorrectOperationOfProcesses
	 * @model opposite="ensuresCorrectOperationOfProcesses"
	 * @generated
	 */
	EList<Control> getIsGuidedByControls();

	/**
	 * Returns the value of the '<em><b>Resolves Events</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByProcesses <em>Is Resolved By Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolves Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolves Events</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_ResolvesEvents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsResolvedByProcesses
	 * @model opposite="isResolvedByProcesses"
	 * @generated
	 */
	EList<Event> getResolvesEvents();

	/**
	 * Returns the value of the '<em><b>Generates Events</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsGeneratedByProcesses <em>Is Generated By Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generates Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generates Events</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_GeneratesEvents()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event#getIsGeneratedByProcesses
	 * @model opposite="isGeneratedByProcesses" ordered="false"
	 * @generated
	 */
	EList<Event> getGeneratesEvents();

	/**
	 * Returns the value of the '<em><b>Produces Products</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product#getIsProducedByProcesses <em>Is Produced By Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces Products</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_ProducesProducts()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product#getIsProducedByProcesses
	 * @model opposite="isProducedByProcesses"
	 * @generated
	 */
	EList<Product> getProducesProducts();

	/**
	 * Returns the value of the '<em><b>Process Critiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Critiality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Critiality</em>' attribute.
	 * @see #setProcessCritiality(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_ProcessCritiality()
	 * @model
	 * @generated
	 */
	String getProcessCritiality();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProcessCritiality <em>Process Critiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Critiality</em>' attribute.
	 * @see #getProcessCritiality()
	 * @generated
	 */
	void setProcessCritiality(String value);

	/**
	 * Returns the value of the '<em><b>Is Automated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Automated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Automated</em>' attribute.
	 * @see #setIsAutomated(boolean)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_IsAutomated()
	 * @model
	 * @generated
	 */
	boolean isIsAutomated();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#isIsAutomated <em>Is Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Automated</em>' attribute.
	 * @see #isIsAutomated()
	 * @generated
	 */
	void setIsAutomated(boolean value);

	/**
	 * Returns the value of the '<em><b>Process Volumetrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Volumetrics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Volumetrics</em>' attribute.
	 * @see #setProcessVolumetrics(String)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_ProcessVolumetrics()
	 * @model
	 * @generated
	 */
	String getProcessVolumetrics();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProcessVolumetrics <em>Process Volumetrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Volumetrics</em>' attribute.
	 * @see #getProcessVolumetrics()
	 * @generated
	 */
	void setProcessVolumetrics(String value);

	/**
	 * Returns the value of the '<em><b>Decomposes Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes Process</em>' reference.
	 * @see #setDecomposesProcess(Process)
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_DecomposesProcess()
	 * @model
	 * @generated
	 */
	Process getDecomposesProcess();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getDecomposesProcess <em>Decomposes Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes Process</em>' reference.
	 * @see #getDecomposesProcess()
	 * @generated
	 */
	void setDecomposesProcess(Process value);

	/**
	 * Returns the value of the '<em><b>Precedes Processes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getFollowsProcesses <em>Follows Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedes Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedes Processes</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_PrecedesProcesses()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getFollowsProcesses
	 * @model opposite="followsProcesses"
	 * @generated
	 */
	EList<Process> getPrecedesProcesses();

	/**
	 * Returns the value of the '<em><b>Follows Processes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getPrecedesProcesses <em>Precedes Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Follows Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follows Processes</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProcess_FollowsProcesses()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getPrecedesProcesses
	 * @model opposite="precedesProcesses"
	 * @generated
	 */
	EList<Process> getFollowsProcesses();

} // Process
