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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Element;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.RolePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class RolePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for isAssumedByActors ReferencesTable
	 */
	private	ReferencesTableSettings isAssumedByActorsSettings;
	
	/**
	 * Settings for accessesFunctions ReferencesTable
	 */
	private	ReferencesTableSettings accessesFunctionsSettings;
	
	/**
	 * Settings for decomposesRole EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings decomposesRoleSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RolePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject role, String editing_mode) {
		super(editingContext, role, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.Role.class;
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
			final Role role = (Role)elt;
			final RolePropertiesEditionPart basePart = (RolePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ContentfwkViewsRepository.Role.RelatedElements.delegates)) {
				delegatesSettings = new ReferencesTableSettings(role, ContentfwkPackage.eINSTANCE.getElement_Delegates());
				basePart.initDelegates(delegatesSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Role.RelatedElements.isDelegatedBy)) {
				isDelegatedBySettings = new ReferencesTableSettings(role, ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy());
				basePart.initIsDelegatedBy(isDelegatedBySettings);
			}
			if (role.getName() != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), role.getName()));
			
			if (role.getDescription() != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), role.getDescription()));
			
			if (role.getCategory() != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), role.getCategory()));
			
			if (role.getSourceDescr() != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.source))
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), role.getSourceDescr()));
			
			if (role.getOwnerDescr() != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), role.getOwnerDescr()));
			
			if (role.getID() != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.iD))
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), role.getID()));
			
			if (isAccessible(ContentfwkViewsRepository.Role.RelatedElements.isAssumedByActors)) {
				isAssumedByActorsSettings = new ReferencesTableSettings(role, ContentfwkPackage.eINSTANCE.getRole_IsAssumedByActors());
				basePart.initIsAssumedByActors(isAssumedByActorsSettings);
			}
			if (isAccessible(ContentfwkViewsRepository.Role.RelatedElements.accessesFunctions)) {
				accessesFunctionsSettings = new ReferencesTableSettings(role, ContentfwkPackage.eINSTANCE.getRole_AccessesFunctions());
				basePart.initAccessesFunctions(accessesFunctionsSettings);
			}
			if (role.getEstimatedFTEs() != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.estimatedFTEs))
				basePart.setEstimatedFTEs(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), role.getEstimatedFTEs()));
			
			if (isAccessible(ContentfwkViewsRepository.Role.RelatedElements.decomposesRole)) {
				// init part
				decomposesRoleSettings = new EObjectFlatComboSettings(role, ContentfwkPackage.eINSTANCE.getRole_DecomposesRole());
				basePart.initDecomposesRole(decomposesRoleSettings);
				// set the button mode
				basePart.setDecomposesRoleButtonMode(ButtonsModeEnum.BROWSE);
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
			
			
			
			
			
			
			
			basePart.addFilterToIsAssumedByActors(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsAssumedByActorsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToIsAssumedByActors(new EObjectFilter(ContentfwkPackage.eINSTANCE.getActor()));
			// Start of user code for additional businessfilters for isAssumedByActors
			
			// End of user code
			
			basePart.addFilterToAccessesFunctions(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInAccessesFunctionsTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToAccessesFunctions(new EObjectFilter(ContentfwkPackage.eINSTANCE.getFunction()));
			// Start of user code for additional businessfilters for accessesFunctions
			
			// End of user code
			
			
			basePart.addFilterToDecomposesRole(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Role); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for decomposesRole
			
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
		if (editorKey == ContentfwkViewsRepository.Role.RelatedElements.delegates) {
			return ContentfwkPackage.eINSTANCE.getElement_Delegates();
		}
		if (editorKey == ContentfwkViewsRepository.Role.RelatedElements.isDelegatedBy) {
			return ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy();
		}
		if (editorKey == ContentfwkViewsRepository.Role.Attributes.name) {
			return ContentfwkPackage.eINSTANCE.getElement_Name();
		}
		if (editorKey == ContentfwkViewsRepository.Role.Attributes.description) {
			return ContentfwkPackage.eINSTANCE.getElement_Description();
		}
		if (editorKey == ContentfwkViewsRepository.Role.Attributes.category) {
			return ContentfwkPackage.eINSTANCE.getElement_Category();
		}
		if (editorKey == ContentfwkViewsRepository.Role.Attributes.source) {
			return ContentfwkPackage.eINSTANCE.getElement_SourceDescr();
		}
		if (editorKey == ContentfwkViewsRepository.Role.Attributes.owner) {
			return ContentfwkPackage.eINSTANCE.getElement_OwnerDescr();
		}
		if (editorKey == ContentfwkViewsRepository.Role.Attributes.iD) {
			return ContentfwkPackage.eINSTANCE.getElement_ID();
		}
		if (editorKey == ContentfwkViewsRepository.Role.RelatedElements.isAssumedByActors) {
			return ContentfwkPackage.eINSTANCE.getRole_IsAssumedByActors();
		}
		if (editorKey == ContentfwkViewsRepository.Role.RelatedElements.accessesFunctions) {
			return ContentfwkPackage.eINSTANCE.getRole_AccessesFunctions();
		}
		if (editorKey == ContentfwkViewsRepository.Role.Attributes.estimatedFTEs) {
			return ContentfwkPackage.eINSTANCE.getRole_EstimatedFTEs();
		}
		if (editorKey == ContentfwkViewsRepository.Role.RelatedElements.decomposesRole) {
			return ContentfwkPackage.eINSTANCE.getRole_DecomposesRole();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Role role = (Role)semanticObject;
		if (ContentfwkViewsRepository.Role.RelatedElements.delegates == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.Role.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
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
		if (ContentfwkViewsRepository.Role.Attributes.name == event.getAffectedEditor()) {
			role.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Role.Attributes.description == event.getAffectedEditor()) {
			role.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Role.Attributes.category == event.getAffectedEditor()) {
			role.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Role.Attributes.source == event.getAffectedEditor()) {
			role.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Role.Attributes.owner == event.getAffectedEditor()) {
			role.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Role.Attributes.iD == event.getAffectedEditor()) {
			role.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Role.RelatedElements.isAssumedByActors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Actor) {
					isAssumedByActorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isAssumedByActorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isAssumedByActorsSettings.move(event.getNewIndex(), (Actor) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Role.RelatedElements.accessesFunctions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Function) {
					accessesFunctionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				accessesFunctionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				accessesFunctionsSettings.move(event.getNewIndex(), (Function) event.getNewValue());
			}
		}
		if (ContentfwkViewsRepository.Role.Attributes.estimatedFTEs == event.getAffectedEditor()) {
			role.setEstimatedFTEs((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (ContentfwkViewsRepository.Role.RelatedElements.decomposesRole == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decomposesRoleSettings.setToReference((Role)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Role eObject = ContentfwkFactory.eINSTANCE.createRole();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decomposesRoleSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			RolePropertiesEditionPart basePart = (RolePropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Role.RelatedElements.delegates))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Role.RelatedElements.isDelegatedBy))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.source)) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getRole_IsAssumedByActors().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Role.RelatedElements.isAssumedByActors))
				basePart.updateIsAssumedByActors();
			if (ContentfwkPackage.eINSTANCE.getRole_AccessesFunctions().equals(msg.getFeature())  && isAccessible(ContentfwkViewsRepository.Role.RelatedElements.accessesFunctions))
				basePart.updateAccessesFunctions();
			if (ContentfwkPackage.eINSTANCE.getRole_EstimatedFTEs().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Role.Attributes.estimatedFTEs)) {
				if (msg.getNewValue() != null) {
					basePart.setEstimatedFTEs(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setEstimatedFTEs("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getRole_DecomposesRole().equals(msg.getFeature()) && basePart != null && isAccessible(ContentfwkViewsRepository.Role.RelatedElements.decomposesRole))
				basePart.setDecomposesRole((EObject)msg.getNewValue());
			
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
				if (ContentfwkViewsRepository.Role.Attributes.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Role.Attributes.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Role.Attributes.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Role.Attributes.source == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Role.Attributes.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Role.Attributes.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_ID().getEAttributeType(), newValue);
				}
				if (ContentfwkViewsRepository.Role.Attributes.estimatedFTEs == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getRole_EstimatedFTEs().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getRole_EstimatedFTEs().getEAttributeType(), newValue);
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
