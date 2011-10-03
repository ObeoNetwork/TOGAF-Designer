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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Requirement;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.RequirementPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class RequirementPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Default constructor
	 * 
	 */
	public RequirementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject requirement, String editing_mode) {
		super(editingContext, requirement, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.Requirement.class;
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
			final Requirement requirement = (Requirement)elt;
			final RequirementPropertiesEditionPart basePart = (RequirementPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.Requirement.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(requirement, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Requirement.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(requirement, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (requirement.getName() != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), requirement.getName()));
			
			if (requirement.getDescription() != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), requirement.getDescription()));
			
			if (requirement.getCategory() != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), requirement.getCategory()));
			
			if (requirement.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), requirement.getSourceDescr()));
			
			if (requirement.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), requirement.getOwnerDescr()));
			
			if (requirement.getID() != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), requirement.getID()));
			
			if (requirement.getStatementOfRequirement() != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.statementOfRequirement))
				basePart.setStatementOfRequirement(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), requirement.getStatementOfRequirement()));
			
			if (requirement.getRationale() != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.rationale))
				basePart.setRationale(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), requirement.getRationale()));
			
			if (requirement.getAcceptanceCriteria() != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.acceptanceCriteria))
				basePart.setAcceptanceCriteria(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), requirement.getAcceptanceCriteria()));
			
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
		if (editorKey == ContentfwkViewsRepository.Requirement.RelatedElements.delegates) {
			return ContentfwkPackage.eINSTANCE.getElement_Delegates();
		}
		if (editorKey == ContentfwkViewsRepository.Requirement.RelatedElements.isDelegatedBy) {
			return ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy();
		}
		if (editorKey == ContentfwkViewsRepository.Requirement.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.Requirement.Attributes.description) {
			return ContentfwkPackage.eINSTANCE.getElement_Description();
		}
		if (editorKey == ContentfwkViewsRepository.Requirement.Attributes.category) {
			return ContentfwkPackage.eINSTANCE.getElement_Category();
		}
		if (editorKey == ContentfwkViewsRepository.Requirement.Attributes.source) {
			return ContentfwkPackage.eINSTANCE.getElement_SourceDescr();
		}
		if (editorKey == ContentfwkViewsRepository.Requirement.Attributes.owner) {
			return ContentfwkPackage.eINSTANCE.getElement_OwnerDescr();
		}
		if (editorKey == ContentfwkViewsRepository.Requirement.Attributes.iD) {
			return ContentfwkPackage.eINSTANCE.getElement_ID();
		}
		if (editorKey == ContentfwkViewsRepository.Requirement.Attributes.statementOfRequirement) {
			return ContentfwkPackage.eINSTANCE.getRequirement_StatementOfRequirement();
		}
		if (editorKey == ContentfwkViewsRepository.Requirement.Attributes.rationale) {
			return ContentfwkPackage.eINSTANCE.getRequirement_Rationale();
		}
		if (editorKey == ContentfwkViewsRepository.Requirement.Attributes.acceptanceCriteria) {
			return ContentfwkPackage.eINSTANCE.getRequirement_AcceptanceCriteria();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Requirement requirement = (Requirement)semanticObject;
		if (ContentfwkViewsRepository.Requirement.RelatedElements.delegates == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.Requirement.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.Requirement.Attributes.name == event.getAffectedEditor()) {
			requirement.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Requirement.Attributes.description == event.getAffectedEditor()) {
			requirement.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Requirement.Attributes.category == event.getAffectedEditor()) {
			requirement.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Requirement.Attributes.source == event.getAffectedEditor()) {
			requirement.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Requirement.Attributes.owner == event.getAffectedEditor()) {
			requirement.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Requirement.Attributes.iD == event.getAffectedEditor()) {
			requirement.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Requirement.Attributes.statementOfRequirement == event.getAffectedEditor()) {
			requirement.setStatementOfRequirement((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Requirement.Attributes.rationale == event.getAffectedEditor()) {
			requirement.setRationale((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Requirement.Attributes.acceptanceCriteria == event.getAffectedEditor()) {
			requirement.setAcceptanceCriteria((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RequirementPropertiesEditionPart basePart = (RequirementPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Requirement.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Requirement.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getRequirement_StatementOfRequirement().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.statementOfRequirement)) {
				if (msg.getNewValue() != null) {
					basePart.setStatementOfRequirement(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setStatementOfRequirement("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getRequirement_Rationale().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.rationale)) {
				if (msg.getNewValue() != null) {
					basePart.setRationale(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setRationale("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getRequirement_AcceptanceCriteria().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Requirement.Attributes.acceptanceCriteria)) {
				if (msg.getNewValue() != null) {
					basePart.setAcceptanceCriteria(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setAcceptanceCriteria("");
				}
			}
			
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
				if (ContentfwkViewsRepository.Requirement.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Requirement.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Requirement.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Requirement.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Requirement.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Requirement.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Requirement.Attributes.statementOfRequirement == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getRequirement_StatementOfRequirement().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getRequirement_StatementOfRequirement().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Requirement.Attributes.rationale == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getRequirement_Rationale().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getRequirement_Rationale().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Requirement.Attributes.acceptanceCriteria == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getRequirement_AcceptanceCriteria().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getRequirement_AcceptanceCriteria().getEAttributeType(), newValue);
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
