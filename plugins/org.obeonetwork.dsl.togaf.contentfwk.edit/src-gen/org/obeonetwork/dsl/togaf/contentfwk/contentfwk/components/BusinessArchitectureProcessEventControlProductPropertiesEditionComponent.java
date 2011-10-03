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
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessEventControlProductPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class BusinessArchitectureProcessEventControlProductPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String PROCESSEVENTCONTROLPRODUCT_PART = "Process Event Control Product"; //$NON-NLS-1$

	
	/**
	 * Settings for process ReferencesTable
	 */
	protected ReferencesTableSettings processSettings;
	
	/**
	 * Settings for events ReferencesTable
	 */
	protected ReferencesTableSettings eventsSettings;
	
	/**
	 * Settings for controls ReferencesTable
	 */
	protected ReferencesTableSettings controlsSettings;
	
	/**
	 * Settings for products ReferencesTable
	 */
	protected ReferencesTableSettings productsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BusinessArchitectureProcessEventControlProductPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject businessArchitecture, String editing_mode) {
		super(editingContext, businessArchitecture, editing_mode);
		parts = new String[] { PROCESSEVENTCONTROLPRODUCT_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.ProcessEventControlProduct.class;
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
			final ProcessEventControlProductPropertiesEditionPart processEventControlProductPart = (ProcessEventControlProductPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes)) {
				processSettings = new ReferencesTableSettings(businessArchitecture, ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Processes());
				processEventControlProductPart.initProcesses(processSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events)) {
				eventsSettings = new ReferencesTableSettings(businessArchitecture, ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Events());
				processEventControlProductPart.initEvents(eventsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls)) {
				controlsSettings = new ReferencesTableSettings(businessArchitecture, ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Controls());
				processEventControlProductPart.initControls(controlsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products)) {
				productsSettings = new ReferencesTableSettings(businessArchitecture, ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Products());
				processEventControlProductPart.initProducts(productsSettings);
			}
			// init filters
			processEventControlProductPart.addFilterToProcesses(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Process); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for process
			
			// End of user code
			
			processEventControlProductPart.addFilterToEvents(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Event); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for events
			
			// End of user code
			
			processEventControlProductPart.addFilterToControls(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Control); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for controls
			
			// End of user code
			
			processEventControlProductPart.addFilterToProducts(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Product); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for products
			
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes) {
			return ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Processes();
		}
		if (editorKey == ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events) {
			return ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Events();
		}
		if (editorKey == ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls) {
			return ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Controls();
		}
		if (editorKey == ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products) {
			return ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Products();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BusinessArchitecture businessArchitecture = (BusinessArchitecture)semanticObject;
		if (ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, processSettings, editingContext.getAdapterFactory());
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
				processSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				processSettings.move(event.getNewIndex(), (Process) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, eventsSettings, editingContext.getAdapterFactory());
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
				eventsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				eventsSettings.move(event.getNewIndex(), (Event) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, controlsSettings, editingContext.getAdapterFactory());
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
				controlsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				controlsSettings.move(event.getNewIndex(), (Control) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, productsSettings, editingContext.getAdapterFactory());
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
				productsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				productsSettings.move(event.getNewIndex(), (Product) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ProcessEventControlProductPropertiesEditionPart processEventControlProductPart = (ProcessEventControlProductPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Processes().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.processes))
				processEventControlProductPart.updateProcesses();
			if (ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Events().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.events))
				processEventControlProductPart.updateEvents();
			if (ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Controls().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.controls))
				processEventControlProductPart.updateControls();
			if (ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Products().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.ProcessEventControlProduct.Processeventcontrolproduct.products))
				processEventControlProductPart.updateProducts();
			
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
