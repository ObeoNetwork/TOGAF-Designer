package org.obeonetwork.dsl.togaf.ui.util;

public enum TogafViewpoint {
	
	BUSINESS("business"),DATA("data"),APPLICATION("application"),TECHNOLOGY("technology");
	
	private final String id;
	 
	private TogafViewpoint(String id) {
		this.id = id;
	}
 
	public String getID() {
		return this.id;
	}

}
