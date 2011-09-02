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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class LogicalTechnologyComponentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LogicalTechnologyComponentPropertiesEditionPart {

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
	protected EObjectFlatComboViewer decomposesLogicalTechnologyComponent;
	protected ReferencesTable isRealizedByPhysicalTechnologyComponents;
	protected List<ViewerFilter> isRealizedByPhysicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isRealizedByPhysicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isDependentOnLogicalTechnologyComponents;
	protected List<ViewerFilter> isDependentOnLogicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isDependentOnLogicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable providesPlatformForServices;
	protected List<ViewerFilter> providesPlatformForServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> providesPlatformForServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable suppliesPlatformServices;
	protected List<ViewerFilter> suppliesPlatformServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> suppliesPlatformServicesFilters = new ArrayList<ViewerFilter>();
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
	public LogicalTechnologyComponentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence logicalTechnologyComponentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = logicalTechnologyComponentStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate);
		
		CompositionStep relatedElementsStep = logicalTechnologyComponentStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(logicalTechnologyComponentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.class) {
					return createAttributesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name) {
					return createNameText(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD) {
					return createIDText(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description) {
					return createDescriptionText(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category) {
					return createCategoryText(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source) {
					return createSourceText(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner) {
					return createOwnerText(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass) {
					return createStandardClassEMFComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate) {
					return createStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate) {
					return createLastStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate) {
					return createNextStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate) {
					return createRetireDateText(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.class) {
					return createRelatedElementsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent) {
					return createDecomposesLogicalTechnologyComponentFlatComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents) {
					return createIsRealizedByPhysicalTechnologyComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents) {
					return createIsDependentOnLogicalTechnologyComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices) {
					return createProvidesPlatformForServicesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices) {
					return createSuppliesPlatformServicesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates) {
					return createDelegatesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy) {
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
		attributesGroup.setText(ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_AttributesGroupLabel);
		GridData attributesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		attributesGroupData.horizontalSpan = 3;
		attributesGroup.setLayoutData(attributesGroupData);
		GridLayout attributesGroupLayout = new GridLayout();
		attributesGroupLayout.numColumns = 3;
		attributesGroup.setLayout(attributesGroupLayout);
		return attributesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.name, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}

		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.iD, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.description, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}

		});
		EditingUtils.setID(category, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.category, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}

		});
		EditingUtils.setID(source, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.source, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}

		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.owner, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardClassEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_StandardClassLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStandardClass()));
			}

		});
		standardClass.setID(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardClass, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_StandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(standardCreationDate, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate);
		EditingUtils.setEEFtype(standardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.standardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLastStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_LastStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(lastStandardCreationDate, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate);
		EditingUtils.setEEFtype(lastStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNextStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_NextStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(nextStandardCreationDate, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate);
		EditingUtils.setEEFtype(nextStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRetireDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_RetireDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
				}
			}

		});
		EditingUtils.setID(retireDate, ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate);
		EditingUtils.setEEFtype(retireDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.Attributes.retireDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(Composite parent) {
		Group relatedElementsGroup = new Group(parent, SWT.NONE);
		relatedElementsGroup.setText(ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createDecomposesLogicalTechnologyComponentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_DecomposesLogicalTechnologyComponentLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent, ContentfwkViewsRepository.SWT_KIND));
		decomposesLogicalTechnologyComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent, ContentfwkViewsRepository.SWT_KIND));
		decomposesLogicalTechnologyComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		decomposesLogicalTechnologyComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecomposesLogicalTechnologyComponent()));
			}

		});
		GridData decomposesLogicalTechnologyComponentData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesLogicalTechnologyComponent.setLayoutData(decomposesLogicalTechnologyComponentData);
		decomposesLogicalTechnologyComponent.setID(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.decomposesLogicalTechnologyComponent, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIsRealizedByPhysicalTechnologyComponentsAdvancedReferencesTable(Composite parent) {
		this.isRealizedByPhysicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_IsRealizedByPhysicalTechnologyComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsRealizedByPhysicalTechnologyComponents(); }
			public void handleEdit(EObject element) { editIsRealizedByPhysicalTechnologyComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsRealizedByPhysicalTechnologyComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsRealizedByPhysicalTechnologyComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.isRealizedByPhysicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents, ContentfwkViewsRepository.SWT_KIND));
		this.isRealizedByPhysicalTechnologyComponents.createControls(parent);
		this.isRealizedByPhysicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isRealizedByPhysicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		isRealizedByPhysicalTechnologyComponentsData.horizontalSpan = 3;
		this.isRealizedByPhysicalTechnologyComponents.setLayoutData(isRealizedByPhysicalTechnologyComponentsData);
		this.isRealizedByPhysicalTechnologyComponents.disableMove();
		isRealizedByPhysicalTechnologyComponents.setID(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isRealizedByPhysicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsRealizedByPhysicalTechnologyComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isRealizedByPhysicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsDependentOnLogicalTechnologyComponentsAdvancedReferencesTable(Composite parent) {
		this.isDependentOnLogicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_IsDependentOnLogicalTechnologyComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsDependentOnLogicalTechnologyComponents(); }
			public void handleEdit(EObject element) { editIsDependentOnLogicalTechnologyComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDependentOnLogicalTechnologyComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDependentOnLogicalTechnologyComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDependentOnLogicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents, ContentfwkViewsRepository.SWT_KIND));
		this.isDependentOnLogicalTechnologyComponents.createControls(parent);
		this.isDependentOnLogicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDependentOnLogicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		isDependentOnLogicalTechnologyComponentsData.horizontalSpan = 3;
		this.isDependentOnLogicalTechnologyComponents.setLayoutData(isDependentOnLogicalTechnologyComponentsData);
		this.isDependentOnLogicalTechnologyComponents.disableMove();
		isDependentOnLogicalTechnologyComponents.setID(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents);
		isDependentOnLogicalTechnologyComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsDependentOnLogicalTechnologyComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isDependentOnLogicalTechnologyComponents.getInput(), isDependentOnLogicalTechnologyComponentsFilters, isDependentOnLogicalTechnologyComponentsBusinessFilters,
		"is Dependent On Logical Technology Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isDependentOnLogicalTechnologyComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsDependentOnLogicalTechnologyComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDependentOnLogicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDependentOnLogicalTechnologyComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDependentOnLogicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isDependentOnLogicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editIsDependentOnLogicalTechnologyComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isDependentOnLogicalTechnologyComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createProvidesPlatformForServicesAdvancedReferencesTable(Composite parent) {
		this.providesPlatformForServices = new ReferencesTable(ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_ProvidesPlatformForServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { addProvidesPlatformForServices(); }
			public void handleEdit(EObject element) { editProvidesPlatformForServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProvidesPlatformForServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProvidesPlatformForServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.providesPlatformForServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices, ContentfwkViewsRepository.SWT_KIND));
		this.providesPlatformForServices.createControls(parent);
		this.providesPlatformForServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData providesPlatformForServicesData = new GridData(GridData.FILL_HORIZONTAL);
		providesPlatformForServicesData.horizontalSpan = 3;
		this.providesPlatformForServices.setLayoutData(providesPlatformForServicesData);
		this.providesPlatformForServices.disableMove();
		providesPlatformForServices.setID(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices);
		providesPlatformForServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProvidesPlatformForServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(providesPlatformForServices.getInput(), providesPlatformForServicesFilters, providesPlatformForServicesBusinessFilters,
		"provides Platform For Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				providesPlatformForServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProvidesPlatformForServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		providesPlatformForServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProvidesPlatformForServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.providesPlatformForServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		providesPlatformForServices.refresh();
	}

	/**
	 * 
	 */
	protected void editProvidesPlatformForServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				providesPlatformForServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSuppliesPlatformServicesAdvancedReferencesTable(Composite parent) {
		this.suppliesPlatformServices = new ReferencesTable(ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_SuppliesPlatformServicesLabel, new ReferencesTableListener() {
			public void handleAdd() { addSuppliesPlatformServices(); }
			public void handleEdit(EObject element) { editSuppliesPlatformServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSuppliesPlatformServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSuppliesPlatformServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.suppliesPlatformServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices, ContentfwkViewsRepository.SWT_KIND));
		this.suppliesPlatformServices.createControls(parent);
		this.suppliesPlatformServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData suppliesPlatformServicesData = new GridData(GridData.FILL_HORIZONTAL);
		suppliesPlatformServicesData.horizontalSpan = 3;
		this.suppliesPlatformServices.setLayoutData(suppliesPlatformServicesData);
		this.suppliesPlatformServices.disableMove();
		suppliesPlatformServices.setID(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices);
		suppliesPlatformServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSuppliesPlatformServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(suppliesPlatformServices.getInput(), suppliesPlatformServicesFilters, suppliesPlatformServicesBusinessFilters,
		"supplies Platform Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				suppliesPlatformServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSuppliesPlatformServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		suppliesPlatformServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSuppliesPlatformServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.suppliesPlatformServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		suppliesPlatformServices.refresh();
	}

	/**
	 * 
	 */
	protected void editSuppliesPlatformServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				suppliesPlatformServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesAdvancedReferencesTable(Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates, ContentfwkViewsRepository.SWT_KIND));
		this.delegates.createControls(parent);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.LogicalTechnologyComponentPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.SWT_KIND));
		this.isDelegatedBy.createControls(parent);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.LogicalTechnologyComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getStandardClass()
	 * 
	 */
	public Enumerator getStandardClass() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) standardClass.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#initStandardClass(EEnum eenum, Enumerator current)
	 */
	public void initStandardClass(EEnum eenum, Enumerator current) {
		standardClass.setInput(eenum.getELiterals());
		standardClass.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setStandardClass(Enumerator newValue)
	 * 
	 */
	public void setStandardClass(Enumerator newValue) {
		standardClass.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getStandardCreationDate()
	 * 
	 */
	public String getStandardCreationDate() {
		return standardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getLastStandardCreationDate()
	 * 
	 */
	public String getLastStandardCreationDate() {
		return lastStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setLastStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getNextStandardCreationDate()
	 * 
	 */
	public String getNextStandardCreationDate() {
		return nextStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setNextStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getRetireDate()
	 * 
	 */
	public String getRetireDate() {
		return retireDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setRetireDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#getDecomposesLogicalTechnologyComponent()
	 * 
	 */
	public EObject getDecomposesLogicalTechnologyComponent() {
		if (decomposesLogicalTechnologyComponent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decomposesLogicalTechnologyComponent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#initDecomposesLogicalTechnologyComponent(EObjectFlatComboSettings)
	 */
	public void initDecomposesLogicalTechnologyComponent(EObjectFlatComboSettings settings) {
		decomposesLogicalTechnologyComponent.setInput(settings);
		if (current != null) {
			decomposesLogicalTechnologyComponent.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setDecomposesLogicalTechnologyComponent(EObject newValue)
	 * 
	 */
	public void setDecomposesLogicalTechnologyComponent(EObject newValue) {
		if (newValue != null) {
			decomposesLogicalTechnologyComponent.setSelection(new StructuredSelection(newValue));
		} else {
			decomposesLogicalTechnologyComponent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#setDecomposesLogicalTechnologyComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecomposesLogicalTechnologyComponentButtonMode(ButtonsModeEnum newValue) {
		decomposesLogicalTechnologyComponent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addFilterDecomposesLogicalTechnologyComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesLogicalTechnologyComponent(ViewerFilter filter) {
		decomposesLogicalTechnologyComponent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addBusinessFilterDecomposesLogicalTechnologyComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesLogicalTechnologyComponent(ViewerFilter filter) {
		decomposesLogicalTechnologyComponent.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#initIsRealizedByPhysicalTechnologyComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#updateIsRealizedByPhysicalTechnologyComponents()
	 * 
	 */
	public void updateIsRealizedByPhysicalTechnologyComponents() {
	isRealizedByPhysicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addFilterIsRealizedByPhysicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsRealizedByPhysicalTechnologyComponents(ViewerFilter filter) {
		isRealizedByPhysicalTechnologyComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addBusinessFilterIsRealizedByPhysicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsRealizedByPhysicalTechnologyComponents(ViewerFilter filter) {
		isRealizedByPhysicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#isContainedInIsRealizedByPhysicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsRealizedByPhysicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)isRealizedByPhysicalTechnologyComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#initIsDependentOnLogicalTechnologyComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsDependentOnLogicalTechnologyComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isDependentOnLogicalTechnologyComponents.setContentProvider(contentProvider);
		isDependentOnLogicalTechnologyComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#updateIsDependentOnLogicalTechnologyComponents()
	 * 
	 */
	public void updateIsDependentOnLogicalTechnologyComponents() {
	isDependentOnLogicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addFilterIsDependentOnLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDependentOnLogicalTechnologyComponents(ViewerFilter filter) {
		isDependentOnLogicalTechnologyComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addBusinessFilterIsDependentOnLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDependentOnLogicalTechnologyComponents(ViewerFilter filter) {
		isDependentOnLogicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#isContainedInIsDependentOnLogicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsDependentOnLogicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)isDependentOnLogicalTechnologyComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#initProvidesPlatformForServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProvidesPlatformForServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		providesPlatformForServices.setContentProvider(contentProvider);
		providesPlatformForServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#updateProvidesPlatformForServices()
	 * 
	 */
	public void updateProvidesPlatformForServices() {
	providesPlatformForServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addFilterProvidesPlatformForServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProvidesPlatformForServices(ViewerFilter filter) {
		providesPlatformForServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addBusinessFilterProvidesPlatformForServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProvidesPlatformForServices(ViewerFilter filter) {
		providesPlatformForServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#isContainedInProvidesPlatformForServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProvidesPlatformForServicesTable(EObject element) {
		return ((ReferencesTableSettings)providesPlatformForServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#initSuppliesPlatformServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSuppliesPlatformServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		suppliesPlatformServices.setContentProvider(contentProvider);
		suppliesPlatformServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#updateSuppliesPlatformServices()
	 * 
	 */
	public void updateSuppliesPlatformServices() {
	suppliesPlatformServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addFilterSuppliesPlatformServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSuppliesPlatformServices(ViewerFilter filter) {
		suppliesPlatformServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addBusinessFilterSuppliesPlatformServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSuppliesPlatformServices(ViewerFilter filter) {
		suppliesPlatformServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#isContainedInSuppliesPlatformServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSuppliesPlatformServicesTable(EObject element) {
		return ((ReferencesTableSettings)suppliesPlatformServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalTechnologyComponentPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.LogicalTechnologyComponent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
