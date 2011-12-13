package org.obeonetwork.dsl.togaf.contentfwk.presentation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.dawn.editors.IDawnEditor;
import org.eclipse.emf.cdo.dawn.editors.IDawnEditorSupport;
import org.eclipse.emf.cdo.dawn.editors.impl.DawnEMFEditorSupport;
import org.eclipse.emf.cdo.dawn.ui.DawnEditorInput;
import org.eclipse.emf.cdo.dawn.ui.DawnLabelProvider;
import org.eclipse.emf.cdo.dawn.ui.DawnSelectionViewerAdapterFactoryContentProvider;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.obeonetwork.dsl.togaf.common.MyCDOConnectionUtil;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.presentation.ContentfwkEditor;

public class DawnContentfwkEditor extends ContentfwkEditor implements
		IDawnEditor {
	private IDawnEditorSupport dawnEditorSupport;

	public static String ID = "org.obeonetwork.dsl.togaf.contentfwk.presentation.DawnContentfwkEditorID";

	public DawnContentfwkEditor() {
		super();
		dawnEditorSupport = new DawnEMFEditorSupport(this);
	}

	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		if (input instanceof DawnEditorInput) {
			dawnEditorSupport.setView(((DawnEditorInput) input).getView());
			dawnEditorSupport.registerListeners();
		}
	}

	@Override
	protected void setInputWithNotify(IEditorInput input) {
		super.setInput(input);
		if (input instanceof DawnEditorInput) {
			CDOResource resource = ((DawnEditorInput) input).getResource();
			URI uri = URI.createURI(((DawnEditorInput) input).getURI()
					.toString());

			if (resource == null || resource.cdoView() == null) {
				ResourceSet resourceSet = editingDomain.getResourceSet();
				CDOTransaction transaction = MyCDOConnectionUtil.instance
						.openCurrentTransaction(resourceSet, uri.toString());

				resource = (CDOResource) resourceSet.getResource(uri, true);

				if (resource == null || resource.cdoView() == null) {
					resource = transaction.getOrCreateResource(uri.toString());
				}
			}

			((DawnEditorInput) input).setResource(resource);
			dawnEditorSupport.setView(((DawnEditorInput) input).getView());
			dawnEditorSupport.registerListeners();
		}
	}

	@Override
	public void createPages() {
		super.createPages();

		selectionViewer
				.setContentProvider(new DawnSelectionViewerAdapterFactoryContentProvider(
						adapterFactory, ((DawnEditorInput) getEditorInput())
								.getResource()));
		selectionViewer.setLabelProvider(new DawnLabelProvider(adapterFactory,
				dawnEditorSupport.getView(), selectionViewer));
		parentViewer.setLabelProvider(new DawnLabelProvider(adapterFactory,
				dawnEditorSupport.getView(), selectionViewer));
		listViewer.setLabelProvider(new DawnLabelProvider(adapterFactory,
				dawnEditorSupport.getView(), selectionViewer));
		treeViewer.setLabelProvider(new DawnLabelProvider(adapterFactory,
				dawnEditorSupport.getView(), selectionViewer));
		tableViewer.setLabelProvider(new DawnLabelProvider(adapterFactory,
				dawnEditorSupport.getView(), selectionViewer));
		treeViewerWithColumns.setLabelProvider(new DawnLabelProvider(
				adapterFactory, dawnEditorSupport.getView(), selectionViewer));

		CDOResource resource = ((DawnEditorInput) getEditorInput())
				.getResource();

		selectionViewer.setInput(resource.getResourceSet());
		selectionViewer.setSelection(new StructuredSelection(resource), true);

		parentViewer
				.setContentProvider(new ReverseAdapterFactoryContentProvider(
						adapterFactory));
	}

	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		CDOView view = dawnEditorSupport.getView();
		if (view instanceof CDOTransaction) {
			if (view.hasConflict()) {
				MessageDialog.openError(Display.getDefault().getActiveShell(),
						"conflict",
						"Your Resource is in conflict and cannot be committed");
			} else {
				super.doSave(progressMonitor);
			}
		}
	}

	public String getContributorID() {
		return null;
	}

	public CDOView getView() {
		return dawnEditorSupport.getView();
	}

	public void setDirty() {
		dawnEditorSupport.setDirty(true);
	}

	@Override
	public void dispose() {
		try {
			super.dispose();
		} finally {
			dawnEditorSupport.close();
		}
	}

	public String getContributorId() {
		return ID;
	}

	public IDawnEditorSupport getDawnEditorSupport() {
		return dawnEditorSupport;
	}
}
