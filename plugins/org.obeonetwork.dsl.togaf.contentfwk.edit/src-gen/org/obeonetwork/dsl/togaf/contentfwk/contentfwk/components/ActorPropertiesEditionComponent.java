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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;

// End of user code

/**
 * 
 * 
 */
public class ActorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for suppliesEntities ReferencesTable
	 */
	private	ReferencesTableSettings suppliesEntitiesSettings;
	
	/**
	 * Settings for consumesEntities ReferencesTable
	 */
	private	ReferencesTableSettings consumesEntitiesSettings;
	
	/**
	 * Settings for belongsTo EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings belongsToSettings;
	
	/**
	 * Settings for interactsWithFunctions ReferencesTable
	 */
	private	ReferencesTableSettings interactsWithFunctionsSettings;
	
	/**
	 * Settings for performsTaskInRoles ReferencesTable
	 */
	private	ReferencesTableSettings performsTaskInRolesSettings;
	
	/**
	 * Settings for participatesInProcesses ReferencesTable
	 */
	private	ReferencesTableSettings participatesInProcessesSettings;
	
	/**
	 * Settings for consumesServices ReferencesTable
	 */
	private	ReferencesTableSettings consumesServicesSettings;
	
	/**
	 * Settings for resolvesEvents ReferencesTable
	 */
	private	ReferencesTableSettings resolvesEventsSettings;
	
	/**
	 * Settings for generatesEvents ReferencesTable
	 */
	private	ReferencesTableSettings generatesEventsSettings;
	
	/**
	 * Settings for operatesInLocation EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings operatesInLocationSettings;
	
	/**
	 * Settings for performsFunctions ReferencesTable
	 */
	private	ReferencesTableSettings performsFunctionsSettings;
	
	/**
	 * Settings for decomposesActors ReferencesTable
	 */
	private	ReferencesTableSettings decomposesActorsSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public ActorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject actor, String editing_mode) {
		super(editingContext, actor, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.Actor.class;
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
			final Actor actor = (Actor)elt;
			final ActorPropertiesEditionPart basePart = (ActorPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (actor.getName() != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), actor.getName()));
			
			if (actor.getDescription() != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), actor.getDescription()));
			
			if (actor.getCategory() != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), actor.getCategory()));
			
			if (actor.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), actor.getSourceDescr()));
			
			if (actor.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), actor.getOwnerDescr()));
			
			if (actor.getID() != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), actor.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities)) {
				suppliesEntitiesSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getActor_SuppliesEntities());
				basePart.initSuppliesEntities(suppliesEntitiesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities)) {
				consumesEntitiesSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getActor_ConsumesEntities());
				basePart.initConsumesEntities(consumesEntitiesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.belongsTo)) {
				// init part
				belongsToSettings = new EObjectFlatComboSettings(actor, ContentfwkPackage.eINSTANCE.getActor_BelongsTo());
				basePart.initBelongsTo(belongsToSettings);
				// set the button mode
				basePart.setBelongsToButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions)) {
				interactsWithFunctionsSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getActor_InteractsWithFunctions());
				basePart.initInteractsWithFunctions(interactsWithFunctionsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles)) {
				performsTaskInRolesSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getActor_PerformsTaskInRoles());
				basePart.initPerformsTaskInRoles(performsTaskInRolesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses)) {
				participatesInProcessesSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getActor_ParticipatesInProcesses());
				basePart.initParticipatesInProcesses(participatesInProcessesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.consumesServices)) {
				consumesServicesSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getActor_ConsumesServices());
				basePart.initConsumesServices(consumesServicesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents)) {
				resolvesEventsSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getActor_ResolvesEvents());
				basePart.initResolvesEvents(resolvesEventsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents)) {
				generatesEventsSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getActor_GeneratesEvents());
				basePart.initGeneratesEvents(generatesEventsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.operatesInLocation)) {
				// init part
				operatesInLocationSettings = new EObjectFlatComboSettings(actor, ContentfwkPackage.eINSTANCE.getActor_OperatesInLocation());
				basePart.initOperatesInLocation(operatesInLocationSettings);
				// set the button mode
				basePart.setOperatesInLocationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (actor.getFTEs() != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.fTEs))
				basePart.setFTEs(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), actor.getFTEs()));
			
			if (actor.getActorGoal() != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.actorGoal))
				basePart.setActorGoal(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), actor.getActorGoal()));
			
			if (actor.getActorTasks() != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.actorTasks))
				basePart.setActorTasks(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), actor.getActorTasks()));
			
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions)) {
				performsFunctionsSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getActor_PerformsFunctions());
				basePart.initPerformsFunctions(performsFunctionsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.decomposesActors)) {
				decomposesActorsSettings = new ReferencesTableSettings(actor, ContentfwkPackage.eINSTANCE.getActor_DecomposesActors());
				basePart.initDecomposesActors(decomposesActorsSettings);
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
			
			
			
			
			
			
			
			basePart.addFilterToSuppliesEntities(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSuppliesEntitiesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSuppliesEntities(new EObjectFilter(ContentfwkPackage.eINSTANCE.getDataEntity()));
			// Start of user code for additional businessfilters for suppliesEntities
			
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
			
			basePart.addFilterToBelongsTo(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof OrganizationUnit); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for belongsTo
			
			// End of user code
			
			basePart.addFilterToInteractsWithFunctions(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInInteractsWithFunctionsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToInteractsWithFunctions(new EObjectFilter(ContentfwkPackage.eINSTANCE.getFunction()));
			// Start of user code for additional businessfilters for interactsWithFunctions
			
			// End of user code
			
			basePart.addFilterToPerformsTaskInRoles(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInPerformsTaskInRolesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToPerformsTaskInRoles(new EObjectFilter(ContentfwkPackage.eINSTANCE.getRole()));
			// Start of user code for additional businessfilters for performsTaskInRoles
			
			// End of user code
			
			basePart.addFilterToParticipatesInProcesses(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInParticipatesInProcessesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToParticipatesInProcesses(new EObjectFilter(ContentfwkPackage.eINSTANCE.getProcess()));
			// Start of user code for additional businessfilters for participatesInProcesses
			
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
			
			basePart.addFilterToOperatesInLocation(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Location); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for operatesInLocation
			
			// End of user code
			
			
			
			
			basePart.addFilterToPerformsFunctions(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInPerformsFunctionsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToPerformsFunctions(new EObjectFilter(ContentfwkPackage.eINSTANCE.getFunction()));
			// Start of user code for additional businessfilters for performsFunctions
			
			// End of user code
			
			basePart.addFilterToDecomposesActors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInDecomposesActorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToDecomposesActors(new EObjectFilter(ContentfwkPackage.eINSTANCE.getActor()));
			// Start of user code for additional businessfilters for decomposesActors
			
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
		Actor actor = (Actor)semanticObject;
		if (ContentfwkViewsRepository.Actor.RelatedElements.delegates == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					delegatesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					delegatesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Element) {
					isDelegatedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					isDelegatedBySettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.Attributes.name == event.getAffectedEditor()) {
			actor.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Actor.Attributes.description == event.getAffectedEditor()) {
			actor.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Actor.Attributes.category == event.getAffectedEditor()) {
			actor.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Actor.Attributes.source == event.getAffectedEditor()) {
			actor.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Actor.Attributes.owner == event.getAffectedEditor()) {
			actor.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Actor.Attributes.iD == event.getAffectedEditor()) {
			actor.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof DataEntity) {
					suppliesEntitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					suppliesEntitiesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof DataEntity) {
					consumesEntitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					consumesEntitiesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.belongsTo == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)  {
				belongsToSettings.setToReference((OrganizationUnit)event.getNewValue());
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
				belongsToSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Function) {
					interactsWithFunctionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					interactsWithFunctionsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Role) {
					performsTaskInRolesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					performsTaskInRolesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Process) {
					participatesInProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					participatesInProcessesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.consumesServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Service) {
					consumesServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					consumesServicesSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Event) {
					resolvesEventsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					resolvesEventsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Event) {
					generatesEventsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					generatesEventsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.operatesInLocation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET)  {
				operatesInLocationSettings.setToReference((Location)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD)  {
				Location eObject = ContentfwkFactory.eINSTANCE.createLocation();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				operatesInLocationSettings.setToReference(eObject);
			}
		}
		if (ContentfwkViewsRepository.Actor.Attributes.fTEs == event.getAffectedEditor()) {
			actor.setFTEs((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Actor.Attributes.actorGoal == event.getAffectedEditor()) {
			actor.setActorGoal((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Actor.Attributes.actorTasks == event.getAffectedEditor()) {
			actor.setActorTasks((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Function) {
					performsFunctionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					performsFunctionsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Actor.RelatedElements.decomposesActors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD)  {
				if (event.getNewValue() instanceof Actor) {
					decomposesActorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
					decomposesActorsSettings.removeFromReference((EObject) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ActorPropertiesEditionPart basePart = (ActorPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getActor_SuppliesEntities().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities))
				basePart.updateSuppliesEntities();
			if (ContentfwkPackage.eINSTANCE.getActor_ConsumesEntities().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities))
				basePart.updateConsumesEntities();
			if (ContentfwkPackage.eINSTANCE.getActor_BelongsTo().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.belongsTo))
				basePart.setBelongsTo((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getActor_InteractsWithFunctions().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions))
				basePart.updateInteractsWithFunctions();
			if (ContentfwkPackage.eINSTANCE.getActor_PerformsTaskInRoles().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles))
				basePart.updatePerformsTaskInRoles();
			if (ContentfwkPackage.eINSTANCE.getActor_ParticipatesInProcesses().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses))
				basePart.updateParticipatesInProcesses();
			if (ContentfwkPackage.eINSTANCE.getActor_ConsumesServices().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.consumesServices))
				basePart.updateConsumesServices();
			if (ContentfwkPackage.eINSTANCE.getActor_ResolvesEvents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents))
				basePart.updateResolvesEvents();
			if (ContentfwkPackage.eINSTANCE.getActor_GeneratesEvents().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents))
				basePart.updateGeneratesEvents();
			if (ContentfwkPackage.eINSTANCE.getActor_OperatesInLocation().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.operatesInLocation))
				basePart.setOperatesInLocation((EObject)msg.getNewValue());
			if (ContentfwkPackage.eINSTANCE.getActor_FTEs().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.fTEs)) {
				if (msg.getNewValue() != null) {
					basePart.setFTEs(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setFTEs("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getActor_ActorGoal().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.actorGoal)) {
				if (msg.getNewValue() != null) {
					basePart.setActorGoal(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setActorGoal("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getActor_ActorTasks().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Actor.Attributes.actorTasks)) {
				if (msg.getNewValue() != null) {
					basePart.setActorTasks(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setActorTasks("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getActor_PerformsFunctions().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions))
				basePart.updatePerformsFunctions();
			if (ContentfwkPackage.eINSTANCE.getActor_DecomposesActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Actor.RelatedElements.decomposesActors))
				basePart.updateDecomposesActors();
			
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
				if (ContentfwkViewsRepository.Actor.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Actor.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Actor.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Actor.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Actor.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Actor.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Actor.Attributes.fTEs == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getActor_FTEs().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getActor_FTEs().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Actor.Attributes.actorGoal == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getActor_ActorGoal().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getActor_ActorGoal().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Actor.Attributes.actorTasks == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getActor_ActorTasks().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getActor_ActorTasks().getEAttributeType(), newValue);
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
