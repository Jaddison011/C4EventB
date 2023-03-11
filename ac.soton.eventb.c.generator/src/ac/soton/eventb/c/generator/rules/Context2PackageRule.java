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
import ac.soton.eventb.spark.SparkPackage;
import ac.soton.eventb.spark.SparkPackageSpec;
import ac.soton.eventb.spark.SparkProject;
import ac.soton.eventb.spark.generator.utils.SparkResourceUtils;
import ac.soton.eventb.spark.generator.utils.SparkTranslatorUtils;
import ac.soton.eventb.spark.generator.utils.SparkUtils;

public class Context2PackageRule extends AbstractRule implements IRule {

	protected static final EReference specPackages = SparkPackage.Literals.SPARK_PROJECT__SPEC_PACKAGES;
	private SparkPackageSpec MchPckg;

	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
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
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		SparkProject sparkProj = (SparkProject) SparkResourceUtils.findGeneratedElement(translatedElements, null, null,
				"SPARK");
		Machine mch = (Machine) sourceElement;

		List<String> seenCxts = SparkTranslatorUtils.getSCSeenContextsStrings(mch);
		for (String cxt_name : seenCxts) {
			SparkPackageSpec specPackage = SparkUtils.createSpecPackage(sparkProj, cxt_name);
			ret.add(SparkUtils.descriptor(null, specPackages, specPackage, 1));

			// add with and use packages to machine package
			MchPckg.getWithPackages().add(cxt_name);
			MchPckg.getUsePackages().add(cxt_name);

		}

		return ret;
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {

		SparkProject sparkProj = (SparkProject) SparkResourceUtils.findGeneratedElement(translatedElements, null, null,
				"SPARK");

		if (sparkProj == null)
			return false;
		else {
			MchPckg = (SparkPackageSpec) SparkResourceUtils.findGeneratedElement(translatedElements, null, specPackages,
					((Machine) sourceElement).getName());
			if (MchPckg == null)
				return false;
			else
				return true;
		}

	}

	@Override
	public boolean fireLate() {
		// TODO Auto-generated method stub
		return false;
	}

}
