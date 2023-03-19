package ac.soton.eventb.c.generator.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eventb.core.ast.MultiplePredicate;
import org.eventb.core.ast.Predicate;
import org.eventb.core.ast.PredicateVariable;
import org.eventb.core.ast.QuantifiedPredicate;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eventb.core.IContextRoot;
import org.eventb.core.IMachineRoot;
import org.eventb.core.ISCAxiom;
import org.eventb.core.ISCConstant;
import org.eventb.core.ISCContextRoot;
import org.eventb.core.ISCEvent;
import org.eventb.core.ISCInternalContext;
import org.eventb.core.ISCMachineRoot;
import org.eventb.core.ISCParameter;
import org.eventb.core.ISCVariable;
import org.eventb.core.ast.Assignment;
import org.eventb.core.ast.BooleanType;
import org.eventb.core.ast.BoundIdentDecl;
import org.eventb.core.ast.BoundIdentifier;
import org.eventb.core.ast.Expression;
import org.eventb.core.ast.Formula;
import org.eventb.core.ast.FormulaFactory;
import org.eventb.core.ast.FreeIdentifier;
import org.eventb.core.ast.GivenType;
import org.eventb.core.ast.IntegerType;
import org.eventb.core.ast.MultiplePredicate;
import org.eventb.core.ast.PowerSetType;
import org.eventb.core.ast.SetExtension;
import org.eventb.core.ast.Type;
import org.eventb.core.seqprover.eventbExtensions.DLib;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Action;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.persistence.EMFRodinDB;
import org.eventb.emf.persistence.EventBEMFUtils;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.RodinDBException;
import org.eventb.emf.core.EventBNamed;

import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;
import C.ecore.CSourceFile;
import C.ecore.CVariable;
import ch.ethz.eventb.utils.EventBSCUtils;

public class CTranslatorUtils {
	
	/**
	 * @param type
	 * @return
	 */
	public static String eventBTypeToCType(Type type) {
		if (type instanceof BooleanType) {
			return "Boolean";
		}
		if (type instanceof IntegerType) {
			return "Integer";
		}
		if (type instanceof GivenType)
			return ((GivenType) type).getName();
		if(type instanceof PowerSetType) {
			PowerSetType p = (PowerSetType) type;
			if(type.getSource() instanceof IntegerType)
				return "Array"; //might be powerset but not function need to check that, what about range is this supposed to be check0ed??
		}
			
			
		return null;
	}
	
	/**
	 * @param identifier
	 * @param mchRoot
	 * @return
	 * @throws RodinDBException
	 */
	public static String getTypeFromInv(String identifier, IMachineRoot mchRoot)
			throws RodinDBException {

		Map<String, String> scInvariants = EventBSCUtils.getSCInvariants(
				mchRoot, false);

		String patternString = identifier + "\\s*∈\\s*(.*)";
		Pattern pattern = Pattern.compile(patternString);

		for (String pred : scInvariants.values()) {
	        Matcher matcher = pattern.matcher(pred);
			if (matcher.matches()) {
				String type = matcher.group(1);
				return type;
			}
		}
		return null;
	}
	
	/**
	 * @param predicate
	 * @return
	 */
	public static String getRangeFromInv(String predicate) {

		String patternString = "(.*)\\s*→\\s*(.*)";
		Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(predicate);
		if (matcher.matches()) {
			String range = matcher.group(1);
			return range;
		}
		
		return null;
	}
	/**
	 * @param range
	 * @return bounds: an int array of the lower and upper bounds
	 */
	public static int[] getBoundsFromRange(String range){
        int[] bounds = new int[2];
		String patternString = "(.*)\\s*‥\\s*(.*)";
		Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(range);
		if (matcher.matches()) {
			String str1 = matcher.group(1).trim();
			String str2 = matcher.group(2).trim();
			bounds[0]= Integer.parseInt(str1);
			bounds[1]= Integer.parseInt(str2);
			return bounds;
		}	
		return null;
	}
	
	public static List <Context> getSeenContexts(Context cxt){
		List<Context> ret = new ArrayList<Context>();
		if (cxt.getExtends().isEmpty()) {
			ret.add(cxt);
		}
		else {
			for(Context ext : cxt.getExtends()) {
				ret.add(cxt);
				ret.addAll(getSeenContexts(ext));
			}
		}
		return ret;
	}
	
