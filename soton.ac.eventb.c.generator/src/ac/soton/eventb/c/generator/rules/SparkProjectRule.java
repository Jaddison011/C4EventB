package C4EventB.generator.rules;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Machine;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
//import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import ac.soton.eventb.spark.SparkProject;
import ac.soton.eventb.spark.generator.utils.SparkResourceUtils;
import ac.soton.eventb.spark.generator.utils.SparkUtils;

public class SparkProjectRule extends AbstractRule implements IRule{ 
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
	    SparkResourceUtils.getSPARKFolder(mch);
	    SparkProject proj =  SparkUtils.createSparkProject("SPARK");
		ret.add(SparkUtils.descriptor(null, null,proj, 1));

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
