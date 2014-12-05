package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Architecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;

/**
 * 
 * @author Stephane Drapeau - Obeo
 * 
 */
public class IdUtil {

	/**
	 * @return
	 */
	public static String generateId() {
		return EcoreUtil.generateUUID();
	}

	/**
	 * Check whether the given ID can be used to identify an Element,
	 * Architecture or EnterpriseArchitecture.
	 * 
	 * @param eResource
	 * @param newID
	 * @param cdoId
	 * @return false if the element id uniqueness check is enabled and the id is
	 *         already in use in one of the elements of this element's resource,
	 *         true in any other case.
	 */
	public static boolean canIdBeSet(Resource eResource, String newID,
			CDOID cdoID) {
		boolean canIdBeSet = false;
		switch (ContentfwkPreferences.getElementIdAccessibility()) {
		case ALWAYS:
			canIdBeSet = IdUtil.canIdBeSet(eResource, newID);
			break;
		case BEFORE_SAVE:
			canIdBeSet = (cdoID == null || cdoID.isTemporary())
					&& IdUtil.canIdBeSet(eResource, newID);
			break;
		case NEVER:
			// Do nothing
			break;
		}
		return canIdBeSet;
	}

	/**
	 * Check whether the given ID can be used to identify an Element,
	 * Architecture or EnterpriseArchitecture.
	 * 
	 * @param newID
	 * @return false if the element id uniqueness check is enabled and the id is
	 *         already in use in one of the elements of this element's resource,
	 *         true in any other case.
	 */
	private static boolean canIdBeSet(Resource eResource, String newID) {
		boolean canIdBeSet = true;
		if (eResource != null
				&& ContentfwkPreferences.isElementIdUnicityCheckEnabled()
				&& newID != null && !newID.isEmpty()) {
			TreeIterator<EObject> elementIterator = eResource.getContents()
					.get(0).eAllContents();
			while (elementIterator.hasNext() && canIdBeSet) {
				EObject object = elementIterator.next();
				if (object instanceof Element) {
					Element element = (Element) object;
					if (newID.equals(element.getID())) {
						canIdBeSet = false;
					}
				} else if (object instanceof Architecture) {
					Architecture element = (Architecture) object;
					if (newID.equals(element.getID())) {
						canIdBeSet = false;
					}
				} else if (object instanceof EnterpriseArchitecture) {
					EnterpriseArchitecture element = (EnterpriseArchitecture) object;
					if (newID.equals(element.getID())) {
						canIdBeSet = false;
					}
				}
			}
		}
		return canIdBeSet;
	}

}
