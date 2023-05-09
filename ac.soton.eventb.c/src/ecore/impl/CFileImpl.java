/**
 */
package ecore.impl;

import ecore.CFile;
import ecore.CSubProgram;
import ecore.CType;
import ecore.CVariable;
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
 * An implementation of the model object '<em><b>CFile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.CFileImpl#getSubPrograms <em>Sub Programs</em>}</li>
 *   <li>{@link ecore.impl.CFileImpl#getGlobalVariables <em>Global Variables</em>}</li>
 *   <li>{@link ecore.impl.CFileImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CFileImpl extends CNamedElementImpl implements CFile {
	/**
	 * The cached value of the '{@link #getSubPrograms() <em>Sub Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<CSubProgram> subPrograms;

	/**
	 * The cached value of the '{@link #getGlobalVariables() <em>Global Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<CVariable> globalVariables;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CType> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.CFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSubProgram> getSubPrograms() {
		if (subPrograms == null) {
			subPrograms = new EObjectContainmentEList<CSubProgram>(CSubProgram.class, this, EcorePackage.CFILE__SUB_PROGRAMS);
		}
		return subPrograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CVariable> getGlobalVariables() {
		if (globalVariables == null) {
			globalVariables = new EObjectContainmentEList<CVariable>(CVariable.class, this, EcorePackage.CFILE__GLOBAL_VARIABLES);
		}
		return globalVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CType>(CType.class, this, EcorePackage.CFILE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.CFILE__SUB_PROGRAMS:
				return ((InternalEList<?>)getSubPrograms()).basicRemove(otherEnd, msgs);
			case EcorePackage.CFILE__GLOBAL_VARIABLES:
				return ((InternalEList<?>)getGlobalVariables()).basicRemove(otherEnd, msgs);
			case EcorePackage.CFILE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case EcorePackage.CFILE__SUB_PROGRAMS:
				return getSubPrograms();
			case EcorePackage.CFILE__GLOBAL_VARIABLES:
				return getGlobalVariables();
			case EcorePackage.CFILE__TYPES:
				return getTypes();
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
			case EcorePackage.CFILE__SUB_PROGRAMS:
				getSubPrograms().clear();
				getSubPrograms().addAll((Collection<? extends CSubProgram>)newValue);
				return;
			case EcorePackage.CFILE__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				getGlobalVariables().addAll((Collection<? extends CVariable>)newValue);
				return;
			case EcorePackage.CFILE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CType>)newValue);
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
			case EcorePackage.CFILE__SUB_PROGRAMS:
				getSubPrograms().clear();
				return;
			case EcorePackage.CFILE__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				return;
			case EcorePackage.CFILE__TYPES:
				getTypes().clear();
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
			case EcorePackage.CFILE__SUB_PROGRAMS:
				return subPrograms != null && !subPrograms.isEmpty();
			case EcorePackage.CFILE__GLOBAL_VARIABLES:
				return globalVariables != null && !globalVariables.isEmpty();
			case EcorePackage.CFILE__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CFileImpl
