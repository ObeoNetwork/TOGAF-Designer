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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class EventPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, EventPropertiesEditionPart {

	protected Text name;
	protected Text iD;
	protected Text description;
	protected Text category;
	protected Text source;
	protected Text owner;
	protected EObjectFlatComboViewer isGeneratedByActors;
		protected ReferencesTable isResolvedByActors;
		protected List<ViewerFilter> isResolvedByActorsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isResolvedByActorsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isResolvedByBusinessServices;
		protected List<ViewerFilter> isResolvedByBusinessServicesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isResolvedByBusinessServicesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isResolvedByProcesses;
		protected List<ViewerFilter> isResolvedByProcessesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isResolvedByProcessesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isGeneratedByProcesses;
		protected List<ViewerFilter> isGeneratedByProcessesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isGeneratedByProcessesFilters = new ArrayList<ViewerFilter>();
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
	public EventPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eventStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = eventStep.addStep(ContentfwkViewsRepository.Event.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.Event.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.Event.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.Event.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.Event.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.Event.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.Event.Attributes.owner);
		
		CompositionStep relatedElementsStep = eventStep.addStep(ContentfwkViewsRepository.Event.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Event.RelatedElements.isResolvedByActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Event.RelatedElements.isResolvedByBusinessServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Event.RelatedElements.isResolvedByProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Event.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Event.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(eventStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.Event.Attributes.class) {
					return createAttributesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.Attributes.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.Attributes.iD) {
					return 		createIDText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.Attributes.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.Attributes.category) {
					return 		createCategoryText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.Attributes.source) {
					return 		createSourceText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.Attributes.owner) {
					return 		createOwnerText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.RelatedElements.class) {
					return createRelatedElementsGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByActors) {
					return createIsGeneratedByActorsFlatComboViewer(parent, widgetFactory);
				}
				if (key == ContentfwkViewsRepository.Event.RelatedElements.isResolvedByActors) {
					return createIsResolvedByActorsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.RelatedElements.isResolvedByBusinessServices) {
					return createIsResolvedByBusinessServicesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.RelatedElements.isResolvedByProcesses) {
					return createIsResolvedByProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByProcesses) {
					return createIsGeneratedByProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.RelatedElements.delegates) {
					return createDelegatesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Event.RelatedElements.isDelegatedBy) {
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
		attributesSection.setText(ContentfwkMessages.EventPropertiesEditionPart_AttributesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.EventPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Event.Attributes.name, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ContentfwkViewsRepository.Event.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.Attributes.name, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.EventPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Event.Attributes.iD, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}
		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.Event.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.Attributes.iD, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.EventPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Event.Attributes.description, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ContentfwkViewsRepository.Event.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.Attributes.description, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.EventPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Event.Attributes.category, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}
		});
		EditingUtils.setID(category, ContentfwkViewsRepository.Event.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.Attributes.category, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.EventPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Event.Attributes.source, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}
		});
		EditingUtils.setID(source, ContentfwkViewsRepository.Event.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.Attributes.source, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.EventPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Event.Attributes.owner, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}
		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.Event.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.Attributes.owner, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section relatedElementsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		relatedElementsSection.setText(ContentfwkMessages.EventPropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createIsGeneratedByActorsFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.EventPropertiesEditionPart_IsGeneratedByActorsLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByActors, ContentfwkViewsRepository.FORM_KIND));
		isGeneratedByActors = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByActors, ContentfwkViewsRepository.FORM_KIND));
		widgetFactory.adapt(isGeneratedByActors);
		isGeneratedByActors.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData isGeneratedByActorsData = new GridData(GridData.FILL_HORIZONTAL);
		isGeneratedByActors.setLayoutData(isGeneratedByActorsData);
		isGeneratedByActors.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getIsGeneratedByActors()));
			}

		});
		isGeneratedByActors.setID(ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByActors);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByActors, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIsResolvedByActorsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isResolvedByActors = new ReferencesTable(ContentfwkMessages.EventPropertiesEditionPart_IsResolvedByActorsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsResolvedByActors(); }
			public void handleEdit(EObject element) { editIsResolvedByActors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsResolvedByActors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsResolvedByActors(element); }
			public void navigateTo(EObject element) { }
		});
		this.isResolvedByActors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.RelatedElements.isResolvedByActors, ContentfwkViewsRepository.FORM_KIND));
		this.isResolvedByActors.createControls(parent, widgetFactory);
		this.isResolvedByActors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isResolvedByActorsData = new GridData(GridData.FILL_HORIZONTAL);
		isResolvedByActorsData.horizontalSpan = 3;
		this.isResolvedByActors.setLayoutData(isResolvedByActorsData);
		this.isResolvedByActors.disableMove();
		isResolvedByActors.setID(ContentfwkViewsRepository.Event.RelatedElements.isResolvedByActors);
		isResolvedByActors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsResolvedByActors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isResolvedByActors.getInput(), isResolvedByActorsFilters, isResolvedByActorsBusinessFilters,
		"is Resolved By Actors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByActors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isResolvedByActors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsResolvedByActors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isResolvedByActors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsResolvedByActors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isResolvedByActors.refresh();
	}

	/**
	 * 
	 */
	protected void editIsResolvedByActors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isResolvedByActors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsResolvedByBusinessServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isResolvedByBusinessServices = new ReferencesTable(ContentfwkMessages.EventPropertiesEditionPart_IsResolvedByBusinessServicesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsResolvedByBusinessServices(); }
			public void handleEdit(EObject element) { editIsResolvedByBusinessServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsResolvedByBusinessServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsResolvedByBusinessServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.isResolvedByBusinessServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.RelatedElements.isResolvedByBusinessServices, ContentfwkViewsRepository.FORM_KIND));
		this.isResolvedByBusinessServices.createControls(parent, widgetFactory);
		this.isResolvedByBusinessServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByBusinessServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isResolvedByBusinessServicesData = new GridData(GridData.FILL_HORIZONTAL);
		isResolvedByBusinessServicesData.horizontalSpan = 3;
		this.isResolvedByBusinessServices.setLayoutData(isResolvedByBusinessServicesData);
		this.isResolvedByBusinessServices.disableMove();
		isResolvedByBusinessServices.setID(ContentfwkViewsRepository.Event.RelatedElements.isResolvedByBusinessServices);
		isResolvedByBusinessServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsResolvedByBusinessServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isResolvedByBusinessServices.getInput(), isResolvedByBusinessServicesFilters, isResolvedByBusinessServicesBusinessFilters,
		"is Resolved By Business Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByBusinessServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isResolvedByBusinessServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsResolvedByBusinessServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByBusinessServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isResolvedByBusinessServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsResolvedByBusinessServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByBusinessServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isResolvedByBusinessServices.refresh();
	}

	/**
	 * 
	 */
	protected void editIsResolvedByBusinessServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isResolvedByBusinessServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsResolvedByProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isResolvedByProcesses = new ReferencesTable(ContentfwkMessages.EventPropertiesEditionPart_IsResolvedByProcessesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsResolvedByProcesses(); }
			public void handleEdit(EObject element) { editIsResolvedByProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsResolvedByProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsResolvedByProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.isResolvedByProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.RelatedElements.isResolvedByProcesses, ContentfwkViewsRepository.FORM_KIND));
		this.isResolvedByProcesses.createControls(parent, widgetFactory);
		this.isResolvedByProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isResolvedByProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		isResolvedByProcessesData.horizontalSpan = 3;
		this.isResolvedByProcesses.setLayoutData(isResolvedByProcessesData);
		this.isResolvedByProcesses.disableMove();
		isResolvedByProcesses.setID(ContentfwkViewsRepository.Event.RelatedElements.isResolvedByProcesses);
		isResolvedByProcesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsResolvedByProcesses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isResolvedByProcesses.getInput(), isResolvedByProcessesFilters, isResolvedByProcessesBusinessFilters,
		"is Resolved By Processes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByProcesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isResolvedByProcesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsResolvedByProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isResolvedByProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsResolvedByProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isResolvedByProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isResolvedByProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void editIsResolvedByProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isResolvedByProcesses.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsGeneratedByProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isGeneratedByProcesses = new ReferencesTable(ContentfwkMessages.EventPropertiesEditionPart_IsGeneratedByProcessesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsGeneratedByProcesses(); }
			public void handleEdit(EObject element) { editIsGeneratedByProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsGeneratedByProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsGeneratedByProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.isGeneratedByProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByProcesses, ContentfwkViewsRepository.FORM_KIND));
		this.isGeneratedByProcesses.createControls(parent, widgetFactory);
		this.isGeneratedByProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isGeneratedByProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		isGeneratedByProcessesData.horizontalSpan = 3;
		this.isGeneratedByProcesses.setLayoutData(isGeneratedByProcessesData);
		this.isGeneratedByProcesses.disableMove();
		isGeneratedByProcesses.setID(ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByProcesses);
		isGeneratedByProcesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsGeneratedByProcesses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isGeneratedByProcesses.getInput(), isGeneratedByProcessesFilters, isGeneratedByProcessesBusinessFilters,
		"is Generated By Processes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByProcesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isGeneratedByProcesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsGeneratedByProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isGeneratedByProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsGeneratedByProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isGeneratedByProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void editIsGeneratedByProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isGeneratedByProcesses.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.EventPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.RelatedElements.delegates, ContentfwkViewsRepository.FORM_KIND));
		this.delegates.createControls(parent, widgetFactory);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.Event.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.EventPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Event.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.FORM_KIND));
		this.isDelegatedBy.createControls(parent, widgetFactory);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.Event.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EventPropertiesEditionPartForm.this, ContentfwkViewsRepository.Event.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#getIsGeneratedByActors()
	 * 
	 */
	public EObject getIsGeneratedByActors() {
		if (isGeneratedByActors.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) isGeneratedByActors.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#initIsGeneratedByActors(EObjectFlatComboSettings)
	 */
	public void initIsGeneratedByActors(EObjectFlatComboSettings settings) {
		isGeneratedByActors.setInput(settings);
		if (current != null) {
			isGeneratedByActors.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#setIsGeneratedByActors(EObject newValue)
	 * 
	 */
	public void setIsGeneratedByActors(EObject newValue) {
		if (newValue != null) {
			isGeneratedByActors.setSelection(new StructuredSelection(newValue));
		} else {
			isGeneratedByActors.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#setIsGeneratedByActorsButtonMode(ButtonsModeEnum newValue)
	 */
	public void setIsGeneratedByActorsButtonMode(ButtonsModeEnum newValue) {
		isGeneratedByActors.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addFilterIsGeneratedByActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsGeneratedByActors(ViewerFilter filter) {
		isGeneratedByActors.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addBusinessFilterIsGeneratedByActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsGeneratedByActors(ViewerFilter filter) {
		isGeneratedByActors.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#initIsResolvedByActors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsResolvedByActors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isResolvedByActors.setContentProvider(contentProvider);
		isResolvedByActors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#updateIsResolvedByActors()
	 * 
	 */
	public void updateIsResolvedByActors() {
	isResolvedByActors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addFilterIsResolvedByActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsResolvedByActors(ViewerFilter filter) {
		isResolvedByActorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addBusinessFilterIsResolvedByActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsResolvedByActors(ViewerFilter filter) {
		isResolvedByActorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#isContainedInIsResolvedByActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsResolvedByActorsTable(EObject element) {
		return ((ReferencesTableSettings)isResolvedByActors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#initIsResolvedByBusinessServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsResolvedByBusinessServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isResolvedByBusinessServices.setContentProvider(contentProvider);
		isResolvedByBusinessServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#updateIsResolvedByBusinessServices()
	 * 
	 */
	public void updateIsResolvedByBusinessServices() {
	isResolvedByBusinessServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addFilterIsResolvedByBusinessServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsResolvedByBusinessServices(ViewerFilter filter) {
		isResolvedByBusinessServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addBusinessFilterIsResolvedByBusinessServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsResolvedByBusinessServices(ViewerFilter filter) {
		isResolvedByBusinessServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#isContainedInIsResolvedByBusinessServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsResolvedByBusinessServicesTable(EObject element) {
		return ((ReferencesTableSettings)isResolvedByBusinessServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#initIsResolvedByProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsResolvedByProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isResolvedByProcesses.setContentProvider(contentProvider);
		isResolvedByProcesses.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#updateIsResolvedByProcesses()
	 * 
	 */
	public void updateIsResolvedByProcesses() {
	isResolvedByProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addFilterIsResolvedByProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsResolvedByProcesses(ViewerFilter filter) {
		isResolvedByProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addBusinessFilterIsResolvedByProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsResolvedByProcesses(ViewerFilter filter) {
		isResolvedByProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#isContainedInIsResolvedByProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsResolvedByProcessesTable(EObject element) {
		return ((ReferencesTableSettings)isResolvedByProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#initIsGeneratedByProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsGeneratedByProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isGeneratedByProcesses.setContentProvider(contentProvider);
		isGeneratedByProcesses.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#updateIsGeneratedByProcesses()
	 * 
	 */
	public void updateIsGeneratedByProcesses() {
	isGeneratedByProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addFilterIsGeneratedByProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsGeneratedByProcesses(ViewerFilter filter) {
		isGeneratedByProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addBusinessFilterIsGeneratedByProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsGeneratedByProcesses(ViewerFilter filter) {
		isGeneratedByProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#isContainedInIsGeneratedByProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsGeneratedByProcessesTable(EObject element) {
		return ((ReferencesTableSettings)isGeneratedByProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.Event_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
