package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.presentation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.eef.runtime.ui.EEFExtendedRuntime;
import org.eclipse.emf.eef.runtime.ui.editors.pages.tree.EEFTreeMDFormPage;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public class MyInteractiveEEFEditor extends FormEditor
implements IEditingDomainProvider, ISelectionProvider, IMenuListener, IViewerProvider {
	
public static final String EDITOR_ID = "org.eclipse.emf.eef.runtime.ui.editor.InteractiveEEFEditorID";

/**
 * This keeps track of the editing domain that is used to track all changes to the model.
 */
protected EditingDomain editingDomain;

/**
 * This is the one adapter factory used for providing views of the model.
 */
protected AdapterFactory adapterFactory;

/**
 * This is the content outline page.
 */
protected IContentOutlinePage contentOutlinePage;

/**
 * This is a kludge...
 */
protected IStatusLineManager contentOutlineStatusLineManager;

/**
 * This is the content outline page's viewer.
 */
protected TreeViewer contentOutlineViewer;

/**
 * This is the viewer that shadows the selection in the content outline.
 * The parent relation must be correctly defined for this to work.
 */
protected TreeViewer selectionViewer;

/**
 * This keeps track of the active content viewer, which may be either one of the viewers in the pages or the content outline viewer.
 */
protected Viewer currentViewer;

/**
 * This listens to which ever viewer is active.
 */
protected ISelectionChangedListener selectionChangedListener;

/**
 * This keeps track of all the {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are listening to this editor.
 */
protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();

/**
 * This keeps track of the selection of the editor as a whole.
 */
protected ISelection editorSelection = StructuredSelection.EMPTY;

/**
 * This listens for when the outline becomes active
 */
protected IPartListener partListener =
	new IPartListener() {
		public void partActivated(IWorkbenchPart p) {
			if (p instanceof ContentOutline) {
				if (((ContentOutline)p).getCurrentPage() == contentOutlinePage) {
					getActionBarContributor().setActiveEditor(MyInteractiveEEFEditor.this);

					setCurrentViewer(contentOutlineViewer);
				}
			}
			else if (p == MyInteractiveEEFEditor.this) {
				handleActivate();
			}
		}
		public void partBroughtToTop(IWorkbenchPart p) {
			// Ignore.
		}
		public void partClosed(IWorkbenchPart p) {
			// Ignore.
		}
		public void partDeactivated(IWorkbenchPart p) {
			// Ignore.
		}
		public void partOpened(IWorkbenchPart p) {
			// Ignore.
		}
	};

/**
 * Resources that have been removed since last activation.
 */
protected Collection<Resource> removedResources = new ArrayList<Resource>();

/**
 * Resources that have been changed since last activation.
 */
protected Collection<Resource> changedResources = new ArrayList<Resource>();

/**
 * Resources that have been saved.
 */
protected Collection<Resource> savedResources = new ArrayList<Resource>();

/**
 * Map to store the diagnostic associated with a resource.
 */
protected Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

/**
 * Controls whether the problem indication should be updated.
 */
protected boolean updateProblemIndication = true;

/**
 * Adapter used to update the problem indication when resources are demanded loaded.
 */
protected EContentAdapter problemIndicationAdapter = 
	new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() instanceof Resource) {
				switch (notification.getFeatureID(Resource.class)) {
					case Resource.RESOURCE__IS_LOADED:
					case Resource.RESOURCE__ERRORS:
					case Resource.RESOURCE__WARNINGS: {
						Resource resource = (Resource)notification.getNotifier();
						Diagnostic diagnostic = analyzeResourceProblems(resource, null);
						if (diagnostic.getSeverity() != Diagnostic.OK) {
							resourceToDiagnosticMap.put(resource, diagnostic);
						}
						else {
							resourceToDiagnosticMap.remove(resource);
						}

						if (updateProblemIndication) {
							getSite().getShell().getDisplay().asyncExec
								(new Runnable() {
									 public void run() {
										 updateProblemIndication();
									 }
								 });
						}
						break;
					}
				}
			}
			else {
				super.notifyChanged(notification);
			}
		}

		@Override
		protected void setTarget(Resource target) {
			basicSetTarget(target);
		}

		@Override
		protected void unsetTarget(Resource target) {
			basicUnsetTarget(target);
		}
	};
	
	private IResourceChangeListener resourceChangeListener = null;

	/**
	 * This listens for workspace changes.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IResourceChangeListener initResourceChangeListener() {
		IResourceChangeListener resourceChangeListner = 
		new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {
				IResourceDelta delta = event.getDelta();
				try {
					class ResourceDeltaVisitor implements IResourceDeltaVisitor {
						protected ResourceSet resourceSet = editingDomain.getResourceSet();
						protected Collection<Resource> changedResources = new ArrayList<Resource>();
						protected Collection<Resource> removedResources = new ArrayList<Resource>();

						public boolean visit(IResourceDelta delta) {
							if (delta.getResource().getType() == IResource.FILE) {
								if (delta.getKind() == IResourceDelta.REMOVED ||
								    delta.getKind() == IResourceDelta.CHANGED && delta.getFlags() != IResourceDelta.MARKERS) {
									Resource resource = resourceSet.getResource(URI.createPlatformResourceURI(delta.getFullPath().toString(), true), false);
									if (resource != null) {
										if (delta.getKind() == IResourceDelta.REMOVED) {
											removedResources.add(resource);
										}
										else if (!savedResources.remove(resource)) {
											changedResources.add(resource);
										}
									}
								}
							}

							return true;
						}

						public Collection<Resource> getChangedResources() {
							return changedResources;
						}

						public Collection<Resource> getRemovedResources() {
							return removedResources;
						}
					}

					final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
					delta.accept(visitor);

					if (!visitor.getRemovedResources().isEmpty()) {
						getSite().getShell().getDisplay().asyncExec
							(new Runnable() {
								 public void run() {
									 removedResources.addAll(visitor.getRemovedResources());
									 if (!isDirty()) {
										 getSite().getPage().closeEditor(MyInteractiveEEFEditor.this, false);
									 }
								 }
							 });
					}

					if (!visitor.getChangedResources().isEmpty()) {
						getSite().getShell().getDisplay().asyncExec
							(new Runnable() {
								 public void run() {
									 changedResources.addAll(visitor.getChangedResources());
									 if (getSite().getPage().getActiveEditor() == MyInteractiveEEFEditor.this) {
										 handleActivate();
									 }
								 }
							 });
					}
				}
				catch (CoreException exception) {
					EEFExtendedRuntime.INSTANCE.log(exception);
				}
			}
		};
		return resourceChangeListner;
	}


protected MyMessageProcessor messageProcessor;

/**
 * Determines if the current edited resource is saving. 
 */
