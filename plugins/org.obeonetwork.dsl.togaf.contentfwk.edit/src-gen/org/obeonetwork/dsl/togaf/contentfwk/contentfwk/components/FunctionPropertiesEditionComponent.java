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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StandardsClass;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class FunctionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for isPerformedByActors ReferencesTable
	 */
	private	ReferencesTableSettings isPerformedByActorsSettings;
	
	/**
	 * Settings for isOwnedByUnit EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings isOwnedByUnitSettings;
	
	/**
	 * Settings for isBoundedByServices ReferencesTable
	 */
	private	ReferencesTableSettings isBoundedByServicesSettings;
	
	/**
	 * Settings for supportsProcesses ReferencesTable
	 */
	private	ReferencesTableSettings supportsProcessesSettings;
	
	/**
	 * Settings for isRealizedByProcesses ReferencesTable
	 */
	private	ReferencesTableSettings isRealizedByProcessesSettings;
	
	/**
	 * Settings for canBeAccessedByRoles ReferencesTable
	 */
	private	ReferencesTableSettings canBeAccessedByRolesSettings;
	
	/**
	 * Settings for supportsActors ReferencesTable
	 */
	private	ReferencesTableSettings supportsActorsSettings;
	
	/**
	 * Settings for decomposesFunction EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposesFunctionSettings;
	
	/**
	 * Settings for communicatedWithFunctions ReferencesTable
	 */
	private	ReferencesTableSettings communicatedWithFunctionsSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public FunctionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject function, String editing_mode) {
		super(editingContext, function, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.Function.class;
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
			final Function function = (Function)elt;
			final FunctionPropertiesEditionPart basePart = (FunctionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(function, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(function, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (function.getName() != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), function.getName()));
			
			if (function.getDescription() != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), function.getDescription()));
			
			if (function.getCategory() != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), function.getCategory()));
			
			if (function.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), function.getSourceDescr()));
			
			if (function.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), function.getOwnerDescr()));
			
			if (function.getID() != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), function.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.Function.Attributes.standardClass)) {
				basePart.initStandardClass((EEnum) ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEType(), function.getStandardClass());
			}
			if (function.getStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.standardCreationDate))
				basePart.setStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), function.getStandardCreationDate()));
			
			if (function.getLastStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate))
				basePart.setLastStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), function.getLastStandardCreationDate()));
			
			if (function.getNextStandardCreationDate() != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate))
				basePart.setNextStandardCreationDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), function.getNextStandardCreationDate()));
			
			if (function.getRetireDate() != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.retireDate))
				basePart.setRetireDate(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), function.getRetireDate()));
			
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors)) {
				isPerformedByActorsSettings = new ReferencesTableSettings(function, ContentfwkPackage.eINSTANCE.getFunction_IsPerformedByActors());
				basePart.initIsPerformedByActors(isPerformedByActorsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.isOwnedByUnit)) {
				// init part
				isOwnedByUnitSettings = new EObjectFlatComboSettings(function, ContentfwkPackage.eINSTANCE.getFunction_IsOwnedByUnit());
				basePart.initIsOwnedByUnit(isOwnedByUnitSettings);
				// set the button mode
				basePart.setIsOwnedByUnitButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices)) {
				isBoundedByServicesSettings = new ReferencesTableSettings(function, ContentfwkPackage.eINSTANCE.getFunction_IsBoundedByServices());
				basePart.initIsBoundedByServices(isBoundedByServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses)) {
				supportsProcessesSettings = new ReferencesTableSettings(function, ContentfwkPackage.eINSTANCE.getFunction_SupportsProcesses());
				basePart.initSupportsProcesses(supportsProcessesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses)) {
				isRealizedByProcessesSettings = new ReferencesTableSettings(function, ContentfwkPackage.eINSTANCE.getFunction_IsRealizedByProcesses());
				basePart.initIsRealizedByProcesses(isRealizedByProcessesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles)) {
				canBeAccessedByRolesSettings = new ReferencesTableSettings(function, ContentfwkPackage.eINSTANCE.getFunction_CanBeAccessedByRoles());
				basePart.initCanBeAccessedByRoles(canBeAccessedByRolesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.supportsActors)) {
				supportsActorsSettings = new ReferencesTableSettings(function, ContentfwkPackage.eINSTANCE.getFunction_SupportsActors());
				basePart.initSupportsActors(supportsActorsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.decomposesFunction)) {
				// init part
				decomposesFunctionSettings = new EObjectFlatComboSettings(function, ContentfwkPackage.eINSTANCE.getFunction_DecomposesFunction());
				basePart.initDecomposesFunction(decomposesFunctionSettings);
				// set the button mode
				basePart.setDecomposesFunctionButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions)) {
				communicatedWithFunctionsSettings = new ReferencesTableSettings(function, ContentfwkPackage.eINSTANCE.getFunction_CommunicatedWithFunctions());
				basePart.initCommunicatedWithFunctions(communicatedWithFunctionsSettings);
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
			
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToIsPerformedByActors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsPerformedByActorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsPerformedByActors(new EObjectFilter(ContentfwkPackage.eINSTANCE.getActor()));
			// Start of user code for additional businessfilters for isPerformedByActors
			
			// End of user code
			
			basePart.addFilterToIsOwnedByUnit(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof OrganizationUnit); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for isOwnedByUnit
			
			// End of user code
			
			basePart.addFilterToIsBoundedByServices(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsBoundedByServicesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsBoundedByServices(new EObjectFilter(ContentfwkPackage.eINSTANCE.getService()));
			// Start of user code for additional businessfilters for isBoundedByServices
			
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
			
			basePart.addFilterToCanBeAccessedByRoles(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInCanBeAccessedByRolesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToCanBeAccessedByRoles(new EObjectFilter(ContentfwkPackage.eINSTANCE.getRole()));
			// Start of user code for additional businessfilters for canBeAccessedByRoles
			
			// End of user code
			
			basePart.addFilterToSupportsActors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSupportsActorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSupportsActors(new EObjectFilter(ContentfwkPackage.eINSTANCE.getActor()));
			// Start of user code for additional businessfilters for supportsActors
			
			// End of user code
			
			basePart.addFilterToDecomposesFunction(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Function); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposesFunction
			
			// End of user code
			
			basePart.addFilterToCommunicatedWithFunctions(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInCommunicatedWithFunctionsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToCommunicatedWithFunctions(new EObjectFilter(ContentfwkPackage.eINSTANCE.getFunction()));
			// Start of user code for additional businessfilters for communicatedWithFunctions
			
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
		Function function = (Function)semanticObject;
		if (ContentfwkViewsRepository.Function.RelatedElements.delegates == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					delegatesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					delegatesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					isDelegatedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isDelegatedBySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Function.Attributes.name == event.getAffectedEditor()) {
			function.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Function.Attributes.description == event.getAffectedEditor()) {
			function.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Function.Attributes.category == event.getAffectedEditor()) {
			function.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Function.Attributes.source == event.getAffectedEditor()) {
			function.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Function.Attributes.owner == event.getAffectedEditor()) {
			function.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Function.Attributes.iD == event.getAffectedEditor()) {
			function.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Function.Attributes.standardClass == event.getAffectedEditor()) {
			function.setStandardClass((StandardsClass)event.getNewValue());
		}
		if (ContentfwkViewsRepository.Function.Attributes.standardCreationDate == event.getAffectedEditor()) {
			function.setStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
			function.setLastStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
			function.setNextStandardCreationDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Function.Attributes.retireDate == event.getAffectedEditor()) {
			function.setRetireDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEDate(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Actor) {
					isPerformedByActorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isPerformedByActorsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Function.RelatedElements.isOwnedByUnit == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)  {
				isOwnedByUnitSettings.setToReference((OrganizationUnit)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD)  {
				OrganizationUnit eObject = ContentfwkFactory.eINSTANCE.createOrganizationUnit();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				isOwnedByUnitSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Service) {
					isBoundedByServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isBoundedByServicesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Process) {
					supportsProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					supportsProcessesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Process) {
					isRealizedByProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isRealizedByProcessesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Role) {
					canBeAccessedByRolesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					canBeAccessedByRolesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Function.RelatedElements.supportsActors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Actor) {
					supportsActorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					supportsActorsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Function.RelatedElements.decomposesFunction == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)  {
				decomposesFunctionSettings.setToReference((Function)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD)  {
				Function eObject = ContentfwkFactory.eINSTANCE.createFunction();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposesFunctionSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Function) {
					communicatedWithFunctionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					communicatedWithFunctionsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			FunctionPropertiesEditionPart basePart = (FunctionPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardClass().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.Function.Attributes.standardClass))
				basePart.setStandardClass((Enumerator)msg.getNewValue());
			
			if (ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.standardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setLastStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setLastStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate)) {
				if (msg.getNewValue() != null) {
					basePart.setNextStandardCreationDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setNextStandardCreationDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getStandard_RetireDate().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.Attributes.retireDate)) {
				if (msg.getNewValue() != null) {
					basePart.setRetireDate(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEDate(), msg.getNewValue()));
				} else {
					basePart.setRetireDate("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getFunction_IsPerformedByActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors))
				basePart.updateIsPerformedByActors();
			if (ContentfwkPackage.eINSTANCE.getFunction_IsOwnedByUnit().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.isOwnedByUnit))
				basePart.setIsOwnedByUnit((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getFunction_IsBoundedByServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices))
				basePart.updateIsBoundedByServices();
			if (ContentfwkPackage.eINSTANCE.getFunction_SupportsProcesses().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses))
				basePart.updateSupportsProcesses();
			if (ContentfwkPackage.eINSTANCE.getFunction_IsRealizedByProcesses().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses))
				basePart.updateIsRealizedByProcesses();
			if (ContentfwkPackage.eINSTANCE.getFunction_CanBeAccessedByRoles().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles))
				basePart.updateCanBeAccessedByRoles();
			if (ContentfwkPackage.eINSTANCE.getFunction_SupportsActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.supportsActors))
				basePart.updateSupportsActors();
			if (ContentfwkPackage.eINSTANCE.getFunction_DecomposesFunction().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.decomposesFunction))
				basePart.setDecomposesFunction((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getFunction_CommunicatedWithFunctions().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions))
				basePart.updateCommunicatedWithFunctions();
			
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
				if (ContentfwkViewsRepository.Function.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Function.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Function.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Function.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Function.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Function.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Function.Attributes.standardClass == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardClass().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Function.Attributes.standardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_StandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_LastStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getStandard_NextStandardCreationDate().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Function.Attributes.retireDate == event.getAffectedEditor()) {
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
