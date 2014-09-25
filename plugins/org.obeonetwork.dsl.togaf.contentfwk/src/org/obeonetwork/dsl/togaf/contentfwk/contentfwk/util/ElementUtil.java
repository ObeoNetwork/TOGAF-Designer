package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class ElementUtil {

	public static String generateId() {
		return EcoreUtil.generateUUID();
	}
	
}
