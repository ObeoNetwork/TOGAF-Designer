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
package org.obeonetwork.dsl.togaf.ui.wizards.newmodel;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.obeonetwork.dsl.togaf.design.Activator;
import org.obeonetwork.dsl.togaf.ui.SessionCreationOperation;

/**
 * Wizard to create new BPMN2 model.
 * 
 * @author ymortier
 */
public class TogafModelWizard extends Wizard implements INewWizard {

	/**
	 * Dot constant.
	 */
	public static final String DOT = ".";

	/**
	 * The UML file extension.
	 */
	public static final String MODEL_FILE_EXTENSION = "togaf"; //$NON-NLS-1$

	/**
	 * The session file extension.
	 */
	public static final String SESSION_FILE_EXTENSION = "aird"; //$NON-NLS-1$

	/**
	 * Remember the selection during initialization for populating the default
	 * container.
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 */
	protected IWorkbench workbench;

	/**
	 * The semantic model creation file page.
	 */
	private TogafModelWizardNewModelFilePage newModelFilePage;

	/**
	 * The initialization model page.
	 */
	private TogafModelWizardInitModelPage initModelPage;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {
		final IRunnableWithProgress op = new SessionCreationOperation(
				getModelFile(), initModelPage.getInitialObjectName());
		try {
			getContainer().run(false, true, op);
			return true;
		} catch (final InterruptedException e) {
			// Ignore.
		} catch (final InvocationTargetException e) {
			Activator.log(IStatus.ERROR,
					Messages.TogafModelWizard_UI_Error_CreatingTogafModel, e);
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.TogafModelWizard_UI_WizardTitle);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		newModelFilePage = new TogafModelWizardNewModelFilePage(
				Messages.TogafModelWizard_UI_NewModelFilePageId, selection);
		newModelFilePage
				.setTitle(Messages.TogafModelWizard_UI_NewModelFilePageTitle);
		newModelFilePage
				.setDescription(Messages.TogafModelWizard_UI_NewModelFilePageDescription);
		newModelFilePage
				.setFileName(Messages.TogafModelWizard_UI_ModelFileDefaultName
						+ DOT + MODEL_FILE_EXTENSION); //$NON-NLS-1$
		addPage(newModelFilePage);

		initModelPage = new TogafModelWizardInitModelPage(
				Messages.TogafModelWizard_UI_InitModelPageId);
		initModelPage.setTitle(Messages.TogafModelWizard_UI_InitModelPageTitle);
		initModelPage
				.setDescription(Messages.TogafModelWizard_UI_InitModelPageDescription);
		addPage(initModelPage);

		// Try and get the resource selection to determine a current directory
		// for the file dialog.
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			final Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				if (selectedResource instanceof IFolder
						|| selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newModelFilePage.setContainerFullPath(selectedResource
							.getFullPath());

					// Make up a unique new name here.
					final String defaultModelBaseFilename = Messages.TogafModelWizard_UI_ModelFileDefaultName; //$NON-NLS-1$
					String modelFilename = defaultModelBaseFilename + DOT
							+ MODEL_FILE_EXTENSION; //$NON-NLS-1$
					for (int i = 1; ((IContainer) selectedResource)
							.findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + DOT
								+ MODEL_FILE_EXTENSION; //$NON-NLS-1$
					}
					newModelFilePage.setFileName(modelFilename);

					final String defaultSessionBaseFilename = Messages.TogafModelWizard_UI_SessionFileDefaultName; //$NON-NLS-1$
					String sessionFilename = defaultSessionBaseFilename + DOT
							+ SESSION_FILE_EXTENSION; //$NON-NLS-1$
					for (int i = 1; ((IContainer) selectedResource)
							.findMember(sessionFilename) != null; ++i) {
						sessionFilename = defaultSessionBaseFilename + i + DOT
								+ SESSION_FILE_EXTENSION; //$NON-NLS-1$
					}
				}
			}
		}
	}

	public IFile getModelFile() {
		return newModelFilePage.getModelFile();
	}

}
