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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getLastStandardCreationDate <em>Last Standard Creation Date</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getNextStandardCreationDate <em>Next Standard Creation Date</em>}</li>
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
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.ProcessImpl#getAny <em>Any</em>}</li>
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
	 * The cached value of the '{@link #getStandardClass() <em>Standard Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardClass()
	 * @generated
	 * @ordered
	 */
	protected StandardsClass standardClass = STANDARD_CLASS_EDEFAULT;

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
	 * The cached value of the '{@link #getStandardCreationDate() <em>Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date standardCreationDate = STANDARD_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastStandardCreationDate() <em>Last Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_STANDARD_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastStandardCreationDate() <em>Last Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastStandardCreationDate = LAST_STANDARD_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextStandardCreationDate() <em>Next Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NEXT_STANDARD_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextStandardCreationDate() <em>Next Standard Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStandardCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date nextStandardCreationDate = NEXT_STANDARD_CREATION_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getRetireDate() <em>Retire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetireDate()
	 * @generated
	 * @ordered
	 */
	protected Date retireDate = RETIRE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrchestratesFunctions() <em>Orchestrates Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrchestratesFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> orchestratesFunctions;

	/**
	 * The cached value of the '{@link #getDecomposesFunctions() <em>Decomposes Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> decomposesFunctions;

	/**
	 * The cached value of the '{@link #getInvolvesOrganizationUnits() <em>Involves Organization Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvesOrganizationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationUnit> involvesOrganizationUnits;

	/**
	 * The cached value of the '{@link #getOrchestratesServices() <em>Orchestrates Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrchestratesServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> orchestratesServices;

	/**
	 * The cached value of the '{@link #getDecomposesServices() <em>Decomposes Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> decomposesServices;

	/**
	 * The cached value of the '{@link #getInvolvesActors() <em>Involves Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvesActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> involvesActors;

	/**
	 * The cached value of the '{@link #getIsGuidedByControls() <em>Is Guided By Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGuidedByControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> isGuidedByControls;

	/**
	 * The cached value of the '{@link #getResolvesEvents() <em>Resolves Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvesEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> resolvesEvents;

	/**
	 * The cached value of the '{@link #getGeneratesEvents() <em>Generates Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratesEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> generatesEvents;

	/**
	 * The cached value of the '{@link #getProducesProducts() <em>Produces Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducesProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> producesProducts;

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
	 * The cached value of the '{@link #getProcessCritiality() <em>Process Critiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessCritiality()
	 * @generated
	 * @ordered
	 */
	protected String processCritiality = PROCESS_CRITIALITY_EDEFAULT;

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
	 * The cached value of the '{@link #isIsAutomated() <em>Is Automated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutomated()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutomated = IS_AUTOMATED_EDEFAULT;

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
	 * The cached value of the '{@link #getProcessVolumetrics() <em>Process Volumetrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessVolumetrics()
	 * @generated
	 * @ordered
	 */
	protected String processVolumetrics = PROCESS_VOLUMETRICS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecomposesProcess() <em>Decomposes Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesProcess()
	 * @generated
	 * @ordered
	 */
	protected org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process decomposesProcess;

	/**
	 * The cached value of the '{@link #getPrecedesProcesses() <em>Precedes Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedesProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> precedesProcesses;

	/**
	 * The cached value of the '{@link #getFollowsProcesses() <em>Follows Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowsProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> followsProcesses;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected EObject any;

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
		return standardClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		StandardsClass oldStandardClass = standardClass;
		standardClass = newStandardClass == null ? STANDARD_CLASS_EDEFAULT : newStandardClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__STANDARD_CLASS, oldStandardClass, standardClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStandardCreationDate() {
		return standardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardCreationDate(Date newStandardCreationDate) {
		Date oldStandardCreationDate = standardCreationDate;
		standardCreationDate = newStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE, oldStandardCreationDate, standardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastStandardCreationDate() {
		return lastStandardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastStandardCreationDate(Date newLastStandardCreationDate) {
		Date oldLastStandardCreationDate = lastStandardCreationDate;
		lastStandardCreationDate = newLastStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__LAST_STANDARD_CREATION_DATE, oldLastStandardCreationDate, lastStandardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNextStandardCreationDate() {
		return nextStandardCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStandardCreationDate(Date newNextStandardCreationDate) {
		Date oldNextStandardCreationDate = nextStandardCreationDate;
		nextStandardCreationDate = newNextStandardCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__NEXT_STANDARD_CREATION_DATE, oldNextStandardCreationDate, nextStandardCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRetireDate() {
		return retireDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetireDate(Date newRetireDate) {
		Date oldRetireDate = retireDate;
		retireDate = newRetireDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__RETIRE_DATE, oldRetireDate, retireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getOrchestratesFunctions() {
		if (orchestratesFunctions == null) {
			orchestratesFunctions = new EObjectWithInverseResolvingEList.ManyInverse<Function>(Function.class, this, ContentfwkPackage.PROCESS__ORCHESTRATES_FUNCTIONS, ContentfwkPackage.FUNCTION__IS_REALIZED_BY_PROCESSES);
		}
		return orchestratesFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getDecomposesFunctions() {
		if (decomposesFunctions == null) {
			decomposesFunctions = new EObjectWithInverseResolvingEList.ManyInverse<Function>(Function.class, this, ContentfwkPackage.PROCESS__DECOMPOSES_FUNCTIONS, ContentfwkPackage.FUNCTION__SUPPORTS_PROCESSES);
		}
		return decomposesFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationUnit> getInvolvesOrganizationUnits() {
		if (involvesOrganizationUnits == null) {
			involvesOrganizationUnits = new EObjectWithInverseResolvingEList.ManyInverse<OrganizationUnit>(OrganizationUnit.class, this, ContentfwkPackage.PROCESS__INVOLVES_ORGANIZATION_UNITS, ContentfwkPackage.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES);
		}
		return involvesOrganizationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getOrchestratesServices() {
		if (orchestratesServices == null) {
			orchestratesServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES, ContentfwkPackage.SERVICE__IS_REALIZED_BY_PROCESSES);
		}
		return orchestratesServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getDecomposesServices() {
		if (decomposesServices == null) {
			decomposesServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES, ContentfwkPackage.SERVICE__SUPPORTS_PROCESSES);
		}
		return decomposesServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getInvolvesActors() {
		if (involvesActors == null) {
			involvesActors = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, ContentfwkPackage.PROCESS__INVOLVES_ACTORS, ContentfwkPackage.ACTOR__PARTICIPATES_IN_PROCESSES);
		}
		return involvesActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getIsGuidedByControls() {
		if (isGuidedByControls == null) {
			isGuidedByControls = new EObjectWithInverseResolvingEList.ManyInverse<Control>(Control.class, this, ContentfwkPackage.PROCESS__IS_GUIDED_BY_CONTROLS, ContentfwkPackage.CONTROL__ENSURES_CORRECT_OPERATION_OF_PROCESSES);
		}
		return isGuidedByControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getResolvesEvents() {
		if (resolvesEvents == null) {
			resolvesEvents = new EObjectWithInverseResolvingEList.ManyInverse<Event>(Event.class, this, ContentfwkPackage.PROCESS__RESOLVES_EVENTS, ContentfwkPackage.EVENT__IS_RESOLVED_BY_PROCESSES);
		}
		return resolvesEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getGeneratesEvents() {
		if (generatesEvents == null) {
			generatesEvents = new EObjectWithInverseResolvingEList.ManyInverse<Event>(Event.class, this, ContentfwkPackage.PROCESS__GENERATES_EVENTS, ContentfwkPackage.EVENT__IS_GENERATED_BY_PROCESSES);
		}
		return generatesEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducesProducts() {
		if (producesProducts == null) {
			producesProducts = new EObjectWithInverseResolvingEList.ManyInverse<Product>(Product.class, this, ContentfwkPackage.PROCESS__PRODUCES_PRODUCTS, ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_PROCESSES);
		}
		return producesProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessCritiality() {
		return processCritiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessCritiality(String newProcessCritiality) {
		String oldProcessCritiality = processCritiality;
		processCritiality = newProcessCritiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__PROCESS_CRITIALITY, oldProcessCritiality, processCritiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAutomated() {
		return isAutomated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAutomated(boolean newIsAutomated) {
		boolean oldIsAutomated = isAutomated;
		isAutomated = newIsAutomated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__IS_AUTOMATED, oldIsAutomated, isAutomated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessVolumetrics() {
		return processVolumetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessVolumetrics(String newProcessVolumetrics) {
		String oldProcessVolumetrics = processVolumetrics;
		processVolumetrics = newProcessVolumetrics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__PROCESS_VOLUMETRICS, oldProcessVolumetrics, processVolumetrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process getDecomposesProcess() {
		if (decomposesProcess != null && decomposesProcess.eIsProxy()) {
			InternalEObject oldDecomposesProcess = (InternalEObject)decomposesProcess;
			decomposesProcess = (org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process)eResolveProxy(oldDecomposesProcess);
			if (decomposesProcess != oldDecomposesProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS, oldDecomposesProcess, decomposesProcess));
			}
		}
		return decomposesProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process basicGetDecomposesProcess() {
		return decomposesProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesProcess(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process newDecomposesProcess) {
		org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process oldDecomposesProcess = decomposesProcess;
		decomposesProcess = newDecomposesProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS, oldDecomposesProcess, decomposesProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getPrecedesProcesses() {
		if (precedesProcesses == null) {
			precedesProcesses = new EObjectWithInverseResolvingEList.ManyInverse<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.PROCESS__PRECEDES_PROCESSES, ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES);
		}
		return precedesProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getFollowsProcesses() {
		if (followsProcesses == null) {
			followsProcesses = new EObjectWithInverseResolvingEList.ManyInverse<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES, ContentfwkPackage.PROCESS__PRECEDES_PROCESSES);
		}
		return followsProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAny() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAny(EObject newAny, NotificationChain msgs) {
		EObject oldAny = any;
		any = newAny;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__ANY, oldAny, newAny);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(EObject newAny) {
		if (newAny != any) {
			NotificationChain msgs = null;
			if (any != null)
				msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContentfwkPackage.PROCESS__ANY, null, msgs);
			if (newAny != null)
				msgs = ((InternalEObject)newAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContentfwkPackage.PROCESS__ANY, null, msgs);
			msgs = basicSetAny(newAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.PROCESS__ANY, newAny, newAny));
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
			case ContentfwkPackage.PROCESS__PRECEDES_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrecedesProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFollowsProcesses()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.PROCESS__PRECEDES_PROCESSES:
				return ((InternalEList<?>)getPrecedesProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES:
				return ((InternalEList<?>)getFollowsProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.PROCESS__ANY:
				return basicSetAny(null, msgs);
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
			case ContentfwkPackage.PROCESS__LAST_STANDARD_CREATION_DATE:
				return getLastStandardCreationDate();
			case ContentfwkPackage.PROCESS__NEXT_STANDARD_CREATION_DATE:
				return getNextStandardCreationDate();
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
			case ContentfwkPackage.PROCESS__ANY:
				return getAny();
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
			case ContentfwkPackage.PROCESS__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate((Date)newValue);
				return;
			case ContentfwkPackage.PROCESS__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate((Date)newValue);
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
			case ContentfwkPackage.PROCESS__ANY:
				setAny((EObject)newValue);
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
			case ContentfwkPackage.PROCESS__LAST_STANDARD_CREATION_DATE:
				setLastStandardCreationDate(LAST_STANDARD_CREATION_DATE_EDEFAULT);
				return;
			case ContentfwkPackage.PROCESS__NEXT_STANDARD_CREATION_DATE:
				setNextStandardCreationDate(NEXT_STANDARD_CREATION_DATE_EDEFAULT);
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
			case ContentfwkPackage.PROCESS__ANY:
				setAny((EObject)null);
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
				return standardClass != STANDARD_CLASS_EDEFAULT;
			case ContentfwkPackage.PROCESS__STANDARD_CREATION_DATE:
				return STANDARD_CREATION_DATE_EDEFAULT == null ? standardCreationDate != null : !STANDARD_CREATION_DATE_EDEFAULT.equals(standardCreationDate);
			case ContentfwkPackage.PROCESS__LAST_STANDARD_CREATION_DATE:
				return LAST_STANDARD_CREATION_DATE_EDEFAULT == null ? lastStandardCreationDate != null : !LAST_STANDARD_CREATION_DATE_EDEFAULT.equals(lastStandardCreationDate);
			case ContentfwkPackage.PROCESS__NEXT_STANDARD_CREATION_DATE:
				return NEXT_STANDARD_CREATION_DATE_EDEFAULT == null ? nextStandardCreationDate != null : !NEXT_STANDARD_CREATION_DATE_EDEFAULT.equals(nextStandardCreationDate);
			case ContentfwkPackage.PROCESS__RETIRE_DATE:
				return RETIRE_DATE_EDEFAULT == null ? retireDate != null : !RETIRE_DATE_EDEFAULT.equals(retireDate);
			case ContentfwkPackage.PROCESS__ORCHESTRATES_FUNCTIONS:
				return orchestratesFunctions != null && !orchestratesFunctions.isEmpty();
			case ContentfwkPackage.PROCESS__DECOMPOSES_FUNCTIONS:
				return decomposesFunctions != null && !decomposesFunctions.isEmpty();
			case ContentfwkPackage.PROCESS__INVOLVES_ORGANIZATION_UNITS:
				return involvesOrganizationUnits != null && !involvesOrganizationUnits.isEmpty();
			case ContentfwkPackage.PROCESS__ORCHESTRATES_SERVICES:
				return orchestratesServices != null && !orchestratesServices.isEmpty();
			case ContentfwkPackage.PROCESS__DECOMPOSES_SERVICES:
				return decomposesServices != null && !decomposesServices.isEmpty();
			case ContentfwkPackage.PROCESS__INVOLVES_ACTORS:
				return involvesActors != null && !involvesActors.isEmpty();
			case ContentfwkPackage.PROCESS__IS_GUIDED_BY_CONTROLS:
				return isGuidedByControls != null && !isGuidedByControls.isEmpty();
			case ContentfwkPackage.PROCESS__RESOLVES_EVENTS:
				return resolvesEvents != null && !resolvesEvents.isEmpty();
			case ContentfwkPackage.PROCESS__GENERATES_EVENTS:
				return generatesEvents != null && !generatesEvents.isEmpty();
			case ContentfwkPackage.PROCESS__PRODUCES_PRODUCTS:
				return producesProducts != null && !producesProducts.isEmpty();
			case ContentfwkPackage.PROCESS__PROCESS_CRITIALITY:
				return PROCESS_CRITIALITY_EDEFAULT == null ? processCritiality != null : !PROCESS_CRITIALITY_EDEFAULT.equals(processCritiality);
			case ContentfwkPackage.PROCESS__IS_AUTOMATED:
				return isAutomated != IS_AUTOMATED_EDEFAULT;
			case ContentfwkPackage.PROCESS__PROCESS_VOLUMETRICS:
				return PROCESS_VOLUMETRICS_EDEFAULT == null ? processVolumetrics != null : !PROCESS_VOLUMETRICS_EDEFAULT.equals(processVolumetrics);
			case ContentfwkPackage.PROCESS__DECOMPOSES_PROCESS:
				return decomposesProcess != null;
			case ContentfwkPackage.PROCESS__PRECEDES_PROCESSES:
				return precedesProcesses != null && !precedesProcesses.isEmpty();
			case ContentfwkPackage.PROCESS__FOLLOWS_PROCESSES:
				return followsProcesses != null && !followsProcesses.isEmpty();
			case ContentfwkPackage.PROCESS__ANY:
				return any != null;
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
				case ContentfwkPackage.PROCESS__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.PROCESS__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE;
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
				case ContentfwkPackage.STANDARD__LAST_STANDARD_CREATION_DATE: return ContentfwkPackage.PROCESS__LAST_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__NEXT_STANDARD_CREATION_DATE: return ContentfwkPackage.PROCESS__NEXT_STANDARD_CREATION_DATE;
				case ContentfwkPackage.STANDARD__RETIRE_DATE: return ContentfwkPackage.PROCESS__RETIRE_DATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (standardClass: ");
		result.append(standardClass);
		result.append(", standardCreationDate: ");
		result.append(standardCreationDate);
		result.append(", lastStandardCreationDate: ");
		result.append(lastStandardCreationDate);
		result.append(", nextStandardCreationDate: ");
		result.append(nextStandardCreationDate);
		result.append(", retireDate: ");
		result.append(retireDate);
		result.append(", processCritiality: ");
		result.append(processCritiality);
		result.append(", isAutomated: ");
		result.append(isAutomated);
		result.append(", processVolumetrics: ");
		result.append(processVolumetrics);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
