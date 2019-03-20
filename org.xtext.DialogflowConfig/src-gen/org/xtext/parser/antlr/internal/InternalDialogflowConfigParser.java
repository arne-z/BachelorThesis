package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.DialogflowConfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDialogflowConfigParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Agent'", "'understands'", "'with'", "','", "'trained'", "'recognizes'", "'is'"
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

        public InternalDialogflowConfigParser(TokenStream input, DialogflowConfigGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Agent";
       	}

       	@Override
       	protected DialogflowConfigGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAgent"
    // InternalDialogflowConfig.g:64:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalDialogflowConfig.g:64:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalDialogflowConfig.g:65:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalDialogflowConfig.g:71:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )* ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:77:2: ( (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )* ) )
            // InternalDialogflowConfig.g:78:2: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )* )
            {
            // InternalDialogflowConfig.g:78:2: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )* )
            // InternalDialogflowConfig.g:79:3: otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
            		
            // InternalDialogflowConfig.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogflowConfig.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalDialogflowConfig.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDialogflowConfig.g:101:3: ( (lv_elements_2_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDialogflowConfig.g:102:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalDialogflowConfig.g:102:4: (lv_elements_2_0= ruleElement )
            	    // InternalDialogflowConfig.g:103:5: lv_elements_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getAgentAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAgentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.DialogflowConfig.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleElement"
    // InternalDialogflowConfig.g:124:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalDialogflowConfig.g:124:48: (iv_ruleElement= ruleElement EOF )
            // InternalDialogflowConfig.g:125:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDialogflowConfig.g:131:1: ruleElement returns [EObject current=null] : (this_Intent_0= ruleIntent | this_Entity_1= ruleEntity ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Intent_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:137:2: ( (this_Intent_0= ruleIntent | this_Entity_1= ruleEntity ) )
            // InternalDialogflowConfig.g:138:2: (this_Intent_0= ruleIntent | this_Entity_1= ruleEntity )
            {
            // InternalDialogflowConfig.g:138:2: (this_Intent_0= ruleIntent | this_Entity_1= ruleEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDialogflowConfig.g:139:3: this_Intent_0= ruleIntent
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getIntentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Intent_0=ruleIntent();

                    state._fsp--;


                    			current = this_Intent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDialogflowConfig.g:148:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleIntent"
    // InternalDialogflowConfig.g:160:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // InternalDialogflowConfig.g:160:47: (iv_ruleIntent= ruleIntent EOF )
            // InternalDialogflowConfig.g:161:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // InternalDialogflowConfig.g:167:1: ruleIntent returns [EObject current=null] : (otherlv_0= 'understands' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= 'trained' otherlv_7= 'with' ( (lv_file_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_file_8_0=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:173:2: ( (otherlv_0= 'understands' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= 'trained' otherlv_7= 'with' ( (lv_file_8_0= RULE_STRING ) ) ) )
            // InternalDialogflowConfig.g:174:2: (otherlv_0= 'understands' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= 'trained' otherlv_7= 'with' ( (lv_file_8_0= RULE_STRING ) ) )
            {
            // InternalDialogflowConfig.g:174:2: (otherlv_0= 'understands' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= 'trained' otherlv_7= 'with' ( (lv_file_8_0= RULE_STRING ) ) )
            // InternalDialogflowConfig.g:175:3: otherlv_0= 'understands' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= 'trained' otherlv_7= 'with' ( (lv_file_8_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIntentAccess().getUnderstandsKeyword_0());
            		
            // InternalDialogflowConfig.g:179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogflowConfig.g:180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:180:4: (lv_name_1_0= RULE_ID )
            // InternalDialogflowConfig.g:181:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDialogflowConfig.g:197:3: (otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDialogflowConfig.g:198:4: otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntentAccess().getWithKeyword_2_0());
                    			
                    // InternalDialogflowConfig.g:202:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDialogflowConfig.g:203:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDialogflowConfig.g:203:5: (otherlv_3= RULE_ID )
                    // InternalDialogflowConfig.g:204:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntentRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getIntentAccess().getParametersEntityCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalDialogflowConfig.g:215:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:216:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getIntentAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalDialogflowConfig.g:220:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalDialogflowConfig.g:221:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalDialogflowConfig.g:221:6: (otherlv_5= RULE_ID )
                    	    // InternalDialogflowConfig.g:222:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIntentRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getIntentAccess().getParametersEntityCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getIntentAccess().getTrainedKeyword_3());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getIntentAccess().getWithKeyword_4());
            		
            // InternalDialogflowConfig.g:243:3: ( (lv_file_8_0= RULE_STRING ) )
            // InternalDialogflowConfig.g:244:4: (lv_file_8_0= RULE_STRING )
            {
            // InternalDialogflowConfig.g:244:4: (lv_file_8_0= RULE_STRING )
            // InternalDialogflowConfig.g:245:5: lv_file_8_0= RULE_STRING
            {
            lv_file_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_file_8_0, grammarAccess.getIntentAccess().getFileSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleEntity"
    // InternalDialogflowConfig.g:265:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDialogflowConfig.g:265:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDialogflowConfig.g:266:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDialogflowConfig.g:272:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'recognizes' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_states_3_0= ruleState ) ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_states_3_0 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:278:2: ( (otherlv_0= 'recognizes' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_states_3_0= ruleState ) ) )* ) )
            // InternalDialogflowConfig.g:279:2: (otherlv_0= 'recognizes' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_states_3_0= ruleState ) ) )* )
            {
            // InternalDialogflowConfig.g:279:2: (otherlv_0= 'recognizes' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_states_3_0= ruleState ) ) )* )
            // InternalDialogflowConfig.g:280:3: otherlv_0= 'recognizes' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'is' ( (lv_states_3_0= ruleState ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getRecognizesKeyword_0());
            		
            // InternalDialogflowConfig.g:284:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogflowConfig.g:285:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:285:4: (lv_name_1_0= RULE_ID )
            // InternalDialogflowConfig.g:286:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDialogflowConfig.g:302:3: (otherlv_2= 'is' ( (lv_states_3_0= ruleState ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDialogflowConfig.g:303:4: otherlv_2= 'is' ( (lv_states_3_0= ruleState ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getIsKeyword_2_0());
            	    			
            	    // InternalDialogflowConfig.g:307:4: ( (lv_states_3_0= ruleState ) )
            	    // InternalDialogflowConfig.g:308:5: (lv_states_3_0= ruleState )
            	    {
            	    // InternalDialogflowConfig.g:308:5: (lv_states_3_0= ruleState )
            	    // InternalDialogflowConfig.g:309:6: lv_states_3_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getEntityAccess().getStatesStateParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_states_3_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_3_0,
            	    							"org.xtext.DialogflowConfig.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleState"
    // InternalDialogflowConfig.g:331:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalDialogflowConfig.g:331:46: (iv_ruleState= ruleState EOF )
            // InternalDialogflowConfig.g:332:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalDialogflowConfig.g:338:1: ruleState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:344:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDialogflowConfig.g:345:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDialogflowConfig.g:345:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDialogflowConfig.g:346:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:346:3: (lv_name_0_0= RULE_ID )
            // InternalDialogflowConfig.g:347:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStateRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});

}