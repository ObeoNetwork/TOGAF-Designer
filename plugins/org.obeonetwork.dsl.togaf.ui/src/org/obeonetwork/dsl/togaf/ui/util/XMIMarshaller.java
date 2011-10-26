package org.obeonetwork.dsl.togaf.ui.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.togaf.ui.Activator;

import fr.obeo.dsl.viewpoint.DRepresentation;

public class XMIMarshaller implements Marshaller {

	public byte[] marshall(DRepresentation dRepresentation) {
		ResourceSet resourceSet = new ResourceSetImpl();
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		BufferedOutputStream out = new BufferedOutputStream(bout);
		try {
			Resource resource = resourceSet.createResource(URI.createURI("http:///Diagram.xmi"));
			resource.getContents().add(EcoreUtil.copy(dRepresentation));
			resource.save(out, null);
			out.flush();
			return bout.toByteArray();
		} catch (IOException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot marshall DRepresentation.", e));
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot marshall DRepresentation.", e));
				}
			}
		}
		return null;
	}

	public DRepresentation unMarshall(byte[] bytes) {
		ResourceSet resourceSet = new ResourceSetImpl();
		ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
		BufferedInputStream in = new BufferedInputStream(bin);
		try {
			Resource resource = resourceSet.createResource(URI.createURI("http:///Diagram.xmi"));
			resource.load(in, null);
			DRepresentation dRepresentation = (DRepresentation) resource.getContents().get(0);
			return dRepresentation;
		} catch (IOException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot unMarshall DRepresentation.", e));
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot unMarshall DRepresentation.", e));
				}
			}
		}
		return null;
	}

}
