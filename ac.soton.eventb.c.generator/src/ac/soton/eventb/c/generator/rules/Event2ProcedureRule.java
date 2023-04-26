package ac.soton.eventb.c.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import C.ecore.EcorePackage;
import C.ecore.CSourceFile;

import C.ecore.CProcedure;


import ac.soton.eventb.c.generator.utils.CResourceUtils;
import ac.soton.eventb.c.generator.utils.CUtils;


public class Event2ProcedureRule extends AbstractRule implements IRule {

	protected static final EReference sourceFiles = EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES;
	protected static final EReference procedures = EcorePackage.Literals.CFILE__SUB_PROGRAMS;
	
	
	private CSourceFile sourceFile;
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		System.out.println("Event2ProcedureRule Enabled Method");

		if(sourceElement instanceof Event) {
			System.out.println("sourceElement is instance of Event: " + sourceElement);
			String evt_name = ((Event) sourceElement).getName();
			if(evt_name.equals("INITIALISATION")) {
				System.out.println("sourceElement event is not initialisation: " + sourceElement);
				return false;
			} else {
				System.out.println("sourceElement event is not initialisation: " + sourceElement);
				return true;
			}
		}
		
		System.out.println("sourceElement is not an instance of Event: " + sourceElement);
	
		return false;
		
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		System.out.println("Activating Event2ProcedureRule");

		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		Event evt = (Event) sourceElement;
	
		
		CProcedure proc =  CUtils.createProcedure(evt.getName());
		
        
		ret.add(CUtils.descriptor(sourceFile, procedures , proc, 2));

		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		
		System.out.println("Event2ProcedureRule dependenciesOK Method");

		Event evt = (Event) sourceElement;
		if (evt.eContainer() instanceof Machine) {
			Machine mch = (Machine) evt.eContainer();
			String name = mch.getName();
			
			sourceFile = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, sourceFiles, name);
			if (sourceFile != null)
				return true;
		}
	
		return false;
	}
	
	@Override
	public boolean fireLate() {
		System.out.println("Event2ProcedureRule fireLate Method");

		// TODO Auto-generated method stub
		return false;
	}
    


}
