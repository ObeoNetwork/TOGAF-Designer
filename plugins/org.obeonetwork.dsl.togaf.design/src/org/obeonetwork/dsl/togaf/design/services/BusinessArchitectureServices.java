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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process;
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

	/**
	 * Check if service have many Logical Application Component and if the
	 * number of Logical Application Component exceed number max of Logical
	 * Application Component authorized.
	 * 
	 * @param context
	 *            the Service
	 * @return true if number of LAC exceed max value authorized
	 */
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
	 * Check if the function is a function and not a sub function.
	 * 
	 * @param context
	 *            the Function
	 * @return true if the function is a direct function false otherwise
	 */
	public boolean isFirstLevel(Function context) {
		return context.getDecomposesFunction() == null;
	}

	/**
	 * Check if the function is a direct sub function.
	 * 
	 * @param context
	 *            the Function
	 * @return true if the function is a direct sub function false otherwise
	 */
	public boolean isSecondLevel(Function context) {
		return context.getDecomposesFunction() != null
				&& context.getDecomposesFunction().getDecomposesFunction() == null;
	}

	/**
	 * Check if the function is a subFunction (third level or other).
	 * 
	 * @param context
	 *            the Function
	 * @return true if the function is sub function (third level or other),
	 *         false otherwise
	 */
	public boolean isThirdAndOtherLevelFunction(Function context) {
		return context.getDecomposesFunction() != null
				&& context.getDecomposesFunction().getDecomposesFunction() != null;
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
	 * Number max of Logical Application Component authorized.
	 * 
	 * @param context
	 *            the context
	 * @return the number max of Logical Application Component authorized
	 */
	public int numberMaxOfLAC(EObject context) {
		return NUMBER_OF_LAC;
	}

	/**
	 * Return function depending on context
	 * 
	 * @param context
	 *            the context
	 * @return list of functions
	 */
	public List<Function> chooseFunctionToDisplay(EObject context) {
		if (context instanceof BusinessArchitecture) {
			return firstLevelfunction((BusinessArchitecture) context);
		} else if (context instanceof Function) {
			return ((Function) context).getIsDecomposedByFunctions();
		}
		return null;
	}

	/**
	 * Return all functions (and all descendants) from context.
	 * 
	 * @param context
	 *            context
	 * @return collection of functions
	 */
	public Collection<Function> getAllFunctions(EObject context) {
		Set<Function> functions = new HashSet<Function>();
		if (context instanceof BusinessArchitecture) {
			functions.addAll(((BusinessArchitecture) context).getFunctions());
		} else if (context instanceof Function) {
			functions.addAll(getDescendantFunctions((Function) context));
		}
		return functions;
	}

	/**
	 * Return the process linked to OrganizationUnit. A process linked to an
	 * organization unit is a process that have the same businessService that
	 * the OrganizationUnit.
	 * 
	 * @param context
	 *            the OrganizarionUnit
	 * @return List of process
	 */
	public Collection<Process> getProcessesLinkedToOrganizationUnit(
			OrganizationUnit context) {
		List<Service> unitsServices = context.getOwnsAndGovernsServices();
		List<Process> processes = ((BusinessArchitecture) context.eContainer())
				.getProcesses();
		return getProcesses(unitsServices, processes);
	}

	/**
	 * Retrieve the name of the logical Application component linked to the
	 * process and the Organization Unit. Retrieve all intersection informations
	 * system services linked to OrganizationUnit and process. From these
	 * Informations system services retrieve the logical application component
	 * linked to the Information System Services.
	 * 
	 * @param context
	 *            the Organization Unit
	 * @param process
	 *            the process
	 * @return the name of all Logical Application Components linked to the
	 *         Organizarion Unit and process passed to parameters.
	 */
	public String getLabelLogicalApplicationComponent(OrganizationUnit context,
			Process process) {
		Set<LogicalApplicationComponent> lacs = new HashSet<LogicalApplicationComponent>();
		List<Service> unitServices = context.getOwnsAndGovernsServices();
		List<Service> processServices = process.getOrchestratesServices();
		Collection<BusinessService> businessServices = intersectionBusinessService(
				unitServices, processServices);
		Collection<InformationSystemService> informationSystemServices = getInformationSystemServices(businessServices);
		for (InformationSystemService service : informationSystemServices) {
			lacs.addAll(service
					.getIsRealizedThroughLogicalApplicationComponent());
		}
		String lacTodisplay = "";
		for (LogicalApplicationComponent lac : lacs) {
			if (lac.equals(new ArrayList<LogicalApplicationComponent>(lacs)
					.get(lacs.size() - 1))) {
				lacTodisplay += lac.getName();
			} else {
				lacTodisplay += lac.getName() + " - " + "\r" + "\n";
			}
		}
		return lacTodisplay;
	}

	private Collection<Process> getProcesses(List<Service> unitServices,
			List<Process> processes) {
		Set<Process> processesToReturn = new HashSet<Process>();
		for (Process proc : processes) {
			for (Service service : unitServices) {
				if (proc.getOrchestratesServices().contains(service)) {
					processesToReturn.add(proc);
				}
			}
		}
		return processesToReturn;
	}

	private Collection<BusinessService> intersectionBusinessService(
			List<Service> col1, List<Service> col2) {
		Set<BusinessService> intersectionList = new HashSet<BusinessService>();
		for (Service serv : col1) {
			if (serv instanceof BusinessService && col2.contains(serv)) {
				intersectionList.add((BusinessService) serv);
			}
		}
		return intersectionList;
	}

	private Collection<InformationSystemService> getInformationSystemServices(
			Collection<BusinessService> businessServices) {
		Set<InformationSystemService> informationSystemServices = new HashSet<InformationSystemService>();
		for (BusinessService bs : businessServices) {
			for (Element element : bs.getDelegates()) {
				if (element instanceof InformationSystemService) {
					informationSystemServices
							.add((InformationSystemService) element);
				}
			}
		}
		return informationSystemServices;
	}

}
