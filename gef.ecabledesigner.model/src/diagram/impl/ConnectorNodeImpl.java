/**
 */
package diagram.impl;

import diagram.Cable;
import diagram.Connectable;
import diagram.ConnectorNode;
import diagram.ConnectorType;
import diagram.ContactNode;
import diagram.DiagramPackage;

import diagram.Orientation;
import diagram.Wire;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagram.impl.ConnectorNodeImpl#getWire <em>Wire</em>}</li>
 *   <li>{@link diagram.impl.ConnectorNodeImpl#getCable <em>Cable</em>}</li>
 *   <li>{@link diagram.impl.ConnectorNodeImpl#getContacts <em>Contacts</em>}</li>
 *   <li>{@link diagram.impl.ConnectorNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link diagram.impl.ConnectorNodeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link diagram.impl.ConnectorNodeImpl#isCollapse <em>Collapse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorNodeImpl extends AbstractNodeElementImpl implements ConnectorNode {
	/**
	 * The cached value of the '{@link #getWire() <em>Wire</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWire()
	 * @generated
	 * @ordered
	 */
	protected EList<Wire> wire;

	/**
	 * The cached value of the '{@link #getCable() <em>Cable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCable()
	 * @generated
	 * @ordered
	 */
	protected Cable cable;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactNode> contacts;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorType TYPE_EDEFAULT = ConnectorType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConnectorType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.NORTH;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollapse() <em>Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollapse() <em>Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapse()
	 * @generated
	 * @ordered
	 */
	protected boolean collapse = COLLAPSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.CONNECTOR_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Wire> getWire() {
		if (wire == null) {
			wire = new EObjectResolvingEList<Wire>(Wire.class, this, DiagramPackage.CONNECTOR_NODE__WIRE);
		}
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cable getCable() {
		if (cable != null && cable.eIsProxy()) {
			InternalEObject oldCable = (InternalEObject)cable;
			cable = (Cable)eResolveProxy(oldCable);
			if (cable != oldCable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramPackage.CONNECTOR_NODE__CABLE, oldCable, cable));
			}
		}
		return cable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cable basicGetCable() {
		return cable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCable(Cable newCable) {
		Cable oldCable = cable;
		cable = newCable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.CONNECTOR_NODE__CABLE, oldCable, cable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactNode> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactNode>(ContactNode.class, this, DiagramPackage.CONNECTOR_NODE__CONTACTS);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ConnectorType newType) {
		ConnectorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.CONNECTOR_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(Orientation newOrientation) {
		Orientation oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.CONNECTOR_NODE__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCollapse() {
		return collapse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollapse(boolean newCollapse) {
		boolean oldCollapse = collapse;
		collapse = newCollapse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.CONNECTOR_NODE__COLLAPSE, oldCollapse, collapse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.CONNECTOR_NODE__CONTACTS:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.CONNECTOR_NODE__WIRE:
				return getWire();
			case DiagramPackage.CONNECTOR_NODE__CABLE:
				if (resolve) return getCable();
				return basicGetCable();
			case DiagramPackage.CONNECTOR_NODE__CONTACTS:
				return getContacts();
			case DiagramPackage.CONNECTOR_NODE__TYPE:
				return getType();
			case DiagramPackage.CONNECTOR_NODE__ORIENTATION:
				return getOrientation();
			case DiagramPackage.CONNECTOR_NODE__COLLAPSE:
				return isCollapse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramPackage.CONNECTOR_NODE__WIRE:
				getWire().clear();
				getWire().addAll((Collection<? extends Wire>)newValue);
				return;
			case DiagramPackage.CONNECTOR_NODE__CABLE:
				setCable((Cable)newValue);
				return;
			case DiagramPackage.CONNECTOR_NODE__CONTACTS:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactNode>)newValue);
				return;
			case DiagramPackage.CONNECTOR_NODE__TYPE:
				setType((ConnectorType)newValue);
				return;
			case DiagramPackage.CONNECTOR_NODE__ORIENTATION:
				setOrientation((Orientation)newValue);
				return;
			case DiagramPackage.CONNECTOR_NODE__COLLAPSE:
				setCollapse((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiagramPackage.CONNECTOR_NODE__WIRE:
				getWire().clear();
				return;
			case DiagramPackage.CONNECTOR_NODE__CABLE:
				setCable((Cable)null);
				return;
			case DiagramPackage.CONNECTOR_NODE__CONTACTS:
				getContacts().clear();
				return;
			case DiagramPackage.CONNECTOR_NODE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DiagramPackage.CONNECTOR_NODE__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case DiagramPackage.CONNECTOR_NODE__COLLAPSE:
				setCollapse(COLLAPSE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiagramPackage.CONNECTOR_NODE__WIRE:
				return wire != null && !wire.isEmpty();
			case DiagramPackage.CONNECTOR_NODE__CABLE:
				return cable != null;
			case DiagramPackage.CONNECTOR_NODE__CONTACTS:
				return contacts != null && !contacts.isEmpty();
			case DiagramPackage.CONNECTOR_NODE__TYPE:
				return type != TYPE_EDEFAULT;
			case DiagramPackage.CONNECTOR_NODE__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case DiagramPackage.CONNECTOR_NODE__COLLAPSE:
				return collapse != COLLAPSE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Connectable.class) {
			switch (derivedFeatureID) {
				case DiagramPackage.CONNECTOR_NODE__WIRE: return DiagramPackage.CONNECTABLE__WIRE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Connectable.class) {
			switch (baseFeatureID) {
				case DiagramPackage.CONNECTABLE__WIRE: return DiagramPackage.CONNECTOR_NODE__WIRE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(", collapse: ");
		result.append(collapse);
		result.append(')');
		return result.toString();
	}

} //ConnectorNodeImpl
