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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class LocationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LocationPropertiesEditionPart {

	protected Text name;
	protected Text iD;
	protected Text description;
	protected Text category;
	protected Text source;
	protected Text owner;
	protected EObjectFlatComboViewer decomposesLocation;
	protected ReferencesTable containsActors;
	protected List<ViewerFilter> containsActorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containsActorsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable containsOrganizationUnits;
	protected List<ViewerFilter> containsOrganizationUnitsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containsOrganizationUnitsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable containsPhysicalDataComponents;
	protected List<ViewerFilter> containsPhysicalDataComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containsPhysicalDataComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable containsPhysicalApplicationComponents;
	protected List<ViewerFilter> containsPhysicalApplicationComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containsPhysicalApplicationComponentsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable containsPhysicalTechnologyComponents;
	protected List<ViewerFilter> containsPhysicalTechnologyComponentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containsPhysicalTechnologyComponentsFilters = new ArrayList<ViewerFilter>();
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
	public LocationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence locationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = locationStep.addStep(ContentfwkViewsRepository.Location.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.Location.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.Location.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.Location.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.Location.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.Location.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.Location.Attributes.owner);
		
		CompositionStep relatedElementsStep = locationStep.addStep(ContentfwkViewsRepository.Location.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Location.RelatedElements.containsActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Location.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(locationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.Location.Attributes.class) {
					return createAttributesGroup(parent);
				}
				if (key == ContentfwkViewsRepository.Location.Attributes.name) {
					return createNameText(parent);
				}
				if (key == ContentfwkViewsRepository.Location.Attributes.iD) {
					return createIDText(parent);
				}
				if (key == ContentfwkViewsRepository.Location.Attributes.description) {
					return createDescriptionText(parent);
				}
				if (key == ContentfwkViewsRepository.Location.Attributes.category) {
					return createCategoryText(parent);
				}
				if (key == ContentfwkViewsRepository.Location.Attributes.source) {
					return createSourceText(parent);
				}
				if (key == ContentfwkViewsRepository.Location.Attributes.owner) {
					return createOwnerText(parent);
				}
				if (key == ContentfwkViewsRepository.Location.RelatedElements.class) {
					return createRelatedElementsGroup(parent);
				}
				if (key == ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation) {
					return createDecomposesLocationFlatComboViewer(parent);
				}
				if (key == ContentfwkViewsRepository.Location.RelatedElements.containsActors) {
					return createContainsActorsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits) {
					return createContainsOrganizationUnitsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents) {
					return createContainsPhysicalDataComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents) {
					return createContainsPhysicalApplicationComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents) {
					return createContainsPhysicalTechnologyComponentsAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Location.RelatedElements.delegates) {
					return createDelegatesAdvancedReferencesTable(parent);
				}
				if (key == ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy) {
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
		attributesGroup.setText(ContentfwkMessages.LocationPropertiesEditionPart_AttributesGroupLabel);
		GridData attributesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		attributesGroupData.horizontalSpan = 3;
		attributesGroup.setLayoutData(attributesGroupData);
		GridLayout attributesGroupLayout = new GridLayout();
		attributesGroupLayout.numColumns = 3;
		attributesGroup.setLayout(attributesGroupLayout);
		return attributesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LocationPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Location.Attributes.name, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ContentfwkViewsRepository.Location.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.Attributes.name, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LocationPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Location.Attributes.iD, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}

		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.Location.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.Attributes.iD, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LocationPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Location.Attributes.description, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ContentfwkViewsRepository.Location.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.Attributes.description, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LocationPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Location.Attributes.category, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}

		});
		EditingUtils.setID(category, ContentfwkViewsRepository.Location.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.Attributes.category, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LocationPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Location.Attributes.source, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}

		});
		EditingUtils.setID(source, ContentfwkViewsRepository.Location.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.Attributes.source, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LocationPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Location.Attributes.owner, ContentfwkViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}

		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.Location.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.Attributes.owner, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(Composite parent) {
		Group relatedElementsGroup = new Group(parent, SWT.NONE);
		relatedElementsGroup.setText(ContentfwkMessages.LocationPropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createDecomposesLocationFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ContentfwkMessages.LocationPropertiesEditionPart_DecomposesLocationLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation, ContentfwkViewsRepository.SWT_KIND));
		decomposesLocation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation, ContentfwkViewsRepository.SWT_KIND));
		decomposesLocation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		decomposesLocation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecomposesLocation()));
			}

		});
		GridData decomposesLocationData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesLocation.setLayoutData(decomposesLocationData);
		decomposesLocation.setID(ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.RelatedElements.decomposesLocation, ContentfwkViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createContainsActorsAdvancedReferencesTable(Composite parent) {
		this.containsActors = new ReferencesTable(ContentfwkMessages.LocationPropertiesEditionPart_ContainsActorsLabel, new ReferencesTableListener() {
			public void handleAdd() { addContainsActors(); }
			public void handleEdit(EObject element) { editContainsActors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContainsActors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContainsActors(element); }
			public void navigateTo(EObject element) { }
		});
		this.containsActors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.RelatedElements.containsActors, ContentfwkViewsRepository.SWT_KIND));
		this.containsActors.createControls(parent);
		this.containsActors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containsActorsData = new GridData(GridData.FILL_HORIZONTAL);
		containsActorsData.horizontalSpan = 3;
		this.containsActors.setLayoutData(containsActorsData);
		this.containsActors.disableMove();
		containsActors.setID(ContentfwkViewsRepository.Location.RelatedElements.containsActors);
		containsActors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addContainsActors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(containsActors.getInput(), containsActorsFilters, containsActorsBusinessFilters,
		"contains Actors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsActors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				containsActors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContainsActors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		containsActors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContainsActors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		containsActors.refresh();
	}

	/**
	 * 
	 */
	protected void editContainsActors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				containsActors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createContainsOrganizationUnitsAdvancedReferencesTable(Composite parent) {
		this.containsOrganizationUnits = new ReferencesTable(ContentfwkMessages.LocationPropertiesEditionPart_ContainsOrganizationUnitsLabel, new ReferencesTableListener() {
			public void handleAdd() { addContainsOrganizationUnits(); }
			public void handleEdit(EObject element) { editContainsOrganizationUnits(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContainsOrganizationUnits(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContainsOrganizationUnits(element); }
			public void navigateTo(EObject element) { }
		});
		this.containsOrganizationUnits.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits, ContentfwkViewsRepository.SWT_KIND));
		this.containsOrganizationUnits.createControls(parent);
		this.containsOrganizationUnits.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containsOrganizationUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		containsOrganizationUnitsData.horizontalSpan = 3;
		this.containsOrganizationUnits.setLayoutData(containsOrganizationUnitsData);
		this.containsOrganizationUnits.disableMove();
		containsOrganizationUnits.setID(ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits);
		containsOrganizationUnits.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addContainsOrganizationUnits() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(containsOrganizationUnits.getInput(), containsOrganizationUnitsFilters, containsOrganizationUnitsBusinessFilters,
		"contains Organization Units", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				containsOrganizationUnits.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContainsOrganizationUnits(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		containsOrganizationUnits.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContainsOrganizationUnits(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsOrganizationUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		containsOrganizationUnits.refresh();
	}

	/**
	 * 
	 */
	protected void editContainsOrganizationUnits(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				containsOrganizationUnits.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createContainsPhysicalDataComponentsAdvancedReferencesTable(Composite parent) {
		this.containsPhysicalDataComponents = new ReferencesTable(ContentfwkMessages.LocationPropertiesEditionPart_ContainsPhysicalDataComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addContainsPhysicalDataComponents(); }
			public void handleEdit(EObject element) { editContainsPhysicalDataComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContainsPhysicalDataComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContainsPhysicalDataComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.containsPhysicalDataComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents, ContentfwkViewsRepository.SWT_KIND));
		this.containsPhysicalDataComponents.createControls(parent);
		this.containsPhysicalDataComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containsPhysicalDataComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		containsPhysicalDataComponentsData.horizontalSpan = 3;
		this.containsPhysicalDataComponents.setLayoutData(containsPhysicalDataComponentsData);
		this.containsPhysicalDataComponents.disableMove();
		containsPhysicalDataComponents.setID(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents);
		containsPhysicalDataComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addContainsPhysicalDataComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(containsPhysicalDataComponents.getInput(), containsPhysicalDataComponentsFilters, containsPhysicalDataComponentsBusinessFilters,
		"contains Physical Data Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				containsPhysicalDataComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContainsPhysicalDataComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		containsPhysicalDataComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContainsPhysicalDataComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalDataComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		containsPhysicalDataComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editContainsPhysicalDataComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				containsPhysicalDataComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createContainsPhysicalApplicationComponentsAdvancedReferencesTable(Composite parent) {
		this.containsPhysicalApplicationComponents = new ReferencesTable(ContentfwkMessages.LocationPropertiesEditionPart_ContainsPhysicalApplicationComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addContainsPhysicalApplicationComponents(); }
			public void handleEdit(EObject element) { editContainsPhysicalApplicationComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContainsPhysicalApplicationComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContainsPhysicalApplicationComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.containsPhysicalApplicationComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents, ContentfwkViewsRepository.SWT_KIND));
		this.containsPhysicalApplicationComponents.createControls(parent);
		this.containsPhysicalApplicationComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containsPhysicalApplicationComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		containsPhysicalApplicationComponentsData.horizontalSpan = 3;
		this.containsPhysicalApplicationComponents.setLayoutData(containsPhysicalApplicationComponentsData);
		this.containsPhysicalApplicationComponents.disableMove();
		containsPhysicalApplicationComponents.setID(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents);
		containsPhysicalApplicationComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addContainsPhysicalApplicationComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(containsPhysicalApplicationComponents.getInput(), containsPhysicalApplicationComponentsFilters, containsPhysicalApplicationComponentsBusinessFilters,
		"contains Physical Application Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				containsPhysicalApplicationComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContainsPhysicalApplicationComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		containsPhysicalApplicationComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContainsPhysicalApplicationComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalApplicationComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		containsPhysicalApplicationComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editContainsPhysicalApplicationComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				containsPhysicalApplicationComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createContainsPhysicalTechnologyComponentsAdvancedReferencesTable(Composite parent) {
		this.containsPhysicalTechnologyComponents = new ReferencesTable(ContentfwkMessages.LocationPropertiesEditionPart_ContainsPhysicalTechnologyComponentsLabel, new ReferencesTableListener() {
			public void handleAdd() { addContainsPhysicalTechnologyComponents(); }
			public void handleEdit(EObject element) { editContainsPhysicalTechnologyComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContainsPhysicalTechnologyComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContainsPhysicalTechnologyComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.containsPhysicalTechnologyComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents, ContentfwkViewsRepository.SWT_KIND));
		this.containsPhysicalTechnologyComponents.createControls(parent);
		this.containsPhysicalTechnologyComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containsPhysicalTechnologyComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		containsPhysicalTechnologyComponentsData.horizontalSpan = 3;
		this.containsPhysicalTechnologyComponents.setLayoutData(containsPhysicalTechnologyComponentsData);
		this.containsPhysicalTechnologyComponents.disableMove();
		containsPhysicalTechnologyComponents.setID(ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents);
		containsPhysicalTechnologyComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addContainsPhysicalTechnologyComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(containsPhysicalTechnologyComponents.getInput(), containsPhysicalTechnologyComponentsFilters, containsPhysicalTechnologyComponentsBusinessFilters,
		"contains Physical Technology Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				containsPhysicalTechnologyComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContainsPhysicalTechnologyComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		containsPhysicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContainsPhysicalTechnologyComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.containsPhysicalTechnologyComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		containsPhysicalTechnologyComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editContainsPhysicalTechnologyComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				containsPhysicalTechnologyComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesAdvancedReferencesTable(Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.LocationPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.RelatedElements.delegates, ContentfwkViewsRepository.SWT_KIND));
		this.delegates.createControls(parent);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.Location.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.LocationPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.SWT_KIND));
		this.isDelegatedBy.createControls(parent);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LocationPropertiesEditionPartImpl.this, ContentfwkViewsRepository.Location.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#getDecomposesLocation()
	 * 
	 */
	public EObject getDecomposesLocation() {
		if (decomposesLocation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decomposesLocation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#initDecomposesLocation(EObjectFlatComboSettings)
	 */
	public void initDecomposesLocation(EObjectFlatComboSettings settings) {
		decomposesLocation.setInput(settings);
		if (current != null) {
			decomposesLocation.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#setDecomposesLocation(EObject newValue)
	 * 
	 */
	public void setDecomposesLocation(EObject newValue) {
		if (newValue != null) {
			decomposesLocation.setSelection(new StructuredSelection(newValue));
		} else {
			decomposesLocation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#setDecomposesLocationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecomposesLocationButtonMode(ButtonsModeEnum newValue) {
		decomposesLocation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addFilterDecomposesLocation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesLocation(ViewerFilter filter) {
		decomposesLocation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addBusinessFilterDecomposesLocation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesLocation(ViewerFilter filter) {
		decomposesLocation.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#initContainsActors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContainsActors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containsActors.setContentProvider(contentProvider);
		containsActors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#updateContainsActors()
	 * 
	 */
	public void updateContainsActors() {
	containsActors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addFilterContainsActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsActors(ViewerFilter filter) {
		containsActorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addBusinessFilterContainsActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsActors(ViewerFilter filter) {
		containsActorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#isContainedInContainsActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsActorsTable(EObject element) {
		return ((ReferencesTableSettings)containsActors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#initContainsOrganizationUnits(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContainsOrganizationUnits(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containsOrganizationUnits.setContentProvider(contentProvider);
		containsOrganizationUnits.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#updateContainsOrganizationUnits()
	 * 
	 */
	public void updateContainsOrganizationUnits() {
	containsOrganizationUnits.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addFilterContainsOrganizationUnits(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsOrganizationUnits(ViewerFilter filter) {
		containsOrganizationUnitsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addBusinessFilterContainsOrganizationUnits(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsOrganizationUnits(ViewerFilter filter) {
		containsOrganizationUnitsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#isContainedInContainsOrganizationUnitsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsOrganizationUnitsTable(EObject element) {
		return ((ReferencesTableSettings)containsOrganizationUnits.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#initContainsPhysicalDataComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContainsPhysicalDataComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containsPhysicalDataComponents.setContentProvider(contentProvider);
		containsPhysicalDataComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#updateContainsPhysicalDataComponents()
	 * 
	 */
	public void updateContainsPhysicalDataComponents() {
	containsPhysicalDataComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addFilterContainsPhysicalDataComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsPhysicalDataComponents(ViewerFilter filter) {
		containsPhysicalDataComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addBusinessFilterContainsPhysicalDataComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsPhysicalDataComponents(ViewerFilter filter) {
		containsPhysicalDataComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#isContainedInContainsPhysicalDataComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsPhysicalDataComponentsTable(EObject element) {
		return ((ReferencesTableSettings)containsPhysicalDataComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#initContainsPhysicalApplicationComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContainsPhysicalApplicationComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containsPhysicalApplicationComponents.setContentProvider(contentProvider);
		containsPhysicalApplicationComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#updateContainsPhysicalApplicationComponents()
	 * 
	 */
	public void updateContainsPhysicalApplicationComponents() {
	containsPhysicalApplicationComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addFilterContainsPhysicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsPhysicalApplicationComponents(ViewerFilter filter) {
		containsPhysicalApplicationComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addBusinessFilterContainsPhysicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsPhysicalApplicationComponents(ViewerFilter filter) {
		containsPhysicalApplicationComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#isContainedInContainsPhysicalApplicationComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsPhysicalApplicationComponentsTable(EObject element) {
		return ((ReferencesTableSettings)containsPhysicalApplicationComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#initContainsPhysicalTechnologyComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContainsPhysicalTechnologyComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containsPhysicalTechnologyComponents.setContentProvider(contentProvider);
		containsPhysicalTechnologyComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#updateContainsPhysicalTechnologyComponents()
	 * 
	 */
	public void updateContainsPhysicalTechnologyComponents() {
	containsPhysicalTechnologyComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addFilterContainsPhysicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsPhysicalTechnologyComponents(ViewerFilter filter) {
		containsPhysicalTechnologyComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addBusinessFilterContainsPhysicalTechnologyComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsPhysicalTechnologyComponents(ViewerFilter filter) {
		containsPhysicalTechnologyComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#isContainedInContainsPhysicalTechnologyComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsPhysicalTechnologyComponentsTable(EObject element) {
		return ((ReferencesTableSettings)containsPhysicalTechnologyComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LocationPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.Location_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
