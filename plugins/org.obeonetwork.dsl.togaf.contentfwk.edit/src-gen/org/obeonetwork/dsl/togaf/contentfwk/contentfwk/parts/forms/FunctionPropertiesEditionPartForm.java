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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class FunctionPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, FunctionPropertiesEditionPart {

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
	protected EObjectFlatComboViewer isOwnedByUnit;
	protected EObjectFlatComboViewer decomposesFunction;
		protected ReferencesTable communicatedWithFunctions;
		protected List<ViewerFilter> communicatedWithFunctionsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> communicatedWithFunctionsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isBoundedByServices;
		protected List<ViewerFilter> isBoundedByServicesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isBoundedByServicesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable supportsProcesses;
		protected List<ViewerFilter> supportsProcessesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> supportsProcessesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isRealizedByProcesses;
		protected List<ViewerFilter> isRealizedByProcessesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isRealizedByProcessesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable canBeAccessedByRoles;
		protected List<ViewerFilter> canBeAccessedByRolesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> canBeAccessedByRolesFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable isPerformedByActors;
		protected List<ViewerFilter> isPerformedByActorsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isPerformedByActorsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable supportsActors;
		protected List<ViewerFilter> supportsActorsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> supportsActorsFilters = new ArrayList<ViewerFilter>();
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
	public FunctionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence functionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep attributesStep = functionStep.addStep(ContentfwkViewsRepository.Function.Attributes.class);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.name);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.iD);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.description);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.category);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.source);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.owner);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.standardClass);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.standardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate);
		attributesStep.addStep(ContentfwkViewsRepository.Function.Attributes.retireDate);
		
		CompositionStep relatedElementsStep = functionStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.class);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.isOwnedByUnit);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.decomposesFunction);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.supportsActors);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.delegates);
		relatedElementsStep.addStep(ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy);
		
		
		composer = new PartComposer(functionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.Function.Attributes.class) {
					return createAttributesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.iD) {
					return 		createIDText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.category) {
					return 		createCategoryText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.source) {
					return 		createSourceText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.owner) {
					return 		createOwnerText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.standardClass) {
					return createStandardClassEMFComboViewer(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.standardCreationDate) {
					return 		createStandardCreationDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate) {
					return 		createLastStandardCreationDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate) {
					return 		createNextStandardCreationDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.Attributes.retireDate) {
					return 		createRetireDateText(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.class) {
					return createRelatedElementsGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.isOwnedByUnit) {
					return createIsOwnedByUnitFlatComboViewer(parent, widgetFactory);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.decomposesFunction) {
					return createDecomposesFunctionFlatComboViewer(parent, widgetFactory);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions) {
					return createCommunicatedWithFunctionsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices) {
					return createIsBoundedByServicesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses) {
					return createSupportsProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses) {
					return createIsRealizedByProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles) {
					return createCanBeAccessedByRolesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors) {
					return createIsPerformedByActorsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.supportsActors) {
					return createSupportsActorsReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.delegates) {
					return createDelegatesReferencesTable(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy) {
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
		attributesSection.setText(ContentfwkMessages.FunctionPropertiesEditionPart_AttributesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.name, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ContentfwkViewsRepository.Function.Attributes.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.name, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIDText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_IDLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.iD, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.iD, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, iD.getText()));
				}
			}
		});
		EditingUtils.setID(iD, ContentfwkViewsRepository.Function.Attributes.iD);
		EditingUtils.setEEFtype(iD, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.iD, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.description, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, ContentfwkViewsRepository.Function.Attributes.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.description, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoryText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_CategoryLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.category, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.category, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category.getText()));
				}
			}
		});
		EditingUtils.setID(category, ContentfwkViewsRepository.Function.Attributes.category);
		EditingUtils.setEEFtype(category, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.category, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_SourceLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.source, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}
		});
		EditingUtils.setID(source, ContentfwkViewsRepository.Function.Attributes.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.source, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.owner, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}
		});
		EditingUtils.setID(owner, ContentfwkViewsRepository.Function.Attributes.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.owner, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardClassEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_StandardClassLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.standardClass, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.standardClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStandardClass()));
			}

		});
		standardClass.setID(ContentfwkViewsRepository.Function.Attributes.standardClass);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.standardClass, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStandardCreationDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_StandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.standardCreationDate, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.standardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, standardCreationDate.getText()));
				}
			}
		});
		EditingUtils.setID(standardCreationDate, ContentfwkViewsRepository.Function.Attributes.standardCreationDate);
		EditingUtils.setEEFtype(standardCreationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.standardCreationDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLastStandardCreationDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_LastStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastStandardCreationDate.getText()));
				}
			}
		});
		EditingUtils.setID(lastStandardCreationDate, ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate);
		EditingUtils.setEEFtype(lastStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.lastStandardCreationDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNextStandardCreationDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_NextStandardCreationDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nextStandardCreationDate.getText()));
				}
			}
		});
		EditingUtils.setID(nextStandardCreationDate, ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate);
		EditingUtils.setEEFtype(nextStandardCreationDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.nextStandardCreationDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRetireDateText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_RetireDateLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.Attributes.retireDate, ContentfwkViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.Attributes.retireDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, retireDate.getText()));
				}
			}
		});
		EditingUtils.setID(retireDate, ContentfwkViewsRepository.Function.Attributes.retireDate);
		EditingUtils.setEEFtype(retireDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.Attributes.retireDate, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRelatedElementsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section relatedElementsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		relatedElementsSection.setText(ContentfwkMessages.FunctionPropertiesEditionPart_RelatedElementsGroupLabel);
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
	protected Composite createIsOwnedByUnitFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_IsOwnedByUnitLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.RelatedElements.isOwnedByUnit, ContentfwkViewsRepository.FORM_KIND));
		isOwnedByUnit = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.RelatedElements.isOwnedByUnit, ContentfwkViewsRepository.FORM_KIND));
		widgetFactory.adapt(isOwnedByUnit);
		isOwnedByUnit.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData isOwnedByUnitData = new GridData(GridData.FILL_HORIZONTAL);
		isOwnedByUnit.setLayoutData(isOwnedByUnitData);
		isOwnedByUnit.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isOwnedByUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getIsOwnedByUnit()));
			}

		});
		isOwnedByUnit.setID(ContentfwkViewsRepository.Function.RelatedElements.isOwnedByUnit);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.isOwnedByUnit, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDecomposesFunctionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, ContentfwkMessages.FunctionPropertiesEditionPart_DecomposesFunctionLabel, propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.RelatedElements.decomposesFunction, ContentfwkViewsRepository.FORM_KIND));
		decomposesFunction = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ContentfwkViewsRepository.Function.RelatedElements.decomposesFunction, ContentfwkViewsRepository.FORM_KIND));
		widgetFactory.adapt(decomposesFunction);
		decomposesFunction.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData decomposesFunctionData = new GridData(GridData.FILL_HORIZONTAL);
		decomposesFunction.setLayoutData(decomposesFunctionData);
		decomposesFunction.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.decomposesFunction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDecomposesFunction()));
			}

		});
		decomposesFunction.setID(ContentfwkViewsRepository.Function.RelatedElements.decomposesFunction);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.decomposesFunction, ContentfwkViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCommunicatedWithFunctionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.communicatedWithFunctions = new ReferencesTable(ContentfwkMessages.FunctionPropertiesEditionPart_CommunicatedWithFunctionsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addCommunicatedWithFunctions(); }
			public void handleEdit(EObject element) { editCommunicatedWithFunctions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCommunicatedWithFunctions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCommunicatedWithFunctions(element); }
			public void navigateTo(EObject element) { }
		});
		this.communicatedWithFunctions.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions, ContentfwkViewsRepository.FORM_KIND));
		this.communicatedWithFunctions.createControls(parent, widgetFactory);
		this.communicatedWithFunctions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData communicatedWithFunctionsData = new GridData(GridData.FILL_HORIZONTAL);
		communicatedWithFunctionsData.horizontalSpan = 3;
		this.communicatedWithFunctions.setLayoutData(communicatedWithFunctionsData);
		this.communicatedWithFunctions.disableMove();
		communicatedWithFunctions.setID(ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions);
		communicatedWithFunctions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCommunicatedWithFunctions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(communicatedWithFunctions.getInput(), communicatedWithFunctionsFilters, communicatedWithFunctionsBusinessFilters,
		"communicated With Functions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				communicatedWithFunctions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCommunicatedWithFunctions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		communicatedWithFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCommunicatedWithFunctions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.communicatedWithFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		communicatedWithFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void editCommunicatedWithFunctions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				communicatedWithFunctions.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsBoundedByServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isBoundedByServices = new ReferencesTable(ContentfwkMessages.FunctionPropertiesEditionPart_IsBoundedByServicesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsBoundedByServices(); }
			public void handleEdit(EObject element) { editIsBoundedByServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsBoundedByServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsBoundedByServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.isBoundedByServices.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices, ContentfwkViewsRepository.FORM_KIND));
		this.isBoundedByServices.createControls(parent, widgetFactory);
		this.isBoundedByServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isBoundedByServicesData = new GridData(GridData.FILL_HORIZONTAL);
		isBoundedByServicesData.horizontalSpan = 3;
		this.isBoundedByServices.setLayoutData(isBoundedByServicesData);
		this.isBoundedByServices.disableMove();
		isBoundedByServices.setID(ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices);
		isBoundedByServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsBoundedByServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isBoundedByServices.getInput(), isBoundedByServicesFilters, isBoundedByServicesBusinessFilters,
		"is Bounded By Services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isBoundedByServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsBoundedByServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isBoundedByServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsBoundedByServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isBoundedByServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isBoundedByServices.refresh();
	}

	/**
	 * 
	 */
	protected void editIsBoundedByServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isBoundedByServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSupportsProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.supportsProcesses = new ReferencesTable(ContentfwkMessages.FunctionPropertiesEditionPart_SupportsProcessesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addSupportsProcesses(); }
			public void handleEdit(EObject element) { editSupportsProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSupportsProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSupportsProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.supportsProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses, ContentfwkViewsRepository.FORM_KIND));
		this.supportsProcesses.createControls(parent, widgetFactory);
		this.supportsProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData supportsProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		supportsProcessesData.horizontalSpan = 3;
		this.supportsProcesses.setLayoutData(supportsProcessesData);
		this.supportsProcesses.disableMove();
		supportsProcesses.setID(ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses);
		supportsProcesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSupportsProcesses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(supportsProcesses.getInput(), supportsProcessesFilters, supportsProcessesBusinessFilters,
		"supports Processes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				supportsProcesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSupportsProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		supportsProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSupportsProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.supportsProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		supportsProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void editSupportsProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				supportsProcesses.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsRealizedByProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isRealizedByProcesses = new ReferencesTable(ContentfwkMessages.FunctionPropertiesEditionPart_IsRealizedByProcessesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsRealizedByProcesses(); }
			public void handleEdit(EObject element) { editIsRealizedByProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsRealizedByProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsRealizedByProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.isRealizedByProcesses.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses, ContentfwkViewsRepository.FORM_KIND));
		this.isRealizedByProcesses.createControls(parent, widgetFactory);
		this.isRealizedByProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isRealizedByProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		isRealizedByProcessesData.horizontalSpan = 3;
		this.isRealizedByProcesses.setLayoutData(isRealizedByProcessesData);
		this.isRealizedByProcesses.disableMove();
		isRealizedByProcesses.setID(ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses);
		isRealizedByProcesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsRealizedByProcesses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isRealizedByProcesses.getInput(), isRealizedByProcessesFilters, isRealizedByProcessesBusinessFilters,
		"is Realized By Processes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isRealizedByProcesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsRealizedByProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isRealizedByProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsRealizedByProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isRealizedByProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isRealizedByProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void editIsRealizedByProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isRealizedByProcesses.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCanBeAccessedByRolesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.canBeAccessedByRoles = new ReferencesTable(ContentfwkMessages.FunctionPropertiesEditionPart_CanBeAccessedByRolesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addCanBeAccessedByRoles(); }
			public void handleEdit(EObject element) { editCanBeAccessedByRoles(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCanBeAccessedByRoles(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCanBeAccessedByRoles(element); }
			public void navigateTo(EObject element) { }
		});
		this.canBeAccessedByRoles.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles, ContentfwkViewsRepository.FORM_KIND));
		this.canBeAccessedByRoles.createControls(parent, widgetFactory);
		this.canBeAccessedByRoles.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData canBeAccessedByRolesData = new GridData(GridData.FILL_HORIZONTAL);
		canBeAccessedByRolesData.horizontalSpan = 3;
		this.canBeAccessedByRoles.setLayoutData(canBeAccessedByRolesData);
		this.canBeAccessedByRoles.disableMove();
		canBeAccessedByRoles.setID(ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles);
		canBeAccessedByRoles.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCanBeAccessedByRoles() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(canBeAccessedByRoles.getInput(), canBeAccessedByRolesFilters, canBeAccessedByRolesBusinessFilters,
		"can Be Accessed By Roles", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				canBeAccessedByRoles.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCanBeAccessedByRoles(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		canBeAccessedByRoles.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCanBeAccessedByRoles(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.canBeAccessedByRoles, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		canBeAccessedByRoles.refresh();
	}

	/**
	 * 
	 */
	protected void editCanBeAccessedByRoles(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				canBeAccessedByRoles.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIsPerformedByActorsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.isPerformedByActors = new ReferencesTable(ContentfwkMessages.FunctionPropertiesEditionPart_IsPerformedByActorsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsPerformedByActors(); }
			public void handleEdit(EObject element) { editIsPerformedByActors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsPerformedByActors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsPerformedByActors(element); }
			public void navigateTo(EObject element) { }
		});
		this.isPerformedByActors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors, ContentfwkViewsRepository.FORM_KIND));
		this.isPerformedByActors.createControls(parent, widgetFactory);
		this.isPerformedByActors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isPerformedByActorsData = new GridData(GridData.FILL_HORIZONTAL);
		isPerformedByActorsData.horizontalSpan = 3;
		this.isPerformedByActors.setLayoutData(isPerformedByActorsData);
		this.isPerformedByActors.disableMove();
		isPerformedByActors.setID(ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors);
		isPerformedByActors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIsPerformedByActors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(isPerformedByActors.getInput(), isPerformedByActorsFilters, isPerformedByActorsBusinessFilters,
		"is Performed By Actors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				isPerformedByActors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIsPerformedByActors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isPerformedByActors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsPerformedByActors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isPerformedByActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		isPerformedByActors.refresh();
	}

	/**
	 * 
	 */
	protected void editIsPerformedByActors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				isPerformedByActors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSupportsActorsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.supportsActors = new ReferencesTable(ContentfwkMessages.FunctionPropertiesEditionPart_SupportsActorsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addSupportsActors(); }
			public void handleEdit(EObject element) { editSupportsActors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSupportsActors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSupportsActors(element); }
			public void navigateTo(EObject element) { }
		});
		this.supportsActors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.supportsActors, ContentfwkViewsRepository.FORM_KIND));
		this.supportsActors.createControls(parent, widgetFactory);
		this.supportsActors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.supportsActors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData supportsActorsData = new GridData(GridData.FILL_HORIZONTAL);
		supportsActorsData.horizontalSpan = 3;
		this.supportsActors.setLayoutData(supportsActorsData);
		this.supportsActors.disableMove();
		supportsActors.setID(ContentfwkViewsRepository.Function.RelatedElements.supportsActors);
		supportsActors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSupportsActors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(supportsActors.getInput(), supportsActorsFilters, supportsActorsBusinessFilters,
		"supports Actors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.supportsActors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				supportsActors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSupportsActors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.supportsActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		supportsActors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSupportsActors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.supportsActors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		supportsActors.refresh();
	}

	/**
	 * 
	 */
	protected void editSupportsActors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				supportsActors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelegatesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.delegates = new ReferencesTable(ContentfwkMessages.FunctionPropertiesEditionPart_DelegatesLabel, new ReferencesTableListener	() {
			public void handleAdd() { addDelegates(); }
			public void handleEdit(EObject element) { editDelegates(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDelegates(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDelegates(element); }
			public void navigateTo(EObject element) { }
		});
		this.delegates.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.delegates, ContentfwkViewsRepository.FORM_KIND));
		this.delegates.createControls(parent, widgetFactory);
		this.delegates.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.delegates, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delegatesData = new GridData(GridData.FILL_HORIZONTAL);
		delegatesData.horizontalSpan = 3;
		this.delegates.setLayoutData(delegatesData);
		this.delegates.disableMove();
		delegates.setID(ContentfwkViewsRepository.Function.RelatedElements.delegates);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.delegates,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		delegates.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelegates(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.delegates, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.isDelegatedBy = new ReferencesTable(ContentfwkMessages.FunctionPropertiesEditionPart_IsDelegatedByLabel, new ReferencesTableListener	() {
			public void handleAdd() { addIsDelegatedBy(); }
			public void handleEdit(EObject element) { editIsDelegatedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIsDelegatedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIsDelegatedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.isDelegatedBy.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy, ContentfwkViewsRepository.FORM_KIND));
		this.isDelegatedBy.createControls(parent, widgetFactory);
		this.isDelegatedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData isDelegatedByData = new GridData(GridData.FILL_HORIZONTAL);
		isDelegatedByData.horizontalSpan = 3;
		this.isDelegatedBy.setLayoutData(isDelegatedByData);
		this.isDelegatedBy.disableMove();
		isDelegatedBy.setID(ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		isDelegatedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIsDelegatedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FunctionPropertiesEditionPartForm.this, ContentfwkViewsRepository.Function.RelatedElements.isDelegatedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getID()
	 * 
	 */
	public String getID() {
		return iD.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setID(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getCategory()
	 * 
	 */
	public String getCategory() {
		return category.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setCategory(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setOwner(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getStandardClass()
	 * 
	 */
	public Enumerator getStandardClass() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) standardClass.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initStandardClass(EEnum eenum, Enumerator current)
	 */
	public void initStandardClass(EEnum eenum, Enumerator current) {
		standardClass.setInput(eenum.getELiterals());
		standardClass.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setStandardClass(Enumerator newValue)
	 * 
	 */
	public void setStandardClass(Enumerator newValue) {
		standardClass.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getStandardCreationDate()
	 * 
	 */
	public String getStandardCreationDate() {
		return standardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getLastStandardCreationDate()
	 * 
	 */
	public String getLastStandardCreationDate() {
		return lastStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setLastStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getNextStandardCreationDate()
	 * 
	 */
	public String getNextStandardCreationDate() {
		return nextStandardCreationDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setNextStandardCreationDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getRetireDate()
	 * 
	 */
	public String getRetireDate() {
		return retireDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setRetireDate(String newValue)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getIsOwnedByUnit()
	 * 
	 */
	public EObject getIsOwnedByUnit() {
		if (isOwnedByUnit.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) isOwnedByUnit.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initIsOwnedByUnit(EObjectFlatComboSettings)
	 */
	public void initIsOwnedByUnit(EObjectFlatComboSettings settings) {
		isOwnedByUnit.setInput(settings);
		if (current != null) {
			isOwnedByUnit.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setIsOwnedByUnit(EObject newValue)
	 * 
	 */
	public void setIsOwnedByUnit(EObject newValue) {
		if (newValue != null) {
			isOwnedByUnit.setSelection(new StructuredSelection(newValue));
		} else {
			isOwnedByUnit.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setIsOwnedByUnitButtonMode(ButtonsModeEnum newValue)
	 */
	public void setIsOwnedByUnitButtonMode(ButtonsModeEnum newValue) {
		isOwnedByUnit.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterIsOwnedByUnit(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsOwnedByUnit(ViewerFilter filter) {
		isOwnedByUnit.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterIsOwnedByUnit(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsOwnedByUnit(ViewerFilter filter) {
		isOwnedByUnit.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#getDecomposesFunction()
	 * 
	 */
	public EObject getDecomposesFunction() {
		if (decomposesFunction.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decomposesFunction.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initDecomposesFunction(EObjectFlatComboSettings)
	 */
	public void initDecomposesFunction(EObjectFlatComboSettings settings) {
		decomposesFunction.setInput(settings);
		if (current != null) {
			decomposesFunction.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setDecomposesFunction(EObject newValue)
	 * 
	 */
	public void setDecomposesFunction(EObject newValue) {
		if (newValue != null) {
			decomposesFunction.setSelection(new StructuredSelection(newValue));
		} else {
			decomposesFunction.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#setDecomposesFunctionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecomposesFunctionButtonMode(ButtonsModeEnum newValue) {
		decomposesFunction.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterDecomposesFunction(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecomposesFunction(ViewerFilter filter) {
		decomposesFunction.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterDecomposesFunction(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecomposesFunction(ViewerFilter filter) {
		decomposesFunction.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initCommunicatedWithFunctions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCommunicatedWithFunctions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		communicatedWithFunctions.setContentProvider(contentProvider);
		communicatedWithFunctions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#updateCommunicatedWithFunctions()
	 * 
	 */
	public void updateCommunicatedWithFunctions() {
	communicatedWithFunctions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterCommunicatedWithFunctions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommunicatedWithFunctions(ViewerFilter filter) {
		communicatedWithFunctionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterCommunicatedWithFunctions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommunicatedWithFunctions(ViewerFilter filter) {
		communicatedWithFunctionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#isContainedInCommunicatedWithFunctionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCommunicatedWithFunctionsTable(EObject element) {
		return ((ReferencesTableSettings)communicatedWithFunctions.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initIsBoundedByServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsBoundedByServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isBoundedByServices.setContentProvider(contentProvider);
		isBoundedByServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#updateIsBoundedByServices()
	 * 
	 */
	public void updateIsBoundedByServices() {
	isBoundedByServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterIsBoundedByServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsBoundedByServices(ViewerFilter filter) {
		isBoundedByServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterIsBoundedByServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsBoundedByServices(ViewerFilter filter) {
		isBoundedByServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#isContainedInIsBoundedByServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsBoundedByServicesTable(EObject element) {
		return ((ReferencesTableSettings)isBoundedByServices.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initSupportsProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSupportsProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		supportsProcesses.setContentProvider(contentProvider);
		supportsProcesses.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#updateSupportsProcesses()
	 * 
	 */
	public void updateSupportsProcesses() {
	supportsProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterSupportsProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSupportsProcesses(ViewerFilter filter) {
		supportsProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterSupportsProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSupportsProcesses(ViewerFilter filter) {
		supportsProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#isContainedInSupportsProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSupportsProcessesTable(EObject element) {
		return ((ReferencesTableSettings)supportsProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initIsRealizedByProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsRealizedByProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isRealizedByProcesses.setContentProvider(contentProvider);
		isRealizedByProcesses.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#updateIsRealizedByProcesses()
	 * 
	 */
	public void updateIsRealizedByProcesses() {
	isRealizedByProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterIsRealizedByProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsRealizedByProcesses(ViewerFilter filter) {
		isRealizedByProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterIsRealizedByProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsRealizedByProcesses(ViewerFilter filter) {
		isRealizedByProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#isContainedInIsRealizedByProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsRealizedByProcessesTable(EObject element) {
		return ((ReferencesTableSettings)isRealizedByProcesses.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initCanBeAccessedByRoles(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCanBeAccessedByRoles(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		canBeAccessedByRoles.setContentProvider(contentProvider);
		canBeAccessedByRoles.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#updateCanBeAccessedByRoles()
	 * 
	 */
	public void updateCanBeAccessedByRoles() {
	canBeAccessedByRoles.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterCanBeAccessedByRoles(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCanBeAccessedByRoles(ViewerFilter filter) {
		canBeAccessedByRolesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterCanBeAccessedByRoles(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCanBeAccessedByRoles(ViewerFilter filter) {
		canBeAccessedByRolesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#isContainedInCanBeAccessedByRolesTable(EObject element)
	 * 
	 */
	public boolean isContainedInCanBeAccessedByRolesTable(EObject element) {
		return ((ReferencesTableSettings)canBeAccessedByRoles.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initIsPerformedByActors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIsPerformedByActors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		isPerformedByActors.setContentProvider(contentProvider);
		isPerformedByActors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#updateIsPerformedByActors()
	 * 
	 */
	public void updateIsPerformedByActors() {
	isPerformedByActors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterIsPerformedByActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsPerformedByActors(ViewerFilter filter) {
		isPerformedByActorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterIsPerformedByActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsPerformedByActors(ViewerFilter filter) {
		isPerformedByActorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#isContainedInIsPerformedByActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsPerformedByActorsTable(EObject element) {
		return ((ReferencesTableSettings)isPerformedByActors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initSupportsActors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSupportsActors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		supportsActors.setContentProvider(contentProvider);
		supportsActors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#updateSupportsActors()
	 * 
	 */
	public void updateSupportsActors() {
	supportsActors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterSupportsActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSupportsActors(ViewerFilter filter) {
		supportsActorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterSupportsActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSupportsActors(ViewerFilter filter) {
		supportsActorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#isContainedInSupportsActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSupportsActorsTable(EObject element) {
		return ((ReferencesTableSettings)supportsActors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initDelegates(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#updateDelegates()
	 * 
	 */
	public void updateDelegates() {
	delegates.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter) {
		delegatesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterDelegates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter) {
		delegatesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#isContainedInDelegatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element) {
		return ((ReferencesTableSettings)delegates.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#initIsDelegatedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#updateIsDelegatedBy()
	 * 
	 */
	public void updateIsDelegatedBy() {
	isDelegatedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#addBusinessFilterIsDelegatedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter) {
		isDelegatedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.FunctionPropertiesEditionPart#isContainedInIsDelegatedByTable(EObject element)
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
		return ContentfwkMessages.Function_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
