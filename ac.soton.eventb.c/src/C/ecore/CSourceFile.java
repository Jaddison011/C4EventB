/**
 */
package C.ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSource File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link C.ecore.CSourceFile#getIncludeDirectives <em>Include Directives</em>}</li>
 * </ul>
 *
 * @see C.ecore.EcorePackage#getCSourceFile()
 * @model
 * @generated
 */
public interface CSourceFile extends CFile {
	/**
	 * Returns the value of the '<em><b>Include Directives</b></em>' containment reference list.
	 * The list contents are of type {@link C.ecore.CIncludeDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Directives</em>' containment reference list.
	 * @see C.ecore.EcorePackage#getCSourceFile_IncludeDirectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<CIncludeDirective> getIncludeDirectives();

} // CSourceFile
