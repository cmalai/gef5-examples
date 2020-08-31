package gef.ecabledesigner.parts;

import java.util.Map;

import org.eclipse.gef.mvc.fx.parts.IContentPart;
import org.eclipse.gef.mvc.fx.parts.IContentPartFactory;

import com.google.inject.Inject;
import com.google.inject.Injector;

import diagram.BlackBoxNode;
import diagram.Cable;
import diagram.CableDiagram;
import diagram.ConnectorNode;
import diagram.ContactNode;
import diagram.JunctionNode;
import diagram.Wire;
import javafx.scene.Node;

public class ModelPartFactory implements IContentPartFactory {

	@Inject
	private Injector injector;

	@Override
	public IContentPart<? extends Node> createContentPart(Object content, Map<Object, Object> contextMap) {
		if (content instanceof BlackBoxNode) {
			return injector.getInstance(BlackBoxNodePart.class);
		} else if (content instanceof ConnectorNode) {
			ConnectorNodePart_Old res = injector.getInstance(ConnectorNodePart_Old.class);
			return res;
		} else if (content instanceof CableDiagram) {
			return injector.getInstance(CableDiagramPart.class);
		} else if (content instanceof Wire) {
			return injector.getInstance(AbstractEdgePart.class);
		} else if (content instanceof ContactNode) {
			return injector.getInstance(ContactNodePart.class);
		} else if (content instanceof Cable) {
			return injector.getInstance(CableEdgePart.class);
		} else if (content instanceof JunctionNode) {
			return injector.getInstance(JunctionNodePart.class);
		} else {
			throw new IllegalArgumentException(content.getClass().toString());
		}
	};

}
