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

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class OrganizationUnitPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, OrganizationUnitPropertiesEditionPart {

	protected Text name;
	protected Text iD;
	protected Text description;
	protected Text category;
	protected Text source;
	protected Text owner;
	protected Text headcount;
	protected EObjectFlatComboViewer operatesInLocation;
		protected ReferencesTable ownsAndGovernsServices;
		protected List<ViewerFilter> ownsAndGovernsServicesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> ownsAndGovernsServicesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable containsActors;
		protected List<ViewerFilter> containsActorsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> containsActorsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable ownsFunctions;
		protected List<ViewerFilter> ownsFunctionsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> ownsFunctionsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable participatesInProcesses;
		protected List<ViewerFilter> participatesInProcessesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> participatesInProcessesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isMotivatedByDrivers;
		protected List<ViewerFilter> isMotivatedByDriversBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isMotivatedByDriversFilters = new ArrayList<ViewerFilter>();
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
	public OrganizationUnitPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence organizationUnitStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = organizationUnitStep.addStep(ContentfwkViewsRepository.OrganizationUnit.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.OrganizationUnit.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.OrganizationUnit.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.OrganizationUnit.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.OrganizationUnit.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.OrganizationUnit.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.OrganizationUnit.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount);
		
		CompositionStep relatedElementsStep = organizationUnitStep.addStep(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation);
		relatedElementsStep.addStep(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions);
		relatedElementsStep.addStep(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers);
		relatedElementsStep.addStep(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts);
		relatedElementsStep.addStep(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(organizationUnitStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.OrganizationUnit.Attributes.class) {
					return createAttributesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.Attributes.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.Attributes.iD) {
					return 		createIDText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.Attributes.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.Attributes.category) {
					return 		createCategoryText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.Attributes.source) {
					return 		createSourceText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.Attributes.owner) {
					return 		createOwnerText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount) {
					return 		createHeadcountText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.class) {
					return createRelatedElementsGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation) {
					return createOperatesInLocationFlatComboViewer(parent, widgetFactory);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices) {
					return createOwnsAndGovernsServicesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors) {
					return createContainsActorsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions) {
					return createOwnsFunctionsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses) {
					return createParticipatesInProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers) {
					return createIsMotivatedByDriversReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts) {
					return createProducesProductsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates) {
					return createDelegatesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy) {
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
		attributesSection.setText(ContentfwkMessages.OrganizationUnitPropertiesEditionPart_AttributesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.OrganizationUnitPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.OrganizationUnit.Attributes.name, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ContentfwkViewsRepository.OrganizationUnit.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.Attributes.name, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.OrganizationUnitPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.OrganizationUnit.Attributes.iD, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}
		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.OrganizationUnit.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.Attributes.iD, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.OrganizationUnitPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.OrganizationUnit.Attributes.description, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ContentfwkViewsRepository.OrganizationUnit.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.Attributes.description, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.OrganizationUnitPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.OrganizationUnit.Attributes.category, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}
		});
		EditingUtils.setID(category, ContentfwkViewsRepository.OrganizationUnit.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.Attributes.category, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.OrganizationUnitPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.OrganizationUnit.Attributes.source, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}
		});
		EditingUtils.setID(source, ContentfwkViewsRepository.OrganizationUnit.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.Attributes.source, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.OrganizationUnitPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.OrganizationUnit.Attributes.owner, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}
		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.OrganizationUnit.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.Attributes.owner, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHeadcountText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.OrganizationUnitPropertiesEditionPart_HeadcountLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount, ContentfwkViewsRepository.FORM_KIND));
		headcount = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		headcount.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData headcountData = new GridData(GridData.FILL_HORIZONTAL);
		headcount.setLayoutData(headcountData);
		headcount.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, headcount.getText()));
			}
		});
		headcount.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, headcount.getText()));
				}
			}
		});
		EditingUtils.setID(headcount, ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount);
		EditingUtils.setEEFtype(headcount, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.Attributes.headcount, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section relatedElementsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		relatedElementsSection.setText(ContentfwkMessages.OrganizationUnitPropertiesEditionPart_RelatedElementsGroupLabel);
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOperatesInLocationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.OrganizationUnitPropertiesEditionPart_OperatesInLocationLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation, ContentfwkViewsRepository.FORM_KIND));
		operatesInLocation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation, ContentfwkViewsRepository.FORM_KIND));
		widgetFactory.adapt(operatesInLocation);
		operatesInLocation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData operatesInLocationData = new GridData(GridData.FILL_HORIZONTAL);
		operatesInLocation.setLayoutData(operatesInLocationData);
		operatesInLocation.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOperatesInLocation()));
			}

		});
		operatesInLocation.setID(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.operatesInLocation, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOwnsAndGovernsServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.ownsAndGovernsServices = new ReferencesTable(ContentfwkMessages.OrganizationUnitPropertiesEditionPart_OwnsAndGovernsServicesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOwnsAndGovernsServices(); }
			public void handleEdit(EObject element) { editOwnsAndGovernsServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOwnsAndGovernsServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOwnsAndGovernsServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.ownsAndGovernsServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices, ContentfwkViewsRepository.FORM_KIND));
		this.ownsAndGovernsServices.createControls(parent, widgetFactory);
		this.ownsAndGovernsServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownsAndGovernsServicesData = new GridData(GridData.FILL_HORIZONTAL);
		ownsAndGovernsServicesData.horizontalSpan = 3;
		this.ownsAndGovernsServices.setLayoutData(ownsAndGovernsServicesData);
		this.ownsAndGovernsServices.disableMove();
		ownsAndGovernsServices.setID(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices);
		ownsAndGovernsServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOwnsAndGovernsServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(ownsAndGovernsServices.getInput(), ownsAndGovernsServicesFilters, ownsAndGovernsServicesBusinessFilters,
		"owns And Governs Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				ownsAndGovernsServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOwnsAndGovernsServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		ownsAndGovernsServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOwnsAndGovernsServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsAndGovernsServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		ownsAndGovernsServices.refresh();
	}

	/**
	 * 
	 */
	protected void editOwnsAndGovernsServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				ownsAndGovernsServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createContainsActorsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.containsActors = new ReferencesTable(ContentfwkMessages.OrganizationUnitPropertiesEditionPart_ContainsActorsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addContainsActors(); }
			public void handleEdit(EObject element) { editContainsActors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContainsActors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContainsActors(element); }
			public void navigateTo(EObject element) { }
		});
		this.containsActors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors, ContentfwkViewsRepository.FORM_KIND));
		this.containsActors.createControls(parent, widgetFactory);
		this.containsActors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containsActorsData = new GridData(GridData.FILL_HORIZONTAL);
		containsActorsData.horizontalSpan = 3;
		this.containsActors.setLayoutData(containsActorsData);
		this.containsActors.disableMove();
		containsActors.setID(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		containsActors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContainsActors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.containsActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createOwnsFunctionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.ownsFunctions = new ReferencesTable(ContentfwkMessages.OrganizationUnitPropertiesEditionPart_OwnsFunctionsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOwnsFunctions(); }
			public void handleEdit(EObject element) { editOwnsFunctions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOwnsFunctions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOwnsFunctions(element); }
			public void navigateTo(EObject element) { }
		});
		this.ownsFunctions.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions, ContentfwkViewsRepository.FORM_KIND));
		this.ownsFunctions.createControls(parent, widgetFactory);
		this.ownsFunctions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownsFunctionsData = new GridData(GridData.FILL_HORIZONTAL);
		ownsFunctionsData.horizontalSpan = 3;
		this.ownsFunctions.setLayoutData(ownsFunctionsData);
		this.ownsFunctions.disableMove();
		ownsFunctions.setID(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions);
		ownsFunctions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOwnsFunctions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(ownsFunctions.getInput(), ownsFunctionsFilters, ownsFunctionsBusinessFilters,
		"owns Functions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				ownsFunctions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOwnsFunctions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		ownsFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOwnsFunctions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.ownsFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		ownsFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void editOwnsFunctions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				ownsFunctions.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createParticipatesInProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.participatesInProcesses = new ReferencesTable(ContentfwkMessages.OrganizationUnitPropertiesEditionPart_ParticipatesInProcessesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addParticipatesInProcesses(); }
			public void handleEdit(EObject element) { editParticipatesInProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveParticipatesInProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromParticipatesInProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.participatesInProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses, ContentfwkViewsRepository.FORM_KIND));
		this.participatesInProcesses.createControls(parent, widgetFactory);
		this.participatesInProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData participatesInProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		participatesInProcessesData.horizontalSpan = 3;
		this.participatesInProcesses.setLayoutData(participatesInProcessesData);
		this.participatesInProcesses.disableMove();
		participatesInProcesses.setID(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		participatesInProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromParticipatesInProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.participatesInProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createIsMotivatedByDriversReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isMotivatedByDrivers = new ReferencesTable(ContentfwkMessages.OrganizationUnitPropertiesEditionPart_IsMotivatedByDriversLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsMotivatedByDrivers(); }
			public void handleEdit(EObject element) { editIsMotivatedByDrivers(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsMotivatedByDrivers(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsMotivatedByDrivers(element); }
			public void navigateTo(EObject element) { }
		});
		this.isMotivatedByDrivers.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers, ContentfwkViewsRepository.FORM_KIND));
		this.isMotivatedByDrivers.createControls(parent, widgetFactory);
		this.isMotivatedByDrivers.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isMotivatedByDriversData = new GridData(GridData.FILL_HORIZONTAL);
		isMotivatedByDriversData.horizontalSpan = 3;
		this.isMotivatedByDrivers.setLayoutData(isMotivatedByDriversData);
		this.isMotivatedByDrivers.disableMove();
		isMotivatedByDrivers.setID(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers);
		isMotivatedByDrivers.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsMotivatedByDrivers() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isMotivatedByDrivers.getInput(), isMotivatedByDriversFilters, isMotivatedByDriversBusinessFilters,
		"is Motivated By Drivers", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isMotivatedByDrivers.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsMotivatedByDrivers(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isMotivatedByDrivers.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsMotivatedByDrivers(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isMotivatedByDrivers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isMotivatedByDrivers.refresh();
	}

	/**
	 * 
	 */
	protected void editIsMotivatedByDrivers(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isMotivatedByDrivers.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createProducesProductsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.producesProducts = new ReferencesTable(ContentfwkMessages.OrganizationUnitPropertiesEditionPart_ProducesProductsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addProducesProducts(); }
			public void handleEdit(EObject element) { editProducesProducts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProducesProducts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProducesProducts(element); }
			public void navigateTo(EObject element) { }
		});
		this.producesProducts.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts, ContentfwkViewsRepository.FORM_KIND));
		this.producesProducts.createControls(parent, widgetFactory);
		this.producesProducts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData producesProductsData = new GridData(GridData.FILL_HORIZONTAL);
		producesProductsData.horizontalSpan = 3;
		this.producesProducts.setLayoutData(producesProductsData);
		this.producesProducts.disableMove();
		producesProducts.setID(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		producesProducts.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProducesProducts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.producesProducts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createDelegatesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.OrganizationUnitPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates, ContentfwkViewsRepository.FORM_KIND));
		this.delegates.createControls(parent, widgetFactory);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.OrganizationUnitPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.FORM_KIND));
		this.isDelegatedBy.createControls(parent, widgetFactory);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationUnitPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationUnit.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#getHeadcount()
	 * 
	 */
	public String getHeadcount() {
		return headcount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#setHeadcount(String newValue)
	 * 
	 */
	public void setHeadcount(String newValue) {
		if (newValue != null) {
			headcount.setText(newValue);
		} else {
			headcount.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#getOperatesInLocation()
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#initOperatesInLocation(EObjectFlatComboSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#setOperatesInLocation(EObject newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#setOperatesInLocationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOperatesInLocationButtonMode(ButtonsModeEnum newValue) {
		operatesInLocation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addFilterOperatesInLocation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOperatesInLocation(ViewerFilter filter) {
		operatesInLocation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addBusinessFilterOperatesInLocation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOperatesInLocation(ViewerFilter filter) {
		operatesInLocation.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#initOwnsAndGovernsServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOwnsAndGovernsServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownsAndGovernsServices.setContentProvider(contentProvider);
		ownsAndGovernsServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#updateOwnsAndGovernsServices()
	 * 
	 */
	public void updateOwnsAndGovernsServices() {
	ownsAndGovernsServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addFilterOwnsAndGovernsServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnsAndGovernsServices(ViewerFilter filter) {
		ownsAndGovernsServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addBusinessFilterOwnsAndGovernsServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnsAndGovernsServices(ViewerFilter filter) {
		ownsAndGovernsServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#isContainedInOwnsAndGovernsServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnsAndGovernsServicesTable(EObject element) {
		return ((ReferencesTableSettings)ownsAndGovernsServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#initContainsActors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#updateContainsActors()
	 * 
	 */
	public void updateContainsActors() {
	containsActors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addFilterContainsActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainsActors(ViewerFilter filter) {
		containsActorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addBusinessFilterContainsActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainsActors(ViewerFilter filter) {
		containsActorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#isContainedInContainsActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainsActorsTable(EObject element) {
		return ((ReferencesTableSettings)containsActors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#initOwnsFunctions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOwnsFunctions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownsFunctions.setContentProvider(contentProvider);
		ownsFunctions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#updateOwnsFunctions()
	 * 
	 */
	public void updateOwnsFunctions() {
	ownsFunctions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addFilterOwnsFunctions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnsFunctions(ViewerFilter filter) {
		ownsFunctionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addBusinessFilterOwnsFunctions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnsFunctions(ViewerFilter filter) {
		ownsFunctionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#isContainedInOwnsFunctionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnsFunctionsTable(EObject element) {
		return ((ReferencesTableSettings)ownsFunctions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#initParticipatesInProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#updateParticipatesInProcesses()
	 * 
	 */
	public void updateParticipatesInProcesses() {
	participatesInProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addFilterParticipatesInProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParticipatesInProcesses(ViewerFilter filter) {
		participatesInProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addBusinessFilterParticipatesInProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParticipatesInProcesses(ViewerFilter filter) {
		participatesInProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#isContainedInParticipatesInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInParticipatesInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)participatesInProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#initIsMotivatedByDrivers(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsMotivatedByDrivers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isMotivatedByDrivers.setContentProvider(contentProvider);
		isMotivatedByDrivers.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#updateIsMotivatedByDrivers()
	 * 
	 */
	public void updateIsMotivatedByDrivers() {
	isMotivatedByDrivers.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addFilterIsMotivatedByDrivers(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsMotivatedByDrivers(ViewerFilter filter) {
		isMotivatedByDriversFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addBusinessFilterIsMotivatedByDrivers(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsMotivatedByDrivers(ViewerFilter filter) {
		isMotivatedByDriversBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#isContainedInIsMotivatedByDriversTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsMotivatedByDriversTable(EObject element) {
		return ((ReferencesTableSettings)isMotivatedByDrivers.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#initProducesProducts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#updateProducesProducts()
	 * 
	 */
	public void updateProducesProducts() {
	producesProducts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addFilterProducesProducts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProducesProducts(ViewerFilter filter) {
		producesProductsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addBusinessFilterProducesProducts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProducesProducts(ViewerFilter filter) {
		producesProductsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#isContainedInProducesProductsTable(EObject element)
	 * 
	 */
	public boolean isContainedInProducesProductsTable(EObject element) {
		return ((ReferencesTableSettings)producesProducts.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationUnitPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.OrganizationUnit_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
