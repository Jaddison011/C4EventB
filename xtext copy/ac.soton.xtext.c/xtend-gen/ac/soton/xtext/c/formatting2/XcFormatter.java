/**
 * generated by Xtext 2.25.0
 */
package ac.soton.xtext.c.formatting2;

import ac.soton.xtext.c.services.XcGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class XcFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private XcGrammarAccess _xcGrammarAccess;

  protected void _format(final /* CTranslationUnit */Object cTranslationUnit, @Extension final IFormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nsourceFiles cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nheaderFiles cannot be resolved"
      + "\nformat cannot be resolved");
  }

  protected void _format(final /* CSourceFile */Object cSourceFile, @Extension final IFormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nsubPrograms cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nglobalVariables cannot be resolved"
      + "\nformat cannot be resolved"
      + "\ntypes cannot be resolved"
      + "\nformat cannot be resolved"
      + "\nincludeDirectives cannot be resolved"
      + "\nformat cannot be resolved");
  }

  public void format(final Object cTranslationUnit, final IFormattableDocument document) {
    if (cTranslationUnit instanceof XtextResource) {
      _format((XtextResource)cTranslationUnit, document);
      return;
    } else if (cTranslationUnit instanceof EObject) {
      _format((EObject)cTranslationUnit, document);
      return;
    } else if (cTranslationUnit == null) {
      _format((Void)null, document);
      return;
    } else if (cTranslationUnit != null) {
      _format(cTranslationUnit, document);
      return;
    } else if (cTranslationUnit != null) {
      _format(cTranslationUnit, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cTranslationUnit, document).toString());
    }
  }
}
