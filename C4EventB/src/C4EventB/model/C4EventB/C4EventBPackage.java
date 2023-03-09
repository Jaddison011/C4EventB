/**
 */
package C4EventB.model.C4EventB;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see C4EventB.model.C4EventB.C4EventBFactory
 * @model kind="package"
 * @generated
 */
public interface C4EventBPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "C4EventB";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ac/soton/eventb/c";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ac.soton.eventb.c";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	C4EventBPackage eINSTANCE = C4EventB.model.C4EventB.impl.C4EventBPackageImpl.init();

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CNamedElementImpl <em>CNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CNamedElementImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCNamedElement()
	 * @generated
	 */
	int CNAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAMED_ELEMENT__ENDNAME = 1;

	/**
	 * The number of structural features of the '<em>CNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CNAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CTypeImpl <em>CType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CTypeImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCType()
	 * @generated
	 */
	int CTYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTYPE__NAME = CNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTYPE__ENDNAME = CNAMED_ELEMENT__ENDNAME;

	/**
	 * The number of structural features of the '<em>CType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTYPE_FEATURE_COUNT = CNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTYPE_OPERATION_COUNT = CNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CVariableImpl <em>CVariable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CVariableImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCVariable()
	 * @generated
	 */
	int CVARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE__NAME = CNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE__ENDNAME = CNAMED_ELEMENT__ENDNAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE__VALUE = CNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE__TYPE = CNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE__IS_CONSTANT = CNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE_FEATURE_COUNT = CNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CVariable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARIABLE_OPERATION_COUNT = CNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CDerivedTypeImpl <em>CDerived Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CDerivedTypeImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCDerivedType()
	 * @generated
	 */
	int CDERIVED_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDERIVED_TYPE__NAME = CTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDERIVED_TYPE__ENDNAME = CTYPE__ENDNAME;

	/**
	 * The number of structural features of the '<em>CDerived Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDERIVED_TYPE_FEATURE_COUNT = CTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CDerived Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDERIVED_TYPE_OPERATION_COUNT = CTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CStructImpl <em>CStruct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CStructImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCStruct()
	 * @generated
	 */
	int CSTRUCT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCT__NAME = CDERIVED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCT__ENDNAME = CDERIVED_TYPE__ENDNAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCT__TYPE = CDERIVED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCT__FIELDS = CDERIVED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CStruct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCT_FEATURE_COUNT = CDERIVED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CStruct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRUCT_OPERATION_COUNT = CDERIVED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CFieldImpl <em>CField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CFieldImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCField()
	 * @generated
	 */
	int CFIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFIELD__NAME = CNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFIELD__ENDNAME = CNAMED_ELEMENT__ENDNAME;

	/**
	 * The number of structural features of the '<em>CField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFIELD_FEATURE_COUNT = CNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFIELD_OPERATION_COUNT = CNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CDiscreteTypeImpl <em>CDiscrete Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CDiscreteTypeImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCDiscreteType()
	 * @generated
	 */
	int CDISCRETE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDISCRETE_TYPE__NAME = CTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDISCRETE_TYPE__ENDNAME = CTYPE__ENDNAME;

	/**
	 * The number of structural features of the '<em>CDiscrete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDISCRETE_TYPE_FEATURE_COUNT = CTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CDiscrete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDISCRETE_TYPE_OPERATION_COUNT = CTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CEnumerationImpl <em>CEnumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CEnumerationImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCEnumeration()
	 * @generated
	 */
	int CENUMERATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUMERATION__NAME = CDISCRETE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUMERATION__ENDNAME = CDISCRETE_TYPE__ENDNAME;

	/**
	 * The feature id for the '<em><b>Enum Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUMERATION__ENUM_PROPERTIES = CDISCRETE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUMERATION_FEATURE_COUNT = CDISCRETE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUMERATION_OPERATION_COUNT = CDISCRETE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CEnumPropertiesImpl <em>CEnum Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CEnumPropertiesImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCEnumProperties()
	 * @generated
	 */
	int CENUM_PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_PROPERTIES__NAME = CNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_PROPERTIES__ENDNAME = CNAMED_ELEMENT__ENDNAME;

	/**
	 * The feature id for the '<em><b>Integral Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_PROPERTIES__INTEGRAL_CONSTANT = CNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CEnum Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_PROPERTIES_FEATURE_COUNT = CNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CEnum Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENUM_PROPERTIES_OPERATION_COUNT = CNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CArrayImpl <em>CArray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CArrayImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCArray()
	 * @generated
	 */
	int CARRAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY__NAME = CDERIVED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY__ENDNAME = CDERIVED_TYPE__ENDNAME;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY__ELEMENT_TYPE = CDERIVED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY__SIZE = CDERIVED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Array Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY__ARRAY_ELEMENTS = CDERIVED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CArray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_FEATURE_COUNT = CDERIVED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CArray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_OPERATION_COUNT = CDERIVED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CArrayElementImpl <em>CArray Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CArrayElementImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCArrayElement()
	 * @generated
	 */
	int CARRAY_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_ELEMENT__NAME = CNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_ELEMENT__ENDNAME = CNAMED_ELEMENT__ENDNAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_ELEMENT__INDEX = CNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_ELEMENT__VALUE = CNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CArray Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_ELEMENT_FEATURE_COUNT = CNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CArray Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRAY_ELEMENT_OPERATION_COUNT = CNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CPointerImpl <em>CPointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CPointerImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCPointer()
	 * @generated
	 */
	int CPOINTER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOINTER__NAME = CDERIVED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOINTER__ENDNAME = CDERIVED_TYPE__ENDNAME;

	/**
	 * The number of structural features of the '<em>CPointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOINTER_FEATURE_COUNT = CDERIVED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CPointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPOINTER_OPERATION_COUNT = CDERIVED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CExpressionImpl <em>CExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CExpressionImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCExpression()
	 * @generated
	 */
	int CEXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXPRESSION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>CExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CSubProgramImpl <em>CSub Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CSubProgramImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCSubProgram()
	 * @generated
	 */
	int CSUB_PROGRAM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUB_PROGRAM__NAME = CNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUB_PROGRAM__ENDNAME = CNAMED_ELEMENT__ENDNAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUB_PROGRAM__PARAMETERS = CNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUB_PROGRAM__LOCAL_VARIABLES = CNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUB_PROGRAM__BODY = CNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CSub Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUB_PROGRAM_FEATURE_COUNT = CNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CSub Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSUB_PROGRAM_OPERATION_COUNT = CNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CParameterImpl <em>CParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CParameterImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCParameter()
	 * @generated
	 */
	int CPARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPARAMETER__NAME = CNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPARAMETER__ENDNAME = CNAMED_ELEMENT__ENDNAME;

	/**
	 * The number of structural features of the '<em>CParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPARAMETER_FEATURE_COUNT = CNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPARAMETER_OPERATION_COUNT = CNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CFunctionImpl <em>CFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CFunctionImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCFunction()
	 * @generated
	 */
	int CFUNCTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFUNCTION__NAME = CSUB_PROGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFUNCTION__ENDNAME = CSUB_PROGRAM__ENDNAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFUNCTION__PARAMETERS = CSUB_PROGRAM__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFUNCTION__LOCAL_VARIABLES = CSUB_PROGRAM__LOCAL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFUNCTION__BODY = CSUB_PROGRAM__BODY;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFUNCTION__RETURN_TYPE = CSUB_PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFUNCTION_FEATURE_COUNT = CSUB_PROGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFUNCTION_OPERATION_COUNT = CSUB_PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CProcedureImpl <em>CProcedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CProcedureImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCProcedure()
	 * @generated
	 */
	int CPROCEDURE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDURE__NAME = CSUB_PROGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDURE__ENDNAME = CSUB_PROGRAM__ENDNAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDURE__PARAMETERS = CSUB_PROGRAM__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDURE__LOCAL_VARIABLES = CSUB_PROGRAM__LOCAL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDURE__BODY = CSUB_PROGRAM__BODY;

	/**
	 * The number of structural features of the '<em>CProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDURE_FEATURE_COUNT = CSUB_PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPROCEDURE_OPERATION_COUNT = CSUB_PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CTranslationUnitImpl <em>CTranslation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CTranslationUnitImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCTranslationUnit()
	 * @generated
	 */
	int CTRANSLATION_UNIT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSLATION_UNIT__NAME = CNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSLATION_UNIT__ENDNAME = CNAMED_ELEMENT__ENDNAME;

	/**
	 * The feature id for the '<em><b>Source Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSLATION_UNIT__SOURCE_FILES = CNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSLATION_UNIT__SUB_PROGRAMS = CNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Header Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSLATION_UNIT__HEADER_FILES = CNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CTranslation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSLATION_UNIT_FEATURE_COUNT = CNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CTranslation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRANSLATION_UNIT_OPERATION_COUNT = CNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CFileImpl <em>CFile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CFileImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCFile()
	 * @generated
	 */
	int CFILE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFILE__NAME = CNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFILE__ENDNAME = CNAMED_ELEMENT__ENDNAME;

	/**
	 * The feature id for the '<em><b>Sub Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFILE__SUB_PROGRAMS = CNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFILE__GLOBAL_VARIABLES = CNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFILE_FEATURE_COUNT = CNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFILE_OPERATION_COUNT = CNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CSourceFileImpl <em>CSource File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CSourceFileImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCSourceFile()
	 * @generated
	 */
	int CSOURCE_FILE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSOURCE_FILE__NAME = CFILE__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSOURCE_FILE__ENDNAME = CFILE__ENDNAME;

	/**
	 * The feature id for the '<em><b>Sub Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSOURCE_FILE__SUB_PROGRAMS = CFILE__SUB_PROGRAMS;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSOURCE_FILE__GLOBAL_VARIABLES = CFILE__GLOBAL_VARIABLES;

	/**
	 * The feature id for the '<em><b>Include Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSOURCE_FILE__INCLUDE_DIRECTIVES = CFILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CSource File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSOURCE_FILE_FEATURE_COUNT = CFILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CSource File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSOURCE_FILE_OPERATION_COUNT = CFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CHeaderFileImpl <em>CHeader File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CHeaderFileImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCHeaderFile()
	 * @generated
	 */
	int CHEADER_FILE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEADER_FILE__NAME = CFILE__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEADER_FILE__ENDNAME = CFILE__ENDNAME;

	/**
	 * The feature id for the '<em><b>Sub Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEADER_FILE__SUB_PROGRAMS = CFILE__SUB_PROGRAMS;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEADER_FILE__GLOBAL_VARIABLES = CFILE__GLOBAL_VARIABLES;

	/**
	 * The number of structural features of the '<em>CHeader File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEADER_FILE_FEATURE_COUNT = CFILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CHeader File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEADER_FILE_OPERATION_COUNT = CFILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link C4EventB.model.C4EventB.impl.CIncludeDirectiveImpl <em>CInclude Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see C4EventB.model.C4EventB.impl.CIncludeDirectiveImpl
	 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCIncludeDirective()
	 * @generated
	 */
	int CINCLUDE_DIRECTIVE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINCLUDE_DIRECTIVE__NAME = CNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Endname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINCLUDE_DIRECTIVE__ENDNAME = CNAMED_ELEMENT__ENDNAME;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINCLUDE_DIRECTIVE__HEADER = CNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CInclude Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINCLUDE_DIRECTIVE_FEATURE_COUNT = CNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CInclude Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINCLUDE_DIRECTIVE_OPERATION_COUNT = CNAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CNamedElement <em>CNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CNamed Element</em>'.
	 * @see C4EventB.model.C4EventB.CNamedElement
	 * @generated
	 */
	EClass getCNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see C4EventB.model.C4EventB.CNamedElement#getName()
	 * @see #getCNamedElement()
	 * @generated
	 */
	EAttribute getCNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CNamedElement#getEndname <em>Endname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endname</em>'.
	 * @see C4EventB.model.C4EventB.CNamedElement#getEndname()
	 * @see #getCNamedElement()
	 * @generated
	 */
	EAttribute getCNamedElement_Endname();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CType <em>CType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CType</em>'.
	 * @see C4EventB.model.C4EventB.CType
	 * @generated
	 */
	EClass getCType();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CVariable <em>CVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVariable</em>'.
	 * @see C4EventB.model.C4EventB.CVariable
	 * @generated
	 */
	EClass getCVariable();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see C4EventB.model.C4EventB.CVariable#getValue()
	 * @see #getCVariable()
	 * @generated
	 */
	EAttribute getCVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see C4EventB.model.C4EventB.CVariable#getType()
	 * @see #getCVariable()
	 * @generated
	 */
	EAttribute getCVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CVariable#isIsConstant <em>Is Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Constant</em>'.
	 * @see C4EventB.model.C4EventB.CVariable#isIsConstant()
	 * @see #getCVariable()
	 * @generated
	 */
	EAttribute getCVariable_IsConstant();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CStruct <em>CStruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CStruct</em>'.
	 * @see C4EventB.model.C4EventB.CStruct
	 * @generated
	 */
	EClass getCStruct();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CStruct#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see C4EventB.model.C4EventB.CStruct#getType()
	 * @see #getCStruct()
	 * @generated
	 */
	EAttribute getCStruct_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CStruct#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see C4EventB.model.C4EventB.CStruct#getFields()
	 * @see #getCStruct()
	 * @generated
	 */
	EReference getCStruct_Fields();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CField <em>CField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CField</em>'.
	 * @see C4EventB.model.C4EventB.CField
	 * @generated
	 */
	EClass getCField();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CEnumeration <em>CEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEnumeration</em>'.
	 * @see C4EventB.model.C4EventB.CEnumeration
	 * @generated
	 */
	EClass getCEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CEnumeration#getEnumProperties <em>Enum Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Properties</em>'.
	 * @see C4EventB.model.C4EventB.CEnumeration#getEnumProperties()
	 * @see #getCEnumeration()
	 * @generated
	 */
	EReference getCEnumeration_EnumProperties();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CEnumProperties <em>CEnum Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEnum Properties</em>'.
	 * @see C4EventB.model.C4EventB.CEnumProperties
	 * @generated
	 */
	EClass getCEnumProperties();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CEnumProperties#getIntegralConstant <em>Integral Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integral Constant</em>'.
	 * @see C4EventB.model.C4EventB.CEnumProperties#getIntegralConstant()
	 * @see #getCEnumProperties()
	 * @generated
	 */
	EAttribute getCEnumProperties_IntegralConstant();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CArray <em>CArray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CArray</em>'.
	 * @see C4EventB.model.C4EventB.CArray
	 * @generated
	 */
	EClass getCArray();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CArray#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see C4EventB.model.C4EventB.CArray#getElementType()
	 * @see #getCArray()
	 * @generated
	 */
	EAttribute getCArray_ElementType();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CArray#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see C4EventB.model.C4EventB.CArray#getSize()
	 * @see #getCArray()
	 * @generated
	 */
	EAttribute getCArray_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CArray#getArrayElements <em>Array Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Elements</em>'.
	 * @see C4EventB.model.C4EventB.CArray#getArrayElements()
	 * @see #getCArray()
	 * @generated
	 */
	EReference getCArray_ArrayElements();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CArrayElement <em>CArray Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CArray Element</em>'.
	 * @see C4EventB.model.C4EventB.CArrayElement
	 * @generated
	 */
	EClass getCArrayElement();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CArrayElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see C4EventB.model.C4EventB.CArrayElement#getIndex()
	 * @see #getCArrayElement()
	 * @generated
	 */
	EAttribute getCArrayElement_Index();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CArrayElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see C4EventB.model.C4EventB.CArrayElement#getValue()
	 * @see #getCArrayElement()
	 * @generated
	 */
	EAttribute getCArrayElement_Value();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CPointer <em>CPointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPointer</em>'.
	 * @see C4EventB.model.C4EventB.CPointer
	 * @generated
	 */
	EClass getCPointer();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CExpression <em>CExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CExpression</em>'.
	 * @see C4EventB.model.C4EventB.CExpression
	 * @generated
	 */
	EClass getCExpression();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see C4EventB.model.C4EventB.CExpression#getExpression()
	 * @see #getCExpression()
	 * @generated
	 */
	EAttribute getCExpression_Expression();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CSubProgram <em>CSub Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSub Program</em>'.
	 * @see C4EventB.model.C4EventB.CSubProgram
	 * @generated
	 */
	EClass getCSubProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CSubProgram#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see C4EventB.model.C4EventB.CSubProgram#getParameters()
	 * @see #getCSubProgram()
	 * @generated
	 */
	EReference getCSubProgram_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CSubProgram#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see C4EventB.model.C4EventB.CSubProgram#getLocalVariables()
	 * @see #getCSubProgram()
	 * @generated
	 */
	EReference getCSubProgram_LocalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CSubProgram#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see C4EventB.model.C4EventB.CSubProgram#getBody()
	 * @see #getCSubProgram()
	 * @generated
	 */
	EReference getCSubProgram_Body();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CDerivedType <em>CDerived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDerived Type</em>'.
	 * @see C4EventB.model.C4EventB.CDerivedType
	 * @generated
	 */
	EClass getCDerivedType();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CDiscreteType <em>CDiscrete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDiscrete Type</em>'.
	 * @see C4EventB.model.C4EventB.CDiscreteType
	 * @generated
	 */
	EClass getCDiscreteType();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CParameter <em>CParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CParameter</em>'.
	 * @see C4EventB.model.C4EventB.CParameter
	 * @generated
	 */
	EClass getCParameter();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CFunction <em>CFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFunction</em>'.
	 * @see C4EventB.model.C4EventB.CFunction
	 * @generated
	 */
	EClass getCFunction();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see C4EventB.model.C4EventB.CFunction#getReturnType()
	 * @see #getCFunction()
	 * @generated
	 */
	EAttribute getCFunction_ReturnType();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CProcedure <em>CProcedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CProcedure</em>'.
	 * @see C4EventB.model.C4EventB.CProcedure
	 * @generated
	 */
	EClass getCProcedure();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CTranslationUnit <em>CTranslation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CTranslation Unit</em>'.
	 * @see C4EventB.model.C4EventB.CTranslationUnit
	 * @generated
	 */
	EClass getCTranslationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CTranslationUnit#getSourceFiles <em>Source Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Files</em>'.
	 * @see C4EventB.model.C4EventB.CTranslationUnit#getSourceFiles()
	 * @see #getCTranslationUnit()
	 * @generated
	 */
	EReference getCTranslationUnit_SourceFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CTranslationUnit#getSubPrograms <em>Sub Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Programs</em>'.
	 * @see C4EventB.model.C4EventB.CTranslationUnit#getSubPrograms()
	 * @see #getCTranslationUnit()
	 * @generated
	 */
	EReference getCTranslationUnit_SubPrograms();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CTranslationUnit#getHeaderFiles <em>Header Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header Files</em>'.
	 * @see C4EventB.model.C4EventB.CTranslationUnit#getHeaderFiles()
	 * @see #getCTranslationUnit()
	 * @generated
	 */
	EReference getCTranslationUnit_HeaderFiles();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CSourceFile <em>CSource File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSource File</em>'.
	 * @see C4EventB.model.C4EventB.CSourceFile
	 * @generated
	 */
	EClass getCSourceFile();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CSourceFile#getIncludeDirectives <em>Include Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Directives</em>'.
	 * @see C4EventB.model.C4EventB.CSourceFile#getIncludeDirectives()
	 * @see #getCSourceFile()
	 * @generated
	 */
	EReference getCSourceFile_IncludeDirectives();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CHeaderFile <em>CHeader File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CHeader File</em>'.
	 * @see C4EventB.model.C4EventB.CHeaderFile
	 * @generated
	 */
	EClass getCHeaderFile();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CIncludeDirective <em>CInclude Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CInclude Directive</em>'.
	 * @see C4EventB.model.C4EventB.CIncludeDirective
	 * @generated
	 */
	EClass getCIncludeDirective();

	/**
	 * Returns the meta object for the attribute '{@link C4EventB.model.C4EventB.CIncludeDirective#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see C4EventB.model.C4EventB.CIncludeDirective#getHeader()
	 * @see #getCIncludeDirective()
	 * @generated
	 */
	EAttribute getCIncludeDirective_Header();

	/**
	 * Returns the meta object for class '{@link C4EventB.model.C4EventB.CFile <em>CFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CFile</em>'.
	 * @see C4EventB.model.C4EventB.CFile
	 * @generated
	 */
	EClass getCFile();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CFile#getSubPrograms <em>Sub Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Programs</em>'.
	 * @see C4EventB.model.C4EventB.CFile#getSubPrograms()
	 * @see #getCFile()
	 * @generated
	 */
	EReference getCFile_SubPrograms();

	/**
	 * Returns the meta object for the containment reference list '{@link C4EventB.model.C4EventB.CFile#getGlobalVariables <em>Global Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variables</em>'.
	 * @see C4EventB.model.C4EventB.CFile#getGlobalVariables()
	 * @see #getCFile()
	 * @generated
	 */
	EReference getCFile_GlobalVariables();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	C4EventBFactory getC4EventBFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CNamedElementImpl <em>CNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CNamedElementImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCNamedElement()
		 * @generated
		 */
		EClass CNAMED_ELEMENT = eINSTANCE.getCNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CNAMED_ELEMENT__NAME = eINSTANCE.getCNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Endname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CNAMED_ELEMENT__ENDNAME = eINSTANCE.getCNamedElement_Endname();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CTypeImpl <em>CType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CTypeImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCType()
		 * @generated
		 */
		EClass CTYPE = eINSTANCE.getCType();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CVariableImpl <em>CVariable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CVariableImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCVariable()
		 * @generated
		 */
		EClass CVARIABLE = eINSTANCE.getCVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVARIABLE__VALUE = eINSTANCE.getCVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVARIABLE__TYPE = eINSTANCE.getCVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Is Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVARIABLE__IS_CONSTANT = eINSTANCE.getCVariable_IsConstant();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CStructImpl <em>CStruct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CStructImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCStruct()
		 * @generated
		 */
		EClass CSTRUCT = eINSTANCE.getCStruct();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSTRUCT__TYPE = eINSTANCE.getCStruct_Type();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSTRUCT__FIELDS = eINSTANCE.getCStruct_Fields();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CFieldImpl <em>CField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CFieldImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCField()
		 * @generated
		 */
		EClass CFIELD = eINSTANCE.getCField();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CEnumerationImpl <em>CEnumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CEnumerationImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCEnumeration()
		 * @generated
		 */
		EClass CENUMERATION = eINSTANCE.getCEnumeration();

		/**
		 * The meta object literal for the '<em><b>Enum Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENUMERATION__ENUM_PROPERTIES = eINSTANCE.getCEnumeration_EnumProperties();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CEnumPropertiesImpl <em>CEnum Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CEnumPropertiesImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCEnumProperties()
		 * @generated
		 */
		EClass CENUM_PROPERTIES = eINSTANCE.getCEnumProperties();

		/**
		 * The meta object literal for the '<em><b>Integral Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENUM_PROPERTIES__INTEGRAL_CONSTANT = eINSTANCE.getCEnumProperties_IntegralConstant();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CArrayImpl <em>CArray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CArrayImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCArray()
		 * @generated
		 */
		EClass CARRAY = eINSTANCE.getCArray();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRAY__ELEMENT_TYPE = eINSTANCE.getCArray_ElementType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRAY__SIZE = eINSTANCE.getCArray_Size();

		/**
		 * The meta object literal for the '<em><b>Array Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRAY__ARRAY_ELEMENTS = eINSTANCE.getCArray_ArrayElements();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CArrayElementImpl <em>CArray Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CArrayElementImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCArrayElement()
		 * @generated
		 */
		EClass CARRAY_ELEMENT = eINSTANCE.getCArrayElement();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRAY_ELEMENT__INDEX = eINSTANCE.getCArrayElement_Index();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRAY_ELEMENT__VALUE = eINSTANCE.getCArrayElement_Value();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CPointerImpl <em>CPointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CPointerImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCPointer()
		 * @generated
		 */
		EClass CPOINTER = eINSTANCE.getCPointer();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CExpressionImpl <em>CExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CExpressionImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCExpression()
		 * @generated
		 */
		EClass CEXPRESSION = eINSTANCE.getCExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEXPRESSION__EXPRESSION = eINSTANCE.getCExpression_Expression();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CSubProgramImpl <em>CSub Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CSubProgramImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCSubProgram()
		 * @generated
		 */
		EClass CSUB_PROGRAM = eINSTANCE.getCSubProgram();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSUB_PROGRAM__PARAMETERS = eINSTANCE.getCSubProgram_Parameters();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSUB_PROGRAM__LOCAL_VARIABLES = eINSTANCE.getCSubProgram_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSUB_PROGRAM__BODY = eINSTANCE.getCSubProgram_Body();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CDerivedTypeImpl <em>CDerived Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CDerivedTypeImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCDerivedType()
		 * @generated
		 */
		EClass CDERIVED_TYPE = eINSTANCE.getCDerivedType();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CDiscreteTypeImpl <em>CDiscrete Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CDiscreteTypeImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCDiscreteType()
		 * @generated
		 */
		EClass CDISCRETE_TYPE = eINSTANCE.getCDiscreteType();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CParameterImpl <em>CParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CParameterImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCParameter()
		 * @generated
		 */
		EClass CPARAMETER = eINSTANCE.getCParameter();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CFunctionImpl <em>CFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CFunctionImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCFunction()
		 * @generated
		 */
		EClass CFUNCTION = eINSTANCE.getCFunction();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CFUNCTION__RETURN_TYPE = eINSTANCE.getCFunction_ReturnType();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CProcedureImpl <em>CProcedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CProcedureImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCProcedure()
		 * @generated
		 */
		EClass CPROCEDURE = eINSTANCE.getCProcedure();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CTranslationUnitImpl <em>CTranslation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CTranslationUnitImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCTranslationUnit()
		 * @generated
		 */
		EClass CTRANSLATION_UNIT = eINSTANCE.getCTranslationUnit();

		/**
		 * The meta object literal for the '<em><b>Source Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRANSLATION_UNIT__SOURCE_FILES = eINSTANCE.getCTranslationUnit_SourceFiles();

		/**
		 * The meta object literal for the '<em><b>Sub Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRANSLATION_UNIT__SUB_PROGRAMS = eINSTANCE.getCTranslationUnit_SubPrograms();

		/**
		 * The meta object literal for the '<em><b>Header Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTRANSLATION_UNIT__HEADER_FILES = eINSTANCE.getCTranslationUnit_HeaderFiles();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CSourceFileImpl <em>CSource File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CSourceFileImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCSourceFile()
		 * @generated
		 */
		EClass CSOURCE_FILE = eINSTANCE.getCSourceFile();

		/**
		 * The meta object literal for the '<em><b>Include Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSOURCE_FILE__INCLUDE_DIRECTIVES = eINSTANCE.getCSourceFile_IncludeDirectives();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CHeaderFileImpl <em>CHeader File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CHeaderFileImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCHeaderFile()
		 * @generated
		 */
		EClass CHEADER_FILE = eINSTANCE.getCHeaderFile();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CIncludeDirectiveImpl <em>CInclude Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CIncludeDirectiveImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCIncludeDirective()
		 * @generated
		 */
		EClass CINCLUDE_DIRECTIVE = eINSTANCE.getCIncludeDirective();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CINCLUDE_DIRECTIVE__HEADER = eINSTANCE.getCIncludeDirective_Header();

		/**
		 * The meta object literal for the '{@link C4EventB.model.C4EventB.impl.CFileImpl <em>CFile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see C4EventB.model.C4EventB.impl.CFileImpl
		 * @see C4EventB.model.C4EventB.impl.C4EventBPackageImpl#getCFile()
		 * @generated
		 */
		EClass CFILE = eINSTANCE.getCFile();

		/**
		 * The meta object literal for the '<em><b>Sub Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFILE__SUB_PROGRAMS = eINSTANCE.getCFile_SubPrograms();

		/**
		 * The meta object literal for the '<em><b>Global Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CFILE__GLOBAL_VARIABLES = eINSTANCE.getCFile_GlobalVariables();

	}

} //C4EventBPackage
