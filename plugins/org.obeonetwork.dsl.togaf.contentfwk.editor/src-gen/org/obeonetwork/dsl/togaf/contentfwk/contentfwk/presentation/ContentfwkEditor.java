/**
 * <copyright>
 * </copyright>
 *
 */
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.presentation;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.internal.ui.bundle.OM;
import org.eclipse.emf.cdo.ui.CDOEditorInput;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewTargetChangedEvent;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.eef.runtime.query.QueryResult;
import org.eclipse.emf.eef.runtime.query.ocl.OCLQuery;
import org.eclipse.emf.eef.runtime.ui.EEFExtendedRuntime;
import org.eclipse.emf.eef.runtime.ui.editor.InteractiveEEFEditor;
import org.eclipse.emf.eef.runtime.ui.editor.messages.MessageProcessor;
import org.eclipse.emf.eef.runtime.ui.editors.pages.eefviewer.EEFPropertiesViewerMDFormPage;
import org.eclipse.emf.eef.runtime.ui.editors.pages.tree.EEFTreeMDFormPage;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;

import fr.obeo.dsl.viewpoint.DAnalysis;

/**
 * This is an example of a contentfwk model editor.
 * 
 */
public class ContentfwkEditor extends InteractiveEEFEditor {

	/**
	 * @ADDED
	 */
	private static final Object EMPTY_INPUT = new Object();

	/**
	 * @ADDED
	 */
	protected CDOView view;

	/**
	 * @ADDED
	 */
	protected Object viewerInput;

	/**
	 * This creates a model editor.
	 */
	public ContentfwkEditor() {
		super();
		initializeEditingDomain();
		messageProcessor = new MessageProcessor();
	}

