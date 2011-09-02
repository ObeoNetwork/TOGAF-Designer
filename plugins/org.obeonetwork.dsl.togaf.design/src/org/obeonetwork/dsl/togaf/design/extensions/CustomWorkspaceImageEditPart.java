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
package org.obeonetwork.dsl.togaf.design.extensions;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import fr.obeo.dsl.common.ui.tools.api.graphical.figure.AirStyleDefaultSizeNodeFigure;
import fr.obeo.dsl.viewpoint.ViewpointFactory;
import fr.obeo.dsl.viewpoint.WorkspaceImage;
import fr.obeo.dsl.viewpoint.diagram.edit.api.part.AbstractNotSelectableShapeNodeEditPart;
import fr.obeo.dsl.viewpoint.diagram.edit.api.part.IDiagramBorderNodeEditPart;
import fr.obeo.dsl.viewpoint.diagram.edit.internal.part.DiagramBorderNodeEditPartOperation;
import fr.obeo.dsl.viewpoint.diagram.edit.internal.part.DiagramNodeEditPartOperation;
import fr.obeo.dsl.viewpoint.diagram.figure.WorkspaceImageFigure;

/**
 * 
 * @author cnotot
 *
 */
public abstract class CustomWorkspaceImageEditPart extends AbstractNotSelectableShapeNodeEditPart {

    public DragTracker getDragTracker(Request request) {
        return getParent().getDragTracker(request);
    }

    public static final int VISUAL_ID = 3005;

    protected IFigure contentPane;

    protected IFigure primaryShape;
    
	
	public CustomWorkspaceImageEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
        figure.setLayoutManager(new StackLayout());
        IFigure shape = createNodeShape();
        figure.add(shape);
        contentPane = setupContentPane(shape);
        return figure;
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
        WorkspaceImageFigure figure = this.getPrimaryShape();
        EObject element = this.resolveSemanticElement();
        if (element instanceof WorkspaceImage) {
            WorkspaceImage bundledImage = (WorkspaceImage) element;
            
            setPath(bundledImage);
            
            figure.refreshFigure(bundledImage);
            DiagramNodeEditPartOperation.refreshNodeLabelAlignment(figure, bundledImage);
            ((GraphicalEditPart) this.getParent()).setLayoutConstraint(this, this.getFigure(), new Rectangle(0, 0, figure.getPreferredSize().width, figure.getPreferredSize().height));
        }
	}
	
	protected IFigure createNodeShape() {
		WorkspaceImage wkImage = ViewpointFactory.eINSTANCE.createWorkspaceImage();
        		
        setPath(wkImage);
        
        WorkspaceImageFigure wif = (WorkspaceImageFigure) WorkspaceImageFigure.createImageFigure(wkImage);
        EditPart parent = this.getParent();
        if (parent instanceof IDiagramBorderNodeEditPart) {
            DiagramBorderNodeEditPartOperation.updateTransparencyMode((IDiagramBorderNodeEditPart) parent, wif);
        }
        return primaryShape = wif;
    }
	
	abstract protected void setPath(WorkspaceImage wkImage);
	
	protected LayoutEditPolicy createLayoutEditPolicy() {
        LayoutEditPolicy lep = new fr.obeo.dsl.viewpoint.diagram.tools.api.policies.LayoutEditPolicy() {

            protected EditPolicy createChildEditPolicy(EditPart child) {
                EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (result == null) {
                    result = new NonResizableEditPolicy();
                }
                return result;
            }

            protected Command getMoveChildrenCommand(Request request) {
                return null;
            }

            protected Command getCreateCommand(CreateRequest request) {
                return null;
            }
        };
        return lep;
    }
	
	public WorkspaceImageFigure getPrimaryShape() {
        return (WorkspaceImageFigure) primaryShape;
    }

    protected NodeFigure createNodePlate() {
        DefaultSizeNodeFigure result = new AirStyleDefaultSizeNodeFigure(getMapMode().DPtoLP(40), getMapMode().DPtoLP(40));
        return result;
    }

    public EditPolicy getPrimaryDragEditPolicy() {
        EditPolicy result = super.getPrimaryDragEditPolicy();
        if (result instanceof ResizableEditPolicy) {
            ResizableEditPolicy ep = (ResizableEditPolicy) result;
            ep.setResizeDirections(PositionConstants.NONE);
        }
        return result;
    }
    
    protected IFigure setupContentPane(IFigure nodeShape) {
        return nodeShape; // use nodeShape itself as contentPane
    }

    public IFigure getContentPane() {
        if (contentPane != null) {
            return contentPane;
        }
        return super.getContentPane();
    }

    protected Class<?> getMetamodelType() {
        return WorkspaceImage.class;
    }

}
