package org.obeonetwork.dsl.togaf.design.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;

public class ApplicationArchitecture {

	// public List<Location>
	// getExternalLocationContainingPhysicalApplicationComponentOrActorTaggedInTheContainer(
	// Container container) {
	// List<Location> result = new ArrayList<Location>();
	// for (Label label : container.getLabels()) {
	// for (Element element : label.getOwnedElements()) {
	// if (element instanceof Actor) {
	// Actor actor = (Actor) element;
	// Location location = actor.getOperatesInLocation();
	// if (!label.getOwnedElements().contains(location)) {
	// result.add(location);
	// }
	// } else if (element instanceof PhysicalApplicationComponent) {
	// PhysicalApplicationComponent pac = (PhysicalApplicationComponent)
	// element;
	// List<Location> locations = pac.getIsHostedInLocation();
	// for (Location location : locations) {
	// if (!label.getOwnedElements().contains(location)) {
	// result.add(location);
	// } else {
	//
	// }
	// }
	// }
	// }
	//
	// }
	//
	// return result;
	// }

	// public List<Location>
	// getExternalLocationContainingPhysicalApplicationComponentOrActorCommunicatingWithTaggedElement(
	// Container container) {
	// List<Location> result = new ArrayList<Location>();
	// org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture
	// applicationArchitecture = getApplicationArchitecture(container);
	// BusinessArchitecture businessArchitecture =
	// getBusinessArchitecture(container);
	// for (Label label : container.getLabels()) {
	// for (PhysicalApplicationComponent pac : applicationArchitecture
	// .getPhysicalApplicationComponents()) {
	// if (label.getOwnedElements().contains(pac)) {
	// result.addAll(pac.getIsHostedInLocation());
	// for (PhysicalApplicationComponent pac2 : pac
	// .getCommunicatesWith()) {
	// result.addAll(pac2.getIsHostedInLocation());
	// }
	// }
	// }
	// for (Actor actor : businessArchitecture.getActors()) {
	// if (label.getOwnedElements().contains(actor)) {
	// result.add(actor.getOperatesInLocation());
	// for (Service service : actor.getConsumesServices()) {
	// for (LogicalApplicationComponent lac : service
	// .getIsRealizedThroughLogicalApplicationComponent()) {
	// for (PhysicalApplicationComponent pac : lac
	// .getIsExtendedByPhysicalApplicationComponents()) {
	// result.addAll(pac.getIsHostedInLocation());
	// }
	// }
	// }
	//
	// }
	// }
	// }
	// return result;
	// }

	// private
	// org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture
	// getApplicationArchitecture(
	// Container container) {
	// org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture
	// result = null;
	// EObject iterator = container;
	// while (result == null && iterator != null) {
	// if (iterator instanceof EnterpriseArchitecture) {
	// EnterpriseArchitecture ea = (EnterpriseArchitecture) iterator;
	// iterator = null;
	// for (Architecture architecture : ea.getArchitectures())
	// if (architecture instanceof
	// org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture)
	// {
	// result =
	// (org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture)
	// architecture;
	// }
	// } else {
	// iterator = iterator.eContainer();
	// }
	// }
	// return result;
	// }

	// private BusinessArchitecture getBusinessArchitecture(Container container)
	// {
	// BusinessArchitecture result = null;
	// EObject iterator = container;
	// while (result == null && iterator != null) {
	// if (iterator instanceof EnterpriseArchitecture) {
	// EnterpriseArchitecture ea = (EnterpriseArchitecture) iterator;
	// iterator = null;
	// for (Architecture architecture : ea.getArchitectures())
	// if (architecture instanceof BusinessArchitecture) {
	// result = (BusinessArchitecture) architecture;
	// }
	// } else {
	// iterator = iterator.eContainer();
	// }
	// }
	// return result;
	// }

}
