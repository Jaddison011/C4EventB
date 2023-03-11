package ac.soton.eventb.c.generator.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eventb.core.IContextRoot;
import org.eventb.core.IMachineRoot;
import org.eventb.core.ast.Expression;
import org.eventb.core.ast.FormulaFactory;
import org.eventb.core.ast.MultiplePredicate;
import org.eventb.core.ast.Predicate;
import org.eventb.core.ast.SetExtension;
import org.eventb.core.seqprover.eventbExtensions.DLib;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;
import org.eventb.emf.persistence.EventBEMFUtils;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.spark.SparkEnumeration;
import ac.soton.eventb.spark.SparkPackage;
import ac.soton.eventb.spark.SparkPackageSpec;
import ac.soton.eventb.spark.SparkRecord;
import ac.soton.eventb.spark.SparkType;
import ac.soton.eventb.spark.generator.utils.SparkResourceUtils;
import ac.soton.eventb.spark.generator.utils.SparkTranslatorUtils;
import ac.soton.eventb.spark.generator.utils.SparkUtils;
import ch.ethz.eventb.utils.EventBSCUtils;
import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;

public class Set2TypeRule extends AbstractRule implements IRule{
	
	protected static final EReference specPackages = SparkPackage.Literals.SPARK_PROJECT__SPEC_PACKAGES;
	protected static final EReference types = SparkPackage.Literals.SPARK_PACKAGE_SPEC__TYPES;

	private List<Context> seenCxts;
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
//		if(sourceElement instanceof Machine) {
//			IMachineRoot mchRoot = EventBEMFUtils.getRoot((Machine)sourceElement);
//			if(!EventBSCUtils.getSCSeenCarrierSetIdentifierStrings(mchRoot).isEmpty())
//			  return true;	
//		}			
			return false;	
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
//		IMachineRoot mchRoot = EventBEMFUtils.getRoot((Machine)sourceElement);
//		Map<String, String> scSeenAxioms = EventBSCUtils.getSCSeenAxioms(mchRoot, false);
		
		SparkType spark_integer = SparkUtils.createType("Integer");
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
            //add integer type
            ret.add(SparkUtils.descriptor(cxtPckg, types, spark_integer, 2));
            for(CarrierSet set : xcxt.getSets()) {
            	// Still need to do the enumeration check first 
            	String[] elements = SparkTranslatorUtils.extractEnumeratedSet(set.getName(), scSeenAxioms, cxtRoot.getFormulaFactory());
    			if (elements != null) {
    				SparkEnumeration sparkEnumeration = SparkUtils.createEnumeration(set.getName(), elements);
    				ret.add(SparkUtils.descriptor(cxtPckg, types, sparkEnumeration, 2)); 
    			}
   
            	//integer derived
    			else {
    				SparkType spark_set = SparkUtils.createDerivedType(set.getName(), spark_integer);
                	ret.add(SparkUtils.descriptor(cxtPckg, types, spark_set, 2)); 
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

