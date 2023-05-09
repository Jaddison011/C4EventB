/**
 */
package ecore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ecore.EcorePackage
 * @generated
 */
public interface EcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreFactory eINSTANCE = ecore.impl.EcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CNamed Element</em>'.
	 * @generated
	 */
	CNamedElement createCNamedElement();

	/**
	 * Returns a new object of class '<em>CType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CType</em>'.
	 * @generated
	 */
	CType createCType();

	/**
	 * Returns a new object of class '<em>CVariable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CVariable</em>'.
	 * @generated
	 */
	CVariable createCVariable();

	/**
	 * Returns a new object of class '<em>CStruct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CStruct</em>'.
	 * @generated
	 */
	CStruct createCStruct();

	/**
	 * Returns a new object of class '<em>CField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CField</em>'.
	 * @generated
	 */
	CField createCField();

	/**
	 * Returns a new object of class '<em>CEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEnumeration</em>'.
	 * @generated
	 */
	CEnumeration createCEnumeration();

	/**
	 * Returns a new object of class '<em>CEnum Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEnum Properties</em>'.
	 * @generated
	 */
	CEnumProperties createCEnumProperties();

	/**
	 * Returns a new object of class '<em>CArray</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CArray</em>'.
	 * @generated
	 */
	CArray createCArray();

	/**
	 * Returns a new object of class '<em>CArray Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CArray Element</em>'.
	 * @generated
	 */
	CArrayElement createCArrayElement();

	/**
	 * Returns a new object of class '<em>CPointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPointer</em>'.
	 * @generated
	 */
	CPointer createCPointer();

	/**
	 * Returns a new object of class '<em>CExpression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CExpression</em>'.
	 * @generated
	 */
	CExpression createCExpression();

	/**
	 * Returns a new object of class '<em>CDerived Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDerived Type</em>'.
	 * @generated
	 */
	CDerivedType createCDerivedType();

	/**
	 * Returns a new object of class '<em>CDiscrete Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDiscrete Type</em>'.
	 * @generated
	 */
	CDiscreteType createCDiscreteType();

	/**
	 * Returns a new object of class '<em>CParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CParameter</em>'.
	 * @generated
	 */
	CParameter createCParameter();

	/**
	 * Returns a new object of class '<em>CFunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFunction</em>'.
	 * @generated
	 */
	CFunction createCFunction();

	/**
	 * Returns a new object of class '<em>CProcedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CProcedure</em>'.
	 * @generated
	 */
	CProcedure createCProcedure();

	/**
	 * Returns a new object of class '<em>CTranslation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTranslation Unit</em>'.
	 * @generated
	 */
	CTranslationUnit createCTranslationUnit();

	/**
	 * Returns a new object of class '<em>CSource File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSource File</em>'.
	 * @generated
	 */
	CSourceFile createCSourceFile();

	/**
	 * Returns a new object of class '<em>CHeader File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CHeader File</em>'.
	 * @generated
	 */
	CHeaderFile createCHeaderFile();

	/**
	 * Returns a new object of class '<em>CInclude Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CInclude Directive</em>'.
	 * @generated
	 */
	CIncludeDirective createCIncludeDirective();

	/**
	 * Returns a new object of class '<em>CArray Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CArray Variable</em>'.
	 * @generated
	 */
	CArrayVariable createCArrayVariable();

	/**
	 * Returns a new object of class '<em>CPre Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPre Condition</em>'.
	 * @generated
	 */
	CPreCondition createCPreCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcorePackage getEcorePackage();

} //EcoreFactory
