package ac.soton.eventb.c.generator.utils;



import java.util.List;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.eventb.spark.SparkNamedElement;

public class SparkResourceUtils {

	/**
	 * @param mch
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user, or <code>null</code> indicating that no progress should
	 *            be reported and the operation cannot be cancelled.
	 * @return
	 * @throws CoreException
	 */
	public static IFolder getSPARKFolder(EventBElement elem) //IProgressMonitor monitor??
			throws CoreException {
		URI uri = EcoreUtil.getURI(elem);
		uri = uri.trimFileExtension();
		uri = uri.trimSegments(1);
		uri = uri.appendSegment("SPARK");
		IPath folderPath = new Path(uri.toPlatformString(true));
		folderPath = folderPath.makeAbsolute();
		IFolder sparkFolder = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(folderPath);
		if (!sparkFolder.exists()) {
			sparkFolder.create(false, true, null);
		}
		return sparkFolder;
	}
	
//	public static Object getPackageFile(String filename, IFolder folder, Boolean isBody) {
//		
//		//Create the Package output file
//		IFile file;
//		if (isBody) 
//			file = folder.getFile(filename + ".adb");
//	
//		else
//			file = folder.getFile(filename + ".ads"); 
//		
//		InputStream source = new ByteArrayInputStream("test".getBytes());
//		if (!file.exists()) {
//			try {
//				file.create(source, false, null);
//			} catch (CoreException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return file;
//	}
	
	/**
	 * Find by name, an element in a list of SparkNamedElement elements
	 * @param collection
	 * @param name
	 * @return
	 *  * @see ac.soton.emf.translator.eventb.utils.Find;
	 */
		public static SparkNamedElement named(EList<? extends SparkNamedElement> collection, String name){
			for (SparkNamedElement element : collection){
				if (name.equals(element.getName())) return element;
			}
			return null;
		}
		
		/**
		 * Find, by name or label and matching parent and feature, a generation descriptor from the given collection
		 * (parent and/or feature may be null if not required to be matched)
		 * 
		 * @param generatedElements
		 * @param parent (or null)
		 * @param feature (or null)
		 * @param identifier
		 * @return
		 * @see ac.soton.emf.translator.eventb.utils.Find;
		 * 
		 */
			public static Object findGeneratedElement(List<TranslationDescriptor> generatedElements, SparkNamedElement parent, EStructuralFeature feature, String identifier) {
				for (TranslationDescriptor generatedElement : generatedElements){
					if ((parent == null || generatedElement.parent == parent) && 
						(feature == null || generatedElement.feature== feature)){
						if ((generatedElement.value instanceof SparkNamedElement && identifier.equals(((SparkNamedElement)generatedElement.value).getName())
						|| (generatedElement.value instanceof String && ((String)generatedElement.value).equals(identifier))))
							return generatedElement.value;
					}
				}
				return null;
			}


}
