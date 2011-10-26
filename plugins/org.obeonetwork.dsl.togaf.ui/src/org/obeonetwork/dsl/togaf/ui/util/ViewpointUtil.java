package org.obeonetwork.dsl.togaf.ui.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Lists;

import fr.obeo.dsl.viewpoint.business.api.dialect.DialectManager;
import fr.obeo.dsl.viewpoint.description.RepresentationDescription;
import fr.obeo.dsl.viewpoint.description.Viewpoint;
import fr.obeo.dsl.viewpoint.ui.business.api.session.UserSession;

public class ViewpointUtil {

	public static void selectAllTogafViewpoints() {
		TogafViewpoint[] vs = TogafViewpoint.values();
		List<String> viewpoints = new ArrayList<String>();
		for (TogafViewpoint tv : vs) {
			viewpoints.add(tv.getID());
		}
		UserSession.from(CollaborativeSessionUtil.getCollaborativeSession())
				.selectViewpoints(viewpoints);
	}

	public static Collection<Viewpoint> getSelectedViewpoints() {
		return CollaborativeSessionUtil.getCollaborativeSession()
				.getSelectedViewpoints();
	}

	public static void selectViewpoint(String viewpointName) {
		UserSession.from(CollaborativeSessionUtil.getCollaborativeSession())
				.selectViewpoint(viewpointName);
	}

	public static Viewpoint getViewpointIfSelected(String viewpointID) {
		if (viewpointID == null || "".equals(viewpointID)) {
			return null;
		}

		Viewpoint result = null;
		Iterator<Viewpoint> it = getSelectedViewpoints().iterator();
		System.err.println("Searched : " + viewpointID);

		while (result == null && it.hasNext()) {
			Viewpoint v = it.next();
			System.err.println("Searched : " + viewpointID + " // candidate : "
					+ v.getName());
			if (viewpointID.equals(v.getName())) {
				result = v;
			}
		}
		return result;
	}

	public static Collection<RepresentationDescription> getAvailableRepresentationDescriptions(
			Viewpoint viewpoint, EObject semanticElement) {
		return DialectManager.INSTANCE.getAvailableRepresentationDescriptions(
				Lists.newArrayList(viewpoint), semanticElement);
	}

	public static RepresentationDescription getRepresentationDescription(
			Viewpoint viewpoint, EObject semanticElement,
			String representationID) {
		RepresentationDescription result = null;
		Iterator<RepresentationDescription> it = getAvailableRepresentationDescriptions(
				viewpoint, semanticElement).iterator();
		while (result == null && it.hasNext()) {
			RepresentationDescription rd = it.next();
			if (representationID.equals(rd.getName())) {
				result = rd;
			}
		}
		return result;
	}

}
