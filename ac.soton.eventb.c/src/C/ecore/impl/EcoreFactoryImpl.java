/**
 */
package C.ecore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import C.ecore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreFactoryImpl extends EFactoryImpl implements EcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreFactory init() {
		try {
			EcoreFactory theEcoreFactory = (EcoreFactory)EPackage.Registry.INSTANCE.getEFactory(EcorePackage.eNS_URI);
			if (theEcoreFactory != null) {
				return theEcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactoryImpl() {
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
			case EcorePackage.CNAMED_ELEMENT: return createCNamedElement();
			case EcorePackage.CTYPE: return createCType();
			case EcorePackage.CVARIABLE: return createCVariable();
			case EcorePackage.CSTRUCT: return createCStruct();
			case EcorePackage.CFIELD: return createCField();
			case EcorePackage.CENUMERATION: return createCEnumeration();
			case EcorePackage.CENUM_PROPERTIES: return createCEnumProperties();
			case EcorePackage.CARRAY: return createCArray();
			case EcorePackage.CARRAY_ELEMENT: return createCArrayElement();
			case EcorePackage.CPOINTER: return createCPointer();
			case EcorePackage.CEXPRESSION: return createCExpression();
			case EcorePackage.CSUB_PROGRAM: return createCSubProgram();
			case EcorePackage.CDERIVED_TYPE: return createCDerivedType();
			case EcorePackage.CDISCRETE_TYPE: return createCDiscreteType();
			case EcorePackage.CPARAMETER: return createCParameter();
			case EcorePackage.CFUNCTION: return createCFunction();
			case EcorePackage.CPROCEDURE: return createCProcedure();
			case EcorePackage.CTRANSLATION_UNIT: return createCTranslationUnit();
			case EcorePackage.CSOURCE_FILE: return createCSourceFile();
			case EcorePackage.CHEADER_FILE: return createCHeaderFile();
			case EcorePackage.CINCLUDE_DIRECTIVE: return createCIncludeDirective();
			case EcorePackage.CFILE: return createCFile();
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
	public EcorePackage getEcorePackage() {
		return (EcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcorePackage getPackage() {
		return EcorePackage.eINSTANCE;
	}

} //EcoreFactoryImpl
