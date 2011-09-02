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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ContractPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for governsAndMeasuresBusinessServices ReferencesTable
	 */
	private	ReferencesTableSettings governsAndMeasuresBusinessServicesSettings;
	
	/**
	 * Settings for meetsServiceQuality ReferencesTable
	 */
	private	ReferencesTableSettings meetsServiceQualitySettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public ContractPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject contract, String editing_mode) {
		super(editingContext, contract, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.Contract.class;
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
			final Contract contract = (Contract)elt;
			final ContractPropertiesEditionPart basePart = (ContractPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.Contract.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(contract, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(contract, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (contract.getName() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getName()));
			
			if (contract.getDescription() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getDescription()));
			
			if (contract.getCategory() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getCategory()));
			
			if (contract.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getSourceDescr()));
			
			if (contract.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getOwnerDescr()));
			
			if (contract.getID() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices)) {
				governsAndMeasuresBusinessServicesSettings = new ReferencesTableSettings(contract, ContentfwkPackage.eINSTANCE.getContract_GovernsAndMeasuresBusinessServices());
				basePart.initGovernsAndMeasuresBusinessServices(governsAndMeasuresBusinessServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality)) {
				meetsServiceQualitySettings = new ReferencesTableSettings(contract, ContentfwkPackage.eINSTANCE.getContract_MeetsServiceQuality());
				basePart.initMeetsServiceQuality(meetsServiceQualitySettings);
			}
			if (contract.getBehaviorCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics))
				basePart.setBehaviorCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getBehaviorCharacteristics()));
			
			if (contract.getServiceNameCaller() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller))
				basePart.setServiceNameCaller(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getServiceNameCaller()));
			
			if (contract.getServiceNameCalled() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled))
				basePart.setServiceNameCalled(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getServiceNameCalled()));
			
			if (contract.getServiceQualityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics))
				basePart.setServiceQualityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getServiceQualityCharacteristics()));
			
			if (contract.getAvailabilityQualityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics))
				basePart.setAvailabilityQualityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getAvailabilityQualityCharacteristics()));
			
			if (contract.getServicesTimes() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.servicesTimes))
				basePart.setServicesTimes(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getServicesTimes()));
			
			if (contract.getManageabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics))
				basePart.setManageabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getManageabilityCharacteristics()));
			
			if (contract.getServiceabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics))
				basePart.setServiceabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getServiceabilityCharacteristics()));
			
			if (contract.getPerformanceCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics))
				basePart.setPerformanceCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getPerformanceCharacteristics()));
			
			if (contract.getResponseCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics))
				basePart.setResponseCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getResponseCharacteristics()));
			
			if (contract.getReliabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics))
				basePart.setReliabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getReliabilityCharacteristics()));
			
			if (contract.getQualityOfInformationRequired() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired))
				basePart.setQualityOfInformationRequired(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getQualityOfInformationRequired()));
			
			if (contract.getContractControlRequirements() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements))
				basePart.setContractControlRequirements(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getContractControlRequirements()));
			
			if (contract.getResultControlRequirements() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements))
				basePart.setResultControlRequirements(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getResultControlRequirements()));
			
			if (contract.getRecoverabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics))
				basePart.setRecoverabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getRecoverabilityCharacteristics()));
			
			if (contract.getLocatabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics))
				basePart.setLocatabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getLocatabilityCharacteristics()));
			
			if (contract.getSecurityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics))
				basePart.setSecurityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getSecurityCharacteristics()));
			
			if (contract.getPrivacyCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics))
				basePart.setPrivacyCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getPrivacyCharacteristics()));
			
			if (contract.getIntegrityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics))
				basePart.setIntegrityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getIntegrityCharacteristics()));
			
			if (contract.getCredibilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics))
				basePart.setCredibilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getCredibilityCharacteristics()));
			
			if (contract.getLocalizationCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics))
				basePart.setLocalizationCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getLocalizationCharacteristics()));
			
			if (contract.getInternationalizationCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics))
				basePart.setInternationalizationCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getInternationalizationCharacteristics()));
			
			if (contract.getInteroperabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics))
				basePart.setInteroperabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getInteroperabilityCharacteristics()));
			
			if (contract.getScalabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics))
				basePart.setScalabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getScalabilityCharacteristics()));
			
			if (contract.getPortabilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics))
				basePart.setPortabilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getPortabilityCharacteristics()));
			
			if (contract.getExtensibilityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics))
				basePart.setExtensibilityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getExtensibilityCharacteristics()));
			
			if (contract.getCapacityCharacteristics() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics))
				basePart.setCapacityCharacteristics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getCapacityCharacteristics()));
			
			if (contract.getThroughput() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.throughput))
				basePart.setThroughput(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getThroughput()));
			
			if (contract.getThroughputPeriod() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.throughputPeriod))
				basePart.setThroughputPeriod(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getThroughputPeriod()));
			
			if (contract.getGrowth() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.growth))
				basePart.setGrowth(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getGrowth()));
			
			if (contract.getGrowthPeriod() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.growthPeriod))
				basePart.setGrowthPeriod(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getGrowthPeriod()));
			
			if (contract.getPeakProfileShortTerm() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm))
				basePart.setPeakProfileShortTerm(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getPeakProfileShortTerm()));
			
			if (contract.getPeakProfileLongTerm() != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm))
				basePart.setPeakProfileLongTerm(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), contract.getPeakProfileLongTerm()));
			
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
			
			
			
			
			
			
			
			basePart.addFilterToGovernsAndMeasuresBusinessServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInGovernsAndMeasuresBusinessServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToGovernsAndMeasuresBusinessServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getService()));
			// Start of user code for additional businessfilters for governsAndMeasuresBusinessServices
			
			// End of user code
			
			basePart.addFilterToMeetsServiceQuality(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInMeetsServiceQualityTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToMeetsServiceQuality(new EObjectFilter(ContentfwkPackage.eINSTANCE.getServiceQuality()));
			// Start of user code for additional businessfilters for meetsServiceQuality
			
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
		Contract contract = (Contract)semanticObject;
		if (ContentfwkViewsRepository.Contract.RelatedElements.delegates == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					delegatesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					delegatesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					isDelegatedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isDelegatedBySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Contract.Attributes.name == event.getAffectedEditor()) {
			contract.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.description == event.getAffectedEditor()) {
			contract.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.category == event.getAffectedEditor()) {
			contract.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.source == event.getAffectedEditor()) {
			contract.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.owner == event.getAffectedEditor()) {
			contract.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.iD == event.getAffectedEditor()) {
			contract.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Service) {
					governsAndMeasuresBusinessServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					governsAndMeasuresBusinessServicesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof ServiceQuality) {
					meetsServiceQualitySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					meetsServiceQualitySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics == event.getAffectedEditor()) {
			contract.setBehaviorCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller == event.getAffectedEditor()) {
			contract.setServiceNameCaller((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled == event.getAffectedEditor()) {
			contract.setServiceNameCalled((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics == event.getAffectedEditor()) {
			contract.setServiceQualityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics == event.getAffectedEditor()) {
			contract.setAvailabilityQualityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.servicesTimes == event.getAffectedEditor()) {
			contract.setServicesTimes((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics == event.getAffectedEditor()) {
			contract.setManageabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics == event.getAffectedEditor()) {
			contract.setServiceabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics == event.getAffectedEditor()) {
			contract.setPerformanceCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics == event.getAffectedEditor()) {
			contract.setResponseCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics == event.getAffectedEditor()) {
			contract.setReliabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired == event.getAffectedEditor()) {
			contract.setQualityOfInformationRequired((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements == event.getAffectedEditor()) {
			contract.setContractControlRequirements((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements == event.getAffectedEditor()) {
			contract.setResultControlRequirements((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics == event.getAffectedEditor()) {
			contract.setRecoverabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics == event.getAffectedEditor()) {
			contract.setLocatabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics == event.getAffectedEditor()) {
			contract.setSecurityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics == event.getAffectedEditor()) {
			contract.setPrivacyCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics == event.getAffectedEditor()) {
			contract.setIntegrityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics == event.getAffectedEditor()) {
			contract.setCredibilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics == event.getAffectedEditor()) {
			contract.setLocalizationCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics == event.getAffectedEditor()) {
			contract.setInternationalizationCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics == event.getAffectedEditor()) {
			contract.setInteroperabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics == event.getAffectedEditor()) {
			contract.setScalabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics == event.getAffectedEditor()) {
			contract.setPortabilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics == event.getAffectedEditor()) {
			contract.setExtensibilityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics == event.getAffectedEditor()) {
			contract.setCapacityCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.throughput == event.getAffectedEditor()) {
			contract.setThroughput((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.throughputPeriod == event.getAffectedEditor()) {
			contract.setThroughputPeriod((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.growth == event.getAffectedEditor()) {
			contract.setGrowth((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.growthPeriod == event.getAffectedEditor()) {
			contract.setGrowthPeriod((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm == event.getAffectedEditor()) {
			contract.setPeakProfileShortTerm((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm == event.getAffectedEditor()) {
			contract.setPeakProfileLongTerm((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ContractPropertiesEditionPart basePart = (ContractPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Contract.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_GovernsAndMeasuresBusinessServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices))
				basePart.updateGovernsAndMeasuresBusinessServices();
			if (ContentfwkPackage.eINSTANCE.getContract_MeetsServiceQuality().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality))
				basePart.updateMeetsServiceQuality();
			if (ContentfwkPackage.eINSTANCE.getContract_BehaviorCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setBehaviorCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setBehaviorCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ServiceNameCaller().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller)) {
				if (msg.getNewValue() != null) {
					basePart.setServiceNameCaller(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setServiceNameCaller("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ServiceNameCalled().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled)) {
				if (msg.getNewValue() != null) {
					basePart.setServiceNameCalled(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setServiceNameCalled("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ServiceQualityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setServiceQualityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setServiceQualityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_AvailabilityQualityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setAvailabilityQualityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setAvailabilityQualityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ServicesTimes().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.servicesTimes)) {
				if (msg.getNewValue() != null) {
					basePart.setServicesTimes(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setServicesTimes("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ManageabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setManageabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setManageabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ServiceabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setServiceabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setServiceabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_PerformanceCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setPerformanceCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPerformanceCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ResponseCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setResponseCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setResponseCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ReliabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setReliabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setReliabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_QualityOfInformationRequired().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired)) {
				if (msg.getNewValue() != null) {
					basePart.setQualityOfInformationRequired(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setQualityOfInformationRequired("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ContractControlRequirements().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements)) {
				if (msg.getNewValue() != null) {
					basePart.setContractControlRequirements(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setContractControlRequirements("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ResultControlRequirements().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements)) {
				if (msg.getNewValue() != null) {
					basePart.setResultControlRequirements(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setResultControlRequirements("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_RecoverabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setRecoverabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setRecoverabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_LocatabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setLocatabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setLocatabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_SecurityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setSecurityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSecurityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_PrivacyCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setPrivacyCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPrivacyCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_IntegrityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setIntegrityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setIntegrityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_CredibilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setCredibilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCredibilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_LocalizationCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setLocalizationCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setLocalizationCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_InternationalizationCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setInternationalizationCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setInternationalizationCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_InteroperabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setInteroperabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setInteroperabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ScalabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setScalabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setScalabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_PortabilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setPortabilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPortabilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ExtensibilityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setExtensibilityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setExtensibilityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_CapacityCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setCapacityCharacteristics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCapacityCharacteristics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_Throughput().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.throughput)) {
				if (msg.getNewValue() != null) {
					basePart.setThroughput(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setThroughput("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_ThroughputPeriod().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.throughputPeriod)) {
				if (msg.getNewValue() != null) {
					basePart.setThroughputPeriod(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setThroughputPeriod("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_Growth().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.growth)) {
				if (msg.getNewValue() != null) {
					basePart.setGrowth(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setGrowth("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_GrowthPeriod().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.growthPeriod)) {
				if (msg.getNewValue() != null) {
					basePart.setGrowthPeriod(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setGrowthPeriod("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_PeakProfileShortTerm().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm)) {
				if (msg.getNewValue() != null) {
					basePart.setPeakProfileShortTerm(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPeakProfileShortTerm("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getContract_PeakProfileLongTerm().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm)) {
				if (msg.getNewValue() != null) {
					basePart.setPeakProfileLongTerm(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPeakProfileLongTerm("");
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
				if (ContentfwkViewsRepository.Contract.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_BehaviorCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_BehaviorCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ServiceNameCaller().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ServiceNameCaller().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ServiceNameCalled().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ServiceNameCalled().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ServiceQualityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ServiceQualityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_AvailabilityQualityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_AvailabilityQualityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.servicesTimes == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ServicesTimes().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ServicesTimes().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ManageabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ManageabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ServiceabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ServiceabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_PerformanceCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_PerformanceCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ResponseCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ResponseCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ReliabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ReliabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_QualityOfInformationRequired().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_QualityOfInformationRequired().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ContractControlRequirements().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ContractControlRequirements().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ResultControlRequirements().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ResultControlRequirements().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_RecoverabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_RecoverabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_LocatabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_LocatabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_SecurityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_SecurityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_PrivacyCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_PrivacyCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_IntegrityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_IntegrityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_CredibilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_CredibilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_LocalizationCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_LocalizationCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_InternationalizationCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_InternationalizationCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_InteroperabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_InteroperabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ScalabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ScalabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_PortabilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_PortabilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ExtensibilityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ExtensibilityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_CapacityCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_CapacityCharacteristics().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.throughput == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_Throughput().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_Throughput().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.throughputPeriod == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_ThroughputPeriod().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_ThroughputPeriod().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.growth == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_Growth().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_Growth().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.growthPeriod == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_GrowthPeriod().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_GrowthPeriod().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_PeakProfileShortTerm().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_PeakProfileShortTerm().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getContract_PeakProfileLongTerm().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getContract_PeakProfileLongTerm().getEAttributeType(), newValue);
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
