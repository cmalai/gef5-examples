package gef.ecabledesigner;

import org.eclipse.gef.common.adapt.AdapterKey;
import org.eclipse.gef.common.adapt.inject.AdapterMaps;
import org.eclipse.gef.mvc.fx.MvcFxModule;
import org.eclipse.gef.mvc.fx.behaviors.HoverIntentBehavior;
import org.eclipse.gef.mvc.fx.behaviors.SelectionBehavior;
import org.eclipse.gef.mvc.fx.handlers.FocusAndSelectOnClickHandler;
import org.eclipse.gef.mvc.fx.handlers.HoverOnHoverHandler;
import org.eclipse.gef.mvc.fx.handlers.ResizeTranslateFirstAnchorageOnHandleDragHandler;
import org.eclipse.gef.mvc.fx.handlers.TranslateSelectedOnDragHandler;
import org.eclipse.gef.mvc.fx.parts.DefaultHoverFeedbackPartFactory;
import org.eclipse.gef.mvc.fx.parts.DefaultSelectionFeedbackPartFactory;
import org.eclipse.gef.mvc.fx.parts.DefaultSelectionHandlePartFactory;
import org.eclipse.gef.mvc.fx.parts.SquareSegmentHandlePart;
import org.eclipse.gef.mvc.fx.policies.ResizePolicy;
import org.eclipse.gef.mvc.fx.policies.TransformPolicy;
import org.eclipse.gef.mvc.fx.providers.ShapeBoundsProvider;
import org.eclipse.gef.mvc.fx.providers.ShapeOutlineProvider;

import com.google.inject.multibindings.MapBinder;

import gef.ecabledesigner.behaviour.CreateFeedbackBehavior;
import gef.ecabledesigner.feedback.ECableDesignerFeedbackPartFactory;
import gef.ecabledesigner.handlers.BlackBoxNodeHoverIntentHandlePartFactory;
import gef.ecabledesigner.handlers.CreateNewBlackBoxChildrenOnClickHandler;
import gef.ecabledesigner.handlers.CreateNewConnectionClickHandler;
import gef.ecabledesigner.handlers.CreateNewDiagramChildrenOnClickHandler;
import gef.ecabledesigner.handlers.DeleteECableDiagramNodeHandlePart;
import gef.ecabledesigner.handlers.DeleteNodeOnHandleClickHandler;
import gef.ecabledesigner.parts.BlackBoxNodePart;
import gef.ecabledesigner.parts.ConnectorNodePart_Old;
import gef.ecabledesigner.parts.ContactNodePart;
import gef.ecabledesigner.parts.JunctionNodePart;
import gef.ecabledesigner.parts.ModelPartFactory;
import gef.ecabledesigner.parts.SimplePortNodeAnchorProvider;
import gef.ecabledesigner.policies.ConnectorNodeTransformPolicy;
import gef.ecabledesigner.policies.DeletionPolicyEx;

/**
 * The Guice Module to configure our parts and behaviors.
 *
 */
public class ECableDesignerModule extends MvcFxModule {

	@Override
	protected void bindAbstractContentPartAdapters(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
		super.bindAbstractContentPartAdapters(adapterMapBinder);

		// binding the HoverOnHoverPolicy to every part
		// if a mouse is moving above a part it is set i the HoverModel
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(HoverOnHoverHandler.class);

		// add the focus and select policy to every part, listening to clicks
		// and changing the focus and selection model
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(FocusAndSelectOnClickHandler.class);
	}

	

	@Override
	protected void bindIContentPartFactoryAsContentViewerAdapter(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
		// bind MindMapPartsFactory adapter to the content viewer
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ModelPartFactory.class);
	}
	
	@Override
	protected void bindHoverHandlePartFactoryAsContentViewerAdapter(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
		adapterMapBinder.addBinding(AdapterKey.role(HoverIntentBehavior.HOVER_INTENT_HANDLE_PART_FACTORY))
				.to(BlackBoxNodeHoverIntentHandlePartFactory.class);
	}


	/**
	 *
	 * @param adapterMapBinder
	 */
	protected void bindBlackBoxNodePartAdapters(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
//		// bind anchor provider used to create the connection anchors
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(SimplePortNodeAnchorProvider.class);

		// bind a geometry provider, which is used in our anchor provider
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ShapeOutlineProvider.class);

		// provides a hover feedback to the shape, used by the HoverBehavior
		AdapterKey<?> role = AdapterKey.role(DefaultHoverFeedbackPartFactory.HOVER_FEEDBACK_GEOMETRY_PROVIDER);
		adapterMapBinder.addBinding(role).to(ShapeOutlineProvider.class);

		// provides a selection feedback to the shape
		role = AdapterKey.role(DefaultSelectionFeedbackPartFactory.SELECTION_FEEDBACK_GEOMETRY_PROVIDER);
		adapterMapBinder.addBinding(role).to(ShapeBoundsProvider.class);

		// support moving nodes via mouse drag
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(TransformPolicy.class);
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(TranslateSelectedOnDragHandler.class);

		// specify the factory to create the geometry object for the selection
		// handles
		role = AdapterKey.role(DefaultSelectionHandlePartFactory.SELECTION_HANDLES_GEOMETRY_PROVIDER);
		adapterMapBinder.addBinding(role).to(ShapeBoundsProvider.class);

		// support resizing nodes
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ResizePolicy.class);