	/**
	 * A utility method to find the type of the event parameter
	 * @param evt
	 * @param par_name
	 * @return type
	 * @author dd4g12
	 */
	public static String getParameterType(Event evt, String par_name) {
		String type = "";
		// TODO: what about subsets?? also sometimes types are inferred??? how 
		// to do it similar to the invariant??
		
		String patternString = par_name + "\\s*∈\\s*(.*)";
		Pattern pattern = Pattern.compile(patternString);
		for(Guard grd : evt.getGuards()) {
			String grd_str = grd.getPredicate();
			 Matcher matcher = pattern.matcher(grd_str);
				if (matcher.matches()) {
					type = matcher.group(1);
				}	
		}
		
		return type;
	}
	
	/**
	 * A utility method to find the EventB type of the event parameter from SCParameter
	 * @param evt
	 * @param par_name
	 * @return BType
	 * @author dd4g12
	 * @throws CoreException 
	 */
	public static Type getSCParameterType(Event evt, String par_name) throws CoreException {
		Type Btype = null;
		Machine mch = (Machine) evt.eContainer();
		IMachineRoot mchRoot = EventBEMFUtils.getRoot(mch);
		ISCMachineRoot scMchRoot = mchRoot.getSCMachineRoot();
		ISCEvent[] scEvents = scMchRoot.getSCEvents();
//		int size;
//		if(scEvents != null)
//			size = scEvents.length;
//	
//		ISCEvent scEvent = scMchRoot.getSCEvent(evt.getName());
//		if(scEvent.exists()) {
//			ISCParameter scParameter = scEvent.getSCParameter(par_name);
//			if (scParameter.exists())
//				 Btype = scParameter.getType(scMchRoot.getFormulaFactory());
//			scEvent.getSCParameters();
//		}
//		ISCVariable[] scVariables = scMchRoot.getSCVariables();
//		for (ISCVariable scVariable : scVariables) {
//			if (scVariable.getIdentifierString().equals("")) {
//				return scVariable.getType(scMchRoot.getFormulaFactory());
//			}
//		}
		for (ISCEvent scEvent : scEvents) {
			if (scEvent.getLabel().equals(evt.getName())) {
				int size = scEvent.getSCParameters().length;
				for(ISCParameter scParameter : scEvent.getSCParameters()) {
					String identifier = scParameter.getIdentifierString();
					String name = scParameter.getElementName();
					if(scParameter.getIdentifierString().equals(par_name))
							Btype = scParameter.getType(scMchRoot.getFormulaFactory());
				}
				
			}
		}
		return Btype;
	}
		
