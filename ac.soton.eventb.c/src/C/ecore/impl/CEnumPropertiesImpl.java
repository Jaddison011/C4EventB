/**
 */
package C.ecore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import C.ecore.CEnumProperties;
import C.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CEnum Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link C.ecore.impl.CEnumPropertiesImpl#getIntegralConstant <em>Integral Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CEnumPropertiesImpl extends CNamedElementImpl implements CEnumProperties {
	/**
	 * The default value of the '{@link #getIntegralConstant() <em>Integral Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegralConstant()
	 * @generated
	 * @ordered
	 */
	protected static final int INTEGRAL_CONSTANT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntegralConstant() <em>Integral Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegralConstant()
	 * @generated
	 * @ordered
	 */
	protected int integralConstant = INTEGRAL_CONSTANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEnumPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.CENUM_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntegralConstant() {
		return integralConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegralConstant(int newIntegralConstant) {
		int oldIntegralConstant = integralConstant;
		integralConstant = newIntegralConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.CENUM_PROPERTIES__INTEGRAL_CONSTANT, oldIntegralConstant, integralConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.CENUM_PROPERTIES__INTEGRAL_CONSTANT:
				return getIntegralConstant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackage.CENUM_PROPERTIES__INTEGRAL_CONSTANT:
				setIntegralConstant((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcorePackage.CENUM_PROPERTIES__INTEGRAL_CONSTANT:
				setIntegralConstant(INTEGRAL_CONSTANT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcorePackage.CENUM_PROPERTIES__INTEGRAL_CONSTANT:
				return integralConstant != INTEGRAL_CONSTANT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (integralConstant: ");
		result.append(integralConstant);
		result.append(')');
		return result.toString();
	}

} //CEnumPropertiesImpl
