/**
 */
package C.ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTranslation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link C.ecore.CTranslationUnit#getSourceFiles <em>Source Files</em>}</li>
 *   <li>{@link C.ecore.CTranslationUnit#getSubPrograms <em>Sub Programs</em>}</li>
 *   <li>{@link C.ecore.CTranslationUnit#getHeaderFiles <em>Header Files</em>}</li>
 *   <li>{@link C.ecore.CTranslationUnit#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see C.ecore.EcorePackage#getCTranslationUnit()
 * @model
 * @generated
 */
public interface CTranslationUnit extends CNamedElement {
	/**
	 * Returns the value of the '<em><b>Source Files</b></em>' containment reference list.
	 * The list contents are of type {@link C.ecore.CSourceFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Files</em>' containment reference list.
	 * @see C.ecore.EcorePackage#getCTranslationUnit_SourceFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSourceFile> getSourceFiles();

	/**
	 * Returns the value of the '<em><b>Sub Programs</b></em>' containment reference list.
	 * The list contents are of type {@link C.ecore.CSubProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Programs</em>' containment reference list.
	 * @see C.ecore.EcorePackage#getCTranslationUnit_SubPrograms()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSubProgram> getSubPrograms();

	/**
	 * Returns the value of the '<em><b>Header Files</b></em>' containment reference list.
	 * The list contents are of type {@link C.ecore.CHeaderFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Files</em>' containment reference list.
	 * @see C.ecore.EcorePackage#getCTranslationUnit_HeaderFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<CHeaderFile> getHeaderFiles();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link C.ecore.CType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see C.ecore.EcorePackage#getCTranslationUnit_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<CType> getTypes();

} // CTranslationUnit
