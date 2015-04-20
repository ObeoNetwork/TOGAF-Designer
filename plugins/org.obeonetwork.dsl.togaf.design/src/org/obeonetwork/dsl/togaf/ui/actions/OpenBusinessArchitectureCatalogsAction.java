/*******************************************************************************
 * Copyright (c) 2011-2012 Obeo.
 *
 * This file is part of Obeo Knowledge.
 *
 * This software and the attached documentation are the exclusive ownership
 * of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights
 * of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1 L123-12)"
 * By installing this software, you acknowledge being aware of this rights and
 * accept them, and as a consequence you must:
 * - be in possession of a valid license of use conceded by Obeo only.
 * - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries
 * or the authors of this software
 *
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 *
 * Acceleo and Obeo are trademarks owned by Obeo.
 *
 *******************************************************************************/
package org.obeonetwork.dsl.togaf.ui.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class OpenBusinessArchitectureCatalogsAction implements IExternalJavaAction {

	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		//TogafEditorHelper.open(BusinessEditor.ID, ((Integer) parameters.get("index")).intValue());
	}

}
