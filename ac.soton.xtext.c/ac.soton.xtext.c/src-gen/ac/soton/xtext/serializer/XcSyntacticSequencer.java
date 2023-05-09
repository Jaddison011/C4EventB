/*
 * generated by Xtext 2.25.0
 */
package ac.soton.xtext.serializer;

import ac.soton.xtext.services.XcGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class XcSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XcGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CType_CBooleanParserRuleCall_1_1_or_CIntParserRuleCall_0_1;
	protected AbstractElementAlias match_Context___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q;
	protected AbstractElementAlias match_Initialisation___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q;
	protected AbstractElementAlias match_Main___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XcGrammarAccess) access;
		match_CType_CBooleanParserRuleCall_1_1_or_CIntParserRuleCall_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCTypeAccess().getCBooleanParserRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getCTypeAccess().getCIntParserRuleCall_0_1()));
		match_Context___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getContextAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getContextAccess().getRightParenthesisKeyword_1_1()));
		match_Initialisation___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInitialisationAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getInitialisationAccess().getRightParenthesisKeyword_1_1()));
		match_Main___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMainAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getMainAccess().getRightParenthesisKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCBooleanRule())
			return getCBooleanToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCIntRule())
			return getCIntToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEIntRule())
			return getEIntToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEStringRule())
			return getEStringToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMathematicalFormulaRule())
			return getMathematicalFormulaToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPredicateRule())
			return getPredicateToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * CBoolean returns ecore::EString:
	 * 	'1' | '0'
	 * ;
	 */
	protected String getCBooleanToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "1";
	}
	
	/**
	 * CInt returns ecore::EString:
	 * 	'-'? INT
	 * ;
	 */
	protected String getCIntToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * EInt returns ecore::EInt:
	 * 	'-'? INT;
	 */
	protected String getEIntToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * EString returns ecore::EString:
	 * 	STRING | ID;
	 */
	protected String getEStringToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * MathematicalFormula returns ecore::EString:
	 * 	'++' |
	 * 	'--'
	 * ;
	 */
	protected String getMathematicalFormulaToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "++";
	}
	
	/**
	 * Predicate returns ecore::EString:
	 * 	'test'
	 * ;
	 */
	protected String getPredicateToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "test";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_CType_CBooleanParserRuleCall_1_1_or_CIntParserRuleCall_0_1.equals(syntax))
				emit_CType_CBooleanParserRuleCall_1_1_or_CIntParserRuleCall_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Context___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q.equals(syntax))
				emit_Context___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Initialisation___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q.equals(syntax))
				emit_Initialisation___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Main___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q.equals(syntax))
				emit_Main___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     CInt | CBoolean
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_CType_CBooleanParserRuleCall_1_1_or_CIntParserRuleCall_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name='context' (ambiguity) '{' '}' (rule end)
	 *     name='context' (ambiguity) '{' body+=CExpression
	 *     name='context' (ambiguity) '{' localVariables+=CVariable
	 */
	protected void emit_Context___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name='initialisation' (ambiguity) '{' '}' (rule end)
	 *     name='initialisation' (ambiguity) '{' body+=CExpression
	 *     name='initialisation' (ambiguity) '{' localVariables+=CVariable
	 */
	protected void emit_Initialisation___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name='main' (ambiguity) '{' '}' (rule end)
	 *     name='main' (ambiguity) '{' body+=CExpression
	 *     name='main' (ambiguity) '{' localVariables+=CVariable
	 */
	protected void emit_Main___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}