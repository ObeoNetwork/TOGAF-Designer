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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class PlatformServicePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for isSuppliedByLogicalTechnologyComponents ReferencesTable
	 */
	private	ReferencesTableSettings isSuppliedByLogicalTechnologyComponentsSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public PlatformServicePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject platformService, String editing_mode) {
		super(editingContext, platformService, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.PlatformService.class;
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
			final PlatformService platformService = (PlatformService)elt;
			final PlatformServicePropertiesEditionPart basePart = (PlatformServicePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (platformService.getName() != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), platformService.getName()));
			
			if (platformService.getDescription() != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), platformService.getDescription()));
			
			if (platformService.getCategory() != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), platformService.getCategory()));
			
			if (platformService.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), platformService.getSourceDescr()));
			
			if (platformService.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), platformService.getOwnerDescr()));
			
			if (platformService.getID() != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), platformService.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.standardClass)) {
				basePart.initStandardClass((EEnum) ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEType(), platformService.getStandardClass());
			}
			if (platformService.getStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate))
				basePart.setStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), platformService.getStandardCreationDate()));
			
			if (platformService.getLastStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate))
				basePart.setLastStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), platformService.getLastStandardCreationDate()));
			
			if (platformService.getNextStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate))
				basePart.setNextStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), platformService.getNextStandardCreationDate()));
			
			if (platformService.getRetireDate() != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.retireDate))
				basePart.setRetireDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), platformService.getRetireDate()));
			
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors)) {
				isProvidedToActorsSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_IsProvidedToActors());
				basePart.initIsProvidedToActors(isProvidedToActorsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions)) {
				providesGovernedInterfaceToAccessFunctionsSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_ProvidesGovernedInterfaceToAccessFunctions());
				basePart.initProvidesGovernedInterfaceToAccessFunctions(providesGovernedInterfaceToAccessFunctionsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities)) {
				providesEntitiesSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_ProvidesEntities());
				basePart.initProvidesEntities(providesEntitiesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities)) {
				consumesEntitiesSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_ConsumesEntities());
				basePart.initConsumesEntities(consumesEntitiesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts)) {
				isGovernedAndMeasuredByContractsSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_IsGovernedAndMeasuredByContracts());
				basePart.initIsGovernedAndMeasuredByContracts(isGovernedAndMeasuredByContractsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents)) {
				resolvesEventsSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_ResolvesEvents());
				basePart.initResolvesEvents(resolvesEventsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents)) {
				isImplementedOnLogicalTechnologyComponentsSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_IsImplementedOnLogicalTechnologyComponents());
				basePart.initIsImplementedOnLogicalTechnologyComponents(isImplementedOnLogicalTechnologyComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent)) {
				isRealizedThroughLogicalApplicationComponentSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_IsRealizedThroughLogicalApplicationComponent());
				basePart.initIsRealizedThroughLogicalApplicationComponent(isRealizedThroughLogicalApplicationComponentSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits)) {
				isOwnedAndGovernedByOrganizationUnitsSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_IsOwnedAndGovernedByOrganizationUnits());
				basePart.initIsOwnedAndGovernedByOrganizationUnits(isOwnedAndGovernedByOrganizationUnitsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures)) {
				isTrackedAgainstMeasuresSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_IsTrackedAgainstMeasures());
				basePart.initIsTrackedAgainstMeasures(isTrackedAgainstMeasuresSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses)) {
				supportsProcessesSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_SupportsProcesses());
				basePart.initSupportsProcesses(supportsProcessesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses)) {
				isRealizedByProcessesSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_IsRealizedByProcesses());
				basePart.initIsRealizedByProcesses(isRealizedByProcessesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities)) {
				meetsQualitiesSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_MeetsQualities());
				basePart.initMeetsQualities(meetsQualitiesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices)) {
				consumesServicesSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_ConsumesServices());
				basePart.initConsumesServices(consumesServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices)) {
				decomposesServicesSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getService_DecomposesServices());
				basePart.initDecomposesServices(decomposesServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents)) {
				isSuppliedByLogicalTechnologyComponentsSettings = new ReferencesTableSettings(platformService, ContentfwkPackage.eINSTANCE.getPlatformService_IsSuppliedByLogicalTechnologyComponents());
				basePart.initIsSuppliedByLogicalTechnologyComponents(isSuppliedByLogicalTechnologyComponentsSettings);
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
			
			basePart.addFilterToIsSuppliedByLogicalTechnologyComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsSuppliedByLogicalTechnologyComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsSuppliedByLogicalTechnologyComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getLogicalTechnologyComponent()));
			// Start of user code for additional businessfilters for isSuppliedByLogicalTechnologyComponents
			
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
		PlatformService platformService = (PlatformService)semanticObject;
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.delegates == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					delegatesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					delegatesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					isDelegatedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isDelegatedBySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.name == event.getAffectedEditor()) {
			platformService.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.description == event.getAffectedEditor()) {
			platformService.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.category == event.getAffectedEditor()) {
			platformService.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.source == event.getAffectedEditor()) {
			platformService.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.owner == event.getAffectedEditor()) {
			platformService.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.iD == event.getAffectedEditor()) {
			platformService.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.standardClass == event.getAffectedEditor()) {
			platformService.setStandardClass((StandardsClass)event.getNewValue());
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate == event.getAffectedEditor()) {
			platformService.setStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
			platformService.setLastStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
			platformService.setNextStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PlatformService.Attributes.retireDate == event.getAffectedEditor()) {
			platformService.setRetireDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Actor) {
					isProvidedToActorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isProvidedToActorsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Function) {
					providesGovernedInterfaceToAccessFunctionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					providesGovernedInterfaceToAccessFunctionsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof DataEntity) {
					providesEntitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					providesEntitiesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof DataEntity) {
					consumesEntitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					consumesEntitiesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Contract) {
					isGovernedAndMeasuredByContractsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isGovernedAndMeasuredByContractsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Event) {
					resolvesEventsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					resolvesEventsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof LogicalTechnologyComponent) {
					isImplementedOnLogicalTechnologyComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isImplementedOnLogicalTechnologyComponentsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof LogicalApplicationComponent) {
					isRealizedThroughLogicalApplicationComponentSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isRealizedThroughLogicalApplicationComponentSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof OrganizationUnit) {
					isOwnedAndGovernedByOrganizationUnitsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isOwnedAndGovernedByOrganizationUnitsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Measure) {
					isTrackedAgainstMeasuresSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isTrackedAgainstMeasuresSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Process) {
					supportsProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					supportsProcessesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Process) {
					isRealizedByProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isRealizedByProcessesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof ServiceQuality) {
					meetsQualitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					meetsQualitiesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Service) {
					consumesServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					consumesServicesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Service) {
					decomposesServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					decomposesServicesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof LogicalTechnologyComponent) {
					isSuppliedByLogicalTechnologyComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isSuppliedByLogicalTechnologyComponentsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			PlatformServicePropertiesEditionPart basePart = (PlatformServicePropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardClass().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.standardClass))
				basePart.setStandardClass((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setLastStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setLastStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setNextStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setNextStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_RetireDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PlatformService.Attributes.retireDate)) {
				if (msg.getNewValue() != null) {
					basePart.setRetireDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setRetireDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getService_IsProvidedToActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors))
				basePart.updateIsProvidedToActors();
			if (ContentfwkPackage.eINSTANCE.getService_ProvidesGovernedInterfaceToAccessFunctions().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions))
				basePart.updateProvidesGovernedInterfaceToAccessFunctions();
			if (ContentfwkPackage.eINSTANCE.getService_ProvidesEntities().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities))
				basePart.updateProvidesEntities();
			if (ContentfwkPackage.eINSTANCE.getService_ConsumesEntities().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities))
				basePart.updateConsumesEntities();
			if (ContentfwkPackage.eINSTANCE.getService_IsGovernedAndMeasuredByContracts().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts))
				basePart.updateIsGovernedAndMeasuredByContracts();
			if (ContentfwkPackage.eINSTANCE.getService_ResolvesEvents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents))
				basePart.updateResolvesEvents();
			if (ContentfwkPackage.eINSTANCE.getService_IsImplementedOnLogicalTechnologyComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents))
				basePart.updateIsImplementedOnLogicalTechnologyComponents();
			if (ContentfwkPackage.eINSTANCE.getService_IsRealizedThroughLogicalApplicationComponent().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent))
				basePart.updateIsRealizedThroughLogicalApplicationComponent();
			if (ContentfwkPackage.eINSTANCE.getService_IsOwnedAndGovernedByOrganizationUnits().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits))
				basePart.updateIsOwnedAndGovernedByOrganizationUnits();
			if (ContentfwkPackage.eINSTANCE.getService_IsTrackedAgainstMeasures().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures))
				basePart.updateIsTrackedAgainstMeasures();
			if (ContentfwkPackage.eINSTANCE.getService_SupportsProcesses().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses))
				basePart.updateSupportsProcesses();
			if (ContentfwkPackage.eINSTANCE.getService_IsRealizedByProcesses().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses))
				basePart.updateIsRealizedByProcesses();
			if (ContentfwkPackage.eINSTANCE.getService_MeetsQualities().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities))
				basePart.updateMeetsQualities();
			if (ContentfwkPackage.eINSTANCE.getService_ConsumesServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices))
				basePart.updateConsumesServices();
			if (ContentfwkPackage.eINSTANCE.getService_DecomposesServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices))
				basePart.updateDecomposesServices();
			if (ContentfwkPackage.eINSTANCE.getPlatformService_IsSuppliedByLogicalTechnologyComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents))
				basePart.updateIsSuppliedByLogicalTechnologyComponents();
			
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
				if (ContentfwkViewsRepository.PlatformService.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PlatformService.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PlatformService.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PlatformService.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PlatformService.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PlatformService.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PlatformService.Attributes.standardClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PlatformService.Attributes.retireDate == event.getAffectedEditor()) {
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
