/**
 * generated by Xtext 2.12.0
 */
package linit.linit.impl;

import java.util.Collection;

import linit.linit.LinitPackage;
import linit.linit.ciclo;
import linit.linit.condicional;
import linit.linit.instrucciones;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>instrucciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link linit.linit.impl.instruccionesImpl#getI <em>I</em>}</li>
 *   <li>{@link linit.linit.impl.instruccionesImpl#getC <em>C</em>}</li>
 *   <li>{@link linit.linit.impl.instruccionesImpl#getF <em>F</em>}</li>
 * </ul>
 *
 * @generated
 */
public class instruccionesImpl extends cicloImpl implements instrucciones
{
  /**
   * The cached value of the '{@link #getI() <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected instrucciones i;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected condicional c;

  /**
   * The cached value of the '{@link #getF() <em>F</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected EList<ciclo> f;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected instruccionesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LinitPackage.Literals.INSTRUCCIONES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public instrucciones getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI(instrucciones newI, NotificationChain msgs)
  {
    instrucciones oldI = i;
    i = newI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LinitPackage.INSTRUCCIONES__I, oldI, newI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(instrucciones newI)
  {
    if (newI != i)
    {
      NotificationChain msgs = null;
      if (i != null)
        msgs = ((InternalEObject)i).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LinitPackage.INSTRUCCIONES__I, null, msgs);
      if (newI != null)
        msgs = ((InternalEObject)newI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LinitPackage.INSTRUCCIONES__I, null, msgs);
      msgs = basicSetI(newI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinitPackage.INSTRUCCIONES__I, newI, newI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public condicional getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(condicional newC, NotificationChain msgs)
  {
    condicional oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LinitPackage.INSTRUCCIONES__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(condicional newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LinitPackage.INSTRUCCIONES__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LinitPackage.INSTRUCCIONES__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LinitPackage.INSTRUCCIONES__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ciclo> getF()
  {
    if (f == null)
    {
      f = new EObjectContainmentEList<ciclo>(ciclo.class, this, LinitPackage.INSTRUCCIONES__F);
    }
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LinitPackage.INSTRUCCIONES__I:
        return basicSetI(null, msgs);
      case LinitPackage.INSTRUCCIONES__C:
        return basicSetC(null, msgs);
      case LinitPackage.INSTRUCCIONES__F:
        return ((InternalEList<?>)getF()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LinitPackage.INSTRUCCIONES__I:
        return getI();
      case LinitPackage.INSTRUCCIONES__C:
        return getC();
      case LinitPackage.INSTRUCCIONES__F:
        return getF();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LinitPackage.INSTRUCCIONES__I:
        setI((instrucciones)newValue);
        return;
      case LinitPackage.INSTRUCCIONES__C:
        setC((condicional)newValue);
        return;
      case LinitPackage.INSTRUCCIONES__F:
        getF().clear();
        getF().addAll((Collection<? extends ciclo>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LinitPackage.INSTRUCCIONES__I:
        setI((instrucciones)null);
        return;
      case LinitPackage.INSTRUCCIONES__C:
        setC((condicional)null);
        return;
      case LinitPackage.INSTRUCCIONES__F:
        getF().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LinitPackage.INSTRUCCIONES__I:
        return i != null;
      case LinitPackage.INSTRUCCIONES__C:
        return c != null;
      case LinitPackage.INSTRUCCIONES__F:
        return f != null && !f.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //instruccionesImpl
