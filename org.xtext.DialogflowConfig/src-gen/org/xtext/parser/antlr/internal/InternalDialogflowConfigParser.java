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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Agent'", "'Intent'", "'parameters'", "'contexts'", "'in'", "'out'", "'file'", "'trained'", "'with'", "','", "'lifespan'", "'('", "'required'", "'list'", "')'", "'Type'", "'dynamic'", "'builtin'", "'values'", "'state'", "'overridable'", "'enum'", "'autoexpand'", "'fuzzyextract'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
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

                if ( (LA1_0==12||LA1_0==26) ) {
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
            else if ( (LA2_0==26) ) {
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
    // InternalDialogflowConfig.g:167:1: ruleIntent returns [EObject current=null] : (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )? (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )? ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )? ) ;
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
        EObject lv_parameters_3_0 = null;

        EObject lv_inputContexts_6_0 = null;

        EObject lv_affectedContexts_8_0 = null;

        EObject lv_trainingPhrases_13_0 = null;

        EObject lv_trainingPhrases_15_0 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:173:2: ( (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )? (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )? ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )? ) )
            // InternalDialogflowConfig.g:174:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )? (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )? ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )? )
            {
            // InternalDialogflowConfig.g:174:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )? (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )? ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )? )
            // InternalDialogflowConfig.g:175:3: otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parameters' ( (lv_parameters_3_0= ruleParameter ) )* )? (otherlv_4= 'contexts' ( (otherlv_5= 'in' ( (lv_inputContexts_6_0= ruleInputContext ) )+ )? (otherlv_7= 'out' ( (lv_affectedContexts_8_0= ruleOutputContext ) )+ )? ) )? ( (otherlv_9= 'file' ( (lv_file_10_0= RULE_STRING ) ) ) | (otherlv_11= 'trained' otherlv_12= 'with' ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) ) (otherlv_14= ',' ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) ) )* ) )?
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
                    lv_file_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

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
                    otherlv_11=(Token)match(input,18,FOLLOW_11); 

                    					newLeafNode(otherlv_11, grammarAccess.getIntentAccess().getTrainedKeyword_4_1_0());
                    				
                    otherlv_12=(Token)match(input,19,FOLLOW_12); 

                    					newLeafNode(otherlv_12, grammarAccess.getIntentAccess().getWithKeyword_4_1_1());
                    				
                    // InternalDialogflowConfig.g:315:5: ( (lv_trainingPhrases_13_0= ruleTrainingPhrase ) )
                    // InternalDialogflowConfig.g:316:6: (lv_trainingPhrases_13_0= ruleTrainingPhrase )
                    {
                    // InternalDialogflowConfig.g:316:6: (lv_trainingPhrases_13_0= ruleTrainingPhrase )
                    // InternalDialogflowConfig.g:317:7: lv_trainingPhrases_13_0= ruleTrainingPhrase
                    {

                    							newCompositeNode(grammarAccess.getIntentAccess().getTrainingPhrasesTrainingPhraseParserRuleCall_4_1_2_0());
                    						
                    pushFollow(FOLLOW_13);
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
                    	    otherlv_14=(Token)match(input,20,FOLLOW_12); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getIntentAccess().getCommaKeyword_4_1_3_0());
                    	    					
                    	    // InternalDialogflowConfig.g:339:6: ( (lv_trainingPhrases_15_0= ruleTrainingPhrase ) )
                    	    // InternalDialogflowConfig.g:340:7: (lv_trainingPhrases_15_0= ruleTrainingPhrase )
                    	    {
                    	    // InternalDialogflowConfig.g:340:7: (lv_trainingPhrases_15_0= ruleTrainingPhrase )
                    	    // InternalDialogflowConfig.g:341:8: lv_trainingPhrases_15_0= ruleTrainingPhrase
                    	    {

                    	    								newCompositeNode(grammarAccess.getIntentAccess().getTrainingPhrasesTrainingPhraseParserRuleCall_4_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_13);
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
    // InternalDialogflowConfig.g:365:1: entryRuleInputContext returns [EObject current=null] : iv_ruleInputContext= ruleInputContext EOF ;
    public final EObject entryRuleInputContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputContext = null;


        try {
            // InternalDialogflowConfig.g:365:53: (iv_ruleInputContext= ruleInputContext EOF )
            // InternalDialogflowConfig.g:366:2: iv_ruleInputContext= ruleInputContext EOF
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
    // InternalDialogflowConfig.g:372:1: ruleInputContext returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInputContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:378:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDialogflowConfig.g:379:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDialogflowConfig.g:379:2: ( (otherlv_0= RULE_ID ) )
            // InternalDialogflowConfig.g:380:3: (otherlv_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:380:3: (otherlv_0= RULE_ID )
            // InternalDialogflowConfig.g:381:4: otherlv_0= RULE_ID
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
    // InternalDialogflowConfig.g:395:1: entryRuleOutputContext returns [EObject current=null] : iv_ruleOutputContext= ruleOutputContext EOF ;
    public final EObject entryRuleOutputContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputContext = null;


        try {
            // InternalDialogflowConfig.g:395:54: (iv_ruleOutputContext= ruleOutputContext EOF )
            // InternalDialogflowConfig.g:396:2: iv_ruleOutputContext= ruleOutputContext EOF
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
    // InternalDialogflowConfig.g:402:1: ruleOutputContext returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOutputContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_lifespan_2_0=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:408:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )? ) )
            // InternalDialogflowConfig.g:409:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )? )
            {
            // InternalDialogflowConfig.g:409:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )? )
            // InternalDialogflowConfig.g:410:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )?
            {
            // InternalDialogflowConfig.g:410:3: ( (otherlv_0= RULE_ID ) )
            // InternalDialogflowConfig.g:411:4: (otherlv_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:411:4: (otherlv_0= RULE_ID )
            // InternalDialogflowConfig.g:412:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputContextRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getOutputContextAccess().getTypeEntityTypeCrossReference_0_0());
            				

            }


            }

            // InternalDialogflowConfig.g:423:3: (otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDialogflowConfig.g:424:4: otherlv_1= 'lifespan' ( (lv_lifespan_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutputContextAccess().getLifespanKeyword_1_0());
                    			
                    // InternalDialogflowConfig.g:428:4: ( (lv_lifespan_2_0= RULE_INT ) )
                    // InternalDialogflowConfig.g:429:5: (lv_lifespan_2_0= RULE_INT )
                    {
                    // InternalDialogflowConfig.g:429:5: (lv_lifespan_2_0= RULE_INT )
                    // InternalDialogflowConfig.g:430:6: lv_lifespan_2_0= RULE_INT
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
    // InternalDialogflowConfig.g:451:1: entryRuleTrainingPhrase returns [EObject current=null] : iv_ruleTrainingPhrase= ruleTrainingPhrase EOF ;
    public final EObject entryRuleTrainingPhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingPhrase = null;


        try {
            // InternalDialogflowConfig.g:451:55: (iv_ruleTrainingPhrase= ruleTrainingPhrase EOF )
            // InternalDialogflowConfig.g:452:2: iv_ruleTrainingPhrase= ruleTrainingPhrase EOF
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
    // InternalDialogflowConfig.g:458:1: ruleTrainingPhrase returns [EObject current=null] : ( (lv_data_0_0= ruleAbstractWord ) )+ ;
    public final EObject ruleTrainingPhrase() throws RecognitionException {
        EObject current = null;

        EObject lv_data_0_0 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:464:2: ( ( (lv_data_0_0= ruleAbstractWord ) )+ )
            // InternalDialogflowConfig.g:465:2: ( (lv_data_0_0= ruleAbstractWord ) )+
            {
            // InternalDialogflowConfig.g:465:2: ( (lv_data_0_0= ruleAbstractWord ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDialogflowConfig.g:466:3: (lv_data_0_0= ruleAbstractWord )
            	    {
            	    // InternalDialogflowConfig.g:466:3: (lv_data_0_0= ruleAbstractWord )
            	    // InternalDialogflowConfig.g:467:4: lv_data_0_0= ruleAbstractWord
            	    {

            	    				newCompositeNode(grammarAccess.getTrainingPhraseAccess().getDataAbstractWordParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // InternalDialogflowConfig.g:487:1: entryRuleAbstractWord returns [EObject current=null] : iv_ruleAbstractWord= ruleAbstractWord EOF ;
    public final EObject entryRuleAbstractWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractWord = null;


        try {
            // InternalDialogflowConfig.g:487:53: (iv_ruleAbstractWord= ruleAbstractWord EOF )
            // InternalDialogflowConfig.g:488:2: iv_ruleAbstractWord= ruleAbstractWord EOF
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
    // InternalDialogflowConfig.g:494:1: ruleAbstractWord returns [EObject current=null] : (this_Text_0= ruleText | this_Token_1= ruleToken ) ;
    public final EObject ruleAbstractWord() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Token_1 = null;



        	enterRule();

        try {
            // InternalDialogflowConfig.g:500:2: ( (this_Text_0= ruleText | this_Token_1= ruleToken ) )
            // InternalDialogflowConfig.g:501:2: (this_Text_0= ruleText | this_Token_1= ruleToken )
            {
            // InternalDialogflowConfig.g:501:2: (this_Text_0= ruleText | this_Token_1= ruleToken )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDialogflowConfig.g:502:3: this_Text_0= ruleText
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
                    // InternalDialogflowConfig.g:511:3: this_Token_1= ruleToken
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
    // InternalDialogflowConfig.g:523:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalDialogflowConfig.g:523:45: (iv_ruleText= ruleText EOF )
            // InternalDialogflowConfig.g:524:2: iv_ruleText= ruleText EOF
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
    // InternalDialogflowConfig.g:530:1: ruleText returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:536:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalDialogflowConfig.g:537:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalDialogflowConfig.g:537:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalDialogflowConfig.g:538:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalDialogflowConfig.g:538:3: (lv_text_0_0= RULE_STRING )
            // InternalDialogflowConfig.g:539:4: lv_text_0_0= RULE_STRING
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
    // InternalDialogflowConfig.g:558:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // InternalDialogflowConfig.g:558:46: (iv_ruleToken= ruleToken EOF )
            // InternalDialogflowConfig.g:559:2: iv_ruleToken= ruleToken EOF
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
    // InternalDialogflowConfig.g:565:1: ruleToken returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:571:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDialogflowConfig.g:572:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDialogflowConfig.g:572:2: ( (otherlv_0= RULE_ID ) )
            // InternalDialogflowConfig.g:573:3: (otherlv_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:573:3: (otherlv_0= RULE_ID )
            // InternalDialogflowConfig.g:574:4: otherlv_0= RULE_ID
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
    // InternalDialogflowConfig.g:588:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDialogflowConfig.g:588:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalDialogflowConfig.g:589:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalDialogflowConfig.g:595:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_required_3_0=null;
        Token lv_list_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:601:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )? ) )
            // InternalDialogflowConfig.g:602:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )? )
            {
            // InternalDialogflowConfig.g:602:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )? )
            // InternalDialogflowConfig.g:603:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )?
            {
            // InternalDialogflowConfig.g:603:3: ( (otherlv_0= RULE_ID ) )
            // InternalDialogflowConfig.g:604:4: (otherlv_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:604:4: (otherlv_0= RULE_ID )
            // InternalDialogflowConfig.g:605:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getTypeEntityTypeCrossReference_0_0());
            				

            }


            }

            // InternalDialogflowConfig.g:616:3: (otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDialogflowConfig.g:617:4: otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDialogflowConfig.g:621:4: ( ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) ) )
                    // InternalDialogflowConfig.g:622:5: ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) )
                    {
                    // InternalDialogflowConfig.g:622:5: ( ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* ) )
                    // InternalDialogflowConfig.g:623:6: ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_1_1());
                    					
                    // InternalDialogflowConfig.g:626:6: ( ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )* )
                    // InternalDialogflowConfig.g:627:7: ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )*
                    {
                    // InternalDialogflowConfig.g:627:7: ( ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( LA15_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 0) ) {
                            alt15=1;
                        }
                        else if ( LA15_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 1) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:628:5: ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:628:5: ({...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) ) )
                    	    // InternalDialogflowConfig.g:629:6: {...}? => ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 0)");
                    	    }
                    	    // InternalDialogflowConfig.g:629:109: ( ({...}? => ( (lv_required_3_0= 'required' ) ) ) )
                    	    // InternalDialogflowConfig.g:630:7: ({...}? => ( (lv_required_3_0= 'required' ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 0);
                    	    						
                    	    // InternalDialogflowConfig.g:633:10: ({...}? => ( (lv_required_3_0= 'required' ) ) )
                    	    // InternalDialogflowConfig.g:633:11: {...}? => ( (lv_required_3_0= 'required' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:633:20: ( (lv_required_3_0= 'required' ) )
                    	    // InternalDialogflowConfig.g:633:21: (lv_required_3_0= 'required' )
                    	    {
                    	    // InternalDialogflowConfig.g:633:21: (lv_required_3_0= 'required' )
                    	    // InternalDialogflowConfig.g:634:11: lv_required_3_0= 'required'
                    	    {
                    	    lv_required_3_0=(Token)match(input,23,FOLLOW_18); 

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
                    	    // InternalDialogflowConfig.g:651:5: ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:651:5: ({...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) ) )
                    	    // InternalDialogflowConfig.g:652:6: {...}? => ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 1)");
                    	    }
                    	    // InternalDialogflowConfig.g:652:109: ( ({...}? => ( (lv_list_4_0= 'list' ) ) ) )
                    	    // InternalDialogflowConfig.g:653:7: ({...}? => ( (lv_list_4_0= 'list' ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_1_1(), 1);
                    	    						
                    	    // InternalDialogflowConfig.g:656:10: ({...}? => ( (lv_list_4_0= 'list' ) ) )
                    	    // InternalDialogflowConfig.g:656:11: {...}? => ( (lv_list_4_0= 'list' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleParameter", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:656:20: ( (lv_list_4_0= 'list' ) )
                    	    // InternalDialogflowConfig.g:656:21: (lv_list_4_0= 'list' )
                    	    {
                    	    // InternalDialogflowConfig.g:656:21: (lv_list_4_0= 'list' )
                    	    // InternalDialogflowConfig.g:657:11: lv_list_4_0= 'list'
                    	    {
                    	    lv_list_4_0=(Token)match(input,24,FOLLOW_18); 

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
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup_1_1());
                    					

                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_2); 

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
    // InternalDialogflowConfig.g:690:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalDialogflowConfig.g:690:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalDialogflowConfig.g:691:2: iv_ruleEntityType= ruleEntityType EOF
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
    // InternalDialogflowConfig.g:697:1: ruleEntityType returns [EObject current=null] : (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?) ) )? ) ;
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
            // InternalDialogflowConfig.g:703:2: ( (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?) ) )? ) )
            // InternalDialogflowConfig.g:704:2: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalDialogflowConfig.g:704:2: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?) ) )? )
            // InternalDialogflowConfig.g:705:3: otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getTypeKeyword_0());
            		
            // InternalDialogflowConfig.g:709:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogflowConfig.g:710:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogflowConfig.g:710:4: (lv_name_1_0= RULE_ID )
            // InternalDialogflowConfig.g:711:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalDialogflowConfig.g:727:3: ( ( (lv_dynamic_2_0= 'dynamic' ) ) | ( (lv_builtIn_3_0= 'builtin' ) ) | (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt18=1;
                }
                break;
            case 28:
                {
                alt18=2;
                }
                break;
            case 29:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDialogflowConfig.g:728:4: ( (lv_dynamic_2_0= 'dynamic' ) )
                    {
                    // InternalDialogflowConfig.g:728:4: ( (lv_dynamic_2_0= 'dynamic' ) )
                    // InternalDialogflowConfig.g:729:5: (lv_dynamic_2_0= 'dynamic' )
                    {
                    // InternalDialogflowConfig.g:729:5: (lv_dynamic_2_0= 'dynamic' )
                    // InternalDialogflowConfig.g:730:6: lv_dynamic_2_0= 'dynamic'
                    {
                    lv_dynamic_2_0=(Token)match(input,27,FOLLOW_20); 

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
                    // InternalDialogflowConfig.g:743:4: ( (lv_builtIn_3_0= 'builtin' ) )
                    {
                    // InternalDialogflowConfig.g:743:4: ( (lv_builtIn_3_0= 'builtin' ) )
                    // InternalDialogflowConfig.g:744:5: (lv_builtIn_3_0= 'builtin' )
                    {
                    // InternalDialogflowConfig.g:744:5: (lv_builtIn_3_0= 'builtin' )
                    // InternalDialogflowConfig.g:745:6: lv_builtIn_3_0= 'builtin'
                    {
                    lv_builtIn_3_0=(Token)match(input,28,FOLLOW_20); 

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
                    // InternalDialogflowConfig.g:758:4: (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ )
                    {
                    // InternalDialogflowConfig.g:758:4: (otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+ )
                    // InternalDialogflowConfig.g:759:5: otherlv_4= 'values' ( (lv_values_5_0= ruleEntity ) )+
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getEntityTypeAccess().getValuesKeyword_2_2_0());
                    				
                    // InternalDialogflowConfig.g:763:5: ( (lv_values_5_0= ruleEntity ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_STRING) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:764:6: (lv_values_5_0= ruleEntity )
                    	    {
                    	    // InternalDialogflowConfig.g:764:6: (lv_values_5_0= ruleEntity )
                    	    // InternalDialogflowConfig.g:765:7: lv_values_5_0= ruleEntity
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityTypeAccess().getValuesEntityParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalDialogflowConfig.g:784:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30||(LA21_0>=32 && LA21_0<=34)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDialogflowConfig.g:785:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalDialogflowConfig.g:785:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?) )
                    // InternalDialogflowConfig.g:786:5: ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3());
                    				
                    // InternalDialogflowConfig.g:789:5: ( ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?)
                    // InternalDialogflowConfig.g:790:6: ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+ {...}?
                    {
                    // InternalDialogflowConfig.g:790:6: ( ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=5;
                        int LA20_0 = input.LA(1);

                        if ( LA20_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 0) ) {
                            alt20=1;
                        }
                        else if ( LA20_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 1) ) {
                            alt20=2;
                        }
                        else if ( LA20_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 2) ) {
                            alt20=3;
                        }
                        else if ( LA20_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 3) ) {
                            alt20=4;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:791:4: ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:791:4: ({...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) ) )
                    	    // InternalDialogflowConfig.g:792:5: {...}? => ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 0)");
                    	    }
                    	    // InternalDialogflowConfig.g:792:107: ( ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) ) )
                    	    // InternalDialogflowConfig.g:793:6: ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 0);
                    	    					
                    	    // InternalDialogflowConfig.g:796:9: ({...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? ) )
                    	    // InternalDialogflowConfig.g:796:10: {...}? => (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:796:19: (otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )? )
                    	    // InternalDialogflowConfig.g:796:20: otherlv_7= 'state' ( (lv_isOverridable_8_0= 'overridable' ) )?
                    	    {
                    	    otherlv_7=(Token)match(input,30,FOLLOW_22); 

                    	    									newLeafNode(otherlv_7, grammarAccess.getEntityTypeAccess().getStateKeyword_3_0_0());
                    	    								
                    	    // InternalDialogflowConfig.g:800:9: ( (lv_isOverridable_8_0= 'overridable' ) )?
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==31) ) {
                    	        alt19=1;
                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // InternalDialogflowConfig.g:801:10: (lv_isOverridable_8_0= 'overridable' )
                    	            {
                    	            // InternalDialogflowConfig.g:801:10: (lv_isOverridable_8_0= 'overridable' )
                    	            // InternalDialogflowConfig.g:802:11: lv_isOverridable_8_0= 'overridable'
                    	            {
                    	            lv_isOverridable_8_0=(Token)match(input,31,FOLLOW_20); 

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
                    	    // InternalDialogflowConfig.g:820:4: ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:820:4: ({...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) ) )
                    	    // InternalDialogflowConfig.g:821:5: {...}? => ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 1)");
                    	    }
                    	    // InternalDialogflowConfig.g:821:107: ( ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) ) )
                    	    // InternalDialogflowConfig.g:822:6: ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 1);
                    	    					
                    	    // InternalDialogflowConfig.g:825:9: ({...}? => ( (lv_isEnum_9_0= 'enum' ) ) )
                    	    // InternalDialogflowConfig.g:825:10: {...}? => ( (lv_isEnum_9_0= 'enum' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:825:19: ( (lv_isEnum_9_0= 'enum' ) )
                    	    // InternalDialogflowConfig.g:825:20: (lv_isEnum_9_0= 'enum' )
                    	    {
                    	    // InternalDialogflowConfig.g:825:20: (lv_isEnum_9_0= 'enum' )
                    	    // InternalDialogflowConfig.g:826:10: lv_isEnum_9_0= 'enum'
                    	    {
                    	    lv_isEnum_9_0=(Token)match(input,32,FOLLOW_20); 

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
                    	    // InternalDialogflowConfig.g:843:4: ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:843:4: ({...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) ) )
                    	    // InternalDialogflowConfig.g:844:5: {...}? => ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 2)");
                    	    }
                    	    // InternalDialogflowConfig.g:844:107: ( ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) ) )
                    	    // InternalDialogflowConfig.g:845:6: ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 2);
                    	    					
                    	    // InternalDialogflowConfig.g:848:9: ({...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) ) )
                    	    // InternalDialogflowConfig.g:848:10: {...}? => ( (lv_automatedExpansion_10_0= 'autoexpand' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:848:19: ( (lv_automatedExpansion_10_0= 'autoexpand' ) )
                    	    // InternalDialogflowConfig.g:848:20: (lv_automatedExpansion_10_0= 'autoexpand' )
                    	    {
                    	    // InternalDialogflowConfig.g:848:20: (lv_automatedExpansion_10_0= 'autoexpand' )
                    	    // InternalDialogflowConfig.g:849:10: lv_automatedExpansion_10_0= 'autoexpand'
                    	    {
                    	    lv_automatedExpansion_10_0=(Token)match(input,33,FOLLOW_20); 

                    	    										newLeafNode(lv_automatedExpansion_10_0, grammarAccess.getEntityTypeAccess().getAutomatedExpansionAutoexpandKeyword_3_2_0());
                    	    									

                    	    										if (current==null) {
                    	    											current = createModelElement(grammarAccess.getEntityTypeRule());
                    	    										}
                    	    										setWithLastConsumed(current, "automatedExpansion", true, "autoexpand");
                    	    									

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalDialogflowConfig.g:866:4: ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) )
                    	    {
                    	    // InternalDialogflowConfig.g:866:4: ({...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) ) )
                    	    // InternalDialogflowConfig.g:867:5: {...}? => ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 3)");
                    	    }
                    	    // InternalDialogflowConfig.g:867:107: ( ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) ) )
                    	    // InternalDialogflowConfig.g:868:6: ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3(), 3);
                    	    					
                    	    // InternalDialogflowConfig.g:871:9: ({...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) ) )
                    	    // InternalDialogflowConfig.g:871:10: {...}? => ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEntityType", "true");
                    	    }
                    	    // InternalDialogflowConfig.g:871:19: ( (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' ) )
                    	    // InternalDialogflowConfig.g:871:20: (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' )
                    	    {
                    	    // InternalDialogflowConfig.g:871:20: (lv_allowFuzzyExtraction_11_0= 'fuzzyextract' )
                    	    // InternalDialogflowConfig.g:872:10: lv_allowFuzzyExtraction_11_0= 'fuzzyextract'
                    	    {
                    	    lv_allowFuzzyExtraction_11_0=(Token)match(input,34,FOLLOW_20); 

                    	    										newLeafNode(lv_allowFuzzyExtraction_11_0, grammarAccess.getEntityTypeAccess().getAllowFuzzyExtractionFuzzyextractKeyword_3_3_0());
                    	    									

                    	    										if (current==null) {
                    	    											current = createModelElement(grammarAccess.getEntityTypeRule());
                    	    										}
                    	    										setWithLastConsumed(current, "allowFuzzyExtraction", true, "fuzzyextract");
                    	    									

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityTypeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


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
    // InternalDialogflowConfig.g:901:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDialogflowConfig.g:901:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDialogflowConfig.g:902:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalDialogflowConfig.g:908:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_synonyms_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDialogflowConfig.g:914:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )? ) )
            // InternalDialogflowConfig.g:915:2: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )? )
            {
            // InternalDialogflowConfig.g:915:2: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )? )
            // InternalDialogflowConfig.g:916:3: ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )?
            {
            // InternalDialogflowConfig.g:916:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalDialogflowConfig.g:917:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalDialogflowConfig.g:917:4: (lv_name_0_0= RULE_STRING )
            // InternalDialogflowConfig.g:918:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            // InternalDialogflowConfig.g:934:3: (otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDialogflowConfig.g:935:4: otherlv_1= '(' ( (lv_synonyms_2_0= RULE_STRING ) )* otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDialogflowConfig.g:939:4: ( (lv_synonyms_2_0= RULE_STRING ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_STRING) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDialogflowConfig.g:940:5: (lv_synonyms_2_0= RULE_STRING )
                    	    {
                    	    // InternalDialogflowConfig.g:940:5: (lv_synonyms_2_0= RULE_STRING )
                    	    // InternalDialogflowConfig.g:941:6: lv_synonyms_2_0= RULE_STRING
                    	    {
                    	    lv_synonyms_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000066002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000064012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000740000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000740000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000007C0000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000020L});

}
