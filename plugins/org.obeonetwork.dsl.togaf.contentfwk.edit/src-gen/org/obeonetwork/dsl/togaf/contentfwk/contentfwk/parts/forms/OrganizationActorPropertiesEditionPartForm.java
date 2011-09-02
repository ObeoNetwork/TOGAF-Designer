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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.providers.ContentfwkMessages;


// End of user code

/**
 * 
 * 
 */
public class OrganizationActorPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, OrganizationActorPropertiesEditionPart {

	protected ReferencesTable organizations;
	protected List<ViewerFilter> organizationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> organizationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable actors;
	protected List<ViewerFilter> actorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> actorsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OrganizationActorPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence organizationActorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep organizationactorsStep = organizationActorStep.addStep(ContentfwkViewsRepository.OrganizationActor.Organizationactors.class);
		organizationactorsStep.addStep(ContentfwkViewsRepository.OrganizationActor.Organizationactors.organizations);
		organizationactorsStep.addStep(ContentfwkViewsRepository.OrganizationActor.Organizationactors.actors);
		
		
		composer = new PartComposer(organizationActorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ContentfwkViewsRepository.OrganizationActor.Organizationactors.class) {
					return createOrganizationactorsGroup(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationActor.Organizationactors.organizations) {
					return createOrganizationsTableComposition(widgetFactory, parent);
				}
				if (key == ContentfwkViewsRepository.OrganizationActor.Organizationactors.actors) {
					return createActorsTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createOrganizationactorsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section organizationactorsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		organizationactorsSection.setText(ContentfwkMessages.OrganizationActorPropertiesEditionPart_OrganizationactorsGroupLabel);
		GridData organizationactorsSectionData = new GridData(GridData.FILL_HORIZONTAL);
		organizationactorsSectionData.horizontalSpan = 3;
		organizationactorsSection.setLayoutData(organizationactorsSectionData);
		Composite organizationactorsGroup = widgetFactory.createComposite(organizationactorsSection);
		GridLayout organizationactorsGroupLayout = new GridLayout();
		organizationactorsGroupLayout.numColumns = 3;
		organizationactorsGroup.setLayout(organizationactorsGroupLayout);
		organizationactorsSection.setClient(organizationactorsGroup);
		return organizationactorsGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOrganizationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.organizations = new ReferencesTable(ContentfwkMessages.OrganizationActorPropertiesEditionPart_OrganizationsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationActorPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationActor.Organizationactors.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				organizations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationActorPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationActor.Organizationactors.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				organizations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationActorPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationActor.Organizationactors.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				organizations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationActorPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationActor.Organizationactors.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				organizations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.organizationsFilters) {
			this.organizations.addFilter(filter);
		}
		this.organizations.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationActor.Organizationactors.organizations, ContentfwkViewsRepository.FORM_KIND));
		this.organizations.createControls(parent, widgetFactory);
		this.organizations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationActorPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationActor.Organizationactors.organizations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData organizationsData = new GridData(GridData.FILL_HORIZONTAL);
		organizationsData.horizontalSpan = 3;
		this.organizations.setLayoutData(organizationsData);
		this.organizations.setLowerBound(0);
		this.organizations.setUpperBound(-1);
		organizations.setID(ContentfwkViewsRepository.OrganizationActor.Organizationactors.organizations);
		organizations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createActorsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.actors = new ReferencesTable(ContentfwkMessages.OrganizationActorPropertiesEditionPart_ActorsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationActorPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationActor.Organizationactors.actors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				actors.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationActorPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationActor.Organizationactors.actors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				actors.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationActorPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationActor.Organizationactors.actors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				actors.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationActorPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationActor.Organizationactors.actors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				actors.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.actorsFilters) {
			this.actors.addFilter(filter);
		}
		this.actors.setHelpText(propertiesEditionComponent.getHelpContent(ContentfwkViewsRepository.OrganizationActor.Organizationactors.actors, ContentfwkViewsRepository.FORM_KIND));
		this.actors.createControls(parent, widgetFactory);
		this.actors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OrganizationActorPropertiesEditionPartForm.this, ContentfwkViewsRepository.OrganizationActor.Organizationactors.actors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData actorsData = new GridData(GridData.FILL_HORIZONTAL);
		actorsData.horizontalSpan = 3;
		this.actors.setLayoutData(actorsData);
		this.actors.setLowerBound(0);
		this.actors.setUpperBound(-1);
		actors.setID(ContentfwkViewsRepository.OrganizationActor.Organizationactors.actors);
		actors.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart#initOrganizations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOrganizations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		organizations.setContentProvider(contentProvider);
		organizations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart#updateOrganizations()
	 * 
	 */
	public void updateOrganizations() {
	organizations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart#addFilterOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganizations(ViewerFilter filter) {
		organizationsFilters.add(filter);
		if (this.organizations != null) {
			this.organizations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart#addBusinessFilterOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganizations(ViewerFilter filter) {
		organizationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart#isContainedInOrganizationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOrganizationsTable(EObject element) {
		return ((ReferencesTableSettings)organizations.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart#initActors(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initActors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		actors.setContentProvider(contentProvider);
		actors.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart#updateActors()
	 * 
	 */
	public void updateActors() {
	actors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart#addFilterActors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToActors(ViewerFilter filter) {
		actorsFilters.add(filter);
		if (this.actors != null) {
			this.actors.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart#addBusinessFilterActors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToActors(ViewerFilter filter) {
		actorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.OrganizationActorPropertiesEditionPart#isContainedInActorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInActorsTable(EObject element) {
		return ((ReferencesTableSettings)actors.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ContentfwkMessages.OrganizationActor_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
