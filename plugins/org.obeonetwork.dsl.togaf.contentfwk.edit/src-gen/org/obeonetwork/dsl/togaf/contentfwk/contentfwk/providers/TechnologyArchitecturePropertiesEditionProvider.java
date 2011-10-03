/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers;

import java.util.List;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.TechnologyArchitecturePlatformServicesPropertiesEditionComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components.TechnologyArchitecturePropertiesEditionComponent;

/**
 * 
 * 
 */
public class TechnologyArchitecturePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public TechnologyArchitecturePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public TechnologyArchitecturePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof TechnologyArchitecture) 
					&& (ContentfwkPackage.eINSTANCE.getTechnologyArchitecture() == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof TechnologyArchitecture) && (TechnologyArchitecturePlatformServicesPropertiesEditionComponent.PLATFORMSERVICES_PART.equals(part) || TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.LOGICALTECHNOLOGYCOMPONENTS_PART.equals(part) || TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.PHYSICALTECHNOLOGYCOMPONENTS_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof TechnologyArchitecture) && (refinement == TechnologyArchitecturePlatformServicesPropertiesEditionComponent.class || refinement == TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.class || refinement == TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof TechnologyArchitecture) && ((TechnologyArchitecturePlatformServicesPropertiesEditionComponent.PLATFORMSERVICES_PART.equals(part) && refinement == TechnologyArchitecturePlatformServicesPropertiesEditionComponent.class) || (TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.LOGICALTECHNOLOGYCOMPONENTS_PART.equals(part) && refinement == TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.class) || (TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.PHYSICALTECHNOLOGYCOMPONENTS_PART.equals(part) && refinement == TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof TechnologyArchitecture) {
			return new TechnologyArchitecturePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof TechnologyArchitecture) {
			if (TechnologyArchitecturePlatformServicesPropertiesEditionComponent.PLATFORMSERVICES_PART.equals(part))
				return new TechnologyArchitecturePlatformServicesPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.LOGICALTECHNOLOGYCOMPONENTS_PART.equals(part))
				return new TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.PHYSICALTECHNOLOGYCOMPONENTS_PART.equals(part))
				return new TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof TechnologyArchitecture) {
			if (TechnologyArchitecturePlatformServicesPropertiesEditionComponent.PLATFORMSERVICES_PART.equals(part)
				&& refinement == TechnologyArchitecturePlatformServicesPropertiesEditionComponent.class)
				return new TechnologyArchitecturePlatformServicesPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.LOGICALTECHNOLOGYCOMPONENTS_PART.equals(part)
				&& refinement == TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.class)
				return new TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.PHYSICALTECHNOLOGYCOMPONENTS_PART.equals(part)
				&& refinement == TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.class)
				return new TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

}
