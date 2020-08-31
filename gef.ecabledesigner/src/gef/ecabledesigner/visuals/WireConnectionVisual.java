package gef.ecabledesigner.visuals;

import org.eclipse.gef.fx.nodes.Connection;
import org.eclipse.gef.fx.nodes.GeometryNode;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class WireConnectionVisual extends Connection {

	public static class ArrowHead extends Polygon {
		public ArrowHead() {
			super(0, 0, 10, 3, 10, -3);
		}
	}

	public WireConnectionVisual() {
//		routerProperty().set(new OrthogonalRouter());
		ArrowHead endDecoration = new ArrowHead();
		endDecoration.setFill(Color.BLACK);
		setEndDecoration(endDecoration);

		ArrowHead startDecoration = new ArrowHead();
		startDecoration.setFill(Color.BLACK);
		setStartDecoration(startDecoration);

		Node curve = getCurve();

		((GeometryNode<?>) curve).setStroke(Color.RED);
		((GeometryNode<?>) curve).setStrokeWidth(2);
//		((GeometryNode<?>) curve).getStrokeDashArray().setAll(strokeDashArray);
	}

}
