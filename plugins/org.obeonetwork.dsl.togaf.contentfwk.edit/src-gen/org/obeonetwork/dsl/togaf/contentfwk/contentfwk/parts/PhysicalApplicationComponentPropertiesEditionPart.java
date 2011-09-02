/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface PhysicalApplicationComponentPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the ID
	 * 
	 */
	public String getID();

	/**
	 * Defines a new ID
	 * @param newValue the new ID to set
	 * 
	 */
	public void setID(String newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the category
	 * 
	 */
	public String getCategory();

	/**
	 * Defines a new category
	 * @param newValue the new category to set
	 * 
	 */
	public void setCategory(String newValue);


	/**
	 * @return the source
	 * 
	 */
	public String getSource();

	/**
	 * Defines a new source
	 * @param newValue the new source to set
	 * 
	 */
	public void setSource(String newValue);


	/**
	 * @return the owner
	 * 
	 */
	public String getOwner();

	/**
	 * Defines a new owner
	 * @param newValue the new owner to set
	 * 
	 */
	public void setOwner(String newValue);


	/**
	 * @return the standard Class
	 * 
	 */
	public Enumerator getStandardClass();

	/**
	 * Init the standard Class
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initStandardClass(EEnum eenum, Enumerator current);

	/**
	 * Defines a new standard Class
	 * @param newValue the new standard Class to set
	 * 
	 */
	public void setStandardClass(Enumerator newValue);


	/**
	 * @return the standard Creation Date
	 * 
	 */
	public String getStandardCreationDate();

	/**
	 * Defines a new standard Creation Date
	 * @param newValue the new standard Creation Date to set
	 * 
	 */
	public void setStandardCreationDate(String newValue);


	/**
	 * @return the lastStandard Creation Date
	 * 
	 */
	public String getLastStandardCreationDate();

	/**
	 * Defines a new lastStandard Creation Date
	 * @param newValue the new lastStandard Creation Date to set
	 * 
	 */
	public void setLastStandardCreationDate(String newValue);


	/**
	 * @return the next Standard Creation Date
	 * 
	 */
	public String getNextStandardCreationDate();

	/**
	 * Defines a new next Standard Creation Date
	 * @param newValue the new next Standard Creation Date to set
	 * 
	 */
	public void setNextStandardCreationDate(String newValue);


	/**
	 * @return the retire Date
	 * 
	 */
	public String getRetireDate();

	/**
	 * Defines a new retire Date
	 * @param newValue the new retire Date to set
	 * 
	 */
	public void setRetireDate(String newValue);


	/**
	 * @return the life Cycle Status
	 * 
	 */
	public Enumerator getLifeCycleStatus();

	/**
	 * Init the life Cycle Status
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initLifeCycleStatus(EEnum eenum, Enumerator current);

	/**
	 * Defines a new life Cycle Status
	 * @param newValue the new life Cycle Status to set
	 * 
	 */
	public void setLifeCycleStatus(Enumerator newValue);


	/**
	 * @return the initial Live Date
	 * 
	 */
	public String getInitialLiveDate();

	/**
	 * Defines a new initial Live Date
	 * @param newValue the new initial Live Date to set
	 * 
	 */
	public void setInitialLiveDate(String newValue);


	/**
	 * @return the date Of Last Release
	 * 
	 */
	public String getDateOfLastRelease();

	/**
	 * Defines a new date Of Last Release
	 * @param newValue the new date Of Last Release to set
	 * 
	 */
	public void setDateOfLastRelease(String newValue);


	/**
	 * @return the date Of Next Release
	 * 
	 */
	public String getDateOfNextRelease();

	/**
	 * Defines a new date Of Next Release
	 * @param newValue the new date Of Next Release to set
	 * 
	 */
	public void setDateOfNextRelease(String newValue);


	/**
	 * @return the retirement Date
	 * 
	 */
	public String getRetirementDate();

	/**
	 * Defines a new retirement Date
	 * @param newValue the new retirement Date to set
	 * 
	 */
	public void setRetirementDate(String newValue);


	/**
	 * @return the services Times
	 * 
	 */
	public String getServicesTimes();

	/**
	 * Defines a new services Times
	 * @param newValue the new services Times to set
	 * 
	 */
	public void setServicesTimes(String newValue);


	/**
	 * @return the throughput
	 * 
	 */
	public String getThroughput();

	/**
	 * Defines a new throughput
	 * @param newValue the new throughput to set
	 * 
	 */
	public void setThroughput(String newValue);


	/**
	 * @return the throughput Period
	 * 
	 */
	public String getThroughputPeriod();

	/**
	 * Defines a new throughput Period
	 * @param newValue the new throughput Period to set
	 * 
	 */
	public void setThroughputPeriod(String newValue);


	/**
	 * @return the growth
	 * 
	 */
	public String getGrowth();

	/**
	 * Defines a new growth
	 * @param newValue the new growth to set
	 * 
	 */
	public void setGrowth(String newValue);


	/**
	 * @return the growth Period
	 * 
	 */
	public String getGrowthPeriod();

	/**
	 * Defines a new growth Period
	 * @param newValue the new growth Period to set
	 * 
	 */
	public void setGrowthPeriod(String newValue);


	/**
	 * @return the peak Profile Short Term
	 * 
	 */
	public String getPeakProfileShortTerm();

	/**
	 * Defines a new peak Profile Short Term
	 * @param newValue the new peak Profile Short Term to set
	 * 
	 */
	public void setPeakProfileShortTerm(String newValue);


	/**
	 * @return the peak Profile Long Term
	 * 
	 */
	public String getPeakProfileLongTerm();

	/**
	 * Defines a new peak Profile Long Term
	 * @param newValue the new peak Profile Long Term to set
	 * 
	 */
	public void setPeakProfileLongTerm(String newValue);


	/**
	 * @return the availability Quality Characteristics
	 * 
	 */
	public String getAvailabilityQualityCharacteristics();

	/**
	 * Defines a new availability Quality Characteristics
	 * @param newValue the new availability Quality Characteristics to set
	 * 
	 */
	public void setAvailabilityQualityCharacteristics(String newValue);


	/**
	 * @return the manageability Characteristics
	 * 
	 */
	public String getManageabilityCharacteristics();

	/**
	 * Defines a new manageability Characteristics
	 * @param newValue the new manageability Characteristics to set
	 * 
	 */
	public void setManageabilityCharacteristics(String newValue);


	/**
	 * @return the serviceability Characteristics
	 * 
	 */
	public String getServiceabilityCharacteristics();

	/**
	 * Defines a new serviceability Characteristics
	 * @param newValue the new serviceability Characteristics to set
	 * 
	 */
	public void setServiceabilityCharacteristics(String newValue);


	/**
	 * @return the performance Characteristics
	 * 
	 */
	public String getPerformanceCharacteristics();

	/**
	 * Defines a new performance Characteristics
	 * @param newValue the new performance Characteristics to set
	 * 
	 */
	public void setPerformanceCharacteristics(String newValue);


	/**
	 * @return the reliability Characteristics
	 * 
	 */
	public String getReliabilityCharacteristics();

	/**
	 * Defines a new reliability Characteristics
	 * @param newValue the new reliability Characteristics to set
	 * 
	 */
	public void setReliabilityCharacteristics(String newValue);


	/**
	 * @return the recoverability Characteristics
	 * 
	 */
	public String getRecoverabilityCharacteristics();

	/**
	 * Defines a new recoverability Characteristics
	 * @param newValue the new recoverability Characteristics to set
	 * 
	 */
	public void setRecoverabilityCharacteristics(String newValue);


	/**
	 * @return the locatability Characteristics
	 * 
	 */
	public String getLocatabilityCharacteristics();

	/**
	 * Defines a new locatability Characteristics
	 * @param newValue the new locatability Characteristics to set
	 * 
	 */
	public void setLocatabilityCharacteristics(String newValue);


	/**
	 * @return the security Characteristics
	 * 
	 */
	public String getSecurityCharacteristics();

	/**
	 * Defines a new security Characteristics
	 * @param newValue the new security Characteristics to set
	 * 
	 */
	public void setSecurityCharacteristics(String newValue);


	/**
	 * @return the privacy Characteristics
	 * 
	 */
	public String getPrivacyCharacteristics();

	/**
	 * Defines a new privacy Characteristics
	 * @param newValue the new privacy Characteristics to set
	 * 
	 */
	public void setPrivacyCharacteristics(String newValue);


	/**
	 * @return the integrity Characteristics
	 * 
	 */
	public String getIntegrityCharacteristics();

	/**
	 * Defines a new integrity Characteristics
	 * @param newValue the new integrity Characteristics to set
	 * 
	 */
	public void setIntegrityCharacteristics(String newValue);


	/**
	 * @return the credibility Characteristics
	 * 
	 */
	public String getCredibilityCharacteristics();

	/**
	 * Defines a new credibility Characteristics
	 * @param newValue the new credibility Characteristics to set
	 * 
	 */
	public void setCredibilityCharacteristics(String newValue);


	/**
	 * @return the localization Characteristics
	 * 
	 */
	public String getLocalizationCharacteristics();

	/**
	 * Defines a new localization Characteristics
	 * @param newValue the new localization Characteristics to set
	 * 
	 */
	public void setLocalizationCharacteristics(String newValue);


	/**
	 * @return the internationalization Characteristics
	 * 
	 */
	public String getInternationalizationCharacteristics();

	/**
	 * Defines a new internationalization Characteristics
	 * @param newValue the new internationalization Characteristics to set
	 * 
	 */
	public void setInternationalizationCharacteristics(String newValue);


	/**
	 * @return the interoperability Characteristics
	 * 
	 */
	public String getInteroperabilityCharacteristics();

	/**
	 * Defines a new interoperability Characteristics
	 * @param newValue the new interoperability Characteristics to set
	 * 
	 */
	public void setInteroperabilityCharacteristics(String newValue);


	/**
	 * @return the scalability Characteristics
	 * 
	 */
	public String getScalabilityCharacteristics();

	/**
	 * Defines a new scalability Characteristics
	 * @param newValue the new scalability Characteristics to set
	 * 
	 */
	public void setScalabilityCharacteristics(String newValue);


	/**
	 * @return the portability Characteristics
	 * 
	 */
	public String getPortabilityCharacteristics();

	/**
	 * Defines a new portability Characteristics
	 * @param newValue the new portability Characteristics to set
	 * 
	 */
	public void setPortabilityCharacteristics(String newValue);


	/**
	 * @return the extensibility Characteristics
	 * 
	 */
	public String getExtensibilityCharacteristics();

	/**
	 * Defines a new extensibility Characteristics
	 * @param newValue the new extensibility Characteristics to set
	 * 
	 */
	public void setExtensibilityCharacteristics(String newValue);


	/**
	 * @return the capacity Characteristics
	 * 
	 */
	public String getCapacityCharacteristics();

	/**
	 * Defines a new capacity Characteristics
	 * @param newValue the new capacity Characteristics to set
	 * 
	 */
	public void setCapacityCharacteristics(String newValue);


	/**
	 * @return the decomposes Physical Application Component
	 * 
	 */
	public EObject getDecomposesPhysicalApplicationComponent();

	/**
	 * Init the decomposes Physical Application Component
	 * @param settings the combo setting
	 */
	public void initDecomposesPhysicalApplicationComponent(EObjectFlatComboSettings settings);

	/**
	 * Defines a new decomposes Physical Application Component
	 * @param newValue the new decomposes Physical Application Component to set
	 * 
	 */
	public void setDecomposesPhysicalApplicationComponent(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDecomposesPhysicalApplicationComponentButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the decomposes Physical Application Component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecomposesPhysicalApplicationComponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the decomposes Physical Application Component edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecomposesPhysicalApplicationComponent(ViewerFilter filter);




	/**
	 * Init the encapsulates Physical Data Components
	 * @param settings settings for the encapsulates Physical Data Components ReferencesTable 
	 */
	public void initEncapsulatesPhysicalDataComponents(ReferencesTableSettings settings);

	/**
	 * Update the encapsulates Physical Data Components
	 * @param newValue the encapsulates Physical Data Components to update
	 * 
	 */
	public void updateEncapsulatesPhysicalDataComponents();

	/**
	 * Adds the given filter to the encapsulates Physical Data Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEncapsulatesPhysicalDataComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the encapsulates Physical Data Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEncapsulatesPhysicalDataComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the encapsulates Physical Data Components table
	 * 
	 */
	public boolean isContainedInEncapsulatesPhysicalDataComponentsTable(EObject element);




	/**
	 * Init the is Realized By Physical Technology Components
	 * @param settings settings for the is Realized By Physical Technology Components ReferencesTable 
	 */
	public void initIsRealizedByPhysicalTechnologyComponents(ReferencesTableSettings settings);

	/**
	 * Update the is Realized By Physical Technology Components
	 * @param newValue the is Realized By Physical Technology Components to update
	 * 
	 */
	public void updateIsRealizedByPhysicalTechnologyComponents();

	/**
	 * Adds the given filter to the is Realized By Physical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsRealizedByPhysicalTechnologyComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Realized By Physical Technology Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsRealizedByPhysicalTechnologyComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Realized By Physical Technology Components table
	 * 
	 */
	public boolean isContainedInIsRealizedByPhysicalTechnologyComponentsTable(EObject element);




	/**
	 * Init the extends Logical Application Components
	 * @param settings settings for the extends Logical Application Components ReferencesTable 
	 */
	public void initExtendsLogicalApplicationComponents(ReferencesTableSettings settings);

	/**
	 * Update the extends Logical Application Components
	 * @param newValue the extends Logical Application Components to update
	 * 
	 */
	public void updateExtendsLogicalApplicationComponents();

	/**
	 * Adds the given filter to the extends Logical Application Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToExtendsLogicalApplicationComponents(ViewerFilter filter);

	/**
	 * Adds the given filter to the extends Logical Application Components edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToExtendsLogicalApplicationComponents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the extends Logical Application Components table
	 * 
	 */
	public boolean isContainedInExtendsLogicalApplicationComponentsTable(EObject element);




	/**
	 * Init the is Hosted In Location
	 * @param settings settings for the is Hosted In Location ReferencesTable 
	 */
	public void initIsHostedInLocation(ReferencesTableSettings settings);

	/**
	 * Update the is Hosted In Location
	 * @param newValue the is Hosted In Location to update
	 * 
	 */
	public void updateIsHostedInLocation();

	/**
	 * Adds the given filter to the is Hosted In Location edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsHostedInLocation(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Hosted In Location edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsHostedInLocation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Hosted In Location table
	 * 
	 */
	public boolean isContainedInIsHostedInLocationTable(EObject element);




	/**
	 * Init the communicates With
	 * @param settings settings for the communicates With ReferencesTable 
	 */
	public void initCommunicatesWith(ReferencesTableSettings settings);

	/**
	 * Update the communicates With
	 * @param newValue the communicates With to update
	 * 
	 */
	public void updateCommunicatesWith();

	/**
	 * Adds the given filter to the communicates With edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCommunicatesWith(ViewerFilter filter);

	/**
	 * Adds the given filter to the communicates With edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCommunicatesWith(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the communicates With table
	 * 
	 */
	public boolean isContainedInCommunicatesWithTable(EObject element);




	/**
	 * Init the delegates
	 * @param settings settings for the delegates ReferencesTable 
	 */
	public void initDelegates(ReferencesTableSettings settings);

	/**
	 * Update the delegates
	 * @param newValue the delegates to update
	 * 
	 */
	public void updateDelegates();

	/**
	 * Adds the given filter to the delegates edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDelegates(ViewerFilter filter);

	/**
	 * Adds the given filter to the delegates edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDelegates(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the delegates table
	 * 
	 */
	public boolean isContainedInDelegatesTable(EObject element);




	/**
	 * Init the is Delegated By
	 * @param settings settings for the is Delegated By ReferencesTable 
	 */
	public void initIsDelegatedBy(ReferencesTableSettings settings);

	/**
	 * Update the is Delegated By
	 * @param newValue the is Delegated By to update
	 * 
	 */
	public void updateIsDelegatedBy();

	/**
	 * Adds the given filter to the is Delegated By edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIsDelegatedBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the is Delegated By edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIsDelegatedBy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the is Delegated By table
	 * 
	 */
	public boolean isContainedInIsDelegatedByTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods

// End of user code

}
