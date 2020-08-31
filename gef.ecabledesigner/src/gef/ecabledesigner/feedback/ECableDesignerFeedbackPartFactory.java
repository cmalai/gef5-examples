package gef.ecabledesigner.feedback;

import java.util.List;
import java.util.Map;

import org.eclipse.gef.mvc.fx.parts.IFeedbackPart;
import org.eclipse.gef.mvc.fx.parts.IFeedbackPartFactory;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;

import gef.ecabledesigner.parts.ContactNodePart;
import gef.ecabledesigner.parts.JunctionNodePart;
import javafx.scene.Node;

public class ECableDesignerFeedbackPartFactory implements IFeedbackPartFactory {
	@Inject
	Injector injector;

	@Override
	public List<IFeedbackPart<? extends Node>> createFeedbackParts(List<? extends IVisualPart<? extends Node>> targets,
			Map<Object, Object> contextMap) {

		List<IFeedbackPart<? extends Node>> parts = Lists.newArrayList();

		if (targets.isEmpty()) {
			return parts;
		}

		IVisualPart<? extends Node> target = targets.get(0);

		if (target instanceof ContactNodePart) {
			// a MindMapNode target is the source of a connection so we create
			// the connection feedback
			CreateConnectionFeedbackPart part = injector.getInstance(CreateConnectionFeedbackPart.class);
			parts.add(part);
		}

		if (target instanceof JunctionNodePart) {
			// a MindMapNode target is the source of a connection so we create
			// the connection feedback
			CreateConnectionFeedbackPart part = injector.getInstance(CreateConnectionFeedbackPart.class);
			parts.add(part);
		}

		return parts;
	}

}
