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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;

/**
 * VSM services for the TechnologyArchitectures elements.
 * 
 * @author jdupont
 * 
 */
public class TechnologyArchitectureServices {

	/**
	 * Return the Physical Application Component linked to Physical Technology
	 * Component.
	 * 
	 * @param context
	 *            the context
	 * @param ptc
	 *            The physical Technology component
	 * @return list of Physical Application component linked to the PTC
	 */
	public List<PhysicalApplicationComponent> getPhysicalApplicationComponents(
			EObject context, PhysicalTechnologyComponent ptc) {
		Set<PhysicalApplicationComponent> physicalApplicationComponents = new HashSet<PhysicalApplicationComponent>();
		if (context instanceof ApplicationArchitecture) {
			for (PhysicalApplicationComponent pac : ((ApplicationArchitecture) context)
					.getPhysicalApplicationComponents()) {
				if (descendantHaveAPhysicalTechnologyComponent(pac, ptc)
						&& pac.getDecomposesPhysicalApplicationComponent() == null) {
					physicalApplicationComponents.add(pac);
				} else if (pac.getIsRealizedByPhysicalTechnologyComponents()
						.contains(ptc)
						&& pac.getDecomposesPhysicalApplicationComponent() == null) {
					physicalApplicationComponents.add(pac);
				}
			}
		} else if (context instanceof PhysicalApplicationComponent) {
			PhysicalApplicationComponent contextAsPAC = (PhysicalApplicationComponent) context;
			if (descendantHaveAPhysicalTechnologyComponent(contextAsPAC, ptc)) {
				for (PhysicalApplicationComponent pac : contextAsPAC
						.getIsDecomposedByPhysicalApplicationComponents()) {
					if (descendantHaveAPhysicalTechnologyComponent(pac, ptc)
							|| pac.getIsRealizedByPhysicalTechnologyComponents()
									.contains(ptc)) {
						physicalApplicationComponents.add(pac);
						break;
					}
				}
			}
		}
		return new ArrayList<PhysicalApplicationComponent>(
				physicalApplicationComponents);
	}

	/**
	 * Return the Physical Application Components linked to the physical
	 * Technology component.
	 * 
	 * @param ptc
	 *            the physical technology component.
	 * @return list of Physical Application Components
	 */
	public List<PhysicalApplicationComponent> getPhysicalApplicationComponents(
			PhysicalTechnologyComponent ptc) {
		Set<PhysicalApplicationComponent> physicalApplicationComponents = new HashSet<PhysicalApplicationComponent>();
		for (PhysicalApplicationComponent pac : ptc
				.getRealizesPhysicalApplicationComponents()) {
			physicalApplicationComponents.add(pac);
			physicalApplicationComponents
					.addAll(getContainerPhysicalApplicationComponent(pac));
		}
		return new ArrayList<PhysicalApplicationComponent>(
				physicalApplicationComponents);
	}

	/**
	 * Return the logical Application components linked to the Physical
	 * Application Component.
	 * 
	 * @param context
	 *            , context can be an Application Architecture or a Logical
	 *            Application Component
	 * @param pacs
	 *            the physical Application components
	 * @return list of Logical Application Component
	 */
	public List<LogicalApplicationComponent> getLogicalApplicationComponent(
			EObject context, List<PhysicalApplicationComponent> pacs) {
		Set<LogicalApplicationComponent> logicalApplicationComponents = new HashSet<LogicalApplicationComponent>();
		if (context instanceof ApplicationArchitecture) {
			for (LogicalApplicationComponent lac : ((ApplicationArchitecture) context)
					.getLogicalApplicationComponents()) {
				for (PhysicalApplicationComponent pac : pacs) {
					if (descendantHavePhysicalApplicationComponent(lac, pac)
							&& lac.getDecomposesLogicalApplicationComponent() == null) {
						logicalApplicationComponents.add(lac);
					} else if (lac
							.getIsExtendedByPhysicalApplicationComponents()
							.contains(pac)
							&& lac.getDecomposesLogicalApplicationComponent() == null) {
						logicalApplicationComponents.add(lac);
					}
				}

			}
		} else if (context instanceof LogicalApplicationComponent) {
			LogicalApplicationComponent contextAsLAC = (LogicalApplicationComponent) context;
			// for (PhysicalApplicationComponent pac : pacs){
			// if (descendantHavePhysicalApplicationComponent(contextAsLAC,
			// pac)){
			for (LogicalApplicationComponent lac : contextAsLAC
					.getIsDecomposedByLogicalApplicationComponents()) {
				// if (descendantHavePhysicalApplicationComponent(lac, pac) ||
				// lac.getIsExtendedByPhysicalApplicationComponents().contains(pac)){
				logicalApplicationComponents.add(lac);
				break;
				// }
				// }
			}
			// }
		}
		return new ArrayList<LogicalApplicationComponent>(
				logicalApplicationComponents);
	}

