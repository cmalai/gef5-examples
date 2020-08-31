package gef.ecabledesigner.parts;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;
import org.eclipse.gef.mvc.fx.parts.IVisualPart;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.SetMultimap;

import diagram.AbstractDiagramElement;
import diagram.CableDiagram;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;

public class CableDiagramPart extends AbstractContentPart<Group> {
	
	@Override
	protected void doAddChildVisual(IVisualPart<? extends Node> child, int index) {
		getVisual().getChildren().add(child.getVisual());
	}
	
	@Override
    protected void doAddContentChild(Object contentChild, int index) {
        if (contentChild instanceof AbstractDiagramElement) {
            getContent().getDiagramElements().add(index, (AbstractDiagramElement)contentChild);
        } else {
            throw new IllegalArgumentException("contentChild has invalid type: " + contentChild.getClass());
        }
    }

	@Override
	public CableDiagram getContent() {
		// TODO Auto-generated method stub
		return (CableDiagram) super.getContent();
	}

	@Override
	protected SetMultimap<? extends Object, String> doGetContentAnchorages() {
		// TODO Auto-generated method stub
		return HashMultimap.create();
	}

	@Override
	protected List<? extends Object> doGetContentChildren() {
		return Lists.newArrayList(getContent().getDiagramElements());
	}

	@Override
	protected Group doCreateVisual() {
		// TODO Auto-generated method stub
		return new Group();
	}

	@Override
	protected void doRefreshVisual(Group visual) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void doRemoveChildVisual(IVisualPart<? extends Node> child, int index) {
		ObservableList<Node> children = getVisual().getChildren();
		children.remove(index);
	}
	
	@Override
	protected void doRemoveContentChild(Object contentChild) {
		getContent().getDiagramElements().remove(contentChild);
	}
	
	AdapterImpl listener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification notification) {
			refreshVisual();
//			refreshContentChildren();
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

}
