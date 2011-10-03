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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Container;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContainerPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ContainerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for ownsElements ReferencesTable
	 */
	private	ReferencesTableSettings ownsElementsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ContainerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject container, String editing_mode) {
		super(editingContext, container, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.Container.class;
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
			final Container container = (Container)elt;
			final ContainerPropertiesEditionPart basePart = (ContainerPropertiesEditionPart)editingPart;
			// init values
			if (container.getName() != null && isAccessible(ContentfwkViewsRepository.Container.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), container.getName()));
			
			if (isAccessible(ContentfwkViewsRepository.Container.RelatedElements.ownsElements)) {
				ownsElementsSettings = new ReferencesTableSettings(container, ContentfwkPackage.eINSTANCE.getContainer_OwnsElements());
				basePart.initOwnsElements(ownsElementsSettings);
			}
			// init filters
			
			basePart.addFilterToOwnsElements(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOwnsElementsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOwnsElements(new EObjectFilter(ContentfwkPackage.eINSTANCE.getElement()));
			// Start of user code for additional businessfilters for ownsElements
			
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
		if (editorKey == ContentfwkViewsRepository.Container.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getContainer_Name();
		}
		if (editorKey == ContentfwkViewsRepository.Container.RelatedElements.ownsElements) {
			return ContentfwkPackage.eINSTANCE.getContainer_OwnsElements();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Container container = (Container)semanticObject;
		if (ContentfwkViewsRepository.Container.Attributes.name == event.getAffectedEditor()) {
			container.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Container.RelatedElements.ownsElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Element) {
					ownsElementsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ownsElementsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownsElementsSettings.move(event.getNewIndex(), (Element) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ContainerPropertiesEditionPart basePart = (ContainerPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getContainer_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Container.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContainer_OwnsElements().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Container.RelatedElements.ownsElements))
				basePart.updateOwnsElements();
			
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
				if (ContentfwkViewsRepository.Container.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContainer_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContainer_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
