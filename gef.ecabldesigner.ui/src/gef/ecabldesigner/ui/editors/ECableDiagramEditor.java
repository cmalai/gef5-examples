package gef.ecabldesigner.ui.editors;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gef.mvc.fx.ui.MvcFxUiModule;
import org.eclipse.gef.mvc.fx.ui.parts.AbstractFXEditor;
import org.eclipse.gef.mvc.fx.viewer.IViewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;

import com.google.inject.Guice;
import com.google.inject.util.Modules;

import diagram.DiagramPackage;
import gef.ecabledesigner.ECableDesignerModule;
import gef.ecabledesigner.tools.ItemCreationModel;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class ECableDiagramEditor extends AbstractFXEditor {

	public ECableDiagramEditor() {
		super(Guice.createInjector(Modules.override(new ECableDesignerModule()).with(new MvcFxUiModule())));
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		try {
			emfResource.save(null);
			markNonDirty();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		// TODO Auto-generated method stub
		super.init(site, input);

		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(DiagramPackage.eNS_URI, DiagramPackage.eINSTANCE);

		IFile file = ((IFileEditorInput) input).getFile();

		emfResource = resourceSet.getResource(URI.createFileURI(file.getFullPath().toOSString()), true);
		getContentViewer().getContents().setAll(Collections.singletonList(emfResource.getContents().get(0)));

//		getContentViewer().getContents()
//				.setAll(Collections.singletonList(ECableDesignerDefaultContentGenerator.createContents()));
	}

	private static final Image BLACKBOX_CREATION_ICON = new Image(
			ECableDiagramEditor.class.getClassLoader().getResourceAsStream("icon/new_entity.gif"));
	private static final Image CONNECTOR_CREATION_ICON = new Image(
			ECableDiagramEditor.class.getClassLoader().getResourceAsStream("icon/new_connector.gif"));
	private static final Image CONNECTION_CREATION_ICON = new Image(
			ECableDiagramEditor.class.getClassLoader().getResourceAsStream("icon/new_relationship.gif"));
	private Resource emfResource;

	private Node createToolPalette() {
		ItemCreationModel creationModel = getContentViewer().getAdapter(ItemCreationModel.class);
		ToggleGroup toggleGroup = new ToggleGroup();
		ImageView imageView = new ImageView(BLACKBOX_CREATION_ICON);
		ToggleButton createBlackBox = new ToggleButton("New BlackBox", imageView);
		createBlackBox.setFocusTraversable(false);
		createBlackBox.setToggleGroup(toggleGroup);
		createBlackBox.selectedProperty().addListener((e, oldValue, newValue) -> creationModel.setType(
				newValue ? ItemCreationModel.Type.BlackBox : gef.ecabledesigner.tools.ItemCreationModel.Type.None));

		imageView = new ImageView(CONNECTOR_CREATION_ICON);
		ToggleButton createConnector = new ToggleButton("New Connector", imageView);
		createConnector.setFocusTraversable(false);
		createConnector.setToggleGroup(toggleGroup);
		createConnector.selectedProperty().addListener((e, oldValue, newValue) -> creationModel.setType(
				newValue ? ItemCreationModel.Type.Connector : gef.ecabledesigner.tools.ItemCreationModel.Type.None));

		imageView = new ImageView(CONNECTION_CREATION_ICON);
		ToggleButton createConn = new ToggleButton("New Connection", imageView);
		createConn.setToggleGroup(toggleGroup);
		createConn.selectedProperty().addListener((e, oldValue, newValue) -> creationModel
				.setType(newValue ? ItemCreationModel.Type.Connection : ItemCreationModel.Type.None));
		createConn.setFocusTraversable(false);
		
		ToggleButton createJunctionNode = new ToggleButton("New Junction Node", null);
		createJunctionNode.setToggleGroup(toggleGroup);
		createJunctionNode.selectedProperty().addListener((e, oldValue, newValue) -> creationModel
				.setType(newValue ? ItemCreationModel.Type.JunctionNode : ItemCreationModel.Type.None));
		createJunctionNode.setFocusTraversable(false);
		
		ToggleButton createContactNode = new ToggleButton("New Contact Node", null);
		createContactNode.setToggleGroup(toggleGroup);
		createContactNode.selectedProperty().addListener((e, oldValue, newValue) -> creationModel
				.setType(newValue ? ItemCreationModel.Type.ContactNode : ItemCreationModel.Type.None));
		createContactNode.setFocusTraversable(false);


		creationModel.getTypeProperty().addListener((e, oldValue, newValue) -> {
			if (oldValue == newValue) {
				return;
			}
			switch (newValue) {
			case Connector:
			case BlackBox:
			case Connection:
			case JunctionNode:
			case ContactNode:
				break;
			case None:
			default:
				Toggle selectedToggle = toggleGroup.getSelectedToggle();
				if (selectedToggle != null) {
					selectedToggle.setSelected(false);
				}
			}
		});

		return new VBox(1, createBlackBox, createConnector, createConn, createContactNode, createJunctionNode);
	}

	@Override
	protected void hookViewers() {
		final IViewer contentViewer = getContentViewer();

		// creating parent pane for viewer canvas and palette
		HBox pane = new HBox();

		pane.getChildren().add(contentViewer.getCanvas());
		pane.getChildren().add(createToolPalette());
		HBox.setHgrow(contentViewer.getCanvas(), Priority.ALWAYS);

		Scene scene = new Scene(pane);
		getCanvas().setScene(scene);
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

}
