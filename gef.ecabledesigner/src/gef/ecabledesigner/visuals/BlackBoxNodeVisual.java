package gef.ecabledesigner.visuals;

import org.eclipse.gef.fx.nodes.GeometryNode;
import org.eclipse.gef.geometry.planar.RoundedRectangle;

import diagram.BlackBoxNode;
import javafx.geometry.VPos;
import javafx.scene.Group;
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
		RoundedRectangle geom = new RoundedRectangle(bbNode.getPosition().getX(), bbNode.getPosition().getY(), bbNode.getPosition().getW(), bbNode.getPosition().getH(), 8, 8);
		shape = new GeometryNode<>(geom);
		shape.setFill(Color.LIGHTGREEN);
		shape.setStroke(Color.BLACK);
		shape.setStrokeType(StrokeType.INSIDE);
		
	

		// create vertical box for title and description
		labelVBox = new VBox(VERTICAL_SPACING);
		labelVBox.setLayoutX(bbNode.getPosition().getX());
		labelVBox.setLayoutY(bbNode.getPosition().getY()-20);
//		labelVBox.setPadding(new Insets(VERTICAL_PADDING, HORIZONTAL_PADDING, VERTICAL_PADDING, HORIZONTAL_PADDING));

		// create title text
		text = new Text();
		text.setTextOrigin(VPos.TOP);


		// vertically lay out title and description
		labelVBox.getChildren().addAll(text);


		// wrap shape and VBox in Groups so that their bounds-in-parent is
		// considered when determining the layout-bounds of this visual
		getChildren().addAll(new Group(labelVBox),new Group(shape));
	}
	
	public GeometryNode<RoundedRectangle> getShape() {
		return shape;
	}

}
