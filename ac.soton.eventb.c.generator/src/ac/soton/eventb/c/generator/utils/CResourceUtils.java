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
import C.ecore.CNamedElement;

public class CResourceUtils {

	/**
	 * @param mch
	 * @param monitor
	 *            the progress monitor to use for reporting progress to the
	 *            user, or <code>null</code> indicating that no progress should
	 *            be reported and the operation cannot be cancelled.
	 * @return
	 * @throws CoreException
	 */
	public static IFolder getCFolder(EventBElement elem)
			throws CoreException {
		URI uri = EcoreUtil.getURI(elem);
		uri = uri.trimFileExtension();
		uri = uri.trimSegments(1);
		uri = uri.appendSegment("C");
		IPath folderPath = new Path(uri.toPlatformString(true));
		folderPath = folderPath.makeAbsolute();
		IFolder cFolder = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(folderPath);
		if (!cFolder.exists()) {
			cFolder.create(false, true, null);
		}
		return cFolder;
	}
	
	/**
	 * Find by name, an element in a list of CNamedElement elements
	 * @param collection
	 * @param name
	 * @return
	 *  * @see ac.soton.emf.translator.eventb.utils.Find;
	 */
		public static CNamedElement named(EList<? extends CNamedElement> collection, String name){
			for (CNamedElement element : collection){
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
			public static Object findGeneratedElement(List<TranslationDescriptor> generatedElements, CNamedElement parent, EStructuralFeature feature, String identifier) {
				for (TranslationDescriptor generatedElement : generatedElements){
					if ((parent == null || generatedElement.parent == parent) && 
						(feature == null || generatedElement.feature== feature)){
						if ((generatedElement.value instanceof CNamedElement && identifier.equals(((CNamedElement)generatedElement.value).getName())
						|| (generatedElement.value instanceof String && ((String)generatedElement.value).equals(identifier))))
							return generatedElement.value;
					}
				}
				return null;
			}


}
