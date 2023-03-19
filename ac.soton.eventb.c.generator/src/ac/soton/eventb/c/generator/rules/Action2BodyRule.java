package ac.soton.eventb.c.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import C.ecore.CExpression;
import C.ecore.CFile;
import C.ecore.CSourceFile;
import C.ecore.EcorePackage;
import C.ecore.CProcedure;

import ac.soton.eventb.c.generator.utils.CResourceUtils;
import ac.soton.eventb.c.generator.utils.CUtils;


public class Action2BodyRule extends AbstractRule implements IRule {

	protected static final EReference proc_body = EcorePackage.Literals.CSUB_PROGRAM__BODY;
	protected static final EReference procedures = EcorePackage.Literals.CFILE__SUB_PROGRAMS;
	protected static final EReference packages = EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES;

	private String evt_name;
	private CProcedure proc;
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
//		if(sourceElement instanceof Action) {
//			 evt_name = ((Event) sourceElement.eContainer()).getName();
//			if(evt_name.equals("INITIALISATION"))
//				return false;
//			else
//				return true;				
//		}				
		return false;
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		Action act = (Action) sourceElement;
	//	TODO : check if we need to check the actions, if they need additional translation.
	    CExpression body = CUtils.createExpression(act.getAction());   
		ret.add(CUtils.descriptor(proc, proc_body , body, 3));

		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		
	
			Machine mch = (Machine) sourceElement.eContainer().eContainer();
	
			CSourceFile sourceFile = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, packages, mch.getName());
		    proc = (CProcedure) CResourceUtils.findGeneratedElement(translatedElements, sourceFile, procedures, evt_name);
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
}   
