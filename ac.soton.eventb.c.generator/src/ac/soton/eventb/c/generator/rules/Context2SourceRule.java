package ac.soton.eventb.c.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.core.IMachineRoot;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EventBEMFUtils;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import C.ecore.EcorePackage;
import C.ecore.CSourceFile;
import C.ecore.CTranslationUnit;
import ac.soton.eventb.c.generator.utils.CResourceUtils;
import ac.soton.eventb.c.generator.utils.CTranslatorUtils;
import ac.soton.eventb.c.generator.utils.CUtils;

public class Context2SourceRule extends AbstractRule implements IRule {

	protected static final EReference sourceFiles = EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES;
	private CSourceFile MchPckg;

	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		System.out.println("Context2SourceRule Enabled Method");

		if (sourceElement instanceof Machine) {
			Machine mch = (Machine) sourceElement;
			if (mch.getSees().isEmpty())
				return false;
			else
				return true;
		}

		else
			return false;

	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		System.out.println("Activating Context2SourceRule");

		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		CTranslationUnit cProj = (CTranslationUnit) CResourceUtils.findGeneratedElement(translatedElements, null, null,
				"C");
		Machine mch = (Machine) sourceElement;

		List<String> seenCxts = CTranslatorUtils.getSCSeenContextsStrings(mch);
		for (String cxt_name : seenCxts) {
			CSourceFile specPackage = CUtils.createSourceFile(cProj, cxt_name);
			ret.add(CUtils.descriptor(null, sourceFiles, specPackage, 1));
		}
		return ret;
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		System.out.println("Context2Source dependenciesOK Method");

		CTranslationUnit cProj = (CTranslationUnit) CResourceUtils.findGeneratedElement(translatedElements, null, null,
				"C");

		if (cProj == null)
			return false;
		else {
			MchPckg = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, sourceFiles,
					((Machine) sourceElement).getName());
			if (MchPckg == null)
				return false;
			else
				return true;
		}

	}

	@Override
	public boolean fireLate() {
		System.out.println("Context2Source fireLate Method");

		// TODO Auto-generated method stub
		return false;
	}

}
