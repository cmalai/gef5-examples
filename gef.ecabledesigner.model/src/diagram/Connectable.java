/**
 */
package diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagram.Connectable#getWire <em>Wire</em>}</li>
 * </ul>
 *
 * @see diagram.DiagramPackage#getConnectable()
 * @model
 * @generated
 */
public interface Connectable extends EObject {
	/**
	 * Returns the value of the '<em><b>Wire</b></em>' reference list.
	 * The list contents are of type {@link diagram.Wire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire</em>' reference list.
	 * @see diagram.DiagramPackage#getConnectable_Wire()
	 * @model
	 * @generated
	 */
	EList<Wire> getWire();

} // Connectable
