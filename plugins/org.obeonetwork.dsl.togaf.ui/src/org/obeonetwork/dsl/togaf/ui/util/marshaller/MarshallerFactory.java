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


/**
 * @author sdrapeau
 * 
 */
public final class MarshallerFactory {

    /**
	 * 
	 */
    private static MarshallerFactory instance = new MarshallerFactory();

    /**
	 * 
	 */
    private MarshallerFactory() {
	// Nada.
    }

    /**
     * @return
     */
    public static MarshallerFactory getInstance() {
	return instance;
    }

    /**
     * @param kind
     * @return
     */
    public Marshaller getMarshaller(MarshallerKind kind) {
	if (kind == MarshallerKind.XMI) {
	    return new XMIMarshaller();
	}
	return null;
    }

    public enum MarshallerKind {
	XMI
	// ,BINARY
    }

}