	public  static ISCInternalContext[] getSCSeenContexts(Machine mch) throws RodinDBException {
		IMachineRoot mchRoot = EventBEMFUtils.getRoot(mch);
		ISCMachineRoot scMchRoot = mchRoot.getSCMachineRoot();
		return scMchRoot.getSCSeenContexts();
		
	}
	public  static List <String> getSCSeenContextsStrings(Machine mch) throws RodinDBException {
		List <String> scContextStrings = new ArrayList <String>();	
		for (ISCInternalContext scContext : getSCSeenContexts(mch)) {
			// TODO : check may be need to get component name instead of element name
//			scContextStrings.add(scContext.getElementName());
			scContextStrings.add(scContext.getComponentName());
			
		}
		return scContextStrings;
	}
//	public  static ISCExtendsContext[] getSCExtendsContexts(IContextRoot cxtRoot) throws RodinDBException {
//		ISCContextRoot scCxtRoot = cxtRoot.getSCContextRoot();
//		ISCExtendsContext[] scExtendsClauses = scCxtRoot.getSCExtendsClauses();
//		return scExtendsClauses;
//	}
//	public  static List <String> getSCExtendsContextsStrings(IContextRoot cxtRoot) throws RodinDBException {
//		List <String> scContextStrings = new ArrayList <String>();
//		ISCContextRoot scCxthRoot = cxtRoot.getSCContextRoot();
//	
//		for (ISCExtendsContext scContext : scCxthRoot.getSCExtendsClauses()) {
//			scContextStrings.add(scContext.getElementName());
//		}
//		return scContextStrings;
//	}
	/**
	 * @param cxtRoot
	 * @param identifier
	 * @return 
	 * @throws CoreException 
	 * @see EventBCUtils getVariableType
	 */
	public static Type getConstantType(IContextRoot cxtRoot, String identifier)
			throws CoreException {
		// Assert preconditions.
//		Assert.isNotNull(cxtRoot, Messages.error_NullMachine);
//		Assert.isTrue(cxtRoot.exists(), Messages.bind(
//				Messages.error_NonExistingMachine, cxtRoot.getRodinFile()
//						.getBareName()));
		ISCContextRoot scCxtRoot = cxtRoot.getSCContextRoot();
//		Assert.isNotNull(scCxtRoot, Messages.error_NullSCMachine);
//		Assert.isTrue(scCxtRoot.exists(), Messages.bind(
//				Messages.error_NonExistingSCMachine, scCxtRoot.getRodinFile()
//						.getBareName()));

		ISCConstant[] scConstants = scCxtRoot.getSCConstants();
		for (ISCConstant scConstant : scConstants) {
			if (scConstant.getIdentifierString().equals(identifier)) {
				return scConstant.getType(scCxtRoot.getFormulaFactory());
			}
		}

		return null;
	}
//	
//	/**
//	 * @param setName
//	 * @param scSeenAxioms
//	 * @return
//	 * @see ac.soton.coda.vhdl.vxmiTranslator.Component_TypeDeclarationRule
//	 */
//	public static String[] extractEnumeratedSet(String setName,
//			Map<String, String> scSeenAxioms, FormulaFactory ff) {
//
//		Set<String> keySet = scSeenAxioms.keySet();
//		for (String key : keySet) {
//			String predicate = scSeenAxioms.get(key);
//			Predicate parsePredicate = DLib.parsePredicate(ff, predicate);
//			if (parsePredicate.getTag() == Predicate.FIRST_MULTIPLE_PREDICATE) {
//				MultiplePredicate multiplePredicate = (MultiplePredicate) parsePredicate;
//				Expression[] children = multiplePredicate.getChildren();
//				if (setName.equals(children[0].toString())) {
//					List<String> result = new ArrayList<String>(
//							children.length - 1);
//					for (int i = 1; i < children.length; i++) {
//						Expression expression = children[i];
//						if (expression.getTag() == Expression.SETEXT) {
//							SetExtension setExtension = (SetExtension) expression;
//							Expression[] members = setExtension.getMembers();
//							result.add(members[0].toString());
//						}
//					}
//					return result.toArray(new String[result.size()]);
//				}
//			}
//
//		}
//		return null;
//	}
	/**
	 * @param setName
	 * @param scSeenAxioms
	 * @return
	 * @see ac.soton.coda.vhdl.vxmiTranslator.Component_TypeDeclarationRule
	 */
	public static String[] extractEnumeratedSet(String setName,
		List <String> scSeenAxioms, FormulaFactory ff) {
		for (String predicate : scSeenAxioms) {
			Predicate parsePredicate = DLib.parsePredicate(ff, predicate);
			if (parsePredicate.getTag() == Predicate.FIRST_MULTIPLE_PREDICATE) {
				MultiplePredicate multiplePredicate = (MultiplePredicate) parsePredicate;
				Expression[] children = multiplePredicate.getChildren();
				if (setName.equals(children[0].toString())) {
					List<String> result = new ArrayList<String>(
							children.length - 1);
					for (int i = 1; i < children.length; i++) {
						Expression expression = children[i];
						if (expression.getTag() == Expression.SETEXT) {
							SetExtension setExtension = (SetExtension) expression;
							Expression[] members = setExtension.getMembers();
							result.add(members[0].toString());
						}
					}
					return result.toArray(new String[result.size()]);
				}
			}

		}
		return null;
	}
	
// TODO: Convert the predicates to C
//	public static String eventBPredToCPred(String BPredicate) {
//		String SPredicate = "";
//		// TODO:  do some checks
//		if(BPredicate.trim().startsWith("∃")) {
//			// Do something
//		}
//		else if (BPredicate.trim().startsWith("∀")) {
//			// Do something
//		}
//		// There is also and or ....
//		SPredicate = BPredicate;
//		return SPredicate;
//	}
//	
//	// This is just a test
	public static String eventBPredToCPred(String BPredicate, Machine mch) throws RodinDBException {
		IMachineRoot mchRoot = EventBEMFUtils.getRoot(mch);
		FormulaFactory ff = mchRoot.getFormulaFactory();
//		ISCMachineRoot scMachineRoot = mchRoot.getSCMachineRoot();
		Map<String, Boolean> recordFields = getRecordFields(mch);
		String SPredicate = "";
		Predicate parsePredicate = DLib.parsePredicate(ff, BPredicate);
	    
		if (parsePredicate.getTag() == Predicate.EXISTS) {
			SPredicate += "for some ";

			QuantifiedPredicate quantifiedPredicate = (QuantifiedPredicate) parsePredicate;
			// TODO: can we translate the predicate if it has more than one bounded identifier?
			if (quantifiedPredicate.getBoundIdentDecls().length == 1)
		      SPredicate += quantifiedPredicate.getBoundIdentDecls()[0];
			// TODO: else what?
		    FreeIdentifier[] freeIdentifiers = quantifiedPredicate.getFreeIdentifiers();
            String sQuantified = quantifiedPredicate.toString();
            String[] split = sQuantified.split("∈");
            int index = split[1].indexOf("∧");
            String s = split[1].replace("∧", "=> ");         
            String s1 = s.substring(0, index);
            SPredicate += " in " + s1;
            String s2 = s.substring(index);
//            Map<String, Boolean> recordFields = getRecordFields(mch);

//            for (FreeIdentifier identifier : freeIdentifiers) {
//            	String name = identifier.getName();
//            	if (recordFields.containsKey(name)) {
//            		String patternString = "(.*)" + name + "(.*)";
//            		Pattern pattern = Pattern.compile(patternString);
//                    Matcher matcher = pattern.matcher(s2);
//                    if(matcher.matches()) {
//                    	String group = matcher.group(2);
//                    	String before = name + group;
//                        String after = group.substring(1, group.length()-2)+(".")+ name;
//                    	s2 = s2.replace(before, after);
//                    	
//                    	System.out.println("*****s22 : " + s2);
//                    }
//            	}
//            }
            s2 = swapRecordFields(s2, freeIdentifiers, recordFields);
            
            SPredicate = SPredicate + " " + s2;
		}
		
		else if (parsePredicate.getTag() == Predicate.FORALL) {
			SPredicate += "for all ";

			QuantifiedPredicate quantifiedPredicate = (QuantifiedPredicate) parsePredicate;
			// TODO: can we translate the predicate if it has more than one bounded identifier?
			if (quantifiedPredicate.getBoundIdentDecls().length == 1)
		      SPredicate += quantifiedPredicate.getBoundIdentDecls()[0];
			// TODO: else what?
		    FreeIdentifier[] freeIdentifiers = quantifiedPredicate.getFreeIdentifiers();
            String sQuantified = quantifiedPredicate.toString();
            String[] split = sQuantified.split("∈");
          //  String s = split[1];//.replace("∧", "=> "); 
            int index = split[1].indexOf("=>");
            String s1 = split[1].substring(0, index);
            SPredicate += " in " + s1;
            String s2 = split[1].substring(index);
         //   Map<String, Boolean> recordFields = getRecordFields(mch);
            s2 = swapRecordFields(s2, freeIdentifiers, recordFields);
           
            SPredicate = SPredicate + " " + s2;
		}
		else {
			FreeIdentifier[] freeIdentifiers = parsePredicate.getFreeIdentifiers();
			String parse = parsePredicate.toString();
			parse = " " + parse + " ";
			SPredicate = swapRecordFields(BPredicate, freeIdentifiers, recordFields);//BPredicate
			//SPredicate = BPredicate;
		}
		//TODO: Check if there is more
	    SPredicate = SPredicate.replaceAll("∧", " and ");
	    SPredicate = SPredicate.replaceAll("∨", " or ");
	    SPredicate = SPredicate.replaceAll("∈", " in ");
	    SPredicate = SPredicate.replaceAll("∉" , " not in ");
	    SPredicate = SPredicate.replaceAll("≠" , " /= ");
	    SPredicate = SPredicate.replaceAll("‥" , " .. ");
		return SPredicate;
	}
	
