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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl#getOwnsAndGovernsServices <em>Owns And Governs Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl#getContainsActors <em>Contains Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl#getOwnsFunctions <em>Owns Functions</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl#getParticipatesInProcesses <em>Participates In Processes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl#getIsMotivatedByDrivers <em>Is Motivated By Drivers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl#getProducesProducts <em>Produces Products</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl#getOperatesInLocation <em>Operates In Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl#getHeadcount <em>Headcount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationUnitImpl extends ElementImpl implements OrganizationUnit {
	/**
	 * The cached value of the '{@link #getOwnsAndGovernsServices() <em>Owns And Governs Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsAndGovernsServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> ownsAndGovernsServices;

	/**
	 * The cached value of the '{@link #getContainsActors() <em>Contains Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> containsActors;

	/**
	 * The cached value of the '{@link #getOwnsFunctions() <em>Owns Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> ownsFunctions;

	/**
	 * The cached value of the '{@link #getParticipatesInProcesses() <em>Participates In Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatesInProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> participatesInProcesses;

	/**
	 * The cached value of the '{@link #getIsMotivatedByDrivers() <em>Is Motivated By Drivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMotivatedByDrivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Driver> isMotivatedByDrivers;

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
	 * The cached value of the '{@link #getOperatesInLocation() <em>Operates In Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatesInLocation()
	 * @generated
	 * @ordered
	 */
	protected Location operatesInLocation;

	/**
	 * The default value of the '{@link #getHeadcount() <em>Headcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadcount()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeadcount() <em>Headcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadcount()
	 * @generated
	 * @ordered
	 */
	protected String headcount = HEADCOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.ORGANIZATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getOwnsAndGovernsServices() {
		if (ownsAndGovernsServices == null) {
			ownsAndGovernsServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ContentfwkPackage.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES, ContentfwkPackage.SERVICE__IS_OWNED_AND_GOVERNED_BY_ORGANIZATION_UNITS);
		}
		return ownsAndGovernsServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getContainsActors() {
		if (containsActors == null) {
			containsActors = new EObjectWithInverseResolvingEList<Actor>(Actor.class, this, ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS, ContentfwkPackage.ACTOR__BELONGS_TO);
		}
		return containsActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getOwnsFunctions() {
		if (ownsFunctions == null) {
			ownsFunctions = new EObjectWithInverseResolvingEList<Function>(Function.class, this, ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS, ContentfwkPackage.FUNCTION__IS_OWNED_BY_UNIT);
		}
		return ownsFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getParticipatesInProcesses() {
		if (participatesInProcesses == null) {
			participatesInProcesses = new EObjectWithInverseResolvingEList.ManyInverse<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>(org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process.class, this, ContentfwkPackage.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES, ContentfwkPackage.PROCESS__INVOLVES_ORGANIZATION_UNITS);
		}
		return participatesInProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Driver> getIsMotivatedByDrivers() {
		if (isMotivatedByDrivers == null) {
			isMotivatedByDrivers = new EObjectWithInverseResolvingEList.ManyInverse<Driver>(Driver.class, this, ContentfwkPackage.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS, ContentfwkPackage.DRIVER__MOTIVATES_ORGANIZATION_UNITS);
		}
		return isMotivatedByDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducesProducts() {
		if (producesProducts == null) {
			producesProducts = new EObjectWithInverseResolvingEList.ManyInverse<Product>(Product.class, this, ContentfwkPackage.ORGANIZATION_UNIT__PRODUCES_PRODUCTS, ContentfwkPackage.PRODUCT__IS_PRODUCED_BY_ORGANIZATION_UNITS);
		}
		return producesProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getOperatesInLocation() {
		if (operatesInLocation != null && operatesInLocation.eIsProxy()) {
			InternalEObject oldOperatesInLocation = (InternalEObject)operatesInLocation;
			operatesInLocation = (Location)eResolveProxy(oldOperatesInLocation);
			if (operatesInLocation != oldOperatesInLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION, oldOperatesInLocation, operatesInLocation));
			}
		}
		return operatesInLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetOperatesInLocation() {
		return operatesInLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatesInLocation(Location newOperatesInLocation, NotificationChain msgs) {
		Location oldOperatesInLocation = operatesInLocation;
		operatesInLocation = newOperatesInLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION, oldOperatesInLocation, newOperatesInLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatesInLocation(Location newOperatesInLocation) {
		if (newOperatesInLocation != operatesInLocation) {
			NotificationChain msgs = null;
			if (operatesInLocation != null)
				msgs = ((InternalEObject)operatesInLocation).eInverseRemove(this, ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS, Location.class, msgs);
			if (newOperatesInLocation != null)
				msgs = ((InternalEObject)newOperatesInLocation).eInverseAdd(this, ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS, Location.class, msgs);
			msgs = basicSetOperatesInLocation(newOperatesInLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION, newOperatesInLocation, newOperatesInLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeadcount() {
		return headcount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadcount(String newHeadcount) {
		String oldHeadcount = headcount;
		headcount = newHeadcount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.ORGANIZATION_UNIT__HEADCOUNT, oldHeadcount, headcount));
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
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnsAndGovernsServices()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsActors()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnsFunctions()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipatesInProcesses()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsMotivatedByDrivers()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__PRODUCES_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducesProducts()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION:
				if (operatesInLocation != null)
					msgs = ((InternalEObject)operatesInLocation).eInverseRemove(this, ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS, Location.class, msgs);
				return basicSetOperatesInLocation((Location)otherEnd, msgs);
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
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES:
				return ((InternalEList<?>)getOwnsAndGovernsServices()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS:
				return ((InternalEList<?>)getContainsActors()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS:
				return ((InternalEList<?>)getOwnsFunctions()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES:
				return ((InternalEList<?>)getParticipatesInProcesses()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS:
				return ((InternalEList<?>)getIsMotivatedByDrivers()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__PRODUCES_PRODUCTS:
				return ((InternalEList<?>)getProducesProducts()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION:
				return basicSetOperatesInLocation(null, msgs);
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
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES:
				return getOwnsAndGovernsServices();
			case ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS:
				return getContainsActors();
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS:
				return getOwnsFunctions();
			case ContentfwkPackage.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES:
				return getParticipatesInProcesses();
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS:
				return getIsMotivatedByDrivers();
			case ContentfwkPackage.ORGANIZATION_UNIT__PRODUCES_PRODUCTS:
				return getProducesProducts();
			case ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION:
				if (resolve) return getOperatesInLocation();
				return basicGetOperatesInLocation();
			case ContentfwkPackage.ORGANIZATION_UNIT__HEADCOUNT:
				return getHeadcount();
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
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES:
				getOwnsAndGovernsServices().clear();
				getOwnsAndGovernsServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS:
				getContainsActors().clear();
				getContainsActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS:
				getOwnsFunctions().clear();
				getOwnsFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES:
				getParticipatesInProcesses().clear();
				getParticipatesInProcesses().addAll((Collection<? extends org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)newValue);
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS:
				getIsMotivatedByDrivers().clear();
				getIsMotivatedByDrivers().addAll((Collection<? extends Driver>)newValue);
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__PRODUCES_PRODUCTS:
				getProducesProducts().clear();
				getProducesProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION:
				setOperatesInLocation((Location)newValue);
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__HEADCOUNT:
				setHeadcount((String)newValue);
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
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES:
				getOwnsAndGovernsServices().clear();
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS:
				getContainsActors().clear();
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS:
				getOwnsFunctions().clear();
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES:
				getParticipatesInProcesses().clear();
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS:
				getIsMotivatedByDrivers().clear();
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__PRODUCES_PRODUCTS:
				getProducesProducts().clear();
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION:
				setOperatesInLocation((Location)null);
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__HEADCOUNT:
				setHeadcount(HEADCOUNT_EDEFAULT);
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
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES:
				return ownsAndGovernsServices != null && !ownsAndGovernsServices.isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS:
				return containsActors != null && !containsActors.isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS:
				return ownsFunctions != null && !ownsFunctions.isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES:
				return participatesInProcesses != null && !participatesInProcesses.isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS:
				return isMotivatedByDrivers != null && !isMotivatedByDrivers.isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__PRODUCES_PRODUCTS:
				return producesProducts != null && !producesProducts.isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION:
				return operatesInLocation != null;
			case ContentfwkPackage.ORGANIZATION_UNIT__HEADCOUNT:
				return HEADCOUNT_EDEFAULT == null ? headcount != null : !HEADCOUNT_EDEFAULT.equals(headcount);
		}
		return super.eIsSet(featureID);
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
		result.append(" (headcount: ");
		result.append(headcount);
		result.append(')');
		return result.toString();
	}

} //OrganizationUnitImpl
