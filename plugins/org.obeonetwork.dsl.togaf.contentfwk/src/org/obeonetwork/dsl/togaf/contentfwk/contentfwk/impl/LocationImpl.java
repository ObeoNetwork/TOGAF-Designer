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
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationImpl extends ElementImpl implements Location {
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
	 * The cached value of the '{@link #getContainsOrganizationUnits() <em>Contains Organization Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsOrganizationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationUnit> containsOrganizationUnits;

	/**
	 * The cached value of the '{@link #getContainsPhysicalDataComponents() <em>Contains Physical Data Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsPhysicalDataComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalDataComponent> containsPhysicalDataComponents;

	/**
	 * The cached value of the '{@link #getContainsPhysicalApplicationComponents() <em>Contains Physical Application Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsPhysicalApplicationComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalApplicationComponent> containsPhysicalApplicationComponents;

	/**
	 * The cached value of the '{@link #getContainsPhysicalTechnologyComponents() <em>Contains Physical Technology Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsPhysicalTechnologyComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalTechnologyComponent> containsPhysicalTechnologyComponents;

	/**
	 * The cached value of the '{@link #getDecomposesLocation() <em>Decomposes Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesLocation()
	 * @generated
	 * @ordered
	 */
	protected Location decomposesLocation;

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
	public EList<Actor> getContainsActors() {
		if (containsActors == null) {
			containsActors = new EObjectWithInverseResolvingEList<Actor>(Actor.class, this, ContentfwkPackage.LOCATION__CONTAINS_ACTORS, ContentfwkPackage.ACTOR__OPERATES_IN_LOCATION);
		}
		return containsActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationUnit> getContainsOrganizationUnits() {
		if (containsOrganizationUnits == null) {
			containsOrganizationUnits = new EObjectWithInverseResolvingEList<OrganizationUnit>(OrganizationUnit.class, this, ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS, ContentfwkPackage.ORGANIZATION_UNIT__OPERATES_IN_LOCATION);
		}
		return containsOrganizationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalDataComponent> getContainsPhysicalDataComponents() {
		if (containsPhysicalDataComponents == null) {
			containsPhysicalDataComponents = new EObjectWithInverseResolvingEList<PhysicalDataComponent>(PhysicalDataComponent.class, this, ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS, ContentfwkPackage.PHYSICAL_DATA_COMPONENT__IS_HOTED_IN_LOCATION);
		}
		return containsPhysicalDataComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalApplicationComponent> getContainsPhysicalApplicationComponents() {
		if (containsPhysicalApplicationComponents == null) {
			containsPhysicalApplicationComponents = new EObjectWithInverseResolvingEList.ManyInverse<PhysicalApplicationComponent>(PhysicalApplicationComponent.class, this, ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS, ContentfwkPackage.PHYSICAL_APPLICATION_COMPONENT__IS_HOSTED_IN_LOCATION);
		}
		return containsPhysicalApplicationComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalTechnologyComponent> getContainsPhysicalTechnologyComponents() {
		if (containsPhysicalTechnologyComponents == null) {
			containsPhysicalTechnologyComponents = new EObjectWithInverseResolvingEList.ManyInverse<PhysicalTechnologyComponent>(PhysicalTechnologyComponent.class, this, ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS, ContentfwkPackage.PHYSICAL_TECHNOLOGY_COMPONENT__IS_HOSTED_IN_LOCATION);
		}
		return containsPhysicalTechnologyComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getDecomposesLocation() {
		if (decomposesLocation != null && decomposesLocation.eIsProxy()) {
			InternalEObject oldDecomposesLocation = (InternalEObject)decomposesLocation;
			decomposesLocation = (Location)eResolveProxy(oldDecomposesLocation);
			if (decomposesLocation != oldDecomposesLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION, oldDecomposesLocation, decomposesLocation));
			}
		}
		return decomposesLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetDecomposesLocation() {
		return decomposesLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposesLocation(Location newDecomposesLocation) {
		Location oldDecomposesLocation = decomposesLocation;
		decomposesLocation = newDecomposesLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION, oldDecomposesLocation, decomposesLocation));
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
				return containsActors != null && !containsActors.isEmpty();
			case ContentfwkPackage.LOCATION__CONTAINS_ORGANIZATION_UNITS:
				return containsOrganizationUnits != null && !containsOrganizationUnits.isEmpty();
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_DATA_COMPONENTS:
				return containsPhysicalDataComponents != null && !containsPhysicalDataComponents.isEmpty();
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_APPLICATION_COMPONENTS:
				return containsPhysicalApplicationComponents != null && !containsPhysicalApplicationComponents.isEmpty();
			case ContentfwkPackage.LOCATION__CONTAINS_PHYSICAL_TECHNOLOGY_COMPONENTS:
				return containsPhysicalTechnologyComponents != null && !containsPhysicalTechnologyComponents.isEmpty();
			case ContentfwkPackage.LOCATION__DECOMPOSES_LOCATION:
				return decomposesLocation != null;
		}
		return super.eIsSet(featureID);
	}

} //LocationImpl
