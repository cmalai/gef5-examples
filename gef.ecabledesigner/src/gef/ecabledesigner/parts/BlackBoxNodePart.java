package gef.ecabledesigner.parts;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gef.fx.nodes.GeometryNode;
import org.eclipse.gef.geometry.planar.Dimension;
import org.eclipse.gef.geometry.planar.Point;
import org.eclipse.gef.geometry.planar.RoundedRectangle;
import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;
import org.eclipse.gef.mvc.fx.parts.IResizableContentPart;
import org.eclipse.gef.mvc.fx.parts.ITransformableContentPart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;

import diagram.BlackBoxNode;
import diagram.ConnectorNode;
import diagram.Orientation;
import diagram.Position;
import gef.ecabledesigner.visuals.BlackBoxNodeVisual;
import javafx.collections.ObservableList;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Translate;

public class BlackBoxNodePart extends AbstractContentPart<BlackBoxNodeVisual>
		implements ITransformableContentPart<BlackBoxNodeVisual>, IResizableContentPart<BlackBoxNodeVisual> {

	private Text text;
	private RoundedRectangle roundRect;
	private GeometryNode<RoundedRectangle> geometryNode;

	@Override
	protected void doAddChildVisual(IVisualPart<? extends Node> child, int index) {

//		if (getContent().getOrientation().equals(Orientation.EAST)) {
		getVisual().getRightConnectorHolder().getChildren().add(child.getVisual());
//		} else {
//			getVisual().getLeftConnectorHolder().getChildren().add(child.getVisual());
//		}
	}

	@Override
	protected void doRemoveChildVisual(IVisualPart<? extends Node> child, int index) {
		ObservableList<Node> children = getVisual().getRightConnectorHolder().getChildren();
		children.remove(index);
	}

	AdapterImpl listener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification notification) {
			refreshVisual();
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
	protected SetMultimap<? extends Object, String> doGetContentAnchorages() {
		// TODO Auto-generated method stub
		return HashMultimap.create();
	}

	@Override
	protected void doAddContentChild(Object contentChild, int index) {
		if (contentChild instanceof ConnectorNode) {
			getContent().getConnectors().add(index, (ConnectorNode) contentChild);
		} else {
			throw new IllegalArgumentException("contentChild has invalid type: " + contentChild.getClass());
		}
	}

	@Override
	protected void doRemoveContentChild(Object contentChild) {
		if (contentChild instanceof ConnectorNode) {
			getContent().getConnectors().remove((ConnectorNode) contentChild);
		} else {
			throw new IllegalArgumentException("contentChild has invalid type: " + contentChild.getClass());
		}
	}

	@Override
	protected List<? extends Object> doGetContentChildren() {
		// TODO Auto-generated method stub
		return getContent().getConnectors();
	}

	@Override
	protected BlackBoxNodeVisual doCreateVisual() {

		BlackBoxNodeVisual blackBoxNodeVisual = new BlackBoxNodeVisual(getContent());

		return blackBoxNodeVisual.update(getContent());
	}

	@Override
	protected void doRefreshVisual(BlackBoxNodeVisual visual) {
		BlackBoxNode model = getContent();

		visual.getText().setText(model.getName());
		visual.getText().setFont(Font.font("Monospace", FontWeight.BOLD, 12));
		visual.getText().setFill(Color.BLACK);
		visual.getText().setStrokeWidth(2);

		Position layout = model.getPosition();
		
		visual = visual.update(getContent());

		setVisualSize(new Dimension(layout.getW(), layout.getH()));

	}

	@Override
	public void setVisualSize(Dimension totalSize) {
		System.out.println(totalSize);
//		IResizableContentPart.super.setVisualSize(totalSize);
		// perform layout pass to apply size
		getVisual().getShape().resize(totalSize.width, totalSize.height);
	}

	@Override
	public Dimension getVisualSize() {
		// TODO Auto-generated method stub
		return new Dimension(getVisual().getShape().getWidth(), getVisual().getShape().getHeight());
	}

	@Override
	public void setVisualTransform(Affine totalTransform) {
		// TODO Auto-generated method stub
		ITransformableContentPart.super.setVisualTransform(totalTransform);
	}

	@Override
	public BlackBoxNode getContent() {
		return (BlackBoxNode) super.getContent();
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

	@Override
	public Dimension getContentSize() {
		Position bounds = getContent().getPosition();
		return new Dimension(bounds.getW(), bounds.getH());
	}

	@Override
	public void setContentSize(Dimension totalSize) {
		Position bounds = getContent().getPosition();
		bounds.setH(totalSize.getHeight());
		bounds.setW(totalSize.getWidth());
		getContent().setPosition(bounds);
	}

}
