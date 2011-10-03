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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class OrganizationUnitPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for ownsAndGovernsServices ReferencesTable
	 */
	private	ReferencesTableSettings ownsAndGovernsServicesSettings;
	
	/**
	 * Settings for containsActors ReferencesTable
	 */
	private	ReferencesTableSettings containsActorsSettings;
	
	/**
	 * Settings for ownsFunctions ReferencesTable
	 */
	private	ReferencesTableSettings ownsFunctionsSettings;
	
	/**
	 * Settings for participatesInProcesses ReferencesTable
	 */
	private	ReferencesTableSettings participatesInProcessesSettings;
	
	/**
	 * Settings for isMotivatedByDrivers ReferencesTable
	 */
	private	ReferencesTableSettings isMotivatedByDriversSettings;
	
	/**
	 * Settings for producesProducts ReferencesTable
	 */
	private	ReferencesTableSettings producesProductsSettings;
	
	/**
	 * Settings for operatesInLocation EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings operatesInLocationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public OrganizationUnitPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject organizationUnit, String editing_mode) {
		super(editingContext, organizationUnit, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.OrganizationUnit.class;
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
			final OrganizationUnit organizationUnit = (OrganizationUnit)elt;
			final OrganizationUnitPropertiesEditionPart basePart = (OrganizationUnitPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(organizationUnit, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(organizationUnit, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (organizationUnit.getName() != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), organizationUnit.getName()));
			
			if (organizationUnit.getDescription() != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), organizationUnit.getDescription()));
			
			if (organizationUnit.getCategory() != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), organizationUnit.getCategory()));
			
			if (organizationUnit.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), organizationUnit.getSourceDescr()));
			
			if (organizationUnit.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), organizationUnit.getOwnerDescr()));
			
			if (organizationUnit.getID() != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), organizationUnit.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices)) {
				ownsAndGovernsServicesSettings = new ReferencesTableSettings(organizationUnit, ContentfwkPackage.eINSTANCE.getOrganizationUnit_OwnsAndGovernsServices());
				basePart.initOwnsAndGovernsServices(ownsAndGovernsServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors)) {
				containsActorsSettings = new ReferencesTableSettings(organizationUnit, ContentfwkPackage.eINSTANCE.getOrganizationUnit_ContainsActors());
				basePart.initContainsActors(containsActorsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions)) {
				ownsFunctionsSettings = new ReferencesTableSettings(organizationUnit, ContentfwkPackage.eINSTANCE.getOrganizationUnit_OwnsFunctions());
				basePart.initOwnsFunctions(ownsFunctionsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses)) {
				participatesInProcessesSettings = new ReferencesTableSettings(organizationUnit, ContentfwkPackage.eINSTANCE.getOrganizationUnit_ParticipatesInProcesses());
				basePart.initParticipatesInProcesses(participatesInProcessesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers)) {
				isMotivatedByDriversSettings = new ReferencesTableSettings(organizationUnit, ContentfwkPackage.eINSTANCE.getOrganizationUnit_IsMotivatedByDrivers());
				basePart.initIsMotivatedByDrivers(isMotivatedByDriversSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts)) {
				producesProductsSettings = new ReferencesTableSettings(organizationUnit, ContentfwkPackage.eINSTANCE.getOrganizationUnit_ProducesProducts());
				basePart.initProducesProducts(producesProductsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation)) {
				// init part
				operatesInLocationSettings = new EObjectFlatComboSettings(organizationUnit, ContentfwkPackage.eINSTANCE.getOrganizationUnit_OperatesInLocation());
				basePart.initOperatesInLocation(operatesInLocationSettings);
				// set the button mode
				basePart.setOperatesInLocationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (organizationUnit.getHeadcount() != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount))
				basePart.setHeadcount(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), organizationUnit.getHeadcount()));
			
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
			
			
			
			
			
			
			
			basePart.addFilterToOwnsAndGovernsServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOwnsAndGovernsServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOwnsAndGovernsServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getService()));
			// Start of user code for additional businessfilters for ownsAndGovernsServices
			
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
			
			basePart.addFilterToOwnsFunctions(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOwnsFunctionsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOwnsFunctions(new EObjectFilter(ContentfwkPackage.eINSTANCE.getFunction()));
			// Start of user code for additional businessfilters for ownsFunctions
			
			// End of user code
			
			basePart.addFilterToParticipatesInProcesses(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInParticipatesInProcessesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToParticipatesInProcesses(new EObjectFilter(ContentfwkPackage.eINSTANCE.getProcess()));
			// Start of user code for additional businessfilters for participatesInProcesses
			
			// End of user code
			
			basePart.addFilterToIsMotivatedByDrivers(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsMotivatedByDriversTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsMotivatedByDrivers(new EObjectFilter(ContentfwkPackage.eINSTANCE.getDriver()));
			// Start of user code for additional businessfilters for isMotivatedByDrivers
			
			// End of user code
			
			basePart.addFilterToProducesProducts(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInProducesProductsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToProducesProducts(new EObjectFilter(ContentfwkPackage.eINSTANCE.getProduct()));
			// Start of user code for additional businessfilters for producesProducts
			
			// End of user code
			
			basePart.addFilterToOperatesInLocation(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Location); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for operatesInLocation
			
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
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates) {
			return ContentfwkPackage.eINSTANCE.getElement_Delegates();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy) {
			return ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.Attributes.description) {
			return ContentfwkPackage.eINSTANCE.getElement_Description();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.Attributes.category) {
			return ContentfwkPackage.eINSTANCE.getElement_Category();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.Attributes.source) {
			return ContentfwkPackage.eINSTANCE.getElement_SourceDescr();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.Attributes.owner) {
			return ContentfwkPackage.eINSTANCE.getElement_OwnerDescr();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.Attributes.iD) {
			return ContentfwkPackage.eINSTANCE.getElement_ID();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices) {
			return ContentfwkPackage.eINSTANCE.getOrganizationUnit_OwnsAndGovernsServices();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors) {
			return ContentfwkPackage.eINSTANCE.getOrganizationUnit_ContainsActors();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions) {
			return ContentfwkPackage.eINSTANCE.getOrganizationUnit_OwnsFunctions();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses) {
			return ContentfwkPackage.eINSTANCE.getOrganizationUnit_ParticipatesInProcesses();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers) {
			return ContentfwkPackage.eINSTANCE.getOrganizationUnit_IsMotivatedByDrivers();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts) {
			return ContentfwkPackage.eINSTANCE.getOrganizationUnit_ProducesProducts();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation) {
			return ContentfwkPackage.eINSTANCE.getOrganizationUnit_OperatesInLocation();
		}
		if (editorKey == ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount) {
			return ContentfwkPackage.eINSTANCE.getOrganizationUnit_Headcount();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		OrganizationUnit organizationUnit = (OrganizationUnit)semanticObject;
		if (ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.OrganizationUnit.Attributes.name == event.getAffectedEditor()) {
			organizationUnit.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.OrganizationUnit.Attributes.description == event.getAffectedEditor()) {
			organizationUnit.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.OrganizationUnit.Attributes.category == event.getAffectedEditor()) {
			organizationUnit.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.OrganizationUnit.Attributes.source == event.getAffectedEditor()) {
			organizationUnit.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.OrganizationUnit.Attributes.owner == event.getAffectedEditor()) {
			organizationUnit.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.OrganizationUnit.Attributes.iD == event.getAffectedEditor()) {
			organizationUnit.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Service) {
					ownsAndGovernsServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ownsAndGovernsServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownsAndGovernsServicesSettings.move(event.getNewIndex(), (Service) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Function) {
					ownsFunctionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ownsFunctionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ownsFunctionsSettings.move(event.getNewIndex(), (Function) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Process) {
					participatesInProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				participatesInProcessesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				participatesInProcessesSettings.move(event.getNewIndex(), (Process) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Driver) {
					isMotivatedByDriversSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isMotivatedByDriversSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isMotivatedByDriversSettings.move(event.getNewIndex(), (Driver) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Product) {
					producesProductsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				producesProductsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				producesProductsSettings.move(event.getNewIndex(), (Product) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				operatesInLocationSettings.setToReference((Location)event.getNewValue());
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
				operatesInLocationSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount == event.getAffectedEditor()) {
			organizationUnit.setHeadcount((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			OrganizationUnitPropertiesEditionPart basePart = (OrganizationUnitPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getOrganizationUnit_OwnsAndGovernsServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices))
				basePart.updateOwnsAndGovernsServices();
			if (ContentfwkPackage.eINSTANCE.getOrganizationUnit_ContainsActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors))
				basePart.updateContainsActors();
			if (ContentfwkPackage.eINSTANCE.getOrganizationUnit_OwnsFunctions().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions))
				basePart.updateOwnsFunctions();
			if (ContentfwkPackage.eINSTANCE.getOrganizationUnit_ParticipatesInProcesses().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses))
				basePart.updateParticipatesInProcesses();
			if (ContentfwkPackage.eINSTANCE.getOrganizationUnit_IsMotivatedByDrivers().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers))
				basePart.updateIsMotivatedByDrivers();
			if (ContentfwkPackage.eINSTANCE.getOrganizationUnit_ProducesProducts().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts))
				basePart.updateProducesProducts();
			if (ContentfwkPackage.eINSTANCE.getOrganizationUnit_OperatesInLocation().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation))
				basePart.setOperatesInLocation((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getOrganizationUnit_Headcount().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount)) {
				if (msg.getNewValue() != null) {
					basePart.setHeadcount(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setHeadcount("");
				}
			}
			
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
				if (ContentfwkViewsRepository.OrganizationUnit.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.OrganizationUnit.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.OrganizationUnit.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.OrganizationUnit.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.OrganizationUnit.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.OrganizationUnit.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getOrganizationUnit_Headcount().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getOrganizationUnit_Headcount().getEAttributeType(), newValue);
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