	/**
	 * Retrieve the Organization units linked to the informations system
	 * Services.
	 * 
	 * @param context
	 *            , the context, can be a BusinessArchitecture or an
	 *            Organization Unit
	 * @param informationServices
	 *            the informations system Services
	 * @return list of Organizations units.
	 */
	public List<OrganizationUnit> getOrganizationUnits(EObject context,
			List<InformationSystemService> informationServices) {
		Set<OrganizationUnit> organizationUnits = new HashSet<OrganizationUnit>();
		if (context instanceof BusinessArchitecture) {
			for (OrganizationUnit ou : ((BusinessArchitecture) context)
					.getUnits()) {
				for (InformationSystemService is : informationServices) {
					if (descendantHaveLogicalApplicationComponent(ou, is)) {
						organizationUnits.add(ou);
					} else if (ou.getDecomposesOrganizationUnit() == null) {
						for (Service service : ou.getOwnsAndGovernsServices()) {
							if (service instanceof BusinessService) {
								BusinessService bs = (BusinessService) service;
								if (bs.getDelegates().contains(is)) {
									organizationUnits.add(ou);
								}
							}
						}
					}
				}
			}
		} else if (context instanceof OrganizationUnit) {
			OrganizationUnit contextAsOU = (OrganizationUnit) context;
			for (InformationSystemService iss : informationServices) {
				if (descendantHaveLogicalApplicationComponent(contextAsOU, iss)) {
					for (OrganizationUnit ou : contextAsOU
							.getIsDecomposedByOrganizationUnits()) {
						if (descendantHaveLogicalApplicationComponent(ou, iss)) {
							organizationUnits.add(ou);
						} else {
							for (Service service : ou
									.getOwnsAndGovernsServices()) {
								if (service instanceof BusinessService) {
									BusinessService bs = (BusinessService) service;
									if (bs.getDelegates().contains(iss)) {
										organizationUnits.add(ou);
									}
								}
							}
						}
					}
				}
			}
		}
		return new ArrayList<OrganizationUnit>(organizationUnits);
	}

	/**
	 * Retrieve the Information System Services linked to the physical
	 * Application Components.
	 * 
	 * @param context
	 *            an Application Architecture
	 * @param pacs
	 *            the Physical Application components
	 * @return list of Information System Services linked to the Physical
	 *         Application components
	 */
	public List<InformationSystemService> getInformationSystemServices(
			ApplicationArchitecture context,
			List<PhysicalApplicationComponent> pacs) {
		Set<InformationSystemService> services = new HashSet<InformationSystemService>();
		for (LogicalApplicationComponent lac : getLogicalApplicationComponents(
				context, pacs)) {
			for (Service service : lac.getImplementsServices()) {
				if (service instanceof InformationSystemService) {
					services.add((InformationSystemService) service);
				}
			}
		}
		return new ArrayList<InformationSystemService>(services);
	}

	/**
	 * Retrieve the Business Services linked to the Physical Application
	 * Components.
	 * 
	 * @param context
	 *            the Organization Unit
	 * @param pacs
	 *            the Physical Application components
	 * @return a list of Business Services
	 */
	public Collection<BusinessService> getBusinessSystemService(
			OrganizationUnit context, List<PhysicalApplicationComponent> pacs) {
		Set<BusinessService> services = new HashSet<BusinessService>();
		ApplicationArchitecture aa = null;
		EObject container = eContainer(context, "EnterpriseArchitecture");
		if (container instanceof EnterpriseArchitecture) {
			for (EObject obj : ((EnterpriseArchitecture) container)
					.getArchitectures()) {
				if (obj instanceof ApplicationArchitecture) {
					aa = (ApplicationArchitecture) obj;
					break;
				}
			}
		}
		for (Service bs : context.getOwnsAndGovernsServices()) {
			if (bs instanceof BusinessService) {
				for (Element is : ((BusinessService) bs).getDelegates()) {
					if (is instanceof InformationSystemService) {
						if (getInformationSystemServices(aa, pacs).contains(is)) {
							services.add((BusinessService) bs);
						}
					}
				}
			}
		}
		return services;
	}

