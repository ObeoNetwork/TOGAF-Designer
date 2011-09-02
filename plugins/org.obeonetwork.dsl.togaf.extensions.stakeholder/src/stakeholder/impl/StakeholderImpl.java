/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package stakeholder.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.impl.StrategicElementImpl;

import stakeholder.RelevantArtifact;
import stakeholder.Stakeholder;
import stakeholder.StakeholderClass;
import stakeholder.StakeholderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link stakeholder.impl.StakeholderImpl#getInvolvement <em>Involvement</em>}</li>
 *   <li>{@link stakeholder.impl.StakeholderImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link stakeholder.impl.StakeholderImpl#getRelevantArtifacts <em>Relevant Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StakeholderImpl extends StrategicElementImpl implements Stakeholder {
	/**
	 * The default value of the '{@link #getInvolvement() <em>Involvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvement()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOLVEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvolvement() <em>Involvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvement()
	 * @generated
	 * @ordered
	 */
	protected String involvement = INVOLVEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final StakeholderClass CLASS_EDEFAULT = StakeholderClass.OTHER;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected StakeholderClass class_ = CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelevantArtifacts() <em>Relevant Artifacts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<RelevantArtifact> relevantArtifacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StakeholderPackage.Literals.STAKEHOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvolvement() {
		return involvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvolvement(String newInvolvement) {
		String oldInvolvement = involvement;
		involvement = newInvolvement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StakeholderPackage.STAKEHOLDER__INVOLVEMENT, oldInvolvement, involvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeholderClass getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(StakeholderClass newClass) {
		StakeholderClass oldClass = class_;
		class_ = newClass == null ? CLASS_EDEFAULT : newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StakeholderPackage.STAKEHOLDER__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelevantArtifact> getRelevantArtifacts() {
		if (relevantArtifacts == null) {
			relevantArtifacts = new EDataTypeUniqueEList<RelevantArtifact>(RelevantArtifact.class, this, StakeholderPackage.STAKEHOLDER__RELEVANT_ARTIFACTS);
		}
		return relevantArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StakeholderPackage.STAKEHOLDER__INVOLVEMENT:
				return getInvolvement();
			case StakeholderPackage.STAKEHOLDER__CLASS:
				return getClass_();
			case StakeholderPackage.STAKEHOLDER__RELEVANT_ARTIFACTS:
				return getRelevantArtifacts();
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
			case StakeholderPackage.STAKEHOLDER__INVOLVEMENT:
				setInvolvement((String)newValue);
				return;
			case StakeholderPackage.STAKEHOLDER__CLASS:
				setClass((StakeholderClass)newValue);
				return;
			case StakeholderPackage.STAKEHOLDER__RELEVANT_ARTIFACTS:
				getRelevantArtifacts().clear();
				getRelevantArtifacts().addAll((Collection<? extends RelevantArtifact>)newValue);
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
			case StakeholderPackage.STAKEHOLDER__INVOLVEMENT:
				setInvolvement(INVOLVEMENT_EDEFAULT);
				return;
			case StakeholderPackage.STAKEHOLDER__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case StakeholderPackage.STAKEHOLDER__RELEVANT_ARTIFACTS:
				getRelevantArtifacts().clear();
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
			case StakeholderPackage.STAKEHOLDER__INVOLVEMENT:
				return INVOLVEMENT_EDEFAULT == null ? involvement != null : !INVOLVEMENT_EDEFAULT.equals(involvement);
			case StakeholderPackage.STAKEHOLDER__CLASS:
				return class_ != CLASS_EDEFAULT;
			case StakeholderPackage.STAKEHOLDER__RELEVANT_ARTIFACTS:
				return relevantArtifacts != null && !relevantArtifacts.isEmpty();
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
		result.append(" (involvement: ");
		result.append(involvement);
		result.append(", class: ");
		result.append(class_);
		result.append(", relevantArtifacts: ");
		result.append(relevantArtifacts);
		result.append(')');
		return result.toString();
	}

} //StakeholderImpl
