/**
 */
package C.ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link C.ecore.CFunction#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see C.ecore.EcorePackage#getCFunction()
 * @model
 * @generated
 */
public interface CFunction extends CSubProgram {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see C.ecore.EcorePackage#getCFunction_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link C.ecore.CFunction#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

} // CFunction