	private boolean descendantHaveAPhysicalTechnologyComponent(
			PhysicalApplicationComponent context,
			PhysicalTechnologyComponent ptc) {
		boolean havePhysicalTechnologyComponent = false;
		if (context.getIsDecomposedByPhysicalApplicationComponents() != null) {
			for (PhysicalApplicationComponent pac : context
					.getIsDecomposedByPhysicalApplicationComponents()) {
				if (pac.getIsRealizedByPhysicalTechnologyComponents().contains(
						ptc)) {
					havePhysicalTechnologyComponent = true;
					break;
				} else if (pac.getIsDecomposedByPhysicalApplicationComponents() != null) {
					havePhysicalTechnologyComponent = descendantHaveAPhysicalTechnologyComponent(
							pac, ptc);
				}
			}
		}
		return havePhysicalTechnologyComponent;
	}

	private boolean descendantHavePhysicalApplicationComponent(
			LogicalApplicationComponent context,
			PhysicalApplicationComponent pac) {
		boolean havePhysicalApplicationComponent = false;
		if (context.getIsDecomposedByLogicalApplicationComponents() != null) {
			for (LogicalApplicationComponent lac : context
					.getIsDecomposedByLogicalApplicationComponents()) {
				if (lac.getIsExtendedByPhysicalApplicationComponents()
						.contains(pac)) {
					havePhysicalApplicationComponent = true;
					break;
				} else if (lac.getIsDecomposedByLogicalApplicationComponents() != null) {
					havePhysicalApplicationComponent = descendantHavePhysicalApplicationComponent(
							lac, pac);
				}
			}
		}
		return havePhysicalApplicationComponent;
	}

	private boolean descendantHaveLogicalApplicationComponent(
			OrganizationUnit context, InformationSystemService iss) {
		boolean haveLogicalApplicationComponent = false;
		if (context.getIsDecomposedByOrganizationUnits() != null) {
			for (OrganizationUnit ou : context
					.getIsDecomposedByOrganizationUnits()) {
				for (Service service : ou.getOwnsAndGovernsServices()) {
					if (service instanceof BusinessService) {
						BusinessService bs = (BusinessService) service;
						if (bs.getDelegates().contains(iss)) {
							haveLogicalApplicationComponent = true;
						} else if (ou.getIsDecomposedByOrganizationUnits() != null) {
							haveLogicalApplicationComponent = descendantHaveLogicalApplicationComponent(
									ou, iss);
						}
					}
				}
			}
		}
		return haveLogicalApplicationComponent;
	}

	private List<PhysicalApplicationComponent> getContainerPhysicalApplicationComponent(
			PhysicalApplicationComponent pac) {
		Set<PhysicalApplicationComponent> pacContainers = new HashSet<PhysicalApplicationComponent>();
		if (pac != null) {
			PhysicalApplicationComponent pacContainer = pac
					.getDecomposesPhysicalApplicationComponent();
			if (pacContainer != null) {
				pacContainers.add(pacContainer);
				pacContainers
						.addAll(getContainerPhysicalApplicationComponent(pacContainer));
			}
		}
		return new ArrayList<PhysicalApplicationComponent>(pacContainers);
	}

	private List<LogicalApplicationComponent> getLogicalApplicationComponents(
			ApplicationArchitecture context,
			List<PhysicalApplicationComponent> pacs) {
		Set<LogicalApplicationComponent> lacs = new HashSet<LogicalApplicationComponent>();
		lacs.addAll(getLogicalApplicationComponent(context, pacs));
		for (LogicalApplicationComponent lac : context
				.getLogicalApplicationComponents()) {
			lacs.addAll(getLogicalApplicationComponent(lac, pacs));
		}
		return new ArrayList<LogicalApplicationComponent>(lacs);
	}

	private EObject eContainer(EObject obj, String toFind) {
		EObject objBeg = obj;
		while (!objBeg.getClass().getName().contains(toFind) && objBeg != null) {
			objBeg = objBeg.eContainer();
		}
		return objBeg;
	}

}
