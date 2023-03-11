/**
 */
package C.ecore.impl;

import C.ecore.CIncludeDirective;
import C.ecore.CSourceFile;
import C.ecore.EcorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSource File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link C.ecore.impl.CSourceFileImpl#getIncludeDirectives <em>Include Directives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSourceFileImpl extends CFileImpl implements CSourceFile {
	/**
	 * The cached value of the '{@link #getIncludeDirectives() <em>Include Directives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<CIncludeDirective> includeDirectives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSourceFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.CSOURCE_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CIncludeDirective> getIncludeDirectives() {
		if (includeDirectives == null) {
			includeDirectives = new EObjectContainmentEList<CIncludeDirective>(CIncludeDirective.class, this, EcorePackage.CSOURCE_FILE__INCLUDE_DIRECTIVES);
		}
		return includeDirectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.CSOURCE_FILE__INCLUDE_DIRECTIVES:
				return ((InternalEList<?>)getIncludeDirectives()).basicRemove(otherEnd, msgs);
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
			case EcorePackage.CSOURCE_FILE__INCLUDE_DIRECTIVES:
				return getIncludeDirectives();
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
			case EcorePackage.CSOURCE_FILE__INCLUDE_DIRECTIVES:
				getIncludeDirectives().clear();
				getIncludeDirectives().addAll((Collection<? extends CIncludeDirective>)newValue);
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
			case EcorePackage.CSOURCE_FILE__INCLUDE_DIRECTIVES:
				getIncludeDirectives().clear();
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
			case EcorePackage.CSOURCE_FILE__INCLUDE_DIRECTIVES:
				return includeDirectives != null && !includeDirectives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CSourceFileImpl
