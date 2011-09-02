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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class MeasurePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, MeasurePropertiesEditionPart {

	protected Text name;
	protected Text iD;
	protected Text description;
	protected Text category;
	protected Text source;
	protected Text owner;
	protected EObjectFlatComboViewer decomposesMeasure;
		protected ReferencesTable setsPerformanceCriteriaForObjectives;
		protected List<ViewerFilter> setsPerformanceCriteriaForObjectivesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> setsPerformanceCriteriaForObjectivesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable setsPerformanceCriteriaForServices;
		protected List<ViewerFilter> setsPerformanceCriteriaForServicesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> setsPerformanceCriteriaForServicesFilters = new ArrayList<ViewerFilter>();
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
	public MeasurePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence measureStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = measureStep.addStep(ContentfwkViewsRepository.Measure.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.Measure.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.Measure.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.Measure.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.Measure.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.Measure.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.Measure.Attributes.owner);
		
		CompositionStep relatedElementsStep = measureStep.addStep(ContentfwkViewsRepository.Measure.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Measure.RelatedElements.decomposesMeasure);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForObjectives);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Measure.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Measure.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(measureStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.Measure.Attributes.class) {
					return createAttributesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.Attributes.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.Attributes.iD) {
					return 		createIDText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.Attributes.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.Attributes.category) {
					return 		createCategoryText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.Attributes.source) {
					return 		createSourceText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.Attributes.owner) {
					return 		createOwnerText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.RelatedElements.class) {
					return createRelatedElementsGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.RelatedElements.decomposesMeasure) {
					return createDecomposesMeasureFlatComboViewer(parent, widgetFactory);
				}
				if (key == ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForObjectives) {
					return createSetsPerformanceCriteriaForObjectivesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForServices) {
					return createSetsPerformanceCriteriaForServicesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.RelatedElements.delegates) {
					return createDelegatesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Measure.RelatedElements.isDelegatedBy) {
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
		attributesSection.setText(ContentfwkMessages.MeasurePropertiesEditionPart_AttributesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.MeasurePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Measure.Attributes.name, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ContentfwkViewsRepository.Measure.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.Attributes.name, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.MeasurePropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Measure.Attributes.iD, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}
		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.Measure.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.Attributes.iD, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.MeasurePropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Measure.Attributes.description, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ContentfwkViewsRepository.Measure.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.Attributes.description, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.MeasurePropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Measure.Attributes.category, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}
		});
		EditingUtils.setID(category, ContentfwkViewsRepository.Measure.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.Attributes.category, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.MeasurePropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Measure.Attributes.source, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}
		});
		EditingUtils.setID(source, ContentfwkViewsRepository.Measure.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.Attributes.source, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.MeasurePropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Measure.Attributes.owner, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}
		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.Measure.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.Attributes.owner, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section relatedElementsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		relatedElementsSection.setText(ContentfwkMessages.MeasurePropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createDecomposesMeasureFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.MeasurePropertiesEditionPart_DecomposesMeasureLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Measure.RelatedElements.decomposesMeasure, ContentfwkViewsRepository.FORM_KIND));
		decomposesMeasure = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Measure.RelatedElements.decomposesMeasure, ContentfwkViewsRepository.FORM_KIND));
		widgetFactory.adapt(decomposesMeasure);
		decomposesMeasure.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData decomposesMeasureData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesMeasure.setLayoutData(decomposesMeasureData);
		decomposesMeasure.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.decomposesMeasure, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDecomposesMeasure()));
			}

		});
		decomposesMeasure.setID(ContentfwkViewsRepository.Measure.RelatedElements.decomposesMeasure);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.RelatedElements.decomposesMeasure, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSetsPerformanceCriteriaForObjectivesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.setsPerformanceCriteriaForObjectives = new ReferencesTable(ContentfwkMessages.MeasurePropertiesEditionPart_SetsPerformanceCriteriaForObjectivesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addSetsPerformanceCriteriaForObjectives(); }
			public void handleEdit(EObject element) { editSetsPerformanceCriteriaForObjectives(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSetsPerformanceCriteriaForObjectives(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSetsPerformanceCriteriaForObjectives(element); }
			public void navigateTo(EObject element) { }
		});
		this.setsPerformanceCriteriaForObjectives.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForObjectives, ContentfwkViewsRepository.FORM_KIND));
		this.setsPerformanceCriteriaForObjectives.createControls(parent, widgetFactory);
		this.setsPerformanceCriteriaForObjectives.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForObjectives, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData setsPerformanceCriteriaForObjectivesData = new GridData(GridData.FILL_HORIZONTAL);
		setsPerformanceCriteriaForObjectivesData.horizontalSpan = 3;
		this.setsPerformanceCriteriaForObjectives.setLayoutData(setsPerformanceCriteriaForObjectivesData);
		this.setsPerformanceCriteriaForObjectives.disableMove();
		setsPerformanceCriteriaForObjectives.setID(ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForObjectives);
		setsPerformanceCriteriaForObjectives.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSetsPerformanceCriteriaForObjectives() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(setsPerformanceCriteriaForObjectives.getInput(), setsPerformanceCriteriaForObjectivesFilters, setsPerformanceCriteriaForObjectivesBusinessFilters,
		"sets Performance Criteria For Objectives", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForObjectives,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				setsPerformanceCriteriaForObjectives.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSetsPerformanceCriteriaForObjectives(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForObjectives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		setsPerformanceCriteriaForObjectives.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSetsPerformanceCriteriaForObjectives(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForObjectives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		setsPerformanceCriteriaForObjectives.refresh();
	}

	/**
	 * 
	 */
	protected void editSetsPerformanceCriteriaForObjectives(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				setsPerformanceCriteriaForObjectives.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSetsPerformanceCriteriaForServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.setsPerformanceCriteriaForServices = new ReferencesTable(ContentfwkMessages.MeasurePropertiesEditionPart_SetsPerformanceCriteriaForServicesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addSetsPerformanceCriteriaForServices(); }
			public void handleEdit(EObject element) { editSetsPerformanceCriteriaForServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSetsPerformanceCriteriaForServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSetsPerformanceCriteriaForServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.setsPerformanceCriteriaForServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForServices, ContentfwkViewsRepository.FORM_KIND));
		this.setsPerformanceCriteriaForServices.createControls(parent, widgetFactory);
		this.setsPerformanceCriteriaForServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData setsPerformanceCriteriaForServicesData = new GridData(GridData.FILL_HORIZONTAL);
		setsPerformanceCriteriaForServicesData.horizontalSpan = 3;
		this.setsPerformanceCriteriaForServices.setLayoutData(setsPerformanceCriteriaForServicesData);
		this.setsPerformanceCriteriaForServices.disableMove();
		setsPerformanceCriteriaForServices.setID(ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForServices);
		setsPerformanceCriteriaForServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSetsPerformanceCriteriaForServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(setsPerformanceCriteriaForServices.getInput(), setsPerformanceCriteriaForServicesFilters, setsPerformanceCriteriaForServicesBusinessFilters,
		"sets Performance Criteria For Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				setsPerformanceCriteriaForServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSetsPerformanceCriteriaForServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		setsPerformanceCriteriaForServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSetsPerformanceCriteriaForServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.setsPerformanceCriteriaForServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		setsPerformanceCriteriaForServices.refresh();
	}

	/**
	 * 
	 */
	protected void editSetsPerformanceCriteriaForServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				setsPerformanceCriteriaForServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.MeasurePropertiesEditionPart_DelegatesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.RelatedElements.delegates, ContentfwkViewsRepository.FORM_KIND));
		this.delegates.createControls(parent, widgetFactory);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.Measure.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.MeasurePropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Measure.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.FORM_KIND));
		this.isDelegatedBy.createControls(parent, widgetFactory);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.Measure.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasurePropertiesEditionPartForm.this, ContentfwkViewsRepository.Measure.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#getDecomposesMeasure()
	 * 
	 */
	public EObject getDecomposesMeasure() {
		if (decomposesMeasure.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decomposesMeasure.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#initDecomposesMeasure(EObjectFlatComboSettings)
	 */
	public void initDecomposesMeasure(EObjectFlatComboSettings settings) {
		decomposesMeasure.setInput(settings);
		if (current != null) {
			decomposesMeasure.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#setDecomposesMeasure(EObject newValue)
	 * 
	 */
	public void setDecomposesMeasure(EObject newValue) {
		if (newValue != null) {
			decomposesMeasure.setSelection(new StructuredSelection(newValue));
		} else {
			decomposesMeasure.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#setDecomposesMeasureButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecomposesMeasureButtonMode(ButtonsModeEnum newValue) {
		decomposesMeasure.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#addFilterDecomposesMeasure(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesMeasure(ViewerFilter filter) {
		decomposesMeasure.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#addBusinessFilterDecomposesMeasure(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesMeasure(ViewerFilter filter) {
		decomposesMeasure.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#initSetsPerformanceCriteriaForObjectives(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSetsPerformanceCriteriaForObjectives(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		setsPerformanceCriteriaForObjectives.setContentProvider(contentProvider);
		setsPerformanceCriteriaForObjectives.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#updateSetsPerformanceCriteriaForObjectives()
	 * 
	 */
	public void updateSetsPerformanceCriteriaForObjectives() {
	setsPerformanceCriteriaForObjectives.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#addFilterSetsPerformanceCriteriaForObjectives(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSetsPerformanceCriteriaForObjectives(ViewerFilter filter) {
		setsPerformanceCriteriaForObjectivesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#addBusinessFilterSetsPerformanceCriteriaForObjectives(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSetsPerformanceCriteriaForObjectives(ViewerFilter filter) {
		setsPerformanceCriteriaForObjectivesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#isContainedInSetsPerformanceCriteriaForObjectivesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSetsPerformanceCriteriaForObjectivesTable(EObject element) {
		return ((ReferencesTableSettings)setsPerformanceCriteriaForObjectives.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#initSetsPerformanceCriteriaForServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSetsPerformanceCriteriaForServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		setsPerformanceCriteriaForServices.setContentProvider(contentProvider);
		setsPerformanceCriteriaForServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#updateSetsPerformanceCriteriaForServices()
	 * 
	 */
	public void updateSetsPerformanceCriteriaForServices() {
	setsPerformanceCriteriaForServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#addFilterSetsPerformanceCriteriaForServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSetsPerformanceCriteriaForServices(ViewerFilter filter) {
		setsPerformanceCriteriaForServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#addBusinessFilterSetsPerformanceCriteriaForServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSetsPerformanceCriteriaForServices(ViewerFilter filter) {
		setsPerformanceCriteriaForServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#isContainedInSetsPerformanceCriteriaForServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSetsPerformanceCriteriaForServicesTable(EObject element) {
		return ((ReferencesTableSettings)setsPerformanceCriteriaForServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.MeasurePropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.Measure_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
