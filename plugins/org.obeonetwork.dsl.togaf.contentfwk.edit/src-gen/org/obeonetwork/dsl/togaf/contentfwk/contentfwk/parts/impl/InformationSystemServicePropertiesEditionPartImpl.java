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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class InformationSystemServicePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InformationSystemServicePropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer standardClass;
	protected Text standardCreationDate;
	protected Text lastStandardCreationDate;
	protected Text nextStandardCreationDate;
	protected Text retireDate;
	protected ReferencesTable decomposesServices;
	protected List<ViewerFilter> decomposesServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> decomposesServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable consumesServices;
	protected List<ViewerFilter> consumesServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> consumesServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isProvidedToActors;
	protected List<ViewerFilter> isProvidedToActorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isProvidedToActorsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isOwnedAndGovernedByOrganizationUnits;
	protected List<ViewerFilter> isOwnedAndGovernedByOrganizationUnitsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isOwnedAndGovernedByOrganizationUnitsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable providesGovernedInterfaceToAccessFunctions;
	protected List<ViewerFilter> providesGovernedInterfaceToAccessFunctionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> providesGovernedInterfaceToAccessFunctionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable supportsProcesses;
	protected List<ViewerFilter> supportsProcessesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> supportsProcessesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isRealizedByProcesses;
	protected List<ViewerFilter> isRealizedByProcessesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isRealizedByProcessesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resolvesEvents;
	protected List<ViewerFilter> resolvesEventsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resolvesEventsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable providesEntities;
	protected List<ViewerFilter> providesEntitiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> providesEntitiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable consumesEntities;
	protected List<ViewerFilter> consumesEntitiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> consumesEntitiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isImplementedOnLogicalTechnologyComponents;
	protected List<ViewerFilter> isImplementedOnLogicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isImplementedOnLogicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isRealizedThroughLogicalApplicationComponent;
	protected List<ViewerFilter> isRealizedThroughLogicalApplicationComponentBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isRealizedThroughLogicalApplicationComponentFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isGovernedAndMeasuredByContracts;
	protected List<ViewerFilter> isGovernedAndMeasuredByContractsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isGovernedAndMeasuredByContractsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isTrackedAgainstMeasures;
	protected List<ViewerFilter> isTrackedAgainstMeasuresBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTrackedAgainstMeasuresFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable meetsQualities;
	protected List<ViewerFilter> meetsQualitiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> meetsQualitiesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InformationSystemServicePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence informationSystemServiceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = informationSystemServiceStep.addStep(ContentfwkViewsRepository.InformationSystemService.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.InformationSystemService.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass);
		attributesStep.addStep(ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate);
		
		CompositionStep relatedElementsStep = informationSystemServiceStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures);
		relatedElementsStep.addStep(ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities);
		
		
		composer = new PartComposer(informationSystemServiceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.InformationSystemService.Attributes.class) {
					return createAttributesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.Attributes.name) {
					return createNameText(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass) {
					return createStandardClassEMFComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate) {
					return createStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate) {
					return createLastStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate) {
					return createNextStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate) {
					return createRetireDateText(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.class) {
					return createRelatedElementsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices) {
					return createDecomposesServicesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices) {
					return createConsumesServicesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors) {
					return createIsProvidedToActorsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits) {
					return createIsOwnedAndGovernedByOrganizationUnitsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions) {
					return createProvidesGovernedInterfaceToAccessFunctionsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses) {
					return createSupportsProcessesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses) {
					return createIsRealizedByProcessesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents) {
					return createResolvesEventsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities) {
					return createProvidesEntitiesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities) {
					return createConsumesEntitiesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents) {
					return createIsImplementedOnLogicalTechnologyComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent) {
					return createIsRealizedThroughLogicalApplicationComponentAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts) {
					return createIsGovernedAndMeasuredByContractsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures) {
					return createIsTrackedAgainstMeasuresAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities) {
					return createMeetsQualitiesAdvancedReferencesTable(parent);
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
		attributesGroup.setText(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_AttributesGroupLabel);
		GridData attributesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		attributesGroupData.horizontalSpan = 3;
		attributesGroup.setLayoutData(attributesGroupData);
		GridLayout attributesGroupLayout = new GridLayout();
		attributesGroupLayout.numColumns = 3;
		attributesGroup.setLayout(attributesGroupLayout);
		return attributesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.InformationSystemServicePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.InformationSystemService.Attributes.name, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ContentfwkViewsRepository.InformationSystemService.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.Attributes.name, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardClassEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.InformationSystemServicePropertiesEditionPart_StandardClassLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStandardClass()));
			}

		});
		standardClass.setID(ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.Attributes.standardClass, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.InformationSystemServicePropertiesEditionPart_StandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(standardCreationDate, ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate);
		EditingUtils.setEEFtype(standardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.Attributes.standardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLastStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.InformationSystemServicePropertiesEditionPart_LastStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(lastStandardCreationDate, ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate);
		EditingUtils.setEEFtype(lastStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNextStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.InformationSystemServicePropertiesEditionPart_NextStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(nextStandardCreationDate, ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate);
		EditingUtils.setEEFtype(nextStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRetireDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.InformationSystemServicePropertiesEditionPart_RetireDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
				}
			}

		});
		EditingUtils.setID(retireDate, ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate);
		EditingUtils.setEEFtype(retireDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.Attributes.retireDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(Composite parent) {
		Group relatedElementsGroup = new Group(parent, SWT.NONE);
		relatedElementsGroup.setText(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_RelatedElementsGroupLabel);
		GridData relatedElementsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		relatedElementsGroupData.horizontalSpan = 3;
		relatedElementsGroup.setLayoutData(relatedElementsGroupData);
		GridLayout relatedElementsGroupLayout = new GridLayout();
		relatedElementsGroupLayout.numColumns = 3;
		relatedElementsGroup.setLayout(relatedElementsGroupLayout);
		return relatedElementsGroup;
	}

	/**
	 * 
	 */
	protected Composite createDecomposesServicesAdvancedReferencesTable(Composite parent) {
		this.decomposesServices = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_DecomposesServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { addDecomposesServices(); }
			public void handleEdit(EObject element) { editDecomposesServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDecomposesServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDecomposesServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.decomposesServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices, ContentfwkViewsRepository.SWT_KIND));
		this.decomposesServices.createControls(parent);
		this.decomposesServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData decomposesServicesData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesServicesData.horizontalSpan = 3;
		this.decomposesServices.setLayoutData(decomposesServicesData);
		this.decomposesServices.disableMove();
		decomposesServices.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		decomposesServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDecomposesServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.decomposesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createConsumesServicesAdvancedReferencesTable(Composite parent) {
		this.consumesServices = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_ConsumesServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { addConsumesServices(); }
			public void handleEdit(EObject element) { editConsumesServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveConsumesServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromConsumesServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.consumesServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices, ContentfwkViewsRepository.SWT_KIND));
		this.consumesServices.createControls(parent);
		this.consumesServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData consumesServicesData = new GridData(GridData.FILL_HORIZONTAL);
		consumesServicesData.horizontalSpan = 3;
		this.consumesServices.setLayoutData(consumesServicesData);
		this.consumesServices.disableMove();
		consumesServices.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		consumesServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromConsumesServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsProvidedToActorsAdvancedReferencesTable(Composite parent) {
		this.isProvidedToActors = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_IsProvidedToActorsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsProvidedToActors(); }
			public void handleEdit(EObject element) { editIsProvidedToActors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsProvidedToActors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsProvidedToActors(element); }
			public void navigateTo(EObject element) { }
		});
		this.isProvidedToActors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors, ContentfwkViewsRepository.SWT_KIND));
		this.isProvidedToActors.createControls(parent);
		this.isProvidedToActors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isProvidedToActorsData = new GridData(GridData.FILL_HORIZONTAL);
		isProvidedToActorsData.horizontalSpan = 3;
		this.isProvidedToActors.setLayoutData(isProvidedToActorsData);
		this.isProvidedToActors.disableMove();
		isProvidedToActors.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors);
		isProvidedToActors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsProvidedToActors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isProvidedToActors.getInput(), isProvidedToActorsFilters, isProvidedToActorsBusinessFilters,
		"is Provided To Actors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isProvidedToActors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsProvidedToActors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isProvidedToActors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsProvidedToActors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isProvidedToActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isProvidedToActors.refresh();
	}

	/**
	 * 
	 */
	protected void editIsProvidedToActors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isProvidedToActors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsOwnedAndGovernedByOrganizationUnitsAdvancedReferencesTable(Composite parent) {
		this.isOwnedAndGovernedByOrganizationUnits = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_IsOwnedAndGovernedByOrganizationUnitsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsOwnedAndGovernedByOrganizationUnits(); }
			public void handleEdit(EObject element) { editIsOwnedAndGovernedByOrganizationUnits(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsOwnedAndGovernedByOrganizationUnits(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsOwnedAndGovernedByOrganizationUnits(element); }
			public void navigateTo(EObject element) { }
		});
		this.isOwnedAndGovernedByOrganizationUnits.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits, ContentfwkViewsRepository.SWT_KIND));
		this.isOwnedAndGovernedByOrganizationUnits.createControls(parent);
		this.isOwnedAndGovernedByOrganizationUnits.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isOwnedAndGovernedByOrganizationUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		isOwnedAndGovernedByOrganizationUnitsData.horizontalSpan = 3;
		this.isOwnedAndGovernedByOrganizationUnits.setLayoutData(isOwnedAndGovernedByOrganizationUnitsData);
		this.isOwnedAndGovernedByOrganizationUnits.disableMove();
		isOwnedAndGovernedByOrganizationUnits.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits);
		isOwnedAndGovernedByOrganizationUnits.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsOwnedAndGovernedByOrganizationUnits() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isOwnedAndGovernedByOrganizationUnits.getInput(), isOwnedAndGovernedByOrganizationUnitsFilters, isOwnedAndGovernedByOrganizationUnitsBusinessFilters,
		"is Owned And Governed By Organization Units", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isOwnedAndGovernedByOrganizationUnits.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsOwnedAndGovernedByOrganizationUnits(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isOwnedAndGovernedByOrganizationUnits.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsOwnedAndGovernedByOrganizationUnits(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isOwnedAndGovernedByOrganizationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isOwnedAndGovernedByOrganizationUnits.refresh();
	}

	/**
	 * 
	 */
	protected void editIsOwnedAndGovernedByOrganizationUnits(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isOwnedAndGovernedByOrganizationUnits.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createProvidesGovernedInterfaceToAccessFunctionsAdvancedReferencesTable(Composite parent) {
		this.providesGovernedInterfaceToAccessFunctions = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_ProvidesGovernedInterfaceToAccessFunctionsLabel, new ReferencesTableListener() {
			public void handleAdd() { addProvidesGovernedInterfaceToAccessFunctions(); }
			public void handleEdit(EObject element) { editProvidesGovernedInterfaceToAccessFunctions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProvidesGovernedInterfaceToAccessFunctions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProvidesGovernedInterfaceToAccessFunctions(element); }
			public void navigateTo(EObject element) { }
		});
		this.providesGovernedInterfaceToAccessFunctions.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions, ContentfwkViewsRepository.SWT_KIND));
		this.providesGovernedInterfaceToAccessFunctions.createControls(parent);
		this.providesGovernedInterfaceToAccessFunctions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData providesGovernedInterfaceToAccessFunctionsData = new GridData(GridData.FILL_HORIZONTAL);
		providesGovernedInterfaceToAccessFunctionsData.horizontalSpan = 3;
		this.providesGovernedInterfaceToAccessFunctions.setLayoutData(providesGovernedInterfaceToAccessFunctionsData);
		this.providesGovernedInterfaceToAccessFunctions.disableMove();
		providesGovernedInterfaceToAccessFunctions.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions);
		providesGovernedInterfaceToAccessFunctions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProvidesGovernedInterfaceToAccessFunctions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(providesGovernedInterfaceToAccessFunctions.getInput(), providesGovernedInterfaceToAccessFunctionsFilters, providesGovernedInterfaceToAccessFunctionsBusinessFilters,
		"provides Governed Interface To Access Functions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				providesGovernedInterfaceToAccessFunctions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProvidesGovernedInterfaceToAccessFunctions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		providesGovernedInterfaceToAccessFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProvidesGovernedInterfaceToAccessFunctions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesGovernedInterfaceToAccessFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		providesGovernedInterfaceToAccessFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void editProvidesGovernedInterfaceToAccessFunctions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				providesGovernedInterfaceToAccessFunctions.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSupportsProcessesAdvancedReferencesTable(Composite parent) {
		this.supportsProcesses = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_SupportsProcessesLabel, new ReferencesTableListener() {
			public void handleAdd() { addSupportsProcesses(); }
			public void handleEdit(EObject element) { editSupportsProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSupportsProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSupportsProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.supportsProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses, ContentfwkViewsRepository.SWT_KIND));
		this.supportsProcesses.createControls(parent);
		this.supportsProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData supportsProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		supportsProcessesData.horizontalSpan = 3;
		this.supportsProcesses.setLayoutData(supportsProcessesData);
		this.supportsProcesses.disableMove();
		supportsProcesses.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses);
		supportsProcesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSupportsProcesses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(supportsProcesses.getInput(), supportsProcessesFilters, supportsProcessesBusinessFilters,
		"supports Processes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				supportsProcesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSupportsProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		supportsProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSupportsProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.supportsProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		supportsProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void editSupportsProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				supportsProcesses.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsRealizedByProcessesAdvancedReferencesTable(Composite parent) {
		this.isRealizedByProcesses = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_IsRealizedByProcessesLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsRealizedByProcesses(); }
			public void handleEdit(EObject element) { editIsRealizedByProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsRealizedByProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsRealizedByProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.isRealizedByProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses, ContentfwkViewsRepository.SWT_KIND));
		this.isRealizedByProcesses.createControls(parent);
		this.isRealizedByProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isRealizedByProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		isRealizedByProcessesData.horizontalSpan = 3;
		this.isRealizedByProcesses.setLayoutData(isRealizedByProcessesData);
		this.isRealizedByProcesses.disableMove();
		isRealizedByProcesses.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses);
		isRealizedByProcesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsRealizedByProcesses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isRealizedByProcesses.getInput(), isRealizedByProcessesFilters, isRealizedByProcessesBusinessFilters,
		"is Realized By Processes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isRealizedByProcesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsRealizedByProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isRealizedByProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsRealizedByProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedByProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isRealizedByProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void editIsRealizedByProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isRealizedByProcesses.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createResolvesEventsAdvancedReferencesTable(Composite parent) {
		this.resolvesEvents = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_ResolvesEventsLabel, new ReferencesTableListener() {
			public void handleAdd() { addResolvesEvents(); }
			public void handleEdit(EObject element) { editResolvesEvents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResolvesEvents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResolvesEvents(element); }
			public void navigateTo(EObject element) { }
		});
		this.resolvesEvents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents, ContentfwkViewsRepository.SWT_KIND));
		this.resolvesEvents.createControls(parent);
		this.resolvesEvents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resolvesEventsData = new GridData(GridData.FILL_HORIZONTAL);
		resolvesEventsData.horizontalSpan = 3;
		this.resolvesEvents.setLayoutData(resolvesEventsData);
		this.resolvesEvents.disableMove();
		resolvesEvents.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resolvesEvents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResolvesEvents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.resolvesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createProvidesEntitiesAdvancedReferencesTable(Composite parent) {
		this.providesEntities = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_ProvidesEntitiesLabel, new ReferencesTableListener() {
			public void handleAdd() { addProvidesEntities(); }
			public void handleEdit(EObject element) { editProvidesEntities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProvidesEntities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProvidesEntities(element); }
			public void navigateTo(EObject element) { }
		});
		this.providesEntities.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities, ContentfwkViewsRepository.SWT_KIND));
		this.providesEntities.createControls(parent);
		this.providesEntities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData providesEntitiesData = new GridData(GridData.FILL_HORIZONTAL);
		providesEntitiesData.horizontalSpan = 3;
		this.providesEntities.setLayoutData(providesEntitiesData);
		this.providesEntities.disableMove();
		providesEntities.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities);
		providesEntities.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProvidesEntities() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(providesEntities.getInput(), providesEntitiesFilters, providesEntitiesBusinessFilters,
		"provides Entities", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				providesEntities.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProvidesEntities(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		providesEntities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProvidesEntities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.providesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		providesEntities.refresh();
	}

	/**
	 * 
	 */
	protected void editProvidesEntities(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				providesEntities.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createConsumesEntitiesAdvancedReferencesTable(Composite parent) {
		this.consumesEntities = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_ConsumesEntitiesLabel, new ReferencesTableListener() {
			public void handleAdd() { addConsumesEntities(); }
			public void handleEdit(EObject element) { editConsumesEntities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveConsumesEntities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromConsumesEntities(element); }
			public void navigateTo(EObject element) { }
		});
		this.consumesEntities.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities, ContentfwkViewsRepository.SWT_KIND));
		this.consumesEntities.createControls(parent);
		this.consumesEntities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData consumesEntitiesData = new GridData(GridData.FILL_HORIZONTAL);
		consumesEntitiesData.horizontalSpan = 3;
		this.consumesEntities.setLayoutData(consumesEntitiesData);
		this.consumesEntities.disableMove();
		consumesEntities.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		consumesEntities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromConsumesEntities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.consumesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsImplementedOnLogicalTechnologyComponentsAdvancedReferencesTable(Composite parent) {
		this.isImplementedOnLogicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_IsImplementedOnLogicalTechnologyComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsImplementedOnLogicalTechnologyComponents(); }
			public void handleEdit(EObject element) { editIsImplementedOnLogicalTechnologyComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsImplementedOnLogicalTechnologyComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsImplementedOnLogicalTechnologyComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.isImplementedOnLogicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents, ContentfwkViewsRepository.SWT_KIND));
		this.isImplementedOnLogicalTechnologyComponents.createControls(parent);
		this.isImplementedOnLogicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isImplementedOnLogicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		isImplementedOnLogicalTechnologyComponentsData.horizontalSpan = 3;
		this.isImplementedOnLogicalTechnologyComponents.setLayoutData(isImplementedOnLogicalTechnologyComponentsData);
		this.isImplementedOnLogicalTechnologyComponents.disableMove();
		isImplementedOnLogicalTechnologyComponents.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents);
		isImplementedOnLogicalTechnologyComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsImplementedOnLogicalTechnologyComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isImplementedOnLogicalTechnologyComponents.getInput(), isImplementedOnLogicalTechnologyComponentsFilters, isImplementedOnLogicalTechnologyComponentsBusinessFilters,
		"is Implemented On Logical Technology Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isImplementedOnLogicalTechnologyComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsImplementedOnLogicalTechnologyComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isImplementedOnLogicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsImplementedOnLogicalTechnologyComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isImplementedOnLogicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isImplementedOnLogicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editIsImplementedOnLogicalTechnologyComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isImplementedOnLogicalTechnologyComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsRealizedThroughLogicalApplicationComponentAdvancedReferencesTable(Composite parent) {
		this.isRealizedThroughLogicalApplicationComponent = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_IsRealizedThroughLogicalApplicationComponentLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsRealizedThroughLogicalApplicationComponent(); }
			public void handleEdit(EObject element) { editIsRealizedThroughLogicalApplicationComponent(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsRealizedThroughLogicalApplicationComponent(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsRealizedThroughLogicalApplicationComponent(element); }
			public void navigateTo(EObject element) { }
		});
		this.isRealizedThroughLogicalApplicationComponent.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent, ContentfwkViewsRepository.SWT_KIND));
		this.isRealizedThroughLogicalApplicationComponent.createControls(parent);
		this.isRealizedThroughLogicalApplicationComponent.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isRealizedThroughLogicalApplicationComponentData = new GridData(GridData.FILL_HORIZONTAL);
		isRealizedThroughLogicalApplicationComponentData.horizontalSpan = 3;
		this.isRealizedThroughLogicalApplicationComponent.setLayoutData(isRealizedThroughLogicalApplicationComponentData);
		this.isRealizedThroughLogicalApplicationComponent.disableMove();
		isRealizedThroughLogicalApplicationComponent.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent);
		isRealizedThroughLogicalApplicationComponent.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsRealizedThroughLogicalApplicationComponent() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isRealizedThroughLogicalApplicationComponent.getInput(), isRealizedThroughLogicalApplicationComponentFilters, isRealizedThroughLogicalApplicationComponentBusinessFilters,
		"is Realized Through Logical Application Component", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isRealizedThroughLogicalApplicationComponent.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsRealizedThroughLogicalApplicationComponent(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isRealizedThroughLogicalApplicationComponent.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsRealizedThroughLogicalApplicationComponent(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isRealizedThroughLogicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isRealizedThroughLogicalApplicationComponent.refresh();
	}

	/**
	 * 
	 */
	protected void editIsRealizedThroughLogicalApplicationComponent(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isRealizedThroughLogicalApplicationComponent.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsGovernedAndMeasuredByContractsAdvancedReferencesTable(Composite parent) {
		this.isGovernedAndMeasuredByContracts = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_IsGovernedAndMeasuredByContractsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsGovernedAndMeasuredByContracts(); }
			public void handleEdit(EObject element) { editIsGovernedAndMeasuredByContracts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsGovernedAndMeasuredByContracts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsGovernedAndMeasuredByContracts(element); }
			public void navigateTo(EObject element) { }
		});
		this.isGovernedAndMeasuredByContracts.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts, ContentfwkViewsRepository.SWT_KIND));
		this.isGovernedAndMeasuredByContracts.createControls(parent);
		this.isGovernedAndMeasuredByContracts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isGovernedAndMeasuredByContractsData = new GridData(GridData.FILL_HORIZONTAL);
		isGovernedAndMeasuredByContractsData.horizontalSpan = 3;
		this.isGovernedAndMeasuredByContracts.setLayoutData(isGovernedAndMeasuredByContractsData);
		this.isGovernedAndMeasuredByContracts.disableMove();
		isGovernedAndMeasuredByContracts.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts);
		isGovernedAndMeasuredByContracts.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsGovernedAndMeasuredByContracts() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isGovernedAndMeasuredByContracts.getInput(), isGovernedAndMeasuredByContractsFilters, isGovernedAndMeasuredByContractsBusinessFilters,
		"is Governed And Measured By Contracts", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isGovernedAndMeasuredByContracts.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsGovernedAndMeasuredByContracts(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isGovernedAndMeasuredByContracts.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsGovernedAndMeasuredByContracts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isGovernedAndMeasuredByContracts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isGovernedAndMeasuredByContracts.refresh();
	}

	/**
	 * 
	 */
	protected void editIsGovernedAndMeasuredByContracts(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isGovernedAndMeasuredByContracts.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsTrackedAgainstMeasuresAdvancedReferencesTable(Composite parent) {
		this.isTrackedAgainstMeasures = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_IsTrackedAgainstMeasuresLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsTrackedAgainstMeasures(); }
			public void handleEdit(EObject element) { editIsTrackedAgainstMeasures(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsTrackedAgainstMeasures(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsTrackedAgainstMeasures(element); }
			public void navigateTo(EObject element) { }
		});
		this.isTrackedAgainstMeasures.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures, ContentfwkViewsRepository.SWT_KIND));
		this.isTrackedAgainstMeasures.createControls(parent);
		this.isTrackedAgainstMeasures.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTrackedAgainstMeasuresData = new GridData(GridData.FILL_HORIZONTAL);
		isTrackedAgainstMeasuresData.horizontalSpan = 3;
		this.isTrackedAgainstMeasures.setLayoutData(isTrackedAgainstMeasuresData);
		this.isTrackedAgainstMeasures.disableMove();
		isTrackedAgainstMeasures.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures);
		isTrackedAgainstMeasures.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsTrackedAgainstMeasures() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isTrackedAgainstMeasures.getInput(), isTrackedAgainstMeasuresFilters, isTrackedAgainstMeasuresBusinessFilters,
		"is Tracked Against Measures", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isTrackedAgainstMeasures.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsTrackedAgainstMeasures(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isTrackedAgainstMeasures.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsTrackedAgainstMeasures(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.isTrackedAgainstMeasures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isTrackedAgainstMeasures.refresh();
	}

	/**
	 * 
	 */
	protected void editIsTrackedAgainstMeasures(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isTrackedAgainstMeasures.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMeetsQualitiesAdvancedReferencesTable(Composite parent) {
		this.meetsQualities = new ReferencesTable(ContentfwkMessages.InformationSystemServicePropertiesEditionPart_MeetsQualitiesLabel, new ReferencesTableListener() {
			public void handleAdd() { addMeetsQualities(); }
			public void handleEdit(EObject element) { editMeetsQualities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMeetsQualities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMeetsQualities(element); }
			public void navigateTo(EObject element) { }
		});
		this.meetsQualities.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities, ContentfwkViewsRepository.SWT_KIND));
		this.meetsQualities.createControls(parent);
		this.meetsQualities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData meetsQualitiesData = new GridData(GridData.FILL_HORIZONTAL);
		meetsQualitiesData.horizontalSpan = 3;
		this.meetsQualities.setLayoutData(meetsQualitiesData);
		this.meetsQualities.disableMove();
		meetsQualities.setID(ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities);
		meetsQualities.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addMeetsQualities() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(meetsQualities.getInput(), meetsQualitiesFilters, meetsQualitiesBusinessFilters,
		"meets Qualities", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				meetsQualities.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMeetsQualities(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		meetsQualities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMeetsQualities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InformationSystemServicePropertiesEditionPartImpl.this, ContentfwkViewsRepository.InformationSystemService.RelatedElements.meetsQualities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		meetsQualities.refresh();
	}

	/**
	 * 
	 */
	protected void editMeetsQualities(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				meetsQualities.refresh();
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#getStandardClass()
	 * 
	 */
	public Enumerator getStandardClass() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) standardClass.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initStandardClass(EEnum eenum, Enumerator current)
	 */
	public void initStandardClass(EEnum eenum, Enumerator current) {
		standardClass.setInput(eenum.getELiterals());
		standardClass.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#setStandardClass(Enumerator newValue)
	 * 
	 */
	public void setStandardClass(Enumerator newValue) {
		standardClass.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#getStandardCreationDate()
	 * 
	 */
	public String getStandardCreationDate() {
		return standardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#setStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#getLastStandardCreationDate()
	 * 
	 */
	public String getLastStandardCreationDate() {
		return lastStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#setLastStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#getNextStandardCreationDate()
	 * 
	 */
	public String getNextStandardCreationDate() {
		return nextStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#setNextStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#getRetireDate()
	 * 
	 */
	public String getRetireDate() {
		return retireDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#setRetireDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initDecomposesServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateDecomposesServices()
	 * 
	 */
	public void updateDecomposesServices() {
	decomposesServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterDecomposesServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesServices(ViewerFilter filter) {
		decomposesServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterDecomposesServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesServices(ViewerFilter filter) {
		decomposesServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInDecomposesServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDecomposesServicesTable(EObject element) {
		return ((ReferencesTableSettings)decomposesServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initConsumesServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateConsumesServices()
	 * 
	 */
	public void updateConsumesServices() {
	consumesServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterConsumesServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConsumesServices(ViewerFilter filter) {
		consumesServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterConsumesServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConsumesServices(ViewerFilter filter) {
		consumesServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInConsumesServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInConsumesServicesTable(EObject element) {
		return ((ReferencesTableSettings)consumesServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initIsProvidedToActors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsProvidedToActors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isProvidedToActors.setContentProvider(contentProvider);
		isProvidedToActors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateIsProvidedToActors()
	 * 
	 */
	public void updateIsProvidedToActors() {
	isProvidedToActors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterIsProvidedToActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsProvidedToActors(ViewerFilter filter) {
		isProvidedToActorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterIsProvidedToActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsProvidedToActors(ViewerFilter filter) {
		isProvidedToActorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInIsProvidedToActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsProvidedToActorsTable(EObject element) {
		return ((ReferencesTableSettings)isProvidedToActors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initIsOwnedAndGovernedByOrganizationUnits(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsOwnedAndGovernedByOrganizationUnits(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isOwnedAndGovernedByOrganizationUnits.setContentProvider(contentProvider);
		isOwnedAndGovernedByOrganizationUnits.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateIsOwnedAndGovernedByOrganizationUnits()
	 * 
	 */
	public void updateIsOwnedAndGovernedByOrganizationUnits() {
	isOwnedAndGovernedByOrganizationUnits.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterIsOwnedAndGovernedByOrganizationUnits(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsOwnedAndGovernedByOrganizationUnits(ViewerFilter filter) {
		isOwnedAndGovernedByOrganizationUnitsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterIsOwnedAndGovernedByOrganizationUnits(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsOwnedAndGovernedByOrganizationUnits(ViewerFilter filter) {
		isOwnedAndGovernedByOrganizationUnitsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInIsOwnedAndGovernedByOrganizationUnitsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsOwnedAndGovernedByOrganizationUnitsTable(EObject element) {
		return ((ReferencesTableSettings)isOwnedAndGovernedByOrganizationUnits.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initProvidesGovernedInterfaceToAccessFunctions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProvidesGovernedInterfaceToAccessFunctions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		providesGovernedInterfaceToAccessFunctions.setContentProvider(contentProvider);
		providesGovernedInterfaceToAccessFunctions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateProvidesGovernedInterfaceToAccessFunctions()
	 * 
	 */
	public void updateProvidesGovernedInterfaceToAccessFunctions() {
	providesGovernedInterfaceToAccessFunctions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterProvidesGovernedInterfaceToAccessFunctions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProvidesGovernedInterfaceToAccessFunctions(ViewerFilter filter) {
		providesGovernedInterfaceToAccessFunctionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterProvidesGovernedInterfaceToAccessFunctions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProvidesGovernedInterfaceToAccessFunctions(ViewerFilter filter) {
		providesGovernedInterfaceToAccessFunctionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInProvidesGovernedInterfaceToAccessFunctionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInProvidesGovernedInterfaceToAccessFunctionsTable(EObject element) {
		return ((ReferencesTableSettings)providesGovernedInterfaceToAccessFunctions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initSupportsProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSupportsProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		supportsProcesses.setContentProvider(contentProvider);
		supportsProcesses.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateSupportsProcesses()
	 * 
	 */
	public void updateSupportsProcesses() {
	supportsProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterSupportsProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSupportsProcesses(ViewerFilter filter) {
		supportsProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterSupportsProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSupportsProcesses(ViewerFilter filter) {
		supportsProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInSupportsProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSupportsProcessesTable(EObject element) {
		return ((ReferencesTableSettings)supportsProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initIsRealizedByProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsRealizedByProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isRealizedByProcesses.setContentProvider(contentProvider);
		isRealizedByProcesses.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateIsRealizedByProcesses()
	 * 
	 */
	public void updateIsRealizedByProcesses() {
	isRealizedByProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterIsRealizedByProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsRealizedByProcesses(ViewerFilter filter) {
		isRealizedByProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterIsRealizedByProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsRealizedByProcesses(ViewerFilter filter) {
		isRealizedByProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInIsRealizedByProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsRealizedByProcessesTable(EObject element) {
		return ((ReferencesTableSettings)isRealizedByProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initResolvesEvents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateResolvesEvents()
	 * 
	 */
	public void updateResolvesEvents() {
	resolvesEvents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterResolvesEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResolvesEvents(ViewerFilter filter) {
		resolvesEventsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterResolvesEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResolvesEvents(ViewerFilter filter) {
		resolvesEventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInResolvesEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInResolvesEventsTable(EObject element) {
		return ((ReferencesTableSettings)resolvesEvents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initProvidesEntities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProvidesEntities(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		providesEntities.setContentProvider(contentProvider);
		providesEntities.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateProvidesEntities()
	 * 
	 */
	public void updateProvidesEntities() {
	providesEntities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterProvidesEntities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProvidesEntities(ViewerFilter filter) {
		providesEntitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterProvidesEntities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProvidesEntities(ViewerFilter filter) {
		providesEntitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInProvidesEntitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProvidesEntitiesTable(EObject element) {
		return ((ReferencesTableSettings)providesEntities.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initConsumesEntities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateConsumesEntities()
	 * 
	 */
	public void updateConsumesEntities() {
	consumesEntities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterConsumesEntities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConsumesEntities(ViewerFilter filter) {
		consumesEntitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterConsumesEntities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConsumesEntities(ViewerFilter filter) {
		consumesEntitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInConsumesEntitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInConsumesEntitiesTable(EObject element) {
		return ((ReferencesTableSettings)consumesEntities.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initIsImplementedOnLogicalTechnologyComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsImplementedOnLogicalTechnologyComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isImplementedOnLogicalTechnologyComponents.setContentProvider(contentProvider);
		isImplementedOnLogicalTechnologyComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateIsImplementedOnLogicalTechnologyComponents()
	 * 
	 */
	public void updateIsImplementedOnLogicalTechnologyComponents() {
	isImplementedOnLogicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterIsImplementedOnLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsImplementedOnLogicalTechnologyComponents(ViewerFilter filter) {
		isImplementedOnLogicalTechnologyComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterIsImplementedOnLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsImplementedOnLogicalTechnologyComponents(ViewerFilter filter) {
		isImplementedOnLogicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInIsImplementedOnLogicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsImplementedOnLogicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)isImplementedOnLogicalTechnologyComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initIsRealizedThroughLogicalApplicationComponent(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsRealizedThroughLogicalApplicationComponent(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isRealizedThroughLogicalApplicationComponent.setContentProvider(contentProvider);
		isRealizedThroughLogicalApplicationComponent.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateIsRealizedThroughLogicalApplicationComponent()
	 * 
	 */
	public void updateIsRealizedThroughLogicalApplicationComponent() {
	isRealizedThroughLogicalApplicationComponent.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterIsRealizedThroughLogicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsRealizedThroughLogicalApplicationComponent(ViewerFilter filter) {
		isRealizedThroughLogicalApplicationComponentFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterIsRealizedThroughLogicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsRealizedThroughLogicalApplicationComponent(ViewerFilter filter) {
		isRealizedThroughLogicalApplicationComponentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInIsRealizedThroughLogicalApplicationComponentTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsRealizedThroughLogicalApplicationComponentTable(EObject element) {
		return ((ReferencesTableSettings)isRealizedThroughLogicalApplicationComponent.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initIsGovernedAndMeasuredByContracts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsGovernedAndMeasuredByContracts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isGovernedAndMeasuredByContracts.setContentProvider(contentProvider);
		isGovernedAndMeasuredByContracts.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateIsGovernedAndMeasuredByContracts()
	 * 
	 */
	public void updateIsGovernedAndMeasuredByContracts() {
	isGovernedAndMeasuredByContracts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterIsGovernedAndMeasuredByContracts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsGovernedAndMeasuredByContracts(ViewerFilter filter) {
		isGovernedAndMeasuredByContractsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterIsGovernedAndMeasuredByContracts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsGovernedAndMeasuredByContracts(ViewerFilter filter) {
		isGovernedAndMeasuredByContractsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInIsGovernedAndMeasuredByContractsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsGovernedAndMeasuredByContractsTable(EObject element) {
		return ((ReferencesTableSettings)isGovernedAndMeasuredByContracts.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initIsTrackedAgainstMeasures(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsTrackedAgainstMeasures(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isTrackedAgainstMeasures.setContentProvider(contentProvider);
		isTrackedAgainstMeasures.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateIsTrackedAgainstMeasures()
	 * 
	 */
	public void updateIsTrackedAgainstMeasures() {
	isTrackedAgainstMeasures.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterIsTrackedAgainstMeasures(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTrackedAgainstMeasures(ViewerFilter filter) {
		isTrackedAgainstMeasuresFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterIsTrackedAgainstMeasures(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTrackedAgainstMeasures(ViewerFilter filter) {
		isTrackedAgainstMeasuresBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInIsTrackedAgainstMeasuresTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTrackedAgainstMeasuresTable(EObject element) {
		return ((ReferencesTableSettings)isTrackedAgainstMeasures.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#initMeetsQualities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMeetsQualities(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		meetsQualities.setContentProvider(contentProvider);
		meetsQualities.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#updateMeetsQualities()
	 * 
	 */
	public void updateMeetsQualities() {
	meetsQualities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addFilterMeetsQualities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMeetsQualities(ViewerFilter filter) {
		meetsQualitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#addBusinessFilterMeetsQualities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMeetsQualities(ViewerFilter filter) {
		meetsQualitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.InformationSystemServicePropertiesEditionPart#isContainedInMeetsQualitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInMeetsQualitiesTable(EObject element) {
		return ((ReferencesTableSettings)meetsQualities.getInput()).contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.InformationSystemService_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
