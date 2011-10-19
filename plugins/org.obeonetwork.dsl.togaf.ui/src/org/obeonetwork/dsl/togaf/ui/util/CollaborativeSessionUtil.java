package org.obeonetwork.dsl.togaf.ui.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.net4j.util.security.IPasswordCredentials;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ApplicationArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkFactory;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.EnterpriseArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.StrategicArchitecture;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.TechnologyArchitecture;
import org.obeonetwork.dsl.togaf.ui.Activator;

import fr.obeo.dsl.viewpoint.ViewpointFactory;
import fr.obeo.dsl.viewpoint.business.api.session.factory.SessionFactory;
import fr.obeo.dsl.viewpoint.collab.api.CDOAuthenticationManager;
import fr.obeo.dsl.viewpoint.collab.api.CDOAuthenticationManagerRegistry;
import fr.obeo.dsl.viewpoint.collab.api.CDORepositoryManager;
import fr.obeo.dsl.viewpoint.collab.api.CDORepositoryManagerRegistry;
import fr.obeo.dsl.viewpoint.collab.api.RepositoryConnectionException;
import fr.obeo.dsl.viewpoint.collab.api.model.cdoconfig.utils.CDOConfigUtils;
import fr.obeo.dsl.viewpoint.collab.api.remotesession.CollaborativeSession;
import fr.obeo.dsl.viewpoint.collab.internal.session.factory.CollaborativeSessionFactoryImpl;
import fr.obeo.dsl.viewpoint.collab.model.cdoconfig.RepositoryConfig;
import fr.obeo.dsl.viewpoint.tools.api.command.ViewpointCommand;

/**
 * 
 * @author steph
 * 
 */
public class CollaborativeSessionUtil {

    public static final String REPOSITORY_NAME = "demo";

    public static final String SEMANTIC_MODEL_URI = "/datas.service";

    public static final String VIEWPOINT_MODEL_URI = "/DAnalysis.aird";

    public static CollaborativeSession getCollaborativeSession() {
        return collaborativeSession;
    }

    public static CDORepositoryManager getCDORepositoryManager() {
        return repositoryManager;
    }

