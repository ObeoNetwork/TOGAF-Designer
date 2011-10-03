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
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class LogicalTechnologyComponentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for providesPlatformForServices ReferencesTable
	 */
	private	ReferencesTableSettings providesPlatformForServicesSettings;
	
	/**
	 * Settings for suppliesPlatformServices ReferencesTable
	 */
	private	ReferencesTableSettings suppliesPlatformServicesSettings;
	
	/**
	 * Settings for isRealizedByPhysicalTechnologyComponents ReferencesTable
	 */
	private	ReferencesTableSettings isRealizedByPhysicalTechnologyComponentsSettings;
	
	/**
	 * Settings for decomposesLogicalTechnologyComponent EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposesLogicalTechnologyComponentSettings;
	
	/**
	 * Settings for isDependentOnLogicalTechnologyComponents ReferencesTable
	 */
	private	ReferencesTableSettings isDependentOnLogicalTechnologyComponentsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public LogicalTechnologyComponentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject logicalTechnologyComponent, String editing_mode) {
		super(editingContext, logicalTechnologyComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.LogicalTechnologyComponent.class;
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
			final LogicalTechnologyComponent logicalTechnologyComponent = (LogicalTechnologyComponent)elt;
			final LogicalTechnologyComponentPropertiesEditionPart basePart = (LogicalTechnologyComponentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(logicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(logicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (logicalTechnologyComponent.getName() != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalTechnologyComponent.getName()));
			
			if (logicalTechnologyComponent.getDescription() != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalTechnologyComponent.getDescription()));
			
			if (logicalTechnologyComponent.getCategory() != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalTechnologyComponent.getCategory()));
			
			if (logicalTechnologyComponent.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalTechnologyComponent.getSourceDescr()));
			
			if (logicalTechnologyComponent.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalTechnologyComponent.getOwnerDescr()));
			
			if (logicalTechnologyComponent.getID() != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalTechnologyComponent.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass)) {
				basePart.initStandardClass((EEnum) ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEType(), logicalTechnologyComponent.getStandardClass());
			}
			if (logicalTechnologyComponent.getStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate))
				basePart.setStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), logicalTechnologyComponent.getStandardCreationDate()));
			
			if (logicalTechnologyComponent.getLastStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate))
				basePart.setLastStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), logicalTechnologyComponent.getLastStandardCreationDate()));
			
			if (logicalTechnologyComponent.getNextStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate))
				basePart.setNextStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), logicalTechnologyComponent.getNextStandardCreationDate()));
			
			if (logicalTechnologyComponent.getRetireDate() != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate))
				basePart.setRetireDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), logicalTechnologyComponent.getRetireDate()));
			
			if (isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices)) {
				providesPlatformForServicesSettings = new ReferencesTableSettings(logicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_ProvidesPlatformForServices());
				basePart.initProvidesPlatformForServices(providesPlatformForServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices)) {
				suppliesPlatformServicesSettings = new ReferencesTableSettings(logicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_SuppliesPlatformServices());
				basePart.initSuppliesPlatformServices(suppliesPlatformServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents)) {
				isRealizedByPhysicalTechnologyComponentsSettings = new ReferencesTableSettings(logicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_IsRealizedByPhysicalTechnologyComponents());
				basePart.initIsRealizedByPhysicalTechnologyComponents(isRealizedByPhysicalTechnologyComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent)) {
				// init part
				decomposesLogicalTechnologyComponentSettings = new EObjectFlatComboSettings(logicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_DecomposesLogicalTechnologyComponent());
				basePart.initDecomposesLogicalTechnologyComponent(decomposesLogicalTechnologyComponentSettings);
				// set the button mode
				basePart.setDecomposesLogicalTechnologyComponentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents)) {
				isDependentOnLogicalTechnologyComponentsSettings = new ReferencesTableSettings(logicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_IsDependentOnLogicalTechnologyComponents());
				basePart.initIsDependentOnLogicalTechnologyComponents(isDependentOnLogicalTechnologyComponentsSettings);
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
			
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToProvidesPlatformForServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInProvidesPlatformForServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToProvidesPlatformForServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getService()));
			// Start of user code for additional businessfilters for providesPlatformForServices
			
			// End of user code
			
			basePart.addFilterToSuppliesPlatformServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSuppliesPlatformServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSuppliesPlatformServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPlatformService()));
			// Start of user code for additional businessfilters for suppliesPlatformServices
			
			// End of user code
			
			basePart.addFilterToIsRealizedByPhysicalTechnologyComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsRealizedByPhysicalTechnologyComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsRealizedByPhysicalTechnologyComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent()));
			// Start of user code for additional businessfilters for isRealizedByPhysicalTechnologyComponents
			
			// End of user code
			
			basePart.addFilterToDecomposesLogicalTechnologyComponent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof LogicalTechnologyComponent); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposesLogicalTechnologyComponent
			
			// End of user code
			
			basePart.addFilterToIsDependentOnLogicalTechnologyComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsDependentOnLogicalTechnologyComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsDependentOnLogicalTechnologyComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent()));
			// Start of user code for additional businessfilters for isDependentOnLogicalTechnologyComponents
			
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
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates) {
			return ContentfwkPackage.eINSTANCE.getElement_Delegates();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy) {
			return ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description) {
			return ContentfwkPackage.eINSTANCE.getElement_Description();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category) {
			return ContentfwkPackage.eINSTANCE.getElement_Category();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source) {
			return ContentfwkPackage.eINSTANCE.getElement_SourceDescr();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner) {
			return ContentfwkPackage.eINSTANCE.getElement_OwnerDescr();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD) {
			return ContentfwkPackage.eINSTANCE.getElement_ID();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardClass();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_RetireDate();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices) {
			return ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_ProvidesPlatformForServices();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices) {
			return ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_SuppliesPlatformServices();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents) {
			return ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_IsRealizedByPhysicalTechnologyComponents();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent) {
			return ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_DecomposesLogicalTechnologyComponent();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents) {
			return ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_IsDependentOnLogicalTechnologyComponents();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		LogicalTechnologyComponent logicalTechnologyComponent = (LogicalTechnologyComponent)semanticObject;
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name == event.getAffectedEditor()) {
			logicalTechnologyComponent.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description == event.getAffectedEditor()) {
			logicalTechnologyComponent.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category == event.getAffectedEditor()) {
			logicalTechnologyComponent.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source == event.getAffectedEditor()) {
			logicalTechnologyComponent.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner == event.getAffectedEditor()) {
			logicalTechnologyComponent.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD == event.getAffectedEditor()) {
			logicalTechnologyComponent.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass == event.getAffectedEditor()) {
			logicalTechnologyComponent.setStandardClass((StandardsClass)event.getNewValue());
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate == event.getAffectedEditor()) {
			logicalTechnologyComponent.setStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
			logicalTechnologyComponent.setLastStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
			logicalTechnologyComponent.setNextStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate == event.getAffectedEditor()) {
			logicalTechnologyComponent.setRetireDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Service) {
					providesPlatformForServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				providesPlatformForServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				providesPlatformForServicesSettings.move(event.getNewIndex(), (Service) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PlatformService) {
					suppliesPlatformServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				suppliesPlatformServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				suppliesPlatformServicesSettings.move(event.getNewIndex(), (PlatformService) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PhysicalTechnologyComponent) {
					isRealizedByPhysicalTechnologyComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isRealizedByPhysicalTechnologyComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isRealizedByPhysicalTechnologyComponentsSettings.move(event.getNewIndex(), (PhysicalTechnologyComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decomposesLogicalTechnologyComponentSettings.setToReference((LogicalTechnologyComponent)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				LogicalTechnologyComponent eObject = ContentfwkFactory.eINSTANCE.createLogicalTechnologyComponent();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposesLogicalTechnologyComponentSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof LogicalTechnologyComponent) {
					isDependentOnLogicalTechnologyComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isDependentOnLogicalTechnologyComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isDependentOnLogicalTechnologyComponentsSettings.move(event.getNewIndex(), (LogicalTechnologyComponent) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			LogicalTechnologyComponentPropertiesEditionPart basePart = (LogicalTechnologyComponentPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardClass().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass))
				basePart.setStandardClass((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setLastStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setLastStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setNextStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setNextStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_RetireDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate)) {
				if (msg.getNewValue() != null) {
					basePart.setRetireDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setRetireDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_ProvidesPlatformForServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices))
				basePart.updateProvidesPlatformForServices();
			if (ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_SuppliesPlatformServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices))
				basePart.updateSuppliesPlatformServices();
			if (ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_IsRealizedByPhysicalTechnologyComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents))
				basePart.updateIsRealizedByPhysicalTechnologyComponents();
			if (ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_DecomposesLogicalTechnologyComponent().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent))
				basePart.setDecomposesLogicalTechnologyComponent((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent_IsDependentOnLogicalTechnologyComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents))
				basePart.updateIsDependentOnLogicalTechnologyComponents();
			
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
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_RetireDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_RetireDate().getEAttributeType(), newValue);
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
