/**
 */
package C4EventB.model.C4EventB.util;

import C4EventB.model.C4EventB.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see C4EventB.model.C4EventB.C4EventBPackage
 * @generated
 */
public class C4EventBSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static C4EventBPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4EventBSwitch() {
		if (modelPackage == null) {
			modelPackage = C4EventBPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case C4EventBPackage.CNAMED_ELEMENT: {
				CNamedElement cNamedElement = (CNamedElement)theEObject;
				T result = caseCNamedElement(cNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CTYPE: {
				CType cType = (CType)theEObject;
				T result = caseCType(cType);
				if (result == null) result = caseCNamedElement(cType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CVARIABLE: {
				CVariable cVariable = (CVariable)theEObject;
				T result = caseCVariable(cVariable);
				if (result == null) result = caseCNamedElement(cVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CSTRUCT: {
				CStruct cStruct = (CStruct)theEObject;
				T result = caseCStruct(cStruct);
				if (result == null) result = caseCDerivedType(cStruct);
				if (result == null) result = caseCType(cStruct);
				if (result == null) result = caseCNamedElement(cStruct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CFIELD: {
				CField cField = (CField)theEObject;
				T result = caseCField(cField);
				if (result == null) result = caseCType(cField);
				if (result == null) result = caseCNamedElement(cField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CENUMERATION: {
				CEnumeration cEnumeration = (CEnumeration)theEObject;
				T result = caseCEnumeration(cEnumeration);
				if (result == null) result = caseCDiscreteType(cEnumeration);
				if (result == null) result = caseCType(cEnumeration);
				if (result == null) result = caseCNamedElement(cEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CENUM_PROPERTIES: {
				CEnumProperties cEnumProperties = (CEnumProperties)theEObject;
				T result = caseCEnumProperties(cEnumProperties);
				if (result == null) result = caseCNamedElement(cEnumProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CARRAY: {
				CArray cArray = (CArray)theEObject;
				T result = caseCArray(cArray);
				if (result == null) result = caseCDerivedType(cArray);
				if (result == null) result = caseCType(cArray);
				if (result == null) result = caseCNamedElement(cArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CARRAY_ELEMENT: {
				CArrayElement cArrayElement = (CArrayElement)theEObject;
				T result = caseCArrayElement(cArrayElement);
				if (result == null) result = caseCNamedElement(cArrayElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CPOINTER: {
				CPointer cPointer = (CPointer)theEObject;
				T result = caseCPointer(cPointer);
				if (result == null) result = caseCDerivedType(cPointer);
				if (result == null) result = caseCType(cPointer);
				if (result == null) result = caseCNamedElement(cPointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CEXPRESSION: {
				CExpression cExpression = (CExpression)theEObject;
				T result = caseCExpression(cExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CSUB_PROGRAM: {
				CSubProgram cSubProgram = (CSubProgram)theEObject;
				T result = caseCSubProgram(cSubProgram);
				if (result == null) result = caseCNamedElement(cSubProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CDERIVED_TYPE: {
				CDerivedType cDerivedType = (CDerivedType)theEObject;
				T result = caseCDerivedType(cDerivedType);
				if (result == null) result = caseCType(cDerivedType);
				if (result == null) result = caseCNamedElement(cDerivedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CDISCRETE_TYPE: {
				CDiscreteType cDiscreteType = (CDiscreteType)theEObject;
				T result = caseCDiscreteType(cDiscreteType);
				if (result == null) result = caseCType(cDiscreteType);
				if (result == null) result = caseCNamedElement(cDiscreteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CPARAMETER: {
				CParameter cParameter = (CParameter)theEObject;
				T result = caseCParameter(cParameter);
				if (result == null) result = caseCNamedElement(cParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CFUNCTION: {
				CFunction cFunction = (CFunction)theEObject;
				T result = caseCFunction(cFunction);
				if (result == null) result = caseCSubProgram(cFunction);
				if (result == null) result = caseCNamedElement(cFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CPROCEDURE: {
				CProcedure cProcedure = (CProcedure)theEObject;
				T result = caseCProcedure(cProcedure);
				if (result == null) result = caseCSubProgram(cProcedure);
				if (result == null) result = caseCNamedElement(cProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CTRANSLATION_UNIT: {
				CTranslationUnit cTranslationUnit = (CTranslationUnit)theEObject;
				T result = caseCTranslationUnit(cTranslationUnit);
				if (result == null) result = caseCNamedElement(cTranslationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CSOURCE_FILE: {
				CSourceFile cSourceFile = (CSourceFile)theEObject;
				T result = caseCSourceFile(cSourceFile);
				if (result == null) result = caseCFile(cSourceFile);
				if (result == null) result = caseCNamedElement(cSourceFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CHEADER_FILE: {
				CHeaderFile cHeaderFile = (CHeaderFile)theEObject;
				T result = caseCHeaderFile(cHeaderFile);
				if (result == null) result = caseCFile(cHeaderFile);
				if (result == null) result = caseCNamedElement(cHeaderFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CINCLUDE_DIRECTIVE: {
				CIncludeDirective cIncludeDirective = (CIncludeDirective)theEObject;
				T result = caseCIncludeDirective(cIncludeDirective);
				if (result == null) result = caseCNamedElement(cIncludeDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case C4EventBPackage.CFILE: {
				CFile cFile = (CFile)theEObject;
				T result = caseCFile(cFile);
				if (result == null) result = caseCNamedElement(cFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCNamedElement(CNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCType(CType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CVariable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CVariable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCVariable(CVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CStruct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CStruct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCStruct(CStruct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCField(CField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CEnumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCEnumeration(CEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CEnum Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CEnum Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCEnumProperties(CEnumProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CArray</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CArray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCArray(CArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CArray Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CArray Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCArrayElement(CArrayElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPointer(CPointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCExpression(CExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSub Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSub Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSubProgram(CSubProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDerived Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDerived Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDerivedType(CDerivedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDiscrete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDiscrete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDiscreteType(CDiscreteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCParameter(CParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFunction(CFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CProcedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CProcedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCProcedure(CProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CTranslation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTranslation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTranslationUnit(CTranslationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSource File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSource File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSourceFile(CSourceFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CHeader File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CHeader File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCHeaderFile(CHeaderFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CInclude Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CInclude Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIncludeDirective(CIncludeDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CFile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCFile(CFile object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //C4EventBSwitch
