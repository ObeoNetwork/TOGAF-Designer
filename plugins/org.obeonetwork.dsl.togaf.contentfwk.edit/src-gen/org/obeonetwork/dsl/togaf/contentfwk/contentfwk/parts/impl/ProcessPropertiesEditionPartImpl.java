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

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class ProcessPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ProcessPropertiesEditionPart {

	protected Text name;
	protected Text iD;
	protected Text description;
	protected Text category;
	protected Text source;
	protected Text owner;
	protected EMFComboViewer standardClass;
	protected Text standardCreationDate;
	protected Text lastStandardCreationDate;
	protected Text nextStandardCreationDate;
	protected Text retireDate;
	protected Text processCritiality;
	protected Button isAutomated;
	protected Text processVolumetrics;
	protected EObjectFlatComboViewer decomposesProcess;
	protected ReferencesTable precedesProcesses;
	protected List<ViewerFilter> precedesProcessesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> precedesProcessesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable followsProcesses;
	protected List<ViewerFilter> followsProcessesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> followsProcessesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resolvesEvents;
	protected List<ViewerFilter> resolvesEventsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resolvesEventsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable generatesEvents;
	protected List<ViewerFilter> generatesEventsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> generatesEventsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable orchestratesFunctions;
	protected List<ViewerFilter> orchestratesFunctionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> orchestratesFunctionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable decomposesFunctions;
	protected List<ViewerFilter> decomposesFunctionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> decomposesFunctionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable involvesOrganizationUnits;
	protected List<ViewerFilter> involvesOrganizationUnitsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> involvesOrganizationUnitsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable orchestratesServices;
	protected List<ViewerFilter> orchestratesServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> orchestratesServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable decomposesServices;
	protected List<ViewerFilter> decomposesServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> decomposesServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable involvesActors;
	protected List<ViewerFilter> involvesActorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> involvesActorsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isGuidedByControls;
	protected List<ViewerFilter> isGuidedByControlsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isGuidedByControlsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable producesProducts;
	protected List<ViewerFilter> producesProductsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> producesProductsFilters = new ArrayList<ViewerFilter>();
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
	public ProcessPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence processStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = processStep.addStep(ContentfwkViewsRepository.Process.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.standardClass);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.standardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.retireDate);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.processCritiality);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.isAutomated);
		attributesStep.addStep(ContentfwkViewsRepository.Process.Attributes.processVolumetrics);
		
		CompositionStep relatedElementsStep = processStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.followsProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.generatesEvents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.decomposesServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.involvesActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.producesProducts);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(processStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.Process.Attributes.class) {
					return createAttributesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.name) {
					return createNameText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.iD) {
					return createIDText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.description) {
					return createDescriptionText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.category) {
					return createCategoryText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.source) {
					return createSourceText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.owner) {
					return createOwnerText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.standardClass) {
					return createStandardClassEMFComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.standardCreationDate) {
					return createStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate) {
					return createLastStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate) {
					return createNextStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.retireDate) {
					return createRetireDateText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.processCritiality) {
					return createProcessCritialityText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.isAutomated) {
					return createIsAutomatedCheckbox(parent);
				}
				if (key == ContentfwkViewsRepository.Process.Attributes.processVolumetrics) {
					return createProcessVolumetricsText(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.class) {
					return createRelatedElementsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess) {
					return createDecomposesProcessFlatComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses) {
					return createPrecedesProcessesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.followsProcesses) {
					return createFollowsProcessesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents) {
					return createResolvesEventsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.generatesEvents) {
					return createGeneratesEventsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions) {
					return createOrchestratesFunctionsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions) {
					return createDecomposesFunctionsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits) {
					return createInvolvesOrganizationUnitsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices) {
					return createOrchestratesServicesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.decomposesServices) {
					return createDecomposesServicesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.involvesActors) {
					return createInvolvesActorsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls) {
					return createIsGuidedByControlsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.producesProducts) {
					return createProducesProductsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.delegates) {
					return createDelegatesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy) {
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
		attributesGroup.setText(ContentfwkMessages.ProcessPropertiesEditionPart_AttributesGroupLabel);
		GridData attributesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		attributesGroupData.horizontalSpan = 3;
		attributesGroup.setLayoutData(attributesGroupData);
		GridLayout attributesGroupLayout = new GridLayout();
		attributesGroupLayout.numColumns = 3;
		attributesGroup.setLayout(attributesGroupLayout);
		return attributesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.name, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ContentfwkViewsRepository.Process.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.name, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.iD, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}

		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.Process.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.iD, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.description, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ContentfwkViewsRepository.Process.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.description, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.category, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}

		});
		EditingUtils.setID(category, ContentfwkViewsRepository.Process.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.category, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.source, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}

		});
		EditingUtils.setID(source, ContentfwkViewsRepository.Process.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.source, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.owner, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}

		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.Process.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.owner, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardClassEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_StandardClassLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.standardClass, ContentfwkViewsRepository.SWT_KIND));
		standardClass = new EMFComboViewer(parent);
		standardClass.setContentProvider(new ArrayContentProvider());
		standardClass.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData standardClassData = new GridData(GridData.FILL_HORIZONTAL);
		standardClass.getCombo().setLayoutData(standardClassData);
		standardClass.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.standardClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStandardClass()));
			}

		});
		standardClass.setID(ContentfwkViewsRepository.Process.Attributes.standardClass);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.standardClass, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_StandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.standardCreationDate, ContentfwkViewsRepository.SWT_KIND));
		standardCreationDate = new Text(parent, SWT.BORDER);
		GridData standardCreationDateData = new GridData(GridData.FILL_HORIZONTAL);
		standardCreationDate.setLayoutData(standardCreationDateData);
		standardCreationDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
			}

		});
		standardCreationDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(standardCreationDate, ContentfwkViewsRepository.Process.Attributes.standardCreationDate);
		EditingUtils.setEEFtype(standardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.standardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLastStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_LastStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.SWT_KIND));
		lastStandardCreationDate = new Text(parent, SWT.BORDER);
		GridData lastStandardCreationDateData = new GridData(GridData.FILL_HORIZONTAL);
		lastStandardCreationDate.setLayoutData(lastStandardCreationDateData);
		lastStandardCreationDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
			}

		});
		lastStandardCreationDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(lastStandardCreationDate, ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate);
		EditingUtils.setEEFtype(lastStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNextStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_NextStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.SWT_KIND));
		nextStandardCreationDate = new Text(parent, SWT.BORDER);
		GridData nextStandardCreationDateData = new GridData(GridData.FILL_HORIZONTAL);
		nextStandardCreationDate.setLayoutData(nextStandardCreationDateData);
		nextStandardCreationDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
			}

		});
		nextStandardCreationDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(nextStandardCreationDate, ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate);
		EditingUtils.setEEFtype(nextStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRetireDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_RetireDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.retireDate, ContentfwkViewsRepository.SWT_KIND));
		retireDate = new Text(parent, SWT.BORDER);
		GridData retireDateData = new GridData(GridData.FILL_HORIZONTAL);
		retireDate.setLayoutData(retireDateData);
		retireDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
			}

		});
		retireDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
				}
			}

		});
		EditingUtils.setID(retireDate, ContentfwkViewsRepository.Process.Attributes.retireDate);
		EditingUtils.setEEFtype(retireDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.retireDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createProcessCritialityText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_ProcessCritialityLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.processCritiality, ContentfwkViewsRepository.SWT_KIND));
		processCritiality = new Text(parent, SWT.BORDER);
		GridData processCritialityData = new GridData(GridData.FILL_HORIZONTAL);
		processCritiality.setLayoutData(processCritialityData);
		processCritiality.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.processCritiality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, processCritiality.getText()));
			}

		});
		processCritiality.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.processCritiality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, processCritiality.getText()));
				}
			}

		});
		EditingUtils.setID(processCritiality, ContentfwkViewsRepository.Process.Attributes.processCritiality);
		EditingUtils.setEEFtype(processCritiality, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.processCritiality, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsAutomatedCheckbox(Composite parent) {
		isAutomated = new Button(parent, SWT.CHECK);
		isAutomated.setText(ContentfwkMessages.ProcessPropertiesEditionPart_IsAutomatedLabel);
		isAutomated.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.isAutomated, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isAutomated.getSelection())));
			}

		});
		GridData isAutomatedData = new GridData(GridData.FILL_HORIZONTAL);
		isAutomatedData.horizontalSpan = 2;
		isAutomated.setLayoutData(isAutomatedData);
		EditingUtils.setID(isAutomated, ContentfwkViewsRepository.Process.Attributes.isAutomated);
		EditingUtils.setEEFtype(isAutomated, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.isAutomated, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createProcessVolumetricsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_ProcessVolumetricsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.Attributes.processVolumetrics, ContentfwkViewsRepository.SWT_KIND));
		processVolumetrics = new Text(parent, SWT.BORDER);
		GridData processVolumetricsData = new GridData(GridData.FILL_HORIZONTAL);
		processVolumetrics.setLayoutData(processVolumetricsData);
		processVolumetrics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.processVolumetrics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, processVolumetrics.getText()));
			}

		});
		processVolumetrics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.Attributes.processVolumetrics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, processVolumetrics.getText()));
				}
			}

		});
		EditingUtils.setID(processVolumetrics, ContentfwkViewsRepository.Process.Attributes.processVolumetrics);
		EditingUtils.setEEFtype(processVolumetrics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.Attributes.processVolumetrics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(Composite parent) {
		Group relatedElementsGroup = new Group(parent, SWT.NONE);
		relatedElementsGroup.setText(ContentfwkMessages.ProcessPropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createDecomposesProcessFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ProcessPropertiesEditionPart_DecomposesProcessLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess, ContentfwkViewsRepository.SWT_KIND));
		decomposesProcess = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess, ContentfwkViewsRepository.SWT_KIND));
		decomposesProcess.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		decomposesProcess.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecomposesProcess()));
			}

		});
		GridData decomposesProcessData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesProcess.setLayoutData(decomposesProcessData);
		decomposesProcess.setID(ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.decomposesProcess, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPrecedesProcessesAdvancedReferencesTable(Composite parent) {
		this.precedesProcesses = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_PrecedesProcessesLabel, new ReferencesTableListener() {
			public void handleAdd() { addPrecedesProcesses(); }
			public void handleEdit(EObject element) { editPrecedesProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePrecedesProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPrecedesProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.precedesProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses, ContentfwkViewsRepository.SWT_KIND));
		this.precedesProcesses.createControls(parent);
		this.precedesProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData precedesProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		precedesProcessesData.horizontalSpan = 3;
		this.precedesProcesses.setLayoutData(precedesProcessesData);
		this.precedesProcesses.disableMove();
		precedesProcesses.setID(ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses);
		precedesProcesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPrecedesProcesses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(precedesProcesses.getInput(), precedesProcessesFilters, precedesProcessesBusinessFilters,
		"precedes Processes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				precedesProcesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePrecedesProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		precedesProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPrecedesProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.precedesProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		precedesProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void editPrecedesProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				precedesProcesses.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createFollowsProcessesAdvancedReferencesTable(Composite parent) {
		this.followsProcesses = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_FollowsProcessesLabel, new ReferencesTableListener() {
			public void handleAdd() { addFollowsProcesses(); }
			public void handleEdit(EObject element) { editFollowsProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFollowsProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFollowsProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.followsProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.followsProcesses, ContentfwkViewsRepository.SWT_KIND));
		this.followsProcesses.createControls(parent);
		this.followsProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.followsProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData followsProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		followsProcessesData.horizontalSpan = 3;
		this.followsProcesses.setLayoutData(followsProcessesData);
		this.followsProcesses.disableMove();
		followsProcesses.setID(ContentfwkViewsRepository.Process.RelatedElements.followsProcesses);
		followsProcesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addFollowsProcesses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(followsProcesses.getInput(), followsProcessesFilters, followsProcessesBusinessFilters,
		"follows Processes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.followsProcesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				followsProcesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveFollowsProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.followsProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		followsProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFollowsProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.followsProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		followsProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void editFollowsProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				followsProcesses.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createResolvesEventsAdvancedReferencesTable(Composite parent) {
		this.resolvesEvents = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_ResolvesEventsLabel, new ReferencesTableListener() {
			public void handleAdd() { addResolvesEvents(); }
			public void handleEdit(EObject element) { editResolvesEvents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResolvesEvents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResolvesEvents(element); }
			public void navigateTo(EObject element) { }
		});
		this.resolvesEvents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents, ContentfwkViewsRepository.SWT_KIND));
		this.resolvesEvents.createControls(parent);
		this.resolvesEvents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resolvesEventsData = new GridData(GridData.FILL_HORIZONTAL);
		resolvesEventsData.horizontalSpan = 3;
		this.resolvesEvents.setLayoutData(resolvesEventsData);
		this.resolvesEvents.disableMove();
		resolvesEvents.setID(ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resolvesEvents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResolvesEvents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.resolvesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.generatesEvents = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_GeneratesEventsLabel, new ReferencesTableListener() {
			public void handleAdd() { addGeneratesEvents(); }
			public void handleEdit(EObject element) { editGeneratesEvents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGeneratesEvents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGeneratesEvents(element); }
			public void navigateTo(EObject element) { }
		});
		this.generatesEvents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.generatesEvents, ContentfwkViewsRepository.SWT_KIND));
		this.generatesEvents.createControls(parent);
		this.generatesEvents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.generatesEvents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData generatesEventsData = new GridData(GridData.FILL_HORIZONTAL);
		generatesEventsData.horizontalSpan = 3;
		this.generatesEvents.setLayoutData(generatesEventsData);
		this.generatesEvents.disableMove();
		generatesEvents.setID(ContentfwkViewsRepository.Process.RelatedElements.generatesEvents);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.generatesEvents,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.generatesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		generatesEvents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGeneratesEvents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.generatesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createOrchestratesFunctionsAdvancedReferencesTable(Composite parent) {
		this.orchestratesFunctions = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_OrchestratesFunctionsLabel, new ReferencesTableListener() {
			public void handleAdd() { addOrchestratesFunctions(); }
			public void handleEdit(EObject element) { editOrchestratesFunctions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOrchestratesFunctions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOrchestratesFunctions(element); }
			public void navigateTo(EObject element) { }
		});
		this.orchestratesFunctions.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions, ContentfwkViewsRepository.SWT_KIND));
		this.orchestratesFunctions.createControls(parent);
		this.orchestratesFunctions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData orchestratesFunctionsData = new GridData(GridData.FILL_HORIZONTAL);
		orchestratesFunctionsData.horizontalSpan = 3;
		this.orchestratesFunctions.setLayoutData(orchestratesFunctionsData);
		this.orchestratesFunctions.disableMove();
		orchestratesFunctions.setID(ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions);
		orchestratesFunctions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOrchestratesFunctions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(orchestratesFunctions.getInput(), orchestratesFunctionsFilters, orchestratesFunctionsBusinessFilters,
		"orchestrates Functions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				orchestratesFunctions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOrchestratesFunctions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		orchestratesFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOrchestratesFunctions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.orchestratesFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		orchestratesFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void editOrchestratesFunctions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				orchestratesFunctions.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDecomposesFunctionsAdvancedReferencesTable(Composite parent) {
		this.decomposesFunctions = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_DecomposesFunctionsLabel, new ReferencesTableListener() {
			public void handleAdd() { addDecomposesFunctions(); }
			public void handleEdit(EObject element) { editDecomposesFunctions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDecomposesFunctions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDecomposesFunctions(element); }
			public void navigateTo(EObject element) { }
		});
		this.decomposesFunctions.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions, ContentfwkViewsRepository.SWT_KIND));
		this.decomposesFunctions.createControls(parent);
		this.decomposesFunctions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData decomposesFunctionsData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesFunctionsData.horizontalSpan = 3;
		this.decomposesFunctions.setLayoutData(decomposesFunctionsData);
		this.decomposesFunctions.disableMove();
		decomposesFunctions.setID(ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions);
		decomposesFunctions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDecomposesFunctions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(decomposesFunctions.getInput(), decomposesFunctionsFilters, decomposesFunctionsBusinessFilters,
		"decomposes Functions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				decomposesFunctions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDecomposesFunctions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		decomposesFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDecomposesFunctions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.decomposesFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		decomposesFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void editDecomposesFunctions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				decomposesFunctions.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createInvolvesOrganizationUnitsAdvancedReferencesTable(Composite parent) {
		this.involvesOrganizationUnits = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_InvolvesOrganizationUnitsLabel, new ReferencesTableListener() {
			public void handleAdd() { addInvolvesOrganizationUnits(); }
			public void handleEdit(EObject element) { editInvolvesOrganizationUnits(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInvolvesOrganizationUnits(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInvolvesOrganizationUnits(element); }
			public void navigateTo(EObject element) { }
		});
		this.involvesOrganizationUnits.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits, ContentfwkViewsRepository.SWT_KIND));
		this.involvesOrganizationUnits.createControls(parent);
		this.involvesOrganizationUnits.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData involvesOrganizationUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		involvesOrganizationUnitsData.horizontalSpan = 3;
		this.involvesOrganizationUnits.setLayoutData(involvesOrganizationUnitsData);
		this.involvesOrganizationUnits.disableMove();
		involvesOrganizationUnits.setID(ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits);
		involvesOrganizationUnits.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInvolvesOrganizationUnits() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(involvesOrganizationUnits.getInput(), involvesOrganizationUnitsFilters, involvesOrganizationUnitsBusinessFilters,
		"involves Organization Units", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				involvesOrganizationUnits.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInvolvesOrganizationUnits(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		involvesOrganizationUnits.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInvolvesOrganizationUnits(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.involvesOrganizationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		involvesOrganizationUnits.refresh();
	}

	/**
	 * 
	 */
	protected void editInvolvesOrganizationUnits(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				involvesOrganizationUnits.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOrchestratesServicesAdvancedReferencesTable(Composite parent) {
		this.orchestratesServices = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_OrchestratesServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { addOrchestratesServices(); }
			public void handleEdit(EObject element) { editOrchestratesServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOrchestratesServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOrchestratesServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.orchestratesServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices, ContentfwkViewsRepository.SWT_KIND));
		this.orchestratesServices.createControls(parent);
		this.orchestratesServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData orchestratesServicesData = new GridData(GridData.FILL_HORIZONTAL);
		orchestratesServicesData.horizontalSpan = 3;
		this.orchestratesServices.setLayoutData(orchestratesServicesData);
		this.orchestratesServices.disableMove();
		orchestratesServices.setID(ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices);
		orchestratesServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOrchestratesServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(orchestratesServices.getInput(), orchestratesServicesFilters, orchestratesServicesBusinessFilters,
		"orchestrates Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				orchestratesServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOrchestratesServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		orchestratesServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOrchestratesServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.orchestratesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		orchestratesServices.refresh();
	}

	/**
	 * 
	 */
	protected void editOrchestratesServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				orchestratesServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDecomposesServicesAdvancedReferencesTable(Composite parent) {
		this.decomposesServices = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_DecomposesServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { addDecomposesServices(); }
			public void handleEdit(EObject element) { editDecomposesServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDecomposesServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDecomposesServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.decomposesServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.decomposesServices, ContentfwkViewsRepository.SWT_KIND));
		this.decomposesServices.createControls(parent);
		this.decomposesServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.decomposesServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData decomposesServicesData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesServicesData.horizontalSpan = 3;
		this.decomposesServices.setLayoutData(decomposesServicesData);
		this.decomposesServices.disableMove();
		decomposesServices.setID(ContentfwkViewsRepository.Process.RelatedElements.decomposesServices);
		decomposesServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDecomposesServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(decomposesServices.getInput(), decomposesServicesFilters, decomposesServicesBusinessFilters,
		"decomposes Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.decomposesServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				decomposesServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDecomposesServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.decomposesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		decomposesServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDecomposesServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.decomposesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		decomposesServices.refresh();
	}

	/**
	 * 
	 */
	protected void editDecomposesServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				decomposesServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createInvolvesActorsAdvancedReferencesTable(Composite parent) {
		this.involvesActors = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_InvolvesActorsLabel, new ReferencesTableListener() {
			public void handleAdd() { addInvolvesActors(); }
			public void handleEdit(EObject element) { editInvolvesActors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInvolvesActors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInvolvesActors(element); }
			public void navigateTo(EObject element) { }
		});
		this.involvesActors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.involvesActors, ContentfwkViewsRepository.SWT_KIND));
		this.involvesActors.createControls(parent);
		this.involvesActors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.involvesActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData involvesActorsData = new GridData(GridData.FILL_HORIZONTAL);
		involvesActorsData.horizontalSpan = 3;
		this.involvesActors.setLayoutData(involvesActorsData);
		this.involvesActors.disableMove();
		involvesActors.setID(ContentfwkViewsRepository.Process.RelatedElements.involvesActors);
		involvesActors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInvolvesActors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(involvesActors.getInput(), involvesActorsFilters, involvesActorsBusinessFilters,
		"involves Actors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.involvesActors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				involvesActors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInvolvesActors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.involvesActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		involvesActors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInvolvesActors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.involvesActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		involvesActors.refresh();
	}

	/**
	 * 
	 */
	protected void editInvolvesActors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				involvesActors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsGuidedByControlsAdvancedReferencesTable(Composite parent) {
		this.isGuidedByControls = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_IsGuidedByControlsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsGuidedByControls(); }
			public void handleEdit(EObject element) { editIsGuidedByControls(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsGuidedByControls(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsGuidedByControls(element); }
			public void navigateTo(EObject element) { }
		});
		this.isGuidedByControls.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls, ContentfwkViewsRepository.SWT_KIND));
		this.isGuidedByControls.createControls(parent);
		this.isGuidedByControls.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isGuidedByControlsData = new GridData(GridData.FILL_HORIZONTAL);
		isGuidedByControlsData.horizontalSpan = 3;
		this.isGuidedByControls.setLayoutData(isGuidedByControlsData);
		this.isGuidedByControls.disableMove();
		isGuidedByControls.setID(ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls);
		isGuidedByControls.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsGuidedByControls() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isGuidedByControls.getInput(), isGuidedByControlsFilters, isGuidedByControlsBusinessFilters,
		"is Guided By Controls", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isGuidedByControls.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsGuidedByControls(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isGuidedByControls.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsGuidedByControls(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.isGuidedByControls, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isGuidedByControls.refresh();
	}

	/**
	 * 
	 */
	protected void editIsGuidedByControls(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isGuidedByControls.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createProducesProductsAdvancedReferencesTable(Composite parent) {
		this.producesProducts = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_ProducesProductsLabel, new ReferencesTableListener() {
			public void handleAdd() { addProducesProducts(); }
			public void handleEdit(EObject element) { editProducesProducts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProducesProducts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProducesProducts(element); }
			public void navigateTo(EObject element) { }
		});
		this.producesProducts.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.producesProducts, ContentfwkViewsRepository.SWT_KIND));
		this.producesProducts.createControls(parent);
		this.producesProducts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.producesProducts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData producesProductsData = new GridData(GridData.FILL_HORIZONTAL);
		producesProductsData.horizontalSpan = 3;
		this.producesProducts.setLayoutData(producesProductsData);
		this.producesProducts.disableMove();
		producesProducts.setID(ContentfwkViewsRepository.Process.RelatedElements.producesProducts);
		producesProducts.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProducesProducts() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(producesProducts.getInput(), producesProductsFilters, producesProductsBusinessFilters,
		"produces Products", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.producesProducts,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				producesProducts.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProducesProducts(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.producesProducts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		producesProducts.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProducesProducts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.producesProducts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		producesProducts.refresh();
	}

	/**
	 * 
	 */
	protected void editProducesProducts(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				producesProducts.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesAdvancedReferencesTable(Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.delegates, ContentfwkViewsRepository.SWT_KIND));
		this.delegates.createControls(parent);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.Process.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.ProcessPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.SWT_KIND));
		this.isDelegatedBy.createControls(parent);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProcessPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Process.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getStandardClass()
	 * 
	 */
	public Enumerator getStandardClass() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) standardClass.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initStandardClass(EEnum eenum, Enumerator current)
	 */
	public void initStandardClass(EEnum eenum, Enumerator current) {
		standardClass.setInput(eenum.getELiterals());
		standardClass.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setStandardClass(Enumerator newValue)
	 * 
	 */
	public void setStandardClass(Enumerator newValue) {
		standardClass.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getStandardCreationDate()
	 * 
	 */
	public String getStandardCreationDate() {
		return standardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setStandardCreationDate(String newValue)
	 * 
	 */
	public void setStandardCreationDate(String newValue) {
		if (newValue != null) {
			standardCreationDate.setText(newValue);
		} else {
			standardCreationDate.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getLastStandardCreationDate()
	 * 
	 */
	public String getLastStandardCreationDate() {
		return lastStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setLastStandardCreationDate(String newValue)
	 * 
	 */
	public void setLastStandardCreationDate(String newValue) {
		if (newValue != null) {
			lastStandardCreationDate.setText(newValue);
		} else {
			lastStandardCreationDate.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getNextStandardCreationDate()
	 * 
	 */
	public String getNextStandardCreationDate() {
		return nextStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setNextStandardCreationDate(String newValue)
	 * 
	 */
	public void setNextStandardCreationDate(String newValue) {
		if (newValue != null) {
			nextStandardCreationDate.setText(newValue);
		} else {
			nextStandardCreationDate.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getRetireDate()
	 * 
	 */
	public String getRetireDate() {
		return retireDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setRetireDate(String newValue)
	 * 
	 */
	public void setRetireDate(String newValue) {
		if (newValue != null) {
			retireDate.setText(newValue);
		} else {
			retireDate.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getProcessCritiality()
	 * 
	 */
	public String getProcessCritiality() {
		return processCritiality.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setProcessCritiality(String newValue)
	 * 
	 */
	public void setProcessCritiality(String newValue) {
		if (newValue != null) {
			processCritiality.setText(newValue);
		} else {
			processCritiality.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getIsAutomated()
	 * 
	 */
	public Boolean getIsAutomated() {
		return Boolean.valueOf(isAutomated.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setIsAutomated(Boolean newValue)
	 * 
	 */
	public void setIsAutomated(Boolean newValue) {
		if (newValue != null) {
			isAutomated.setSelection(newValue.booleanValue());
		} else {
			isAutomated.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getProcessVolumetrics()
	 * 
	 */
	public String getProcessVolumetrics() {
		return processVolumetrics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setProcessVolumetrics(String newValue)
	 * 
	 */
	public void setProcessVolumetrics(String newValue) {
		if (newValue != null) {
			processVolumetrics.setText(newValue);
		} else {
			processVolumetrics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#getDecomposesProcess()
	 * 
	 */
	public EObject getDecomposesProcess() {
		if (decomposesProcess.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decomposesProcess.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initDecomposesProcess(EObjectFlatComboSettings)
	 */
	public void initDecomposesProcess(EObjectFlatComboSettings settings) {
		decomposesProcess.setInput(settings);
		if (current != null) {
			decomposesProcess.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setDecomposesProcess(EObject newValue)
	 * 
	 */
	public void setDecomposesProcess(EObject newValue) {
		if (newValue != null) {
			decomposesProcess.setSelection(new StructuredSelection(newValue));
		} else {
			decomposesProcess.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#setDecomposesProcessButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecomposesProcessButtonMode(ButtonsModeEnum newValue) {
		decomposesProcess.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterDecomposesProcess(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesProcess(ViewerFilter filter) {
		decomposesProcess.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterDecomposesProcess(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesProcess(ViewerFilter filter) {
		decomposesProcess.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initPrecedesProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPrecedesProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		precedesProcesses.setContentProvider(contentProvider);
		precedesProcesses.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updatePrecedesProcesses()
	 * 
	 */
	public void updatePrecedesProcesses() {
	precedesProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterPrecedesProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPrecedesProcesses(ViewerFilter filter) {
		precedesProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterPrecedesProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPrecedesProcesses(ViewerFilter filter) {
		precedesProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInPrecedesProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPrecedesProcessesTable(EObject element) {
		return ((ReferencesTableSettings)precedesProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initFollowsProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFollowsProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		followsProcesses.setContentProvider(contentProvider);
		followsProcesses.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateFollowsProcesses()
	 * 
	 */
	public void updateFollowsProcesses() {
	followsProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterFollowsProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFollowsProcesses(ViewerFilter filter) {
		followsProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterFollowsProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFollowsProcesses(ViewerFilter filter) {
		followsProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInFollowsProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInFollowsProcessesTable(EObject element) {
		return ((ReferencesTableSettings)followsProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initResolvesEvents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateResolvesEvents()
	 * 
	 */
	public void updateResolvesEvents() {
	resolvesEvents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterResolvesEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResolvesEvents(ViewerFilter filter) {
		resolvesEventsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterResolvesEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResolvesEvents(ViewerFilter filter) {
		resolvesEventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInResolvesEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInResolvesEventsTable(EObject element) {
		return ((ReferencesTableSettings)resolvesEvents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initGeneratesEvents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateGeneratesEvents()
	 * 
	 */
	public void updateGeneratesEvents() {
	generatesEvents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterGeneratesEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGeneratesEvents(ViewerFilter filter) {
		generatesEventsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterGeneratesEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGeneratesEvents(ViewerFilter filter) {
		generatesEventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInGeneratesEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGeneratesEventsTable(EObject element) {
		return ((ReferencesTableSettings)generatesEvents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initOrchestratesFunctions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOrchestratesFunctions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		orchestratesFunctions.setContentProvider(contentProvider);
		orchestratesFunctions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateOrchestratesFunctions()
	 * 
	 */
	public void updateOrchestratesFunctions() {
	orchestratesFunctions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterOrchestratesFunctions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrchestratesFunctions(ViewerFilter filter) {
		orchestratesFunctionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterOrchestratesFunctions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrchestratesFunctions(ViewerFilter filter) {
		orchestratesFunctionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInOrchestratesFunctionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOrchestratesFunctionsTable(EObject element) {
		return ((ReferencesTableSettings)orchestratesFunctions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initDecomposesFunctions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDecomposesFunctions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		decomposesFunctions.setContentProvider(contentProvider);
		decomposesFunctions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateDecomposesFunctions()
	 * 
	 */
	public void updateDecomposesFunctions() {
	decomposesFunctions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterDecomposesFunctions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesFunctions(ViewerFilter filter) {
		decomposesFunctionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterDecomposesFunctions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesFunctions(ViewerFilter filter) {
		decomposesFunctionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInDecomposesFunctionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDecomposesFunctionsTable(EObject element) {
		return ((ReferencesTableSettings)decomposesFunctions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initInvolvesOrganizationUnits(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInvolvesOrganizationUnits(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		involvesOrganizationUnits.setContentProvider(contentProvider);
		involvesOrganizationUnits.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateInvolvesOrganizationUnits()
	 * 
	 */
	public void updateInvolvesOrganizationUnits() {
	involvesOrganizationUnits.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterInvolvesOrganizationUnits(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInvolvesOrganizationUnits(ViewerFilter filter) {
		involvesOrganizationUnitsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterInvolvesOrganizationUnits(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInvolvesOrganizationUnits(ViewerFilter filter) {
		involvesOrganizationUnitsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInInvolvesOrganizationUnitsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInvolvesOrganizationUnitsTable(EObject element) {
		return ((ReferencesTableSettings)involvesOrganizationUnits.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initOrchestratesServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOrchestratesServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		orchestratesServices.setContentProvider(contentProvider);
		orchestratesServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateOrchestratesServices()
	 * 
	 */
	public void updateOrchestratesServices() {
	orchestratesServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterOrchestratesServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrchestratesServices(ViewerFilter filter) {
		orchestratesServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterOrchestratesServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrchestratesServices(ViewerFilter filter) {
		orchestratesServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInOrchestratesServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInOrchestratesServicesTable(EObject element) {
		return ((ReferencesTableSettings)orchestratesServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initDecomposesServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDecomposesServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		decomposesServices.setContentProvider(contentProvider);
		decomposesServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateDecomposesServices()
	 * 
	 */
	public void updateDecomposesServices() {
	decomposesServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterDecomposesServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesServices(ViewerFilter filter) {
		decomposesServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterDecomposesServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesServices(ViewerFilter filter) {
		decomposesServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInDecomposesServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDecomposesServicesTable(EObject element) {
		return ((ReferencesTableSettings)decomposesServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initInvolvesActors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInvolvesActors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		involvesActors.setContentProvider(contentProvider);
		involvesActors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateInvolvesActors()
	 * 
	 */
	public void updateInvolvesActors() {
	involvesActors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterInvolvesActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInvolvesActors(ViewerFilter filter) {
		involvesActorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterInvolvesActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInvolvesActors(ViewerFilter filter) {
		involvesActorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInInvolvesActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInvolvesActorsTable(EObject element) {
		return ((ReferencesTableSettings)involvesActors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initIsGuidedByControls(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsGuidedByControls(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isGuidedByControls.setContentProvider(contentProvider);
		isGuidedByControls.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateIsGuidedByControls()
	 * 
	 */
	public void updateIsGuidedByControls() {
	isGuidedByControls.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterIsGuidedByControls(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsGuidedByControls(ViewerFilter filter) {
		isGuidedByControlsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterIsGuidedByControls(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsGuidedByControls(ViewerFilter filter) {
		isGuidedByControlsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInIsGuidedByControlsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsGuidedByControlsTable(EObject element) {
		return ((ReferencesTableSettings)isGuidedByControls.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initProducesProducts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProducesProducts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		producesProducts.setContentProvider(contentProvider);
		producesProducts.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateProducesProducts()
	 * 
	 */
	public void updateProducesProducts() {
	producesProducts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterProducesProducts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProducesProducts(ViewerFilter filter) {
		producesProductsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterProducesProducts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProducesProducts(ViewerFilter filter) {
		producesProductsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInProducesProductsTable(EObject element)
	 * 
	 */
	public boolean isContainedInProducesProductsTable(EObject element) {
		return ((ReferencesTableSettings)producesProducts.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ProcessPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.Process_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
