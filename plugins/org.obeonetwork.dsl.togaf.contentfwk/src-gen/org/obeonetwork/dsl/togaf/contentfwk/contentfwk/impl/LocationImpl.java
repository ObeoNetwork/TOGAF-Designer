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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl#getContainsActors <em>Contains Actors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl#getContainsOrganizationUnits <em>Contains Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl#getContainsPhysicalDataComponents <em>Contains Physical Data Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl#getContainsPhysicalApplicationComponents <em>Contains Physical Application Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl#getContainsPhysicalTechnologyComponents <em>Contains Physical Technology Components</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl#getDecomposesLocation <em>Decomposes Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.LocationImpl#getIsDecomposedByLocations <em>Is Decomposed By Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends ElementImpl implements Location {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Actor> getContainsActors() {
		return (EList<Actor>)eDynamicGet(ContentfwkPackage.LOCATION__CONTAINS_ACTORS, ContentfwkPackage.Literals.LOCATION__CONTAINS_ACTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationUnit> getContainsOrganizationUnits() {
		return (EList<OrganizationUnit>)eDynamicGet(ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS, ContentfwkPackage.Literals.LOCATION__CONTAINS_ORGANIZATION_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalDataComponent> getContainsPhysicalDataComponents() {
		return (EList<PhysicalDataComponent>)eDynamicGet(ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS, ContentfwkPackage.Literals.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalApplicationComponent> getContainsPhysicalApplicationComponents() {
		return (EList<PhysicalApplicationComponent>)eDynamicGet(ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS, ContentfwkPackage.Literals.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhysicalTechnologyComponent> getContainsPhysicalTechnologyComponents() {
		return (EList<PhysicalTechnologyComponent>)eDynamicGet(ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.Literals.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getDecomposesLocation() {
		return (Location)eDynamicGet(ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION, ContentfwkPackage.Literals.LOCATION__DECOMPOSES_LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetDecomposesLocation() {
		return (Location)eDynamicGet(ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION, ContentfwkPackage.Literals.LOCATION__DECOMPOSES_LOCATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecomposesLocation(Location newDecomposesLocation, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDecomposesLocation, ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesLocation(Location newDecomposesLocation) {
		eDynamicSet(ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION, ContentfwkPackage.Literals.LOCATION__DECOMPOSES_LOCATION, newDecomposesLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Location> getIsDecomposedByLocations() {
		return (EList<Location>)eDynamicGet(ContentfwkPackage.LOCATION__IS_DECOMPOSED_BY_LOCATIONS, ContentfwkPackage.Literals.LOCATION__IS_DECOMPOSED_BY_LOCATIONS, true, true);
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
			case ContentfwkPackage.LOCATION__CONTAINS_ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsActors()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsOrganizationUnits()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsPhysicalDataComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsPhysicalApplicationComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsPhysicalTechnologyComponents()).basicAdd(otherEnd, msgs);
			case ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION:
				Location decomposesLocation = basicGetDecomposesLocation();
				if (decomposesLocation != null)
					msgs = ((InternalEObject)decomposesLocation).eInverseRemove(this, ContentfwkPackage.LOCATION__IS_DECOMPOSED_BY_LOCATIONS, Location.class, msgs);
				return basicSetDecomposesLocation((Location)otherEnd, msgs);
			case ContentfwkPackage.LOCATION__IS_DECOMPOSED_BY_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsDecomposedByLocations()).basicAdd(otherEnd, msgs);
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
			case ContentfwkPackage.LOCATION__CONTAINS_ACTORS:
				return ((InternalEList<?>)getContainsActors()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS:
				return ((InternalEList<?>)getContainsOrganizationUnits()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS:
				return ((InternalEList<?>)getContainsPhysicalDataComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS:
				return ((InternalEList<?>)getContainsPhysicalApplicationComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return ((InternalEList<?>)getContainsPhysicalTechnologyComponents()).basicRemove(otherEnd, msgs);
			case ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION:
				return basicSetDecomposesLocation(null, msgs);
			case ContentfwkPackage.LOCATION__IS_DECOMPOSED_BY_LOCATIONS:
				return ((InternalEList<?>)getIsDecomposedByLocations()).basicRemove(otherEnd, msgs);
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
			case ContentfwkPackage.LOCATION__CONTAINS_ACTORS:
				return getContainsActors();
			case ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS:
				return getContainsOrganizationUnits();
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS:
				return getContainsPhysicalDataComponents();
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS:
				return getContainsPhysicalApplicationComponents();
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return getContainsPhysicalTechnologyComponents();
			case ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION:
				if (resolve) return getDecomposesLocation();
				return basicGetDecomposesLocation();
			case ContentfwkPackage.LOCATION__IS_DECOMPOSED_BY_LOCATIONS:
				return getIsDecomposedByLocations();
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
			case ContentfwkPackage.LOCATION__CONTAINS_ACTORS:
				getContainsActors().clear();
				getContainsActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS:
				getContainsOrganizationUnits().clear();
				getContainsOrganizationUnits().addAll((Collection<? extends OrganizationUnit>)newValue);
				return;
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS:
				getContainsPhysicalDataComponents().clear();
				getContainsPhysicalDataComponents().addAll((Collection<? extends PhysicalDataComponent>)newValue);
				return;
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS:
				getContainsPhysicalApplicationComponents().clear();
				getContainsPhysicalApplicationComponents().addAll((Collection<? extends PhysicalApplicationComponent>)newValue);
				return;
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS:
				getContainsPhysicalTechnologyComponents().clear();
				getContainsPhysicalTechnologyComponents().addAll((Collection<? extends PhysicalTechnologyComponent>)newValue);
				return;
			case ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION:
				setDecomposesLocation((Location)newValue);
				return;
			case ContentfwkPackage.LOCATION__IS_DECOMPOSED_BY_LOCATIONS:
				getIsDecomposedByLocations().clear();
				getIsDecomposedByLocations().addAll((Collection<? extends Location>)newValue);
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
			case ContentfwkPackage.LOCATION__CONTAINS_ACTORS:
				getContainsActors().clear();
				return;
			case ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS:
				getContainsOrganizationUnits().clear();
				return;
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS:
				getContainsPhysicalDataComponents().clear();
				return;
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS:
				getContainsPhysicalApplicationComponents().clear();
				return;
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS:
				getContainsPhysicalTechnologyComponents().clear();
				return;
			case ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION:
				setDecomposesLocation((Location)null);
				return;
			case ContentfwkPackage.LOCATION__IS_DECOMPOSED_BY_LOCATIONS:
				getIsDecomposedByLocations().clear();
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
			case ContentfwkPackage.LOCATION__CONTAINS_ACTORS:
				return !getContainsActors().isEmpty();
			case ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS:
				return !getContainsOrganizationUnits().isEmpty();
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS:
				return !getContainsPhysicalDataComponents().isEmpty();
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS:
				return !getContainsPhysicalApplicationComponents().isEmpty();
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return !getContainsPhysicalTechnologyComponents().isEmpty();
			case ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION:
				return basicGetDecomposesLocation() != null;
			case ContentfwkPackage.LOCATION__IS_DECOMPOSED_BY_LOCATIONS:
				return !getIsDecomposedByLocations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocationImpl
