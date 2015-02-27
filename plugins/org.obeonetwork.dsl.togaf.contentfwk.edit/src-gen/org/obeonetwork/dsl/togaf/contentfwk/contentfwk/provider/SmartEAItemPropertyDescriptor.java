package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

public class SmartEAItemPropertyDescriptor extends ItemPropertyDescriptor {

	public SmartEAItemPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public Collection<?> getChoiceOfValues(Object object) {
		Collection<?> result = super.getChoiceOfValues(object);
		return result;
	}

	/**
	 * This yields all reachable references from object with a meta object which
	 * indicates that it is a subtype of type.
	 */
	static public Collection<EObject> getReachableObjectsOfType(EObject object,
			EClassifier type) {
		LinkedList<EObject> itemQueue = new LinkedList<EObject>();
		Collection<EObject> visited = new HashSet<EObject>();
		Collection<EObject> result = new ArrayList<EObject>();
		Resource resource = object.eResource();
		if (resource != null) {
			ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet != null) {
				for (TreeIterator<?> i = resourceSet.getAllContents(); i
						.hasNext();) {
					Object child = i.next();
					if (child instanceof EObject) {
						collectReachableObjectsOfType(visited, itemQueue,
								result, (EObject) child, type);
						i.prune();
					}
				}
			} else {
				for (EObject eObject : resource.getContents()) {
					collectReachableObjectsOfType(visited, itemQueue, result,
							eObject, type);
				}
			}
		} else {
			collectReachableObjectsOfType(visited, itemQueue, result,
					EcoreUtil.getRootContainer(object), type);
		}

		while (!itemQueue.isEmpty()) {
			EObject nextItem = itemQueue.removeFirst();
			collectReachableObjectsOfType(visited, itemQueue, result, nextItem,
					type);
		}

