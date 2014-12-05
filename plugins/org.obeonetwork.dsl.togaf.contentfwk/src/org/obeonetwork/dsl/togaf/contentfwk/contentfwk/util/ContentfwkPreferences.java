package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * 
 * @author <a href="mailto:vincent.richard@obeo.fr">Vincent Richard</a>
 * @since 1.5.2
 */
public class ContentfwkPreferences {
	
	private static final String PREFERENCES_RESOURCE_BASE_NAME = "org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util.preferences"; //$NON-NLS-1$
	private static final String ELEMENT_ID_UNICITY_CHECK_ENABLED_KEY = "elementIdUnicityCheckEnabled"; //$NON-NLS-1$
	private static final String ELEMENT_ID_INITIALIZATION_POLICY_KEY = "elementIdInitializationPolicy"; //$NON-NLS-1$
	private static final String ELEMENT_ID_ACCESSIBILITY_KEY = "elementIdAccessibility"; //$NON-NLS-1$
	
	public enum ElementIdInitializationPolicy {
		CREATION_TIME, NEVER;
	}
	
	public enum ElementIdAccessibility {
		ALWAYS, BEFORE_SAVE, NEVER;
	}
	
	private static boolean elementIdUnicityCheckEnabled = false;
	private static ElementIdInitializationPolicy elementIdInitializationPolicy = ElementIdInitializationPolicy.NEVER;
	private static ElementIdAccessibility elementIdAccessibility = ElementIdAccessibility.ALWAYS;
	
	static {
		load();
		
	    System.out.println("TOGAF Preference value " + ELEMENT_ID_UNICITY_CHECK_ENABLED_KEY + " = " + elementIdUnicityCheckEnabled);
	    System.out.println("TOGAF Preference value " + ELEMENT_ID_INITIALIZATION_POLICY_KEY + " = " + elementIdInitializationPolicy);
	    System.out.println("TOGAF Preference value " + ELEMENT_ID_ACCESSIBILITY_KEY + " = " + elementIdAccessibility);
	}
	
	private static void load() {
		ResourceBundle preferencesBundle = ResourceBundle.getBundle(PREFERENCES_RESOURCE_BASE_NAME);
		try {
			String s = preferencesBundle.getString(ELEMENT_ID_UNICITY_CHECK_ENABLED_KEY);
			elementIdUnicityCheckEnabled = Boolean.parseBoolean(s);
		} catch (MissingResourceException e) {
		}
		
		try {
			String s = preferencesBundle.getString(ELEMENT_ID_INITIALIZATION_POLICY_KEY).toUpperCase();
			elementIdInitializationPolicy = ElementIdInitializationPolicy.valueOf(s);
		} catch (MissingResourceException e) {
		}
		
		try {
			String s = preferencesBundle.getString(ELEMENT_ID_ACCESSIBILITY_KEY).toUpperCase();
			elementIdAccessibility = ElementIdAccessibility.valueOf(s);
		} catch (MissingResourceException e) {
		}
		
	}
	
	public static boolean isElementIdUnicityCheckEnabled() {
		return elementIdUnicityCheckEnabled;
	}
	
	public static ElementIdInitializationPolicy getElementIdInitializationPolicy() {
		return elementIdInitializationPolicy;
	}
	
	public static ElementIdAccessibility getElementIdAccessibility() {
		return elementIdAccessibility;
	}
	
}
