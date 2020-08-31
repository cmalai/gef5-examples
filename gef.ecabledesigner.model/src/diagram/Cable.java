/**
 */
package diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.Cable#getSource <em>Source</em>}</li>
 *   <li>{@link diagram.Cable#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see diagram.DiagramPackage#getCable()
 * @model
 * @generated
 */
public interface Cable extends AbstractDiagramElement, Edge {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ConnectorNode)
	 * @see diagram.DiagramPackage#getCable_Source()
	 * @model required="true"
	 * @generated
	 */
	ConnectorNode getSource();

	/**
	 * Sets the value of the '{@link diagram.Cable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConnectorNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ConnectorNode)
	 * @see diagram.DiagramPackage#getCable_Target()
	 * @model required="true"
	 * @generated
	 */
	ConnectorNode getTarget();

	/**
	 * Sets the value of the '{@link diagram.Cable#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ConnectorNode value);

} // Cable
