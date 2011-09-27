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
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Service;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.ContentfwkViewsRepository;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts.EventPropertiesEditionPart;

// End of user code

/**
 * 
 * 
 */
public class EventPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$

	/**
	 * Settings for delegates ReferencesTable
	 */
	private ReferencesTableSettings delegatesSettings;

	/**
	 * Settings for isDelegatedBy ReferencesTable
	 */
	private ReferencesTableSettings isDelegatedBySettings;

	/**
	 * Settings for isResolvedByBusinessServices ReferencesTable
	 */
	private ReferencesTableSettings isResolvedByBusinessServicesSettings;

	/**
	 * Settings for isResolvedByProcesses ReferencesTable
	 */
	private ReferencesTableSettings isResolvedByProcessesSettings;

	/**
	 * Settings for isGeneratedByProcesses ReferencesTable
	 */
	private ReferencesTableSettings isGeneratedByProcessesSettings;

	/**
	 * Settings for isResolvedByActors ReferencesTable
	 */
	private ReferencesTableSettings isResolvedByActorsSettings;

	/**
	 * Settings for isGeneratedByActors EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings isGeneratedByActorsSettings;

	/**
	 * Default constructor
	 */
	public EventPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject event,
			String editing_mode) {
		super(editingContext, event, editing_mode);
		parts = new String[] {BASE_PART };
		repositoryKey = ContentfwkViewsRepository.class;
		partKey = ContentfwkViewsRepository.Event.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object,
	 *      int, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final Event event = (Event)elt;
			final EventPropertiesEditionPart basePart = (EventPropertiesEditionPart)editingPart;
			// init values
			delegatesSettings = new ReferencesTableSettings(event, ContentfwkPackage.eINSTANCE
					.getElement_Delegates());
			basePart.initDelegates(delegatesSettings);
			isDelegatedBySettings = new ReferencesTableSettings(event, ContentfwkPackage.eINSTANCE
					.getElement_IsDelegatedBy());
			basePart.initIsDelegatedBy(isDelegatedBySettings);
			if (event.getName() != null)
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), event
						.getName()));

			if (event.getDescription() != null)
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(),
						event.getDescription()));

			if (event.getCategory() != null)
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(),
						event.getCategory()));

			if (event.getSourceDescr() != null)
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(),
						event.getSourceDescr()));

			if (event.getOwnerDescr() != null)
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), event
						.getOwnerDescr()));

			if (event.getID() != null)
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), event
						.getID()));

			isResolvedByBusinessServicesSettings = new ReferencesTableSettings(event,
					ContentfwkPackage.eINSTANCE.getEvent_IsResolvedByBusinessServices());
			basePart.initIsResolvedByBusinessServices(isResolvedByBusinessServicesSettings);
			isResolvedByProcessesSettings = new ReferencesTableSettings(event, ContentfwkPackage.eINSTANCE
					.getEvent_IsResolvedByProcesses());
			basePart.initIsResolvedByProcesses(isResolvedByProcessesSettings);
			isGeneratedByProcessesSettings = new ReferencesTableSettings(event, ContentfwkPackage.eINSTANCE
					.getEvent_IsGeneratedByProcesses());
			basePart.initIsGeneratedByProcesses(isGeneratedByProcessesSettings);
			isResolvedByActorsSettings = new ReferencesTableSettings(event, ContentfwkPackage.eINSTANCE
					.getEvent_IsResolvedByActors());
			basePart.initIsResolvedByActors(isResolvedByActorsSettings);
			// init part
			isGeneratedByActorsSettings = new EObjectFlatComboSettings(event, ContentfwkPackage.eINSTANCE
					.getEvent_IsGeneratedByActors());
			basePart.initIsGeneratedByActors(isGeneratedByActorsSettings);
			// set the button mode
			basePart.setIsGeneratedByActorsButtonMode(ButtonsModeEnum.BROWSE);
			// init filters
			basePart.addFilterToDelegates(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 *      java.lang.Object, java.lang.Object)
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
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 *      java.lang.Object, java.lang.Object)
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

			basePart.addFilterToIsResolvedByBusinessServices(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 *      java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsResolvedByBusinessServicesTable((EObject)element));
					return element instanceof Resource;
				}

			});
			basePart.addFilterToIsResolvedByBusinessServices(new EObjectFilter(ContentfwkPackage.eINSTANCE
					.getService()));
			// Start of user code for additional businessfilters for isResolvedByBusinessServices

			// End of user code

			basePart.addFilterToIsResolvedByProcesses(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 *      java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsResolvedByProcessesTable((EObject)element));
					return element instanceof Resource;
				}

			});
			basePart.addFilterToIsResolvedByProcesses(new EObjectFilter(ContentfwkPackage.eINSTANCE
					.getProcess()));
			// Start of user code for additional businessfilters for isResolvedByProcesses

			// End of user code

			basePart.addFilterToIsGeneratedByProcesses(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 *      java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsGeneratedByProcessesTable((EObject)element));
					return element instanceof Resource;
				}

			});
			basePart.addFilterToIsGeneratedByProcesses(new EObjectFilter(ContentfwkPackage.eINSTANCE
					.getProcess()));
			// Start of user code for additional businessfilters for isGeneratedByProcesses

			// End of user code

			basePart.addFilterToIsResolvedByActors(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 *      java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInIsResolvedByActorsTable((EObject)element));
					return element instanceof Resource;
				}

			});
			basePart.addFilterToIsResolvedByActors(new EObjectFilter(ContentfwkPackage.eINSTANCE.getActor()));
			// Start of user code for additional businessfilters for isResolvedByActors

			// End of user code

			basePart.addFilterToIsGeneratedByActors(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer,
				 *      java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Actor); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for isGeneratedByActors

			// End of user code

			// init values for referenced views

			// init filters for referenced views

		}
		setInitializing(false);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated NOT
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
    Event myEvent = (Event)semanticObject;
    if (ContentfwkViewsRepository.Event.RelatedElements.delegates == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD)  {
        if (event.getNewValue() instanceof Element) {
          delegatesSettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
          delegatesSettings.removeFromReference((EObject) event.getNewValue());
      }
    }
    if (ContentfwkViewsRepository.Event.RelatedElements.isDelegatedBy == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD)  {
        if (event.getNewValue() instanceof Element) {
          isDelegatedBySettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
          isDelegatedBySettings.removeFromReference((EObject) event.getNewValue());
      }
    }
    if (ContentfwkViewsRepository.Event.Attributes.name == event.getAffectedEditor()) {
      myEvent.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
    }
    if (ContentfwkViewsRepository.Event.Attributes.description == event.getAffectedEditor()) {
      myEvent.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
    }
    if (ContentfwkViewsRepository.Event.Attributes.category == event.getAffectedEditor()) {
      myEvent.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
    }
    if (ContentfwkViewsRepository.Event.Attributes.source == event.getAffectedEditor()) {
      myEvent.setSourceDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
    }
    if (ContentfwkViewsRepository.Event.Attributes.owner == event.getAffectedEditor()) {
      myEvent.setOwnerDescr((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
    }
    if (ContentfwkViewsRepository.Event.Attributes.iD == event.getAffectedEditor()) {
      myEvent.setID((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
    }
    if (ContentfwkViewsRepository.Event.RelatedElements.isResolvedByBusinessServices == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD)  {
        if (event.getNewValue() instanceof Service) {
          isResolvedByBusinessServicesSettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
          isResolvedByBusinessServicesSettings.removeFromReference((EObject) event.getNewValue());
      }
    }
    if (ContentfwkViewsRepository.Event.RelatedElements.isResolvedByProcesses == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD)  {
        if (event.getNewValue() instanceof Process) {
          isResolvedByProcessesSettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
          isResolvedByProcessesSettings.removeFromReference((EObject) event.getNewValue());
      }
    }
    if (ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByProcesses == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD)  {
        if (event.getNewValue() instanceof Process) {
          isGeneratedByProcessesSettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
          isGeneratedByProcessesSettings.removeFromReference((EObject) event.getNewValue());
      }
    }
    if (ContentfwkViewsRepository.Event.RelatedElements.isResolvedByActors == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.ADD)  {
        if (event.getNewValue() instanceof Actor) {
          isResolvedByActorsSettings.addToReference((EObject) event.getNewValue());
        }
      } else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
          isResolvedByActorsSettings.removeFromReference((EObject) event.getNewValue());
      }
    }
    if (ContentfwkViewsRepository.Event.RelatedElements.isGeneratedByActors == event.getAffectedEditor()) {
      if (event.getKind() == PropertiesEditionEvent.SET)  {
        isGeneratedByActorsSettings.setToReference((Actor)event.getNewValue());
      } else if (event.getKind() == PropertiesEditionEvent.ADD)  {
        Actor eObject = ContentfwkFactory.eINSTANCE.createActor();
        EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
        PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
        if (provider != null) {
          PropertiesEditingPolicy policy = provider.getPolicy(context);
          if (policy != null) {
            policy.execute();
          }
        }
        isGeneratedByActorsSettings.setToReference(eObject);
      }
    }
  }

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EventPropertiesEditionPart basePart = (EventPropertiesEditionPart)editingPart;
			if (ContentfwkPackage.eINSTANCE.getElement_Delegates().equals(msg.getFeature()))
				basePart.updateDelegates();
			if (ContentfwkPackage.eINSTANCE.getElement_IsDelegatedBy().equals(msg.getFeature()))
				basePart.updateIsDelegatedBy();
			if (ContentfwkPackage.eINSTANCE.getElement_Name().equals(msg.getFeature()) && basePart != null) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg
							.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Description().equals(msg.getFeature())
					&& basePart != null) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(),
							msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_Category().equals(msg.getFeature())
					&& basePart != null) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg
							.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_SourceDescr().equals(msg.getFeature())
					&& basePart != null) {
				if (msg.getNewValue() != null) {
					basePart.setSource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg
							.getNewValue()));
				} else {
					basePart.setSource("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().equals(msg.getFeature())
					&& basePart != null) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg
							.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getElement_ID().equals(msg.getFeature()) && basePart != null) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg
							.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (ContentfwkPackage.eINSTANCE.getEvent_IsResolvedByBusinessServices().equals(msg.getFeature()))
				basePart.updateIsResolvedByBusinessServices();
			if (ContentfwkPackage.eINSTANCE.getEvent_IsResolvedByProcesses().equals(msg.getFeature()))
				basePart.updateIsResolvedByProcesses();
			if (ContentfwkPackage.eINSTANCE.getEvent_IsGeneratedByProcesses().equals(msg.getFeature()))
				basePart.updateIsGeneratedByProcesses();
			if (ContentfwkPackage.eINSTANCE.getEvent_IsResolvedByActors().equals(msg.getFeature()))
				basePart.updateIsResolvedByActors();
			if (ContentfwkPackage.eINSTANCE.getEvent_IsGeneratedByActors().equals(msg.getFeature())
					&& basePart != null)
				basePart.setIsGeneratedByActors((EObject)msg.getNewValue());

		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
    Diagnostic ret = Diagnostic.OK_INSTANCE;
    if (event.getNewValue() != null) {
      try {
        if (ContentfwkViewsRepository.Event.Attributes.name == event.getAffectedEditor()) {
          Object newValue = event.getNewValue();
          if (newValue instanceof String) {
            newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), (String)newValue);
          }
          ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Name().getEAttributeType(), newValue);
        }
        if (ContentfwkViewsRepository.Event.Attributes.description == event.getAffectedEditor()) {
          Object newValue = event.getNewValue();
          if (newValue instanceof String) {
            newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), (String)newValue);
          }
          ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Description().getEAttributeType(), newValue);
        }
        if (ContentfwkViewsRepository.Event.Attributes.category == event.getAffectedEditor()) {
          Object newValue = event.getNewValue();
          if (newValue instanceof String) {
            newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), (String)newValue);
          }
          ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_Category().getEAttributeType(), newValue);
        }
        if (ContentfwkViewsRepository.Event.Attributes.source == event.getAffectedEditor()) {
          Object newValue = event.getNewValue();
          if (newValue instanceof String) {
            newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), (String)newValue);
          }
          ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_SourceDescr().getEAttributeType(), newValue);
        }
        if (ContentfwkViewsRepository.Event.Attributes.owner == event.getAffectedEditor()) {
          Object newValue = event.getNewValue();
          if (newValue instanceof String) {
            newValue = EcoreUtil.createFromString(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), (String)newValue);
          }
          ret = Diagnostician.INSTANCE.validate(ContentfwkPackage.eINSTANCE.getElement_OwnerDescr().getEAttributeType(), newValue);
        }
        if (ContentfwkViewsRepository.Event.Attributes.iD == event.getAffectedEditor()) {
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
