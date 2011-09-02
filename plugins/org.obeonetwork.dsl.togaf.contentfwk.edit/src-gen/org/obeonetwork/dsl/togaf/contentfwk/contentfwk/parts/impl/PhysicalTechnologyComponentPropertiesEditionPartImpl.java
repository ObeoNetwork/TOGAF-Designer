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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class PhysicalTechnologyComponentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PhysicalTechnologyComponentPropertiesEditionPart {

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
	protected Text productName;
	protected Text moduleName;
	protected Text vendor;
	protected Text version;
	protected EObjectFlatComboViewer decomposesPhysicalTechnologyComponent;
	protected ReferencesTable realizesApplicationComponents;
	protected List<ViewerFilter> realizesApplicationComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> realizesApplicationComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable extendsLogicalTechnologyComponents;
	protected List<ViewerFilter> extendsLogicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> extendsLogicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isHostedInLocation;
	protected List<ViewerFilter> isHostedInLocationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isHostedInLocationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable isDependentOnPhysicalTechnologyComponents;
	protected List<ViewerFilter> isDependentOnPhysicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isDependentOnPhysicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();
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
	public PhysicalTechnologyComponentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence physicalTechnologyComponentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = physicalTechnologyComponentStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor);
		attributesStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version);
		
		CompositionStep relatedElementsStep = physicalTechnologyComponentStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(physicalTechnologyComponentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.class) {
					return createAttributesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name) {
					return createNameText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD) {
					return createIDText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description) {
					return createDescriptionText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category) {
					return createCategoryText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source) {
					return createSourceText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner) {
					return createOwnerText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass) {
					return createStandardClassEMFComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate) {
					return createStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate) {
					return createLastStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate) {
					return createNextStandardCreationDateText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate) {
					return createRetireDateText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName) {
					return createProductNameText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName) {
					return createModuleNameText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor) {
					return createVendorText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version) {
					return createVersionText(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.class) {
					return createRelatedElementsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent) {
					return createDecomposesPhysicalTechnologyComponentFlatComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents) {
					return createRealizesApplicationComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents) {
					return createExtendsLogicalTechnologyComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation) {
					return createIsHostedInLocationAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents) {
					return createIsDependentOnPhysicalTechnologyComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates) {
					return createDelegatesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy) {
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
		attributesGroup.setText(ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_AttributesGroupLabel);
		GridData attributesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		attributesGroupData.horizontalSpan = 3;
		attributesGroup.setLayoutData(attributesGroupData);
		GridLayout attributesGroupLayout = new GridLayout();
		attributesGroupLayout.numColumns = 3;
		attributesGroup.setLayout(attributesGroupLayout);
		return attributesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.name, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}

		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.iD, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.description, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}

		});
		EditingUtils.setID(category, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.category, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}

		});
		EditingUtils.setID(source, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.source, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}

		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.owner, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardClassEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_StandardClassLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStandardClass()));
			}

		});
		standardClass.setID(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardClass, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_StandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(standardCreationDate, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate);
		EditingUtils.setEEFtype(standardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.standardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLastStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_LastStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(lastStandardCreationDate, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate);
		EditingUtils.setEEFtype(lastStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNextStandardCreationDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_NextStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
				}
			}

		});
		EditingUtils.setID(nextStandardCreationDate, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate);
		EditingUtils.setEEFtype(nextStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRetireDateText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_RetireDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
				}
			}

		});
		EditingUtils.setID(retireDate, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate);
		EditingUtils.setEEFtype(retireDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.retireDate, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createProductNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_ProductNameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName, ContentfwkViewsRepository.SWT_KIND));
		productName = new Text(parent, SWT.BORDER);
		GridData productNameData = new GridData(GridData.FILL_HORIZONTAL);
		productName.setLayoutData(productNameData);
		productName.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, productName.getText()));
			}

		});
		productName.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, productName.getText()));
				}
			}

		});
		EditingUtils.setID(productName, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName);
		EditingUtils.setEEFtype(productName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.productName, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createModuleNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_ModuleNameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName, ContentfwkViewsRepository.SWT_KIND));
		moduleName = new Text(parent, SWT.BORDER);
		GridData moduleNameData = new GridData(GridData.FILL_HORIZONTAL);
		moduleName.setLayoutData(moduleNameData);
		moduleName.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, moduleName.getText()));
			}

		});
		moduleName.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, moduleName.getText()));
				}
			}

		});
		EditingUtils.setID(moduleName, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName);
		EditingUtils.setEEFtype(moduleName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.moduleName, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVendorText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_VendorLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor, ContentfwkViewsRepository.SWT_KIND));
		vendor = new Text(parent, SWT.BORDER);
		GridData vendorData = new GridData(GridData.FILL_HORIZONTAL);
		vendor.setLayoutData(vendorData);
		vendor.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, vendor.getText()));
			}

		});
		vendor.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, vendor.getText()));
				}
			}

		});
		EditingUtils.setID(vendor, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor);
		EditingUtils.setEEFtype(vendor, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.vendor, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVersionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_VersionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version, ContentfwkViewsRepository.SWT_KIND));
		version = new Text(parent, SWT.BORDER);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
			}

		});
		version.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.Attributes.version, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(Composite parent) {
		Group relatedElementsGroup = new Group(parent, SWT.NONE);
		relatedElementsGroup.setText(ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createDecomposesPhysicalTechnologyComponentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_DecomposesPhysicalTechnologyComponentLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent, ContentfwkViewsRepository.SWT_KIND));
		decomposesPhysicalTechnologyComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent, ContentfwkViewsRepository.SWT_KIND));
		decomposesPhysicalTechnologyComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		decomposesPhysicalTechnologyComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecomposesPhysicalTechnologyComponent()));
			}

		});
		GridData decomposesPhysicalTechnologyComponentData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesPhysicalTechnologyComponent.setLayoutData(decomposesPhysicalTechnologyComponentData);
		decomposesPhysicalTechnologyComponent.setID(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.decomposesPhysicalTechnologyComponent, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRealizesApplicationComponentsAdvancedReferencesTable(Composite parent) {
		this.realizesApplicationComponents = new ReferencesTable(ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_RealizesApplicationComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addRealizesApplicationComponents(); }
			public void handleEdit(EObject element) { editRealizesApplicationComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRealizesApplicationComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRealizesApplicationComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.realizesApplicationComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents, ContentfwkViewsRepository.SWT_KIND));
		this.realizesApplicationComponents.createControls(parent);
		this.realizesApplicationComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData realizesApplicationComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		realizesApplicationComponentsData.horizontalSpan = 3;
		this.realizesApplicationComponents.setLayoutData(realizesApplicationComponentsData);
		this.realizesApplicationComponents.disableMove();
		realizesApplicationComponents.setID(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents);
		realizesApplicationComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRealizesApplicationComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(realizesApplicationComponents.getInput(), realizesApplicationComponentsFilters, realizesApplicationComponentsBusinessFilters,
		"realizes Application Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				realizesApplicationComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRealizesApplicationComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		realizesApplicationComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRealizesApplicationComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.realizesApplicationComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		realizesApplicationComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editRealizesApplicationComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				realizesApplicationComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createExtendsLogicalTechnologyComponentsAdvancedReferencesTable(Composite parent) {
		this.extendsLogicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_ExtendsLogicalTechnologyComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addExtendsLogicalTechnologyComponents(); }
			public void handleEdit(EObject element) { editExtendsLogicalTechnologyComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtendsLogicalTechnologyComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtendsLogicalTechnologyComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.extendsLogicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents, ContentfwkViewsRepository.SWT_KIND));
		this.extendsLogicalTechnologyComponents.createControls(parent);
		this.extendsLogicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extendsLogicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		extendsLogicalTechnologyComponentsData.horizontalSpan = 3;
		this.extendsLogicalTechnologyComponents.setLayoutData(extendsLogicalTechnologyComponentsData);
		this.extendsLogicalTechnologyComponents.disableMove();
		extendsLogicalTechnologyComponents.setID(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents);
		extendsLogicalTechnologyComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addExtendsLogicalTechnologyComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(extendsLogicalTechnologyComponents.getInput(), extendsLogicalTechnologyComponentsFilters, extendsLogicalTechnologyComponentsBusinessFilters,
		"extends Logical Technology Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				extendsLogicalTechnologyComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveExtendsLogicalTechnologyComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extendsLogicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtendsLogicalTechnologyComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.extendsLogicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		extendsLogicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editExtendsLogicalTechnologyComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				extendsLogicalTechnologyComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsHostedInLocationAdvancedReferencesTable(Composite parent) {
		this.isHostedInLocation = new ReferencesTable(ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_IsHostedInLocationLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsHostedInLocation(); }
			public void handleEdit(EObject element) { editIsHostedInLocation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsHostedInLocation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsHostedInLocation(element); }
			public void navigateTo(EObject element) { }
		});
		this.isHostedInLocation.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation, ContentfwkViewsRepository.SWT_KIND));
		this.isHostedInLocation.createControls(parent);
		this.isHostedInLocation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isHostedInLocationData = new GridData(GridData.FILL_HORIZONTAL);
		isHostedInLocationData.horizontalSpan = 3;
		this.isHostedInLocation.setLayoutData(isHostedInLocationData);
		this.isHostedInLocation.disableMove();
		isHostedInLocation.setID(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isHostedInLocation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsHostedInLocation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isHostedInLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsDependentOnPhysicalTechnologyComponentsAdvancedReferencesTable(Composite parent) {
		this.isDependentOnPhysicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_IsDependentOnPhysicalTechnologyComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsDependentOnPhysicalTechnologyComponents(); }
			public void handleEdit(EObject element) { editIsDependentOnPhysicalTechnologyComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDependentOnPhysicalTechnologyComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDependentOnPhysicalTechnologyComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDependentOnPhysicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents, ContentfwkViewsRepository.SWT_KIND));
		this.isDependentOnPhysicalTechnologyComponents.createControls(parent);
		this.isDependentOnPhysicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDependentOnPhysicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		isDependentOnPhysicalTechnologyComponentsData.horizontalSpan = 3;
		this.isDependentOnPhysicalTechnologyComponents.setLayoutData(isDependentOnPhysicalTechnologyComponentsData);
		this.isDependentOnPhysicalTechnologyComponents.disableMove();
		isDependentOnPhysicalTechnologyComponents.setID(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents);
		isDependentOnPhysicalTechnologyComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsDependentOnPhysicalTechnologyComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isDependentOnPhysicalTechnologyComponents.getInput(), isDependentOnPhysicalTechnologyComponentsFilters, isDependentOnPhysicalTechnologyComponentsBusinessFilters,
		"is Dependent On Physical Technology Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isDependentOnPhysicalTechnologyComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsDependentOnPhysicalTechnologyComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDependentOnPhysicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDependentOnPhysicalTechnologyComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDependentOnPhysicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isDependentOnPhysicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editIsDependentOnPhysicalTechnologyComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isDependentOnPhysicalTechnologyComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesAdvancedReferencesTable(Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates, ContentfwkViewsRepository.SWT_KIND));
		this.delegates.createControls(parent);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.PhysicalTechnologyComponentPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.SWT_KIND));
		this.isDelegatedBy.createControls(parent);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PhysicalTechnologyComponentPropertiesEditionPartImpl.this, ContentfwkViewsRepository.PhysicalTechnologyComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getStandardClass()
	 * 
	 */
	public Enumerator getStandardClass() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) standardClass.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#initStandardClass(EEnum eenum, Enumerator current)
	 */
	public void initStandardClass(EEnum eenum, Enumerator current) {
		standardClass.setInput(eenum.getELiterals());
		standardClass.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setStandardClass(Enumerator newValue)
	 * 
	 */
	public void setStandardClass(Enumerator newValue) {
		standardClass.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getStandardCreationDate()
	 * 
	 */
	public String getStandardCreationDate() {
		return standardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getLastStandardCreationDate()
	 * 
	 */
	public String getLastStandardCreationDate() {
		return lastStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setLastStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getNextStandardCreationDate()
	 * 
	 */
	public String getNextStandardCreationDate() {
		return nextStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setNextStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getRetireDate()
	 * 
	 */
	public String getRetireDate() {
		return retireDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setRetireDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getProductName()
	 * 
	 */
	public String getProductName() {
		return productName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setProductName(String newValue)
	 * 
	 */
	public void setProductName(String newValue) {
		if (newValue != null) {
			productName.setText(newValue);
		} else {
			productName.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getModuleName()
	 * 
	 */
	public String getModuleName() {
		return moduleName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setModuleName(String newValue)
	 * 
	 */
	public void setModuleName(String newValue) {
		if (newValue != null) {
			moduleName.setText(newValue);
		} else {
			moduleName.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getVendor()
	 * 
	 */
	public String getVendor() {
		return vendor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setVendor(String newValue)
	 * 
	 */
	public void setVendor(String newValue) {
		if (newValue != null) {
			vendor.setText(newValue);
		} else {
			vendor.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#getDecomposesPhysicalTechnologyComponent()
	 * 
	 */
	public EObject getDecomposesPhysicalTechnologyComponent() {
		if (decomposesPhysicalTechnologyComponent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decomposesPhysicalTechnologyComponent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#initDecomposesPhysicalTechnologyComponent(EObjectFlatComboSettings)
	 */
	public void initDecomposesPhysicalTechnologyComponent(EObjectFlatComboSettings settings) {
		decomposesPhysicalTechnologyComponent.setInput(settings);
		if (current != null) {
			decomposesPhysicalTechnologyComponent.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setDecomposesPhysicalTechnologyComponent(EObject newValue)
	 * 
	 */
	public void setDecomposesPhysicalTechnologyComponent(EObject newValue) {
		if (newValue != null) {
			decomposesPhysicalTechnologyComponent.setSelection(new StructuredSelection(newValue));
		} else {
			decomposesPhysicalTechnologyComponent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#setDecomposesPhysicalTechnologyComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecomposesPhysicalTechnologyComponentButtonMode(ButtonsModeEnum newValue) {
		decomposesPhysicalTechnologyComponent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addFilterDecomposesPhysicalTechnologyComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesPhysicalTechnologyComponent(ViewerFilter filter) {
		decomposesPhysicalTechnologyComponent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addBusinessFilterDecomposesPhysicalTechnologyComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesPhysicalTechnologyComponent(ViewerFilter filter) {
		decomposesPhysicalTechnologyComponent.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#initRealizesApplicationComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRealizesApplicationComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		realizesApplicationComponents.setContentProvider(contentProvider);
		realizesApplicationComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#updateRealizesApplicationComponents()
	 * 
	 */
	public void updateRealizesApplicationComponents() {
	realizesApplicationComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addFilterRealizesApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRealizesApplicationComponents(ViewerFilter filter) {
		realizesApplicationComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addBusinessFilterRealizesApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRealizesApplicationComponents(ViewerFilter filter) {
		realizesApplicationComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#isContainedInRealizesApplicationComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInRealizesApplicationComponentsTable(EObject element) {
		return ((ReferencesTableSettings)realizesApplicationComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#initExtendsLogicalTechnologyComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initExtendsLogicalTechnologyComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		extendsLogicalTechnologyComponents.setContentProvider(contentProvider);
		extendsLogicalTechnologyComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#updateExtendsLogicalTechnologyComponents()
	 * 
	 */
	public void updateExtendsLogicalTechnologyComponents() {
	extendsLogicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addFilterExtendsLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtendsLogicalTechnologyComponents(ViewerFilter filter) {
		extendsLogicalTechnologyComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addBusinessFilterExtendsLogicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtendsLogicalTechnologyComponents(ViewerFilter filter) {
		extendsLogicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#isContainedInExtendsLogicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtendsLogicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)extendsLogicalTechnologyComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#initIsHostedInLocation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#updateIsHostedInLocation()
	 * 
	 */
	public void updateIsHostedInLocation() {
	isHostedInLocation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addFilterIsHostedInLocation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsHostedInLocation(ViewerFilter filter) {
		isHostedInLocationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addBusinessFilterIsHostedInLocation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsHostedInLocation(ViewerFilter filter) {
		isHostedInLocationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#isContainedInIsHostedInLocationTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsHostedInLocationTable(EObject element) {
		return ((ReferencesTableSettings)isHostedInLocation.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#initIsDependentOnPhysicalTechnologyComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsDependentOnPhysicalTechnologyComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isDependentOnPhysicalTechnologyComponents.setContentProvider(contentProvider);
		isDependentOnPhysicalTechnologyComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#updateIsDependentOnPhysicalTechnologyComponents()
	 * 
	 */
	public void updateIsDependentOnPhysicalTechnologyComponents() {
	isDependentOnPhysicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addFilterIsDependentOnPhysicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDependentOnPhysicalTechnologyComponents(ViewerFilter filter) {
		isDependentOnPhysicalTechnologyComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addBusinessFilterIsDependentOnPhysicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDependentOnPhysicalTechnologyComponents(ViewerFilter filter) {
		isDependentOnPhysicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#isContainedInIsDependentOnPhysicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsDependentOnPhysicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)isDependentOnPhysicalTechnologyComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PhysicalTechnologyComponentPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.PhysicalTechnologyComponent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
