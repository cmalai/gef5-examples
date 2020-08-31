package gef.ecabledesigner.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gef.common.adapt.AdapterKey;
import org.eclipse.gef.fx.anchors.IAnchor;
import org.eclipse.gef.fx.nodes.GeometryNode;
import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import com.google.common.reflect.TypeToken;
import com.google.inject.Provider;

import diagram.Cable;
import diagram.Color;
import gef.ecabledesigner.visuals.WireConnectionVisual;
import javafx.scene.Node;

public class CableEdgePart extends AbstractContentPart<WireConnectionVisual> {
	
	public static final String START_ROLE = "START";
	public static final String END_ROLE = "END";
	
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
		Color color = getContent().getColor();
		if (color.equals(Color.RED)) {
			Node curve = visual.getCurve();
			if (curve instanceof GeometryNode) {

				((GeometryNode<?>) curve).setStroke(javafx.scene.paint.Color.RED);
				((GeometryNode<?>) curve).setStrokeWidth(1);
			}
		} else if (color.equals(Color.BLUE)) {
			Node curve = visual.getCurve();
			if (curve instanceof GeometryNode) {

				((GeometryNode<?>) curve).setStroke(javafx.scene.paint.Color.BLUE);
				((GeometryNode<?>) curve).setStrokeWidth(1);
			}
		}else if (color.equals(Color.GREEN)) {
			Node curve = visual.getCurve();
			if (curve instanceof GeometryNode) {

				((GeometryNode<?>) curve).setStroke(javafx.scene.paint.Color.GREEN);
				((GeometryNode<?>) curve).setStrokeWidth(1);
			}
		}

	}
	

	@Override
	public Cable getContent() {
		return (Cable) super.getContent();
	}

}
