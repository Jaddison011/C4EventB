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

import C.ecore.EcorePackage;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;

import C.ecore.EcorePackage;
import C.ecore.CSourceFile;

import C.ecore.CVariable;
import ac.soton.eventb.c.generator.utils.CResourceUtils;
import ac.soton.eventb.c.generator.utils.CTranslatorUtils;
import ac.soton.eventb.c.generator.utils.CUtils;
import ch.ethz.eventb.utils.EventBSCUtils;


public class Constant2ConstantRule extends AbstractRule implements IRule {
	
	protected static final EReference sourceFiles = EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES;
	protected static final EReference constants = EcorePackage.Literals.CFILE__GLOBAL_VARIABLES;

	private List<Context> seenCxts;
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		System.out.println("Constant2Constant Enabled Method");

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
		System.out.println("Activating Constant2ConstantRule");

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
			List <String> scSeenAxioms = CTranslatorUtils.getSCAxiomStrings(xcxt);
			IContextRoot cxtRoot = EventBEMFUtils.getRoot(xcxt);
            CSourceFile cxtPckg = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, sourceFiles, cxt.getName());
            List <String> constLiterals = new ArrayList<String>();
            for(CarrierSet set : xcxt.getSets()) {
            	// Still need to do the enumeration check first 
            	String[] elements = CTranslatorUtils.extractEnumeratedSet(set.getName(), scSeenAxioms, cxtRoot.getFormulaFactory());
            	if(elements != null)
            		constLiterals.addAll(Arrays.asList(elements));
            	
            }
        	
            for(Constant BConst : xcxt.getConstants()) {
            	
            	int indexOf = constLiterals.indexOf(BConst.getName());
            	if (constLiterals.isEmpty() || indexOf < 0) {
            		// generate a c constant
            		
            		Type scType = CTranslatorUtils.getConstantType(cxtRoot, BConst.getName());
            		String type = CTranslatorUtils.eventBTypeToCType(scType);
            		// TODO : get the value of the constant, this could either be done here or as we check the axioms
            		CVariable SConst = CUtils.createConstant(BConst.getName(), type, "0");
            		ret.add(CUtils.descriptor(cxtPckg, constants, SConst, 3)); 
            	}
            }
		}
		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		System.out.println("Constant2Constant dependenciesOK Method");

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
		System.out.println("Constant2Constant fireLate Method");

		// TODO Auto-generated method stub
		return false;
	}
}