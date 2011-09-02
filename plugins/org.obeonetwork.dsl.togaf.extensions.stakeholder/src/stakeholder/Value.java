/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package stakeholder;

import org.eclipse.emf.common.util.EList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link stakeholder.Value#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see stakeholder.StakeholderPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends StrategicElement {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link stakeholder.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see stakeholder.StakeholderPackage#getValue_Next()
	 * @model
	 * @generated
	 */
	EList<Value> getNext();

} // Value
