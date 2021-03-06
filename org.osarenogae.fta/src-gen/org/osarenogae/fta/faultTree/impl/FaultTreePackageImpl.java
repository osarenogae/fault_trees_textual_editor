/**
 * generated by Xtext 2.25.0
 */
package org.osarenogae.fta.faultTree.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osarenogae.fta.faultTree.BasicEvent;
import org.osarenogae.fta.faultTree.ConditionalEvent;
import org.osarenogae.fta.faultTree.ExternalEvent;
import org.osarenogae.fta.faultTree.FaultTreeFactory;
import org.osarenogae.fta.faultTree.FaultTreeModel;
import org.osarenogae.fta.faultTree.FaultTreePackage;
import org.osarenogae.fta.faultTree.IntermediateEvent;
import org.osarenogae.fta.faultTree.IntermediateEventDefinition;
import org.osarenogae.fta.faultTree.Tree;
import org.osarenogae.fta.faultTree.begin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FaultTreePackageImpl extends EPackageImpl implements FaultTreePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass faultTreeModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beginEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intermediateEventDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass treeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intermediateEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalEventEClass = null;

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
   * @see org.osarenogae.fta.faultTree.FaultTreePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FaultTreePackageImpl()
  {
    super(eNS_URI, FaultTreeFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link FaultTreePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FaultTreePackage init()
  {
    if (isInited) return (FaultTreePackage)EPackage.Registry.INSTANCE.getEPackage(FaultTreePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredFaultTreePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    FaultTreePackageImpl theFaultTreePackage = registeredFaultTreePackage instanceof FaultTreePackageImpl ? (FaultTreePackageImpl)registeredFaultTreePackage : new FaultTreePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theFaultTreePackage.createPackageContents();

    // Initialize created meta-data
    theFaultTreePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFaultTreePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FaultTreePackage.eNS_URI, theFaultTreePackage);
    return theFaultTreePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFaultTreeModel()
  {
    return faultTreeModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFaultTreeModel_FaultTree()
  {
    return (EReference)faultTreeModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getbegin()
  {
    return beginEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getbegin_Fault()
  {
    return (EReference)beginEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntermediateEventDefinition()
  {
    return intermediateEventDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIntermediateEventDefinition_Name()
  {
    return (EReference)intermediateEventDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntermediateEventDefinition_Description()
  {
    return (EAttribute)intermediateEventDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIntermediateEventDefinition_Value()
  {
    return (EReference)intermediateEventDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTree()
  {
    return treeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTree_Left()
  {
    return (EReference)treeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTree_Right()
  {
    return (EReference)treeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTree_Name()
  {
    return (EAttribute)treeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntermediateEvent()
  {
    return intermediateEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBasicEvent()
  {
    return basicEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBasicEvent_Description()
  {
    return (EAttribute)basicEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConditionalEvent()
  {
    return conditionalEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConditionalEvent_Description()
  {
    return (EAttribute)conditionalEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExternalEvent()
  {
    return externalEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExternalEvent_Description()
  {
    return (EAttribute)externalEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FaultTreeFactory getFaultTreeFactory()
  {
    return (FaultTreeFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    faultTreeModelEClass = createEClass(FAULT_TREE_MODEL);
    createEReference(faultTreeModelEClass, FAULT_TREE_MODEL__FAULT_TREE);

    beginEClass = createEClass(BEGIN);
    createEReference(beginEClass, BEGIN__FAULT);

    intermediateEventDefinitionEClass = createEClass(INTERMEDIATE_EVENT_DEFINITION);
    createEReference(intermediateEventDefinitionEClass, INTERMEDIATE_EVENT_DEFINITION__NAME);
    createEAttribute(intermediateEventDefinitionEClass, INTERMEDIATE_EVENT_DEFINITION__DESCRIPTION);
    createEReference(intermediateEventDefinitionEClass, INTERMEDIATE_EVENT_DEFINITION__VALUE);

    treeEClass = createEClass(TREE);
    createEReference(treeEClass, TREE__LEFT);
    createEReference(treeEClass, TREE__RIGHT);
    createEAttribute(treeEClass, TREE__NAME);

    intermediateEventEClass = createEClass(INTERMEDIATE_EVENT);

    basicEventEClass = createEClass(BASIC_EVENT);
    createEAttribute(basicEventEClass, BASIC_EVENT__DESCRIPTION);

    conditionalEventEClass = createEClass(CONDITIONAL_EVENT);
    createEAttribute(conditionalEventEClass, CONDITIONAL_EVENT__DESCRIPTION);

    externalEventEClass = createEClass(EXTERNAL_EVENT);
    createEAttribute(externalEventEClass, EXTERNAL_EVENT__DESCRIPTION);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    intermediateEventDefinitionEClass.getESuperTypes().add(this.getbegin());
    intermediateEventEClass.getESuperTypes().add(this.getTree());
    basicEventEClass.getESuperTypes().add(this.getTree());
    conditionalEventEClass.getESuperTypes().add(this.getTree());
    externalEventEClass.getESuperTypes().add(this.getTree());

    // Initialize classes and features; add operations and parameters
    initEClass(faultTreeModelEClass, FaultTreeModel.class, "FaultTreeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFaultTreeModel_FaultTree(), this.getbegin(), null, "faultTree", null, 0, -1, FaultTreeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beginEClass, begin.class, "begin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbegin_Fault(), this.getTree(), null, "fault", null, 0, -1, begin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intermediateEventDefinitionEClass, IntermediateEventDefinition.class, "IntermediateEventDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntermediateEventDefinition_Name(), this.getIntermediateEvent(), null, "name", null, 0, 1, IntermediateEventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntermediateEventDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, IntermediateEventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntermediateEventDefinition_Value(), this.getTree(), null, "value", null, 0, 1, IntermediateEventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTree_Left(), this.getTree(), null, "left", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTree_Right(), this.getTree(), null, "right", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTree_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intermediateEventEClass, IntermediateEvent.class, "IntermediateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicEventEClass, BasicEvent.class, "BasicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasicEvent_Description(), ecorePackage.getEString(), "description", null, 0, 1, BasicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalEventEClass, ConditionalEvent.class, "ConditionalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditionalEvent_Description(), ecorePackage.getEString(), "description", null, 0, 1, ConditionalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalEventEClass, ExternalEvent.class, "ExternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalEvent_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FaultTreePackageImpl
