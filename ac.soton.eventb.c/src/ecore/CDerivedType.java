/**
 */
package ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDerived Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.CDerivedType#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getCDerivedType()
 * @model
 * @generated
 */
public interface CDerivedType extends CType {
	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(CType)
	 * @see ecore.EcorePackage#getCDerivedType_SuperType()
	 * @model
	 * @generated
	 */
	CType getSuperType();

	/**
	 * Sets the value of the '{@link ecore.CDerivedType#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(CType value);

} // CDerivedType
