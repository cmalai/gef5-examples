/**
 */
package diagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see diagram.DiagramPackage
 * @generated
 */
public interface DiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramFactory eINSTANCE = diagram.impl.DiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cable Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cable Diagram</em>'.
	 * @generated
	 */
	CableDiagram createCableDiagram();

	/**
	 * Returns a new object of class '<em>Abstract Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Diagram Element</em>'.
	 * @generated
	 */
	AbstractDiagramElement createAbstractDiagramElement();

	/**
	 * Returns a new object of class '<em>Black Box Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Black Box Node</em>'.
	 * @generated
	 */
	BlackBoxNode createBlackBoxNode();

	/**
	 * Returns a new object of class '<em>Connector Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Node</em>'.
	 * @generated
	 */
	ConnectorNode createConnectorNode();

	/**
	 * Returns a new object of class '<em>Contact Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Node</em>'.
	 * @generated
	 */
	ContactNode createContactNode();

	/**
	 * Returns a new object of class '<em>Wire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire</em>'.
	 * @generated
	 */
	Wire createWire();

	/**
	 * Returns a new object of class '<em>Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cable</em>'.
	 * @generated
	 */
	Cable createCable();

	/**
	 * Returns a new object of class '<em>Abstract Node Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Node Element</em>'.
	 * @generated
	 */
	AbstractNodeElement createAbstractNodeElement();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Junction Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Junction Node</em>'.
	 * @generated
	 */
	JunctionNode createJunctionNode();

	/**
	 * Returns a new object of class '<em>Connectable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connectable</em>'.
	 * @generated
	 */
	Connectable createConnectable();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiagramPackage getDiagramPackage();

} //DiagramFactory
