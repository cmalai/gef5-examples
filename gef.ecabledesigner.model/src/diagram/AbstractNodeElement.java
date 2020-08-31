/**
 */
package diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.AbstractNodeElement#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see diagram.DiagramPackage#getAbstractNodeElement()
 * @model
 * @generated
 */
public interface AbstractNodeElement extends AbstractDiagramElement {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see diagram.DiagramPackage#getAbstractNodeElement_Position()
	 * @model containment="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link diagram.AbstractNodeElement#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // AbstractNodeElement
