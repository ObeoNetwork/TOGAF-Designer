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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class PhysicalTechnologyComponentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for realizesApplicationComponents ReferencesTable
	 */
	private	ReferencesTableSettings realizesApplicationComponentsSettings;
	
	/**
	 * Settings for extendsLogicalTechnologyComponents ReferencesTable
	 */
	private	ReferencesTableSettings extendsLogicalTechnologyComponentsSettings;
	
	/**
	 * Settings for isHostedInLocation ReferencesTable
	 */
	private	ReferencesTableSettings isHostedInLocationSettings;
	
	/**
	 * Settings for decomposesPhysicalTechnologyComponent EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposesPhysicalTechnologyComponentSettings;
	
	/**
	 * Settings for isDependentOnPhysicalTechnologyComponents ReferencesTable
	 */
	private	ReferencesTableSettings isDependentOnPhysicalTechnologyComponentsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PhysicalTechnologyComponentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject physicalTechnologyComponent, String editing_mode) {
		super(editingContext, physicalTechnologyComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.PhysicalTechnologyComponent.class;
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
			final PhysicalTechnologyComponent physicalTechnologyComponent = (PhysicalTechnologyComponent)elt;
			final PhysicalTechnologyComponentPropertiesEditionPart basePart = (PhysicalTechnologyComponentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(physicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(physicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (physicalTechnologyComponent.getName() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalTechnologyComponent.getName()));
			
			if (physicalTechnologyComponent.getDescription() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalTechnologyComponent.getDescription()));
			
			if (physicalTechnologyComponent.getCategory() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalTechnologyComponent.getCategory()));
			
			if (physicalTechnologyComponent.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalTechnologyComponent.getSourceDescr()));
			
			if (physicalTechnologyComponent.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalTechnologyComponent.getOwnerDescr()));
			
			if (physicalTechnologyComponent.getID() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalTechnologyComponent.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass)) {
				basePart.initStandardClass((EEnum) ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEType(), physicalTechnologyComponent.getStandardClass());
			}
			if (physicalTechnologyComponent.getStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate))
				basePart.setStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalTechnologyComponent.getStandardCreationDate()));
			
			if (physicalTechnologyComponent.getLastStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate))
				basePart.setLastStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalTechnologyComponent.getLastStandardCreationDate()));
			
			if (physicalTechnologyComponent.getNextStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate))
				basePart.setNextStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalTechnologyComponent.getNextStandardCreationDate()));
			
			if (physicalTechnologyComponent.getRetireDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate))
				basePart.setRetireDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalTechnologyComponent.getRetireDate()));
			
			if (isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents)) {
				realizesApplicationComponentsSettings = new ReferencesTableSettings(physicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_RealizesApplicationComponents());
				basePart.initRealizesApplicationComponents(realizesApplicationComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents)) {
				extendsLogicalTechnologyComponentsSettings = new ReferencesTableSettings(physicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ExtendsLogicalTechnologyComponents());
				basePart.initExtendsLogicalTechnologyComponents(extendsLogicalTechnologyComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation)) {
				isHostedInLocationSettings = new ReferencesTableSettings(physicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_IsHostedInLocation());
				basePart.initIsHostedInLocation(isHostedInLocationSettings);
			}
			if (physicalTechnologyComponent.getProductName() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName))
				basePart.setProductName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalTechnologyComponent.getProductName()));
			
			if (physicalTechnologyComponent.getModuleName() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName))
				basePart.setModuleName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalTechnologyComponent.getModuleName()));
			
			if (physicalTechnologyComponent.getVendor() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor))
				basePart.setVendor(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalTechnologyComponent.getVendor()));
			
			if (physicalTechnologyComponent.getVersion() != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalTechnologyComponent.getVersion()));
			
			if (isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent)) {
				// init part
				decomposesPhysicalTechnologyComponentSettings = new EObjectFlatComboSettings(physicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_DecomposesPhysicalTechnologyComponent());
				basePart.initDecomposesPhysicalTechnologyComponent(decomposesPhysicalTechnologyComponentSettings);
				// set the button mode
				basePart.setDecomposesPhysicalTechnologyComponentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents)) {
				isDependentOnPhysicalTechnologyComponentsSettings = new ReferencesTableSettings(physicalTechnologyComponent, ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_IsDependentOnPhysicalTechnologyComponents());
				basePart.initIsDependentOnPhysicalTechnologyComponents(isDependentOnPhysicalTechnologyComponentsSettings);
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
			
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToRealizesApplicationComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInRealizesApplicationComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToRealizesApplicationComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent()));
			// Start of user code for additional businessfilters for realizesApplicationComponents
			
			// End of user code
			
			basePart.addFilterToExtendsLogicalTechnologyComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInExtendsLogicalTechnologyComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToExtendsLogicalTechnologyComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent()));
			// Start of user code for additional businessfilters for extendsLogicalTechnologyComponents
			
			// End of user code
			
			basePart.addFilterToIsHostedInLocation(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsHostedInLocationTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsHostedInLocation(new EObjectFilter(ContentfwkPackage.eINSTANCE.getLocation()));
			// Start of user code for additional businessfilters for isHostedInLocation
			
			// End of user code
			
			
			
			
			
			basePart.addFilterToDecomposesPhysicalTechnologyComponent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof PhysicalTechnologyComponent); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposesPhysicalTechnologyComponent
			
			// End of user code
			
			basePart.addFilterToIsDependentOnPhysicalTechnologyComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsDependentOnPhysicalTechnologyComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsDependentOnPhysicalTechnologyComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent()));
			// Start of user code for additional businessfilters for isDependentOnPhysicalTechnologyComponents
			
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
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates) {
			return ContentfwkPackage.eINSTANCE.getElement_Delegates();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy) {
			return ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description) {
			return ContentfwkPackage.eINSTANCE.getElement_Description();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category) {
			return ContentfwkPackage.eINSTANCE.getElement_Category();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source) {
			return ContentfwkPackage.eINSTANCE.getElement_SourceDescr();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner) {
			return ContentfwkPackage.eINSTANCE.getElement_OwnerDescr();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD) {
			return ContentfwkPackage.eINSTANCE.getElement_ID();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardClass();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_RetireDate();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents) {
			return ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_RealizesApplicationComponents();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents) {
			return ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ExtendsLogicalTechnologyComponents();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation) {
			return ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_IsHostedInLocation();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName) {
			return ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ProductName();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName) {
			return ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ModuleName();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor) {
			return ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_Vendor();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version) {
			return ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_Version();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent) {
			return ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_DecomposesPhysicalTechnologyComponent();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents) {
			return ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_IsDependentOnPhysicalTechnologyComponents();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PhysicalTechnologyComponent physicalTechnologyComponent = (PhysicalTechnologyComponent)semanticObject;
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name == event.getAffectedEditor()) {
			physicalTechnologyComponent.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description == event.getAffectedEditor()) {
			physicalTechnologyComponent.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category == event.getAffectedEditor()) {
			physicalTechnologyComponent.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source == event.getAffectedEditor()) {
			physicalTechnologyComponent.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner == event.getAffectedEditor()) {
			physicalTechnologyComponent.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD == event.getAffectedEditor()) {
			physicalTechnologyComponent.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass == event.getAffectedEditor()) {
			physicalTechnologyComponent.setStandardClass((StandardsClass)event.getNewValue());
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate == event.getAffectedEditor()) {
			physicalTechnologyComponent.setStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
			physicalTechnologyComponent.setLastStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
			physicalTechnologyComponent.setNextStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate == event.getAffectedEditor()) {
			physicalTechnologyComponent.setRetireDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PhysicalApplicationComponent) {
					realizesApplicationComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				realizesApplicationComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				realizesApplicationComponentsSettings.move(event.getNewIndex(), (PhysicalApplicationComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof LogicalTechnologyComponent) {
					extendsLogicalTechnologyComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				extendsLogicalTechnologyComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				extendsLogicalTechnologyComponentsSettings.move(event.getNewIndex(), (LogicalTechnologyComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Location) {
					isHostedInLocationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isHostedInLocationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isHostedInLocationSettings.move(event.getNewIndex(), (Location) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName == event.getAffectedEditor()) {
			physicalTechnologyComponent.setProductName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName == event.getAffectedEditor()) {
			physicalTechnologyComponent.setModuleName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor == event.getAffectedEditor()) {
			physicalTechnologyComponent.setVendor((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version == event.getAffectedEditor()) {
			physicalTechnologyComponent.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decomposesPhysicalTechnologyComponentSettings.setToReference((PhysicalTechnologyComponent)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				PhysicalTechnologyComponent eObject = ContentfwkFactory.eINSTANCE.createPhysicalTechnologyComponent();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposesPhysicalTechnologyComponentSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PhysicalTechnologyComponent) {
					isDependentOnPhysicalTechnologyComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isDependentOnPhysicalTechnologyComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isDependentOnPhysicalTechnologyComponentsSettings.move(event.getNewIndex(), (PhysicalTechnologyComponent) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			PhysicalTechnologyComponentPropertiesEditionPart basePart = (PhysicalTechnologyComponentPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardClass().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass))
				basePart.setStandardClass((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setLastStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setLastStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setNextStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setNextStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_RetireDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate)) {
				if (msg.getNewValue() != null) {
					basePart.setRetireDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setRetireDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_RealizesApplicationComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents))
				basePart.updateRealizesApplicationComponents();
			if (ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ExtendsLogicalTechnologyComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents))
				basePart.updateExtendsLogicalTechnologyComponents();
			if (ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_IsHostedInLocation().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation))
				basePart.updateIsHostedInLocation();
			if (ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ProductName().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName)) {
				if (msg.getNewValue() != null) {
					basePart.setProductName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setProductName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ModuleName().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName)) {
				if (msg.getNewValue() != null) {
					basePart.setModuleName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setModuleName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_Vendor().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor)) {
				if (msg.getNewValue() != null) {
					basePart.setVendor(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVendor("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_Version().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_DecomposesPhysicalTechnologyComponent().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent))
				basePart.setDecomposesPhysicalTechnologyComponent((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_IsDependentOnPhysicalTechnologyComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents))
				basePart.updateIsDependentOnPhysicalTechnologyComponents();
			
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
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_RetireDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_RetireDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ProductName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ProductName().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ModuleName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_ModuleName().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_Vendor().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_Vendor().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalTechnologyComponent_Version().getEAttributeType(), newValue);
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