private boolean isSaving = false;

/**
 * Handles activation of the editor or it's associated views.
 */
protected void handleActivate() {
	// Recompute the read only state.
	//
	if (editingDomain instanceof AdapterFactoryEditingDomain && ((AdapterFactoryEditingDomain)editingDomain).getResourceToReadOnlyMap() != null) {
		((AdapterFactoryEditingDomain)editingDomain).getResourceToReadOnlyMap().clear();

	  // Refresh any actions that may become enabled or disabled.
	  //
	  setSelection(getSelection());
	}

	if (!removedResources.isEmpty()) {
		if (handleDirtyConflict()) {
			getSite().getPage().closeEditor(MyInteractiveEEFEditor.this, false);
		}
		else {
			removedResources.clear();
			changedResources.clear();
			savedResources.clear();
		}
	}
	else if (!changedResources.isEmpty()) {
		changedResources.removeAll(savedResources);
		handleChangedResources();
		changedResources.clear();
		savedResources.clear();
	}
}

/**
 * Handles what to do with changed resources on activation.
 */
protected void handleChangedResources() {
	if (!changedResources.isEmpty() && (!isDirty() || (!isSaving && handleDirtyConflict()))) {
		if (isDirty()) {
			changedResources.addAll(editingDomain.getResourceSet().getResources());
		}
		editingDomain.getCommandStack().flush();

		updateProblemIndication = false;
		for (Resource resource : changedResources) {
			if (resource.isLoaded()) {
				resource.unload();
				try {
					resource.load(Collections.EMPTY_MAP);
				}
				catch (IOException exception) {
					if (!resourceToDiagnosticMap.containsKey(resource)) {
						resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
					}
				}
			}
		}

		if (AdapterFactoryEditingDomain.isStale(editorSelection)) {
			setSelection(StructuredSelection.EMPTY);
		}

		updateProblemIndication = true;
		updateProblemIndication();
	}
}

