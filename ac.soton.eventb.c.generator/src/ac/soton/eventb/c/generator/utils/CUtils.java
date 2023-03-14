package ac.soton.eventb.c.generator.utils;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.eventb.spark.SparkArray;
import ac.soton.eventb.spark.SparkArrayElement;
import ac.soton.eventb.spark.SparkDerivedType;
import ac.soton.eventb.spark.SparkEnumeration;
import ac.soton.eventb.spark.SparkExpression;
import ac.soton.eventb.spark.SparkFactory;
import ac.soton.eventb.spark.SparkField;
import ac.soton.eventb.spark.SparkIntegerRange;
import ac.soton.eventb.spark.SparkNamedElement;
import ac.soton.eventb.spark.SparkPackageImp;
import ac.soton.eventb.spark.SparkPackageSpec;
import ac.soton.eventb.spark.SparkParameter;
import ac.soton.eventb.spark.SparkParameterMode;
import ac.soton.eventb.spark.SparkPostCondition;
import ac.soton.eventb.spark.SparkPreCondition;
import ac.soton.eventb.spark.SparkProcedureImp;
import ac.soton.eventb.spark.SparkProcedureSpec;
import ac.soton.eventb.spark.SparkProject;
import ac.soton.eventb.spark.SparkRecord;
import ac.soton.eventb.spark.SparkType;
import ac.soton.eventb.spark.SparkVariable;
import ac.soton.eventb.spark.SparkVariableArray;

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
public class SparkUtils {
	private static SparkFactory sparkFactory = SparkFactory.eINSTANCE;
	
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
	
	
	public static  SparkProject createSparkProject(String name) {
		SparkProject sparkProj = sparkFactory.createSparkProject();
		sparkProj.setName(name);
		return sparkProj;
	}

	public static  SparkPackageSpec createSpecPackage(SparkProject proj, String name) {
		SparkPackageSpec spec_package = sparkFactory.createSparkPackageSpec();
		spec_package.setName(name);
		// @Asieh set EndName
		spec_package.setEndname(name);
		proj.getSpecPackages().add(spec_package);
		return spec_package;
	}

	public static  SparkPackageImp createImpPackage(SparkProject proj, String name) {
		SparkPackageImp imp_package = sparkFactory.createSparkPackageImp();
		imp_package.setName(name);
		// @Asieh set EndName
		imp_package.setEndname(name);
		proj.getImpPackages().add(imp_package);
		return imp_package;
	}
	
	public static  SparkVariable createVariable(String name, String type, String value) {
		SparkVariable var = sparkFactory.createSparkVariable();
		var.setName(name);
		var.setType(type);
		var.setValue(value);
		var.setIsConstant(false);
		return var;
	}
	
	public static  SparkVariableArray createArrayVariable(String name, String type, SparkArray array_type, List <SparkArrayElement> elements) {
		SparkVariableArray var = sparkFactory.createSparkVariableArray();
		var.setName(name);
		var.setType(type);
//		var.setArrayType(array_type);
//		var.getElements().addAll(elements);
		var.setIndexType(array_type.getIndexType());
		var.setIsConstant(false);
		return var;
	}
	public static  SparkArrayElement createSparkArrayElement(int index, String value) {
		 SparkArrayElement elem = sparkFactory.createSparkArrayElement();
		 elem.setIndex(index);
		 elem.setValue(value);
		return elem;
	}
	public static  SparkVariable createConstant(String name, String type, String value) {
		SparkVariable cons = sparkFactory.createSparkVariable();
		cons.setName(name);
		cons.setType(type);
		cons.setValue(value);
		cons.setIsConstant(true);
		return cons;
	}
	public static  SparkProcedureSpec createSpecProcedure(String name) {
		SparkProcedureSpec proc = sparkFactory.createSparkProcedureSpec();
		proc.setName(name);
		// @Asieh set EndName
		proc.setEndname(name);
	    // ToDo: add parameters, global variables, preconditions and postonditions
		//pckg.getProcedures().add(proc); //either this or add to translation descriptor
		
		return proc;
	}
	
	public static  SparkProcedureImp createImpProcedure(String name) {
		SparkProcedureImp proc = sparkFactory.createSparkProcedureImp();
		proc.setName(name);
		// @Asieh set EndName
	    proc.setEndname(name);
		return proc;
	}
	public static  SparkArray createArray(String name, String type, SparkIntegerRange range) {
		 SparkArray arr = sparkFactory.createSparkArray();
		 arr.setName(name);
		 arr.setElementType(type);
		 arr.setIndexType(range);	
		return arr;
	}
	public static  SparkIntegerRange createIntegerRange(String name, int lowerBound, int upperBound) {
		 SparkIntegerRange range = sparkFactory.createSparkIntegerRange();
		 //not sure about name
//		 range.setName(name);
		 range.setRangeLB(lowerBound+"");
		 range.setRangeUB(upperBound+"");
		return range;
	}
	public static  SparkExpression createExpression(String value) {
		 SparkExpression exp = sparkFactory.createSparkExpression();
		 exp.setExpression(value);
		 return exp;		
	}
	public static  SparkParameter createParameter(String name, String type, SparkParameterMode mode) {
		 SparkParameter par = sparkFactory.createSparkParameter();
		 par.setName(name);
		 par.setType(type);
		 par.setMode(mode);
		 return par;		
	}
	public static SparkDerivedType createDerivedType(String type, SparkType supertype) {
		SparkDerivedType derivedType = sparkFactory.createSparkDerivedType();
//		derivedType.setType(type);
		derivedType.setSuperType(supertype);
		return derivedType;
	}
	public static SparkRecord createRecord(String name) {
		SparkRecord rec = sparkFactory.createSparkRecord();
		rec.setName(name);
		return rec;
	}
	public static SparkField createField(String name, String type) {
		SparkField field = sparkFactory.createSparkField();
		field.setName(name);
//		field.setType(type);
		return field;
	}
	public static SparkEnumeration createEnumeration(String name, String [] elements) {
		SparkEnumeration spark_enum = sparkFactory.createSparkEnumeration();
		spark_enum.setName(name);
		for(String element : elements) {
			SparkNamedElement enum_literal = sparkFactory.createSparkNamedElement();
			enum_literal.setName(element);
			spark_enum.getEnumerationLiterals().add(enum_literal);
		}
		return spark_enum;
		
	}
	public static SparkType createType(String type) {
		SparkType spark_type = sparkFactory.createSparkType();
//		spark_type.setType(type);
		return spark_type;
		
	}
	
	public static SparkPreCondition createPrecondition(String predicate) {
		SparkPreCondition preCond= sparkFactory.createSparkPreCondition();
		preCond.setPredicate(predicate);
		return preCond;
		
	}
	
	public static SparkPostCondition createPostcondition(String predicate) {
		SparkPostCondition postCond= sparkFactory.createSparkPostCondition();
		postCond.setPredicate(predicate);
		return postCond;		
	}
}
