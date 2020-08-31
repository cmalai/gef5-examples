/**
 */
package diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cable Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.CableDiagram#getName <em>Name</em>}</li>
 *   <li>{@link diagram.CableDiagram#getDiagramElements <em>Diagram Elements</em>}</li>
 * </ul>
 *
 * @see diagram.DiagramPackage#getCableDiagram()
 * @model
 * @generated
 */
public interface CableDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see diagram.DiagramPackage#getCableDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diagram.CableDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Diagram Elements</b></em>' containment reference list.
	 * The list contents are of type {@link diagram.AbstractDiagramElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Elements</em>' containment reference list.
	 * @see diagram.DiagramPackage#getCableDiagram_DiagramElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractDiagramElement> getDiagramElements();

} // CableDiagram
