/**
 */
package ecore;

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
 *   <li>{@link ecore.CTranslationUnit#getSourceFiles <em>Source Files</em>}</li>
 *   <li>{@link ecore.CTranslationUnit#getHeaderFiles <em>Header Files</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getCTranslationUnit()
 * @model
 * @generated
 */
public interface CTranslationUnit extends CNamedElement {
	/**
	 * Returns the value of the '<em><b>Source Files</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.CSourceFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Files</em>' containment reference list.
	 * @see ecore.EcorePackage#getCTranslationUnit_SourceFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSourceFile> getSourceFiles();

	/**
	 * Returns the value of the '<em><b>Header Files</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.CHeaderFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Files</em>' containment reference list.
	 * @see ecore.EcorePackage#getCTranslationUnit_HeaderFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<CHeaderFile> getHeaderFiles();

} // CTranslationUnit
