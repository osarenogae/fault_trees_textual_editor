/**
 * generated by Xtext 2.25.0
 */
package org.osarenogae.fta.faultTree;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osarenogae.fta.faultTree.FaultTreePackage
 * @generated
 */
public interface FaultTreeFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FaultTreeFactory eINSTANCE = org.osarenogae.fta.faultTree.impl.FaultTreeFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  FaultTreeModel createFaultTreeModel();

  /**
   * Returns a new object of class '<em>begin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>begin</em>'.
   * @generated
   */
  begin createbegin();

  /**
   * Returns a new object of class '<em>Intermediate Event Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intermediate Event Definition</em>'.
   * @generated
   */
  IntermediateEventDefinition createIntermediateEventDefinition();

  /**
   * Returns a new object of class '<em>Tree</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tree</em>'.
   * @generated
   */
  Tree createTree();

  /**
   * Returns a new object of class '<em>Intermediate Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intermediate Event</em>'.
   * @generated
   */
  IntermediateEvent createIntermediateEvent();

  /**
   * Returns a new object of class '<em>Basic Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Event</em>'.
   * @generated
   */
  BasicEvent createBasicEvent();

  /**
   * Returns a new object of class '<em>Conditional Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Event</em>'.
   * @generated
   */
  ConditionalEvent createConditionalEvent();

  /**
   * Returns a new object of class '<em>External Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Event</em>'.
   * @generated
   */
  ExternalEvent createExternalEvent();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FaultTreePackage getFaultTreePackage();

} //FaultTreeFactory
