package ac.soton.eventb.c.generator.rules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import C.ecore.CArray;
import C.ecore.CArrayElement;
import C.ecore.CSourceFile;
import C.ecore.EcorePackage;
import C.ecore.CVariable;
import ac.soton.eventb.c.generator.utils.CResourceUtils;
import ac.soton.eventb.c.generator.utils.CTranslatorUtils;
import ac.soton.eventb.c.generator.utils.CUtils;

import org.eventb.core.IMachineRoot;
import org.eventb.core.ast.Type;
import ch.ethz.eventb.utils.EventBSCUtils;

public class Variable2VariableRule extends AbstractRule implements IRule {

	protected static final EReference variables = EcorePackage.Literals.CFILE__GLOBAL_VARIABLES;
	protected static final EReference sourceFiles = EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES;
	protected static final EReference types = EcorePackage.Literals.CFILE__TYPES;
//		protected static final EReference elements = SparkPackage.Literals.SPARK_ARRAY__ELEMENTS;
	private final String record_field_variable = "record field translation variable";

	private CSourceFile sourceFile;

	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		System.out.println("Variable2Variable Enabled Method");

		if (sourceElement instanceof Variable) {
			return true;
		} else
			return false;

	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		System.out.println("Activating Variable2VariableRule");

		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		Variable var = (Variable) sourceElement;

		String var_name = var.getName();

		IMachineRoot mchRoot = EventBEMFUtils.getRoot((Machine) var.eContainer());

		Type Btype = EventBSCUtils.getVariableType(mchRoot, var_name);

		// TODO define event to translate event-b types to c types
		// array is done, still need to check other types
		String ctype = CTranslatorUtils.eventBTypeToCType(Btype);
		if (ctype == "Array") {
			// create array
			String array_name = var_name + "_array";
			// Btype.getSource();
			String array_type = CTranslatorUtils.eventBTypeToCType(Btype.getTarget());

			// To get the range I need to find the invariant defining the array type
			String predicate = CTranslatorUtils.getTypeFromInv(var_name, mchRoot);
			String range = CTranslatorUtils.getRangeFromInv(predicate);
			int[] bounds = CTranslatorUtils.getBoundsFromRange(range);
			int arraySize = bounds[1] - bounds[0] + 1;
			CArray arrayType = CUtils.createArray(array_name, array_type, arraySize);
			ret.add(CUtils.descriptor(sourceFile, types, arrayType, 2));
			ctype = array_name;

			// Get the initial value
			String initVal = getInitialValue(var);
			if (initVal.contains("×")) {// && Stype.endsWith("_array"
				initVal = initVal.substring(initVal.indexOf("×") + 1).trim(); 
				if (initVal.startsWith("{"))
					initVal = initVal.substring(1, initVal.length() - 1).trim();
			}
			// Add elements to the array
			List<CArrayElement> elems = new ArrayList<CArrayElement>();
			for (int i = bounds[0]; i <= bounds[1]; i++) {
				CArrayElement elem = CUtils.createCArrayElement(i, initVal);
				elems.add(elem);
			}
			CVariable svar = CUtils.createVariable(var_name, ctype, initVal);
			ret.add(CUtils.descriptor(sourceFile, variables, svar, 2));

		}

		// TODO Might need to do some transformation first for some cases e.g. array
		else {
			String initVal = getInitialValue(var);

//			System.out.println(initVal);
			if (initVal.equals("∅")) {
				initVal = "0";
			}
			
			CVariable svar = CUtils.createVariable(var_name, ctype, initVal);

			ret.add(CUtils.descriptor(sourceFile, variables, svar, 2));
		}

		return ret;
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {

		System.out.println("Variable2Variable dependenciesOK Method");

		Variable var = (Variable) sourceElement;
		if (var.eContainer() instanceof Machine) {
			Machine mch = (Machine) var.eContainer();
			String name = mch.getName();

			sourceFile = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null,
					sourceFiles, name);
			if (sourceFile != null)
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
