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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class LogicalApplicationComponentPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, LogicalApplicationComponentPropertiesEditionPart {

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
	protected EObjectFlatComboViewer decomposesLogicalApplicationComponent;
		protected ReferencesTable isExtendedByPhysicalApplicationComponents;
		protected List<ViewerFilter> isExtendedByPhysicalApplicationComponentsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isExtendedByPhysicalApplicationComponentsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable communicatesWith;
		protected List<ViewerFilter> communicatesWithBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> communicatesWithFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable operatesOnDataEntities;
		protected List<ViewerFilter> operatesOnDataEntitiesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> operatesOnDataEntitiesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable implementsServices;
		protected List<ViewerFilter> implementsServicesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> implementsServicesFilters = new ArrayList<ViewerFilter>();
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
	public LogicalApplicationComponentPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence logicalApplicationComponentStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = logicalApplicationComponentStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate);
		
		CompositionStep relatedElementsStep = logicalApplicationComponentStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(logicalApplicationComponentStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.class) {
					return createAttributesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD) {
					return 		createIDText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category) {
					return 		createCategoryText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source) {
					return 		createSourceText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner) {
					return 		createOwnerText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass) {
					return createStandardClassEMFComboViewer(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate) {
					return 		createStandardCreationDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate) {
					return 		createLastStandardCreationDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate) {
					return 		createNextStandardCreationDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate) {
					return 		createRetireDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.class) {
					return createRelatedElementsGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent) {
					return createDecomposesLogicalApplicationComponentFlatComboViewer(parent, widgetFactory);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents) {
					return createIsExtendedByPhysicalApplicationComponentsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith) {
					return createCommunicatesWithReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities) {
					return createOperatesOnDataEntitiesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices) {
					return createImplementsServicesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates) {
					return createDelegatesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy) {
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
		attributesSection.setText(ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_AttributesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.name, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}
		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.iD, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.description, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}
		});
		EditingUtils.setID(category, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.category, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}
		});
		EditingUtils.setID(source, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.source, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}
		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.owner, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardClassEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_StandardClassLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStandardClass()));
			}

		});
		standardClass.setID(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardClass, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardCreationDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_StandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
				}
			}
		});
		EditingUtils.setID(standardCreationDate, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate);
		EditingUtils.setEEFtype(standardCreationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.standardCreationDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLastStandardCreationDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_LastStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
				}
			}
		});
		EditingUtils.setID(lastStandardCreationDate, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate);
		EditingUtils.setEEFtype(lastStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNextStandardCreationDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_NextStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
				}
			}
		});
		EditingUtils.setID(nextStandardCreationDate, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate);
		EditingUtils.setEEFtype(nextStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRetireDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_RetireDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
				}
			}
		});
		EditingUtils.setID(retireDate, ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate);
		EditingUtils.setEEFtype(retireDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.Attributes.retireDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section relatedElementsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		relatedElementsSection.setText(ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createDecomposesLogicalApplicationComponentFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_DecomposesLogicalApplicationComponentLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent, ContentfwkViewsRepository.FORM_KIND));
		decomposesLogicalApplicationComponent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent, ContentfwkViewsRepository.FORM_KIND));
		widgetFactory.adapt(decomposesLogicalApplicationComponent);
		decomposesLogicalApplicationComponent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData decomposesLogicalApplicationComponentData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesLogicalApplicationComponent.setLayoutData(decomposesLogicalApplicationComponentData);
		decomposesLogicalApplicationComponent.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDecomposesLogicalApplicationComponent()));
			}

		});
		decomposesLogicalApplicationComponent.setID(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.decomposesLogicalApplicationComponent, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createIsExtendedByPhysicalApplicationComponentsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isExtendedByPhysicalApplicationComponents = new ReferencesTable(ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_IsExtendedByPhysicalApplicationComponentsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsExtendedByPhysicalApplicationComponents(); }
			public void handleEdit(EObject element) { editIsExtendedByPhysicalApplicationComponents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsExtendedByPhysicalApplicationComponents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsExtendedByPhysicalApplicationComponents(element); }
			public void navigateTo(EObject element) { }
		});
		this.isExtendedByPhysicalApplicationComponents.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents, ContentfwkViewsRepository.FORM_KIND));
		this.isExtendedByPhysicalApplicationComponents.createControls(parent, widgetFactory);
		this.isExtendedByPhysicalApplicationComponents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isExtendedByPhysicalApplicationComponentsData = new GridData(GridData.FILL_HORIZONTAL);
		isExtendedByPhysicalApplicationComponentsData.horizontalSpan = 3;
		this.isExtendedByPhysicalApplicationComponents.setLayoutData(isExtendedByPhysicalApplicationComponentsData);
		this.isExtendedByPhysicalApplicationComponents.disableMove();
		isExtendedByPhysicalApplicationComponents.setID(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents);
		isExtendedByPhysicalApplicationComponents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsExtendedByPhysicalApplicationComponents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isExtendedByPhysicalApplicationComponents.getInput(), isExtendedByPhysicalApplicationComponentsFilters, isExtendedByPhysicalApplicationComponentsBusinessFilters,
		"is Extended By Physical Application Components", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isExtendedByPhysicalApplicationComponents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsExtendedByPhysicalApplicationComponents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isExtendedByPhysicalApplicationComponents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsExtendedByPhysicalApplicationComponents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isExtendedByPhysicalApplicationComponents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isExtendedByPhysicalApplicationComponents.refresh();
	}

	/**
	 * 
	 */
	protected void editIsExtendedByPhysicalApplicationComponents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isExtendedByPhysicalApplicationComponents.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCommunicatesWithReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.communicatesWith = new ReferencesTable(ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_CommunicatesWithLabel, new ReferencesTableListener	() {
			public void handleAdd() { addCommunicatesWith(); }
			public void handleEdit(EObject element) { editCommunicatesWith(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCommunicatesWith(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCommunicatesWith(element); }
			public void navigateTo(EObject element) { }
		});
		this.communicatesWith.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith, ContentfwkViewsRepository.FORM_KIND));
		this.communicatesWith.createControls(parent, widgetFactory);
		this.communicatesWith.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData communicatesWithData = new GridData(GridData.FILL_HORIZONTAL);
		communicatesWithData.horizontalSpan = 3;
		this.communicatesWith.setLayoutData(communicatesWithData);
		this.communicatesWith.disableMove();
		communicatesWith.setID(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		communicatesWith.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCommunicatesWith(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.communicatesWith, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createOperatesOnDataEntitiesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.operatesOnDataEntities = new ReferencesTable(ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_OperatesOnDataEntitiesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addOperatesOnDataEntities(); }
			public void handleEdit(EObject element) { editOperatesOnDataEntities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOperatesOnDataEntities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOperatesOnDataEntities(element); }
			public void navigateTo(EObject element) { }
		});
		this.operatesOnDataEntities.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities, ContentfwkViewsRepository.FORM_KIND));
		this.operatesOnDataEntities.createControls(parent, widgetFactory);
		this.operatesOnDataEntities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData operatesOnDataEntitiesData = new GridData(GridData.FILL_HORIZONTAL);
		operatesOnDataEntitiesData.horizontalSpan = 3;
		this.operatesOnDataEntities.setLayoutData(operatesOnDataEntitiesData);
		this.operatesOnDataEntities.disableMove();
		operatesOnDataEntities.setID(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities);
		operatesOnDataEntities.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOperatesOnDataEntities() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(operatesOnDataEntities.getInput(), operatesOnDataEntitiesFilters, operatesOnDataEntitiesBusinessFilters,
		"operates On Data Entities", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				operatesOnDataEntities.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOperatesOnDataEntities(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		operatesOnDataEntities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOperatesOnDataEntities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.operatesOnDataEntities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		operatesOnDataEntities.refresh();
	}

	/**
	 * 
	 */
	protected void editOperatesOnDataEntities(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				operatesOnDataEntities.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createImplementsServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.implementsServices = new ReferencesTable(ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_ImplementsServicesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addImplementsServices(); }
			public void handleEdit(EObject element) { editImplementsServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveImplementsServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromImplementsServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.implementsServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices, ContentfwkViewsRepository.FORM_KIND));
		this.implementsServices.createControls(parent, widgetFactory);
		this.implementsServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData implementsServicesData = new GridData(GridData.FILL_HORIZONTAL);
		implementsServicesData.horizontalSpan = 3;
		this.implementsServices.setLayoutData(implementsServicesData);
		this.implementsServices.disableMove();
		implementsServices.setID(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices);
		implementsServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addImplementsServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(implementsServices.getInput(), implementsServicesFilters, implementsServicesBusinessFilters,
		"implements Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				implementsServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveImplementsServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		implementsServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromImplementsServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.implementsServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		implementsServices.refresh();
	}

	/**
	 * 
	 */
	protected void editImplementsServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				implementsServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates, ContentfwkViewsRepository.FORM_KIND));
		this.delegates.createControls(parent, widgetFactory);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.LogicalApplicationComponentPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.FORM_KIND));
		this.isDelegatedBy.createControls(parent, widgetFactory);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LogicalApplicationComponentPropertiesEditionPartForm.this, ContentfwkViewsRepository.LogicalApplicationComponent.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getStandardClass()
	 * 
	 */
	public Enumerator getStandardClass() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) standardClass.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#initStandardClass(EEnum eenum, Enumerator current)
	 */
	public void initStandardClass(EEnum eenum, Enumerator current) {
		standardClass.setInput(eenum.getELiterals());
		standardClass.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setStandardClass(Enumerator newValue)
	 * 
	 */
	public void setStandardClass(Enumerator newValue) {
		standardClass.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getStandardCreationDate()
	 * 
	 */
	public String getStandardCreationDate() {
		return standardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getLastStandardCreationDate()
	 * 
	 */
	public String getLastStandardCreationDate() {
		return lastStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setLastStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getNextStandardCreationDate()
	 * 
	 */
	public String getNextStandardCreationDate() {
		return nextStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setNextStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getRetireDate()
	 * 
	 */
	public String getRetireDate() {
		return retireDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setRetireDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#getDecomposesLogicalApplicationComponent()
	 * 
	 */
	public EObject getDecomposesLogicalApplicationComponent() {
		if (decomposesLogicalApplicationComponent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decomposesLogicalApplicationComponent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#initDecomposesLogicalApplicationComponent(EObjectFlatComboSettings)
	 */
	public void initDecomposesLogicalApplicationComponent(EObjectFlatComboSettings settings) {
		decomposesLogicalApplicationComponent.setInput(settings);
		if (current != null) {
			decomposesLogicalApplicationComponent.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setDecomposesLogicalApplicationComponent(EObject newValue)
	 * 
	 */
	public void setDecomposesLogicalApplicationComponent(EObject newValue) {
		if (newValue != null) {
			decomposesLogicalApplicationComponent.setSelection(new StructuredSelection(newValue));
		} else {
			decomposesLogicalApplicationComponent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#setDecomposesLogicalApplicationComponentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecomposesLogicalApplicationComponentButtonMode(ButtonsModeEnum newValue) {
		decomposesLogicalApplicationComponent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addFilterDecomposesLogicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesLogicalApplicationComponent(ViewerFilter filter) {
		decomposesLogicalApplicationComponent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addBusinessFilterDecomposesLogicalApplicationComponent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesLogicalApplicationComponent(ViewerFilter filter) {
		decomposesLogicalApplicationComponent.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#initIsExtendedByPhysicalApplicationComponents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsExtendedByPhysicalApplicationComponents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isExtendedByPhysicalApplicationComponents.setContentProvider(contentProvider);
		isExtendedByPhysicalApplicationComponents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#updateIsExtendedByPhysicalApplicationComponents()
	 * 
	 */
	public void updateIsExtendedByPhysicalApplicationComponents() {
	isExtendedByPhysicalApplicationComponents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addFilterIsExtendedByPhysicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsExtendedByPhysicalApplicationComponents(ViewerFilter filter) {
		isExtendedByPhysicalApplicationComponentsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addBusinessFilterIsExtendedByPhysicalApplicationComponents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsExtendedByPhysicalApplicationComponents(ViewerFilter filter) {
		isExtendedByPhysicalApplicationComponentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#isContainedInIsExtendedByPhysicalApplicationComponentsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsExtendedByPhysicalApplicationComponentsTable(EObject element) {
		return ((ReferencesTableSettings)isExtendedByPhysicalApplicationComponents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#initCommunicatesWith(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#updateCommunicatesWith()
	 * 
	 */
	public void updateCommunicatesWith() {
	communicatesWith.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addFilterCommunicatesWith(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommunicatesWith(ViewerFilter filter) {
		communicatesWithFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addBusinessFilterCommunicatesWith(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommunicatesWith(ViewerFilter filter) {
		communicatesWithBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#isContainedInCommunicatesWithTable(EObject element)
	 * 
	 */
	public boolean isContainedInCommunicatesWithTable(EObject element) {
		return ((ReferencesTableSettings)communicatesWith.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#initOperatesOnDataEntities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOperatesOnDataEntities(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		operatesOnDataEntities.setContentProvider(contentProvider);
		operatesOnDataEntities.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#updateOperatesOnDataEntities()
	 * 
	 */
	public void updateOperatesOnDataEntities() {
	operatesOnDataEntities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addFilterOperatesOnDataEntities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOperatesOnDataEntities(ViewerFilter filter) {
		operatesOnDataEntitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addBusinessFilterOperatesOnDataEntities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOperatesOnDataEntities(ViewerFilter filter) {
		operatesOnDataEntitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#isContainedInOperatesOnDataEntitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInOperatesOnDataEntitiesTable(EObject element) {
		return ((ReferencesTableSettings)operatesOnDataEntities.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#initImplementsServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initImplementsServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		implementsServices.setContentProvider(contentProvider);
		implementsServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#updateImplementsServices()
	 * 
	 */
	public void updateImplementsServices() {
	implementsServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addFilterImplementsServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToImplementsServices(ViewerFilter filter) {
		implementsServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addBusinessFilterImplementsServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToImplementsServices(ViewerFilter filter) {
		implementsServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#isContainedInImplementsServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInImplementsServicesTable(EObject element) {
		return ((ReferencesTableSettings)implementsServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.LogicalApplicationComponentPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.LogicalApplicationComponent_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
