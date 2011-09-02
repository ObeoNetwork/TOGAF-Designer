/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.obeonetwork.dsl.togaf.samples.wizards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.obeonetwork.dsl.togaf.samples.TogafSamplesPlugin;
import org.obeonetwork.dsl.togaf.samples.l10n.Messages;

/**
 * This abstract wizard serves as the base for our zipped project wizards. At
 * minimum, the wizard uses its constructor parameter to create a 1 page wizard.
 * The page lets users define the name and location of the project where to
 * unzip the project archive. The wizard performs: project creation, the unzip
 * operation, the classpath update, the progress monitoring
 * 
 * @see Wizard
 */
/*
 * This code comes from org.eclipse.gef.examples.ui.pde.internal.wizards
 */
public class ProjectUnzipperNewWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	/**
	 * 
	 */
	private TogafSampleWizardPage togafSamplesPage;

	/**
	 * 
	 */
	private List<TogafSample> togafSamples;

	/**
	 * 
	 */
	private final static String TOGAF_SAMPLES_EXTENSION_POINT_ID = "org.obeonetwork.dsl.togaf.samples.TogafSample"; //$NON-NLS-1$ 

	/**
	 * Java Nature
	 */
	private static final String ORG_ECLIPSE_JDT_CORE_JAVANATURE = "org.eclipse.jdt.core.javanature"; //$NON-NLS-1$

	/**
	 * Togaf Nature
	 */
	private static final String ORG_OBEONETWORK_DSL_TOGAF_COMMON_TOGAFNATURE = "org.obeonetwork.dsl.togaf.common.togafNature";//$NON-NLS-1$

	/**
	 * Java Builder
	 */
	private static final String ORG_ECLIPSE_JDT_CORE_JAVABUILDER = "org.eclipse.jdt.core.javabuilder"; //$NON-NLS-1$

	/**
	 * 
	 */
	private static final String TOGAF_SAMPLES_POST_INIT_EXTENSION_POINT_ID = "oorg.obeonetwork.dsl.togaf.samples.TogafExample.postInit";//$NON-NLS-1$

	/**
	 * The single page provided by this base implementation. It provides all the
	 * functionality required to capture the name and location of the target
	 * project
	 */
	public WizardNewProjectCreationPage wizardNewProjectCreationPage;

	/**
	 * The configuration element associated with this new project wizard
	 */
	private IConfigurationElement config;

	/**
	 * Constructor
	 * 
	 */
	public ProjectUnzipperNewWizard() {
		super();
		setNeedsProgressMonitor(true);
		this.togafSamples = new ArrayList<TogafSample>();

		// Load TOGAF examples (extension point)
		IConfigurationElement[] contributions = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(TOGAF_SAMPLES_EXTENSION_POINT_ID);
		if (contributions != null) {
			for (IConfigurationElement extension : contributions) {
				if (extension != null) {
					try {
						TogafSample togafExample = (TogafSample) extension
								.createExecutableExtension("class"); //$NON-NLS-1$
						this.togafSamples.add(togafExample);
					} catch (CoreException e) {
						TogafSamplesPlugin
								.getDefault()
								.getLog()
								.log(new Status(IStatus.ERROR,
										TogafSamplesPlugin.PLUGIN_ID,
										IStatus.ERROR, e.getMessage(), e));
					}
				}
			}
		}

		// Let the samples being displayed in the order they are found in the
		// registry does not result in a nice list.
		// We have to sort samples to avoid that. The sort algorithm is the
		// following:
		// ++ Get the first word (Restaurant, Weather...)
		// ++ A different word results in an alphabetical ordering.
		// ++ In case of the same word, sort them by difficulty.
		Collections.sort(this.togafSamples, new Comparator<TogafSample>() {
			public int compare(TogafSample o1, TogafSample o2) {
				String w1 = o1.getTitle().split("\\s", 2)[0]; //$NON-NLS-1$
				String w2 = o2.getTitle().split("\\s", 2)[0]; //$NON-NLS-1$
				int cmp = w1.compareTo(w2);

				if (cmp != 0)
					return cmp;

				return o1.getDifficulty() - o2.getDifficulty();
			}
		});
	}

	/**
	 * Performs the bulk of the wizard functionality: project creation, the
	 * unzip operation and classpath update
	 * 
	 * @see Wizard#performFinish
	 */
	@Override
	public boolean performFinish() {
		try {
			IRunnableWithProgress operation = new WorkspaceModifyOperation() {
				@Override
				public void execute(IProgressMonitor monitor)
						throws InterruptedException {
					try {
						monitor.beginTask(Messages.monitor_creatingProject, 120);
						// Create the project folder
						IPath projectPath = wizardNewProjectCreationPage
								.getLocationPath();
						String projectName = wizardNewProjectCreationPage
								.getProjectName();
						String projectFolder = projectPath.toOSString()
								+ File.separator + projectName;
						File projectFolderFile = new File(projectFolder);
						IWorkspace workspace = ResourcesPlugin.getWorkspace();
						IProject project = workspace.getRoot().getProject(
								projectName);
						// If the project does not exist, we will create it
						// and populate it.
						if (!project.exists()) {
							projectFolderFile.mkdirs();
							monitor.worked(10);
							// Copy plug-in project code
							extractProject(
									projectFolderFile,
									togafSamples.get(
											togafSamplesPage.getSelection())
											.getZipURL(),
									new SubProgressMonitor(monitor, 100));
							if (monitor.isCanceled()) {
								throw new InterruptedException();
							}
							if (projectPath.equals(workspace.getRoot()
									.getLocation())) {
								project.create(monitor);
							} else {
								IProjectDescription desc = workspace
										.newProjectDescription(project
												.getName());
								desc.setLocation(new Path(projectFolder));

								project.create(desc, monitor);
							}
						}
						// Now, we ensure that the project is open.
						project.open(monitor);
						renameProject(project, projectName);
						/*
						// Add Java nature
						IProjectDescription desc = workspace
								.newProjectDescription(project.getName());
						desc.setNatureIds(new String[] {

						ORG_ECLIPSE_JDT_CORE_JAVANATURE });
						// Add Java Builder
						ICommand command = desc.newCommand();
						command.setBuilderName(ORG_ECLIPSE_JDT_CORE_JAVABUILDER);
						ICommand[] newCommands = new ICommand[1];
						newCommands[0] = command;
						desc.setBuildSpec(newCommands);
						project.setDescription(desc, monitor);
						monitor.worked(10);
						if (monitor.isCanceled()) {
							throw new InterruptedException();
						}
						*/
						// Load portInit extension point
						IConfigurationElement[] contributions = Platform
								.getExtensionRegistry()
								.getConfigurationElementsFor(
										TOGAF_SAMPLES_POST_INIT_EXTENSION_POINT_ID);
						if (contributions != null) {
							for (IConfigurationElement extension : contributions) {
								if (extension != null) {
									try {
										PostInit postInit = (PostInit) extension
												.createExecutableExtension("class"); //$NON-NLS-1$
										postInit.postInit(wizardNewProjectCreationPage
												.getProjectName());
									} catch (Exception e) {
										TogafSamplesPlugin
												.getDefault()
												.getLog()
												.log(new Status(
														IStatus.ERROR,
														TogafSamplesPlugin.PLUGIN_ID,
														IStatus.ERROR, e
																.getMessage(),
														e));
									}
								}
							}
						}

					} catch (IOException e) {
						throw new RuntimeException(e);
					} catch (CoreException e) {
						throw new RuntimeException(e);
					} finally {
						monitor.done();
					}
				}
			};
			getContainer().run(false, true, operation);
			// Set perspective
			// BasicNewProjectResourceWizard
			// .updatePerspective(getConfigurationElement());

		} catch (InterruptedException e) {
			return false;
		} catch (Exception e) {
			TogafSamplesPlugin
					.getDefault()
					.getLog()
					.log(new Status(IStatus.ERROR,
							TogafSamplesPlugin.PLUGIN_ID, IStatus.ERROR, e
									.getMessage(), e));
			return false;
		}
		return true;
	}

	/**
	 * Unzip the project archive to the specified folder
	 * 
	 * @param projectFolderFile
	 *            The folder where to unzip the project archive
	 * @param monitor
	 *            Monitor to display progress and/or cancel operation
	 * @throws IOException
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws FileNotFoundException
	 * 
	 * @throws FileNotFoundException
	 * @throws InterruptedException
	 */
	private void extractProject(File projectFolderFile, URL url,
			IProgressMonitor monitor) throws FileNotFoundException,
			IOException, InterruptedException {
		// Get project archive
		URL urlZipLocal = FileLocator.toFileURL(url);
		// Walk each element and unzip
		ZipFile zipFile = new ZipFile(urlZipLocal.getPath());
		try {
			// Allow for a hundred work units
			monitor.beginTask(Messages.monitor_unzippingProject, zipFile.size());
			unzip(zipFile, projectFolderFile, monitor);
		} finally {
			zipFile.close();
			monitor.done();
		}
	}

	/**
	 * Unzips the platform formatted zip file to specified folder
	 * 
	 * @param zipFile
	 *            The platform formatted zip file
	 * @param projectFolderFile
	 *            The folder where to unzip the project archive
	 * @param monitor
	 *            Monitor to display progress and/or cancel operation
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws InterruptedException
	 */
	private void unzip(ZipFile zipFile, File projectFolderFile,
			IProgressMonitor monitor) throws IOException,
			FileNotFoundException, InterruptedException {
		Enumeration<?> e = zipFile.entries();
		while (e.hasMoreElements()) {
			ZipEntry zipEntry = (ZipEntry) e.nextElement();
			File file = new File(projectFolderFile, zipEntry.getName());

			if (false == zipEntry.isDirectory()) {
				// Copy files (and make sure parent directory exist)
				File parentFile = file.getParentFile();
				if (null != parentFile && false == parentFile.exists()) {
					parentFile.mkdirs();
				}
				Path path = new Path(file.getPath());
				if (path.getFileExtension().equals("java")) { //$NON-NLS-1$
					InputStreamReader is = null;
					OutputStreamWriter os = null;
					try {
						is = new InputStreamReader(
								zipFile.getInputStream(zipEntry), "ISO-8859-1"); //$NON-NLS-1$
						os = new OutputStreamWriter(new FileOutputStream(file),
								ResourcesPlugin.getEncoding());
						char[] buffer = new char[102400];
						while (true) {
							int len = is.read(buffer);
							if (len < 0)
								break;
							os.write(buffer, 0, len);
						}
					} finally {
						if (null != is) {
							is.close();
						}
						if (null != os) {
							os.close();
						}
					}
				} else {
					InputStream is = null;
					OutputStream os = null;
					try {
						is = zipFile.getInputStream(zipEntry);
						os = new FileOutputStream(file);

						byte[] buffer = new byte[102400];
						while (true) {
							int len = is.read(buffer);
							if (len < 0)
								break;
							os.write(buffer, 0, len);
						}
					} finally {
						if (null != is) {
							is.close();
						}
						if (null != os) {
							os.close();
						}
					}
				}
			}
			monitor.worked(1);
			if (monitor.isCanceled()) {
				throw new InterruptedException();
			}
		}
	}

	/**
	 * Renames the specified project to the specified name
	 * 
	 * @param project
	 *            Project to rename
	 * @param projectName
	 *            New name for the project
	 * @throws CoreException
	 */
	private void renameProject(IProject project, String projectName)
			throws CoreException {
		IProjectDescription description = project.getDescription();
		description.setName(projectName);
		project.move(description, IResource.FORCE | IResource.SHALLOW, null);
	}

	/**
	 * Creates the sole wizard page contributed by this base implementation; the
	 * standard Eclipse WizardNewProjectCreationPage.
	 * 
	 * @see WizardNewProjectCreationPage#WizardNewProjectCreationPage(String)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		togafSamplesPage = new TogafSampleWizardPage(
				Messages.TogafSampleWizardPage_pageName);
		togafSamplesPage.setTitle(Messages.TogafSampleWizardPage_title);
		togafSamplesPage.setDescription(Messages.TogafSampleWizardPage_desc);
		addPage(togafSamplesPage);

		wizardNewProjectCreationPage = new WizardNewProjectCreationPage(
				Messages.WizardNewProjectCreationPage_pageName);
		wizardNewProjectCreationPage
				.setTitle(Messages.WizardNewProjectCreationPage_title);
		wizardNewProjectCreationPage
				.setDescription(Messages.WizardNewProjectCreationPage_desc);
		wizardNewProjectCreationPage.setWizard(this);
		this.addPage(wizardNewProjectCreationPage);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#canFinish()
	 */
	@Override
	public boolean canFinish() {
		return wizardNewProjectCreationPage.isPageComplete();
	}

	/**
	 * Accessor to the config field
	 * 
	 * @return The config field value
	 */
	private IConfigurationElement getConfigurationElement() {
		return config;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org
	 * .eclipse.core.runtime.IConfigurationElement, java.lang.String,
	 * java.lang.Object)
	 */
	public void setInitializationData(IConfigurationElement configIn,
			String propertyName, Object data) throws CoreException {
		config = configIn;
	}

	/**
	 * @return
	 */
	List<TogafSample> getTogafSamples() {
		return this.togafSamples;
	}

}