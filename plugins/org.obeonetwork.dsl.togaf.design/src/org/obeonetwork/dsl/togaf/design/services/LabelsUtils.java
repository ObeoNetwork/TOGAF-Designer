package org.obeonetwork.dsl.togaf.design.services;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Label;

public class LabelsUtils {
	
	public String formatLabels(Element context) {
		StringBuilder sb = new StringBuilder();
		for (Label label : context.getCategory()) {
			if (sb.length() > 0) {
				sb.append(", ");
			}
			sb.append(label.getName());
		}
		return sb.toString();
	}

}
