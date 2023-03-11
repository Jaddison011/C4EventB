package ac.soton.eventb.c.generator.handlers;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.DefaultAdapter;

import ac.soton.eventb.spark.SparkPackage;
import ac.soton.eventb.spark.Spark_Package;
import ac.soton.eventb.spark.SparkPackageSpec;
import ac.soton.eventb.spark.SparkPackageImp;
public class CTranslateAdapter extends DefaultAdapter {
	
	protected static final EReference specPackages = SparkPackage.Literals.SPARK_PROJECT__SPEC_PACKAGES;
	protected static final EReference impPackages = SparkPackage.Literals.SPARK_PROJECT__IMP_PACKAGES;
	/**
	 * returns true if feature is project package and value is Package
	 * 
	 */
	@Override
	public boolean isRoot(TranslationDescriptor translationDescriptor) {
		if ((translationDescriptor.feature == specPackages | translationDescriptor.feature == impPackages)&& 
				translationDescriptor.value instanceof Spark_Package){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * returns a URI for..
	 *  a Specification Package (.ads) or..
	 * @ToDo an Implementation Package(.adb)  
	 *  
	 */
	@Override
	public URI getComponentURI(TranslationDescriptor translationDescriptor, EObject rootElement) {
		if (translationDescriptor.remove == true) return null;
		String projectName = EcoreUtil.getURI(rootElement).segment(1);
		URI projectUri = URI.createPlatformResourceURI(projectName, true);
		
		Spark_Package sparkPackage = null;
		if (translationDescriptor.value instanceof Spark_Package){
			     sparkPackage = (Spark_Package) translationDescriptor.value;
			    
			
		}
		if (sparkPackage  != null){
			String [] pckPath = new String[2];
			pckPath[0]= "SPARK";
			pckPath[1]=sparkPackage.getName();
			URI projUri = null;
			if (sparkPackage instanceof SparkPackageSpec)
				projUri = projectUri.appendSegments(pckPath).appendFileExtension("ads"); //spc
			else if(sparkPackage instanceof SparkPackageImp)
				projUri = projectUri.appendSegments(pckPath).appendFileExtension("adb"); //imp
//			URI projUri = projectUri.appendSegment("SPARK");
//		    projUri = projectUri.appendSegment(specPackage.getName()).appendFileExtension("ads"); //$NON-NLS-1$
			return projUri;
		}

		return null;
	}
	
//	/**
//	 * @see ac.soton.emf.translator.configuration.DefaultAdapter#getAffectedResources(org.eclipse.emf.transaction.TransactionalEditingDomain, org.eclipse.emf.ecore.EObject)
//	 * 
//	 * This implementation returns all EMF resources in the same project as the source element that are EventB Machines or Contexts 
//	 * 
//	 * @param editingDomain
//	 * @param sourceElement
//	 * @return list of affected Resources
//	 */
//	@Override
//	public Collection<Resource> getAffectedResources(TransactionalEditingDomain editingDomain, EObject sourceElement) throws IOException {
//		List<Resource> affectedResources = new ArrayList<Resource>();
//		String projectName = EcoreUtil.getURI(sourceElement).segment(1);
//		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
//		if (project.exists()){
//			try {
//				IResource[] members = project.members();
//				ResourceSet resourceSet = editingDomain.getResourceSet();
//				for (IResource res : members){
//					final URI fileURI = URI.createPlatformResourceURI(projectName + "/SPARK/" + res.getName(), true);
//					if ("eds".equals(fileURI.fileExtension()) || "edb".equals(fileURI.fileExtension())){ 
//						Resource resource = resourceSet.getResource(fileURI, false);
//						if (resource != null) {
//							if (!resource.isLoaded()) {
//								resource.load(Collections.emptyMap());
//							}
//							if (resource.isLoaded()) {
//								affectedResources.add(resource);
//							} 
//						}
//					}
//				}
//			} catch (CoreException e) {
//				e.printStackTrace();
//			}
//		}
//		return affectedResources;
//	}

}
