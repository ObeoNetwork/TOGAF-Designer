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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LifeCycleStatus;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class PhysicalApplicationComponentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for extendsLogicalApplicationComponents ReferencesTable
	 */
	private	ReferencesTableSettings extendsLogicalApplicationComponentsSettings;
	
	/**
	 * Settings for isHostedInLocation ReferencesTable
	 */
	private	ReferencesTableSettings isHostedInLocationSettings;
	
	/**
	 * Settings for communicatesWith ReferencesTable
	 */
	private	ReferencesTableSettings communicatesWithSettings;
	
	/**
	 * Settings for encapsulatesPhysicalDataComponents ReferencesTable
	 */
	private	ReferencesTableSettings encapsulatesPhysicalDataComponentsSettings;
	
	/**
	 * Settings for isRealizedByPhysicalTechnologyComponents ReferencesTable
	 */
	private	ReferencesTableSettings isRealizedByPhysicalTechnologyComponentsSettings;
	
	/**
	 * Settings for decomposesPhysicalApplicationComponent EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposesPhysicalApplicationComponentSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public PhysicalApplicationComponentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject physicalApplicationComponent, String editing_mode) {
		super(editingContext, physicalApplicationComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.PhysicalApplicationComponent.class;
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
			final PhysicalApplicationComponent physicalApplicationComponent = (PhysicalApplicationComponent)elt;
			final PhysicalApplicationComponentPropertiesEditionPart basePart = (PhysicalApplicationComponentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(physicalApplicationComponent, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(physicalApplicationComponent, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (physicalApplicationComponent.getName() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getName()));
			
			if (physicalApplicationComponent.getDescription() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getDescription()));
			
			if (physicalApplicationComponent.getCategory() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getCategory()));
			
			if (physicalApplicationComponent.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getSourceDescr()));
			
			if (physicalApplicationComponent.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getOwnerDescr()));
			
			if (physicalApplicationComponent.getID() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardClass)) {
				basePart.initStandardClass((EEnum) ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEType(), physicalApplicationComponent.getStandardClass());
			}
			if (physicalApplicationComponent.getStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate))
				basePart.setStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalApplicationComponent.getStandardCreationDate()));
			
			if (physicalApplicationComponent.getLastStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate))
				basePart.setLastStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalApplicationComponent.getLastStandardCreationDate()));
			
			if (physicalApplicationComponent.getNextStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate))
				basePart.setNextStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalApplicationComponent.getNextStandardCreationDate()));
			
			if (physicalApplicationComponent.getRetireDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate))
				basePart.setRetireDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalApplicationComponent.getRetireDate()));
			
			if (isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents)) {
				extendsLogicalApplicationComponentsSettings = new ReferencesTableSettings(physicalApplicationComponent, ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ExtendsLogicalApplicationComponents());
				basePart.initExtendsLogicalApplicationComponents(extendsLogicalApplicationComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation)) {
				isHostedInLocationSettings = new ReferencesTableSettings(physicalApplicationComponent, ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_IsHostedInLocation());
				basePart.initIsHostedInLocation(isHostedInLocationSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith)) {
				communicatesWithSettings = new ReferencesTableSettings(physicalApplicationComponent, ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_CommunicatesWith());
				basePart.initCommunicatesWith(communicatesWithSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus)) {
				basePart.initLifeCycleStatus((EEnum) ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_LifeCycleStatus().getEType(), physicalApplicationComponent.getLifeCycleStatus());
			}
			if (physicalApplicationComponent.getInitialLiveDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate))
				basePart.setInitialLiveDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalApplicationComponent.getInitialLiveDate()));
			
			if (physicalApplicationComponent.getDateOfLastRelease() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease))
				basePart.setDateOfLastRelease(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalApplicationComponent.getDateOfLastRelease()));
			
			if (physicalApplicationComponent.getDateOfNextRelease() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease))
				basePart.setDateOfNextRelease(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalApplicationComponent.getDateOfNextRelease()));
			
			if (physicalApplicationComponent.getRetirementDate() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate))
				basePart.setRetirementDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), physicalApplicationComponent.getRetirementDate()));
			
			if (physicalApplicationComponent.getAvailabilityQualityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics))
				basePart.setAvailabilityQualityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getAvailabilityQualityCharacteristics()));
			
			if (physicalApplicationComponent.getServicesTimes() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes))
				basePart.setServicesTimes(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getServicesTimes()));
			
			if (physicalApplicationComponent.getManageabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics))
				basePart.setManageabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getManageabilityCharacteristics()));
			
			if (physicalApplicationComponent.getServiceabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics))
				basePart.setServiceabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getServiceabilityCharacteristics()));
			
			if (physicalApplicationComponent.getPerformanceCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics))
				basePart.setPerformanceCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getPerformanceCharacteristics()));
			
			if (physicalApplicationComponent.getReliabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics))
				basePart.setReliabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getReliabilityCharacteristics()));
			
			if (physicalApplicationComponent.getRecoverabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics))
				basePart.setRecoverabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getRecoverabilityCharacteristics()));
			
			if (physicalApplicationComponent.getLocatabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics))
				basePart.setLocatabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getLocatabilityCharacteristics()));
			
			if (physicalApplicationComponent.getSecurityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics))
				basePart.setSecurityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getSecurityCharacteristics()));
			
			if (physicalApplicationComponent.getPrivacyCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics))
				basePart.setPrivacyCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getPrivacyCharacteristics()));
			
			if (physicalApplicationComponent.getIntegrityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics))
				basePart.setIntegrityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getIntegrityCharacteristics()));
			
			if (physicalApplicationComponent.getCredibilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics))
				basePart.setCredibilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getCredibilityCharacteristics()));
			
			if (physicalApplicationComponent.getLocalizationCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics))
				basePart.setLocalizationCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getLocalizationCharacteristics()));
			
			if (physicalApplicationComponent.getInternationalizationCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics))
				basePart.setInternationalizationCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getInternationalizationCharacteristics()));
			
			if (physicalApplicationComponent.getInteroperabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics))
				basePart.setInteroperabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getInteroperabilityCharacteristics()));
			
			if (physicalApplicationComponent.getScalabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics))
				basePart.setScalabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getScalabilityCharacteristics()));
			
			if (physicalApplicationComponent.getPortabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics))
				basePart.setPortabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getPortabilityCharacteristics()));
			
			if (physicalApplicationComponent.getExtensibilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics))
				basePart.setExtensibilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getExtensibilityCharacteristics()));
			
			if (physicalApplicationComponent.getCapacityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics))
				basePart.setCapacityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getCapacityCharacteristics()));
			
			if (physicalApplicationComponent.getThroughput() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput))
				basePart.setThroughput(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getThroughput()));
			
			if (physicalApplicationComponent.getThroughputPeriod() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod))
				basePart.setThroughputPeriod(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getThroughputPeriod()));
			
			if (physicalApplicationComponent.getGrowth() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth))
				basePart.setGrowth(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getGrowth()));
			
			if (physicalApplicationComponent.getGrowthPeriod() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod))
				basePart.setGrowthPeriod(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getGrowthPeriod()));
			
			if (physicalApplicationComponent.getPeakProfileShortTerm() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm))
				basePart.setPeakProfileShortTerm(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getPeakProfileShortTerm()));
			
			if (physicalApplicationComponent.getPeakProfileLongTerm() != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm))
				basePart.setPeakProfileLongTerm(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), physicalApplicationComponent.getPeakProfileLongTerm()));
			
			if (isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents)) {
				encapsulatesPhysicalDataComponentsSettings = new ReferencesTableSettings(physicalApplicationComponent, ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_EncapsulatesPhysicalDataComponents());
				basePart.initEncapsulatesPhysicalDataComponents(encapsulatesPhysicalDataComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents)) {
				isRealizedByPhysicalTechnologyComponentsSettings = new ReferencesTableSettings(physicalApplicationComponent, ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_IsRealizedByPhysicalTechnologyComponents());
				basePart.initIsRealizedByPhysicalTechnologyComponents(isRealizedByPhysicalTechnologyComponentsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.decomposesPhysicalApplicationComponent)) {
				// init part
				decomposesPhysicalApplicationComponentSettings = new EObjectFlatComboSettings(physicalApplicationComponent, ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_DecomposesPhysicalApplicationComponent());
				basePart.initDecomposesPhysicalApplicationComponent(decomposesPhysicalApplicationComponentSettings);
				// set the button mode
				basePart.setDecomposesPhysicalApplicationComponentButtonMode(ButtonsModeEnum.BROWSE);
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
			
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToExtendsLogicalApplicationComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInExtendsLogicalApplicationComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToExtendsLogicalApplicationComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getLogicalApplicationComponent()));
			// Start of user code for additional businessfilters for extendsLogicalApplicationComponents
			
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
			basePart.addFilterToCommunicatesWith(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent()));
			// Start of user code for additional businessfilters for communicatesWith
			
			// End of user code
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToEncapsulatesPhysicalDataComponents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInEncapsulatesPhysicalDataComponentsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToEncapsulatesPhysicalDataComponents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getPhysicalDataComponent()));
			// Start of user code for additional businessfilters for encapsulatesPhysicalDataComponents
			
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
			
			basePart.addFilterToDecomposesPhysicalApplicationComponent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof PhysicalApplicationComponent); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposesPhysicalApplicationComponent
			
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
		PhysicalApplicationComponent physicalApplicationComponent = (PhysicalApplicationComponent)semanticObject;
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					delegatesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					delegatesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					isDelegatedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isDelegatedBySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name == event.getAffectedEditor()) {
			physicalApplicationComponent.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description == event.getAffectedEditor()) {
			physicalApplicationComponent.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category == event.getAffectedEditor()) {
			physicalApplicationComponent.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source == event.getAffectedEditor()) {
			physicalApplicationComponent.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner == event.getAffectedEditor()) {
			physicalApplicationComponent.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD == event.getAffectedEditor()) {
			physicalApplicationComponent.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardClass == event.getAffectedEditor()) {
			physicalApplicationComponent.setStandardClass((StandardsClass)event.getNewValue());
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate == event.getAffectedEditor()) {
			physicalApplicationComponent.setStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
			physicalApplicationComponent.setLastStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
			physicalApplicationComponent.setNextStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate == event.getAffectedEditor()) {
			physicalApplicationComponent.setRetireDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof LogicalApplicationComponent) {
					extendsLogicalApplicationComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					extendsLogicalApplicationComponentsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Location) {
					isHostedInLocationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isHostedInLocationSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof PhysicalApplicationComponent) {
					communicatesWithSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					communicatesWithSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus == event.getAffectedEditor()) {
			physicalApplicationComponent.setLifeCycleStatus((LifeCycleStatus)event.getNewValue());
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate == event.getAffectedEditor()) {
			physicalApplicationComponent.setInitialLiveDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease == event.getAffectedEditor()) {
			physicalApplicationComponent.setDateOfLastRelease((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease == event.getAffectedEditor()) {
			physicalApplicationComponent.setDateOfNextRelease((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate == event.getAffectedEditor()) {
			physicalApplicationComponent.setRetirementDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setAvailabilityQualityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes == event.getAffectedEditor()) {
			physicalApplicationComponent.setServicesTimes((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setManageabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setServiceabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setPerformanceCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setReliabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setRecoverabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setLocatabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setSecurityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setPrivacyCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setIntegrityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setCredibilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setLocalizationCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setInternationalizationCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setInteroperabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setScalabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setPortabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setExtensibilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics == event.getAffectedEditor()) {
			physicalApplicationComponent.setCapacityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput == event.getAffectedEditor()) {
			physicalApplicationComponent.setThroughput((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod == event.getAffectedEditor()) {
			physicalApplicationComponent.setThroughputPeriod((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth == event.getAffectedEditor()) {
			physicalApplicationComponent.setGrowth((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod == event.getAffectedEditor()) {
			physicalApplicationComponent.setGrowthPeriod((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm == event.getAffectedEditor()) {
			physicalApplicationComponent.setPeakProfileShortTerm((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm == event.getAffectedEditor()) {
			physicalApplicationComponent.setPeakProfileLongTerm((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof PhysicalDataComponent) {
					encapsulatesPhysicalDataComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					encapsulatesPhysicalDataComponentsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof PhysicalTechnologyComponent) {
					isRealizedByPhysicalTechnologyComponentsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isRealizedByPhysicalTechnologyComponentsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.decomposesPhysicalApplicationComponent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)  {
				decomposesPhysicalApplicationComponentSettings.setToReference((PhysicalApplicationComponent)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD)  {
				PhysicalApplicationComponent eObject = ContentfwkFactory.eINSTANCE.createPhysicalApplicationComponent();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposesPhysicalApplicationComponentSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			PhysicalApplicationComponentPropertiesEditionPart basePart = (PhysicalApplicationComponentPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardClass().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardClass))
				basePart.setStandardClass((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setLastStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setLastStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setNextStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setNextStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_RetireDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate)) {
				if (msg.getNewValue() != null) {
					basePart.setRetireDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setRetireDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ExtendsLogicalApplicationComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents))
				basePart.updateExtendsLogicalApplicationComponents();
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_IsHostedInLocation().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation))
				basePart.updateIsHostedInLocation();
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_CommunicatesWith().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith))
				basePart.updateCommunicatesWith();
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_LifeCycleStatus().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus))
				basePart.setLifeCycleStatus((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_InitialLiveDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate)) {
				if (msg.getNewValue() != null) {
					basePart.setInitialLiveDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setInitialLiveDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_DateOfLastRelease().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease)) {
				if (msg.getNewValue() != null) {
					basePart.setDateOfLastRelease(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setDateOfLastRelease("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_DateOfNextRelease().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease)) {
				if (msg.getNewValue() != null) {
					basePart.setDateOfNextRelease(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setDateOfNextRelease("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_RetirementDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate)) {
				if (msg.getNewValue() != null) {
					basePart.setRetirementDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setRetirementDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_AvailabilityQualityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setAvailabilityQualityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setAvailabilityQualityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ServicesTimes().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes)) {
				if (msg.getNewValue() != null) {
					basePart.setServicesTimes(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setServicesTimes("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ManageabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setManageabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setManageabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ServiceabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setServiceabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setServiceabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PerformanceCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setPerformanceCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPerformanceCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ReliabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setReliabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setReliabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_RecoverabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setRecoverabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setRecoverabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_LocatabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setLocatabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setLocatabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_SecurityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setSecurityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSecurityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PrivacyCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setPrivacyCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPrivacyCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_IntegrityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setIntegrityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setIntegrityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_CredibilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setCredibilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCredibilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_LocalizationCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setLocalizationCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setLocalizationCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_InternationalizationCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setInternationalizationCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setInternationalizationCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_InteroperabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setInteroperabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setInteroperabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ScalabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setScalabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setScalabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PortabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setPortabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPortabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ExtensibilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setExtensibilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setExtensibilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_CapacityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setCapacityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCapacityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_Throughput().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput)) {
				if (msg.getNewValue() != null) {
					basePart.setThroughput(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setThroughput("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ThroughputPeriod().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod)) {
				if (msg.getNewValue() != null) {
					basePart.setThroughputPeriod(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setThroughputPeriod("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_Growth().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth)) {
				if (msg.getNewValue() != null) {
					basePart.setGrowth(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setGrowth("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_GrowthPeriod().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod)) {
				if (msg.getNewValue() != null) {
					basePart.setGrowthPeriod(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setGrowthPeriod("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PeakProfileShortTerm().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm)) {
				if (msg.getNewValue() != null) {
					basePart.setPeakProfileShortTerm(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPeakProfileShortTerm("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PeakProfileLongTerm().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm)) {
				if (msg.getNewValue() != null) {
					basePart.setPeakProfileLongTerm(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPeakProfileLongTerm("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_EncapsulatesPhysicalDataComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents))
				basePart.updateEncapsulatesPhysicalDataComponents();
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_IsRealizedByPhysicalTechnologyComponents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents))
				basePart.updateIsRealizedByPhysicalTechnologyComponents();
			if (ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_DecomposesPhysicalApplicationComponent().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.decomposesPhysicalApplicationComponent))
				basePart.setDecomposesPhysicalApplicationComponent((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus;
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
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_RetireDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_RetireDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_LifeCycleStatus().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_LifeCycleStatus().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_InitialLiveDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_InitialLiveDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_DateOfLastRelease().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_DateOfLastRelease().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_DateOfNextRelease().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_DateOfNextRelease().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_RetirementDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_RetirementDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_AvailabilityQualityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_AvailabilityQualityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ServicesTimes().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ServicesTimes().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ManageabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ManageabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ServiceabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ServiceabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PerformanceCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PerformanceCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ReliabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ReliabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_RecoverabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_RecoverabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_LocatabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_LocatabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_SecurityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_SecurityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PrivacyCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PrivacyCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_IntegrityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_IntegrityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_CredibilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_CredibilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_LocalizationCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_LocalizationCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_InternationalizationCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_InternationalizationCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_InteroperabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_InteroperabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ScalabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ScalabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PortabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PortabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ExtensibilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ExtensibilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_CapacityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_CapacityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_Throughput().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_Throughput().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ThroughputPeriod().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_ThroughputPeriod().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_Growth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_Growth().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_GrowthPeriod().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_GrowthPeriod().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PeakProfileShortTerm().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PeakProfileShortTerm().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PeakProfileLongTerm().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getPhysicalApplicationComponent_PeakProfileLongTerm().getEAttributeType(), newValue);
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