/**
 * Updates the problems indication with the information described in the specified diagnostic.
 */
protected void updateProblemIndication() {
	if (updateProblemIndication) {
		BasicDiagnostic diagnostic =
			new BasicDiagnostic
				(Diagnostic.OK,
				 EEFExtendedRuntime.PLUGIN_ID,
				 0,
				 null,
				 new Object [] { editingDomain.getResourceSet() });
		for (Diagnostic childDiagnostic : resourceToDiagnosticMap.values()) {
			if (childDiagnostic.getSeverity() != Diagnostic.OK) {
				diagnostic.add(childDiagnostic);
			}
		}

		int lastEditorPage = getPageCount() - 1;
		if (lastEditorPage >= 0 && getEditor(lastEditorPage) instanceof ProblemEditorPart) {
			((ProblemEditorPart)getEditor(lastEditorPage)).setDiagnostic(diagnostic);
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				setActivePage(lastEditorPage);
			}
		}
		else if (diagnostic.getSeverity() != Diagnostic.OK) {
			ProblemEditorPart problemEditorPart = new ProblemEditorPart();
			problemEditorPart.setDiagnostic(diagnostic);
			try {
				addPage(++lastEditorPage, problemEditorPart, getEditorInput());
				setPageText(lastEditorPage, problemEditorPart.getPartName());
				setActivePage(lastEditorPage);
				showTabs();
			}
			catch (PartInitException exception) {
				EEFExtendedRuntime.INSTANCE.log(exception);
			}
		}
	}
}

/**
 * Shows a dialog that asks if conflicting changes should be discarded.
 */
protected boolean handleDirtyConflict() {
	return
		MessageDialog.openQuestion
			(getSite().getShell(),
			 getString("UI_InteractiveEEFEditor_FileConflict_label"),
			 getString("WARN_InteractiveEEFEditor_FileConflict"));
}

/**
 * This creates a model editor.
 */
public MyInteractiveEEFEditor() {
	super();
	initializeEditingDomain();
	messageProcessor = new MyMessageProcessor();
}

/**
 * This sets up the editing domain for the model editor.
 */
protected void initializeEditingDomain() {
	// Create an adapter factory that yields item providers.
	//
	adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	((ComposedAdapterFactory)adapterFactory).addAdapterFactory(new ResourceItemProviderAdapterFactory());
	((ComposedAdapterFactory)adapterFactory).addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	resourceChangeListener = initResourceChangeListener();
	ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
}

/**
 * This sets the selection into whichever viewer is active.
 */
public void setSelectionToViewer(Collection<?> collection) {
	final Collection<?> theSelection = collection;
	// Make sure it's okay.
	//
	if (theSelection != null && !theSelection.isEmpty()) {
		Runnable runnable =
			new Runnable() {
				public void run() {
					// Try to select the items in the current content viewer of the editor.
					//
					if (currentViewer != null) {
						currentViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);
					}
				}
			};
		getSite().getShell().getDisplay().asyncExec(runnable);
	}
}

/**
 * This returns the editing domain as required by the {@link IEditingDomainProvider} interface.
 * This is important for implementing the static methods of {@link AdapterFactoryEditingDomain}
 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
 */
public EditingDomain getEditingDomain() {
	return editingDomain;
}

/**
 * This makes sure that one content viewer, either for the current page or the outline view, if it has focus,
 * is the current one.
 */
public void setCurrentViewer(Viewer viewer) {
	// If it is changing...
	//
	if (currentViewer != viewer) {
		if (selectionChangedListener == null) {
			// Create the listener on demand.
			//
			selectionChangedListener =
				new ISelectionChangedListener() {
					// This just notifies those things that are affected by the section.
					//
					public void selectionChanged(SelectionChangedEvent selectionChangedEvent) {
						setSelection(selectionChangedEvent.getSelection());
					}
				};
		}

		// Stop listening to the old one.
		//
		if (currentViewer != null) {
			currentViewer.removeSelectionChangedListener(selectionChangedListener);
		}

		// Start listening to the new one.
		//
		if (viewer != null) {
			viewer.addSelectionChangedListener(selectionChangedListener);
		}

		// Remember it.
		//
		currentViewer = viewer;

		// Set the editors selection based on the current viewer's selection.
		//
		setSelection(currentViewer == null ? StructuredSelection.EMPTY : currentViewer.getSelection());
	}
}

