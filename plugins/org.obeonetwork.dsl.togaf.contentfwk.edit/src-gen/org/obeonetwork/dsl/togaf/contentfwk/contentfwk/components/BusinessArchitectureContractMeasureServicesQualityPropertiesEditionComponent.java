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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractMeasureServicesQualityPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String CONTRACTMEASURESERVICESQUALITY_PART = "Contract Measure Services Quality"; //$NON-NLS-1$

	
	/**
	 * Settings for contracts ReferencesTable
	 */
	protected ReferencesTableSettings contractsSettings;
	
	/**
	 * Settings for measures ReferencesTable
	 */
	protected ReferencesTableSettings measuresSettings;
	
	/**
	 * Settings for services quality ReferencesTable
	 */
	protected ReferencesTableSettings servicesQualitySettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public BusinessArchitectureContractMeasureServicesQualityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject businessArchitecture, String editing_mode) {
		super(editingContext, businessArchitecture, editing_mode);
		parts = new String[] { CONTRACTMEASURESERVICESQUALITY_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.ContractMeasureServicesQuality.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final BusinessArchitecture businessArchitecture = (BusinessArchitecture)elt;
			final ContractMeasureServicesQualityPropertiesEditionPart contractMeasureServicesQualityPart = (ContractMeasureServicesQualityPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts)) {
				contractsSettings = new ReferencesTableSettings(businessArchitecture, ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Contracts());
				contractMeasureServicesQualityPart.initContracts(contractsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures)) {
				measuresSettings = new ReferencesTableSettings(businessArchitecture, ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Measures());
				contractMeasureServicesQualityPart.initMeasures(measuresSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality)) {
				servicesQualitySettings = new ReferencesTableSettings(businessArchitecture, ContentfwkPackage.eINSTANCE.getBusinessArchitecture_ServicesQuality());
				contractMeasureServicesQualityPart.initServicesQuality(servicesQualitySettings);
			}
			// init filters
			contractMeasureServicesQualityPart.addFilterToContracts(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Contract); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for contracts
			
			// End of user code
			
			contractMeasureServicesQualityPart.addFilterToMeasures(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Measure); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for measures
			
			// End of user code
			
			contractMeasureServicesQualityPart.addFilterToServicesQuality(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ServiceQuality); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for services quality
			
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BusinessArchitecture businessArchitecture = (BusinessArchitecture)semanticObject;
		if (ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, contractsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					contractsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, measuresSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					measuresSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, servicesQualitySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					servicesQualitySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ContractMeasureServicesQualityPropertiesEditionPart contractMeasureServicesQualityPart = (ContractMeasureServicesQualityPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Contracts().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.contracts))
				contractMeasureServicesQualityPart.updateContracts();
			if (ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Measures().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.measures))
				contractMeasureServicesQualityPart.updateMeasures();
			if (ContentfwkPackage.eINSTANCE.getBusinessArchitecture_ServicesQuality().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.ContractMeasureServicesQuality.Contractsmeasures.servicesQuality))
				contractMeasureServicesQualityPart.updateServicesQuality();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
