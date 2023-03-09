/**
 */
package C4EventB.model.C4EventB.impl;

import C4EventB.model.C4EventB.C4EventBPackage;
import C4EventB.model.C4EventB.CExpression;
import C4EventB.model.C4EventB.CParameter;
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
 * An implementation of the model object '<em><b>CSub Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link C4EventB.model.C4EventB.impl.CSubProgramImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link C4EventB.model.C4EventB.impl.CSubProgramImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link C4EventB.model.C4EventB.impl.CSubProgramImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSubProgramImpl extends CNamedElementImpl implements CSubProgram {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<CParameter> parameters;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<CVariable> localVariables;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<CExpression> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSubProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C4EventBPackage.Literals.CSUB_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<CParameter>(CParameter.class, this, C4EventBPackage.CSUB_PROGRAM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CVariable> getLocalVariables() {
		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<CVariable>(CVariable.class, this, C4EventBPackage.CSUB_PROGRAM__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CExpression> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<CExpression>(CExpression.class, this, C4EventBPackage.CSUB_PROGRAM__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case C4EventBPackage.CSUB_PROGRAM__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case C4EventBPackage.CSUB_PROGRAM__LOCAL_VARIABLES:
				return ((InternalEList<?>)getLocalVariables()).basicRemove(otherEnd, msgs);
			case C4EventBPackage.CSUB_PROGRAM__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
			case C4EventBPackage.CSUB_PROGRAM__PARAMETERS:
				return getParameters();
			case C4EventBPackage.CSUB_PROGRAM__LOCAL_VARIABLES:
				return getLocalVariables();
			case C4EventBPackage.CSUB_PROGRAM__BODY:
				return getBody();
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
			case C4EventBPackage.CSUB_PROGRAM__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends CParameter>)newValue);
				return;
			case C4EventBPackage.CSUB_PROGRAM__LOCAL_VARIABLES:
				getLocalVariables().clear();
				getLocalVariables().addAll((Collection<? extends CVariable>)newValue);
				return;
			case C4EventBPackage.CSUB_PROGRAM__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends CExpression>)newValue);
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
			case C4EventBPackage.CSUB_PROGRAM__PARAMETERS:
				getParameters().clear();
				return;
			case C4EventBPackage.CSUB_PROGRAM__LOCAL_VARIABLES:
				getLocalVariables().clear();
				return;
			case C4EventBPackage.CSUB_PROGRAM__BODY:
				getBody().clear();
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
			case C4EventBPackage.CSUB_PROGRAM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case C4EventBPackage.CSUB_PROGRAM__LOCAL_VARIABLES:
				return localVariables != null && !localVariables.isEmpty();
			case C4EventBPackage.CSUB_PROGRAM__BODY:
				return body != null && !body.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CSubProgramImpl
