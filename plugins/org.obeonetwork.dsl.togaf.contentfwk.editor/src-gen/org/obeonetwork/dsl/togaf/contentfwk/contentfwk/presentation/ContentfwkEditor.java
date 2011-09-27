/**
 * <copyright>
 * </copyright>
 *
 */
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.presentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.eclipse.emf.eef.runtime.ui.EEFExtendedRuntime;
import org.eclipse.emf.eef.runtime.ui.editor.InteractiveEEFEditor;
import org.eclipse.emf.eef.runtime.ui.editors.pages.tree.EEFTreeMDFormPage;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.emf.eef.runtime.ui.editors.pages.eefviewer.EEFPropertiesViewerMDFormPage;
import org.eclipse.emf.eef.runtime.query.QueryResult;
import org.eclipse.emf.eef.runtime.query.ocl.OCLQuery;
import org.eclipse.ui.PartInitException;

/**
 * This is an example of a contentfwk model editor.
 * 
 */
public class ContentfwkEditor extends InteractiveEEFEditor {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.editor.InteractiveEEFEditor#contributePages()
	 */
	protected void contributePages() {
		try {
			{
				Object input = getEditingDomain().getResourceSet();
				
				{
					final EEFTreeMDFormPage page = new EEFTreeMDFormPage(ContentfwkEditor.this, "Model") {
					
						/**
						 * {@inheritDoc}
						 * @see org.eclipse.ui.forms.editor.FormPage#createPartControl(org.eclipse.swt.widgets.Composite)
						 */
						public void createPartControl(Composite parent) {
							super.createPartControl(parent);
							getModelViewer().addSelectionChangedListener(new ISelectionChangedListener() {
								// This just notifies those things that are affected by the section.
								//
								public void selectionChanged(SelectionChangedEvent selectionChangedEvent) {
									ContentfwkEditor.this.setSelection(selectionChangedEvent.getSelection());
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
				if (getEditingDomain().getResourceSet() != null && getEditingDomain().getResourceSet().getResources().size() > 0) {
					Resource resource = getEditingDomain().getResourceSet().getResources().get(0);
					if (resource.getContents() != null && resource.getContents().size() > 0) {
						EObject element = resource.getContents().get(0);
						OCLQuery query = new OCLQuery(ContentfwkPackage.eINSTANCE.getEnterpriseArchitecture(), "self.architectures->select(oclIsKindOf(BusinessArchitecture))-> collect(oclAsType(BusinessArchitecture))->first()");
						if (EEFExtendedRuntime.INSTANCE.getProcessor().canEvaluate(query)) {
							QueryResult result = EEFExtendedRuntime.INSTANCE.getProcessor().evaluate(element, query);
							if (result.evaluationStatus.isOK()) {
								input = result.evaluationResult;
							}
						}
					}
				}
				
				{
					final EEFPropertiesViewerMDFormPage page = new EEFPropertiesViewerMDFormPage(ContentfwkEditor.this, "Business Architecture Catalogs", true, true);
					page.setAdapterFactory(adapterFactory);
					page.setEditingDomain(editingDomain);
					page.setPageTitle("Business Architecture Catalogs");
					
					page.setInput(input);
					addPage(page);
				}
			}
			{
				Object input = null;
				if (getEditingDomain().getResourceSet() != null && getEditingDomain().getResourceSet().getResources().size() > 0) {
					Resource resource = getEditingDomain().getResourceSet().getResources().get(0);
					if (resource.getContents() != null && resource.getContents().size() > 0) {
						EObject element = resource.getContents().get(0);
						OCLQuery query = new OCLQuery(ContentfwkPackage.eINSTANCE.getEnterpriseArchitecture(), "self.architectures->select(oclIsKindOf(DataArchitecture))-> collect(oclAsType(DataArchitecture))->first()");
						if (EEFExtendedRuntime.INSTANCE.getProcessor().canEvaluate(query)) {
							QueryResult result = EEFExtendedRuntime.INSTANCE.getProcessor().evaluate(element, query);
							if (result.evaluationStatus.isOK()) {
								input = result.evaluationResult;
							}
						}
					}
				}
				
				{
					final EEFPropertiesViewerMDFormPage page = new EEFPropertiesViewerMDFormPage(ContentfwkEditor.this, "Data Architecture Catalogs", true, true);
					page.setAdapterFactory(adapterFactory);
					page.setEditingDomain(editingDomain);
					page.setPageTitle("Catalogs");
					
					page.setInput(input);
					addPage(page);
				}
			}
			{
				Object input = null;
				if (getEditingDomain().getResourceSet() != null && getEditingDomain().getResourceSet().getResources().size() > 0) {
					Resource resource = getEditingDomain().getResourceSet().getResources().get(0);
					if (resource.getContents() != null && resource.getContents().size() > 0) {
						EObject element = resource.getContents().get(0);
						OCLQuery query = new OCLQuery(ContentfwkPackage.eINSTANCE.getEnterpriseArchitecture(), "self.architectures->select(oclIsKindOf(ApplicationArchitecture))-> collect(oclAsType(ApplicationArchitecture))->first()");
						if (EEFExtendedRuntime.INSTANCE.getProcessor().canEvaluate(query)) {
							QueryResult result = EEFExtendedRuntime.INSTANCE.getProcessor().evaluate(element, query);
							if (result.evaluationStatus.isOK()) {
								input = result.evaluationResult;
							}
						}
					}
				}
				
				{
					final EEFPropertiesViewerMDFormPage page = new EEFPropertiesViewerMDFormPage(ContentfwkEditor.this, "Application Architecture Catalogs", true, true);
					page.setAdapterFactory(adapterFactory);
					page.setEditingDomain(editingDomain);
					page.setPageTitle("Catalogs");
					
					page.setInput(input);
					addPage(page);
				}
			}
			{
				Object input = null;
				if (getEditingDomain().getResourceSet() != null && getEditingDomain().getResourceSet().getResources().size() > 0) {
					Resource resource = getEditingDomain().getResourceSet().getResources().get(0);
					if (resource.getContents() != null && resource.getContents().size() > 0) {
						EObject element = resource.getContents().get(0);
						OCLQuery query = new OCLQuery(ContentfwkPackage.eINSTANCE.getEnterpriseArchitecture(), "self.architectures->select(oclIsKindOf(TechnologyArchitecture))-> collect(oclAsType(TechnologyArchitecture))->first()");
						if (EEFExtendedRuntime.INSTANCE.getProcessor().canEvaluate(query)) {
							QueryResult result = EEFExtendedRuntime.INSTANCE.getProcessor().evaluate(element, query);
							if (result.evaluationStatus.isOK()) {
								input = result.evaluationResult;
							}
						}
					}
				}
				
				{
					final EEFPropertiesViewerMDFormPage page = new EEFPropertiesViewerMDFormPage(ContentfwkEditor.this, "Technology Architecture Catalogs", true, true);
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
	
	

}
