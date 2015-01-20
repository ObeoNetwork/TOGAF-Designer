/**
 * 
 */
package org.obeonetwork.dsl.togaf.design.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	public List<Function> getFunctionsLinkedToLogicalApplication(LogicalApplicationComponent context){
		List<Function> functions = new ArrayList<Function>();
		for (Service service : context.getImplementsServices()){
			if (service.getProvidesGovernedInterfaceToAccessFunctions().size() > 0){
				functions.addAll(service.getProvidesGovernedInterfaceToAccessFunctions());
			}			
		}
		//Remove duplicate
		Set<Function> set = new HashSet<Function>() ;
        set.addAll(functions) ;
        ArrayList<Function> functionsWithoutDuplicates = new ArrayList<Function>(set) ;
		return functionsWithoutDuplicates;
	}
		
}
