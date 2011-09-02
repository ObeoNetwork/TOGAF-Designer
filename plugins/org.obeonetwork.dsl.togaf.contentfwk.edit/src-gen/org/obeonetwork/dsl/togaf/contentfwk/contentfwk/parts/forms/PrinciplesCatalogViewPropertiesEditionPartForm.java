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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PrinciplesCatalogViewPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class PrinciplesCatalogViewPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, PrinciplesCatalogViewPropertiesEditionPart {

	protected ReferencesTable principles;
	protected List<ViewerFilter> principlesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> principlesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PrinciplesCatalogViewPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence principlesCatalogViewStep = new BindingCompositionSequence(propertiesEditionComponent);
		principlesCatalogViewStep
			.addStep(ContentfwkViewsRepository.PrinciplesCatalogView.Principles.class)
			.addStep(ContentfwkViewsRepository.PrinciplesCatalogView.Principles.principles_);
		
		
		composer = new PartComposer(principlesCatalogViewStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.PrinciplesCatalogView.Principles.class) {
					return createPrinciplesGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.PrinciplesCatalogView.Principles.principles_) {
					return createPrinciplesTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPrinciplesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section principlesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		principlesSection.setText(ContentfwkMessages.PrinciplesCatalogViewPropertiesEditionPart_PrinciplesGroupLabel);
		GridData principlesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		principlesSectionData.horizontalSpan = 3;
		principlesSection.setLayoutData(principlesSectionData);
		Composite principlesGroup = widgetFactory.createComposite(principlesSection);
		GridLayout principlesGroupLayout = new GridLayout();
		principlesGroupLayout.numColumns = 3;
		principlesGroup.setLayout(principlesGroupLayout);
		principlesSection.setClient(principlesGroup);
		return principlesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPrinciplesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.principles = new ReferencesTable(ContentfwkMessages.PrinciplesCatalogViewPropertiesEditionPart_PrinciplesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrinciplesCatalogViewPropertiesEditionPartForm.this, ContentfwkViewsRepository.PrinciplesCatalogView.Principles.principles_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				principles.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrinciplesCatalogViewPropertiesEditionPartForm.this, ContentfwkViewsRepository.PrinciplesCatalogView.Principles.principles_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				principles.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrinciplesCatalogViewPropertiesEditionPartForm.this, ContentfwkViewsRepository.PrinciplesCatalogView.Principles.principles_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				principles.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrinciplesCatalogViewPropertiesEditionPartForm.this, ContentfwkViewsRepository.PrinciplesCatalogView.Principles.principles_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				principles.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.principlesFilters) {
			this.principles.addFilter(filter);
		}
		this.principles.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.PrinciplesCatalogView.Principles.principles_, ContentfwkViewsRepository.FORM_KIND));
		this.principles.createControls(parent, widgetFactory);
		this.principles.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PrinciplesCatalogViewPropertiesEditionPartForm.this, ContentfwkViewsRepository.PrinciplesCatalogView.Principles.principles_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData principlesData = new GridData(GridData.FILL_HORIZONTAL);
		principlesData.horizontalSpan = 3;
		this.principles.setLayoutData(principlesData);
		this.principles.setLowerBound(0);
		this.principles.setUpperBound(-1);
		principles.setID(ContentfwkViewsRepository.PrinciplesCatalogView.Principles.principles_);
		principles.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PrinciplesCatalogViewPropertiesEditionPart#initPrinciples(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPrinciples(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		principles.setContentProvider(contentProvider);
		principles.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PrinciplesCatalogViewPropertiesEditionPart#updatePrinciples()
	 * 
	 */
	public void updatePrinciples() {
	principles.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PrinciplesCatalogViewPropertiesEditionPart#addFilterPrinciples(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPrinciples(ViewerFilter filter) {
		principlesFilters.add(filter);
		if (this.principles != null) {
			this.principles.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PrinciplesCatalogViewPropertiesEditionPart#addBusinessFilterPrinciples(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPrinciples(ViewerFilter filter) {
		principlesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.PrinciplesCatalogViewPropertiesEditionPart#isContainedInPrinciplesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPrinciplesTable(EObject element) {
		return ((ReferencesTableSettings)principles.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.PrinciplesCatalogView_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
