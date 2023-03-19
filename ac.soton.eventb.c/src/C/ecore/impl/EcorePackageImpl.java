/**
 */
package C.ecore.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import C.ecore.CArray;
import C.ecore.CArrayElement;
import C.ecore.CArrayVariable;
import C.ecore.CDerivedType;
import C.ecore.CDiscreteType;
import C.ecore.CEnumProperties;
import C.ecore.CEnumeration;
import C.ecore.CExpression;
import C.ecore.CField;
import C.ecore.CFile;
import C.ecore.CFunction;
import C.ecore.CHeaderFile;
import C.ecore.CIncludeDirective;
import C.ecore.CNamedElement;
import C.ecore.CParameter;
import C.ecore.CPointer;
import C.ecore.CPreCondition;
import C.ecore.CProcedure;
import C.ecore.CSourceFile;
import C.ecore.CStruct;
import C.ecore.CSubProgram;
import C.ecore.CTranslationUnit;
import C.ecore.CType;
import C.ecore.CVariable;
import C.ecore.EcoreFactory;
import C.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcorePackageImpl extends EPackageImpl implements EcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cStructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEnumPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cArrayElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cPointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSubProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cDerivedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cDiscreteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cTranslationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cSourceFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cHeaderFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cIncludeDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cArrayVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cPreConditionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see C.ecore.EcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorePackageImpl() {
		super(eNS_URI, EcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcorePackage init() {
		if (isInited) return (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEcorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EcorePackageImpl theEcorePackage = registeredEcorePackage instanceof EcorePackageImpl ? (EcorePackageImpl)registeredEcorePackage : new EcorePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, theEcorePackage);
		return theEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCNamedElement() {
		return cNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCNamedElement_Name() {
		return (EAttribute)cNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCNamedElement_Endname() {
		return (EAttribute)cNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCType() {
		return cTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVariable() {
		return cVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCVariable_Value() {
		return (EAttribute)cVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCVariable_Type() {
		return (EAttribute)cVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCVariable_IsConstant() {
		return (EAttribute)cVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCStruct() {
		return cStructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCStruct_Type() {
		return (EAttribute)cStructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCStruct_Fields() {
		return (EReference)cStructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCField() {
		return cFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEnumeration() {
		return cEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCEnumeration_EnumProperties() {
		return (EReference)cEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCEnumProperties() {
		return cEnumPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCEnumProperties_IntegralConstant() {
		return (EAttribute)cEnumPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCArray() {
		return cArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCArray_ElementType() {
		return (EAttribute)cArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCArray_Size() {
		return (EAttribute)cArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCArray_ArrayElements() {
		return (EReference)cArrayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCArrayElement() {
		return cArrayElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCArrayElement_Index() {
		return (EAttribute)cArrayElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCArrayElement_Value() {
		return (EAttribute)cArrayElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPointer() {
		return cPointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCExpression() {
		return cExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCExpression_Expression() {
		return (EAttribute)cExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSubProgram() {
		return cSubProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSubProgram_Parameters() {
		return (EReference)cSubProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSubProgram_LocalVariables() {
		return (EReference)cSubProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSubProgram_Body() {
		return (EReference)cSubProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSubProgram_Preconditions() {
		return (EReference)cSubProgramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDerivedType() {
		return cDerivedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDerivedType_SuperType() {
		return (EReference)cDerivedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDiscreteType() {
		return cDiscreteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCParameter() {
		return cParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCParameter_Type() {
		return (EAttribute)cParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFunction() {
		return cFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCFunction_ReturnType() {
		return (EAttribute)cFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCProcedure() {
		return cProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTranslationUnit() {
		return cTranslationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTranslationUnit_SourceFiles() {
		return (EReference)cTranslationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTranslationUnit_HeaderFiles() {
		return (EReference)cTranslationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSourceFile() {
		return cSourceFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSourceFile_IncludeDirectives() {
		return (EReference)cSourceFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCHeaderFile() {
		return cHeaderFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCIncludeDirective() {
		return cIncludeDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCIncludeDirective_Header() {
		return (EAttribute)cIncludeDirectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCFile() {
		return cFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFile_SubPrograms() {
		return (EReference)cFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFile_GlobalVariables() {
		return (EReference)cFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCFile_Types() {
		return (EReference)cFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCArrayVariable() {
		return cArrayVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPreCondition() {
		return cPreConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPreCondition_Predicate() {
		return (EAttribute)cPreConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactory getEcoreFactory() {
		return (EcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cNamedElementEClass = createEClass(CNAMED_ELEMENT);
		createEAttribute(cNamedElementEClass, CNAMED_ELEMENT__NAME);
		createEAttribute(cNamedElementEClass, CNAMED_ELEMENT__ENDNAME);

		cTypeEClass = createEClass(CTYPE);

		cVariableEClass = createEClass(CVARIABLE);
		createEAttribute(cVariableEClass, CVARIABLE__VALUE);
		createEAttribute(cVariableEClass, CVARIABLE__TYPE);
		createEAttribute(cVariableEClass, CVARIABLE__IS_CONSTANT);

		cStructEClass = createEClass(CSTRUCT);
		createEAttribute(cStructEClass, CSTRUCT__TYPE);
		createEReference(cStructEClass, CSTRUCT__FIELDS);

		cFieldEClass = createEClass(CFIELD);

		cEnumerationEClass = createEClass(CENUMERATION);
		createEReference(cEnumerationEClass, CENUMERATION__ENUM_PROPERTIES);

		cEnumPropertiesEClass = createEClass(CENUM_PROPERTIES);
		createEAttribute(cEnumPropertiesEClass, CENUM_PROPERTIES__INTEGRAL_CONSTANT);

		cArrayEClass = createEClass(CARRAY);
		createEAttribute(cArrayEClass, CARRAY__ELEMENT_TYPE);
		createEAttribute(cArrayEClass, CARRAY__SIZE);
		createEReference(cArrayEClass, CARRAY__ARRAY_ELEMENTS);

		cArrayElementEClass = createEClass(CARRAY_ELEMENT);
		createEAttribute(cArrayElementEClass, CARRAY_ELEMENT__INDEX);
		createEAttribute(cArrayElementEClass, CARRAY_ELEMENT__VALUE);

		cPointerEClass = createEClass(CPOINTER);

		cExpressionEClass = createEClass(CEXPRESSION);
		createEAttribute(cExpressionEClass, CEXPRESSION__EXPRESSION);

		cSubProgramEClass = createEClass(CSUB_PROGRAM);
		createEReference(cSubProgramEClass, CSUB_PROGRAM__PARAMETERS);
		createEReference(cSubProgramEClass, CSUB_PROGRAM__LOCAL_VARIABLES);
		createEReference(cSubProgramEClass, CSUB_PROGRAM__BODY);
		createEReference(cSubProgramEClass, CSUB_PROGRAM__PRECONDITIONS);

		cDerivedTypeEClass = createEClass(CDERIVED_TYPE);
		createEReference(cDerivedTypeEClass, CDERIVED_TYPE__SUPER_TYPE);

		cDiscreteTypeEClass = createEClass(CDISCRETE_TYPE);

		cParameterEClass = createEClass(CPARAMETER);
		createEAttribute(cParameterEClass, CPARAMETER__TYPE);

		cFunctionEClass = createEClass(CFUNCTION);
		createEAttribute(cFunctionEClass, CFUNCTION__RETURN_TYPE);

		cProcedureEClass = createEClass(CPROCEDURE);

		cTranslationUnitEClass = createEClass(CTRANSLATION_UNIT);
		createEReference(cTranslationUnitEClass, CTRANSLATION_UNIT__SOURCE_FILES);
		createEReference(cTranslationUnitEClass, CTRANSLATION_UNIT__HEADER_FILES);

		cSourceFileEClass = createEClass(CSOURCE_FILE);
		createEReference(cSourceFileEClass, CSOURCE_FILE__INCLUDE_DIRECTIVES);

		cHeaderFileEClass = createEClass(CHEADER_FILE);

		cIncludeDirectiveEClass = createEClass(CINCLUDE_DIRECTIVE);
		createEAttribute(cIncludeDirectiveEClass, CINCLUDE_DIRECTIVE__HEADER);

		cFileEClass = createEClass(CFILE);
		createEReference(cFileEClass, CFILE__SUB_PROGRAMS);
		createEReference(cFileEClass, CFILE__GLOBAL_VARIABLES);
		createEReference(cFileEClass, CFILE__TYPES);

		cArrayVariableEClass = createEClass(CARRAY_VARIABLE);

		cPreConditionEClass = createEClass(CPRE_CONDITION);
		createEAttribute(cPreConditionEClass, CPRE_CONDITION__PREDICATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cTypeEClass.getESuperTypes().add(this.getCNamedElement());
		cVariableEClass.getESuperTypes().add(this.getCNamedElement());
		cStructEClass.getESuperTypes().add(this.getCDerivedType());
		cFieldEClass.getESuperTypes().add(this.getCNamedElement());
		cFieldEClass.getESuperTypes().add(this.getCType());
		cEnumerationEClass.getESuperTypes().add(this.getCDiscreteType());
		cEnumPropertiesEClass.getESuperTypes().add(this.getCNamedElement());
		cArrayEClass.getESuperTypes().add(this.getCDerivedType());
		cArrayElementEClass.getESuperTypes().add(this.getCNamedElement());
		cPointerEClass.getESuperTypes().add(this.getCDerivedType());
		cSubProgramEClass.getESuperTypes().add(this.getCNamedElement());
		cDerivedTypeEClass.getESuperTypes().add(this.getCType());
		cDiscreteTypeEClass.getESuperTypes().add(this.getCType());
		cParameterEClass.getESuperTypes().add(this.getCNamedElement());
		cFunctionEClass.getESuperTypes().add(this.getCSubProgram());
		cProcedureEClass.getESuperTypes().add(this.getCSubProgram());
		cTranslationUnitEClass.getESuperTypes().add(this.getCNamedElement());
		cSourceFileEClass.getESuperTypes().add(this.getCFile());
		cHeaderFileEClass.getESuperTypes().add(this.getCFile());
		cIncludeDirectiveEClass.getESuperTypes().add(this.getCNamedElement());
		cFileEClass.getESuperTypes().add(this.getCNamedElement());
		cArrayVariableEClass.getESuperTypes().add(this.getCVariable());
		cArrayVariableEClass.getESuperTypes().add(this.getCArray());
		cPreConditionEClass.getESuperTypes().add(this.getCExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(cNamedElementEClass, CNamedElement.class, "CNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCNamedElement_Endname(), ecorePackage.getEString(), "endname", null, 0, 1, CNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cTypeEClass, CType.class, "CType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cVariableEClass, CVariable.class, "CVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, CVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, CVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCVariable_IsConstant(), ecorePackage.getEBoolean(), "isConstant", "false", 0, 1, CVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cStructEClass, CStruct.class, "CStruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCStruct_Type(), ecorePackage.getEString(), "type", null, 0, 1, CStruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCStruct_Fields(), this.getCField(), null, "fields", null, 0, -1, CStruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cFieldEClass, CField.class, "CField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cEnumerationEClass, CEnumeration.class, "CEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCEnumeration_EnumProperties(), this.getCEnumProperties(), null, "enumProperties", null, 0, -1, CEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEnumPropertiesEClass, CEnumProperties.class, "CEnumProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCEnumProperties_IntegralConstant(), ecorePackage.getEInt(), "integralConstant", null, 0, 1, CEnumProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cArrayEClass, CArray.class, "CArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCArray_ElementType(), ecorePackage.getEString(), "elementType", null, 0, 1, CArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCArray_Size(), ecorePackage.getEInt(), "size", null, 0, 1, CArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCArray_ArrayElements(), this.getCArrayElement(), null, "arrayElements", null, 0, -1, CArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cArrayElementEClass, CArrayElement.class, "CArrayElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCArrayElement_Index(), ecorePackage.getEInt(), "index", null, 0, 1, CArrayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCArrayElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, CArrayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cPointerEClass, CPointer.class, "CPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cExpressionEClass, CExpression.class, "CExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCExpression_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, CExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSubProgramEClass, CSubProgram.class, "CSubProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSubProgram_Parameters(), this.getCParameter(), null, "parameters", null, 0, -1, CSubProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSubProgram_LocalVariables(), this.getCVariable(), null, "localVariables", null, 0, -1, CSubProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSubProgram_Body(), this.getCExpression(), null, "body", null, 0, -1, CSubProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSubProgram_Preconditions(), this.getCPreCondition(), null, "preconditions", null, 0, -1, CSubProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cDerivedTypeEClass, CDerivedType.class, "CDerivedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDerivedType_SuperType(), this.getCType(), null, "superType", null, 0, 1, CDerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cDiscreteTypeEClass, CDiscreteType.class, "CDiscreteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cParameterEClass, CParameter.class, "CParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, CParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cFunctionEClass, CFunction.class, "CFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCFunction_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, CFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cProcedureEClass, CProcedure.class, "CProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cTranslationUnitEClass, CTranslationUnit.class, "CTranslationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCTranslationUnit_SourceFiles(), this.getCSourceFile(), null, "sourceFiles", null, 0, -1, CTranslationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTranslationUnit_HeaderFiles(), this.getCHeaderFile(), null, "headerFiles", null, 0, -1, CTranslationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cSourceFileEClass, CSourceFile.class, "CSourceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSourceFile_IncludeDirectives(), this.getCIncludeDirective(), null, "includeDirectives", null, 0, -1, CSourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cHeaderFileEClass, CHeaderFile.class, "CHeaderFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cIncludeDirectiveEClass, CIncludeDirective.class, "CIncludeDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCIncludeDirective_Header(), ecorePackage.getEString(), "header", null, 0, 1, CIncludeDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cFileEClass, CFile.class, "CFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCFile_SubPrograms(), this.getCSubProgram(), null, "subPrograms", null, 0, -1, CFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCFile_GlobalVariables(), this.getCVariable(), null, "globalVariables", null, 0, -1, CFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCFile_Types(), this.getCType(), null, "types", null, 0, -1, CFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cArrayVariableEClass, CArrayVariable.class, "CArrayVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cPreConditionEClass, CPreCondition.class, "CPreCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPreCondition_Predicate(), ecorePackage.getEString(), "predicate", null, 0, 1, CPreCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EcorePackageImpl
