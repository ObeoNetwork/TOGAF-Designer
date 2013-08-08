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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl#getDecomposesOrganizationUnit <em>Decomposes Organization Unit</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.OrganizationUnitImpl#getIsDecomposedByOrganizationUnits <em>Is Decomposed By Organization Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationUnitImpl extends ElementImpl implements OrganizationUnit {
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
	@SuppressWarnings("unchecked")
	public EList<Service> getOwnsAndGovernsServices() {
		return (EList<Service>)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES, ContentfwkPackage.Literals.ORGANIZATION_UNIT__OWNS_AND_GOVERNS_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getContainsActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS, ContentfwkPackage.Literals.ORGANIZATION_UNIT__CONTAINS_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getOwnsFunctions() {
		return (EList<Function>)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS, ContentfwkPackage.Literals.ORGANIZATION_UNIT__OWNS_FUNCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getParticipatesInProcesses() {
		return (EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process>)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES, ContentfwkPackage.Literals.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Driver> getIsMotivatedByDrivers() {
		return (EList<Driver>)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS, ContentfwkPackage.Literals.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Product> getProducesProducts() {
		return (EList<Product>)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__PRODUCES_PRODUCTS, ContentfwkPackage.Literals.ORGANIZATION_UNIT__PRODUCES_PRODUCTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getOperatesInLocation() {
		return (Location)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION, ContentfwkPackage.Literals.ORGANIZATION_UNIT__OPERATES_IN_LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetOperatesInLocation() {
		return (Location)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION, ContentfwkPackage.Literals.ORGANIZATION_UNIT__OPERATES_IN_LOCATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatesInLocation(Location newOperatesInLocation, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOperatesInLocation, ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatesInLocation(Location newOperatesInLocation) {
		eDynamicSet(ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION, ContentfwkPackage.Literals.ORGANIZATION_UNIT__OPERATES_IN_LOCATION, newOperatesInLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeadcount() {
		return (String)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__HEADCOUNT, ContentfwkPackage.Literals.ORGANIZATION_UNIT__HEADCOUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadcount(String newHeadcount) {
		eDynamicSet(ContentfwkPackage.ORGANIZATION_UNIT__HEADCOUNT, ContentfwkPackage.Literals.ORGANIZATION_UNIT__HEADCOUNT, newHeadcount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit getDecomposesOrganizationUnit() {
		return (OrganizationUnit)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT, ContentfwkPackage.Literals.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit basicGetDecomposesOrganizationUnit() {
		return (OrganizationUnit)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT, ContentfwkPackage.Literals.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecomposesOrganizationUnit(OrganizationUnit newDecomposesOrganizationUnit, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDecomposesOrganizationUnit, ContentfwkPackage.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesOrganizationUnit(OrganizationUnit newDecomposesOrganizationUnit) {
		eDynamicSet(ContentfwkPackage.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT, ContentfwkPackage.Literals.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT, newDecomposesOrganizationUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationUnit> getIsDecomposedByOrganizationUnits() {
		return (EList<OrganizationUnit>)eDynamicGet(ContentfwkPackage.ORGANIZATION_UNIT__IS_DECOMPOSED_BY_ORGANIZATION_UNITS, ContentfwkPackage.Literals.ORGANIZATION_UNIT__IS_DECOMPOSED_BY_ORGANIZATION_UNITS, true, true);
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
				Location operatesInLocation = basicGetOperatesInLocation();
				if (operatesInLocation != null)
					msgs = ((InternalEObject)operatesInLocation).eInverseRemove(this, ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS, Location.class, msgs);
				return basicSetOperatesInLocation((Location)otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT:
				OrganizationUnit decomposesOrganizationUnit = basicGetDecomposesOrganizationUnit();
				if (decomposesOrganizationUnit != null)
					msgs = ((InternalEObject)decomposesOrganizationUnit).eInverseRemove(this, ContentfwkPackage.ORGANIZATION_UNIT__IS_DECOMPOSED_BY_ORGANIZATION_UNITS, OrganizationUnit.class, msgs);
				return basicSetDecomposesOrganizationUnit((OrganizationUnit)otherEnd, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_DECOMPOSED_BY_ORGANIZATION_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDecomposedByOrganizationUnits()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT:
				return basicSetDecomposesOrganizationUnit(null, msgs);
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_DECOMPOSED_BY_ORGANIZATION_UNITS:
				return ((InternalEList<?>)getIsDecomposedByOrganizationUnits()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT:
				if (resolve) return getDecomposesOrganizationUnit();
				return basicGetDecomposesOrganizationUnit();
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_DECOMPOSED_BY_ORGANIZATION_UNITS:
				return getIsDecomposedByOrganizationUnits();
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
			case ContentfwkPackage.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT:
				setDecomposesOrganizationUnit((OrganizationUnit)newValue);
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_DECOMPOSED_BY_ORGANIZATION_UNITS:
				getIsDecomposedByOrganizationUnits().clear();
				getIsDecomposedByOrganizationUnits().addAll((Collection<? extends OrganizationUnit>)newValue);
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
			case ContentfwkPackage.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT:
				setDecomposesOrganizationUnit((OrganizationUnit)null);
				return;
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_DECOMPOSED_BY_ORGANIZATION_UNITS:
				getIsDecomposedByOrganizationUnits().clear();
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
				return !getOwnsAndGovernsServices().isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__CONTAINS_ACTORS:
				return !getContainsActors().isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__OWNS_FUNCTIONS:
				return !getOwnsFunctions().isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__PARTICIPATES_IN_PROCESSES:
				return !getParticipatesInProcesses().isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_MOTIVATED_BY_DRIVERS:
				return !getIsMotivatedByDrivers().isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__PRODUCES_PRODUCTS:
				return !getProducesProducts().isEmpty();
			case ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION:
				return basicGetOperatesInLocation() != null;
			case ContentfwkPackage.ORGANIZATION_UNIT__HEADCOUNT:
				return HEADCOUNT_EDEFAULT == null ? getHeadcount() != null : !HEADCOUNT_EDEFAULT.equals(getHeadcount());
			case ContentfwkPackage.ORGANIZATION_UNIT__DECOMPOSES_ORGANIZATION_UNIT:
				return basicGetDecomposesOrganizationUnit() != null;
			case ContentfwkPackage.ORGANIZATION_UNIT__IS_DECOMPOSED_BY_ORGANIZATION_UNITS:
				return !getIsDecomposedByOrganizationUnits().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationUnitImpl
