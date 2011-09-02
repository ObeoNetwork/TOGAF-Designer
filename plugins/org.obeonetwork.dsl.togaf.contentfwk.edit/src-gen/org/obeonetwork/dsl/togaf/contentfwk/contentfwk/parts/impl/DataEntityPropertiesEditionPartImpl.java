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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class DataEntityPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DataEntityPropertiesEditionPart {

	protected Text name;
	protected Text iD;
	protected Text description;
	protected Text category;
	protected Text source;
	protected Text owner;
	protected EMFComboViewer dataEntityCategory;
	protected Text privacyClassification;
	protected Text retentionClassification;
	protected EObjectFlatComboViewer decomposeEntity;
	protected ReferencesTable relatesTo;
	protected List<ViewerFilter> relatesToBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> relatesToFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer residesWithinLogicalDataComponent;
	protected ReferencesTable isProcessesByLogicalApplicationComponents;
	protected List<ViewerFilter> isProcessesByLogicalApplicationComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isProcessesByLogicalApplicationComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isSuppliedByActors;
	protected List<ViewerFilter> isSuppliedByActorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isSuppliedByActorsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isConsumedByActors;
	protected List<ViewerFilter> isConsumedByActorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isConsumedByActorsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isAccessedByServices;
	protected List<ViewerFilter> isAccessedByServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isAccessedByServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isUpdatedThroughServices;
	protected List<ViewerFilter> isUpdatedThroughServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isUpdatedThroughServicesFilters = new ArrayList<ViewerFilter>();
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
	public DataEntityPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence dataEntityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = dataEntityStep.addStep(ContentfwkViewsRepository.DataEntity.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.DataEntity.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.DataEntity.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.DataEntity.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.DataEntity.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.DataEntity.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.DataEntity.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.DataEntity.Attributes.dataEntityCategory);
		attributesStep.addStep(ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification);
		attributesStep.addStep(ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification);
		
		CompositionStep relatedElementsStep = dataEntityStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.decomposeEntity);
		relatedElementsStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo);
		relatedElementsStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.residesWithinLogicalDataComponent);
		relatedElementsStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(dataEntityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.DataEntity.Attributes.class) {
					return createAttributesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.Attributes.name) {
					return createNameText(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.Attributes.iD) {
					return createIDText(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.Attributes.description) {
					return createDescriptionText(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.Attributes.category) {
					return createCategoryText(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.Attributes.source) {
					return createSourceText(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.Attributes.owner) {
					return createOwnerText(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.Attributes.dataEntityCategory) {
					return createDataEntityCategoryEMFComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification) {
					return createPrivacyClassificationText(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification) {
					return createRetentionClassificationText(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.class) {
					return createRelatedElementsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.decomposeEntity) {
					return createDecomposeEntityFlatComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo) {
					return createRelatesToAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.residesWithinLogicalDataComponent) {
					return createResidesWithinLogicalDataComponentFlatComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents) {
					return createIsProcessesByLogicalApplicationComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors) {
					return createIsSuppliedByActorsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors) {
					return createIsConsumedByActorsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices) {
					return createIsAccessedByServicesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices) {
					return createIsUpdatedThroughServicesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.delegates) {
					return createDelegatesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy) {
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
		attributesGroup.setText(ContentfwkMessages.DataEntityPropertiesEditionPart_AttributesGroupLabel);
		GridData attributesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		attributesGroupData.horizontalSpan = 3;
		attributesGroup.setLayoutData(attributesGroupData);
		GridLayout attributesGroupLayout = new GridLayout();
		attributesGroupLayout.numColumns = 3;
		attributesGroup.setLayout(attributesGroupLayout);
		return attributesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.Attributes.name, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ContentfwkViewsRepository.DataEntity.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.Attributes.name, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.Attributes.iD, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}

		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.DataEntity.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.Attributes.iD, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.Attributes.description, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ContentfwkViewsRepository.DataEntity.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.Attributes.description, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.Attributes.category, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}

		});
		EditingUtils.setID(category, ContentfwkViewsRepository.DataEntity.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.Attributes.category, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.Attributes.source, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}

		});
		EditingUtils.setID(source, ContentfwkViewsRepository.DataEntity.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.Attributes.source, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.Attributes.owner, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}

		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.DataEntity.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.Attributes.owner, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDataEntityCategoryEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_DataEntityCategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.Attributes.dataEntityCategory, ContentfwkViewsRepository.SWT_KIND));
		dataEntityCategory = new EMFComboViewer(parent);
		dataEntityCategory.setContentProvider(new ArrayContentProvider());
		dataEntityCategory.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData dataEntityCategoryData = new GridData(GridData.FILL_HORIZONTAL);
		dataEntityCategory.getCombo().setLayoutData(dataEntityCategoryData);
		dataEntityCategory.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.dataEntityCategory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDataEntityCategory()));
			}

		});
		dataEntityCategory.setID(ContentfwkViewsRepository.DataEntity.Attributes.dataEntityCategory);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.Attributes.dataEntityCategory, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPrivacyClassificationText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_PrivacyClassificationLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification, ContentfwkViewsRepository.SWT_KIND));
		privacyClassification = new Text(parent, SWT.BORDER);
		GridData privacyClassificationData = new GridData(GridData.FILL_HORIZONTAL);
		privacyClassification.setLayoutData(privacyClassificationData);
		privacyClassification.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, privacyClassification.getText()));
			}

		});
		privacyClassification.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, privacyClassification.getText()));
				}
			}

		});
		EditingUtils.setID(privacyClassification, ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification);
		EditingUtils.setEEFtype(privacyClassification, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.Attributes.privacyClassification, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRetentionClassificationText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_RetentionClassificationLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification, ContentfwkViewsRepository.SWT_KIND));
		retentionClassification = new Text(parent, SWT.BORDER);
		GridData retentionClassificationData = new GridData(GridData.FILL_HORIZONTAL);
		retentionClassification.setLayoutData(retentionClassificationData);
		retentionClassification.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retentionClassification.getText()));
			}

		});
		retentionClassification.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retentionClassification.getText()));
				}
			}

		});
		EditingUtils.setID(retentionClassification, ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification);
		EditingUtils.setEEFtype(retentionClassification, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.Attributes.retentionClassification, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(Composite parent) {
		Group relatedElementsGroup = new Group(parent, SWT.NONE);
		relatedElementsGroup.setText(ContentfwkMessages.DataEntityPropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createDecomposeEntityFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_DecomposeEntityLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.RelatedElements.decomposeEntity, ContentfwkViewsRepository.SWT_KIND));
		decomposeEntity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.RelatedElements.decomposeEntity, ContentfwkViewsRepository.SWT_KIND));
		decomposeEntity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		decomposeEntity.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.decomposeEntity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecomposeEntity()));
			}

		});
		GridData decomposeEntityData = new GridData(GridData.FILL_HORIZONTAL);
		decomposeEntity.setLayoutData(decomposeEntityData);
		decomposeEntity.setID(ContentfwkViewsRepository.DataEntity.RelatedElements.decomposeEntity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.RelatedElements.decomposeEntity, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatesToAdvancedReferencesTable(Composite parent) {
		this.relatesTo = new ReferencesTable(ContentfwkMessages.DataEntityPropertiesEditionPart_RelatesToLabel, new ReferencesTableListener() {
			public void handleAdd() { addRelatesTo(); }
			public void handleEdit(EObject element) { editRelatesTo(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRelatesTo(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRelatesTo(element); }
			public void navigateTo(EObject element) { }
		});
		this.relatesTo.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo, ContentfwkViewsRepository.SWT_KIND));
		this.relatesTo.createControls(parent);
		this.relatesTo.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData relatesToData = new GridData(GridData.FILL_HORIZONTAL);
		relatesToData.horizontalSpan = 3;
		this.relatesTo.setLayoutData(relatesToData);
		this.relatesTo.disableMove();
		relatesTo.setID(ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo);
		relatesTo.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRelatesTo() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(relatesTo.getInput(), relatesToFilters, relatesToBusinessFilters,
		"relates To", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				relatesTo.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRelatesTo(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		relatesTo.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRelatesTo(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.relatesTo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		relatesTo.refresh();
	}

	/**
	 * 
	 */
	protected void editRelatesTo(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				relatesTo.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createResidesWithinLogicalDataComponentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.DataEntityPropertiesEditionPart_ResidesWithinLogicalDataComponentLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.RelatedElements.residesWithinLogicalDataComponent, ContentfwkViewsRepository.SWT_KIND));
		residesWithinLogicalDataComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.DataEntity.RelatedElements.residesWithinLogicalDataComponent, ContentfwkViewsRepository.SWT_KIND));
		residesWithinLogicalDataComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		residesWithinLogicalDataComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.residesWithinLogicalDataComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getResidesWithinLogicalDataComponent()));
			}

		});
		GridData residesWithinLogicalDataComponentData = new GridData(GridData.FILL_HORIZONTAL);
		residesWithinLogicalDataComponent.setLayoutData(residesWithinLogicalDataComponentData);
		residesWithinLogicalDataComponent.setID(ContentfwkViewsRepository.DataEntity.RelatedElements.residesWithinLogicalDataComponent);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.RelatedElements.residesWithinLogicalDataComponent, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIsProcessesByLogicalApplicationComponentsAdvancedReferencesTable(Composite parent) {
		this.isProcessesByLogicalApplicationComponents = new ReferencesTable(ContentfwkMessages.DataEntityPropertiesEditionPart_IsProcessesByLogicalApplicationComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsProcessesByLogicalApplicationComponents(); }
			public void handleEdit(EObject element) { editIsProcessesByLogicalApplicationComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsProcessesByLogicalApplicationComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsProcessesByLogicalApplicationComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.isProcessesByLogicalApplicationComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents, ContentfwkViewsRepository.SWT_KIND));
		this.isProcessesByLogicalApplicationComponents.createControls(parent);
		this.isProcessesByLogicalApplicationComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isProcessesByLogicalApplicationComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		isProcessesByLogicalApplicationComponentsData.horizontalSpan = 3;
		this.isProcessesByLogicalApplicationComponents.setLayoutData(isProcessesByLogicalApplicationComponentsData);
		this.isProcessesByLogicalApplicationComponents.disableMove();
		isProcessesByLogicalApplicationComponents.setID(ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents);
		isProcessesByLogicalApplicationComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsProcessesByLogicalApplicationComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isProcessesByLogicalApplicationComponents.getInput(), isProcessesByLogicalApplicationComponentsFilters, isProcessesByLogicalApplicationComponentsBusinessFilters,
		"is Processes By Logical Application Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isProcessesByLogicalApplicationComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsProcessesByLogicalApplicationComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isProcessesByLogicalApplicationComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsProcessesByLogicalApplicationComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isProcessesByLogicalApplicationComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isProcessesByLogicalApplicationComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editIsProcessesByLogicalApplicationComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isProcessesByLogicalApplicationComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsSuppliedByActorsAdvancedReferencesTable(Composite parent) {
		this.isSuppliedByActors = new ReferencesTable(ContentfwkMessages.DataEntityPropertiesEditionPart_IsSuppliedByActorsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsSuppliedByActors(); }
			public void handleEdit(EObject element) { editIsSuppliedByActors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsSuppliedByActors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsSuppliedByActors(element); }
			public void navigateTo(EObject element) { }
		});
		this.isSuppliedByActors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors, ContentfwkViewsRepository.SWT_KIND));
		this.isSuppliedByActors.createControls(parent);
		this.isSuppliedByActors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isSuppliedByActorsData = new GridData(GridData.FILL_HORIZONTAL);
		isSuppliedByActorsData.horizontalSpan = 3;
		this.isSuppliedByActors.setLayoutData(isSuppliedByActorsData);
		this.isSuppliedByActors.disableMove();
		isSuppliedByActors.setID(ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors);
		isSuppliedByActors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsSuppliedByActors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isSuppliedByActors.getInput(), isSuppliedByActorsFilters, isSuppliedByActorsBusinessFilters,
		"is Supplied By Actors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isSuppliedByActors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsSuppliedByActors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isSuppliedByActors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsSuppliedByActors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isSuppliedByActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isSuppliedByActors.refresh();
	}

	/**
	 * 
	 */
	protected void editIsSuppliedByActors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isSuppliedByActors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsConsumedByActorsAdvancedReferencesTable(Composite parent) {
		this.isConsumedByActors = new ReferencesTable(ContentfwkMessages.DataEntityPropertiesEditionPart_IsConsumedByActorsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsConsumedByActors(); }
			public void handleEdit(EObject element) { editIsConsumedByActors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsConsumedByActors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsConsumedByActors(element); }
			public void navigateTo(EObject element) { }
		});
		this.isConsumedByActors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors, ContentfwkViewsRepository.SWT_KIND));
		this.isConsumedByActors.createControls(parent);
		this.isConsumedByActors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isConsumedByActorsData = new GridData(GridData.FILL_HORIZONTAL);
		isConsumedByActorsData.horizontalSpan = 3;
		this.isConsumedByActors.setLayoutData(isConsumedByActorsData);
		this.isConsumedByActors.disableMove();
		isConsumedByActors.setID(ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors);
		isConsumedByActors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsConsumedByActors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isConsumedByActors.getInput(), isConsumedByActorsFilters, isConsumedByActorsBusinessFilters,
		"is Consumed By Actors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isConsumedByActors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsConsumedByActors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isConsumedByActors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsConsumedByActors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isConsumedByActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isConsumedByActors.refresh();
	}

	/**
	 * 
	 */
	protected void editIsConsumedByActors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isConsumedByActors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsAccessedByServicesAdvancedReferencesTable(Composite parent) {
		this.isAccessedByServices = new ReferencesTable(ContentfwkMessages.DataEntityPropertiesEditionPart_IsAccessedByServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsAccessedByServices(); }
			public void handleEdit(EObject element) { editIsAccessedByServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsAccessedByServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsAccessedByServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.isAccessedByServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices, ContentfwkViewsRepository.SWT_KIND));
		this.isAccessedByServices.createControls(parent);
		this.isAccessedByServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isAccessedByServicesData = new GridData(GridData.FILL_HORIZONTAL);
		isAccessedByServicesData.horizontalSpan = 3;
		this.isAccessedByServices.setLayoutData(isAccessedByServicesData);
		this.isAccessedByServices.disableMove();
		isAccessedByServices.setID(ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices);
		isAccessedByServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsAccessedByServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isAccessedByServices.getInput(), isAccessedByServicesFilters, isAccessedByServicesBusinessFilters,
		"is Accessed By Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isAccessedByServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsAccessedByServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isAccessedByServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsAccessedByServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isAccessedByServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isAccessedByServices.refresh();
	}

	/**
	 * 
	 */
	protected void editIsAccessedByServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isAccessedByServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsUpdatedThroughServicesAdvancedReferencesTable(Composite parent) {
		this.isUpdatedThroughServices = new ReferencesTable(ContentfwkMessages.DataEntityPropertiesEditionPart_IsUpdatedThroughServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsUpdatedThroughServices(); }
			public void handleEdit(EObject element) { editIsUpdatedThroughServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsUpdatedThroughServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsUpdatedThroughServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.isUpdatedThroughServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices, ContentfwkViewsRepository.SWT_KIND));
		this.isUpdatedThroughServices.createControls(parent);
		this.isUpdatedThroughServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isUpdatedThroughServicesData = new GridData(GridData.FILL_HORIZONTAL);
		isUpdatedThroughServicesData.horizontalSpan = 3;
		this.isUpdatedThroughServices.setLayoutData(isUpdatedThroughServicesData);
		this.isUpdatedThroughServices.disableMove();
		isUpdatedThroughServices.setID(ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices);
		isUpdatedThroughServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsUpdatedThroughServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isUpdatedThroughServices.getInput(), isUpdatedThroughServicesFilters, isUpdatedThroughServicesBusinessFilters,
		"is Updated Through Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isUpdatedThroughServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsUpdatedThroughServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isUpdatedThroughServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsUpdatedThroughServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isUpdatedThroughServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isUpdatedThroughServices.refresh();
	}

	/**
	 * 
	 */
	protected void editIsUpdatedThroughServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isUpdatedThroughServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesAdvancedReferencesTable(Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.DataEntityPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.RelatedElements.delegates, ContentfwkViewsRepository.SWT_KIND));
		this.delegates.createControls(parent);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.DataEntity.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.DataEntityPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.SWT_KIND));
		this.isDelegatedBy.createControls(parent);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DataEntityPropertiesEditionPartImpl.this, ContentfwkViewsRepository.DataEntity.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getDataEntityCategory()
	 * 
	 */
	public Enumerator getDataEntityCategory() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) dataEntityCategory.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initDataEntityCategory(EEnum eenum, Enumerator current)
	 */
	public void initDataEntityCategory(EEnum eenum, Enumerator current) {
		dataEntityCategory.setInput(eenum.getELiterals());
		dataEntityCategory.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setDataEntityCategory(Enumerator newValue)
	 * 
	 */
	public void setDataEntityCategory(Enumerator newValue) {
		dataEntityCategory.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getPrivacyClassification()
	 * 
	 */
	public String getPrivacyClassification() {
		return privacyClassification.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setPrivacyClassification(String newValue)
	 * 
	 */
	public void setPrivacyClassification(String newValue) {
		if (newValue != null) {
			privacyClassification.setText(newValue);
		} else {
			privacyClassification.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getRetentionClassification()
	 * 
	 */
	public String getRetentionClassification() {
		return retentionClassification.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setRetentionClassification(String newValue)
	 * 
	 */
	public void setRetentionClassification(String newValue) {
		if (newValue != null) {
			retentionClassification.setText(newValue);
		} else {
			retentionClassification.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getDecomposeEntity()
	 * 
	 */
	public EObject getDecomposeEntity() {
		if (decomposeEntity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decomposeEntity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initDecomposeEntity(EObjectFlatComboSettings)
	 */
	public void initDecomposeEntity(EObjectFlatComboSettings settings) {
		decomposeEntity.setInput(settings);
		if (current != null) {
			decomposeEntity.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setDecomposeEntity(EObject newValue)
	 * 
	 */
	public void setDecomposeEntity(EObject newValue) {
		if (newValue != null) {
			decomposeEntity.setSelection(new StructuredSelection(newValue));
		} else {
			decomposeEntity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setDecomposeEntityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecomposeEntityButtonMode(ButtonsModeEnum newValue) {
		decomposeEntity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addFilterDecomposeEntity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposeEntity(ViewerFilter filter) {
		decomposeEntity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addBusinessFilterDecomposeEntity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposeEntity(ViewerFilter filter) {
		decomposeEntity.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initRelatesTo(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRelatesTo(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		relatesTo.setContentProvider(contentProvider);
		relatesTo.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#updateRelatesTo()
	 * 
	 */
	public void updateRelatesTo() {
	relatesTo.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addFilterRelatesTo(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRelatesTo(ViewerFilter filter) {
		relatesToFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addBusinessFilterRelatesTo(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRelatesTo(ViewerFilter filter) {
		relatesToBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#isContainedInRelatesToTable(EObject element)
	 * 
	 */
	public boolean isContainedInRelatesToTable(EObject element) {
		return ((ReferencesTableSettings)relatesTo.getInput()).contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#getResidesWithinLogicalDataComponent()
	 * 
	 */
	public EObject getResidesWithinLogicalDataComponent() {
		if (residesWithinLogicalDataComponent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) residesWithinLogicalDataComponent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initResidesWithinLogicalDataComponent(EObjectFlatComboSettings)
	 */
	public void initResidesWithinLogicalDataComponent(EObjectFlatComboSettings settings) {
		residesWithinLogicalDataComponent.setInput(settings);
		if (current != null) {
			residesWithinLogicalDataComponent.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setResidesWithinLogicalDataComponent(EObject newValue)
	 * 
	 */
	public void setResidesWithinLogicalDataComponent(EObject newValue) {
		if (newValue != null) {
			residesWithinLogicalDataComponent.setSelection(new StructuredSelection(newValue));
		} else {
			residesWithinLogicalDataComponent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#setResidesWithinLogicalDataComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setResidesWithinLogicalDataComponentButtonMode(ButtonsModeEnum newValue) {
		residesWithinLogicalDataComponent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addFilterResidesWithinLogicalDataComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResidesWithinLogicalDataComponent(ViewerFilter filter) {
		residesWithinLogicalDataComponent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addBusinessFilterResidesWithinLogicalDataComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResidesWithinLogicalDataComponent(ViewerFilter filter) {
		residesWithinLogicalDataComponent.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initIsProcessesByLogicalApplicationComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsProcessesByLogicalApplicationComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isProcessesByLogicalApplicationComponents.setContentProvider(contentProvider);
		isProcessesByLogicalApplicationComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#updateIsProcessesByLogicalApplicationComponents()
	 * 
	 */
	public void updateIsProcessesByLogicalApplicationComponents() {
	isProcessesByLogicalApplicationComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addFilterIsProcessesByLogicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsProcessesByLogicalApplicationComponents(ViewerFilter filter) {
		isProcessesByLogicalApplicationComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addBusinessFilterIsProcessesByLogicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsProcessesByLogicalApplicationComponents(ViewerFilter filter) {
		isProcessesByLogicalApplicationComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#isContainedInIsProcessesByLogicalApplicationComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsProcessesByLogicalApplicationComponentsTable(EObject element) {
		return ((ReferencesTableSettings)isProcessesByLogicalApplicationComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initIsSuppliedByActors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsSuppliedByActors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isSuppliedByActors.setContentProvider(contentProvider);
		isSuppliedByActors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#updateIsSuppliedByActors()
	 * 
	 */
	public void updateIsSuppliedByActors() {
	isSuppliedByActors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addFilterIsSuppliedByActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsSuppliedByActors(ViewerFilter filter) {
		isSuppliedByActorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addBusinessFilterIsSuppliedByActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsSuppliedByActors(ViewerFilter filter) {
		isSuppliedByActorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#isContainedInIsSuppliedByActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsSuppliedByActorsTable(EObject element) {
		return ((ReferencesTableSettings)isSuppliedByActors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initIsConsumedByActors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsConsumedByActors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isConsumedByActors.setContentProvider(contentProvider);
		isConsumedByActors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#updateIsConsumedByActors()
	 * 
	 */
	public void updateIsConsumedByActors() {
	isConsumedByActors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addFilterIsConsumedByActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsConsumedByActors(ViewerFilter filter) {
		isConsumedByActorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addBusinessFilterIsConsumedByActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsConsumedByActors(ViewerFilter filter) {
		isConsumedByActorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#isContainedInIsConsumedByActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsConsumedByActorsTable(EObject element) {
		return ((ReferencesTableSettings)isConsumedByActors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initIsAccessedByServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsAccessedByServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isAccessedByServices.setContentProvider(contentProvider);
		isAccessedByServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#updateIsAccessedByServices()
	 * 
	 */
	public void updateIsAccessedByServices() {
	isAccessedByServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addFilterIsAccessedByServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsAccessedByServices(ViewerFilter filter) {
		isAccessedByServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addBusinessFilterIsAccessedByServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsAccessedByServices(ViewerFilter filter) {
		isAccessedByServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#isContainedInIsAccessedByServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsAccessedByServicesTable(EObject element) {
		return ((ReferencesTableSettings)isAccessedByServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initIsUpdatedThroughServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsUpdatedThroughServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isUpdatedThroughServices.setContentProvider(contentProvider);
		isUpdatedThroughServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#updateIsUpdatedThroughServices()
	 * 
	 */
	public void updateIsUpdatedThroughServices() {
	isUpdatedThroughServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addFilterIsUpdatedThroughServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsUpdatedThroughServices(ViewerFilter filter) {
		isUpdatedThroughServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addBusinessFilterIsUpdatedThroughServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsUpdatedThroughServices(ViewerFilter filter) {
		isUpdatedThroughServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#isContainedInIsUpdatedThroughServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsUpdatedThroughServicesTable(EObject element) {
		return ((ReferencesTableSettings)isUpdatedThroughServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DataEntityPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.DataEntity_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
