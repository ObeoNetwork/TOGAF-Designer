/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.togaf.ui.util.marshaller;

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

/**
 * @author sdrapeau
 * 
 */
public class XMIMarshaller implements Marshaller {

    private static final String RESOURCE_URI = "http:///Diagram.xmi"; //$NON-NLS-1$

    /*
     * (non-Javadoc)
     * 
     * @see org.obeonetwork.dsl.togaf.ui.util.marshaller.Marshaller#marshall(fr.obeo.dsl.viewpoint.DRepresentation)
     */
    public byte[] marshall(DRepresentation dRepresentation) {
	ResourceSet resourceSet = new ResourceSetImpl();
	ByteArrayOutputStream bout = new ByteArrayOutputStream();
	BufferedOutputStream out = new BufferedOutputStream(bout);
	try {
	    Resource resource = resourceSet.createResource(URI.createURI(RESOURCE_URI));
	    resource.getContents().add(EcoreUtil.copy(dRepresentation));
	    resource.save(out, null);
	    out.flush();
	    return bout.toByteArray();
	} catch (IOException e) {
	    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.XMIMarshaller_1, e));
	} finally {
	    if (out != null) {
		try {
		    out.close();
		} catch (IOException e) {
		    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.XMIMarshaller_2, e));
		}
	    }
	}
	return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.obeonetwork.dsl.togaf.ui.util.marshaller.Marshaller#unMarshall(byte[])
     */
    public DRepresentation unMarshall(byte[] bytes) {
	ResourceSet resourceSet = new ResourceSetImpl();
	ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
	BufferedInputStream in = new BufferedInputStream(bin);
	try {
	    Resource resource = resourceSet.createResource(URI.createURI(RESOURCE_URI));
	    resource.load(in, null);
	    DRepresentation dRepresentation = (DRepresentation) resource.getContents().get(0);
	    return EcoreUtil.copy(dRepresentation);
	} catch (IOException e) {
	    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.XMIMarshaller_3, e));
	} finally {
	    if (in != null) {
		try {
		    in.close();
		} catch (IOException e) {
		    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.XMIMarshaller_4, e));
		}
	    }
	}
	return null;
    }

}