//		// support creation of connections
//		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateNewConnectionClickHandler.class);
		
		//Node Creation
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateNewBlackBoxChildrenOnClickHandler.class);
//
//		// bind the context menu policy to the part
//		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ShowMindMapNodeContextMenuOnClickHandler.class);
	}
	
	protected void bindConnectorNodePartAdapters(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
//		// bind anchor provider used to create the connection anchors
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(SimplePortNodeAnchorProvider.class);

		// bind a geometry provider, which is used in our anchor provider
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ShapeOutlineProvider.class);

		// provides a hover feedback to the shape, used by the HoverBehavior
		AdapterKey<?> role = AdapterKey.role(DefaultHoverFeedbackPartFactory.HOVER_FEEDBACK_GEOMETRY_PROVIDER);
		adapterMapBinder.addBinding(role).to(ShapeOutlineProvider.class);

		// provides a selection feedback to the shape
		role = AdapterKey.role(DefaultSelectionFeedbackPartFactory.SELECTION_FEEDBACK_GEOMETRY_PROVIDER);
		adapterMapBinder.addBinding(role).to(ShapeBoundsProvider.class);

		// support moving nodes via mouse drag
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ConnectorNodeTransformPolicy.class);
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(TranslateSelectedOnDragHandler.class);

//		// specify the factory to create the geometry object for the selection
//		// handles
//		role = AdapterKey.role(DefaultSelectionHandlePartFactory.SELECTION_HANDLES_GEOMETRY_PROVIDER);
//		adapterMapBinder.addBinding(role).to(ShapeBoundsProvider.class);

		// support resizing nodes
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ResizePolicy.class);
		
		//Node Creation
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateNewDiagramChildrenOnClickHandler.class);
//
//		// bind the context menu policy to the part
//		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ShowMindMapNodeContextMenuOnClickHandler.class);
	}

	@Override
	protected void bindSelectionHandlePartFactoryAsContentViewerAdapter(
			MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
		adapterMapBinder.addBinding(AdapterKey.role(SelectionBehavior.SELECTION_HANDLE_PART_FACTORY))
				.to(DefaultSelectionHandlePartFactory.class);
	}
	
	@Override
	protected void bindIViewerAdaptersForContentViewer(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
		// TODO Auto-generated method stub
		super.bindIViewerAdaptersForContentViewer(adapterMapBinder);
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(gef.ecabledesigner.tools.ItemCreationModel.class);
		adapterMapBinder.addBinding(AdapterKey.role(CreateFeedbackBehavior.CREATE_FEEDBACK_PART_FACTORY))
		.to(ECableDesignerFeedbackPartFactory.class);
	}
	
	

	/**
	 * Binds the parts of the selection handles (the squares in the corner) to
	 * policies
	 *
	 * @param adapterMapBinder
	 */
	protected void bindSquareSegmentHandlePartPartAdapter(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
		adapterMapBinder.addBinding(AdapterKey.defaultRole())
				.to(ResizeTranslateFirstAnchorageOnHandleDragHandler.class);
	}
	
	@Override
	protected void bindIRootPartAdaptersForContentViewer(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
		// TODO Auto-generated method stub
		super.bindIRootPartAdaptersForContentViewer(adapterMapBinder);
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateNewDiagramChildrenOnClickHandler.class);
		// adding the creation feedback behavior
