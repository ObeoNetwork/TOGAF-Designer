/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package stakeholder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relevant Artifact</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see stakeholder.StakeholderPackage#getRelevantArtifact()
 * @model
 * @generated
 */
public enum RelevantArtifact implements Enumerator {
	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "Other", "Other"),

	/**
	 * The '<em><b>Goal Objective Service Model</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_OBJECTIVE_SERVICE_MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL_OBJECTIVE_SERVICE_MODEL(1, "GoalObjectiveServiceModel", "Goal/Objective/Service Model"),

	/**
	 * The '<em><b>Organization Chart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_CHART_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION_CHART(2, "OrganizationChart", "Organization Chart"),

	/**
	 * The '<em><b>Roadmaps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROADMAPS_VALUE
	 * @generated
	 * @ordered
	 */
	ROADMAPS(3, "Roadmaps", "Roadmaps"),

	/**
	 * The '<em><b>Application Communication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_COMMUNICATION(4, "ApplicationCommunication", "Application Communication"),

	/**
	 * The '<em><b>Functional Decomposition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_DECOMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL_DECOMPOSITION(5, "FunctionalDecomposition", "Functional Decomposition"),

	/**
	 * The '<em><b>Organization Actor Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_ACTOR_LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION_ACTOR_LOCATION(6, "OrganizationActorLocation", "Organization/Actor/Location"),

	/**
	 * The '<em><b>Business Footprint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_FOOTPRINT_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_FOOTPRINT(7, "BusinessFootprint", "Business Footprint");

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * The '<em><b>Goal Objective Service Model</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Goal Objective Service Model</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOAL_OBJECTIVE_SERVICE_MODEL
	 * @model name="GoalObjectiveServiceModel" literal="Goal/Objective/Service Model"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_OBJECTIVE_SERVICE_MODEL_VALUE = 1;

	/**
	 * The '<em><b>Organization Chart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Organization Chart</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_CHART
	 * @model name="OrganizationChart" literal="Organization Chart"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_CHART_VALUE = 2;

	/**
	 * The '<em><b>Roadmaps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Roadmaps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROADMAPS
	 * @model name="Roadmaps"
	 * @generated
	 * @ordered
	 */
	public static final int ROADMAPS_VALUE = 3;

	/**
	 * The '<em><b>Application Communication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Application Communication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_COMMUNICATION
	 * @model name="ApplicationCommunication" literal="Application Communication"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_COMMUNICATION_VALUE = 4;

	/**
	 * The '<em><b>Functional Decomposition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Functional Decomposition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_DECOMPOSITION
	 * @model name="FunctionalDecomposition" literal="Functional Decomposition"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_DECOMPOSITION_VALUE = 5;

	/**
	 * The '<em><b>Organization Actor Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Organization Actor Location</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_ACTOR_LOCATION
	 * @model name="OrganizationActorLocation" literal="Organization/Actor/Location"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_ACTOR_LOCATION_VALUE = 6;

	/**
	 * The '<em><b>Business Footprint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Business Footprint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_FOOTPRINT
	 * @model name="BusinessFootprint" literal="Business Footprint"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_FOOTPRINT_VALUE = 7;

	/**
	 * An array of all the '<em><b>Relevant Artifact</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelevantArtifact[] VALUES_ARRAY =
		new RelevantArtifact[] {
			OTHER,
			GOAL_OBJECTIVE_SERVICE_MODEL,
			ORGANIZATION_CHART,
			ROADMAPS,
			APPLICATION_COMMUNICATION,
			FUNCTIONAL_DECOMPOSITION,
			ORGANIZATION_ACTOR_LOCATION,
			BUSINESS_FOOTPRINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Relevant Artifact</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelevantArtifact> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relevant Artifact</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelevantArtifact get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelevantArtifact result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relevant Artifact</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelevantArtifact getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelevantArtifact result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relevant Artifact</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelevantArtifact get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case GOAL_OBJECTIVE_SERVICE_MODEL_VALUE: return GOAL_OBJECTIVE_SERVICE_MODEL;
			case ORGANIZATION_CHART_VALUE: return ORGANIZATION_CHART;
			case ROADMAPS_VALUE: return ROADMAPS;
			case APPLICATION_COMMUNICATION_VALUE: return APPLICATION_COMMUNICATION;
			case FUNCTIONAL_DECOMPOSITION_VALUE: return FUNCTIONAL_DECOMPOSITION;
			case ORGANIZATION_ACTOR_LOCATION_VALUE: return ORGANIZATION_ACTOR_LOCATION;
			case BUSINESS_FOOTPRINT_VALUE: return BUSINESS_FOOTPRINT;
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
	private RelevantArtifact(int value, String name, String literal) {
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
	
} //RelevantArtifact
