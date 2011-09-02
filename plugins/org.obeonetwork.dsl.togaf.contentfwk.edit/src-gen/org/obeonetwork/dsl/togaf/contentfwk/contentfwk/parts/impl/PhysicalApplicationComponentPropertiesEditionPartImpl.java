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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class PhysicalApplicationComponentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PhysicalApplicationComponentPropertiesEditionPart {

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
	protected EMFComboViewer lifeCycleStatus;
	protected Text initialLiveDate;
	protected Text dateOfLastRelease;
	protected Text dateOfNextRelease;
	protected Text retirementDate;
	protected Text servicesTimes;
	protected Text throughput;
	protected Text throughputPeriod;
	protected Text growth;
	protected Text growthPeriod;
	protected Text peakProfileShortTerm;
	protected Text peakProfileLongTerm;
	protected Text availabilityQualityCharacteristics;
	protected Text manageabilityCharacteristics;
	protected Text serviceabilityCharacteristics;
	protected Text performanceCharacteristics;
	protected Text reliabilityCharacteristics;
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
	protected EObjectFlatComboViewer decomposesPhysicalApplicationComponent;
	protected ReferencesTable encapsulatesPhysicalDataComponents;
	protected List<ViewerFilter> encapsulatesPhysicalDataComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> encapsulatesPhysicalDataComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isRealizedByPhysicalTechnologyComponents;
	protected List<ViewerFilter> isRealizedByPhysicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isRealizedByPhysicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable extendsLogicalApplicationComponents;
	protected List<ViewerFilter> extendsLogicalApplicationComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> extendsLogicalApplicationComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isHostedInLocation;
	protected List<ViewerFilter> isHostedInLocationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isHostedInLocationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable communicatesWith;
	protected List<ViewerFilter> communicatesWithBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> communicatesWithFilters = new ArrayList<ViewerFilter>();
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
	public PhysicalApplicationComponentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence physicalApplicationComponentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = physicalApplicationComponentStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardClass);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm);
		CompositionStep characteristicsStep = attributesStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.class);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics);
		characteristicsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics);
		
		
		CompositionStep relatedElementsStep = physicalApplicationComponentStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.decomposesPhysicalApplicationComponent);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(physicalApplicationComponentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.class) {
					return createAttributesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name) {
					return createNameText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD) {
					return createIDText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description) {
					return createDescriptionText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category) {
					return createCategoryText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source) {
					return createSourceText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner) {
					return createOwnerText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardClass) {
					return createStandardClassEMFComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate) {
					return createStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate) {
					return createLastStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate) {
					return createNextStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate) {
					return createRetireDateText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus) {
					return createLifeCycleStatusEMFComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate) {
					return createInitialLiveDateText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease) {
					return createDateOfLastReleaseText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease) {
					return createDateOfNextReleaseText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate) {
					return createRetirementDateText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes) {
					return createServicesTimesText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput) {
					return createThroughputText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod) {
					return createThroughputPeriodText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth) {
					return createGrowthText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod) {
					return createGrowthPeriodText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm) {
					return createPeakProfileShortTermText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm) {
					return createPeakProfileLongTermText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.class) {
					return createCharacteristicsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics) {
					return createAvailabilityQualityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics) {
					return createManageabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics) {
					return createServiceabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics) {
					return createPerformanceCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics) {
					return createReliabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics) {
					return createRecoverabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics) {
					return createLocatabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics) {
					return createSecurityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics) {
					return createPrivacyCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics) {
					return createIntegrityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics) {
					return createCredibilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics) {
					return createLocalizationCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics) {
					return createInternationalizationCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics) {
					return createInteroperabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics) {
					return createScalabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics) {
					return createPortabilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics) {
					return createExtensibilityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics) {
					return createCapacityCharacteristicsText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.class) {
					return createRelatedElementsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.decomposesPhysicalApplicationComponent) {
					return createDecomposesPhysicalApplicationComponentFlatComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents) {
					return createEncapsulatesPhysicalDataComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents) {
					return createIsRealizedByPhysicalTechnologyComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents) {
					return createExtendsLogicalApplicationComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation) {
					return createIsHostedInLocationAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith) {
					return createCommunicatesWithAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates) {
					return createDelegatesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy) {
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
		attributesGroup.setText(ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_AttributesGroupLabel);
		GridData attributesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		attributesGroupData.horizontalSpan = 3;
		attributesGroup.setLayoutData(attributesGroupData);
		GridLayout attributesGroupLayout = new GridLayout();
		attributesGroupLayout.numColumns = 3;
		attributesGroup.setLayout(attributesGroupLayout);
		return attributesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.name, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}

		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.iD, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.description, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}

		});
		EditingUtils.setID(category, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.category, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}

		});
		EditingUtils.setID(source, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.source, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}

		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.owner, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardClassEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_StandardClassLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardClass, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStandardClass()));
			}

		});
		standardClass.setID(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardClass);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardClass, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_StandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(standardCreationDate, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate);
		EditingUtils.setEEFtype(standardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.standardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLastStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_LastStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(lastStandardCreationDate, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate);
		EditingUtils.setEEFtype(lastStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNextStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_NextStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(nextStandardCreationDate, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate);
		EditingUtils.setEEFtype(nextStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRetireDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_RetireDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
				}
			}

		});
		EditingUtils.setID(retireDate, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate);
		EditingUtils.setEEFtype(retireDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retireDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLifeCycleStatusEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_LifeCycleStatusLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus, ContentfwkViewsRepository.SWT_KIND));
		lifeCycleStatus = new EMFComboViewer(parent);
		lifeCycleStatus.setContentProvider(new ArrayContentProvider());
		lifeCycleStatus.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData lifeCycleStatusData = new GridData(GridData.FILL_HORIZONTAL);
		lifeCycleStatus.getCombo().setLayoutData(lifeCycleStatusData);
		lifeCycleStatus.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLifeCycleStatus()));
			}

		});
		lifeCycleStatus.setID(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.lifeCycleStatus, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInitialLiveDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_InitialLiveDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate, ContentfwkViewsRepository.SWT_KIND));
		initialLiveDate = new Text(parent, SWT.BORDER);
		GridData initialLiveDateData = new GridData(GridData.FILL_HORIZONTAL);
		initialLiveDate.setLayoutData(initialLiveDateData);
		initialLiveDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, initialLiveDate.getText()));
			}

		});
		initialLiveDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, initialLiveDate.getText()));
				}
			}

		});
		EditingUtils.setID(initialLiveDate, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate);
		EditingUtils.setEEFtype(initialLiveDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.initialLiveDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDateOfLastReleaseText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_DateOfLastReleaseLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease, ContentfwkViewsRepository.SWT_KIND));
		dateOfLastRelease = new Text(parent, SWT.BORDER);
		GridData dateOfLastReleaseData = new GridData(GridData.FILL_HORIZONTAL);
		dateOfLastRelease.setLayoutData(dateOfLastReleaseData);
		dateOfLastRelease.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dateOfLastRelease.getText()));
			}

		});
		dateOfLastRelease.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dateOfLastRelease.getText()));
				}
			}

		});
		EditingUtils.setID(dateOfLastRelease, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease);
		EditingUtils.setEEFtype(dateOfLastRelease, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfLastRelease, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDateOfNextReleaseText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_DateOfNextReleaseLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease, ContentfwkViewsRepository.SWT_KIND));
		dateOfNextRelease = new Text(parent, SWT.BORDER);
		GridData dateOfNextReleaseData = new GridData(GridData.FILL_HORIZONTAL);
		dateOfNextRelease.setLayoutData(dateOfNextReleaseData);
		dateOfNextRelease.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dateOfNextRelease.getText()));
			}

		});
		dateOfNextRelease.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dateOfNextRelease.getText()));
				}
			}

		});
		EditingUtils.setID(dateOfNextRelease, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease);
		EditingUtils.setEEFtype(dateOfNextRelease, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.dateOfNextRelease, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRetirementDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_RetirementDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate, ContentfwkViewsRepository.SWT_KIND));
		retirementDate = new Text(parent, SWT.BORDER);
		GridData retirementDateData = new GridData(GridData.FILL_HORIZONTAL);
		retirementDate.setLayoutData(retirementDateData);
		retirementDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retirementDate.getText()));
			}

		});
		retirementDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retirementDate.getText()));
				}
			}

		});
		EditingUtils.setID(retirementDate, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate);
		EditingUtils.setEEFtype(retirementDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.retirementDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createServicesTimesText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_ServicesTimesLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, servicesTimes.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, servicesTimes.getText()));
				}
			}

		});
		EditingUtils.setID(servicesTimes, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes);
		EditingUtils.setEEFtype(servicesTimes, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.servicesTimes, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createThroughputText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_ThroughputLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughput.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughput.getText()));
				}
			}

		});
		EditingUtils.setID(throughput, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput);
		EditingUtils.setEEFtype(throughput, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughput, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createThroughputPeriodText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_ThroughputPeriodLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughputPeriod.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughputPeriod.getText()));
				}
			}

		});
		EditingUtils.setID(throughputPeriod, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod);
		EditingUtils.setEEFtype(throughputPeriod, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.throughputPeriod, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGrowthText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_GrowthLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, growth.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, growth.getText()));
				}
			}

		});
		EditingUtils.setID(growth, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth);
		EditingUtils.setEEFtype(growth, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growth, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGrowthPeriodText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_GrowthPeriodLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, growthPeriod.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, growthPeriod.getText()));
				}
			}

		});
		EditingUtils.setID(growthPeriod, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod);
		EditingUtils.setEEFtype(growthPeriod, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.growthPeriod, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPeakProfileShortTermText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_PeakProfileShortTermLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, peakProfileShortTerm.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, peakProfileShortTerm.getText()));
				}
			}

		});
		EditingUtils.setID(peakProfileShortTerm, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm);
		EditingUtils.setEEFtype(peakProfileShortTerm, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileShortTerm, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPeakProfileLongTermText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_PeakProfileLongTermLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, peakProfileLongTerm.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, peakProfileLongTerm.getText()));
				}
			}

		});
		EditingUtils.setID(peakProfileLongTerm, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm);
		EditingUtils.setEEFtype(peakProfileLongTerm, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.peakProfileLongTerm, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCharacteristicsGroup(Composite parent) {
		Group characteristicsGroup = new Group(parent, SWT.NONE);
		characteristicsGroup.setText(ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_CharacteristicsGroupLabel);
		GridData characteristicsGroupData = new GridData(GridData.FILL_HORIZONTAL);
		characteristicsGroupData.horizontalSpan = 3;
		characteristicsGroup.setLayoutData(characteristicsGroupData);
		GridLayout characteristicsGroupLayout = new GridLayout();
		characteristicsGroupLayout.numColumns = 3;
		characteristicsGroup.setLayout(characteristicsGroupLayout);
		return characteristicsGroup;
	}

	
	protected Composite createAvailabilityQualityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_AvailabilityQualityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availabilityQualityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, availabilityQualityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(availabilityQualityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics);
		EditingUtils.setEEFtype(availabilityQualityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.availabilityQualityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createManageabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_ManageabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, manageabilityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, manageabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(manageabilityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics);
		EditingUtils.setEEFtype(manageabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.manageabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createServiceabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_ServiceabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceabilityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(serviceabilityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics);
		EditingUtils.setEEFtype(serviceabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.serviceabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPerformanceCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_PerformanceCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, performanceCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, performanceCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(performanceCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics);
		EditingUtils.setEEFtype(performanceCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.performanceCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createReliabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_ReliabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reliabilityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reliabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(reliabilityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics);
		EditingUtils.setEEFtype(reliabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.reliabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRecoverabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_RecoverabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, recoverabilityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, recoverabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(recoverabilityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics);
		EditingUtils.setEEFtype(recoverabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.recoverabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLocatabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_LocatabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locatabilityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locatabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(locatabilityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics);
		EditingUtils.setEEFtype(locatabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.locatabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSecurityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_SecurityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, securityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, securityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(securityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics);
		EditingUtils.setEEFtype(securityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.securityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPrivacyCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_PrivacyCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, privacyCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, privacyCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(privacyCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics);
		EditingUtils.setEEFtype(privacyCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.privacyCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIntegrityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_IntegrityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, integrityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, integrityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(integrityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics);
		EditingUtils.setEEFtype(integrityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.integrityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCredibilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_CredibilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, credibilityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, credibilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(credibilityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics);
		EditingUtils.setEEFtype(credibilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.credibilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLocalizationCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_LocalizationCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, localizationCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, localizationCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(localizationCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics);
		EditingUtils.setEEFtype(localizationCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.localizationCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInternationalizationCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_InternationalizationCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, internationalizationCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, internationalizationCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(internationalizationCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics);
		EditingUtils.setEEFtype(internationalizationCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.internationalizationCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInteroperabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_InteroperabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, interoperabilityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, interoperabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(interoperabilityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics);
		EditingUtils.setEEFtype(interoperabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.interoperabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createScalabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_ScalabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, scalabilityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, scalabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(scalabilityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics);
		EditingUtils.setEEFtype(scalabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.scalabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPortabilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_PortabilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, portabilityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, portabilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(portabilityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics);
		EditingUtils.setEEFtype(portabilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.portabilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExtensibilityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_ExtensibilityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, extensibilityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, extensibilityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(extensibilityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics);
		EditingUtils.setEEFtype(extensibilityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.extensibilityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCapacityCharacteristicsText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_CapacityCharacteristicsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capacityCharacteristics.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capacityCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(capacityCharacteristics, ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics);
		EditingUtils.setEEFtype(capacityCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.Attributes.Characteristics.capacityCharacteristics, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(Composite parent) {
		Group relatedElementsGroup = new Group(parent, SWT.NONE);
		relatedElementsGroup.setText(ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createDecomposesPhysicalApplicationComponentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_DecomposesPhysicalApplicationComponentLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.decomposesPhysicalApplicationComponent, ContentfwkViewsRepository.SWT_KIND));
		decomposesPhysicalApplicationComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.decomposesPhysicalApplicationComponent, ContentfwkViewsRepository.SWT_KIND));
		decomposesPhysicalApplicationComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		decomposesPhysicalApplicationComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.decomposesPhysicalApplicationComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecomposesPhysicalApplicationComponent()));
			}

		});
		GridData decomposesPhysicalApplicationComponentData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesPhysicalApplicationComponent.setLayoutData(decomposesPhysicalApplicationComponentData);
		decomposesPhysicalApplicationComponent.setID(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.decomposesPhysicalApplicationComponent);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.decomposesPhysicalApplicationComponent, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createEncapsulatesPhysicalDataComponentsAdvancedReferencesTable(Composite parent) {
		this.encapsulatesPhysicalDataComponents = new ReferencesTable(ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_EncapsulatesPhysicalDataComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addEncapsulatesPhysicalDataComponents(); }
			public void handleEdit(EObject element) { editEncapsulatesPhysicalDataComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveEncapsulatesPhysicalDataComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromEncapsulatesPhysicalDataComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.encapsulatesPhysicalDataComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents, ContentfwkViewsRepository.SWT_KIND));
		this.encapsulatesPhysicalDataComponents.createControls(parent);
		this.encapsulatesPhysicalDataComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData encapsulatesPhysicalDataComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		encapsulatesPhysicalDataComponentsData.horizontalSpan = 3;
		this.encapsulatesPhysicalDataComponents.setLayoutData(encapsulatesPhysicalDataComponentsData);
		this.encapsulatesPhysicalDataComponents.disableMove();
		encapsulatesPhysicalDataComponents.setID(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents);
		encapsulatesPhysicalDataComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEncapsulatesPhysicalDataComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(encapsulatesPhysicalDataComponents.getInput(), encapsulatesPhysicalDataComponentsFilters, encapsulatesPhysicalDataComponentsBusinessFilters,
		"encapsulates Physical Data Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				encapsulatesPhysicalDataComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveEncapsulatesPhysicalDataComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		encapsulatesPhysicalDataComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEncapsulatesPhysicalDataComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.encapsulatesPhysicalDataComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		encapsulatesPhysicalDataComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editEncapsulatesPhysicalDataComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				encapsulatesPhysicalDataComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsRealizedByPhysicalTechnologyComponentsAdvancedReferencesTable(Composite parent) {
		this.isRealizedByPhysicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_IsRealizedByPhysicalTechnologyComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsRealizedByPhysicalTechnologyComponents(); }
			public void handleEdit(EObject element) { editIsRealizedByPhysicalTechnologyComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsRealizedByPhysicalTechnologyComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsRealizedByPhysicalTechnologyComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.isRealizedByPhysicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents, ContentfwkViewsRepository.SWT_KIND));
		this.isRealizedByPhysicalTechnologyComponents.createControls(parent);
		this.isRealizedByPhysicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isRealizedByPhysicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		isRealizedByPhysicalTechnologyComponentsData.horizontalSpan = 3;
		this.isRealizedByPhysicalTechnologyComponents.setLayoutData(isRealizedByPhysicalTechnologyComponentsData);
		this.isRealizedByPhysicalTechnologyComponents.disableMove();
		isRealizedByPhysicalTechnologyComponents.setID(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents);
		isRealizedByPhysicalTechnologyComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsRealizedByPhysicalTechnologyComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isRealizedByPhysicalTechnologyComponents.getInput(), isRealizedByPhysicalTechnologyComponentsFilters, isRealizedByPhysicalTechnologyComponentsBusinessFilters,
		"is Realized By Physical Technology Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isRealizedByPhysicalTechnologyComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsRealizedByPhysicalTechnologyComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isRealizedByPhysicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsRealizedByPhysicalTechnologyComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isRealizedByPhysicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editIsRealizedByPhysicalTechnologyComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isRealizedByPhysicalTechnologyComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createExtendsLogicalApplicationComponentsAdvancedReferencesTable(Composite parent) {
		this.extendsLogicalApplicationComponents = new ReferencesTable(ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_ExtendsLogicalApplicationComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addExtendsLogicalApplicationComponents(); }
			public void handleEdit(EObject element) { editExtendsLogicalApplicationComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtendsLogicalApplicationComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtendsLogicalApplicationComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.extendsLogicalApplicationComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents, ContentfwkViewsRepository.SWT_KIND));
		this.extendsLogicalApplicationComponents.createControls(parent);
		this.extendsLogicalApplicationComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extendsLogicalApplicationComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		extendsLogicalApplicationComponentsData.horizontalSpan = 3;
		this.extendsLogicalApplicationComponents.setLayoutData(extendsLogicalApplicationComponentsData);
		this.extendsLogicalApplicationComponents.disableMove();
		extendsLogicalApplicationComponents.setID(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents);
		extendsLogicalApplicationComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addExtendsLogicalApplicationComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(extendsLogicalApplicationComponents.getInput(), extendsLogicalApplicationComponentsFilters, extendsLogicalApplicationComponentsBusinessFilters,
		"extends Logical Application Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				extendsLogicalApplicationComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveExtendsLogicalApplicationComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extendsLogicalApplicationComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtendsLogicalApplicationComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.extendsLogicalApplicationComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		extendsLogicalApplicationComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editExtendsLogicalApplicationComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				extendsLogicalApplicationComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsHostedInLocationAdvancedReferencesTable(Composite parent) {
		this.isHostedInLocation = new ReferencesTable(ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_IsHostedInLocationLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsHostedInLocation(); }
			public void handleEdit(EObject element) { editIsHostedInLocation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsHostedInLocation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsHostedInLocation(element); }
			public void navigateTo(EObject element) { }
		});
		this.isHostedInLocation.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation, ContentfwkViewsRepository.SWT_KIND));
		this.isHostedInLocation.createControls(parent);
		this.isHostedInLocation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isHostedInLocationData = new GridData(GridData.FILL_HORIZONTAL);
		isHostedInLocationData.horizontalSpan = 3;
		this.isHostedInLocation.setLayoutData(isHostedInLocationData);
		this.isHostedInLocation.disableMove();
		isHostedInLocation.setID(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation);
		isHostedInLocation.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsHostedInLocation() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isHostedInLocation.getInput(), isHostedInLocationFilters, isHostedInLocationBusinessFilters,
		"is Hosted In Location", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isHostedInLocation.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsHostedInLocation(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isHostedInLocation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsHostedInLocation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isHostedInLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isHostedInLocation.refresh();
	}

	/**
	 * 
	 */
	protected void editIsHostedInLocation(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isHostedInLocation.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCommunicatesWithAdvancedReferencesTable(Composite parent) {
		this.communicatesWith = new ReferencesTable(ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_CommunicatesWithLabel, new ReferencesTableListener() {
			public void handleAdd() { addCommunicatesWith(); }
			public void handleEdit(EObject element) { editCommunicatesWith(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCommunicatesWith(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCommunicatesWith(element); }
			public void navigateTo(EObject element) { }
		});
		this.communicatesWith.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith, ContentfwkViewsRepository.SWT_KIND));
		this.communicatesWith.createControls(parent);
		this.communicatesWith.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData communicatesWithData = new GridData(GridData.FILL_HORIZONTAL);
		communicatesWithData.horizontalSpan = 3;
		this.communicatesWith.setLayoutData(communicatesWithData);
		this.communicatesWith.disableMove();
		communicatesWith.setID(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith);
		communicatesWith.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCommunicatesWith() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(communicatesWith.getInput(), communicatesWithFilters, communicatesWithBusinessFilters,
		"communicates With", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				communicatesWith.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCommunicatesWith(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		communicatesWith.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCommunicatesWith(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.communicatesWith, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		communicatesWith.refresh();
	}

	/**
	 * 
	 */
	protected void editCommunicatesWith(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				communicatesWith.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesAdvancedReferencesTable(Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates, ContentfwkViewsRepository.SWT_KIND));
		this.delegates.createControls(parent);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.PhysicalApplicationComponentPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.SWT_KIND));
		this.isDelegatedBy.createControls(parent);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalApplicationComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalApplicationComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getStandardClass()
	 * 
	 */
	public Enumerator getStandardClass() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) standardClass.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#initStandardClass(EEnum eenum, Enumerator current)
	 */
	public void initStandardClass(EEnum eenum, Enumerator current) {
		standardClass.setInput(eenum.getELiterals());
		standardClass.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setStandardClass(Enumerator newValue)
	 * 
	 */
	public void setStandardClass(Enumerator newValue) {
		standardClass.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getStandardCreationDate()
	 * 
	 */
	public String getStandardCreationDate() {
		return standardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getLastStandardCreationDate()
	 * 
	 */
	public String getLastStandardCreationDate() {
		return lastStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setLastStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getNextStandardCreationDate()
	 * 
	 */
	public String getNextStandardCreationDate() {
		return nextStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setNextStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getRetireDate()
	 * 
	 */
	public String getRetireDate() {
		return retireDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setRetireDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getLifeCycleStatus()
	 * 
	 */
	public Enumerator getLifeCycleStatus() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) lifeCycleStatus.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#initLifeCycleStatus(EEnum eenum, Enumerator current)
	 */
	public void initLifeCycleStatus(EEnum eenum, Enumerator current) {
		lifeCycleStatus.setInput(eenum.getELiterals());
		lifeCycleStatus.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setLifeCycleStatus(Enumerator newValue)
	 * 
	 */
	public void setLifeCycleStatus(Enumerator newValue) {
		lifeCycleStatus.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getInitialLiveDate()
	 * 
	 */
	public String getInitialLiveDate() {
		return initialLiveDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setInitialLiveDate(String newValue)
	 * 
	 */
	public void setInitialLiveDate(String newValue) {
		if (newValue != null) {
			initialLiveDate.setText(newValue);
		} else {
			initialLiveDate.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getDateOfLastRelease()
	 * 
	 */
	public String getDateOfLastRelease() {
		return dateOfLastRelease.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setDateOfLastRelease(String newValue)
	 * 
	 */
	public void setDateOfLastRelease(String newValue) {
		if (newValue != null) {
			dateOfLastRelease.setText(newValue);
		} else {
			dateOfLastRelease.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getDateOfNextRelease()
	 * 
	 */
	public String getDateOfNextRelease() {
		return dateOfNextRelease.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setDateOfNextRelease(String newValue)
	 * 
	 */
	public void setDateOfNextRelease(String newValue) {
		if (newValue != null) {
			dateOfNextRelease.setText(newValue);
		} else {
			dateOfNextRelease.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getRetirementDate()
	 * 
	 */
	public String getRetirementDate() {
		return retirementDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setRetirementDate(String newValue)
	 * 
	 */
	public void setRetirementDate(String newValue) {
		if (newValue != null) {
			retirementDate.setText(newValue);
		} else {
			retirementDate.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getServicesTimes()
	 * 
	 */
	public String getServicesTimes() {
		return servicesTimes.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setServicesTimes(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getThroughput()
	 * 
	 */
	public String getThroughput() {
		return throughput.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setThroughput(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getThroughputPeriod()
	 * 
	 */
	public String getThroughputPeriod() {
		return throughputPeriod.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setThroughputPeriod(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getGrowth()
	 * 
	 */
	public String getGrowth() {
		return growth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setGrowth(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getGrowthPeriod()
	 * 
	 */
	public String getGrowthPeriod() {
		return growthPeriod.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setGrowthPeriod(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getPeakProfileShortTerm()
	 * 
	 */
	public String getPeakProfileShortTerm() {
		return peakProfileShortTerm.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setPeakProfileShortTerm(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getPeakProfileLongTerm()
	 * 
	 */
	public String getPeakProfileLongTerm() {
		return peakProfileLongTerm.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setPeakProfileLongTerm(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getAvailabilityQualityCharacteristics()
	 * 
	 */
	public String getAvailabilityQualityCharacteristics() {
		return availabilityQualityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setAvailabilityQualityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getManageabilityCharacteristics()
	 * 
	 */
	public String getManageabilityCharacteristics() {
		return manageabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setManageabilityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getServiceabilityCharacteristics()
	 * 
	 */
	public String getServiceabilityCharacteristics() {
		return serviceabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setServiceabilityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getPerformanceCharacteristics()
	 * 
	 */
	public String getPerformanceCharacteristics() {
		return performanceCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setPerformanceCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getReliabilityCharacteristics()
	 * 
	 */
	public String getReliabilityCharacteristics() {
		return reliabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setReliabilityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getRecoverabilityCharacteristics()
	 * 
	 */
	public String getRecoverabilityCharacteristics() {
		return recoverabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setRecoverabilityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getLocatabilityCharacteristics()
	 * 
	 */
	public String getLocatabilityCharacteristics() {
		return locatabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setLocatabilityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getSecurityCharacteristics()
	 * 
	 */
	public String getSecurityCharacteristics() {
		return securityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setSecurityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getPrivacyCharacteristics()
	 * 
	 */
	public String getPrivacyCharacteristics() {
		return privacyCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setPrivacyCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getIntegrityCharacteristics()
	 * 
	 */
	public String getIntegrityCharacteristics() {
		return integrityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setIntegrityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getCredibilityCharacteristics()
	 * 
	 */
	public String getCredibilityCharacteristics() {
		return credibilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setCredibilityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getLocalizationCharacteristics()
	 * 
	 */
	public String getLocalizationCharacteristics() {
		return localizationCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setLocalizationCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getInternationalizationCharacteristics()
	 * 
	 */
	public String getInternationalizationCharacteristics() {
		return internationalizationCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setInternationalizationCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getInteroperabilityCharacteristics()
	 * 
	 */
	public String getInteroperabilityCharacteristics() {
		return interoperabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setInteroperabilityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getScalabilityCharacteristics()
	 * 
	 */
	public String getScalabilityCharacteristics() {
		return scalabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setScalabilityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getPortabilityCharacteristics()
	 * 
	 */
	public String getPortabilityCharacteristics() {
		return portabilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setPortabilityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getExtensibilityCharacteristics()
	 * 
	 */
	public String getExtensibilityCharacteristics() {
		return extensibilityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setExtensibilityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getCapacityCharacteristics()
	 * 
	 */
	public String getCapacityCharacteristics() {
		return capacityCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setCapacityCharacteristics(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#getDecomposesPhysicalApplicationComponent()
	 * 
	 */
	public EObject getDecomposesPhysicalApplicationComponent() {
		if (decomposesPhysicalApplicationComponent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decomposesPhysicalApplicationComponent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#initDecomposesPhysicalApplicationComponent(EObjectFlatComboSettings)
	 */
	public void initDecomposesPhysicalApplicationComponent(EObjectFlatComboSettings settings) {
		decomposesPhysicalApplicationComponent.setInput(settings);
		if (current != null) {
			decomposesPhysicalApplicationComponent.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setDecomposesPhysicalApplicationComponent(EObject newValue)
	 * 
	 */
	public void setDecomposesPhysicalApplicationComponent(EObject newValue) {
		if (newValue != null) {
			decomposesPhysicalApplicationComponent.setSelection(new StructuredSelection(newValue));
		} else {
			decomposesPhysicalApplicationComponent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#setDecomposesPhysicalApplicationComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecomposesPhysicalApplicationComponentButtonMode(ButtonsModeEnum newValue) {
		decomposesPhysicalApplicationComponent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addFilterDecomposesPhysicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesPhysicalApplicationComponent(ViewerFilter filter) {
		decomposesPhysicalApplicationComponent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addBusinessFilterDecomposesPhysicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesPhysicalApplicationComponent(ViewerFilter filter) {
		decomposesPhysicalApplicationComponent.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#initEncapsulatesPhysicalDataComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEncapsulatesPhysicalDataComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		encapsulatesPhysicalDataComponents.setContentProvider(contentProvider);
		encapsulatesPhysicalDataComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#updateEncapsulatesPhysicalDataComponents()
	 * 
	 */
	public void updateEncapsulatesPhysicalDataComponents() {
	encapsulatesPhysicalDataComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addFilterEncapsulatesPhysicalDataComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEncapsulatesPhysicalDataComponents(ViewerFilter filter) {
		encapsulatesPhysicalDataComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addBusinessFilterEncapsulatesPhysicalDataComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEncapsulatesPhysicalDataComponents(ViewerFilter filter) {
		encapsulatesPhysicalDataComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#isContainedInEncapsulatesPhysicalDataComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEncapsulatesPhysicalDataComponentsTable(EObject element) {
		return ((ReferencesTableSettings)encapsulatesPhysicalDataComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#initIsRealizedByPhysicalTechnologyComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsRealizedByPhysicalTechnologyComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isRealizedByPhysicalTechnologyComponents.setContentProvider(contentProvider);
		isRealizedByPhysicalTechnologyComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#updateIsRealizedByPhysicalTechnologyComponents()
	 * 
	 */
	public void updateIsRealizedByPhysicalTechnologyComponents() {
	isRealizedByPhysicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addFilterIsRealizedByPhysicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsRealizedByPhysicalTechnologyComponents(ViewerFilter filter) {
		isRealizedByPhysicalTechnologyComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addBusinessFilterIsRealizedByPhysicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsRealizedByPhysicalTechnologyComponents(ViewerFilter filter) {
		isRealizedByPhysicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#isContainedInIsRealizedByPhysicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsRealizedByPhysicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)isRealizedByPhysicalTechnologyComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#initExtendsLogicalApplicationComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initExtendsLogicalApplicationComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		extendsLogicalApplicationComponents.setContentProvider(contentProvider);
		extendsLogicalApplicationComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#updateExtendsLogicalApplicationComponents()
	 * 
	 */
	public void updateExtendsLogicalApplicationComponents() {
	extendsLogicalApplicationComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addFilterExtendsLogicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtendsLogicalApplicationComponents(ViewerFilter filter) {
		extendsLogicalApplicationComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addBusinessFilterExtendsLogicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtendsLogicalApplicationComponents(ViewerFilter filter) {
		extendsLogicalApplicationComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#isContainedInExtendsLogicalApplicationComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtendsLogicalApplicationComponentsTable(EObject element) {
		return ((ReferencesTableSettings)extendsLogicalApplicationComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#initIsHostedInLocation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsHostedInLocation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isHostedInLocation.setContentProvider(contentProvider);
		isHostedInLocation.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#updateIsHostedInLocation()
	 * 
	 */
	public void updateIsHostedInLocation() {
	isHostedInLocation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addFilterIsHostedInLocation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsHostedInLocation(ViewerFilter filter) {
		isHostedInLocationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addBusinessFilterIsHostedInLocation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsHostedInLocation(ViewerFilter filter) {
		isHostedInLocationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#isContainedInIsHostedInLocationTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsHostedInLocationTable(EObject element) {
		return ((ReferencesTableSettings)isHostedInLocation.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#initCommunicatesWith(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCommunicatesWith(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		communicatesWith.setContentProvider(contentProvider);
		communicatesWith.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#updateCommunicatesWith()
	 * 
	 */
	public void updateCommunicatesWith() {
	communicatesWith.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addFilterCommunicatesWith(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommunicatesWith(ViewerFilter filter) {
		communicatesWithFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addBusinessFilterCommunicatesWith(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommunicatesWith(ViewerFilter filter) {
		communicatesWithBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#isContainedInCommunicatesWithTable(EObject element)
	 * 
	 */
	public boolean isContainedInCommunicatesWithTable(EObject element) {
		return ((ReferencesTableSettings)communicatesWith.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalApplicationComponentPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.PhysicalApplicationComponent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
