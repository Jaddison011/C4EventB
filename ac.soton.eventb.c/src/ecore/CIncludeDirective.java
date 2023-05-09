/**
 */
package ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CInclude Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.CIncludeDirective#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getCIncludeDirective()
 * @model
 * @generated
 */
public interface CIncludeDirective extends CNamedElement {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see ecore.EcorePackage#getCIncludeDirective_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link ecore.CIncludeDirective#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

} // CIncludeDirective