/**
 * This returns the viewer as required by the {@link IViewerProvider} interface.
 */
public Viewer getViewer() {
	return currentViewer;
}

/**
 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension.
 */
protected void createContextMenuFor(StructuredViewer viewer) {
	MenuManager contextMenu = new MenuManager("#PopUp");
	contextMenu.add(new Separator("additions"));
	contextMenu.setRemoveAllWhenShown(true);
	contextMenu.addMenuListener(this);
	Menu menu= contextMenu.createContextMenu(viewer.getControl());
	viewer.getControl().setMenu(menu);
	getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

	int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
	Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
	viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
	viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer));
}

/**
 * This is the method called to load a resource into the editing domain's resource set based on the editor's input.
 */
public void createModel() {
	initializeWorkspaceEditingDomain(initializeCommandStack());
	editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
}

/**
 * @return
 */
protected BasicCommandStack initializeCommandStack() {
	// Create the command stack that will notify this editor as commands are executed.
	//
	BasicCommandStack commandStack = new BasicCommandStack();
	// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
	//
	commandStack.addCommandStackListener
		(new CommandStackListener() {
			 public void commandStackChanged(final EventObject event) {
				 getContainer().getDisplay().asyncExec
					 (new Runnable() {
						  public void run() {
							  firePropertyChange(IEditorPart.PROP_DIRTY);

							  // Try to select the affected objects.
							  //
							  Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
							  if (mostRecentCommand != null) {
								  setSelectionToViewer(mostRecentCommand.getAffectedObjects());
							  }
						  }
					  });
			 }
		 });

	// Create the editing domain with a special command stack.
	//
	return commandStack;
}

/**
 * This sets up the editing domain for the model editor. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
protected void initializeEditingDomainGen()
{
  // Create an adapter factory that yields item providers.
  //
  adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

  ((ComposedAdapterFactory)adapterFactory).addAdapterFactory(new ResourceItemProviderAdapterFactory());
  ((ComposedAdapterFactory)adapterFactory).addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

  // Create the command stack that will notify this editor as commands are executed.
  //
  BasicCommandStack commandStack = new BasicCommandStack();

  // Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
  //
  commandStack.addCommandStackListener(new CommandStackListener()
  {
    public void commandStackChanged(final EventObject event)
    {
      getContainer().getDisplay().asyncExec(new Runnable()
      {
        public void run()
        {
          firePropertyChange(IEditorPart.PROP_DIRTY);

          // Try to select the affected objects.
          //
          Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
          if (mostRecentCommand != null)
          {
            setSelectionToViewer(mostRecentCommand.getAffectedObjects());
          }
       /*   if (propertySheetPage != null && !propertySheetPage.getControl().isDisposed())
          {
            propertySheetPage.refresh();
          }*/
        }
      });
    }
  });

  // Create the editing domain with a special command stack.
  //
  editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
}

/**
 * @param commandStack
 */
protected void initializeWorkspaceEditingDomain(BasicCommandStack commandStack) {
	//[SDR]
	//editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack);
	ComposedAdapterFactory.Descriptor.Registry registry = EMFEditPlugin.getComposedAdapterFactoryDescriptorRegistry();
    adapterFactory = new ComposedAdapterFactory(registry);
    ((ComposedAdapterFactory)adapterFactory).addAdapterFactory(new ResourceItemProviderAdapterFactory());
    ((ComposedAdapterFactory)adapterFactory).addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    //[/SDR]
    
	URI resourceURI = EditUIUtil.getURI(getEditorInput());
	Exception exception = null;
	Resource resource = null;
	try {
		// Load the resource through the editing domain.
		//
		resource = editingDomain.getResourceSet().getResource(resourceURI, true);
	}
	catch (Exception e) {
		exception = e;
		resource = editingDomain.getResourceSet().getResource(resourceURI, false);
	}

	Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
	if (diagnostic.getSeverity() != Diagnostic.OK) {
		resourceToDiagnosticMap.put(resource,  analyzeResourceProblems(resource, exception));
	}
	editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
}

