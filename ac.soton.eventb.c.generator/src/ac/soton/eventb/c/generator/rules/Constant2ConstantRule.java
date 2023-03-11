package ac.soton.eventb.c.generator.rules;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import org.eventb.core.IContextRoot;
import org.eventb.core.IMachineRoot;
import org.eventb.core.ISCAxiom;
import org.eventb.core.ISCContextRoot;
import org.eventb.core.ISCMachineRoot;
import org.eventb.core.ast.Type;


import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;
import org.eventb.emf.persistence.EventBEMFUtils;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;

import ac.soton.eventb.spark.SparkPackage;
import ac.soton.eventb.spark.SparkPackageSpec;

import ac.soton.eventb.spark.SparkVariable;
import ac.soton.eventb.spark.generator.utils.SparkResourceUtils;
import ac.soton.eventb.spark.generator.utils.SparkTranslatorUtils;
import ac.soton.eventb.spark.generator.utils.SparkUtils;
import ch.ethz.eventb.utils.EventBSCUtils;


public class Constant2ConstantRule extends AbstractRule implements IRule{
	
	protected static final EReference specPackages = SparkPackage.Literals.SPARK_PROJECT__SPEC_PACKAGES;
	protected static final EReference constants = SparkPackage.Literals.SPARK_PACKAGE__VARIABLES;

	private List<Context> seenCxts;
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		if(sourceElement instanceof Machine) {
			IMachineRoot mchRoot = EventBEMFUtils.getRoot((Machine)sourceElement);
			if(!EventBSCUtils.getSCSeenConstantIdentifierStrings(mchRoot).isEmpty())
			  return true;	
		}			
			return false;	
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
//		IMachineRoot mchRoot = EventBEMFUtils.getRoot((Machine)sourceElement);
//		Map<String, String> scSeenAxioms = EventBSCUtils.getSCSeenAxioms(mchRoot, false);
	
	
		for(Context cxt : seenCxts) {
			String uriString = cxt.eResource().getURI().toString();
			uriString = uriString.substring(0, uriString.lastIndexOf("buc"));
			uriString = uriString + "bucx";
			URI uri = URI.createURI(uriString);

			EMFRodinDB emfRodinDB = new EMFRodinDB(cxt.eResource().getResourceSet());

			Resource rodinResource = emfRodinDB.loadResource(uri);
			
			Context xcxt = (Context) rodinResource.getContents().get(0);
			List <String> scSeenAxioms = SparkTranslatorUtils.getSCAxiomStrings(xcxt);
			IContextRoot cxtRoot = EventBEMFUtils.getRoot(xcxt);
            SparkPackageSpec cxtPckg = (SparkPackageSpec) SparkResourceUtils.findGeneratedElement(translatedElements, null, specPackages, cxt.getName());
            List <String> constLiterals = new ArrayList<String>();
            for(CarrierSet set : xcxt.getSets()) {
            	// Still need to do the enumeration check first 
            	String[] elements = SparkTranslatorUtils.extractEnumeratedSet(set.getName(), scSeenAxioms, cxtRoot.getFormulaFactory());
            	if(elements != null)
            		constLiterals.addAll(Arrays.asList(elements));
            	
            }
        	
            for(Constant BConst : xcxt.getConstants()) {
            	
            	int indexOf = constLiterals.indexOf(BConst.getName());
            	if (constLiterals.isEmpty() || indexOf < 0) {
            		// generate a spark constant
            		
            		Type scType = SparkTranslatorUtils.getConstantType(cxtRoot, BConst.getName());
            		String type = SparkTranslatorUtils.eventBTypeToSparkType(scType);
            		// TODO : get the value of the constant, this could either be done here or as we check the axioms
            		SparkVariable SConst = SparkUtils.createConstant(BConst.getName(), type, "0");
            		ret.add(SparkUtils.descriptor(cxtPckg, constants, SConst, 3)); 
            		
            	}
            }
			
		}

		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		// TODO: change it to use the SC contexts
		Machine mch = (Machine) sourceElement;
		EList<Context> cxts = mch.getSees();

		seenCxts = new ArrayList<Context>();
		for (Context cxt : cxts) 
			seenCxts.addAll(SparkTranslatorUtils.getSeenContexts(cxt));
	    for(Context ext_cxt : seenCxts) {
	    	 SparkPackageSpec cxtPckg = (SparkPackageSpec) SparkResourceUtils.findGeneratedElement(translatedElements, null, specPackages, ext_cxt.getName());
	    	 if (cxtPckg == null)
	    		 return false;
	    	
	    }
		
		return true;
					
	}

	@Override
	public boolean fireLate() {
		// TODO Auto-generated method stub
		return false;
	}
	


}

