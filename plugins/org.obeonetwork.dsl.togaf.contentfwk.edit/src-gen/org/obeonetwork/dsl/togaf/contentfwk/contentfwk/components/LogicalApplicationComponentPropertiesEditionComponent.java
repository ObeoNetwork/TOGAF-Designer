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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class LogicalApplicationComponentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for implementsServices ReferencesTable
	 */
	private	ReferencesTableSettings implementsServicesSettings;
	
	/**
	 * Settings for operatesOnDataEntities ReferencesTable
	 */
	private	ReferencesTableSettings operatesOnDataEntitiesSettings;
	
	/**
	 * Settings for isExtendedByPhysicalApplicationComponents ReferencesTable
	 */
	private	ReferencesTableSettings isExtendedByPhysicalApplicationComponentsSettings;
	
	/**
	 * Settings for communicatesWith ReferencesTable
	 */
	private	ReferencesTableSettings communicatesWithSettings;
	
	/**
	 * Settings for decomposesLogicalApplicationComponent EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposesLogicalApplicationComponentSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public LogicalApplicationComponentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject logicalApplicationComponent, String editing_mode) {
		super(editingContext, logicalApplicationComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.LogicalApplicationComponent.class;
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
			final LogicalApplicationComponent logicalApplicationComponent = (LogicalApplicationComponent)elt;
			final LogicalApplicationComponentPropertiesEditionPart basePart = (LogicalApplicationComponentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(logicalApplicationComponent, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(logicalApplicationComponent, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (logicalApplicationComponent.getName() != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalApplicationComponent.getName()));
			
			if (logicalApplicationComponent.getDescription() != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalApplicationComponent.getDescription()));
			
			if (logicalApplicationComponent.getCategory() != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalApplicationComponent.getCategory()));
			
			if (logicalApplicationComponent.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalApplicationComponent.getSourceDescr()));
			
			if (logicalApplicationComponent.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalApplicationComponent.getOwnerDescr()));
			
			if (logicalApplicationComponent.getID() != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), logicalApplicationComponent.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass)) {
				basePart.initStandardClass((EEnum) ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEType(), logicalApplicationComponent.getStandardClass());
			}
			if (logicalApplicationComponent.getStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate))
				basePart.setStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), logicalApplicationComponent.getStandardCreationDate()));
			
			if (logicalApplicationComponent.getLastStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate))
				basePart.setLastStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), logicalApplicationComponent.getLastStandardCreationDate()));
			
			if (logicalApplicationComponent.getNextStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate))
				basePart.setNextStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), logicalApplicationComponent.getNextStandardCreationDate()));
			
			if (logicalApplicationComponent.getRetireDate() != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate))
				basePart.setRetireDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), logicalApplicationComponent.getRetireDate()));
			
			if (isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices)) {
				implementsServicesSettings = new ReferencesTableSettings(logicalApplicationComponent, ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_ImplementsServices());
				basePart.initImplementsServices(implementsServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities)) {
				operatesOnDataEntitiesSettings = new ReferencesTableSettings(logicalApplicationComponent, ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_OperatesOnDataEntities());
				basePart.initOperatesOnDataEntities(operatesOnDataEntitiesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents)) {
				isExtendedByPhysicalApplicationComponentsSettings = new ReferencesTableSettings(logicalApplicationComponent, ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_IsExtendedByPhysicalApplicationComponents());
				basePart.initIsExtendedByPhysicalApplicationComponents(isExtendedByPhysicalApplicationComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith)) {
				communicatesWithSettings = new ReferencesTableSettings(logicalApplicationComponent, ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_CommunicatesWith());
				basePart.initCommunicatesWith(communicatesWithSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent)) {
				// init part
				decomposesLogicalApplicationComponentSettings = new EObjectFlatComboSettings(logicalApplicationComponent, ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_DecomposesLogicalApplicationComponent());
				basePart.initDecomposesLogicalApplicationComponent(decomposesLogicalApplicationComponentSettings);
				// set the button mode
				basePart.setDecomposesLogicalApplicationComponentButtonMode(ButtonsModeEnum.BROWSE);
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
			
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToImplementsServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInImplementsServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToImplementsServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getService()));
			// Start of user code for additional businessfilters for implementsServices
			
			// End of user code
			
			basePart.addFilterToOperatesOnDataEntities(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOperatesOnDataEntitiesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOperatesOnDataEntities(new EObjectFilter(ContentfwkPackage.eINSTANCE.getDataEntity()));
			// Start of user code for additional businessfilters for operatesOnDataEntities
			
			// End of user code
			
			basePart.addFilterToIsExtendedByPhysicalApplicationComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsExtendedByPhysicalApplicationComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsExtendedByPhysicalApplicationComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent()));
			// Start of user code for additional businessfilters for isExtendedByPhysicalApplicationComponents
			
			// End of user code
			
			basePart.addFilterToCommunicatesWith(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInCommunicatesWithTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToCommunicatesWith(new EObjectFilter(ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent()));
			// Start of user code for additional businessfilters for communicatesWith
			
			// End of user code
			
			basePart.addFilterToDecomposesLogicalApplicationComponent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof LogicalApplicationComponent); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposesLogicalApplicationComponent
			
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
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates) {
			return ContentfwkPackage.eINSTANCE.getElement_Delegates();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy) {
			return ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description) {
			return ContentfwkPackage.eINSTANCE.getElement_Description();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category) {
			return ContentfwkPackage.eINSTANCE.getElement_Category();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source) {
			return ContentfwkPackage.eINSTANCE.getElement_SourceDescr();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner) {
			return ContentfwkPackage.eINSTANCE.getElement_OwnerDescr();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD) {
			return ContentfwkPackage.eINSTANCE.getElement_ID();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardClass();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_RetireDate();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices) {
			return ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_ImplementsServices();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities) {
			return ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_OperatesOnDataEntities();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents) {
			return ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_IsExtendedByPhysicalApplicationComponents();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith) {
			return ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_CommunicatesWith();
		}
		if (editorKey == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent) {
			return ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_DecomposesLogicalApplicationComponent();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		LogicalApplicationComponent logicalApplicationComponent = (LogicalApplicationComponent)semanticObject;
		if (ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name == event.getAffectedEditor()) {
			logicalApplicationComponent.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description == event.getAffectedEditor()) {
			logicalApplicationComponent.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category == event.getAffectedEditor()) {
			logicalApplicationComponent.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source == event.getAffectedEditor()) {
			logicalApplicationComponent.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner == event.getAffectedEditor()) {
			logicalApplicationComponent.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD == event.getAffectedEditor()) {
			logicalApplicationComponent.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass == event.getAffectedEditor()) {
			logicalApplicationComponent.setStandardClass((StandardsClass)event.getNewValue());
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate == event.getAffectedEditor()) {
			logicalApplicationComponent.setStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
			logicalApplicationComponent.setLastStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
			logicalApplicationComponent.setNextStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate == event.getAffectedEditor()) {
			logicalApplicationComponent.setRetireDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Service) {
					implementsServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				implementsServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				implementsServicesSettings.move(event.getNewIndex(), (Service) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof DataEntity) {
					operatesOnDataEntitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				operatesOnDataEntitiesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				operatesOnDataEntitiesSettings.move(event.getNewIndex(), (DataEntity) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof PhysicalApplicationComponent) {
					isExtendedByPhysicalApplicationComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isExtendedByPhysicalApplicationComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isExtendedByPhysicalApplicationComponentsSettings.move(event.getNewIndex(), (PhysicalApplicationComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof LogicalApplicationComponent) {
					communicatesWithSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				communicatesWithSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				communicatesWithSettings.move(event.getNewIndex(), (LogicalApplicationComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decomposesLogicalApplicationComponentSettings.setToReference((LogicalApplicationComponent)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				LogicalApplicationComponent eObject = ContentfwkFactory.eINSTANCE.createLogicalApplicationComponent();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposesLogicalApplicationComponentSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			LogicalApplicationComponentPropertiesEditionPart basePart = (LogicalApplicationComponentPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardClass().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass))
				basePart.setStandardClass((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setLastStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setLastStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setNextStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setNextStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_RetireDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate)) {
				if (msg.getNewValue() != null) {
					basePart.setRetireDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setRetireDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_ImplementsServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices))
				basePart.updateImplementsServices();
			if (ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_OperatesOnDataEntities().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities))
				basePart.updateOperatesOnDataEntities();
			if (ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_IsExtendedByPhysicalApplicationComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents))
				basePart.updateIsExtendedByPhysicalApplicationComponents();
			if (ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_CommunicatesWith().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith))
				basePart.updateCommunicatesWith();
			if (ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent_DecomposesLogicalApplicationComponent().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent))
				basePart.setDecomposesLogicalApplicationComponent((EObject)msg.getNewValue());
			
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
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate == event.getAffectedEditor()) {
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
