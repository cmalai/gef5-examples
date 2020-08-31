package gef.ecabledesigner.handlers;

import org.eclipse.gef.mvc.fx.handlers.AbstractHandler;
import org.eclipse.gef.mvc.fx.handlers.IOnClickHandler;
import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;
import org.eclipse.gef.mvc.fx.parts.IRootPart;
import org.eclipse.gef.mvc.fx.policies.DeletionPolicy;

import gef.ecabledesigner.parts.BlackBoxNodePart;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

/**
 * The click policy for the DeleteMindMapNodeHandlePart.
 *
 * @author hniederhausen
 *
 */
public class DeleteNodeOnHandleClickHandler extends AbstractHandler implements IOnClickHandler {

	@Override
	public void click(MouseEvent e) {
		if (!e.isPrimaryButtonDown()) {
			return;
		}

		// determine the node part for which the delete hover handle is clicked
		AbstractContentPart node = (AbstractContentPart) getHost().getAnchoragesUnmodifiable().keySet().iterator().next();

		// initialize deletion policy
		IRootPart<? extends Node> root = getHost().getRoot();
		DeletionPolicy delPolicy = root.getAdapter(DeletionPolicy.class);
		init(delPolicy);
		delPolicy.delete(node);
		commit(delPolicy);
	}
}