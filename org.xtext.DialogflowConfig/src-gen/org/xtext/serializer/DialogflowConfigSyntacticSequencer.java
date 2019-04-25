/*
 * generated by Xtext 2.16.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.DialogflowConfigGrammarAccess;

@SuppressWarnings("all")
public class DialogflowConfigSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DialogflowConfigGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EntityType_StateKeyword_3_0_0_a;
	protected AbstractElementAlias match_EntityType_StateKeyword_3_0_0_p;
	protected AbstractElementAlias match_Entity___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	protected AbstractElementAlias match_Intent_ContextsKeyword_3_0_q;
	protected AbstractElementAlias match_Intent_ParametersKeyword_2_0_q;
	protected AbstractElementAlias match_Parameter___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DialogflowConfigGrammarAccess) access;
		match_EntityType_StateKeyword_3_0_0_a = new TokenAlias(true, true, grammarAccess.getEntityTypeAccess().getStateKeyword_3_0_0());
		match_EntityType_StateKeyword_3_0_0_p = new TokenAlias(true, false, grammarAccess.getEntityTypeAccess().getStateKeyword_3_0_0());
		match_Entity___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getEntityAccess().getRightParenthesisKeyword_1_2()));
		match_Intent_ContextsKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getIntentAccess().getContextsKeyword_3_0());
		match_Intent_ParametersKeyword_2_0_q = new TokenAlias(false, true, grammarAccess.getIntentAccess().getParametersKeyword_2_0());
		match_Parameter___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getParameterAccess().getRightParenthesisKeyword_1_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_EntityType_StateKeyword_3_0_0_a.equals(syntax))
				emit_EntityType_StateKeyword_3_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EntityType_StateKeyword_3_0_0_p.equals(syntax))
				emit_EntityType_StateKeyword_3_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entity___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_Entity___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Intent_ContextsKeyword_3_0_q.equals(syntax))
				emit_Intent_ContextsKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Intent_ParametersKeyword_2_0_q.equals(syntax))
				emit_Intent_ParametersKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parameter___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_Parameter___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'state'*
	 *
	 * This ambiguous syntax occurs at:
	 *     allowFuzzyExtraction?='fuzzy_extract' (ambiguity) (rule end)
	 *     allowFuzzyExtraction?='fuzzy_extract' (ambiguity) allowFuzzyExtraction?='fuzzy_extract'
	 *     allowFuzzyExtraction?='fuzzy_extract' (ambiguity) automatedExpansion?='auto_expand'
	 *     allowFuzzyExtraction?='fuzzy_extract' (ambiguity) isEnum?='enum'
	 *     automatedExpansion?='auto_expand' (ambiguity) (rule end)
	 *     automatedExpansion?='auto_expand' (ambiguity) allowFuzzyExtraction?='fuzzy_extract'
	 *     automatedExpansion?='auto_expand' (ambiguity) automatedExpansion?='auto_expand'
	 *     automatedExpansion?='auto_expand' (ambiguity) isEnum?='enum'
	 *     builtIn?='builtin' (ambiguity) (rule end)
	 *     builtIn?='builtin' (ambiguity) allowFuzzyExtraction?='fuzzy_extract'
	 *     builtIn?='builtin' (ambiguity) automatedExpansion?='auto_expand'
	 *     builtIn?='builtin' (ambiguity) isEnum?='enum'
	 *     dynamic?='dynamic' (ambiguity) (rule end)
	 *     dynamic?='dynamic' (ambiguity) allowFuzzyExtraction?='fuzzy_extract'
	 *     dynamic?='dynamic' (ambiguity) automatedExpansion?='auto_expand'
	 *     dynamic?='dynamic' (ambiguity) isEnum?='enum'
	 *     isEnum?='enum' (ambiguity) (rule end)
	 *     isEnum?='enum' (ambiguity) allowFuzzyExtraction?='fuzzy_extract'
	 *     isEnum?='enum' (ambiguity) automatedExpansion?='auto_expand'
	 *     isEnum?='enum' (ambiguity) isEnum?='enum'
	 *     isOverridable?='overridable' (ambiguity) (rule end)
	 *     isOverridable?='overridable' (ambiguity) allowFuzzyExtraction?='fuzzy_extract'
	 *     isOverridable?='overridable' (ambiguity) automatedExpansion?='auto_expand'
	 *     isOverridable?='overridable' (ambiguity) isEnum?='enum'
	 *     values+=Entity (ambiguity) (rule end)
	 *     values+=Entity (ambiguity) allowFuzzyExtraction?='fuzzy_extract'
	 *     values+=Entity (ambiguity) automatedExpansion?='auto_expand'
	 *     values+=Entity (ambiguity) isEnum?='enum'
	 */
	protected void emit_EntityType_StateKeyword_3_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'state'+
	 *
	 * This ambiguous syntax occurs at:
	 *     allowFuzzyExtraction?='fuzzy_extract' (ambiguity) isOverridable?='overridable'
	 *     automatedExpansion?='auto_expand' (ambiguity) isOverridable?='overridable'
	 *     builtIn?='builtin' (ambiguity) isOverridable?='overridable'
	 *     dynamic?='dynamic' (ambiguity) isOverridable?='overridable'
	 *     isEnum?='enum' (ambiguity) isOverridable?='overridable'
	 *     isOverridable?='overridable' (ambiguity) isOverridable?='overridable'
	 *     values+=Entity (ambiguity) isOverridable?='overridable'
	 */
	protected void emit_EntityType_StateKeyword_3_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=STRING (ambiguity) (rule end)
	 */
	protected void emit_Entity___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'contexts'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID 'parameters'? (ambiguity) 'file' file=STRING
	 *     name=ID 'parameters'? (ambiguity) 'response' responses+=STRING
	 *     name=ID 'parameters'? (ambiguity) 'trained' 'with' trainingPhrases+=TrainingPhrase
	 *     name=ID 'parameters'? (ambiguity) (rule end)
	 *     name=ID 'parameters'? (ambiguity) webHook?='webhook'
	 *     name=ID 'parameters'? (ambiguity) webHookForSlotFilling?='webhook_for_slot_filling'
	 *     parameters+=Parameter (ambiguity) 'file' file=STRING
	 *     parameters+=Parameter (ambiguity) 'response' responses+=STRING
	 *     parameters+=Parameter (ambiguity) 'trained' 'with' trainingPhrases+=TrainingPhrase
	 *     parameters+=Parameter (ambiguity) (rule end)
	 *     parameters+=Parameter (ambiguity) webHook?='webhook'
	 *     parameters+=Parameter (ambiguity) webHookForSlotFilling?='webhook_for_slot_filling'
	 */
	protected void emit_Intent_ContextsKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'parameters'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) 'contexts' 'in' inputContexts+=InputContext
	 *     name=ID (ambiguity) 'contexts' 'out' affectedContexts+=OutputContext
	 *     name=ID (ambiguity) 'contexts'? 'file' file=STRING
	 *     name=ID (ambiguity) 'contexts'? 'response' responses+=STRING
	 *     name=ID (ambiguity) 'contexts'? 'trained' 'with' trainingPhrases+=TrainingPhrase
	 *     name=ID (ambiguity) 'contexts'? (rule end)
	 *     name=ID (ambiguity) 'contexts'? webHook?='webhook'
	 *     name=ID (ambiguity) 'contexts'? webHookForSlotFilling?='webhook_for_slot_filling'
	 */
	protected void emit_Intent_ParametersKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=[EntityType|ID] (ambiguity) (rule end)
	 */
	protected void emit_Parameter___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
