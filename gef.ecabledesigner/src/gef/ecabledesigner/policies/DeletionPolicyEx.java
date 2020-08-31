package gef.ecabledesigner.policies;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.mvc.fx.parts.IContentPart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;
import org.eclipse.gef.mvc.fx.policies.DeletionPolicy;

import diagram.ContactNode;
import diagram.Wire;
import gef.ecabledesigner.parts.AbstractEdgePart;
import gef.ecabledesigner.parts.BlackBoxNodePart;
import gef.ecabledesigner.parts.CableEdgePart;
import gef.ecabledesigner.parts.ConnectorNodePart;
import gef.ecabledesigner.parts.ConnectorNodePart_Old;
import gef.ecabledesigner.parts.ContactNodePart;
import gef.ecabledesigner.parts.JunctionNodePart;
import javafx.scene.Node;

/**
 * Deletes connections before mind map nodes.
 */
public class DeletionPolicyEx extends DeletionPolicy {

	@Override
	public void delete(IContentPart<? extends Node> contentPartToDelete) {
		if (contentPartToDelete instanceof BlackBoxNodePart) {
			BlackBoxNodePart node = (BlackBoxNodePart) contentPartToDelete;
			for (IVisualPart<? extends Node> a : new ArrayList<>(node.getAnchoredsUnmodifiable())) {
				if (a instanceof ConnectorNodePart) {
					ConnectorNodePart connectorNodePart = (ConnectorNodePart) a;
					super.delete(connectorNodePart);
				}
			}
			System.out.println(contentPartToDelete);
			super.delete(contentPartToDelete);
		} else if (contentPartToDelete instanceof ConnectorNodePart_Old) {
			ConnectorNodePart_Old node = (ConnectorNodePart_Old) contentPartToDelete;

			// delete connections from/to the part first
			for (IVisualPart<? extends Node> a : new ArrayList<>(node.getAnchoredsUnmodifiable())) {
				if (a instanceof CableEdgePart) {
					System.out.println(a);
					super.delete((CableEdgePart) a);
				} else if (a instanceof ContactNodePart) {
					ContactNodePart contactNodePart = (ContactNodePart) a;
					delete(contactNodePart);
				}
			}
			
			for (IVisualPart<? extends Node> a : new ArrayList<>(node.getChildrenUnmodifiable())) {
				 if (a instanceof ContactNodePart) {
					ContactNodePart contactNodePart = (ContactNodePart) a;
					delete(contactNodePart);
				}
			}
			
			System.out.println(node);
			super.delete(node);
		} else if (contentPartToDelete instanceof JunctionNodePart) {
			JunctionNodePart node = (JunctionNodePart) contentPartToDelete;

			for (IVisualPart<? extends Node> a : new ArrayList<>(node.getAnchoredsUnmodifiable())) {
				if (a instanceof AbstractEdgePart) {
					System.out.println(a);
					super.delete((AbstractEdgePart) a);
				}
			}
			System.out.println(node);
			super.delete(contentPartToDelete);
		} else if (contentPartToDelete instanceof ContactNodePart) {
			ContactNodePart node = (ContactNodePart) contentPartToDelete;
//			ContactNode contactNode = node.getContent();

			for (IVisualPart<? extends Node> a : new ArrayList<>(node.getAnchoredsUnmodifiable())) {
				if (a instanceof AbstractEdgePart) {
					AbstractEdgePart abstractEdgePart = (AbstractEdgePart) a;
//					Wire wire = abstractEdgePart.getContent();
//					contactNode.getWire().remove(wire);
					System.out.println(a);
					super.delete((AbstractEdgePart) a);
				}
			}
			System.out.println(node);
			super.delete(contentPartToDelete);
		}
	}
}
