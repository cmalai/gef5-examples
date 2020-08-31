package gef.ecabledesigner.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.geometry.planar.Dimension;
import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;
import org.eclipse.gef.mvc.fx.parts.IResizableContentPart;
import org.eclipse.gef.mvc.fx.parts.ITransformableContentPart;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;

import diagram.ConnectorNode;
import diagram.ConnectorType;
import diagram.ContactNode;
import diagram.Orientation;
import diagram.Position;
import gef.ecabledesigner.visuals.ContactNodeVisual;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Translate;

public class ContactNodePart extends AbstractContentPart<ContactNodeVisual>
//		implements ITransformableContentPart<ContactNodeVisual>, IResizableContentPart<ContactNodeVisual> 
{

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
	protected SetMultimap<? extends Object, String> doGetContentAnchorages() {
		// TODO Auto-generated method stub
		return HashMultimap.create();
	}

	@Override
	protected List<? extends Object> doGetContentChildren() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public ContactNode getContent() {
		// TODO Auto-generated method stub
		return (ContactNode) super.getContent();
	}

	@Override
	protected ContactNodeVisual doCreateVisual() {

		ContactNodeVisual contactNodeVisual = new ContactNodeVisual(getContent());

		return contactNodeVisual;
	}

	@Override
	protected void doRefreshVisual(ContactNodeVisual visual) {

//		Position layout = getContent().getPosition();
//
//		setVisualSize(new Dimension(layout.getW(), layout.getH()));
//
//		EObject container = getContent().eContainer();
//		if (container instanceof ConnectorNode) {
//			ConnectorNode eContainer = (ConnectorNode) container;
//			if (eContainer.getOrientation() == Orientation.EAST) {
//				if (eContainer.getType() == ConnectorType.PLUG) {
//					visual.setTranslateX(40);
//					visual.setTranslateY(20);
//				}
//			} else {
//				if (eContainer.getType() == ConnectorType.PLUG) {
//					visual.setTranslateX(-40);
//					visual.setTranslateY(20);
//				}
//			}
//		}

	}

//	@Override
//	public Affine getContentTransform() {
//		Position bounds = getContent().getPosition();
//		return new Affine(new Translate(bounds.getX(), bounds.getY()));
//	}
//
//	@Override
//	public void setContentTransform(Affine totalTransform) {
//		Position bounds = getContent().getPosition();
//		bounds.setX(totalTransform.getTx());
//		bounds.setY(totalTransform.getTy());
//		getContent().setPosition(bounds);
//	}
//
//	@Override
//	public Dimension getContentSize() {
//		Position bounds = getContent().getPosition();
//		return new Dimension(bounds.getW(), bounds.getH());
//	}
//
//	@Override
//	public void setContentSize(Dimension totalSize) {
//		Position bounds = getContent().getPosition();
//		bounds.setH(totalSize.getHeight());
//		bounds.setW(totalSize.getWidth());
//		getContent().setPosition(bounds);
//	}
//
//	@Override
//	public void setVisualTransform(Affine totalTransform) {
//		// TODO Auto-generated method stub
//		ITransformableContentPart.super.setVisualTransform(totalTransform);
//	}

}
