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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntityCategory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class DataEntityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for isSuppliedByActors ReferencesTable
	 */
	private	ReferencesTableSettings isSuppliedByActorsSettings;
	
	/**
	 * Settings for isConsumedByActors ReferencesTable
	 */
	private	ReferencesTableSettings isConsumedByActorsSettings;
	
	/**
	 * Settings for isAccessedByServices ReferencesTable
	 */
	private	ReferencesTableSettings isAccessedByServicesSettings;
	
	/**
	 * Settings for isUpdatedThroughServices ReferencesTable
	 */
	private	ReferencesTableSettings isUpdatedThroughServicesSettings;
	
	/**
	 * Settings for residesWithinLogicalDataComponent EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings residesWithinLogicalDataComponentSettings;
	
	/**
	 * Settings for isProcessesByLogicalApplicationComponents ReferencesTable
	 */
	private	ReferencesTableSettings isProcessesByLogicalApplicationComponentsSettings;
	
	/**
	 * Settings for decomposeEntity EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposeEntitySettings;
	
	/**
	 * Settings for relatesTo ReferencesTable
	 */
	private	ReferencesTableSettings relatesToSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public DataEntityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject dataEntity, String editing_mode) {
		super(editingContext, dataEntity, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.DataEntity.class;
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
			final DataEntity dataEntity = (DataEntity)elt;
			final DataEntityPropertiesEditionPart basePart = (DataEntityPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(dataEntity, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(dataEntity, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (dataEntity.getName() != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dataEntity.getName()));
			
			if (dataEntity.getDescription() != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dataEntity.getDescription()));
			
			if (dataEntity.getCategory() != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dataEntity.getCategory()));
			
			if (dataEntity.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dataEntity.getSourceDescr()));
			
			if (dataEntity.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dataEntity.getOwnerDescr()));
			
			if (dataEntity.getID() != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dataEntity.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors)) {
				isSuppliedByActorsSettings = new ReferencesTableSettings(dataEntity, ContentfwkPackage.eINSTANCE.getDataEntity_IsSuppliedByActors());
				basePart.initIsSuppliedByActors(isSuppliedByActorsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors)) {
				isConsumedByActorsSettings = new ReferencesTableSettings(dataEntity, ContentfwkPackage.eINSTANCE.getDataEntity_IsConsumedByActors());
				basePart.initIsConsumedByActors(isConsumedByActorsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices)) {
				isAccessedByServicesSettings = new ReferencesTableSettings(dataEntity, ContentfwkPackage.eINSTANCE.getDataEntity_IsAccessedByServices());
				basePart.initIsAccessedByServices(isAccessedByServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices)) {
				isUpdatedThroughServicesSettings = new ReferencesTableSettings(dataEntity, ContentfwkPackage.eINSTANCE.getDataEntity_IsUpdatedThroughServices());
				basePart.initIsUpdatedThroughServices(isUpdatedThroughServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.residesWithinLogicalDataComponent)) {
				// init part
				residesWithinLogicalDataComponentSettings = new EObjectFlatComboSettings(dataEntity, ContentfwkPackage.eINSTANCE.getDataEntity_ResidesWithinLogicalDataComponent());
				basePart.initResidesWithinLogicalDataComponent(residesWithinLogicalDataComponentSettings);
				// set the button mode
				basePart.setResidesWithinLogicalDataComponentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents)) {
				isProcessesByLogicalApplicationComponentsSettings = new ReferencesTableSettings(dataEntity, ContentfwkPackage.eINSTANCE.getDataEntity_IsProcessesByLogicalApplicationComponents());
				basePart.initIsProcessesByLogicalApplicationComponents(isProcessesByLogicalApplicationComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.dataEntityCategory)) {
				basePart.initDataEntityCategory((EEnum) ContentfwkPackage.eINSTANCE.getDataEntity_DataEntityCategory().getEType(), dataEntity.getDataEntityCategory());
			}
			if (dataEntity.getPrivacyClassification() != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification))
				basePart.setPrivacyClassification(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dataEntity.getPrivacyClassification()));
			
			if (dataEntity.getRetentionClassification() != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification))
				basePart.setRetentionClassification(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dataEntity.getRetentionClassification()));
			
			if (isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.decomposeEntity)) {
				// init part
				decomposeEntitySettings = new EObjectFlatComboSettings(dataEntity, ContentfwkPackage.eINSTANCE.getDataEntity_DecomposeEntity());
				basePart.initDecomposeEntity(decomposeEntitySettings);
				// set the button mode
				basePart.setDecomposeEntityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo)) {
				relatesToSettings = new ReferencesTableSettings(dataEntity, ContentfwkPackage.eINSTANCE.getDataEntity_RelatesTo());
				basePart.initRelatesTo(relatesToSettings);
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
			
			
			
			
			
			
			
			basePart.addFilterToIsSuppliedByActors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsSuppliedByActorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsSuppliedByActors(new EObjectFilter(ContentfwkPackage.eINSTANCE.getActor()));
			// Start of user code for additional businessfilters for isSuppliedByActors
			
			// End of user code
			
			basePart.addFilterToIsConsumedByActors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsConsumedByActorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsConsumedByActors(new EObjectFilter(ContentfwkPackage.eINSTANCE.getActor()));
			// Start of user code for additional businessfilters for isConsumedByActors
			
			// End of user code
			
			basePart.addFilterToIsAccessedByServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsAccessedByServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsAccessedByServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getService()));
			// Start of user code for additional businessfilters for isAccessedByServices
			
			// End of user code
			
			basePart.addFilterToIsUpdatedThroughServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsUpdatedThroughServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsUpdatedThroughServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getService()));
			// Start of user code for additional businessfilters for isUpdatedThroughServices
			
			// End of user code
			
			basePart.addFilterToResidesWithinLogicalDataComponent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof LogicalDataComponent); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for residesWithinLogicalDataComponent
			
			// End of user code
			
			basePart.addFilterToIsProcessesByLogicalApplicationComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsProcessesByLogicalApplicationComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsProcessesByLogicalApplicationComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent()));
			// Start of user code for additional businessfilters for isProcessesByLogicalApplicationComponents
			
			// End of user code
			
			
			
			
			basePart.addFilterToDecomposeEntity(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof DataEntity); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposeEntity
			
			// End of user code
			
			basePart.addFilterToRelatesTo(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInRelatesToTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToRelatesTo(new EObjectFilter(ContentfwkPackage.eINSTANCE.getDataEntity()));
			// Start of user code for additional businessfilters for relatesTo
			
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
		DataEntity dataEntity = (DataEntity)semanticObject;
		if (ContentfwkViewsRepository.DataEntity.RelatedElements.delegates == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					delegatesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					delegatesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					isDelegatedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isDelegatedBySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.DataEntity.Attributes.name == event.getAffectedEditor()) {
			dataEntity.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.DataEntity.Attributes.description == event.getAffectedEditor()) {
			dataEntity.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.DataEntity.Attributes.category == event.getAffectedEditor()) {
			dataEntity.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.DataEntity.Attributes.source == event.getAffectedEditor()) {
			dataEntity.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.DataEntity.Attributes.owner == event.getAffectedEditor()) {
			dataEntity.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.DataEntity.Attributes.iD == event.getAffectedEditor()) {
			dataEntity.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Actor) {
					isSuppliedByActorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isSuppliedByActorsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Actor) {
					isConsumedByActorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isConsumedByActorsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Service) {
					isAccessedByServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isAccessedByServicesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Service) {
					isUpdatedThroughServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isUpdatedThroughServicesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.DataEntity.RelatedElements.residesWithinLogicalDataComponent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)  {
				residesWithinLogicalDataComponentSettings.setToReference((LogicalDataComponent)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD)  {
				LogicalDataComponent eObject = ContentfwkFactory.eINSTANCE.createLogicalDataComponent();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				residesWithinLogicalDataComponentSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof LogicalApplicationComponent) {
					isProcessesByLogicalApplicationComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isProcessesByLogicalApplicationComponentsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.DataEntity.Attributes.dataEntityCategory == event.getAffectedEditor()) {
			dataEntity.setDataEntityCategory((DataEntityCategory)event.getNewValue());
		}
		if (ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification == event.getAffectedEditor()) {
			dataEntity.setPrivacyClassification((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification == event.getAffectedEditor()) {
			dataEntity.setRetentionClassification((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.DataEntity.RelatedElements.decomposeEntity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)  {
				decomposeEntitySettings.setToReference((DataEntity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD)  {
				DataEntity eObject = ContentfwkFactory.eINSTANCE.createDataEntity();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposeEntitySettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof DataEntity) {
					relatesToSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					relatesToSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DataEntityPropertiesEditionPart basePart = (DataEntityPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getDataEntity_IsSuppliedByActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors))
				basePart.updateIsSuppliedByActors();
			if (ContentfwkPackage.eINSTANCE.getDataEntity_IsConsumedByActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors))
				basePart.updateIsConsumedByActors();
			if (ContentfwkPackage.eINSTANCE.getDataEntity_IsAccessedByServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices))
				basePart.updateIsAccessedByServices();
			if (ContentfwkPackage.eINSTANCE.getDataEntity_IsUpdatedThroughServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices))
				basePart.updateIsUpdatedThroughServices();
			if (ContentfwkPackage.eINSTANCE.getDataEntity_ResidesWithinLogicalDataComponent().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.residesWithinLogicalDataComponent))
				basePart.setResidesWithinLogicalDataComponent((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getDataEntity_IsProcessesByLogicalApplicationComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents))
				basePart.updateIsProcessesByLogicalApplicationComponents();
			if (ContentfwkPackage.eINSTANCE.getDataEntity_DataEntityCategory().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.dataEntityCategory))
				basePart.setDataEntityCategory((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getDataEntity_PrivacyClassification().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification)) {
				if (msg.getNewValue() != null) {
					basePart.setPrivacyClassification(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPrivacyClassification("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getDataEntity_RetentionClassification().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification)) {
				if (msg.getNewValue() != null) {
					basePart.setRetentionClassification(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setRetentionClassification("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getDataEntity_DecomposeEntity().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.decomposeEntity))
				basePart.setDecomposeEntity((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getDataEntity_RelatesTo().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo))
				basePart.updateRelatesTo();
			
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
				if (ContentfwkViewsRepository.DataEntity.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.DataEntity.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.DataEntity.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.DataEntity.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.DataEntity.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.DataEntity.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.DataEntity.Attributes.dataEntityCategory == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getDataEntity_DataEntityCategory().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getDataEntity_DataEntityCategory().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getDataEntity_PrivacyClassification().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getDataEntity_PrivacyClassification().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getDataEntity_RetentionClassification().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getDataEntity_RetentionClassification().getEAttributeType(), newValue);
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