    public static CDOResource getSemanticResource() {
        try {
            return repositoryManager.getOrCreateTransaction(collaborativeSession).getOrCreateResource(SEMANTIC_MODEL_URI);
        } catch (RepositoryConnectionException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static CollaborativeSession collaborativeSession = createCollaborativeSession();

    private static CDORepositoryManager repositoryManager;

    private static final String SERVER_LOCATION = "localhost";

    private static final String SERVER_PORT_NUMBER = "2036";

    private static final String SESSION_URI = "in-memory.aird";

    private static void closeSession() {
        collaborativeSession.save();
        collaborativeSession.close();
    }

    private static CollaborativeSession createCollaborativeSession() {
        if (collaborativeSession != null) {
            return collaborativeSession;
        }

        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        try {
            // Open the collaborative session
            openSession();
            prepareSemanticResource();

            /*
             * closeSession();
             * 
             * openSession(); prepareRepresentationsResource(); closeSession();
             * 
             * openSession(); CDOResource remoteDAnalysisResource =
             * repositoryManager
             * .getOrCreateTransaction(collaborativeSession).getOrCreateResource
             * (VIEWPOINT_MODEL_URI); DAnalysis dAnalysis = (DAnalysis)
             * remoteDAnalysisResource.getContents().get(0); DAnalysisSelector
             * dAnalysisSelector = new SimpleAnalysisSelector(dAnalysis);
             * collaborativeSession.setAnalysisSelector(dAnalysisSelector);
             */

        } catch (Exception e) {
            Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot open Viewpoint session.", e));
        }
        return collaborativeSession;
    }

    public static void openSession() throws RepositoryConnectionException, CoreException {
        RepositoryConfig repositoryConfig = CDOConfigUtils.createRepositoryConfig(SERVER_LOCATION, SERVER_PORT_NUMBER, REPOSITORY_NAME);

        // use new authentication API contributed from #OD-141
        CDOAuthenticationManagerRegistry.registerAuthenticationManager("*", new CDOAuthenticationManager() {
            public boolean isInteractive() {
                return false;
            }

            public IPasswordCredentials getCredentials() {
                // TODO get credentials with a dedicated login Js/Java function
                return new IPasswordCredentials() {
                    public String getUserID() {
                        return "admin";
                    }

                    public char[] getPassword() {
                        return hashPassword("admin").toCharArray();
                    }

                    public String hashPassword(String password) {
                        try {
                            MessageDigest m = MessageDigest.getInstance("MD5");
                            byte[] out = m.digest(password.getBytes());
                            return new String(Base64.encodeBase64(out));
                        } catch (NoSuchAlgorithmException e) {
                            return null;
                        }
                    }
                };
            }
        });

        SessionFactory sessionFactory = CollaborativeSessionFactoryImpl.INSTANCE;

        collaborativeSession = (CollaborativeSession) sessionFactory.createSession(URI.createURI(SESSION_URI));
        collaborativeSession.open();
        collaborativeSession = collaborativeSession.connect(repositoryConfig);

        // Get the class used to access the CDO repository
        repositoryManager = CDORepositoryManagerRegistry.getRepositoryManager(collaborativeSession);
    }

    private static void prepareRepresentationsResource() throws RepositoryConnectionException {
        CDOTransaction transaction = repositoryManager.getOrCreateTransaction(collaborativeSession);
        CDOResource remoteDAnalysisResource = transaction.getOrCreateResource(VIEWPOINT_MODEL_URI);
        if (remoteDAnalysisResource.getContents().size() == 0) {
            // Initialize the resource if the resource is empty
            initRepresentationsResource(remoteDAnalysisResource);
        }
        collaborativeSession.addRemoteRepresentationsSet(remoteDAnalysisResource.getPath());
        ViewpointUtil.selectViewpoint(TogafViewpoint.BUSINESS.getID());
        ViewpointUtil.selectViewpoint(TogafViewpoint.DATA.getID());
        ViewpointUtil.selectViewpoint(TogafViewpoint.APPLICATION.getID());
    }

    private static void initRepresentationsResource(Resource remoteDAnalysisResource) {
        remoteDAnalysisResource.getContents().add(ViewpointFactory.eINSTANCE.createDAnalysis());
    }

    private static void prepareSemanticResource() throws RepositoryConnectionException {
        if (collaborativeSession.getSemanticResources().size() == 0) {
            final Resource resource = repositoryManager.getOrCreateTransaction(collaborativeSession).getOrCreateResource(SEMANTIC_MODEL_URI);
            if (resource.getContents().isEmpty()) {
                initSemanticResource(resource);
            }
            collaborativeSession.getTransactionalEditingDomain().getCommandStack().execute(new ViewpointCommand(collaborativeSession.getTransactionalEditingDomain()) {
                @Override
                protected void doExecute() {
                    collaborativeSession.addSemanticResource(resource, true);
                }
            });

        }
    }

    private static void initSemanticResource(Resource semanticResource) {
        EnterpriseArchitecture enterpriseArchitecture = ContentfwkFactory.eINSTANCE.createEnterpriseArchitecture();

        StrategicArchitecture strategicArchitecture = ContentfwkFactory.eINSTANCE.createStrategicArchitecture();
        enterpriseArchitecture.getArchitectures().add(strategicArchitecture);

        BusinessArchitecture businessArchitecture = ContentfwkFactory.eINSTANCE.createBusinessArchitecture();
        enterpriseArchitecture.getArchitectures().add(businessArchitecture);

        DataArchitecture dataArchitecture = ContentfwkFactory.eINSTANCE.createDataArchitecture();
        enterpriseArchitecture.getArchitectures().add(dataArchitecture);

        ApplicationArchitecture applicationArchitecture = ContentfwkFactory.eINSTANCE.createApplicationArchitecture();
        enterpriseArchitecture.getArchitectures().add(applicationArchitecture);

        TechnologyArchitecture technologyArchitecture = ContentfwkFactory.eINSTANCE.createTechnologyArchitecture();
        enterpriseArchitecture.getArchitectures().add(technologyArchitecture);

        semanticResource.getContents().add(enterpriseArchitecture);
    }

}
