/**
 */
package diagram.impl;

import diagram.AbstractDiagramElement;
import diagram.AbstractNodeElement;
import diagram.BlackBoxNode;
import diagram.Cable;
import diagram.CableDiagram;
import diagram.Color;
import diagram.Connectable;
import diagram.ConnectorNode;
import diagram.ConnectorType;
import diagram.ContactNode;
import diagram.ContactType;
import diagram.DiagramFactory;
import diagram.DiagramPackage;
import diagram.Edge;
import diagram.JunctionNode;
import diagram.Orientation;
import diagram.Point;
import diagram.Position;
import diagram.Wire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramPackageImpl extends EPackageImpl implements DiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDiagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackBoxNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass junctionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see diagram.DiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiagramPackageImpl() {
		super(eNS_URI, DiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiagramPackage init() {
		if (isInited) return (DiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDiagramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DiagramPackageImpl theDiagramPackage = registeredDiagramPackage instanceof DiagramPackageImpl ? (DiagramPackageImpl)registeredDiagramPackage : new DiagramPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagramPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiagramPackage.eNS_URI, theDiagramPackage);
		return theDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCableDiagram() {
		return cableDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCableDiagram_Name() {
		return (EAttribute)cableDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCableDiagram_DiagramElements() {
		return (EReference)cableDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDiagramElement() {
		return abstractDiagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractDiagramElement_Name() {
		return (EAttribute)abstractDiagramElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlackBoxNode() {
		return blackBoxNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlackBoxNode_Connectors() {
		return (EReference)blackBoxNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorNode() {
		return connectorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorNode_Cable() {
		return (EReference)connectorNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorNode_Contacts() {
		return (EReference)connectorNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorNode_Type() {
		return (EAttribute)connectorNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorNode_Orientation() {
		return (EAttribute)connectorNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorNode_Collapse() {
		return (EAttribute)connectorNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactNode() {
		return contactNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContactNode_Type() {
		return (EAttribute)contactNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWire() {
		return wireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWire_Source() {
		return (EReference)wireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWire_Target() {
		return (EReference)wireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCable() {
		return cableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCable_Source() {
		return (EReference)cableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCable_Target() {
		return (EReference)cableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractNodeElement() {
		return abstractNodeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractNodeElement_Position() {
		return (EReference)abstractNodeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_X() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Y() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_W() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_H() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJunctionNode() {
		return junctionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectable() {
		return connectableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectable_Wire() {
		return (EReference)connectableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_Color() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdge_Style() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdge_WayPoints() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConnectorType() {
		return connectorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContactType() {
		return contactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrientation() {
		return orientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramFactory getDiagramFactory() {
		return (DiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cableDiagramEClass = createEClass(CABLE_DIAGRAM);
		createEAttribute(cableDiagramEClass, CABLE_DIAGRAM__NAME);
		createEReference(cableDiagramEClass, CABLE_DIAGRAM__DIAGRAM_ELEMENTS);

		abstractDiagramElementEClass = createEClass(ABSTRACT_DIAGRAM_ELEMENT);
		createEAttribute(abstractDiagramElementEClass, ABSTRACT_DIAGRAM_ELEMENT__NAME);

		blackBoxNodeEClass = createEClass(BLACK_BOX_NODE);
		createEReference(blackBoxNodeEClass, BLACK_BOX_NODE__CONNECTORS);

		connectorNodeEClass = createEClass(CONNECTOR_NODE);
		createEReference(connectorNodeEClass, CONNECTOR_NODE__CABLE);
		createEReference(connectorNodeEClass, CONNECTOR_NODE__CONTACTS);
		createEAttribute(connectorNodeEClass, CONNECTOR_NODE__TYPE);
		createEAttribute(connectorNodeEClass, CONNECTOR_NODE__ORIENTATION);
		createEAttribute(connectorNodeEClass, CONNECTOR_NODE__COLLAPSE);

		contactNodeEClass = createEClass(CONTACT_NODE);
		createEAttribute(contactNodeEClass, CONTACT_NODE__TYPE);

		wireEClass = createEClass(WIRE);
		createEReference(wireEClass, WIRE__SOURCE);
		createEReference(wireEClass, WIRE__TARGET);

		cableEClass = createEClass(CABLE);
		createEReference(cableEClass, CABLE__SOURCE);
		createEReference(cableEClass, CABLE__TARGET);

		abstractNodeElementEClass = createEClass(ABSTRACT_NODE_ELEMENT);
		createEReference(abstractNodeElementEClass, ABSTRACT_NODE_ELEMENT__POSITION);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__X);
		createEAttribute(positionEClass, POSITION__Y);
		createEAttribute(positionEClass, POSITION__W);
		createEAttribute(positionEClass, POSITION__H);

		junctionNodeEClass = createEClass(JUNCTION_NODE);

		connectableEClass = createEClass(CONNECTABLE);
		createEReference(connectableEClass, CONNECTABLE__WIRE);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__COLOR);
		createEAttribute(edgeEClass, EDGE__STYLE);
		createEReference(edgeEClass, EDGE__WAY_POINTS);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);

		// Create enums
		connectorTypeEEnum = createEEnum(CONNECTOR_TYPE);
		contactTypeEEnum = createEEnum(CONTACT_TYPE);
		orientationEEnum = createEEnum(ORIENTATION);
		colorEEnum = createEEnum(COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blackBoxNodeEClass.getESuperTypes().add(this.getAbstractNodeElement());
		connectorNodeEClass.getESuperTypes().add(this.getAbstractNodeElement());
		connectorNodeEClass.getESuperTypes().add(this.getConnectable());
		contactNodeEClass.getESuperTypes().add(this.getConnectable());
		contactNodeEClass.getESuperTypes().add(this.getAbstractNodeElement());
		wireEClass.getESuperTypes().add(this.getAbstractDiagramElement());
		wireEClass.getESuperTypes().add(this.getEdge());
		cableEClass.getESuperTypes().add(this.getAbstractDiagramElement());
		cableEClass.getESuperTypes().add(this.getEdge());
		abstractNodeElementEClass.getESuperTypes().add(this.getAbstractDiagramElement());
		junctionNodeEClass.getESuperTypes().add(this.getConnectable());
		junctionNodeEClass.getESuperTypes().add(this.getAbstractNodeElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(cableDiagramEClass, CableDiagram.class, "CableDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCableDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, CableDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCableDiagram_DiagramElements(), this.getAbstractDiagramElement(), null, "diagramElements", null, 0, -1, CableDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDiagramElementEClass, AbstractDiagramElement.class, "AbstractDiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractDiagramElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractDiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blackBoxNodeEClass, BlackBoxNode.class, "BlackBoxNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlackBoxNode_Connectors(), this.getConnectorNode(), null, "connectors", null, 0, -1, BlackBoxNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorNodeEClass, ConnectorNode.class, "ConnectorNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorNode_Cable(), this.getCable(), null, "cable", null, 0, 1, ConnectorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorNode_Contacts(), this.getContactNode(), null, "contacts", null, 0, -1, ConnectorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorNode_Type(), this.getConnectorType(), "type", null, 0, 1, ConnectorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorNode_Orientation(), this.getOrientation(), "orientation", null, 0, 1, ConnectorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorNode_Collapse(), ecorePackage.getEBoolean(), "collapse", null, 0, 1, ConnectorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactNodeEClass, ContactNode.class, "ContactNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactNode_Type(), this.getContactType(), "type", null, 0, 1, ContactNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wireEClass, Wire.class, "Wire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWire_Source(), this.getConnectable(), null, "source", null, 1, 1, Wire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWire_Target(), this.getConnectable(), null, "target", null, 1, 1, Wire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cableEClass, Cable.class, "Cable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCable_Source(), this.getConnectorNode(), null, "source", null, 1, 1, Cable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCable_Target(), this.getConnectorNode(), null, "target", null, 1, 1, Cable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeElementEClass, AbstractNodeElement.class, "AbstractNodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractNodeElement_Position(), this.getPosition(), null, "position", null, 0, 1, AbstractNodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_X(), ecorePackage.getEDouble(), "x", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_W(), ecorePackage.getEDouble(), "w", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_H(), ecorePackage.getEDouble(), "h", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(junctionNodeEClass, JunctionNode.class, "JunctionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectableEClass, Connectable.class, "Connectable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectable_Wire(), this.getWire(), null, "wire", null, 0, -1, Connectable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Color(), this.getColor(), "color", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_Style(), ecorePackage.getEString(), "style", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_WayPoints(), this.getPoint(), null, "wayPoints", null, 0, -1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), ecorePackage.getEDouble(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(connectorTypeEEnum, ConnectorType.class, "ConnectorType");
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.UNDEFINED);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.PLUG);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.RECEPTACLE);
		addEEnumLiteral(connectorTypeEEnum, ConnectorType.SYMMETRIC);

		initEEnum(contactTypeEEnum, ContactType.class, "ContactType");
		addEEnumLiteral(contactTypeEEnum, ContactType.UNDEFINED);
		addEEnumLiteral(contactTypeEEnum, ContactType.PIN);
		addEEnumLiteral(contactTypeEEnum, ContactType.SOCKET);

		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.NORTH);
		addEEnumLiteral(orientationEEnum, Orientation.WEST);
		addEEnumLiteral(orientationEEnum, Orientation.SOUTH);
		addEEnumLiteral(orientationEEnum, Orientation.EAST);
		addEEnumLiteral(orientationEEnum, Orientation.NORTH_EAST);
		addEEnumLiteral(orientationEEnum, Orientation.NORTH_WEST);
		addEEnumLiteral(orientationEEnum, Orientation.SOUTH_EAST);
		addEEnumLiteral(orientationEEnum, Orientation.SOUTH_WEST);
		addEEnumLiteral(orientationEEnum, Orientation.CENTER);

		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.GREEN);
		addEEnumLiteral(colorEEnum, Color.BLUE);

		// Create resource
		createResource(eNS_URI);
	}

} //DiagramPackageImpl
