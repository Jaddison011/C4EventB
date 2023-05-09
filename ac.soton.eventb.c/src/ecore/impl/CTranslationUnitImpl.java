/**
 */
package ecore.impl;

import ecore.CHeaderFile;
import ecore.CSourceFile;
import ecore.CTranslationUnit;
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
 * An implementation of the model object '<em><b>CTranslation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.CTranslationUnitImpl#getSourceFiles <em>Source Files</em>}</li>
 *   <li>{@link ecore.impl.CTranslationUnitImpl#getHeaderFiles <em>Header Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CTranslationUnitImpl extends CNamedElementImpl implements CTranslationUnit {
	/**
	 * The cached value of the '{@link #getSourceFiles() <em>Source Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<CSourceFile> sourceFiles;

	/**
	 * The cached value of the '{@link #getHeaderFiles() <em>Header Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<CHeaderFile> headerFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CTranslationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.CTRANSLATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSourceFile> getSourceFiles() {
		if (sourceFiles == null) {
			sourceFiles = new EObjectContainmentEList<CSourceFile>(CSourceFile.class, this, EcorePackage.CTRANSLATION_UNIT__SOURCE_FILES);
		}
		return sourceFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CHeaderFile> getHeaderFiles() {
		if (headerFiles == null) {
			headerFiles = new EObjectContainmentEList<CHeaderFile>(CHeaderFile.class, this, EcorePackage.CTRANSLATION_UNIT__HEADER_FILES);
		}
		return headerFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.CTRANSLATION_UNIT__SOURCE_FILES:
				return ((InternalEList<?>)getSourceFiles()).basicRemove(otherEnd, msgs);
			case EcorePackage.CTRANSLATION_UNIT__HEADER_FILES:
				return ((InternalEList<?>)getHeaderFiles()).basicRemove(otherEnd, msgs);
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
			case EcorePackage.CTRANSLATION_UNIT__SOURCE_FILES:
				return getSourceFiles();
			case EcorePackage.CTRANSLATION_UNIT__HEADER_FILES:
				return getHeaderFiles();
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
			case EcorePackage.CTRANSLATION_UNIT__SOURCE_FILES:
				getSourceFiles().clear();
				getSourceFiles().addAll((Collection<? extends CSourceFile>)newValue);
				return;
			case EcorePackage.CTRANSLATION_UNIT__HEADER_FILES:
				getHeaderFiles().clear();
				getHeaderFiles().addAll((Collection<? extends CHeaderFile>)newValue);
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
			case EcorePackage.CTRANSLATION_UNIT__SOURCE_FILES:
				getSourceFiles().clear();
				return;
			case EcorePackage.CTRANSLATION_UNIT__HEADER_FILES:
				getHeaderFiles().clear();
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
			case EcorePackage.CTRANSLATION_UNIT__SOURCE_FILES:
				return sourceFiles != null && !sourceFiles.isEmpty();
			case EcorePackage.CTRANSLATION_UNIT__HEADER_FILES:
				return headerFiles != null && !headerFiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CTranslationUnitImpl
