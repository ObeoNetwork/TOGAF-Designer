package org.obeonetwork.dsl.togaf.ui.functions;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.internal.ui.CDOEditorInputImpl;
import org.eclipse.emf.cdo.ui.CDOEditorInput;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.Workbench;
import org.obeonetwork.dsl.togaf.ui.util.CollaborativeSessionUtil;

public class OpenAllCatalogsFunction extends BrowserFunction {

	private final static String TOGAF_EDITOR = "org.obeonetwork.dsl.togaf.contentfwk.contentfwk.presentation.ContentfwkEditorID";

	// "org.eclipse.emf.cdo.ui.CDOEditor";

	public OpenAllCatalogsFunction(Browser browser, String name) {
		super(browser, name);
	}

	public Object function(Object[] arguments) {
		CDOResource semanticResource = CollaborativeSessionUtil
				.getSemanticResource();
		
		if (semanticResource == null) {
			return false;
		}

		try {
			IWorkbenchPage page = Workbench.getInstance()
					.getActiveWorkbenchWindow().getActivePage();
			CDOEditorInput uriEditorInput = new CDOEditorInputImpl(
					(semanticResource).cdoView(),
					CollaborativeSessionUtil.SEMANTIC_MODEL_URI);
			IEditorPart editorPart = IDE.openEditor(page, uriEditorInput,
					TOGAF_EDITOR);
			editorPart.setFocus();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
