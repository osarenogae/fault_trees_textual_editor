/**
 * generated by Xtext 2.25.0
 */
package org.osarenogae.fta.faultTree.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osarenogae.fta.faultTree.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osarenogae.fta.faultTree.FaultTreePackage
 * @generated
 */
public class FaultTreeSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FaultTreePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FaultTreeSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FaultTreePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FaultTreePackage.FAULT_TREE_MODEL:
      {
        FaultTreeModel faultTreeModel = (FaultTreeModel)theEObject;
        T result = caseFaultTreeModel(faultTreeModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FaultTreePackage.BEGIN:
      {
        begin begin = (begin)theEObject;
        T result = casebegin(begin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FaultTreePackage.INTERMEDIATE_EVENT_DEFINITION:
      {
        IntermediateEventDefinition intermediateEventDefinition = (IntermediateEventDefinition)theEObject;
        T result = caseIntermediateEventDefinition(intermediateEventDefinition);
        if (result == null) result = casebegin(intermediateEventDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FaultTreePackage.TREE:
      {
        Tree tree = (Tree)theEObject;
        T result = caseTree(tree);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FaultTreePackage.INTERMEDIATE_EVENT:
      {
        IntermediateEvent intermediateEvent = (IntermediateEvent)theEObject;
        T result = caseIntermediateEvent(intermediateEvent);
        if (result == null) result = caseTree(intermediateEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FaultTreePackage.BASIC_EVENT:
      {
        BasicEvent basicEvent = (BasicEvent)theEObject;
        T result = caseBasicEvent(basicEvent);
        if (result == null) result = caseTree(basicEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FaultTreePackage.CONDITIONAL_EVENT:
      {
        ConditionalEvent conditionalEvent = (ConditionalEvent)theEObject;
        T result = caseConditionalEvent(conditionalEvent);
        if (result == null) result = caseTree(conditionalEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FaultTreePackage.EXTERNAL_EVENT:
      {
        ExternalEvent externalEvent = (ExternalEvent)theEObject;
        T result = caseExternalEvent(externalEvent);
        if (result == null) result = caseTree(externalEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFaultTreeModel(FaultTreeModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>begin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>begin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebegin(begin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intermediate Event Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intermediate Event Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntermediateEventDefinition(IntermediateEventDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTree(Tree object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntermediateEvent(IntermediateEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicEvent(BasicEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalEvent(ConditionalEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalEvent(ExternalEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FaultTreeSwitch
