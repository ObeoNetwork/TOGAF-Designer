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
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link stakeholder.Stakeholder#getInvolvement <em>Involvement</em>}</li>
 *   <li>{@link stakeholder.Stakeholder#getClass_ <em>Class</em>}</li>
 *   <li>{@link stakeholder.Stakeholder#getRelevantArtifacts <em>Relevant Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see stakeholder.StakeholderPackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends StrategicElement {
	/**
	 * Returns the value of the '<em><b>Involvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involvement</em>' attribute.
	 * @see #setInvolvement(String)
	 * @see stakeholder.StakeholderPackage#getStakeholder_Involvement()
	 * @model required="true"
	 * @generated
	 */
	String getInvolvement();

	/**
	 * Sets the value of the '{@link stakeholder.Stakeholder#getInvolvement <em>Involvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Involvement</em>' attribute.
	 * @see #getInvolvement()
	 * @generated
	 */
	void setInvolvement(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The literals are from the enumeration {@link stakeholder.StakeholderClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see stakeholder.StakeholderClass
	 * @see #setClass(StakeholderClass)
	 * @see stakeholder.StakeholderPackage#getStakeholder_Class()
	 * @model required="true"
	 * @generated
	 */
	StakeholderClass getClass_();

	/**
	 * Sets the value of the '{@link stakeholder.Stakeholder#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see stakeholder.StakeholderClass
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(StakeholderClass value);

	/**
	 * Returns the value of the '<em><b>Relevant Artifacts</b></em>' attribute list.
	 * The list contents are of type {@link stakeholder.RelevantArtifact}.
	 * The literals are from the enumeration {@link stakeholder.RelevantArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevant Artifacts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant Artifacts</em>' attribute list.
	 * @see stakeholder.RelevantArtifact
	 * @see stakeholder.StakeholderPackage#getStakeholder_RelevantArtifacts()
	 * @model default="" required="true"
	 * @generated
	 */
	EList<RelevantArtifact> getRelevantArtifacts();

} // Stakeholder
