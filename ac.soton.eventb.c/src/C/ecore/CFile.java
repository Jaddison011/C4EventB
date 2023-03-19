/**
 */
package C.ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link C.ecore.CFile#getSubPrograms <em>Sub Programs</em>}</li>
 *   <li>{@link C.ecore.CFile#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link C.ecore.CFile#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see C.ecore.EcorePackage#getCFile()
 * @model
 * @generated
 */
public interface CFile extends CNamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Programs</b></em>' containment reference list.
	 * The list contents are of type {@link C.ecore.CSubProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Programs</em>' containment reference list.
	 * @see C.ecore.EcorePackage#getCFile_SubPrograms()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSubProgram> getSubPrograms();

	/**
	 * Returns the value of the '<em><b>Global Variables</b></em>' containment reference list.
	 * The list contents are of type {@link C.ecore.CVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variables</em>' containment reference list.
	 * @see C.ecore.EcorePackage#getCFile_GlobalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<CVariable> getGlobalVariables();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link C.ecore.CType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see C.ecore.EcorePackage#getCFile_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<CType> getTypes();

} // CFile
