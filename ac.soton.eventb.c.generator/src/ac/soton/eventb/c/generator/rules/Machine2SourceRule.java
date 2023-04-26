package ac.soton.eventb.c.generator.rules;


import java.util.ArrayList;
import java.util.List;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.eventb.emf.core.machine.Machine;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
//import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import ac.soton.eventb.c.generator.utils.CResourceUtils;
import ac.soton.eventb.c.generator.utils.CUtils;
import C.ecore.EcorePackage;
import C.ecore.CSourceFile;
import C.ecore.CTranslationUnit;

public class Machine2SourceRule extends AbstractRule implements IRule { // AbstractEventBGeneratorRule
	protected static final EReference sourceFiles = EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES;

	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		System.out.println("Machine2Source Enabled Method");
		if(sourceElement instanceof Machine)
			return true;
				
		else
			return false;
		
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		System.out.println("Activating Machine2SourceRule");

		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		Machine mch = (Machine) sourceElement;
	
		CTranslationUnit cProj = (CTranslationUnit) CResourceUtils.findGeneratedElement(translatedElements, null, null, "C");
		
		//TODO: Investigate this and whether I need all the translations to go into one file, instead of one file per machine
		CSourceFile sourceFile =  CUtils.createSourceFile(cProj , mch.getName());
		
		ret.add(CUtils.descriptor(null, sourceFiles, sourceFile, 1));
		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		System.out.println("Machne2SourceRule DependenciesOK Method");

		CTranslationUnit cProj = (CTranslationUnit) CResourceUtils.findGeneratedElement(translatedElements, null, null, "C");
		if (cProj == null)
			return false;
		else
			return true;
	}

	@Override
	public boolean fireLate() {
		System.out.println("Machine2SourceRule fireLate Method");

		// TODO Auto-generated method stub
		return false;
	}

}
