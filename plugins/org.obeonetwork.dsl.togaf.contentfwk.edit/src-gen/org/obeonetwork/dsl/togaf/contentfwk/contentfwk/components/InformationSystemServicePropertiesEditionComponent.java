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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class InformationSystemServicePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for isProvidedToActors ReferencesTable
	 */
	private	ReferencesTableSettings isProvidedToActorsSettings;
	
	/**
	 * Settings for providesGovernedInterfaceToAccessFunctions ReferencesTable
	 */
	private	ReferencesTableSettings providesGovernedInterfaceToAccessFunctionsSettings;
	
	/**
	 * Settings for providesEntities ReferencesTable
	 */
	private	ReferencesTableSettings providesEntitiesSettings;
	
	/**
	 * Settings for consumesEntities ReferencesTable
	 */
	private	ReferencesTableSettings consumesEntitiesSettings;
	
	/**
	 * Settings for isGovernedAndMeasuredByContracts ReferencesTable
	 */
	private	ReferencesTableSettings isGovernedAndMeasuredByContractsSettings;
	
	/**
	 * Settings for resolvesEvents ReferencesTable
	 */
	private	ReferencesTableSettings resolvesEventsSettings;
	
	/**
	 * Settings for isImplementedOnLogicalTechnologyComponents ReferencesTable
	 */
	private	ReferencesTableSettings isImplementedOnLogicalTechnologyComponentsSettings;
	
	/**
	 * Settings for isRealizedThroughLogicalApplicationComponent ReferencesTable
	 */
	private	ReferencesTableSettings isRealizedThroughLogicalApplicationComponentSettings;
	
	/**
	 * Settings for isOwnedAndGovernedByOrganizationUnits ReferencesTable
	 */
	private	ReferencesTableSettings isOwnedAndGovernedByOrganizationUnitsSettings;
	
	/**
	 * Settings for isTrackedAgainstMeasures ReferencesTable
	 */
	private	ReferencesTableSettings isTrackedAgainstMeasuresSettings;
	
	/**
	 * Settings for supportsProcesses ReferencesTable
	 */
	private	ReferencesTableSettings supportsProcessesSettings;
	
	/**
	 * Settings for isRealizedByProcesses ReferencesTable
	 */
	private	ReferencesTableSettings isRealizedByProcessesSettings;
	
	/**
	 * Settings for meetsQualities ReferencesTable
	 */
	private	ReferencesTableSettings meetsQualitiesSettings;
	
	/**
	 * Settings for consumesServices ReferencesTable
	 */
	private	ReferencesTableSettings consumesServicesSettings;
	
	/**
	 * Settings for decomposesServices ReferencesTable
	 */
	private	ReferencesTableSettings decomposesServicesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public InformationSystemServicePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject informationSystemService, String editing_mode) {
		super(editingContext, informationSystemService, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.InformationSystemService.class;
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
			final InformationSystemService informationSystemService = (InformationSystemService)elt;
			final InformationSystemServicePropertiesEditionPart basePart = (InformationSystemServicePropertiesEditionPart)editingPart;
			// init values
			if (informationSystemService.getName() != null && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), informationSystemService.getName()));
			
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass)) {
				basePart.initStandardClass((EEnum) ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEType(), informationSystemService.getStandardClass());
			}
			if (informationSystemService.getStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate))
				basePart.setStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), informationSystemService.getStandardCreationDate()));
			
			if (informationSystemService.getLastStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate))
				basePart.setLastStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), informationSystemService.getLastStandardCreationDate()));
			
			if (informationSystemService.getNextStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate))
				basePart.setNextStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), informationSystemService.getNextStandardCreationDate()));
			
			if (informationSystemService.getRetireDate() != null && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate))
				basePart.setRetireDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), informationSystemService.getRetireDate()));
			
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors)) {
				isProvidedToActorsSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_IsProvidedToActors());
				basePart.initIsProvidedToActors(isProvidedToActorsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions)) {
				providesGovernedInterfaceToAccessFunctionsSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_ProvidesGovernedInterfaceToAccessFunctions());
				basePart.initProvidesGovernedInterfaceToAccessFunctions(providesGovernedInterfaceToAccessFunctionsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities)) {
				providesEntitiesSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_ProvidesEntities());
				basePart.initProvidesEntities(providesEntitiesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities)) {
				consumesEntitiesSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_ConsumesEntities());
				basePart.initConsumesEntities(consumesEntitiesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts)) {
				isGovernedAndMeasuredByContractsSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_IsGovernedAndMeasuredByContracts());
				basePart.initIsGovernedAndMeasuredByContracts(isGovernedAndMeasuredByContractsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents)) {
				resolvesEventsSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_ResolvesEvents());
				basePart.initResolvesEvents(resolvesEventsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents)) {
				isImplementedOnLogicalTechnologyComponentsSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_IsImplementedOnLogicalTechnologyComponents());
				basePart.initIsImplementedOnLogicalTechnologyComponents(isImplementedOnLogicalTechnologyComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent)) {
				isRealizedThroughLogicalApplicationComponentSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_IsRealizedThroughLogicalApplicationComponent());
				basePart.initIsRealizedThroughLogicalApplicationComponent(isRealizedThroughLogicalApplicationComponentSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits)) {
				isOwnedAndGovernedByOrganizationUnitsSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_IsOwnedAndGovernedByOrganizationUnits());
				basePart.initIsOwnedAndGovernedByOrganizationUnits(isOwnedAndGovernedByOrganizationUnitsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures)) {
				isTrackedAgainstMeasuresSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_IsTrackedAgainstMeasures());
				basePart.initIsTrackedAgainstMeasures(isTrackedAgainstMeasuresSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses)) {
				supportsProcessesSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_SupportsProcesses());
				basePart.initSupportsProcesses(supportsProcessesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses)) {
				isRealizedByProcessesSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_IsRealizedByProcesses());
				basePart.initIsRealizedByProcesses(isRealizedByProcessesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities)) {
				meetsQualitiesSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_MeetsQualities());
				basePart.initMeetsQualities(meetsQualitiesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices)) {
				consumesServicesSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_ConsumesServices());
				basePart.initConsumesServices(consumesServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices)) {
				decomposesServicesSettings = new ReferencesTableSettings(informationSystemService, ContentfwkPackage.eINSTANCE.getService_DecomposesServices());
				basePart.initDecomposesServices(decomposesServicesSettings);
			}
			// init filters
			
			
			
			
			
			
			basePart.addFilterToIsProvidedToActors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsProvidedToActorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsProvidedToActors(new EObjectFilter(ContentfwkPackage.eINSTANCE.getActor()));
			// Start of user code for additional businessfilters for isProvidedToActors
			
			// End of user code
			
			basePart.addFilterToProvidesGovernedInterfaceToAccessFunctions(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInProvidesGovernedInterfaceToAccessFunctionsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToProvidesGovernedInterfaceToAccessFunctions(new EObjectFilter(ContentfwkPackage.eINSTANCE.getFunction()));
			// Start of user code for additional businessfilters for providesGovernedInterfaceToAccessFunctions
			
			// End of user code
			
			basePart.addFilterToProvidesEntities(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInProvidesEntitiesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToProvidesEntities(new EObjectFilter(ContentfwkPackage.eINSTANCE.getDataEntity()));
			// Start of user code for additional businessfilters for providesEntities
			
			// End of user code
			
			basePart.addFilterToConsumesEntities(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInConsumesEntitiesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToConsumesEntities(new EObjectFilter(ContentfwkPackage.eINSTANCE.getDataEntity()));
			// Start of user code for additional businessfilters for consumesEntities
			
			// End of user code
			
			basePart.addFilterToIsGovernedAndMeasuredByContracts(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsGovernedAndMeasuredByContractsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsGovernedAndMeasuredByContracts(new EObjectFilter(ContentfwkPackage.eINSTANCE.getContract()));
			// Start of user code for additional businessfilters for isGovernedAndMeasuredByContracts
			
			// End of user code
			
			basePart.addFilterToResolvesEvents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInResolvesEventsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToResolvesEvents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getEvent()));
			// Start of user code for additional businessfilters for resolvesEvents
			
			// End of user code
			
			basePart.addFilterToIsImplementedOnLogicalTechnologyComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsImplementedOnLogicalTechnologyComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsImplementedOnLogicalTechnologyComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent()));
			// Start of user code for additional businessfilters for isImplementedOnLogicalTechnologyComponents
			
			// End of user code
			
			basePart.addFilterToIsRealizedThroughLogicalApplicationComponent(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsRealizedThroughLogicalApplicationComponentTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsRealizedThroughLogicalApplicationComponent(new EObjectFilter(ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent()));
			// Start of user code for additional businessfilters for isRealizedThroughLogicalApplicationComponent
			
			// End of user code
			
			basePart.addFilterToIsOwnedAndGovernedByOrganizationUnits(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsOwnedAndGovernedByOrganizationUnitsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsOwnedAndGovernedByOrganizationUnits(new EObjectFilter(ContentfwkPackage.eINSTANCE.getOrganizationUnit()));
			// Start of user code for additional businessfilters for isOwnedAndGovernedByOrganizationUnits
			
			// End of user code
			
			basePart.addFilterToIsTrackedAgainstMeasures(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsTrackedAgainstMeasuresTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsTrackedAgainstMeasures(new EObjectFilter(ContentfwkPackage.eINSTANCE.getMeasure()));
			// Start of user code for additional businessfilters for isTrackedAgainstMeasures
			
			// End of user code
			
			basePart.addFilterToSupportsProcesses(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSupportsProcessesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSupportsProcesses(new EObjectFilter(ContentfwkPackage.eINSTANCE.getProcess()));
			// Start of user code for additional businessfilters for supportsProcesses
			
			// End of user code
			
			basePart.addFilterToIsRealizedByProcesses(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsRealizedByProcessesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsRealizedByProcesses(new EObjectFilter(ContentfwkPackage.eINSTANCE.getProcess()));
			// Start of user code for additional businessfilters for isRealizedByProcesses
			
			// End of user code
			
			basePart.addFilterToMeetsQualities(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInMeetsQualitiesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToMeetsQualities(new EObjectFilter(ContentfwkPackage.eINSTANCE.getServiceQuality()));
			// Start of user code for additional businessfilters for meetsQualities
			
			// End of user code
			
			basePart.addFilterToConsumesServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInConsumesServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToConsumesServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getService()));
			// Start of user code for additional businessfilters for consumesServices
			
			// End of user code
			
			basePart.addFilterToDecomposesServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInDecomposesServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToDecomposesServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getService()));
			// Start of user code for additional businessfilters for decomposesServices
			
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
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardClass();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_RetireDate();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors) {
			return ContentfwkPackage.eINSTANCE.getService_IsProvidedToActors();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions) {
			return ContentfwkPackage.eINSTANCE.getService_ProvidesGovernedInterfaceToAccessFunctions();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities) {
			return ContentfwkPackage.eINSTANCE.getService_ProvidesEntities();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities) {
			return ContentfwkPackage.eINSTANCE.getService_ConsumesEntities();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts) {
			return ContentfwkPackage.eINSTANCE.getService_IsGovernedAndMeasuredByContracts();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents) {
			return ContentfwkPackage.eINSTANCE.getService_ResolvesEvents();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents) {
			return ContentfwkPackage.eINSTANCE.getService_IsImplementedOnLogicalTechnologyComponents();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent) {
			return ContentfwkPackage.eINSTANCE.getService_IsRealizedThroughLogicalApplicationComponent();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits) {
			return ContentfwkPackage.eINSTANCE.getService_IsOwnedAndGovernedByOrganizationUnits();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures) {
			return ContentfwkPackage.eINSTANCE.getService_IsTrackedAgainstMeasures();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses) {
			return ContentfwkPackage.eINSTANCE.getService_SupportsProcesses();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses) {
			return ContentfwkPackage.eINSTANCE.getService_IsRealizedByProcesses();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities) {
			return ContentfwkPackage.eINSTANCE.getService_MeetsQualities();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices) {
			return ContentfwkPackage.eINSTANCE.getService_ConsumesServices();
		}
		if (editorKey == ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices) {
			return ContentfwkPackage.eINSTANCE.getService_DecomposesServices();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		InformationSystemService informationSystemService = (InformationSystemService)semanticObject;
		if (ContentfwkViewsRepository.InformationSystemService.Attributes.name == event.getAffectedEditor()) {
			informationSystemService.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass == event.getAffectedEditor()) {
			informationSystemService.setStandardClass((StandardsClass)event.getNewValue());
		}
		if (ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate == event.getAffectedEditor()) {
			informationSystemService.setStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
			informationSystemService.setLastStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
			informationSystemService.setNextStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate == event.getAffectedEditor()) {
			informationSystemService.setRetireDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Actor) {
					isProvidedToActorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isProvidedToActorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isProvidedToActorsSettings.move(event.getNewIndex(), (Actor) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Function) {
					providesGovernedInterfaceToAccessFunctionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				providesGovernedInterfaceToAccessFunctionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				providesGovernedInterfaceToAccessFunctionsSettings.move(event.getNewIndex(), (Function) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof DataEntity) {
					providesEntitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				providesEntitiesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				providesEntitiesSettings.move(event.getNewIndex(), (DataEntity) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof DataEntity) {
					consumesEntitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				consumesEntitiesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				consumesEntitiesSettings.move(event.getNewIndex(), (DataEntity) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Contract) {
					isGovernedAndMeasuredByContractsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isGovernedAndMeasuredByContractsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isGovernedAndMeasuredByContractsSettings.move(event.getNewIndex(), (Contract) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Event) {
					resolvesEventsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				resolvesEventsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resolvesEventsSettings.move(event.getNewIndex(), (Event) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof LogicalTechnologyComponent) {
					isImplementedOnLogicalTechnologyComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isImplementedOnLogicalTechnologyComponentsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isImplementedOnLogicalTechnologyComponentsSettings.move(event.getNewIndex(), (LogicalTechnologyComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof LogicalApplicationComponent) {
					isRealizedThroughLogicalApplicationComponentSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isRealizedThroughLogicalApplicationComponentSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isRealizedThroughLogicalApplicationComponentSettings.move(event.getNewIndex(), (LogicalApplicationComponent) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof OrganizationUnit) {
					isOwnedAndGovernedByOrganizationUnitsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isOwnedAndGovernedByOrganizationUnitsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isOwnedAndGovernedByOrganizationUnitsSettings.move(event.getNewIndex(), (OrganizationUnit) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Measure) {
					isTrackedAgainstMeasuresSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isTrackedAgainstMeasuresSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isTrackedAgainstMeasuresSettings.move(event.getNewIndex(), (Measure) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Process) {
					supportsProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				supportsProcessesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				supportsProcessesSettings.move(event.getNewIndex(), (Process) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Process) {
					isRealizedByProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isRealizedByProcessesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isRealizedByProcessesSettings.move(event.getNewIndex(), (Process) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ServiceQuality) {
					meetsQualitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				meetsQualitiesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				meetsQualitiesSettings.move(event.getNewIndex(), (ServiceQuality) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Service) {
					consumesServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				consumesServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				consumesServicesSettings.move(event.getNewIndex(), (Service) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Service) {
					decomposesServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				decomposesServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				decomposesServicesSettings.move(event.getNewIndex(), (Service) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			InformationSystemServicePropertiesEditionPart basePart = (InformationSystemServicePropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardClass().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass))
				basePart.setStandardClass((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setLastStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setLastStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setNextStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setNextStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_RetireDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate)) {
				if (msg.getNewValue() != null) {
					basePart.setRetireDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setRetireDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getService_IsProvidedToActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors))
				basePart.updateIsProvidedToActors();
			if (ContentfwkPackage.eINSTANCE.getService_ProvidesGovernedInterfaceToAccessFunctions().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions))
				basePart.updateProvidesGovernedInterfaceToAccessFunctions();
			if (ContentfwkPackage.eINSTANCE.getService_ProvidesEntities().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities))
				basePart.updateProvidesEntities();
			if (ContentfwkPackage.eINSTANCE.getService_ConsumesEntities().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities))
				basePart.updateConsumesEntities();
			if (ContentfwkPackage.eINSTANCE.getService_IsGovernedAndMeasuredByContracts().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts))
				basePart.updateIsGovernedAndMeasuredByContracts();
			if (ContentfwkPackage.eINSTANCE.getService_ResolvesEvents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents))
				basePart.updateResolvesEvents();
			if (ContentfwkPackage.eINSTANCE.getService_IsImplementedOnLogicalTechnologyComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents))
				basePart.updateIsImplementedOnLogicalTechnologyComponents();
			if (ContentfwkPackage.eINSTANCE.getService_IsRealizedThroughLogicalApplicationComponent().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent))
				basePart.updateIsRealizedThroughLogicalApplicationComponent();
			if (ContentfwkPackage.eINSTANCE.getService_IsOwnedAndGovernedByOrganizationUnits().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits))
				basePart.updateIsOwnedAndGovernedByOrganizationUnits();
			if (ContentfwkPackage.eINSTANCE.getService_IsTrackedAgainstMeasures().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures))
				basePart.updateIsTrackedAgainstMeasures();
			if (ContentfwkPackage.eINSTANCE.getService_SupportsProcesses().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses))
				basePart.updateSupportsProcesses();
			if (ContentfwkPackage.eINSTANCE.getService_IsRealizedByProcesses().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses))
				basePart.updateIsRealizedByProcesses();
			if (ContentfwkPackage.eINSTANCE.getService_MeetsQualities().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities))
				basePart.updateMeetsQualities();
			if (ContentfwkPackage.eINSTANCE.getService_ConsumesServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices))
				basePart.updateConsumesServices();
			if (ContentfwkPackage.eINSTANCE.getService_DecomposesServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices))
				basePart.updateDecomposesServices();
			
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
				if (ContentfwkViewsRepository.InformationSystemService.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate == event.getAffectedEditor()) {
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
