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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicesPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TechnologyArchitecturePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Platform Services part
	 * 
	 */
	private PlatformServicesPropertiesEditionPart platformServicesPart;

	/**
	 * The TechnologyArchitecturePlatformServicesPropertiesEditionComponent sub component
	 * 
	 */
	protected TechnologyArchitecturePlatformServicesPropertiesEditionComponent technologyArchitecturePlatformServicesPropertiesEditionComponent;

	/**
	 * The Logical Technology Components part
	 * 
	 */
	private LogicalTechnologyComponentsPropertiesEditionPart logicalTechnologyComponentsPart;

	/**
	 * The TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent sub component
	 * 
	 */
	protected TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent technologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent;

	/**
	 * The Physical Technology Components part
	 * 
	 */
	private PhysicalTechnologyComponentsPropertiesEditionPart physicalTechnologyComponentsPart;

	/**
	 * The TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent sub component
	 * 
	 */
	protected TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent technologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent;
	/**
	 * Parameterized constructor
	 * 
	 * @param technologyArchitecture the EObject to edit
	 * 
	 */
	public TechnologyArchitecturePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject technologyArchitecture, String editing_mode) {
		super(editingContext, editing_mode);
		if (technologyArchitecture instanceof TechnologyArchitecture) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(technologyArchitecture, PropertiesEditingProvider.class);
			technologyArchitecturePlatformServicesPropertiesEditionComponent = (TechnologyArchitecturePlatformServicesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, TechnologyArchitecturePlatformServicesPropertiesEditionComponent.PLATFORMSERVICES_PART, TechnologyArchitecturePlatformServicesPropertiesEditionComponent.class);
			addSubComponent(technologyArchitecturePlatformServicesPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(technologyArchitecture, PropertiesEditingProvider.class);
			technologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent = (TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.LOGICALTECHNOLOGYCOMPONENTS_PART, TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.class);
			addSubComponent(technologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(technologyArchitecture, PropertiesEditingProvider.class);
			technologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent = (TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.PHYSICALTECHNOLOGYCOMPONENTS_PART, TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.class);
			addSubComponent(technologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      getPropertiesEditionPart(int, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (TechnologyArchitecturePlatformServicesPropertiesEditionComponent.PLATFORMSERVICES_PART.equals(key)) {
			platformServicesPart = (PlatformServicesPropertiesEditionPart)technologyArchitecturePlatformServicesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)platformServicesPart;
		}
		if (TechnologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.LOGICALTECHNOLOGYCOMPONENTS_PART.equals(key)) {
			logicalTechnologyComponentsPart = (LogicalTechnologyComponentsPropertiesEditionPart)technologyArchitectureLogicalTechnologyComponentsPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)logicalTechnologyComponentsPart;
		}
		if (TechnologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.PHYSICALTECHNOLOGYCOMPONENTS_PART.equals(key)) {
			physicalTechnologyComponentsPart = (PhysicalTechnologyComponentsPropertiesEditionPart)technologyArchitecturePhysicalTechnologyComponentsPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)physicalTechnologyComponentsPart;
		}
		return super.getPropertiesEditionPart(kind, key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Object, int,
	 *      org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Object key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (ContentfwkViewsRepository.PlatformServices.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			platformServicesPart = (PlatformServicesPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponents.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			logicalTechnologyComponentsPart = (LogicalTechnologyComponentsPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponents.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			physicalTechnologyComponentsPart = (PhysicalTechnologyComponentsPropertiesEditionPart)propertiesEditionPart;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.ComposedPropertiesEditionComponent#
	 *      initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Object key, int kind, EObject element, ResourceSet allResource) {
		if (key == ContentfwkViewsRepository.PlatformServices.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.LogicalTechnologyComponents.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.PhysicalTechnologyComponents.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
