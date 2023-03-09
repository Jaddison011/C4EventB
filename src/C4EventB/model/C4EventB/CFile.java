/**
 */
package C4EventB.model.C4EventB;

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
 *   <li>{@link C4EventB.model.C4EventB.CFile#getSubPrograms <em>Sub Programs</em>}</li>
 *   <li>{@link C4EventB.model.C4EventB.CFile#getGlobalVariables <em>Global Variables</em>}</li>
 * </ul>
 *
 * @see C4EventB.model.C4EventB.C4EventBPackage#getCFile()
 * @model
 * @generated
 */
public interface CFile extends CNamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Programs</b></em>' containment reference list.
	 * The list contents are of type {@link C4EventB.model.C4EventB.CSubProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Programs</em>' containment reference list.
	 * @see C4EventB.model.C4EventB.C4EventBPackage#getCFile_SubPrograms()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSubProgram> getSubPrograms();

	/**
	 * Returns the value of the '<em><b>Global Variables</b></em>' containment reference list.
	 * The list contents are of type {@link C4EventB.model.C4EventB.CVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variables</em>' containment reference list.
	 * @see C4EventB.model.C4EventB.C4EventBPackage#getCFile_GlobalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<CVariable> getGlobalVariables();

} // CFile
