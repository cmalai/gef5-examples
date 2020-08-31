/**
 */
package diagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see diagram.DiagramFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kronotek.com/ecad/diagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramPackage eINSTANCE = diagram.impl.DiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagram.impl.CableDiagramImpl <em>Cable Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.CableDiagramImpl
	 * @see diagram.impl.DiagramPackageImpl#getCableDiagram()
	 * @generated
	 */
	int CABLE_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Diagram Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_DIAGRAM__DIAGRAM_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Cable Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cable Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagram.impl.AbstractDiagramElementImpl <em>Abstract Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.AbstractDiagramElementImpl
	 * @see diagram.impl.DiagramPackageImpl#getAbstractDiagramElement()
	 * @generated
	 */
	int ABSTRACT_DIAGRAM_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIAGRAM_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIAGRAM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagram.impl.AbstractNodeElementImpl <em>Abstract Node Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.AbstractNodeElementImpl
	 * @see diagram.impl.DiagramPackageImpl#getAbstractNodeElement()
	 * @generated
	 */
	int ABSTRACT_NODE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_ELEMENT__NAME = ABSTRACT_DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_ELEMENT__POSITION = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Node Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_ELEMENT_FEATURE_COUNT = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Node Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_ELEMENT_OPERATION_COUNT = ABSTRACT_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagram.impl.BlackBoxNodeImpl <em>Black Box Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.BlackBoxNodeImpl
	 * @see diagram.impl.DiagramPackageImpl#getBlackBoxNode()
	 * @generated
	 */
	int BLACK_BOX_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_BOX_NODE__NAME = ABSTRACT_NODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_BOX_NODE__POSITION = ABSTRACT_NODE_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_BOX_NODE__CONNECTORS = ABSTRACT_NODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Black Box Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_BOX_NODE_FEATURE_COUNT = ABSTRACT_NODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Black Box Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_BOX_NODE_OPERATION_COUNT = ABSTRACT_NODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagram.impl.ConnectorNodeImpl <em>Connector Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.ConnectorNodeImpl
	 * @see diagram.impl.DiagramPackageImpl#getConnectorNode()
	 * @generated
	 */
	int CONNECTOR_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_NODE__NAME = ABSTRACT_NODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_NODE__POSITION = ABSTRACT_NODE_ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_NODE__WIRE = ABSTRACT_NODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_NODE__CABLE = ABSTRACT_NODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_NODE__CONTACTS = ABSTRACT_NODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_NODE__TYPE = ABSTRACT_NODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_NODE__ORIENTATION = ABSTRACT_NODE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Collapse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_NODE__COLLAPSE = ABSTRACT_NODE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connector Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_NODE_FEATURE_COUNT = ABSTRACT_NODE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Connector Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_NODE_OPERATION_COUNT = ABSTRACT_NODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagram.impl.ContactNodeImpl <em>Contact Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.ContactNodeImpl
	 * @see diagram.impl.DiagramPackageImpl#getContactNode()
	 * @generated
	 */
	int CONTACT_NODE = 4;

	/**
	 * The meta object id for the '{@link diagram.impl.WireImpl <em>Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.WireImpl
	 * @see diagram.impl.DiagramPackageImpl#getWire()
	 * @generated
	 */
	int WIRE = 5;

	/**
	 * The meta object id for the '{@link diagram.impl.CableImpl <em>Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.CableImpl
	 * @see diagram.impl.DiagramPackageImpl#getCable()
	 * @generated
	 */
	int CABLE = 6;

	/**
	 * The meta object id for the '{@link diagram.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.PositionImpl
	 * @see diagram.impl.DiagramPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 8;

	/**
	 * The meta object id for the '{@link diagram.impl.ConnectableImpl <em>Connectable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.ConnectableImpl
	 * @see diagram.impl.DiagramPackageImpl#getConnectable()
	 * @generated
	 */
	int CONNECTABLE = 10;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE__WIRE = 0;

	/**
	 * The number of structural features of the '<em>Connectable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connectable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTABLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_NODE__WIRE = CONNECTABLE__WIRE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_NODE__NAME = CONNECTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_NODE__POSITION = CONNECTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_NODE__TYPE = CONNECTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contact Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_NODE_FEATURE_COUNT = CONNECTABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Contact Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_NODE_OPERATION_COUNT = CONNECTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__NAME = ABSTRACT_DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__COLOR = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__STYLE = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Way Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__WAY_POINTS = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__SOURCE = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__TARGET = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FEATURE_COUNT = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_OPERATION_COUNT = ABSTRACT_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__NAME = ABSTRACT_DIAGRAM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__COLOR = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__STYLE = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Way Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__WAY_POINTS = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__SOURCE = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__TARGET = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_FEATURE_COUNT = ABSTRACT_DIAGRAM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_OPERATION_COUNT = ABSTRACT_DIAGRAM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__W = 2;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__H = 3;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagram.impl.JunctionNodeImpl <em>Junction Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.JunctionNodeImpl
	 * @see diagram.impl.DiagramPackageImpl#getJunctionNode()
	 * @generated
	 */
	int JUNCTION_NODE = 9;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__WIRE = CONNECTABLE__WIRE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__NAME = CONNECTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE__POSITION = CONNECTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Junction Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE_FEATURE_COUNT = CONNECTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Junction Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_NODE_OPERATION_COUNT = CONNECTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diagram.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.EdgeImpl
	 * @see diagram.impl.DiagramPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 11;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__STYLE = 1;

	/**
	 * The feature id for the '<em><b>Way Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WAY_POINTS = 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagram.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.impl.PointImpl
	 * @see diagram.impl.DiagramPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diagram.ConnectorType <em>Connector Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.ConnectorType
	 * @see diagram.impl.DiagramPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 13;

	/**
	 * The meta object id for the '{@link diagram.ContactType <em>Contact Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.ContactType
	 * @see diagram.impl.DiagramPackageImpl#getContactType()
	 * @generated
	 */
	int CONTACT_TYPE = 14;


	/**
	 * The meta object id for the '{@link diagram.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.Orientation
	 * @see diagram.impl.DiagramPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 15;


	/**
	 * The meta object id for the '{@link diagram.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagram.Color
	 * @see diagram.impl.DiagramPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 16;


	/**
	 * Returns the meta object for class '{@link diagram.CableDiagram <em>Cable Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable Diagram</em>'.
	 * @see diagram.CableDiagram
	 * @generated
	 */
	EClass getCableDiagram();

	/**
	 * Returns the meta object for the attribute '{@link diagram.CableDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diagram.CableDiagram#getName()
	 * @see #getCableDiagram()
	 * @generated
	 */
	EAttribute getCableDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link diagram.CableDiagram#getDiagramElements <em>Diagram Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Elements</em>'.
	 * @see diagram.CableDiagram#getDiagramElements()
	 * @see #getCableDiagram()
	 * @generated
	 */
	EReference getCableDiagram_DiagramElements();

	/**
	 * Returns the meta object for class '{@link diagram.AbstractDiagramElement <em>Abstract Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Diagram Element</em>'.
	 * @see diagram.AbstractDiagramElement
	 * @generated
	 */
	EClass getAbstractDiagramElement();

	/**
	 * Returns the meta object for the attribute '{@link diagram.AbstractDiagramElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diagram.AbstractDiagramElement#getName()
	 * @see #getAbstractDiagramElement()
	 * @generated
	 */
	EAttribute getAbstractDiagramElement_Name();

	/**
	 * Returns the meta object for class '{@link diagram.BlackBoxNode <em>Black Box Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Black Box Node</em>'.
	 * @see diagram.BlackBoxNode
	 * @generated
	 */
	EClass getBlackBoxNode();

	/**
	 * Returns the meta object for the containment reference list '{@link diagram.BlackBoxNode#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see diagram.BlackBoxNode#getConnectors()
	 * @see #getBlackBoxNode()
	 * @generated
	 */
	EReference getBlackBoxNode_Connectors();

	/**
	 * Returns the meta object for class '{@link diagram.ConnectorNode <em>Connector Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Node</em>'.
	 * @see diagram.ConnectorNode
	 * @generated
	 */
	EClass getConnectorNode();

	/**
	 * Returns the meta object for the reference '{@link diagram.ConnectorNode#getCable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cable</em>'.
	 * @see diagram.ConnectorNode#getCable()
	 * @see #getConnectorNode()
	 * @generated
	 */
	EReference getConnectorNode_Cable();

	/**
	 * Returns the meta object for the containment reference list '{@link diagram.ConnectorNode#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contacts</em>'.
	 * @see diagram.ConnectorNode#getContacts()
	 * @see #getConnectorNode()
	 * @generated
	 */
	EReference getConnectorNode_Contacts();

	/**
	 * Returns the meta object for the attribute '{@link diagram.ConnectorNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see diagram.ConnectorNode#getType()
	 * @see #getConnectorNode()
	 * @generated
	 */
	EAttribute getConnectorNode_Type();

	/**
	 * Returns the meta object for the attribute '{@link diagram.ConnectorNode#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see diagram.ConnectorNode#getOrientation()
	 * @see #getConnectorNode()
	 * @generated
	 */
	EAttribute getConnectorNode_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link diagram.ConnectorNode#isCollapse <em>Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapse</em>'.
	 * @see diagram.ConnectorNode#isCollapse()
	 * @see #getConnectorNode()
	 * @generated
	 */
	EAttribute getConnectorNode_Collapse();

	/**
	 * Returns the meta object for class '{@link diagram.ContactNode <em>Contact Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Node</em>'.
	 * @see diagram.ContactNode
	 * @generated
	 */
	EClass getContactNode();

	/**
	 * Returns the meta object for the attribute '{@link diagram.ContactNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see diagram.ContactNode#getType()
	 * @see #getContactNode()
	 * @generated
	 */
	EAttribute getContactNode_Type();

	/**
	 * Returns the meta object for class '{@link diagram.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire</em>'.
	 * @see diagram.Wire
	 * @generated
	 */
	EClass getWire();

	/**
	 * Returns the meta object for the reference '{@link diagram.Wire#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see diagram.Wire#getSource()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Source();

	/**
	 * Returns the meta object for the reference '{@link diagram.Wire#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see diagram.Wire#getTarget()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Target();

	/**
	 * Returns the meta object for class '{@link diagram.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable</em>'.
	 * @see diagram.Cable
	 * @generated
	 */
	EClass getCable();

	/**
	 * Returns the meta object for the reference '{@link diagram.Cable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see diagram.Cable#getSource()
	 * @see #getCable()
	 * @generated
	 */
	EReference getCable_Source();

	/**
	 * Returns the meta object for the reference '{@link diagram.Cable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see diagram.Cable#getTarget()
	 * @see #getCable()
	 * @generated
	 */
	EReference getCable_Target();

	/**
	 * Returns the meta object for class '{@link diagram.AbstractNodeElement <em>Abstract Node Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node Element</em>'.
	 * @see diagram.AbstractNodeElement
	 * @generated
	 */
	EClass getAbstractNodeElement();

	/**
	 * Returns the meta object for the containment reference '{@link diagram.AbstractNodeElement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see diagram.AbstractNodeElement#getPosition()
	 * @see #getAbstractNodeElement()
	 * @generated
	 */
	EReference getAbstractNodeElement_Position();

	/**
	 * Returns the meta object for class '{@link diagram.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see diagram.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link diagram.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see diagram.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link diagram.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see diagram.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for the attribute '{@link diagram.Position#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see diagram.Position#getW()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_W();

	/**
	 * Returns the meta object for the attribute '{@link diagram.Position#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see diagram.Position#getH()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_H();

	/**
	 * Returns the meta object for class '{@link diagram.JunctionNode <em>Junction Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction Node</em>'.
	 * @see diagram.JunctionNode
	 * @generated
	 */
	EClass getJunctionNode();

	/**
	 * Returns the meta object for class '{@link diagram.Connectable <em>Connectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectable</em>'.
	 * @see diagram.Connectable
	 * @generated
	 */
	EClass getConnectable();

	/**
	 * Returns the meta object for the reference list '{@link diagram.Connectable#getWire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wire</em>'.
	 * @see diagram.Connectable#getWire()
	 * @see #getConnectable()
	 * @generated
	 */
	EReference getConnectable_Wire();

	/**
	 * Returns the meta object for class '{@link diagram.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see diagram.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link diagram.Edge#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see diagram.Edge#getColor()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Color();

	/**
	 * Returns the meta object for the attribute '{@link diagram.Edge#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see diagram.Edge#getStyle()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link diagram.Edge#getWayPoints <em>Way Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Way Points</em>'.
	 * @see diagram.Edge#getWayPoints()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_WayPoints();

	/**
	 * Returns the meta object for class '{@link diagram.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see diagram.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link diagram.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see diagram.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link diagram.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see diagram.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for enum '{@link diagram.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connector Type</em>'.
	 * @see diagram.ConnectorType
	 * @generated
	 */
	EEnum getConnectorType();

	/**
	 * Returns the meta object for enum '{@link diagram.ContactType <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Type</em>'.
	 * @see diagram.ContactType
	 * @generated
	 */
	EEnum getContactType();

	/**
	 * Returns the meta object for enum '{@link diagram.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see diagram.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '{@link diagram.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see diagram.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramFactory getDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link diagram.impl.CableDiagramImpl <em>Cable Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.CableDiagramImpl
		 * @see diagram.impl.DiagramPackageImpl#getCableDiagram()
		 * @generated
		 */
		EClass CABLE_DIAGRAM = eINSTANCE.getCableDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE_DIAGRAM__NAME = eINSTANCE.getCableDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Diagram Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABLE_DIAGRAM__DIAGRAM_ELEMENTS = eINSTANCE.getCableDiagram_DiagramElements();

		/**
		 * The meta object literal for the '{@link diagram.impl.AbstractDiagramElementImpl <em>Abstract Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.AbstractDiagramElementImpl
		 * @see diagram.impl.DiagramPackageImpl#getAbstractDiagramElement()
		 * @generated
		 */
		EClass ABSTRACT_DIAGRAM_ELEMENT = eINSTANCE.getAbstractDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DIAGRAM_ELEMENT__NAME = eINSTANCE.getAbstractDiagramElement_Name();

		/**
		 * The meta object literal for the '{@link diagram.impl.BlackBoxNodeImpl <em>Black Box Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.BlackBoxNodeImpl
		 * @see diagram.impl.DiagramPackageImpl#getBlackBoxNode()
		 * @generated
		 */
		EClass BLACK_BOX_NODE = eINSTANCE.getBlackBoxNode();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLACK_BOX_NODE__CONNECTORS = eINSTANCE.getBlackBoxNode_Connectors();

		/**
		 * The meta object literal for the '{@link diagram.impl.ConnectorNodeImpl <em>Connector Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.ConnectorNodeImpl
		 * @see diagram.impl.DiagramPackageImpl#getConnectorNode()
		 * @generated
		 */
		EClass CONNECTOR_NODE = eINSTANCE.getConnectorNode();

		/**
		 * The meta object literal for the '<em><b>Cable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_NODE__CABLE = eINSTANCE.getConnectorNode_Cable();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_NODE__CONTACTS = eINSTANCE.getConnectorNode_Contacts();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_NODE__TYPE = eINSTANCE.getConnectorNode_Type();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_NODE__ORIENTATION = eINSTANCE.getConnectorNode_Orientation();

		/**
		 * The meta object literal for the '<em><b>Collapse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_NODE__COLLAPSE = eINSTANCE.getConnectorNode_Collapse();

		/**
		 * The meta object literal for the '{@link diagram.impl.ContactNodeImpl <em>Contact Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.ContactNodeImpl
		 * @see diagram.impl.DiagramPackageImpl#getContactNode()
		 * @generated
		 */
		EClass CONTACT_NODE = eINSTANCE.getContactNode();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_NODE__TYPE = eINSTANCE.getContactNode_Type();

		/**
		 * The meta object literal for the '{@link diagram.impl.WireImpl <em>Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.WireImpl
		 * @see diagram.impl.DiagramPackageImpl#getWire()
		 * @generated
		 */
		EClass WIRE = eINSTANCE.getWire();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__SOURCE = eINSTANCE.getWire_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__TARGET = eINSTANCE.getWire_Target();

		/**
		 * The meta object literal for the '{@link diagram.impl.CableImpl <em>Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.CableImpl
		 * @see diagram.impl.DiagramPackageImpl#getCable()
		 * @generated
		 */
		EClass CABLE = eINSTANCE.getCable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABLE__SOURCE = eINSTANCE.getCable_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABLE__TARGET = eINSTANCE.getCable_Target();

		/**
		 * The meta object literal for the '{@link diagram.impl.AbstractNodeElementImpl <em>Abstract Node Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.AbstractNodeElementImpl
		 * @see diagram.impl.DiagramPackageImpl#getAbstractNodeElement()
		 * @generated
		 */
		EClass ABSTRACT_NODE_ELEMENT = eINSTANCE.getAbstractNodeElement();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE_ELEMENT__POSITION = eINSTANCE.getAbstractNodeElement_Position();

		/**
		 * The meta object literal for the '{@link diagram.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.PositionImpl
		 * @see diagram.impl.DiagramPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__W = eINSTANCE.getPosition_W();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__H = eINSTANCE.getPosition_H();

		/**
		 * The meta object literal for the '{@link diagram.impl.JunctionNodeImpl <em>Junction Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.JunctionNodeImpl
		 * @see diagram.impl.DiagramPackageImpl#getJunctionNode()
		 * @generated
		 */
		EClass JUNCTION_NODE = eINSTANCE.getJunctionNode();

		/**
		 * The meta object literal for the '{@link diagram.impl.ConnectableImpl <em>Connectable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.ConnectableImpl
		 * @see diagram.impl.DiagramPackageImpl#getConnectable()
		 * @generated
		 */
		EClass CONNECTABLE = eINSTANCE.getConnectable();

		/**
		 * The meta object literal for the '<em><b>Wire</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTABLE__WIRE = eINSTANCE.getConnectable_Wire();

		/**
		 * The meta object literal for the '{@link diagram.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.EdgeImpl
		 * @see diagram.impl.DiagramPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__COLOR = eINSTANCE.getEdge_Color();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__STYLE = eINSTANCE.getEdge_Style();

		/**
		 * The meta object literal for the '<em><b>Way Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__WAY_POINTS = eINSTANCE.getEdge_WayPoints();

		/**
		 * The meta object literal for the '{@link diagram.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.impl.PointImpl
		 * @see diagram.impl.DiagramPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link diagram.ConnectorType <em>Connector Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.ConnectorType
		 * @see diagram.impl.DiagramPackageImpl#getConnectorType()
		 * @generated
		 */
		EEnum CONNECTOR_TYPE = eINSTANCE.getConnectorType();

		/**
		 * The meta object literal for the '{@link diagram.ContactType <em>Contact Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.ContactType
		 * @see diagram.impl.DiagramPackageImpl#getContactType()
		 * @generated
		 */
		EEnum CONTACT_TYPE = eINSTANCE.getContactType();

		/**
		 * The meta object literal for the '{@link diagram.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.Orientation
		 * @see diagram.impl.DiagramPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '{@link diagram.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagram.Color
		 * @see diagram.impl.DiagramPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

	}

} //DiagramPackage
