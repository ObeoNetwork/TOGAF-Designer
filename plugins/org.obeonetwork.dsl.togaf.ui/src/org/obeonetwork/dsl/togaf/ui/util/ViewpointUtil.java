package org.obeonetwork.dsl.togaf.ui.util;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.google.common.collect.Lists;

import fr.obeo.dsl.viewpoint.business.api.dialect.DialectManager;
import fr.obeo.dsl.viewpoint.description.RepresentationDescription;
import fr.obeo.dsl.viewpoint.description.Viewpoint;
import fr.obeo.dsl.viewpoint.ui.business.api.session.UserSession;

public class ViewpointUtil {

	public static void selectAllTogafViewpoints() {
		for (TogafViewpoint togafViewpoint : TogafViewpoint.values()) {
			selectViewpoint(togafViewpoint.getID());
		}
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
		while (result == null && it.hasNext()) {
			Viewpoint v = it.next();
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
			RepresentationDescription rd =  it
					.next();
			if (representationID.equals(rd.getName())) {
				result = rd;
			}
		}
		return result;
	}
	
}
