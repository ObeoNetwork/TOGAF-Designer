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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ProcessPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for orchestratesFunctions ReferencesTable
	 */
	private	ReferencesTableSettings orchestratesFunctionsSettings;
	
	/**
	 * Settings for decomposesFunctions ReferencesTable
	 */
	private	ReferencesTableSettings decomposesFunctionsSettings;
	
	/**
	 * Settings for involvesOrganizationUnits ReferencesTable
	 */
	private	ReferencesTableSettings involvesOrganizationUnitsSettings;
	
	/**
	 * Settings for orchestratesServices ReferencesTable
	 */
	private	ReferencesTableSettings orchestratesServicesSettings;
	
	/**
	 * Settings for decomposesServices ReferencesTable
	 */
	private	ReferencesTableSettings decomposesServicesSettings;
	
	/**
	 * Settings for involvesActors ReferencesTable
	 */
	private	ReferencesTableSettings involvesActorsSettings;
	
	/**
	 * Settings for isGuidedByControls ReferencesTable
	 */
	private	ReferencesTableSettings isGuidedByControlsSettings;
	
	/**
	 * Settings for resolvesEvents ReferencesTable
	 */
	private	ReferencesTableSettings resolvesEventsSettings;
	
	/**
	 * Settings for generatesEvents ReferencesTable
	 */
	private	ReferencesTableSettings generatesEventsSettings;
	
	/**
	 * Settings for producesProducts ReferencesTable
	 */
	private	ReferencesTableSettings producesProductsSettings;
	
	/**
	 * Settings for decomposesProcess EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposesProcessSettings;
	
	/**
	 * Settings for precedesProcesses ReferencesTable
	 */
	private	ReferencesTableSettings precedesProcessesSettings;
	
	/**
	 * Settings for followsProcesses ReferencesTable
	 */
	private	ReferencesTableSettings followsProcessesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ProcessPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject process, String editing_mode) {
		super(editingContext, process, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.Process.class;
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
			final Process process = (Process)elt;
			final ProcessPropertiesEditionPart basePart = (ProcessPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (process.getName() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), process.getName()));
			
			if (process.getDescription() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), process.getDescription()));
			
			if (process.getCategory() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), process.getCategory()));
			
			if (process.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), process.getSourceDescr()));
			
			if (process.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), process.getOwnerDescr()));
			
			if (process.getID() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), process.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.Process.Attributes.standardClass)) {
				basePart.initStandardClass((EEnum) ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEType(), process.getStandardClass());
			}
			if (process.getStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.standardCreationDate))
				basePart.setStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), process.getStandardCreationDate()));
			
			if (process.getLastStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate))
				basePart.setLastStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), process.getLastStandardCreationDate()));
			
			if (process.getNextStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate))
				basePart.setNextStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), process.getNextStandardCreationDate()));
			
			if (process.getRetireDate() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.retireDate))
				basePart.setRetireDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), process.getRetireDate()));
			
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions)) {
				orchestratesFunctionsSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_OrchestratesFunctions());
				basePart.initOrchestratesFunctions(orchestratesFunctionsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions)) {
				decomposesFunctionsSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_DecomposesFunctions());
				basePart.initDecomposesFunctions(decomposesFunctionsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits)) {
				involvesOrganizationUnitsSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_InvolvesOrganizationUnits());
				basePart.initInvolvesOrganizationUnits(involvesOrganizationUnitsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices)) {
				orchestratesServicesSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_OrchestratesServices());
				basePart.initOrchestratesServices(orchestratesServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.decomposesServices)) {
				decomposesServicesSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_DecomposesServices());
				basePart.initDecomposesServices(decomposesServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.involvesActors)) {
				involvesActorsSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_InvolvesActors());
				basePart.initInvolvesActors(involvesActorsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls)) {
				isGuidedByControlsSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_IsGuidedByControls());
				basePart.initIsGuidedByControls(isGuidedByControlsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents)) {
				resolvesEventsSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_ResolvesEvents());
				basePart.initResolvesEvents(resolvesEventsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.generatesEvents)) {
				generatesEventsSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_GeneratesEvents());
				basePart.initGeneratesEvents(generatesEventsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.producesProducts)) {
				producesProductsSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_ProducesProducts());
				basePart.initProducesProducts(producesProductsSettings);
			}
			if (process.getProcessCritiality() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.processCritiality))
				basePart.setProcessCritiality(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), process.getProcessCritiality()));
			
			if (isAccessible(ContentfwkViewsRepository.Process.Attributes.isAutomated)) {
				basePart.setIsAutomated(process.isIsAutomated());
			}
			if (process.getProcessVolumetrics() != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.processVolumetrics))
				basePart.setProcessVolumetrics(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), process.getProcessVolumetrics()));
			
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess)) {
				// init part
				decomposesProcessSettings = new EObjectFlatComboSettings(process, ContentfwkPackage.eINSTANCE.getProcess_DecomposesProcess());
				basePart.initDecomposesProcess(decomposesProcessSettings);
				// set the button mode
				basePart.setDecomposesProcessButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses)) {
				precedesProcessesSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_PrecedesProcesses());
				basePart.initPrecedesProcesses(precedesProcessesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Process.RelatedElements.followsProcesses)) {
				followsProcessesSettings = new ReferencesTableSettings(process, ContentfwkPackage.eINSTANCE.getProcess_FollowsProcesses());
				basePart.initFollowsProcesses(followsProcessesSettings);
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
			
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToOrchestratesFunctions(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOrchestratesFunctionsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOrchestratesFunctions(new EObjectFilter(ContentfwkPackage.eINSTANCE.getFunction()));
			// Start of user code for additional businessfilters for orchestratesFunctions
			
			// End of user code
			
			basePart.addFilterToDecomposesFunctions(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInDecomposesFunctionsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToDecomposesFunctions(new EObjectFilter(ContentfwkPackage.eINSTANCE.getFunction()));
			// Start of user code for additional businessfilters for decomposesFunctions
			
			// End of user code
			
			basePart.addFilterToInvolvesOrganizationUnits(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInInvolvesOrganizationUnitsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToInvolvesOrganizationUnits(new EObjectFilter(ContentfwkPackage.eINSTANCE.getOrganizationUnit()));
			// Start of user code for additional businessfilters for involvesOrganizationUnits
			
			// End of user code
			
			basePart.addFilterToOrchestratesServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInOrchestratesServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToOrchestratesServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getService()));
			// Start of user code for additional businessfilters for orchestratesServices
			
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
			
			basePart.addFilterToInvolvesActors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInInvolvesActorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToInvolvesActors(new EObjectFilter(ContentfwkPackage.eINSTANCE.getActor()));
			// Start of user code for additional businessfilters for involvesActors
			
			// End of user code
			
			basePart.addFilterToIsGuidedByControls(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsGuidedByControlsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsGuidedByControls(new EObjectFilter(ContentfwkPackage.eINSTANCE.getControl()));
			// Start of user code for additional businessfilters for isGuidedByControls
			
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
			
			basePart.addFilterToGeneratesEvents(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInGeneratesEventsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToGeneratesEvents(new EObjectFilter(ContentfwkPackage.eINSTANCE.getEvent()));
			// Start of user code for additional businessfilters for generatesEvents
			
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
			
			
			
			
			basePart.addFilterToDecomposesProcess(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Process); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposesProcess
			
			// End of user code
			
			basePart.addFilterToPrecedesProcesses(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInPrecedesProcessesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToPrecedesProcesses(new EObjectFilter(ContentfwkPackage.eINSTANCE.getProcess()));
			// Start of user code for additional businessfilters for precedesProcesses
			
			// End of user code
			
			basePart.addFilterToFollowsProcesses(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInFollowsProcessesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToFollowsProcesses(new EObjectFilter(ContentfwkPackage.eINSTANCE.getProcess()));
			// Start of user code for additional businessfilters for followsProcesses
			
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
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.delegates) {
			return ContentfwkPackage.eINSTANCE.getElement_Delegates();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy) {
			return ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.description) {
			return ContentfwkPackage.eINSTANCE.getElement_Description();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.category) {
			return ContentfwkPackage.eINSTANCE.getElement_Category();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.source) {
			return ContentfwkPackage.eINSTANCE.getElement_SourceDescr();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.owner) {
			return ContentfwkPackage.eINSTANCE.getElement_OwnerDescr();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.iD) {
			return ContentfwkPackage.eINSTANCE.getElement_ID();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.standardClass) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardClass();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.standardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.retireDate) {
			return ContentfwkPackage.eINSTANCE.getStandard_RetireDate();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions) {
			return ContentfwkPackage.eINSTANCE.getProcess_OrchestratesFunctions();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions) {
			return ContentfwkPackage.eINSTANCE.getProcess_DecomposesFunctions();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits) {
			return ContentfwkPackage.eINSTANCE.getProcess_InvolvesOrganizationUnits();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices) {
			return ContentfwkPackage.eINSTANCE.getProcess_OrchestratesServices();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.decomposesServices) {
			return ContentfwkPackage.eINSTANCE.getProcess_DecomposesServices();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.involvesActors) {
			return ContentfwkPackage.eINSTANCE.getProcess_InvolvesActors();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls) {
			return ContentfwkPackage.eINSTANCE.getProcess_IsGuidedByControls();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents) {
			return ContentfwkPackage.eINSTANCE.getProcess_ResolvesEvents();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.generatesEvents) {
			return ContentfwkPackage.eINSTANCE.getProcess_GeneratesEvents();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.producesProducts) {
			return ContentfwkPackage.eINSTANCE.getProcess_ProducesProducts();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.processCritiality) {
			return ContentfwkPackage.eINSTANCE.getProcess_ProcessCritiality();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.isAutomated) {
			return ContentfwkPackage.eINSTANCE.getProcess_IsAutomated();
		}
		if (editorKey == ContentfwkViewsRepository.Process.Attributes.processVolumetrics) {
			return ContentfwkPackage.eINSTANCE.getProcess_ProcessVolumetrics();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess) {
			return ContentfwkPackage.eINSTANCE.getProcess_DecomposesProcess();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses) {
			return ContentfwkPackage.eINSTANCE.getProcess_PrecedesProcesses();
		}
		if (editorKey == ContentfwkViewsRepository.Process.RelatedElements.followsProcesses) {
			return ContentfwkPackage.eINSTANCE.getProcess_FollowsProcesses();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Process process = (Process)semanticObject;
		if (ContentfwkViewsRepository.Process.RelatedElements.delegates == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.Process.Attributes.name == event.getAffectedEditor()) {
			process.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.Attributes.description == event.getAffectedEditor()) {
			process.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.Attributes.category == event.getAffectedEditor()) {
			process.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.Attributes.source == event.getAffectedEditor()) {
			process.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.Attributes.owner == event.getAffectedEditor()) {
			process.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.Attributes.iD == event.getAffectedEditor()) {
			process.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.Attributes.standardClass == event.getAffectedEditor()) {
			process.setStandardClass((StandardsClass)event.getNewValue());
		}
		if (ContentfwkViewsRepository.Process.Attributes.standardCreationDate == event.getAffectedEditor()) {
			process.setStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
			process.setLastStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
			process.setNextStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.Attributes.retireDate == event.getAffectedEditor()) {
			process.setRetireDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Function) {
					orchestratesFunctionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				orchestratesFunctionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				orchestratesFunctionsSettings.move(event.getNewIndex(), (Function) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Function) {
					decomposesFunctionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				decomposesFunctionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				decomposesFunctionsSettings.move(event.getNewIndex(), (Function) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof OrganizationUnit) {
					involvesOrganizationUnitsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				involvesOrganizationUnitsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				involvesOrganizationUnitsSettings.move(event.getNewIndex(), (OrganizationUnit) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Service) {
					orchestratesServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				orchestratesServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				orchestratesServicesSettings.move(event.getNewIndex(), (Service) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.decomposesServices == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.Process.RelatedElements.involvesActors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Actor) {
					involvesActorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				involvesActorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				involvesActorsSettings.move(event.getNewIndex(), (Actor) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Control) {
					isGuidedByControlsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isGuidedByControlsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isGuidedByControlsSettings.move(event.getNewIndex(), (Control) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.Process.RelatedElements.generatesEvents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Event) {
					generatesEventsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				generatesEventsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				generatesEventsSettings.move(event.getNewIndex(), (Event) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.producesProducts == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.Process.Attributes.processCritiality == event.getAffectedEditor()) {
			process.setProcessCritiality((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.Attributes.isAutomated == event.getAffectedEditor()) {
			process.setIsAutomated((Boolean)event.getNewValue());
		}
		if (ContentfwkViewsRepository.Process.Attributes.processVolumetrics == event.getAffectedEditor()) {
			process.setProcessVolumetrics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decomposesProcessSettings.setToReference((Process)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Process eObject = ContentfwkFactory.eINSTANCE.createProcess();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposesProcessSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Process) {
					precedesProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				precedesProcessesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				precedesProcessesSettings.move(event.getNewIndex(), (Process) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Process.RelatedElements.followsProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Process) {
					followsProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				followsProcessesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				followsProcessesSettings.move(event.getNewIndex(), (Process) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ProcessPropertiesEditionPart basePart = (ProcessPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardClass().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.Process.Attributes.standardClass))
				basePart.setStandardClass((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.standardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setLastStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setLastStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setNextStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setNextStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_RetireDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.retireDate)) {
				if (msg.getNewValue() != null) {
					basePart.setRetireDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setRetireDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getProcess_OrchestratesFunctions().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions))
				basePart.updateOrchestratesFunctions();
			if (ContentfwkPackage.eINSTANCE.getProcess_DecomposesFunctions().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions))
				basePart.updateDecomposesFunctions();
			if (ContentfwkPackage.eINSTANCE.getProcess_InvolvesOrganizationUnits().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits))
				basePart.updateInvolvesOrganizationUnits();
			if (ContentfwkPackage.eINSTANCE.getProcess_OrchestratesServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices))
				basePart.updateOrchestratesServices();
			if (ContentfwkPackage.eINSTANCE.getProcess_DecomposesServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.decomposesServices))
				basePart.updateDecomposesServices();
			if (ContentfwkPackage.eINSTANCE.getProcess_InvolvesActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.involvesActors))
				basePart.updateInvolvesActors();
			if (ContentfwkPackage.eINSTANCE.getProcess_IsGuidedByControls().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls))
				basePart.updateIsGuidedByControls();
			if (ContentfwkPackage.eINSTANCE.getProcess_ResolvesEvents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents))
				basePart.updateResolvesEvents();
			if (ContentfwkPackage.eINSTANCE.getProcess_GeneratesEvents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.generatesEvents))
				basePart.updateGeneratesEvents();
			if (ContentfwkPackage.eINSTANCE.getProcess_ProducesProducts().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.producesProducts))
				basePart.updateProducesProducts();
			if (ContentfwkPackage.eINSTANCE.getProcess_ProcessCritiality().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.processCritiality)) {
				if (msg.getNewValue() != null) {
					basePart.setProcessCritiality(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setProcessCritiality("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getProcess_IsAutomated().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.isAutomated))
				basePart.setIsAutomated((Boolean)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getProcess_ProcessVolumetrics().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.Attributes.processVolumetrics)) {
				if (msg.getNewValue() != null) {
					basePart.setProcessVolumetrics(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setProcessVolumetrics("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getProcess_DecomposesProcess().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess))
				basePart.setDecomposesProcess((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getProcess_PrecedesProcesses().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses))
				basePart.updatePrecedesProcesses();
			if (ContentfwkPackage.eINSTANCE.getProcess_FollowsProcesses().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Process.RelatedElements.followsProcesses))
				basePart.updateFollowsProcesses();
			
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
				if (ContentfwkViewsRepository.Process.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.standardClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.standardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.retireDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_RetireDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_RetireDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.processCritiality == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getProcess_ProcessCritiality().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getProcess_ProcessCritiality().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.isAutomated == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getProcess_IsAutomated().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getProcess_IsAutomated().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Process.Attributes.processVolumetrics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getProcess_ProcessVolumetrics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getProcess_ProcessVolumetrics().getEAttributeType(), newValue);
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
