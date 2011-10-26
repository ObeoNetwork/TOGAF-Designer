/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package representations;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link representations.RepresentationsContainer#getRepresentations <em>Representations</em>}</li>
 * </ul>
 * </p>
 *
 * @see representations.RepresentationsPackage#getRepresentationsContainer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface RepresentationsContainer extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Representations</b></em>' containment reference list.
	 * The list contents are of type {@link representations.Representation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representations</em>' containment reference list.
	 * @see representations.RepresentationsPackage#getRepresentationsContainer_Representations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Representation> getRepresentations();

} // RepresentationsContainer
