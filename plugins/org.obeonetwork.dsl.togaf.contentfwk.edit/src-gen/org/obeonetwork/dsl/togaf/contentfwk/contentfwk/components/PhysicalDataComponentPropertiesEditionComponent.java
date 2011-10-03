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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalDataComponentPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class PhysicalDataComponentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for extendsLogicalDataComponents ReferencesTable
	 */
	private	ReferencesTableSettings extendsLogicalDataComponentsSettings;
	
	/**
	 * Settings for isHotedInLocation EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings isHotedInLocationSettings;
	
	/**
	 * Settings for decomposesPhysicalDataComponent EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposesPhysicalDataComponentSettings;
	
	/**
	 * Settings for encapsulatesPhysicalApplicationComponents ReferencesTable
	 */
	private	ReferencesTableSettings encapsulatesPhysicalApplicationComponentsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PhysicalDataComponentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject physicalDataComponent, String editing_mode) {
		super(editingContext, physicalDataComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.PhysicalDataComponent.class;
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
			final PhysicalDataComponent physicalDataComponent = (PhysicalDataComponent)elt;
			final PhysicalDataComponentPropertiesEditionPart basePart = (PhysicalDataComponentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(physicalDataComponent, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(physicalDataComponent, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (physicalDataComponent.getName() != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalDataComponent.getName()));
			
			if (physicalDataComponent.getDescription() != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalDataComponent.getDescription()));
			
			if (physicalDataComponent.getCategory() != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalDataComponent.getCategory()));
			
			if (physicalDataComponent.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalDataComponent.getSourceDescr()));
			
			if (physicalDataComponent.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalDataComponent.getOwnerDescr()));
			
			if (physicalDataComponent.getID() != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalDataComponent.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.standardClass)) {
				basePart.initStandardClass((EEnum) ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEType(), physicalDataComponent.getStandardClass());
			}
			if (physicalDataComponent.getStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.standardCreationDate))
				basePart.setStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalDataComponent.getStandardCreationDate()));
			
			if (physicalDataComponent.getLastStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.lastStandardCreationDate))
				basePart.setLastStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalDataComponent.getLastStandardCreationDate()));
			
			if (physicalDataComponent.getNextStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.nextStandardCreationDate))
				basePart.setNextStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalDataComponent.getNextStandardCreationDate()));
			
			if (physicalDataComponent.getRetireDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.retireDate))
				basePart.setRetireDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalDataComponent.getRetireDate()));
			
			if (isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.extendsLogicalDataComponents)) {
				extendsLogicalDataComponentsSettings = new ReferencesTableSettings(physicalDataComponent, ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_ExtendsLogicalDataComponents());
				basePart.initExtendsLogicalDataComponents(extendsLogicalDataComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.isHotedInLocation)) {
				// init part
				isHotedInLocationSettings = new EObjectFlatComboSettings(physicalDataComponent, ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_IsHotedInLocation());
				basePart.initIsHotedInLocation(isHotedInLocationSettings);
				// set the button mode
				basePart.setIsHotedInLocationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.decomposesPhysicalDataComponent)) {
				// init part
				decomposesPhysicalDataComponentSettings = new EObjectFlatComboSettings(physicalDataComponent, ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_DecomposesPhysicalDataComponent());
				basePart.initDecomposesPhysicalDataComponent(decomposesPhysicalDataComponentSettings);
				// set the button mode
				basePart.setDecomposesPhysicalDataComponentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.encapsulatesPhysicalApplicationComponents)) {
				encapsulatesPhysicalApplicationComponentsSettings = new ReferencesTableSettings(physicalDataComponent, ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_EncapsulatesPhysicalApplicationComponents());
				basePart.initEncapsulatesPhysicalApplicationComponents(encapsulatesPhysicalApplicationComponentsSettings);
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
			
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToExtendsLogicalDataComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInExtendsLogicalDataComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToExtendsLogicalDataComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getLogicalDataComponent()));
			// Start of user code for additional businessfilters for extendsLogicalDataComponents
			
			// End of user code
			
			basePart.addFilterToIsHotedInLocation(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Location); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for isHotedInLocation
			
			// End of user code
			
			basePart.addFilterToDecomposesPhysicalDataComponent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof PhysicalDataComponent); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposesPhysicalDataComponent
			
			// End of user code
			
			basePart.addFilterToEncapsulatesPhysicalApplicationComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInEncapsulatesPhysicalApplicationComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToEncapsulatesPhysicalApplicationComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent()));
			// Start of user code for additional businessfilters for encapsulatesPhysicalApplicationComponents
			
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
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.delegates) {
			return ContentfwkPackage.eINSTANCE.getElement_Delegates();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.isDelegatedBy) {
			return ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.description) {
			return ContentfwkPackage.eINSTANCE.getElement_Description();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.category) {
			return ContentfwkPackage.eINSTANCE.getElement_Category();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.source) {
			return ContentfwkPackage.eINSTANCE.getElement_SourceDescr();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.owner) {
			return ContentfwkPackage.eINSTANCE.getElement_OwnerDescr();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.iD) {
			return ContentfwkPackage.eINSTANCE.getElement_ID();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.standardClass) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardClass();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.standardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.lastStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.nextStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.Attributes.retireDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_RetireDate();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.extendsLogicalDataComponents) {
			return ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_ExtendsLogicalDataComponents();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.isHotedInLocation) {
			return ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_IsHotedInLocation();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.decomposesPhysicalDataComponent) {
			return ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_DecomposesPhysicalDataComponent();
		}
		if (editorKey == ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.encapsulatesPhysicalApplicationComponents) {
			return ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_EncapsulatesPhysicalApplicationComponents();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PhysicalDataComponent physicalDataComponent = (PhysicalDataComponent)semanticObject;
		if (ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.delegates == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.name == event.getAffectedEditor()) {
			physicalDataComponent.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.description == event.getAffectedEditor()) {
			physicalDataComponent.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.category == event.getAffectedEditor()) {
			physicalDataComponent.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.source == event.getAffectedEditor()) {
			physicalDataComponent.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.owner == event.getAffectedEditor()) {
			physicalDataComponent.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.iD == event.getAffectedEditor()) {
			physicalDataComponent.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.standardClass == event.getAffectedEditor()) {
			physicalDataComponent.setStandardClass((StandardsClass)event.getNewValue());
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.standardCreationDate == event.getAffectedEditor()) {
			physicalDataComponent.setStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
			physicalDataComponent.setLastStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
			physicalDataComponent.setNextStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.retireDate == event.getAffectedEditor()) {
			physicalDataComponent.setRetireDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.extendsLogicalDataComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof LogicalDataComponent) {
					extendsLogicalDataComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				extendsLogicalDataComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				extendsLogicalDataComponentsSettings.move(event.getNewIndex(), (LogicalDataComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.isHotedInLocation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				isHotedInLocationSettings.setToReference((Location)event.getNewValue());
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
				isHotedInLocationSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.decomposesPhysicalDataComponent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decomposesPhysicalDataComponentSettings.setToReference((PhysicalDataComponent)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				PhysicalDataComponent eObject = ContentfwkFactory.eINSTANCE.createPhysicalDataComponent();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposesPhysicalDataComponentSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.encapsulatesPhysicalApplicationComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PhysicalApplicationComponent) {
					encapsulatesPhysicalApplicationComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				encapsulatesPhysicalApplicationComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				encapsulatesPhysicalApplicationComponentsSettings.move(event.getNewIndex(), (PhysicalApplicationComponent) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			PhysicalDataComponentPropertiesEditionPart basePart = (PhysicalDataComponentPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardClass().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.standardClass))
				basePart.setStandardClass((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.standardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.lastStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setLastStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setLastStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.nextStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setNextStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setNextStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_RetireDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.Attributes.retireDate)) {
				if (msg.getNewValue() != null) {
					basePart.setRetireDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setRetireDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_ExtendsLogicalDataComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.extendsLogicalDataComponents))
				basePart.updateExtendsLogicalDataComponents();
			if (ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_IsHotedInLocation().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.isHotedInLocation))
				basePart.setIsHotedInLocation((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_DecomposesPhysicalDataComponent().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.decomposesPhysicalDataComponent))
				basePart.setDecomposesPhysicalDataComponent((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getPhysicalDataComponent_EncapsulatesPhysicalApplicationComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalDataComponent.RelatedElements.encapsulatesPhysicalApplicationComponents))
				basePart.updateEncapsulatesPhysicalApplicationComponents();
			
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
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.standardClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.standardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalDataComponent.Attributes.retireDate == event.getAffectedEditor()) {
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
