package gef.ecabledesigner.handlers;

import org.eclipse.gef.mvc.fx.handlers.AbstractHandler;
import org.eclipse.gef.mvc.fx.handlers.IOnClickHandler;
import org.eclipse.gef.mvc.fx.models.HoverModel;
import org.eclipse.gef.mvc.fx.parts.IContentPart;
import org.eclipse.gef.mvc.fx.parts.IRootPart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;
import org.eclipse.gef.mvc.fx.policies.CreationPolicy;
import org.eclipse.gef.mvc.fx.viewer.IViewer;

import com.google.common.collect.HashMultimap;

import diagram.BlackBoxNode;
import diagram.ConnectorNode;
import diagram.ConnectorType;
import diagram.ContactNode;
import diagram.DiagramFactory;
import diagram.JunctionNode;
import diagram.Orientation;
import diagram.Position;
import gef.ecabledesigner.parts.BlackBoxNodePart;
import gef.ecabledesigner.parts.CableDiagramPart;
import gef.ecabledesigner.parts.ConnectorNodePart_Old;
import gef.ecabledesigner.tools.ItemCreationModel;
import gef.ecabledesigner.tools.ItemCreationModel.Type;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class CreateNewDiagramChildrenOnClickHandler extends AbstractHandler implements IOnClickHandler {

	@Override
	public void click(MouseEvent e) {
		if (!e.isPrimaryButtonDown()) {
			return;
		}

		IViewer viewer = getHost().getRoot().getViewer();
		ItemCreationModel creationModel = viewer.getAdapter(ItemCreationModel.class);
		if (creationModel == null) {
			System.out.println("creationModel is null");
			return;
		}

		if (creationModel.getType() != Type.BlackBox && creationModel.getType() != Type.Connector
				&& creationModel.getType() != Type.JunctionNode && creationModel.getType() != Type.ContactNode) {
			System.out.println("creationModel.getType() is not Entity:" + creationModel.getType());
			creationModel.setSource(null);
			return;
		}
//		IVisualPart<? extends Node> part = viewer.getRootPart().getChildrenUnmodifiable().get(0);

		HoverModel selectionModel = viewer.getAdapter(HoverModel.class);
		IVisualPart<? extends Node> part = selectionModel.getHover();
		if (part == null || part instanceof IRootPart) {
			part = viewer.getRootPart().getChildrenUnmodifiable().get(0);
		}

		System.out.println(part);

		if (part instanceof CableDiagramPart) {
			Point2D mouseInLocal = part.getVisual().sceneToLocal(e.getSceneX(), e.getSceneY());

			if (creationModel.getType() == Type.BlackBox) {

				BlackBoxNode entity = DiagramFactory.eINSTANCE.createBlackBoxNode();
				entity.setName("New BlackBox");

				Position rectangle = DiagramFactory.eINSTANCE.createPosition();
				rectangle.setX(mouseInLocal.getX());
				rectangle.setY(mouseInLocal.getY());
				rectangle.setH(80);
				rectangle.setW(150);
				entity.setPosition(rectangle);

				IRootPart<? extends Node> root = getHost().getRoot();
				CreationPolicy creationPolicy = root.getAdapter(CreationPolicy.class);
				init(creationPolicy);
				creationPolicy.create(entity, part, HashMultimap.<IContentPart<? extends Node>, String>create());
				commit(creationPolicy);
			} else if (creationModel.getType() == Type.JunctionNode) {

				JunctionNode entity = DiagramFactory.eINSTANCE.createJunctionNode();
				entity.setName("New Junction Node");

				Position rectangle = DiagramFactory.eINSTANCE.createPosition();
				rectangle.setX(mouseInLocal.getX());
				rectangle.setY(mouseInLocal.getY());
				rectangle.setH(40);
				rectangle.setW(40);
				entity.setPosition(rectangle);

				IRootPart<? extends Node> root = getHost().getRoot();
				CreationPolicy creationPolicy = root.getAdapter(CreationPolicy.class);
				init(creationPolicy);
				creationPolicy.create(entity, part, HashMultimap.<IContentPart<? extends Node>, String>create());
				commit(creationPolicy);
			} else if (creationModel.getType() == Type.ContactNode) {

				ContactNode entity = DiagramFactory.eINSTANCE.createContactNode();
				entity.setName("New Contact Node");

				Position rectangle = DiagramFactory.eINSTANCE.createPosition();
				rectangle.setX(mouseInLocal.getX());
				rectangle.setY(mouseInLocal.getY());
				rectangle.setH(40);
				rectangle.setW(40);
				entity.setPosition(rectangle);

				IRootPart<? extends Node> root = getHost().getRoot();
				CreationPolicy creationPolicy = root.getAdapter(CreationPolicy.class);
				init(creationPolicy);
				creationPolicy.create(entity, part, HashMultimap.<IContentPart<? extends Node>, String>create());
				commit(creationPolicy);
			} else {
				ConnectorNode entity = DiagramFactory.eINSTANCE.createConnectorNode();
				entity.setName("New Connector");

				Position rectangle = DiagramFactory.eINSTANCE.createPosition();
				rectangle.setX(mouseInLocal.getX());
				rectangle.setY(mouseInLocal.getY());
				rectangle.setW(40);
				rectangle.setH(40);
				entity.setPosition(rectangle);

				ContactNode portNode1 = DiagramFactory.eINSTANCE.createContactNode();
				entity.getContacts().add(portNode1);

				entity.setOrientation(Orientation.EAST);
				entity.setType(ConnectorType.PLUG);

				IRootPart<? extends Node> root = getHost().getRoot();
				CreationPolicy creationPolicy = root.getAdapter(CreationPolicy.class);
				init(creationPolicy);
				creationPolicy.create(entity, part, HashMultimap.<IContentPart<? extends Node>, String>create());
				commit(creationPolicy);
			}

		} else if (part instanceof BlackBoxNodePart) {
			BlackBoxNodePart blackBoxNodePart = (BlackBoxNodePart) part;

			Point2D mouseInLocal = part.getVisual().sceneToLocal(e.getSceneX(), e.getSceneY());

			if (creationModel.getType() == Type.Connector) {

				ConnectorNode entity = DiagramFactory.eINSTANCE.createConnectorNode();
				entity.setName("New Connector");

				Position rectangle = DiagramFactory.eINSTANCE.createPosition();
				rectangle.setX(mouseInLocal.getX());
				rectangle.setY(mouseInLocal.getY());
				rectangle.setW(20);
				rectangle.setH(40);
				entity.setPosition(rectangle);

				entity.setOrientation(Orientation.EAST);
				entity.setType(ConnectorType.PLUG);

//				blackBoxNodePart.getContent().getConnectors().add(entity);

				IRootPart<? extends Node> root = getHost().getRoot();
				CreationPolicy creationPolicy = root.getAdapter(CreationPolicy.class);
				init(creationPolicy);
				creationPolicy.create(entity, part, HashMultimap.<IContentPart<? extends Node>, String>create());
				commit(creationPolicy);

			}

		} else if (part instanceof ConnectorNodePart_Old) {
			ConnectorNodePart_Old connectorNodePart_Old = (ConnectorNodePart_Old) part;

			Point2D mouseInLocal = part.getVisual().sceneToLocal(e.getSceneX(), e.getSceneY());

			ContactNode entity = DiagramFactory.eINSTANCE.createContactNode();
			entity.setName("New Contact Node");

			Position rectangle = DiagramFactory.eINSTANCE.createPosition();
			rectangle.setX(mouseInLocal.getX());
			rectangle.setY(mouseInLocal.getY());
			rectangle.setH(40);
			rectangle.setW(40);
			entity.setPosition(rectangle);

			connectorNodePart_Old.getContent().getContacts().add(entity);

			IRootPart<? extends Node> root = getHost().getRoot();
			CreationPolicy creationPolicy = root.getAdapter(CreationPolicy.class);
			init(creationPolicy);
			creationPolicy.create(entity, connectorNodePart_Old,
					HashMultimap.<IContentPart<? extends Node>, String>create());
			commit(creationPolicy);

		}
		creationModel.setType(Type.None);

	}

}
