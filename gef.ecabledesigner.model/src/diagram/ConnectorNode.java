/**
 */
package diagram;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.ConnectorNode#getCable <em>Cable</em>}</li>
 *   <li>{@link diagram.ConnectorNode#getContacts <em>Contacts</em>}</li>
 *   <li>{@link diagram.ConnectorNode#getType <em>Type</em>}</li>
 *   <li>{@link diagram.ConnectorNode#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link diagram.ConnectorNode#isCollapse <em>Collapse</em>}</li>
 * </ul>
 *
 * @see diagram.DiagramPackage#getConnectorNode()
 * @model
 * @generated
 */
public interface ConnectorNode extends AbstractNodeElement, Connectable {
	/**
	 * Returns the value of the '<em><b>Cable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cable</em>' reference.
	 * @see #setCable(Cable)
	 * @see diagram.DiagramPackage#getConnectorNode_Cable()
	 * @model
	 * @generated
	 */
	Cable getCable();

	/**
	 * Sets the value of the '{@link diagram.ConnectorNode#getCable <em>Cable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cable</em>' reference.
	 * @see #getCable()
	 * @generated
	 */
	void setCable(Cable value);

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link diagram.ContactNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see diagram.DiagramPackage#getConnectorNode_Contacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactNode> getContacts();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link diagram.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see diagram.ConnectorType
	 * @see #setType(ConnectorType)
	 * @see diagram.DiagramPackage#getConnectorNode_Type()
	 * @model
	 * @generated
	 */
	ConnectorType getType();

	/**
	 * Sets the value of the '{@link diagram.ConnectorNode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see diagram.ConnectorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectorType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link diagram.Orientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see diagram.Orientation
	 * @see #setOrientation(Orientation)
	 * @see diagram.DiagramPackage#getConnectorNode_Orientation()
	 * @model
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link diagram.ConnectorNode#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see diagram.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Collapse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapse</em>' attribute.
	 * @see #setCollapse(boolean)
	 * @see diagram.DiagramPackage#getConnectorNode_Collapse()
	 * @model
	 * @generated
	 */
	boolean isCollapse();

	/**
	 * Sets the value of the '{@link diagram.ConnectorNode#isCollapse <em>Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapse</em>' attribute.
	 * @see #isCollapse()
	 * @generated
	 */
	void setCollapse(boolean value);

} // ConnectorNode
