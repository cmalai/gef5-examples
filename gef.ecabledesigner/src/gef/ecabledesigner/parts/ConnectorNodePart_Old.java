package gef.ecabledesigner.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;
import org.eclipse.gef.mvc.fx.parts.ITransformableContentPart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;

import diagram.BlackBoxNode;
import diagram.ConnectorNode;
import diagram.ContactNode;
import diagram.Orientation;
import diagram.Position;
import gef.ecabledesigner.visuals.ConnectorNodeVisual;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Translate;

public class ConnectorNodePart_Old extends AbstractContentPart<ConnectorNodeVisual>
		implements ITransformableContentPart<ConnectorNodeVisual> {

	AdapterImpl listener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification notification) {

			refreshVisual();
			refreshContentChildren();
		}
	};

	@Override
	protected void doActivate() {
		super.doActivate();
		getContent().eAdapters().add(listener);
	}

	@Override
	protected void doDeactivate() {
		// TODO Auto-generated method stub
		super.doDeactivate();
		getContent().eAdapters().remove(listener);
	}

	@Override
	public ConnectorNode getContent() {
		return (ConnectorNode) super.getContent();
	}

	@Override
	protected void doRefreshVisual(ConnectorNodeVisual visual) {
		visual = visual.update(getContent());
		setVisualTransform(getContentTransform());
	}

	@Override
	public SetMultimap<? extends Object, String> doGetContentAnchorages() {
		return HashMultimap.create();
	}

	@Override
	public List<? extends Object> doGetContentChildren() {
		if (getContent().eContainer() instanceof BlackBoxNode) {
			return Collections.emptyList();
		}
		return getContent().getContacts();
	}

	@Override
	protected void doRemoveContentChild(Object contentChild) {
		if (contentChild instanceof ContactNode) {
			getContent().getContacts().remove((ContactNode) contentChild);
		} else {
			throw new IllegalArgumentException("contentChild has invalid type: " + contentChild.getClass());
		}
	}

	@Override
	protected void doAddContentChild(Object contentChild, int index) {
		if (contentChild instanceof ContactNode) {
			getContent().getContacts().add(index, (ContactNode) contentChild);
		} else {
			throw new IllegalArgumentException("contentChild has invalid type: " + contentChild.getClass());
		}
	}

	@Override
	protected void doAddChildVisual(IVisualPart<? extends Node> child, int index) {
		if (getContent().getOrientation().equals(Orientation.EAST)) {
			getVisual().getRightContactHolder().getChildren().add(child.getVisual());
		} else {
			getVisual().getLeftContactHolder().getChildren().add(child.getVisual());
		}
	}

	@Override
	protected void doRemoveChildVisual(IVisualPart<? extends Node> child, int index) {
		ObservableList<Node> children = getVisual().getLeftContactHolder().getChildren();

		if (getContent().getOrientation().equals(Orientation.EAST)) {
			children = getVisual().getRightContactHolder().getChildren();
		}

		children.remove(index);
	}

	@Override
	protected ConnectorNodeVisual doCreateVisual() {

//		Polygon polygon = new Polygon();
//		double starty = 0;
//		double startx = 0;
//		//Adding coordinates to the polygon 
//				polygon.getPoints().addAll(new Double[]{ 
//						startx, starty, 
//						startx+50, starty, 
//						startx+75, starty + 25,
//						startx+75, starty + 50,
//						startx+50, starty + 75,
//			         startx, starty + 75,	         
//			      });
//				polygon.setFill(Color.BLANCHEDALMOND);
//				polygon.setStroke(Color.BLACK);
//				polygon.setStrokeWidth(2);

		ConnectorNodeVisual connectorNodeVisual = new ConnectorNodeVisual();

		return connectorNodeVisual.update(getContent());
	}

	@Override
	public Affine getContentTransform() {
		Position bounds = getContent().getPosition();
		return new Affine(new Translate(bounds.getX(), bounds.getY()));
	}

	@Override
	public void setContentTransform(Affine totalTransform) {
		Position bounds = getContent().getPosition();
		bounds.setX(totalTransform.getTx());
		bounds.setY(totalTransform.getTy());
		getContent().setPosition(bounds);
	}

}
