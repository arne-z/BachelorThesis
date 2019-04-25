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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Agent'", "'Intent'", "'parameters'", "'contexts'", "'in'", "'out'", "'file'", "'trained'", "'with'", "','", "'response'", "'webhook'", "'webhook_for_slot_filling'", "'lifespan'", "'('", "'required'", "'list'", "')'", "'Type'", "'dynamic'", "'builtin'", "'values'", "'state'", "'overridable'", "'enum'", "'auto_expand'", "'fuzzy_extract'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalDialogflowConfig.g:71:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:77:2: ( (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* ) )
            // InternalDialogflowConfig.g:78:2: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* )
            {
            // InternalDialogflowConfig.g:78:2: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* )
            // InternalDialogflowConfig.g:79:3: otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )*
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

            // InternalDialogflowConfig.g:101:3: ( (lv_elements_2_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDialogflowConfig.g:102:4: (lv_elements_2_0= ruleAbstractElement )
            	    {
            	    // InternalDialogflowConfig.g:102:4: (lv_elements_2_0= ruleAbstractElement )
            	    // InternalDialogflowConfig.g:103:5: lv_elements_2_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getAgentAccess().getElementsAbstractElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAgentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.DialogflowConfig.AbstractElement");
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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDialogflowConfig.g:124:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalDialogflowConfig.g:124:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalDialogflowConfig.g:125:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDialogflowConfig.g:131:1: ruleAbstractElement returns [EObject current=null] : (this_Intent_0= ruleIntent | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Intent_0 = null;

        EObject this_EntityType_1 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:137:2: ( (this_Intent_0= ruleIntent | this_EntityType_1= ruleEntityType ) )
            // InternalDialogflowConfig.g:138:2: (this_Intent_0= ruleIntent | this_EntityType_1= ruleEntityType )
            {
            // InternalDialogflowConfig.g:138:2: (this_Intent_0= ruleIntent | this_EntityType_1= ruleEntityType )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
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

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getIntentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Intent_0=ruleIntent();

                    state._fsp--;


                    			current = this_Intent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDialogflowConfig.g:148:3: this_EntityType_1= ruleEntityType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getEntityTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;


                    			current = this_EntityType_1;
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
    // $ANTLR end "ruleAbstractElement"


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
    // InternalDialogflowConfig.g:167:1: ruleIntent returns [EObject current=null] : (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )? (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )? ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )? (otherlv_16= 'response' ( (lv_responses_17_0= RULE_STRING ) )+ )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_file_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_responses_17_0=null;
        Token lv_webHook_19_0=null;
        Token lv_webHookForSlotFilling_20_0=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_inputContexts_6_0 = null;

        EObject lv_affectedContexts_8_0 = null;

        EObject lv_trainingPhrases_13_0 = null;

        EObject lv_trainingPhrases_15_0 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:173:2: ( (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )? (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )? ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )? (otherlv_16= 'response' ( (lv_responses_17_0= RULE_STRING ) )+ )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )* ) ) ) ) )
            // InternalDialogflowConfig.g:174:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )? (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )? ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )? (otherlv_16= 'response' ( (lv_responses_17_0= RULE_STRING ) )+ )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )* ) ) ) )
            {
            // InternalDialogflowConfig.g:174:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )? (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )? ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )? (otherlv_16= 'response' ( (lv_responses_17_0= RULE_STRING ) )+ )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )* ) ) ) )
            // InternalDialogflowConfig.g:175:3: otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )? (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )? ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )? (otherlv_16= 'response' ( (lv_responses_17_0= RULE_STRING ) )+ )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIntentAccess().getIntentKeyword_0());
            		
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

            // InternalDialogflowConfig.g:197:3: (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDialogflowConfig.g:198:4: otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )*
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntentAccess().getParametersKeyword_2_0());
                    			
                    // InternalDialogflowConfig.g:202:4: ( (lv_parameters_3_0= ruleParameter ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:203:5: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalDialogflowConfig.g:203:5: (lv_parameters_3_0= ruleParameter )
                    	    // InternalDialogflowConfig.g:204:6: lv_parameters_3_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getIntentAccess().getParametersParameterParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameters_3_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIntentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_3_0,
                    	    							"org.xtext.DialogflowConfig.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            // InternalDialogflowConfig.g:222:3: (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDialogflowConfig.g:223:4: otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getIntentAccess().getContextsKeyword_3_0());
                    			
                    // InternalDialogflowConfig.g:227:4: ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? )
                    // InternalDialogflowConfig.g:228:5: (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )?
                    {
                    // InternalDialogflowConfig.g:228:5: (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDialogflowConfig.g:229:6: otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_3); 

                            						newLeafNode(otherlv_5, grammarAccess.getIntentAccess().getInKeyword_3_1_0_0());
                            					
                            // InternalDialogflowConfig.g:233:6: ( (lv_inputContexts_6_0= ruleInputContext ) )+
                            int cnt5=0;
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==RULE_ID) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalDialogflowConfig.g:234:7: (lv_inputContexts_6_0= ruleInputContext )
                            	    {
                            	    // InternalDialogflowConfig.g:234:7: (lv_inputContexts_6_0= ruleInputContext )
                            	    // InternalDialogflowConfig.g:235:8: lv_inputContexts_6_0= ruleInputContext
                            	    {

                            	    								newCompositeNode(grammarAccess.getIntentAccess().getInputContextsInputContextParserRuleCall_3_1_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_inputContexts_6_0=ruleInputContext();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getIntentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"inputContexts",
                            	    									lv_inputContexts_6_0,
                            	    									"org.xtext.DialogflowConfig.InputContext");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt5 >= 1 ) break loop5;
                                        EarlyExitException eee =
                                            new EarlyExitException(5, input);
                                        throw eee;
                                }
                                cnt5++;
                            } while (true);


                            }
                            break;

                    }

                    // InternalDialogflowConfig.g:253:5: (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==16) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDialogflowConfig.g:254:6: otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_3); 

                            						newLeafNode(otherlv_7, grammarAccess.getIntentAccess().getOutKeyword_3_1_1_0());
                            					
                            // InternalDialogflowConfig.g:258:6: ( (lv_affectedContexts_8_0= ruleOutputContext ) )+
                            int cnt7=0;
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==RULE_ID) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalDialogflowConfig.g:259:7: (lv_affectedContexts_8_0= ruleOutputContext )
                            	    {
                            	    // InternalDialogflowConfig.g:259:7: (lv_affectedContexts_8_0= ruleOutputContext )
                            	    // InternalDialogflowConfig.g:260:8: lv_affectedContexts_8_0= ruleOutputContext
                            	    {

                            	    								newCompositeNode(grammarAccess.getIntentAccess().getAffectedContextsOutputContextParserRuleCall_3_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_affectedContexts_8_0=ruleOutputContext();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getIntentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"affectedContexts",
                            	    									lv_affectedContexts_8_0,
                            	    									"org.xtext.DialogflowConfig.OutputContext");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt7 >= 1 ) break loop7;
                                        EarlyExitException eee =
                                            new EarlyExitException(7, input);
                                        throw eee;
                                }
                                cnt7++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalDialogflowConfig.g:280:3: ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( (LA11_0==18) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalDialogflowConfig.g:281:4: (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) )
                    {
                    // InternalDialogflowConfig.g:281:4: (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) )
                    // InternalDialogflowConfig.g:282:5: otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(otherlv_9, grammarAccess.getIntentAccess().getFileKeyword_4_0_0());
                    				
                    // InternalDialogflowConfig.g:286:5: ( (lv_file_10_0= RULE_STRING ) )
                    // InternalDialogflowConfig.g:287:6: (lv_file_10_0= RULE_STRING )
                    {
                    // InternalDialogflowConfig.g:287:6: (lv_file_10_0= RULE_STRING )
                    // InternalDialogflowConfig.g:288:7: lv_file_10_0= RULE_STRING
                    {
                    lv_file_10_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    							newLeafNode(lv_file_10_0, grammarAccess.getIntentAccess().getFileSTRINGTerminalRuleCall_4_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIntentRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"file",
                    								lv_file_10_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDialogflowConfig.g:306:4: (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* )
                    {
                    // InternalDialogflowConfig.g:306:4: (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* )
                    // InternalDialogflowConfig.g:307:5: otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )*
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(otherlv_11, grammarAccess.getIntentAccess().getTrainedKeyword_4_1_0());
                    				
                    otherlv_12=(Token)match(input,19,FOLLOW_13); 

                    					newLeafNode(otherlv_12, grammarAccess.getIntentAccess().getWithKeyword_4_1_1());
                    				
                    // InternalDialogflowConfig.g:315:5: ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) )
                    // InternalDialogflowConfig.g:316:6: (lv_trainingPhrases_13_0= ruleTrainingPhrase )
                    {
                    // InternalDialogflowConfig.g:316:6: (lv_trainingPhrases_13_0= ruleTrainingPhrase )
                    // InternalDialogflowConfig.g:317:7: lv_trainingPhrases_13_0= ruleTrainingPhrase
                    {

                    							newCompositeNode(grammarAccess.getIntentAccess().getTrainingPhrasesTrainingPhraseParserRuleCall_4_1_2_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_trainingPhrases_13_0=ruleTrainingPhrase();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getIntentRule());
                    							}
                    							add(
                    								current,
                    								"trainingPhrases",
                    								lv_trainingPhrases_13_0,
                    								"org.xtext.DialogflowConfig.TrainingPhrase");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDialogflowConfig.g:334:5: (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==20) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:335:6: otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) )
                    	    {
                    	    otherlv_14=(Token)match(input,20,FOLLOW_13); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getIntentAccess().getCommaKeyword_4_1_3_0());
                    	    					
                    	    // InternalDialogflowConfig.g:339:6: ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) )
                    	    // InternalDialogflowConfig.g:340:7: (lv_trainingPhrases_15_0= ruleTrainingPhrase )
                    	    {
                    	    // InternalDialogflowConfig.g:340:7: (lv_trainingPhrases_15_0= ruleTrainingPhrase )
                    	    // InternalDialogflowConfig.g:341:8: lv_trainingPhrases_15_0= ruleTrainingPhrase
                    	    {

                    	    								newCompositeNode(grammarAccess.getIntentAccess().getTrainingPhrasesTrainingPhraseParserRuleCall_4_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_14);
                    	    lv_trainingPhrases_15_0=ruleTrainingPhrase();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getIntentRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"trainingPhrases",
                    	    									lv_trainingPhrases_15_0,
                    	    									"org.xtext.DialogflowConfig.TrainingPhrase");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalDialogflowConfig.g:361:3: (otherlv_16= 'response' ( (lv_responses_17_0= RULE_STRING ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDialogflowConfig.g:362:4: otherlv_16= 'response' ( (lv_responses_17_0= RULE_STRING ) )+
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getIntentAccess().getResponseKeyword_5_0());
                    			
                    // InternalDialogflowConfig.g:366:4: ( (lv_responses_17_0= RULE_STRING ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_STRING) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:367:5: (lv_responses_17_0= RULE_STRING )
                    	    {
                    	    // InternalDialogflowConfig.g:367:5: (lv_responses_17_0= RULE_STRING )
                    	    // InternalDialogflowConfig.g:368:6: lv_responses_17_0= RULE_STRING
                    	    {
                    	    lv_responses_17_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    	    						newLeafNode(lv_responses_17_0, grammarAccess.getIntentAccess().getResponsesSTRINGTerminalRuleCall_5_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getIntentRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"responses",
                    	    							lv_responses_17_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }

            // InternalDialogflowConfig.g:385:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )* ) ) )
            // InternalDialogflowConfig.g:386:4: ( ( ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )* ) )
            {
            // InternalDialogflowConfig.g:386:4: ( ( ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )* ) )
            // InternalDialogflowConfig.g:387:5: ( ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIntentAccess().getUnorderedGroup_6());
            				
            // InternalDialogflowConfig.g:390:5: ( ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )* )
            // InternalDialogflowConfig.g:391:6: ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )*
            {
            // InternalDialogflowConfig.g:391:6: ( ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getIntentAccess().getUnorderedGroup_6(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getIntentAccess().getUnorderedGroup_6(), 1) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDialogflowConfig.g:392:4: ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) )
            	    {
            	    // InternalDialogflowConfig.g:392:4: ({...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) ) )
            	    // InternalDialogflowConfig.g:393:5: {...}? => ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIntentAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIntent", "getUnorderedGroupHelper().canSelect(grammarAccess.getIntentAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalDialogflowConfig.g:393:103: ( ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) ) )
            	    // InternalDialogflowConfig.g:394:6: ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIntentAccess().getUnorderedGroup_6(), 0);
            	    					
            	    // InternalDialogflowConfig.g:397:9: ({...}? => ( (lv_webHook_19_0= 'webhook' ) ) )
            	    // InternalDialogflowConfig.g:397:10: {...}? => ( (lv_webHook_19_0= 'webhook' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIntent", "true");
            	    }
            	    // InternalDialogflowConfig.g:397:19: ( (lv_webHook_19_0= 'webhook' ) )
            	    // InternalDialogflowConfig.g:397:20: (lv_webHook_19_0= 'webhook' )
            	    {
            	    // InternalDialogflowConfig.g:397:20: (lv_webHook_19_0= 'webhook' )
            	    // InternalDialogflowConfig.g:398:10: lv_webHook_19_0= 'webhook'
            	    {
            	    lv_webHook_19_0=(Token)match(input,22,FOLLOW_16); 

            	    										newLeafNode(lv_webHook_19_0, grammarAccess.getIntentAccess().getWebHookWebhookKeyword_6_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getIntentRule());
            	    										}
            	    										setWithLastConsumed(current, "webHook", true, "webhook");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIntentAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDialogflowConfig.g:415:4: ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) )
            	    {
            	    // InternalDialogflowConfig.g:415:4: ({...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) ) )
            	    // InternalDialogflowConfig.g:416:5: {...}? => ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIntentAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIntent", "getUnorderedGroupHelper().canSelect(grammarAccess.getIntentAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalDialogflowConfig.g:416:103: ( ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) ) )
            	    // InternalDialogflowConfig.g:417:6: ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIntentAccess().getUnorderedGroup_6(), 1);
            	    					
            	    // InternalDialogflowConfig.g:420:9: ({...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) ) )
            	    // InternalDialogflowConfig.g:420:10: {...}? => ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIntent", "true");
            	    }
            	    // InternalDialogflowConfig.g:420:19: ( (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' ) )
            	    // InternalDialogflowConfig.g:420:20: (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' )
            	    {
            	    // InternalDialogflowConfig.g:420:20: (lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling' )
            	    // InternalDialogflowConfig.g:421:10: lv_webHookForSlotFilling_20_0= 'webhook_for_slot_filling'
            	    {
            	    lv_webHookForSlotFilling_20_0=(Token)match(input,23,FOLLOW_16); 

            	    										newLeafNode(lv_webHookForSlotFilling_20_0, grammarAccess.getIntentAccess().getWebHookForSlotFillingWebhook_for_slot_fillingKeyword_6_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getIntentRule());
            	    										}
            	    										setWithLastConsumed(current, "webHookForSlotFilling", true, "webhook_for_slot_filling");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIntentAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIntentAccess().getUnorderedGroup_6());
            				

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


    // $ANTLR start "entryRuleInputContext"
    // InternalDialogflowConfig.g:449:1: entryRuleInputContext returns [EObject current=null] : iv_ruleInputContext= ruleInputContext EOF ;
    public final EObject entryRuleInputContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputContext = null;


        try {
            // InternalDialogflowConfig.g:449:53: (iv_ruleInputContext= ruleInputContext EOF )
            // InternalDialogflowConfig.g:450:2: iv_ruleInputContext= ruleInputContext EOF
            {
             newCompositeNode(grammarAccess.getInputContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputContext=ruleInputContext();

            state._fsp--;

             current =iv_ruleInputContext; 
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
    // $ANTLR end "entryRuleInputContext"


    // $ANTLR start "ruleInputContext"
    // InternalDialogflowConfig.g:456:1: ruleInputContext returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInputContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:462:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDialogflowConfig.g:463:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDialogflowConfig.g:463:2: ( (otherlv_0= RULE_ID ) )
            // InternalDialogflowConfig.g:464:3: (otherlv_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:464:3: (otherlv_0= RULE_ID )
            // InternalDialogflowConfig.g:465:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInputContextRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getInputContextAccess().getTypeEntityTypeCrossReference_0());
            			

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
    // $ANTLR end "ruleInputContext"


    // $ANTLR start "entryRuleOutputContext"
    // InternalDialogflowConfig.g:479:1: entryRuleOutputContext returns [EObject current=null] : iv_ruleOutputContext= ruleOutputContext EOF ;
    public final EObject entryRuleOutputContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputContext = null;


        try {
            // InternalDialogflowConfig.g:479:54: (iv_ruleOutputContext= ruleOutputContext EOF )
            // InternalDialogflowConfig.g:480:2: iv_ruleOutputContext= ruleOutputContext EOF
            {
             newCompositeNode(grammarAccess.getOutputContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputContext=ruleOutputContext();

            state._fsp--;

             current =iv_ruleOutputContext; 
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
    // $ANTLR end "entryRuleOutputContext"


    // $ANTLR start "ruleOutputContext"
    // InternalDialogflowConfig.g:486:1: ruleOutputContext returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOutputContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_lifespan_2_0=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:492:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )? ) )
            // InternalDialogflowConfig.g:493:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )? )
            {
            // InternalDialogflowConfig.g:493:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )? )
            // InternalDialogflowConfig.g:494:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )?
            {
            // InternalDialogflowConfig.g:494:3: ( (otherlv_0= RULE_ID ) )
            // InternalDialogflowConfig.g:495:4: (otherlv_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:495:4: (otherlv_0= RULE_ID )
            // InternalDialogflowConfig.g:496:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputContextRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getOutputContextAccess().getTypeEntityTypeCrossReference_0_0());
            				

            }


            }

            // InternalDialogflowConfig.g:507:3: (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDialogflowConfig.g:508:4: otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutputContextAccess().getLifespanKeyword_1_0());
                    			
                    // InternalDialogflowConfig.g:512:4: ( (lv_lifespan_2_0= RULE_INT ) )
                    // InternalDialogflowConfig.g:513:5: (lv_lifespan_2_0= RULE_INT )
                    {
                    // InternalDialogflowConfig.g:513:5: (lv_lifespan_2_0= RULE_INT )
                    // InternalDialogflowConfig.g:514:6: lv_lifespan_2_0= RULE_INT
                    {
                    lv_lifespan_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_lifespan_2_0, grammarAccess.getOutputContextAccess().getLifespanINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputContextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lifespan",
                    							lv_lifespan_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleOutputContext"


    // $ANTLR start "entryRuleTrainingPhrase"
    // InternalDialogflowConfig.g:535:1: entryRuleTrainingPhrase returns [EObject current=null] : iv_ruleTrainingPhrase= ruleTrainingPhrase EOF ;
    public final EObject entryRuleTrainingPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingPhrase = null;


        try {
            // InternalDialogflowConfig.g:535:55: (iv_ruleTrainingPhrase= ruleTrainingPhrase EOF )
            // InternalDialogflowConfig.g:536:2: iv_ruleTrainingPhrase= ruleTrainingPhrase EOF
            {
             newCompositeNode(grammarAccess.getTrainingPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainingPhrase=ruleTrainingPhrase();

            state._fsp--;

             current =iv_ruleTrainingPhrase; 
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
    // $ANTLR end "entryRuleTrainingPhrase"


    // $ANTLR start "ruleTrainingPhrase"
    // InternalDialogflowConfig.g:542:1: ruleTrainingPhrase returns [EObject current=null] : ( (lv_data_0_0= ruleAbstractWord ) )+ ;
    public final EObject ruleTrainingPhrase() throws RecognitionException {
        EObject current = null;

        EObject lv_data_0_0 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:548:2: ( ( (lv_data_0_0= ruleAbstractWord ) )+ )
            // InternalDialogflowConfig.g:549:2: ( (lv_data_0_0= ruleAbstractWord ) )+
            {
            // InternalDialogflowConfig.g:549:2: ( (lv_data_0_0= ruleAbstractWord ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDialogflowConfig.g:550:3: (lv_data_0_0= ruleAbstractWord )
            	    {
            	    // InternalDialogflowConfig.g:550:3: (lv_data_0_0= ruleAbstractWord )
            	    // InternalDialogflowConfig.g:551:4: lv_data_0_0= ruleAbstractWord
            	    {

            	    				newCompositeNode(grammarAccess.getTrainingPhraseAccess().getDataAbstractWordParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_19);
            	    lv_data_0_0=ruleAbstractWord();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTrainingPhraseRule());
            	    				}
            	    				add(
            	    					current,
            	    					"data",
            	    					lv_data_0_0,
            	    					"org.xtext.DialogflowConfig.AbstractWord");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


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
    // $ANTLR end "ruleTrainingPhrase"


    // $ANTLR start "entryRuleAbstractWord"
    // InternalDialogflowConfig.g:571:1: entryRuleAbstractWord returns [EObject current=null] : iv_ruleAbstractWord= ruleAbstractWord EOF ;
    public final EObject entryRuleAbstractWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractWord = null;


        try {
            // InternalDialogflowConfig.g:571:53: (iv_ruleAbstractWord= ruleAbstractWord EOF )
            // InternalDialogflowConfig.g:572:2: iv_ruleAbstractWord= ruleAbstractWord EOF
            {
             newCompositeNode(grammarAccess.getAbstractWordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractWord=ruleAbstractWord();

            state._fsp--;

             current =iv_ruleAbstractWord; 
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
    // $ANTLR end "entryRuleAbstractWord"


    // $ANTLR start "ruleAbstractWord"
    // InternalDialogflowConfig.g:578:1: ruleAbstractWord returns [EObject current=null] : (this_Text_0= ruleText | this_Token_1= ruleToken ) ;
    public final EObject ruleAbstractWord() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Token_1 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:584:2: ( (this_Text_0= ruleText | this_Token_1= ruleToken ) )
            // InternalDialogflowConfig.g:585:2: (this_Text_0= ruleText | this_Token_1= ruleToken )
            {
            // InternalDialogflowConfig.g:585:2: (this_Text_0= ruleText | this_Token_1= ruleToken )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDialogflowConfig.g:586:3: this_Text_0= ruleText
                    {

                    			newCompositeNode(grammarAccess.getAbstractWordAccess().getTextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_0=ruleText();

                    state._fsp--;


                    			current = this_Text_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDialogflowConfig.g:595:3: this_Token_1= ruleToken
                    {

                    			newCompositeNode(grammarAccess.getAbstractWordAccess().getTokenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Token_1=ruleToken();

                    state._fsp--;


                    			current = this_Token_1;
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
    // $ANTLR end "ruleAbstractWord"


    // $ANTLR start "entryRuleText"
    // InternalDialogflowConfig.g:607:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalDialogflowConfig.g:607:45: (iv_ruleText= ruleText EOF )
            // InternalDialogflowConfig.g:608:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalDialogflowConfig.g:614:1: ruleText returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:620:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalDialogflowConfig.g:621:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalDialogflowConfig.g:621:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalDialogflowConfig.g:622:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalDialogflowConfig.g:622:3: (lv_text_0_0= RULE_STRING )
            // InternalDialogflowConfig.g:623:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleToken"
    // InternalDialogflowConfig.g:642:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // InternalDialogflowConfig.g:642:46: (iv_ruleToken= ruleToken EOF )
            // InternalDialogflowConfig.g:643:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
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
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalDialogflowConfig.g:649:1: ruleToken returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:655:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDialogflowConfig.g:656:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDialogflowConfig.g:656:2: ( (otherlv_0= RULE_ID ) )
            // InternalDialogflowConfig.g:657:3: (otherlv_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:657:3: (otherlv_0= RULE_ID )
            // InternalDialogflowConfig.g:658:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTokenRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getTokenAccess().getTypeEntityTypeCrossReference_0());
            			

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
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleParameter"
    // InternalDialogflowConfig.g:672:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDialogflowConfig.g:672:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalDialogflowConfig.g:673:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalDialogflowConfig.g:679:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_required_3_0=null;
        Token lv_list_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:685:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )? ) )
            // InternalDialogflowConfig.g:686:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )? )
            {
            // InternalDialogflowConfig.g:686:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )? )
            // InternalDialogflowConfig.g:687:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )?
            {
            // InternalDialogflowConfig.g:687:3: ( (otherlv_0= RULE_ID ) )
            // InternalDialogflowConfig.g:688:4: (otherlv_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:688:4: (otherlv_0= RULE_ID )
            // InternalDialogflowConfig.g:689:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getTypeEntityTypeCrossReference_0_0());
            				

            }


            }

            // InternalDialogflowConfig.g:700:3: (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDialogflowConfig.g:701:4: otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDialogflowConfig.g:705:4: ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) )
                    // InternalDialogflowConfig.g:706:5: ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) )
                    {
                    // InternalDialogflowConfig.g:706:5: ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) )
                    // InternalDialogflowConfig.g:707:6: ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_1_1());
                    					
                    // InternalDialogflowConfig.g:710:6: ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* )
                    // InternalDialogflowConfig.g:711:7: ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )*
                    {
                    // InternalDialogflowConfig.g:711:7: ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( LA18_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt18=1;
                        }
                        else if ( LA18_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:712:5: ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:712:5: ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) )
                    	    // InternalDialogflowConfig.g:713:6: {...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // InternalDialogflowConfig.g:713:109: ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) )
                    	    // InternalDialogflowConfig.g:714:7: ({...}? => ( (lv_required_3_0= 'required' ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 0);
                    	    						
                    	    // InternalDialogflowConfig.g:717:10: ({...}? => ( (lv_required_3_0= 'required' ) ) )
                    	    // InternalDialogflowConfig.g:717:11: {...}? => ( (lv_required_3_0= 'required' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:717:20: ( (lv_required_3_0= 'required' ) )
                    	    // InternalDialogflowConfig.g:717:21: (lv_required_3_0= 'required' )
                    	    {
                    	    // InternalDialogflowConfig.g:717:21: (lv_required_3_0= 'required' )
                    	    // InternalDialogflowConfig.g:718:11: lv_required_3_0= 'required'
                    	    {
                    	    lv_required_3_0=(Token)match(input,26,FOLLOW_21); 

                    	    											newLeafNode(lv_required_3_0, grammarAccess.getParameterAccess().getRequiredRequiredKeyword_1_1_0_0());
                    	    										

                    	    											if (current==null) {
                    	    												current = createModelElement(grammarAccess.getParameterRule());
                    	    											}
                    	    											setWithLastConsumed(current, "required", true, "required");
                    	    										

                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDialogflowConfig.g:735:5: ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:735:5: ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) )
                    	    // InternalDialogflowConfig.g:736:6: {...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // InternalDialogflowConfig.g:736:109: ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) )
                    	    // InternalDialogflowConfig.g:737:7: ({...}? => ( (lv_list_4_0= 'list' ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 1);
                    	    						
                    	    // InternalDialogflowConfig.g:740:10: ({...}? => ( (lv_list_4_0= 'list' ) ) )
                    	    // InternalDialogflowConfig.g:740:11: {...}? => ( (lv_list_4_0= 'list' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:740:20: ( (lv_list_4_0= 'list' ) )
                    	    // InternalDialogflowConfig.g:740:21: (lv_list_4_0= 'list' )
                    	    {
                    	    // InternalDialogflowConfig.g:740:21: (lv_list_4_0= 'list' )
                    	    // InternalDialogflowConfig.g:741:11: lv_list_4_0= 'list'
                    	    {
                    	    lv_list_4_0=(Token)match(input,27,FOLLOW_21); 

                    	    											newLeafNode(lv_list_4_0, grammarAccess.getParameterAccess().getListListKeyword_1_1_1_0());
                    	    										

                    	    											if (current==null) {
                    	    												current = createModelElement(grammarAccess.getParameterRule());
                    	    											}
                    	    											setWithLastConsumed(current, "list", true, "list");
                    	    										

                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_1_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup_1_1());
                    					

                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEntityType"
    // InternalDialogflowConfig.g:774:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalDialogflowConfig.g:774:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalDialogflowConfig.g:775:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalDialogflowConfig.g:781:1: ruleEntityType returns [EObject current=null] : (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?) ) )? ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_dynamic_2_0=null;
        Token lv_builtIn_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token lv_isOverridable_8_0=null;
        Token lv_isEnum_9_0=null;
        Token lv_automatedExpansion_10_0=null;
        Token lv_allowFuzzyExtraction_11_0=null;
        EObject lv_values_5_0 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:787:2: ( (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?) ) )? ) )
            // InternalDialogflowConfig.g:788:2: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalDialogflowConfig.g:788:2: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?) ) )? )
            // InternalDialogflowConfig.g:789:3: otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getTypeKeyword_0());
            		
            // InternalDialogflowConfig.g:793:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogflowConfig.g:794:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:794:4: (lv_name_1_0= RULE_ID )
            // InternalDialogflowConfig.g:795:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDialogflowConfig.g:811:3: ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case 32:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalDialogflowConfig.g:812:4: ( (lv_dynamic_2_0= 'dynamic' ) )
                    {
                    // InternalDialogflowConfig.g:812:4: ( (lv_dynamic_2_0= 'dynamic' ) )
                    // InternalDialogflowConfig.g:813:5: (lv_dynamic_2_0= 'dynamic' )
                    {
                    // InternalDialogflowConfig.g:813:5: (lv_dynamic_2_0= 'dynamic' )
                    // InternalDialogflowConfig.g:814:6: lv_dynamic_2_0= 'dynamic'
                    {
                    lv_dynamic_2_0=(Token)match(input,30,FOLLOW_23); 

                    						newLeafNode(lv_dynamic_2_0, grammarAccess.getEntityTypeAccess().getDynamicDynamicKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityTypeRule());
                    						}
                    						setWithLastConsumed(current, "dynamic", true, "dynamic");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDialogflowConfig.g:827:4: ( (lv_builtIn_3_0= 'builtin' ) )
                    {
                    // InternalDialogflowConfig.g:827:4: ( (lv_builtIn_3_0= 'builtin' ) )
                    // InternalDialogflowConfig.g:828:5: (lv_builtIn_3_0= 'builtin' )
                    {
                    // InternalDialogflowConfig.g:828:5: (lv_builtIn_3_0= 'builtin' )
                    // InternalDialogflowConfig.g:829:6: lv_builtIn_3_0= 'builtin'
                    {
                    lv_builtIn_3_0=(Token)match(input,31,FOLLOW_23); 

                    						newLeafNode(lv_builtIn_3_0, grammarAccess.getEntityTypeAccess().getBuiltInBuiltinKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityTypeRule());
                    						}
                    						setWithLastConsumed(current, "builtIn", true, "builtin");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDialogflowConfig.g:842:4: (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ )
                    {
                    // InternalDialogflowConfig.g:842:4: (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ )
                    // InternalDialogflowConfig.g:843:5: otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getEntityTypeAccess().getValuesKeyword_2_2_0());
                    				
                    // InternalDialogflowConfig.g:847:5: ( (lv_values_5_0= ruleEntity ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_STRING) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:848:6: (lv_values_5_0= ruleEntity )
                    	    {
                    	    // InternalDialogflowConfig.g:848:6: (lv_values_5_0= ruleEntity )
                    	    // InternalDialogflowConfig.g:849:7: lv_values_5_0= ruleEntity
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityTypeAccess().getValuesEntityParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_values_5_0=ruleEntity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_5_0,
                    	    								"org.xtext.DialogflowConfig.Entity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalDialogflowConfig.g:868:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33||(LA24_0>=35 && LA24_0<=37)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDialogflowConfig.g:869:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalDialogflowConfig.g:869:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?) )
                    // InternalDialogflowConfig.g:870:5: ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3());
                    				
                    // InternalDialogflowConfig.g:873:5: ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?)
                    // InternalDialogflowConfig.g:874:6: ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+ {...}?
                    {
                    // InternalDialogflowConfig.g:874:6: ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=5;
                        int LA23_0 = input.LA(1);

                        if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 0) ) {
                            alt23=1;
                        }
                        else if ( LA23_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 1) ) {
                            alt23=2;
                        }
                        else if ( LA23_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 2) ) {
                            alt23=3;
                        }
                        else if ( LA23_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 3) ) {
                            alt23=4;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:875:4: ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:875:4: ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) )
                    	    // InternalDialogflowConfig.g:876:5: {...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 0)");
                    	    }
                    	    // InternalDialogflowConfig.g:876:107: ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) )
                    	    // InternalDialogflowConfig.g:877:6: ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 0);
                    	    					
                    	    // InternalDialogflowConfig.g:880:9: ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) )
                    	    // InternalDialogflowConfig.g:880:10: {...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:880:19: (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? )
                    	    // InternalDialogflowConfig.g:880:20: otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )?
                    	    {
                    	    otherlv_7=(Token)match(input,33,FOLLOW_25); 

                    	    									newLeafNode(otherlv_7, grammarAccess.getEntityTypeAccess().getStateKeyword_3_0_0());
                    	    								
                    	    // InternalDialogflowConfig.g:884:9: ( (lv_isOverridable_8_0= 'overridable' ) )?
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==34) ) {
                    	        alt22=1;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // InternalDialogflowConfig.g:885:10: (lv_isOverridable_8_0= 'overridable' )
                    	            {
                    	            // InternalDialogflowConfig.g:885:10: (lv_isOverridable_8_0= 'overridable' )
                    	            // InternalDialogflowConfig.g:886:11: lv_isOverridable_8_0= 'overridable'
                    	            {
                    	            lv_isOverridable_8_0=(Token)match(input,34,FOLLOW_23); 

                    	            											newLeafNode(lv_isOverridable_8_0, grammarAccess.getEntityTypeAccess().getIsOverridableOverridableKeyword_3_0_1_0());
                    	            										

                    	            											if (current==null) {
                    	            												current = createModelElement(grammarAccess.getEntityTypeRule());
                    	            											}
                    	            											setWithLastConsumed(current, "isOverridable", true, "overridable");
                    	            										

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDialogflowConfig.g:904:4: ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:904:4: ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) )
                    	    // InternalDialogflowConfig.g:905:5: {...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 1)");
                    	    }
                    	    // InternalDialogflowConfig.g:905:107: ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) )
                    	    // InternalDialogflowConfig.g:906:6: ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 1);
                    	    					
                    	    // InternalDialogflowConfig.g:909:9: ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) )
                    	    // InternalDialogflowConfig.g:909:10: {...}? => ( (lv_isEnum_9_0= 'enum' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:909:19: ( (lv_isEnum_9_0= 'enum' ) )
                    	    // InternalDialogflowConfig.g:909:20: (lv_isEnum_9_0= 'enum' )
                    	    {
                    	    // InternalDialogflowConfig.g:909:20: (lv_isEnum_9_0= 'enum' )
                    	    // InternalDialogflowConfig.g:910:10: lv_isEnum_9_0= 'enum'
                    	    {
                    	    lv_isEnum_9_0=(Token)match(input,35,FOLLOW_23); 

                    	    										newLeafNode(lv_isEnum_9_0, grammarAccess.getEntityTypeAccess().getIsEnumEnumKeyword_3_1_0());
                    	    									

                    	    										if (current==null) {
                    	    											current = createModelElement(grammarAccess.getEntityTypeRule());
                    	    										}
                    	    										setWithLastConsumed(current, "isEnum", true, "enum");
                    	    									

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalDialogflowConfig.g:927:4: ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:927:4: ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) ) )
                    	    // InternalDialogflowConfig.g:928:5: {...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 2)");
                    	    }
                    	    // InternalDialogflowConfig.g:928:107: ( ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) ) )
                    	    // InternalDialogflowConfig.g:929:6: ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 2);
                    	    					
                    	    // InternalDialogflowConfig.g:932:9: ({...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) ) )
                    	    // InternalDialogflowConfig.g:932:10: {...}? => ( (lv_automatedExpansion_10_0= 'auto_expand' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:932:19: ( (lv_automatedExpansion_10_0= 'auto_expand' ) )
                    	    // InternalDialogflowConfig.g:932:20: (lv_automatedExpansion_10_0= 'auto_expand' )
                    	    {
                    	    // InternalDialogflowConfig.g:932:20: (lv_automatedExpansion_10_0= 'auto_expand' )
                    	    // InternalDialogflowConfig.g:933:10: lv_automatedExpansion_10_0= 'auto_expand'
                    	    {
                    	    lv_automatedExpansion_10_0=(Token)match(input,36,FOLLOW_23); 

                    	    										newLeafNode(lv_automatedExpansion_10_0, grammarAccess.getEntityTypeAccess().getAutomatedExpansionAuto_expandKeyword_3_2_0());
                    	    									

                    	    										if (current==null) {
                    	    											current = createModelElement(grammarAccess.getEntityTypeRule());
                    	    										}
                    	    										setWithLastConsumed(current, "automatedExpansion", true, "auto_expand");
                    	    									

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalDialogflowConfig.g:950:4: ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:950:4: ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) ) )
                    	    // InternalDialogflowConfig.g:951:5: {...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 3)");
                    	    }
                    	    // InternalDialogflowConfig.g:951:107: ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) ) )
                    	    // InternalDialogflowConfig.g:952:6: ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 3);
                    	    					
                    	    // InternalDialogflowConfig.g:955:9: ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) ) )
                    	    // InternalDialogflowConfig.g:955:10: {...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:955:19: ( (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' ) )
                    	    // InternalDialogflowConfig.g:955:20: (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' )
                    	    {
                    	    // InternalDialogflowConfig.g:955:20: (lv_allowFuzzyExtraction_11_0= 'fuzzy_extract' )
                    	    // InternalDialogflowConfig.g:956:10: lv_allowFuzzyExtraction_11_0= 'fuzzy_extract'
                    	    {
                    	    lv_allowFuzzyExtraction_11_0=(Token)match(input,37,FOLLOW_23); 

                    	    										newLeafNode(lv_allowFuzzyExtraction_11_0, grammarAccess.getEntityTypeAccess().getAllowFuzzyExtractionFuzzy_extractKeyword_3_3_0());
                    	    									

                    	    										if (current==null) {
                    	    											current = createModelElement(grammarAccess.getEntityTypeRule());
                    	    										}
                    	    										setWithLastConsumed(current, "allowFuzzyExtraction", true, "fuzzy_extract");
                    	    									

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3()) ) {
                        throw new FailedPredicateException(input, "ruleEntityType", "getUnorderedGroupHelper().canLeave(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3())");
                    }

                    }


                    }

                     
                    				  getUnorderedGroupHelper().leave(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3());
                    				

                    }
                    break;

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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleEntity"
    // InternalDialogflowConfig.g:985:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDialogflowConfig.g:985:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDialogflowConfig.g:986:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalDialogflowConfig.g:992:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_synonyms_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:998:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )? ) )
            // InternalDialogflowConfig.g:999:2: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )? )
            {
            // InternalDialogflowConfig.g:999:2: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )? )
            // InternalDialogflowConfig.g:1000:3: ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )?
            {
            // InternalDialogflowConfig.g:1000:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalDialogflowConfig.g:1001:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalDialogflowConfig.g:1001:4: (lv_name_0_0= RULE_STRING )
            // InternalDialogflowConfig.g:1002:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDialogflowConfig.g:1018:3: (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDialogflowConfig.g:1019:4: otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDialogflowConfig.g:1023:4: ( (lv_synonyms_2_0= RULE_STRING ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_STRING) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:1024:5: (lv_synonyms_2_0= RULE_STRING )
                    	    {
                    	    // InternalDialogflowConfig.g:1024:5: (lv_synonyms_2_0= RULE_STRING )
                    	    // InternalDialogflowConfig.g:1025:6: lv_synonyms_2_0= RULE_STRING
                    	    {
                    	    lv_synonyms_2_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    	    						newLeafNode(lv_synonyms_2_0, grammarAccess.getEntityAccess().getSynonymsSTRINGTerminalRuleCall_1_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEntityRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"synonyms",
                    	    							lv_synonyms_2_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEntity"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000E66002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000E64012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000E78002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000E70012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000E60012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003A00000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003A00000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000020L});

}
