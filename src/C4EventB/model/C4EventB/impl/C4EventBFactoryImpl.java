/**
 */
package C4EventB.model.C4EventB.impl;

import C4EventB.model.C4EventB.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class C4EventBFactoryImpl extends EFactoryImpl implements C4EventBFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static C4EventBFactory init() {
		try {
			C4EventBFactory theC4EventBFactory = (C4EventBFactory)EPackage.Registry.INSTANCE.getEFactory(C4EventBPackage.eNS_URI);
			if (theC4EventBFactory != null) {
				return theC4EventBFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new C4EventBFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4EventBFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case C4EventBPackage.CNAMED_ELEMENT: return createCNamedElement();
			case C4EventBPackage.CTYPE: return createCType();
			case C4EventBPackage.CVARIABLE: return createCVariable();
			case C4EventBPackage.CSTRUCT: return createCStruct();
			case C4EventBPackage.CFIELD: return createCField();
			case C4EventBPackage.CENUMERATION: return createCEnumeration();
			case C4EventBPackage.CENUM_PROPERTIES: return createCEnumProperties();
			case C4EventBPackage.CARRAY: return createCArray();
			case C4EventBPackage.CARRAY_ELEMENT: return createCArrayElement();
			case C4EventBPackage.CPOINTER: return createCPointer();
			case C4EventBPackage.CEXPRESSION: return createCExpression();
			case C4EventBPackage.CSUB_PROGRAM: return createCSubProgram();
			case C4EventBPackage.CDERIVED_TYPE: return createCDerivedType();
			case C4EventBPackage.CDISCRETE_TYPE: return createCDiscreteType();
			case C4EventBPackage.CPARAMETER: return createCParameter();
			case C4EventBPackage.CFUNCTION: return createCFunction();
			case C4EventBPackage.CPROCEDURE: return createCProcedure();
			case C4EventBPackage.CTRANSLATION_UNIT: return createCTranslationUnit();
			case C4EventBPackage.CSOURCE_FILE: return createCSourceFile();
			case C4EventBPackage.CHEADER_FILE: return createCHeaderFile();
			case C4EventBPackage.CINCLUDE_DIRECTIVE: return createCIncludeDirective();
			case C4EventBPackage.CFILE: return createCFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNamedElement createCNamedElement() {
		CNamedElementImpl cNamedElement = new CNamedElementImpl();
		return cNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CType createCType() {
		CTypeImpl cType = new CTypeImpl();
		return cType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVariable createCVariable() {
		CVariableImpl cVariable = new CVariableImpl();
		return cVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CStruct createCStruct() {
		CStructImpl cStruct = new CStructImpl();
		return cStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CField createCField() {
		CFieldImpl cField = new CFieldImpl();
		return cField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEnumeration createCEnumeration() {
		CEnumerationImpl cEnumeration = new CEnumerationImpl();
		return cEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CEnumProperties createCEnumProperties() {
		CEnumPropertiesImpl cEnumProperties = new CEnumPropertiesImpl();
		return cEnumProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CArray createCArray() {
		CArrayImpl cArray = new CArrayImpl();
		return cArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CArrayElement createCArrayElement() {
		CArrayElementImpl cArrayElement = new CArrayElementImpl();
		return cArrayElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPointer createCPointer() {
		CPointerImpl cPointer = new CPointerImpl();
		return cPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CExpression createCExpression() {
		CExpressionImpl cExpression = new CExpressionImpl();
		return cExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSubProgram createCSubProgram() {
		CSubProgramImpl cSubProgram = new CSubProgramImpl();
		return cSubProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDerivedType createCDerivedType() {
		CDerivedTypeImpl cDerivedType = new CDerivedTypeImpl();
		return cDerivedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDiscreteType createCDiscreteType() {
		CDiscreteTypeImpl cDiscreteType = new CDiscreteTypeImpl();
		return cDiscreteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CParameter createCParameter() {
		CParameterImpl cParameter = new CParameterImpl();
		return cParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFunction createCFunction() {
		CFunctionImpl cFunction = new CFunctionImpl();
		return cFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CProcedure createCProcedure() {
		CProcedureImpl cProcedure = new CProcedureImpl();
		return cProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTranslationUnit createCTranslationUnit() {
		CTranslationUnitImpl cTranslationUnit = new CTranslationUnitImpl();
		return cTranslationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSourceFile createCSourceFile() {
		CSourceFileImpl cSourceFile = new CSourceFileImpl();
		return cSourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHeaderFile createCHeaderFile() {
		CHeaderFileImpl cHeaderFile = new CHeaderFileImpl();
		return cHeaderFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIncludeDirective createCIncludeDirective() {
		CIncludeDirectiveImpl cIncludeDirective = new CIncludeDirectiveImpl();
		return cIncludeDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFile createCFile() {
		CFileImpl cFile = new CFileImpl();
		return cFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public C4EventBPackage getC4EventBPackage() {
		return (C4EventBPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static C4EventBPackage getPackage() {
		return C4EventBPackage.eINSTANCE;
	}

} //C4EventBFactoryImpl
