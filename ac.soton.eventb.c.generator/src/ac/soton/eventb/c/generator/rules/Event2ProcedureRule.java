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
		if(sourceElement instanceof Event) {
			String evt_name = ((Event) sourceElement).getName();
			if(evt_name.equals("INITIALISATION"))
				return false;
			else
				return true;
				
		}
				
		return false;
		
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		Event evt = (Event) sourceElement;
	
		
		CProcedure proc =  CUtils.createProcedure(evt.getName());
		
        
		ret.add(CUtils.descriptor(sourceFile, procedures , proc, 2));

		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		
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
		// TODO Auto-generated method stub
		return false;
	}
    


}
