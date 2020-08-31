package gef.ecabledesigner.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.common.adapt.AdapterKey;
import org.eclipse.gef.fx.anchors.IAnchor;
import org.eclipse.gef.geometry.planar.IGeometry;
import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;
import org.eclipse.gef.mvc.fx.parts.IBendableContentPart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import com.google.common.reflect.TypeToken;
import com.google.inject.Provider;

import diagram.Point;
import diagram.Wire;
import gef.ecabledesigner.visuals.WireConnectionVisual;
import javafx.scene.Node;

public class AbstractEdgePart extends AbstractContentPart<WireConnectionVisual> {
//		implements IBendableContentPart<WireConnectionVisual> {

	public static final String START_ROLE = "START";
	public static final String END_ROLE = "END";

	@Override
	protected void doAttachToAnchorageVisual(IVisualPart<? extends Node> anchorage, String role) {
		// find a anchor provider, which must be registered in the module
		// be aware to use the right interfaces (Provider is used a lot)
		@SuppressWarnings("serial")
		Provider<? extends IAnchor> adapter = anchorage
				.getAdapter(AdapterKey.get(new TypeToken<Provider<? extends IAnchor>>() {
				}));
		if (adapter == null) {
			throw new IllegalStateException("No adapter  found for <" + anchorage.getClass() + "> found.");
		}
		IAnchor anchor = adapter.get();

		if (role.equals(START_ROLE)) {
			getVisual().setStartAnchor(anchor);
		} else if (role.equals(END_ROLE)) {
			getVisual().setEndAnchor(anchor);
		} else {
			throw new IllegalArgumentException("Invalid role: " + role);
		}
	}

	@Override
	protected WireConnectionVisual doCreateVisual() {
		return new WireConnectionVisual();
	}

	@Override
	protected void doDetachFromAnchorageVisual(IVisualPart<? extends Node> anchorage, String role) {
		if (role.equals(START_ROLE)) {
			getVisual().setStartPoint(getVisual().getStartPoint());
		} else if (role.equals(END_ROLE)) {
			getVisual().setEndPoint(getVisual().getEndPoint());
		} else {
			throw new IllegalArgumentException("Invalid role: " + role);
		}
	}

	@Override
	protected SetMultimap<? extends Object, String> doGetContentAnchorages() {
		SetMultimap<Object, String> anchorages = HashMultimap.create();

		anchorages.put(getContent().getSource(), START_ROLE);
		anchorages.put(getContent().getTarget(), END_ROLE);

		return anchorages;
	}

	@Override
	protected List<? extends Object> doGetContentChildren() {
		return Collections.emptyList();
	}

	@Override
	protected void doRefreshVisual(WireConnectionVisual visual) {
		// nothing to do here
	}

	@Override
	public Wire getContent() {
		return (Wire) super.getContent();
	}

//	@Override
//	public List<BendPoint> getContentBendPoints() {
//		ArrayList bendPoints = new ArrayList<>();
//		EList<Point> wayPoints = getContent().getWayPoints();
//		Point point = wayPoints.get(0);
//		Point lastPoint = wayPoints.get(wayPoints.size() - 1);
//
//		org.eclipse.gef.geometry.planar.Point gefStartPoint = new org.eclipse.gef.geometry.planar.Point(point.getX(),
//				point.getY());
//		org.eclipse.gef.geometry.planar.Point gefLastPoint = new org.eclipse.gef.geometry.planar.Point(lastPoint.getX(),
//				lastPoint.getY());
//
//		bendPoints.add(new BendPoint(getContent().getSource(), gefStartPoint));
//		bendPoints.add(new BendPoint(getContent().getTarget(), gefLastPoint));
//		// add unattached bend-points for the rest of the way points
//		for (int i = 1; i <= wayPoints.size() - 1; i++) {
//			Point intermediatePoint = wayPoints.get(i);
//			org.eclipse.gef.geometry.planar.Point gefIntermediate = new org.eclipse.gef.geometry.planar.Point(
//					intermediatePoint.getX(), intermediatePoint.getY());
//			bendPoints.add(i, new BendPoint(gefIntermediate));
//		}
//		return bendPoints;
//	}
//
//	@Override
//	public void setContentBendPoints(List<BendPoint> bendPoints) {
//		// TODO Auto-generated method stub
//
//	}

}
