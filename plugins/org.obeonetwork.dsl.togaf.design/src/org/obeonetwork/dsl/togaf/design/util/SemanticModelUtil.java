package org.obeonetwork.dsl.togaf.design.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.google.common.collect.Lists;

public class SemanticModelUtil {
	public static final Collection<EObject> getInverseReferences(EObject lookup,
			final EReference inFeature, Collection<EObject> objectsOfInterest) {
		
		Collection<EObject> ret =  Lists.newArrayList();
		for (EObject object : objectsOfInterest) {
			if (object.eClass().getEAllReferences().contains(inFeature)){
				Object o = object.eGet(inFeature);
				if (inFeature.getUpperBound() == 1) {
					if (o.equals(lookup))
						ret.add(object);
				} else {
					if (o instanceof Collection){
						Collection col = (Collection) o;
						if (col.contains(lookup))
							ret.add(object);
					}
						
				}
			}
		}
		return ret;
//		//TODO can't use this because of SOF
//		Collection<Setting> refs = EcoreUtil.UsageCrossReferencer.find(lookup, objectsOfInterest);
//		return Lists.newArrayList(Iterables.transform(Iterables.filter(refs,new Predicate<Setting>() {
//
//			public boolean apply(Setting input) {
//				if (input.getEStructuralFeature().equals(inFeature))
//					return true;
//				return false;
//			}
//		}), new Function<Setting, EObject>() {
//
//			public EObject apply(Setting input) {
//				return input.getEObject();				
//			}
//		}));
		//NOTE: usage of EObjectQuery throws a StackOverFlow

	}
}
