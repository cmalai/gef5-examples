package gef.ecabledesigner.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.fx.nodes.GeometryNode;
import org.eclipse.gef.geometry.planar.Dimension;
import org.eclipse.gef.geometry.planar.Point;
import org.eclipse.gef.geometry.planar.Region;
import org.eclipse.gef.geometry.planar.RoundedRectangle;
import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;
import org.eclipse.gef.mvc.fx.parts.IResizableContentPart;
import org.eclipse.gef.mvc.fx.parts.ITransformableContentPart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;

import diagram.ConnectorNode;
import diagram.Orientation;
import diagram.Position;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Translate;

public class ConnectorNodePart extends AbstractContentPart<Group> implements ITransformableContentPart<Group>, IResizableContentPart<Group>{

	private static final double CIRCLE_RADIUS = 3;
	private static final double PIN_LENGTH = 10;
	private static final double BODY_LENGTH = 40;
	private static final double BODY_HEIGHT = 40;
	private static final double BODY_STROKE = 4d;
	private static final double NORMAL_STROKE = 2d;
	private boolean isNand = false;

	@Override
	public ConnectorNode getContent() {
		return (ConnectorNode) super.getContent();
	}

	@Override
	protected Group doCreateVisual() {
		
		Group res = new Group();
		
		Path body = new Path();
		body.setFill(Color.WHITE);
		body.setStrokeWidth(BODY_STROKE);
		body.setStrokeLineCap(StrokeLineCap.ROUND);
		
		int noOfContacts = getContent().getContacts().size();
		double bodyHeight = (noOfContacts * 10)+10;
		
		if(noOfContacts == 0 || bodyHeight < 40) {
			bodyHeight = 40;
		}
		
		double circleAdjust = isNand ? CIRCLE_RADIUS : 0;
		ObservableList<PathElement> bodyElements = body.getElements();
		bodyElements.add(new MoveTo(BODY_LENGTH/2, circleAdjust));
		bodyElements.add(new LineTo(0, circleAdjust));
		bodyElements.add(new LineTo(0, bodyHeight));
		bodyElements.add(new LineTo(BODY_LENGTH/2, bodyHeight));
		bodyElements.add(new ArcTo(BODY_LENGTH/2, bodyHeight/2, 0, BODY_LENGTH/2, circleAdjust, false, false ));
		
		double pinDockLeft = -BODY_LENGTH / 2;
		double pinDockRight = BODY_LENGTH;
		
//		Line pinLeft1 = new Line(pinDockLeft - PIN_LENGTH, -BODY_HEIGHT/4, pinDockLeft, -BODY_HEIGHT/4);
//		pinLeft1.setStrokeWidth(NORMAL_STROKE);
//		pinLeft1.setStrokeLineCap(StrokeLineCap.ROUND);
//		
//		Line pinLeft2 = new Line(pinDockLeft - PIN_LENGTH, BODY_HEIGHT/4, pinDockLeft, BODY_HEIGHT/4);
//		pinLeft2.setStrokeWidth(NORMAL_STROKE);
//		pinLeft2.setStrokeLineCap(StrokeLineCap.ROUND);
		
//		Line pinRight = new Line(pinDockRight + PIN_LENGTH, bodyHeight/2, pinDockRight, bodyHeight/2);
//		pinRight.setStrokeWidth(NORMAL_STROKE);
//		pinRight.setStrokeLineCap(StrokeLineCap.ROUND);

		res.getChildren().addAll(body);
//		
		for (int i = 1; i <= getContent().getContacts().size(); i++) {
			Circle circle1 = new Circle(CIRCLE_RADIUS);
			circle1.setTranslateX(0);
			circle1.setTranslateY(((i*10))+2);
			circle1.setFill(Color.WHITE);
			circle1.setStroke(Color.BLACK);
			circle1.setStrokeWidth(NORMAL_STROKE);
			res.getChildren().add(circle1);
		}
		
		
		
//		Circle circle2 = new Circle(CIRCLE_RADIUS);
//		circle2.setTranslateX(-BODY_LENGTH / 2);
//		circle2.setTranslateY(bodyHeight/4);
//		circle2.setFill(Color.WHITE);
//		circle2.setStroke(Color.BLACK);
//		circle2.setStrokeWidth(NORMAL_STROKE);
//		res.getChildren().add(circle2);

//		if( isNand ) {
//			Circle circle = new Circle(CIRCLE_RADIUS);
//			circle.setTranslateX(BODY_LENGTH / 2);
//			circle.setTranslateY(0);
//			circle.setFill(Color.WHITE);
//			circle.setStroke(Color.BLACK);
//			circle.setStrokeWidth(NORMAL_STROKE);
//			res.getChildren().add(circle);			
//		}
		
		return res;
	}

	@Override
	protected void doRefreshVisual(Group visual) {
		Point position = new Point(getContent().getPosition().getX(), getContent().getPosition().getY());
		visual.setTranslateX(position.x);
		visual.setTranslateY(position.y);
		
		Orientation angle = getContent().getOrientation();
		if(angle.equals(Orientation.WEST))
			visual.setRotate(0);
		else if(angle.equals(Orientation.EAST))
			visual.setRotate(-180);

//		setVisualTransform(getContentTransform());
	}

	@Override
	public SetMultimap<? extends Object, String> doGetContentAnchorages() {
		return HashMultimap.create();
	}

	@Override
	public List<? extends Object> doGetContentChildren() {
		return getContent().getContacts();
	}
	
	@Override
	protected void doAddChildVisual(IVisualPart<? extends Node> child, int index) {
		getVisual().getChildren().add(child.getVisual());
	}

	public void setNand(boolean value) {
		isNand  = true;
	}

	@Override
	public Affine getContentTransform() {
		Position bounds = getContent().getPosition();
		return new Affine(new Translate(bounds.getX(), bounds.getY()));
	}

	@Override
	public void setContentTransform(Affine totalTransform) {
//		Rectangle bounds = getContent().getLayout();
//		bounds.setX(totalTransform.getTx());
//		bounds.setY(totalTransform.getTy());
//		getContent().setLayout(bounds);
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
	public Dimension getContentSize() {
		Dimension size = new Dimension();
		size.setHeight(getContent().getPosition().getH());
		size.setWidth(getContent().getPosition().getW());
		return size;
	}

	@Override
	public void setContentSize(Dimension totalSize) {
		getContent().getPosition().setH(totalSize.height);
		getContent().getPosition().setW(totalSize.width);
	}
	
	
}
