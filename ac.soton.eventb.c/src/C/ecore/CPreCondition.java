/**
 */
package C.ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPre Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link C.ecore.CPreCondition#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see C.ecore.EcorePackage#getCPreCondition()
 * @model
 * @generated
 */
public interface CPreCondition extends CExpression {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see C.ecore.EcorePackage#getCPreCondition_Predicate()
	 * @model
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link C.ecore.CPreCondition#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

} // CPreCondition
