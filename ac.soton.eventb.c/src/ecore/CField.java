/**
 */
package ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.CField#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getCField()
 * @model
 * @generated
 */
public interface CField extends CNamedElement, CType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ecore.EcorePackage#getCField_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ecore.CField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // CField
