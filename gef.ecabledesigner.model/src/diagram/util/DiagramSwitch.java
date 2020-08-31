/**
 */
package diagram.util;

import diagram.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see diagram.DiagramPackage
 * @generated
 */
public class DiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = DiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DiagramPackage.CABLE_DIAGRAM: {
				CableDiagram cableDiagram = (CableDiagram)theEObject;
				T result = caseCableDiagram(cableDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.ABSTRACT_DIAGRAM_ELEMENT: {
				AbstractDiagramElement abstractDiagramElement = (AbstractDiagramElement)theEObject;
				T result = caseAbstractDiagramElement(abstractDiagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.BLACK_BOX_NODE: {
				BlackBoxNode blackBoxNode = (BlackBoxNode)theEObject;
				T result = caseBlackBoxNode(blackBoxNode);
				if (result == null) result = caseAbstractNodeElement(blackBoxNode);
				if (result == null) result = caseAbstractDiagramElement(blackBoxNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.CONNECTOR_NODE: {
				ConnectorNode connectorNode = (ConnectorNode)theEObject;
				T result = caseConnectorNode(connectorNode);
				if (result == null) result = caseAbstractNodeElement(connectorNode);
				if (result == null) result = caseConnectable(connectorNode);
				if (result == null) result = caseAbstractDiagramElement(connectorNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.CONTACT_NODE: {
				ContactNode contactNode = (ContactNode)theEObject;
				T result = caseContactNode(contactNode);
				if (result == null) result = caseConnectable(contactNode);
				if (result == null) result = caseAbstractNodeElement(contactNode);
				if (result == null) result = caseAbstractDiagramElement(contactNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.WIRE: {
				Wire wire = (Wire)theEObject;
				T result = caseWire(wire);
				if (result == null) result = caseAbstractDiagramElement(wire);
				if (result == null) result = caseEdge(wire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.CABLE: {
				Cable cable = (Cable)theEObject;
				T result = caseCable(cable);
				if (result == null) result = caseAbstractDiagramElement(cable);
				if (result == null) result = caseEdge(cable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.ABSTRACT_NODE_ELEMENT: {
				AbstractNodeElement abstractNodeElement = (AbstractNodeElement)theEObject;
				T result = caseAbstractNodeElement(abstractNodeElement);
				if (result == null) result = caseAbstractDiagramElement(abstractNodeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.JUNCTION_NODE: {
				JunctionNode junctionNode = (JunctionNode)theEObject;
				T result = caseJunctionNode(junctionNode);
				if (result == null) result = caseConnectable(junctionNode);
				if (result == null) result = caseAbstractNodeElement(junctionNode);
				if (result == null) result = caseAbstractDiagramElement(junctionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.CONNECTABLE: {
				Connectable connectable = (Connectable)theEObject;
				T result = caseConnectable(connectable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCableDiagram(CableDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDiagramElement(AbstractDiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Black Box Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Black Box Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackBoxNode(BlackBoxNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorNode(ConnectorNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactNode(ContactNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWire(Wire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCable(Cable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNodeElement(AbstractNodeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunctionNode(JunctionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectable(Connectable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiagramSwitch
