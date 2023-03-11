/**
 */
package C.ecore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CNamed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link C.ecore.CNamedElement#getName <em>Name</em>}</li>
 *   <li>{@link C.ecore.CNamedElement#getEndname <em>Endname</em>}</li>
 * </ul>
 *
 * @see C.ecore.EcorePackage#getCNamedElement()
 * @model
 * @generated
 */
public interface CNamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see C.ecore.EcorePackage#getCNamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link C.ecore.CNamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endname</em>' attribute.
	 * @see #setEndname(String)
	 * @see C.ecore.EcorePackage#getCNamedElement_Endname()
	 * @model
	 * @generated
	 */
	String getEndname();

	/**
	 * Sets the value of the '{@link C.ecore.CNamedElement#getEndname <em>Endname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endname</em>' attribute.
	 * @see #getEndname()
	 * @generated
	 */
	void setEndname(String value);

} // CNamedElement
