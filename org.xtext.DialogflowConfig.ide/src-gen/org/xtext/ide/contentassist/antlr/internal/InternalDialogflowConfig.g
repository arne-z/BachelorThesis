/*
 * generated by Xtext 2.16.0
 */
grammar InternalDialogflowConfig;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.DialogflowConfigGrammarAccess;

}
@parser::members {
	private DialogflowConfigGrammarAccess grammarAccess;

	public void setGrammarAccess(DialogflowConfigGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleAgent
entryRuleAgent
:
{ before(grammarAccess.getAgentRule()); }
	 ruleAgent
{ after(grammarAccess.getAgentRule()); } 
	 EOF 
;

// Rule Agent
ruleAgent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAgentAccess().getGroup()); }
		(rule__Agent__Group__0)
		{ after(grammarAccess.getAgentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElement
entryRuleElement
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementAccess().getAlternatives()); }
		(rule__Element__Alternatives)
		{ after(grammarAccess.getElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntent
entryRuleIntent
:
{ before(grammarAccess.getIntentRule()); }
	 ruleIntent
{ after(grammarAccess.getIntentRule()); } 
	 EOF 
;

// Rule Intent
ruleIntent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntentAccess().getGroup()); }
		(rule__Intent__Group__0)
		{ after(grammarAccess.getIntentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getNameAssignment()); }
		(rule__State__NameAssignment)
		{ after(grammarAccess.getStateAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getIntentParserRuleCall_0()); }
		ruleIntent
		{ after(grammarAccess.getElementAccess().getIntentParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getElementAccess().getEntityParserRuleCall_1()); }
		ruleEntity
		{ after(grammarAccess.getElementAccess().getEntityParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Agent__Group__0__Impl
	rule__Agent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAgentAccess().getAgentKeyword_0()); }
	'Agent'
	{ after(grammarAccess.getAgentAccess().getAgentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Agent__Group__1__Impl
	rule__Agent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAgentAccess().getNameAssignment_1()); }
	(rule__Agent__NameAssignment_1)
	{ after(grammarAccess.getAgentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Agent__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAgentAccess().getElementsAssignment_2()); }
	(rule__Agent__ElementsAssignment_2)*
	{ after(grammarAccess.getAgentAccess().getElementsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Intent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__0__Impl
	rule__Intent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getUnderstandsKeyword_0()); }
	'understands'
	{ after(grammarAccess.getIntentAccess().getUnderstandsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__1__Impl
	rule__Intent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getNameAssignment_1()); }
	(rule__Intent__NameAssignment_1)
	{ after(grammarAccess.getIntentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__2__Impl
	rule__Intent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getGroup_2()); }
	(rule__Intent__Group_2__0)?
	{ after(grammarAccess.getIntentAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__3__Impl
	rule__Intent__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getTrainedKeyword_3()); }
	'trained'
	{ after(grammarAccess.getIntentAccess().getTrainedKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__4__Impl
	rule__Intent__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getWithKeyword_4()); }
	'with'
	{ after(grammarAccess.getIntentAccess().getWithKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getFileAssignment_5()); }
	(rule__Intent__FileAssignment_5)
	{ after(grammarAccess.getIntentAccess().getFileAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Intent__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group_2__0__Impl
	rule__Intent__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getWithKeyword_2_0()); }
	'with'
	{ after(grammarAccess.getIntentAccess().getWithKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group_2__1__Impl
	rule__Intent__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getParametersAssignment_2_1()); }
	(rule__Intent__ParametersAssignment_2_1)
	{ after(grammarAccess.getIntentAccess().getParametersAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getGroup_2_2()); }
	(rule__Intent__Group_2_2__0)*
	{ after(grammarAccess.getIntentAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Intent__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group_2_2__0__Impl
	rule__Intent__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getIntentAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Intent__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntentAccess().getParametersAssignment_2_2_1()); }
	(rule__Intent__ParametersAssignment_2_2_1)
	{ after(grammarAccess.getIntentAccess().getParametersAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRecognizesKeyword_0()); }
	'recognizes'
	{ after(grammarAccess.getEntityAccess().getRecognizesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_2()); }
	(rule__Entity__Group_2__0)*
	{ after(grammarAccess.getEntityAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__0__Impl
	rule__Entity__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getIsKeyword_2_0()); }
	'is'
	{ after(grammarAccess.getEntityAccess().getIsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getStatesAssignment_2_1()); }
	(rule__Entity__StatesAssignment_2_1)
	{ after(grammarAccess.getEntityAccess().getStatesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Agent__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__ElementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAgentAccess().getElementsElementParserRuleCall_2_0()); }
		ruleElement
		{ after(grammarAccess.getAgentAccess().getElementsElementParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__ParametersAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntentAccess().getParametersEntityCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getIntentAccess().getParametersEntityIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getIntentAccess().getParametersEntityIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getIntentAccess().getParametersEntityCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__ParametersAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntentAccess().getParametersEntityCrossReference_2_2_1_0()); }
		(
			{ before(grammarAccess.getIntentAccess().getParametersEntityIDTerminalRuleCall_2_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getIntentAccess().getParametersEntityIDTerminalRuleCall_2_2_1_0_1()); }
		)
		{ after(grammarAccess.getIntentAccess().getParametersEntityCrossReference_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Intent__FileAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntentAccess().getFileSTRINGTerminalRuleCall_5_0()); }
		RULE_STRING
		{ after(grammarAccess.getIntentAccess().getFileSTRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__StatesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getStatesStateParserRuleCall_2_1_0()); }
		ruleState
		{ after(grammarAccess.getEntityAccess().getStatesStateParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
