/**
 */
package diagram.impl;

import diagram.Connectable;
import diagram.DiagramPackage;
import diagram.Wire;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagram.impl.ConnectableImpl#getWire <em>Wire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectableImpl extends MinimalEObjectImpl.Container implements Connectable {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.CONNECTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Wire> getWire() {
		if (wire == null) {
			wire = new EObjectResolvingEList<Wire>(Wire.class, this, DiagramPackage.CONNECTABLE__WIRE);
		}
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.CONNECTABLE__WIRE:
				return getWire();
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
			case DiagramPackage.CONNECTABLE__WIRE:
				getWire().clear();
				getWire().addAll((Collection<? extends Wire>)newValue);
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
			case DiagramPackage.CONNECTABLE__WIRE:
				getWire().clear();
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
			case DiagramPackage.CONNECTABLE__WIRE:
				return wire != null && !wire.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectableImpl
