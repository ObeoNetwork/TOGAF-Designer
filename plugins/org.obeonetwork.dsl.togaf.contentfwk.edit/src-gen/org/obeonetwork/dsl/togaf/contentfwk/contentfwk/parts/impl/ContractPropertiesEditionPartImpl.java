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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class ContractPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ContractPropertiesEditionPart {

	protected Text name;
	protected Text iD;
	protected Text description;
	protected Text category;
	protected Text source;
	protected Text owner;
	protected Text serviceNameCaller;
	protected Text serviceNameCalled;
	protected Text behaviorCharacteristics;
	protected Text serviceQualityCharacteristics;
	protected Text availabilityQualityCharacteristics;
	protected Text servicesTimes;
	protected Text manageabilityCharacteristics;
	protected Text serviceabilityCharacteristics;
	protected Text performanceCharacteristics;
	protected Text responseCharacteristics;
	protected Text reliabilityCharacteristics;
	protected Text qualityOfInformationRequired;
	protected Text contractControlRequirements;
	protected Text resultControlRequirements;
	protected Text recoverabilityCharacteristics;
	protected Text locatabilityCharacteristics;
	protected Text securityCharacteristics;
	protected Text privacyCharacteristics;
	protected Text integrityCharacteristics;
	protected Text credibilityCharacteristics;
	protected Text localizationCharacteristics;
	protected Text internationalizationCharacteristics;
	protected Text interoperabilityCharacteristics;
	protected Text scalabilityCharacteristics;
	protected Text portabilityCharacteristics;
	protected Text extensibilityCharacteristics;
	protected Text capacityCharacteristics;
	protected Text throughput;
	protected Text throughputPeriod;
	protected Text growth;
	protected Text growthPeriod;
	protected Text peakProfileShortTerm;
	protected Text peakProfileLongTerm;
	protected ReferencesTable governsAndMeasuresBusinessServices;
	protected List<ViewerFilter> governsAndMeasuresBusinessServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> governsAndMeasuresBusinessServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable meetsServiceQuality;
	protected List<ViewerFilter> meetsServiceQualityBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> meetsServiceQualityFilters = new ArrayList<ViewerFilter>();
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
	public ContractPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence contractStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = contractStep.addStep(ContentfwkViewsRepository.Contract.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.servicesTimes);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.throughput);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.throughputPeriod);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.growth);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.growthPeriod);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm);
		attributesStep.addStep(ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm);
		
		CompositionStep relatedElementsStep = contractStep.addStep(ContentfwkViewsRepository.Contract.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Contract.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(contractStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.Contract.Attributes.class) {
					return createAttributesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.name) {
					return createNameText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.iD) {
					return createIDText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.description) {
					return createDescriptionText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.category) {
					return createCategoryText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.source) {
					return createSourceText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.owner) {
					return createOwnerText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller) {
					return createServiceNameCallerText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled) {
					return createServiceNameCalledText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics) {
					return createBehaviorCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics) {
					return createServiceQualityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics) {
					return createAvailabilityQualityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.servicesTimes) {
					return createServicesTimesText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics) {
					return createManageabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics) {
					return createServiceabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics) {
					return createPerformanceCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics) {
					return createResponseCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics) {
					return createReliabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired) {
					return createQualityOfInformationRequiredText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements) {
					return createContractControlRequirementsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements) {
					return createResultControlRequirementsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics) {
					return createRecoverabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics) {
					return createLocatabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics) {
					return createSecurityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics) {
					return createPrivacyCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics) {
					return createIntegrityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics) {
					return createCredibilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics) {
					return createLocalizationCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics) {
					return createInternationalizationCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics) {
					return createInteroperabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics) {
					return createScalabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics) {
					return createPortabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics) {
					return createExtensibilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics) {
					return createCapacityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.throughput) {
					return createThroughputText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.throughputPeriod) {
					return createThroughputPeriodText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.growth) {
					return createGrowthText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.growthPeriod) {
					return createGrowthPeriodText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm) {
					return createPeakProfileShortTermText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm) {
					return createPeakProfileLongTermText(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.RelatedElements.class) {
					return createRelatedElementsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices) {
					return createGovernsAndMeasuresBusinessServicesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality) {
					return createMeetsServiceQualityAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.RelatedElements.delegates) {
					return createDelegatesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy) {
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
		attributesGroup.setText(ContentfwkMessages.ContractPropertiesEditionPart_AttributesGroupLabel);
		GridData attributesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		attributesGroupData.horizontalSpan = 3;
		attributesGroup.setLayoutData(attributesGroupData);
		GridLayout attributesGroupLayout = new GridLayout();
		attributesGroupLayout.numColumns = 3;
		attributesGroup.setLayout(attributesGroupLayout);
		return attributesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.name, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ContentfwkViewsRepository.Contract.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.name, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.iD, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}

		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.Contract.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.iD, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.description, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ContentfwkViewsRepository.Contract.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.description, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.category, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}

		});
		EditingUtils.setID(category, ContentfwkViewsRepository.Contract.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.category, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.source, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}

		});
		EditingUtils.setID(source, ContentfwkViewsRepository.Contract.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.source, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.owner, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}

		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.Contract.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.owner, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createServiceNameCallerText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ServiceNameCallerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller, ContentfwkViewsRepository.SWT_KIND));
		serviceNameCaller = new Text(parent, SWT.BORDER);
		GridData serviceNameCallerData = new GridData(GridData.FILL_HORIZONTAL);
		serviceNameCaller.setLayoutData(serviceNameCallerData);
		serviceNameCaller.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceNameCaller.getText()));
			}

		});
		serviceNameCaller.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceNameCaller.getText()));
				}
			}

		});
		EditingUtils.setID(serviceNameCaller, ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller);
		EditingUtils.setEEFtype(serviceNameCaller, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.serviceNameCaller, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createServiceNameCalledText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ServiceNameCalledLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled, ContentfwkViewsRepository.SWT_KIND));
		serviceNameCalled = new Text(parent, SWT.BORDER);
		GridData serviceNameCalledData = new GridData(GridData.FILL_HORIZONTAL);
		serviceNameCalled.setLayoutData(serviceNameCalledData);
		serviceNameCalled.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceNameCalled.getText()));
			}

		});
		serviceNameCalled.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceNameCalled.getText()));
				}
			}

		});
		EditingUtils.setID(serviceNameCalled, ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled);
		EditingUtils.setEEFtype(serviceNameCalled, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.serviceNameCalled, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBehaviorCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_BehaviorCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		behaviorCharacteristics = new Text(parent, SWT.BORDER);
		GridData behaviorCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		behaviorCharacteristics.setLayoutData(behaviorCharacteristicsData);
		behaviorCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, behaviorCharacteristics.getText()));
			}

		});
		behaviorCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, behaviorCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(behaviorCharacteristics, ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics);
		EditingUtils.setEEFtype(behaviorCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.behaviorCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createServiceQualityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ServiceQualityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		serviceQualityCharacteristics = new Text(parent, SWT.BORDER);
		GridData serviceQualityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		serviceQualityCharacteristics.setLayoutData(serviceQualityCharacteristicsData);
		serviceQualityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceQualityCharacteristics.getText()));
			}

		});
		serviceQualityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceQualityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(serviceQualityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics);
		EditingUtils.setEEFtype(serviceQualityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.serviceQualityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAvailabilityQualityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_AvailabilityQualityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		availabilityQualityCharacteristics = new Text(parent, SWT.BORDER);
		GridData availabilityQualityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		availabilityQualityCharacteristics.setLayoutData(availabilityQualityCharacteristicsData);
		availabilityQualityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availabilityQualityCharacteristics.getText()));
			}

		});
		availabilityQualityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availabilityQualityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(availabilityQualityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics);
		EditingUtils.setEEFtype(availabilityQualityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.availabilityQualityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createServicesTimesText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ServicesTimesLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.servicesTimes, ContentfwkViewsRepository.SWT_KIND));
		servicesTimes = new Text(parent, SWT.BORDER);
		GridData servicesTimesData = new GridData(GridData.FILL_HORIZONTAL);
		servicesTimes.setLayoutData(servicesTimesData);
		servicesTimes.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.servicesTimes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, servicesTimes.getText()));
			}

		});
		servicesTimes.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.servicesTimes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, servicesTimes.getText()));
				}
			}

		});
		EditingUtils.setID(servicesTimes, ContentfwkViewsRepository.Contract.Attributes.servicesTimes);
		EditingUtils.setEEFtype(servicesTimes, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.servicesTimes, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createManageabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ManageabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		manageabilityCharacteristics = new Text(parent, SWT.BORDER);
		GridData manageabilityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		manageabilityCharacteristics.setLayoutData(manageabilityCharacteristicsData);
		manageabilityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, manageabilityCharacteristics.getText()));
			}

		});
		manageabilityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, manageabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(manageabilityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics);
		EditingUtils.setEEFtype(manageabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.manageabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createServiceabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ServiceabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		serviceabilityCharacteristics = new Text(parent, SWT.BORDER);
		GridData serviceabilityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		serviceabilityCharacteristics.setLayoutData(serviceabilityCharacteristicsData);
		serviceabilityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceabilityCharacteristics.getText()));
			}

		});
		serviceabilityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(serviceabilityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics);
		EditingUtils.setEEFtype(serviceabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.serviceabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPerformanceCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_PerformanceCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		performanceCharacteristics = new Text(parent, SWT.BORDER);
		GridData performanceCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		performanceCharacteristics.setLayoutData(performanceCharacteristicsData);
		performanceCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, performanceCharacteristics.getText()));
			}

		});
		performanceCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, performanceCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(performanceCharacteristics, ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics);
		EditingUtils.setEEFtype(performanceCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.performanceCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createResponseCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ResponseCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		responseCharacteristics = new Text(parent, SWT.BORDER);
		GridData responseCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		responseCharacteristics.setLayoutData(responseCharacteristicsData);
		responseCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, responseCharacteristics.getText()));
			}

		});
		responseCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, responseCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(responseCharacteristics, ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics);
		EditingUtils.setEEFtype(responseCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.responseCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createReliabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ReliabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		reliabilityCharacteristics = new Text(parent, SWT.BORDER);
		GridData reliabilityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		reliabilityCharacteristics.setLayoutData(reliabilityCharacteristicsData);
		reliabilityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reliabilityCharacteristics.getText()));
			}

		});
		reliabilityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reliabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(reliabilityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics);
		EditingUtils.setEEFtype(reliabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.reliabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createQualityOfInformationRequiredText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_QualityOfInformationRequiredLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired, ContentfwkViewsRepository.SWT_KIND));
		qualityOfInformationRequired = new Text(parent, SWT.BORDER);
		GridData qualityOfInformationRequiredData = new GridData(GridData.FILL_HORIZONTAL);
		qualityOfInformationRequired.setLayoutData(qualityOfInformationRequiredData);
		qualityOfInformationRequired.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualityOfInformationRequired.getText()));
			}

		});
		qualityOfInformationRequired.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, qualityOfInformationRequired.getText()));
				}
			}

		});
		EditingUtils.setID(qualityOfInformationRequired, ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired);
		EditingUtils.setEEFtype(qualityOfInformationRequired, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.qualityOfInformationRequired, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createContractControlRequirementsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ContractControlRequirementsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements, ContentfwkViewsRepository.SWT_KIND));
		contractControlRequirements = new Text(parent, SWT.BORDER);
		GridData contractControlRequirementsData = new GridData(GridData.FILL_HORIZONTAL);
		contractControlRequirements.setLayoutData(contractControlRequirementsData);
		contractControlRequirements.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, contractControlRequirements.getText()));
			}

		});
		contractControlRequirements.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, contractControlRequirements.getText()));
				}
			}

		});
		EditingUtils.setID(contractControlRequirements, ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements);
		EditingUtils.setEEFtype(contractControlRequirements, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.contractControlRequirements, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createResultControlRequirementsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ResultControlRequirementsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements, ContentfwkViewsRepository.SWT_KIND));
		resultControlRequirements = new Text(parent, SWT.BORDER);
		GridData resultControlRequirementsData = new GridData(GridData.FILL_HORIZONTAL);
		resultControlRequirements.setLayoutData(resultControlRequirementsData);
		resultControlRequirements.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resultControlRequirements.getText()));
			}

		});
		resultControlRequirements.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resultControlRequirements.getText()));
				}
			}

		});
		EditingUtils.setID(resultControlRequirements, ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements);
		EditingUtils.setEEFtype(resultControlRequirements, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.resultControlRequirements, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRecoverabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_RecoverabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		recoverabilityCharacteristics = new Text(parent, SWT.BORDER);
		GridData recoverabilityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		recoverabilityCharacteristics.setLayoutData(recoverabilityCharacteristicsData);
		recoverabilityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, recoverabilityCharacteristics.getText()));
			}

		});
		recoverabilityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, recoverabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(recoverabilityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics);
		EditingUtils.setEEFtype(recoverabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.recoverabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLocatabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_LocatabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		locatabilityCharacteristics = new Text(parent, SWT.BORDER);
		GridData locatabilityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		locatabilityCharacteristics.setLayoutData(locatabilityCharacteristicsData);
		locatabilityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locatabilityCharacteristics.getText()));
			}

		});
		locatabilityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locatabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(locatabilityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics);
		EditingUtils.setEEFtype(locatabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.locatabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSecurityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_SecurityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		securityCharacteristics = new Text(parent, SWT.BORDER);
		GridData securityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		securityCharacteristics.setLayoutData(securityCharacteristicsData);
		securityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, securityCharacteristics.getText()));
			}

		});
		securityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, securityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(securityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics);
		EditingUtils.setEEFtype(securityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.securityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPrivacyCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_PrivacyCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		privacyCharacteristics = new Text(parent, SWT.BORDER);
		GridData privacyCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		privacyCharacteristics.setLayoutData(privacyCharacteristicsData);
		privacyCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, privacyCharacteristics.getText()));
			}

		});
		privacyCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, privacyCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(privacyCharacteristics, ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics);
		EditingUtils.setEEFtype(privacyCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.privacyCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIntegrityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_IntegrityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		integrityCharacteristics = new Text(parent, SWT.BORDER);
		GridData integrityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		integrityCharacteristics.setLayoutData(integrityCharacteristicsData);
		integrityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, integrityCharacteristics.getText()));
			}

		});
		integrityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, integrityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(integrityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics);
		EditingUtils.setEEFtype(integrityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.integrityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCredibilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_CredibilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		credibilityCharacteristics = new Text(parent, SWT.BORDER);
		GridData credibilityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		credibilityCharacteristics.setLayoutData(credibilityCharacteristicsData);
		credibilityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, credibilityCharacteristics.getText()));
			}

		});
		credibilityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, credibilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(credibilityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics);
		EditingUtils.setEEFtype(credibilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.credibilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLocalizationCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_LocalizationCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		localizationCharacteristics = new Text(parent, SWT.BORDER);
		GridData localizationCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		localizationCharacteristics.setLayoutData(localizationCharacteristicsData);
		localizationCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, localizationCharacteristics.getText()));
			}

		});
		localizationCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, localizationCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(localizationCharacteristics, ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics);
		EditingUtils.setEEFtype(localizationCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.localizationCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInternationalizationCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_InternationalizationCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		internationalizationCharacteristics = new Text(parent, SWT.BORDER);
		GridData internationalizationCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		internationalizationCharacteristics.setLayoutData(internationalizationCharacteristicsData);
		internationalizationCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, internationalizationCharacteristics.getText()));
			}

		});
		internationalizationCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, internationalizationCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(internationalizationCharacteristics, ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics);
		EditingUtils.setEEFtype(internationalizationCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.internationalizationCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInteroperabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_InteroperabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		interoperabilityCharacteristics = new Text(parent, SWT.BORDER);
		GridData interoperabilityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		interoperabilityCharacteristics.setLayoutData(interoperabilityCharacteristicsData);
		interoperabilityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, interoperabilityCharacteristics.getText()));
			}

		});
		interoperabilityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, interoperabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(interoperabilityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics);
		EditingUtils.setEEFtype(interoperabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.interoperabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createScalabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ScalabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		scalabilityCharacteristics = new Text(parent, SWT.BORDER);
		GridData scalabilityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		scalabilityCharacteristics.setLayoutData(scalabilityCharacteristicsData);
		scalabilityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, scalabilityCharacteristics.getText()));
			}

		});
		scalabilityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, scalabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(scalabilityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics);
		EditingUtils.setEEFtype(scalabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.scalabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPortabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_PortabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		portabilityCharacteristics = new Text(parent, SWT.BORDER);
		GridData portabilityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		portabilityCharacteristics.setLayoutData(portabilityCharacteristicsData);
		portabilityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, portabilityCharacteristics.getText()));
			}

		});
		portabilityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, portabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(portabilityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics);
		EditingUtils.setEEFtype(portabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.portabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExtensibilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ExtensibilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		extensibilityCharacteristics = new Text(parent, SWT.BORDER);
		GridData extensibilityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		extensibilityCharacteristics.setLayoutData(extensibilityCharacteristicsData);
		extensibilityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, extensibilityCharacteristics.getText()));
			}

		});
		extensibilityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, extensibilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(extensibilityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics);
		EditingUtils.setEEFtype(extensibilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.extensibilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCapacityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_CapacityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
		capacityCharacteristics = new Text(parent, SWT.BORDER);
		GridData capacityCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		capacityCharacteristics.setLayoutData(capacityCharacteristicsData);
		capacityCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capacityCharacteristics.getText()));
			}

		});
		capacityCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capacityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(capacityCharacteristics, ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics);
		EditingUtils.setEEFtype(capacityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.capacityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createThroughputText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ThroughputLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.throughput, ContentfwkViewsRepository.SWT_KIND));
		throughput = new Text(parent, SWT.BORDER);
		GridData throughputData = new GridData(GridData.FILL_HORIZONTAL);
		throughput.setLayoutData(throughputData);
		throughput.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.throughput, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughput.getText()));
			}

		});
		throughput.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.throughput, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughput.getText()));
				}
			}

		});
		EditingUtils.setID(throughput, ContentfwkViewsRepository.Contract.Attributes.throughput);
		EditingUtils.setEEFtype(throughput, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.throughput, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createThroughputPeriodText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_ThroughputPeriodLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.throughputPeriod, ContentfwkViewsRepository.SWT_KIND));
		throughputPeriod = new Text(parent, SWT.BORDER);
		GridData throughputPeriodData = new GridData(GridData.FILL_HORIZONTAL);
		throughputPeriod.setLayoutData(throughputPeriodData);
		throughputPeriod.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.throughputPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughputPeriod.getText()));
			}

		});
		throughputPeriod.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.throughputPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughputPeriod.getText()));
				}
			}

		});
		EditingUtils.setID(throughputPeriod, ContentfwkViewsRepository.Contract.Attributes.throughputPeriod);
		EditingUtils.setEEFtype(throughputPeriod, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.throughputPeriod, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGrowthText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_GrowthLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.growth, ContentfwkViewsRepository.SWT_KIND));
		growth = new Text(parent, SWT.BORDER);
		GridData growthData = new GridData(GridData.FILL_HORIZONTAL);
		growth.setLayoutData(growthData);
		growth.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.growth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, growth.getText()));
			}

		});
		growth.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.growth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, growth.getText()));
				}
			}

		});
		EditingUtils.setID(growth, ContentfwkViewsRepository.Contract.Attributes.growth);
		EditingUtils.setEEFtype(growth, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.growth, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGrowthPeriodText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_GrowthPeriodLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.growthPeriod, ContentfwkViewsRepository.SWT_KIND));
		growthPeriod = new Text(parent, SWT.BORDER);
		GridData growthPeriodData = new GridData(GridData.FILL_HORIZONTAL);
		growthPeriod.setLayoutData(growthPeriodData);
		growthPeriod.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.growthPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, growthPeriod.getText()));
			}

		});
		growthPeriod.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.growthPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, growthPeriod.getText()));
				}
			}

		});
		EditingUtils.setID(growthPeriod, ContentfwkViewsRepository.Contract.Attributes.growthPeriod);
		EditingUtils.setEEFtype(growthPeriod, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.growthPeriod, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPeakProfileShortTermText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_PeakProfileShortTermLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm, ContentfwkViewsRepository.SWT_KIND));
		peakProfileShortTerm = new Text(parent, SWT.BORDER);
		GridData peakProfileShortTermData = new GridData(GridData.FILL_HORIZONTAL);
		peakProfileShortTerm.setLayoutData(peakProfileShortTermData);
		peakProfileShortTerm.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, peakProfileShortTerm.getText()));
			}

		});
		peakProfileShortTerm.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, peakProfileShortTerm.getText()));
				}
			}

		});
		EditingUtils.setID(peakProfileShortTerm, ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm);
		EditingUtils.setEEFtype(peakProfileShortTerm, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.peakProfileShortTerm, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPeakProfileLongTermText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.ContractPropertiesEditionPart_PeakProfileLongTermLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm, ContentfwkViewsRepository.SWT_KIND));
		peakProfileLongTerm = new Text(parent, SWT.BORDER);
		GridData peakProfileLongTermData = new GridData(GridData.FILL_HORIZONTAL);
		peakProfileLongTerm.setLayoutData(peakProfileLongTermData);
		peakProfileLongTerm.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, peakProfileLongTerm.getText()));
			}

		});
		peakProfileLongTerm.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, peakProfileLongTerm.getText()));
				}
			}

		});
		EditingUtils.setID(peakProfileLongTerm, ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm);
		EditingUtils.setEEFtype(peakProfileLongTerm, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.Attributes.peakProfileLongTerm, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(Composite parent) {
		Group relatedElementsGroup = new Group(parent, SWT.NONE);
		relatedElementsGroup.setText(ContentfwkMessages.ContractPropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createGovernsAndMeasuresBusinessServicesAdvancedReferencesTable(Composite parent) {
		this.governsAndMeasuresBusinessServices = new ReferencesTable(ContentfwkMessages.ContractPropertiesEditionPart_GovernsAndMeasuresBusinessServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { addGovernsAndMeasuresBusinessServices(); }
			public void handleEdit(EObject element) { editGovernsAndMeasuresBusinessServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGovernsAndMeasuresBusinessServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGovernsAndMeasuresBusinessServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.governsAndMeasuresBusinessServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices, ContentfwkViewsRepository.SWT_KIND));
		this.governsAndMeasuresBusinessServices.createControls(parent);
		this.governsAndMeasuresBusinessServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData governsAndMeasuresBusinessServicesData = new GridData(GridData.FILL_HORIZONTAL);
		governsAndMeasuresBusinessServicesData.horizontalSpan = 3;
		this.governsAndMeasuresBusinessServices.setLayoutData(governsAndMeasuresBusinessServicesData);
		this.governsAndMeasuresBusinessServices.disableMove();
		governsAndMeasuresBusinessServices.setID(ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices);
		governsAndMeasuresBusinessServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addGovernsAndMeasuresBusinessServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(governsAndMeasuresBusinessServices.getInput(), governsAndMeasuresBusinessServicesFilters, governsAndMeasuresBusinessServicesBusinessFilters,
		"governs And Measures Business Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				governsAndMeasuresBusinessServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveGovernsAndMeasuresBusinessServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		governsAndMeasuresBusinessServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGovernsAndMeasuresBusinessServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.governsAndMeasuresBusinessServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		governsAndMeasuresBusinessServices.refresh();
	}

	/**
	 * 
	 */
	protected void editGovernsAndMeasuresBusinessServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				governsAndMeasuresBusinessServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMeetsServiceQualityAdvancedReferencesTable(Composite parent) {
		this.meetsServiceQuality = new ReferencesTable(ContentfwkMessages.ContractPropertiesEditionPart_MeetsServiceQualityLabel, new ReferencesTableListener() {
			public void handleAdd() { addMeetsServiceQuality(); }
			public void handleEdit(EObject element) { editMeetsServiceQuality(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMeetsServiceQuality(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMeetsServiceQuality(element); }
			public void navigateTo(EObject element) { }
		});
		this.meetsServiceQuality.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality, ContentfwkViewsRepository.SWT_KIND));
		this.meetsServiceQuality.createControls(parent);
		this.meetsServiceQuality.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData meetsServiceQualityData = new GridData(GridData.FILL_HORIZONTAL);
		meetsServiceQualityData.horizontalSpan = 3;
		this.meetsServiceQuality.setLayoutData(meetsServiceQualityData);
		this.meetsServiceQuality.disableMove();
		meetsServiceQuality.setID(ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality);
		meetsServiceQuality.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addMeetsServiceQuality() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(meetsServiceQuality.getInput(), meetsServiceQualityFilters, meetsServiceQualityBusinessFilters,
		"meets Service Quality", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				meetsServiceQuality.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMeetsServiceQuality(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		meetsServiceQuality.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMeetsServiceQuality(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.meetsServiceQuality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		meetsServiceQuality.refresh();
	}

	/**
	 * 
	 */
	protected void editMeetsServiceQuality(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				meetsServiceQuality.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesAdvancedReferencesTable(Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.ContractPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.RelatedElements.delegates, ContentfwkViewsRepository.SWT_KIND));
		this.delegates.createControls(parent);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.Contract.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.ContractPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.SWT_KIND));
		this.isDelegatedBy.createControls(parent);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContractPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Contract.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getServiceNameCaller()
	 * 
	 */
	public String getServiceNameCaller() {
		return serviceNameCaller.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setServiceNameCaller(String newValue)
	 * 
	 */
	public void setServiceNameCaller(String newValue) {
		if (newValue != null) {
			serviceNameCaller.setText(newValue);
		} else {
			serviceNameCaller.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getServiceNameCalled()
	 * 
	 */
	public String getServiceNameCalled() {
		return serviceNameCalled.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setServiceNameCalled(String newValue)
	 * 
	 */
	public void setServiceNameCalled(String newValue) {
		if (newValue != null) {
			serviceNameCalled.setText(newValue);
		} else {
			serviceNameCalled.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getBehaviorCharacteristics()
	 * 
	 */
	public String getBehaviorCharacteristics() {
		return behaviorCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setBehaviorCharacteristics(String newValue)
	 * 
	 */
	public void setBehaviorCharacteristics(String newValue) {
		if (newValue != null) {
			behaviorCharacteristics.setText(newValue);
		} else {
			behaviorCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getServiceQualityCharacteristics()
	 * 
	 */
	public String getServiceQualityCharacteristics() {
		return serviceQualityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setServiceQualityCharacteristics(String newValue)
	 * 
	 */
	public void setServiceQualityCharacteristics(String newValue) {
		if (newValue != null) {
			serviceQualityCharacteristics.setText(newValue);
		} else {
			serviceQualityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getAvailabilityQualityCharacteristics()
	 * 
	 */
	public String getAvailabilityQualityCharacteristics() {
		return availabilityQualityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setAvailabilityQualityCharacteristics(String newValue)
	 * 
	 */
	public void setAvailabilityQualityCharacteristics(String newValue) {
		if (newValue != null) {
			availabilityQualityCharacteristics.setText(newValue);
		} else {
			availabilityQualityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getServicesTimes()
	 * 
	 */
	public String getServicesTimes() {
		return servicesTimes.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setServicesTimes(String newValue)
	 * 
	 */
	public void setServicesTimes(String newValue) {
		if (newValue != null) {
			servicesTimes.setText(newValue);
		} else {
			servicesTimes.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getManageabilityCharacteristics()
	 * 
	 */
	public String getManageabilityCharacteristics() {
		return manageabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setManageabilityCharacteristics(String newValue)
	 * 
	 */
	public void setManageabilityCharacteristics(String newValue) {
		if (newValue != null) {
			manageabilityCharacteristics.setText(newValue);
		} else {
			manageabilityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getServiceabilityCharacteristics()
	 * 
	 */
	public String getServiceabilityCharacteristics() {
		return serviceabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setServiceabilityCharacteristics(String newValue)
	 * 
	 */
	public void setServiceabilityCharacteristics(String newValue) {
		if (newValue != null) {
			serviceabilityCharacteristics.setText(newValue);
		} else {
			serviceabilityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getPerformanceCharacteristics()
	 * 
	 */
	public String getPerformanceCharacteristics() {
		return performanceCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setPerformanceCharacteristics(String newValue)
	 * 
	 */
	public void setPerformanceCharacteristics(String newValue) {
		if (newValue != null) {
			performanceCharacteristics.setText(newValue);
		} else {
			performanceCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getResponseCharacteristics()
	 * 
	 */
	public String getResponseCharacteristics() {
		return responseCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setResponseCharacteristics(String newValue)
	 * 
	 */
	public void setResponseCharacteristics(String newValue) {
		if (newValue != null) {
			responseCharacteristics.setText(newValue);
		} else {
			responseCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getReliabilityCharacteristics()
	 * 
	 */
	public String getReliabilityCharacteristics() {
		return reliabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setReliabilityCharacteristics(String newValue)
	 * 
	 */
	public void setReliabilityCharacteristics(String newValue) {
		if (newValue != null) {
			reliabilityCharacteristics.setText(newValue);
		} else {
			reliabilityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getQualityOfInformationRequired()
	 * 
	 */
	public String getQualityOfInformationRequired() {
		return qualityOfInformationRequired.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setQualityOfInformationRequired(String newValue)
	 * 
	 */
	public void setQualityOfInformationRequired(String newValue) {
		if (newValue != null) {
			qualityOfInformationRequired.setText(newValue);
		} else {
			qualityOfInformationRequired.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getContractControlRequirements()
	 * 
	 */
	public String getContractControlRequirements() {
		return contractControlRequirements.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setContractControlRequirements(String newValue)
	 * 
	 */
	public void setContractControlRequirements(String newValue) {
		if (newValue != null) {
			contractControlRequirements.setText(newValue);
		} else {
			contractControlRequirements.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getResultControlRequirements()
	 * 
	 */
	public String getResultControlRequirements() {
		return resultControlRequirements.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setResultControlRequirements(String newValue)
	 * 
	 */
	public void setResultControlRequirements(String newValue) {
		if (newValue != null) {
			resultControlRequirements.setText(newValue);
		} else {
			resultControlRequirements.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getRecoverabilityCharacteristics()
	 * 
	 */
	public String getRecoverabilityCharacteristics() {
		return recoverabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setRecoverabilityCharacteristics(String newValue)
	 * 
	 */
	public void setRecoverabilityCharacteristics(String newValue) {
		if (newValue != null) {
			recoverabilityCharacteristics.setText(newValue);
		} else {
			recoverabilityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getLocatabilityCharacteristics()
	 * 
	 */
	public String getLocatabilityCharacteristics() {
		return locatabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setLocatabilityCharacteristics(String newValue)
	 * 
	 */
	public void setLocatabilityCharacteristics(String newValue) {
		if (newValue != null) {
			locatabilityCharacteristics.setText(newValue);
		} else {
			locatabilityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getSecurityCharacteristics()
	 * 
	 */
	public String getSecurityCharacteristics() {
		return securityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setSecurityCharacteristics(String newValue)
	 * 
	 */
	public void setSecurityCharacteristics(String newValue) {
		if (newValue != null) {
			securityCharacteristics.setText(newValue);
		} else {
			securityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getPrivacyCharacteristics()
	 * 
	 */
	public String getPrivacyCharacteristics() {
		return privacyCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setPrivacyCharacteristics(String newValue)
	 * 
	 */
	public void setPrivacyCharacteristics(String newValue) {
		if (newValue != null) {
			privacyCharacteristics.setText(newValue);
		} else {
			privacyCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getIntegrityCharacteristics()
	 * 
	 */
	public String getIntegrityCharacteristics() {
		return integrityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setIntegrityCharacteristics(String newValue)
	 * 
	 */
	public void setIntegrityCharacteristics(String newValue) {
		if (newValue != null) {
			integrityCharacteristics.setText(newValue);
		} else {
			integrityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getCredibilityCharacteristics()
	 * 
	 */
	public String getCredibilityCharacteristics() {
		return credibilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setCredibilityCharacteristics(String newValue)
	 * 
	 */
	public void setCredibilityCharacteristics(String newValue) {
		if (newValue != null) {
			credibilityCharacteristics.setText(newValue);
		} else {
			credibilityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getLocalizationCharacteristics()
	 * 
	 */
	public String getLocalizationCharacteristics() {
		return localizationCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setLocalizationCharacteristics(String newValue)
	 * 
	 */
	public void setLocalizationCharacteristics(String newValue) {
		if (newValue != null) {
			localizationCharacteristics.setText(newValue);
		} else {
			localizationCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getInternationalizationCharacteristics()
	 * 
	 */
	public String getInternationalizationCharacteristics() {
		return internationalizationCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setInternationalizationCharacteristics(String newValue)
	 * 
	 */
	public void setInternationalizationCharacteristics(String newValue) {
		if (newValue != null) {
			internationalizationCharacteristics.setText(newValue);
		} else {
			internationalizationCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getInteroperabilityCharacteristics()
	 * 
	 */
	public String getInteroperabilityCharacteristics() {
		return interoperabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setInteroperabilityCharacteristics(String newValue)
	 * 
	 */
	public void setInteroperabilityCharacteristics(String newValue) {
		if (newValue != null) {
			interoperabilityCharacteristics.setText(newValue);
		} else {
			interoperabilityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getScalabilityCharacteristics()
	 * 
	 */
	public String getScalabilityCharacteristics() {
		return scalabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setScalabilityCharacteristics(String newValue)
	 * 
	 */
	public void setScalabilityCharacteristics(String newValue) {
		if (newValue != null) {
			scalabilityCharacteristics.setText(newValue);
		} else {
			scalabilityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getPortabilityCharacteristics()
	 * 
	 */
	public String getPortabilityCharacteristics() {
		return portabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setPortabilityCharacteristics(String newValue)
	 * 
	 */
	public void setPortabilityCharacteristics(String newValue) {
		if (newValue != null) {
			portabilityCharacteristics.setText(newValue);
		} else {
			portabilityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getExtensibilityCharacteristics()
	 * 
	 */
	public String getExtensibilityCharacteristics() {
		return extensibilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setExtensibilityCharacteristics(String newValue)
	 * 
	 */
	public void setExtensibilityCharacteristics(String newValue) {
		if (newValue != null) {
			extensibilityCharacteristics.setText(newValue);
		} else {
			extensibilityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getCapacityCharacteristics()
	 * 
	 */
	public String getCapacityCharacteristics() {
		return capacityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setCapacityCharacteristics(String newValue)
	 * 
	 */
	public void setCapacityCharacteristics(String newValue) {
		if (newValue != null) {
			capacityCharacteristics.setText(newValue);
		} else {
			capacityCharacteristics.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getThroughput()
	 * 
	 */
	public String getThroughput() {
		return throughput.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setThroughput(String newValue)
	 * 
	 */
	public void setThroughput(String newValue) {
		if (newValue != null) {
			throughput.setText(newValue);
		} else {
			throughput.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getThroughputPeriod()
	 * 
	 */
	public String getThroughputPeriod() {
		return throughputPeriod.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setThroughputPeriod(String newValue)
	 * 
	 */
	public void setThroughputPeriod(String newValue) {
		if (newValue != null) {
			throughputPeriod.setText(newValue);
		} else {
			throughputPeriod.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getGrowth()
	 * 
	 */
	public String getGrowth() {
		return growth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setGrowth(String newValue)
	 * 
	 */
	public void setGrowth(String newValue) {
		if (newValue != null) {
			growth.setText(newValue);
		} else {
			growth.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getGrowthPeriod()
	 * 
	 */
	public String getGrowthPeriod() {
		return growthPeriod.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setGrowthPeriod(String newValue)
	 * 
	 */
	public void setGrowthPeriod(String newValue) {
		if (newValue != null) {
			growthPeriod.setText(newValue);
		} else {
			growthPeriod.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getPeakProfileShortTerm()
	 * 
	 */
	public String getPeakProfileShortTerm() {
		return peakProfileShortTerm.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setPeakProfileShortTerm(String newValue)
	 * 
	 */
	public void setPeakProfileShortTerm(String newValue) {
		if (newValue != null) {
			peakProfileShortTerm.setText(newValue);
		} else {
			peakProfileShortTerm.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#getPeakProfileLongTerm()
	 * 
	 */
	public String getPeakProfileLongTerm() {
		return peakProfileLongTerm.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#setPeakProfileLongTerm(String newValue)
	 * 
	 */
	public void setPeakProfileLongTerm(String newValue) {
		if (newValue != null) {
			peakProfileLongTerm.setText(newValue);
		} else {
			peakProfileLongTerm.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#initGovernsAndMeasuresBusinessServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGovernsAndMeasuresBusinessServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		governsAndMeasuresBusinessServices.setContentProvider(contentProvider);
		governsAndMeasuresBusinessServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#updateGovernsAndMeasuresBusinessServices()
	 * 
	 */
	public void updateGovernsAndMeasuresBusinessServices() {
	governsAndMeasuresBusinessServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#addFilterGovernsAndMeasuresBusinessServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGovernsAndMeasuresBusinessServices(ViewerFilter filter) {
		governsAndMeasuresBusinessServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#addBusinessFilterGovernsAndMeasuresBusinessServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGovernsAndMeasuresBusinessServices(ViewerFilter filter) {
		governsAndMeasuresBusinessServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#isContainedInGovernsAndMeasuresBusinessServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInGovernsAndMeasuresBusinessServicesTable(EObject element) {
		return ((ReferencesTableSettings)governsAndMeasuresBusinessServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#initMeetsServiceQuality(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMeetsServiceQuality(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		meetsServiceQuality.setContentProvider(contentProvider);
		meetsServiceQuality.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#updateMeetsServiceQuality()
	 * 
	 */
	public void updateMeetsServiceQuality() {
	meetsServiceQuality.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#addFilterMeetsServiceQuality(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMeetsServiceQuality(ViewerFilter filter) {
		meetsServiceQualityFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#addBusinessFilterMeetsServiceQuality(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMeetsServiceQuality(ViewerFilter filter) {
		meetsServiceQualityBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#isContainedInMeetsServiceQualityTable(EObject element)
	 * 
	 */
	public boolean isContainedInMeetsServiceQualityTable(EObject element) {
		return ((ReferencesTableSettings)meetsServiceQuality.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContractPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.Contract_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
