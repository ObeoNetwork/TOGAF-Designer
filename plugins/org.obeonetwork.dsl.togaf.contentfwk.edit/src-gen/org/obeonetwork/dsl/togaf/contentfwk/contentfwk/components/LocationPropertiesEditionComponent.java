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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class LocationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for delegates ReferencesTable
	 */
	private	ReferencesTableSettings delegatesSettings;
	
	/**
	 * Settings for isDelegatedBy ReferencesTable
	 */
	private	ReferencesTableSettings isDelegatedBySettings;
	
	/**
	 * Settings for containsActors ReferencesTable
	 */
	private	ReferencesTableSettings containsActorsSettings;
	
	/**
	 * Settings for containsOrganizationUnits ReferencesTable
	 */
	private	ReferencesTableSettings containsOrganizationUnitsSettings;
	
	/**
	 * Settings for containsPhysicalDataComponents ReferencesTable
	 */
	private	ReferencesTableSettings containsPhysicalDataComponentsSettings;
	
	/**
	 * Settings for containsPhysicalApplicationComponents ReferencesTable
	 */
	private	ReferencesTableSettings containsPhysicalApplicationComponentsSettings;
	
	/**
	 * Settings for containsPhysicalTechnologyComponents ReferencesTable
	 */
	private	ReferencesTableSettings containsPhysicalTechnologyComponentsSettings;
	
	/**
	 * Settings for decomposesLocation EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposesLocationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public LocationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject location, String editing_mode) {
		super(editingContext, location, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.Location.class;
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
			final Location location = (Location)elt;
			final LocationPropertiesEditionPart basePart = (LocationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.Location.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(location, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(location, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (location.getName() != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), location.getName()));
			
			if (location.getDescription() != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), location.getDescription()));
			
			if (location.getCategory() != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), location.getCategory()));
			
			if (location.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), location.getSourceDescr()));
			
			if (location.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), location.getOwnerDescr()));
			
			if (location.getID() != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), location.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.Location.RelatedElements.containsActors)) {
				containsActorsSettings = new ReferencesTableSettings(location, ContentfwkPackage.eINSTANCE.getLocation_ContainsActors());
				basePart.initContainsActors(containsActorsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits)) {
				containsOrganizationUnitsSettings = new ReferencesTableSettings(location, ContentfwkPackage.eINSTANCE.getLocation_ContainsOrganizationUnits());
				basePart.initContainsOrganizationUnits(containsOrganizationUnitsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents)) {
				containsPhysicalDataComponentsSettings = new ReferencesTableSettings(location, ContentfwkPackage.eINSTANCE.getLocation_ContainsPhysicalDataComponents());
				basePart.initContainsPhysicalDataComponents(containsPhysicalDataComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents)) {
				containsPhysicalApplicationComponentsSettings = new ReferencesTableSettings(location, ContentfwkPackage.eINSTANCE.getLocation_ContainsPhysicalApplicationComponents());
				basePart.initContainsPhysicalApplicationComponents(containsPhysicalApplicationComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents)) {
				containsPhysicalTechnologyComponentsSettings = new ReferencesTableSettings(location, ContentfwkPackage.eINSTANCE.getLocation_ContainsPhysicalTechnologyComponents());
				basePart.initContainsPhysicalTechnologyComponents(containsPhysicalTechnologyComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation)) {
				// init part
				decomposesLocationSettings = new EObjectFlatComboSettings(location, ContentfwkPackage.eINSTANCE.getLocation_DecomposesLocation());
				basePart.initDecomposesLocation(decomposesLocationSettings);
				// set the button mode
				basePart.setDecomposesLocationButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToDelegates(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInDelegatesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToDelegates(new EObjectFilter(ContentfwkPackage.eINSTANCE.getElement()));
			// Start of user code for additional businessfilters for delegates
			
			// End of user code
			
			basePart.addFilterToIsDelegatedBy(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsDelegatedByTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsDelegatedBy(new EObjectFilter(ContentfwkPackage.eINSTANCE.getElement()));
			// Start of user code for additional businessfilters for isDelegatedBy
			
			// End of user code
			
			
			
			
			
			
			
			basePart.addFilterToContainsActors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInContainsActorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToContainsActors(new EObjectFilter(ContentfwkPackage.eINSTANCE.getActor()));
			// Start of user code for additional businessfilters for containsActors
			
			// End of user code
			
			basePart.addFilterToContainsOrganizationUnits(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInContainsOrganizationUnitsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToContainsOrganizationUnits(new EObjectFilter(ContentfwkPackage.eINSTANCE.getOrganizationUnit()));
			// Start of user code for additional businessfilters for containsOrganizationUnits
			
			// End of user code
			
			basePart.addFilterToContainsPhysicalDataComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInContainsPhysicalDataComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToContainsPhysicalDataComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPhysicalDataComponent()));
			// Start of user code for additional businessfilters for containsPhysicalDataComponents
			
			// End of user code
			
			basePart.addFilterToContainsPhysicalApplicationComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInContainsPhysicalApplicationComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToContainsPhysicalApplicationComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent()));
			// Start of user code for additional businessfilters for containsPhysicalApplicationComponents
			
			// End of user code
			
			basePart.addFilterToContainsPhysicalTechnologyComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInContainsPhysicalTechnologyComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToContainsPhysicalTechnologyComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent()));
			// Start of user code for additional businessfilters for containsPhysicalTechnologyComponents
			
			// End of user code
			
			basePart.addFilterToDecomposesLocation(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Location); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposesLocation
			
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
		if (editorKey == ContentfwkViewsRepository.Location.RelatedElements.delegates) {
			return ContentfwkPackage.eINSTANCE.getElement_Delegates();
		}
		if (editorKey == ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy) {
			return ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy();
		}
		if (editorKey == ContentfwkViewsRepository.Location.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.Location.Attributes.description) {
			return ContentfwkPackage.eINSTANCE.getElement_Description();
		}
		if (editorKey == ContentfwkViewsRepository.Location.Attributes.category) {
			return ContentfwkPackage.eINSTANCE.getElement_Category();
		}
		if (editorKey == ContentfwkViewsRepository.Location.Attributes.source) {
			return ContentfwkPackage.eINSTANCE.getElement_SourceDescr();
		}
		if (editorKey == ContentfwkViewsRepository.Location.Attributes.owner) {
			return ContentfwkPackage.eINSTANCE.getElement_OwnerDescr();
		}
		if (editorKey == ContentfwkViewsRepository.Location.Attributes.iD) {
			return ContentfwkPackage.eINSTANCE.getElement_ID();
		}
		if (editorKey == ContentfwkViewsRepository.Location.RelatedElements.containsActors) {
			return ContentfwkPackage.eINSTANCE.getLocation_ContainsActors();
		}
		if (editorKey == ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits) {
			return ContentfwkPackage.eINSTANCE.getLocation_ContainsOrganizationUnits();
		}
		if (editorKey == ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents) {
			return ContentfwkPackage.eINSTANCE.getLocation_ContainsPhysicalDataComponents();
		}
		if (editorKey == ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents) {
			return ContentfwkPackage.eINSTANCE.getLocation_ContainsPhysicalApplicationComponents();
		}
		if (editorKey == ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents) {
			return ContentfwkPackage.eINSTANCE.getLocation_ContainsPhysicalTechnologyComponents();
		}
		if (editorKey == ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation) {
			return ContentfwkPackage.eINSTANCE.getLocation_DecomposesLocation();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Location location = (Location)semanticObject;
		if (ContentfwkViewsRepository.Location.RelatedElements.delegates == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Element) {
					delegatesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				delegatesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				delegatesSettings.move(event.getNewIndex(), (Element) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Element) {
					isDelegatedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isDelegatedBySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isDelegatedBySettings.move(event.getNewIndex(), (Element) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Location.Attributes.name == event.getAffectedEditor()) {
			location.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Location.Attributes.description == event.getAffectedEditor()) {
			location.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Location.Attributes.category == event.getAffectedEditor()) {
			location.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Location.Attributes.source == event.getAffectedEditor()) {
			location.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Location.Attributes.owner == event.getAffectedEditor()) {
			location.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Location.Attributes.iD == event.getAffectedEditor()) {
			location.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Location.RelatedElements.containsActors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Actor) {
					containsActorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				containsActorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containsActorsSettings.move(event.getNewIndex(), (Actor) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof OrganizationUnit) {
					containsOrganizationUnitsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				containsOrganizationUnitsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containsOrganizationUnitsSettings.move(event.getNewIndex(), (OrganizationUnit) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PhysicalDataComponent) {
					containsPhysicalDataComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				containsPhysicalDataComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containsPhysicalDataComponentsSettings.move(event.getNewIndex(), (PhysicalDataComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PhysicalApplicationComponent) {
					containsPhysicalApplicationComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				containsPhysicalApplicationComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containsPhysicalApplicationComponentsSettings.move(event.getNewIndex(), (PhysicalApplicationComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PhysicalTechnologyComponent) {
					containsPhysicalTechnologyComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				containsPhysicalTechnologyComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containsPhysicalTechnologyComponentsSettings.move(event.getNewIndex(), (PhysicalTechnologyComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decomposesLocationSettings.setToReference((Location)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Location eObject = ContentfwkFactory.eINSTANCE.createLocation();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposesLocationSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			LocationPropertiesEditionPart basePart = (LocationPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Location.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Location.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getLocation_ContainsActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Location.RelatedElements.containsActors))
				basePart.updateContainsActors();
			if (ContentfwkPackage.eINSTANCE.getLocation_ContainsOrganizationUnits().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits))
				basePart.updateContainsOrganizationUnits();
			if (ContentfwkPackage.eINSTANCE.getLocation_ContainsPhysicalDataComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents))
				basePart.updateContainsPhysicalDataComponents();
			if (ContentfwkPackage.eINSTANCE.getLocation_ContainsPhysicalApplicationComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents))
				basePart.updateContainsPhysicalApplicationComponents();
			if (ContentfwkPackage.eINSTANCE.getLocation_ContainsPhysicalTechnologyComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents))
				basePart.updateContainsPhysicalTechnologyComponents();
			if (ContentfwkPackage.eINSTANCE.getLocation_DecomposesLocation().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation))
				basePart.setDecomposesLocation((EObject)msg.getNewValue());
			
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
				if (ContentfwkViewsRepository.Location.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Location.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Location.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Location.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Location.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Location.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
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
