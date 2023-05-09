/**
 */
package ecore.impl;

import ecore.CEnumProperties;
import ecore.CEnumeration;
import ecore.EcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CEnumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.CEnumerationImpl#getEnumProperties <em>Enum Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CEnumerationImpl extends CDiscreteTypeImpl implements CEnumeration {
	/**
	 * The cached value of the '{@link #getEnumProperties() <em>Enum Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<CEnumProperties> enumProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.CENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CEnumProperties> getEnumProperties() {
		if (enumProperties == null) {
			enumProperties = new EObjectContainmentEList<CEnumProperties>(CEnumProperties.class, this, EcorePackage.CENUMERATION__ENUM_PROPERTIES);
		}
		return enumProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.CENUMERATION__ENUM_PROPERTIES:
				return ((InternalEList<?>)getEnumProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.CENUMERATION__ENUM_PROPERTIES:
				return getEnumProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackage.CENUMERATION__ENUM_PROPERTIES:
				getEnumProperties().clear();
				getEnumProperties().addAll((Collection<? extends CEnumProperties>)newValue);
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
			case EcorePackage.CENUMERATION__ENUM_PROPERTIES:
				getEnumProperties().clear();
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
			case EcorePackage.CENUMERATION__ENUM_PROPERTIES:
				return enumProperties != null && !enumProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CEnumerationImpl
