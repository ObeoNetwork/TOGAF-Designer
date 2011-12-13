package org.obeonetwork.dsl.togaf.ui.util;

public class MarshallerFactory {
	private static MarshallerFactory instance = new MarshallerFactory();

	private MarshallerFactory() {
	}

	public static MarshallerFactory getInstance() {
		return instance;
	}

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
