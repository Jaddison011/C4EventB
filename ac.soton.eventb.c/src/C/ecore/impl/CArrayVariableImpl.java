/**
 */
package C.ecore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import C.ecore.CArray;
import C.ecore.CArrayElement;
import C.ecore.CArrayVariable;
import C.ecore.CDerivedType;
import C.ecore.CType;
import C.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CArray Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link C.ecore.impl.CArrayVariableImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link C.ecore.impl.CArrayVariableImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link C.ecore.impl.CArrayVariableImpl#getSize <em>Size</em>}</li>
 *   <li>{@link C.ecore.impl.CArrayVariableImpl#getArrayElements <em>Array Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CArrayVariableImpl extends CVariableImpl implements CArrayVariable {
	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected CType superType;

	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected String elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrayElements() <em>Array Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CArrayElement> arrayElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CArrayVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.CARRAY_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CType getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (CType)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.CARRAY_VARIABLE__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CType basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(CType newSuperType) {
		CType oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.CARRAY_VARIABLE__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(String newElementType) {
		String oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.CARRAY_VARIABLE__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.CARRAY_VARIABLE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CArrayElement> getArrayElements() {
		if (arrayElements == null) {
			arrayElements = new EObjectContainmentEList<CArrayElement>(CArrayElement.class, this, EcorePackage.CARRAY_VARIABLE__ARRAY_ELEMENTS);
		}
		return arrayElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.CARRAY_VARIABLE__ARRAY_ELEMENTS:
				return ((InternalEList<?>)getArrayElements()).basicRemove(otherEnd, msgs);
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
			case EcorePackage.CARRAY_VARIABLE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case EcorePackage.CARRAY_VARIABLE__ELEMENT_TYPE:
				return getElementType();
			case EcorePackage.CARRAY_VARIABLE__SIZE:
				return getSize();
			case EcorePackage.CARRAY_VARIABLE__ARRAY_ELEMENTS:
				return getArrayElements();
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
			case EcorePackage.CARRAY_VARIABLE__SUPER_TYPE:
				setSuperType((CType)newValue);
				return;
			case EcorePackage.CARRAY_VARIABLE__ELEMENT_TYPE:
				setElementType((String)newValue);
				return;
			case EcorePackage.CARRAY_VARIABLE__SIZE:
				setSize((Integer)newValue);
				return;
			case EcorePackage.CARRAY_VARIABLE__ARRAY_ELEMENTS:
				getArrayElements().clear();
				getArrayElements().addAll((Collection<? extends CArrayElement>)newValue);
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
			case EcorePackage.CARRAY_VARIABLE__SUPER_TYPE:
				setSuperType((CType)null);
				return;
			case EcorePackage.CARRAY_VARIABLE__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case EcorePackage.CARRAY_VARIABLE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case EcorePackage.CARRAY_VARIABLE__ARRAY_ELEMENTS:
				getArrayElements().clear();
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
			case EcorePackage.CARRAY_VARIABLE__SUPER_TYPE:
				return superType != null;
			case EcorePackage.CARRAY_VARIABLE__ELEMENT_TYPE:
				return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
			case EcorePackage.CARRAY_VARIABLE__SIZE:
				return size != SIZE_EDEFAULT;
			case EcorePackage.CARRAY_VARIABLE__ARRAY_ELEMENTS:
				return arrayElements != null && !arrayElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CDerivedType.class) {
			switch (derivedFeatureID) {
				case EcorePackage.CARRAY_VARIABLE__SUPER_TYPE: return EcorePackage.CDERIVED_TYPE__SUPER_TYPE;
				default: return -1;
			}
		}
		if (baseClass == CArray.class) {
			switch (derivedFeatureID) {
				case EcorePackage.CARRAY_VARIABLE__ELEMENT_TYPE: return EcorePackage.CARRAY__ELEMENT_TYPE;
				case EcorePackage.CARRAY_VARIABLE__SIZE: return EcorePackage.CARRAY__SIZE;
				case EcorePackage.CARRAY_VARIABLE__ARRAY_ELEMENTS: return EcorePackage.CARRAY__ARRAY_ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CDerivedType.class) {
			switch (baseFeatureID) {
				case EcorePackage.CDERIVED_TYPE__SUPER_TYPE: return EcorePackage.CARRAY_VARIABLE__SUPER_TYPE;
				default: return -1;
			}
		}
		if (baseClass == CArray.class) {
			switch (baseFeatureID) {
				case EcorePackage.CARRAY__ELEMENT_TYPE: return EcorePackage.CARRAY_VARIABLE__ELEMENT_TYPE;
				case EcorePackage.CARRAY__SIZE: return EcorePackage.CARRAY_VARIABLE__SIZE;
				case EcorePackage.CARRAY__ARRAY_ELEMENTS: return EcorePackage.CARRAY_VARIABLE__ARRAY_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (elementType: ");
		result.append(elementType);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //CArrayVariableImpl
