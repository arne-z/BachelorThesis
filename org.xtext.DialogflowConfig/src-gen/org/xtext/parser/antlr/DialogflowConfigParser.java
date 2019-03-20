/*
 * generated by Xtext 2.16.0
 */
package org.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.parser.antlr.internal.InternalDialogflowConfigParser;
import org.xtext.services.DialogflowConfigGrammarAccess;

public class DialogflowConfigParser extends AbstractAntlrParser {

	@Inject
	private DialogflowConfigGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDialogflowConfigParser createParser(XtextTokenStream stream) {
		return new InternalDialogflowConfigParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Agent";
	}

	public DialogflowConfigGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DialogflowConfigGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
