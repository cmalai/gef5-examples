/**
 */
package diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.ContactNode#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see diagram.DiagramPackage#getContactNode()
 * @model
 * @generated
 */
public interface ContactNode extends Connectable, AbstractNodeElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link diagram.ContactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see diagram.ContactType
	 * @see #setType(ContactType)
	 * @see diagram.DiagramPackage#getContactNode_Type()
	 * @model
	 * @generated
	 */
	ContactType getType();

	/**
	 * Sets the value of the '{@link diagram.ContactNode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see diagram.ContactType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContactType value);

} // ContactNode
