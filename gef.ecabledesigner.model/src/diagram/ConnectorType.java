/**
 */
package diagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connector Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diagram.DiagramPackage#getConnectorType()
 * @model
 * @generated
 */
public enum ConnectorType implements Enumerator {
	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(1, "Undefined", "Undefined"),

	/**
	 * The '<em><b>Plug</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUG_VALUE
	 * @generated
	 * @ordered
	 */
	PLUG(2, "Plug", "Plug"),

	/**
	 * The '<em><b>Receptacle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEPTACLE_VALUE
	 * @generated
	 * @ordered
	 */
	RECEPTACLE(3, "Receptacle", "Receptacle"),

	/**
	 * The '<em><b>Symmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	SYMMETRIC(4, "Symmetric", "Symmetric");

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="Undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 1;

	/**
	 * The '<em><b>Plug</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plug</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUG
	 * @model name="Plug"
	 * @generated
	 * @ordered
	 */
	public static final int PLUG_VALUE = 2;

	/**
	 * The '<em><b>Receptacle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Receptacle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEPTACLE
	 * @model name="Receptacle"
	 * @generated
	 * @ordered
	 */
	public static final int RECEPTACLE_VALUE = 3;

	/**
	 * The '<em><b>Symmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Symmetric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYMMETRIC
	 * @model name="Symmetric"
	 * @generated
	 * @ordered
	 */
	public static final int SYMMETRIC_VALUE = 4;

	/**
	 * An array of all the '<em><b>Connector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectorType[] VALUES_ARRAY =
		new ConnectorType[] {
			UNDEFINED,
			PLUG,
			RECEPTACLE,
			SYMMETRIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Connector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConnectorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connector Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectorType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case PLUG_VALUE: return PLUG;
			case RECEPTACLE_VALUE: return RECEPTACLE;
			case SYMMETRIC_VALUE: return SYMMETRIC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConnectorType
