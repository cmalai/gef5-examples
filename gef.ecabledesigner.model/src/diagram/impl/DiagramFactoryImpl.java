/**
 */
package diagram.impl;

import diagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramFactoryImpl extends EFactoryImpl implements DiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramFactory init() {
		try {
			DiagramFactory theDiagramFactory = (DiagramFactory)EPackage.Registry.INSTANCE.getEFactory(DiagramPackage.eNS_URI);
			if (theDiagramFactory != null) {
				return theDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiagramPackage.CABLE_DIAGRAM: return createCableDiagram();
			case DiagramPackage.ABSTRACT_DIAGRAM_ELEMENT: return createAbstractDiagramElement();
			case DiagramPackage.BLACK_BOX_NODE: return createBlackBoxNode();
			case DiagramPackage.CONNECTOR_NODE: return createConnectorNode();
			case DiagramPackage.CONTACT_NODE: return createContactNode();
			case DiagramPackage.WIRE: return createWire();
			case DiagramPackage.CABLE: return createCable();
			case DiagramPackage.ABSTRACT_NODE_ELEMENT: return createAbstractNodeElement();
			case DiagramPackage.POSITION: return createPosition();
			case DiagramPackage.JUNCTION_NODE: return createJunctionNode();
			case DiagramPackage.CONNECTABLE: return createConnectable();
			case DiagramPackage.EDGE: return createEdge();
			case DiagramPackage.POINT: return createPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DiagramPackage.CONNECTOR_TYPE:
				return createConnectorTypeFromString(eDataType, initialValue);
			case DiagramPackage.CONTACT_TYPE:
				return createContactTypeFromString(eDataType, initialValue);
			case DiagramPackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			case DiagramPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DiagramPackage.CONNECTOR_TYPE:
				return convertConnectorTypeToString(eDataType, instanceValue);
			case DiagramPackage.CONTACT_TYPE:
				return convertContactTypeToString(eDataType, instanceValue);
			case DiagramPackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			case DiagramPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CableDiagram createCableDiagram() {
		CableDiagramImpl cableDiagram = new CableDiagramImpl();
		return cableDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDiagramElement createAbstractDiagramElement() {
		AbstractDiagramElementImpl abstractDiagramElement = new AbstractDiagramElementImpl();
		return abstractDiagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlackBoxNode createBlackBoxNode() {
		BlackBoxNodeImpl blackBoxNode = new BlackBoxNodeImpl();
		return blackBoxNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorNode createConnectorNode() {
		ConnectorNodeImpl connectorNode = new ConnectorNodeImpl();
		return connectorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactNode createContactNode() {
		ContactNodeImpl contactNode = new ContactNodeImpl();
		return contactNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wire createWire() {
		WireImpl wire = new WireImpl();
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cable createCable() {
		CableImpl cable = new CableImpl();
		return cable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractNodeElement createAbstractNodeElement() {
		AbstractNodeElementImpl abstractNodeElement = new AbstractNodeElementImpl();
		return abstractNodeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JunctionNode createJunctionNode() {
		JunctionNodeImpl junctionNode = new JunctionNodeImpl();
		return junctionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connectable createConnectable() {
		ConnectableImpl connectable = new ConnectableImpl();
		return connectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType createConnectorTypeFromString(EDataType eDataType, String initialValue) {
		ConnectorType result = ConnectorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactType createContactTypeFromString(EDataType eDataType, String initialValue) {
		ContactType result = ContactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramPackage getDiagramPackage() {
		return (DiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiagramPackage getPackage() {
		return DiagramPackage.eINSTANCE;
	}

} //DiagramFactoryImpl
