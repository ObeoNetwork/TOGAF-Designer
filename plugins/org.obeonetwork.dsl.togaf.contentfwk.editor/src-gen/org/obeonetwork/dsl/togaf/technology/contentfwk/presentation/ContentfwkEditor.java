/**
 * <copyright>
 * </copyright>
 *
 */
package org.obeonetwork.dsl.togaf.technology.contentfwk.presentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.eef.runtime.query.QueryResult;
import org.eclipse.emf.eef.runtime.query.ocl.OCLQuery;
import org.eclipse.emf.eef.runtime.ui.EEFExtendedRuntime;
import org.eclipse.emf.eef.runtime.ui.editor.InteractiveEEFEditor;
import org.eclipse.emf.eef.runtime.ui.editors.pages.eefviewer.EEFPropertiesViewerMDFormPage;
import org.eclipse.ui.PartInitException;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;

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
					page.setPageTitle("Technology Architecture Catalogs");
					
					page.setInput(input);
					addPage(page);
				}
			}
		} catch (PartInitException e) {
			EEFExtendedRuntime.getPlugin().log(e);
		}
	}
	
	

}
