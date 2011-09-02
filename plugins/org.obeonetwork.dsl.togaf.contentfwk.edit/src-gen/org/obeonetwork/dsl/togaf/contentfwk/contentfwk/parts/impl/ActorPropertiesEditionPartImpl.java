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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class ActorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ActorPropertiesEditionPart {

	protected Text name;
	protected Text iD;
	protected Text description;
	protected Text category;
	protected Text source;
	protected Text owner;
	protected Text fTEs;
	protected Text actorGoal;
	protected Text actorTasks;
	protected EObjectFlatComboViewer decomposesActors;
	protected EObjectFlatComboViewer operatesInLocation;
	protected EObjectFlatComboViewer belongsTo;
	protected ReferencesTable performsTaskInRoles;
	protected List<ViewerFilter> performsTaskInRolesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> performsTaskInRolesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable interactsWithFunctions;
	protected List<ViewerFilter> interactsWithFunctionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> interactsWithFunctionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable performsFunctions;
	protected List<ViewerFilter> performsFunctionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> performsFunctionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable consumesServices;
	protected List<ViewerFilter> consumesServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> consumesServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable participatesInProcesses;
	protected List<ViewerFilter> participatesInProcessesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> participatesInProcessesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resolvesEvents;
	protected List<ViewerFilter> resolvesEventsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resolvesEventsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable generatesEvents;
	protected List<ViewerFilter> generatesEventsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> generatesEventsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable suppliesEntities;
	protected List<ViewerFilter> suppliesEntitiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> suppliesEntitiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable consumesEntities;
	protected List<ViewerFilter> consumesEntitiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> consumesEntitiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable delegates;
	protected List<ViewerFilter> delegatesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> delegatesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isDelegatedBy;
	protected List<ViewerFilter> isDelegatedByBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isDelegatedByFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ActorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence actorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = actorStep.addStep(ContentfwkViewsRepository.Actor.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.Actor.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.Actor.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.Actor.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.Actor.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.Actor.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.Actor.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.Actor.Attributes.fTEs);
		attributesStep.addStep(ContentfwkViewsRepository.Actor.Attributes.actorGoal);
		attributesStep.addStep(ContentfwkViewsRepository.Actor.Attributes.actorTasks);
		
		CompositionStep relatedElementsStep = actorStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.decomposesActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.operatesInLocation);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.belongsTo);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.consumesServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(actorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.Actor.Attributes.class) {
					return createAttributesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.Attributes.name) {
					return createNameText(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.Attributes.iD) {
					return createIDText(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.Attributes.description) {
					return createDescriptionText(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.Attributes.category) {
					return createCategoryText(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.Attributes.source) {
					return createSourceText(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.Attributes.owner) {
					return createOwnerText(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.Attributes.fTEs) {
					return createFTEsText(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.Attributes.actorGoal) {
					return createActorGoalText(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.Attributes.actorTasks) {
					return createActorTasksText(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.class) {
					return createRelatedElementsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.decomposesActors) {
					return createDecomposesActorsFlatComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.operatesInLocation) {
					return createOperatesInLocationFlatComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.belongsTo) {
					return createBelongsToFlatComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles) {
					return createPerformsTaskInRolesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions) {
					return createInteractsWithFunctionsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions) {
					return createPerformsFunctionsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.consumesServices) {
					return createConsumesServicesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses) {
					return createParticipatesInProcessesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents) {
					return createResolvesEventsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents) {
					return createGeneratesEventsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities) {
					return createSuppliesEntitiesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities) {
					return createConsumesEntitiesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.delegates) {
					return createDelegatesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy) {
					return createIsDelegatedByAdvancedReferencesTable(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createAttributesGroup(Composite parent) {
		Group attributesGroup = new Group(parent, SWT.NONE);
		attributesGroup.setText(ContentfwkMessages.ActorPropertiesEditionPart_AttributesGroupLabel);
		GridData attributesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		attributesGroupData.horizontalSpan = 3;
		attributesGroup.setLayoutData(attributesGroupData);
		GridLayout attributesGroupLayout = new GridLayout();
		attributesGroupLayout.numColumns = 3;
		attributesGroup.setLayout(attributesGroupLayout);
		return attributesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.Attributes.name, ContentfwkViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ContentfwkViewsRepository.Actor.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.Attributes.name, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.Attributes.iD, ContentfwkViewsRepository.SWT_KIND));
		iD = new Text(parent, SWT.BORDER);
		GridData iDData = new GridData(GridData.FILL_HORIZONTAL);
		iD.setLayoutData(iDData);
		iD.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
			}

		});
		iD.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}

		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.Actor.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.Attributes.iD, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.Attributes.description, ContentfwkViewsRepository.SWT_KIND));
		description = new Text(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ContentfwkViewsRepository.Actor.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.Attributes.description, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.Attributes.category, ContentfwkViewsRepository.SWT_KIND));
		category = new Text(parent, SWT.BORDER);
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		category.setLayoutData(categoryData);
		category.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
			}

		});
		category.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}

		});
		EditingUtils.setID(category, ContentfwkViewsRepository.Actor.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.Attributes.category, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.Attributes.source, ContentfwkViewsRepository.SWT_KIND));
		source = new Text(parent, SWT.BORDER);
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
			}

		});
		source.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}

		});
		EditingUtils.setID(source, ContentfwkViewsRepository.Actor.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.Attributes.source, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.Attributes.owner, ContentfwkViewsRepository.SWT_KIND));
		owner = new Text(parent, SWT.BORDER);
		GridData ownerData = new GridData(GridData.FILL_HORIZONTAL);
		owner.setLayoutData(ownerData);
		owner.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
			}

		});
		owner.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}

		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.Actor.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.Attributes.owner, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFTEsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_FTEsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.Attributes.fTEs, ContentfwkViewsRepository.SWT_KIND));
		fTEs = new Text(parent, SWT.BORDER);
		GridData fTEsData = new GridData(GridData.FILL_HORIZONTAL);
		fTEs.setLayoutData(fTEsData);
		fTEs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.fTEs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fTEs.getText()));
			}

		});
		fTEs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.fTEs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fTEs.getText()));
				}
			}

		});
		EditingUtils.setID(fTEs, ContentfwkViewsRepository.Actor.Attributes.fTEs);
		EditingUtils.setEEFtype(fTEs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.Attributes.fTEs, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createActorGoalText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_ActorGoalLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.Attributes.actorGoal, ContentfwkViewsRepository.SWT_KIND));
		actorGoal = new Text(parent, SWT.BORDER);
		GridData actorGoalData = new GridData(GridData.FILL_HORIZONTAL);
		actorGoal.setLayoutData(actorGoalData);
		actorGoal.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.actorGoal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, actorGoal.getText()));
			}

		});
		actorGoal.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.actorGoal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, actorGoal.getText()));
				}
			}

		});
		EditingUtils.setID(actorGoal, ContentfwkViewsRepository.Actor.Attributes.actorGoal);
		EditingUtils.setEEFtype(actorGoal, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.Attributes.actorGoal, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createActorTasksText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_ActorTasksLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.Attributes.actorTasks, ContentfwkViewsRepository.SWT_KIND));
		actorTasks = new Text(parent, SWT.BORDER);
		GridData actorTasksData = new GridData(GridData.FILL_HORIZONTAL);
		actorTasks.setLayoutData(actorTasksData);
		actorTasks.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.actorTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, actorTasks.getText()));
			}

		});
		actorTasks.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.Attributes.actorTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, actorTasks.getText()));
				}
			}

		});
		EditingUtils.setID(actorTasks, ContentfwkViewsRepository.Actor.Attributes.actorTasks);
		EditingUtils.setEEFtype(actorTasks, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.Attributes.actorTasks, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(Composite parent) {
		Group relatedElementsGroup = new Group(parent, SWT.NONE);
		relatedElementsGroup.setText(ContentfwkMessages.ActorPropertiesEditionPart_RelatedElementsGroupLabel);
		GridData relatedElementsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		relatedElementsGroupData.horizontalSpan = 3;
		relatedElementsGroup.setLayoutData(relatedElementsGroupData);
		GridLayout relatedElementsGroupLayout = new GridLayout();
		relatedElementsGroupLayout.numColumns = 3;
		relatedElementsGroup.setLayout(relatedElementsGroupLayout);
		return relatedElementsGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createDecomposesActorsFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_DecomposesActorsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.RelatedElements.decomposesActors, ContentfwkViewsRepository.SWT_KIND));
		decomposesActors = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.RelatedElements.decomposesActors, ContentfwkViewsRepository.SWT_KIND));
		decomposesActors.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		decomposesActors.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.decomposesActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecomposesActors()));
			}

		});
		GridData decomposesActorsData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesActors.setLayoutData(decomposesActorsData);
		decomposesActors.setID(ContentfwkViewsRepository.Actor.RelatedElements.decomposesActors);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.decomposesActors, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOperatesInLocationFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_OperatesInLocationLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.RelatedElements.operatesInLocation, ContentfwkViewsRepository.SWT_KIND));
		operatesInLocation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.RelatedElements.operatesInLocation, ContentfwkViewsRepository.SWT_KIND));
		operatesInLocation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		operatesInLocation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.operatesInLocation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOperatesInLocation()));
			}

		});
		GridData operatesInLocationData = new GridData(GridData.FILL_HORIZONTAL);
		operatesInLocation.setLayoutData(operatesInLocationData);
		operatesInLocation.setID(ContentfwkViewsRepository.Actor.RelatedElements.operatesInLocation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.operatesInLocation, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createBelongsToFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ActorPropertiesEditionPart_BelongsToLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.RelatedElements.belongsTo, ContentfwkViewsRepository.SWT_KIND));
		belongsTo = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Actor.RelatedElements.belongsTo, ContentfwkViewsRepository.SWT_KIND));
		belongsTo.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		belongsTo.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.belongsTo, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getBelongsTo()));
			}

		});
		GridData belongsToData = new GridData(GridData.FILL_HORIZONTAL);
		belongsTo.setLayoutData(belongsToData);
		belongsTo.setID(ContentfwkViewsRepository.Actor.RelatedElements.belongsTo);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.belongsTo, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPerformsTaskInRolesAdvancedReferencesTable(Composite parent) {
		this.performsTaskInRoles = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_PerformsTaskInRolesLabel, new ReferencesTableListener() {
			public void handleAdd() { addPerformsTaskInRoles(); }
			public void handleEdit(EObject element) { editPerformsTaskInRoles(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePerformsTaskInRoles(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPerformsTaskInRoles(element); }
			public void navigateTo(EObject element) { }
		});
		this.performsTaskInRoles.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles, ContentfwkViewsRepository.SWT_KIND));
		this.performsTaskInRoles.createControls(parent);
		this.performsTaskInRoles.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData performsTaskInRolesData = new GridData(GridData.FILL_HORIZONTAL);
		performsTaskInRolesData.horizontalSpan = 3;
		this.performsTaskInRoles.setLayoutData(performsTaskInRolesData);
		this.performsTaskInRoles.disableMove();
		performsTaskInRoles.setID(ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles);
		performsTaskInRoles.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPerformsTaskInRoles() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(performsTaskInRoles.getInput(), performsTaskInRolesFilters, performsTaskInRolesBusinessFilters,
		"performs Task In Roles", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				performsTaskInRoles.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePerformsTaskInRoles(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		performsTaskInRoles.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPerformsTaskInRoles(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.performsTaskInRoles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		performsTaskInRoles.refresh();
	}

	/**
	 * 
	 */
	protected void editPerformsTaskInRoles(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				performsTaskInRoles.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createInteractsWithFunctionsAdvancedReferencesTable(Composite parent) {
		this.interactsWithFunctions = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_InteractsWithFunctionsLabel, new ReferencesTableListener() {
			public void handleAdd() { addInteractsWithFunctions(); }
			public void handleEdit(EObject element) { editInteractsWithFunctions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInteractsWithFunctions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInteractsWithFunctions(element); }
			public void navigateTo(EObject element) { }
		});
		this.interactsWithFunctions.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions, ContentfwkViewsRepository.SWT_KIND));
		this.interactsWithFunctions.createControls(parent);
		this.interactsWithFunctions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData interactsWithFunctionsData = new GridData(GridData.FILL_HORIZONTAL);
		interactsWithFunctionsData.horizontalSpan = 3;
		this.interactsWithFunctions.setLayoutData(interactsWithFunctionsData);
		this.interactsWithFunctions.disableMove();
		interactsWithFunctions.setID(ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions);
		interactsWithFunctions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInteractsWithFunctions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(interactsWithFunctions.getInput(), interactsWithFunctionsFilters, interactsWithFunctionsBusinessFilters,
		"interacts With Functions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				interactsWithFunctions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInteractsWithFunctions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		interactsWithFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInteractsWithFunctions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.interactsWithFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		interactsWithFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void editInteractsWithFunctions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				interactsWithFunctions.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createPerformsFunctionsAdvancedReferencesTable(Composite parent) {
		this.performsFunctions = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_PerformsFunctionsLabel, new ReferencesTableListener() {
			public void handleAdd() { addPerformsFunctions(); }
			public void handleEdit(EObject element) { editPerformsFunctions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePerformsFunctions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPerformsFunctions(element); }
			public void navigateTo(EObject element) { }
		});
		this.performsFunctions.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions, ContentfwkViewsRepository.SWT_KIND));
		this.performsFunctions.createControls(parent);
		this.performsFunctions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData performsFunctionsData = new GridData(GridData.FILL_HORIZONTAL);
		performsFunctionsData.horizontalSpan = 3;
		this.performsFunctions.setLayoutData(performsFunctionsData);
		this.performsFunctions.disableMove();
		performsFunctions.setID(ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions);
		performsFunctions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPerformsFunctions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(performsFunctions.getInput(), performsFunctionsFilters, performsFunctionsBusinessFilters,
		"performs Functions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				performsFunctions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePerformsFunctions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		performsFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPerformsFunctions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.performsFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		performsFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void editPerformsFunctions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				performsFunctions.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createConsumesServicesAdvancedReferencesTable(Composite parent) {
		this.consumesServices = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_ConsumesServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { addConsumesServices(); }
			public void handleEdit(EObject element) { editConsumesServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveConsumesServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromConsumesServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.consumesServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.consumesServices, ContentfwkViewsRepository.SWT_KIND));
		this.consumesServices.createControls(parent);
		this.consumesServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.consumesServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData consumesServicesData = new GridData(GridData.FILL_HORIZONTAL);
		consumesServicesData.horizontalSpan = 3;
		this.consumesServices.setLayoutData(consumesServicesData);
		this.consumesServices.disableMove();
		consumesServices.setID(ContentfwkViewsRepository.Actor.RelatedElements.consumesServices);
		consumesServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addConsumesServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(consumesServices.getInput(), consumesServicesFilters, consumesServicesBusinessFilters,
		"consumes Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.consumesServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				consumesServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveConsumesServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.consumesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		consumesServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromConsumesServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.consumesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		consumesServices.refresh();
	}

	/**
	 * 
	 */
	protected void editConsumesServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				consumesServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createParticipatesInProcessesAdvancedReferencesTable(Composite parent) {
		this.participatesInProcesses = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_ParticipatesInProcessesLabel, new ReferencesTableListener() {
			public void handleAdd() { addParticipatesInProcesses(); }
			public void handleEdit(EObject element) { editParticipatesInProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveParticipatesInProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromParticipatesInProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.participatesInProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses, ContentfwkViewsRepository.SWT_KIND));
		this.participatesInProcesses.createControls(parent);
		this.participatesInProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData participatesInProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		participatesInProcessesData.horizontalSpan = 3;
		this.participatesInProcesses.setLayoutData(participatesInProcessesData);
		this.participatesInProcesses.disableMove();
		participatesInProcesses.setID(ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses);
		participatesInProcesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addParticipatesInProcesses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(participatesInProcesses.getInput(), participatesInProcessesFilters, participatesInProcessesBusinessFilters,
		"participates In Processes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				participatesInProcesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveParticipatesInProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		participatesInProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromParticipatesInProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.participatesInProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		participatesInProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void editParticipatesInProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				participatesInProcesses.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createResolvesEventsAdvancedReferencesTable(Composite parent) {
		this.resolvesEvents = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_ResolvesEventsLabel, new ReferencesTableListener() {
			public void handleAdd() { addResolvesEvents(); }
			public void handleEdit(EObject element) { editResolvesEvents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResolvesEvents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResolvesEvents(element); }
			public void navigateTo(EObject element) { }
		});
		this.resolvesEvents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents, ContentfwkViewsRepository.SWT_KIND));
		this.resolvesEvents.createControls(parent);
		this.resolvesEvents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resolvesEventsData = new GridData(GridData.FILL_HORIZONTAL);
		resolvesEventsData.horizontalSpan = 3;
		this.resolvesEvents.setLayoutData(resolvesEventsData);
		this.resolvesEvents.disableMove();
		resolvesEvents.setID(ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents);
		resolvesEvents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addResolvesEvents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(resolvesEvents.getInput(), resolvesEventsFilters, resolvesEventsBusinessFilters,
		"resolves Events", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				resolvesEvents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveResolvesEvents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resolvesEvents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResolvesEvents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.resolvesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		resolvesEvents.refresh();
	}

	/**
	 * 
	 */
	protected void editResolvesEvents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				resolvesEvents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createGeneratesEventsAdvancedReferencesTable(Composite parent) {
		this.generatesEvents = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_GeneratesEventsLabel, new ReferencesTableListener() {
			public void handleAdd() { addGeneratesEvents(); }
			public void handleEdit(EObject element) { editGeneratesEvents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGeneratesEvents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGeneratesEvents(element); }
			public void navigateTo(EObject element) { }
		});
		this.generatesEvents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents, ContentfwkViewsRepository.SWT_KIND));
		this.generatesEvents.createControls(parent);
		this.generatesEvents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData generatesEventsData = new GridData(GridData.FILL_HORIZONTAL);
		generatesEventsData.horizontalSpan = 3;
		this.generatesEvents.setLayoutData(generatesEventsData);
		this.generatesEvents.disableMove();
		generatesEvents.setID(ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents);
		generatesEvents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addGeneratesEvents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(generatesEvents.getInput(), generatesEventsFilters, generatesEventsBusinessFilters,
		"generates Events", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				generatesEvents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveGeneratesEvents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		generatesEvents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGeneratesEvents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.generatesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		generatesEvents.refresh();
	}

	/**
	 * 
	 */
	protected void editGeneratesEvents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				generatesEvents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSuppliesEntitiesAdvancedReferencesTable(Composite parent) {
		this.suppliesEntities = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_SuppliesEntitiesLabel, new ReferencesTableListener() {
			public void handleAdd() { addSuppliesEntities(); }
			public void handleEdit(EObject element) { editSuppliesEntities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSuppliesEntities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSuppliesEntities(element); }
			public void navigateTo(EObject element) { }
		});
		this.suppliesEntities.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities, ContentfwkViewsRepository.SWT_KIND));
		this.suppliesEntities.createControls(parent);
		this.suppliesEntities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData suppliesEntitiesData = new GridData(GridData.FILL_HORIZONTAL);
		suppliesEntitiesData.horizontalSpan = 3;
		this.suppliesEntities.setLayoutData(suppliesEntitiesData);
		this.suppliesEntities.disableMove();
		suppliesEntities.setID(ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities);
		suppliesEntities.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSuppliesEntities() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(suppliesEntities.getInput(), suppliesEntitiesFilters, suppliesEntitiesBusinessFilters,
		"supplies Entities", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				suppliesEntities.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSuppliesEntities(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		suppliesEntities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSuppliesEntities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.suppliesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		suppliesEntities.refresh();
	}

	/**
	 * 
	 */
	protected void editSuppliesEntities(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				suppliesEntities.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createConsumesEntitiesAdvancedReferencesTable(Composite parent) {
		this.consumesEntities = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_ConsumesEntitiesLabel, new ReferencesTableListener() {
			public void handleAdd() { addConsumesEntities(); }
			public void handleEdit(EObject element) { editConsumesEntities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveConsumesEntities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromConsumesEntities(element); }
			public void navigateTo(EObject element) { }
		});
		this.consumesEntities.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities, ContentfwkViewsRepository.SWT_KIND));
		this.consumesEntities.createControls(parent);
		this.consumesEntities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData consumesEntitiesData = new GridData(GridData.FILL_HORIZONTAL);
		consumesEntitiesData.horizontalSpan = 3;
		this.consumesEntities.setLayoutData(consumesEntitiesData);
		this.consumesEntities.disableMove();
		consumesEntities.setID(ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities);
		consumesEntities.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addConsumesEntities() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(consumesEntities.getInput(), consumesEntitiesFilters, consumesEntitiesBusinessFilters,
		"consumes Entities", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				consumesEntities.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveConsumesEntities(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		consumesEntities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromConsumesEntities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.consumesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		consumesEntities.refresh();
	}

	/**
	 * 
	 */
	protected void editConsumesEntities(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				consumesEntities.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesAdvancedReferencesTable(Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.delegates, ContentfwkViewsRepository.SWT_KIND));
		this.delegates.createControls(parent);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.Actor.RelatedElements.delegates);
		delegates.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDelegates() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(delegates.getInput(), delegatesFilters, delegatesBusinessFilters,
		"delegates", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.delegates,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				delegates.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDelegates(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void editDelegates(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				delegates.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsDelegatedByAdvancedReferencesTable(Composite parent) {
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.ActorPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.SWT_KIND));
		this.isDelegatedBy.createControls(parent);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy);
		isDelegatedBy.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsDelegatedBy() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isDelegatedBy.getInput(), isDelegatedByFilters, isDelegatedByBusinessFilters,
		"is Delegated By", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isDelegatedBy.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsDelegatedBy(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ActorPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Actor.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void editIsDelegatedBy(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isDelegatedBy.refresh();
			}
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization

// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setID(String newValue)
	 * 
	 */
	public void setID(String newValue) {
		if (newValue != null) {
			iD.setText(newValue);
		} else {
			iD.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setCategory(String newValue)
	 * 
	 */
	public void setCategory(String newValue) {
		if (newValue != null) {
			category.setText(newValue);
		} else {
			category.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setSource(String newValue)
	 * 
	 */
	public void setSource(String newValue) {
		if (newValue != null) {
			source.setText(newValue);
		} else {
			source.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setOwner(String newValue)
	 * 
	 */
	public void setOwner(String newValue) {
		if (newValue != null) {
			owner.setText(newValue);
		} else {
			owner.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getFTEs()
	 * 
	 */
	public String getFTEs() {
		return fTEs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setFTEs(String newValue)
	 * 
	 */
	public void setFTEs(String newValue) {
		if (newValue != null) {
			fTEs.setText(newValue);
		} else {
			fTEs.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getActorGoal()
	 * 
	 */
	public String getActorGoal() {
		return actorGoal.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setActorGoal(String newValue)
	 * 
	 */
	public void setActorGoal(String newValue) {
		if (newValue != null) {
			actorGoal.setText(newValue);
		} else {
			actorGoal.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getActorTasks()
	 * 
	 */
	public String getActorTasks() {
		return actorTasks.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setActorTasks(String newValue)
	 * 
	 */
	public void setActorTasks(String newValue) {
		if (newValue != null) {
			actorTasks.setText(newValue);
		} else {
			actorTasks.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getDecomposesActors()
	 * 
	 */
	public EObject getDecomposesActors() {
		if (decomposesActors.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decomposesActors.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initDecomposesActors(EObjectFlatComboSettings)
	 */
	public void initDecomposesActors(EObjectFlatComboSettings settings) {
		decomposesActors.setInput(settings);
		if (current != null) {
			decomposesActors.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setDecomposesActors(EObject newValue)
	 * 
	 */
	public void setDecomposesActors(EObject newValue) {
		if (newValue != null) {
			decomposesActors.setSelection(new StructuredSelection(newValue));
		} else {
			decomposesActors.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setDecomposesActorsButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecomposesActorsButtonMode(ButtonsModeEnum newValue) {
		decomposesActors.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterDecomposesActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesActors(ViewerFilter filter) {
		decomposesActors.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterDecomposesActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesActors(ViewerFilter filter) {
		decomposesActors.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getOperatesInLocation()
	 * 
	 */
	public EObject getOperatesInLocation() {
		if (operatesInLocation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) operatesInLocation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initOperatesInLocation(EObjectFlatComboSettings)
	 */
	public void initOperatesInLocation(EObjectFlatComboSettings settings) {
		operatesInLocation.setInput(settings);
		if (current != null) {
			operatesInLocation.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setOperatesInLocation(EObject newValue)
	 * 
	 */
	public void setOperatesInLocation(EObject newValue) {
		if (newValue != null) {
			operatesInLocation.setSelection(new StructuredSelection(newValue));
		} else {
			operatesInLocation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setOperatesInLocationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOperatesInLocationButtonMode(ButtonsModeEnum newValue) {
		operatesInLocation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterOperatesInLocation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOperatesInLocation(ViewerFilter filter) {
		operatesInLocation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterOperatesInLocation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOperatesInLocation(ViewerFilter filter) {
		operatesInLocation.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#getBelongsTo()
	 * 
	 */
	public EObject getBelongsTo() {
		if (belongsTo.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) belongsTo.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initBelongsTo(EObjectFlatComboSettings)
	 */
	public void initBelongsTo(EObjectFlatComboSettings settings) {
		belongsTo.setInput(settings);
		if (current != null) {
			belongsTo.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setBelongsTo(EObject newValue)
	 * 
	 */
	public void setBelongsTo(EObject newValue) {
		if (newValue != null) {
			belongsTo.setSelection(new StructuredSelection(newValue));
		} else {
			belongsTo.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#setBelongsToButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBelongsToButtonMode(ButtonsModeEnum newValue) {
		belongsTo.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterBelongsTo(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBelongsTo(ViewerFilter filter) {
		belongsTo.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterBelongsTo(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBelongsTo(ViewerFilter filter) {
		belongsTo.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initPerformsTaskInRoles(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPerformsTaskInRoles(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		performsTaskInRoles.setContentProvider(contentProvider);
		performsTaskInRoles.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updatePerformsTaskInRoles()
	 * 
	 */
	public void updatePerformsTaskInRoles() {
	performsTaskInRoles.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterPerformsTaskInRoles(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPerformsTaskInRoles(ViewerFilter filter) {
		performsTaskInRolesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterPerformsTaskInRoles(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPerformsTaskInRoles(ViewerFilter filter) {
		performsTaskInRolesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInPerformsTaskInRolesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPerformsTaskInRolesTable(EObject element) {
		return ((ReferencesTableSettings)performsTaskInRoles.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initInteractsWithFunctions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInteractsWithFunctions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		interactsWithFunctions.setContentProvider(contentProvider);
		interactsWithFunctions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updateInteractsWithFunctions()
	 * 
	 */
	public void updateInteractsWithFunctions() {
	interactsWithFunctions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterInteractsWithFunctions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInteractsWithFunctions(ViewerFilter filter) {
		interactsWithFunctionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterInteractsWithFunctions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInteractsWithFunctions(ViewerFilter filter) {
		interactsWithFunctionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInInteractsWithFunctionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInteractsWithFunctionsTable(EObject element) {
		return ((ReferencesTableSettings)interactsWithFunctions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initPerformsFunctions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPerformsFunctions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		performsFunctions.setContentProvider(contentProvider);
		performsFunctions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updatePerformsFunctions()
	 * 
	 */
	public void updatePerformsFunctions() {
	performsFunctions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterPerformsFunctions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPerformsFunctions(ViewerFilter filter) {
		performsFunctionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterPerformsFunctions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPerformsFunctions(ViewerFilter filter) {
		performsFunctionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInPerformsFunctionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInPerformsFunctionsTable(EObject element) {
		return ((ReferencesTableSettings)performsFunctions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initConsumesServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initConsumesServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		consumesServices.setContentProvider(contentProvider);
		consumesServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updateConsumesServices()
	 * 
	 */
	public void updateConsumesServices() {
	consumesServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterConsumesServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConsumesServices(ViewerFilter filter) {
		consumesServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterConsumesServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConsumesServices(ViewerFilter filter) {
		consumesServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInConsumesServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInConsumesServicesTable(EObject element) {
		return ((ReferencesTableSettings)consumesServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initParticipatesInProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initParticipatesInProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		participatesInProcesses.setContentProvider(contentProvider);
		participatesInProcesses.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updateParticipatesInProcesses()
	 * 
	 */
	public void updateParticipatesInProcesses() {
	participatesInProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterParticipatesInProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParticipatesInProcesses(ViewerFilter filter) {
		participatesInProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterParticipatesInProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParticipatesInProcesses(ViewerFilter filter) {
		participatesInProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInParticipatesInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInParticipatesInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)participatesInProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initResolvesEvents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initResolvesEvents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resolvesEvents.setContentProvider(contentProvider);
		resolvesEvents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updateResolvesEvents()
	 * 
	 */
	public void updateResolvesEvents() {
	resolvesEvents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterResolvesEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResolvesEvents(ViewerFilter filter) {
		resolvesEventsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterResolvesEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResolvesEvents(ViewerFilter filter) {
		resolvesEventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInResolvesEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInResolvesEventsTable(EObject element) {
		return ((ReferencesTableSettings)resolvesEvents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initGeneratesEvents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGeneratesEvents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		generatesEvents.setContentProvider(contentProvider);
		generatesEvents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updateGeneratesEvents()
	 * 
	 */
	public void updateGeneratesEvents() {
	generatesEvents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterGeneratesEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGeneratesEvents(ViewerFilter filter) {
		generatesEventsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterGeneratesEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGeneratesEvents(ViewerFilter filter) {
		generatesEventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInGeneratesEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGeneratesEventsTable(EObject element) {
		return ((ReferencesTableSettings)generatesEvents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initSuppliesEntities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSuppliesEntities(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		suppliesEntities.setContentProvider(contentProvider);
		suppliesEntities.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updateSuppliesEntities()
	 * 
	 */
	public void updateSuppliesEntities() {
	suppliesEntities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterSuppliesEntities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSuppliesEntities(ViewerFilter filter) {
		suppliesEntitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterSuppliesEntities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSuppliesEntities(ViewerFilter filter) {
		suppliesEntitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInSuppliesEntitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSuppliesEntitiesTable(EObject element) {
		return ((ReferencesTableSettings)suppliesEntities.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initConsumesEntities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initConsumesEntities(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		consumesEntities.setContentProvider(contentProvider);
		consumesEntities.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updateConsumesEntities()
	 * 
	 */
	public void updateConsumesEntities() {
	consumesEntities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterConsumesEntities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConsumesEntities(ViewerFilter filter) {
		consumesEntitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterConsumesEntities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConsumesEntities(ViewerFilter filter) {
		consumesEntitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInConsumesEntitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInConsumesEntitiesTable(EObject element) {
		return ((ReferencesTableSettings)consumesEntities.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDelegates(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		delegates.setContentProvider(contentProvider);
		delegates.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsDelegatedBy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isDelegatedBy.setContentProvider(contentProvider);
		isDelegatedBy.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ActorPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsDelegatedByTable(EObject element) {
		return ((ReferencesTableSettings)isDelegatedBy.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.Actor_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