/**
 * Returns a diagnostic describing the errors and warnings listed in the resource
 * and the specified exception (if any).
 */
public Diagnostic analyzeResourceProblems(Resource resource, Exception exception) {
	if (!resource.getErrors().isEmpty() || !resource.getWarnings().isEmpty()) {
		BasicDiagnostic basicDiagnostic =
			new BasicDiagnostic
				(Diagnostic.ERROR,
				 EEFExtendedRuntime.PLUGIN_ID,
				 0,
				 getString("UI_InteractiveEEFEditor_CreateModelError_message", resource.getURI()),
				 new Object [] { exception == null ? (Object)resource : exception });
		basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
		return basicDiagnostic;
	}
	else if (exception != null) {
		return
			new BasicDiagnostic
				(Diagnostic.ERROR,
						EEFExtendedRuntime.PLUGIN_ID,
				 0,
				 getString("UI_InteractiveEEFEditor_CreateModelError_message", resource.getURI()),
				 new Object[] { exception });
	}
	else {
		return Diagnostic.OK_INSTANCE;
	}
}

/**
 * This is the method used by the framework to install your own controls.
 */
@Override
public void addPages() {
	// Creates the model from the editor input
	//
	createModel();

	contributePages();

	
	// Ensures that this editor will only display the page's tab
	// area if there are more than one page
	//
	getContainer().addControlListener
		(new ControlAdapter() {
			boolean guard = false;
			public void controlResized(ControlEvent event) {
				if (!guard) {
					guard = true;
					hideTabs();
					guard = false;
				}
			}
		 });

	getSite().getShell().getDisplay().asyncExec
		(new Runnable() {
			 public void run() {
				 updateProblemIndication();
			 }
		 });
	
}

protected void contributePages() {
	try {
		addDefaultPage();
	} catch (PartInitException e) {
		EEFExtendedRuntime.getPlugin().log(e);
	}
}

/**
 * @throws PartInitException
 */
protected void addDefaultPage() throws PartInitException {
	EEFTreeMDFormPage mainPage = new EEFTreeMDFormPage(this, "main") {

		public void createPartControl(Composite parent) {
			super.createPartControl(parent);
			setPageTitle("main");
			getModelViewer().addSelectionChangedListener(new ISelectionChangedListener() {
				// This just notifies those things that are affected by the section.
				//
				public void selectionChanged(SelectionChangedEvent selectionChangedEvent) {
					setSelection(selectionChangedEvent.getSelection());
				}
			}
		
			);
			
		}
	};
	mainPage.setAdapterFactory(adapterFactory);
	mainPage.setEditingDomain(editingDomain);
	mainPage.setInput(editingDomain.getResourceSet());
	addPage(mainPage);
}


public List<FormPage> getPages() {
	List<FormPage> result = new ArrayList<FormPage>();
	for (Object page : pages) {
		if (page instanceof FormPage) {
			FormPage formPage = (FormPage) page;
			result.add(formPage);
		}
	}
	return result;
}

/**
 * If there is just one page in the multi-page editor part,
 * this hides the single tab at the bottom.
 */
protected void hideTabs() {
	if (getPageCount() <= 1) {
		setPageText(0, "");
		if (getContainer() instanceof CTabFolder) {
			((CTabFolder)getContainer()).setTabHeight(1);
			Point point = getContainer().getSize();
			getContainer().setSize(point.x, point.y + 6);
		}
	}
}

/**
 * If there is more than one page in the multi-page editor part,
 * this shows the tabs at the bottom.
 */
protected void showTabs() {
	if (getPageCount() > 1) {
		setPageText(0, getString("UI_SelectionPage_label"));
		if (getContainer() instanceof CTabFolder) {
			((CTabFolder)getContainer()).setTabHeight(SWT.DEFAULT);
			Point point = getContainer().getSize();
			getContainer().setSize(point.x, point.y - 6);
		}
	}
}

/**
 * This is used to track the active viewer.
 */
