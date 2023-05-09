/**
 */
package ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.CFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ecore.CFunction#getReturnStatement <em>Return Statement</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getCFunction()
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
	 * @see ecore.EcorePackage#getCFunction_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link ecore.CFunction#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Return Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Statement</em>' containment reference.
	 * @see #setReturnStatement(CExpression)
	 * @see ecore.EcorePackage#getCFunction_ReturnStatement()
	 * @model containment="true"
	 * @generated
	 */
	CExpression getReturnStatement();

	/**
	 * Sets the value of the '{@link ecore.CFunction#getReturnStatement <em>Return Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Statement</em>' containment reference.
	 * @see #getReturnStatement()
	 * @generated
	 */
	void setReturnStatement(CExpression value);

} // CFunction
