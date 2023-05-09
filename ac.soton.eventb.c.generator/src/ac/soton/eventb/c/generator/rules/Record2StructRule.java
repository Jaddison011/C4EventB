package ac.soton.eventb.c.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import C.ecore.CField;
import C.ecore.CSourceFile;
import C.ecore.CStruct;
import C.ecore.EcorePackage;
import ac.soton.eventb.c.generator.utils.CResourceUtils;
import ac.soton.eventb.c.generator.utils.CTranslatorUtils;
import ac.soton.eventb.c.generator.utils.CUtils;
import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;

public class Record2StructRule extends AbstractRule implements IRule {
	
	protected static final EReference sourceFiles = EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES;
	protected static final EReference types = EcorePackage.Literals.CFILE__TYPES;
	protected static final EReference fields = EcorePackage.Literals.CSTRUCT__FIELDS;

	private List<Context> seenCxts;
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		System.out.println("Record2Struct Enabled Method");

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
		System.out.println("Activating Record2StructRule");

		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		List <Record> parentRec = new ArrayList<Record>();
		for(Context cxt : seenCxts) {
			String uriString = cxt.eResource().getURI().toString();
			uriString = uriString.substring(0, uriString.lastIndexOf("buc"));
			uriString = uriString + "bucx";
			URI uri = URI.createURI(uriString);

			EMFRodinDB emfRodinDB = new EMFRodinDB(cxt.eResource().getResourceSet());

			Resource rodinResource = emfRodinDB.loadResource(uri);
			
			Context xcxt = (Context) rodinResource.getContents().get(0);
			
	

            CSourceFile cxtPckg = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, sourceFiles, cxt.getName());
            for(AbstractExtension ext : xcxt.getExtensions()) {
            	if(ext instanceof Record) {
					Record BRec = (Record) ext;
					if (BRec.getInheritsNames() == null & !BRec.isExtended() & !BRec.isRefined()) {
						CStruct rec = CUtils.createStruct(BRec.getName());
						ret.add(CUtils.descriptor(cxtPckg, types, rec, 2)); 
				
					
						for(Field BField : BRec.getFields()) {
							//TODO: check the event-b field type, might probably need conversions
							CField cfield = CUtils.createField(BField.getName(), BField.getType());
							ret.add(CUtils.descriptor(rec, fields, cfield, 3)); 
					     }	    
				    }
					// if record extends another record generate fields late
					else {
						parentRec.add(BRec);
					}
            	}
            }
		}
		
		// Delaying the translation of extended records until all parents records are created
		if (!parentRec.isEmpty()) {
			for(Record rec : parentRec) {
				if (rec.getInheritsNames() != null) {
					Context cont_cxt = (Context) rec.eContainer();
					CSourceFile cxtPckg = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, sourceFiles, cont_cxt.getName());
					for (String parent_rec_name : rec.getInheritsNames()) {
						CStruct SRec = (CStruct) CResourceUtils.findGeneratedElement(translatedElements, cxtPckg, types, parent_rec_name);
						for(Field BField : rec.getFields()) {
							CField cfield = CUtils.createField(BField.getName(), BField.getType());
							ret.add(CUtils.descriptor(SRec, fields, cfield, 3)); 
						}	
					}
				}
				else if (rec.isExtended()) {
					Context cont_cxt = (Context) rec.eContainer();
					CSourceFile cxtPckg = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, sourceFiles, cont_cxt.getName());
					CStruct cRec = (CStruct) CResourceUtils.findGeneratedElement(translatedElements, cxtPckg, types, cont_cxt.getName());
					for(Field BField : rec.getFields()) {
						CField cfield = CUtils.createField(BField.getName(), BField.getType());
						ret.add(CUtils.descriptor(cRec, fields, cfield, 3)); 
					}		
				}
				else if (rec.isRefined()) {
					Context cont_cxt = (Context) rec.eContainer();
					CSourceFile cxtPckg = (CSourceFile) CResourceUtils.findGeneratedElement(translatedElements, null, sourceFiles, cont_cxt.getName());
					CStruct cStruct = (CStruct) CResourceUtils.findGeneratedElement(translatedElements, cxtPckg, types, cont_cxt.getName());
					for(Field BField : rec.getFields()) {
						CField cfield = CUtils.createField(BField.getName(), BField.getType());
						ret.add(CUtils.descriptor(cStruct, fields, cfield, 3)); 
					}	
				}
			}
		}
		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
		System.out.println("Record2Struct dependenciesOK Method");

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
		System.out.println("Record2Struct fireLate Method");

		// TODO Auto-generated method stub
		return false;
	}
}