@Override
protected void pageChange(int pageIndex) {
	super.pageChange(pageIndex);
	messageProcessor.init(this);
	if (contentOutlinePage != null) {
		handleContentOutlineSelection(contentOutlinePage.getSelection());
	}
		
}

/**
 * This is how the framework determines which interfaces we implement.
 */
@SuppressWarnings("rawtypes")
@Override
public Object getAdapter(Class key) {
	if (key.equals(IContentOutlinePage.class)) {
		return showOutlineView() ? getContentOutlinePage() : null;
	}
	else {
		return super.getAdapter(key);
	}
}

/**
 * This accesses a cached version of the content outliner.
 */
public IContentOutlinePage getContentOutlinePage() {
	if (contentOutlinePage == null) {
		// The content outline is just a tree.
		//
		class MyContentOutlinePage extends ContentOutlinePage {
			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);
				contentOutlineViewer = getTreeViewer();
				contentOutlineViewer.addSelectionChangedListener(this);

				// Set up the tree viewer.
				//
				contentOutlineViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
				contentOutlineViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
				contentOutlineViewer.setInput(editingDomain.getResourceSet());

				// Make sure our popups work.
				//
				createContextMenuFor(contentOutlineViewer);

				if (!editingDomain.getResourceSet().getResources().isEmpty()) {
				  // Select the root object in the view.
				  //
				  contentOutlineViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
				}
			}

			@Override
			public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
				super.makeContributions(menuManager, toolBarManager, statusLineManager);
				contentOutlineStatusLineManager = statusLineManager;
			}

			@Override
			public void setActionBars(IActionBars actionBars) {
				super.setActionBars(actionBars);
				getActionBarContributor().shareGlobalActions(this, actionBars);
			}
		}

		contentOutlinePage = new MyContentOutlinePage();

		// Listen to selection so that we can handle it is a special way.
		//
		contentOutlinePage.addSelectionChangedListener
			(new ISelectionChangedListener() {
				 // This ensures that we handle selections correctly.
				 //
				 public void selectionChanged(SelectionChangedEvent event) {
					 handleContentOutlineSelection(event.getSelection());
				 }
			 });
	}

	return contentOutlinePage;
}

/**
 * This deals with how we want selection in the outliner to affect the other views.
 */
public void handleContentOutlineSelection(ISelection selection) {
	if (selectionViewer != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
		Iterator<?> selectedElements = ((IStructuredSelection)selection).iterator();
		if (selectedElements.hasNext()) {
			// Get the first selected element.
			//
			Object selectedElement = selectedElements.next();

			ArrayList<Object> selectionList = new ArrayList<Object>();
			selectionList.add(selectedElement);
			while (selectedElements.hasNext()) {
				selectionList.add(selectedElements.next());
			}

			// Set the selection to the widget.
			//
			selectionViewer.setSelection(new StructuredSelection(selectionList));
		}
	}
}

/**
 * This is for implementing {@link IEditorPart} and simply tests the command stack.
 */
@Override
public boolean isDirty() {
	return ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
}

/**
 * This is for implementing {@link IEditorPart} and simply saves the model file.
 */
