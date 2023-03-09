/**
 */
package C4EventB.model.C4EventB.util;

import C4EventB.model.C4EventB.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see C4EventB.model.C4EventB.C4EventBPackage
 * @generated
 */
public class C4EventBAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static C4EventBPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4EventBAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = C4EventBPackage.eINSTANCE;
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
	protected C4EventBSwitch<Adapter> modelSwitch =
		new C4EventBSwitch<Adapter>() {
			@Override
			public Adapter caseCNamedElement(CNamedElement object) {
				return createCNamedElementAdapter();
			}
			@Override
			public Adapter caseCType(CType object) {
				return createCTypeAdapter();
			}
			@Override
			public Adapter caseCVariable(CVariable object) {
				return createCVariableAdapter();
			}
			@Override
			public Adapter caseCStruct(CStruct object) {
				return createCStructAdapter();
			}
			@Override
			public Adapter caseCField(CField object) {
				return createCFieldAdapter();
			}
			@Override
			public Adapter caseCEnumeration(CEnumeration object) {
				return createCEnumerationAdapter();
			}
			@Override
			public Adapter caseCEnumProperties(CEnumProperties object) {
				return createCEnumPropertiesAdapter();
			}
			@Override
			public Adapter caseCArray(CArray object) {
				return createCArrayAdapter();
			}
			@Override
			public Adapter caseCArrayElement(CArrayElement object) {
				return createCArrayElementAdapter();
			}
			@Override
			public Adapter caseCPointer(CPointer object) {
				return createCPointerAdapter();
			}
			@Override
			public Adapter caseCExpression(CExpression object) {
				return createCExpressionAdapter();
			}
			@Override
			public Adapter caseCSubProgram(CSubProgram object) {
				return createCSubProgramAdapter();
			}
			@Override
			public Adapter caseCDerivedType(CDerivedType object) {
				return createCDerivedTypeAdapter();
			}
			@Override
			public Adapter caseCDiscreteType(CDiscreteType object) {
				return createCDiscreteTypeAdapter();
			}
			@Override
			public Adapter caseCParameter(CParameter object) {
				return createCParameterAdapter();
			}
			@Override
			public Adapter caseCFunction(CFunction object) {
				return createCFunctionAdapter();
			}
			@Override
			public Adapter caseCProcedure(CProcedure object) {
				return createCProcedureAdapter();
			}
			@Override
			public Adapter caseCTranslationUnit(CTranslationUnit object) {
				return createCTranslationUnitAdapter();
			}
			@Override
			public Adapter caseCSourceFile(CSourceFile object) {
				return createCSourceFileAdapter();
			}
			@Override
			public Adapter caseCHeaderFile(CHeaderFile object) {
				return createCHeaderFileAdapter();
			}
			@Override
			public Adapter caseCIncludeDirective(CIncludeDirective object) {
				return createCIncludeDirectiveAdapter();
			}
			@Override
			public Adapter caseCFile(CFile object) {
				return createCFileAdapter();
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
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CNamedElement <em>CNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CNamedElement
	 * @generated
	 */
	public Adapter createCNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CType <em>CType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CType
	 * @generated
	 */
	public Adapter createCTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CVariable <em>CVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CVariable
	 * @generated
	 */
	public Adapter createCVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CStruct <em>CStruct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CStruct
	 * @generated
	 */
	public Adapter createCStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CField <em>CField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CField
	 * @generated
	 */
	public Adapter createCFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CEnumeration <em>CEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CEnumeration
	 * @generated
	 */
	public Adapter createCEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CEnumProperties <em>CEnum Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CEnumProperties
	 * @generated
	 */
	public Adapter createCEnumPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CArray <em>CArray</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CArray
	 * @generated
	 */
	public Adapter createCArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CArrayElement <em>CArray Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CArrayElement
	 * @generated
	 */
	public Adapter createCArrayElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CPointer <em>CPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CPointer
	 * @generated
	 */
	public Adapter createCPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CExpression <em>CExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CExpression
	 * @generated
	 */
	public Adapter createCExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CSubProgram <em>CSub Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CSubProgram
	 * @generated
	 */
	public Adapter createCSubProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CDerivedType <em>CDerived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CDerivedType
	 * @generated
	 */
	public Adapter createCDerivedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CDiscreteType <em>CDiscrete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CDiscreteType
	 * @generated
	 */
	public Adapter createCDiscreteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CParameter <em>CParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CParameter
	 * @generated
	 */
	public Adapter createCParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CFunction <em>CFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CFunction
	 * @generated
	 */
	public Adapter createCFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CProcedure <em>CProcedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CProcedure
	 * @generated
	 */
	public Adapter createCProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CTranslationUnit <em>CTranslation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CTranslationUnit
	 * @generated
	 */
	public Adapter createCTranslationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CSourceFile <em>CSource File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CSourceFile
	 * @generated
	 */
	public Adapter createCSourceFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CHeaderFile <em>CHeader File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CHeaderFile
	 * @generated
	 */
	public Adapter createCHeaderFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CIncludeDirective <em>CInclude Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CIncludeDirective
	 * @generated
	 */
	public Adapter createCIncludeDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link C4EventB.model.C4EventB.CFile <em>CFile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see C4EventB.model.C4EventB.CFile
	 * @generated
	 */
	public Adapter createCFileAdapter() {
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

} //C4EventBAdapterFactory
