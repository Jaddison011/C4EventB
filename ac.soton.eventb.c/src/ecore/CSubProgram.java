/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSub Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.CSubProgram#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ecore.CSubProgram#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link ecore.CSubProgram#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getCSubProgram()
 * @model
 * @generated
 */
public interface CSubProgram extends CNamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.CParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ecore.EcorePackage#getCSubProgram_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<CParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.CVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see ecore.EcorePackage#getCSubProgram_LocalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<CVariable> getLocalVariables();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.CExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see ecore.EcorePackage#getCSubProgram_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<CExpression> getBody();

} // CSubProgram
