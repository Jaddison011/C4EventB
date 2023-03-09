/**
 */
package C4EventB.model.C4EventB;

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
 *   <li>{@link C4EventB.model.C4EventB.CSubProgram#getParameters <em>Parameters</em>}</li>
 *   <li>{@link C4EventB.model.C4EventB.CSubProgram#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link C4EventB.model.C4EventB.CSubProgram#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see C4EventB.model.C4EventB.C4EventBPackage#getCSubProgram()
 * @model
 * @generated
 */
public interface CSubProgram extends CNamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link C4EventB.model.C4EventB.CParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see C4EventB.model.C4EventB.C4EventBPackage#getCSubProgram_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<CParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link C4EventB.model.C4EventB.CVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see C4EventB.model.C4EventB.C4EventBPackage#getCSubProgram_LocalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<CVariable> getLocalVariables();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link C4EventB.model.C4EventB.CExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see C4EventB.model.C4EventB.C4EventBPackage#getCSubProgram_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<CExpression> getBody();

} // CSubProgram
