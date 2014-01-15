package org.obeonetwork.dsl.togaf.design.services.application;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.design.services.TagsService;
import org.obeonetwork.dsl.togaf.design.util.SemanticModelUtil;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class InformationSystemServices {
	public Collection<InformationSystemService> getImplementsServices(final LogicalApplicationComponent comp) {
		return Lists.newArrayList(Iterables.filter(comp.getImplementsServices(), InformationSystemService.class));
	}
	
	public Collection<InformationSystemService> consumesService(final InformationSystemService comp) {
		return Lists.newArrayList(Iterables.filter(comp.getConsumesServices(), InformationSystemService.class));
	}
	
	public Collection<InformationSystemService> inverseConsumesService(final InformationSystemService comp) {
		return Lists.newArrayList(Iterables.filter(SemanticModelUtil.getInverseReferences(comp, ContentfwkPackage.Literals.SERVICE__CONSUMES_SERVICES, new ArrayList<EObject>(Lists.newArrayList(Iterables.filter(((ApplicationArchitecture)comp.eContainer()).getInformationSystemServices(), Predicates.not(Predicates.equalTo(comp)))))), InformationSystemService.class));
	}
	
	public Collection<InformationSystemService> providesDataEntityDotConsumesDataEntityService(final InformationSystemService comp) {
		Collection<DataEntity> provided = comp.getProvidesDataEntities();
		Collection<InformationSystemService> consumes = Lists.newArrayList();
		for (DataEntity entity : provided) {
			consumes.addAll(Lists.newArrayList(Iterables.filter(entity.getIsAccessedByServices(), InformationSystemService.class)));
		}
		return consumes;
	}
	public Collection<InformationSystemService> consumesDataEntityDotProvidesDataEntityService(final InformationSystemService comp) {
		Collection<DataEntity> consumed = comp.getConsumesDataEntities();
		Collection<InformationSystemService> provides = Lists.newArrayList();
		for (DataEntity entity : consumed) {
			provides.addAll(Lists.newArrayList(Iterables.filter(entity.getIsUpdatedThroughServices(), InformationSystemService.class)));
		}
		return provides;
	}
	public Collection<LogicalApplicationComponent> getIsImplementedOnLogicalApplicationComponent(final InformationSystemService iss) {
		return iss.getIsRealizedThroughLogicalApplicationComponent();
	}
	
}