//		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateFeedbackBehavior.class);
	}
	
	private void bindContactNodePartAdapters(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
//		// bind anchor provider used to create the connection anchors
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(SimplePortNodeAnchorProvider.class);

		// bind a geometry provider, which is used in our anchor provider
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ShapeOutlineProvider.class);

		// provides a hover feedback to the shape, used by the HoverBehavior
		AdapterKey<?> role = AdapterKey.role(DefaultHoverFeedbackPartFactory.HOVER_FEEDBACK_GEOMETRY_PROVIDER);
		adapterMapBinder.addBinding(role).to(ShapeOutlineProvider.class);

		// provides a selection feedback to the shape
		role = AdapterKey.role(DefaultSelectionFeedbackPartFactory.SELECTION_FEEDBACK_GEOMETRY_PROVIDER);
		adapterMapBinder.addBinding(role).to(ShapeBoundsProvider.class);

		// support moving nodes via mouse drag
//		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(TransformPolicy.class);
//		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(TranslateSelectedOnDragHandler.class);

		// specify the factory to create the geometry object for the selection
		// handles
//		role = AdapterKey.role(DefaultSelectionHandlePartFactory.SELECTION_HANDLES_GEOMETRY_PROVIDER);
//		adapterMapBinder.addBinding(role).to(ShapeBoundsProvider.class);

//		// support creation of connections
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateNewConnectionClickHandler.class);
		
		//
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateFeedbackBehavior.class);
		
		//Node Creation
//		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateNewDiagramChildrenOnClickHandler.class);
//
//		// bind the context menu policy to the part
//		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ShowMindMapNodeContextMenuOnClickHandler.class);
	}
	
	private void bindJunctionNodePartAdapters(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
//		// bind anchor provider used to create the connection anchors
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(SimplePortNodeAnchorProvider.class);

		// bind a geometry provider, which is used in our anchor provider
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ShapeOutlineProvider.class);

		// provides a hover feedback to the shape, used by the HoverBehavior
		AdapterKey<?> role = AdapterKey.role(DefaultHoverFeedbackPartFactory.HOVER_FEEDBACK_GEOMETRY_PROVIDER);
		adapterMapBinder.addBinding(role).to(ShapeOutlineProvider.class);

		// provides a selection feedback to the shape
		role = AdapterKey.role(DefaultSelectionFeedbackPartFactory.SELECTION_FEEDBACK_GEOMETRY_PROVIDER);
		adapterMapBinder.addBinding(role).to(ShapeBoundsProvider.class);

		// support moving nodes via mouse drag
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(TransformPolicy.class);
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(TranslateSelectedOnDragHandler.class);

		// specify the factory to create the geometry object for the selection
		// handles
		role = AdapterKey.role(DefaultSelectionHandlePartFactory.SELECTION_HANDLES_GEOMETRY_PROVIDER);
		adapterMapBinder.addBinding(role).to(ShapeBoundsProvider.class);

//		// support creation of connections
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateNewConnectionClickHandler.class);
		
		//Node Creation
//		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateNewDiagramChildrenOnClickHandler.class);
		
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(CreateFeedbackBehavior.class);
//
//		// bind the context menu policy to the part
//		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(ShowMindMapNodeContextMenuOnClickHandler.class);
	}
	
	protected void bindDeleteMindMapNodeHandlePartAdapters(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(DeleteNodeOnHandleClickHandler.class);
	}
	
	@Override
	protected void bindDeletionPolicyAsIRootPartAdapter(MapBinder<AdapterKey<?>, Object> adapterMapBinder) {
		adapterMapBinder.addBinding(AdapterKey.defaultRole()).to(DeletionPolicyEx.class);
	}

	@Override
	protected void configure() {
		// start the default configuration
		super.configure();

		bindBlackBoxNodePartAdapters(AdapterMaps.getAdapterMapBinder(binder(), BlackBoxNodePart.class));
		bindConnectorNodePartAdapters(AdapterMaps.getAdapterMapBinder(binder(), ConnectorNodePart_Old.class));
		bindContactNodePartAdapters(AdapterMaps.getAdapterMapBinder(binder(), ContactNodePart.class));
		bindJunctionNodePartAdapters(AdapterMaps.getAdapterMapBinder(binder(), JunctionNodePart.class));

		
		// with this binding we create the handles
		bindSquareSegmentHandlePartPartAdapter(
				AdapterMaps.getAdapterMapBinder(binder(), SquareSegmentHandlePart.class));
		bindDeleteMindMapNodeHandlePartAdapters(
				AdapterMaps.getAdapterMapBinder(binder(), DeleteECableDiagramNodeHandlePart.class));
	}




}