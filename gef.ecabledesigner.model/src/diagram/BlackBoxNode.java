/**
 */
package diagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Black Box Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.BlackBoxNode#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see diagram.DiagramPackage#getBlackBoxNode()
 * @model
 * @generated
 */
public interface BlackBoxNode extends AbstractNodeElement {
	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link diagram.ConnectorNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see diagram.DiagramPackage#getBlackBoxNode_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorNode> getConnectors();

} // BlackBoxNode
