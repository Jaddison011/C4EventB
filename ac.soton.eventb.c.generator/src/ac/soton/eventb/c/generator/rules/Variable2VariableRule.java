package ac.soton.eventb.c.generator.rules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.persistence.EventBEMFUtils;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.spark.SparkArray;
import ac.soton.eventb.spark.SparkArrayElement;
import ac.soton.eventb.spark.SparkIntegerRange;
import ac.soton.eventb.spark.SparkPackage;
import ac.soton.eventb.spark.SparkPackageSpec;
import ac.soton.eventb.spark.SparkVariable;
import ac.soton.eventb.spark.SparkVariableArray;
import ac.soton.eventb.spark.generator.utils.SparkResourceUtils;
import ac.soton.eventb.spark.generator.utils.SparkTranslatorUtils;
import ac.soton.eventb.spark.generator.utils.SparkUtils;

import org.eventb.core.IMachineRoot;
import org.eventb.core.ast.Type;
import ch.ethz.eventb.utils.EventBSCUtils;

public class Variable2VariableRule extends AbstractRule implements IRule {

	protected static final EReference variables = SparkPackage.Literals.SPARK_PACKAGE__VARIABLES;// CorePackage.Literals.PROJECT__COMPONENTS;
	protected static final EReference specPackages = SparkPackage.Literals.SPARK_PROJECT__SPEC_PACKAGES;
	protected static final EReference types = SparkPackage.Literals.SPARK_PACKAGE_SPEC__TYPES;
//		protected static final EReference elements = SparkPackage.Literals.SPARK_ARRAY__ELEMENTS;
	private final String record_field_variable = "record field translation variable";

	private SparkPackageSpec specPackage;

	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		if (sourceElement instanceof Variable) {
			if (((Variable) sourceElement).getComment() != null) {
				if (((Variable) sourceElement).getComment().equals(record_field_variable))
					return false;
				else
					return true;
			}
			return true;
		} else
			return false;

	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		Variable var = (Variable) sourceElement;

		String var_name = var.getName();

		IMachineRoot mchRoot = EventBEMFUtils.getRoot((Machine) var.eContainer());

		Type Btype = EventBSCUtils.getVariableType(mchRoot, var_name);

		// TODO define event to translate event-b types to spark types
		// array is done, still need to check other types
		String Stype = SparkTranslatorUtils.eventBTypeToSparkType(Btype);
		// TODO: array: More might need to be done to check if it is a function
		if (Stype == "Array") {
			// create array
			String array_name = var_name + "_array";
			// Btype.getSource();
			String array_type = SparkTranslatorUtils.eventBTypeToSparkType(Btype.getTarget());

			// To get the range I need to find the invariant defining the array type
			String predicate = SparkTranslatorUtils.getTypeFromInv(var_name, mchRoot);
			String range = SparkTranslatorUtils.getRangeFromInv(predicate);
			int[] bounds = SparkTranslatorUtils.getBoundsFromRange(range);
			String range_name = array_name + "_range";
			SparkIntegerRange arrayRange = SparkUtils.createIntegerRange(range_name, bounds[0], bounds[1]);
			SparkArray arrayType = SparkUtils.createArray(array_name, array_type, arrayRange);
			ret.add(SparkUtils.descriptor(specPackage, types, arrayType, 2));
			Stype = array_name;

			// ---
			String initVal = getInitialValue(var);
			if (initVal.contains("×")) {// && Stype.endsWith("_array"
				initVal = initVal.substring(initVal.indexOf("×") + 1).trim();
//				    		String patternString = "\\{(.)+\\}";//"({([[A-Za-z0-9]]+)})";
//				    		Pattern pattern = Pattern.compile(patternString);
//				            Matcher matcher = pattern.matcher(initVal);
//				            if(matcher.matches())
//				            	initVal = matcher.group(1);   //2   
				if (initVal.startsWith("{"))
					initVal = initVal.substring(1, initVal.length() - 1).trim();
			}
			// FIXME elems is unused at the moment?
			List<SparkArrayElement> elems = new ArrayList<SparkArrayElement>();
			for (int i = bounds[0]; i <= bounds[1]; i++) {
				SparkArrayElement elem = SparkUtils.createSparkArrayElement(i, initVal);
				elems.add(elem);
			}
			SparkVariable svar = SparkUtils.createVariable(var_name, Stype, "(others => " + initVal + ")");
			ret.add(SparkUtils.descriptor(specPackage, variables, svar, 2));

		}

		// TODO Might need to do some transformation first for some cases e.g. array
		else {
			String initVal = getInitialValue(var);

			SparkVariable svar = SparkUtils.createVariable(var_name, Stype, initVal);

			ret.add(SparkUtils.descriptor(specPackage, variables, svar, 2));
		}

		return ret;
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {

		Variable var = (Variable) sourceElement;
		if (var.eContainer() instanceof Machine) {
			Machine mch = (Machine) var.eContainer();
			String name = mch.getName();

			specPackage = (SparkPackageSpec) SparkResourceUtils.findGeneratedElement(translatedElements, null,
					specPackages, name);
			if (specPackage != null)
				return true;
		}
		return false;

	}

	@Override
	public boolean fireLate() {
		// TODO Auto-generated method stub
		return false;
	}

	private String getInitialValue(Variable var) {
		String init = "";

		Machine mch = (Machine) var.eContainer();
		for (Event e : mch.getEvents()) {
			if (e.getName().equals("INITIALISATION")) {
				for (Action act : e.getActions()) {
					String actStr = act.getAction();
					if (actStr.startsWith(var.getName())) {
						if (actStr.contains("≔")) {
							init = actStr.substring(actStr.indexOf("≔") + 1).trim();
						}
						break;
					}
				}
				break;
			}
		}
		return init;
	}

}
