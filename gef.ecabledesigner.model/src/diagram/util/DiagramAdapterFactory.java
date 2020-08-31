/**
 */
package diagram.util;

import diagram.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see diagram.DiagramPackage
 * @generated
 */
public class DiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramSwitch<Adapter> modelSwitch =
		new DiagramSwitch<Adapter>() {
			@Override
			public Adapter caseCableDiagram(CableDiagram object) {
				return createCableDiagramAdapter();
			}
			@Override
			public Adapter caseAbstractDiagramElement(AbstractDiagramElement object) {
				return createAbstractDiagramElementAdapter();
			}
			@Override
			public Adapter caseBlackBoxNode(BlackBoxNode object) {
				return createBlackBoxNodeAdapter();
			}
			@Override
			public Adapter caseConnectorNode(ConnectorNode object) {
				return createConnectorNodeAdapter();
			}
			@Override
			public Adapter caseContactNode(ContactNode object) {
				return createContactNodeAdapter();
			}
			@Override
			public Adapter caseWire(Wire object) {
				return createWireAdapter();
			}
			@Override
			public Adapter caseCable(Cable object) {
				return createCableAdapter();
			}
			@Override
			public Adapter caseAbstractNodeElement(AbstractNodeElement object) {
				return createAbstractNodeElementAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter caseJunctionNode(JunctionNode object) {
				return createJunctionNodeAdapter();
			}
			@Override
			public Adapter caseConnectable(Connectable object) {
				return createConnectableAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link diagram.CableDiagram <em>Cable Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.CableDiagram
	 * @generated
	 */
	public Adapter createCableDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.AbstractDiagramElement <em>Abstract Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.AbstractDiagramElement
	 * @generated
	 */
	public Adapter createAbstractDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.BlackBoxNode <em>Black Box Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.BlackBoxNode
	 * @generated
	 */
	public Adapter createBlackBoxNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.ConnectorNode <em>Connector Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.ConnectorNode
	 * @generated
	 */
	public Adapter createConnectorNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.ContactNode <em>Contact Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.ContactNode
	 * @generated
	 */
	public Adapter createContactNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.Wire
	 * @generated
	 */
	public Adapter createWireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.Cable
	 * @generated
	 */
	public Adapter createCableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.AbstractNodeElement <em>Abstract Node Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.AbstractNodeElement
	 * @generated
	 */
	public Adapter createAbstractNodeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.JunctionNode <em>Junction Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.JunctionNode
	 * @generated
	 */
	public Adapter createJunctionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.Connectable <em>Connectable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.Connectable
	 * @generated
	 */
	public Adapter createConnectableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagram.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagram.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiagramAdapterFactory
