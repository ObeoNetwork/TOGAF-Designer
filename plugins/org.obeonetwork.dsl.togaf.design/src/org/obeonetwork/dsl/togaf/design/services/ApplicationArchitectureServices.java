/**
 * 
 */
package org.obeonetwork.dsl.togaf.design.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;

/**
 * VSM services for the ApplicationArchitectures elements.
 * 
 * @author jdupont
 * 
 */
public class ApplicationArchitectureServices {

	public List<Function> getFunctionsLinkedToLogicalApplication(
			LogicalApplicationComponent context) {
		Set<Function> functions = new HashSet<Function>();
		for (Service service : context.getImplementsServices()) {
			if (service.getProvidesGovernedInterfaceToAccessFunctions().size() > 0) {
				functions.addAll(service
						.getProvidesGovernedInterfaceToAccessFunctions());
			}
		}
		ArrayList<Function> functionsWithoutDuplicates = new ArrayList<Function>(
				functions);
		return functionsWithoutDuplicates;
	}

	/**
	 * Check is function is bounded by services type of BusinessService.
	 * 
	 * @param context
	 *            a function
	 * @return boolean true if the function is bounded by services type of
	 *         BusinessService false otherwise
	 */
	public boolean isBoundedByBusinessServices(Function context) {
		boolean isBoundedByBusinessServices = false;
		for (Service service : context.getIsBoundedByServices()) {
			if (service instanceof BusinessService) {
				isBoundedByBusinessServices = true;
				break;
			}
		}
		return isBoundedByBusinessServices;
	}

	/**
	 * Return list of business services that bounded the function passed to
	 * parameters
	 * 
	 * @param context
	 *            a function
	 * @return list of business services that bounded the function
	 */
	public List<BusinessService> getBusinessServices(Function context) {
		List<BusinessService> businessServices = new ArrayList<BusinessService>();
		for (Service service : context.getIsBoundedByServices()) {
			if (service instanceof BusinessService) {
				businessServices.add((BusinessService) service);
			}
		}
		return businessServices;
	}

}
