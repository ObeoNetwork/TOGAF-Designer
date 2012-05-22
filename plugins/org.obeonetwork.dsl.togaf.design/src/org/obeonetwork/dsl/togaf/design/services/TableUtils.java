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

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class TableUtils {

	public String verticalize(String s){
		StringBuffer sb = new StringBuffer();		
		CharacterIterator ci = new StringCharacterIterator(s);
		int length=10;		
		for (char ch = ci.first(); ch != CharacterIterator.DONE && ci.getIndex()<=length; ch = ci.next()) {			
			sb.append(Character.toLowerCase(ch));
			sb.append("\n");
		}
		if(ci.getIndex()==length){
			sb.append("..");
		}
		return sb.toString();
	}
}
