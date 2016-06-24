package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

/**
 * @author Maxime Porhel - Obeo
 */
public class TogafResourceFactory extends XMIResourceFactoryImpl {

	public TogafResourceFactory() {
		super();
	}

	@Override
	public Resource createResource(URI uri) {
		return new TogafResource(uri);
	}

	public static class TogafResource extends XMIResourceImpl {
		public TogafResource(URI uri) {
			super(uri);

			// TODO put this map only during load or add a mechanism to
			// invalidate cache when id changes.
			setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());

			Map<Object, Object> options = getDefaultLoadOptions();
			options.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
			options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
			options.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);
			options.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl(true));
			options.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<>());
		}
	}

}