	public static List<String> getSCAxiomStrings(Context context) throws RodinDBException{
		List <String> axioms = new ArrayList<String>();
		IContextRoot cxtRoot = EventBEMFUtils.getRoot(context);
		ISCContextRoot scCxtRoot = cxtRoot.getSCContextRoot();
		ISCAxiom[] scAxioms = scCxtRoot.getSCAxioms();
		for(ISCAxiom scAxiom : scAxioms) {
			axioms.add(scAxiom.getPredicateString());
		}
		return axioms;
	}
	/**
	 * Returns a hash map with the key the name of
	 *  all variables and constants seen by a machine 
	 *  and value is boolean, true if it is a record field
	 *  and false otherwise
	 * @param mch
	 * @return result
	 * @throws RodinDBException 
	 * TODO: No need for boolean, may save record name or rodin file name
	 */
	public static Map <String, Boolean> getRecordFields(Machine mch) throws RodinDBException {
		Map<String, Boolean> result = new HashMap<String, Boolean>();
		
            // find variable records
			String uriString = mch.eResource().getURI().toString();
			uriString = uriString.substring(0, uriString.lastIndexOf("bum"));
			uriString = uriString + "bumx";
			URI uri = URI.createURI(uriString);

			EMFRodinDB emfRodinDB = new EMFRodinDB(mch.eResource().getResourceSet());

			Resource rodinResource = emfRodinDB.loadResource(uri);
			
			Machine xmch = (Machine) rodinResource.getContents().get(0);
			
            for(AbstractExtension ext : xmch.getExtensions()) {
            	if(ext instanceof Record) {
//					result.put(((Record) ext).getName(), true);
            		Record rec = (Record) ext;
            		for (Field field : rec.getFields())
            			result.put(field.getName(), true);
            	}
            }
            
//            for (Variable var : xmch.getVariables()) 
//            	result.put(var.getName(), false);	
         
            // Find constant records
          URI uriProj = mch.eResource().getURI().trimSegments(1);
          ISCInternalContext[] scSeenContexts = getSCSeenContexts(mch);
          for (ISCInternalContext scSeenContext : scSeenContexts) {
        	  URI uriCxt = uriProj.appendSegment(scSeenContext.getComponentName()+(".bucx"));
        		Resource cxtResource = emfRodinDB.loadResource(uriCxt);
    			Context xcxt = (Context) cxtResource.getContents().get(0);
    	        for(AbstractExtension ext : xcxt.getExtensions()) {
    	            	if(ext instanceof Record) {
//    						result.put(((Record) ext).getName(), true);
    	            		Record rec = (Record) ext;
    	            		for ( Field field : rec.getFields())
    	            			result.put(field.getName(), true);
    	            	}
    	            }
    	            
//    	       for (Constant constant : xcxt.getConstants()) 
//    	    	   result.put(constant.getName(), false);	
          	}
		return result;
	}
	
