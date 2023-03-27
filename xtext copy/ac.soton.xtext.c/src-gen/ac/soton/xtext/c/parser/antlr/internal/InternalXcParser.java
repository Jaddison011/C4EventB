package ac.soton.xtext.c.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ac.soton.xtext.c.services.XcGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXcParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CTranslationUnit'", "'{'", "'endname'", "'sourceFiles'", "','", "'}'", "'headerFiles'", "'CSourceFile'", "'subPrograms'", "'globalVariables'", "'types'", "'includeDirectives'", "'CHeaderFile'", "'CSubProgram'", "'parameters'", "'localVariables'", "'body'", "'preconditions'", "'isConstant'", "'CVariable'", "'value'", "'type'", "'CType'", "'CIncludeDirective'", "'header'", "'CParameter'", "'CExpression'", "'expression'", "'CPreCondition'", "'predicate'", "'CFunction'", "'returnType'", "'CProcedure'", "'CArrayVariable'", "'elementType'", "'size'", "'superType'", "'arrayElements'", "'-'", "'CArrayElement'", "'index'", "'CStruct'", "'fields'", "'CField'", "'CEnumeration'", "'enumProperties'", "'CArray'", "'CPointer'", "'CDerivedType'", "'CDiscreteType'", "'CEnumProperties'", "'integralConstant'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
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
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalXcParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXcParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXcParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXc.g"; }



     	private XcGrammarAccess grammarAccess;

        public InternalXcParser(TokenStream input, XcGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CTranslationUnit";
       	}

       	@Override
       	protected XcGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCTranslationUnit"
    // InternalXc.g:64:1: entryRuleCTranslationUnit returns [EObject current=null] : iv_ruleCTranslationUnit= ruleCTranslationUnit EOF ;
    public final EObject entryRuleCTranslationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCTranslationUnit = null;


        try {
            // InternalXc.g:64:57: (iv_ruleCTranslationUnit= ruleCTranslationUnit EOF )
            // InternalXc.g:65:2: iv_ruleCTranslationUnit= ruleCTranslationUnit EOF
            {
             newCompositeNode(grammarAccess.getCTranslationUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCTranslationUnit=ruleCTranslationUnit();

            state._fsp--;

             current =iv_ruleCTranslationUnit; 
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
    // $ANTLR end "entryRuleCTranslationUnit"


    // $ANTLR start "ruleCTranslationUnit"
    // InternalXc.g:71:1: ruleCTranslationUnit returns [EObject current=null] : ( () otherlv_1= 'CTranslationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'sourceFiles' otherlv_7= '{' ( (lv_sourceFiles_8_0= ruleCSourceFile ) ) (otherlv_9= ',' ( (lv_sourceFiles_10_0= ruleCSourceFile ) ) )* otherlv_11= '}' )? (otherlv_12= 'headerFiles' otherlv_13= '{' ( (lv_headerFiles_14_0= ruleCHeaderFile ) ) (otherlv_15= ',' ( (lv_headerFiles_16_0= ruleCHeaderFile ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleCTranslationUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        EObject lv_sourceFiles_8_0 = null;

        EObject lv_sourceFiles_10_0 = null;

        EObject lv_headerFiles_14_0 = null;

        EObject lv_headerFiles_16_0 = null;



        	enterRule();

        try {
            // InternalXc.g:77:2: ( ( () otherlv_1= 'CTranslationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'sourceFiles' otherlv_7= '{' ( (lv_sourceFiles_8_0= ruleCSourceFile ) ) (otherlv_9= ',' ( (lv_sourceFiles_10_0= ruleCSourceFile ) ) )* otherlv_11= '}' )? (otherlv_12= 'headerFiles' otherlv_13= '{' ( (lv_headerFiles_14_0= ruleCHeaderFile ) ) (otherlv_15= ',' ( (lv_headerFiles_16_0= ruleCHeaderFile ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalXc.g:78:2: ( () otherlv_1= 'CTranslationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'sourceFiles' otherlv_7= '{' ( (lv_sourceFiles_8_0= ruleCSourceFile ) ) (otherlv_9= ',' ( (lv_sourceFiles_10_0= ruleCSourceFile ) ) )* otherlv_11= '}' )? (otherlv_12= 'headerFiles' otherlv_13= '{' ( (lv_headerFiles_14_0= ruleCHeaderFile ) ) (otherlv_15= ',' ( (lv_headerFiles_16_0= ruleCHeaderFile ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalXc.g:78:2: ( () otherlv_1= 'CTranslationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'sourceFiles' otherlv_7= '{' ( (lv_sourceFiles_8_0= ruleCSourceFile ) ) (otherlv_9= ',' ( (lv_sourceFiles_10_0= ruleCSourceFile ) ) )* otherlv_11= '}' )? (otherlv_12= 'headerFiles' otherlv_13= '{' ( (lv_headerFiles_14_0= ruleCHeaderFile ) ) (otherlv_15= ',' ( (lv_headerFiles_16_0= ruleCHeaderFile ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalXc.g:79:3: () otherlv_1= 'CTranslationUnit' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'sourceFiles' otherlv_7= '{' ( (lv_sourceFiles_8_0= ruleCSourceFile ) ) (otherlv_9= ',' ( (lv_sourceFiles_10_0= ruleCSourceFile ) ) )* otherlv_11= '}' )? (otherlv_12= 'headerFiles' otherlv_13= '{' ( (lv_headerFiles_14_0= ruleCHeaderFile ) ) (otherlv_15= ',' ( (lv_headerFiles_16_0= ruleCHeaderFile ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalXc.g:79:3: ()
            // InternalXc.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCTranslationUnitAccess().getCTranslationUnitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCTranslationUnitAccess().getCTranslationUnitKeyword_1());
            		
            // InternalXc.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:91:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCTranslationUnitAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCTranslationUnitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCTranslationUnitAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:113:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXc.g:114:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCTranslationUnitAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:118:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:119:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:119:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:120:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCTranslationUnitAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCTranslationUnitRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:138:3: (otherlv_6= 'sourceFiles' otherlv_7= '{' ( (lv_sourceFiles_8_0= ruleCSourceFile ) ) (otherlv_9= ',' ( (lv_sourceFiles_10_0= ruleCSourceFile ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXc.g:139:4: otherlv_6= 'sourceFiles' otherlv_7= '{' ( (lv_sourceFiles_8_0= ruleCSourceFile ) ) (otherlv_9= ',' ( (lv_sourceFiles_10_0= ruleCSourceFile ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCTranslationUnitAccess().getSourceFilesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getCTranslationUnitAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalXc.g:147:4: ( (lv_sourceFiles_8_0= ruleCSourceFile ) )
                    // InternalXc.g:148:5: (lv_sourceFiles_8_0= ruleCSourceFile )
                    {
                    // InternalXc.g:148:5: (lv_sourceFiles_8_0= ruleCSourceFile )
                    // InternalXc.g:149:6: lv_sourceFiles_8_0= ruleCSourceFile
                    {

                    						newCompositeNode(grammarAccess.getCTranslationUnitAccess().getSourceFilesCSourceFileParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_sourceFiles_8_0=ruleCSourceFile();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCTranslationUnitRule());
                    						}
                    						add(
                    							current,
                    							"sourceFiles",
                    							lv_sourceFiles_8_0,
                    							"ac.soton.xtext.c.Xc.CSourceFile");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:166:4: (otherlv_9= ',' ( (lv_sourceFiles_10_0= ruleCSourceFile ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalXc.g:167:5: otherlv_9= ',' ( (lv_sourceFiles_10_0= ruleCSourceFile ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCTranslationUnitAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXc.g:171:5: ( (lv_sourceFiles_10_0= ruleCSourceFile ) )
                    	    // InternalXc.g:172:6: (lv_sourceFiles_10_0= ruleCSourceFile )
                    	    {
                    	    // InternalXc.g:172:6: (lv_sourceFiles_10_0= ruleCSourceFile )
                    	    // InternalXc.g:173:7: lv_sourceFiles_10_0= ruleCSourceFile
                    	    {

                    	    							newCompositeNode(grammarAccess.getCTranslationUnitAccess().getSourceFilesCSourceFileParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_sourceFiles_10_0=ruleCSourceFile();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCTranslationUnitRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sourceFiles",
                    	    								lv_sourceFiles_10_0,
                    	    								"ac.soton.xtext.c.Xc.CSourceFile");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getCTranslationUnitAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:196:3: (otherlv_12= 'headerFiles' otherlv_13= '{' ( (lv_headerFiles_14_0= ruleCHeaderFile ) ) (otherlv_15= ',' ( (lv_headerFiles_16_0= ruleCHeaderFile ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXc.g:197:4: otherlv_12= 'headerFiles' otherlv_13= '{' ( (lv_headerFiles_14_0= ruleCHeaderFile ) ) (otherlv_15= ',' ( (lv_headerFiles_16_0= ruleCHeaderFile ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getCTranslationUnitAccess().getHeaderFilesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getCTranslationUnitAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalXc.g:205:4: ( (lv_headerFiles_14_0= ruleCHeaderFile ) )
                    // InternalXc.g:206:5: (lv_headerFiles_14_0= ruleCHeaderFile )
                    {
                    // InternalXc.g:206:5: (lv_headerFiles_14_0= ruleCHeaderFile )
                    // InternalXc.g:207:6: lv_headerFiles_14_0= ruleCHeaderFile
                    {

                    						newCompositeNode(grammarAccess.getCTranslationUnitAccess().getHeaderFilesCHeaderFileParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_headerFiles_14_0=ruleCHeaderFile();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCTranslationUnitRule());
                    						}
                    						add(
                    							current,
                    							"headerFiles",
                    							lv_headerFiles_14_0,
                    							"ac.soton.xtext.c.Xc.CHeaderFile");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:224:4: (otherlv_15= ',' ( (lv_headerFiles_16_0= ruleCHeaderFile ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalXc.g:225:5: otherlv_15= ',' ( (lv_headerFiles_16_0= ruleCHeaderFile ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCTranslationUnitAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXc.g:229:5: ( (lv_headerFiles_16_0= ruleCHeaderFile ) )
                    	    // InternalXc.g:230:6: (lv_headerFiles_16_0= ruleCHeaderFile )
                    	    {
                    	    // InternalXc.g:230:6: (lv_headerFiles_16_0= ruleCHeaderFile )
                    	    // InternalXc.g:231:7: lv_headerFiles_16_0= ruleCHeaderFile
                    	    {

                    	    							newCompositeNode(grammarAccess.getCTranslationUnitAccess().getHeaderFilesCHeaderFileParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_headerFiles_16_0=ruleCHeaderFile();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCTranslationUnitRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"headerFiles",
                    	    								lv_headerFiles_16_0,
                    	    								"ac.soton.xtext.c.Xc.CHeaderFile");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getCTranslationUnitAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getCTranslationUnitAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleCTranslationUnit"


    // $ANTLR start "entryRuleCSubProgram"
    // InternalXc.g:262:1: entryRuleCSubProgram returns [EObject current=null] : iv_ruleCSubProgram= ruleCSubProgram EOF ;
    public final EObject entryRuleCSubProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSubProgram = null;


        try {
            // InternalXc.g:262:52: (iv_ruleCSubProgram= ruleCSubProgram EOF )
            // InternalXc.g:263:2: iv_ruleCSubProgram= ruleCSubProgram EOF
            {
             newCompositeNode(grammarAccess.getCSubProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSubProgram=ruleCSubProgram();

            state._fsp--;

             current =iv_ruleCSubProgram; 
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
    // $ANTLR end "entryRuleCSubProgram"


    // $ANTLR start "ruleCSubProgram"
    // InternalXc.g:269:1: ruleCSubProgram returns [EObject current=null] : (this_CSubProgram_Impl_0= ruleCSubProgram_Impl | this_CFunction_1= ruleCFunction | this_CProcedure_2= ruleCProcedure ) ;
    public final EObject ruleCSubProgram() throws RecognitionException {
        EObject current = null;

        EObject this_CSubProgram_Impl_0 = null;

        EObject this_CFunction_1 = null;

        EObject this_CProcedure_2 = null;



        	enterRule();

        try {
            // InternalXc.g:275:2: ( (this_CSubProgram_Impl_0= ruleCSubProgram_Impl | this_CFunction_1= ruleCFunction | this_CProcedure_2= ruleCProcedure ) )
            // InternalXc.g:276:2: (this_CSubProgram_Impl_0= ruleCSubProgram_Impl | this_CFunction_1= ruleCFunction | this_CProcedure_2= ruleCProcedure )
            {
            // InternalXc.g:276:2: (this_CSubProgram_Impl_0= ruleCSubProgram_Impl | this_CFunction_1= ruleCFunction | this_CProcedure_2= ruleCProcedure )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 43:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXc.g:277:3: this_CSubProgram_Impl_0= ruleCSubProgram_Impl
                    {

                    			newCompositeNode(grammarAccess.getCSubProgramAccess().getCSubProgram_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CSubProgram_Impl_0=ruleCSubProgram_Impl();

                    state._fsp--;


                    			current = this_CSubProgram_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXc.g:286:3: this_CFunction_1= ruleCFunction
                    {

                    			newCompositeNode(grammarAccess.getCSubProgramAccess().getCFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CFunction_1=ruleCFunction();

                    state._fsp--;


                    			current = this_CFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXc.g:295:3: this_CProcedure_2= ruleCProcedure
                    {

                    			newCompositeNode(grammarAccess.getCSubProgramAccess().getCProcedureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CProcedure_2=ruleCProcedure();

                    state._fsp--;


                    			current = this_CProcedure_2;
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
    // $ANTLR end "ruleCSubProgram"


    // $ANTLR start "entryRuleCVariable"
    // InternalXc.g:307:1: entryRuleCVariable returns [EObject current=null] : iv_ruleCVariable= ruleCVariable EOF ;
    public final EObject entryRuleCVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCVariable = null;


        try {
            // InternalXc.g:307:50: (iv_ruleCVariable= ruleCVariable EOF )
            // InternalXc.g:308:2: iv_ruleCVariable= ruleCVariable EOF
            {
             newCompositeNode(grammarAccess.getCVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCVariable=ruleCVariable();

            state._fsp--;

             current =iv_ruleCVariable; 
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
    // $ANTLR end "entryRuleCVariable"


    // $ANTLR start "ruleCVariable"
    // InternalXc.g:314:1: ruleCVariable returns [EObject current=null] : (this_CVariable_Impl_0= ruleCVariable_Impl | this_CArrayVariable_1= ruleCArrayVariable ) ;
    public final EObject ruleCVariable() throws RecognitionException {
        EObject current = null;

        EObject this_CVariable_Impl_0 = null;

        EObject this_CArrayVariable_1 = null;



        	enterRule();

        try {
            // InternalXc.g:320:2: ( (this_CVariable_Impl_0= ruleCVariable_Impl | this_CArrayVariable_1= ruleCArrayVariable ) )
            // InternalXc.g:321:2: (this_CVariable_Impl_0= ruleCVariable_Impl | this_CArrayVariable_1= ruleCArrayVariable )
            {
            // InternalXc.g:321:2: (this_CVariable_Impl_0= ruleCVariable_Impl | this_CArrayVariable_1= ruleCArrayVariable )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 29:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==30) ) {
                    alt7=1;
                }
                else if ( (LA7_1==44) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt7=1;
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXc.g:322:3: this_CVariable_Impl_0= ruleCVariable_Impl
                    {

                    			newCompositeNode(grammarAccess.getCVariableAccess().getCVariable_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CVariable_Impl_0=ruleCVariable_Impl();

                    state._fsp--;


                    			current = this_CVariable_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXc.g:331:3: this_CArrayVariable_1= ruleCArrayVariable
                    {

                    			newCompositeNode(grammarAccess.getCVariableAccess().getCArrayVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CArrayVariable_1=ruleCArrayVariable();

                    state._fsp--;


                    			current = this_CArrayVariable_1;
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
    // $ANTLR end "ruleCVariable"


    // $ANTLR start "entryRuleCType"
    // InternalXc.g:343:1: entryRuleCType returns [EObject current=null] : iv_ruleCType= ruleCType EOF ;
    public final EObject entryRuleCType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCType = null;


        try {
            // InternalXc.g:343:46: (iv_ruleCType= ruleCType EOF )
            // InternalXc.g:344:2: iv_ruleCType= ruleCType EOF
            {
             newCompositeNode(grammarAccess.getCTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCType=ruleCType();

            state._fsp--;

             current =iv_ruleCType; 
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
    // $ANTLR end "entryRuleCType"


    // $ANTLR start "ruleCType"
    // InternalXc.g:350:1: ruleCType returns [EObject current=null] : (this_CType_Impl_0= ruleCType_Impl | this_CStruct_1= ruleCStruct | this_CField_2= ruleCField | this_CEnumeration_3= ruleCEnumeration | this_CArray_Impl_4= ruleCArray_Impl | this_CPointer_5= ruleCPointer | this_CDerivedType_Impl_6= ruleCDerivedType_Impl | this_CDiscreteType_Impl_7= ruleCDiscreteType_Impl | this_CArrayVariable_8= ruleCArrayVariable ) ;
    public final EObject ruleCType() throws RecognitionException {
        EObject current = null;

        EObject this_CType_Impl_0 = null;

        EObject this_CStruct_1 = null;

        EObject this_CField_2 = null;

        EObject this_CEnumeration_3 = null;

        EObject this_CArray_Impl_4 = null;

        EObject this_CPointer_5 = null;

        EObject this_CDerivedType_Impl_6 = null;

        EObject this_CDiscreteType_Impl_7 = null;

        EObject this_CArrayVariable_8 = null;



        	enterRule();

        try {
            // InternalXc.g:356:2: ( (this_CType_Impl_0= ruleCType_Impl | this_CStruct_1= ruleCStruct | this_CField_2= ruleCField | this_CEnumeration_3= ruleCEnumeration | this_CArray_Impl_4= ruleCArray_Impl | this_CPointer_5= ruleCPointer | this_CDerivedType_Impl_6= ruleCDerivedType_Impl | this_CDiscreteType_Impl_7= ruleCDiscreteType_Impl | this_CArrayVariable_8= ruleCArrayVariable ) )
            // InternalXc.g:357:2: (this_CType_Impl_0= ruleCType_Impl | this_CStruct_1= ruleCStruct | this_CField_2= ruleCField | this_CEnumeration_3= ruleCEnumeration | this_CArray_Impl_4= ruleCArray_Impl | this_CPointer_5= ruleCPointer | this_CDerivedType_Impl_6= ruleCDerivedType_Impl | this_CDiscreteType_Impl_7= ruleCDiscreteType_Impl | this_CArrayVariable_8= ruleCArrayVariable )
            {
            // InternalXc.g:357:2: (this_CType_Impl_0= ruleCType_Impl | this_CStruct_1= ruleCStruct | this_CField_2= ruleCField | this_CEnumeration_3= ruleCEnumeration | this_CArray_Impl_4= ruleCArray_Impl | this_CPointer_5= ruleCPointer | this_CDerivedType_Impl_6= ruleCDerivedType_Impl | this_CDiscreteType_Impl_7= ruleCDiscreteType_Impl | this_CArrayVariable_8= ruleCArrayVariable )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 52:
                {
                alt8=2;
                }
                break;
            case 54:
                {
                alt8=3;
                }
                break;
            case 55:
                {
                alt8=4;
                }
                break;
            case 57:
                {
                alt8=5;
                }
                break;
            case 58:
                {
                alt8=6;
                }
                break;
            case 59:
                {
                alt8=7;
                }
                break;
            case 60:
                {
                alt8=8;
                }
                break;
            case 29:
            case 44:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXc.g:358:3: this_CType_Impl_0= ruleCType_Impl
                    {

                    			newCompositeNode(grammarAccess.getCTypeAccess().getCType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CType_Impl_0=ruleCType_Impl();

                    state._fsp--;


                    			current = this_CType_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXc.g:367:3: this_CStruct_1= ruleCStruct
                    {

                    			newCompositeNode(grammarAccess.getCTypeAccess().getCStructParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CStruct_1=ruleCStruct();

                    state._fsp--;


                    			current = this_CStruct_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXc.g:376:3: this_CField_2= ruleCField
                    {

                    			newCompositeNode(grammarAccess.getCTypeAccess().getCFieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CField_2=ruleCField();

                    state._fsp--;


                    			current = this_CField_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXc.g:385:3: this_CEnumeration_3= ruleCEnumeration
                    {

                    			newCompositeNode(grammarAccess.getCTypeAccess().getCEnumerationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CEnumeration_3=ruleCEnumeration();

                    state._fsp--;


                    			current = this_CEnumeration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXc.g:394:3: this_CArray_Impl_4= ruleCArray_Impl
                    {

                    			newCompositeNode(grammarAccess.getCTypeAccess().getCArray_ImplParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CArray_Impl_4=ruleCArray_Impl();

                    state._fsp--;


                    			current = this_CArray_Impl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXc.g:403:3: this_CPointer_5= ruleCPointer
                    {

                    			newCompositeNode(grammarAccess.getCTypeAccess().getCPointerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CPointer_5=ruleCPointer();

                    state._fsp--;


                    			current = this_CPointer_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXc.g:412:3: this_CDerivedType_Impl_6= ruleCDerivedType_Impl
                    {

                    			newCompositeNode(grammarAccess.getCTypeAccess().getCDerivedType_ImplParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_CDerivedType_Impl_6=ruleCDerivedType_Impl();

                    state._fsp--;


                    			current = this_CDerivedType_Impl_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalXc.g:421:3: this_CDiscreteType_Impl_7= ruleCDiscreteType_Impl
                    {

                    			newCompositeNode(grammarAccess.getCTypeAccess().getCDiscreteType_ImplParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_CDiscreteType_Impl_7=ruleCDiscreteType_Impl();

                    state._fsp--;


                    			current = this_CDiscreteType_Impl_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalXc.g:430:3: this_CArrayVariable_8= ruleCArrayVariable
                    {

                    			newCompositeNode(grammarAccess.getCTypeAccess().getCArrayVariableParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_CArrayVariable_8=ruleCArrayVariable();

                    state._fsp--;


                    			current = this_CArrayVariable_8;
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
    // $ANTLR end "ruleCType"


    // $ANTLR start "entryRuleCExpression"
    // InternalXc.g:442:1: entryRuleCExpression returns [EObject current=null] : iv_ruleCExpression= ruleCExpression EOF ;
    public final EObject entryRuleCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCExpression = null;


        try {
            // InternalXc.g:442:52: (iv_ruleCExpression= ruleCExpression EOF )
            // InternalXc.g:443:2: iv_ruleCExpression= ruleCExpression EOF
            {
             newCompositeNode(grammarAccess.getCExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCExpression=ruleCExpression();

            state._fsp--;

             current =iv_ruleCExpression; 
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
    // $ANTLR end "entryRuleCExpression"


    // $ANTLR start "ruleCExpression"
    // InternalXc.g:449:1: ruleCExpression returns [EObject current=null] : (this_CExpression_Impl_0= ruleCExpression_Impl | this_CPreCondition_1= ruleCPreCondition ) ;
    public final EObject ruleCExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CExpression_Impl_0 = null;

        EObject this_CPreCondition_1 = null;



        	enterRule();

        try {
            // InternalXc.g:455:2: ( (this_CExpression_Impl_0= ruleCExpression_Impl | this_CPreCondition_1= ruleCPreCondition ) )
            // InternalXc.g:456:2: (this_CExpression_Impl_0= ruleCExpression_Impl | this_CPreCondition_1= ruleCPreCondition )
            {
            // InternalXc.g:456:2: (this_CExpression_Impl_0= ruleCExpression_Impl | this_CPreCondition_1= ruleCPreCondition )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            else if ( (LA9_0==39) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXc.g:457:3: this_CExpression_Impl_0= ruleCExpression_Impl
                    {

                    			newCompositeNode(grammarAccess.getCExpressionAccess().getCExpression_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CExpression_Impl_0=ruleCExpression_Impl();

                    state._fsp--;


                    			current = this_CExpression_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXc.g:466:3: this_CPreCondition_1= ruleCPreCondition
                    {

                    			newCompositeNode(grammarAccess.getCExpressionAccess().getCPreConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CPreCondition_1=ruleCPreCondition();

                    state._fsp--;


                    			current = this_CPreCondition_1;
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
    // $ANTLR end "ruleCExpression"


    // $ANTLR start "entryRuleEString"
    // InternalXc.g:478:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXc.g:478:47: (iv_ruleEString= ruleEString EOF )
            // InternalXc.g:479:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXc.g:485:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXc.g:491:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXc.g:492:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXc.g:492:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXc.g:493:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXc.g:501:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCSourceFile"
    // InternalXc.g:512:1: entryRuleCSourceFile returns [EObject current=null] : iv_ruleCSourceFile= ruleCSourceFile EOF ;
    public final EObject entryRuleCSourceFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSourceFile = null;


        try {
            // InternalXc.g:512:52: (iv_ruleCSourceFile= ruleCSourceFile EOF )
            // InternalXc.g:513:2: iv_ruleCSourceFile= ruleCSourceFile EOF
            {
             newCompositeNode(grammarAccess.getCSourceFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSourceFile=ruleCSourceFile();

            state._fsp--;

             current =iv_ruleCSourceFile; 
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
    // $ANTLR end "entryRuleCSourceFile"


    // $ANTLR start "ruleCSourceFile"
    // InternalXc.g:519:1: ruleCSourceFile returns [EObject current=null] : ( () otherlv_1= 'CSourceFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )? (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )? (otherlv_24= 'includeDirectives' otherlv_25= '{' ( (lv_includeDirectives_26_0= ruleCIncludeDirective ) ) (otherlv_27= ',' ( (lv_includeDirectives_28_0= ruleCIncludeDirective ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleCSourceFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        EObject lv_subPrograms_8_0 = null;

        EObject lv_subPrograms_10_0 = null;

        EObject lv_globalVariables_14_0 = null;

        EObject lv_globalVariables_16_0 = null;

        EObject lv_types_20_0 = null;

        EObject lv_types_22_0 = null;

        EObject lv_includeDirectives_26_0 = null;

        EObject lv_includeDirectives_28_0 = null;



        	enterRule();

        try {
            // InternalXc.g:525:2: ( ( () otherlv_1= 'CSourceFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )? (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )? (otherlv_24= 'includeDirectives' otherlv_25= '{' ( (lv_includeDirectives_26_0= ruleCIncludeDirective ) ) (otherlv_27= ',' ( (lv_includeDirectives_28_0= ruleCIncludeDirective ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalXc.g:526:2: ( () otherlv_1= 'CSourceFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )? (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )? (otherlv_24= 'includeDirectives' otherlv_25= '{' ( (lv_includeDirectives_26_0= ruleCIncludeDirective ) ) (otherlv_27= ',' ( (lv_includeDirectives_28_0= ruleCIncludeDirective ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalXc.g:526:2: ( () otherlv_1= 'CSourceFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )? (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )? (otherlv_24= 'includeDirectives' otherlv_25= '{' ( (lv_includeDirectives_26_0= ruleCIncludeDirective ) ) (otherlv_27= ',' ( (lv_includeDirectives_28_0= ruleCIncludeDirective ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalXc.g:527:3: () otherlv_1= 'CSourceFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )? (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )? (otherlv_24= 'includeDirectives' otherlv_25= '{' ( (lv_includeDirectives_26_0= ruleCIncludeDirective ) ) (otherlv_27= ',' ( (lv_includeDirectives_28_0= ruleCIncludeDirective ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // InternalXc.g:527:3: ()
            // InternalXc.g:528:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCSourceFileAccess().getCSourceFileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCSourceFileAccess().getCSourceFileKeyword_1());
            		
            // InternalXc.g:538:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:539:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:539:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:540:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCSourceFileAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCSourceFileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getCSourceFileAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:561:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXc.g:562:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCSourceFileAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:566:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:567:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:567:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:568:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCSourceFileAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCSourceFileRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:586:3: (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXc.g:587:4: otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCSourceFileAccess().getSubProgramsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getCSourceFileAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalXc.g:595:4: ( (lv_subPrograms_8_0= ruleCSubProgram ) )
                    // InternalXc.g:596:5: (lv_subPrograms_8_0= ruleCSubProgram )
                    {
                    // InternalXc.g:596:5: (lv_subPrograms_8_0= ruleCSubProgram )
                    // InternalXc.g:597:6: lv_subPrograms_8_0= ruleCSubProgram
                    {

                    						newCompositeNode(grammarAccess.getCSourceFileAccess().getSubProgramsCSubProgramParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_subPrograms_8_0=ruleCSubProgram();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCSourceFileRule());
                    						}
                    						add(
                    							current,
                    							"subPrograms",
                    							lv_subPrograms_8_0,
                    							"ac.soton.xtext.c.Xc.CSubProgram");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:614:4: (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalXc.g:615:5: otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCSourceFileAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXc.g:619:5: ( (lv_subPrograms_10_0= ruleCSubProgram ) )
                    	    // InternalXc.g:620:6: (lv_subPrograms_10_0= ruleCSubProgram )
                    	    {
                    	    // InternalXc.g:620:6: (lv_subPrograms_10_0= ruleCSubProgram )
                    	    // InternalXc.g:621:7: lv_subPrograms_10_0= ruleCSubProgram
                    	    {

                    	    							newCompositeNode(grammarAccess.getCSourceFileAccess().getSubProgramsCSubProgramParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_subPrograms_10_0=ruleCSubProgram();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCSourceFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subPrograms",
                    	    								lv_subPrograms_10_0,
                    	    								"ac.soton.xtext.c.Xc.CSubProgram");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getCSourceFileAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:644:3: (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXc.g:645:4: otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getCSourceFileAccess().getGlobalVariablesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getCSourceFileAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalXc.g:653:4: ( (lv_globalVariables_14_0= ruleCVariable ) )
                    // InternalXc.g:654:5: (lv_globalVariables_14_0= ruleCVariable )
                    {
                    // InternalXc.g:654:5: (lv_globalVariables_14_0= ruleCVariable )
                    // InternalXc.g:655:6: lv_globalVariables_14_0= ruleCVariable
                    {

                    						newCompositeNode(grammarAccess.getCSourceFileAccess().getGlobalVariablesCVariableParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_globalVariables_14_0=ruleCVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCSourceFileRule());
                    						}
                    						add(
                    							current,
                    							"globalVariables",
                    							lv_globalVariables_14_0,
                    							"ac.soton.xtext.c.Xc.CVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:672:4: (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalXc.g:673:5: otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCSourceFileAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXc.g:677:5: ( (lv_globalVariables_16_0= ruleCVariable ) )
                    	    // InternalXc.g:678:6: (lv_globalVariables_16_0= ruleCVariable )
                    	    {
                    	    // InternalXc.g:678:6: (lv_globalVariables_16_0= ruleCVariable )
                    	    // InternalXc.g:679:7: lv_globalVariables_16_0= ruleCVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getCSourceFileAccess().getGlobalVariablesCVariableParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_globalVariables_16_0=ruleCVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCSourceFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"globalVariables",
                    	    								lv_globalVariables_16_0,
                    	    								"ac.soton.xtext.c.Xc.CVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getCSourceFileAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:702:3: (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXc.g:703:4: otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getCSourceFileAccess().getTypesKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_19, grammarAccess.getCSourceFileAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXc.g:711:4: ( (lv_types_20_0= ruleCType ) )
                    // InternalXc.g:712:5: (lv_types_20_0= ruleCType )
                    {
                    // InternalXc.g:712:5: (lv_types_20_0= ruleCType )
                    // InternalXc.g:713:6: lv_types_20_0= ruleCType
                    {

                    						newCompositeNode(grammarAccess.getCSourceFileAccess().getTypesCTypeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_types_20_0=ruleCType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCSourceFileRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_20_0,
                    							"ac.soton.xtext.c.Xc.CType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:730:4: (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalXc.g:731:5: otherlv_21= ',' ( (lv_types_22_0= ruleCType ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_18); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getCSourceFileAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXc.g:735:5: ( (lv_types_22_0= ruleCType ) )
                    	    // InternalXc.g:736:6: (lv_types_22_0= ruleCType )
                    	    {
                    	    // InternalXc.g:736:6: (lv_types_22_0= ruleCType )
                    	    // InternalXc.g:737:7: lv_types_22_0= ruleCType
                    	    {

                    	    							newCompositeNode(grammarAccess.getCSourceFileAccess().getTypesCTypeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_types_22_0=ruleCType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCSourceFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_22_0,
                    	    								"ac.soton.xtext.c.Xc.CType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_23, grammarAccess.getCSourceFileAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:760:3: (otherlv_24= 'includeDirectives' otherlv_25= '{' ( (lv_includeDirectives_26_0= ruleCIncludeDirective ) ) (otherlv_27= ',' ( (lv_includeDirectives_28_0= ruleCIncludeDirective ) ) )* otherlv_29= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXc.g:761:4: otherlv_24= 'includeDirectives' otherlv_25= '{' ( (lv_includeDirectives_26_0= ruleCIncludeDirective ) ) (otherlv_27= ',' ( (lv_includeDirectives_28_0= ruleCIncludeDirective ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getCSourceFileAccess().getIncludeDirectivesKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_25, grammarAccess.getCSourceFileAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalXc.g:769:4: ( (lv_includeDirectives_26_0= ruleCIncludeDirective ) )
                    // InternalXc.g:770:5: (lv_includeDirectives_26_0= ruleCIncludeDirective )
                    {
                    // InternalXc.g:770:5: (lv_includeDirectives_26_0= ruleCIncludeDirective )
                    // InternalXc.g:771:6: lv_includeDirectives_26_0= ruleCIncludeDirective
                    {

                    						newCompositeNode(grammarAccess.getCSourceFileAccess().getIncludeDirectivesCIncludeDirectiveParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_includeDirectives_26_0=ruleCIncludeDirective();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCSourceFileRule());
                    						}
                    						add(
                    							current,
                    							"includeDirectives",
                    							lv_includeDirectives_26_0,
                    							"ac.soton.xtext.c.Xc.CIncludeDirective");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:788:4: (otherlv_27= ',' ( (lv_includeDirectives_28_0= ruleCIncludeDirective ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalXc.g:789:5: otherlv_27= ',' ( (lv_includeDirectives_28_0= ruleCIncludeDirective ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FOLLOW_20); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getCSourceFileAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalXc.g:793:5: ( (lv_includeDirectives_28_0= ruleCIncludeDirective ) )
                    	    // InternalXc.g:794:6: (lv_includeDirectives_28_0= ruleCIncludeDirective )
                    	    {
                    	    // InternalXc.g:794:6: (lv_includeDirectives_28_0= ruleCIncludeDirective )
                    	    // InternalXc.g:795:7: lv_includeDirectives_28_0= ruleCIncludeDirective
                    	    {

                    	    							newCompositeNode(grammarAccess.getCSourceFileAccess().getIncludeDirectivesCIncludeDirectiveParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_includeDirectives_28_0=ruleCIncludeDirective();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCSourceFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"includeDirectives",
                    	    								lv_includeDirectives_28_0,
                    	    								"ac.soton.xtext.c.Xc.CIncludeDirective");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_29, grammarAccess.getCSourceFileAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getCSourceFileAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCSourceFile"


    // $ANTLR start "entryRuleCHeaderFile"
    // InternalXc.g:826:1: entryRuleCHeaderFile returns [EObject current=null] : iv_ruleCHeaderFile= ruleCHeaderFile EOF ;
    public final EObject entryRuleCHeaderFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHeaderFile = null;


        try {
            // InternalXc.g:826:52: (iv_ruleCHeaderFile= ruleCHeaderFile EOF )
            // InternalXc.g:827:2: iv_ruleCHeaderFile= ruleCHeaderFile EOF
            {
             newCompositeNode(grammarAccess.getCHeaderFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHeaderFile=ruleCHeaderFile();

            state._fsp--;

             current =iv_ruleCHeaderFile; 
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
    // $ANTLR end "entryRuleCHeaderFile"


    // $ANTLR start "ruleCHeaderFile"
    // InternalXc.g:833:1: ruleCHeaderFile returns [EObject current=null] : ( () otherlv_1= 'CHeaderFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )? (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleCHeaderFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        EObject lv_subPrograms_8_0 = null;

        EObject lv_subPrograms_10_0 = null;

        EObject lv_globalVariables_14_0 = null;

        EObject lv_globalVariables_16_0 = null;

        EObject lv_types_20_0 = null;

        EObject lv_types_22_0 = null;



        	enterRule();

        try {
            // InternalXc.g:839:2: ( ( () otherlv_1= 'CHeaderFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )? (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalXc.g:840:2: ( () otherlv_1= 'CHeaderFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )? (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalXc.g:840:2: ( () otherlv_1= 'CHeaderFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )? (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalXc.g:841:3: () otherlv_1= 'CHeaderFile' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )? (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalXc.g:841:3: ()
            // InternalXc.g:842:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCHeaderFileAccess().getCHeaderFileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCHeaderFileAccess().getCHeaderFileKeyword_1());
            		
            // InternalXc.g:852:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:853:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:853:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:854:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCHeaderFileAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCHeaderFileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getCHeaderFileAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:875:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXc.g:876:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCHeaderFileAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:880:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:881:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:881:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:882:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCHeaderFileAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCHeaderFileRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:900:3: (otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXc.g:901:4: otherlv_6= 'subPrograms' otherlv_7= '{' ( (lv_subPrograms_8_0= ruleCSubProgram ) ) (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCHeaderFileAccess().getSubProgramsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getCHeaderFileAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalXc.g:909:4: ( (lv_subPrograms_8_0= ruleCSubProgram ) )
                    // InternalXc.g:910:5: (lv_subPrograms_8_0= ruleCSubProgram )
                    {
                    // InternalXc.g:910:5: (lv_subPrograms_8_0= ruleCSubProgram )
                    // InternalXc.g:911:6: lv_subPrograms_8_0= ruleCSubProgram
                    {

                    						newCompositeNode(grammarAccess.getCHeaderFileAccess().getSubProgramsCSubProgramParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_subPrograms_8_0=ruleCSubProgram();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCHeaderFileRule());
                    						}
                    						add(
                    							current,
                    							"subPrograms",
                    							lv_subPrograms_8_0,
                    							"ac.soton.xtext.c.Xc.CSubProgram");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:928:4: (otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalXc.g:929:5: otherlv_9= ',' ( (lv_subPrograms_10_0= ruleCSubProgram ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCHeaderFileAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXc.g:933:5: ( (lv_subPrograms_10_0= ruleCSubProgram ) )
                    	    // InternalXc.g:934:6: (lv_subPrograms_10_0= ruleCSubProgram )
                    	    {
                    	    // InternalXc.g:934:6: (lv_subPrograms_10_0= ruleCSubProgram )
                    	    // InternalXc.g:935:7: lv_subPrograms_10_0= ruleCSubProgram
                    	    {

                    	    							newCompositeNode(grammarAccess.getCHeaderFileAccess().getSubProgramsCSubProgramParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_subPrograms_10_0=ruleCSubProgram();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCHeaderFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subPrograms",
                    	    								lv_subPrograms_10_0,
                    	    								"ac.soton.xtext.c.Xc.CSubProgram");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getCHeaderFileAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:958:3: (otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXc.g:959:4: otherlv_12= 'globalVariables' otherlv_13= '{' ( (lv_globalVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getCHeaderFileAccess().getGlobalVariablesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getCHeaderFileAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalXc.g:967:4: ( (lv_globalVariables_14_0= ruleCVariable ) )
                    // InternalXc.g:968:5: (lv_globalVariables_14_0= ruleCVariable )
                    {
                    // InternalXc.g:968:5: (lv_globalVariables_14_0= ruleCVariable )
                    // InternalXc.g:969:6: lv_globalVariables_14_0= ruleCVariable
                    {

                    						newCompositeNode(grammarAccess.getCHeaderFileAccess().getGlobalVariablesCVariableParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_globalVariables_14_0=ruleCVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCHeaderFileRule());
                    						}
                    						add(
                    							current,
                    							"globalVariables",
                    							lv_globalVariables_14_0,
                    							"ac.soton.xtext.c.Xc.CVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:986:4: (otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalXc.g:987:5: otherlv_15= ',' ( (lv_globalVariables_16_0= ruleCVariable ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCHeaderFileAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXc.g:991:5: ( (lv_globalVariables_16_0= ruleCVariable ) )
                    	    // InternalXc.g:992:6: (lv_globalVariables_16_0= ruleCVariable )
                    	    {
                    	    // InternalXc.g:992:6: (lv_globalVariables_16_0= ruleCVariable )
                    	    // InternalXc.g:993:7: lv_globalVariables_16_0= ruleCVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getCHeaderFileAccess().getGlobalVariablesCVariableParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_globalVariables_16_0=ruleCVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCHeaderFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"globalVariables",
                    	    								lv_globalVariables_16_0,
                    	    								"ac.soton.xtext.c.Xc.CVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_24); 

                    				newLeafNode(otherlv_17, grammarAccess.getCHeaderFileAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:1016:3: (otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXc.g:1017:4: otherlv_18= 'types' otherlv_19= '{' ( (lv_types_20_0= ruleCType ) ) (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getCHeaderFileAccess().getTypesKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_19, grammarAccess.getCHeaderFileAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXc.g:1025:4: ( (lv_types_20_0= ruleCType ) )
                    // InternalXc.g:1026:5: (lv_types_20_0= ruleCType )
                    {
                    // InternalXc.g:1026:5: (lv_types_20_0= ruleCType )
                    // InternalXc.g:1027:6: lv_types_20_0= ruleCType
                    {

                    						newCompositeNode(grammarAccess.getCHeaderFileAccess().getTypesCTypeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_types_20_0=ruleCType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCHeaderFileRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_20_0,
                    							"ac.soton.xtext.c.Xc.CType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:1044:4: (otherlv_21= ',' ( (lv_types_22_0= ruleCType ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==15) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalXc.g:1045:5: otherlv_21= ',' ( (lv_types_22_0= ruleCType ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_18); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getCHeaderFileAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXc.g:1049:5: ( (lv_types_22_0= ruleCType ) )
                    	    // InternalXc.g:1050:6: (lv_types_22_0= ruleCType )
                    	    {
                    	    // InternalXc.g:1050:6: (lv_types_22_0= ruleCType )
                    	    // InternalXc.g:1051:7: lv_types_22_0= ruleCType
                    	    {

                    	    							newCompositeNode(grammarAccess.getCHeaderFileAccess().getTypesCTypeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_types_22_0=ruleCType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCHeaderFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_22_0,
                    	    								"ac.soton.xtext.c.Xc.CType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_23, grammarAccess.getCHeaderFileAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getCHeaderFileAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCHeaderFile"


    // $ANTLR start "entryRuleCSubProgram_Impl"
    // InternalXc.g:1082:1: entryRuleCSubProgram_Impl returns [EObject current=null] : iv_ruleCSubProgram_Impl= ruleCSubProgram_Impl EOF ;
    public final EObject entryRuleCSubProgram_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSubProgram_Impl = null;


        try {
            // InternalXc.g:1082:57: (iv_ruleCSubProgram_Impl= ruleCSubProgram_Impl EOF )
            // InternalXc.g:1083:2: iv_ruleCSubProgram_Impl= ruleCSubProgram_Impl EOF
            {
             newCompositeNode(grammarAccess.getCSubProgram_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSubProgram_Impl=ruleCSubProgram_Impl();

            state._fsp--;

             current =iv_ruleCSubProgram_Impl; 
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
    // $ANTLR end "entryRuleCSubProgram_Impl"


    // $ANTLR start "ruleCSubProgram_Impl"
    // InternalXc.g:1089:1: ruleCSubProgram_Impl returns [EObject current=null] : ( () otherlv_1= 'CSubProgram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )? (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleCSubProgram_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_localVariables_14_0 = null;

        EObject lv_localVariables_16_0 = null;

        EObject lv_body_20_0 = null;

        EObject lv_body_22_0 = null;

        EObject lv_preconditions_26_0 = null;

        EObject lv_preconditions_28_0 = null;



        	enterRule();

        try {
            // InternalXc.g:1095:2: ( ( () otherlv_1= 'CSubProgram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )? (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalXc.g:1096:2: ( () otherlv_1= 'CSubProgram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )? (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalXc.g:1096:2: ( () otherlv_1= 'CSubProgram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )? (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalXc.g:1097:3: () otherlv_1= 'CSubProgram' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )? (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // InternalXc.g:1097:3: ()
            // InternalXc.g:1098:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCSubProgram_ImplAccess().getCSubProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCSubProgram_ImplAccess().getCSubProgramKeyword_1());
            		
            // InternalXc.g:1108:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:1109:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:1109:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:1110:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCSubProgram_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCSubProgram_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getCSubProgram_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:1131:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXc.g:1132:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCSubProgram_ImplAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:1136:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:1137:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:1137:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:1138:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCSubProgram_ImplAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCSubProgram_ImplRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:1156:3: (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXc.g:1157:4: otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCSubProgram_ImplAccess().getParametersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getCSubProgram_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalXc.g:1165:4: ( (lv_parameters_8_0= ruleCParameter ) )
                    // InternalXc.g:1166:5: (lv_parameters_8_0= ruleCParameter )
                    {
                    // InternalXc.g:1166:5: (lv_parameters_8_0= ruleCParameter )
                    // InternalXc.g:1167:6: lv_parameters_8_0= ruleCParameter
                    {

                    						newCompositeNode(grammarAccess.getCSubProgram_ImplAccess().getParametersCParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_8_0=ruleCParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCSubProgram_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_8_0,
                    							"ac.soton.xtext.c.Xc.CParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:1184:4: (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalXc.g:1185:5: otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCSubProgram_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXc.g:1189:5: ( (lv_parameters_10_0= ruleCParameter ) )
                    	    // InternalXc.g:1190:6: (lv_parameters_10_0= ruleCParameter )
                    	    {
                    	    // InternalXc.g:1190:6: (lv_parameters_10_0= ruleCParameter )
                    	    // InternalXc.g:1191:7: lv_parameters_10_0= ruleCParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getCSubProgram_ImplAccess().getParametersCParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_10_0=ruleCParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCSubProgram_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_10_0,
                    	    								"ac.soton.xtext.c.Xc.CParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getCSubProgram_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:1214:3: (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXc.g:1215:4: otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getCSubProgram_ImplAccess().getLocalVariablesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getCSubProgram_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalXc.g:1223:4: ( (lv_localVariables_14_0= ruleCVariable ) )
                    // InternalXc.g:1224:5: (lv_localVariables_14_0= ruleCVariable )
                    {
                    // InternalXc.g:1224:5: (lv_localVariables_14_0= ruleCVariable )
                    // InternalXc.g:1225:6: lv_localVariables_14_0= ruleCVariable
                    {

                    						newCompositeNode(grammarAccess.getCSubProgram_ImplAccess().getLocalVariablesCVariableParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_localVariables_14_0=ruleCVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCSubProgram_ImplRule());
                    						}
                    						add(
                    							current,
                    							"localVariables",
                    							lv_localVariables_14_0,
                    							"ac.soton.xtext.c.Xc.CVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:1242:4: (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalXc.g:1243:5: otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCSubProgram_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXc.g:1247:5: ( (lv_localVariables_16_0= ruleCVariable ) )
                    	    // InternalXc.g:1248:6: (lv_localVariables_16_0= ruleCVariable )
                    	    {
                    	    // InternalXc.g:1248:6: (lv_localVariables_16_0= ruleCVariable )
                    	    // InternalXc.g:1249:7: lv_localVariables_16_0= ruleCVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getCSubProgram_ImplAccess().getLocalVariablesCVariableParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_localVariables_16_0=ruleCVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCSubProgram_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"localVariables",
                    	    								lv_localVariables_16_0,
                    	    								"ac.soton.xtext.c.Xc.CVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_29); 

                    				newLeafNode(otherlv_17, grammarAccess.getCSubProgram_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:1272:3: (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXc.g:1273:4: otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getCSubProgram_ImplAccess().getBodyKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getCSubProgram_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXc.g:1281:4: ( (lv_body_20_0= ruleCExpression ) )
                    // InternalXc.g:1282:5: (lv_body_20_0= ruleCExpression )
                    {
                    // InternalXc.g:1282:5: (lv_body_20_0= ruleCExpression )
                    // InternalXc.g:1283:6: lv_body_20_0= ruleCExpression
                    {

                    						newCompositeNode(grammarAccess.getCSubProgram_ImplAccess().getBodyCExpressionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_body_20_0=ruleCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCSubProgram_ImplRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_20_0,
                    							"ac.soton.xtext.c.Xc.CExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:1300:4: (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==15) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalXc.g:1301:5: otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getCSubProgram_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXc.g:1305:5: ( (lv_body_22_0= ruleCExpression ) )
                    	    // InternalXc.g:1306:6: (lv_body_22_0= ruleCExpression )
                    	    {
                    	    // InternalXc.g:1306:6: (lv_body_22_0= ruleCExpression )
                    	    // InternalXc.g:1307:7: lv_body_22_0= ruleCExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCSubProgram_ImplAccess().getBodyCExpressionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_body_22_0=ruleCExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCSubProgram_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_22_0,
                    	    								"ac.soton.xtext.c.Xc.CExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_31); 

                    				newLeafNode(otherlv_23, grammarAccess.getCSubProgram_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:1330:3: (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalXc.g:1331:4: otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getCSubProgram_ImplAccess().getPreconditionsKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_25, grammarAccess.getCSubProgram_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalXc.g:1339:4: ( (lv_preconditions_26_0= ruleCPreCondition ) )
                    // InternalXc.g:1340:5: (lv_preconditions_26_0= ruleCPreCondition )
                    {
                    // InternalXc.g:1340:5: (lv_preconditions_26_0= ruleCPreCondition )
                    // InternalXc.g:1341:6: lv_preconditions_26_0= ruleCPreCondition
                    {

                    						newCompositeNode(grammarAccess.getCSubProgram_ImplAccess().getPreconditionsCPreConditionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_preconditions_26_0=ruleCPreCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCSubProgram_ImplRule());
                    						}
                    						add(
                    							current,
                    							"preconditions",
                    							lv_preconditions_26_0,
                    							"ac.soton.xtext.c.Xc.CPreCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:1358:4: (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==15) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalXc.g:1359:5: otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getCSubProgram_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalXc.g:1363:5: ( (lv_preconditions_28_0= ruleCPreCondition ) )
                    	    // InternalXc.g:1364:6: (lv_preconditions_28_0= ruleCPreCondition )
                    	    {
                    	    // InternalXc.g:1364:6: (lv_preconditions_28_0= ruleCPreCondition )
                    	    // InternalXc.g:1365:7: lv_preconditions_28_0= ruleCPreCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getCSubProgram_ImplAccess().getPreconditionsCPreConditionParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_preconditions_28_0=ruleCPreCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCSubProgram_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"preconditions",
                    	    								lv_preconditions_28_0,
                    	    								"ac.soton.xtext.c.Xc.CPreCondition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_29, grammarAccess.getCSubProgram_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getCSubProgram_ImplAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCSubProgram_Impl"


    // $ANTLR start "entryRuleCVariable_Impl"
    // InternalXc.g:1396:1: entryRuleCVariable_Impl returns [EObject current=null] : iv_ruleCVariable_Impl= ruleCVariable_Impl EOF ;
    public final EObject entryRuleCVariable_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCVariable_Impl = null;


        try {
            // InternalXc.g:1396:55: (iv_ruleCVariable_Impl= ruleCVariable_Impl EOF )
            // InternalXc.g:1397:2: iv_ruleCVariable_Impl= ruleCVariable_Impl EOF
            {
             newCompositeNode(grammarAccess.getCVariable_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCVariable_Impl=ruleCVariable_Impl();

            state._fsp--;

             current =iv_ruleCVariable_Impl; 
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
    // $ANTLR end "entryRuleCVariable_Impl"


    // $ANTLR start "ruleCVariable_Impl"
    // InternalXc.g:1403:1: ruleCVariable_Impl returns [EObject current=null] : ( () ( (lv_isConstant_1_0= 'isConstant' ) )? otherlv_2= 'CVariable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleCVariable_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_isConstant_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_endname_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_type_10_0 = null;



        	enterRule();

        try {
            // InternalXc.g:1409:2: ( ( () ( (lv_isConstant_1_0= 'isConstant' ) )? otherlv_2= 'CVariable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalXc.g:1410:2: ( () ( (lv_isConstant_1_0= 'isConstant' ) )? otherlv_2= 'CVariable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalXc.g:1410:2: ( () ( (lv_isConstant_1_0= 'isConstant' ) )? otherlv_2= 'CVariable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // InternalXc.g:1411:3: () ( (lv_isConstant_1_0= 'isConstant' ) )? otherlv_2= 'CVariable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // InternalXc.g:1411:3: ()
            // InternalXc.g:1412:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCVariable_ImplAccess().getCVariableAction_0(),
            					current);
            			

            }

            // InternalXc.g:1418:3: ( (lv_isConstant_1_0= 'isConstant' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalXc.g:1419:4: (lv_isConstant_1_0= 'isConstant' )
                    {
                    // InternalXc.g:1419:4: (lv_isConstant_1_0= 'isConstant' )
                    // InternalXc.g:1420:5: lv_isConstant_1_0= 'isConstant'
                    {
                    lv_isConstant_1_0=(Token)match(input,29,FOLLOW_32); 

                    					newLeafNode(lv_isConstant_1_0, grammarAccess.getCVariable_ImplAccess().getIsConstantIsConstantKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCVariable_ImplRule());
                    					}
                    					setWithLastConsumed(current, "isConstant", lv_isConstant_1_0 != null, "isConstant");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCVariable_ImplAccess().getCVariableKeyword_2());
            		
            // InternalXc.g:1436:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXc.g:1437:4: (lv_name_3_0= ruleEString )
            {
            // InternalXc.g:1437:4: (lv_name_3_0= ruleEString )
            // InternalXc.g:1438:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCVariable_ImplAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCVariable_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getCVariable_ImplAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXc.g:1459:3: (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXc.g:1460:4: otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCVariable_ImplAccess().getEndnameKeyword_5_0());
                    			
                    // InternalXc.g:1464:4: ( (lv_endname_6_0= ruleEString ) )
                    // InternalXc.g:1465:5: (lv_endname_6_0= ruleEString )
                    {
                    // InternalXc.g:1465:5: (lv_endname_6_0= ruleEString )
                    // InternalXc.g:1466:6: lv_endname_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCVariable_ImplAccess().getEndnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_endname_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCVariable_ImplRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_6_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:1484:3: (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalXc.g:1485:4: otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCVariable_ImplAccess().getValueKeyword_6_0());
                    			
                    // InternalXc.g:1489:4: ( (lv_value_8_0= ruleEString ) )
                    // InternalXc.g:1490:5: (lv_value_8_0= ruleEString )
                    {
                    // InternalXc.g:1490:5: (lv_value_8_0= ruleEString )
                    // InternalXc.g:1491:6: lv_value_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCVariable_ImplAccess().getValueEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_value_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCVariable_ImplRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:1509:3: (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalXc.g:1510:4: otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCVariable_ImplAccess().getTypeKeyword_7_0());
                    			
                    // InternalXc.g:1514:4: ( (lv_type_10_0= ruleEString ) )
                    // InternalXc.g:1515:5: (lv_type_10_0= ruleEString )
                    {
                    // InternalXc.g:1515:5: (lv_type_10_0= ruleEString )
                    // InternalXc.g:1516:6: lv_type_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCVariable_ImplAccess().getTypeEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCVariable_ImplRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_10_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCVariable_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCVariable_Impl"


    // $ANTLR start "entryRuleCType_Impl"
    // InternalXc.g:1542:1: entryRuleCType_Impl returns [EObject current=null] : iv_ruleCType_Impl= ruleCType_Impl EOF ;
    public final EObject entryRuleCType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCType_Impl = null;


        try {
            // InternalXc.g:1542:51: (iv_ruleCType_Impl= ruleCType_Impl EOF )
            // InternalXc.g:1543:2: iv_ruleCType_Impl= ruleCType_Impl EOF
            {
             newCompositeNode(grammarAccess.getCType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCType_Impl=ruleCType_Impl();

            state._fsp--;

             current =iv_ruleCType_Impl; 
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
    // $ANTLR end "entryRuleCType_Impl"


    // $ANTLR start "ruleCType_Impl"
    // InternalXc.g:1549:1: ruleCType_Impl returns [EObject current=null] : ( () otherlv_1= 'CType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleCType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;



        	enterRule();

        try {
            // InternalXc.g:1555:2: ( ( () otherlv_1= 'CType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalXc.g:1556:2: ( () otherlv_1= 'CType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalXc.g:1556:2: ( () otherlv_1= 'CType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalXc.g:1557:3: () otherlv_1= 'CType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalXc.g:1557:3: ()
            // InternalXc.g:1558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCType_ImplAccess().getCTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCType_ImplAccess().getCTypeKeyword_1());
            		
            // InternalXc.g:1568:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:1569:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:1569:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:1570:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getCType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:1591:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==13) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXc.g:1592:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCType_ImplAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:1596:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:1597:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:1597:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:1598:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCType_ImplAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCType_ImplAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCType_Impl"


    // $ANTLR start "entryRuleCIncludeDirective"
    // InternalXc.g:1624:1: entryRuleCIncludeDirective returns [EObject current=null] : iv_ruleCIncludeDirective= ruleCIncludeDirective EOF ;
    public final EObject entryRuleCIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCIncludeDirective = null;


        try {
            // InternalXc.g:1624:58: (iv_ruleCIncludeDirective= ruleCIncludeDirective EOF )
            // InternalXc.g:1625:2: iv_ruleCIncludeDirective= ruleCIncludeDirective EOF
            {
             newCompositeNode(grammarAccess.getCIncludeDirectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCIncludeDirective=ruleCIncludeDirective();

            state._fsp--;

             current =iv_ruleCIncludeDirective; 
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
    // $ANTLR end "entryRuleCIncludeDirective"


    // $ANTLR start "ruleCIncludeDirective"
    // InternalXc.g:1631:1: ruleCIncludeDirective returns [EObject current=null] : ( () otherlv_1= 'CIncludeDirective' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'header' ( (lv_header_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleCIncludeDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        AntlrDatatypeRuleToken lv_header_7_0 = null;



        	enterRule();

        try {
            // InternalXc.g:1637:2: ( ( () otherlv_1= 'CIncludeDirective' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'header' ( (lv_header_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalXc.g:1638:2: ( () otherlv_1= 'CIncludeDirective' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'header' ( (lv_header_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalXc.g:1638:2: ( () otherlv_1= 'CIncludeDirective' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'header' ( (lv_header_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalXc.g:1639:3: () otherlv_1= 'CIncludeDirective' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'header' ( (lv_header_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalXc.g:1639:3: ()
            // InternalXc.g:1640:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCIncludeDirectiveAccess().getCIncludeDirectiveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCIncludeDirectiveAccess().getCIncludeDirectiveKeyword_1());
            		
            // InternalXc.g:1650:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:1651:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:1651:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:1652:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCIncludeDirectiveAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCIncludeDirectiveRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getCIncludeDirectiveAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:1673:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==13) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalXc.g:1674:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCIncludeDirectiveAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:1678:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:1679:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:1679:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:1680:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCIncludeDirectiveAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCIncludeDirectiveRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:1698:3: (otherlv_6= 'header' ( (lv_header_7_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXc.g:1699:4: otherlv_6= 'header' ( (lv_header_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCIncludeDirectiveAccess().getHeaderKeyword_5_0());
                    			
                    // InternalXc.g:1703:4: ( (lv_header_7_0= ruleEString ) )
                    // InternalXc.g:1704:5: (lv_header_7_0= ruleEString )
                    {
                    // InternalXc.g:1704:5: (lv_header_7_0= ruleEString )
                    // InternalXc.g:1705:6: lv_header_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCIncludeDirectiveAccess().getHeaderEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_header_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCIncludeDirectiveRule());
                    						}
                    						set(
                    							current,
                    							"header",
                    							lv_header_7_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCIncludeDirectiveAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCIncludeDirective"


    // $ANTLR start "entryRuleCParameter"
    // InternalXc.g:1731:1: entryRuleCParameter returns [EObject current=null] : iv_ruleCParameter= ruleCParameter EOF ;
    public final EObject entryRuleCParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCParameter = null;


        try {
            // InternalXc.g:1731:51: (iv_ruleCParameter= ruleCParameter EOF )
            // InternalXc.g:1732:2: iv_ruleCParameter= ruleCParameter EOF
            {
             newCompositeNode(grammarAccess.getCParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCParameter=ruleCParameter();

            state._fsp--;

             current =iv_ruleCParameter; 
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
    // $ANTLR end "entryRuleCParameter"


    // $ANTLR start "ruleCParameter"
    // InternalXc.g:1738:1: ruleCParameter returns [EObject current=null] : ( () otherlv_1= 'CParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleCParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalXc.g:1744:2: ( ( () otherlv_1= 'CParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalXc.g:1745:2: ( () otherlv_1= 'CParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalXc.g:1745:2: ( () otherlv_1= 'CParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalXc.g:1746:3: () otherlv_1= 'CParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalXc.g:1746:3: ()
            // InternalXc.g:1747:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCParameterAccess().getCParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCParameterAccess().getCParameterKeyword_1());
            		
            // InternalXc.g:1757:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:1758:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:1758:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:1759:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getCParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:1780:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalXc.g:1781:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCParameterAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:1785:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:1786:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:1786:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:1787:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCParameterAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCParameterRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:1805:3: (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalXc.g:1806:4: otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCParameterAccess().getTypeKeyword_5_0());
                    			
                    // InternalXc.g:1810:4: ( (lv_type_7_0= ruleEString ) )
                    // InternalXc.g:1811:5: (lv_type_7_0= ruleEString )
                    {
                    // InternalXc.g:1811:5: (lv_type_7_0= ruleEString )
                    // InternalXc.g:1812:6: lv_type_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCParameterAccess().getTypeEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCParameterRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCParameterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCParameter"


    // $ANTLR start "entryRuleCExpression_Impl"
    // InternalXc.g:1838:1: entryRuleCExpression_Impl returns [EObject current=null] : iv_ruleCExpression_Impl= ruleCExpression_Impl EOF ;
    public final EObject entryRuleCExpression_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCExpression_Impl = null;


        try {
            // InternalXc.g:1838:57: (iv_ruleCExpression_Impl= ruleCExpression_Impl EOF )
            // InternalXc.g:1839:2: iv_ruleCExpression_Impl= ruleCExpression_Impl EOF
            {
             newCompositeNode(grammarAccess.getCExpression_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCExpression_Impl=ruleCExpression_Impl();

            state._fsp--;

             current =iv_ruleCExpression_Impl; 
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
    // $ANTLR end "entryRuleCExpression_Impl"


    // $ANTLR start "ruleCExpression_Impl"
    // InternalXc.g:1845:1: ruleCExpression_Impl returns [EObject current=null] : ( () otherlv_1= 'CExpression' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCExpression_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalXc.g:1851:2: ( ( () otherlv_1= 'CExpression' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalXc.g:1852:2: ( () otherlv_1= 'CExpression' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalXc.g:1852:2: ( () otherlv_1= 'CExpression' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalXc.g:1853:3: () otherlv_1= 'CExpression' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalXc.g:1853:3: ()
            // InternalXc.g:1854:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCExpression_ImplAccess().getCExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCExpression_ImplAccess().getCExpressionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getCExpression_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXc.g:1868:3: (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalXc.g:1869:4: otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCExpression_ImplAccess().getExpressionKeyword_3_0());
                    			
                    // InternalXc.g:1873:4: ( (lv_expression_4_0= ruleEString ) )
                    // InternalXc.g:1874:5: (lv_expression_4_0= ruleEString )
                    {
                    // InternalXc.g:1874:5: (lv_expression_4_0= ruleEString )
                    // InternalXc.g:1875:6: lv_expression_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCExpression_ImplAccess().getExpressionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_expression_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCExpression_ImplRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCExpression_ImplAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCExpression_Impl"


    // $ANTLR start "entryRuleCPreCondition"
    // InternalXc.g:1901:1: entryRuleCPreCondition returns [EObject current=null] : iv_ruleCPreCondition= ruleCPreCondition EOF ;
    public final EObject entryRuleCPreCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCPreCondition = null;


        try {
            // InternalXc.g:1901:54: (iv_ruleCPreCondition= ruleCPreCondition EOF )
            // InternalXc.g:1902:2: iv_ruleCPreCondition= ruleCPreCondition EOF
            {
             newCompositeNode(grammarAccess.getCPreConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCPreCondition=ruleCPreCondition();

            state._fsp--;

             current =iv_ruleCPreCondition; 
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
    // $ANTLR end "entryRuleCPreCondition"


    // $ANTLR start "ruleCPreCondition"
    // InternalXc.g:1908:1: ruleCPreCondition returns [EObject current=null] : ( () otherlv_1= 'CPreCondition' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )? (otherlv_5= 'predicate' ( (lv_predicate_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCPreCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_expression_4_0 = null;

        AntlrDatatypeRuleToken lv_predicate_6_0 = null;



        	enterRule();

        try {
            // InternalXc.g:1914:2: ( ( () otherlv_1= 'CPreCondition' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )? (otherlv_5= 'predicate' ( (lv_predicate_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalXc.g:1915:2: ( () otherlv_1= 'CPreCondition' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )? (otherlv_5= 'predicate' ( (lv_predicate_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalXc.g:1915:2: ( () otherlv_1= 'CPreCondition' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )? (otherlv_5= 'predicate' ( (lv_predicate_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalXc.g:1916:3: () otherlv_1= 'CPreCondition' otherlv_2= '{' (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )? (otherlv_5= 'predicate' ( (lv_predicate_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalXc.g:1916:3: ()
            // InternalXc.g:1917:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCPreConditionAccess().getCPreConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCPreConditionAccess().getCPreConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getCPreConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXc.g:1931:3: (otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalXc.g:1932:4: otherlv_3= 'expression' ( (lv_expression_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCPreConditionAccess().getExpressionKeyword_3_0());
                    			
                    // InternalXc.g:1936:4: ( (lv_expression_4_0= ruleEString ) )
                    // InternalXc.g:1937:5: (lv_expression_4_0= ruleEString )
                    {
                    // InternalXc.g:1937:5: (lv_expression_4_0= ruleEString )
                    // InternalXc.g:1938:6: lv_expression_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCPreConditionAccess().getExpressionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_expression_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCPreConditionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:1956:3: (otherlv_5= 'predicate' ( (lv_predicate_6_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==40) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalXc.g:1957:4: otherlv_5= 'predicate' ( (lv_predicate_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCPreConditionAccess().getPredicateKeyword_4_0());
                    			
                    // InternalXc.g:1961:4: ( (lv_predicate_6_0= ruleEString ) )
                    // InternalXc.g:1962:5: (lv_predicate_6_0= ruleEString )
                    {
                    // InternalXc.g:1962:5: (lv_predicate_6_0= ruleEString )
                    // InternalXc.g:1963:6: lv_predicate_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCPreConditionAccess().getPredicateEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_predicate_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCPreConditionRule());
                    						}
                    						set(
                    							current,
                    							"predicate",
                    							lv_predicate_6_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCPreConditionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCPreCondition"


    // $ANTLR start "entryRuleCFunction"
    // InternalXc.g:1989:1: entryRuleCFunction returns [EObject current=null] : iv_ruleCFunction= ruleCFunction EOF ;
    public final EObject entryRuleCFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCFunction = null;


        try {
            // InternalXc.g:1989:50: (iv_ruleCFunction= ruleCFunction EOF )
            // InternalXc.g:1990:2: iv_ruleCFunction= ruleCFunction EOF
            {
             newCompositeNode(grammarAccess.getCFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCFunction=ruleCFunction();

            state._fsp--;

             current =iv_ruleCFunction; 
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
    // $ANTLR end "entryRuleCFunction"


    // $ANTLR start "ruleCFunction"
    // InternalXc.g:1996:1: ruleCFunction returns [EObject current=null] : ( () otherlv_1= 'CFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( (lv_returnType_7_0= ruleEString ) ) )? (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleCParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleCParameter ) ) )* otherlv_13= '}' )? (otherlv_14= 'localVariables' otherlv_15= '{' ( (lv_localVariables_16_0= ruleCVariable ) ) (otherlv_17= ',' ( (lv_localVariables_18_0= ruleCVariable ) ) )* otherlv_19= '}' )? (otherlv_20= 'body' otherlv_21= '{' ( (lv_body_22_0= ruleCExpression ) ) (otherlv_23= ',' ( (lv_body_24_0= ruleCExpression ) ) )* otherlv_25= '}' )? (otherlv_26= 'preconditions' otherlv_27= '{' ( (lv_preconditions_28_0= ruleCPreCondition ) ) (otherlv_29= ',' ( (lv_preconditions_30_0= ruleCPreCondition ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) ;
    public final EObject ruleCFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        AntlrDatatypeRuleToken lv_returnType_7_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_localVariables_16_0 = null;

        EObject lv_localVariables_18_0 = null;

        EObject lv_body_22_0 = null;

        EObject lv_body_24_0 = null;

        EObject lv_preconditions_28_0 = null;

        EObject lv_preconditions_30_0 = null;



        	enterRule();

        try {
            // InternalXc.g:2002:2: ( ( () otherlv_1= 'CFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( (lv_returnType_7_0= ruleEString ) ) )? (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleCParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleCParameter ) ) )* otherlv_13= '}' )? (otherlv_14= 'localVariables' otherlv_15= '{' ( (lv_localVariables_16_0= ruleCVariable ) ) (otherlv_17= ',' ( (lv_localVariables_18_0= ruleCVariable ) ) )* otherlv_19= '}' )? (otherlv_20= 'body' otherlv_21= '{' ( (lv_body_22_0= ruleCExpression ) ) (otherlv_23= ',' ( (lv_body_24_0= ruleCExpression ) ) )* otherlv_25= '}' )? (otherlv_26= 'preconditions' otherlv_27= '{' ( (lv_preconditions_28_0= ruleCPreCondition ) ) (otherlv_29= ',' ( (lv_preconditions_30_0= ruleCPreCondition ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) )
            // InternalXc.g:2003:2: ( () otherlv_1= 'CFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( (lv_returnType_7_0= ruleEString ) ) )? (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleCParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleCParameter ) ) )* otherlv_13= '}' )? (otherlv_14= 'localVariables' otherlv_15= '{' ( (lv_localVariables_16_0= ruleCVariable ) ) (otherlv_17= ',' ( (lv_localVariables_18_0= ruleCVariable ) ) )* otherlv_19= '}' )? (otherlv_20= 'body' otherlv_21= '{' ( (lv_body_22_0= ruleCExpression ) ) (otherlv_23= ',' ( (lv_body_24_0= ruleCExpression ) ) )* otherlv_25= '}' )? (otherlv_26= 'preconditions' otherlv_27= '{' ( (lv_preconditions_28_0= ruleCPreCondition ) ) (otherlv_29= ',' ( (lv_preconditions_30_0= ruleCPreCondition ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            {
            // InternalXc.g:2003:2: ( () otherlv_1= 'CFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( (lv_returnType_7_0= ruleEString ) ) )? (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleCParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleCParameter ) ) )* otherlv_13= '}' )? (otherlv_14= 'localVariables' otherlv_15= '{' ( (lv_localVariables_16_0= ruleCVariable ) ) (otherlv_17= ',' ( (lv_localVariables_18_0= ruleCVariable ) ) )* otherlv_19= '}' )? (otherlv_20= 'body' otherlv_21= '{' ( (lv_body_22_0= ruleCExpression ) ) (otherlv_23= ',' ( (lv_body_24_0= ruleCExpression ) ) )* otherlv_25= '}' )? (otherlv_26= 'preconditions' otherlv_27= '{' ( (lv_preconditions_28_0= ruleCPreCondition ) ) (otherlv_29= ',' ( (lv_preconditions_30_0= ruleCPreCondition ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            // InternalXc.g:2004:3: () otherlv_1= 'CFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'returnType' ( (lv_returnType_7_0= ruleEString ) ) )? (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleCParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleCParameter ) ) )* otherlv_13= '}' )? (otherlv_14= 'localVariables' otherlv_15= '{' ( (lv_localVariables_16_0= ruleCVariable ) ) (otherlv_17= ',' ( (lv_localVariables_18_0= ruleCVariable ) ) )* otherlv_19= '}' )? (otherlv_20= 'body' otherlv_21= '{' ( (lv_body_22_0= ruleCExpression ) ) (otherlv_23= ',' ( (lv_body_24_0= ruleCExpression ) ) )* otherlv_25= '}' )? (otherlv_26= 'preconditions' otherlv_27= '{' ( (lv_preconditions_28_0= ruleCPreCondition ) ) (otherlv_29= ',' ( (lv_preconditions_30_0= ruleCPreCondition ) ) )* otherlv_31= '}' )? otherlv_32= '}'
            {
            // InternalXc.g:2004:3: ()
            // InternalXc.g:2005:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCFunctionAccess().getCFunctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCFunctionAccess().getCFunctionKeyword_1());
            		
            // InternalXc.g:2015:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:2016:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:2016:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:2017:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCFunctionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getCFunctionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:2038:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==13) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalXc.g:2039:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCFunctionAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:2043:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:2044:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:2044:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:2045:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCFunctionAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCFunctionRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:2063:3: (otherlv_6= 'returnType' ( (lv_returnType_7_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXc.g:2064:4: otherlv_6= 'returnType' ( (lv_returnType_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCFunctionAccess().getReturnTypeKeyword_5_0());
                    			
                    // InternalXc.g:2068:4: ( (lv_returnType_7_0= ruleEString ) )
                    // InternalXc.g:2069:5: (lv_returnType_7_0= ruleEString )
                    {
                    // InternalXc.g:2069:5: (lv_returnType_7_0= ruleEString )
                    // InternalXc.g:2070:6: lv_returnType_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCFunctionAccess().getReturnTypeEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_returnType_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCFunctionRule());
                    						}
                    						set(
                    							current,
                    							"returnType",
                    							lv_returnType_7_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:2088:3: (otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleCParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleCParameter ) ) )* otherlv_13= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==25) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalXc.g:2089:4: otherlv_8= 'parameters' otherlv_9= '{' ( (lv_parameters_10_0= ruleCParameter ) ) (otherlv_11= ',' ( (lv_parameters_12_0= ruleCParameter ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getCFunctionAccess().getParametersKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_9, grammarAccess.getCFunctionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalXc.g:2097:4: ( (lv_parameters_10_0= ruleCParameter ) )
                    // InternalXc.g:2098:5: (lv_parameters_10_0= ruleCParameter )
                    {
                    // InternalXc.g:2098:5: (lv_parameters_10_0= ruleCParameter )
                    // InternalXc.g:2099:6: lv_parameters_10_0= ruleCParameter
                    {

                    						newCompositeNode(grammarAccess.getCFunctionAccess().getParametersCParameterParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_10_0=ruleCParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCFunctionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_10_0,
                    							"ac.soton.xtext.c.Xc.CParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:2116:4: (otherlv_11= ',' ( (lv_parameters_12_0= ruleCParameter ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==15) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalXc.g:2117:5: otherlv_11= ',' ( (lv_parameters_12_0= ruleCParameter ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getCFunctionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXc.g:2121:5: ( (lv_parameters_12_0= ruleCParameter ) )
                    	    // InternalXc.g:2122:6: (lv_parameters_12_0= ruleCParameter )
                    	    {
                    	    // InternalXc.g:2122:6: (lv_parameters_12_0= ruleCParameter )
                    	    // InternalXc.g:2123:7: lv_parameters_12_0= ruleCParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getCFunctionAccess().getParametersCParameterParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_12_0=ruleCParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_12_0,
                    	    								"ac.soton.xtext.c.Xc.CParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_28); 

                    				newLeafNode(otherlv_13, grammarAccess.getCFunctionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:2146:3: (otherlv_14= 'localVariables' otherlv_15= '{' ( (lv_localVariables_16_0= ruleCVariable ) ) (otherlv_17= ',' ( (lv_localVariables_18_0= ruleCVariable ) ) )* otherlv_19= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==26) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXc.g:2147:4: otherlv_14= 'localVariables' otherlv_15= '{' ( (lv_localVariables_16_0= ruleCVariable ) ) (otherlv_17= ',' ( (lv_localVariables_18_0= ruleCVariable ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getCFunctionAccess().getLocalVariablesKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_15, grammarAccess.getCFunctionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXc.g:2155:4: ( (lv_localVariables_16_0= ruleCVariable ) )
                    // InternalXc.g:2156:5: (lv_localVariables_16_0= ruleCVariable )
                    {
                    // InternalXc.g:2156:5: (lv_localVariables_16_0= ruleCVariable )
                    // InternalXc.g:2157:6: lv_localVariables_16_0= ruleCVariable
                    {

                    						newCompositeNode(grammarAccess.getCFunctionAccess().getLocalVariablesCVariableParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_localVariables_16_0=ruleCVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCFunctionRule());
                    						}
                    						add(
                    							current,
                    							"localVariables",
                    							lv_localVariables_16_0,
                    							"ac.soton.xtext.c.Xc.CVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:2174:4: (otherlv_17= ',' ( (lv_localVariables_18_0= ruleCVariable ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==15) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalXc.g:2175:5: otherlv_17= ',' ( (lv_localVariables_18_0= ruleCVariable ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getCFunctionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXc.g:2179:5: ( (lv_localVariables_18_0= ruleCVariable ) )
                    	    // InternalXc.g:2180:6: (lv_localVariables_18_0= ruleCVariable )
                    	    {
                    	    // InternalXc.g:2180:6: (lv_localVariables_18_0= ruleCVariable )
                    	    // InternalXc.g:2181:7: lv_localVariables_18_0= ruleCVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getCFunctionAccess().getLocalVariablesCVariableParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_localVariables_18_0=ruleCVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"localVariables",
                    	    								lv_localVariables_18_0,
                    	    								"ac.soton.xtext.c.Xc.CVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_29); 

                    				newLeafNode(otherlv_19, grammarAccess.getCFunctionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:2204:3: (otherlv_20= 'body' otherlv_21= '{' ( (lv_body_22_0= ruleCExpression ) ) (otherlv_23= ',' ( (lv_body_24_0= ruleCExpression ) ) )* otherlv_25= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==27) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalXc.g:2205:4: otherlv_20= 'body' otherlv_21= '{' ( (lv_body_22_0= ruleCExpression ) ) (otherlv_23= ',' ( (lv_body_24_0= ruleCExpression ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getCFunctionAccess().getBodyKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_21, grammarAccess.getCFunctionAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalXc.g:2213:4: ( (lv_body_22_0= ruleCExpression ) )
                    // InternalXc.g:2214:5: (lv_body_22_0= ruleCExpression )
                    {
                    // InternalXc.g:2214:5: (lv_body_22_0= ruleCExpression )
                    // InternalXc.g:2215:6: lv_body_22_0= ruleCExpression
                    {

                    						newCompositeNode(grammarAccess.getCFunctionAccess().getBodyCExpressionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_body_22_0=ruleCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCFunctionRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_22_0,
                    							"ac.soton.xtext.c.Xc.CExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:2232:4: (otherlv_23= ',' ( (lv_body_24_0= ruleCExpression ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalXc.g:2233:5: otherlv_23= ',' ( (lv_body_24_0= ruleCExpression ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getCFunctionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalXc.g:2237:5: ( (lv_body_24_0= ruleCExpression ) )
                    	    // InternalXc.g:2238:6: (lv_body_24_0= ruleCExpression )
                    	    {
                    	    // InternalXc.g:2238:6: (lv_body_24_0= ruleCExpression )
                    	    // InternalXc.g:2239:7: lv_body_24_0= ruleCExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCFunctionAccess().getBodyCExpressionParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_body_24_0=ruleCExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_24_0,
                    	    								"ac.soton.xtext.c.Xc.CExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,16,FOLLOW_31); 

                    				newLeafNode(otherlv_25, grammarAccess.getCFunctionAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:2262:3: (otherlv_26= 'preconditions' otherlv_27= '{' ( (lv_preconditions_28_0= ruleCPreCondition ) ) (otherlv_29= ',' ( (lv_preconditions_30_0= ruleCPreCondition ) ) )* otherlv_31= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==28) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalXc.g:2263:4: otherlv_26= 'preconditions' otherlv_27= '{' ( (lv_preconditions_28_0= ruleCPreCondition ) ) (otherlv_29= ',' ( (lv_preconditions_30_0= ruleCPreCondition ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_26, grammarAccess.getCFunctionAccess().getPreconditionsKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_27, grammarAccess.getCFunctionAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalXc.g:2271:4: ( (lv_preconditions_28_0= ruleCPreCondition ) )
                    // InternalXc.g:2272:5: (lv_preconditions_28_0= ruleCPreCondition )
                    {
                    // InternalXc.g:2272:5: (lv_preconditions_28_0= ruleCPreCondition )
                    // InternalXc.g:2273:6: lv_preconditions_28_0= ruleCPreCondition
                    {

                    						newCompositeNode(grammarAccess.getCFunctionAccess().getPreconditionsCPreConditionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_preconditions_28_0=ruleCPreCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCFunctionRule());
                    						}
                    						add(
                    							current,
                    							"preconditions",
                    							lv_preconditions_28_0,
                    							"ac.soton.xtext.c.Xc.CPreCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:2290:4: (otherlv_29= ',' ( (lv_preconditions_30_0= ruleCPreCondition ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalXc.g:2291:5: otherlv_29= ',' ( (lv_preconditions_30_0= ruleCPreCondition ) )
                    	    {
                    	    otherlv_29=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getCFunctionAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalXc.g:2295:5: ( (lv_preconditions_30_0= ruleCPreCondition ) )
                    	    // InternalXc.g:2296:6: (lv_preconditions_30_0= ruleCPreCondition )
                    	    {
                    	    // InternalXc.g:2296:6: (lv_preconditions_30_0= ruleCPreCondition )
                    	    // InternalXc.g:2297:7: lv_preconditions_30_0= ruleCPreCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getCFunctionAccess().getPreconditionsCPreConditionParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_preconditions_30_0=ruleCPreCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"preconditions",
                    	    								lv_preconditions_30_0,
                    	    								"ac.soton.xtext.c.Xc.CPreCondition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_31, grammarAccess.getCFunctionAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_32=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getCFunctionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleCFunction"


    // $ANTLR start "entryRuleCProcedure"
    // InternalXc.g:2328:1: entryRuleCProcedure returns [EObject current=null] : iv_ruleCProcedure= ruleCProcedure EOF ;
    public final EObject entryRuleCProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCProcedure = null;


        try {
            // InternalXc.g:2328:51: (iv_ruleCProcedure= ruleCProcedure EOF )
            // InternalXc.g:2329:2: iv_ruleCProcedure= ruleCProcedure EOF
            {
             newCompositeNode(grammarAccess.getCProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCProcedure=ruleCProcedure();

            state._fsp--;

             current =iv_ruleCProcedure; 
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
    // $ANTLR end "entryRuleCProcedure"


    // $ANTLR start "ruleCProcedure"
    // InternalXc.g:2335:1: ruleCProcedure returns [EObject current=null] : ( () otherlv_1= 'CProcedure' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )? (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleCProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;

        EObject lv_localVariables_14_0 = null;

        EObject lv_localVariables_16_0 = null;

        EObject lv_body_20_0 = null;

        EObject lv_body_22_0 = null;

        EObject lv_preconditions_26_0 = null;

        EObject lv_preconditions_28_0 = null;



        	enterRule();

        try {
            // InternalXc.g:2341:2: ( ( () otherlv_1= 'CProcedure' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )? (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalXc.g:2342:2: ( () otherlv_1= 'CProcedure' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )? (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalXc.g:2342:2: ( () otherlv_1= 'CProcedure' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )? (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalXc.g:2343:3: () otherlv_1= 'CProcedure' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )? (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )? (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )? (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // InternalXc.g:2343:3: ()
            // InternalXc.g:2344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCProcedureAccess().getCProcedureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCProcedureAccess().getCProcedureKeyword_1());
            		
            // InternalXc.g:2354:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:2355:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:2355:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:2356:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCProcedureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCProcedureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getCProcedureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:2377:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==13) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalXc.g:2378:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCProcedureAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:2382:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:2383:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:2383:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:2384:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCProcedureAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCProcedureRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:2402:3: (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==25) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalXc.g:2403:4: otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleCParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCProcedureAccess().getParametersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getCProcedureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalXc.g:2411:4: ( (lv_parameters_8_0= ruleCParameter ) )
                    // InternalXc.g:2412:5: (lv_parameters_8_0= ruleCParameter )
                    {
                    // InternalXc.g:2412:5: (lv_parameters_8_0= ruleCParameter )
                    // InternalXc.g:2413:6: lv_parameters_8_0= ruleCParameter
                    {

                    						newCompositeNode(grammarAccess.getCProcedureAccess().getParametersCParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_8_0=ruleCParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCProcedureRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_8_0,
                    							"ac.soton.xtext.c.Xc.CParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:2430:4: (otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==15) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalXc.g:2431:5: otherlv_9= ',' ( (lv_parameters_10_0= ruleCParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_27); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCProcedureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXc.g:2435:5: ( (lv_parameters_10_0= ruleCParameter ) )
                    	    // InternalXc.g:2436:6: (lv_parameters_10_0= ruleCParameter )
                    	    {
                    	    // InternalXc.g:2436:6: (lv_parameters_10_0= ruleCParameter )
                    	    // InternalXc.g:2437:7: lv_parameters_10_0= ruleCParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getCProcedureAccess().getParametersCParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_10_0=ruleCParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCProcedureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_10_0,
                    	    								"ac.soton.xtext.c.Xc.CParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getCProcedureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:2460:3: (otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==26) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalXc.g:2461:4: otherlv_12= 'localVariables' otherlv_13= '{' ( (lv_localVariables_14_0= ruleCVariable ) ) (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getCProcedureAccess().getLocalVariablesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getCProcedureAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalXc.g:2469:4: ( (lv_localVariables_14_0= ruleCVariable ) )
                    // InternalXc.g:2470:5: (lv_localVariables_14_0= ruleCVariable )
                    {
                    // InternalXc.g:2470:5: (lv_localVariables_14_0= ruleCVariable )
                    // InternalXc.g:2471:6: lv_localVariables_14_0= ruleCVariable
                    {

                    						newCompositeNode(grammarAccess.getCProcedureAccess().getLocalVariablesCVariableParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_localVariables_14_0=ruleCVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCProcedureRule());
                    						}
                    						add(
                    							current,
                    							"localVariables",
                    							lv_localVariables_14_0,
                    							"ac.soton.xtext.c.Xc.CVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:2488:4: (otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==15) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalXc.g:2489:5: otherlv_15= ',' ( (lv_localVariables_16_0= ruleCVariable ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCProcedureAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalXc.g:2493:5: ( (lv_localVariables_16_0= ruleCVariable ) )
                    	    // InternalXc.g:2494:6: (lv_localVariables_16_0= ruleCVariable )
                    	    {
                    	    // InternalXc.g:2494:6: (lv_localVariables_16_0= ruleCVariable )
                    	    // InternalXc.g:2495:7: lv_localVariables_16_0= ruleCVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getCProcedureAccess().getLocalVariablesCVariableParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_localVariables_16_0=ruleCVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCProcedureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"localVariables",
                    	    								lv_localVariables_16_0,
                    	    								"ac.soton.xtext.c.Xc.CVariable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_29); 

                    				newLeafNode(otherlv_17, grammarAccess.getCProcedureAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:2518:3: (otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==27) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalXc.g:2519:4: otherlv_18= 'body' otherlv_19= '{' ( (lv_body_20_0= ruleCExpression ) ) (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getCProcedureAccess().getBodyKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getCProcedureAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXc.g:2527:4: ( (lv_body_20_0= ruleCExpression ) )
                    // InternalXc.g:2528:5: (lv_body_20_0= ruleCExpression )
                    {
                    // InternalXc.g:2528:5: (lv_body_20_0= ruleCExpression )
                    // InternalXc.g:2529:6: lv_body_20_0= ruleCExpression
                    {

                    						newCompositeNode(grammarAccess.getCProcedureAccess().getBodyCExpressionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_body_20_0=ruleCExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCProcedureRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_20_0,
                    							"ac.soton.xtext.c.Xc.CExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:2546:4: (otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==15) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalXc.g:2547:5: otherlv_21= ',' ( (lv_body_22_0= ruleCExpression ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getCProcedureAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXc.g:2551:5: ( (lv_body_22_0= ruleCExpression ) )
                    	    // InternalXc.g:2552:6: (lv_body_22_0= ruleCExpression )
                    	    {
                    	    // InternalXc.g:2552:6: (lv_body_22_0= ruleCExpression )
                    	    // InternalXc.g:2553:7: lv_body_22_0= ruleCExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCProcedureAccess().getBodyCExpressionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_body_22_0=ruleCExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCProcedureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_22_0,
                    	    								"ac.soton.xtext.c.Xc.CExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_31); 

                    				newLeafNode(otherlv_23, grammarAccess.getCProcedureAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalXc.g:2576:3: (otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==28) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalXc.g:2577:4: otherlv_24= 'preconditions' otherlv_25= '{' ( (lv_preconditions_26_0= ruleCPreCondition ) ) (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_24, grammarAccess.getCProcedureAccess().getPreconditionsKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_25, grammarAccess.getCProcedureAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalXc.g:2585:4: ( (lv_preconditions_26_0= ruleCPreCondition ) )
                    // InternalXc.g:2586:5: (lv_preconditions_26_0= ruleCPreCondition )
                    {
                    // InternalXc.g:2586:5: (lv_preconditions_26_0= ruleCPreCondition )
                    // InternalXc.g:2587:6: lv_preconditions_26_0= ruleCPreCondition
                    {

                    						newCompositeNode(grammarAccess.getCProcedureAccess().getPreconditionsCPreConditionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_preconditions_26_0=ruleCPreCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCProcedureRule());
                    						}
                    						add(
                    							current,
                    							"preconditions",
                    							lv_preconditions_26_0,
                    							"ac.soton.xtext.c.Xc.CPreCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:2604:4: (otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==15) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalXc.g:2605:5: otherlv_27= ',' ( (lv_preconditions_28_0= ruleCPreCondition ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FOLLOW_30); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getCProcedureAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalXc.g:2609:5: ( (lv_preconditions_28_0= ruleCPreCondition ) )
                    	    // InternalXc.g:2610:6: (lv_preconditions_28_0= ruleCPreCondition )
                    	    {
                    	    // InternalXc.g:2610:6: (lv_preconditions_28_0= ruleCPreCondition )
                    	    // InternalXc.g:2611:7: lv_preconditions_28_0= ruleCPreCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getCProcedureAccess().getPreconditionsCPreConditionParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_preconditions_28_0=ruleCPreCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCProcedureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"preconditions",
                    	    								lv_preconditions_28_0,
                    	    								"ac.soton.xtext.c.Xc.CPreCondition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_29, grammarAccess.getCProcedureAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getCProcedureAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCProcedure"


    // $ANTLR start "entryRuleCArrayVariable"
    // InternalXc.g:2642:1: entryRuleCArrayVariable returns [EObject current=null] : iv_ruleCArrayVariable= ruleCArrayVariable EOF ;
    public final EObject entryRuleCArrayVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCArrayVariable = null;


        try {
            // InternalXc.g:2642:55: (iv_ruleCArrayVariable= ruleCArrayVariable EOF )
            // InternalXc.g:2643:2: iv_ruleCArrayVariable= ruleCArrayVariable EOF
            {
             newCompositeNode(grammarAccess.getCArrayVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCArrayVariable=ruleCArrayVariable();

            state._fsp--;

             current =iv_ruleCArrayVariable; 
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
    // $ANTLR end "entryRuleCArrayVariable"


    // $ANTLR start "ruleCArrayVariable"
    // InternalXc.g:2649:1: ruleCArrayVariable returns [EObject current=null] : ( () ( (lv_isConstant_1_0= 'isConstant' ) )? otherlv_2= 'CArrayVariable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )? (otherlv_11= 'elementType' ( (lv_elementType_12_0= ruleEString ) ) )? (otherlv_13= 'size' ( (lv_size_14_0= ruleEInt ) ) )? (otherlv_15= 'superType' ( ( ruleEString ) ) )? (otherlv_17= 'arrayElements' otherlv_18= '{' ( (lv_arrayElements_19_0= ruleCArrayElement ) ) (otherlv_20= ',' ( (lv_arrayElements_21_0= ruleCArrayElement ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleCArrayVariable() throws RecognitionException {
        EObject current = null;

        Token lv_isConstant_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_endname_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_type_10_0 = null;

        AntlrDatatypeRuleToken lv_elementType_12_0 = null;

        AntlrDatatypeRuleToken lv_size_14_0 = null;

        EObject lv_arrayElements_19_0 = null;

        EObject lv_arrayElements_21_0 = null;



        	enterRule();

        try {
            // InternalXc.g:2655:2: ( ( () ( (lv_isConstant_1_0= 'isConstant' ) )? otherlv_2= 'CArrayVariable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )? (otherlv_11= 'elementType' ( (lv_elementType_12_0= ruleEString ) ) )? (otherlv_13= 'size' ( (lv_size_14_0= ruleEInt ) ) )? (otherlv_15= 'superType' ( ( ruleEString ) ) )? (otherlv_17= 'arrayElements' otherlv_18= '{' ( (lv_arrayElements_19_0= ruleCArrayElement ) ) (otherlv_20= ',' ( (lv_arrayElements_21_0= ruleCArrayElement ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalXc.g:2656:2: ( () ( (lv_isConstant_1_0= 'isConstant' ) )? otherlv_2= 'CArrayVariable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )? (otherlv_11= 'elementType' ( (lv_elementType_12_0= ruleEString ) ) )? (otherlv_13= 'size' ( (lv_size_14_0= ruleEInt ) ) )? (otherlv_15= 'superType' ( ( ruleEString ) ) )? (otherlv_17= 'arrayElements' otherlv_18= '{' ( (lv_arrayElements_19_0= ruleCArrayElement ) ) (otherlv_20= ',' ( (lv_arrayElements_21_0= ruleCArrayElement ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalXc.g:2656:2: ( () ( (lv_isConstant_1_0= 'isConstant' ) )? otherlv_2= 'CArrayVariable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )? (otherlv_11= 'elementType' ( (lv_elementType_12_0= ruleEString ) ) )? (otherlv_13= 'size' ( (lv_size_14_0= ruleEInt ) ) )? (otherlv_15= 'superType' ( ( ruleEString ) ) )? (otherlv_17= 'arrayElements' otherlv_18= '{' ( (lv_arrayElements_19_0= ruleCArrayElement ) ) (otherlv_20= ',' ( (lv_arrayElements_21_0= ruleCArrayElement ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // InternalXc.g:2657:3: () ( (lv_isConstant_1_0= 'isConstant' ) )? otherlv_2= 'CArrayVariable' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )? (otherlv_11= 'elementType' ( (lv_elementType_12_0= ruleEString ) ) )? (otherlv_13= 'size' ( (lv_size_14_0= ruleEInt ) ) )? (otherlv_15= 'superType' ( ( ruleEString ) ) )? (otherlv_17= 'arrayElements' otherlv_18= '{' ( (lv_arrayElements_19_0= ruleCArrayElement ) ) (otherlv_20= ',' ( (lv_arrayElements_21_0= ruleCArrayElement ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            // InternalXc.g:2657:3: ()
            // InternalXc.g:2658:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCArrayVariableAccess().getCArrayVariableAction_0(),
            					current);
            			

            }

            // InternalXc.g:2664:3: ( (lv_isConstant_1_0= 'isConstant' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==29) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalXc.g:2665:4: (lv_isConstant_1_0= 'isConstant' )
                    {
                    // InternalXc.g:2665:4: (lv_isConstant_1_0= 'isConstant' )
                    // InternalXc.g:2666:5: lv_isConstant_1_0= 'isConstant'
                    {
                    lv_isConstant_1_0=(Token)match(input,29,FOLLOW_45); 

                    					newLeafNode(lv_isConstant_1_0, grammarAccess.getCArrayVariableAccess().getIsConstantIsConstantKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCArrayVariableRule());
                    					}
                    					setWithLastConsumed(current, "isConstant", lv_isConstant_1_0 != null, "isConstant");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCArrayVariableAccess().getCArrayVariableKeyword_2());
            		
            // InternalXc.g:2682:3: ( (lv_name_3_0= ruleEString ) )
            // InternalXc.g:2683:4: (lv_name_3_0= ruleEString )
            {
            // InternalXc.g:2683:4: (lv_name_3_0= ruleEString )
            // InternalXc.g:2684:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCArrayVariableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCArrayVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getCArrayVariableAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXc.g:2705:3: (otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==13) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalXc.g:2706:4: otherlv_5= 'endname' ( (lv_endname_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCArrayVariableAccess().getEndnameKeyword_5_0());
                    			
                    // InternalXc.g:2710:4: ( (lv_endname_6_0= ruleEString ) )
                    // InternalXc.g:2711:5: (lv_endname_6_0= ruleEString )
                    {
                    // InternalXc.g:2711:5: (lv_endname_6_0= ruleEString )
                    // InternalXc.g:2712:6: lv_endname_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCArrayVariableAccess().getEndnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_endname_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArrayVariableRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_6_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:2730:3: (otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==31) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalXc.g:2731:4: otherlv_7= 'value' ( (lv_value_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCArrayVariableAccess().getValueKeyword_6_0());
                    			
                    // InternalXc.g:2735:4: ( (lv_value_8_0= ruleEString ) )
                    // InternalXc.g:2736:5: (lv_value_8_0= ruleEString )
                    {
                    // InternalXc.g:2736:5: (lv_value_8_0= ruleEString )
                    // InternalXc.g:2737:6: lv_value_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCArrayVariableAccess().getValueEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_value_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArrayVariableRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:2755:3: (otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==32) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalXc.g:2756:4: otherlv_9= 'type' ( (lv_type_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCArrayVariableAccess().getTypeKeyword_7_0());
                    			
                    // InternalXc.g:2760:4: ( (lv_type_10_0= ruleEString ) )
                    // InternalXc.g:2761:5: (lv_type_10_0= ruleEString )
                    {
                    // InternalXc.g:2761:5: (lv_type_10_0= ruleEString )
                    // InternalXc.g:2762:6: lv_type_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCArrayVariableAccess().getTypeEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_type_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArrayVariableRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_10_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:2780:3: (otherlv_11= 'elementType' ( (lv_elementType_12_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==45) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalXc.g:2781:4: otherlv_11= 'elementType' ( (lv_elementType_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getCArrayVariableAccess().getElementTypeKeyword_8_0());
                    			
                    // InternalXc.g:2785:4: ( (lv_elementType_12_0= ruleEString ) )
                    // InternalXc.g:2786:5: (lv_elementType_12_0= ruleEString )
                    {
                    // InternalXc.g:2786:5: (lv_elementType_12_0= ruleEString )
                    // InternalXc.g:2787:6: lv_elementType_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCArrayVariableAccess().getElementTypeEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_elementType_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArrayVariableRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_12_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:2805:3: (otherlv_13= 'size' ( (lv_size_14_0= ruleEInt ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==46) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalXc.g:2806:4: otherlv_13= 'size' ( (lv_size_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,46,FOLLOW_51); 

                    				newLeafNode(otherlv_13, grammarAccess.getCArrayVariableAccess().getSizeKeyword_9_0());
                    			
                    // InternalXc.g:2810:4: ( (lv_size_14_0= ruleEInt ) )
                    // InternalXc.g:2811:5: (lv_size_14_0= ruleEInt )
                    {
                    // InternalXc.g:2811:5: (lv_size_14_0= ruleEInt )
                    // InternalXc.g:2812:6: lv_size_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCArrayVariableAccess().getSizeEIntParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_size_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArrayVariableRule());
                    						}
                    						set(
                    							current,
                    							"size",
                    							lv_size_14_0,
                    							"ac.soton.xtext.c.Xc.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:2830:3: (otherlv_15= 'superType' ( ( ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==47) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalXc.g:2831:4: otherlv_15= 'superType' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getCArrayVariableAccess().getSuperTypeKeyword_10_0());
                    			
                    // InternalXc.g:2835:4: ( ( ruleEString ) )
                    // InternalXc.g:2836:5: ( ruleEString )
                    {
                    // InternalXc.g:2836:5: ( ruleEString )
                    // InternalXc.g:2837:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCArrayVariableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCArrayVariableAccess().getSuperTypeCTypeCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:2852:3: (otherlv_17= 'arrayElements' otherlv_18= '{' ( (lv_arrayElements_19_0= ruleCArrayElement ) ) (otherlv_20= ',' ( (lv_arrayElements_21_0= ruleCArrayElement ) ) )* otherlv_22= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==48) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalXc.g:2853:4: otherlv_17= 'arrayElements' otherlv_18= '{' ( (lv_arrayElements_19_0= ruleCArrayElement ) ) (otherlv_20= ',' ( (lv_arrayElements_21_0= ruleCArrayElement ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getCArrayVariableAccess().getArrayElementsKeyword_11_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_54); 

                    				newLeafNode(otherlv_18, grammarAccess.getCArrayVariableAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalXc.g:2861:4: ( (lv_arrayElements_19_0= ruleCArrayElement ) )
                    // InternalXc.g:2862:5: (lv_arrayElements_19_0= ruleCArrayElement )
                    {
                    // InternalXc.g:2862:5: (lv_arrayElements_19_0= ruleCArrayElement )
                    // InternalXc.g:2863:6: lv_arrayElements_19_0= ruleCArrayElement
                    {

                    						newCompositeNode(grammarAccess.getCArrayVariableAccess().getArrayElementsCArrayElementParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_arrayElements_19_0=ruleCArrayElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArrayVariableRule());
                    						}
                    						add(
                    							current,
                    							"arrayElements",
                    							lv_arrayElements_19_0,
                    							"ac.soton.xtext.c.Xc.CArrayElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:2880:4: (otherlv_20= ',' ( (lv_arrayElements_21_0= ruleCArrayElement ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==15) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalXc.g:2881:5: otherlv_20= ',' ( (lv_arrayElements_21_0= ruleCArrayElement ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_54); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getCArrayVariableAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalXc.g:2885:5: ( (lv_arrayElements_21_0= ruleCArrayElement ) )
                    	    // InternalXc.g:2886:6: (lv_arrayElements_21_0= ruleCArrayElement )
                    	    {
                    	    // InternalXc.g:2886:6: (lv_arrayElements_21_0= ruleCArrayElement )
                    	    // InternalXc.g:2887:7: lv_arrayElements_21_0= ruleCArrayElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getCArrayVariableAccess().getArrayElementsCArrayElementParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_arrayElements_21_0=ruleCArrayElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCArrayVariableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arrayElements",
                    	    								lv_arrayElements_21_0,
                    	    								"ac.soton.xtext.c.Xc.CArrayElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_22, grammarAccess.getCArrayVariableAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getCArrayVariableAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleCArrayVariable"


    // $ANTLR start "entryRuleEInt"
    // InternalXc.g:2918:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalXc.g:2918:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalXc.g:2919:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalXc.g:2925:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalXc.g:2931:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalXc.g:2932:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalXc.g:2932:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalXc.g:2933:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalXc.g:2933:3: (kw= '-' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==49) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalXc.g:2934:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_55); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCArrayElement"
    // InternalXc.g:2951:1: entryRuleCArrayElement returns [EObject current=null] : iv_ruleCArrayElement= ruleCArrayElement EOF ;
    public final EObject entryRuleCArrayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCArrayElement = null;


        try {
            // InternalXc.g:2951:54: (iv_ruleCArrayElement= ruleCArrayElement EOF )
            // InternalXc.g:2952:2: iv_ruleCArrayElement= ruleCArrayElement EOF
            {
             newCompositeNode(grammarAccess.getCArrayElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCArrayElement=ruleCArrayElement();

            state._fsp--;

             current =iv_ruleCArrayElement; 
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
    // $ANTLR end "entryRuleCArrayElement"


    // $ANTLR start "ruleCArrayElement"
    // InternalXc.g:2958:1: ruleCArrayElement returns [EObject current=null] : ( () otherlv_1= 'CArrayElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'index' ( (lv_index_7_0= ruleEInt ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleCArrayElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        AntlrDatatypeRuleToken lv_index_7_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalXc.g:2964:2: ( ( () otherlv_1= 'CArrayElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'index' ( (lv_index_7_0= ruleEInt ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalXc.g:2965:2: ( () otherlv_1= 'CArrayElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'index' ( (lv_index_7_0= ruleEInt ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalXc.g:2965:2: ( () otherlv_1= 'CArrayElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'index' ( (lv_index_7_0= ruleEInt ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalXc.g:2966:3: () otherlv_1= 'CArrayElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'index' ( (lv_index_7_0= ruleEInt ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalXc.g:2966:3: ()
            // InternalXc.g:2967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCArrayElementAccess().getCArrayElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCArrayElementAccess().getCArrayElementKeyword_1());
            		
            // InternalXc.g:2977:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:2978:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:2978:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:2979:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCArrayElementAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCArrayElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getCArrayElementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:3000:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==13) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalXc.g:3001:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCArrayElementAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:3005:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:3006:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:3006:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:3007:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCArrayElementAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArrayElementRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3025:3: (otherlv_6= 'index' ( (lv_index_7_0= ruleEInt ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==51) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalXc.g:3026:4: otherlv_6= 'index' ( (lv_index_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_51); 

                    				newLeafNode(otherlv_6, grammarAccess.getCArrayElementAccess().getIndexKeyword_5_0());
                    			
                    // InternalXc.g:3030:4: ( (lv_index_7_0= ruleEInt ) )
                    // InternalXc.g:3031:5: (lv_index_7_0= ruleEInt )
                    {
                    // InternalXc.g:3031:5: (lv_index_7_0= ruleEInt )
                    // InternalXc.g:3032:6: lv_index_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCArrayElementAccess().getIndexEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_index_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArrayElementRule());
                    						}
                    						set(
                    							current,
                    							"index",
                    							lv_index_7_0,
                    							"ac.soton.xtext.c.Xc.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3050:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==31) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalXc.g:3051:4: otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getCArrayElementAccess().getValueKeyword_6_0());
                    			
                    // InternalXc.g:3055:4: ( (lv_value_9_0= ruleEString ) )
                    // InternalXc.g:3056:5: (lv_value_9_0= ruleEString )
                    {
                    // InternalXc.g:3056:5: (lv_value_9_0= ruleEString )
                    // InternalXc.g:3057:6: lv_value_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCArrayElementAccess().getValueEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArrayElementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCArrayElementAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleCArrayElement"


    // $ANTLR start "entryRuleCStruct"
    // InternalXc.g:3083:1: entryRuleCStruct returns [EObject current=null] : iv_ruleCStruct= ruleCStruct EOF ;
    public final EObject entryRuleCStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCStruct = null;


        try {
            // InternalXc.g:3083:48: (iv_ruleCStruct= ruleCStruct EOF )
            // InternalXc.g:3084:2: iv_ruleCStruct= ruleCStruct EOF
            {
             newCompositeNode(grammarAccess.getCStructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCStruct=ruleCStruct();

            state._fsp--;

             current =iv_ruleCStruct; 
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
    // $ANTLR end "entryRuleCStruct"


    // $ANTLR start "ruleCStruct"
    // InternalXc.g:3090:1: ruleCStruct returns [EObject current=null] : ( () otherlv_1= 'CStruct' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? (otherlv_8= 'superType' ( ( ruleEString ) ) )? (otherlv_10= 'fields' otherlv_11= '{' ( (lv_fields_12_0= ruleCField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleCField ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleCStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;

        EObject lv_fields_12_0 = null;

        EObject lv_fields_14_0 = null;



        	enterRule();

        try {
            // InternalXc.g:3096:2: ( ( () otherlv_1= 'CStruct' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? (otherlv_8= 'superType' ( ( ruleEString ) ) )? (otherlv_10= 'fields' otherlv_11= '{' ( (lv_fields_12_0= ruleCField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleCField ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalXc.g:3097:2: ( () otherlv_1= 'CStruct' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? (otherlv_8= 'superType' ( ( ruleEString ) ) )? (otherlv_10= 'fields' otherlv_11= '{' ( (lv_fields_12_0= ruleCField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleCField ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalXc.g:3097:2: ( () otherlv_1= 'CStruct' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? (otherlv_8= 'superType' ( ( ruleEString ) ) )? (otherlv_10= 'fields' otherlv_11= '{' ( (lv_fields_12_0= ruleCField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleCField ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalXc.g:3098:3: () otherlv_1= 'CStruct' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? (otherlv_8= 'superType' ( ( ruleEString ) ) )? (otherlv_10= 'fields' otherlv_11= '{' ( (lv_fields_12_0= ruleCField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleCField ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalXc.g:3098:3: ()
            // InternalXc.g:3099:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCStructAccess().getCStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCStructAccess().getCStructKeyword_1());
            		
            // InternalXc.g:3109:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:3110:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:3110:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:3111:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCStructAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCStructRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getCStructAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:3132:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==13) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalXc.g:3133:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCStructAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:3137:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:3138:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:3138:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:3139:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCStructAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCStructRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3157:3: (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==32) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalXc.g:3158:4: otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCStructAccess().getTypeKeyword_5_0());
                    			
                    // InternalXc.g:3162:4: ( (lv_type_7_0= ruleEString ) )
                    // InternalXc.g:3163:5: (lv_type_7_0= ruleEString )
                    {
                    // InternalXc.g:3163:5: (lv_type_7_0= ruleEString )
                    // InternalXc.g:3164:6: lv_type_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCStructAccess().getTypeEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_type_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCStructRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3182:3: (otherlv_8= 'superType' ( ( ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==47) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalXc.g:3183:4: otherlv_8= 'superType' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getCStructAccess().getSuperTypeKeyword_6_0());
                    			
                    // InternalXc.g:3187:4: ( ( ruleEString ) )
                    // InternalXc.g:3188:5: ( ruleEString )
                    {
                    // InternalXc.g:3188:5: ( ruleEString )
                    // InternalXc.g:3189:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCStructRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCStructAccess().getSuperTypeCTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3204:3: (otherlv_10= 'fields' otherlv_11= '{' ( (lv_fields_12_0= ruleCField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleCField ) ) )* otherlv_15= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==53) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalXc.g:3205:4: otherlv_10= 'fields' otherlv_11= '{' ( (lv_fields_12_0= ruleCField ) ) (otherlv_13= ',' ( (lv_fields_14_0= ruleCField ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getCStructAccess().getFieldsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_63); 

                    				newLeafNode(otherlv_11, grammarAccess.getCStructAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalXc.g:3213:4: ( (lv_fields_12_0= ruleCField ) )
                    // InternalXc.g:3214:5: (lv_fields_12_0= ruleCField )
                    {
                    // InternalXc.g:3214:5: (lv_fields_12_0= ruleCField )
                    // InternalXc.g:3215:6: lv_fields_12_0= ruleCField
                    {

                    						newCompositeNode(grammarAccess.getCStructAccess().getFieldsCFieldParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_fields_12_0=ruleCField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCStructRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_12_0,
                    							"ac.soton.xtext.c.Xc.CField");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:3232:4: (otherlv_13= ',' ( (lv_fields_14_0= ruleCField ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==15) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalXc.g:3233:5: otherlv_13= ',' ( (lv_fields_14_0= ruleCField ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_63); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCStructAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXc.g:3237:5: ( (lv_fields_14_0= ruleCField ) )
                    	    // InternalXc.g:3238:6: (lv_fields_14_0= ruleCField )
                    	    {
                    	    // InternalXc.g:3238:6: (lv_fields_14_0= ruleCField )
                    	    // InternalXc.g:3239:7: lv_fields_14_0= ruleCField
                    	    {

                    	    							newCompositeNode(grammarAccess.getCStructAccess().getFieldsCFieldParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_fields_14_0=ruleCField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCStructRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_14_0,
                    	    								"ac.soton.xtext.c.Xc.CField");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getCStructAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getCStructAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCStruct"


    // $ANTLR start "entryRuleCField"
    // InternalXc.g:3270:1: entryRuleCField returns [EObject current=null] : iv_ruleCField= ruleCField EOF ;
    public final EObject entryRuleCField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCField = null;


        try {
            // InternalXc.g:3270:47: (iv_ruleCField= ruleCField EOF )
            // InternalXc.g:3271:2: iv_ruleCField= ruleCField EOF
            {
             newCompositeNode(grammarAccess.getCFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCField=ruleCField();

            state._fsp--;

             current =iv_ruleCField; 
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
    // $ANTLR end "entryRuleCField"


    // $ANTLR start "ruleCField"
    // InternalXc.g:3277:1: ruleCField returns [EObject current=null] : ( () otherlv_1= 'CField' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleCField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;



        	enterRule();

        try {
            // InternalXc.g:3283:2: ( ( () otherlv_1= 'CField' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalXc.g:3284:2: ( () otherlv_1= 'CField' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalXc.g:3284:2: ( () otherlv_1= 'CField' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalXc.g:3285:3: () otherlv_1= 'CField' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalXc.g:3285:3: ()
            // InternalXc.g:3286:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCFieldAccess().getCFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCFieldAccess().getCFieldKeyword_1());
            		
            // InternalXc.g:3296:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:3297:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:3297:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:3298:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCFieldAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getCFieldAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:3319:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==13) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalXc.g:3320:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCFieldAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:3324:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:3325:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:3325:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:3326:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCFieldAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCFieldRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCFieldAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCField"


    // $ANTLR start "entryRuleCEnumeration"
    // InternalXc.g:3352:1: entryRuleCEnumeration returns [EObject current=null] : iv_ruleCEnumeration= ruleCEnumeration EOF ;
    public final EObject entryRuleCEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCEnumeration = null;


        try {
            // InternalXc.g:3352:53: (iv_ruleCEnumeration= ruleCEnumeration EOF )
            // InternalXc.g:3353:2: iv_ruleCEnumeration= ruleCEnumeration EOF
            {
             newCompositeNode(grammarAccess.getCEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCEnumeration=ruleCEnumeration();

            state._fsp--;

             current =iv_ruleCEnumeration; 
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
    // $ANTLR end "entryRuleCEnumeration"


    // $ANTLR start "ruleCEnumeration"
    // InternalXc.g:3359:1: ruleCEnumeration returns [EObject current=null] : ( () otherlv_1= 'CEnumeration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'enumProperties' otherlv_7= '{' ( (lv_enumProperties_8_0= ruleCEnumProperties ) ) (otherlv_9= ',' ( (lv_enumProperties_10_0= ruleCEnumProperties ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleCEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        EObject lv_enumProperties_8_0 = null;

        EObject lv_enumProperties_10_0 = null;



        	enterRule();

        try {
            // InternalXc.g:3365:2: ( ( () otherlv_1= 'CEnumeration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'enumProperties' otherlv_7= '{' ( (lv_enumProperties_8_0= ruleCEnumProperties ) ) (otherlv_9= ',' ( (lv_enumProperties_10_0= ruleCEnumProperties ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalXc.g:3366:2: ( () otherlv_1= 'CEnumeration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'enumProperties' otherlv_7= '{' ( (lv_enumProperties_8_0= ruleCEnumProperties ) ) (otherlv_9= ',' ( (lv_enumProperties_10_0= ruleCEnumProperties ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalXc.g:3366:2: ( () otherlv_1= 'CEnumeration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'enumProperties' otherlv_7= '{' ( (lv_enumProperties_8_0= ruleCEnumProperties ) ) (otherlv_9= ',' ( (lv_enumProperties_10_0= ruleCEnumProperties ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalXc.g:3367:3: () otherlv_1= 'CEnumeration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'enumProperties' otherlv_7= '{' ( (lv_enumProperties_8_0= ruleCEnumProperties ) ) (otherlv_9= ',' ( (lv_enumProperties_10_0= ruleCEnumProperties ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalXc.g:3367:3: ()
            // InternalXc.g:3368:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCEnumerationAccess().getCEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCEnumerationAccess().getCEnumerationKeyword_1());
            		
            // InternalXc.g:3378:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:3379:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:3379:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:3380:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCEnumerationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCEnumerationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_3, grammarAccess.getCEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:3401:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==13) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalXc.g:3402:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCEnumerationAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:3406:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:3407:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:3407:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:3408:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCEnumerationAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCEnumerationRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3426:3: (otherlv_6= 'enumProperties' otherlv_7= '{' ( (lv_enumProperties_8_0= ruleCEnumProperties ) ) (otherlv_9= ',' ( (lv_enumProperties_10_0= ruleCEnumProperties ) ) )* otherlv_11= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==56) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalXc.g:3427:4: otherlv_6= 'enumProperties' otherlv_7= '{' ( (lv_enumProperties_8_0= ruleCEnumProperties ) ) (otherlv_9= ',' ( (lv_enumProperties_10_0= ruleCEnumProperties ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCEnumerationAccess().getEnumPropertiesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_66); 

                    				newLeafNode(otherlv_7, grammarAccess.getCEnumerationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalXc.g:3435:4: ( (lv_enumProperties_8_0= ruleCEnumProperties ) )
                    // InternalXc.g:3436:5: (lv_enumProperties_8_0= ruleCEnumProperties )
                    {
                    // InternalXc.g:3436:5: (lv_enumProperties_8_0= ruleCEnumProperties )
                    // InternalXc.g:3437:6: lv_enumProperties_8_0= ruleCEnumProperties
                    {

                    						newCompositeNode(grammarAccess.getCEnumerationAccess().getEnumPropertiesCEnumPropertiesParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_enumProperties_8_0=ruleCEnumProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCEnumerationRule());
                    						}
                    						add(
                    							current,
                    							"enumProperties",
                    							lv_enumProperties_8_0,
                    							"ac.soton.xtext.c.Xc.CEnumProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:3454:4: (otherlv_9= ',' ( (lv_enumProperties_10_0= ruleCEnumProperties ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==15) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalXc.g:3455:5: otherlv_9= ',' ( (lv_enumProperties_10_0= ruleCEnumProperties ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_66); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCEnumerationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalXc.g:3459:5: ( (lv_enumProperties_10_0= ruleCEnumProperties ) )
                    	    // InternalXc.g:3460:6: (lv_enumProperties_10_0= ruleCEnumProperties )
                    	    {
                    	    // InternalXc.g:3460:6: (lv_enumProperties_10_0= ruleCEnumProperties )
                    	    // InternalXc.g:3461:7: lv_enumProperties_10_0= ruleCEnumProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getCEnumerationAccess().getEnumPropertiesCEnumPropertiesParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_enumProperties_10_0=ruleCEnumProperties();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCEnumerationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"enumProperties",
                    	    								lv_enumProperties_10_0,
                    	    								"ac.soton.xtext.c.Xc.CEnumProperties");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getCEnumerationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCEnumerationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCEnumeration"


    // $ANTLR start "entryRuleCArray_Impl"
    // InternalXc.g:3492:1: entryRuleCArray_Impl returns [EObject current=null] : iv_ruleCArray_Impl= ruleCArray_Impl EOF ;
    public final EObject entryRuleCArray_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCArray_Impl = null;


        try {
            // InternalXc.g:3492:52: (iv_ruleCArray_Impl= ruleCArray_Impl EOF )
            // InternalXc.g:3493:2: iv_ruleCArray_Impl= ruleCArray_Impl EOF
            {
             newCompositeNode(grammarAccess.getCArray_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCArray_Impl=ruleCArray_Impl();

            state._fsp--;

             current =iv_ruleCArray_Impl; 
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
    // $ANTLR end "entryRuleCArray_Impl"


    // $ANTLR start "ruleCArray_Impl"
    // InternalXc.g:3499:1: ruleCArray_Impl returns [EObject current=null] : ( () otherlv_1= 'CArray' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleEString ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= ruleEInt ) ) )? (otherlv_10= 'superType' ( ( ruleEString ) ) )? (otherlv_12= 'arrayElements' otherlv_13= '{' ( (lv_arrayElements_14_0= ruleCArrayElement ) ) (otherlv_15= ',' ( (lv_arrayElements_16_0= ruleCArrayElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleCArray_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        AntlrDatatypeRuleToken lv_elementType_7_0 = null;

        AntlrDatatypeRuleToken lv_size_9_0 = null;

        EObject lv_arrayElements_14_0 = null;

        EObject lv_arrayElements_16_0 = null;



        	enterRule();

        try {
            // InternalXc.g:3505:2: ( ( () otherlv_1= 'CArray' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleEString ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= ruleEInt ) ) )? (otherlv_10= 'superType' ( ( ruleEString ) ) )? (otherlv_12= 'arrayElements' otherlv_13= '{' ( (lv_arrayElements_14_0= ruleCArrayElement ) ) (otherlv_15= ',' ( (lv_arrayElements_16_0= ruleCArrayElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalXc.g:3506:2: ( () otherlv_1= 'CArray' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleEString ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= ruleEInt ) ) )? (otherlv_10= 'superType' ( ( ruleEString ) ) )? (otherlv_12= 'arrayElements' otherlv_13= '{' ( (lv_arrayElements_14_0= ruleCArrayElement ) ) (otherlv_15= ',' ( (lv_arrayElements_16_0= ruleCArrayElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalXc.g:3506:2: ( () otherlv_1= 'CArray' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleEString ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= ruleEInt ) ) )? (otherlv_10= 'superType' ( ( ruleEString ) ) )? (otherlv_12= 'arrayElements' otherlv_13= '{' ( (lv_arrayElements_14_0= ruleCArrayElement ) ) (otherlv_15= ',' ( (lv_arrayElements_16_0= ruleCArrayElement ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalXc.g:3507:3: () otherlv_1= 'CArray' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleEString ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= ruleEInt ) ) )? (otherlv_10= 'superType' ( ( ruleEString ) ) )? (otherlv_12= 'arrayElements' otherlv_13= '{' ( (lv_arrayElements_14_0= ruleCArrayElement ) ) (otherlv_15= ',' ( (lv_arrayElements_16_0= ruleCArrayElement ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalXc.g:3507:3: ()
            // InternalXc.g:3508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCArray_ImplAccess().getCArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCArray_ImplAccess().getCArrayKeyword_1());
            		
            // InternalXc.g:3518:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:3519:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:3519:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:3520:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCArray_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCArray_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_67); 

            			newLeafNode(otherlv_3, grammarAccess.getCArray_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:3541:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==13) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalXc.g:3542:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCArray_ImplAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:3546:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:3547:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:3547:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:3548:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCArray_ImplAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArray_ImplRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3566:3: (otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==45) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalXc.g:3567:4: otherlv_6= 'elementType' ( (lv_elementType_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCArray_ImplAccess().getElementTypeKeyword_5_0());
                    			
                    // InternalXc.g:3571:4: ( (lv_elementType_7_0= ruleEString ) )
                    // InternalXc.g:3572:5: (lv_elementType_7_0= ruleEString )
                    {
                    // InternalXc.g:3572:5: (lv_elementType_7_0= ruleEString )
                    // InternalXc.g:3573:6: lv_elementType_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCArray_ImplAccess().getElementTypeEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_elementType_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArray_ImplRule());
                    						}
                    						set(
                    							current,
                    							"elementType",
                    							lv_elementType_7_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3591:3: (otherlv_8= 'size' ( (lv_size_9_0= ruleEInt ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==46) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalXc.g:3592:4: otherlv_8= 'size' ( (lv_size_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_51); 

                    				newLeafNode(otherlv_8, grammarAccess.getCArray_ImplAccess().getSizeKeyword_6_0());
                    			
                    // InternalXc.g:3596:4: ( (lv_size_9_0= ruleEInt ) )
                    // InternalXc.g:3597:5: (lv_size_9_0= ruleEInt )
                    {
                    // InternalXc.g:3597:5: (lv_size_9_0= ruleEInt )
                    // InternalXc.g:3598:6: lv_size_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCArray_ImplAccess().getSizeEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_size_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArray_ImplRule());
                    						}
                    						set(
                    							current,
                    							"size",
                    							lv_size_9_0,
                    							"ac.soton.xtext.c.Xc.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3616:3: (otherlv_10= 'superType' ( ( ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==47) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalXc.g:3617:4: otherlv_10= 'superType' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getCArray_ImplAccess().getSuperTypeKeyword_7_0());
                    			
                    // InternalXc.g:3621:4: ( ( ruleEString ) )
                    // InternalXc.g:3622:5: ( ruleEString )
                    {
                    // InternalXc.g:3622:5: ( ruleEString )
                    // InternalXc.g:3623:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCArray_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCArray_ImplAccess().getSuperTypeCTypeCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3638:3: (otherlv_12= 'arrayElements' otherlv_13= '{' ( (lv_arrayElements_14_0= ruleCArrayElement ) ) (otherlv_15= ',' ( (lv_arrayElements_16_0= ruleCArrayElement ) ) )* otherlv_17= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==48) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalXc.g:3639:4: otherlv_12= 'arrayElements' otherlv_13= '{' ( (lv_arrayElements_14_0= ruleCArrayElement ) ) (otherlv_15= ',' ( (lv_arrayElements_16_0= ruleCArrayElement ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getCArray_ImplAccess().getArrayElementsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_54); 

                    				newLeafNode(otherlv_13, grammarAccess.getCArray_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalXc.g:3647:4: ( (lv_arrayElements_14_0= ruleCArrayElement ) )
                    // InternalXc.g:3648:5: (lv_arrayElements_14_0= ruleCArrayElement )
                    {
                    // InternalXc.g:3648:5: (lv_arrayElements_14_0= ruleCArrayElement )
                    // InternalXc.g:3649:6: lv_arrayElements_14_0= ruleCArrayElement
                    {

                    						newCompositeNode(grammarAccess.getCArray_ImplAccess().getArrayElementsCArrayElementParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_arrayElements_14_0=ruleCArrayElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCArray_ImplRule());
                    						}
                    						add(
                    							current,
                    							"arrayElements",
                    							lv_arrayElements_14_0,
                    							"ac.soton.xtext.c.Xc.CArrayElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXc.g:3666:4: (otherlv_15= ',' ( (lv_arrayElements_16_0= ruleCArrayElement ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==15) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalXc.g:3667:5: otherlv_15= ',' ( (lv_arrayElements_16_0= ruleCArrayElement ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_54); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCArray_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalXc.g:3671:5: ( (lv_arrayElements_16_0= ruleCArrayElement ) )
                    	    // InternalXc.g:3672:6: (lv_arrayElements_16_0= ruleCArrayElement )
                    	    {
                    	    // InternalXc.g:3672:6: (lv_arrayElements_16_0= ruleCArrayElement )
                    	    // InternalXc.g:3673:7: lv_arrayElements_16_0= ruleCArrayElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getCArray_ImplAccess().getArrayElementsCArrayElementParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_arrayElements_16_0=ruleCArrayElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCArray_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arrayElements",
                    	    								lv_arrayElements_16_0,
                    	    								"ac.soton.xtext.c.Xc.CArrayElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getCArray_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getCArray_ImplAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCArray_Impl"


    // $ANTLR start "entryRuleCPointer"
    // InternalXc.g:3704:1: entryRuleCPointer returns [EObject current=null] : iv_ruleCPointer= ruleCPointer EOF ;
    public final EObject entryRuleCPointer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCPointer = null;


        try {
            // InternalXc.g:3704:49: (iv_ruleCPointer= ruleCPointer EOF )
            // InternalXc.g:3705:2: iv_ruleCPointer= ruleCPointer EOF
            {
             newCompositeNode(grammarAccess.getCPointerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCPointer=ruleCPointer();

            state._fsp--;

             current =iv_ruleCPointer; 
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
    // $ANTLR end "entryRuleCPointer"


    // $ANTLR start "ruleCPointer"
    // InternalXc.g:3711:1: ruleCPointer returns [EObject current=null] : ( () otherlv_1= 'CPointer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleCPointer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;



        	enterRule();

        try {
            // InternalXc.g:3717:2: ( ( () otherlv_1= 'CPointer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalXc.g:3718:2: ( () otherlv_1= 'CPointer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalXc.g:3718:2: ( () otherlv_1= 'CPointer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalXc.g:3719:3: () otherlv_1= 'CPointer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalXc.g:3719:3: ()
            // InternalXc.g:3720:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCPointerAccess().getCPointerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCPointerAccess().getCPointerKeyword_1());
            		
            // InternalXc.g:3730:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:3731:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:3731:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:3732:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCPointerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCPointerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_3, grammarAccess.getCPointerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:3753:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==13) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalXc.g:3754:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCPointerAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:3758:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:3759:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:3759:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:3760:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCPointerAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCPointerRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3778:3: (otherlv_6= 'superType' ( ( ruleEString ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==47) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalXc.g:3779:4: otherlv_6= 'superType' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCPointerAccess().getSuperTypeKeyword_5_0());
                    			
                    // InternalXc.g:3783:4: ( ( ruleEString ) )
                    // InternalXc.g:3784:5: ( ruleEString )
                    {
                    // InternalXc.g:3784:5: ( ruleEString )
                    // InternalXc.g:3785:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCPointerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCPointerAccess().getSuperTypeCTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCPointerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCPointer"


    // $ANTLR start "entryRuleCDerivedType_Impl"
    // InternalXc.g:3808:1: entryRuleCDerivedType_Impl returns [EObject current=null] : iv_ruleCDerivedType_Impl= ruleCDerivedType_Impl EOF ;
    public final EObject entryRuleCDerivedType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDerivedType_Impl = null;


        try {
            // InternalXc.g:3808:58: (iv_ruleCDerivedType_Impl= ruleCDerivedType_Impl EOF )
            // InternalXc.g:3809:2: iv_ruleCDerivedType_Impl= ruleCDerivedType_Impl EOF
            {
             newCompositeNode(grammarAccess.getCDerivedType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCDerivedType_Impl=ruleCDerivedType_Impl();

            state._fsp--;

             current =iv_ruleCDerivedType_Impl; 
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
    // $ANTLR end "entryRuleCDerivedType_Impl"


    // $ANTLR start "ruleCDerivedType_Impl"
    // InternalXc.g:3815:1: ruleCDerivedType_Impl returns [EObject current=null] : ( () otherlv_1= 'CDerivedType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleCDerivedType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;



        	enterRule();

        try {
            // InternalXc.g:3821:2: ( ( () otherlv_1= 'CDerivedType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalXc.g:3822:2: ( () otherlv_1= 'CDerivedType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalXc.g:3822:2: ( () otherlv_1= 'CDerivedType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalXc.g:3823:3: () otherlv_1= 'CDerivedType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'superType' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalXc.g:3823:3: ()
            // InternalXc.g:3824:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCDerivedType_ImplAccess().getCDerivedTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCDerivedType_ImplAccess().getCDerivedTypeKeyword_1());
            		
            // InternalXc.g:3834:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:3835:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:3835:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:3836:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCDerivedType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCDerivedType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_68); 

            			newLeafNode(otherlv_3, grammarAccess.getCDerivedType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:3857:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==13) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalXc.g:3858:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCDerivedType_ImplAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:3862:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:3863:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:3863:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:3864:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCDerivedType_ImplAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCDerivedType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:3882:3: (otherlv_6= 'superType' ( ( ruleEString ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==47) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalXc.g:3883:4: otherlv_6= 'superType' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCDerivedType_ImplAccess().getSuperTypeKeyword_5_0());
                    			
                    // InternalXc.g:3887:4: ( ( ruleEString ) )
                    // InternalXc.g:3888:5: ( ruleEString )
                    {
                    // InternalXc.g:3888:5: ( ruleEString )
                    // InternalXc.g:3889:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCDerivedType_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCDerivedType_ImplAccess().getSuperTypeCTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCDerivedType_ImplAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCDerivedType_Impl"


    // $ANTLR start "entryRuleCDiscreteType_Impl"
    // InternalXc.g:3912:1: entryRuleCDiscreteType_Impl returns [EObject current=null] : iv_ruleCDiscreteType_Impl= ruleCDiscreteType_Impl EOF ;
    public final EObject entryRuleCDiscreteType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDiscreteType_Impl = null;


        try {
            // InternalXc.g:3912:59: (iv_ruleCDiscreteType_Impl= ruleCDiscreteType_Impl EOF )
            // InternalXc.g:3913:2: iv_ruleCDiscreteType_Impl= ruleCDiscreteType_Impl EOF
            {
             newCompositeNode(grammarAccess.getCDiscreteType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCDiscreteType_Impl=ruleCDiscreteType_Impl();

            state._fsp--;

             current =iv_ruleCDiscreteType_Impl; 
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
    // $ANTLR end "entryRuleCDiscreteType_Impl"


    // $ANTLR start "ruleCDiscreteType_Impl"
    // InternalXc.g:3919:1: ruleCDiscreteType_Impl returns [EObject current=null] : ( () otherlv_1= 'CDiscreteType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleCDiscreteType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;



        	enterRule();

        try {
            // InternalXc.g:3925:2: ( ( () otherlv_1= 'CDiscreteType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalXc.g:3926:2: ( () otherlv_1= 'CDiscreteType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalXc.g:3926:2: ( () otherlv_1= 'CDiscreteType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalXc.g:3927:3: () otherlv_1= 'CDiscreteType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalXc.g:3927:3: ()
            // InternalXc.g:3928:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCDiscreteType_ImplAccess().getCDiscreteTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCDiscreteType_ImplAccess().getCDiscreteTypeKeyword_1());
            		
            // InternalXc.g:3938:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:3939:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:3939:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:3940:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCDiscreteType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCDiscreteType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getCDiscreteType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:3961:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==13) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalXc.g:3962:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCDiscreteType_ImplAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:3966:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:3967:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:3967:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:3968:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCDiscreteType_ImplAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCDiscreteType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCDiscreteType_ImplAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCDiscreteType_Impl"


    // $ANTLR start "entryRuleCEnumProperties"
    // InternalXc.g:3994:1: entryRuleCEnumProperties returns [EObject current=null] : iv_ruleCEnumProperties= ruleCEnumProperties EOF ;
    public final EObject entryRuleCEnumProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCEnumProperties = null;


        try {
            // InternalXc.g:3994:56: (iv_ruleCEnumProperties= ruleCEnumProperties EOF )
            // InternalXc.g:3995:2: iv_ruleCEnumProperties= ruleCEnumProperties EOF
            {
             newCompositeNode(grammarAccess.getCEnumPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCEnumProperties=ruleCEnumProperties();

            state._fsp--;

             current =iv_ruleCEnumProperties; 
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
    // $ANTLR end "entryRuleCEnumProperties"


    // $ANTLR start "ruleCEnumProperties"
    // InternalXc.g:4001:1: ruleCEnumProperties returns [EObject current=null] : ( () otherlv_1= 'CEnumProperties' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'integralConstant' ( (lv_integralConstant_7_0= ruleEInt ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleCEnumProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endname_5_0 = null;

        AntlrDatatypeRuleToken lv_integralConstant_7_0 = null;



        	enterRule();

        try {
            // InternalXc.g:4007:2: ( ( () otherlv_1= 'CEnumProperties' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'integralConstant' ( (lv_integralConstant_7_0= ruleEInt ) ) )? otherlv_8= '}' ) )
            // InternalXc.g:4008:2: ( () otherlv_1= 'CEnumProperties' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'integralConstant' ( (lv_integralConstant_7_0= ruleEInt ) ) )? otherlv_8= '}' )
            {
            // InternalXc.g:4008:2: ( () otherlv_1= 'CEnumProperties' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'integralConstant' ( (lv_integralConstant_7_0= ruleEInt ) ) )? otherlv_8= '}' )
            // InternalXc.g:4009:3: () otherlv_1= 'CEnumProperties' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )? (otherlv_6= 'integralConstant' ( (lv_integralConstant_7_0= ruleEInt ) ) )? otherlv_8= '}'
            {
            // InternalXc.g:4009:3: ()
            // InternalXc.g:4010:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCEnumPropertiesAccess().getCEnumPropertiesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCEnumPropertiesAccess().getCEnumPropertiesKeyword_1());
            		
            // InternalXc.g:4020:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXc.g:4021:4: (lv_name_2_0= ruleEString )
            {
            // InternalXc.g:4021:4: (lv_name_2_0= ruleEString )
            // InternalXc.g:4022:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCEnumPropertiesAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCEnumPropertiesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ac.soton.xtext.c.Xc.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_70); 

            			newLeafNode(otherlv_3, grammarAccess.getCEnumPropertiesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXc.g:4043:3: (otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==13) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalXc.g:4044:4: otherlv_4= 'endname' ( (lv_endname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCEnumPropertiesAccess().getEndnameKeyword_4_0());
                    			
                    // InternalXc.g:4048:4: ( (lv_endname_5_0= ruleEString ) )
                    // InternalXc.g:4049:5: (lv_endname_5_0= ruleEString )
                    {
                    // InternalXc.g:4049:5: (lv_endname_5_0= ruleEString )
                    // InternalXc.g:4050:6: lv_endname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCEnumPropertiesAccess().getEndnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_endname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCEnumPropertiesRule());
                    						}
                    						set(
                    							current,
                    							"endname",
                    							lv_endname_5_0,
                    							"ac.soton.xtext.c.Xc.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXc.g:4068:3: (otherlv_6= 'integralConstant' ( (lv_integralConstant_7_0= ruleEInt ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==62) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalXc.g:4069:4: otherlv_6= 'integralConstant' ( (lv_integralConstant_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,62,FOLLOW_51); 

                    				newLeafNode(otherlv_6, grammarAccess.getCEnumPropertiesAccess().getIntegralConstantKeyword_5_0());
                    			
                    // InternalXc.g:4073:4: ( (lv_integralConstant_7_0= ruleEInt ) )
                    // InternalXc.g:4074:5: (lv_integralConstant_7_0= ruleEInt )
                    {
                    // InternalXc.g:4074:5: (lv_integralConstant_7_0= ruleEInt )
                    // InternalXc.g:4075:6: lv_integralConstant_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCEnumPropertiesAccess().getIntegralConstantEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_integralConstant_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCEnumPropertiesRule());
                    						}
                    						set(
                    							current,
                    							"integralConstant",
                    							lv_integralConstant_7_0,
                    							"ac.soton.xtext.c.Xc.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCEnumPropertiesAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCEnumProperties"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000792000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000790000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000A0001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100060000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000610000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x1ED0100260000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000392000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000390000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000001E012000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000001E010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000001C010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000180012000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000180010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800012000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000100012000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000014000010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000004001E012000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000004001E010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001E00180012000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001E00180010000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001E00100010000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001E00000010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001C00000010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001800000010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0008000080012000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000080010000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0020800100012000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0020800100010000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0020800000010000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0100000000012000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0001E00000012000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000800000012000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x4000000000012000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x4000000000010000L});

}