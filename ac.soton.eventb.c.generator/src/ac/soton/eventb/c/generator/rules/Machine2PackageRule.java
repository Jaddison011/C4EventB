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
import ac.soton.eventb.spark.generator.utils.SparkResourceUtils;
import ac.soton.eventb.spark.generator.utils.SparkUtils;
import ac.soton.eventb.spark.SparkPackage;
import ac.soton.eventb.spark.SparkPackageImp;
import ac.soton.eventb.spark.SparkPackageSpec;

import ac.soton.eventb.spark.SparkProject;


public class Machine2PackageRule extends AbstractRule implements IRule{// AbstractEventBGeneratorRule
	protected static final EReference specPackages = SparkPackage.Literals.SPARK_PROJECT__SPEC_PACKAGES;
	protected static final EReference impPackages = SparkPackage.Literals.SPARK_PROJECT__IMP_PACKAGES;

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
	
		SparkProject sparkProj = (SparkProject) CResourceUtils.findGeneratedElement(translatedElements, null, null, "SPARK");
		
		SparkPackageSpec specPackage =  CUtils.createSpecPackage(sparkProj , mch.getName());
		
		SparkPackageImp impPackage =  CUtils.createImpPackage(sparkProj , mch.getName());

		ret.add(CUtils.descriptor(null, specPackages,specPackage, 1));
		ret.add(CUtils.descriptor(null, impPackages,impPackage, 1));

	
		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		
		SparkProject sparkProj = (SparkProject) CResourceUtils.findGeneratedElement(translatedElements, null, null, "SPARK");
		if (sparkProj == null)
			return false;
		else
			return true;
	}

	@Override
	public boolean fireLate() {
		// TODO Auto-generated method stub
		return false;
	}

}
