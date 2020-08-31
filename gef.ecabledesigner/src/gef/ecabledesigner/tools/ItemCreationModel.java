package gef.ecabledesigner.tools;

import org.eclipse.gef.mvc.fx.parts.AbstractContentPart;

import gef.ecabledesigner.parts.ContactNodePart;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class ItemCreationModel {
	public enum Type {
		None, BlackBox, Connector, Connection, Connector_Connection, JunctionNode, ContactNode;
	}

	private ObjectProperty<Type> typeProperty = new SimpleObjectProperty<Type>(Type.None);

	private ObjectProperty<AbstractContentPart> sourceProperty = new SimpleObjectProperty<>();

	public Type getType() {
		return typeProperty.get();
	}

	public void setType(Type type) {
		this.typeProperty.set(type);
	}

	public ObjectProperty<Type> getTypeProperty() {
		return typeProperty;
	}

	public void setSource(AbstractContentPart source) {
		this.sourceProperty.setValue(source);
	}

	public AbstractContentPart getSource() {
		return sourceProperty.getValue();
	}

	public ObjectProperty<AbstractContentPart> getSourceProperty() {
		return sourceProperty;
	}
}
