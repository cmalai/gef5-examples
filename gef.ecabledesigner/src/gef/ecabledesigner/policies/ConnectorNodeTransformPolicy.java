package gef.ecabledesigner.policies;

import org.eclipse.gef.mvc.fx.operations.ForwardUndoCompositeOperation;
import org.eclipse.gef.mvc.fx.operations.ITransactionalOperation;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;
import org.eclipse.gef.mvc.fx.policies.TransformPolicy;

import gef.ecabledesigner.parts.BlackBoxNodePart;
import javafx.scene.Node;

public class ConnectorNodeTransformPolicy extends TransformPolicy {
	
	@Override
	protected boolean isContentTransformable() {
		IVisualPart<? extends Node> parent = getHost().getParent();
		if (parent instanceof BlackBoxNodePart) {
			return false;
		}
		return super.isContentTransformable();
	}
	
	@Override
	public ITransactionalOperation commit() {
		IVisualPart<? extends Node> parent = getHost().getParent();
		if (parent instanceof BlackBoxNodePart) {
			ForwardUndoCompositeOperation commit = new ForwardUndoCompositeOperation("Translate()");
			return commit;
		}
		return super.commit();
	}
	

}
