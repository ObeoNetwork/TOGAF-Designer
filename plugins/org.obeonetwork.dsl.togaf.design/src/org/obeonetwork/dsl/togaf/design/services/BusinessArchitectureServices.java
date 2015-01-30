/**
 * 
 */
package org.obeonetwork.dsl.togaf.design.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;

/**
 * VSM services for the BusinessArchitectures elements.
 * 
 * @author jdupont
 * 
 */
public class BusinessArchitectureServices {

	public static int NUMBER_OF_LAC = 1;

	/**
	 * Service to display only first level function.
	 * 
	 * @param context
	 *            the BusinessArchitecure
	 * @return list of first level function
	 */
	public List<Function> firstLevelfunction(BusinessArchitecture context) {
		List<Function> firstLevelfunctions = new ArrayList<Function>();
		for (Function function : context.getFunctions()) {
			if (function.getDecomposesFunction() == null) {
				firstLevelfunctions.add(function);
			}
		}
		return firstLevelfunctions;
	}

	public boolean haveDescendantServiceWithManyLogicalApplicationComponent(
			Service context) {
		boolean haveServiceWithManyLogicalApplicationComponent = false;
		for (Service service : getDescendantServices(context)) {
			if (service.getIsRealizedThroughLogicalApplicationComponent()
					.size() > NUMBER_OF_LAC) {
				haveServiceWithManyLogicalApplicationComponent = true;
				break;
			}
		}
		return haveServiceWithManyLogicalApplicationComponent;

	}

	private Collection<Service> getDescendantServices(Service service) {
		Set<Service> descendantsServices = new HashSet<Service>(
				service.getIsDecomposedByServices());
		for (Service subService : service.getIsDecomposedByServices()) {
			descendantsServices.addAll(getDescendantServices(subService));
		}
		return descendantsServices;
	}

	/**
	 * Check if the function have descendant function (isDecomposedByFunction)
	 * with many logicalApplicationComponent.
	 * 
	 * @param context
	 *            the function
	 * @return true if the function have descendant functions that have many
	 *         Logical Application Component
	 */
	public boolean haveDescendantFunctionWithManyLogicalApplicationComponent(
			Function context) {
		boolean haveFunctionWithManyLogicalApplicationComponent = false;
		for (Function function : getDescendantFunctions(context)) {
			for (Service service : function.getIsBoundedByServices()) {
				if (service.getIsRealizedThroughLogicalApplicationComponent()
						.size() > NUMBER_OF_LAC) {
					haveFunctionWithManyLogicalApplicationComponent = true;
					break;
				}
			}
			if (haveFunctionWithManyLogicalApplicationComponent) {
				break;
			}
		}
		return haveFunctionWithManyLogicalApplicationComponent;
	}

	/**
	 * Return all descendant functions.
	 * 
	 * @param function
	 *            the function
	 * @return the functions that is decomposed by the function
	 */
	private Collection<Function> getDescendantFunctions(Function function) {
		Set<Function> descendantsFunctions = new HashSet<Function>(
				function.getIsDecomposedByFunctions());
		for (Function subFunction : function.getIsDecomposedByFunctions()) {
			descendantsFunctions.addAll(getDescendantFunctions(subFunction));
		}
		return descendantsFunctions;
	}

	/**
	 * Return Logical Application Component associated to a function.
	 * 
	 * @param context
	 *            the Function
	 * @return list of Logical Application Component
	 */
	public List<LogicalApplicationComponent> getLogicalApplicationComponent(
			Function context) {
		List<LogicalApplicationComponent> lacs = new ArrayList<LogicalApplicationComponent>();
		for (Service service : context.getIsBoundedByServices()) {
			lacs = service.getIsRealizedThroughLogicalApplicationComponent();
		}
		return lacs;
	}

	/**
	 * Service to display only first level BusinessService.
	 * 
	 * @param context
	 *            the BusinessArchitecure
	 * @return list of first level BusinessService
	 */
	public List<BusinessService> firstLevelBusinessService(
			BusinessArchitecture context) {
		List<BusinessService> firstLevelServices = new ArrayList<BusinessService>();
		for (BusinessService service : context.getServices()) {
			if (service.getDecomposesServices().size() == 0) {
				firstLevelServices.add(service);
			}
		}
		return firstLevelServices;
	}

	/**
	 * If a Service has many LogicalApplicationComponent, return all
	 * LogicalApplicationComponent contained in the sService, otherwise an empty
	 * list.
	 * 
	 * @param context
	 *            The SService
	 * @return A list of LogicalApplicationComponent
	 */
	public List<LogicalApplicationComponent> manyLogicalApplicationComponent(
			BusinessService context) {
		List<LogicalApplicationComponent> lacs = new ArrayList<LogicalApplicationComponent>();
		lacs = context.getIsRealizedThroughLogicalApplicationComponent();
		return lacs;
	}

	/**
	 * Service to display only second level function.
	 * 
	 * @param context
	 *            the BusinessArchitecure
	 * @return list of second level function
	 */
	public List<Function> secondLevelFunction(BusinessArchitecture context) {
		List<Function> secondLevelfunctions = new ArrayList<Function>();
		for (Function function : context.getFunctions()) {
			if (function.getDecomposesFunction() != null
					&& function.getDecomposesFunction().getDecomposesFunction() == null) {
				secondLevelfunctions.add(function);
			}
		}
		return secondLevelfunctions;
	}

	/**
	 * Service to display third and other level function.
	 * 
	 * @param context
	 *            the BusinessArchitecure
	 * @return list of third and other level function
	 */
	public List<Function> thirdAndOtherLevelFunction(
			BusinessArchitecture context) {
		List<Function> thirdLevelfunctions = new ArrayList<Function>();
		for (Function function : context.getFunctions()) {
			if (function.getDecomposesFunction() != null
					&& function.getDecomposesFunction().getDecomposesFunction() != null) {
				thirdLevelfunctions.add(function);
			}
		}
		return thirdLevelfunctions;
	}

	/**
	 * Check the type of container.
	 * 
	 * @param context
	 *            the context
	 * @param param
	 *            the param
	 * @return true if conditionis check false otherwise
	 */
	public boolean isContainerTypeOf(EObject context, String param) {
		boolean result = false;
		if (param.equals("Diagram")) {
			result = true;
		} else if (param.equals("FunctionOnly")) {
			result = true;
		} else if (param.equals("FunctionSecondeLevel")) {
			result = true;
		} else if (param.equals("FunctionThirdLeverAndMore")) {
			result = true;
		}
		return result;
	}

	public int numberMaxOfLAC(EObject context) {
		return NUMBER_OF_LAC;
	}
	
	public boolean deleteImplementsService(LogicalApplicationComponent context){
		//<%$element.~target.filter("DTreeItem").eContainer().target%>
		return true;
	}
}
