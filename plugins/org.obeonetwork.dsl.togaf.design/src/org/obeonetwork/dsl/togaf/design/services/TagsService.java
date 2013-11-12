/*******************************************************************************
 * Copyright (c) 2011-2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.togaf.design.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.design.tags.SemanticResourceSelectorHandler;

/**
 * Utility class for the Tags metamodel.
 * 
 * @author SDrapeau
 * 
 */
public class TagsService {

	/**
	 * Get the root element of the semantic model.
	 * 
	 * @param e
	 *            not used.
	 * @return
	 */
	public EObject getRootElement(EObject e) {
		if (SemanticResourceSelectorHandler.getSemanticResourceSelector() != null) {
			return SemanticResourceSelectorHandler
					.getSemanticResourceSelector().getRootElement();
		}
		return null;
	}

	/**
	 * Get the root element of the Tags model.
	 * 
	 * @param e
	 *            not used.
	 * @return
	 */
	public EObject getTagsRoot(EObject e) {
		if (SemanticResourceSelectorHandler.getSemanticResourceSelector() != null) {
			return SemanticResourceSelectorHandler
					.getSemanticResourceSelector().getTagsRoot();
		}
		return null;
	}

	// For testing purpose
	// /**
	// * Get the root element of the semantic model.
	// *
	// * @param e
	// * not used.
	// * @return
	// */
	// public EObject getRootElement(EObject e) {
	// if (SemanticResourceSelectorHandler.getSemanticResourceSelector() !=
	// null) {
	// return SemanticResourceSelectorHandler
	// .getSemanticResourceSelector().getRootElement();
	// } else {
	// ResourceSet rs = e.eResource().getResourceSet();
	// for (Resource resource : rs.getResources()) {
	// if (resource.getURI().toString().lastIndexOf("data.togaf") != -1) {
	// return resource.getContents().get(0);
	// }
	// }
	// }
	// return null;
	// }
	//
	// /**
	// * Get the root element of the Tags model.
	// *
	// * @param e
	// * not used.
	// * @return
	// */
	// public EObject getTagsRoot(EObject e) {
	// if (SemanticResourceSelectorHandler.getSemanticResourceSelector() !=
	// null) {
	// return SemanticResourceSelectorHandler
	// .getSemanticResourceSelector().getTagsRoot();
	// } else {
	// ResourceSet rs = e.eResource().getResourceSet();
	// for (Resource resource : rs.getResources()) {
	// if (resource.getURI().toString().lastIndexOf("data.tags") >= 0) {
	// return resource.getContents().get(0);
	// }
	// }
	// }
	// return null;
	// }

	/**
	 * Gets {@link LogicalApplicationComponent} from the given {@link List} of
	 * {@link EObject} that are not transitively
	 * {@link LogicalApplicationComponent#getDecomposesLogicalApplicationComponent()
	 * decomposing} an other
	 * 
	 * {@link LogicalApplicationComponent} of the given {@link List} of
	 * {@link EObject}. Such {@link LogicalApplicationComponent} can be used as
	 * root elements of a diagram if the
	 * {@link LogicalApplicationComponent#getIsDecomposedByLogicalApplicationComponents()
	 * decomposition relation} is visualized.
	 * 
	 * @param tagContainer
	 *            the {@link LogicalApplicationComponent}.
	 * @return
	 */
	public List<LogicalApplicationComponent> getRootLogicalApplicationComponent(
			List<LogicalApplicationComponent> elements) {
		return getRoots(
				elements,
				ContentfwkPackage.eINSTANCE
						.getLogicalApplicationComponent_DecomposesLogicalApplicationComponent());
	}

	/**
	 * Gets {@link DataEntity} from the given {@link List} of {@link EObject}
	 * that are not transitively {@link DataEntity#getDecomposesDataEntity()
	 * decomposing} an other {@link DataEntity} of the given {@link List} of
	 * {@link EObject}. Such {@link DataEntity} can be used as root elements of
	 * a diagram if the {@link DataEntity#getIsDecomposedByDataEntities()
	 * decomposition relation} is visualized.
	 * 
	 * @param tagContainer
	 *            the {@link DataEntity}.
	 * @return
	 */
	public List<DataEntity> getRootDataEntity(List<DataEntity> elements) {
		return getRoots(elements,
				ContentfwkPackage.eINSTANCE
						.getDataEntity_DecomposesDataEntity());
	}

	/**
	 * Gets <code>T</code> from the given {@link List} of {@link EObject} that
	 * are not transitively in the given {@link EReference} an other
	 * <code>T</code> of the given {@link List} of {@link EObject}. Such
	 * <code>T</code> can be used as root elements of a diagram if the the given
	 * {@link EReference} is visualized.
	 * 
	 * @param elements
	 *            the {@link List} of {@link EObject}.
	 * @param ref
	 *            the {@link EReference} to navigate. The reference
	 *            {@link EReference#getEType() type} must be <T> and its
	 *            {@link EReference#getUpperBound() upper bound} must be
	 *            <code>1</code>.
	 * @return the {@link List} of <code>T</code>
	 */
	public <T extends EObject> List<T> getRoots(List<T> elements, EReference ref) {
		List<T> res = new ArrayList<T>();

		Set<T> elementT = new HashSet<T>(elements);
		for (T t : elementT) {
			if (!isContainedInEReferenceClosure(t, ref, elementT)) {
				res.add(t);
			}
		}

		return res;
	}

	/**
	 * Tells if any elements of the transitive closure of the given
	 * {@link EReference} for the given {@link EObject element} is contained in
	 * the given {@link Set} of <code>T</code>.
	 * 
	 * @param element
	 *            the {@link EObject}
	 * @param ref
	 *            the {@link EReference} to navigate. The reference
	 *            {@link EReference#getEType() type} must be <T> and its
	 *            {@link EReference#getUpperBound() upper bound} must be
	 *            <code>1</code>.
	 * @return <code>true</code> if any elements of the transitive closure of
	 *         the given {@link EReference} for the given {@link EObject
	 *         element} is contained in the given {@link Set} of <code>T</code>,
	 *         <code>false</code> otherwise
	 */
	@SuppressWarnings("unchecked")
	private <T extends EObject> boolean isContainedInEReferenceClosure(
			T element, EReference ref, Set<T> elementT) {
		boolean res = false;

		T current = (T) element.eGet(ref);
		while (current != null) {
			res = elementT.contains(current);
			if (res) {
				break;
			} else {
				current = (T) current.eGet(ref);
			}
		}

		return res;
	}

}
