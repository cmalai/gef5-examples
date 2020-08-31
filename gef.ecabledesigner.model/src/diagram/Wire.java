/**
 */
package diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.Wire#getSource <em>Source</em>}</li>
 *   <li>{@link diagram.Wire#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see diagram.DiagramPackage#getWire()
 * @model
 * @generated
 */
public interface Wire extends AbstractDiagramElement, Edge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Connectable)
	 * @see diagram.DiagramPackage#getWire_Source()
	 * @model required="true"
	 * @generated
	 */
	Connectable getSource();

	/**
	 * Sets the value of the '{@link diagram.Wire#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Connectable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Connectable)
	 * @see diagram.DiagramPackage#getWire_Target()
	 * @model required="true"
	 * @generated
	 */
	Connectable getTarget();

	/**
	 * Sets the value of the '{@link diagram.Wire#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Connectable value);

} // Wire
