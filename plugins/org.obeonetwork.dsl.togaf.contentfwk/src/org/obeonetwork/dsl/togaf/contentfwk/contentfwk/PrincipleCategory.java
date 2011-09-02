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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Principle Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getPrincipleCategory()
 * @model
 * @generated
 */
public enum PrincipleCategory implements Enumerator {
	/**
	 * The '<em><b>Guiding Principle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUIDING_PRINCIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	GUIDING_PRINCIPLE(0, "GuidingPrinciple", "GuidingPrinciple"),

	/**
	 * The '<em><b>Business Principle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_PRINCIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_PRINCIPLE(1, "BusinessPrinciple", "BusinessPrinciple"),

	/**
	 * The '<em><b>Data Principle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PRINCIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PRINCIPLE(2, "DataPrinciple", "DataPrinciple"),

	/**
	 * The '<em><b>Application Principle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PRINCIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_PRINCIPLE(3, "ApplicationPrinciple", "ApplicationPrinciple"),

	/**
	 * The '<em><b>Integration Principle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATION_PRINCIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATION_PRINCIPLE(4, "IntegrationPrinciple", "IntegrationPrinciple"),

	/**
	 * The '<em><b>Technology Principle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGY_PRINCIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNOLOGY_PRINCIPLE(5, "TechnologyPrinciple", "TechnologyPrinciple");

	/**
	 * The '<em><b>Guiding Principle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guiding Principle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUIDING_PRINCIPLE
	 * @model name="GuidingPrinciple"
	 * @generated
	 * @ordered
	 */
	public static final int GUIDING_PRINCIPLE_VALUE = 0;

	/**
	 * The '<em><b>Business Principle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Business Principle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_PRINCIPLE
	 * @model name="BusinessPrinciple"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_PRINCIPLE_VALUE = 1;

	/**
	 * The '<em><b>Data Principle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Principle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_PRINCIPLE
	 * @model name="DataPrinciple"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PRINCIPLE_VALUE = 2;

	/**
	 * The '<em><b>Application Principle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Application Principle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_PRINCIPLE
	 * @model name="ApplicationPrinciple"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_PRINCIPLE_VALUE = 3;

	/**
	 * The '<em><b>Integration Principle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integration Principle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGRATION_PRINCIPLE
	 * @model name="IntegrationPrinciple"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATION_PRINCIPLE_VALUE = 4;

	/**
	 * The '<em><b>Technology Principle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Technology Principle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECHNOLOGY_PRINCIPLE
	 * @model name="TechnologyPrinciple"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNOLOGY_PRINCIPLE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Principle Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrincipleCategory[] VALUES_ARRAY =
		new PrincipleCategory[] {
			GUIDING_PRINCIPLE,
			BUSINESS_PRINCIPLE,
			DATA_PRINCIPLE,
			APPLICATION_PRINCIPLE,
			INTEGRATION_PRINCIPLE,
			TECHNOLOGY_PRINCIPLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Principle Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrincipleCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Principle Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrincipleCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrincipleCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Principle Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrincipleCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrincipleCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Principle Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrincipleCategory get(int value) {
		switch (value) {
			case GUIDING_PRINCIPLE_VALUE: return GUIDING_PRINCIPLE;
			case BUSINESS_PRINCIPLE_VALUE: return BUSINESS_PRINCIPLE;
			case DATA_PRINCIPLE_VALUE: return DATA_PRINCIPLE;
			case APPLICATION_PRINCIPLE_VALUE: return APPLICATION_PRINCIPLE;
			case INTEGRATION_PRINCIPLE_VALUE: return INTEGRATION_PRINCIPLE;
			case TECHNOLOGY_PRINCIPLE_VALUE: return TECHNOLOGY_PRINCIPLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PrincipleCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PrincipleCategory
