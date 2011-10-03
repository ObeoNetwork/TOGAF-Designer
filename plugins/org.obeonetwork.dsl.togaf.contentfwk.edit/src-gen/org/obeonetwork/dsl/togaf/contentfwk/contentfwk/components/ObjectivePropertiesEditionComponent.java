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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ObjectivePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ObjectivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for delegates ReferencesTable
	 */
	private	ReferencesTableSettings delegatesSettings;
	
	/**
	 * Settings for isDelegatedBy ReferencesTable
	 */
	private	ReferencesTableSettings isDelegatedBySettings;
	
	/**
	 * Settings for realizesGoals ReferencesTable
	 */
	private	ReferencesTableSettings realizesGoalsSettings;
	
	/**
	 * Settings for isTrackedAgainstMeasures ReferencesTable
	 */
	private	ReferencesTableSettings isTrackedAgainstMeasuresSettings;
	
	/**
	 * Settings for decomposesObjective EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposesObjectiveSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ObjectivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject objective, String editing_mode) {
		super(editingContext, objective, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.Objective.class;
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
			final Objective objective = (Objective)elt;
			final ObjectivePropertiesEditionPart basePart = (ObjectivePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.Objective.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(objective, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Objective.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(objective, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (objective.getName() != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), objective.getName()));
			
			if (objective.getDescription() != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), objective.getDescription()));
			
			if (objective.getCategory() != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), objective.getCategory()));
			
			if (objective.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), objective.getSourceDescr()));
			
			if (objective.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), objective.getOwnerDescr()));
			
			if (objective.getID() != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), objective.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.Objective.RelatedElements.realizesGoals)) {
				realizesGoalsSettings = new ReferencesTableSettings(objective, ContentfwkPackage.eINSTANCE.getObjective_RealizesGoals());
				basePart.initRealizesGoals(realizesGoalsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Objective.RelatedElements.isTrackedAgainstMeasures)) {
				isTrackedAgainstMeasuresSettings = new ReferencesTableSettings(objective, ContentfwkPackage.eINSTANCE.getObjective_IsTrackedAgainstMeasures());
				basePart.initIsTrackedAgainstMeasures(isTrackedAgainstMeasuresSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Objective.RelatedElements.decomposesObjective)) {
				// init part
				decomposesObjectiveSettings = new EObjectFlatComboSettings(objective, ContentfwkPackage.eINSTANCE.getObjective_DecomposesObjective());
				basePart.initDecomposesObjective(decomposesObjectiveSettings);
				// set the button mode
				basePart.setDecomposesObjectiveButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			basePart.addFilterToDelegates(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInDelegatesTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToDelegates(new EObjectFilter(ContentfwkPackage.eINSTANCE.getElement()));
			// Start of user code for additional businessfilters for delegates
			
			// End of user code
			
			basePart.addFilterToIsDelegatedBy(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsDelegatedByTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsDelegatedBy(new EObjectFilter(ContentfwkPackage.eINSTANCE.getElement()));
			// Start of user code for additional businessfilters for isDelegatedBy
			
			// End of user code
			
			
			
			
			
			
			
			basePart.addFilterToRealizesGoals(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInRealizesGoalsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToRealizesGoals(new EObjectFilter(ContentfwkPackage.eINSTANCE.getGoal()));
			// Start of user code for additional businessfilters for realizesGoals
			
			// End of user code
			
			basePart.addFilterToIsTrackedAgainstMeasures(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsTrackedAgainstMeasuresTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsTrackedAgainstMeasures(new EObjectFilter(ContentfwkPackage.eINSTANCE.getMeasure()));
			// Start of user code for additional businessfilters for isTrackedAgainstMeasures
			
			// End of user code
			
			basePart.addFilterToDecomposesObjective(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Objective); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposesObjective
			
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
		if (editorKey == ContentfwkViewsRepository.Objective.RelatedElements.delegates) {
			return ContentfwkPackage.eINSTANCE.getElement_Delegates();
		}
		if (editorKey == ContentfwkViewsRepository.Objective.RelatedElements.isDelegatedBy) {
			return ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy();
		}
		if (editorKey == ContentfwkViewsRepository.Objective.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.Objective.Attributes.description) {
			return ContentfwkPackage.eINSTANCE.getElement_Description();
		}
		if (editorKey == ContentfwkViewsRepository.Objective.Attributes.category) {
			return ContentfwkPackage.eINSTANCE.getElement_Category();
		}
		if (editorKey == ContentfwkViewsRepository.Objective.Attributes.source) {
			return ContentfwkPackage.eINSTANCE.getElement_SourceDescr();
		}
		if (editorKey == ContentfwkViewsRepository.Objective.Attributes.owner) {
			return ContentfwkPackage.eINSTANCE.getElement_OwnerDescr();
		}
		if (editorKey == ContentfwkViewsRepository.Objective.Attributes.iD) {
			return ContentfwkPackage.eINSTANCE.getElement_ID();
		}
		if (editorKey == ContentfwkViewsRepository.Objective.RelatedElements.realizesGoals) {
			return ContentfwkPackage.eINSTANCE.getObjective_RealizesGoals();
		}
		if (editorKey == ContentfwkViewsRepository.Objective.RelatedElements.isTrackedAgainstMeasures) {
			return ContentfwkPackage.eINSTANCE.getObjective_IsTrackedAgainstMeasures();
		}
		if (editorKey == ContentfwkViewsRepository.Objective.RelatedElements.decomposesObjective) {
			return ContentfwkPackage.eINSTANCE.getObjective_DecomposesObjective();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Objective objective = (Objective)semanticObject;
		if (ContentfwkViewsRepository.Objective.RelatedElements.delegates == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Element) {
					delegatesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				delegatesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				delegatesSettings.move(event.getNewIndex(), (Element) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Objective.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Element) {
					isDelegatedBySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isDelegatedBySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isDelegatedBySettings.move(event.getNewIndex(), (Element) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Objective.Attributes.name == event.getAffectedEditor()) {
			objective.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Objective.Attributes.description == event.getAffectedEditor()) {
			objective.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Objective.Attributes.category == event.getAffectedEditor()) {
			objective.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Objective.Attributes.source == event.getAffectedEditor()) {
			objective.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Objective.Attributes.owner == event.getAffectedEditor()) {
			objective.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Objective.Attributes.iD == event.getAffectedEditor()) {
			objective.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Objective.RelatedElements.realizesGoals == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Goal) {
					realizesGoalsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				realizesGoalsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				realizesGoalsSettings.move(event.getNewIndex(), (Goal) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Objective.RelatedElements.isTrackedAgainstMeasures == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Measure) {
					isTrackedAgainstMeasuresSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isTrackedAgainstMeasuresSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isTrackedAgainstMeasuresSettings.move(event.getNewIndex(), (Measure) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Objective.RelatedElements.decomposesObjective == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decomposesObjectiveSettings.setToReference((Objective)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Objective eObject = ContentfwkFactory.eINSTANCE.createObjective();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposesObjectiveSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ObjectivePropertiesEditionPart basePart = (ObjectivePropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Objective.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Objective.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Objective.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getObjective_RealizesGoals().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Objective.RelatedElements.realizesGoals))
				basePart.updateRealizesGoals();
			if (ContentfwkPackage.eINSTANCE.getObjective_IsTrackedAgainstMeasures().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Objective.RelatedElements.isTrackedAgainstMeasures))
				basePart.updateIsTrackedAgainstMeasures();
			if (ContentfwkPackage.eINSTANCE.getObjective_DecomposesObjective().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Objective.RelatedElements.decomposesObjective))
				basePart.setDecomposesObjective((EObject)msg.getNewValue());
			
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
				if (ContentfwkViewsRepository.Objective.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Objective.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Objective.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Objective.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Objective.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Objective.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
