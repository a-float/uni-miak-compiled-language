// Generated from C:\Users\mati8\Desktop\Semestr5\MIAK\Colang\ColangCompiler\resources\Coolang.g4 by ANTLR 4.9.3

package me.miak.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUN=1, CONST=2, MUTABLE=3, VAR=4, OR=5, AND=6, EQ=7, NEQ=8, GT=9, LT=10, 
		GTEQ=11, LTEQ=12, PLUS=13, MINUS=14, MULT=15, DIV=16, POW=17, NOT=18, 
		HASH=19, AMP=20, INT_TYPE=21, BOOL_TYPE=22, VOID_TYPE=23, TO=24, BY=25, 
		THROUGH=26, COL=27, SCOL=28, ASSIGN=29, OPAR=30, CPAR=31, OBRACE=32, CBRACE=33, 
		OSQR=34, CSQR=35, DQUOTE=36, ARROW=37, COMMA=38, RETURN=39, FOR=40, IN=41, 
		IF=42, ELIF=43, ELSE=44, WHILE=45, TRUE=46, FALSE=47, PRINT=48, ID=49, 
		INT=50, FLOAT=51, STRING=52, COMMENT=53, SPACE=54, OTHER=55;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_stat = 2, RULE_returnStat = 3, RULE_funDefinition = 4, 
		RULE_funRetType = 5, RULE_funDefBody = 6, RULE_lambda = 7, RULE_lambdaBody = 8, 
		RULE_funDefinitionArgs = 9, RULE_funCall = 10, RULE_funCallParentheses = 11, 
		RULE_funArgs = 12, RULE_outStat = 13, RULE_assignment = 14, RULE_declaration = 15, 
		RULE_arrayCreation = 16, RULE_declarationWithAssignment = 17, RULE_type = 18, 
		RULE_funType = 19, RULE_mutability = 20, RULE_ifStat = 21, RULE_conditionBlock = 22, 
		RULE_statBlock = 23, RULE_whileStat = 24, RULE_forStat = 25, RULE_range = 26, 
		RULE_expr = 27, RULE_atom = 28, RULE_lvalue = 29, RULE_id = 30, RULE_idxAtom = 31, 
		RULE_ptrExpr = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "stat", "returnStat", "funDefinition", "funRetType", 
			"funDefBody", "lambda", "lambdaBody", "funDefinitionArgs", "funCall", 
			"funCallParentheses", "funArgs", "outStat", "assignment", "declaration", 
			"arrayCreation", "declarationWithAssignment", "type", "funType", "mutability", 
			"ifStat", "conditionBlock", "statBlock", "whileStat", "forStat", "range", 
			"expr", "atom", "lvalue", "id", "idxAtom", "ptrExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'const'", "'mut'", "'let'", "'or'", "'and'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'not'", "'#'", "'&'", "'int'", "'bool'", "'void'", "'to'", "'by'", "'::'", 
			"':'", "';'", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'\"'", 
			"'->'", "','", "'ret'", "'for'", "'in'", "'if'", "'elif'", "'else'", 
			"'while'", "'true'", "'false'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUN", "CONST", "MUTABLE", "VAR", "OR", "AND", "EQ", "NEQ", "GT", 
			"LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "POW", "NOT", "HASH", 
			"AMP", "INT_TYPE", "BOOL_TYPE", "VOID_TYPE", "TO", "BY", "THROUGH", "COL", 
			"SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "OSQR", "CSQR", 
			"DQUOTE", "ARROW", "COMMA", "RETURN", "FOR", "IN", "IF", "ELIF", "ELSE", 
			"WHILE", "TRUE", "FALSE", "PRINT", "ID", "INT", "FLOAT", "STRING", "COMMENT", 
			"SPACE", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Coolang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CoolangParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			block();
			setState(67);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUN) | (1L << CONST) | (1L << MUTABLE) | (1L << MULT) | (1L << RETURN) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(69);
				stat();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public Token OTHER;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunDefinitionContext funDefinition() {
			return getRuleContext(FunDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationWithAssignmentContext declarationWithAssignment() {
			return getRuleContext(DeclarationWithAssignmentContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public OutStatContext outStat() {
			return getRuleContext(OutStatContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(CoolangParser.SCOL, 0); }
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(CoolangParser.OTHER, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				funDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				declarationWithAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				ifStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				outStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				whileStat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				forStat();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
				arrayCreation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(84);
				funCall();
				setState(85);
				match(SCOL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(87);
				returnStat();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(88);
				((StatContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown character: " + (((StatContext)_localctx).OTHER!=null?((StatContext)_localctx).OTHER.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CoolangParser.RETURN, 0); }
		public TerminalNode SCOL() { return getToken(CoolangParser.SCOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(RETURN);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << MULT) | (1L << NOT) | (1L << AMP) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(93);
				expr(0);
				}
			}

			setState(96);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDefinitionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(CoolangParser.FUN, 0); }
		public TerminalNode ID() { return getToken(CoolangParser.ID, 0); }
		public TerminalNode COL() { return getToken(CoolangParser.COL, 0); }
		public TerminalNode OPAR() { return getToken(CoolangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CoolangParser.CPAR, 0); }
		public TerminalNode ARROW() { return getToken(CoolangParser.ARROW, 0); }
		public FunRetTypeContext funRetType() {
			return getRuleContext(FunRetTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CoolangParser.ASSIGN, 0); }
		public FunDefBodyContext funDefBody() {
			return getRuleContext(FunDefBodyContext.class,0);
		}
		public FunDefinitionArgsContext funDefinitionArgs() {
			return getRuleContext(FunDefinitionArgsContext.class,0);
		}
		public FunDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterFunDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitFunDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitFunDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefinitionContext funDefinition() throws RecognitionException {
		FunDefinitionContext _localctx = new FunDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(FUN);
			setState(99);
			match(ID);
			setState(100);
			match(COL);
			setState(101);
			match(OPAR);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(102);
				funDefinitionArgs();
				}
			}

			setState(105);
			match(CPAR);
			setState(106);
			match(ARROW);
			setState(107);
			funRetType();
			setState(108);
			match(ASSIGN);
			setState(109);
			funDefBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunRetTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID_TYPE() { return getToken(CoolangParser.VOID_TYPE, 0); }
		public FunRetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funRetType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterFunRetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitFunRetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitFunRetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunRetTypeContext funRetType() throws RecognitionException {
		FunRetTypeContext _localctx = new FunRetTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funRetType);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BOOL_TYPE:
			case OPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(VOID_TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDefBodyContext extends ParserRuleContext {
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(CoolangParser.SCOL, 0); }
		public FunDefBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterFunDefBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitFunDefBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitFunDefBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefBodyContext funDefBody() throws RecognitionException {
		FunDefBodyContext _localctx = new FunDefBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funDefBody);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				statBlock();
				}
				break;
			case MINUS:
			case MULT:
			case NOT:
			case AMP:
			case OPAR:
			case TRUE:
			case FALSE:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				expr(0);
				setState(117);
				match(SCOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(CoolangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CoolangParser.CPAR, 0); }
		public TerminalNode ARROW() { return getToken(CoolangParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public FunDefinitionArgsContext funDefinitionArgs() {
			return getRuleContext(FunDefinitionArgsContext.class,0);
		}
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(OPAR);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(122);
				funDefinitionArgs();
				}
			}

			setState(125);
			match(CPAR);
			setState(126);
			match(ARROW);
			setState(127);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdaBody);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				statBlock();
				}
				break;
			case MINUS:
			case MULT:
			case NOT:
			case AMP:
			case OPAR:
			case TRUE:
			case FALSE:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDefinitionArgsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CoolangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolangParser.ID, i);
		}
		public List<TerminalNode> COL() { return getTokens(CoolangParser.COL); }
		public TerminalNode COL(int i) {
			return getToken(CoolangParser.COL, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolangParser.COMMA, i);
		}
		public FunDefinitionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefinitionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterFunDefinitionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitFunDefinitionArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitFunDefinitionArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefinitionArgsContext funDefinitionArgs() throws RecognitionException {
		FunDefinitionArgsContext _localctx = new FunDefinitionArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funDefinitionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ID);
			setState(134);
			match(COL);
			setState(135);
			type();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(136);
				match(COMMA);
				setState(137);
				match(ID);
				setState(138);
				match(COL);
				setState(139);
				type();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunCallContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public List<FunCallParenthesesContext> funCallParentheses() {
			return getRuleContexts(FunCallParenthesesContext.class);
		}
		public FunCallParenthesesContext funCallParentheses(int i) {
			return getRuleContext(FunCallParenthesesContext.class,i);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			lvalue();
			setState(147); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(146);
					funCallParentheses();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunCallParenthesesContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(CoolangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CoolangParser.CPAR, 0); }
		public FunArgsContext funArgs() {
			return getRuleContext(FunArgsContext.class,0);
		}
		public FunCallParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCallParentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterFunCallParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitFunCallParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitFunCallParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallParenthesesContext funCallParentheses() throws RecognitionException {
		FunCallParenthesesContext _localctx = new FunCallParenthesesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funCallParentheses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			match(OPAR);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << MULT) | (1L << NOT) | (1L << AMP) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(152);
				funArgs();
				}
			}

			setState(155);
			match(CPAR);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolangParser.COMMA, i);
		}
		public FunArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterFunArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitFunArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitFunArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunArgsContext funArgs() throws RecognitionException {
		FunArgsContext _localctx = new FunArgsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funArgs);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				expr(0);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(159);
					match(COMMA);
					setState(160);
					expr(0);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutStatContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CoolangParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(CoolangParser.SCOL, 0); }
		public OutStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterOutStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitOutStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitOutStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutStatContext outStat() throws RecognitionException {
		OutStatContext _localctx = new OutStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_outStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(PRINT);
			setState(169);
			expr(0);
			setState(170);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CoolangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(CoolangParser.SCOL, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			lvalue();
			setState(173);
			match(ASSIGN);
			setState(174);
			expr(0);
			setState(175);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolangParser.ID, 0); }
		public TerminalNode COL() { return getToken(CoolangParser.COL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(CoolangParser.SCOL, 0); }
		public MutabilityContext mutability() {
			return getRuleContext(MutabilityContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST || _la==MUTABLE) {
				{
				setState(177);
				mutability();
				}
			}

			setState(180);
			match(ID);
			setState(181);
			match(COL);
			setState(182);
			type();
			setState(183);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CoolangParser.CONST, 0); }
		public TerminalNode ID() { return getToken(CoolangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolangParser.ASSIGN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(CoolangParser.SCOL, 0); }
		public List<TerminalNode> OSQR() { return getTokens(CoolangParser.OSQR); }
		public TerminalNode OSQR(int i) {
			return getToken(CoolangParser.OSQR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CSQR() { return getTokens(CoolangParser.CSQR); }
		public TerminalNode CSQR(int i) {
			return getToken(CoolangParser.CSQR, i);
		}
		public ArrayCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterArrayCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitArrayCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitArrayCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationContext arrayCreation() throws RecognitionException {
		ArrayCreationContext _localctx = new ArrayCreationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(CONST);
			setState(186);
			match(ID);
			setState(187);
			match(ASSIGN);
			setState(188);
			type();
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				match(OSQR);
				setState(190);
				expr(0);
				setState(191);
				match(CSQR);
				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OSQR );
			setState(197);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationWithAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolangParser.ID, 0); }
		public TerminalNode COL() { return getToken(CoolangParser.COL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CoolangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(CoolangParser.SCOL, 0); }
		public MutabilityContext mutability() {
			return getRuleContext(MutabilityContext.class,0);
		}
		public DeclarationWithAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationWithAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterDeclarationWithAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitDeclarationWithAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitDeclarationWithAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationWithAssignmentContext declarationWithAssignment() throws RecognitionException {
		DeclarationWithAssignmentContext _localctx = new DeclarationWithAssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarationWithAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST || _la==MUTABLE) {
				{
				setState(199);
				mutability();
				}
			}

			setState(202);
			match(ID);
			setState(203);
			match(COL);
			setState(204);
			type();
			setState(205);
			match(ASSIGN);
			setState(206);
			expr(0);
			setState(207);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(CoolangParser.INT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(CoolangParser.BOOL_TYPE, 0); }
		public FunTypeContext funType() {
			return getRuleContext(FunTypeContext.class,0);
		}
		public List<TerminalNode> MULT() { return getTokens(CoolangParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CoolangParser.MULT, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				{
				setState(209);
				match(INT_TYPE);
				}
				break;
			case BOOL_TYPE:
				{
				setState(210);
				match(BOOL_TYPE);
				}
				break;
			case OPAR:
				{
				setState(211);
				funType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					match(MULT);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunTypeContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(CoolangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(CoolangParser.CPAR, 0); }
		public TerminalNode ARROW() { return getToken(CoolangParser.ARROW, 0); }
		public FunRetTypeContext funRetType() {
			return getRuleContext(FunRetTypeContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolangParser.COMMA, i);
		}
		public FunTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterFunType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitFunType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitFunType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunTypeContext funType() throws RecognitionException {
		FunTypeContext _localctx = new FunTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(OPAR);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << BOOL_TYPE) | (1L << OPAR))) != 0)) {
				{
				setState(221);
				type();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(222);
					match(COMMA);
					setState(223);
					type();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(231);
			match(CPAR);
			setState(232);
			match(ARROW);
			setState(233);
			funRetType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MutabilityContext extends ParserRuleContext {
		public TerminalNode MUTABLE() { return getToken(CoolangParser.MUTABLE, 0); }
		public TerminalNode CONST() { return getToken(CoolangParser.CONST, 0); }
		public MutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitMutability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitMutability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutabilityContext mutability() throws RecognitionException {
		MutabilityContext _localctx = new MutabilityContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==CONST || _la==MUTABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CoolangParser.IF, 0); }
		public List<ConditionBlockContext> conditionBlock() {
			return getRuleContexts(ConditionBlockContext.class);
		}
		public ConditionBlockContext conditionBlock(int i) {
			return getRuleContext(ConditionBlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(CoolangParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(CoolangParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(CoolangParser.ELSE, 0); }
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IF);
			setState(238);
			conditionBlock();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(239);
				match(ELIF);
				setState(240);
				conditionBlock();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(246);
				match(ELSE);
				setState(247);
				statBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionBlockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public ConditionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterConditionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitConditionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitConditionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBlockContext conditionBlock() throws RecognitionException {
		ConditionBlockContext _localctx = new ConditionBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			expr(0);
			setState(251);
			statBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatBlockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(CoolangParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(CoolangParser.CBRACE, 0); }
		public StatBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterStatBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitStatBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitStatBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatBlockContext statBlock() throws RecognitionException {
		StatBlockContext _localctx = new StatBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(OBRACE);
			setState(254);
			block();
			setState(255);
			match(CBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CoolangParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(WHILE);
			setState(258);
			expr(0);
			setState(259);
			statBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CoolangParser.FOR, 0); }
		public TerminalNode ID() { return getToken(CoolangParser.ID, 0); }
		public TerminalNode IN() { return getToken(CoolangParser.IN, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public StatBlockContext statBlock() {
			return getRuleContext(StatBlockContext.class,0);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitForStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(FOR);
			setState(262);
			match(ID);
			setState(263);
			match(IN);
			setState(264);
			range();
			setState(265);
			statBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(CoolangParser.TO, 0); }
		public TerminalNode BY() { return getToken(CoolangParser.BY, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expr(0);
			setState(268);
			match(TO);
			setState(269);
			expr(0);
			setState(270);
			match(BY);
			setState(271);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunExprContext extends ExprContext {
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public FunExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterFunExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitFunExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitFunExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddressExprContext extends ExprContext {
		public TerminalNode AMP() { return getToken(CoolangParser.AMP, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public AddressExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterAddressExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitAddressExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitAddressExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(CoolangParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CoolangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolangParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(CoolangParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(CoolangParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(CoolangParser.LT, 0); }
		public TerminalNode GT() { return getToken(CoolangParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends ExprContext {
		public TerminalNode OPAR() { return getToken(CoolangParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(CoolangParser.CPAR, 0); }
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(CoolangParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(CoolangParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CoolangParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CoolangParser.DIV, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(CoolangParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(CoolangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CoolangParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointerExprContext extends ExprContext {
		public PtrExprContext ptrExpr() {
			return getRuleContext(PtrExprContext.class,0);
		}
		public PointerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterPointerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitPointerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitPointerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(CoolangParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(274);
				match(NOT);
				setState(275);
				expr(13);
				}
				break;
			case 2:
				{
				_localctx = new PointerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				ptrExpr();
				}
				break;
			case 3:
				{
				_localctx = new AddressExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(AMP);
				setState(278);
				lvalue();
				}
				break;
			case 4:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(OPAR);
				setState(280);
				expr(0);
				setState(281);
				match(CPAR);
				}
				break;
			case 5:
				{
				_localctx = new FunExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				funCall();
				}
				break;
			case 6:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				atom();
				}
				break;
			case 7:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(MINUS);
				setState(286);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(290);
						match(POW);
						setState(291);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(293);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(294);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(296);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(299);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(300);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(302);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(303);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(305);
						match(AND);
						setState(306);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(308);
						match(OR);
						setState(309);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(CoolangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CoolangParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexedAtomContext extends AtomContext {
		public IdxAtomContext idxAtom() {
			return getRuleContext(IdxAtomContext.class,0);
		}
		public IndexedAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterIndexedAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitIndexedAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitIndexedAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(CoolangParser.INT, 0); }
		public IntAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterIntAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitIntAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaAtomContext extends AtomContext {
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public LambdaAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterLambdaAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitLambdaAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitLambdaAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atom);
		int _la;
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(INT);
				}
				break;
			case 2:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				id();
				}
				break;
			case 4:
				_localctx = new IndexedAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				idxAtom();
				}
				break;
			case 5:
				_localctx = new LambdaAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				lambda();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdxAtomContext idxAtom() {
			return getRuleContext(IdxAtomContext.class,0);
		}
		public PtrExprContext ptrExpr() {
			return getRuleContext(PtrExprContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lvalue);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				idxAtom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				ptrExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolangParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdxAtomContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PtrExprContext ptrExpr() {
			return getRuleContext(PtrExprContext.class,0);
		}
		public List<TerminalNode> OSQR() { return getTokens(CoolangParser.OSQR); }
		public TerminalNode OSQR(int i) {
			return getToken(CoolangParser.OSQR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CSQR() { return getTokens(CoolangParser.CSQR); }
		public TerminalNode CSQR(int i) {
			return getToken(CoolangParser.CSQR, i);
		}
		public IdxAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idxAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterIdxAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitIdxAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitIdxAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdxAtomContext idxAtom() throws RecognitionException {
		IdxAtomContext _localctx = new IdxAtomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_idxAtom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(329);
				id();
				}
				break;
			case MULT:
				{
				setState(330);
				ptrExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(337); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(333);
					match(OSQR);
					setState(334);
					expr(0);
					setState(335);
					match(CSQR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(339); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrExprContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CoolangParser.MULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PtrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).enterPtrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolangListener ) ((CoolangListener)listener).exitPtrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolangVisitor ) return ((CoolangVisitor<? extends T>)visitor).visitPtrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrExprContext ptrExpr() throws RecognitionException {
		PtrExprContext _localctx = new PtrExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ptrExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(MULT);
			setState(342);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u015b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\5\3\5\5\5a\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5"+
		"\7t\n\7\3\b\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\5\n\u0086\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008f\n\13"+
		"\f\13\16\13\u0092\13\13\3\f\3\f\6\f\u0096\n\f\r\f\16\f\u0097\3\r\3\r\5"+
		"\r\u009c\n\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00a4\n\16\f\16\16\16\u00a7"+
		"\13\16\5\16\u00a9\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\5\21\u00b5\n\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\6\22\u00c4\n\22\r\22\16\22\u00c5\3\22\3\22\3\23\5\23\u00cb"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00d7\n\24"+
		"\3\24\7\24\u00da\n\24\f\24\16\24\u00dd\13\24\3\25\3\25\3\25\3\25\7\25"+
		"\u00e3\n\25\f\25\16\25\u00e6\13\25\5\25\u00e8\n\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00f4\n\27\f\27\16\27\u00f7\13\27"+
		"\3\27\3\27\5\27\u00fb\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0122\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0139\n\35\f\35"+
		"\16\35\u013c\13\35\3\36\3\36\3\36\3\36\3\36\5\36\u0143\n\36\3\37\3\37"+
		"\3\37\5\37\u0148\n\37\3 \3 \3!\3!\5!\u014e\n!\3!\3!\3!\3!\6!\u0154\n!"+
		"\r!\16!\u0155\3\"\3\"\3\"\3\"\2\38#\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@B\2\b\3\2\4\5\3\2\21\22\3\2\17\20\3\2\13"+
		"\16\3\2\t\n\3\2\60\61\2\u016f\2D\3\2\2\2\4J\3\2\2\2\6\\\3\2\2\2\b^\3\2"+
		"\2\2\nd\3\2\2\2\fs\3\2\2\2\16y\3\2\2\2\20{\3\2\2\2\22\u0085\3\2\2\2\24"+
		"\u0087\3\2\2\2\26\u0093\3\2\2\2\30\u0099\3\2\2\2\32\u00a8\3\2\2\2\34\u00aa"+
		"\3\2\2\2\36\u00ae\3\2\2\2 \u00b4\3\2\2\2\"\u00bb\3\2\2\2$\u00ca\3\2\2"+
		"\2&\u00d6\3\2\2\2(\u00de\3\2\2\2*\u00ed\3\2\2\2,\u00ef\3\2\2\2.\u00fc"+
		"\3\2\2\2\60\u00ff\3\2\2\2\62\u0103\3\2\2\2\64\u0107\3\2\2\2\66\u010d\3"+
		"\2\2\28\u0121\3\2\2\2:\u0142\3\2\2\2<\u0147\3\2\2\2>\u0149\3\2\2\2@\u014d"+
		"\3\2\2\2B\u0157\3\2\2\2DE\5\4\3\2EF\7\2\2\3F\3\3\2\2\2GI\5\6\4\2HG\3\2"+
		"\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\5\3\2\2\2LJ\3\2\2\2M]\5\36\20\2N]"+
		"\5\n\6\2O]\5 \21\2P]\5$\23\2Q]\5,\27\2R]\5\34\17\2S]\5\62\32\2T]\5\64"+
		"\33\2U]\5\"\22\2VW\5\26\f\2WX\7\36\2\2X]\3\2\2\2Y]\5\b\5\2Z[\79\2\2[]"+
		"\b\4\1\2\\M\3\2\2\2\\N\3\2\2\2\\O\3\2\2\2\\P\3\2\2\2\\Q\3\2\2\2\\R\3\2"+
		"\2\2\\S\3\2\2\2\\T\3\2\2\2\\U\3\2\2\2\\V\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2"+
		"]\7\3\2\2\2^`\7)\2\2_a\58\35\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\36\2"+
		"\2c\t\3\2\2\2de\7\3\2\2ef\7\63\2\2fg\7\35\2\2gi\7 \2\2hj\5\24\13\2ih\3"+
		"\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7!\2\2lm\7\'\2\2mn\5\f\7\2no\7\37\2\2op\5"+
		"\16\b\2p\13\3\2\2\2qt\5&\24\2rt\7\31\2\2sq\3\2\2\2sr\3\2\2\2t\r\3\2\2"+
		"\2uz\5\60\31\2vw\58\35\2wx\7\36\2\2xz\3\2\2\2yu\3\2\2\2yv\3\2\2\2z\17"+
		"\3\2\2\2{}\7 \2\2|~\5\24\13\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\7!\2\2\u0080\u0081\7\'\2\2\u0081\u0082\5\22\n\2\u0082\21\3\2\2\2\u0083"+
		"\u0086\5\60\31\2\u0084\u0086\58\35\2\u0085\u0083\3\2\2\2\u0085\u0084\3"+
		"\2\2\2\u0086\23\3\2\2\2\u0087\u0088\7\63\2\2\u0088\u0089\7\35\2\2\u0089"+
		"\u0090\5&\24\2\u008a\u008b\7(\2\2\u008b\u008c\7\63\2\2\u008c\u008d\7\35"+
		"\2\2\u008d\u008f\5&\24\2\u008e\u008a\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\25\3\2\2\2\u0092\u0090\3\2\2"+
		"\2\u0093\u0095\5<\37\2\u0094\u0096\5\30\r\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\27\3\2\2"+
		"\2\u0099\u009b\7 \2\2\u009a\u009c\5\32\16\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7!\2\2\u009e\31\3\2\2\2"+
		"\u009f\u00a9\58\35\2\u00a0\u00a5\58\35\2\u00a1\u00a2\7(\2\2\u00a2\u00a4"+
		"\58\35\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u009f\3\2"+
		"\2\2\u00a8\u00a0\3\2\2\2\u00a9\33\3\2\2\2\u00aa\u00ab\7\62\2\2\u00ab\u00ac"+
		"\58\35\2\u00ac\u00ad\7\36\2\2\u00ad\35\3\2\2\2\u00ae\u00af\5<\37\2\u00af"+
		"\u00b0\7\37\2\2\u00b0\u00b1\58\35\2\u00b1\u00b2\7\36\2\2\u00b2\37\3\2"+
		"\2\2\u00b3\u00b5\5*\26\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\7\63\2\2\u00b7\u00b8\7\35\2\2\u00b8\u00b9\5"+
		"&\24\2\u00b9\u00ba\7\36\2\2\u00ba!\3\2\2\2\u00bb\u00bc\7\4\2\2\u00bc\u00bd"+
		"\7\63\2\2\u00bd\u00be\7\37\2\2\u00be\u00c3\5&\24\2\u00bf\u00c0\7$\2\2"+
		"\u00c0\u00c1\58\35\2\u00c1\u00c2\7%\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bf"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\7\36\2\2\u00c8#\3\2\2\2\u00c9\u00cb\5*\26\2"+
		"\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd"+
		"\7\63\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0\7\37\2"+
		"\2\u00d0\u00d1\58\35\2\u00d1\u00d2\7\36\2\2\u00d2%\3\2\2\2\u00d3\u00d7"+
		"\7\27\2\2\u00d4\u00d7\7\30\2\2\u00d5\u00d7\5(\25\2\u00d6\u00d3\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00db\3\2\2\2\u00d8\u00da"+
		"\7\21\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\'\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e7\7"+
		" \2\2\u00df\u00e4\5&\24\2\u00e0\u00e1\7(\2\2\u00e1\u00e3\5&\24\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7!\2\2\u00ea\u00eb\7\'"+
		"\2\2\u00eb\u00ec\5\f\7\2\u00ec)\3\2\2\2\u00ed\u00ee\t\2\2\2\u00ee+\3\2"+
		"\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f5\5.\30\2\u00f1\u00f2\7-\2\2\u00f2\u00f4"+
		"\5.\30\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7."+
		"\2\2\u00f9\u00fb\5\60\31\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"-\3\2\2\2\u00fc\u00fd\58\35\2\u00fd\u00fe\5\60\31\2\u00fe/\3\2\2\2\u00ff"+
		"\u0100\7\"\2\2\u0100\u0101\5\4\3\2\u0101\u0102\7#\2\2\u0102\61\3\2\2\2"+
		"\u0103\u0104\7/\2\2\u0104\u0105\58\35\2\u0105\u0106\5\60\31\2\u0106\63"+
		"\3\2\2\2\u0107\u0108\7*\2\2\u0108\u0109\7\63\2\2\u0109\u010a\7+\2\2\u010a"+
		"\u010b\5\66\34\2\u010b\u010c\5\60\31\2\u010c\65\3\2\2\2\u010d\u010e\5"+
		"8\35\2\u010e\u010f\7\32\2\2\u010f\u0110\58\35\2\u0110\u0111\7\33\2\2\u0111"+
		"\u0112\58\35\2\u0112\67\3\2\2\2\u0113\u0114\b\35\1\2\u0114\u0115\7\24"+
		"\2\2\u0115\u0122\58\35\17\u0116\u0122\5B\"\2\u0117\u0118\7\26\2\2\u0118"+
		"\u0122\5<\37\2\u0119\u011a\7 \2\2\u011a\u011b\58\35\2\u011b\u011c\7!\2"+
		"\2\u011c\u0122\3\2\2\2\u011d\u0122\5\26\f\2\u011e\u0122\5:\36\2\u011f"+
		"\u0120\7\20\2\2\u0120\u0122\58\35\3\u0121\u0113\3\2\2\2\u0121\u0116\3"+
		"\2\2\2\u0121\u0117\3\2\2\2\u0121\u0119\3\2\2\2\u0121\u011d\3\2\2\2\u0121"+
		"\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u013a\3\2\2\2\u0123\u0124\f\20"+
		"\2\2\u0124\u0125\7\23\2\2\u0125\u0139\58\35\20\u0126\u0127\f\f\2\2\u0127"+
		"\u0128\t\3\2\2\u0128\u0139\58\35\r\u0129\u012a\f\13\2\2\u012a\u012b\t"+
		"\4\2\2\u012b\u0139\58\35\f\u012c\u012d\f\n\2\2\u012d\u012e\t\5\2\2\u012e"+
		"\u0139\58\35\13\u012f\u0130\f\t\2\2\u0130\u0131\t\6\2\2\u0131\u0139\5"+
		"8\35\n\u0132\u0133\f\b\2\2\u0133\u0134\7\b\2\2\u0134\u0139\58\35\t\u0135"+
		"\u0136\f\7\2\2\u0136\u0137\7\7\2\2\u0137\u0139\58\35\b\u0138\u0123\3\2"+
		"\2\2\u0138\u0126\3\2\2\2\u0138\u0129\3\2\2\2\u0138\u012c\3\2\2\2\u0138"+
		"\u012f\3\2\2\2\u0138\u0132\3\2\2\2\u0138\u0135\3\2\2\2\u0139\u013c\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b9\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013d\u0143\7\64\2\2\u013e\u0143\t\7\2\2\u013f\u0143\5> \2\u0140"+
		"\u0143\5@!\2\u0141\u0143\5\20\t\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2"+
		"\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143"+
		";\3\2\2\2\u0144\u0148\5> \2\u0145\u0148\5@!\2\u0146\u0148\5B\"\2\u0147"+
		"\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148=\3\2\2\2"+
		"\u0149\u014a\7\63\2\2\u014a?\3\2\2\2\u014b\u014e\5> \2\u014c\u014e\5B"+
		"\"\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u0153\3\2\2\2\u014f"+
		"\u0150\7$\2\2\u0150\u0151\58\35\2\u0151\u0152\7%\2\2\u0152\u0154\3\2\2"+
		"\2\u0153\u014f\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156A\3\2\2\2\u0157\u0158\7\21\2\2\u0158\u0159\58\35\2\u0159"+
		"C\3\2\2\2\37J\\`isy}\u0085\u0090\u0097\u009b\u00a5\u00a8\u00b4\u00c5\u00ca"+
		"\u00d6\u00db\u00e4\u00e7\u00f5\u00fa\u0121\u0138\u013a\u0142\u0147\u014d"+
		"\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}