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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicesPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentsPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentsPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class ApplicationArchitecturePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Information System Services part
	 * 
	 */
	private InformationSystemServicesPropertiesEditionPart informationSystemServicesPart;

	/**
	 * The ApplicationArchitectureInformationSystemServicesPropertiesEditionComponent sub component
	 * 
	 */
	protected ApplicationArchitectureInformationSystemServicesPropertiesEditionComponent applicationArchitectureInformationSystemServicesPropertiesEditionComponent;

	/**
	 * The Logical Application Components part
	 * 
	 */
	private LogicalApplicationComponentsPropertiesEditionPart logicalApplicationComponentsPart;

	/**
	 * The ApplicationArchitectureLogicalApplicationComponentsPropertiesEditionComponent sub component
	 * 
	 */
	protected ApplicationArchitectureLogicalApplicationComponentsPropertiesEditionComponent applicationArchitectureLogicalApplicationComponentsPropertiesEditionComponent;

	/**
	 * The Physical Application Components part
	 * 
	 */
	private PhysicalApplicationComponentsPropertiesEditionPart physicalApplicationComponentsPart;

	/**
	 * The ApplicationArchitecturePhysicalApplicationComponentsPropertiesEditionComponent sub component
	 * 
	 */
	protected ApplicationArchitecturePhysicalApplicationComponentsPropertiesEditionComponent applicationArchitecturePhysicalApplicationComponentsPropertiesEditionComponent;
	/**
	 * Parameterized constructor
	 * 
	 * @param applicationArchitecture the EObject to edit
	 * 
	 */
	public ApplicationArchitecturePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject applicationArchitecture, String editing_mode) {
		super(editingContext, editing_mode);
		if (applicationArchitecture instanceof ApplicationArchitecture) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(applicationArchitecture, PropertiesEditingProvider.class);
			applicationArchitectureInformationSystemServicesPropertiesEditionComponent = (ApplicationArchitectureInformationSystemServicesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ApplicationArchitectureInformationSystemServicesPropertiesEditionComponent.INFORMATIONSYSTEMSERVICES_PART, ApplicationArchitectureInformationSystemServicesPropertiesEditionComponent.class);
			addSubComponent(applicationArchitectureInformationSystemServicesPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(applicationArchitecture, PropertiesEditingProvider.class);
			applicationArchitectureLogicalApplicationComponentsPropertiesEditionComponent = (ApplicationArchitectureLogicalApplicationComponentsPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ApplicationArchitectureLogicalApplicationComponentsPropertiesEditionComponent.LOGICALAPPLICATIONCOMPONENTS_PART, ApplicationArchitectureLogicalApplicationComponentsPropertiesEditionComponent.class);
			addSubComponent(applicationArchitectureLogicalApplicationComponentsPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(applicationArchitecture, PropertiesEditingProvider.class);
			applicationArchitecturePhysicalApplicationComponentsPropertiesEditionComponent = (ApplicationArchitecturePhysicalApplicationComponentsPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, ApplicationArchitecturePhysicalApplicationComponentsPropertiesEditionComponent.PHYSICALAPPLICATIONCOMPONENTS_PART, ApplicationArchitecturePhysicalApplicationComponentsPropertiesEditionComponent.class);
			addSubComponent(applicationArchitecturePhysicalApplicationComponentsPropertiesEditionComponent);
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
		if (ApplicationArchitectureInformationSystemServicesPropertiesEditionComponent.INFORMATIONSYSTEMSERVICES_PART.equals(key)) {
			informationSystemServicesPart = (InformationSystemServicesPropertiesEditionPart)applicationArchitectureInformationSystemServicesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)informationSystemServicesPart;
		}
		if (ApplicationArchitectureLogicalApplicationComponentsPropertiesEditionComponent.LOGICALAPPLICATIONCOMPONENTS_PART.equals(key)) {
			logicalApplicationComponentsPart = (LogicalApplicationComponentsPropertiesEditionPart)applicationArchitectureLogicalApplicationComponentsPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)logicalApplicationComponentsPart;
		}
		if (ApplicationArchitecturePhysicalApplicationComponentsPropertiesEditionComponent.PHYSICALAPPLICATIONCOMPONENTS_PART.equals(key)) {
			physicalApplicationComponentsPart = (PhysicalApplicationComponentsPropertiesEditionPart)applicationArchitecturePhysicalApplicationComponentsPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)physicalApplicationComponentsPart;
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
		if (ContentfwkViewsRepository.InformationSystemServices.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			informationSystemServicesPart = (InformationSystemServicesPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponents.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			logicalApplicationComponentsPart = (LogicalApplicationComponentsPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponents.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			physicalApplicationComponentsPart = (PhysicalApplicationComponentsPropertiesEditionPart)propertiesEditionPart;
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
		if (key == ContentfwkViewsRepository.InformationSystemServices.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.LogicalApplicationComponents.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.PhysicalApplicationComponents.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
