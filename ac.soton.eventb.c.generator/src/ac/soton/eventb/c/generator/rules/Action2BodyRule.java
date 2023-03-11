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
import ac.soton.eventb.spark.SparkExpression;
import ac.soton.eventb.spark.SparkPackage;
import ac.soton.eventb.spark.SparkPackageImp;
import ac.soton.eventb.spark.SparkProcedure;
import ac.soton.eventb.spark.SparkProcedureImp;


import ac.soton.eventb.spark.generator.utils.SparkResourceUtils;
import ac.soton.eventb.spark.generator.utils.SparkUtils;


public class Action2BodyRule extends AbstractRule implements IRule {

	protected static final EReference proc_body = SparkPackage.Literals.SPARK_SUB_PROGRAM_IMP__BODY;
	protected static final EReference procedures = SparkPackage.Literals.SPARK_PACKAGE_IMP__PROCEDURES;
	protected static final EReference packages = SparkPackage.Literals.SPARK_PROJECT__IMP_PACKAGES;

	private String evt_name;
	private SparkProcedureImp proc;
	
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
	    SparkExpression body = SparkUtils.createExpression(act.getAction());   
		ret.add(SparkUtils.descriptor(proc, proc_body , body, 3));

		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		
	
			Machine mch = (Machine) sourceElement.eContainer().eContainer();
	
			SparkPackageImp impPackage = (SparkPackageImp) SparkResourceUtils.findGeneratedElement(translatedElements, null, packages, mch.getName());
		    proc = (SparkProcedureImp) SparkResourceUtils.findGeneratedElement(translatedElements, impPackage, procedures, evt_name);
			if (impPackage != null && proc != null)
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
