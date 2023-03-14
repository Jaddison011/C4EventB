package ac.soton.eventb.c.generator.utils;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import ac.soton.emf.translator.TranslationDescriptor;
import C.ecore.CArray;
import C.ecore.CArrayElement;
import C.ecore.CDerivedType;
import C.ecore.CEnumProperties;
import C.ecore.CEnumeration;
import C.ecore.CExpression;
import C.ecore.EcoreFactory;
import C.ecore.CField;
import C.ecore.CNamedElement;
import C.ecore.CParameter;
import C.ecore.CProcedure;
import C.ecore.CSourceFile;
import C.ecore.CHeaderFile;
import C.ecore.CTranslationUnit;
import C.ecore.CStruct;
import C.ecore.CType;
import C.ecore.CVariable;
import C.ecore.CArrayVariable;
import C.ecore.CFunction;
import C.ecore.CPointer;

/**
 * <p>
 *
 * </p>
 *
 * @author dd4g12
 * @version
 * @see
 * @since
 */
public class CUtils {
	private static EcoreFactory cFactory = EcoreFactory.eINSTANCE;
	
	public static TranslationDescriptor descriptor(EObject parent, EStructuralFeature feature, Object value, int priority){
		return new TranslationDescriptor(parent,feature,value,Integer.valueOf(priority));
	}
	
	public static TranslationDescriptor descriptor(EObject parent, EStructuralFeature feature, Object value , int priority, Boolean remove) {
		return new TranslationDescriptor(parent, feature,value,Integer.valueOf(priority), remove);
	}
	
//	// Added to test //TODO: 
//	public static TranslationDescriptor descriptor(EObject parent, EStructuralFeature feature, Object value ,Object before, int priority, Boolean remove, EObject source) {
//		return new TranslationDescriptor(parent, feature,value,before,Integer.valueOf(priority),remove,source);
//	}
	
	
	public static CTranslationUnit createCProject(String name) {
		CTranslationUnit cProj = cFactory.createCTranslationUnit();
		cProj.setName(name);
		return cProj;
	}

	public static CSourceFile createSourceFile(CTranslationUnit proj, String name) {
		CSourceFile sourceFile = cFactory.createCSourceFile();
		sourceFile.setName(name);
		sourceFile.setEndname(name);
		proj.getSourceFiles().add(sourceFile);
		return sourceFile;
	}

	public static CHeaderFile createHeaderFile(CTranslationUnit proj, String name) {
		CHeaderFile headerFile = cFactory.createCHeaderFile();
		headerFile.setName(name);
		headerFile.setEndname(name);
		proj.getHeaderFiles().add(headerFile);
		return headerFile;
	}
	
	public static CVariable createVariable(String name, String type, String value) {
		CVariable var = cFactory.createCVariable();
		var.setName(name);
		var.setType(type);
		var.setValue(value);
		var.setIsConstant(false);
		return var;
	}
	
	public static CArrayVariable createArrayVariable(String name, String type, CArray array_type, List <CArrayElement> elements) {
		CArrayVariable var = cFactory.createCArrayVariable();
		var.setName(name);
		var.setType(type);
		var.setIsConstant(false);
		return var;
	}
	
	public static CArrayElement createCArrayElement(int index, String value) {
		 CArrayElement elem = cFactory.createCArrayElement();
		 elem.setIndex(index);
		 elem.setValue(value);
		return elem;
	}
	public static CVariable createConstant(String name, String type, String value) {
		CVariable cons = cFactory.createCVariable();
		cons.setName(name);
		cons.setType(type);
		cons.setValue(value);
		cons.setIsConstant(true);
		return cons;
	}
	
	public static CProcedure createProcedure(String name) {
		CProcedure proc = cFactory.createCProcedure();
		proc.setName(name);
		proc.setEndname(name);
		return proc;
	}
	
	public static CFunction createFunction(String name, String returnType) {
		CFunction func = cFactory.createCFunction();
		func.setName(name);
		func.setEndname(name);
		func.setReturnType(returnType);
		return func;
	}
	
	public static CArray createArray(String name, String type, int size) {
		 CArray arr = cFactory.createCArray();
		 arr.setName(name);
		 arr.setElementType(type);
		 arr.setSize(size);	
		return arr;
	}
	
	public static CExpression createExpression(String value) {
		 CExpression exp = cFactory.createCExpression();
		 exp.setExpression(value);
		 return exp;		
	}
	public static CParameter createParameter(String name, String type) {
		 CParameter par = cFactory.createCParameter();
		 par.setName(name);
		 par.setType(type);
		 return par;		
	}
	public static CDerivedType createDerivedType(String type, CType supertype) {
		CDerivedType derivedType = cFactory.createCDerivedType();
		derivedType.setSuperType(supertype);
		return derivedType;
	}
	public static CStruct createStruct(String name) {
		CStruct rec = cFactory.createCStruct();
		rec.setName(name);
		return rec;
	}
	public static CField createField(String name, String type) {
		CField field = cFactory.createCField();
		field.setName(name);
//		field.setType(type);
		return field;
	}
	
	public static CEnumeration createEnumeration(String name, String [] elements) {
		CEnumeration c_enum = cFactory.createCEnumeration();
		c_enum.setName(name);
		for(String element : elements) {
			CEnumProperties enum_literal = cFactory.createCEnumProperties();
			enum_literal.setName(element);
			c_enum.getEnumProperties().add(enum_literal);
		}
		return c_enum;
	}
	
	public static CEnumProperties createEnumProperties(String name, int integralConstant) {
		CEnumProperties c_enum = cFactory.createCEnumProperties();
		c_enum.setName(name);
		c_enum.setIntegralConstant(integralConstant);
		return c_enum;
	}
	
	public static CType createType(String type) {
		CType c_type = cFactory.createCType();
		return c_type;
	}
	
	public static CPointer createPointer(String type) {
		CPointer c_pointer = cFactory.createCPointer();
		return c_pointer;
	}
}
