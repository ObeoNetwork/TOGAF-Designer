package org.obeonetwork.dsl.togaf.ui.functions;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.togaf.ui.Activator;

import fr.obeo.dsl.viewpoint.DAnalysis;
import fr.obeo.dsl.viewpoint.ViewpointFactory;
import fr.obeo.dsl.viewpoint.business.api.session.danalysis.DAnalysisSelector;
import fr.obeo.dsl.viewpoint.business.api.session.danalysis.SimpleAnalysisSelector;
import fr.obeo.dsl.viewpoint.business.api.session.factory.SessionFactory;
import fr.obeo.dsl.viewpoint.collab.api.CDORepositoryManager;
import fr.obeo.dsl.viewpoint.collab.api.CDORepositoryManagerRegistry;
import fr.obeo.dsl.viewpoint.collab.api.model.cdoconfig.utils.CDOConfigUtils;
import fr.obeo.dsl.viewpoint.collab.api.remotesession.CollaborativeSession;
import fr.obeo.dsl.viewpoint.collab.internal.session.factory.CollaborativeSessionFactoryImpl;
import fr.obeo.dsl.viewpoint.collab.model.cdoconfig.RepositoryConfig;
import fr.obeo.dsl.viewpoint.ui.business.api.session.UserSession;

public class SyncViewpointSessionFunction extends BrowserFunction {

	private static CollaborativeSession collaborativeSession = null;

	public SyncViewpointSessionFunction(Browser browser, String name) {
		super(browser, name);
	}

	public Object function(Object[] arguments) {

		// double lat = ((Double) arguments[0]).doubleValue();
		// getBrowser().execute("alert(\"Open Diagrams\");");
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		if (collaborativeSession != null) {

			// MessageDialog.openInformation(shell, "Edit Diagram",
			// "Call Java eclipse code OK! ");

			URI sessionURI = URI.createURI("in-memory.aird");
			try {
				/*
				// Ouverture de la session de travail
				SessionFactory sessionFactory = CollaborativeSessionFactoryImpl.INSTANCE;
				collaborativeSession = (CollaborativeSession) sessionFactory.createSession(sessionURI);
				RepositoryConfig repositoryConfig = CDOConfigUtils.createRepositoryConfig("localhost", "2036", "demo");
				collaborativeSession = collaborativeSession.connect(repositoryConfig);

				// Recuperation de la classe permettant d'acceder au repository
				// CDO
				CDORepositoryManager repositoryManager = CDORepositoryManagerRegistry.getRepositoryManager(collaborativeSession);

				// Creation de la resource contenant les données
				System.out.println("viewpointSession.getSemanticResources().size() : " + collaborativeSession.getSemanticResources().size());
				if (collaborativeSession.getSemanticResources().size() == 0) {
					URI semanticModelURI = URI.createURI("cdo://demo/datas.service");
					collaborativeSession.createSemanticResource(semanticModelURI);
					collaborativeSession.save();
				}

				// Creation de la resource contenant les diagrammes
				CDOTransaction transaction = repositoryManager.getOrCreateTransaction(collaborativeSession);
				CDOResource remoteDAnalysisResource = transaction.getOrCreateResource("/DAnalysis.aird");
				if (remoteDAnalysisResource.getContents().size() == 0) {
					// la première fois on initialize la DResource
					remoteDAnalysisResource.getContents().add(ViewpointFactory.eINSTANCE.createDAnalysis());
					DAnalysis dAnalysis = (DAnalysis) remoteDAnalysisResource.getContents().get(0);

					DAnalysisSelector dAnalysisSelector = new SimpleAnalysisSelector(dAnalysis);
					collaborativeSession.setAnalysisSelector(dAnalysisSelector);
					// viewpointSession.addRemoteRepresentationsSet(remoteDAnalysisResource.getPath());
					transaction.commit();
					collaborativeSession.save();
				}

				collaborativeSession.open();
				System.out.println("Session CDO Ouverte : " + collaborativeSession.isOpen());

				UserSession.from(collaborativeSession).selectViewpoint("Service Initial Design");
				*/

			} catch (Exception e) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot open Viewpoint session.", e));
			}
			MessageDialog.openInformation(shell, "DEBUG", "SyncViewpointSessionFunction - collaborativeSession.isOpen() : " + collaborativeSession.isOpen());

		}else{
			MessageDialog.openInformation(shell, "DEBUG", "SyncViewpointSessionFunction");
		}
		
		return null;
	}

}
