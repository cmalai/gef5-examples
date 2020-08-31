package gef.ecabledesigner.visuals;

import diagram.BlackBoxNode;
import diagram.ConnectorNode;
import diagram.ConnectorType;
import diagram.Orientation;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;

public class ConnectorNodeVisual extends Group {
	Polygon polygon;
	Polyline border;
	private Polyline cross1;
	private Polyline cross2;

	static final double cutSize = 5;
	private VBox leftContactHolder;
	private BorderPane bp;
	private VBox rightContactHolder;

	public ConnectorNodeVisual() {
		
		bp = new BorderPane();
		
		Group polygonHolder = new Group();
		
		polygon = new Polygon();
		polygon.setFill(Color.WHITE);

		border = new Polyline();
		cross1 = new Polyline();
		cross2 = new Polyline();

		polygonHolder.getChildren().add(polygon);
		polygonHolder.getChildren().add(border);
		polygonHolder.getChildren().add(cross1);
		polygonHolder.getChildren().add(cross2);
		
		bp.setCenter(polygonHolder);
		
		leftContactHolder = new VBox(1);
		leftContactHolder.setAlignment(Pos.CENTER);
		leftContactHolder.setTranslateX(10);
		
		rightContactHolder = new VBox(1);
		rightContactHolder.setAlignment(Pos.CENTER);
		rightContactHolder.setTranslateX(-10);
		
		bp.setRight(rightContactHolder);
		bp.setLeft(leftContactHolder);
		
		getChildren().add(bp);

	}

	public ConnectorNodeVisual update(ConnectorNode node) {

		ConnectorNode connectorNode = (ConnectorNode) node;

		Orientation orientation = Orientation.WEST;
		boolean plug = false;


		// mapped to an existing connector node
		if (connectorNode != null) {
			orientation = connectorNode.getOrientation();
		}

		plug = connectorNode.getType() == ConnectorType.PLUG;

		ObservableList<Double> points = polygon.getPoints();
		points.clear();
		border.getPoints().clear();
		cross1.getPoints().clear();
		cross2.getPoints().clear();


		double right = connectorNode.getPosition().getW();
		double bottom = connectorNode.getPosition().getH();

		polygon.setFill(Color.BLANCHEDALMOND);
		polygon.setStroke(Color.BLACK);
		polygon.setStrokeWidth(2);
		double starty = 0;
		double startx = 0;

		if (plug && (orientation == Orientation.EAST)) {
			
			double contactContainerHeight = rightContactHolder.prefHeight(-1) > 30 ? rightContactHolder.prefHeight(-1) : 30;
//			System.out.println("Layout Height >> "+contactContainerHeight);
			
			points.addAll(new Double[] { 
					startx, starty, 
					startx + (right-10), starty, 
					startx + right, starty + 10, 
					startx + right, starty + contactContainerHeight, 
					startx + right - 10, starty + contactContainerHeight + 10, 
					startx, starty + 10 + contactContainerHeight, 
					startx, starty 
				});
			
			cross1.getPoints().addAll(new Double[] { 
					startx-3, starty+(contactContainerHeight+10)/2-3,
					startx+3, starty+(contactContainerHeight+10)/2+3,
			});
			
			cross2.getPoints().addAll(new Double[] { 
					startx+3, starty+(contactContainerHeight+10)/2-3,
					startx-3, starty+(contactContainerHeight+10)/2+3,
			});
			
		} else if (plug && (orientation == Orientation.WEST)) {
			
			double contactContainerHeight = leftContactHolder.prefHeight(-1) > 30 ? leftContactHolder.prefHeight(-1) : 30;
			System.out.println("Layout Height >> "+contactContainerHeight);

			points.addAll(new Double[] { 
					startx, starty, 
					startx - (right-10), starty, 
					startx - right, starty + 10, 
					startx - right, starty + contactContainerHeight, 
					startx - (right-10), starty + contactContainerHeight + 10, 
					startx, starty + contactContainerHeight + 10, 
					startx, starty 
				});
			
			cross1.getPoints().addAll(new Double[] { 
					startx+3, starty+(contactContainerHeight+10)/2-3,
					startx-3, starty+(contactContainerHeight+10)/2+3,
			});
			
			cross2.getPoints().addAll(new Double[] { 
					startx-3, starty+(contactContainerHeight+10)/2-3,
					startx+3, starty+(contactContainerHeight+10)/2+3,
			});
		}

		else {
			
			if(connectorNode.eContainer() instanceof BlackBoxNode) {
				double bbRight = ((BlackBoxNode)connectorNode.eContainer()).getPosition().getW();
				double bbBottom = ((BlackBoxNode)connectorNode.eContainer()).getPosition().getH();
				
				
				points.addAll(new Double[] { bbRight - 20, bbBottom/2-20, bbRight, bbBottom/2-20, bbRight, bbBottom/2 + 20, bbRight-20, bbBottom/2 + 20, bbRight - 20, bbBottom/2-20 });
			} else {
			
			points.addAll(new Double[] { startx, starty, startx + right, starty, startx + right, starty + bottom, startx,
					starty + bottom, startx, starty });
			}
		}


		border.getPoints().addAll(points);

		return this;
	}
	
	public VBox getRightContactHolder() {
		return rightContactHolder;
	}
	
	public VBox getLeftContactHolder() {
		return leftContactHolder;
	}

}