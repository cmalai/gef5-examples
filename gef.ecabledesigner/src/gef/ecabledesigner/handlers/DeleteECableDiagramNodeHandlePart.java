package gef.ecabledesigner.handlers;

import java.net.URL;
import java.util.Iterator;

import org.eclipse.gef.fx.nodes.HoverOverlayImageView;
import org.eclipse.gef.mvc.fx.parts.AbstractHandlePart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;

import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.image.Image;

public class DeleteECableDiagramNodeHandlePart extends AbstractHandlePart<Group> {

	public static final String IMG_ADD = "/delete_obj.gif";
	
	@Override
	protected Group doCreateVisual() {
//		Group group = new Group();
//
//		// create diagonal lines
//		double SIZE = 5;
//		Polyline topLeftBottomRight = new Polyline(-SIZE, -SIZE, SIZE, SIZE);
//		Polyline topRightBottomLeft = new Polyline(SIZE, -SIZE, -SIZE, SIZE);
//
//		// style them: red, wide, round caps
//		Color stroke = Color.RED;
//		double strokeWidth = 5d;
//		StrokeLineCap lineCap = StrokeLineCap.ROUND;
//		for (Polyline pl : new Polyline[] { topLeftBottomRight, topRightBottomLeft }) {
//			pl.setStroke(stroke);
//			pl.setStrokeWidth(strokeWidth);
//			pl.setStrokeLineCap(lineCap);
//		}
//
//		// combine diagonal lines to X shape
//		group.getChildren().addAll(topLeftBottomRight, topRightBottomLeft);
//
//		// fade-in
//		group.setOpacity(0d);
//		FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), group);
//		fadeIn.setFromValue(0d);
//		fadeIn.setToValue(1d);
//		fadeIn.play();
//
//		// make it easier clickable
//		group.setPickOnBounds(true);
//
//		return group;
		
		URL overlayImageResource = DeleteECableDiagramNodeHandlePart.class.getResource(IMG_ADD);
		if (overlayImageResource == null) {
			throw new IllegalStateException("Cannot find resource <" + IMG_ADD + ">.");
		}
		Image overlayImage = new Image(overlayImageResource.toExternalForm());

		HoverOverlayImageView blendImageView = new HoverOverlayImageView();
		blendImageView.baseImageProperty().set(overlayImage);
		blendImageView.overlayImageProperty().set(overlayImage);
		return blendImageView;
	}

	@Override
	protected void doRefreshVisual(Group visual) {
		Iterator<IVisualPart<? extends Node>> iterator = getAnchoragesUnmodifiable().keySet().iterator();
		if (!iterator.hasNext()) {
			return;
		}
		// position X in top right corner
		double PAD = 1;
		IVisualPart<? extends Node> host = iterator.next();
		Bounds hostBounds = host.getVisual().getBoundsInParent();
		visual.relocate(hostBounds.getMaxX() + PAD,
				hostBounds.getMinY() - visual.getBoundsInParent().getHeight() - PAD);
	}

}