	/**
	 * This is the method called to load a resource into the editing domain's
	 * resource set based on the editor's input. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void createModelGen() {
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
		Exception exception = null;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					true);
		} catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI,
					false);
		}

		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource,
					analyzeResourceProblems(resource, exception));
		}
		editingDomain.getResourceSet().eAdapters()
				.add(problemIndicationAdapter);
	}

	/**
	 * @ADDED
	 */
	public void createModel() {
		editingDomain.getResourceSet().eAdapters()
				.add(problemIndicationAdapter);
		try {
			CDOEditorInput editorInput = (CDOEditorInput) getEditorInput();
			view = editorInput.getView();
			view.addListener(viewTargetListener);

			// TODO Check if a CommandStack is needed
			BasicCommandStack commandStack = new BasicCommandStack();
			commandStack.addCommandStackListener(new CommandStackListener() {
				public void commandStackChanged(final EventObject event) {
					try {
						if (getContainer() != null
								&& !getContainer().isDisposed()) {
							getContainer().getDisplay().asyncExec(
									new Runnable() {
										public void run() {
											Command mostRecentCommand = ((CommandStack) event
													.getSource())
													.getMostRecentCommand();
											if (mostRecentCommand != null) {
												setSelectionToViewer(mostRecentCommand
														.getAffectedObjects());
											}

											/*
											 * if (propertySheetPage != null &&
											 * !propertySheetPage .getControl()
											 * .isDisposed()) {
											 * propertySheetPage.refresh(); }
											 */
										}
									});
						}
					} catch (RuntimeException ex) {
						OM.LOG.error(ex);
					}
				}
			});

			ResourceSet resourceSet = view.getResourceSet();
			editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
					commandStack, resourceSet);

			// This adapter provides the EditingDomain of the Editor
			resourceSet.eAdapters().add(new EditingDomainProviderAdapter());

			String resourcePath = editorInput.getResourcePath();
			if (resourcePath == null) {
				viewerInput = resourceSet;
			} else {
				URI resourceURI = CDOURIUtil.createResourceURI(view,
						resourcePath);
				viewerInput = resourceSet.getResource(resourceURI, true);
			}

			// resourceSet.eAdapters().add(problemIndicationAdapter);
		} catch (RuntimeException ex) {
			OM.LOG.error(ex);
			throw ex;
		}
	}

	private IListener viewTargetListener = new IListener() {
		private CDOID inputID;

		public void notifyEvent(IEvent event) {
			if (event instanceof CDOViewTargetChangedEvent) {
				Object input = selectionViewer.getInput();
				if (input == EMPTY_INPUT) {
					if (inputID != null) {
						try {
							CDOObject object = view.getObject(inputID);
							selectionViewer.setInput(object);
							inputID = null;
						} catch (Exception ex) {
							// Ignore
						}
					}
				} else if (input instanceof EObject) {
					CDOObject object = CDOUtil.getCDOObject((EObject) input);
					if (object.cdoInvalid()) {
						inputID = object.cdoID();
						selectionViewer.setInput(EMPTY_INPUT);
					}
				}
			}
		}
	};

	/**
	 * This sets up the editing domain for the model editor. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void initializeEditingDomainGen() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		((ComposedAdapterFactory) adapterFactory)
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		((ComposedAdapterFactory) adapterFactory)
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are
		// executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to
		// be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				getContainer().getDisplay().asyncExec(new Runnable() {
					public void run() {
						firePropertyChange(IEditorPart.PROP_DIRTY);

						// Try to select the affected objects.
						//
						Command mostRecentCommand = ((CommandStack) event
								.getSource()).getMostRecentCommand();
						if (mostRecentCommand != null) {
							setSelectionToViewer(mostRecentCommand
									.getAffectedObjects());
						}
						/*
						 * if (propertySheetPage != null &&
						 * !propertySheetPage.getControl().isDisposed()) {
						 * propertySheetPage.refresh(); }
						 */
					}
				});
			}
		});

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack, new HashMap<Resource, Boolean>());
	}

	/**
	 * @ADDED
	 */
	protected void initializeEditingDomain() {
		ComposedAdapterFactory.Descriptor.Registry registry = EMFEditPlugin
				.getComposedAdapterFactoryDescriptorRegistry();
		adapterFactory = new ComposedAdapterFactory(registry);
		((ComposedAdapterFactory) adapterFactory)
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		((ComposedAdapterFactory) adapterFactory)
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		initializeEditingDomainGen();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.ui.editor.InteractiveEEFEditor#contributePages()
	 */
	protected void contributePages() {
		try {
			{
					Object input = null;
				Iterator<Resource> it = getEditingDomain().getResourceSet().getResources().iterator();
				while(input==null&&it.hasNext()){
					Resource r = it.next();
					if("cdo://demo/datas.togaf".equals(r.getURI().toString())){
						input = r;
					}
				}
//				Object input = getEditingDomain().getResourceSet();
				//Object input = ((EnterpriseArchitecture) ((DAnalysis) getEditingDomain().getResourceSet().getResources().get(0)
				//		.getContents().get(0)).getModels().get(0));
			
				{
					final EEFTreeMDFormPage page = new EEFTreeMDFormPage(
							ContentfwkEditor.this, "Model") {

						/**
						 * {@inheritDoc}
						 * 
						 * @see org.eclipse.ui.forms.editor.FormPage#createPartControl(org.eclipse.swt.widgets.Composite)
						 */
						public void createPartControl(Composite parent) {
							super.createPartControl(parent);
							getModelViewer().addSelectionChangedListener(
									new ISelectionChangedListener() {
										// This just notifies those things that
										// are affected by the section.
										//
										public void selectionChanged(
												SelectionChangedEvent selectionChangedEvent) {
											ContentfwkEditor.this
													.setSelection(selectionChangedEvent
															.getSelection());
										}
									}

							);
						}

					};
					page.setInitialMasterPartToolBarVisibility(false);
					page.setAdapterFactory(adapterFactory);
					page.setEditingDomain(editingDomain);
					page.setInput(input);
					addPage(page);
				}
			}
			{
				Object input = null;
				if (getEditingDomain().getResourceSet() != null
						&& getEditingDomain().getResourceSet().getResources()
								.size() > 0) {
					Resource resource = getEditingDomain().getResourceSet()
							.getResources().get(0);
					if (resource.getContents() != null
							&& resource.getContents().size() > 0) {
						EObject element =((EnterpriseArchitecture) ((DAnalysis) getEditingDomain().getResourceSet().getResources().get(0)
								.getContents().get(0)).getModels().get(0));
						OCLQuery query = new OCLQuery(
								ContentfwkPackage.eINSTANCE
										.getEnterpriseArchitecture(),
								"self.architectures->select(oclIsKindOf(BusinessArchitecture))-> collect(oclAsType(BusinessArchitecture))->first()");
						if (EEFExtendedRuntime.INSTANCE.getProcessor()
								.canEvaluate(query)) {
							QueryResult result = EEFExtendedRuntime.INSTANCE
									.getProcessor().evaluate(element, query);
							if (result.evaluationStatus.isOK()) {
								input = result.evaluationResult;
							}
						}
					}
				}

				{
					final EEFPropertiesViewerMDFormPage page = new EEFPropertiesViewerMDFormPage(
							ContentfwkEditor.this,
							"Business Architecture Catalogs", true, true);
					page.setAdapterFactory(adapterFactory);
					page.setEditingDomain(editingDomain);
					page.setPageTitle("Business Architecture Catalogs");

					page.setInput(input);
					addPage(page);
				}
			}
			{
				Object input = null;
				if (getEditingDomain().getResourceSet() != null
						&& getEditingDomain().getResourceSet().getResources()
								.size() > 0) {
					Resource resource = getEditingDomain().getResourceSet()
							.getResources().get(0);
					if (resource.getContents() != null
							&& resource.getContents().size() > 0) {
						EObject element = ((EnterpriseArchitecture) ((DAnalysis) getEditingDomain().getResourceSet().getResources().get(0)
								.getContents().get(0)).getModels().get(0));
						OCLQuery query = new OCLQuery(
								ContentfwkPackage.eINSTANCE
										.getEnterpriseArchitecture(),
								"self.architectures->select(oclIsKindOf(DataArchitecture))-> collect(oclAsType(DataArchitecture))->first()");
						if (EEFExtendedRuntime.INSTANCE.getProcessor()
								.canEvaluate(query)) {
							QueryResult result = EEFExtendedRuntime.INSTANCE
									.getProcessor().evaluate(element, query);
							if (result.evaluationStatus.isOK()) {
								input = result.evaluationResult;
							}
						}
					}
				}

				{
					final EEFPropertiesViewerMDFormPage page = new EEFPropertiesViewerMDFormPage(
							ContentfwkEditor.this,
							"Data Architecture Catalogs", true, true);
					page.setAdapterFactory(adapterFactory);
					page.setEditingDomain(editingDomain);
					page.setPageTitle("Catalogs");

					page.setInput(input);
					addPage(page);
				}
			}
			{
				Object input = null;
				if (getEditingDomain().getResourceSet() != null
						&& getEditingDomain().getResourceSet().getResources()
								.size() > 0) {
					Resource resource = getEditingDomain().getResourceSet()
							.getResources().get(0);
					if (resource.getContents() != null
							&& resource.getContents().size() > 0) {
						EObject element = ((EnterpriseArchitecture) ((DAnalysis) getEditingDomain().getResourceSet().getResources().get(0)
								.getContents().get(0)).getModels().get(0));
						OCLQuery query = new OCLQuery(
								ContentfwkPackage.eINSTANCE
										.getEnterpriseArchitecture(),
								"self.architectures->select(oclIsKindOf(ApplicationArchitecture))-> collect(oclAsType(ApplicationArchitecture))->first()");
						if (EEFExtendedRuntime.INSTANCE.getProcessor()
								.canEvaluate(query)) {
							QueryResult result = EEFExtendedRuntime.INSTANCE
									.getProcessor().evaluate(element, query);
							if (result.evaluationStatus.isOK()) {
								input = result.evaluationResult;
							}
						}
					}
				}

				{
					final EEFPropertiesViewerMDFormPage page = new EEFPropertiesViewerMDFormPage(
							ContentfwkEditor.this,
							"Application Architecture Catalogs", true, true);
					page.setAdapterFactory(adapterFactory);
					page.setEditingDomain(editingDomain);
					page.setPageTitle("Catalogs");

					page.setInput(input);
					addPage(page);
				}
			}
			{
				Object input = null;
				if (getEditingDomain().getResourceSet() != null
						&& getEditingDomain().getResourceSet().getResources()
								.size() > 0) {
					Resource resource = getEditingDomain().getResourceSet()
							.getResources().get(0);
					if (resource.getContents() != null
							&& resource.getContents().size() > 0) {
						EObject element = ((EnterpriseArchitecture) ((DAnalysis) getEditingDomain().getResourceSet().getResources().get(0)
								.getContents().get(0)).getModels().get(0));
						OCLQuery query = new OCLQuery(
								ContentfwkPackage.eINSTANCE
										.getEnterpriseArchitecture(),
								"self.architectures->select(oclIsKindOf(TechnologyArchitecture))-> collect(oclAsType(TechnologyArchitecture))->first()");
						if (EEFExtendedRuntime.INSTANCE.getProcessor()
								.canEvaluate(query)) {
							QueryResult result = EEFExtendedRuntime.INSTANCE
									.getProcessor().evaluate(element, query);
							if (result.evaluationStatus.isOK()) {
								input = result.evaluationResult;
							}
						}
					}
				}

				{
					final EEFPropertiesViewerMDFormPage page = new EEFPropertiesViewerMDFormPage(
							ContentfwkEditor.this,
							"Technology Architecture Catalogs", true, true);
					page.setAdapterFactory(adapterFactory);
					page.setEditingDomain(editingDomain);
					page.setPageTitle("Catalogs");

					page.setInput(input);
					addPage(page);
				}
			}
		} catch (PartInitException e) {
			EEFExtendedRuntime.getPlugin().log(e);
		}
	}

	/**
	 * Adapter that provides the current EditingDomain
	 * 
	 * @since 2.0
	 */
	private class EditingDomainProviderAdapter implements Adapter,
			IEditingDomainProvider {
		public boolean isAdapterForType(Object type) {
			return type == IEditingDomainProvider.class;
		}

		public EditingDomain getEditingDomain() {
			return editingDomain;
		}

		public Notifier getTarget() {
			return null;
		}

		public void notifyChanged(Notification notification) {
		}

		public void setTarget(Notifier newTarget) {
		}
	}
}
