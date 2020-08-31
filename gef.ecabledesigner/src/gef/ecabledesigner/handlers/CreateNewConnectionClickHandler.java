package gef.ecabledesigner.handlers;

import java.util.Collections;

import org.eclipse.gef.fx.nodes.Connection;
import org.eclipse.gef.mvc.fx.handlers.AbstractHandler;
import org.eclipse.gef.mvc.fx.handlers.IOnClickHandler;
import org.eclipse.gef.mvc.fx.operations.ChangeSelectionOperation;
import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;
import org.eclipse.gef.mvc.fx.parts.IContentPart;
import org.eclipse.gef.mvc.fx.parts.IRootPart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;
import org.eclipse.gef.mvc.fx.policies.CreationPolicy;
import org.eclipse.gef.mvc.fx.viewer.IViewer;

import com.google.common.collect.HashMultimap;
import com.google.common.reflect.TypeToken;

import diagram.ContactNode;
import diagram.DiagramFactory;
import diagram.JunctionNode;
import diagram.Wire;
import gef.ecabledesigner.parts.CableDiagramPart;
import gef.ecabledesigner.parts.ConnectorNodePart;
import gef.ecabledesigner.parts.ContactNodePart;
import gef.ecabledesigner.parts.JunctionNodePart;
import gef.ecabledesigner.tools.ItemCreationModel;
import gef.ecabledesigner.tools.ItemCreationModel.Type;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class CreateNewConnectionClickHandler extends AbstractHandler implements IOnClickHandler {

	@Override
	public void click(MouseEvent e) {
		if (!e.isPrimaryButtonDown()) {
			return;
		}

		IViewer viewer = getHost().getRoot().getViewer();
		ItemCreationModel creationModel = viewer.getAdapter(ItemCreationModel.class);
		if (creationModel.getType() != Type.Connection && creationModel.getType() != Type.Connector_Connection) {
			return;
		}

		if (creationModel.getType() == Type.Connection) {

			AbstractContentPart source = creationModel.getSource();
			if (source == null) {
				IVisualPart<?> part = getHost();
				if (part instanceof ContactNodePart) {
					creationModel.setSource((ContactNodePart) part);
				} else if (part instanceof JunctionNodePart) {
					creationModel.setSource((JunctionNodePart) part);
				} else {
					System.out.println("source part is not EntityPart");
				}
				return;
			}

			IVisualPart<?> part = getHost();
			AbstractContentPart target = null;
			if (part instanceof ContactNodePart) {
				target = (ContactNodePart) part;
			} else if (part instanceof JunctionNodePart) {
				target = (JunctionNodePart) part;
			} else {
				System.out.println("target part is not EntityPart");
				creationModel.setSource(null);
				return;
			}

			// TODO: Create Recursive Relationship
			if (source == target) {
				return;
			}

			IVisualPart<? extends Node> dpart = getHost().getRoot().getChildrenUnmodifiable().get(0);
			if (dpart instanceof CableDiagramPart) {
				Wire newConnection = DiagramFactory.eINSTANCE.createWire();

				if (source instanceof ContactNodePart) {
					ContactNode contactSource = ((ContactNodePart) source).getContent();
					newConnection.setSource(contactSource);
					contactSource.getWire().add(newConnection);
				}
				if (source instanceof JunctionNodePart) {
					JunctionNode juncSource = ((JunctionNodePart) source).getContent();
					newConnection.setSource(juncSource);
					juncSource.getWire().add(newConnection);
				}

				if (target instanceof ContactNodePart) {
					ContactNode contactTarget = ((ContactNodePart) target).getContent();
					newConnection.setTarget(contactTarget);
					contactTarget.getWire().add(newConnection);
				}
				if (target instanceof JunctionNodePart) {
					JunctionNode juncTarget = ((JunctionNodePart) target).getContent();
					newConnection.setTarget(juncTarget);
					juncTarget.getWire().add(newConnection);
				}

				IRootPart<? extends Node> root = getHost().getRoot();
				@SuppressWarnings("serial")
				CreationPolicy creationPolicy = root.getAdapter(new TypeToken<CreationPolicy>() {
				});
				init(creationPolicy);
				creationPolicy.create(newConnection, dpart,
						HashMultimap.<IContentPart<? extends Node>, String>create());
				commit(creationPolicy);
				try {

					if (target instanceof ContactNodePart) {
						viewer.getDomain().execute(new ChangeSelectionOperation(viewer,
								Collections.singletonList((ContactNodePart) target)), null);
					} else if (target instanceof JunctionNodePart) {
						viewer.getDomain().execute(new ChangeSelectionOperation(viewer,
								Collections.singletonList((JunctionNodePart) target)), null);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			creationModel.setSource(null);
			creationModel.setType(Type.None);
		}
//		else {
//			ConnectorNodePart source = creationModel.getSource();
//			if (source == null) {
//				IVisualPart<?> part = getHost();
//				if (part instanceof PortNodePart) {
//					creationModel.setSource((PortNodePart) part);
//				} else {
//					System.out.println("source part is not EntityPart");
//				}
//				return;
//			}
//
//			IVisualPart<?> part = getHost();
//			PortNodePart target = null;
//			if (part instanceof PortNodePart) {
//				target = (PortNodePart) part;
//			} else {
//				System.out.println("target part is not EntityPart");
//				creationModel.setSource(null);
//				return;
//			}
//
//			// TODO: Create Recursive Relationship
//			if (source == target) {
//				return;
//			}
//
//			IVisualPart<? extends Node> dpart = getHost().getRoot().getChildrenUnmodifiable().get(0);
//			if (dpart instanceof CableDiagramPart) {
//				Wire newConnection = DiagramFactory.eINSTANCE.createWire();
//				newConnection.setSource(source.getContent());
//				newConnection.setTarget(target.getContent());
//				source.getContent().setWire(newConnection);
//				target.getContent().setWire(newConnection);
//
//				IRootPart<? extends Node> root = getHost().getRoot();
//				@SuppressWarnings("serial")
//				CreationPolicy creationPolicy = root.getAdapter(new TypeToken<CreationPolicy>() {
//				});
//				init(creationPolicy);
//				creationPolicy.create(newConnection, dpart,
//						HashMultimap.<IContentPart<? extends Node>, String>create());
//				commit(creationPolicy);
//				try {
//					viewer.getDomain().execute(new ChangeSelectionOperation(viewer, Collections.singletonList(target)),
//							null);
//				} catch (Exception ex) {
//					ex.printStackTrace();
//				}
//			}
//			creationModel.setSource(null);
//			creationModel.setType(Type.None);
//		}
	}

}
