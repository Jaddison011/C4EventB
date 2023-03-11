package ac.soton.eventb.c.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eventb.core.IMachineRoot;
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
import ac.soton.eventb.spark.SparkField;
import ac.soton.eventb.spark.SparkPackage;
import ac.soton.eventb.spark.SparkPackageSpec;
import ac.soton.eventb.spark.SparkRecord;
import ac.soton.eventb.spark.generator.utils.SparkResourceUtils;
import ac.soton.eventb.spark.generator.utils.SparkTranslatorUtils;
import ac.soton.eventb.spark.generator.utils.SparkUtils;
import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;
import ch.ethz.eventb.utils.EventBSCUtils;

public class Record2RecordRule extends AbstractRule implements IRule{
	
	protected static final EReference specPackages = SparkPackage.Literals.SPARK_PROJECT__SPEC_PACKAGES;
	protected static final EReference types = SparkPackage.Literals.SPARK_PACKAGE_SPEC__TYPES;
	protected static final EReference fields = SparkPackage.Literals.SPARK_RECORD__FIELDS;

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
		List <Record> parentRec = new ArrayList<Record>();
		for(Context cxt : seenCxts) {
			String uriString = cxt.eResource().getURI().toString();
			uriString = uriString.substring(0, uriString.lastIndexOf("buc"));
			uriString = uriString + "bucx";
			URI uri = URI.createURI(uriString);

			EMFRodinDB emfRodinDB = new EMFRodinDB(cxt.eResource().getResourceSet());

			Resource rodinResource = emfRodinDB.loadResource(uri);
			
			Context xcxt = (Context) rodinResource.getContents().get(0);
			
	

            SparkPackageSpec cxtPckg = (SparkPackageSpec) SparkResourceUtils.findGeneratedElement(translatedElements, null, specPackages, cxt.getName());
            for(AbstractExtension ext : xcxt.getExtensions()) {
            	if(ext instanceof Record) {
					Record BRec = (Record) ext;
					if (BRec.getInheritsNames() == null & !BRec.isExtended() & !BRec.isRefined()) {
						SparkRecord rec = SparkUtils.createRecord(BRec.getName());
						ret.add(SparkUtils.descriptor(cxtPckg, types, rec, 2)); 
				
					
						for(Field BField : BRec.getFields()) {
							//TODO: check the event-b field type, might probably need conversions
							SparkField sfield = SparkUtils.createField(BField.getName(), BField.getType());
							ret.add(SparkUtils.descriptor(rec, fields, sfield, 3)); 
					     }	    
				    }
					// if record extends another record generate fields late
					else 
						parentRec.add(BRec);         	
               }
   
           }
		}
		// Delaying the translation of extended records until all parents records are created
		if (!parentRec.isEmpty()) {
			for(Record rec : parentRec) {
				if (rec.getInheritsNames() != null) {
					Context cont_cxt = (Context) rec.eContainer();
					SparkPackageSpec cxtPckg = (SparkPackageSpec) SparkResourceUtils.findGeneratedElement(translatedElements, null, specPackages, cont_cxt.getName());
					for (String parent_rec_name : rec.getInheritsNames()) {
						SparkRecord SRec = (SparkRecord) SparkResourceUtils.findGeneratedElement(translatedElements, cxtPckg, types, parent_rec_name);
						for(Field BField : rec.getFields()) {
							//TODO: check the event-b field type, might probably need conversions
							SparkField sfield = SparkUtils.createField(BField.getName(), BField.getType());
							ret.add(SparkUtils.descriptor(SRec, fields, sfield, 3)); 
						}	
					}
				}
				else if (rec.isExtended()) {
					Context cont_cxt = (Context) rec.eContainer();
					SparkPackageSpec cxtPckg = (SparkPackageSpec) SparkResourceUtils.findGeneratedElement(translatedElements, null, specPackages, cont_cxt.getName());
					SparkRecord SRec = (SparkRecord) SparkResourceUtils.findGeneratedElement(translatedElements, cxtPckg, types, cont_cxt.getName());
					for(Field BField : rec.getFields()) {
						SparkField sfield = SparkUtils.createField(BField.getName(), BField.getType());
						ret.add(SparkUtils.descriptor(SRec, fields, sfield, 3)); 
					}		
				}
				//TODO: the replaced fields should be removed?
				else if (rec.isRefined()) {
					Context cont_cxt = (Context) rec.eContainer();
					SparkPackageSpec cxtPckg = (SparkPackageSpec) SparkResourceUtils.findGeneratedElement(translatedElements, null, specPackages, cont_cxt.getName());
					SparkRecord SRec = (SparkRecord) SparkResourceUtils.findGeneratedElement(translatedElements, cxtPckg, types, cont_cxt.getName());
					for(Field BField : rec.getFields()) {
						SparkField sfield = SparkUtils.createField(BField.getName(), BField.getType());
						ret.add(SparkUtils.descriptor(SRec, fields, sfield, 3)); 
					}	
				}
			}
		}
		return ret;	
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> translatedElements)
			throws Exception {
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
	
//	private Record getBRecord(Context cxt, String name) {
//		if(!cxt.getExtensions().isEmpty()) {
//			for(AbstractExtension ext : cxt.getExtensions()) {
//				if(ext instanceof Record) {
//					Record rec = (Record) ext;
//					if(rec.getName().equals(name)) 
//						return rec;
//				}
//			}
//		}
//		return null;
//	}
	
//	private Record findParentRecord(Record rec) {
//		Record parent = null;
//		if (rec.getSubsets() == null)
//			parent = rec;
//		else
//			parent = findParentRecord(rec.getSubsets());
//			
//		return parent;
//	}

}

