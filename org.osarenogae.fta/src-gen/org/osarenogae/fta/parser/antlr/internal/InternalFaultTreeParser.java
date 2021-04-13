package org.osarenogae.fta.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osarenogae.fta.services.FaultTreeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFaultTreeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'root'", "'='", "'or'", "'and'", "'inhibit'", "'intermediate'", "'basic'", "'conditional'", "'external'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalFaultTreeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFaultTreeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFaultTreeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFaultTree.g"; }



     	private FaultTreeGrammarAccess grammarAccess;

        public InternalFaultTreeParser(TokenStream input, FaultTreeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FaultTreeModel";
       	}

       	@Override
       	protected FaultTreeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFaultTreeModel"
    // InternalFaultTree.g:64:1: entryRuleFaultTreeModel returns [EObject current=null] : iv_ruleFaultTreeModel= ruleFaultTreeModel EOF ;
    public final EObject entryRuleFaultTreeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFaultTreeModel = null;


        try {
            // InternalFaultTree.g:64:55: (iv_ruleFaultTreeModel= ruleFaultTreeModel EOF )
            // InternalFaultTree.g:65:2: iv_ruleFaultTreeModel= ruleFaultTreeModel EOF
            {
             newCompositeNode(grammarAccess.getFaultTreeModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFaultTreeModel=ruleFaultTreeModel();

            state._fsp--;

             current =iv_ruleFaultTreeModel; 
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
    // $ANTLR end "entryRuleFaultTreeModel"


    // $ANTLR start "ruleFaultTreeModel"
    // InternalFaultTree.g:71:1: ruleFaultTreeModel returns [EObject current=null] : ( (lv_faultTree_0_0= rulebegin ) ) ;
    public final EObject ruleFaultTreeModel() throws RecognitionException {
        EObject current = null;

        EObject lv_faultTree_0_0 = null;



        	enterRule();

        try {
            // InternalFaultTree.g:77:2: ( ( (lv_faultTree_0_0= rulebegin ) ) )
            // InternalFaultTree.g:78:2: ( (lv_faultTree_0_0= rulebegin ) )
            {
            // InternalFaultTree.g:78:2: ( (lv_faultTree_0_0= rulebegin ) )
            // InternalFaultTree.g:79:3: (lv_faultTree_0_0= rulebegin )
            {
            // InternalFaultTree.g:79:3: (lv_faultTree_0_0= rulebegin )
            // InternalFaultTree.g:80:4: lv_faultTree_0_0= rulebegin
            {

            				newCompositeNode(grammarAccess.getFaultTreeModelAccess().getFaultTreeBeginParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_faultTree_0_0=rulebegin();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFaultTreeModelRule());
            				}
            				add(
            					current,
            					"faultTree",
            					lv_faultTree_0_0,
            					"org.osarenogae.fta.FaultTree.begin");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleFaultTreeModel"


    // $ANTLR start "entryRulebegin"
    // InternalFaultTree.g:100:1: entryRulebegin returns [EObject current=null] : iv_rulebegin= rulebegin EOF ;
    public final EObject entryRulebegin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebegin = null;


        try {
            // InternalFaultTree.g:100:46: (iv_rulebegin= rulebegin EOF )
            // InternalFaultTree.g:101:2: iv_rulebegin= rulebegin EOF
            {
             newCompositeNode(grammarAccess.getBeginRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebegin=rulebegin();

            state._fsp--;

             current =iv_rulebegin; 
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
    // $ANTLR end "entryRulebegin"


    // $ANTLR start "rulebegin"
    // InternalFaultTree.g:107:1: rulebegin returns [EObject current=null] : ( (this_IntermediateEventDefinition_0= ruleIntermediateEventDefinition )? otherlv_1= 'root' ( (lv_fault_2_0= ruleTree ) ) ) ;
    public final EObject rulebegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_IntermediateEventDefinition_0 = null;

        EObject lv_fault_2_0 = null;



        	enterRule();

        try {
            // InternalFaultTree.g:113:2: ( ( (this_IntermediateEventDefinition_0= ruleIntermediateEventDefinition )? otherlv_1= 'root' ( (lv_fault_2_0= ruleTree ) ) ) )
            // InternalFaultTree.g:114:2: ( (this_IntermediateEventDefinition_0= ruleIntermediateEventDefinition )? otherlv_1= 'root' ( (lv_fault_2_0= ruleTree ) ) )
            {
            // InternalFaultTree.g:114:2: ( (this_IntermediateEventDefinition_0= ruleIntermediateEventDefinition )? otherlv_1= 'root' ( (lv_fault_2_0= ruleTree ) ) )
            // InternalFaultTree.g:115:3: (this_IntermediateEventDefinition_0= ruleIntermediateEventDefinition )? otherlv_1= 'root' ( (lv_fault_2_0= ruleTree ) )
            {
            // InternalFaultTree.g:115:3: (this_IntermediateEventDefinition_0= ruleIntermediateEventDefinition )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalFaultTree.g:116:4: this_IntermediateEventDefinition_0= ruleIntermediateEventDefinition
                    {

                    				newCompositeNode(grammarAccess.getBeginAccess().getIntermediateEventDefinitionParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_3);
                    this_IntermediateEventDefinition_0=ruleIntermediateEventDefinition();

                    state._fsp--;


                    				current = this_IntermediateEventDefinition_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBeginAccess().getRootKeyword_1());
            		
            // InternalFaultTree.g:129:3: ( (lv_fault_2_0= ruleTree ) )
            // InternalFaultTree.g:130:4: (lv_fault_2_0= ruleTree )
            {
            // InternalFaultTree.g:130:4: (lv_fault_2_0= ruleTree )
            // InternalFaultTree.g:131:5: lv_fault_2_0= ruleTree
            {

            					newCompositeNode(grammarAccess.getBeginAccess().getFaultTreeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_fault_2_0=ruleTree();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBeginRule());
            					}
            					add(
            						current,
            						"fault",
            						lv_fault_2_0,
            						"org.osarenogae.fta.FaultTree.Tree");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "rulebegin"


    // $ANTLR start "entryRuleIntermediateEventDefinition"
    // InternalFaultTree.g:152:1: entryRuleIntermediateEventDefinition returns [EObject current=null] : iv_ruleIntermediateEventDefinition= ruleIntermediateEventDefinition EOF ;
    public final EObject entryRuleIntermediateEventDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntermediateEventDefinition = null;


        try {
            // InternalFaultTree.g:152:68: (iv_ruleIntermediateEventDefinition= ruleIntermediateEventDefinition EOF )
            // InternalFaultTree.g:153:2: iv_ruleIntermediateEventDefinition= ruleIntermediateEventDefinition EOF
            {
             newCompositeNode(grammarAccess.getIntermediateEventDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntermediateEventDefinition=ruleIntermediateEventDefinition();

            state._fsp--;

             current =iv_ruleIntermediateEventDefinition; 
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
    // $ANTLR end "entryRuleIntermediateEventDefinition"


    // $ANTLR start "ruleIntermediateEventDefinition"
    // InternalFaultTree.g:159:1: ruleIntermediateEventDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= '=' ( (lv_value_3_0= ruleTree ) ) ) ;
    public final EObject ruleIntermediateEventDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFaultTree.g:165:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= '=' ( (lv_value_3_0= ruleTree ) ) ) )
            // InternalFaultTree.g:166:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= '=' ( (lv_value_3_0= ruleTree ) ) )
            {
            // InternalFaultTree.g:166:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= '=' ( (lv_value_3_0= ruleTree ) ) )
            // InternalFaultTree.g:167:3: ( (otherlv_0= RULE_ID ) ) ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= '=' ( (lv_value_3_0= ruleTree ) )
            {
            // InternalFaultTree.g:167:3: ( (otherlv_0= RULE_ID ) )
            // InternalFaultTree.g:168:4: (otherlv_0= RULE_ID )
            {
            // InternalFaultTree.g:168:4: (otherlv_0= RULE_ID )
            // InternalFaultTree.g:169:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntermediateEventDefinitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getIntermediateEventDefinitionAccess().getNameIntermediateEventCrossReference_0_0());
            				

            }


            }

            // InternalFaultTree.g:180:3: ( (lv_description_1_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFaultTree.g:181:4: (lv_description_1_0= RULE_STRING )
                    {
                    // InternalFaultTree.g:181:4: (lv_description_1_0= RULE_STRING )
                    // InternalFaultTree.g:182:5: lv_description_1_0= RULE_STRING
                    {
                    lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_description_1_0, grammarAccess.getIntermediateEventDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntermediateEventDefinitionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIntermediateEventDefinitionAccess().getEqualsSignKeyword_2());
            		
            // InternalFaultTree.g:202:3: ( (lv_value_3_0= ruleTree ) )
            // InternalFaultTree.g:203:4: (lv_value_3_0= ruleTree )
            {
            // InternalFaultTree.g:203:4: (lv_value_3_0= ruleTree )
            // InternalFaultTree.g:204:5: lv_value_3_0= ruleTree
            {

            					newCompositeNode(grammarAccess.getIntermediateEventDefinitionAccess().getValueTreeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleTree();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntermediateEventDefinitionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.osarenogae.fta.FaultTree.Tree");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleIntermediateEventDefinition"


    // $ANTLR start "entryRuleTree"
    // InternalFaultTree.g:225:1: entryRuleTree returns [EObject current=null] : iv_ruleTree= ruleTree EOF ;
    public final EObject entryRuleTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTree = null;


        try {
            // InternalFaultTree.g:225:45: (iv_ruleTree= ruleTree EOF )
            // InternalFaultTree.g:226:2: iv_ruleTree= ruleTree EOF
            {
             newCompositeNode(grammarAccess.getTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTree=ruleTree();

            state._fsp--;

             current =iv_ruleTree; 
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
    // $ANTLR end "entryRuleTree"


    // $ANTLR start "ruleTree"
    // InternalFaultTree.g:232:1: ruleTree returns [EObject current=null] : (this_Event_0= ruleEvent | this_OrGate_1= ruleOrGate | this_AndGate_2= ruleAndGate | this_InhibitGate_3= ruleInhibitGate ) ;
    public final EObject ruleTree() throws RecognitionException {
        EObject current = null;

        EObject this_Event_0 = null;

        EObject this_OrGate_1 = null;

        EObject this_AndGate_2 = null;

        EObject this_InhibitGate_3 = null;



        	enterRule();

        try {
            // InternalFaultTree.g:238:2: ( (this_Event_0= ruleEvent | this_OrGate_1= ruleOrGate | this_AndGate_2= ruleAndGate | this_InhibitGate_3= ruleInhibitGate ) )
            // InternalFaultTree.g:239:2: (this_Event_0= ruleEvent | this_OrGate_1= ruleOrGate | this_AndGate_2= ruleAndGate | this_InhibitGate_3= ruleInhibitGate )
            {
            // InternalFaultTree.g:239:2: (this_Event_0= ruleEvent | this_OrGate_1= ruleOrGate | this_AndGate_2= ruleAndGate | this_InhibitGate_3= ruleInhibitGate )
            int alt3=4;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalFaultTree.g:240:3: this_Event_0= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getTreeAccess().getEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_0=ruleEvent();

                    state._fsp--;


                    			current = this_Event_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFaultTree.g:249:3: this_OrGate_1= ruleOrGate
                    {

                    			newCompositeNode(grammarAccess.getTreeAccess().getOrGateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OrGate_1=ruleOrGate();

                    state._fsp--;


                    			current = this_OrGate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFaultTree.g:258:3: this_AndGate_2= ruleAndGate
                    {

                    			newCompositeNode(grammarAccess.getTreeAccess().getAndGateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AndGate_2=ruleAndGate();

                    state._fsp--;


                    			current = this_AndGate_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFaultTree.g:267:3: this_InhibitGate_3= ruleInhibitGate
                    {

                    			newCompositeNode(grammarAccess.getTreeAccess().getInhibitGateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_InhibitGate_3=ruleInhibitGate();

                    state._fsp--;


                    			current = this_InhibitGate_3;
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
    // $ANTLR end "ruleTree"


    // $ANTLR start "entryRuleOrGate"
    // InternalFaultTree.g:279:1: entryRuleOrGate returns [EObject current=null] : iv_ruleOrGate= ruleOrGate EOF ;
    public final EObject entryRuleOrGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrGate = null;


        try {
            // InternalFaultTree.g:279:47: (iv_ruleOrGate= ruleOrGate EOF )
            // InternalFaultTree.g:280:2: iv_ruleOrGate= ruleOrGate EOF
            {
             newCompositeNode(grammarAccess.getOrGateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrGate=ruleOrGate();

            state._fsp--;

             current =iv_ruleOrGate; 
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
    // $ANTLR end "entryRuleOrGate"


    // $ANTLR start "ruleOrGate"
    // InternalFaultTree.g:286:1: ruleOrGate returns [EObject current=null] : ( ( (lv_left_0_0= ruleAndGate ) ) otherlv_1= 'or' ( (lv_right_2_0= ruleAndGate ) ) ) ;
    public final EObject ruleOrGate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalFaultTree.g:292:2: ( ( ( (lv_left_0_0= ruleAndGate ) ) otherlv_1= 'or' ( (lv_right_2_0= ruleAndGate ) ) ) )
            // InternalFaultTree.g:293:2: ( ( (lv_left_0_0= ruleAndGate ) ) otherlv_1= 'or' ( (lv_right_2_0= ruleAndGate ) ) )
            {
            // InternalFaultTree.g:293:2: ( ( (lv_left_0_0= ruleAndGate ) ) otherlv_1= 'or' ( (lv_right_2_0= ruleAndGate ) ) )
            // InternalFaultTree.g:294:3: ( (lv_left_0_0= ruleAndGate ) ) otherlv_1= 'or' ( (lv_right_2_0= ruleAndGate ) )
            {
            // InternalFaultTree.g:294:3: ( (lv_left_0_0= ruleAndGate ) )
            // InternalFaultTree.g:295:4: (lv_left_0_0= ruleAndGate )
            {
            // InternalFaultTree.g:295:4: (lv_left_0_0= ruleAndGate )
            // InternalFaultTree.g:296:5: lv_left_0_0= ruleAndGate
            {

            					newCompositeNode(grammarAccess.getOrGateAccess().getLeftAndGateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_left_0_0=ruleAndGate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrGateRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.osarenogae.fta.FaultTree.AndGate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOrGateAccess().getOrKeyword_1());
            		
            // InternalFaultTree.g:317:3: ( (lv_right_2_0= ruleAndGate ) )
            // InternalFaultTree.g:318:4: (lv_right_2_0= ruleAndGate )
            {
            // InternalFaultTree.g:318:4: (lv_right_2_0= ruleAndGate )
            // InternalFaultTree.g:319:5: lv_right_2_0= ruleAndGate
            {

            					newCompositeNode(grammarAccess.getOrGateAccess().getRightAndGateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleAndGate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrGateRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.osarenogae.fta.FaultTree.AndGate");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleOrGate"


    // $ANTLR start "entryRuleAndGate"
    // InternalFaultTree.g:340:1: entryRuleAndGate returns [EObject current=null] : iv_ruleAndGate= ruleAndGate EOF ;
    public final EObject entryRuleAndGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndGate = null;


        try {
            // InternalFaultTree.g:340:48: (iv_ruleAndGate= ruleAndGate EOF )
            // InternalFaultTree.g:341:2: iv_ruleAndGate= ruleAndGate EOF
            {
             newCompositeNode(grammarAccess.getAndGateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndGate=ruleAndGate();

            state._fsp--;

             current =iv_ruleAndGate; 
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
    // $ANTLR end "entryRuleAndGate"


    // $ANTLR start "ruleAndGate"
    // InternalFaultTree.g:347:1: ruleAndGate returns [EObject current=null] : ( ( (lv_left_0_0= ruleInhibitGate ) ) otherlv_1= 'and' ( (lv_right_2_0= ruleInhibitGate ) ) ) ;
    public final EObject ruleAndGate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalFaultTree.g:353:2: ( ( ( (lv_left_0_0= ruleInhibitGate ) ) otherlv_1= 'and' ( (lv_right_2_0= ruleInhibitGate ) ) ) )
            // InternalFaultTree.g:354:2: ( ( (lv_left_0_0= ruleInhibitGate ) ) otherlv_1= 'and' ( (lv_right_2_0= ruleInhibitGate ) ) )
            {
            // InternalFaultTree.g:354:2: ( ( (lv_left_0_0= ruleInhibitGate ) ) otherlv_1= 'and' ( (lv_right_2_0= ruleInhibitGate ) ) )
            // InternalFaultTree.g:355:3: ( (lv_left_0_0= ruleInhibitGate ) ) otherlv_1= 'and' ( (lv_right_2_0= ruleInhibitGate ) )
            {
            // InternalFaultTree.g:355:3: ( (lv_left_0_0= ruleInhibitGate ) )
            // InternalFaultTree.g:356:4: (lv_left_0_0= ruleInhibitGate )
            {
            // InternalFaultTree.g:356:4: (lv_left_0_0= ruleInhibitGate )
            // InternalFaultTree.g:357:5: lv_left_0_0= ruleInhibitGate
            {

            					newCompositeNode(grammarAccess.getAndGateAccess().getLeftInhibitGateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_left_0_0=ruleInhibitGate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndGateRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.osarenogae.fta.FaultTree.InhibitGate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAndGateAccess().getAndKeyword_1());
            		
            // InternalFaultTree.g:378:3: ( (lv_right_2_0= ruleInhibitGate ) )
            // InternalFaultTree.g:379:4: (lv_right_2_0= ruleInhibitGate )
            {
            // InternalFaultTree.g:379:4: (lv_right_2_0= ruleInhibitGate )
            // InternalFaultTree.g:380:5: lv_right_2_0= ruleInhibitGate
            {

            					newCompositeNode(grammarAccess.getAndGateAccess().getRightInhibitGateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleInhibitGate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndGateRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.osarenogae.fta.FaultTree.InhibitGate");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAndGate"


    // $ANTLR start "entryRuleInhibitGate"
    // InternalFaultTree.g:401:1: entryRuleInhibitGate returns [EObject current=null] : iv_ruleInhibitGate= ruleInhibitGate EOF ;
    public final EObject entryRuleInhibitGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInhibitGate = null;


        try {
            // InternalFaultTree.g:401:52: (iv_ruleInhibitGate= ruleInhibitGate EOF )
            // InternalFaultTree.g:402:2: iv_ruleInhibitGate= ruleInhibitGate EOF
            {
             newCompositeNode(grammarAccess.getInhibitGateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInhibitGate=ruleInhibitGate();

            state._fsp--;

             current =iv_ruleInhibitGate; 
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
    // $ANTLR end "entryRuleInhibitGate"


    // $ANTLR start "ruleInhibitGate"
    // InternalFaultTree.g:408:1: ruleInhibitGate returns [EObject current=null] : ( ( (lv_left_0_0= ruleEvent ) ) otherlv_1= 'inhibit' ( (lv_right_2_0= ruleConditionalEvent ) ) ) ;
    public final EObject ruleInhibitGate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalFaultTree.g:414:2: ( ( ( (lv_left_0_0= ruleEvent ) ) otherlv_1= 'inhibit' ( (lv_right_2_0= ruleConditionalEvent ) ) ) )
            // InternalFaultTree.g:415:2: ( ( (lv_left_0_0= ruleEvent ) ) otherlv_1= 'inhibit' ( (lv_right_2_0= ruleConditionalEvent ) ) )
            {
            // InternalFaultTree.g:415:2: ( ( (lv_left_0_0= ruleEvent ) ) otherlv_1= 'inhibit' ( (lv_right_2_0= ruleConditionalEvent ) ) )
            // InternalFaultTree.g:416:3: ( (lv_left_0_0= ruleEvent ) ) otherlv_1= 'inhibit' ( (lv_right_2_0= ruleConditionalEvent ) )
            {
            // InternalFaultTree.g:416:3: ( (lv_left_0_0= ruleEvent ) )
            // InternalFaultTree.g:417:4: (lv_left_0_0= ruleEvent )
            {
            // InternalFaultTree.g:417:4: (lv_left_0_0= ruleEvent )
            // InternalFaultTree.g:418:5: lv_left_0_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getInhibitGateAccess().getLeftEventParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_left_0_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInhibitGateRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.osarenogae.fta.FaultTree.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInhibitGateAccess().getInhibitKeyword_1());
            		
            // InternalFaultTree.g:439:3: ( (lv_right_2_0= ruleConditionalEvent ) )
            // InternalFaultTree.g:440:4: (lv_right_2_0= ruleConditionalEvent )
            {
            // InternalFaultTree.g:440:4: (lv_right_2_0= ruleConditionalEvent )
            // InternalFaultTree.g:441:5: lv_right_2_0= ruleConditionalEvent
            {

            					newCompositeNode(grammarAccess.getInhibitGateAccess().getRightConditionalEventParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleConditionalEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInhibitGateRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.osarenogae.fta.FaultTree.ConditionalEvent");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleInhibitGate"


    // $ANTLR start "entryRuleEvent"
    // InternalFaultTree.g:462:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalFaultTree.g:462:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalFaultTree.g:463:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalFaultTree.g:469:1: ruleEvent returns [EObject current=null] : (this_BasicEvent_0= ruleBasicEvent | this_ExternalEvent_1= ruleExternalEvent | this_ConditionalEvent_2= ruleConditionalEvent | this_IntermediateEvent_3= ruleIntermediateEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_BasicEvent_0 = null;

        EObject this_ExternalEvent_1 = null;

        EObject this_ConditionalEvent_2 = null;

        EObject this_IntermediateEvent_3 = null;



        	enterRule();

        try {
            // InternalFaultTree.g:475:2: ( (this_BasicEvent_0= ruleBasicEvent | this_ExternalEvent_1= ruleExternalEvent | this_ConditionalEvent_2= ruleConditionalEvent | this_IntermediateEvent_3= ruleIntermediateEvent ) )
            // InternalFaultTree.g:476:2: (this_BasicEvent_0= ruleBasicEvent | this_ExternalEvent_1= ruleExternalEvent | this_ConditionalEvent_2= ruleConditionalEvent | this_IntermediateEvent_3= ruleIntermediateEvent )
            {
            // InternalFaultTree.g:476:2: (this_BasicEvent_0= ruleBasicEvent | this_ExternalEvent_1= ruleExternalEvent | this_ConditionalEvent_2= ruleConditionalEvent | this_IntermediateEvent_3= ruleIntermediateEvent )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFaultTree.g:477:3: this_BasicEvent_0= ruleBasicEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getBasicEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicEvent_0=ruleBasicEvent();

                    state._fsp--;


                    			current = this_BasicEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFaultTree.g:486:3: this_ExternalEvent_1= ruleExternalEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getExternalEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalEvent_1=ruleExternalEvent();

                    state._fsp--;


                    			current = this_ExternalEvent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFaultTree.g:495:3: this_ConditionalEvent_2= ruleConditionalEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getConditionalEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalEvent_2=ruleConditionalEvent();

                    state._fsp--;


                    			current = this_ConditionalEvent_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFaultTree.g:504:3: this_IntermediateEvent_3= ruleIntermediateEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getIntermediateEventParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntermediateEvent_3=ruleIntermediateEvent();

                    state._fsp--;


                    			current = this_IntermediateEvent_3;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleIntermediateEvent"
    // InternalFaultTree.g:516:1: entryRuleIntermediateEvent returns [EObject current=null] : iv_ruleIntermediateEvent= ruleIntermediateEvent EOF ;
    public final EObject entryRuleIntermediateEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntermediateEvent = null;


        try {
            // InternalFaultTree.g:516:58: (iv_ruleIntermediateEvent= ruleIntermediateEvent EOF )
            // InternalFaultTree.g:517:2: iv_ruleIntermediateEvent= ruleIntermediateEvent EOF
            {
             newCompositeNode(grammarAccess.getIntermediateEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntermediateEvent=ruleIntermediateEvent();

            state._fsp--;

             current =iv_ruleIntermediateEvent; 
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
    // $ANTLR end "entryRuleIntermediateEvent"


    // $ANTLR start "ruleIntermediateEvent"
    // InternalFaultTree.g:523:1: ruleIntermediateEvent returns [EObject current=null] : (otherlv_0= 'intermediate' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIntermediateEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalFaultTree.g:529:2: ( (otherlv_0= 'intermediate' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFaultTree.g:530:2: (otherlv_0= 'intermediate' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFaultTree.g:530:2: (otherlv_0= 'intermediate' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFaultTree.g:531:3: otherlv_0= 'intermediate' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIntermediateEventAccess().getIntermediateKeyword_0());
            		
            // InternalFaultTree.g:535:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFaultTree.g:536:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFaultTree.g:536:4: (lv_name_1_0= RULE_ID )
            // InternalFaultTree.g:537:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntermediateEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntermediateEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleIntermediateEvent"


    // $ANTLR start "entryRuleBasicEvent"
    // InternalFaultTree.g:557:1: entryRuleBasicEvent returns [EObject current=null] : iv_ruleBasicEvent= ruleBasicEvent EOF ;
    public final EObject entryRuleBasicEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicEvent = null;


        try {
            // InternalFaultTree.g:557:51: (iv_ruleBasicEvent= ruleBasicEvent EOF )
            // InternalFaultTree.g:558:2: iv_ruleBasicEvent= ruleBasicEvent EOF
            {
             newCompositeNode(grammarAccess.getBasicEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicEvent=ruleBasicEvent();

            state._fsp--;

             current =iv_ruleBasicEvent; 
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
    // $ANTLR end "entryRuleBasicEvent"


    // $ANTLR start "ruleBasicEvent"
    // InternalFaultTree.g:564:1: ruleBasicEvent returns [EObject current=null] : (otherlv_0= 'basic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleBasicEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalFaultTree.g:570:2: ( (otherlv_0= 'basic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) )
            // InternalFaultTree.g:571:2: (otherlv_0= 'basic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // InternalFaultTree.g:571:2: (otherlv_0= 'basic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            // InternalFaultTree.g:572:3: otherlv_0= 'basic' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBasicEventAccess().getBasicKeyword_0());
            		
            // InternalFaultTree.g:576:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFaultTree.g:577:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFaultTree.g:577:4: (lv_name_1_0= RULE_ID )
            // InternalFaultTree.g:578:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBasicEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBasicEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFaultTree.g:594:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFaultTree.g:595:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalFaultTree.g:595:4: (lv_description_2_0= RULE_STRING )
                    // InternalFaultTree.g:596:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getBasicEventAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicEventRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleBasicEvent"


    // $ANTLR start "entryRuleConditionalEvent"
    // InternalFaultTree.g:616:1: entryRuleConditionalEvent returns [EObject current=null] : iv_ruleConditionalEvent= ruleConditionalEvent EOF ;
    public final EObject entryRuleConditionalEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalEvent = null;


        try {
            // InternalFaultTree.g:616:57: (iv_ruleConditionalEvent= ruleConditionalEvent EOF )
            // InternalFaultTree.g:617:2: iv_ruleConditionalEvent= ruleConditionalEvent EOF
            {
             newCompositeNode(grammarAccess.getConditionalEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalEvent=ruleConditionalEvent();

            state._fsp--;

             current =iv_ruleConditionalEvent; 
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
    // $ANTLR end "entryRuleConditionalEvent"


    // $ANTLR start "ruleConditionalEvent"
    // InternalFaultTree.g:623:1: ruleConditionalEvent returns [EObject current=null] : (otherlv_0= 'conditional' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleConditionalEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalFaultTree.g:629:2: ( (otherlv_0= 'conditional' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) )
            // InternalFaultTree.g:630:2: (otherlv_0= 'conditional' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // InternalFaultTree.g:630:2: (otherlv_0= 'conditional' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            // InternalFaultTree.g:631:3: otherlv_0= 'conditional' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalEventAccess().getConditionalKeyword_0());
            		
            // InternalFaultTree.g:635:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFaultTree.g:636:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFaultTree.g:636:4: (lv_name_1_0= RULE_ID )
            // InternalFaultTree.g:637:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConditionalEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFaultTree.g:653:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFaultTree.g:654:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalFaultTree.g:654:4: (lv_description_2_0= RULE_STRING )
                    // InternalFaultTree.g:655:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getConditionalEventAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionalEventRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleConditionalEvent"


    // $ANTLR start "entryRuleExternalEvent"
    // InternalFaultTree.g:675:1: entryRuleExternalEvent returns [EObject current=null] : iv_ruleExternalEvent= ruleExternalEvent EOF ;
    public final EObject entryRuleExternalEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalEvent = null;


        try {
            // InternalFaultTree.g:675:54: (iv_ruleExternalEvent= ruleExternalEvent EOF )
            // InternalFaultTree.g:676:2: iv_ruleExternalEvent= ruleExternalEvent EOF
            {
             newCompositeNode(grammarAccess.getExternalEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalEvent=ruleExternalEvent();

            state._fsp--;

             current =iv_ruleExternalEvent; 
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
    // $ANTLR end "entryRuleExternalEvent"


    // $ANTLR start "ruleExternalEvent"
    // InternalFaultTree.g:682:1: ruleExternalEvent returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleExternalEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalFaultTree.g:688:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? ) )
            // InternalFaultTree.g:689:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // InternalFaultTree.g:689:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? )
            // InternalFaultTree.g:690:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalEventAccess().getExternalKeyword_0());
            		
            // InternalFaultTree.g:694:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFaultTree.g:695:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFaultTree.g:695:4: (lv_name_1_0= RULE_ID )
            // InternalFaultTree.g:696:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFaultTree.g:712:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFaultTree.g:713:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalFaultTree.g:713:4: (lv_description_2_0= RULE_STRING )
                    // InternalFaultTree.g:714:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getExternalEventAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExternalEventRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleExternalEvent"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\44\uffff";
    static final String dfa_2s = "\5\uffff\5\13\2\uffff\2\13\1\uffff\2\22\17\uffff\2\43\2\uffff";
    static final String dfa_3s = "\1\20\4\4\3\5\2\13\1\22\1\uffff\2\13\1\4\1\5\1\13\1\20\1\uffff\4\4\3\5\2\17\1\22\2\17\1\4\1\5\1\13\2\uffff";
    static final String dfa_4s = "\1\23\4\4\5\17\1\22\1\uffff\2\17\1\4\2\16\1\23\1\uffff\4\4\5\17\1\22\2\17\1\4\2\15\2\uffff";
    static final String dfa_5s = "\13\uffff\1\1\6\uffff\1\4\17\uffff\1\2\1\3";
    static final String dfa_6s = "\44\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\1\1\3\1\2",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11\5\uffff\1\13\3\uffff\1\12",
            "\1\14\5\uffff\1\13\3\uffff\1\12",
            "\1\15\5\uffff\1\13\3\uffff\1\12",
            "\1\13\3\uffff\1\12",
            "\1\13\3\uffff\1\12",
            "\1\16",
            "",
            "\1\13\3\uffff\1\12",
            "\1\13\3\uffff\1\12",
            "\1\17",
            "\1\20\5\uffff\1\22\2\uffff\1\21",
            "\1\22\2\uffff\1\21",
            "\1\26\1\23\1\25\1\24",
            "",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33\11\uffff\1\34",
            "\1\35\11\uffff\1\34",
            "\1\36\11\uffff\1\34",
            "\1\34",
            "\1\34",
            "\1\37",
            "\1\34",
            "\1\34",
            "\1\40",
            "\1\41\5\uffff\1\43\1\uffff\1\42",
            "\1\43\1\uffff\1\42",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "239:2: (this_Event_0= ruleEvent | this_OrGate_1= ruleOrGate | this_AndGate_2= ruleAndGate | this_InhibitGate_3= ruleInhibitGate )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});

}