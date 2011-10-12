package org.obeonetwork.dsl.togaf.ui.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Architecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;

public class SemanticModelUtil {

	public static EnterpriseArchitecture getEnterpriseArchitecture() {
		Resource resource = CollaborativeSessionUtil.getSemanticResource();
		EObject semanticRoot = resource.getContents().iterator().next();

		EnterpriseArchitecture result = null;
		if (semanticRoot instanceof EnterpriseArchitecture) {
			result = (EnterpriseArchitecture) semanticRoot;
		}
		return result;
	}

	public static BusinessArchitecture getBusinessArchitecture() {
		BusinessArchitecture result = null;
		EnterpriseArchitecture ea = getEnterpriseArchitecture();
		if (ea != null) {
			result = getBusinessArchitecture(ea);
		}
		return result;
	}

	public static BusinessArchitecture getBusinessArchitecture(
			EnterpriseArchitecture ea) {
		if (ea == null) {
			return null;
		}

		BusinessArchitecture result = null;
		Iterator<Architecture> architectures = ea.getArchitectures().iterator();
		while (result == null && architectures.hasNext()) {
			Architecture a = architectures.next();
			if (a instanceof BusinessArchitecture) {
				result = (BusinessArchitecture) a;
			}
		}
		return result;
	}

}
