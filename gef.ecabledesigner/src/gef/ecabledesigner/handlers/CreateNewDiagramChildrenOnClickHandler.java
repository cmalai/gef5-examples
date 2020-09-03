package gef.ecabledesigner.handlers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gef.fx.nodes.InfiniteCanvas;
import org.eclipse.gef.mvc.fx.handlers.AbstractHandler;
import org.eclipse.gef.mvc.fx.handlers.IOnClickHandler;
import org.eclipse.gef.mvc.fx.models.HoverModel;
import org.eclipse.gef.mvc.fx.parts.IContentPart;
import org.eclipse.gef.mvc.fx.parts.IRootPart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;
import org.eclipse.gef.mvc.fx.policies.CreationPolicy;
import org.eclipse.gef.mvc.fx.viewer.IViewer;
import org.eclipse.gef.mvc.fx.viewer.InfiniteCanvasViewer;

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
import gef.ecabledesigner.policies.CreationMenuOnClickPolicy;
import gef.ecabledesigner.tools.ItemCreationModel;
import gef.ecabledesigner.tools.ItemCreationModel.Type;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Popup;

public class CreateNewDiagramChildrenOnClickHandler extends AbstractHandler implements IOnClickHandler {

	private Popup popup;

	@Override
	public void click(MouseEvent e) {
//		if (!e.isPrimaryButtonDown()) {
//			return;
//		}

		if (MouseButton.SECONDARY.equals(e.getButton())) {

			Point2D mouseInLocal = new Point2D(e.getScreenX(), e.getScreenY());

			// use the viewer to transform into local coordinates
			// this works even if the viewer is scrolled and/or zoomed.
			InfiniteCanvas infiniteCanvas = getViewer().getCanvas();
			mouseInLocal = infiniteCanvas.getContentGroup().screenToLocal(mouseInLocal);

			// only open if the even was on the visible canvas
			if (infiniteCanvas.getBoundsInLocal().contains(mouseInLocal)) {
				openMenu(e, mouseInLocal);
			}
		} else {

			IViewer viewer = getViewer();
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

	private InfiniteCanvasViewer getViewer() {
		return (InfiniteCanvasViewer) getHost().getRoot().getViewer();
	}

	private void openMenu(final MouseEvent me, Point2D mouseInLocal) {
		popup = new Popup();

		popup.autoFixProperty().set(true);
		popup.autoHideProperty().set(true);
		popup.setX(mouseInLocal.getX());
		popup.setY(mouseInLocal.getY());

		HBox hb = new HBox();
		hb.setStyle("-fx-border-width: 1px; -fx-border-color: DIMGRAY; -fx-background-color: lightgray");
		Button first = new Button();
		first.setOnAction(e -> addTextNode(mouseInLocal));
		ImageView iv = new ImageView(new Image(CreationMenuOnClickPolicy.class.getResourceAsStream("/AddTextNode.png")));
		iv.autosize();
		first.setGraphic(iv);
		hb.getChildren().add(first);
		hb.setEffect(new DropShadow(4, 4, 2, Color.GRAY));
		hb.setSpacing(4);
		hb.setPadding(new Insets(4, 4, 4, 4));
		popup.getContent().addAll(hb);
		popup.show(getViewer().getScene().getWindow());

	}

	private void addTextNode(Point2D mouseInLocal) {

		IRootPart<? extends Node> root = getHost().getRoot();
		IViewer viewer = root.getViewer();

		BlackBoxNode entity = DiagramFactory.eINSTANCE.createBlackBoxNode();
		entity.setName("New BlackBox");

		Position rectangle = DiagramFactory.eINSTANCE.createPosition();
		rectangle.setX(mouseInLocal.getX());
		rectangle.setY(mouseInLocal.getY());
		rectangle.setH(80);
		rectangle.setW(150);
		entity.setPosition(rectangle);
		IContentPart<? extends Node> contentPartModel = getHost().getRoot().getContentPartChildren().get(0);

		// build create operation
		CreationPolicy creationPolicy = root.getAdapter(CreationPolicy.class);
		creationPolicy.init();
		creationPolicy.create(entity, contentPartModel, HashMultimap.create());

		// execute on stack
		try {
			viewer.getDomain().execute(creationPolicy.commit(), null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		popup.hide();
	}

}
