/**
 * Copyright (c) 2011-2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Standard;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getStandardClass <em>Standard Class</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getStandardCreationDate <em>Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getLastStandardReviewDate <em>Last Standard Review Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getNextStandardReviewDate <em>Next Standard Review Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getRetireDate <em>Retire Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getOrchestratesFunctions <em>Orchestrates Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getDecomposesFunctions <em>Decomposes Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getInvolvesOrganizationUnits <em>Involves Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getOrchestratesServices <em>Orchestrates Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getDecomposesServices <em>Decomposes Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getInvolvesActors <em>Involves Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getIsGuidedByControls <em>Is Guided By Controls</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getResolvesEvents <em>Resolves Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getGeneratesEvents <em>Generates Events</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getProducesProducts <em>Produces Products</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getProcessCritiality <em>Process Critiality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#isIsAutomated <em>Is Automated</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getProcessVolumetrics <em>Process Volumetrics</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getDecomposesProcess <em>Decomposes Process</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getPrecedesProcesses <em>Precedes Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getFollowsProcesses <em>Follows Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getIsDecomposedByProcesses <em>Is Decomposed By Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessImpl extends ElementImpl implements org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process {
	/**
	 * The default value of the '{@link #getStandardClass() <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardClass()
	 * @generated
	 * @ordered
	 */
	protected static final StandardsClass STANDARD_CLASS_EDEFAULT = StandardsClass.NON_STANDARD;
	/**
	 * The default value of the '{@link #getStandardCreationDate() <em>Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STANDARD_CREATION_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLastStandardReviewDate() <em>Last Standard Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStandardReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_STANDARD_REVIEW_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNextStandardReviewDate() <em>Next Standard Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NEXT_STANDARD_REVIEW_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRetireDate() <em>Retire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetireDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RETIRE_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getProcessCritiality() <em>Process Critiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessCritiality()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_CRITIALITY_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isIsAutomated() <em>Is Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutomated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTOMATED_EDEFAULT = false;
	/**
	 * The default value of the '{@link #getProcessVolumetrics() <em>Process Volumetrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessVolumetrics()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_VOLUMETRICS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardsClass getStandardClass() {
		return (StandardsClass)eDynamicGet(ContentfwkPackage.PROCESS__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eDynamicSet(ContentfwkPackage.PROCESS__STANDARD_CLASS, ContentfwkPackage.Literals.STANDARD__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		eDynamicSet(ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE, ContentfwkPackage.Literals.STANDARD__STANDARD_CREATION_DATE, newStandardCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardReviewDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PROCESS__LAST_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_REVIEW_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardReviewDate(Date newLastStandardReviewDate) {
		eDynamicSet(ContentfwkPackage.PROCESS__LAST_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__LAST_STANDARD_REVIEW_DATE, newLastStandardReviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardReviewDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PROCESS__NEXT_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_REVIEW_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardReviewDate(Date newNextStandardReviewDate) {
		eDynamicSet(ContentfwkPackage.PROCESS__NEXT_STANDARD_REVIEW_DATE, ContentfwkPackage.Literals.STANDARD__NEXT_STANDARD_REVIEW_DATE, newNextStandardReviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return (Date)eDynamicGet(ContentfwkPackage.PROCESS__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		eDynamicSet(ContentfwkPackage.PROCESS__RETIRE_DATE, ContentfwkPackage.Literals.STANDARD__RETIRE_DATE, newRetireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getOrchestratesFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.PROCESS__ORCHESTRATES_FUNCTIONS, ContentfwkPackage.Literals.PROCESS__ORCHESTRATES_FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getDecomposesFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.PROCESS__DECOMPOSES_FUNCTIONS, ContentfwkPackage.Literals.PROCESS__DECOMPOSES_FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationUnit> getInvolvesOrganizationUnits() {
		return (EList<OrganizationUnit>)eDynamicGet(ContentfwkPackage.PROCESS__INVOLVES_ORGANIZATION_UNITS, ContentfwkPackage.Literals.PROCESS__INVOLVES_ORGANIZATION_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getOrchestratesServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES, ContentfwkPackage.Literals.PROCESS__ORCHESTRATES_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Service> getDecomposesServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES, ContentfwkPackage.Literals.PROCESS__DECOMPOSES_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getInvolvesActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.PROCESS__INVOLVES_ACTORS, ContentfwkPackage.Literals.PROCESS__INVOLVES_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Control> getIsGuidedByControls() {
		return (EList<Control>)eDynamicGet(ContentfwkPackage.PROCESS__IS_GUIDED_BY_CONTROLS, ContentfwkPackage.Literals.PROCESS__IS_GUIDED_BY_CONTROLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getResolvesEvents() {
		return (EList<Event>)eDynamicGet(ContentfwkPackage.PROCESS__RESOLVES_EVENTS, ContentfwkPackage.Literals.PROCESS__RESOLVES_EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getGeneratesEvents() {
		return (EList<Event>)eDynamicGet(ContentfwkPackage.PROCESS__GENERATES_EVENTS, ContentfwkPackage.Literals.PROCESS__GENERATES_EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Product> getProducesProducts() {
		return (EList<Product>)eDynamicGet(ContentfwkPackage.PROCESS__PRODUCES_PRODUCTS, ContentfwkPackage.Literals.PROCESS__PRODUCES_PRODUCTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessCritiality() {
		return (String)eDynamicGet(ContentfwkPackage.PROCESS__PROCESS_CRITIALITY, ContentfwkPackage.Literals.PROCESS__PROCESS_CRITIALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessCritiality(String newProcessCritiality) {
		eDynamicSet(ContentfwkPackage.PROCESS__PROCESS_CRITIALITY, ContentfwkPackage.Literals.PROCESS__PROCESS_CRITIALITY, newProcessCritiality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAutomated() {
		return (Boolean)eDynamicGet(ContentfwkPackage.PROCESS__IS_AUTOMATED, ContentfwkPackage.Literals.PROCESS__IS_AUTOMATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAutomated(boolean newIsAutomated) {
		eDynamicSet(ContentfwkPackage.PROCESS__IS_AUTOMATED, ContentfwkPackage.Literals.PROCESS__IS_AUTOMATED, newIsAutomated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessVolumetrics() {
		return (String)eDynamicGet(ContentfwkPackage.PROCESS__PROCESS_VOLUMETRICS, ContentfwkPackage.Literals.PROCESS__PROCESS_VOLUMETRICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessVolumetrics(String newProcessVolumetrics) {
		eDynamicSet(ContentfwkPackage.PROCESS__PROCESS_VOLUMETRICS, ContentfwkPackage.Literals.PROCESS__PROCESS_VOLUMETRICS, newProcessVolumetrics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process getDecomposesProcess() {
		return (org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process)eDynamicGet(ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS, ContentfwkPackage.Literals.PROCESS__DECOMPOSES_PROCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process basicGetDecomposesProcess() {
		return (org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process)eDynamicGet(ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS, ContentfwkPackage.Literals.PROCESS__DECOMPOSES_PROCESS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecomposesProcess(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process newDecomposesProcess, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDecomposesProcess, ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesProcess(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process newDecomposesProcess) {
		eDynamicSet(ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS, ContentfwkPackage.Literals.PROCESS__DECOMPOSES_PROCESS, newDecomposesProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getPrecedesProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.PROCESS__PRECEDES_PROCESSES, ContentfwkPackage.Literals.PROCESS__PRECEDES_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getFollowsProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES, ContentfwkPackage.Literals.PROCESS__FOLLOWS_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsDecomposedByProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.PROCESS__IS_DECOMPOSED_BY_PROCESSES, ContentfwkPackage.Literals.PROCESS__IS_DECOMPOSED_BY_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.PROCESS__ORCHESTRATES_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrchestratesFunctions()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__DECOMPOSES_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecomposesFunctions()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__INVOLVES_ORGANIZATION_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvolvesOrganizationUnits()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrchestratesServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecomposesServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__INVOLVES_ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInvolvesActors()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__IS_GUIDED_BY_CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsGuidedByControls()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__RESOLVES_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvesEvents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__GENERATES_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratesEvents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__PRODUCES_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducesProducts()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS:
				org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process decomposesProcess = basicGetDecomposesProcess();
				if (decomposesProcess != null)
					msgs = ((InternalEObject)decomposesProcess).eInverseRemove(this, ContentfwkPackage.PROCESS__IS_DECOMPOSED_BY_PROCESSES, org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, msgs);
				return basicSetDecomposesProcess((org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process)otherEnd, msgs);
			case ContentfwkPackage.PROCESS__PRECEDES_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrecedesProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFollowsProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__IS_DECOMPOSED_BY_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDecomposedByProcesses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfwkPackage.PROCESS__ORCHESTRATES_FUNCTIONS:
				return ((InternalEList<?>)getOrchestratesFunctions()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__DECOMPOSES_FUNCTIONS:
				return ((InternalEList<?>)getDecomposesFunctions()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__INVOLVES_ORGANIZATION_UNITS:
				return ((InternalEList<?>)getInvolvesOrganizationUnits()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES:
				return ((InternalEList<?>)getOrchestratesServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES:
				return ((InternalEList<?>)getDecomposesServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__INVOLVES_ACTORS:
				return ((InternalEList<?>)getInvolvesActors()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__IS_GUIDED_BY_CONTROLS:
				return ((InternalEList<?>)getIsGuidedByControls()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__RESOLVES_EVENTS:
				return ((InternalEList<?>)getResolvesEvents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__GENERATES_EVENTS:
				return ((InternalEList<?>)getGeneratesEvents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__PRODUCES_PRODUCTS:
				return ((InternalEList<?>)getProducesProducts()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS:
				return basicSetDecomposesProcess(null, msgs);
			case ContentfwkPackage.PROCESS__PRECEDES_PROCESSES:
				return ((InternalEList<?>)getPrecedesProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES:
				return ((InternalEList<?>)getFollowsProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__IS_DECOMPOSED_BY_PROCESSES:
				return ((InternalEList<?>)getIsDecomposedByProcesses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentfwkPackage.PROCESS__STANDARD_CLASS:
				return getStandardClass();
			case ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE:
				return getStandardCreationDate();
			case ContentfwkPackage.PROCESS__LAST_STANDARD_REVIEW_DATE:
				return getLastStandardReviewDate();
			case ContentfwkPackage.PROCESS__NEXT_STANDARD_REVIEW_DATE:
				return getNextStandardReviewDate();
			case ContentfwkPackage.PROCESS__RETIRE_DATE:
				return getRetireDate();
			case ContentfwkPackage.PROCESS__ORCHESTRATES_FUNCTIONS:
				return getOrchestratesFunctions();
			case ContentfwkPackage.PROCESS__DECOMPOSES_FUNCTIONS:
				return getDecomposesFunctions();
			case ContentfwkPackage.PROCESS__INVOLVES_ORGANIZATION_UNITS:
				return getInvolvesOrganizationUnits();
			case ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES:
				return getOrchestratesServices();
			case ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES:
				return getDecomposesServices();
			case ContentfwkPackage.PROCESS__INVOLVES_ACTORS:
				return getInvolvesActors();
			case ContentfwkPackage.PROCESS__IS_GUIDED_BY_CONTROLS:
				return getIsGuidedByControls();
			case ContentfwkPackage.PROCESS__RESOLVES_EVENTS:
				return getResolvesEvents();
			case ContentfwkPackage.PROCESS__GENERATES_EVENTS:
				return getGeneratesEvents();
			case ContentfwkPackage.PROCESS__PRODUCES_PRODUCTS:
				return getProducesProducts();
			case ContentfwkPackage.PROCESS__PROCESS_CRITIALITY:
				return getProcessCritiality();
			case ContentfwkPackage.PROCESS__IS_AUTOMATED:
				return isIsAutomated();
			case ContentfwkPackage.PROCESS__PROCESS_VOLUMETRICS:
				return getProcessVolumetrics();
			case ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS:
				if (resolve) return getDecomposesProcess();
				return basicGetDecomposesProcess();
			case ContentfwkPackage.PROCESS__PRECEDES_PROCESSES:
				return getPrecedesProcesses();
			case ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES:
				return getFollowsProcesses();
			case ContentfwkPackage.PROCESS__IS_DECOMPOSED_BY_PROCESSES:
				return getIsDecomposedByProcesses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentfwkPackage.PROCESS__STANDARD_CLASS:
				setStandardClass((StandardsClass)newValue);
				return;
			case ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE:
				setStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PROCESS__LAST_STANDARD_REVIEW_DATE:
				setLastStandardReviewDate((Date)newValue);
				return;
			case ContentfwkPackage.PROCESS__NEXT_STANDARD_REVIEW_DATE:
				setNextStandardReviewDate((Date)newValue);
				return;
			case ContentfwkPackage.PROCESS__RETIRE_DATE:
				setRetireDate((Date)newValue);
				return;
			case ContentfwkPackage.PROCESS__ORCHESTRATES_FUNCTIONS:
				getOrchestratesFunctions().clear();
				getOrchestratesFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ContentfwkPackage.PROCESS__DECOMPOSES_FUNCTIONS:
				getDecomposesFunctions().clear();
				getDecomposesFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ContentfwkPackage.PROCESS__INVOLVES_ORGANIZATION_UNITS:
				getInvolvesOrganizationUnits().clear();
				getInvolvesOrganizationUnits().addAll((Collection<? extends OrganizationUnit>)newValue);
				return;
			case ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES:
				getOrchestratesServices().clear();
				getOrchestratesServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES:
				getDecomposesServices().clear();
				getDecomposesServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.PROCESS__INVOLVES_ACTORS:
				getInvolvesActors().clear();
				getInvolvesActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.PROCESS__IS_GUIDED_BY_CONTROLS:
				getIsGuidedByControls().clear();
				getIsGuidedByControls().addAll((Collection<? extends Control>)newValue);
				return;
			case ContentfwkPackage.PROCESS__RESOLVES_EVENTS:
				getResolvesEvents().clear();
				getResolvesEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ContentfwkPackage.PROCESS__GENERATES_EVENTS:
				getGeneratesEvents().clear();
				getGeneratesEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ContentfwkPackage.PROCESS__PRODUCES_PRODUCTS:
				getProducesProducts().clear();
				getProducesProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case ContentfwkPackage.PROCESS__PROCESS_CRITIALITY:
				setProcessCritiality((String)newValue);
				return;
			case ContentfwkPackage.PROCESS__IS_AUTOMATED:
				setIsAutomated((Boolean)newValue);
				return;
			case ContentfwkPackage.PROCESS__PROCESS_VOLUMETRICS:
				setProcessVolumetrics((String)newValue);
				return;
			case ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS:
				setDecomposesProcess((org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process)newValue);
				return;
			case ContentfwkPackage.PROCESS__PRECEDES_PROCESSES:
				getPrecedesProcesses().clear();
				getPrecedesProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES:
				getFollowsProcesses().clear();
				getFollowsProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.PROCESS__IS_DECOMPOSED_BY_PROCESSES:
				getIsDecomposedByProcesses().clear();
				getIsDecomposedByProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContentfwkPackage.PROCESS__STANDARD_CLASS:
				setStandardClass(STANDARD_CLASS_EDEFAULT);
				return;
			case ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE:
				setStandardCreationDate(STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PROCESS__LAST_STANDARD_REVIEW_DATE:
				setLastStandardReviewDate(LAST_STANDARD_REVIEW_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PROCESS__NEXT_STANDARD_REVIEW_DATE:
				setNextStandardReviewDate(NEXT_STANDARD_REVIEW_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PROCESS__RETIRE_DATE:
				setRetireDate(RETIRE_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PROCESS__ORCHESTRATES_FUNCTIONS:
				getOrchestratesFunctions().clear();
				return;
			case ContentfwkPackage.PROCESS__DECOMPOSES_FUNCTIONS:
				getDecomposesFunctions().clear();
				return;
			case ContentfwkPackage.PROCESS__INVOLVES_ORGANIZATION_UNITS:
				getInvolvesOrganizationUnits().clear();
				return;
			case ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES:
				getOrchestratesServices().clear();
				return;
			case ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES:
				getDecomposesServices().clear();
				return;
			case ContentfwkPackage.PROCESS__INVOLVES_ACTORS:
				getInvolvesActors().clear();
				return;
			case ContentfwkPackage.PROCESS__IS_GUIDED_BY_CONTROLS:
				getIsGuidedByControls().clear();
				return;
			case ContentfwkPackage.PROCESS__RESOLVES_EVENTS:
				getResolvesEvents().clear();
				return;
			case ContentfwkPackage.PROCESS__GENERATES_EVENTS:
				getGeneratesEvents().clear();
				return;
			case ContentfwkPackage.PROCESS__PRODUCES_PRODUCTS:
				getProducesProducts().clear();
				return;
			case ContentfwkPackage.PROCESS__PROCESS_CRITIALITY:
				setProcessCritiality(PROCESS_CRITIALITY_EDEFAULT);
				return;
			case ContentfwkPackage.PROCESS__IS_AUTOMATED:
				setIsAutomated(IS_AUTOMATED_EDEFAULT);
				return;
			case ContentfwkPackage.PROCESS__PROCESS_VOLUMETRICS:
				setProcessVolumetrics(PROCESS_VOLUMETRICS_EDEFAULT);
				return;
			case ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS:
				setDecomposesProcess((org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process)null);
				return;
			case ContentfwkPackage.PROCESS__PRECEDES_PROCESSES:
				getPrecedesProcesses().clear();
				return;
			case ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES:
				getFollowsProcesses().clear();
				return;
			case ContentfwkPackage.PROCESS__IS_DECOMPOSED_BY_PROCESSES:
				getIsDecomposedByProcesses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContentfwkPackage.PROCESS__STANDARD_CLASS:
				return getStandardClass() != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? getStandardCreationDate() != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(getStandardCreationDate());
			case ContentfwkPackage.PROCESS__LAST_STANDARD_REVIEW_DATE:
				return LAST_STANDARD_REVIEW_DATE_EDEFAULT == null ? getLastStandardReviewDate() != null : !LAST_STANDARD_REVIEW_DATE_EDEFAULT.equals(getLastStandardReviewDate());
			case ContentfwkPackage.PROCESS__NEXT_STANDARD_REVIEW_DATE:
				return NEXT_STANDARD_REVIEW_DATE_EDEFAULT == null ? getNextStandardReviewDate() != null : !NEXT_STANDARD_REVIEW_DATE_EDEFAULT.equals(getNextStandardReviewDate());
			case ContentfwkPackage.PROCESS__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? getRetireDate() != null : !RETIRE_DATE_EDEFAULT.equals(getRetireDate());
			case ContentfwkPackage.PROCESS__ORCHESTRATES_FUNCTIONS:
				return !getOrchestratesFunctions().isEmpty();
			case ContentfwkPackage.PROCESS__DECOMPOSES_FUNCTIONS:
				return !getDecomposesFunctions().isEmpty();
			case ContentfwkPackage.PROCESS__INVOLVES_ORGANIZATION_UNITS:
				return !getInvolvesOrganizationUnits().isEmpty();
			case ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES:
				return !getOrchestratesServices().isEmpty();
			case ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES:
				return !getDecomposesServices().isEmpty();
			case ContentfwkPackage.PROCESS__INVOLVES_ACTORS:
				return !getInvolvesActors().isEmpty();
			case ContentfwkPackage.PROCESS__IS_GUIDED_BY_CONTROLS:
				return !getIsGuidedByControls().isEmpty();
			case ContentfwkPackage.PROCESS__RESOLVES_EVENTS:
				return !getResolvesEvents().isEmpty();
			case ContentfwkPackage.PROCESS__GENERATES_EVENTS:
				return !getGeneratesEvents().isEmpty();
			case ContentfwkPackage.PROCESS__PRODUCES_PRODUCTS:
				return !getProducesProducts().isEmpty();
			case ContentfwkPackage.PROCESS__PROCESS_CRITIALITY:
				return PROCESS_CRITIALITY_EDEFAULT == null ? getProcessCritiality() != null : !PROCESS_CRITIALITY_EDEFAULT.equals(getProcessCritiality());
			case ContentfwkPackage.PROCESS__IS_AUTOMATED:
				return isIsAutomated() != IS_AUTOMATED_EDEFAULT;
			case ContentfwkPackage.PROCESS__PROCESS_VOLUMETRICS:
				return PROCESS_VOLUMETRICS_EDEFAULT == null ? getProcessVolumetrics() != null : !PROCESS_VOLUMETRICS_EDEFAULT.equals(getProcessVolumetrics());
			case ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS:
				return basicGetDecomposesProcess() != null;
			case ContentfwkPackage.PROCESS__PRECEDES_PROCESSES:
				return !getPrecedesProcesses().isEmpty();
			case ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES:
				return !getFollowsProcesses().isEmpty();
			case ContentfwkPackage.PROCESS__IS_DECOMPOSED_BY_PROCESSES:
				return !getIsDecomposedByProcesses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Standard.class) {
			switch (derivedFeatureID) {
				case ContentfwkPackage.PROCESS__STANDARD_CLASS: return ContentfwkPackage.STANDARD__STANDARD_CLASS;
				case ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE;
				case ContentfwkPackage.PROCESS__LAST_STANDARD_REVIEW_DATE: return ContentfwkPackage.STANDARD__LAST_STANDARD_REVIEW_DATE;
				case ContentfwkPackage.PROCESS__NEXT_STANDARD_REVIEW_DATE: return ContentfwkPackage.STANDARD__NEXT_STANDARD_REVIEW_DATE;
				case ContentfwkPackage.PROCESS__RETIRE_DATE: return ContentfwkPackage.STANDARD__RETIRE_DATE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Standard.class) {
			switch (baseFeatureID) {
				case ContentfwkPackage.STANDARD__STANDARD_CLASS: return ContentfwkPackage.PROCESS__STANDARD_CLASS;
				case ContentfwkPackage.STANDARD__STANDARD_CREATION_DATE: return ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__LAST_STANDARD_REVIEW_DATE: return ContentfwkPackage.PROCESS__LAST_STANDARD_REVIEW_DATE;
				case ContentfwkPackage.STANDARD__NEXT_STANDARD_REVIEW_DATE: return ContentfwkPackage.PROCESS__NEXT_STANDARD_REVIEW_DATE;
				case ContentfwkPackage.STANDARD__RETIRE_DATE: return ContentfwkPackage.PROCESS__RETIRE_DATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProcessImpl
