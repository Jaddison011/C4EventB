/**
 */
package C4EventB.model.C4EventB;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CVariable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link C4EventB.model.C4EventB.CVariable#getValue <em>Value</em>}</li>
 *   <li>{@link C4EventB.model.C4EventB.CVariable#getType <em>Type</em>}</li>
 *   <li>{@link C4EventB.model.C4EventB.CVariable#isIsConstant <em>Is Constant</em>}</li>
 * </ul>
 *
 * @see C4EventB.model.C4EventB.C4EventBPackage#getCVariable()
 * @model
 * @generated
 */
public interface CVariable extends CNamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see C4EventB.model.C4EventB.C4EventBPackage#getCVariable_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link C4EventB.model.C4EventB.CVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see C4EventB.model.C4EventB.C4EventBPackage#getCVariable_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link C4EventB.model.C4EventB.CVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Is Constant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Constant</em>' attribute.
	 * @see #setIsConstant(boolean)
	 * @see C4EventB.model.C4EventB.C4EventBPackage#getCVariable_IsConstant()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsConstant();

	/**
	 * Sets the value of the '{@link C4EventB.model.C4EventB.CVariable#isIsConstant <em>Is Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Constant</em>' attribute.
	 * @see #isIsConstant()
	 * @generated
	 */
	void setIsConstant(boolean value);

} // CVariable
