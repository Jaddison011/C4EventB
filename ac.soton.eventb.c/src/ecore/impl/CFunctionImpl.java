/**
 */
package ecore.impl;

import ecore.CExpression;
import ecore.CFunction;
import ecore.EcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.CFunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ecore.impl.CFunctionImpl#getReturnStatement <em>Return Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CFunctionImpl extends CSubProgramImpl implements CFunction {
	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnStatement() <em>Return Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnStatement()
	 * @generated
	 * @ordered
	 */
	protected CExpression returnStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.CFUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.CFUNCTION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CExpression getReturnStatement() {
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnStatement(CExpression newReturnStatement, NotificationChain msgs) {
		CExpression oldReturnStatement = returnStatement;
		returnStatement = newReturnStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcorePackage.CFUNCTION__RETURN_STATEMENT, oldReturnStatement, newReturnStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnStatement(CExpression newReturnStatement) {
		if (newReturnStatement != returnStatement) {
			NotificationChain msgs = null;
			if (returnStatement != null)
				msgs = ((InternalEObject)returnStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcorePackage.CFUNCTION__RETURN_STATEMENT, null, msgs);
			if (newReturnStatement != null)
				msgs = ((InternalEObject)newReturnStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcorePackage.CFUNCTION__RETURN_STATEMENT, null, msgs);
			msgs = basicSetReturnStatement(newReturnStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.CFUNCTION__RETURN_STATEMENT, newReturnStatement, newReturnStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.CFUNCTION__RETURN_STATEMENT:
				return basicSetReturnStatement(null, msgs);
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
			case EcorePackage.CFUNCTION__RETURN_TYPE:
				return getReturnType();
			case EcorePackage.CFUNCTION__RETURN_STATEMENT:
				return getReturnStatement();
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
			case EcorePackage.CFUNCTION__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case EcorePackage.CFUNCTION__RETURN_STATEMENT:
				setReturnStatement((CExpression)newValue);
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
			case EcorePackage.CFUNCTION__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case EcorePackage.CFUNCTION__RETURN_STATEMENT:
				setReturnStatement((CExpression)null);
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
			case EcorePackage.CFUNCTION__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case EcorePackage.CFUNCTION__RETURN_STATEMENT:
				return returnStatement != null;
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
		result.append(" (returnType: ");
		result.append(returnType);
		result.append(')');
		return result.toString();
	}

} //CFunctionImpl
