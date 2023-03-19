package ac.soton.eventb.c.generator.rules;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Machine;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
//import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import C.ecore.CTranslationUnit;
import ac.soton.eventb.c.generator.utils.CResourceUtils;
import ac.soton.eventb.c.generator.utils.CUtils;

public class CProjectRule extends AbstractRule implements IRule{ 
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		if(sourceElement instanceof Machine)
			return true;
				
		else
			return false;
		
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		Machine mch = (Machine) sourceElement;
	    CResourceUtils.getCFolder(mch);
	    CTranslationUnit proj =  CUtils.createCProject("C");
		ret.add(CUtils.descriptor(null, null,proj, 1));

		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		
		return true;
	}

	@Override
	public boolean fireLate() {
		// TODO Auto-generated method stub
		return false;
	}


}
