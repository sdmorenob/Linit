/**
 * generated by Xtext 2.12.0
 */
package linit.linit.util;

import linit.linit.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see linit.linit.LinitPackage
 * @generated
 */
public class LinitAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LinitPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinitAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LinitPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected LinitSwitch<Adapter> modelSwitch =
    new LinitSwitch<Adapter>()
    {
      @Override
      public Adapter caseprograma(programa object)
      {
        return createprogramaAdapter();
      }
      @Override
      public Adapter casedeclaraciones(declaraciones object)
      {
        return createdeclaracionesAdapter();
      }
      @Override
      public Adapter caseinstrucciones(instrucciones object)
      {
        return createinstruccionesAdapter();
      }
      @Override
      public Adapter casecondicional(condicional object)
      {
        return createcondicionalAdapter();
      }
      @Override
      public Adapter caseciclo(ciclo object)
      {
        return createcicloAdapter();
      }
      @Override
      public Adapter caselistaCondicional(listaCondicional object)
      {
        return createlistaCondicionalAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link linit.linit.programa <em>programa</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see linit.linit.programa
   * @generated
   */
  public Adapter createprogramaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link linit.linit.declaraciones <em>declaraciones</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see linit.linit.declaraciones
   * @generated
   */
  public Adapter createdeclaracionesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link linit.linit.instrucciones <em>instrucciones</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see linit.linit.instrucciones
   * @generated
   */
  public Adapter createinstruccionesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link linit.linit.condicional <em>condicional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see linit.linit.condicional
   * @generated
   */
  public Adapter createcondicionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link linit.linit.ciclo <em>ciclo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see linit.linit.ciclo
   * @generated
   */
  public Adapter createcicloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link linit.linit.listaCondicional <em>lista Condicional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see linit.linit.listaCondicional
   * @generated
   */
  public Adapter createlistaCondicionalAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LinitAdapterFactory
