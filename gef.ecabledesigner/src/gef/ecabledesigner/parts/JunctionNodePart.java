package gef.ecabledesigner.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.geometry.planar.Dimension;
import org.eclipse.gef.geometry.planar.Point;
import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;
import org.eclipse.gef.mvc.fx.parts.IResizableContentPart;
import org.eclipse.gef.mvc.fx.parts.ITransformableContentPart;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;

import diagram.JunctionNode;
import diagram.Position;
import gef.ecabledesigner.visuals.JunctionNodeVisual;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Translate;

public class JunctionNodePart extends AbstractContentPart<JunctionNodeVisual>
		implements ITransformableContentPart<JunctionNodeVisual>, IResizableContentPart<JunctionNodeVisual> {

	@Override
	protected SetMultimap<? extends Object, String> doGetContentAnchorages() {
		return HashMultimap.create();
	}

	@Override
	protected List<? extends Object> doGetContentChildren() {
		return Collections.emptyList();
	}

	@Override
	public JunctionNode getContent() {
		return (JunctionNode) super.getContent();
	}

	@Override
	protected JunctionNodeVisual doCreateVisual() {

		JunctionNodeVisual group = new JunctionNodeVisual(getContent());

		return group;
	}

	@Override
	protected void doRefreshVisual(JunctionNodeVisual visual) {
		Position layout = getContent().getPosition();

		setVisualSize(new Dimension(layout.getW(), layout.getH()));
	}

	@Override
	public Affine getContentTransform() {
		Position bounds = getContent().getPosition();
		return new Affine(new Translate(bounds.getX(), bounds.getY()));
	}

	@Override
	public void setContentTransform(Affine totalTransform) {
		Position bounds = getContent().getPosition();
		bounds.setX(totalTransform.getTx());
		bounds.setY(totalTransform.getTy());
		getContent().setPosition(bounds);
	}

	@Override
	public Dimension getContentSize() {
		Position bounds = getContent().getPosition();
		return new Dimension(bounds.getW(), bounds.getH());
	}

	@Override
	public void setContentSize(Dimension totalSize) {
		Position bounds = getContent().getPosition();
		bounds.setH(totalSize.getHeight());
		bounds.setW(totalSize.getWidth());
		getContent().setPosition(bounds);
	}
	
	
	@Override
	public void setVisualTransform(Affine totalTransform) {
		// TODO Auto-generated method stub
		ITransformableContentPart.super.setVisualTransform(totalTransform);
	}


}
