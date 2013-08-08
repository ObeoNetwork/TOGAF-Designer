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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.TechnologyComponentImpl#getStandardClass <em>Standard Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TechnologyComponentImpl extends CDOObjectImpl implements TechnologyComponent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfwkPackage.Literals.TECHNOLOGY_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardsClass getStandardClass() {
		return (StandardsClass)eDynamicGet(ContentfwkPackage.TECHNOLOGY_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.TECHNOLOGY_COMPONENT__STANDARD_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardClass(StandardsClass newStandardClass) {
		eDynamicSet(ContentfwkPackage.TECHNOLOGY_COMPONENT__STANDARD_CLASS, ContentfwkPackage.Literals.TECHNOLOGY_COMPONENT__STANDARD_CLASS, newStandardClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentfwkPackage.TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				return getStandardClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentfwkPackage.TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				setStandardClass((StandardsClass)newValue);
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
			case ContentfwkPackage.TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				setStandardClass(STANDARD_CLASS_EDEFAULT);
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
			case ContentfwkPackage.TECHNOLOGY_COMPONENT__STANDARD_CLASS:
				return getStandardClass() != STANDARD_CLASS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TechnologyComponentImpl
