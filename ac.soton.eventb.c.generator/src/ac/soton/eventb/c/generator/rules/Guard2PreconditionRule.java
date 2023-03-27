package ac.soton.eventb.c.generator.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Parameter;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import C.ecore.EcorePackage;
import C.ecore.CSourceFile;
import C.ecore.CExpression;
import C.ecore.CPreCondition;
import C.ecore.CProcedure;
import ac.soton.eventb.c.generator.utils.CResourceUtils;
import ac.soton.eventb.c.generator.utils.CTranslatorUtils;
import ac.soton.eventb.c.generator.utils.CUtils;



public class Guard2PreconditionRule extends AbstractRule implements IRule {

	protected static final EReference preconditions = EcorePackage.Literals.CSUB_PROGRAM__PRECONDITIONS;
	protected static final EReference procedures = EcorePackage.Literals.CFILE__SUB_PROGRAMS;
	protected static final EReference packages = EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES;

	
	private CProcedure proc;
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		if(sourceElement instanceof Guard) {
			Guard grd = (Guard) sourceElement;
			// Do not translate if the guard is defining the parameter type or is theorem
			if (isTypePredicate(grd.getPredicate(), (Event) grd.eContainer()) || grd.isTheorem())
				return false;
			return true;
		}						
		return false;
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
     
		Guard grd = (Guard) sourceElement;
		
		Machine mch = (Machine) grd.eContainer().eContainer();
		String BPred = grd.getPredicate();
		String CPred = BPred; // TODO: Investigate this
//		String CPred = CTranslatorUtils.eventBPredToCPred(BPred, mch);
		CPreCondition precond = CUtils.createPrecondition(CPred);   
		ret.add(CUtils.descriptor(proc, preconditions , precond, 3));

		
		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
			Machine mch = (Machine) sourceElement.eContainer().eContainer();
	        Event evt = (Event) sourceElement.eContainer();
			CSourceFile sourceFile = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, packages, mch.getName());
		    proc = (CProcedure) CResourceUtils.findGeneratedElement(translatedElements, sourceFile, procedures, evt.getName());
			if (sourceFile != null && proc != null)
				return true;
			else
				return false;
	}
	
	@Override
	public boolean fireLate() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean isTypePredicate(String predicate, Event evt) {
		for(Parameter par : evt.getParameters()) {
			// TODO: might need to add other patterns e.g., subsets
			String patternString = par.getName() + "\\s*∈\\s*(.*)";
			Pattern pattern = Pattern.compile(patternString);
			 Matcher matcher = pattern.matcher(predicate);
				if (matcher.matches()) {
					return true;
				}	
		}
		return false;
	}
}   
