package gef.ecabledesigner;

import java.util.Collections;

import org.eclipse.gef.mvc.fx.domain.IDomain;
import org.eclipse.gef.mvc.fx.viewer.IViewer;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import diagram.AbstractDiagramElement;
import diagram.BlackBoxNode;
import diagram.CableDiagram;
import diagram.ConnectorNode;
import diagram.ConnectorType;
import diagram.ContactNode;
import diagram.DiagramFactory;
import diagram.Orientation;
import diagram.Position;
import diagram.Wire;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ECableDesignerMain extends Application {

	public void start(final Stage primaryStage) throws Exception {

		Injector injector = Guice.createInjector(createGuiceModule());

		IDomain domain = injector.getInstance(IDomain.class);

		// hook the (single) viewer into the stage
		IViewer viewer = domain.getAdapter(IViewer.class);
		primaryStage.setScene(new Scene(viewer.getCanvas()));

		primaryStage.setResizable(true);
		primaryStage.setWidth(640);
		primaryStage.setHeight(480);
		primaryStage.setTitle("ECable Designed - Minimal Diagram");
		primaryStage.sizeToScene();
		primaryStage.show();

		// activate domain only after viewers have been hooked
		domain.activate();

		// set viewer contents
		viewer.getContents().setAll(Collections.singletonList(ECableDesignerDefaultContentGenerator.createContents()));
	}


	protected Module createGuiceModule() {
		return new ECableDesignerModule();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
