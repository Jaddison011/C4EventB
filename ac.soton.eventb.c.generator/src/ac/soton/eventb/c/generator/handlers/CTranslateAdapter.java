package ac.soton.eventb.c.generator.handlers;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.DefaultAdapter;

import C.ecore.CSourceFile;
import C.ecore.EcorePackage;
import C.ecore.CHeaderFile;
import C.ecore.CFile;
public class CTranslateAdapter extends DefaultAdapter {
	
	protected static final EReference sourceFiles = EcorePackage.Literals.CTRANSLATION_UNIT__SOURCE_FILES;
	protected static final EReference headerFiles = EcorePackage.Literals.CTRANSLATION_UNIT__HEADER_FILES;
	/**
	 * returns true if feature is project package and value is Package
	 * 
	 */
	@Override
	public boolean isRoot(TranslationDescriptor translationDescriptor) {
		if ((translationDescriptor.feature == sourceFiles | translationDescriptor.feature == headerFiles) && 
				translationDescriptor.value instanceof CFile){
			return true;
		} else {
			return false;
		}
	}

	/**
	 * returns a URI for..
	 *  a source file (.c) or..
	 * @ToDo a header file (.h)  
	 *  
	 */
	@Override
	public URI getComponentURI(TranslationDescriptor translationDescriptor, EObject rootElement) {
		if (translationDescriptor.remove == true) return null;
		String projectName = EcoreUtil.getURI(rootElement).segment(1);
		URI projectUri = URI.createPlatformResourceURI(projectName, true);
		
		CFile cFile = null;
		if (translationDescriptor.value instanceof CFile){
			     cFile = (CFile) translationDescriptor.value;
			    
			
		}
		if (cFile  != null){
			String [] pckPath = new String[2];
			pckPath[0]= "C";
			pckPath[1]=cFile.getName();
			URI projUri = null;
			if (cFile instanceof CSourceFile)
				projUri = projectUri.appendSegments(pckPath).appendFileExtension("c"); //source files
			else if(cFile instanceof CHeaderFile)
				projUri = projectUri.appendSegments(pckPath).appendFileExtension("h"); //header files
			System.out.println("Output file" + projUri);
			return projUri;
		}

		return null;
	}
}