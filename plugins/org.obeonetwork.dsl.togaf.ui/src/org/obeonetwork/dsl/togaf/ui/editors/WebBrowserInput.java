package org.obeonetwork.dsl.togaf.ui.editors;


import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class WebBrowserInput implements IEditorInput {
	
	private String url;
	
	public WebBrowserInput(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

	public String getName() {
		return url;
	}

	public boolean exists() {
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(
				ISharedImages.IMG_OBJ_ELEMENT);
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return url;
	}

	public Object getAdapter(Class adapter) {
		return null;
	}

}
