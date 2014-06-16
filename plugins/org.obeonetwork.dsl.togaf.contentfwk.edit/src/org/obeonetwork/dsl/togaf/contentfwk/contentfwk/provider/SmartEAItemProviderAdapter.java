package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

public class SmartEAItemProviderAdapter extends ItemProviderAdapter {

	public SmartEAItemProviderAdapter(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	protected ItemPropertyDescriptor createItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		return new SmartEAItemPropertyDescriptor(adapterFactory,
				resourceLocator, displayName, description, feature, isSettable,
				multiLine, sortChoices, staticImage, category, filterFlags);
	}
}
