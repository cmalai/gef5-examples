/**
 */
package diagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Orientation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diagram.DiagramPackage#getOrientation()
 * @model
 * @generated
 */
public enum Orientation implements Enumerator {
	/**
	 * The '<em><b>North</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH(0, "North", "North"),

	/**
	 * The '<em><b>West</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_VALUE
	 * @generated
	 * @ordered
	 */
	WEST(1, "West", "West"),

	/**
	 * The '<em><b>South</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH(2, "South", "South"),

	/**
	 * The '<em><b>East</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_VALUE
	 * @generated
	 * @ordered
	 */
	EAST(3, "East", "East"),

	/**
	 * The '<em><b>North East</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_EAST_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH_EAST(4, "NorthEast", "NorthEast"),

	/**
	 * The '<em><b>North West</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORTH_WEST_VALUE
	 * @generated
	 * @ordered
	 */
	NORTH_WEST(5, "NorthWest", "NorthWest"),

	/**
	 * The '<em><b>South East</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_EAST_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH_EAST(6, "SouthEast", "SouthEast"),

	/**
	 * The '<em><b>South West</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUTH_WEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOUTH_WEST(7, "SouthWest", "SouthWest"),

	/**
	 * The '<em><b>Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER(8, "Center", "Center");

	/**
	 * The '<em><b>North</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>North</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH
	 * @model name="North"
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_VALUE = 0;

	/**
	 * The '<em><b>West</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>West</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEST
	 * @model name="West"
	 * @generated
	 * @ordered
	 */
	public static final int WEST_VALUE = 1;

	/**
	 * The '<em><b>South</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>South</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH
	 * @model name="South"
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_VALUE = 2;

	/**
	 * The '<em><b>East</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>East</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EAST
	 * @model name="East"
	 * @generated
	 * @ordered
	 */
	public static final int EAST_VALUE = 3;

	/**
	 * The '<em><b>North East</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>North East</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH_EAST
	 * @model name="NorthEast"
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_EAST_VALUE = 4;

	/**
	 * The '<em><b>North West</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>North West</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORTH_WEST
	 * @model name="NorthWest"
	 * @generated
	 * @ordered
	 */
	public static final int NORTH_WEST_VALUE = 5;

	/**
	 * The '<em><b>South East</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>South East</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH_EAST
	 * @model name="SouthEast"
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_EAST_VALUE = 6;

	/**
	 * The '<em><b>South West</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>South West</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUTH_WEST
	 * @model name="SouthWest"
	 * @generated
	 * @ordered
	 */
	public static final int SOUTH_WEST_VALUE = 7;

	/**
	 * The '<em><b>Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @model name="Center"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_VALUE = 8;

	/**
	 * An array of all the '<em><b>Orientation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Orientation[] VALUES_ARRAY =
		new Orientation[] {
			NORTH,
			WEST,
			SOUTH,
			EAST,
			NORTH_EAST,
			NORTH_WEST,
			SOUTH_EAST,
			SOUTH_WEST,
			CENTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Orientation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Orientation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Orientation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Orientation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Orientation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orientation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Orientation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Orientation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orientation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Orientation get(int value) {
		switch (value) {
			case NORTH_VALUE: return NORTH;
			case WEST_VALUE: return WEST;
			case SOUTH_VALUE: return SOUTH;
			case EAST_VALUE: return EAST;
			case NORTH_EAST_VALUE: return NORTH_EAST;
			case NORTH_WEST_VALUE: return NORTH_WEST;
			case SOUTH_EAST_VALUE: return SOUTH_EAST;
			case SOUTH_WEST_VALUE: return SOUTH_WEST;
			case CENTER_VALUE: return CENTER;
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
	private Orientation(int value, String name, String literal) {
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
	
} //Orientation