	private static String swapRecordFields(String str, FreeIdentifier[] freeIdentifiers, Map <String, Boolean> recordFields) {
		 for (FreeIdentifier identifier : freeIdentifiers) {
         	String name = identifier.getName();
         	if (recordFields.containsKey(name)) {
//         		String patternString = "(.*)" + name + "(\\(.*)";//\\(
         		String patternString = "(.*)" + name + "(\\(.*\\))" + "(.*)";//\\(
         		Pattern pattern = Pattern.compile(patternString);
                 Matcher matcher = pattern.matcher(str);
                 if(matcher.matches()) {
                 	String group = matcher.group(2);
//                 	String s0 = matcher.group(0);
//                 	String s1 = matcher.group(1);
//                 	String s2 = matcher.group(2);
//                 	String s3 = matcher.group(3);
//                 	String s = s0 + s1+s2;
                 	int count = matcher.groupCount();
                 	if (count > 2)
                 		count = count;
                 	//TODO: This ad hoc might need more testing
                 	String before = name + group;
                     String after = group.substring(1, group.length()-1)+(".")+ name;
                 	str = str.replace(before, after);
                 }
         	}
         }
		return  str;
	}
	
	public static String getSparkPostCondition(String BAction, Machine mch) throws RodinDBException {
		IMachineRoot mchRoot = EventBEMFUtils.getRoot(mch);
		FormulaFactory ff = mchRoot.getFormulaFactory();
		Map<String, Boolean> recordFields = getRecordFields(mch);

		Assignment assignment = DLib.parseAssignment(ff, BAction);
		FreeIdentifier[] freeIdentifiers = assignment.getFreeIdentifiers();

        String preCondStr = swapRecordFields(BAction, freeIdentifiers, recordFields);
        String[] split = preCondStr.split("≔");
        for(FreeIdentifier freeIdentifier : freeIdentifiers) {
        	if(split[0].contains(freeIdentifier.getName())){
        		if(split[1].contains(freeIdentifier.getName())) 
        			split[1] = split[1].replace(freeIdentifier.getName(), freeIdentifier.getName() + "' old");
        		else if(split[0].indexOf(freeIdentifier.getName()) > 0) {
        			int index = split[0].indexOf(freeIdentifier.getName()) -1;
        			if (split[0].charAt(index) == '(')
        				split[0] = split[0].replace(freeIdentifier.getName(), freeIdentifier.getName() + "' old");
        		}
        			
        	}
        }
        preCondStr = split[0] + " = " + split[1];
		return preCondStr;
//		return BAction;
	}

}
