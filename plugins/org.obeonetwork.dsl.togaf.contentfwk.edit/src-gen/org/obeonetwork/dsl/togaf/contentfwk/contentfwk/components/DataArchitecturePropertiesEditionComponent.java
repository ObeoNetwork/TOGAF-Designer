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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntitiesPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalDataPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalDataPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class DataArchitecturePropertiesEditionComponent extends ComposedPropertiesEditionComponent {

	/**
	 * The Data Entities part
	 * 
	 */
	private DataEntitiesPropertiesEditionPart dataEntitiesPart;

	/**
	 * The DataArchitectureDataEntitiesPropertiesEditionComponent sub component
	 * 
	 */
	protected DataArchitectureDataEntitiesPropertiesEditionComponent dataArchitectureDataEntitiesPropertiesEditionComponent;

	/**
	 * The Logical Data part
	 * 
	 */
	private LogicalDataPropertiesEditionPart logicalDataPart;

	/**
	 * The DataArchitectureLogicalDataPropertiesEditionComponent sub component
	 * 
	 */
	protected DataArchitectureLogicalDataPropertiesEditionComponent dataArchitectureLogicalDataPropertiesEditionComponent;

	/**
	 * The Physical Data part
	 * 
	 */
	private PhysicalDataPropertiesEditionPart physicalDataPart;

	/**
	 * The DataArchitecturePhysicalDataPropertiesEditionComponent sub component
	 * 
	 */
	protected DataArchitecturePhysicalDataPropertiesEditionComponent dataArchitecturePhysicalDataPropertiesEditionComponent;
	/**
	 * Parameterized constructor
	 * 
	 * @param dataArchitecture the EObject to edit
	 * 
	 */
	public DataArchitecturePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject dataArchitecture, String editing_mode) {
		super(editingContext, editing_mode);
		if (dataArchitecture instanceof DataArchitecture) {
			PropertiesEditingProvider provider = null;
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(dataArchitecture, PropertiesEditingProvider.class);
			dataArchitectureDataEntitiesPropertiesEditionComponent = (DataArchitectureDataEntitiesPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DataArchitectureDataEntitiesPropertiesEditionComponent.DATAENTITIES_PART, DataArchitectureDataEntitiesPropertiesEditionComponent.class);
			addSubComponent(dataArchitectureDataEntitiesPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(dataArchitecture, PropertiesEditingProvider.class);
			dataArchitectureLogicalDataPropertiesEditionComponent = (DataArchitectureLogicalDataPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DataArchitectureLogicalDataPropertiesEditionComponent.LOGICALDATA_PART, DataArchitectureLogicalDataPropertiesEditionComponent.class);
			addSubComponent(dataArchitectureLogicalDataPropertiesEditionComponent);
			provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(dataArchitecture, PropertiesEditingProvider.class);
			dataArchitecturePhysicalDataPropertiesEditionComponent = (DataArchitecturePhysicalDataPropertiesEditionComponent)provider.getPropertiesEditingComponent(editingContext, editing_mode, DataArchitecturePhysicalDataPropertiesEditionComponent.PHYSICALDATA_PART, DataArchitecturePhysicalDataPropertiesEditionComponent.class);
			addSubComponent(dataArchitecturePhysicalDataPropertiesEditionComponent);
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
		if (DataArchitectureDataEntitiesPropertiesEditionComponent.DATAENTITIES_PART.equals(key)) {
			dataEntitiesPart = (DataEntitiesPropertiesEditionPart)dataArchitectureDataEntitiesPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)dataEntitiesPart;
		}
		if (DataArchitectureLogicalDataPropertiesEditionComponent.LOGICALDATA_PART.equals(key)) {
			logicalDataPart = (LogicalDataPropertiesEditionPart)dataArchitectureLogicalDataPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)logicalDataPart;
		}
		if (DataArchitecturePhysicalDataPropertiesEditionComponent.PHYSICALDATA_PART.equals(key)) {
			physicalDataPart = (PhysicalDataPropertiesEditionPart)dataArchitecturePhysicalDataPropertiesEditionComponent.getPropertiesEditionPart(kind, key);
			return (IPropertiesEditionPart)physicalDataPart;
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
		if (ContentfwkViewsRepository.DataEntities.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			dataEntitiesPart = (DataEntitiesPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.LogicalData.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			logicalDataPart = (LogicalDataPropertiesEditionPart)propertiesEditionPart;
		}
		if (ContentfwkViewsRepository.PhysicalData.class == key) {
			super.setPropertiesEditionPart(key, kind, propertiesEditionPart);
			physicalDataPart = (PhysicalDataPropertiesEditionPart)propertiesEditionPart;
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
		if (key == ContentfwkViewsRepository.DataEntities.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.LogicalData.class) {
			super.initPart(key, kind, element, allResource);
		}
		if (key == ContentfwkViewsRepository.PhysicalData.class) {
			super.initPart(key, kind, element, allResource);
		}
	}
}
