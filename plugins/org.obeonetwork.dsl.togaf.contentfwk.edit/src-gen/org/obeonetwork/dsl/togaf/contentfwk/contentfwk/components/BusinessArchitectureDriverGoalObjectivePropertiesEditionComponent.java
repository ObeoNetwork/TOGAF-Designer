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
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.DriverGoalObjectivePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String DRIVERGOALOBJECTIVE_PART = "Driver Goal Objective"; //$NON-NLS-1$

	
	/**
	 * Settings for drivers ReferencesTable
	 */
	protected ReferencesTableSettings driversSettings;
	
	/**
	 * Settings for goals ReferencesTable
	 */
	protected ReferencesTableSettings goalsSettings;
	
	/**
	 * Settings for objectives ReferencesTable
	 */
	protected ReferencesTableSettings objectivesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BusinessArchitectureDriverGoalObjectivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject businessArchitecture, String editing_mode) {
		super(editingContext, businessArchitecture, editing_mode);
		parts = new String[] { DRIVERGOALOBJECTIVE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.DriverGoalObjective.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final BusinessArchitecture businessArchitecture = (BusinessArchitecture)elt;
			final DriverGoalObjectivePropertiesEditionPart driverGoalObjectivePart = (DriverGoalObjectivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers)) {
				driversSettings = new ReferencesTableSettings(businessArchitecture, ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Drivers());
				driverGoalObjectivePart.initDrivers(driversSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals)) {
				goalsSettings = new ReferencesTableSettings(businessArchitecture, ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Goals());
				driverGoalObjectivePart.initGoals(goalsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives)) {
				objectivesSettings = new ReferencesTableSettings(businessArchitecture, ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Objectives());
				driverGoalObjectivePart.initObjectives(objectivesSettings);
			}
			// init filters
			driverGoalObjectivePart.addFilterToDrivers(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Driver); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for drivers
			
			// End of user code
			
			driverGoalObjectivePart.addFilterToGoals(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Goal); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for goals
			
			// End of user code
			
			driverGoalObjectivePart.addFilterToObjectives(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Objective); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for objectives
			
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers) {
			return ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Drivers();
		}
		if (editorKey == ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals) {
			return ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Goals();
		}
		if (editorKey == ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives) {
			return ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Objectives();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BusinessArchitecture businessArchitecture = (BusinessArchitecture)semanticObject;
		if (ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, driversSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				driversSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				driversSettings.move(event.getNewIndex(), (Driver) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, goalsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				goalsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				goalsSettings.move(event.getNewIndex(), (Goal) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, objectivesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				objectivesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				objectivesSettings.move(event.getNewIndex(), (Objective) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DriverGoalObjectivePropertiesEditionPart driverGoalObjectivePart = (DriverGoalObjectivePropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Drivers().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.drivers))
				driverGoalObjectivePart.updateDrivers();
			if (ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Goals().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.goals))
				driverGoalObjectivePart.updateGoals();
			if (ContentfwkPackage.eINSTANCE.getBusinessArchitecture_Objectives().equals(msg.getFeature()) && isAccessible(ContentfwkViewsRepository.DriverGoalObjective.Driversgoalfsobjectives.objectives))
				driverGoalObjectivePart.updateObjectives();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
