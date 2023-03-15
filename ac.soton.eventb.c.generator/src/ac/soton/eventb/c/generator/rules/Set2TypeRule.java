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
import org.eventb.core.IContextRoot;
import org.eventb.emf.core.context.CarrierSet;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;
import org.eventb.emf.persistence.EventBEMFUtils;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import C.ecore.CEnumeration;
import C.ecore.CSourceFile;
import C.ecore.CType;
import C.ecore.EcorePackage;
import ac.soton.eventb.c.generator.utils.CResourceUtils;
import ac.soton.eventb.c.generator.utils.CTranslatorUtils;
import ac.soton.eventb.c.generator.utils.CUtils;

public class Set2TypeRule extends AbstractRule implements IRule{
	
	protected static final EReference sourceFiles = EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES;
	protected static final EReference types = EcorePackage.Literals.CTRANSLATION_UNIT__TYPES;

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
		
		CType c_integer = CUtils.createType("Integer");
		for(Context cxt : seenCxts) {
			String uriString = cxt.eResource().getURI().toString();
			uriString = uriString.substring(0, uriString.lastIndexOf("buc"));
			uriString = uriString + "bucx";
			URI uri = URI.createURI(uriString);

			EMFRodinDB emfRodinDB = new EMFRodinDB(cxt.eResource().getResourceSet());

			Resource rodinResource = emfRodinDB.loadResource(uri);
			
			Context xcxt = (Context) rodinResource.getContents().get(0);
			List <String> scSeenAxioms = CTranslatorUtils.getSCAxiomStrings(xcxt);
			IContextRoot cxtRoot = EventBEMFUtils.getRoot(xcxt);
            CSourceFile cxtPckg = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, sourceFiles, cxt.getName());
            //add integer type
            ret.add(CUtils.descriptor(cxtPckg, types, c_integer, 2));
            for(CarrierSet set : xcxt.getSets()) {
            	// Still need to do the enumeration check first 
            	String[] elements = CTranslatorUtils.extractEnumeratedSet(set.getName(), scSeenAxioms, cxtRoot.getFormulaFactory());
    			if (elements != null) {
    				CEnumeration cEnumeration = CUtils.createEnumeration(set.getName(), elements);
    				ret.add(CUtils.descriptor(cxtPckg, types, cEnumeration, 2)); 
    			}
   
            	//integer derived
    			else {
//    				SparkType spark_set = CUtils.createDerivedType(set.getName(), spark_integer);
//                	ret.add(CUtils.descriptor(cxtPckg, types, spark_set, 2)); 
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
			seenCxts.addAll(CTranslatorUtils.getSeenContexts(cxt));
	    for(Context ext_cxt : seenCxts) {
	    	 CSourceFile cxtPckg = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, sourceFiles, ext_cxt.getName());
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

