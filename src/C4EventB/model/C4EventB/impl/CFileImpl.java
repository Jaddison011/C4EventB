/**
 */
package C4EventB.model.C4EventB.impl;

import C4EventB.model.C4EventB.C4EventBPackage;
import C4EventB.model.C4EventB.CFile;
import C4EventB.model.C4EventB.CSubProgram;
import C4EventB.model.C4EventB.CVariable;

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
 *   <li>{@link C4EventB.model.C4EventB.impl.CFileImpl#getSubPrograms <em>Sub Programs</em>}</li>
 *   <li>{@link C4EventB.model.C4EventB.impl.CFileImpl#getGlobalVariables <em>Global Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CFileImpl extends CNamedElementImpl implements CFile {
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
		return C4EventBPackage.Literals.CFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSubProgram> getSubPrograms() {
		if (subPrograms == null) {
			subPrograms = new EObjectContainmentEList<CSubProgram>(CSubProgram.class, this, C4EventBPackage.CFILE__SUB_PROGRAMS);
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
			globalVariables = new EObjectContainmentEList<CVariable>(CVariable.class, this, C4EventBPackage.CFILE__GLOBAL_VARIABLES);
		}
		return globalVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case C4EventBPackage.CFILE__SUB_PROGRAMS:
				return ((InternalEList<?>)getSubPrograms()).basicRemove(otherEnd, msgs);
			case C4EventBPackage.CFILE__GLOBAL_VARIABLES:
				return ((InternalEList<?>)getGlobalVariables()).basicRemove(otherEnd, msgs);
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
			case C4EventBPackage.CFILE__SUB_PROGRAMS:
				return getSubPrograms();
			case C4EventBPackage.CFILE__GLOBAL_VARIABLES:
				return getGlobalVariables();
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
			case C4EventBPackage.CFILE__SUB_PROGRAMS:
				getSubPrograms().clear();
				getSubPrograms().addAll((Collection<? extends CSubProgram>)newValue);
				return;
			case C4EventBPackage.CFILE__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
				getGlobalVariables().addAll((Collection<? extends CVariable>)newValue);
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
			case C4EventBPackage.CFILE__SUB_PROGRAMS:
				getSubPrograms().clear();
				return;
			case C4EventBPackage.CFILE__GLOBAL_VARIABLES:
				getGlobalVariables().clear();
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
			case C4EventBPackage.CFILE__SUB_PROGRAMS:
				return subPrograms != null && !subPrograms.isEmpty();
			case C4EventBPackage.CFILE__GLOBAL_VARIABLES:
				return globalVariables != null && !globalVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CFileImpl
