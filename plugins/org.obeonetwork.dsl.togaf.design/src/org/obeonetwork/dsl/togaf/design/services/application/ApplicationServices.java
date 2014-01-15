package org.obeonetwork.dsl.togaf.design.services.application;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.design.util.SemanticModelUtil;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class ApplicationServices {

	public LogicalApplicationComponent getApplication(
			final LogicalApplicationComponent componentOrApplication) {
		if (componentOrApplication == null)
			return null;
		if (isApplication.apply(componentOrApplication))
			return componentOrApplication;
		else if (componentOrApplication
				.getDecomposesLogicalApplicationComponent() == null)
			return null;
		else if (componentOrApplication.getDecomposesLogicalApplicationComponent().equals(componentOrApplication))
			return null;
		else
			return getApplication(componentOrApplication
					.getDecomposesLogicalApplicationComponent());
	}

	public Collection<LogicalApplicationComponent> getComponents(final LogicalApplicationComponent logicalApplicationComponent) {
		if (!logicalApplicationComponent.getCategory().equals("Application"))
			return Lists.newArrayList(logicalApplicationComponent);
		else 
			return Lists.newArrayList(Iterables.filter(logicalApplicationComponent.getIsDecomposedByLogicalApplicationComponents(), LogicalApplicationComponent.class));
	}
	public Collection<LogicalApplicationComponent> getIsDecomposedByLogicalApplicationComponent(final LogicalApplicationComponent comp) {
		return comp.getIsDecomposedByLogicalApplicationComponents();
	}

	public Collection<LogicalApplicationComponent> getCommunicatesWith(
			final LogicalApplicationComponent comp) {
		return Lists.newArrayList(Iterables.filter(comp.getCommunicatesWith(), Predicates.not(Predicates.equalTo(comp))));
	}


	public Collection<LogicalApplicationComponent> getInverseCommunicatesWith(final LogicalApplicationComponent comp) {
		return Lists.newArrayList(
				Iterables.filter(
						SemanticModelUtil.getInverseReferences(comp, ContentfwkPackage.Literals.LOGICAL_APPLICATION_COMPONENT__COMMUNICATES_WITH, 
								new ArrayList<EObject>(
										Lists.newArrayList(
												Iterables.filter(((ApplicationArchitecture)comp.eContainer()).getLogicalApplicationComponents(),
														Predicates.not(
																Predicates.equalTo(comp)))))), LogicalApplicationComponent.class));
		
	}

	private Predicate<Element> isApplication = new Predicate<Element>() {
		public boolean apply(final Element comp) {
			if (comp == null || comp.getCategory() == null)
				return false;
			return comp.getCategory()
					.equals("Application");
		}
	};

	

	
}
