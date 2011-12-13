package org.obeonetwork.dsl.togaf.ui.util;

import fr.obeo.dsl.viewpoint.DRepresentation;

public interface Marshaller {

	byte[] marshall(DRepresentation dRepresentation);

	DRepresentation unMarshall(byte[] bytes);

}
