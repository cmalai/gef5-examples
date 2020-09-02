package gef.ecabledesigner.visuals;

import org.eclipse.gef.fx.nodes.GeometryNode;
import org.eclipse.gef.geometry.planar.RoundedRectangle;

import diagram.BlackBoxNode;
import diagram.ConnectorNode;
import diagram.ConnectorType;
import diagram.Orientation;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;

public class BlackBoxNodeVisual extends Group {

	private static final double HORIZONTAL_PADDING = 20d;
	private static final double VERTICAL_PADDING = 10d;
	private static final double VERTICAL_SPACING = 5d;

	private Text text;
	private GeometryNode<RoundedRectangle> shape;
	private VBox labelVBox;
	private VBox leftConnectorHolder;
	private VBox rightConnectorHolder;
	private BorderPane bp;

	public Text getText() {
		return text;
	}

	@Override
	public double maxHeight(double width) {
		// TODO Auto-generated method stub
		return Double.MAX_VALUE;
	}

	@Override
	public double minWidth(double height) {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public double minHeight(double width) {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public double maxWidth(double height) {
		// TODO Auto-generated method stub
		return Double.MAX_VALUE;
	}

	public BlackBoxNodeVisual(BlackBoxNode bbNode) {
		// create background shape
		RoundedRectangle geom = new RoundedRectangle(bbNode.getPosition().getX(), bbNode.getPosition().getY(),
				bbNode.getPosition().getW(), bbNode.getPosition().getH(), 8, 8);
		shape = new GeometryNode<>(geom);
		shape.setFill(Color.LIGHTGREEN);
		shape.setStroke(Color.BLACK);
		shape.setStrokeType(StrokeType.INSIDE);

		// create vertical box for title and description
		labelVBox = new VBox(VERTICAL_SPACING);
		labelVBox.setLayoutX(bbNode.getPosition().getX());
		labelVBox.setLayoutY(bbNode.getPosition().getY() - 20);
//		labelVBox.setPadding(new Insets(VERTICAL_PADDING, HORIZONTAL_PADDING, VERTICAL_PADDING, HORIZONTAL_PADDING));

		// create title text
		text = new Text();
		text.setTextOrigin(VPos.TOP);

		// vertically lay out title and description
		labelVBox.getChildren().addAll(text);

		bp = new BorderPane();

		Group labelGroup = new Group(labelVBox);

		Group shapeGroup = new Group(shape);

		bp.setTop(labelGroup);

		bp.setCenter(shapeGroup);

		leftConnectorHolder = new VBox(1);
		leftConnectorHolder.setAlignment(Pos.CENTER);
		leftConnectorHolder.setTranslateX(1);

		rightConnectorHolder = new VBox(1);
		rightConnectorHolder.setAlignment(Pos.CENTER);
		rightConnectorHolder.setTranslateX(-1);

		bp.setRight(rightConnectorHolder);
		bp.setLeft(leftConnectorHolder);

		// wrap shape and VBox in Groups so that their bounds-in-parent is
		// considered when determining the layout-bounds of this visual
		getChildren().addAll(bp);
	}

	public GeometryNode<RoundedRectangle> getShape() {
		return shape;
	}

	public VBox getLeftConnectorHolder() {
		return leftConnectorHolder;
	}

	public VBox getRightConnectorHolder() {
		return rightConnectorHolder;
	}

	public BlackBoxNodeVisual update(BlackBoxNode content) {

		double contactContainerHeight = rightConnectorHolder.prefHeight(-1) > 30 ? rightConnectorHolder.prefHeight(-1)
				: 30;

		shape.setPrefHeight(contactContainerHeight + 30);

		return this;
	}

}
