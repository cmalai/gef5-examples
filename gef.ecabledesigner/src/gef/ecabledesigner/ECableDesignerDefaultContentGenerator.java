package gef.ecabledesigner;

import diagram.BlackBoxNode;
import diagram.Cable;
import diagram.CableDiagram;
import diagram.ConnectorNode;
import diagram.ConnectorType;
import diagram.ContactNode;
import diagram.DiagramFactory;
import diagram.Orientation;
import diagram.Position;
import diagram.Wire;

public class ECableDesignerDefaultContentGenerator {
	
	public static CableDiagram createContents() {
		CableDiagram cableDiagram = DiagramFactory.eINSTANCE.createCableDiagram();

		createBlackBox(cableDiagram);
		
		createConnectorNodeWithCable(cableDiagram);

		ConnectorNode connectorNode1 = DiagramFactory.eINSTANCE.createConnectorNode();
		Position position = DiagramFactory.eINSTANCE.createPosition();
		position.setX(180);
		position.setY(125);
		position.setH(40);
		position.setW(40);
		connectorNode1.setOrientation(Orientation.EAST);
		connectorNode1.setType(ConnectorType.PLUG);
		connectorNode1.setPosition(position);
		cableDiagram.getDiagramElements().add(connectorNode1);
		
		ConnectorNode connectorNode = DiagramFactory.eINSTANCE.createConnectorNode();
		position = DiagramFactory.eINSTANCE.createPosition();
		position.setX(460);
		position.setY(125);
		position.setH(40);
		position.setW(40);
		connectorNode.setOrientation(Orientation.WEST);
		connectorNode.setType(ConnectorType.PLUG);
		connectorNode.setPosition(position);
		cableDiagram.getDiagramElements().add(connectorNode);

		ContactNode portNode1 = DiagramFactory.eINSTANCE.createContactNode();
		position = DiagramFactory.eINSTANCE.createPosition();
		position.setX(660);
		position.setY(125);
		position.setH(40);
		position.setW(40);
		portNode1.setPosition(position);
		connectorNode.getContacts().add(portNode1);

		ContactNode portNode2 = DiagramFactory.eINSTANCE.createContactNode();
		position = DiagramFactory.eINSTANCE.createPosition();
		position.setX(480);
		position.setY(125);
		position.setH(40);
		position.setW(40);
		portNode2.setPosition(position);
		connectorNode1.getContacts().add(portNode2);

		ContactNode portNode3 = DiagramFactory.eINSTANCE.createContactNode();
		position = DiagramFactory.eINSTANCE.createPosition();
		position.setX(500);
		position.setY(125);
		position.setH(40);
		position.setW(40);
		portNode3.setPosition(position);
		connectorNode1.getContacts().add(portNode3);

		Wire edge = DiagramFactory.eINSTANCE.createWire();
		portNode3.getWire().add(edge);
		edge.setTarget(portNode3);
		portNode1.getWire().add(edge);
		edge.setSource(portNode1);
		cableDiagram.getDiagramElements().add(edge);

		return cableDiagram;
	}

	private static void createConnectorNodeWithCable(CableDiagram cableDiagram) {
		ConnectorNode connectorNode1 = DiagramFactory.eINSTANCE.createConnectorNode();
		Position position = DiagramFactory.eINSTANCE.createPosition();
		position.setX(180);
		position.setY(225);
		position.setH(40);
		position.setW(40);
		connectorNode1.setOrientation(Orientation.EAST);
		connectorNode1.setType(ConnectorType.PLUG);
		connectorNode1.setPosition(position);
		connectorNode1.setCollapse(true);
		cableDiagram.getDiagramElements().add(connectorNode1);
		
		ConnectorNode connectorNode = DiagramFactory.eINSTANCE.createConnectorNode();
		position = DiagramFactory.eINSTANCE.createPosition();
		position.setX(460);
		position.setY(225);
		position.setH(40);
		position.setW(40);
		connectorNode.setOrientation(Orientation.WEST);
		connectorNode.setType(ConnectorType.PLUG);
		connectorNode.setPosition(position);
		connectorNode.setCollapse(true);
		cableDiagram.getDiagramElements().add(connectorNode);
		
		Cable cable = DiagramFactory.eINSTANCE.createCable();
		cable.setSource(connectorNode);
		cable.setTarget(connectorNode1);
		
		connectorNode.setCable(cable);
		connectorNode1.setCable(cable);
		
		cableDiagram.getDiagramElements().add(cable);
	}

	private static void createBlackBox(CableDiagram cableDiagram) {
		BlackBoxNode bbTelevisionNode = DiagramFactory.eINSTANCE.createBlackBoxNode();
		cableDiagram.getDiagramElements().add(bbTelevisionNode);
		Position rectangle = DiagramFactory.eINSTANCE.createPosition();
		rectangle.setX(30);
		rectangle.setY(105);
		rectangle.setH(80);
		rectangle.setW(150);
		bbTelevisionNode.setPosition(rectangle);
		bbTelevisionNode.setName("Television");

//		BlackBox bbTelevision = EcabledesignerFactory.eINSTANCE.createBlackBox();
//		bbTelevision.setName("Television");
//		bbTelevisionNode.setModelSource(bbTelevision);
		
		ConnectorNode bbConnectorNode = DiagramFactory.eINSTANCE.createConnectorNode();
		Position position = DiagramFactory.eINSTANCE.createPosition();
		position.setX(30);
		position.setY(105);
		position.setH(20);
		position.setW(40);
		bbConnectorNode.setOrientation(Orientation.EAST);
		bbConnectorNode.setType(ConnectorType.RECEPTACLE);
		bbConnectorNode.setPosition(position);
		bbTelevisionNode.getConnectors().add(bbConnectorNode);
		
//		ConnectorNode bbConnector = EcabledesignerFactory.eINSTANCE.createConnector();
//		bbConnector.setConnectorType(ConnectorType.RECEPTACLE);
//		bbConnectorNode.setModelSource(bbConnector);
		
		
//		ContactNode portNode3 = DiagramFactory.eINSTANCE.createContactNode();
//		bbConnectorNode.getContacts().add(portNode3);
//		
//		ContactNode portNode4 = DiagramFactory.eINSTANCE.createContactNode();
//		bbConnectorNode.getContacts().add(portNode4);
		
		
		BlackBoxNode bbDVDPlayerNode = DiagramFactory.eINSTANCE.createBlackBoxNode();
		cableDiagram.getDiagramElements().add(bbDVDPlayerNode);
		rectangle = DiagramFactory.eINSTANCE.createPosition();
		rectangle.setX(460);
		rectangle.setY(105);
		rectangle.setH(80);
		rectangle.setW(150);
		bbDVDPlayerNode.setPosition(rectangle);
		bbDVDPlayerNode.setName("DVD Player");
		
//		BlackBox bbDVDPlayer = EcabledesignerFactory.eINSTANCE.createBlackBox();
//		bbDVDPlayer.setName("DVD Player");
//		bbDVDPlayerNode.setModelSource(bbDVDPlayer);
	}

}
