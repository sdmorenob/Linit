/**
 * generated by Xtext 2.12.0
 */
package linit.linit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>declaraciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link linit.linit.declaraciones#getI <em>I</em>}</li>
 *   <li>{@link linit.linit.declaraciones#getD <em>D</em>}</li>
 * </ul>
 *
 * @see linit.linit.LinitPackage#getdeclaraciones()
 * @model
 * @generated
 */
public interface declaraciones extends EObject
{
  /**
   * Returns the value of the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I</em>' containment reference.
   * @see #setI(instrucciones)
   * @see linit.linit.LinitPackage#getdeclaraciones_I()
   * @model containment="true"
   * @generated
   */
  instrucciones getI();

  /**
   * Sets the value of the '{@link linit.linit.declaraciones#getI <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I</em>' containment reference.
   * @see #getI()
   * @generated
   */
  void setI(instrucciones value);

  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(declaraciones)
   * @see linit.linit.LinitPackage#getdeclaraciones_D()
   * @model containment="true"
   * @generated
   */
  declaraciones getD();

  /**
   * Sets the value of the '{@link linit.linit.declaraciones#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(declaraciones value);

} // declaraciones