@Override
public void doSave(IProgressMonitor progressMonitor) {
	// Save only resources that have actually changed.
	//
	final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
	saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

	// Do the work within an operation because this is a long running activity that modifies the workbench.
	//
	IRunnableWithProgress operation =
		new IRunnableWithProgress() {
			// This is the method that gets invoked when the operation runs.
			//
			public void run(IProgressMonitor monitor) {
				// Save the resources to the file system.
				//
				boolean first = true;
				for (Resource resource : editingDomain.getResourceSet().getResources()) {
					if ((first || !resource.getContents().isEmpty() || isPersisted(resource)) && !editingDomain.isReadOnly(resource)) {
						try {
							long timeStamp = resource.getTimeStamp();
							resource.save(saveOptions);
							if (resource.getTimeStamp() != timeStamp) {
								savedResources.add(resource);
							}
						}
						catch (Exception exception) {
							resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
						}
						first = false;
					}
				}
			}
		};

	updateProblemIndication = false;
	try {
		// This runs the options, and shows progress.
		//
		isSaving = true;
		new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);
		isSaving = false;

		// Refresh the necessary state.
		//
		((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
		firePropertyChange(IEditorPart.PROP_DIRTY);
	}
	catch (Exception exception) {
		// Something went wrong that shouldn't.
		//
		EEFExtendedRuntime.INSTANCE.log(exception);
	}
	updateProblemIndication = true;
	updateProblemIndication();
}

/**
 * This returns whether something has been persisted to the URI of the specified resource.
 * The implementation uses the URI converter from the editor's resource set to try to open an input stream. 
 */
protected boolean isPersisted(Resource resource) {
	boolean result = false;
	try {
		InputStream stream = editingDomain.getResourceSet().getURIConverter().createInputStream(resource.getURI());
		if (stream != null) {
			result = true;
			stream.close();
		}
	}
	catch (IOException e) {
		// Ignore
	}
	return result;
}

/**
 * This always returns true because it is not currently supported.
 */
@Override
public boolean isSaveAsAllowed() {
	return true;
}

/**
 * This also changes the editor's input.
 */
@Override
public void doSaveAs() {
	String[] files = openFilePathDialog(getSite().getShell(), SWT.SAVE, new String[0]);
	if (files.length > 0) {
		URI uri = URI.createFileURI(files[0]);
		doSaveAs(uri, new URIEditorInput(uri));
	}
}

/**
 */
public static String[] openFilePathDialog(Shell shell, int style, String[] fileExtensionFilters) {
	return openFilePathDialog(shell, style, fileExtensionFilters, (style & SWT.OPEN) != 0, (style & SWT.OPEN) != 0, (style & SWT.SAVE) != 0);
}

/**
 */
public static String[] openFilePathDialog(Shell shell, int style, String[] fileExtensionFilters, boolean includeGroupFilter, boolean includeAllFilter, boolean addExtension) {
	FileDialog fileDialog = new FileDialog(shell, style);
	
	// If requested, augment the file extension filters by adding a group of all the other filters (*.ext1;*.ext2;...)
	// at the beginning and/or an all files wildcard (*.*) at the end.
	//
	includeGroupFilter &= fileExtensionFilters.length > 1;
	int offset = includeGroupFilter ? 1 : 0;
	
	if (includeGroupFilter || includeAllFilter) {
		int size = fileExtensionFilters.length + offset + (includeAllFilter ? 1 : 0);
		String[] allFilters = new String[size];
		StringBuilder group = includeGroupFilter ? new StringBuilder() : null;
		
		for (int i = 0; i < fileExtensionFilters.length; i++) {
			if (includeGroupFilter) {
				if (i != 0) {
					group.append(';');
				}
				group.append(fileExtensionFilters[i]);
			}
			allFilters[i + offset] = fileExtensionFilters[i];
		}
		
		if (includeGroupFilter) {
			allFilters[0] = group.toString();
		}
		if (includeAllFilter) {
			allFilters[allFilters.length - 1] = "*.*";
		}
		
		fileDialog.setFilterExtensions(allFilters);
	}
	else {
		fileDialog.setFilterExtensions(fileExtensionFilters);
	}
	fileDialog.open();
	
	String[] filenames = fileDialog.getFileNames();
	String[] result = new String[filenames.length];
	String path = fileDialog.getFilterPath() + File.separator;
	String extension = null;
	
	// If extension adding requested, get the dotted extension corresponding to the selected filter.
	//
	if (addExtension) {
		int i = fileDialog.getFilterIndex();
		if (i != -1 && (!includeAllFilter || i != fileExtensionFilters.length)) {
			i = includeGroupFilter && i == 0 ? 0 : i - offset;
			String filter = fileExtensionFilters[i];
			int dot = filter.lastIndexOf('.');
			if (dot == 1 && filter.charAt(0) == '*') {
				extension = filter.substring(dot);
			}
		}
	}
	
	// Build the result by adding the selected path and, if needed, auto-appending the extension.
	//
	for (int i = 0; i < filenames.length; i++) {
		String filename = path + filenames[i];
		if (extension != null) {
			int dot = filename.lastIndexOf('.');
			if (dot == -1 || !Arrays.asList(fileExtensionFilters).contains("*" + filename.substring(dot))) {
				filename += extension;
			}
		}
		result[i] = filename;
	}
	return result;
}

/**
 */
protected void doSaveAs(URI uri, IEditorInput editorInput) {
	(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
	setInputWithNotify(editorInput);
	setPartName(editorInput.getName());
	IActionBars actionBars = getActionBars();
	IProgressMonitor progressMonitor =
		actionBars != null && actionBars.getStatusLineManager() != null ?
			actionBars.getStatusLineManager().getProgressMonitor() :
			new NullProgressMonitor();
	doSave(progressMonitor);
}

/**
 * This is called during startup.
 */
@Override
public void init(IEditorSite site, IEditorInput editorInput) {
	setSite(site);
	setInputWithNotify(editorInput);
	setPartName(editorInput.getName());
	site.setSelectionProvider(this);
	site.getPage().addPartListener(partListener);
}

/**
 */
@Override
public void setFocus() {
	getControl(getActivePage()).setFocus();
}

/**
 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
 */
public void addSelectionChangedListener(ISelectionChangedListener listener) {
	selectionChangedListeners.add(listener);
}

/**
 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
 */
public void removeSelectionChangedListener(ISelectionChangedListener listener) {
	selectionChangedListeners.remove(listener);
}

/**
 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to return this editor's overall selection.
 */
public ISelection getSelection() {
	return editorSelection;
}

/**
 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to set this editor's overall selection.
 * Calling this result will notify the listeners.
 */
public void setSelection(ISelection selection) {
	editorSelection = selection;

	for (ISelectionChangedListener listener : selectionChangedListeners) {
		listener.selectionChanged(new SelectionChangedEvent(this, selection));
	}
	setStatusLineManager(selection);
}

/**
 */
public void setStatusLineManager(ISelection selection) {
	IActionBars actionBars = getActionBars();
	if (actionBars != null) {
		IStatusLineManager statusLineManager = currentViewer != null && currentViewer == contentOutlineViewer ?
				contentOutlineStatusLineManager : actionBars.getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				Collection<?> collection = ((IStructuredSelection)selection).toList();
				switch (collection.size()) {
				case 0: {
					statusLineManager.setMessage(getString("UI_InteractiveEEFEditor_NoObjectSelected"));
					break;
				}
				case 1: {
					String text = new AdapterFactoryItemDelegator(adapterFactory).getText(collection.iterator().next());
					statusLineManager.setMessage(getString("UI_InteractiveEEFEditor_SingleObjectSelected", text));
					break;
				}
				default: {
					statusLineManager.setMessage(getString("UI_InteractiveEEFEditor_MultiObjectSelected", Integer.toString(collection.size())));
					break;
				}
				}
			}
			else {
				statusLineManager.setMessage("");
			}
		}
	}
}

