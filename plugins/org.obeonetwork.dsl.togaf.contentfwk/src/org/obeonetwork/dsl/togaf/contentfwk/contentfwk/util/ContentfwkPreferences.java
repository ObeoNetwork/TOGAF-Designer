package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * 
 * @author <a href="mailto:vincent.richard@obeo.fr">Vincent Richard</a>
 * @since 1.5.2
 */
public class ContentfwkPreferences {

	private static final String PREFERENCES_RESOURCE_FRAGMENT_BASE_NAME = "org.obeonetwork.dsl.togaf.contentfwk.fragment.util.preferences"; //$NON-NLS-1$
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
	private static ElementIdInitializationPolicy elementIdInitializationPolicy = ElementIdInitializationPolicy.CREATION_TIME;
	private static ElementIdAccessibility elementIdAccessibility = ElementIdAccessibility.ALWAYS;

	static {
		load();

		System.out.println("[TOGAF-Designer] TOGAF Preference value "
				+ ELEMENT_ID_UNICITY_CHECK_ENABLED_KEY + " = "
				+ elementIdUnicityCheckEnabled);
		System.out.println("[TOGAF-Designer] TOGAF Preference value "
				+ ELEMENT_ID_INITIALIZATION_POLICY_KEY + " = "
				+ elementIdInitializationPolicy);
		System.out
				.println("[TOGAF-Designer] TOGAF Preference value "
						+ ELEMENT_ID_ACCESSIBILITY_KEY + " = "
						+ elementIdAccessibility);
	}

	private static void load() {
		ResourceBundle preferencesBundle = null;
		try {
			preferencesBundle = ResourceBundle
					.getBundle(PREFERENCES_RESOURCE_FRAGMENT_BASE_NAME);
			System.out.println("[TOGAF-Designer] Fragment with preferences.properties found.");
		} catch (MissingResourceException e) {
			System.out.println("[TOGAF-Designer] Fragment with preferences.properties not found. Default properties will be used.");
			return;
		}
		
		
		try {
			String s = preferencesBundle
					.getString(ELEMENT_ID_UNICITY_CHECK_ENABLED_KEY);
			elementIdUnicityCheckEnabled = Boolean.parseBoolean(s);
		} catch (MissingResourceException e) {
		}

		try {
			String s = preferencesBundle.getString(
					ELEMENT_ID_INITIALIZATION_POLICY_KEY).toUpperCase();
			elementIdInitializationPolicy = ElementIdInitializationPolicy
					.valueOf(s);
		} catch (MissingResourceException e) {
		}

		try {
			String s = preferencesBundle
					.getString(ELEMENT_ID_ACCESSIBILITY_KEY).toUpperCase();
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
