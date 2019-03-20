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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDialogflowConfigParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Agent'", "'understands'", "'trained'", "'with'", "','", "'recognizes'", "'is'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDialogflowConfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDialogflowConfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDialogflowConfigParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDialogflowConfig.g"; }


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



    // $ANTLR start "entryRuleAgent"
    // InternalDialogflowConfig.g:53:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // InternalDialogflowConfig.g:54:1: ( ruleAgent EOF )
            // InternalDialogflowConfig.g:55:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalDialogflowConfig.g:62:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:66:2: ( ( ( rule__Agent__Group__0 ) ) )
            // InternalDialogflowConfig.g:67:2: ( ( rule__Agent__Group__0 ) )
            {
            // InternalDialogflowConfig.g:67:2: ( ( rule__Agent__Group__0 ) )
            // InternalDialogflowConfig.g:68:3: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // InternalDialogflowConfig.g:69:3: ( rule__Agent__Group__0 )
            // InternalDialogflowConfig.g:69:4: rule__Agent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleElement"
    // InternalDialogflowConfig.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalDialogflowConfig.g:79:1: ( ruleElement EOF )
            // InternalDialogflowConfig.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDialogflowConfig.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalDialogflowConfig.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalDialogflowConfig.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalDialogflowConfig.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalDialogflowConfig.g:94:3: ( rule__Element__Alternatives )
            // InternalDialogflowConfig.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleIntent"
    // InternalDialogflowConfig.g:103:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // InternalDialogflowConfig.g:104:1: ( ruleIntent EOF )
            // InternalDialogflowConfig.g:105:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // InternalDialogflowConfig.g:112:1: ruleIntent : ( ( rule__Intent__Group__0 ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:116:2: ( ( ( rule__Intent__Group__0 ) ) )
            // InternalDialogflowConfig.g:117:2: ( ( rule__Intent__Group__0 ) )
            {
            // InternalDialogflowConfig.g:117:2: ( ( rule__Intent__Group__0 ) )
            // InternalDialogflowConfig.g:118:3: ( rule__Intent__Group__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup()); 
            // InternalDialogflowConfig.g:119:3: ( rule__Intent__Group__0 )
            // InternalDialogflowConfig.g:119:4: rule__Intent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleEntity"
    // InternalDialogflowConfig.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDialogflowConfig.g:129:1: ( ruleEntity EOF )
            // InternalDialogflowConfig.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDialogflowConfig.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDialogflowConfig.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDialogflowConfig.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalDialogflowConfig.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDialogflowConfig.g:144:3: ( rule__Entity__Group__0 )
            // InternalDialogflowConfig.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleState"
    // InternalDialogflowConfig.g:153:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalDialogflowConfig.g:154:1: ( ruleState EOF )
            // InternalDialogflowConfig.g:155:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalDialogflowConfig.g:162:1: ruleState : ( ( rule__State__NameAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:166:2: ( ( ( rule__State__NameAssignment ) ) )
            // InternalDialogflowConfig.g:167:2: ( ( rule__State__NameAssignment ) )
            {
            // InternalDialogflowConfig.g:167:2: ( ( rule__State__NameAssignment ) )
            // InternalDialogflowConfig.g:168:3: ( rule__State__NameAssignment )
            {
             before(grammarAccess.getStateAccess().getNameAssignment()); 
            // InternalDialogflowConfig.g:169:3: ( rule__State__NameAssignment )
            // InternalDialogflowConfig.g:169:4: rule__State__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalDialogflowConfig.g:177:1: rule__Element__Alternatives : ( ( ruleIntent ) | ( ruleEntity ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:181:1: ( ( ruleIntent ) | ( ruleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDialogflowConfig.g:182:2: ( ruleIntent )
                    {
                    // InternalDialogflowConfig.g:182:2: ( ruleIntent )
                    // InternalDialogflowConfig.g:183:3: ruleIntent
                    {
                     before(grammarAccess.getElementAccess().getIntentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntent();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getIntentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDialogflowConfig.g:188:2: ( ruleEntity )
                    {
                    // InternalDialogflowConfig.g:188:2: ( ruleEntity )
                    // InternalDialogflowConfig.g:189:3: ruleEntity
                    {
                     before(grammarAccess.getElementAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Agent__Group__0"
    // InternalDialogflowConfig.g:198:1: rule__Agent__Group__0 : rule__Agent__Group__0__Impl rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:202:1: ( rule__Agent__Group__0__Impl rule__Agent__Group__1 )
            // InternalDialogflowConfig.g:203:2: rule__Agent__Group__0__Impl rule__Agent__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Agent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__0"


    // $ANTLR start "rule__Agent__Group__0__Impl"
    // InternalDialogflowConfig.g:210:1: rule__Agent__Group__0__Impl : ( 'Agent' ) ;
    public final void rule__Agent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:214:1: ( ( 'Agent' ) )
            // InternalDialogflowConfig.g:215:1: ( 'Agent' )
            {
            // InternalDialogflowConfig.g:215:1: ( 'Agent' )
            // InternalDialogflowConfig.g:216:2: 'Agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__0__Impl"


    // $ANTLR start "rule__Agent__Group__1"
    // InternalDialogflowConfig.g:225:1: rule__Agent__Group__1 : rule__Agent__Group__1__Impl rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:229:1: ( rule__Agent__Group__1__Impl rule__Agent__Group__2 )
            // InternalDialogflowConfig.g:230:2: rule__Agent__Group__1__Impl rule__Agent__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Agent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Agent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__1"


    // $ANTLR start "rule__Agent__Group__1__Impl"
    // InternalDialogflowConfig.g:237:1: rule__Agent__Group__1__Impl : ( ( rule__Agent__NameAssignment_1 ) ) ;
    public final void rule__Agent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:241:1: ( ( ( rule__Agent__NameAssignment_1 ) ) )
            // InternalDialogflowConfig.g:242:1: ( ( rule__Agent__NameAssignment_1 ) )
            {
            // InternalDialogflowConfig.g:242:1: ( ( rule__Agent__NameAssignment_1 ) )
            // InternalDialogflowConfig.g:243:2: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // InternalDialogflowConfig.g:244:2: ( rule__Agent__NameAssignment_1 )
            // InternalDialogflowConfig.g:244:3: rule__Agent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Agent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__1__Impl"


    // $ANTLR start "rule__Agent__Group__2"
    // InternalDialogflowConfig.g:252:1: rule__Agent__Group__2 : rule__Agent__Group__2__Impl ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:256:1: ( rule__Agent__Group__2__Impl )
            // InternalDialogflowConfig.g:257:2: rule__Agent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__2"


    // $ANTLR start "rule__Agent__Group__2__Impl"
    // InternalDialogflowConfig.g:263:1: rule__Agent__Group__2__Impl : ( ( rule__Agent__ElementsAssignment_2 )* ) ;
    public final void rule__Agent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:267:1: ( ( ( rule__Agent__ElementsAssignment_2 )* ) )
            // InternalDialogflowConfig.g:268:1: ( ( rule__Agent__ElementsAssignment_2 )* )
            {
            // InternalDialogflowConfig.g:268:1: ( ( rule__Agent__ElementsAssignment_2 )* )
            // InternalDialogflowConfig.g:269:2: ( rule__Agent__ElementsAssignment_2 )*
            {
             before(grammarAccess.getAgentAccess().getElementsAssignment_2()); 
            // InternalDialogflowConfig.g:270:2: ( rule__Agent__ElementsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDialogflowConfig.g:270:3: rule__Agent__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Agent__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Group__2__Impl"


    // $ANTLR start "rule__Intent__Group__0"
    // InternalDialogflowConfig.g:279:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:283:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // InternalDialogflowConfig.g:284:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Intent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0"


    // $ANTLR start "rule__Intent__Group__0__Impl"
    // InternalDialogflowConfig.g:291:1: rule__Intent__Group__0__Impl : ( 'understands' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:295:1: ( ( 'understands' ) )
            // InternalDialogflowConfig.g:296:1: ( 'understands' )
            {
            // InternalDialogflowConfig.g:296:1: ( 'understands' )
            // InternalDialogflowConfig.g:297:2: 'understands'
            {
             before(grammarAccess.getIntentAccess().getUnderstandsKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getUnderstandsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0__Impl"


    // $ANTLR start "rule__Intent__Group__1"
    // InternalDialogflowConfig.g:306:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:310:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // InternalDialogflowConfig.g:311:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Intent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1"


    // $ANTLR start "rule__Intent__Group__1__Impl"
    // InternalDialogflowConfig.g:318:1: rule__Intent__Group__1__Impl : ( ( rule__Intent__NameAssignment_1 ) ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:322:1: ( ( ( rule__Intent__NameAssignment_1 ) ) )
            // InternalDialogflowConfig.g:323:1: ( ( rule__Intent__NameAssignment_1 ) )
            {
            // InternalDialogflowConfig.g:323:1: ( ( rule__Intent__NameAssignment_1 ) )
            // InternalDialogflowConfig.g:324:2: ( rule__Intent__NameAssignment_1 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_1()); 
            // InternalDialogflowConfig.g:325:2: ( rule__Intent__NameAssignment_1 )
            // InternalDialogflowConfig.g:325:3: rule__Intent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Intent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1__Impl"


    // $ANTLR start "rule__Intent__Group__2"
    // InternalDialogflowConfig.g:333:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:337:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // InternalDialogflowConfig.g:338:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Intent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2"


    // $ANTLR start "rule__Intent__Group__2__Impl"
    // InternalDialogflowConfig.g:345:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__Group_2__0 )? ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:349:1: ( ( ( rule__Intent__Group_2__0 )? ) )
            // InternalDialogflowConfig.g:350:1: ( ( rule__Intent__Group_2__0 )? )
            {
            // InternalDialogflowConfig.g:350:1: ( ( rule__Intent__Group_2__0 )? )
            // InternalDialogflowConfig.g:351:2: ( rule__Intent__Group_2__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_2()); 
            // InternalDialogflowConfig.g:352:2: ( rule__Intent__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDialogflowConfig.g:352:3: rule__Intent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Intent__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2__Impl"


    // $ANTLR start "rule__Intent__Group__3"
    // InternalDialogflowConfig.g:360:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:364:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // InternalDialogflowConfig.g:365:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Intent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3"


    // $ANTLR start "rule__Intent__Group__3__Impl"
    // InternalDialogflowConfig.g:372:1: rule__Intent__Group__3__Impl : ( 'trained' ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:376:1: ( ( 'trained' ) )
            // InternalDialogflowConfig.g:377:1: ( 'trained' )
            {
            // InternalDialogflowConfig.g:377:1: ( 'trained' )
            // InternalDialogflowConfig.g:378:2: 'trained'
            {
             before(grammarAccess.getIntentAccess().getTrainedKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getTrainedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3__Impl"


    // $ANTLR start "rule__Intent__Group__4"
    // InternalDialogflowConfig.g:387:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl rule__Intent__Group__5 ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:391:1: ( rule__Intent__Group__4__Impl rule__Intent__Group__5 )
            // InternalDialogflowConfig.g:392:2: rule__Intent__Group__4__Impl rule__Intent__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Intent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__4"


    // $ANTLR start "rule__Intent__Group__4__Impl"
    // InternalDialogflowConfig.g:399:1: rule__Intent__Group__4__Impl : ( 'with' ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:403:1: ( ( 'with' ) )
            // InternalDialogflowConfig.g:404:1: ( 'with' )
            {
            // InternalDialogflowConfig.g:404:1: ( 'with' )
            // InternalDialogflowConfig.g:405:2: 'with'
            {
             before(grammarAccess.getIntentAccess().getWithKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__4__Impl"


    // $ANTLR start "rule__Intent__Group__5"
    // InternalDialogflowConfig.g:414:1: rule__Intent__Group__5 : rule__Intent__Group__5__Impl ;
    public final void rule__Intent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:418:1: ( rule__Intent__Group__5__Impl )
            // InternalDialogflowConfig.g:419:2: rule__Intent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__5"


    // $ANTLR start "rule__Intent__Group__5__Impl"
    // InternalDialogflowConfig.g:425:1: rule__Intent__Group__5__Impl : ( ( rule__Intent__FileAssignment_5 ) ) ;
    public final void rule__Intent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:429:1: ( ( ( rule__Intent__FileAssignment_5 ) ) )
            // InternalDialogflowConfig.g:430:1: ( ( rule__Intent__FileAssignment_5 ) )
            {
            // InternalDialogflowConfig.g:430:1: ( ( rule__Intent__FileAssignment_5 ) )
            // InternalDialogflowConfig.g:431:2: ( rule__Intent__FileAssignment_5 )
            {
             before(grammarAccess.getIntentAccess().getFileAssignment_5()); 
            // InternalDialogflowConfig.g:432:2: ( rule__Intent__FileAssignment_5 )
            // InternalDialogflowConfig.g:432:3: rule__Intent__FileAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Intent__FileAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getFileAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__5__Impl"


    // $ANTLR start "rule__Intent__Group_2__0"
    // InternalDialogflowConfig.g:441:1: rule__Intent__Group_2__0 : rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 ;
    public final void rule__Intent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:445:1: ( rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 )
            // InternalDialogflowConfig.g:446:2: rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Intent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__0"


    // $ANTLR start "rule__Intent__Group_2__0__Impl"
    // InternalDialogflowConfig.g:453:1: rule__Intent__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Intent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:457:1: ( ( 'with' ) )
            // InternalDialogflowConfig.g:458:1: ( 'with' )
            {
            // InternalDialogflowConfig.g:458:1: ( 'with' )
            // InternalDialogflowConfig.g:459:2: 'with'
            {
             before(grammarAccess.getIntentAccess().getWithKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getWithKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__0__Impl"


    // $ANTLR start "rule__Intent__Group_2__1"
    // InternalDialogflowConfig.g:468:1: rule__Intent__Group_2__1 : rule__Intent__Group_2__1__Impl rule__Intent__Group_2__2 ;
    public final void rule__Intent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:472:1: ( rule__Intent__Group_2__1__Impl rule__Intent__Group_2__2 )
            // InternalDialogflowConfig.g:473:2: rule__Intent__Group_2__1__Impl rule__Intent__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Intent__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__1"


    // $ANTLR start "rule__Intent__Group_2__1__Impl"
    // InternalDialogflowConfig.g:480:1: rule__Intent__Group_2__1__Impl : ( ( rule__Intent__ParametersAssignment_2_1 ) ) ;
    public final void rule__Intent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:484:1: ( ( ( rule__Intent__ParametersAssignment_2_1 ) ) )
            // InternalDialogflowConfig.g:485:1: ( ( rule__Intent__ParametersAssignment_2_1 ) )
            {
            // InternalDialogflowConfig.g:485:1: ( ( rule__Intent__ParametersAssignment_2_1 ) )
            // InternalDialogflowConfig.g:486:2: ( rule__Intent__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getIntentAccess().getParametersAssignment_2_1()); 
            // InternalDialogflowConfig.g:487:2: ( rule__Intent__ParametersAssignment_2_1 )
            // InternalDialogflowConfig.g:487:3: rule__Intent__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Intent__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__1__Impl"


    // $ANTLR start "rule__Intent__Group_2__2"
    // InternalDialogflowConfig.g:495:1: rule__Intent__Group_2__2 : rule__Intent__Group_2__2__Impl ;
    public final void rule__Intent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:499:1: ( rule__Intent__Group_2__2__Impl )
            // InternalDialogflowConfig.g:500:2: rule__Intent__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__2"


    // $ANTLR start "rule__Intent__Group_2__2__Impl"
    // InternalDialogflowConfig.g:506:1: rule__Intent__Group_2__2__Impl : ( ( rule__Intent__Group_2_2__0 )* ) ;
    public final void rule__Intent__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:510:1: ( ( ( rule__Intent__Group_2_2__0 )* ) )
            // InternalDialogflowConfig.g:511:1: ( ( rule__Intent__Group_2_2__0 )* )
            {
            // InternalDialogflowConfig.g:511:1: ( ( rule__Intent__Group_2_2__0 )* )
            // InternalDialogflowConfig.g:512:2: ( rule__Intent__Group_2_2__0 )*
            {
             before(grammarAccess.getIntentAccess().getGroup_2_2()); 
            // InternalDialogflowConfig.g:513:2: ( rule__Intent__Group_2_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDialogflowConfig.g:513:3: rule__Intent__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Intent__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__2__Impl"


    // $ANTLR start "rule__Intent__Group_2_2__0"
    // InternalDialogflowConfig.g:522:1: rule__Intent__Group_2_2__0 : rule__Intent__Group_2_2__0__Impl rule__Intent__Group_2_2__1 ;
    public final void rule__Intent__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:526:1: ( rule__Intent__Group_2_2__0__Impl rule__Intent__Group_2_2__1 )
            // InternalDialogflowConfig.g:527:2: rule__Intent__Group_2_2__0__Impl rule__Intent__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Intent__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2_2__0"


    // $ANTLR start "rule__Intent__Group_2_2__0__Impl"
    // InternalDialogflowConfig.g:534:1: rule__Intent__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Intent__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:538:1: ( ( ',' ) )
            // InternalDialogflowConfig.g:539:1: ( ',' )
            {
            // InternalDialogflowConfig.g:539:1: ( ',' )
            // InternalDialogflowConfig.g:540:2: ','
            {
             before(grammarAccess.getIntentAccess().getCommaKeyword_2_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2_2__0__Impl"


    // $ANTLR start "rule__Intent__Group_2_2__1"
    // InternalDialogflowConfig.g:549:1: rule__Intent__Group_2_2__1 : rule__Intent__Group_2_2__1__Impl ;
    public final void rule__Intent__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:553:1: ( rule__Intent__Group_2_2__1__Impl )
            // InternalDialogflowConfig.g:554:2: rule__Intent__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2_2__1"


    // $ANTLR start "rule__Intent__Group_2_2__1__Impl"
    // InternalDialogflowConfig.g:560:1: rule__Intent__Group_2_2__1__Impl : ( ( rule__Intent__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__Intent__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:564:1: ( ( ( rule__Intent__ParametersAssignment_2_2_1 ) ) )
            // InternalDialogflowConfig.g:565:1: ( ( rule__Intent__ParametersAssignment_2_2_1 ) )
            {
            // InternalDialogflowConfig.g:565:1: ( ( rule__Intent__ParametersAssignment_2_2_1 ) )
            // InternalDialogflowConfig.g:566:2: ( rule__Intent__ParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getIntentAccess().getParametersAssignment_2_2_1()); 
            // InternalDialogflowConfig.g:567:2: ( rule__Intent__ParametersAssignment_2_2_1 )
            // InternalDialogflowConfig.g:567:3: rule__Intent__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Intent__ParametersAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getParametersAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2_2__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDialogflowConfig.g:576:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:580:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDialogflowConfig.g:581:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDialogflowConfig.g:588:1: rule__Entity__Group__0__Impl : ( 'recognizes' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:592:1: ( ( 'recognizes' ) )
            // InternalDialogflowConfig.g:593:1: ( 'recognizes' )
            {
            // InternalDialogflowConfig.g:593:1: ( 'recognizes' )
            // InternalDialogflowConfig.g:594:2: 'recognizes'
            {
             before(grammarAccess.getEntityAccess().getRecognizesKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRecognizesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDialogflowConfig.g:603:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:607:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDialogflowConfig.g:608:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDialogflowConfig.g:615:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:619:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDialogflowConfig.g:620:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDialogflowConfig.g:620:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDialogflowConfig.g:621:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDialogflowConfig.g:622:2: ( rule__Entity__NameAssignment_1 )
            // InternalDialogflowConfig.g:622:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDialogflowConfig.g:630:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:634:1: ( rule__Entity__Group__2__Impl )
            // InternalDialogflowConfig.g:635:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDialogflowConfig.g:641:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )* ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:645:1: ( ( ( rule__Entity__Group_2__0 )* ) )
            // InternalDialogflowConfig.g:646:1: ( ( rule__Entity__Group_2__0 )* )
            {
            // InternalDialogflowConfig.g:646:1: ( ( rule__Entity__Group_2__0 )* )
            // InternalDialogflowConfig.g:647:2: ( rule__Entity__Group_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalDialogflowConfig.g:648:2: ( rule__Entity__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDialogflowConfig.g:648:3: rule__Entity__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Entity__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalDialogflowConfig.g:657:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:661:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalDialogflowConfig.g:662:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalDialogflowConfig.g:669:1: rule__Entity__Group_2__0__Impl : ( 'is' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:673:1: ( ( 'is' ) )
            // InternalDialogflowConfig.g:674:1: ( 'is' )
            {
            // InternalDialogflowConfig.g:674:1: ( 'is' )
            // InternalDialogflowConfig.g:675:2: 'is'
            {
             before(grammarAccess.getEntityAccess().getIsKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalDialogflowConfig.g:684:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:688:1: ( rule__Entity__Group_2__1__Impl )
            // InternalDialogflowConfig.g:689:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalDialogflowConfig.g:695:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__StatesAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:699:1: ( ( ( rule__Entity__StatesAssignment_2_1 ) ) )
            // InternalDialogflowConfig.g:700:1: ( ( rule__Entity__StatesAssignment_2_1 ) )
            {
            // InternalDialogflowConfig.g:700:1: ( ( rule__Entity__StatesAssignment_2_1 ) )
            // InternalDialogflowConfig.g:701:2: ( rule__Entity__StatesAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getStatesAssignment_2_1()); 
            // InternalDialogflowConfig.g:702:2: ( rule__Entity__StatesAssignment_2_1 )
            // InternalDialogflowConfig.g:702:3: rule__Entity__StatesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__StatesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getStatesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Agent__NameAssignment_1"
    // InternalDialogflowConfig.g:711:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:715:1: ( ( RULE_ID ) )
            // InternalDialogflowConfig.g:716:2: ( RULE_ID )
            {
            // InternalDialogflowConfig.g:716:2: ( RULE_ID )
            // InternalDialogflowConfig.g:717:3: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__NameAssignment_1"


    // $ANTLR start "rule__Agent__ElementsAssignment_2"
    // InternalDialogflowConfig.g:726:1: rule__Agent__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Agent__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:730:1: ( ( ruleElement ) )
            // InternalDialogflowConfig.g:731:2: ( ruleElement )
            {
            // InternalDialogflowConfig.g:731:2: ( ruleElement )
            // InternalDialogflowConfig.g:732:3: ruleElement
            {
             before(grammarAccess.getAgentAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getAgentAccess().getElementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__ElementsAssignment_2"


    // $ANTLR start "rule__Intent__NameAssignment_1"
    // InternalDialogflowConfig.g:741:1: rule__Intent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Intent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:745:1: ( ( RULE_ID ) )
            // InternalDialogflowConfig.g:746:2: ( RULE_ID )
            {
            // InternalDialogflowConfig.g:746:2: ( RULE_ID )
            // InternalDialogflowConfig.g:747:3: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__NameAssignment_1"


    // $ANTLR start "rule__Intent__ParametersAssignment_2_1"
    // InternalDialogflowConfig.g:756:1: rule__Intent__ParametersAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Intent__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:760:1: ( ( ( RULE_ID ) ) )
            // InternalDialogflowConfig.g:761:2: ( ( RULE_ID ) )
            {
            // InternalDialogflowConfig.g:761:2: ( ( RULE_ID ) )
            // InternalDialogflowConfig.g:762:3: ( RULE_ID )
            {
             before(grammarAccess.getIntentAccess().getParametersEntityCrossReference_2_1_0()); 
            // InternalDialogflowConfig.g:763:3: ( RULE_ID )
            // InternalDialogflowConfig.g:764:4: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getParametersEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getParametersEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getIntentAccess().getParametersEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ParametersAssignment_2_1"


    // $ANTLR start "rule__Intent__ParametersAssignment_2_2_1"
    // InternalDialogflowConfig.g:775:1: rule__Intent__ParametersAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Intent__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:779:1: ( ( ( RULE_ID ) ) )
            // InternalDialogflowConfig.g:780:2: ( ( RULE_ID ) )
            {
            // InternalDialogflowConfig.g:780:2: ( ( RULE_ID ) )
            // InternalDialogflowConfig.g:781:3: ( RULE_ID )
            {
             before(grammarAccess.getIntentAccess().getParametersEntityCrossReference_2_2_1_0()); 
            // InternalDialogflowConfig.g:782:3: ( RULE_ID )
            // InternalDialogflowConfig.g:783:4: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getParametersEntityIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getParametersEntityIDTerminalRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getIntentAccess().getParametersEntityCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__Intent__FileAssignment_5"
    // InternalDialogflowConfig.g:794:1: rule__Intent__FileAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Intent__FileAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:798:1: ( ( RULE_STRING ) )
            // InternalDialogflowConfig.g:799:2: ( RULE_STRING )
            {
            // InternalDialogflowConfig.g:799:2: ( RULE_STRING )
            // InternalDialogflowConfig.g:800:3: RULE_STRING
            {
             before(grammarAccess.getIntentAccess().getFileSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getFileSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__FileAssignment_5"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDialogflowConfig.g:809:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:813:1: ( ( RULE_ID ) )
            // InternalDialogflowConfig.g:814:2: ( RULE_ID )
            {
            // InternalDialogflowConfig.g:814:2: ( RULE_ID )
            // InternalDialogflowConfig.g:815:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__StatesAssignment_2_1"
    // InternalDialogflowConfig.g:824:1: rule__Entity__StatesAssignment_2_1 : ( ruleState ) ;
    public final void rule__Entity__StatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:828:1: ( ( ruleState ) )
            // InternalDialogflowConfig.g:829:2: ( ruleState )
            {
            // InternalDialogflowConfig.g:829:2: ( ruleState )
            // InternalDialogflowConfig.g:830:3: ruleState
            {
             before(grammarAccess.getEntityAccess().getStatesStateParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getStatesStateParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__StatesAssignment_2_1"


    // $ANTLR start "rule__State__NameAssignment"
    // InternalDialogflowConfig.g:839:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogflowConfig.g:843:1: ( ( RULE_ID ) )
            // InternalDialogflowConfig.g:844:2: ( RULE_ID )
            {
            // InternalDialogflowConfig.g:844:2: ( RULE_ID )
            // InternalDialogflowConfig.g:845:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});

}