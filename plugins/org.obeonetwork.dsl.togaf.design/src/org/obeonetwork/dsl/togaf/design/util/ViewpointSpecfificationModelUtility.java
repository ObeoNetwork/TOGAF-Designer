/**
 * 
 */
package org.obeonetwork.dsl.togaf.design.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Utility class used to utility method used in VSM (.odesign)
 * 
 * @author jdupont
 * 
 */
public class ViewpointSpecfificationModelUtility {

	/**
	 * Utility method used during the dragNDrop tool to set the feature value.
	 * 
	 * @param context
	 *            the context
	 * @param featureName
	 *            the feature name
	 * @param toSet
	 *            the new value to set
	 * @return true if the set is worked, false otherwise
	 */
	public boolean dragNDropUtility(EObject context, String featureName,
			EObject toSet) {

		EStructuralFeature feature = getFeature(context, featureName);
		Object value = context.eGet(feature);

		if (value instanceof org.eclipse.emf.common.util.EList) {
			((EList<Object>) value).clear();
			((EList<Object>) value).add(toSet);
			return true;
		} else if (value instanceof EObject || value == null) {
			context.eSet(feature, toSet);
			return true;
		}
		return false;
	}

	private EStructuralFeature getFeature(EObject context, String name) {
		EStructuralFeature featureToReturn = null;
		for (EStructuralFeature feature : context.eClass()
				.getEAllStructuralFeatures()) {
			if (name.equals(feature.getName())) {
				featureToReturn = feature;
				break;
			}
		}
		return featureToReturn;
	}

}
