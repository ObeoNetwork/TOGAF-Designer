/**
 * 
 */
package org.obeonetwork.dsl.togaf.design.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;

import fr.obeo.dsl.viewpoint.DDiagramElement;
import fr.obeo.dsl.viewpoint.DNode;
import fr.obeo.dsl.viewpoint.DNodeContainer;

/**
 * VSM services for the ApplicationArchitectures elements.
 * 
 * @author jdupont
 * 
 */
public class ApplicationArchitectureServices {

	/**
	 * Return the functions linked to a logical Application Component. A
	 * function linked to a Logical Application Component is a function that was
	 * linked to the LAC by service. The LAC implements Information System
	 * Services, the Information System Service is Delegated By a Business
	 * Service that provide Governed Interface To Access Function. This is
	 * theses functions that was linked to Logical Application component.
	 * 
	 * @param context
	 *            the Logical Application Component
	 * @return list of functions linked to Logical Application Component
	 */
	public List<Function> getFunctionsLinkedToLogicalApplication(
			LogicalApplicationComponent context) {
		Set<Function> functions = new HashSet<Function>();
		for (Service informationSystemService : context.getImplementsServices()) {
			if (informationSystemService instanceof InformationSystemService) {
				for (Element businessService : ((InformationSystemService) informationSystemService)
						.getIsDelegatedBy()) {
					if (businessService instanceof BusinessService) {
						functions
								.addAll(((BusinessService) businessService)
										.getProvidesGovernedInterfaceToAccessFunctions());
					}
				}
			}
		}
		ArrayList<Function> functionsWithoutDuplicates = new ArrayList<Function>(
				functions);
		return functionsWithoutDuplicates;
	}

	/**
	 * Return the sub function of function (isDecomposedByFunctions)
	 * 
	 * @param function
	 *            context
	 * @return List of subfunctions
	 */
	public List<Function> getFunctionsLinkedToLogicalApplication(
			Function function) {
		return function.getIsDecomposedByFunctions();
	}

	/**
	 * Check if function is bounded by services type of BusinessService.
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

	/**
	 * Return list of services that not displayed on diagram. Return list of
	 * Information System Service if the context is a Logical Application
	 * Component, list of Business Service if the context is a Function.
	 * 
	 * @param context
	 *            the context
	 * @param containerView
	 *            the containerView variable
	 * @return list of services
	 */
	public List<Service> getServicetoSelectionPopup(EObject context,
			EObject containerView) {
		List<Service> services = new ArrayList<Service>();
		if (context instanceof LogicalApplicationComponent) {
			services = ((LogicalApplicationComponent) context)
					.getImplementsServices();
			List<BusinessService> businessServicesToRemove = new ArrayList<BusinessService>();
			for (Service service : services) {
				if (service instanceof BusinessService) {
					businessServicesToRemove.add((BusinessService) service);
				}
			}
			services.removeAll(businessServicesToRemove);
		} else if (context instanceof Function) {
			services = ((Function) context).getIsBoundedByServices();
			List<InformationSystemService> informationSystemServicesToRemove = new ArrayList<InformationSystemService>();
			for (Service service : services) {
				if (service instanceof InformationSystemService) {
					informationSystemServicesToRemove
							.add((InformationSystemService) service);
				}
			}
			services.removeAll(informationSystemServicesToRemove);
		}
		// Remove the service that already displayed on diagram
		List<Service> servicesAreadyDisplayed = new ArrayList<Service>();
		for (EObject eObject : containerView.eContents()) {
			if (eObject instanceof DNode) {
				if (((DNode) eObject).getTarget() instanceof Service) {
					servicesAreadyDisplayed.add((Service) ((DNode) eObject)
							.getTarget());
				}
			}
		}
		services.removeAll(servicesAreadyDisplayed);
		return services;
	}

	/**
	 * Return list of BusinessService that correspond to the function in the
	 * LogicalApplicationComponent
	 * 
	 * @param context
	 *            the context
	 * @return the list of BusinessServcie
	 */
	public List<BusinessService> getBusinessServiceToJoinFunctionToLogicalApplicationComponent(
			EObject context, EObject containerView) {
		Set<BusinessService> businessServices = new HashSet<BusinessService>();
		if (context instanceof LogicalApplicationComponent) {
			for (Service informationSystemService : ((LogicalApplicationComponent) context)
					.getImplementsServices()) {
				if (informationSystemService instanceof InformationSystemService) {
					for (Element businessService : ((InformationSystemService) informationSystemService)
							.getIsDelegatedBy()) {
						if (businessService instanceof BusinessService) {
							businessServices
									.add((BusinessService) businessService);
						}
					}
				}
			}
		}else if (context instanceof Function){
			if (containerView instanceof DNodeContainer){
				LogicalApplicationComponent lac = eContainerLogicalApplicationComponent((DNodeContainer)containerView);
				return getBusinessServiceToJoinFunctionToLogicalApplicationComponent(lac, containerView);
			}
		}
		return new ArrayList<BusinessService>(businessServices);
	}

	/**
	 * Check if the sourceView and the targetView have the same container
	 * (LogicalApplicationComponent View) in Logical Component Functional Scope
	 * Diagram.
	 * 
	 * @param context
	 *            the context
	 * @param sourceView
	 *            the Information System Service Bordered Node
	 * @param targetView
	 *            the Business Service Bordered Node
	 * @return a boolean true if the sourceView and the targetView belong to the
	 *         samed nodeContainer corresponding to Logical Application
	 *         Component
	 */
	public boolean haveSameContainerParent(EObject context, EObject sourceView,
			EObject targetView) {
		if (((DNodeContainer) sourceView.eContainer())
				.getTarget()
				.equals(eContainerLogicalApplicationComponent(((DNodeContainer) targetView
						.eContainer())))) {
			return true;
		} else {
			return false;
		}
	}

	private LogicalApplicationComponent eContainerLogicalApplicationComponent(
			DNodeContainer nodeContainer) {
		DDiagramElement container = nodeContainer;
		while (!(container.getTarget() instanceof LogicalApplicationComponent)) {
			container = (DDiagramElement) container.eContainer();
		}
		return (LogicalApplicationComponent) container.getTarget();
	}
}
