package gef.ecabledesigner.visuals;

import diagram.JunctionNode;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class JunctionNodeVisual extends Group {

	private Circle circle1;

	@Override
	public double maxHeight(double width) {
		return Double.MAX_VALUE;
	}

	@Override
	public double minWidth(double height) {
		return 15;
	}

	@Override
	public double minHeight(double width) {
		return 15;
	}

	@Override
	public double maxWidth(double height) {
		return Double.MAX_VALUE;
	}

	public JunctionNodeVisual(JunctionNode jNode) {
		circle1 = new Circle(10.0);

		circle1.setFill(Color.DARKGREEN);
		circle1.setStroke(Color.BLACK);
		circle1.setStrokeWidth(2d);
		circle1.setLayoutX(jNode.getPosition().getX());
		circle1.setLayoutY(jNode.getPosition().getY());

		// wrap shape and VBox in Groups so that their bounds-in-parent is
		// considered when determining the layout-bounds of this visual
		getChildren().add(circle1);
	}

	public Circle getCircle1() {
		return circle1;
	}
}