		return result;
	}

	/**
	 * This will visit all reachable references from object except those in
	 * visited and add them to the queue. The queue is processed outside this
	 * recursive traversal to avoid stack overflows. It updates visited and adds
	 * to result any object with a meta object that indicates that it is a
	 * subtype of type.
	 */
	static private void collectReachableObjectsOfType(
			Collection<EObject> visited, LinkedList<EObject> itemQueue,
			Collection<EObject> result, EObject object, EClassifier type) {

		if (visited.add(object)) {
			if (type.isInstance(object)) {
				result.add(object);
			}

			// Don't traverse the structure of the EcorePackage's EObject
			// EClass
			// instance.
			// This avoids pulling in all the EcorePackage's meta data
			// simply
			// because EObject was used.
			//
			if (object != EcorePackage.Literals.EOBJECT) {
				EClass eClass = object.eClass();
				if (eClass.getEPackage().getNsURI()
						.startsWith("http://www.obeo.fr/dsl/viewpoint/")
						|| //
						eClass.getEPackage()
								.getNsURI()
								.startsWith(
										"http://www.eclipse.org/gmf/runtime/")
						|| //
						eClass.getEPackage()
								.getNsURI()
								.startsWith(
										"http://www.obeo.fr/smartea/artifact/")
						|| //
						eClass.getEPackage().getNsURI()
								.startsWith("http://www.obeo.fr/smartea/tags")
						|| //
						eClass.getEPackage()
								.getNsURI()
								.startsWith(
										"http://www.obeonetwork.org/dsl/smartdesigner")
						|| //
						eClass.getEPackage()
								.getNsURI()
								.startsWith(
										"http://www.obeo.fr/smartea/core/smartdesigner")
						|| //
						eClass.getEPackage()
								.getNsURI()
								.startsWith(
										"http://www.obeonetwork.org/dsl/requirement/")) {

				} else {
//					if (!eClass
//							.getEPackage()
//							.getNsURI()
//							.startsWith(
//									"http://www.choregie.fr/dsl/togaf/extension/contentfwkext/")
//							&& //
//							!eClass.getEPackage()
//									.getNsURI()
//									.startsWith(
//											"http://www.obeonetwork.org/dsl/togaf/contentfwk/")
//							&& //
//							!eClass.getEPackage()
//									.getNsURI()
//									.startsWith(
//											"http://www.eclipse.org/emf/CDO/Eresource/")) {
//						System.out.println(eClass.getEPackage().getNsURI()
//								+ ":::" + eClass.getName());
//					}
					for (EStructuralFeature eStructuralFeature : eClass
							.getEAllStructuralFeatures()) {
						if (!eStructuralFeature.isDerived()) {
							if (eStructuralFeature instanceof EReference) {
								EReference eReference = (EReference) eStructuralFeature;
								// System.out.println(eReference.getName());
								if (eReference.isContainment()) {
									// System.out.println("Reference name: "+eReference.getName());
									if (eReference.isMany()) {
										@SuppressWarnings("unchecked")
										List<EObject> list = ((List<EObject>) object
												.eGet(eReference));
										itemQueue.addAll(list);
									} else {
										EObject eObject = (EObject) object
												.eGet(eReference);

										// Explicitly exclude walking up the
										// container
										// reference for EClassifiers of the
										// EcorePackage instance
										// except for EClass instances
										// (other than
										// EObject which was excluded above
										// already).
										// This avoids pulling in all the
										// EcorePackage's
										// meta data simply because an
										// EDataType was
										// used.
										//
										if (eObject != null
												&& (eObject != EcorePackage.eINSTANCE
														|| eStructuralFeature != EcorePackage.Literals.ECLASSIFIER__EPACKAGE || object instanceof EClass)) {
											itemQueue.addLast(eObject);
										}
									}
								} else {
									// System.out.println("REf: "
									// + eReference.getName() + ":::"
									// + eReference.isContainment());
								}
							} else if (FeatureMapUtil
									.isFeatureMap(eStructuralFeature)) {
								for (FeatureMap.Entry entry : (FeatureMap) object
										.eGet(eStructuralFeature)) {
									if (entry.getEStructuralFeature() instanceof EReference
											&& entry.getValue() != null) {
										itemQueue.addLast((EObject) entry
												.getValue());
									}
								}
							}
						}
					}
				}
			}
		}
	}

	protected Collection<?> getComboBoxObjects(Object object) {
		if (object instanceof EObject) {
			if (parentReferences != null) {
				Collection<Object> result = new UniqueEList<Object>();
				for (int i = 0; i < parentReferences.length; ++i) {
					result.addAll(getReachableObjectsOfType((EObject) object,
							parentReferences[i].getEType()));
				}
				return result;
			} else if (feature != null) {
				if (feature instanceof EReference) {
					Collection<EObject> result = getReachableObjectsOfType(
							(EObject) object, feature.getEType());
					if (!feature.isMany() && !result.contains(null)) {
						result.add(null);
					}
					return result;
				} else if (feature.getEType() instanceof EEnum) {
					EEnum eEnum = (EEnum) feature.getEType();
					List<Enumerator> enumerators = new ArrayList<Enumerator>();
					for (EEnumLiteral eEnumLiteral : eEnum.getELiterals()) {
						enumerators.add(eEnumLiteral.getInstance());
					}
					return enumerators;
				} else {
					EDataType eDataType = (EDataType) feature.getEType();
					List<String> enumeration = ExtendedMetaData.INSTANCE
							.getEnumerationFacet(eDataType);
					if (!enumeration.isEmpty()) {
						List<Object> enumerators = new ArrayList<Object>();
						for (String enumerator : enumeration) {
							enumerators.add(EcoreUtil.createFromString(
									eDataType, enumerator));
						}
						return enumerators;
					} else {
						for (EDataType baseType = ExtendedMetaData.INSTANCE
								.getBaseType(eDataType); baseType != null; baseType = ExtendedMetaData.INSTANCE
								.getBaseType(baseType)) {
							if (baseType instanceof EEnum) {
								EEnum eEnum = (EEnum) baseType;
								List<Enumerator> enumerators = new ArrayList<Enumerator>();
								enumerators.add(null);
								for (EEnumLiteral eEnumLiteral : eEnum
										.getELiterals()) {
									enumerators.add(eEnumLiteral.getInstance());
								}
								return enumerators;
							}
						}
					}
				}
			}
		}

		return null;
	}

}