/**
 * This looks up a string in the plugin's plugin.properties file.
 */
private static String getString(String key) {
	return EEFExtendedRuntime.INSTANCE.getString(key);
}

/**
 * This looks up a string in plugin.properties, making a substitution.
 */
private static String getString(String key, Object s1) {
	return EEFExtendedRuntime.INSTANCE.getString(key, new Object [] { s1 });
}

/**
 * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu.
 */
public void menuAboutToShow(IMenuManager menuManager) {
	((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
}

/**
 */
public EditingDomainActionBarContributor getActionBarContributor() {
	return (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();
}

/**
 */
public IActionBars getActionBars() {
	if (getActionBarContributor() != null) {
		return getActionBarContributor().getActionBars();
	} else {
		return null;
	}
}

/**
 */
public AdapterFactory getAdapterFactory() {
	return adapterFactory;
}

/**
 */
@Override
public void dispose() {
	updateProblemIndication = false;

	getSite().getPage().removePartListener(partListener);

	if (adapterFactory instanceof ComposedAdapterFactory)
		((ComposedAdapterFactory)adapterFactory).dispose();

	if (getActionBarContributor().getActiveEditor() == this) {
		getActionBarContributor().setActiveEditor(null);
	}

	if (contentOutlinePage != null) {
		contentOutlinePage.dispose();
	}

	if (resourceChangeListener != null) {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);
	}
	super.dispose();
}

/**
 * Returns whether the outline view should be presented to the user.
 */
protected boolean showOutlineView() {
	return false;
}
}
