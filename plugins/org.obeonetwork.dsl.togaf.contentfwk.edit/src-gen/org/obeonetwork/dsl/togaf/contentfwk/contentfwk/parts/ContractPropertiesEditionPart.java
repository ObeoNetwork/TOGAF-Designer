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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ContractPropertiesEditionPart {

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
	 * @return the Service Name Caller
	 * 
	 */
	public String getServiceNameCaller();

	/**
	 * Defines a new Service Name Caller
	 * @param newValue the new Service Name Caller to set
	 * 
	 */
	public void setServiceNameCaller(String newValue);


	/**
	 * @return the Service Name Called
	 * 
	 */
	public String getServiceNameCalled();

	/**
	 * Defines a new Service Name Called
	 * @param newValue the new Service Name Called to set
	 * 
	 */
	public void setServiceNameCalled(String newValue);


	/**
	 * @return the behavior Characteristics
	 * 
	 */
	public String getBehaviorCharacteristics();

	/**
	 * Defines a new behavior Characteristics
	 * @param newValue the new behavior Characteristics to set
	 * 
	 */
	public void setBehaviorCharacteristics(String newValue);


	/**
	 * @return the service Quality Characteristics
	 * 
	 */
	public String getServiceQualityCharacteristics();

	/**
	 * Defines a new service Quality Characteristics
	 * @param newValue the new service Quality Characteristics to set
	 * 
	 */
	public void setServiceQualityCharacteristics(String newValue);


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
	 * @return the response Characteristics
	 * 
	 */
	public String getResponseCharacteristics();

	/**
	 * Defines a new response Characteristics
	 * @param newValue the new response Characteristics to set
	 * 
	 */
	public void setResponseCharacteristics(String newValue);


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
	 * @return the quality Of Information Required
	 * 
	 */
	public String getQualityOfInformationRequired();

	/**
	 * Defines a new quality Of Information Required
	 * @param newValue the new quality Of Information Required to set
	 * 
	 */
	public void setQualityOfInformationRequired(String newValue);


	/**
	 * @return the contract Control Requirements
	 * 
	 */
	public String getContractControlRequirements();

	/**
	 * Defines a new contract Control Requirements
	 * @param newValue the new contract Control Requirements to set
	 * 
	 */
	public void setContractControlRequirements(String newValue);


	/**
	 * @return the result Control Requirements
	 * 
	 */
	public String getResultControlRequirements();

	/**
	 * Defines a new result Control Requirements
	 * @param newValue the new result Control Requirements to set
	 * 
	 */
	public void setResultControlRequirements(String newValue);


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
	 * Init the governs And Measures Business Services
	 * @param settings settings for the governs And Measures Business Services ReferencesTable 
	 */
	public void initGovernsAndMeasuresBusinessServices(ReferencesTableSettings settings);

	/**
	 * Update the governs And Measures Business Services
	 * @param newValue the governs And Measures Business Services to update
	 * 
	 */
	public void updateGovernsAndMeasuresBusinessServices();

	/**
	 * Adds the given filter to the governs And Measures Business Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGovernsAndMeasuresBusinessServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the governs And Measures Business Services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGovernsAndMeasuresBusinessServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the governs And Measures Business Services table
	 * 
	 */
	public boolean isContainedInGovernsAndMeasuresBusinessServicesTable(EObject element);




	/**
	 * Init the meets Service Quality
	 * @param settings settings for the meets Service Quality ReferencesTable 
	 */
	public void initMeetsServiceQuality(ReferencesTableSettings settings);

	/**
	 * Update the meets Service Quality
	 * @param newValue the meets Service Quality to update
	 * 
	 */
	public void updateMeetsServiceQuality();

	/**
	 * Adds the given filter to the meets Service Quality edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMeetsServiceQuality(ViewerFilter filter);

	/**
	 * Adds the given filter to the meets Service Quality edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMeetsServiceQuality(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the meets Service Quality table
	 * 
	 */
	public boolean isContainedInMeetsServiceQualityTable(EObject element);




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
