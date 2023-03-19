/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CArray</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.CArray#getElementType <em>Element Type</em>}</li>
 *   <li>{@link ecore.CArray#getSize <em>Size</em>}</li>
 *   <li>{@link ecore.CArray#getArrayElements <em>Array Elements</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getCArray()
 * @model
 * @generated
 */
public interface CArray extends CDerivedType {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(String)
	 * @see ecore.EcorePackage#getCArray_ElementType()
	 * @model
	 * @generated
	 */
	String getElementType();

	/**
	 * Sets the value of the '{@link ecore.CArray#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see ecore.EcorePackage#getCArray_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link ecore.CArray#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Array Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.CArrayElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Elements</em>' containment reference list.
	 * @see ecore.EcorePackage#getCArray_ArrayElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CArrayElement> getArrayElements();

} // CArray
