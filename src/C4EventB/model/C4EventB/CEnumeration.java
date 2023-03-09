/**
 */
package C4EventB.model.C4EventB;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CEnumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link C4EventB.model.C4EventB.CEnumeration#getEnumProperties <em>Enum Properties</em>}</li>
 * </ul>
 *
 * @see C4EventB.model.C4EventB.C4EventBPackage#getCEnumeration()
 * @model
 * @generated
 */
public interface CEnumeration extends CDiscreteType {
	/**
	 * Returns the value of the '<em><b>Enum Properties</b></em>' containment reference list.
	 * The list contents are of type {@link C4EventB.model.C4EventB.CEnumProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Properties</em>' containment reference list.
	 * @see C4EventB.model.C4EventB.C4EventBPackage#getCEnumeration_EnumProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<CEnumProperties> getEnumProperties();

} // CEnumeration
