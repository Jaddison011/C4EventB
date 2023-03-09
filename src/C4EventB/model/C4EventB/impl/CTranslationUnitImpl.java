/**
 */
package C4EventB.model.C4EventB.impl;

import C4EventB.model.C4EventB.C4EventBPackage;
import C4EventB.model.C4EventB.CHeaderFile;
import C4EventB.model.C4EventB.CSourceFile;
import C4EventB.model.C4EventB.CSubProgram;
import C4EventB.model.C4EventB.CTranslationUnit;

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
 *   <li>{@link C4EventB.model.C4EventB.impl.CTranslationUnitImpl#getSourceFiles <em>Source Files</em>}</li>
 *   <li>{@link C4EventB.model.C4EventB.impl.CTranslationUnitImpl#getSubPrograms <em>Sub Programs</em>}</li>
 *   <li>{@link C4EventB.model.C4EventB.impl.CTranslationUnitImpl#getHeaderFiles <em>Header Files</em>}</li>
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
	 * The cached value of the '{@link #getSubPrograms() <em>Sub Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<CSubProgram> subPrograms;

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
		return C4EventBPackage.Literals.CTRANSLATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSourceFile> getSourceFiles() {
		if (sourceFiles == null) {
			sourceFiles = new EObjectContainmentEList<CSourceFile>(CSourceFile.class, this, C4EventBPackage.CTRANSLATION_UNIT__SOURCE_FILES);
		}
		return sourceFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSubProgram> getSubPrograms() {
		if (subPrograms == null) {
			subPrograms = new EObjectContainmentEList<CSubProgram>(CSubProgram.class, this, C4EventBPackage.CTRANSLATION_UNIT__SUB_PROGRAMS);
		}
		return subPrograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CHeaderFile> getHeaderFiles() {
		if (headerFiles == null) {
			headerFiles = new EObjectContainmentEList<CHeaderFile>(CHeaderFile.class, this, C4EventBPackage.CTRANSLATION_UNIT__HEADER_FILES);
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
			case C4EventBPackage.CTRANSLATION_UNIT__SOURCE_FILES:
				return ((InternalEList<?>)getSourceFiles()).basicRemove(otherEnd, msgs);
			case C4EventBPackage.CTRANSLATION_UNIT__SUB_PROGRAMS:
				return ((InternalEList<?>)getSubPrograms()).basicRemove(otherEnd, msgs);
			case C4EventBPackage.CTRANSLATION_UNIT__HEADER_FILES:
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
			case C4EventBPackage.CTRANSLATION_UNIT__SOURCE_FILES:
				return getSourceFiles();
			case C4EventBPackage.CTRANSLATION_UNIT__SUB_PROGRAMS:
				return getSubPrograms();
			case C4EventBPackage.CTRANSLATION_UNIT__HEADER_FILES:
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
			case C4EventBPackage.CTRANSLATION_UNIT__SOURCE_FILES:
				getSourceFiles().clear();
				getSourceFiles().addAll((Collection<? extends CSourceFile>)newValue);
				return;
			case C4EventBPackage.CTRANSLATION_UNIT__SUB_PROGRAMS:
				getSubPrograms().clear();
				getSubPrograms().addAll((Collection<? extends CSubProgram>)newValue);
				return;
			case C4EventBPackage.CTRANSLATION_UNIT__HEADER_FILES:
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
			case C4EventBPackage.CTRANSLATION_UNIT__SOURCE_FILES:
				getSourceFiles().clear();
				return;
			case C4EventBPackage.CTRANSLATION_UNIT__SUB_PROGRAMS:
				getSubPrograms().clear();
				return;
			case C4EventBPackage.CTRANSLATION_UNIT__HEADER_FILES:
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
			case C4EventBPackage.CTRANSLATION_UNIT__SOURCE_FILES:
				return sourceFiles != null && !sourceFiles.isEmpty();
			case C4EventBPackage.CTRANSLATION_UNIT__SUB_PROGRAMS:
				return subPrograms != null && !subPrograms.isEmpty();
			case C4EventBPackage.CTRANSLATION_UNIT__HEADER_FILES:
				return headerFiles != null && !headerFiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CTranslationUnitImpl
