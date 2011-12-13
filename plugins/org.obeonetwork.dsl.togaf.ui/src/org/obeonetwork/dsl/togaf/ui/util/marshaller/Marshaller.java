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

import fr.obeo.dsl.viewpoint.DRepresentation;

/**
 * @author sdrapeau
 * 
 */
public interface Marshaller {

    /**
     * Marshall a DRepresentation
     * 
     * @param dRepresentation
     *            The DRepresentation to marshall
     * @return the bytes array representing the DRepresentation
     */
    byte[] marshall(DRepresentation dRepresentation);

    /**
     * unmarshall a DRepresentation
     * 
     * @param bytes
     *            the bytes array representing a DRepresentation to unmarshall
     * @return The unmarsalled DRepresentation
     */
    DRepresentation unMarshall(byte[] bytes);

}
