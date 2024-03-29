/*
 * generated by Xtext 2.25.0
 */
package ac.soton.xtext.parser.antlr;

import ac.soton.xtext.parser.antlr.internal.InternalXcParser;
import ac.soton.xtext.services.XcGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class XcParser extends AbstractAntlrParser {

	@Inject
	private XcGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalXcParser createParser(XtextTokenStream stream) {
		return new InternalXcParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "CSourceFile";
	}

	public XcGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XcGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
