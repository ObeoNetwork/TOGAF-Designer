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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.forms;

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
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class PlatformServicePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PlatformServicePropertiesEditionPart {

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
		protected ReferencesTable isSuppliedByLogicalTechnologyComponents;
		protected List<ViewerFilter> isSuppliedByLogicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isSuppliedByLogicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isRealizedThroughLogicalApplicationComponent;
		protected List<ViewerFilter> isRealizedThroughLogicalApplicationComponentBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isRealizedThroughLogicalApplicationComponentFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isImplementedOnLogicalTechnologyComponents;
		protected List<ViewerFilter> isImplementedOnLogicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isImplementedOnLogicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable providesEntities;
		protected List<ViewerFilter> providesEntitiesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> providesEntitiesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable consumesEntities;
		protected List<ViewerFilter> consumesEntitiesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> consumesEntitiesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable consumesServices;
		protected List<ViewerFilter> consumesServicesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> consumesServicesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable decomposesServices;
		protected List<ViewerFilter> decomposesServicesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> decomposesServicesFilters = new ArrayList<ViewerFilter>();
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
		protected ReferencesTable isProvidedToActors;
		protected List<ViewerFilter> isProvidedToActorsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isProvidedToActorsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isOwnedAndGovernedByOrganizationUnits;
		protected List<ViewerFilter> isOwnedAndGovernedByOrganizationUnitsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isOwnedAndGovernedByOrganizationUnitsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isGovernedAndMeasuredByContracts;
		protected List<ViewerFilter> isGovernedAndMeasuredByContractsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isGovernedAndMeasuredByContractsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isTrackedAgainstMeasures;
		protected List<ViewerFilter> isTrackedAgainstMeasuresBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isTrackedAgainstMeasuresFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable meetsQualities;
		protected List<ViewerFilter> meetsQualitiesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> meetsQualitiesFilters = new ArrayList<ViewerFilter>();
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
	public PlatformServicePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence platformServiceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = platformServiceStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.standardClass);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.PlatformService.Attributes.retireDate);
		
		CompositionStep relatedElementsStep = platformServiceStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(platformServiceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.class) {
					return createAttributesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.iD) {
					return 		createIDText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.category) {
					return 		createCategoryText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.source) {
					return 		createSourceText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.owner) {
					return 		createOwnerText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.standardClass) {
					return createStandardClassEMFComboViewer(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate) {
					return 		createStandardCreationDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate) {
					return 		createLastStandardCreationDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate) {
					return 		createNextStandardCreationDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.Attributes.retireDate) {
					return 		createRetireDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.class) {
					return createRelatedElementsGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents) {
					return createIsSuppliedByLogicalTechnologyComponentsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent) {
					return createIsRealizedThroughLogicalApplicationComponentReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents) {
					return createIsImplementedOnLogicalTechnologyComponentsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities) {
					return createProvidesEntitiesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities) {
					return createConsumesEntitiesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices) {
					return createConsumesServicesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices) {
					return createDecomposesServicesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions) {
					return createProvidesGovernedInterfaceToAccessFunctionsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses) {
					return createSupportsProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses) {
					return createIsRealizedByProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents) {
					return createResolvesEventsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors) {
					return createIsProvidedToActorsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits) {
					return createIsOwnedAndGovernedByOrganizationUnitsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts) {
					return createIsGovernedAndMeasuredByContractsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures) {
					return createIsTrackedAgainstMeasuresReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities) {
					return createMeetsQualitiesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.delegates) {
					return createDelegatesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy) {
					return createIsDelegatedByReferencesTable(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createAttributesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section attributesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		attributesSection.setText(ContentfwkMessages.PlatformServicePropertiesEditionPart_AttributesGroupLabel);
		GridData attributesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		attributesSectionData.horizontalSpan = 3;
		attributesSection.setLayoutData(attributesSectionData);
		Composite attributesGroup = widgetFactory.createComposite(attributesSection);
		GridLayout attributesGroupLayout = new GridLayout();
		attributesGroupLayout.numColumns = 3;
		attributesGroup.setLayout(attributesGroupLayout);
		attributesSection.setClient(attributesGroup);
		return attributesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.name, ContentfwkViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ContentfwkViewsRepository.PlatformService.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.name, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.iD, ContentfwkViewsRepository.FORM_KIND));
		iD = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		iD.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData iDData = new GridData(GridData.FILL_HORIZONTAL);
		iD.setLayoutData(iDData);
		iD.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
			}
		});
		iD.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}
		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.PlatformService.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.iD, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.description, ContentfwkViewsRepository.FORM_KIND));
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ContentfwkViewsRepository.PlatformService.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.description, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.category, ContentfwkViewsRepository.FORM_KIND));
		category = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		category.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData categoryData = new GridData(GridData.FILL_HORIZONTAL);
		category.setLayoutData(categoryData);
		category.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
			}
		});
		category.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}
		});
		EditingUtils.setID(category, ContentfwkViewsRepository.PlatformService.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.category, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.source, ContentfwkViewsRepository.FORM_KIND));
		source = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		source.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
			}
		});
		source.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}
		});
		EditingUtils.setID(source, ContentfwkViewsRepository.PlatformService.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.source, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.owner, ContentfwkViewsRepository.FORM_KIND));
		owner = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		owner.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData ownerData = new GridData(GridData.FILL_HORIZONTAL);
		owner.setLayoutData(ownerData);
		owner.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
			}
		});
		owner.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}
		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.PlatformService.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.owner, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardClassEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_StandardClassLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.standardClass, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.standardClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStandardClass()));
			}

		});
		standardClass.setID(ContentfwkViewsRepository.PlatformService.Attributes.standardClass);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.standardClass, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardCreationDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_StandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate, ContentfwkViewsRepository.FORM_KIND));
		standardCreationDate = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		standardCreationDate.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData standardCreationDateData = new GridData(GridData.FILL_HORIZONTAL);
		standardCreationDate.setLayoutData(standardCreationDateData);
		standardCreationDate.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
			}
		});
		standardCreationDate.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
				}
			}
		});
		EditingUtils.setID(standardCreationDate, ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate);
		EditingUtils.setEEFtype(standardCreationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.standardCreationDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLastStandardCreationDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_LastStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.FORM_KIND));
		lastStandardCreationDate = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		lastStandardCreationDate.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData lastStandardCreationDateData = new GridData(GridData.FILL_HORIZONTAL);
		lastStandardCreationDate.setLayoutData(lastStandardCreationDateData);
		lastStandardCreationDate.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
			}
		});
		lastStandardCreationDate.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
				}
			}
		});
		EditingUtils.setID(lastStandardCreationDate, ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate);
		EditingUtils.setEEFtype(lastStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNextStandardCreationDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_NextStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.FORM_KIND));
		nextStandardCreationDate = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nextStandardCreationDate.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nextStandardCreationDateData = new GridData(GridData.FILL_HORIZONTAL);
		nextStandardCreationDate.setLayoutData(nextStandardCreationDateData);
		nextStandardCreationDate.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
			}
		});
		nextStandardCreationDate.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
				}
			}
		});
		EditingUtils.setID(nextStandardCreationDate, ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate);
		EditingUtils.setEEFtype(nextStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRetireDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.PlatformServicePropertiesEditionPart_RetireDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PlatformService.Attributes.retireDate, ContentfwkViewsRepository.FORM_KIND));
		retireDate = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		retireDate.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData retireDateData = new GridData(GridData.FILL_HORIZONTAL);
		retireDate.setLayoutData(retireDateData);
		retireDate.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
			}
		});
		retireDate.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
				}
			}
		});
		EditingUtils.setID(retireDate, ContentfwkViewsRepository.PlatformService.Attributes.retireDate);
		EditingUtils.setEEFtype(retireDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.Attributes.retireDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section relatedElementsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		relatedElementsSection.setText(ContentfwkMessages.PlatformServicePropertiesEditionPart_RelatedElementsGroupLabel);
		GridData relatedElementsSectionData = new GridData(GridData.FILL_HORIZONTAL);
		relatedElementsSectionData.horizontalSpan = 3;
		relatedElementsSection.setLayoutData(relatedElementsSectionData);
		Composite relatedElementsGroup = widgetFactory.createComposite(relatedElementsSection);
		GridLayout relatedElementsGroupLayout = new GridLayout();
		relatedElementsGroupLayout.numColumns = 3;
		relatedElementsGroup.setLayout(relatedElementsGroupLayout);
		relatedElementsSection.setClient(relatedElementsGroup);
		return relatedElementsGroup;
	}

	/**
	 * 
	 */
	protected Composite createIsSuppliedByLogicalTechnologyComponentsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isSuppliedByLogicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_IsSuppliedByLogicalTechnologyComponentsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsSuppliedByLogicalTechnologyComponents(); }
			public void handleEdit(EObject element) { editIsSuppliedByLogicalTechnologyComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsSuppliedByLogicalTechnologyComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsSuppliedByLogicalTechnologyComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.isSuppliedByLogicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents, ContentfwkViewsRepository.FORM_KIND));
		this.isSuppliedByLogicalTechnologyComponents.createControls(parent, widgetFactory);
		this.isSuppliedByLogicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isSuppliedByLogicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		isSuppliedByLogicalTechnologyComponentsData.horizontalSpan = 3;
		this.isSuppliedByLogicalTechnologyComponents.setLayoutData(isSuppliedByLogicalTechnologyComponentsData);
		this.isSuppliedByLogicalTechnologyComponents.disableMove();
		isSuppliedByLogicalTechnologyComponents.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents);
		isSuppliedByLogicalTechnologyComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsSuppliedByLogicalTechnologyComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isSuppliedByLogicalTechnologyComponents.getInput(), isSuppliedByLogicalTechnologyComponentsFilters, isSuppliedByLogicalTechnologyComponentsBusinessFilters,
		"is Supplied By Logical Technology Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isSuppliedByLogicalTechnologyComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsSuppliedByLogicalTechnologyComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isSuppliedByLogicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsSuppliedByLogicalTechnologyComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isSuppliedByLogicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isSuppliedByLogicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editIsSuppliedByLogicalTechnologyComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isSuppliedByLogicalTechnologyComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsRealizedThroughLogicalApplicationComponentReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isRealizedThroughLogicalApplicationComponent = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_IsRealizedThroughLogicalApplicationComponentLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsRealizedThroughLogicalApplicationComponent(); }
			public void handleEdit(EObject element) { editIsRealizedThroughLogicalApplicationComponent(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsRealizedThroughLogicalApplicationComponent(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsRealizedThroughLogicalApplicationComponent(element); }
			public void navigateTo(EObject element) { }
		});
		this.isRealizedThroughLogicalApplicationComponent.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent, ContentfwkViewsRepository.FORM_KIND));
		this.isRealizedThroughLogicalApplicationComponent.createControls(parent, widgetFactory);
		this.isRealizedThroughLogicalApplicationComponent.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isRealizedThroughLogicalApplicationComponentData = new GridData(GridData.FILL_HORIZONTAL);
		isRealizedThroughLogicalApplicationComponentData.horizontalSpan = 3;
		this.isRealizedThroughLogicalApplicationComponent.setLayoutData(isRealizedThroughLogicalApplicationComponentData);
		this.isRealizedThroughLogicalApplicationComponent.disableMove();
		isRealizedThroughLogicalApplicationComponent.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isRealizedThroughLogicalApplicationComponent.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsRealizedThroughLogicalApplicationComponent(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedThroughLogicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsImplementedOnLogicalTechnologyComponentsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isImplementedOnLogicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_IsImplementedOnLogicalTechnologyComponentsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsImplementedOnLogicalTechnologyComponents(); }
			public void handleEdit(EObject element) { editIsImplementedOnLogicalTechnologyComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsImplementedOnLogicalTechnologyComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsImplementedOnLogicalTechnologyComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.isImplementedOnLogicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents, ContentfwkViewsRepository.FORM_KIND));
		this.isImplementedOnLogicalTechnologyComponents.createControls(parent, widgetFactory);
		this.isImplementedOnLogicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isImplementedOnLogicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		isImplementedOnLogicalTechnologyComponentsData.horizontalSpan = 3;
		this.isImplementedOnLogicalTechnologyComponents.setLayoutData(isImplementedOnLogicalTechnologyComponentsData);
		this.isImplementedOnLogicalTechnologyComponents.disableMove();
		isImplementedOnLogicalTechnologyComponents.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isImplementedOnLogicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsImplementedOnLogicalTechnologyComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isImplementedOnLogicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createProvidesEntitiesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.providesEntities = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_ProvidesEntitiesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addProvidesEntities(); }
			public void handleEdit(EObject element) { editProvidesEntities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProvidesEntities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProvidesEntities(element); }
			public void navigateTo(EObject element) { }
		});
		this.providesEntities.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities, ContentfwkViewsRepository.FORM_KIND));
		this.providesEntities.createControls(parent, widgetFactory);
		this.providesEntities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData providesEntitiesData = new GridData(GridData.FILL_HORIZONTAL);
		providesEntitiesData.horizontalSpan = 3;
		this.providesEntities.setLayoutData(providesEntitiesData);
		this.providesEntities.disableMove();
		providesEntities.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		providesEntities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProvidesEntities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.providesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createConsumesEntitiesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.consumesEntities = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_ConsumesEntitiesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addConsumesEntities(); }
			public void handleEdit(EObject element) { editConsumesEntities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveConsumesEntities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromConsumesEntities(element); }
			public void navigateTo(EObject element) { }
		});
		this.consumesEntities.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities, ContentfwkViewsRepository.FORM_KIND));
		this.consumesEntities.createControls(parent, widgetFactory);
		this.consumesEntities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData consumesEntitiesData = new GridData(GridData.FILL_HORIZONTAL);
		consumesEntitiesData.horizontalSpan = 3;
		this.consumesEntities.setLayoutData(consumesEntitiesData);
		this.consumesEntities.disableMove();
		consumesEntities.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		consumesEntities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromConsumesEntities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.consumesEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createConsumesServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.consumesServices = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_ConsumesServicesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addConsumesServices(); }
			public void handleEdit(EObject element) { editConsumesServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveConsumesServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromConsumesServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.consumesServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices, ContentfwkViewsRepository.FORM_KIND));
		this.consumesServices.createControls(parent, widgetFactory);
		this.consumesServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData consumesServicesData = new GridData(GridData.FILL_HORIZONTAL);
		consumesServicesData.horizontalSpan = 3;
		this.consumesServices.setLayoutData(consumesServicesData);
		this.consumesServices.disableMove();
		consumesServices.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		consumesServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromConsumesServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.consumesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createDecomposesServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.decomposesServices = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_DecomposesServicesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addDecomposesServices(); }
			public void handleEdit(EObject element) { editDecomposesServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDecomposesServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDecomposesServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.decomposesServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices, ContentfwkViewsRepository.FORM_KIND));
		this.decomposesServices.createControls(parent, widgetFactory);
		this.decomposesServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData decomposesServicesData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesServicesData.horizontalSpan = 3;
		this.decomposesServices.setLayoutData(decomposesServicesData);
		this.decomposesServices.disableMove();
		decomposesServices.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		decomposesServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDecomposesServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.decomposesServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createProvidesGovernedInterfaceToAccessFunctionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.providesGovernedInterfaceToAccessFunctions = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_ProvidesGovernedInterfaceToAccessFunctionsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addProvidesGovernedInterfaceToAccessFunctions(); }
			public void handleEdit(EObject element) { editProvidesGovernedInterfaceToAccessFunctions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProvidesGovernedInterfaceToAccessFunctions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProvidesGovernedInterfaceToAccessFunctions(element); }
			public void navigateTo(EObject element) { }
		});
		this.providesGovernedInterfaceToAccessFunctions.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions, ContentfwkViewsRepository.FORM_KIND));
		this.providesGovernedInterfaceToAccessFunctions.createControls(parent, widgetFactory);
		this.providesGovernedInterfaceToAccessFunctions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData providesGovernedInterfaceToAccessFunctionsData = new GridData(GridData.FILL_HORIZONTAL);
		providesGovernedInterfaceToAccessFunctionsData.horizontalSpan = 3;
		this.providesGovernedInterfaceToAccessFunctions.setLayoutData(providesGovernedInterfaceToAccessFunctionsData);
		this.providesGovernedInterfaceToAccessFunctions.disableMove();
		providesGovernedInterfaceToAccessFunctions.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		providesGovernedInterfaceToAccessFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProvidesGovernedInterfaceToAccessFunctions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.providesGovernedInterfaceToAccessFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createSupportsProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.supportsProcesses = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_SupportsProcessesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addSupportsProcesses(); }
			public void handleEdit(EObject element) { editSupportsProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSupportsProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSupportsProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.supportsProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses, ContentfwkViewsRepository.FORM_KIND));
		this.supportsProcesses.createControls(parent, widgetFactory);
		this.supportsProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData supportsProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		supportsProcessesData.horizontalSpan = 3;
		this.supportsProcesses.setLayoutData(supportsProcessesData);
		this.supportsProcesses.disableMove();
		supportsProcesses.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		supportsProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSupportsProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.supportsProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsRealizedByProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isRealizedByProcesses = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_IsRealizedByProcessesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsRealizedByProcesses(); }
			public void handleEdit(EObject element) { editIsRealizedByProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsRealizedByProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsRealizedByProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.isRealizedByProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses, ContentfwkViewsRepository.FORM_KIND));
		this.isRealizedByProcesses.createControls(parent, widgetFactory);
		this.isRealizedByProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isRealizedByProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		isRealizedByProcessesData.horizontalSpan = 3;
		this.isRealizedByProcesses.setLayoutData(isRealizedByProcessesData);
		this.isRealizedByProcesses.disableMove();
		isRealizedByProcesses.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isRealizedByProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsRealizedByProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isRealizedByProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createResolvesEventsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.resolvesEvents = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_ResolvesEventsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addResolvesEvents(); }
			public void handleEdit(EObject element) { editResolvesEvents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResolvesEvents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResolvesEvents(element); }
			public void navigateTo(EObject element) { }
		});
		this.resolvesEvents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents, ContentfwkViewsRepository.FORM_KIND));
		this.resolvesEvents.createControls(parent, widgetFactory);
		this.resolvesEvents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resolvesEventsData = new GridData(GridData.FILL_HORIZONTAL);
		resolvesEventsData.horizontalSpan = 3;
		this.resolvesEvents.setLayoutData(resolvesEventsData);
		this.resolvesEvents.disableMove();
		resolvesEvents.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resolvesEvents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResolvesEvents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.resolvesEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsProvidedToActorsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isProvidedToActors = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_IsProvidedToActorsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsProvidedToActors(); }
			public void handleEdit(EObject element) { editIsProvidedToActors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsProvidedToActors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsProvidedToActors(element); }
			public void navigateTo(EObject element) { }
		});
		this.isProvidedToActors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors, ContentfwkViewsRepository.FORM_KIND));
		this.isProvidedToActors.createControls(parent, widgetFactory);
		this.isProvidedToActors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isProvidedToActorsData = new GridData(GridData.FILL_HORIZONTAL);
		isProvidedToActorsData.horizontalSpan = 3;
		this.isProvidedToActors.setLayoutData(isProvidedToActorsData);
		this.isProvidedToActors.disableMove();
		isProvidedToActors.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isProvidedToActors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsProvidedToActors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isProvidedToActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsOwnedAndGovernedByOrganizationUnitsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isOwnedAndGovernedByOrganizationUnits = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_IsOwnedAndGovernedByOrganizationUnitsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsOwnedAndGovernedByOrganizationUnits(); }
			public void handleEdit(EObject element) { editIsOwnedAndGovernedByOrganizationUnits(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsOwnedAndGovernedByOrganizationUnits(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsOwnedAndGovernedByOrganizationUnits(element); }
			public void navigateTo(EObject element) { }
		});
		this.isOwnedAndGovernedByOrganizationUnits.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits, ContentfwkViewsRepository.FORM_KIND));
		this.isOwnedAndGovernedByOrganizationUnits.createControls(parent, widgetFactory);
		this.isOwnedAndGovernedByOrganizationUnits.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isOwnedAndGovernedByOrganizationUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		isOwnedAndGovernedByOrganizationUnitsData.horizontalSpan = 3;
		this.isOwnedAndGovernedByOrganizationUnits.setLayoutData(isOwnedAndGovernedByOrganizationUnitsData);
		this.isOwnedAndGovernedByOrganizationUnits.disableMove();
		isOwnedAndGovernedByOrganizationUnits.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isOwnedAndGovernedByOrganizationUnits.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsOwnedAndGovernedByOrganizationUnits(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isOwnedAndGovernedByOrganizationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsGovernedAndMeasuredByContractsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isGovernedAndMeasuredByContracts = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_IsGovernedAndMeasuredByContractsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsGovernedAndMeasuredByContracts(); }
			public void handleEdit(EObject element) { editIsGovernedAndMeasuredByContracts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsGovernedAndMeasuredByContracts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsGovernedAndMeasuredByContracts(element); }
			public void navigateTo(EObject element) { }
		});
		this.isGovernedAndMeasuredByContracts.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts, ContentfwkViewsRepository.FORM_KIND));
		this.isGovernedAndMeasuredByContracts.createControls(parent, widgetFactory);
		this.isGovernedAndMeasuredByContracts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isGovernedAndMeasuredByContractsData = new GridData(GridData.FILL_HORIZONTAL);
		isGovernedAndMeasuredByContractsData.horizontalSpan = 3;
		this.isGovernedAndMeasuredByContracts.setLayoutData(isGovernedAndMeasuredByContractsData);
		this.isGovernedAndMeasuredByContracts.disableMove();
		isGovernedAndMeasuredByContracts.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isGovernedAndMeasuredByContracts.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsGovernedAndMeasuredByContracts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isGovernedAndMeasuredByContracts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsTrackedAgainstMeasuresReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isTrackedAgainstMeasures = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_IsTrackedAgainstMeasuresLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsTrackedAgainstMeasures(); }
			public void handleEdit(EObject element) { editIsTrackedAgainstMeasures(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsTrackedAgainstMeasures(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsTrackedAgainstMeasures(element); }
			public void navigateTo(EObject element) { }
		});
		this.isTrackedAgainstMeasures.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures, ContentfwkViewsRepository.FORM_KIND));
		this.isTrackedAgainstMeasures.createControls(parent, widgetFactory);
		this.isTrackedAgainstMeasures.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isTrackedAgainstMeasuresData = new GridData(GridData.FILL_HORIZONTAL);
		isTrackedAgainstMeasuresData.horizontalSpan = 3;
		this.isTrackedAgainstMeasures.setLayoutData(isTrackedAgainstMeasuresData);
		this.isTrackedAgainstMeasures.disableMove();
		isTrackedAgainstMeasures.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isTrackedAgainstMeasures.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsTrackedAgainstMeasures(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isTrackedAgainstMeasures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createMeetsQualitiesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.meetsQualities = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_MeetsQualitiesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addMeetsQualities(); }
			public void handleEdit(EObject element) { editMeetsQualities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMeetsQualities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMeetsQualities(element); }
			public void navigateTo(EObject element) { }
		});
		this.meetsQualities.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities, ContentfwkViewsRepository.FORM_KIND));
		this.meetsQualities.createControls(parent, widgetFactory);
		this.meetsQualities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData meetsQualitiesData = new GridData(GridData.FILL_HORIZONTAL);
		meetsQualitiesData.horizontalSpan = 3;
		this.meetsQualities.setLayoutData(meetsQualitiesData);
		this.meetsQualities.disableMove();
		meetsQualities.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		meetsQualities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMeetsQualities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.meetsQualities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createDelegatesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_DelegatesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.delegates, ContentfwkViewsRepository.FORM_KIND));
		this.delegates.createControls(parent, widgetFactory);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsDelegatedByReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.PlatformServicePropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.FORM_KIND));
		this.isDelegatedBy.createControls(parent, widgetFactory);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PlatformServicePropertiesEditionPartForm.this, ContentfwkViewsRepository.PlatformService.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getStandardClass()
	 * 
	 */
	public Enumerator getStandardClass() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) standardClass.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initStandardClass(EEnum eenum, Enumerator current)
	 */
	public void initStandardClass(EEnum eenum, Enumerator current) {
		standardClass.setInput(eenum.getELiterals());
		standardClass.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setStandardClass(Enumerator newValue)
	 * 
	 */
	public void setStandardClass(Enumerator newValue) {
		standardClass.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getStandardCreationDate()
	 * 
	 */
	public String getStandardCreationDate() {
		return standardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getLastStandardCreationDate()
	 * 
	 */
	public String getLastStandardCreationDate() {
		return lastStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setLastStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getNextStandardCreationDate()
	 * 
	 */
	public String getNextStandardCreationDate() {
		return nextStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setNextStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#getRetireDate()
	 * 
	 */
	public String getRetireDate() {
		return retireDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#setRetireDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initIsSuppliedByLogicalTechnologyComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsSuppliedByLogicalTechnologyComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isSuppliedByLogicalTechnologyComponents.setContentProvider(contentProvider);
		isSuppliedByLogicalTechnologyComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateIsSuppliedByLogicalTechnologyComponents()
	 * 
	 */
	public void updateIsSuppliedByLogicalTechnologyComponents() {
	isSuppliedByLogicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterIsSuppliedByLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsSuppliedByLogicalTechnologyComponents(ViewerFilter filter) {
		isSuppliedByLogicalTechnologyComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterIsSuppliedByLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsSuppliedByLogicalTechnologyComponents(ViewerFilter filter) {
		isSuppliedByLogicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInIsSuppliedByLogicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsSuppliedByLogicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)isSuppliedByLogicalTechnologyComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initIsRealizedThroughLogicalApplicationComponent(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateIsRealizedThroughLogicalApplicationComponent()
	 * 
	 */
	public void updateIsRealizedThroughLogicalApplicationComponent() {
	isRealizedThroughLogicalApplicationComponent.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterIsRealizedThroughLogicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsRealizedThroughLogicalApplicationComponent(ViewerFilter filter) {
		isRealizedThroughLogicalApplicationComponentFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterIsRealizedThroughLogicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsRealizedThroughLogicalApplicationComponent(ViewerFilter filter) {
		isRealizedThroughLogicalApplicationComponentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInIsRealizedThroughLogicalApplicationComponentTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsRealizedThroughLogicalApplicationComponentTable(EObject element) {
		return ((ReferencesTableSettings)isRealizedThroughLogicalApplicationComponent.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initIsImplementedOnLogicalTechnologyComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateIsImplementedOnLogicalTechnologyComponents()
	 * 
	 */
	public void updateIsImplementedOnLogicalTechnologyComponents() {
	isImplementedOnLogicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterIsImplementedOnLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsImplementedOnLogicalTechnologyComponents(ViewerFilter filter) {
		isImplementedOnLogicalTechnologyComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterIsImplementedOnLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsImplementedOnLogicalTechnologyComponents(ViewerFilter filter) {
		isImplementedOnLogicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInIsImplementedOnLogicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsImplementedOnLogicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)isImplementedOnLogicalTechnologyComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initProvidesEntities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateProvidesEntities()
	 * 
	 */
	public void updateProvidesEntities() {
	providesEntities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterProvidesEntities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProvidesEntities(ViewerFilter filter) {
		providesEntitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterProvidesEntities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProvidesEntities(ViewerFilter filter) {
		providesEntitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInProvidesEntitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProvidesEntitiesTable(EObject element) {
		return ((ReferencesTableSettings)providesEntities.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initConsumesEntities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateConsumesEntities()
	 * 
	 */
	public void updateConsumesEntities() {
	consumesEntities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterConsumesEntities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConsumesEntities(ViewerFilter filter) {
		consumesEntitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterConsumesEntities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConsumesEntities(ViewerFilter filter) {
		consumesEntitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInConsumesEntitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInConsumesEntitiesTable(EObject element) {
		return ((ReferencesTableSettings)consumesEntities.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initConsumesServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateConsumesServices()
	 * 
	 */
	public void updateConsumesServices() {
	consumesServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterConsumesServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConsumesServices(ViewerFilter filter) {
		consumesServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterConsumesServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConsumesServices(ViewerFilter filter) {
		consumesServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInConsumesServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInConsumesServicesTable(EObject element) {
		return ((ReferencesTableSettings)consumesServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initDecomposesServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateDecomposesServices()
	 * 
	 */
	public void updateDecomposesServices() {
	decomposesServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterDecomposesServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesServices(ViewerFilter filter) {
		decomposesServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterDecomposesServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesServices(ViewerFilter filter) {
		decomposesServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInDecomposesServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDecomposesServicesTable(EObject element) {
		return ((ReferencesTableSettings)decomposesServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initProvidesGovernedInterfaceToAccessFunctions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateProvidesGovernedInterfaceToAccessFunctions()
	 * 
	 */
	public void updateProvidesGovernedInterfaceToAccessFunctions() {
	providesGovernedInterfaceToAccessFunctions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterProvidesGovernedInterfaceToAccessFunctions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProvidesGovernedInterfaceToAccessFunctions(ViewerFilter filter) {
		providesGovernedInterfaceToAccessFunctionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterProvidesGovernedInterfaceToAccessFunctions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProvidesGovernedInterfaceToAccessFunctions(ViewerFilter filter) {
		providesGovernedInterfaceToAccessFunctionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInProvidesGovernedInterfaceToAccessFunctionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInProvidesGovernedInterfaceToAccessFunctionsTable(EObject element) {
		return ((ReferencesTableSettings)providesGovernedInterfaceToAccessFunctions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initSupportsProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateSupportsProcesses()
	 * 
	 */
	public void updateSupportsProcesses() {
	supportsProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterSupportsProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSupportsProcesses(ViewerFilter filter) {
		supportsProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterSupportsProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSupportsProcesses(ViewerFilter filter) {
		supportsProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInSupportsProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSupportsProcessesTable(EObject element) {
		return ((ReferencesTableSettings)supportsProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initIsRealizedByProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateIsRealizedByProcesses()
	 * 
	 */
	public void updateIsRealizedByProcesses() {
	isRealizedByProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterIsRealizedByProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsRealizedByProcesses(ViewerFilter filter) {
		isRealizedByProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterIsRealizedByProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsRealizedByProcesses(ViewerFilter filter) {
		isRealizedByProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInIsRealizedByProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsRealizedByProcessesTable(EObject element) {
		return ((ReferencesTableSettings)isRealizedByProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initResolvesEvents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateResolvesEvents()
	 * 
	 */
	public void updateResolvesEvents() {
	resolvesEvents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterResolvesEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResolvesEvents(ViewerFilter filter) {
		resolvesEventsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterResolvesEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResolvesEvents(ViewerFilter filter) {
		resolvesEventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInResolvesEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInResolvesEventsTable(EObject element) {
		return ((ReferencesTableSettings)resolvesEvents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initIsProvidedToActors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateIsProvidedToActors()
	 * 
	 */
	public void updateIsProvidedToActors() {
	isProvidedToActors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterIsProvidedToActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsProvidedToActors(ViewerFilter filter) {
		isProvidedToActorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterIsProvidedToActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsProvidedToActors(ViewerFilter filter) {
		isProvidedToActorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInIsProvidedToActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsProvidedToActorsTable(EObject element) {
		return ((ReferencesTableSettings)isProvidedToActors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initIsOwnedAndGovernedByOrganizationUnits(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateIsOwnedAndGovernedByOrganizationUnits()
	 * 
	 */
	public void updateIsOwnedAndGovernedByOrganizationUnits() {
	isOwnedAndGovernedByOrganizationUnits.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterIsOwnedAndGovernedByOrganizationUnits(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsOwnedAndGovernedByOrganizationUnits(ViewerFilter filter) {
		isOwnedAndGovernedByOrganizationUnitsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterIsOwnedAndGovernedByOrganizationUnits(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsOwnedAndGovernedByOrganizationUnits(ViewerFilter filter) {
		isOwnedAndGovernedByOrganizationUnitsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInIsOwnedAndGovernedByOrganizationUnitsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsOwnedAndGovernedByOrganizationUnitsTable(EObject element) {
		return ((ReferencesTableSettings)isOwnedAndGovernedByOrganizationUnits.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initIsGovernedAndMeasuredByContracts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateIsGovernedAndMeasuredByContracts()
	 * 
	 */
	public void updateIsGovernedAndMeasuredByContracts() {
	isGovernedAndMeasuredByContracts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterIsGovernedAndMeasuredByContracts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsGovernedAndMeasuredByContracts(ViewerFilter filter) {
		isGovernedAndMeasuredByContractsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterIsGovernedAndMeasuredByContracts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsGovernedAndMeasuredByContracts(ViewerFilter filter) {
		isGovernedAndMeasuredByContractsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInIsGovernedAndMeasuredByContractsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsGovernedAndMeasuredByContractsTable(EObject element) {
		return ((ReferencesTableSettings)isGovernedAndMeasuredByContracts.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initIsTrackedAgainstMeasures(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateIsTrackedAgainstMeasures()
	 * 
	 */
	public void updateIsTrackedAgainstMeasures() {
	isTrackedAgainstMeasures.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterIsTrackedAgainstMeasures(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTrackedAgainstMeasures(ViewerFilter filter) {
		isTrackedAgainstMeasuresFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterIsTrackedAgainstMeasures(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTrackedAgainstMeasures(ViewerFilter filter) {
		isTrackedAgainstMeasuresBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInIsTrackedAgainstMeasuresTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTrackedAgainstMeasuresTable(EObject element) {
		return ((ReferencesTableSettings)isTrackedAgainstMeasures.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initMeetsQualities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateMeetsQualities()
	 * 
	 */
	public void updateMeetsQualities() {
	meetsQualities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterMeetsQualities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMeetsQualities(ViewerFilter filter) {
		meetsQualitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterMeetsQualities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMeetsQualities(ViewerFilter filter) {
		meetsQualitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInMeetsQualitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInMeetsQualitiesTable(EObject element) {
		return ((ReferencesTableSettings)meetsQualities.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PlatformServicePropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.PlatformService_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
