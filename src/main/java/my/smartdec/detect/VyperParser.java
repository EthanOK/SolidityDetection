package my.smartdec.detect;// Generated from E:/IDEAJAVA_Projects/smartcheck2/src/main/antlr4/ru/smartdec/smartcheck\Vyper.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VyperParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, NUMBER=2, INTEGER=3, DEF=4, RETURN=5, RAISE=6, FROM=7, IMPORT=8, 
		AS=9, GLOBAL=10, NONLOCAL=11, ASSERT=12, IF=13, ELIF=14, ELSE=15, WHILE=16, 
		FOR=17, IN=18, TRY=19, FINALLY=20, WITH=21, EXCEPT=22, LAMBDA=23, OR=24, 
		AND=25, NOT=26, IS=27, NONE=28, TRUE=29, FALSE=30, CLASS=31, YIELD=32, 
		DEL=33, PASS=34, CONTINUE=35, BREAK=36, ASYNC=37, AWAIT=38, NEWLINE=39, 
		NAME=40, STRING_LITERAL=41, BYTES_LITERAL=42, DECIMAL_INTEGER=43, OCT_INTEGER=44, 
		HEX_INTEGER=45, BIN_INTEGER=46, FLOAT_NUMBER=47, IMAG_NUMBER=48, DOT=49, 
		ELLIPSIS=50, STAR=51, OPEN_PAREN=52, CLOSE_PAREN=53, COMMA=54, COLON=55, 
		SEMI_COLON=56, POWER=57, ASSIGN=58, OPEN_BRACK=59, CLOSE_BRACK=60, OR_OP=61, 
		XOR=62, AND_OP=63, LEFT_SHIFT=64, RIGHT_SHIFT=65, ADD=66, MINUS=67, DIV=68, 
		MOD=69, IDIV=70, NOT_OP=71, OPEN_BRACE=72, CLOSE_BRACE=73, LESS_THAN=74, 
		GREATER_THAN=75, EQUALS=76, GT_EQ=77, LT_EQ=78, NOT_EQ_1=79, NOT_EQ_2=80, 
		AT=81, ARROW=82, ADD_ASSIGN=83, SUB_ASSIGN=84, MULT_ASSIGN=85, AT_ASSIGN=86, 
		DIV_ASSIGN=87, MOD_ASSIGN=88, AND_ASSIGN=89, OR_ASSIGN=90, XOR_ASSIGN=91, 
		LEFT_SHIFT_ASSIGN=92, RIGHT_SHIFT_ASSIGN=93, POWER_ASSIGN=94, IDIV_ASSIGN=95, 
		SKIP_=96, UNKNOWN_CHAR=97, INDENT=98, DEDENT=99;
	public static final int
		RULE_single_input = 0, RULE_file_input = 1, RULE_eval_input = 2, RULE_decorator = 3, 
		RULE_decorators = 4, RULE_decorated = 5, RULE_async_funcdef = 6, RULE_funcdef = 7, 
		RULE_parameters = 8, RULE_typedargslist = 9, RULE_tfpdef = 10, RULE_varargslist = 11, 
		RULE_vfpdef = 12, RULE_stmt = 13, RULE_simple_stmt = 14, RULE_small_stmt = 15, 
		RULE_expr_stmt = 16, RULE_annassign = 17, RULE_testlist_star_expr = 18, 
		RULE_augassign = 19, RULE_del_stmt = 20, RULE_pass_stmt = 21, RULE_flow_stmt = 22, 
		RULE_break_stmt = 23, RULE_continue_stmt = 24, RULE_return_stmt = 25, 
		RULE_yield_stmt = 26, RULE_raise_stmt = 27, RULE_import_stmt = 28, RULE_import_name = 29, 
		RULE_import_from = 30, RULE_import_as_name = 31, RULE_dotted_as_name = 32, 
		RULE_import_as_names = 33, RULE_dotted_as_names = 34, RULE_dotted_name = 35, 
		RULE_global_stmt = 36, RULE_nonlocal_stmt = 37, RULE_assert_stmt = 38, 
		RULE_compound_stmt = 39, RULE_async_stmt = 40, RULE_if_stmt = 41, RULE_while_stmt = 42, 
		RULE_for_stmt = 43, RULE_try_stmt = 44, RULE_with_stmt = 45, RULE_with_item = 46, 
		RULE_except_clause = 47, RULE_suite = 48, RULE_test = 49, RULE_test_nocond = 50, 
		RULE_lambdef = 51, RULE_lambdef_nocond = 52, RULE_or_test = 53, RULE_and_test = 54, 
		RULE_not_test = 55, RULE_comparison = 56, RULE_comp_op = 57, RULE_star_expr = 58, 
		RULE_expr = 59, RULE_xor_expr = 60, RULE_and_expr = 61, RULE_shift_expr = 62, 
		RULE_arith_expr = 63, RULE_term = 64, RULE_factor = 65, RULE_power = 66, 
		RULE_atom_expr = 67, RULE_atom = 68, RULE_atom_name = 69, RULE_atom_number = 70, 
		RULE_atom_string = 71, RULE_testlist_comp = 72, RULE_trailer = 73, RULE_subscriptlist = 74, 
		RULE_subscript = 75, RULE_sliceop = 76, RULE_exprlist = 77, RULE_testlist = 78, 
		RULE_dictorsetmaker = 79, RULE_classdef = 80, RULE_arglist = 81, RULE_argument = 82, 
		RULE_comp_iter = 83, RULE_comp_for = 84, RULE_comp_if = 85, RULE_encoding_decl = 86, 
		RULE_yield_expr = 87, RULE_yield_arg = 88;
	private static String[] makeRuleNames() {
		return new String[] {
			"single_input", "file_input", "eval_input", "decorator", "decorators", 
			"decorated", "async_funcdef", "funcdef", "parameters", "typedargslist", 
			"tfpdef", "varargslist", "vfpdef", "stmt", "simple_stmt", "small_stmt", 
			"expr_stmt", "annassign", "testlist_star_expr", "augassign", "del_stmt", 
			"pass_stmt", "flow_stmt", "break_stmt", "continue_stmt", "return_stmt", 
			"yield_stmt", "raise_stmt", "import_stmt", "import_name", "import_from", 
			"import_as_name", "dotted_as_name", "import_as_names", "dotted_as_names", 
			"dotted_name", "global_stmt", "nonlocal_stmt", "assert_stmt", "compound_stmt", 
			"async_stmt", "if_stmt", "while_stmt", "for_stmt", "try_stmt", "with_stmt", 
			"with_item", "except_clause", "suite", "test", "test_nocond", "lambdef", 
			"lambdef_nocond", "or_test", "and_test", "not_test", "comparison", "comp_op", 
			"star_expr", "expr", "xor_expr", "and_expr", "shift_expr", "arith_expr", 
			"term", "factor", "power", "atom_expr", "atom", "atom_name", "atom_number", 
			"atom_string", "testlist_comp", "trailer", "subscriptlist", "subscript", 
			"sliceop", "exprlist", "testlist", "dictorsetmaker", "classdef", "arglist", 
			"argument", "comp_iter", "comp_for", "comp_if", "encoding_decl", "yield_expr", 
			"yield_arg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'def'", "'return'", "'raise'", "'from'", "'import'", 
			"'as'", "'global'", "'nonlocal'", "'assert'", "'if'", "'elif'", "'else'", 
			"'while'", "'for'", "'in'", "'try'", "'finally'", "'with'", "'except'", 
			"'lambda'", "'or'", "'and'", "'not'", "'is'", "'None'", "'True'", "'False'", 
			"'class'", "'yield'", "'del'", "'pass'", "'continue'", "'break'", "'async'", 
			"'await'", null, null, null, null, null, null, null, null, null, null, 
			"'.'", "'...'", "'*'", "'('", "')'", "','", "':'", "';'", "'**'", "'='", 
			"'['", "']'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'+'", "'-'", "'/'", 
			"'%'", "'//'", "'~'", "'{'", "'}'", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'<>'", "'!='", "'@'", "'->'", "'+='", "'-='", "'*='", "'@='", "'/='", 
			"'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'**='", "'//='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "NUMBER", "INTEGER", "DEF", "RETURN", "RAISE", "FROM", 
			"IMPORT", "AS", "GLOBAL", "NONLOCAL", "ASSERT", "IF", "ELIF", "ELSE", 
			"WHILE", "FOR", "IN", "TRY", "FINALLY", "WITH", "EXCEPT", "LAMBDA", "OR", 
			"AND", "NOT", "IS", "NONE", "TRUE", "FALSE", "CLASS", "YIELD", "DEL", 
			"PASS", "CONTINUE", "BREAK", "ASYNC", "AWAIT", "NEWLINE", "NAME", "STRING_LITERAL", 
			"BYTES_LITERAL", "DECIMAL_INTEGER", "OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", 
			"FLOAT_NUMBER", "IMAG_NUMBER", "DOT", "ELLIPSIS", "STAR", "OPEN_PAREN", 
			"CLOSE_PAREN", "COMMA", "COLON", "SEMI_COLON", "POWER", "ASSIGN", "OPEN_BRACK", 
			"CLOSE_BRACK", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", 
			"ADD", "MINUS", "DIV", "MOD", "IDIV", "NOT_OP", "OPEN_BRACE", "CLOSE_BRACE", 
			"LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", 
			"NOT_EQ_2", "AT", "ARROW", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", 
			"AT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", "IDIV_ASSIGN", 
			"SKIP_", "UNKNOWN_CHAR", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "Vyper.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VyperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Single_inputContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(VyperParser.NEWLINE, 0); }
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Single_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterSingle_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitSingle_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitSingle_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_inputContext single_input() throws RecognitionException {
		Single_inputContext _localctx = new Single_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_single_input);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(NEWLINE);
				}
				break;
			case STRING:
			case NUMBER:
			case RETURN:
			case RAISE:
			case FROM:
			case IMPORT:
			case GLOBAL:
			case NONLOCAL:
			case ASSERT:
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case YIELD:
			case DEL:
			case PASS:
			case CONTINUE:
			case BREAK:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				simple_stmt();
				}
				break;
			case DEF:
			case IF:
			case WHILE:
			case FOR:
			case TRY:
			case WITH:
			case CLASS:
			case ASYNC:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				compound_stmt();
				setState(181);
				match(NEWLINE);
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

	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VyperParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(VyperParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VyperParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitFile_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitFile_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << DEF) | (1L << RETURN) | (1L << RAISE) | (1L << FROM) | (1L << IMPORT) | (1L << GLOBAL) | (1L << NONLOCAL) | (1L << ASSERT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << TRY) | (1L << WITH) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << CLASS) | (1L << YIELD) | (1L << DEL) | (1L << PASS) | (1L << CONTINUE) | (1L << BREAK) | (1L << ASYNC) | (1L << AWAIT) | (1L << NEWLINE) | (1L << NAME) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(185);
					match(NEWLINE);
					}
					break;
				case STRING:
				case NUMBER:
				case DEF:
				case RETURN:
				case RAISE:
				case FROM:
				case IMPORT:
				case GLOBAL:
				case NONLOCAL:
				case ASSERT:
				case IF:
				case WHILE:
				case FOR:
				case TRY:
				case WITH:
				case LAMBDA:
				case NOT:
				case NONE:
				case TRUE:
				case FALSE:
				case CLASS:
				case YIELD:
				case DEL:
				case PASS:
				case CONTINUE:
				case BREAK:
				case ASYNC:
				case AWAIT:
				case NAME:
				case ELLIPSIS:
				case STAR:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case ADD:
				case MINUS:
				case NOT_OP:
				case OPEN_BRACE:
				case AT:
					{
					setState(186);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
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

	public static class Eval_inputContext extends ParserRuleContext {
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VyperParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(VyperParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VyperParser.NEWLINE, i);
		}
		public Eval_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterEval_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitEval_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitEval_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eval_inputContext eval_input() throws RecognitionException {
		Eval_inputContext _localctx = new Eval_inputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eval_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			testlist();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(195);
				match(NEWLINE);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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

	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(VyperParser.AT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(VyperParser.NEWLINE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(VyperParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(VyperParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(AT);
			setState(204);
			dotted_name();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(205);
				match(OPEN_PAREN);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << POWER) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
					{
					setState(206);
					arglist();
					}
				}

				setState(209);
				match(CLOSE_PAREN);
				}
			}

			setState(212);
			match(NEWLINE);
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

	public static class DecoratorsContext extends ParserRuleContext {
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDecorators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDecorators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDecorators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorsContext decorators() throws RecognitionException {
		DecoratorsContext _localctx = new DecoratorsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				decorator();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
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

	public static class DecoratedContext extends ParserRuleContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Async_funcdefContext async_funcdef() {
			return getRuleContext(Async_funcdefContext.class,0);
		}
		public DecoratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDecorated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDecorated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDecorated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratedContext decorated() throws RecognitionException {
		DecoratedContext _localctx = new DecoratedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decorated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			decorators();
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(220);
				classdef();
				}
				break;
			case DEF:
				{
				setState(221);
				funcdef();
				}
				break;
			case ASYNC:
				{
				setState(222);
				async_funcdef();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Async_funcdefContext extends ParserRuleContext {
		public TerminalNode ASYNC() { return getToken(VyperParser.ASYNC, 0); }
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Async_funcdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_async_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAsync_funcdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAsync_funcdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAsync_funcdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Async_funcdefContext async_funcdef() throws RecognitionException {
		Async_funcdefContext _localctx = new Async_funcdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_async_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ASYNC);
			setState(226);
			funcdef();
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(VyperParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(VyperParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VyperParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(VyperParser.ARROW, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(DEF);
			setState(229);
			match(NAME);
			setState(230);
			parameters();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(231);
				match(ARROW);
				setState(232);
				test();
				}
			}

			setState(235);
			match(COLON);
			setState(236);
			suite();
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(VyperParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(VyperParser.CLOSE_PAREN, 0); }
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(OPEN_PAREN);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << STAR) | (1L << POWER))) != 0)) {
				{
				setState(239);
				typedargslist();
				}
			}

			setState(242);
			match(CLOSE_PAREN);
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

	public static class TypedargslistContext extends ParserRuleContext {
		public List<TfpdefContext> tfpdef() {
			return getRuleContexts(TfpdefContext.class);
		}
		public TfpdefContext tfpdef(int i) {
			return getRuleContext(TfpdefContext.class,i);
		}
		public TerminalNode STAR() { return getToken(VyperParser.STAR, 0); }
		public TerminalNode POWER() { return getToken(VyperParser.POWER, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(VyperParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(VyperParser.ASSIGN, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterTypedargslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitTypedargslist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitTypedargslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typedargslist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(244);
				tfpdef();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(245);
					match(ASSIGN);
					setState(246);
					test();
					}
				}

				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						match(COMMA);
						setState(250);
						tfpdef();
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(251);
							match(ASSIGN);
							setState(252);
							test();
							}
						}

						}
						} 
					}
					setState(259);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(260);
					match(COMMA);
					setState(291);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(261);
						match(STAR);
						setState(263);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NAME) {
							{
							setState(262);
							tfpdef();
							}
						}

						setState(273);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(265);
								match(COMMA);
								setState(266);
								tfpdef();
								setState(269);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==ASSIGN) {
									{
									setState(267);
									match(ASSIGN);
									setState(268);
									test();
									}
								}

								}
								} 
							}
							setState(275);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						}
						setState(284);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(276);
							match(COMMA);
							setState(282);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==POWER) {
								{
								setState(277);
								match(POWER);
								setState(278);
								tfpdef();
								setState(280);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==COMMA) {
									{
									setState(279);
									match(COMMA);
									}
								}

								}
							}

							}
						}

						}
						break;
					case POWER:
						{
						setState(286);
						match(POWER);
						setState(287);
						tfpdef();
						setState(289);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(288);
							match(COMMA);
							}
						}

						}
						break;
					case CLOSE_PAREN:
						break;
					default:
						break;
					}
					}
				}

				}
				break;
			case STAR:
				{
				setState(295);
				match(STAR);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(296);
					tfpdef();
					}
				}

				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299);
						match(COMMA);
						setState(300);
						tfpdef();
						setState(303);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(301);
							match(ASSIGN);
							setState(302);
							test();
							}
						}

						}
						} 
					}
					setState(309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(310);
					match(COMMA);
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==POWER) {
						{
						setState(311);
						match(POWER);
						setState(312);
						tfpdef();
						setState(314);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(313);
							match(COMMA);
							}
						}

						}
					}

					}
				}

				}
				break;
			case POWER:
				{
				setState(320);
				match(POWER);
				setState(321);
				tfpdef();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(322);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TfpdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(VyperParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(VyperParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfpdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterTfpdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitTfpdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitTfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TfpdefContext tfpdef() throws RecognitionException {
		TfpdefContext _localctx = new TfpdefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tfpdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(NAME);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(328);
				match(COLON);
				setState(329);
				test();
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

	public static class VarargslistContext extends ParserRuleContext {
		public List<VfpdefContext> vfpdef() {
			return getRuleContexts(VfpdefContext.class);
		}
		public VfpdefContext vfpdef(int i) {
			return getRuleContext(VfpdefContext.class,i);
		}
		public TerminalNode STAR() { return getToken(VyperParser.STAR, 0); }
		public TerminalNode POWER() { return getToken(VyperParser.POWER, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(VyperParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(VyperParser.ASSIGN, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public VarargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varargslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterVarargslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitVarargslist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitVarargslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarargslistContext varargslist() throws RecognitionException {
		VarargslistContext _localctx = new VarargslistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varargslist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(332);
				vfpdef();
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(333);
					match(ASSIGN);
					setState(334);
					test();
					}
				}

				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337);
						match(COMMA);
						setState(338);
						vfpdef();
						setState(341);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(339);
							match(ASSIGN);
							setState(340);
							test();
							}
						}

						}
						} 
					}
					setState(347);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(348);
					match(COMMA);
					setState(379);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(349);
						match(STAR);
						setState(351);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NAME) {
							{
							setState(350);
							vfpdef();
							}
						}

						setState(361);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(353);
								match(COMMA);
								setState(354);
								vfpdef();
								setState(357);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==ASSIGN) {
									{
									setState(355);
									match(ASSIGN);
									setState(356);
									test();
									}
								}

								}
								} 
							}
							setState(363);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
						}
						setState(372);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(364);
							match(COMMA);
							setState(370);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==POWER) {
								{
								setState(365);
								match(POWER);
								setState(366);
								vfpdef();
								setState(368);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==COMMA) {
									{
									setState(367);
									match(COMMA);
									}
								}

								}
							}

							}
						}

						}
						break;
					case POWER:
						{
						setState(374);
						match(POWER);
						setState(375);
						vfpdef();
						setState(377);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(376);
							match(COMMA);
							}
						}

						}
						break;
					case COLON:
						break;
					default:
						break;
					}
					}
				}

				}
				break;
			case STAR:
				{
				setState(383);
				match(STAR);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(384);
					vfpdef();
					}
				}

				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(387);
						match(COMMA);
						setState(388);
						vfpdef();
						setState(391);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(389);
							match(ASSIGN);
							setState(390);
							test();
							}
						}

						}
						} 
					}
					setState(397);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(398);
					match(COMMA);
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==POWER) {
						{
						setState(399);
						match(POWER);
						setState(400);
						vfpdef();
						setState(402);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(401);
							match(COMMA);
							}
						}

						}
					}

					}
				}

				}
				break;
			case POWER:
				{
				setState(408);
				match(POWER);
				setState(409);
				vfpdef();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(410);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VfpdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(VyperParser.NAME, 0); }
		public VfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfpdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterVfpdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitVfpdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitVfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VfpdefContext vfpdef() throws RecognitionException {
		VfpdefContext _localctx = new VfpdefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vfpdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(NAME);
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

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case RETURN:
			case RAISE:
			case FROM:
			case IMPORT:
			case GLOBAL:
			case NONLOCAL:
			case ASSERT:
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case YIELD:
			case DEL:
			case PASS:
			case CONTINUE:
			case BREAK:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				simple_stmt();
				}
				break;
			case DEF:
			case IF:
			case WHILE:
			case FOR:
			case TRY:
			case WITH:
			case CLASS:
			case ASYNC:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				compound_stmt();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(VyperParser.NEWLINE, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(VyperParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(VyperParser.SEMI_COLON, i);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			small_stmt();
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					match(SEMI_COLON);
					setState(423);
					small_stmt();
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(429);
				match(SEMI_COLON);
				}
			}

			setState(432);
			match(NEWLINE);
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

	public static class Small_stmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Del_stmtContext del_stmt() {
			return getRuleContext(Del_stmtContext.class,0);
		}
		public Pass_stmtContext pass_stmt() {
			return getRuleContext(Pass_stmtContext.class,0);
		}
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public Nonlocal_stmtContext nonlocal_stmt() {
			return getRuleContext(Nonlocal_stmtContext.class,0);
		}
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterSmall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitSmall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_small_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				{
				setState(434);
				expr_stmt();
				}
				break;
			case DEL:
				{
				setState(435);
				del_stmt();
				}
				break;
			case PASS:
				{
				setState(436);
				pass_stmt();
				}
				break;
			case RETURN:
			case RAISE:
			case YIELD:
			case CONTINUE:
			case BREAK:
				{
				setState(437);
				flow_stmt();
				}
				break;
			case FROM:
			case IMPORT:
				{
				setState(438);
				import_stmt();
				}
				break;
			case GLOBAL:
				{
				setState(439);
				global_stmt();
				}
				break;
			case NONLOCAL:
				{
				setState(440);
				nonlocal_stmt();
				}
				break;
			case ASSERT:
				{
				setState(441);
				assert_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public List<Testlist_star_exprContext> testlist_star_expr() {
			return getRuleContexts(Testlist_star_exprContext.class);
		}
		public Testlist_star_exprContext testlist_star_expr(int i) {
			return getRuleContext(Testlist_star_exprContext.class,i);
		}
		public AnnassignContext annassign() {
			return getRuleContext(AnnassignContext.class,0);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public List<Yield_exprContext> yield_expr() {
			return getRuleContexts(Yield_exprContext.class);
		}
		public Yield_exprContext yield_expr(int i) {
			return getRuleContext(Yield_exprContext.class,i);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(VyperParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(VyperParser.ASSIGN, i);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			testlist_star_expr();
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				setState(445);
				annassign();
				}
				break;
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case AT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
			case POWER_ASSIGN:
			case IDIV_ASSIGN:
				{
				setState(446);
				augassign();
				setState(449);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(447);
					yield_expr();
					}
					break;
				case STRING:
				case NUMBER:
				case LAMBDA:
				case NOT:
				case NONE:
				case TRUE:
				case FALSE:
				case AWAIT:
				case NAME:
				case ELLIPSIS:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case ADD:
				case MINUS:
				case NOT_OP:
				case OPEN_BRACE:
					{
					setState(448);
					testlist();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NEWLINE:
			case SEMI_COLON:
			case ASSIGN:
				{
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGN) {
					{
					{
					setState(451);
					match(ASSIGN);
					setState(454);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case YIELD:
						{
						setState(452);
						yield_expr();
						}
						break;
					case STRING:
					case NUMBER:
					case LAMBDA:
					case NOT:
					case NONE:
					case TRUE:
					case FALSE:
					case AWAIT:
					case NAME:
					case ELLIPSIS:
					case STAR:
					case OPEN_PAREN:
					case OPEN_BRACK:
					case ADD:
					case MINUS:
					case NOT_OP:
					case OPEN_BRACE:
						{
						setState(453);
						testlist_star_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AnnassignContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(VyperParser.COLON, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(VyperParser.ASSIGN, 0); }
		public AnnassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAnnassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAnnassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAnnassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnassignContext annassign() throws RecognitionException {
		AnnassignContext _localctx = new AnnassignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_annassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(COLON);
			setState(464);
			test();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(465);
				match(ASSIGN);
				setState(466);
				test();
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

	public static class Testlist_star_exprContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public Testlist_star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterTestlist_star_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitTestlist_star_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitTestlist_star_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_star_exprContext testlist_star_expr() throws RecognitionException {
		Testlist_star_exprContext _localctx = new Testlist_star_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_testlist_star_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				{
				setState(469);
				test();
				}
				break;
			case STAR:
				{
				setState(470);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					match(COMMA);
					setState(476);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
					case NUMBER:
					case LAMBDA:
					case NOT:
					case NONE:
					case TRUE:
					case FALSE:
					case AWAIT:
					case NAME:
					case ELLIPSIS:
					case OPEN_PAREN:
					case OPEN_BRACK:
					case ADD:
					case MINUS:
					case NOT_OP:
					case OPEN_BRACE:
						{
						setState(474);
						test();
						}
						break;
					case STAR:
						{
						setState(475);
						star_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(483);
				match(COMMA);
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

	public static class AugassignContext extends ParserRuleContext {
		public TerminalNode ADD_ASSIGN() { return getToken(VyperParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(VyperParser.SUB_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(VyperParser.MULT_ASSIGN, 0); }
		public TerminalNode AT_ASSIGN() { return getToken(VyperParser.AT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(VyperParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(VyperParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(VyperParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(VyperParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(VyperParser.XOR_ASSIGN, 0); }
		public TerminalNode LEFT_SHIFT_ASSIGN() { return getToken(VyperParser.LEFT_SHIFT_ASSIGN, 0); }
		public TerminalNode RIGHT_SHIFT_ASSIGN() { return getToken(VyperParser.RIGHT_SHIFT_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(VyperParser.POWER_ASSIGN, 0); }
		public TerminalNode IDIV_ASSIGN() { return getToken(VyperParser.IDIV_ASSIGN, 0); }
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAugassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAugassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAugassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (ADD_ASSIGN - 83)) | (1L << (SUB_ASSIGN - 83)) | (1L << (MULT_ASSIGN - 83)) | (1L << (AT_ASSIGN - 83)) | (1L << (DIV_ASSIGN - 83)) | (1L << (MOD_ASSIGN - 83)) | (1L << (AND_ASSIGN - 83)) | (1L << (OR_ASSIGN - 83)) | (1L << (XOR_ASSIGN - 83)) | (1L << (LEFT_SHIFT_ASSIGN - 83)) | (1L << (RIGHT_SHIFT_ASSIGN - 83)) | (1L << (POWER_ASSIGN - 83)) | (1L << (IDIV_ASSIGN - 83)))) != 0)) ) {
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

	public static class Del_stmtContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(VyperParser.DEL, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public Del_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDel_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDel_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDel_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(DEL);
			setState(489);
			exprlist();
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

	public static class Pass_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(VyperParser.PASS, 0); }
		public Pass_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterPass_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitPass_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitPass_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pass_stmtContext pass_stmt() throws RecognitionException {
		Pass_stmtContext _localctx = new Pass_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pass_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(PASS);
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

	public static class Flow_stmtContext extends ParserRuleContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public Yield_stmtContext yield_stmt() {
			return getRuleContext(Yield_stmtContext.class,0);
		}
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterFlow_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitFlow_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitFlow_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_flow_stmt);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				return_stmt();
				}
				break;
			case RAISE:
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				raise_stmt();
				}
				break;
			case YIELD:
				enterOuterAlt(_localctx, 5);
				{
				setState(497);
				yield_stmt();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(VyperParser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(BREAK);
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

	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(VyperParser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitContinue_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(CONTINUE);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(VyperParser.RETURN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(RETURN);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
				{
				setState(505);
				testlist();
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

	public static class Yield_stmtContext extends ParserRuleContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Yield_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterYield_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitYield_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitYield_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_stmtContext yield_stmt() throws RecognitionException {
		Yield_stmtContext _localctx = new Yield_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_yield_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			yield_expr();
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

	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(VyperParser.RAISE, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode FROM() { return getToken(VyperParser.FROM, 0); }
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterRaise_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitRaise_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitRaise_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_raise_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(RAISE);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
				{
				setState(511);
				test();
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(512);
					match(FROM);
					setState(513);
					test();
					}
				}

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

	public static class Import_stmtContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterImport_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitImport_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitImport_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_import_stmt);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				import_from();
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

	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(VyperParser.IMPORT, 0); }
		public Dotted_as_namesContext dotted_as_names() {
			return getRuleContext(Dotted_as_namesContext.class,0);
		}
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitImport_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(IMPORT);
			setState(523);
			dotted_as_names();
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

	public static class Import_fromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(VyperParser.FROM, 0); }
		public TerminalNode IMPORT() { return getToken(VyperParser.IMPORT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(VyperParser.STAR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(VyperParser.OPEN_PAREN, 0); }
		public Import_as_namesContext import_as_names() {
			return getRuleContext(Import_as_namesContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(VyperParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(VyperParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VyperParser.DOT, i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(VyperParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(VyperParser.ELLIPSIS, i);
		}
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterImport_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitImport_from(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitImport_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_import_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(525);
			match(FROM);
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==ELLIPSIS) {
					{
					{
					setState(526);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ELLIPSIS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(532);
				dotted_name();
				}
				break;
			case 2:
				{
				setState(534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(533);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ELLIPSIS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(536); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT || _la==ELLIPSIS );
				}
				break;
			}
			setState(540);
			match(IMPORT);
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(541);
				match(STAR);
				}
				break;
			case OPEN_PAREN:
				{
				setState(542);
				match(OPEN_PAREN);
				setState(543);
				import_as_names();
				setState(544);
				match(CLOSE_PAREN);
				}
				break;
			case NAME:
				{
				setState(546);
				import_as_names();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Import_as_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(VyperParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(VyperParser.NAME, i);
		}
		public TerminalNode AS() { return getToken(VyperParser.AS, 0); }
		public Import_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterImport_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitImport_as_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitImport_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_nameContext import_as_name() throws RecognitionException {
		Import_as_nameContext _localctx = new Import_as_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_import_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(NAME);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(550);
				match(AS);
				setState(551);
				match(NAME);
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

	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(VyperParser.AS, 0); }
		public TerminalNode NAME() { return getToken(VyperParser.NAME, 0); }
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDotted_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDotted_as_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDotted_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dotted_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			dotted_name();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(555);
				match(AS);
				setState(556);
				match(NAME);
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

	public static class Import_as_namesContext extends ParserRuleContext {
		public List<Import_as_nameContext> import_as_name() {
			return getRuleContexts(Import_as_nameContext.class);
		}
		public Import_as_nameContext import_as_name(int i) {
			return getRuleContext(Import_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public Import_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterImport_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitImport_as_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitImport_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_namesContext import_as_names() throws RecognitionException {
		Import_as_namesContext _localctx = new Import_as_namesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_import_as_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			import_as_name();
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					match(COMMA);
					setState(561);
					import_as_name();
					}
					} 
				}
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(567);
				match(COMMA);
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

	public static class Dotted_as_namesContext extends ParserRuleContext {
		public List<Dotted_as_nameContext> dotted_as_name() {
			return getRuleContexts(Dotted_as_nameContext.class);
		}
		public Dotted_as_nameContext dotted_as_name(int i) {
			return getRuleContext(Dotted_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public Dotted_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDotted_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDotted_as_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDotted_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_namesContext dotted_as_names() throws RecognitionException {
		Dotted_as_namesContext _localctx = new Dotted_as_namesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dotted_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			dotted_as_name();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(571);
				match(COMMA);
				setState(572);
				dotted_as_name();
				}
				}
				setState(577);
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

	public static class Dotted_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(VyperParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(VyperParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(VyperParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VyperParser.DOT, i);
		}
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDotted_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDotted_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDotted_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(NAME);
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(579);
				match(DOT);
				setState(580);
				match(NAME);
				}
				}
				setState(585);
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

	public static class Global_stmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(VyperParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(VyperParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(VyperParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterGlobal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitGlobal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitGlobal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(GLOBAL);
			setState(587);
			match(NAME);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(588);
				match(COMMA);
				setState(589);
				match(NAME);
				}
				}
				setState(594);
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

	public static class Nonlocal_stmtContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(VyperParser.NONLOCAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(VyperParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(VyperParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public Nonlocal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterNonlocal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitNonlocal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitNonlocal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonlocal_stmtContext nonlocal_stmt() throws RecognitionException {
		Nonlocal_stmtContext _localctx = new Nonlocal_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_nonlocal_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(NONLOCAL);
			setState(596);
			match(NAME);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(597);
				match(COMMA);
				setState(598);
				match(NAME);
				}
				}
				setState(603);
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

	public static class Assert_stmtContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(VyperParser.ASSERT, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(VyperParser.COMMA, 0); }
		public Assert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAssert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAssert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAssert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_stmtContext assert_stmt() throws RecognitionException {
		Assert_stmtContext _localctx = new Assert_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(ASSERT);
			setState(605);
			test();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(606);
				match(COMMA);
				setState(607);
				test();
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Try_stmtContext try_stmt() {
			return getRuleContext(Try_stmtContext.class,0);
		}
		public With_stmtContext with_stmt() {
			return getRuleContext(With_stmtContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public DecoratedContext decorated() {
			return getRuleContext(DecoratedContext.class,0);
		}
		public Async_stmtContext async_stmt() {
			return getRuleContext(Async_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_compound_stmt);
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				for_stmt();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				try_stmt();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 5);
				{
				setState(614);
				with_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 6);
				{
				setState(615);
				funcdef();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(616);
				classdef();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 8);
				{
				setState(617);
				decorated();
				}
				break;
			case ASYNC:
				enterOuterAlt(_localctx, 9);
				{
				setState(618);
				async_stmt();
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

	public static class Async_stmtContext extends ParserRuleContext {
		public TerminalNode ASYNC() { return getToken(VyperParser.ASYNC, 0); }
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public With_stmtContext with_stmt() {
			return getRuleContext(With_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Async_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_async_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAsync_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAsync_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAsync_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Async_stmtContext async_stmt() throws RecognitionException {
		Async_stmtContext _localctx = new Async_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_async_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(ASYNC);
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				{
				setState(622);
				funcdef();
				}
				break;
			case WITH:
				{
				setState(623);
				with_stmt();
				}
				break;
			case FOR:
				{
				setState(624);
				for_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VyperParser.IF, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(VyperParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(VyperParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(VyperParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(VyperParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(VyperParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(IF);
			setState(628);
			test();
			setState(629);
			match(COLON);
			setState(630);
			suite();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(631);
				match(ELIF);
				setState(632);
				test();
				setState(633);
				match(COLON);
				setState(634);
				suite();
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(641);
				match(ELSE);
				setState(642);
				match(COLON);
				setState(643);
				suite();
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VyperParser.WHILE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(VyperParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(VyperParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VyperParser.ELSE, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(WHILE);
			setState(647);
			test();
			setState(648);
			match(COLON);
			setState(649);
			suite();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(650);
				match(ELSE);
				setState(651);
				match(COLON);
				setState(652);
				suite();
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VyperParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(VyperParser.IN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(VyperParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(VyperParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VyperParser.ELSE, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(FOR);
			setState(656);
			exprlist();
			setState(657);
			match(IN);
			setState(658);
			testlist();
			setState(659);
			match(COLON);
			setState(660);
			suite();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(661);
				match(ELSE);
				setState(662);
				match(COLON);
				setState(663);
				suite();
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

	public static class Try_stmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(VyperParser.TRY, 0); }
		public List<TerminalNode> COLON() { return getTokens(VyperParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(VyperParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode FINALLY() { return getToken(VyperParser.FINALLY, 0); }
		public List<Except_clauseContext> except_clause() {
			return getRuleContexts(Except_clauseContext.class);
		}
		public Except_clauseContext except_clause(int i) {
			return getRuleContext(Except_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VyperParser.ELSE, 0); }
		public Try_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterTry_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitTry_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitTry_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_stmtContext try_stmt() throws RecognitionException {
		Try_stmtContext _localctx = new Try_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_try_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(666);
			match(TRY);
			setState(667);
			match(COLON);
			setState(668);
			suite();
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCEPT:
				{
				setState(673); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(669);
					except_clause();
					setState(670);
					match(COLON);
					setState(671);
					suite();
					}
					}
					setState(675); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXCEPT );
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(677);
					match(ELSE);
					setState(678);
					match(COLON);
					setState(679);
					suite();
					}
				}

				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(682);
					match(FINALLY);
					setState(683);
					match(COLON);
					setState(684);
					suite();
					}
				}

				}
				break;
			case FINALLY:
				{
				setState(687);
				match(FINALLY);
				setState(688);
				match(COLON);
				setState(689);
				suite();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class With_stmtContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(VyperParser.WITH, 0); }
		public List<With_itemContext> with_item() {
			return getRuleContexts(With_itemContext.class);
		}
		public With_itemContext with_item(int i) {
			return getRuleContext(With_itemContext.class,i);
		}
		public TerminalNode COLON() { return getToken(VyperParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public With_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterWith_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitWith_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitWith_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_stmtContext with_stmt() throws RecognitionException {
		With_stmtContext _localctx = new With_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_with_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(WITH);
			setState(693);
			with_item();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(694);
				match(COMMA);
				setState(695);
				with_item();
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			match(COLON);
			setState(702);
			suite();
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

	public static class With_itemContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode AS() { return getToken(VyperParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public With_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterWith_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitWith_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitWith_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_itemContext with_item() throws RecognitionException {
		With_itemContext _localctx = new With_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_with_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			test();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(705);
				match(AS);
				setState(706);
				expr();
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

	public static class Except_clauseContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(VyperParser.EXCEPT, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode AS() { return getToken(VyperParser.AS, 0); }
		public TerminalNode NAME() { return getToken(VyperParser.NAME, 0); }
		public Except_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterExcept_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitExcept_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitExcept_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Except_clauseContext except_clause() throws RecognitionException {
		Except_clauseContext _localctx = new Except_clauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_except_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(EXCEPT);
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
				{
				setState(710);
				test();
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(711);
					match(AS);
					setState(712);
					match(NAME);
					}
				}

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

	public static class SuiteContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(VyperParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(VyperParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(VyperParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_suite);
		int _la;
		try {
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case RETURN:
			case RAISE:
			case FROM:
			case IMPORT:
			case GLOBAL:
			case NONLOCAL:
			case ASSERT:
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case YIELD:
			case DEL:
			case PASS:
			case CONTINUE:
			case BREAK:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				match(NEWLINE);
				setState(719);
				match(INDENT);
				setState(721); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(720);
					stmt();
					}
					}
					setState(723); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << DEF) | (1L << RETURN) | (1L << RAISE) | (1L << FROM) | (1L << IMPORT) | (1L << GLOBAL) | (1L << NONLOCAL) | (1L << ASSERT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << TRY) | (1L << WITH) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << CLASS) | (1L << YIELD) | (1L << DEL) | (1L << PASS) | (1L << CONTINUE) | (1L << BREAK) | (1L << ASYNC) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)) | (1L << (AT - 66)))) != 0) );
				setState(725);
				match(DEDENT);
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

	public static class TestContext extends ParserRuleContext {
		public List<Or_testContext> or_test() {
			return getRuleContexts(Or_testContext.class);
		}
		public Or_testContext or_test(int i) {
			return getRuleContext(Or_testContext.class,i);
		}
		public TerminalNode IF() { return getToken(VyperParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(VyperParser.ELSE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public LambdefContext lambdef() {
			return getRuleContext(LambdefContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_test);
		int _la;
		try {
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				or_test();
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(730);
					match(IF);
					setState(731);
					or_test();
					setState(732);
					match(ELSE);
					setState(733);
					test();
					}
				}

				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				lambdef();
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

	public static class Test_nocondContext extends ParserRuleContext {
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public Lambdef_nocondContext lambdef_nocond() {
			return getRuleContext(Lambdef_nocondContext.class,0);
		}
		public Test_nocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_nocond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterTest_nocond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitTest_nocond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitTest_nocond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_nocondContext test_nocond() throws RecognitionException {
		Test_nocondContext _localctx = new Test_nocondContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_test_nocond);
		try {
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				or_test();
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				lambdef_nocond();
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

	public static class LambdefContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(VyperParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(VyperParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public VarargslistContext varargslist() {
			return getRuleContext(VarargslistContext.class,0);
		}
		public LambdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterLambdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitLambdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitLambdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdefContext lambdef() throws RecognitionException {
		LambdefContext _localctx = new LambdefContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_lambdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(LAMBDA);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << STAR) | (1L << POWER))) != 0)) {
				{
				setState(745);
				varargslist();
				}
			}

			setState(748);
			match(COLON);
			setState(749);
			test();
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

	public static class Lambdef_nocondContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(VyperParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(VyperParser.COLON, 0); }
		public Test_nocondContext test_nocond() {
			return getRuleContext(Test_nocondContext.class,0);
		}
		public VarargslistContext varargslist() {
			return getRuleContext(VarargslistContext.class,0);
		}
		public Lambdef_nocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef_nocond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterLambdef_nocond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitLambdef_nocond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitLambdef_nocond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambdef_nocondContext lambdef_nocond() throws RecognitionException {
		Lambdef_nocondContext _localctx = new Lambdef_nocondContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_lambdef_nocond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(LAMBDA);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << STAR) | (1L << POWER))) != 0)) {
				{
				setState(752);
				varargslist();
				}
			}

			setState(755);
			match(COLON);
			setState(756);
			test_nocond();
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

	public static class Or_testContext extends ParserRuleContext {
		public List<And_testContext> and_test() {
			return getRuleContexts(And_testContext.class);
		}
		public And_testContext and_test(int i) {
			return getRuleContext(And_testContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(VyperParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(VyperParser.OR, i);
		}
		public Or_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterOr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitOr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitOr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			and_test();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(759);
				match(OR);
				setState(760);
				and_test();
				}
				}
				setState(765);
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

	public static class And_testContext extends ParserRuleContext {
		public List<Not_testContext> not_test() {
			return getRuleContexts(Not_testContext.class);
		}
		public Not_testContext not_test(int i) {
			return getRuleContext(Not_testContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(VyperParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(VyperParser.AND, i);
		}
		public And_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAnd_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAnd_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAnd_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			not_test();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(767);
				match(AND);
				setState(768);
				not_test();
				}
				}
				setState(773);
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

	public static class Not_testContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(VyperParser.NOT, 0); }
		public Not_testContext not_test() {
			return getRuleContext(Not_testContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterNot_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitNot_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitNot_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_not_test);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				match(NOT);
				setState(775);
				not_test();
				}
				break;
			case STRING:
			case NUMBER:
			case NONE:
			case TRUE:
			case FALSE:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			expr();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (IN - 18)) | (1L << (NOT - 18)) | (1L << (IS - 18)) | (1L << (LESS_THAN - 18)) | (1L << (GREATER_THAN - 18)) | (1L << (EQUALS - 18)) | (1L << (GT_EQ - 18)) | (1L << (LT_EQ - 18)) | (1L << (NOT_EQ_1 - 18)) | (1L << (NOT_EQ_2 - 18)))) != 0)) {
				{
				{
				setState(780);
				comp_op();
				setState(781);
				expr();
				}
				}
				setState(787);
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(VyperParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(VyperParser.GREATER_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(VyperParser.EQUALS, 0); }
		public TerminalNode GT_EQ() { return getToken(VyperParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(VyperParser.LT_EQ, 0); }
		public TerminalNode NOT_EQ_1() { return getToken(VyperParser.NOT_EQ_1, 0); }
		public TerminalNode NOT_EQ_2() { return getToken(VyperParser.NOT_EQ_2, 0); }
		public TerminalNode IN() { return getToken(VyperParser.IN, 0); }
		public TerminalNode NOT() { return getToken(VyperParser.NOT, 0); }
		public TerminalNode IS() { return getToken(VyperParser.IS, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_comp_op);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(LESS_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(GREATER_THAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(791);
				match(GT_EQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(792);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(793);
				match(NOT_EQ_1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(794);
				match(NOT_EQ_2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(795);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(796);
				match(NOT);
				setState(797);
				match(IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(798);
				match(IS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(799);
				match(IS);
				setState(800);
				match(NOT);
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

	public static class Star_exprContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(VyperParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterStar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitStar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitStar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_star_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(STAR);
			setState(804);
			expr();
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
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public List<TerminalNode> OR_OP() { return getTokens(VyperParser.OR_OP); }
		public TerminalNode OR_OP(int i) {
			return getToken(VyperParser.OR_OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			xor_expr();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(807);
				match(OR_OP);
				setState(808);
				xor_expr();
				}
				}
				setState(813);
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

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(VyperParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(VyperParser.XOR, i);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterXor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitXor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitXor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			and_expr();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(815);
				match(XOR);
				setState(816);
				and_expr();
				}
				}
				setState(821);
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

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public List<TerminalNode> AND_OP() { return getTokens(VyperParser.AND_OP); }
		public TerminalNode AND_OP(int i) {
			return getToken(VyperParser.AND_OP, i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAnd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			shift_expr();
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OP) {
				{
				{
				setState(823);
				match(AND_OP);
				setState(824);
				shift_expr();
				}
				}
				setState(829);
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

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Arith_exprContext> arith_expr() {
			return getRuleContexts(Arith_exprContext.class);
		}
		public Arith_exprContext arith_expr(int i) {
			return getRuleContext(Arith_exprContext.class,i);
		}
		public List<TerminalNode> LEFT_SHIFT() { return getTokens(VyperParser.LEFT_SHIFT); }
		public TerminalNode LEFT_SHIFT(int i) {
			return getToken(VyperParser.LEFT_SHIFT, i);
		}
		public List<TerminalNode> RIGHT_SHIFT() { return getTokens(VyperParser.RIGHT_SHIFT); }
		public TerminalNode RIGHT_SHIFT(int i) {
			return getToken(VyperParser.RIGHT_SHIFT, i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterShift_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitShift_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitShift_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			arith_expr();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SHIFT || _la==RIGHT_SHIFT) {
				{
				{
				setState(831);
				_la = _input.LA(1);
				if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(832);
				arith_expr();
				}
				}
				setState(837);
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

	public static class Arith_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(VyperParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(VyperParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(VyperParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(VyperParser.MINUS, i);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitArith_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitArith_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			term();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==MINUS) {
				{
				{
				setState(839);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(840);
				term();
				}
				}
				setState(845);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(VyperParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(VyperParser.STAR, i);
		}
		public List<TerminalNode> AT() { return getTokens(VyperParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(VyperParser.AT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(VyperParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(VyperParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(VyperParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(VyperParser.MOD, i);
		}
		public List<TerminalNode> IDIV() { return getTokens(VyperParser.IDIV); }
		public TerminalNode IDIV(int i) {
			return getToken(VyperParser.IDIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			factor();
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (STAR - 51)) | (1L << (DIV - 51)) | (1L << (MOD - 51)) | (1L << (IDIV - 51)) | (1L << (AT - 51)))) != 0)) {
				{
				{
				setState(847);
				_la = _input.LA(1);
				if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (STAR - 51)) | (1L << (DIV - 51)) | (1L << (MOD - 51)) | (1L << (IDIV - 51)) | (1L << (AT - 51)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(848);
				factor();
				}
				}
				setState(853);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode ADD() { return getToken(VyperParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(VyperParser.MINUS, 0); }
		public TerminalNode NOT_OP() { return getToken(VyperParser.NOT_OP, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_factor);
		int _la;
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case MINUS:
			case NOT_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(855);
				factor();
				}
				break;
			case STRING:
			case NUMBER:
			case NONE:
			case TRUE:
			case FALSE:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				power();
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

	public static class PowerContext extends ParserRuleContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode POWER() { return getToken(VyperParser.POWER, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			atom_expr();
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(860);
				match(POWER);
				setState(861);
				factor();
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

	public static class Atom_exprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(VyperParser.AWAIT, 0); }
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAtom_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAtom_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAtom_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_atom_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(864);
				match(AWAIT);
				}
			}

			setState(867);
			atom();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0)) {
				{
				{
				setState(868);
				trailer();
				}
				}
				setState(873);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(VyperParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(VyperParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACK() { return getToken(VyperParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(VyperParser.CLOSE_BRACK, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(VyperParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(VyperParser.CLOSE_BRACE, 0); }
		public Atom_nameContext atom_name() {
			return getRuleContext(Atom_nameContext.class,0);
		}
		public Atom_numberContext atom_number() {
			return getRuleContext(Atom_numberContext.class,0);
		}
		public Atom_stringContext atom_string() {
			return getRuleContext(Atom_stringContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(VyperParser.ELLIPSIS, 0); }
		public TerminalNode NONE() { return getToken(VyperParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(VyperParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(VyperParser.FALSE, 0); }
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Testlist_compContext testlist_comp() {
			return getRuleContext(Testlist_compContext.class,0);
		}
		public DictorsetmakerContext dictorsetmaker() {
			return getRuleContext(DictorsetmakerContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				setState(874);
				match(OPEN_PAREN);
				setState(877);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(875);
					yield_expr();
					}
					break;
				case STRING:
				case NUMBER:
				case LAMBDA:
				case NOT:
				case NONE:
				case TRUE:
				case FALSE:
				case AWAIT:
				case NAME:
				case ELLIPSIS:
				case STAR:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case ADD:
				case MINUS:
				case NOT_OP:
				case OPEN_BRACE:
					{
					setState(876);
					testlist_comp();
					}
					break;
				case CLOSE_PAREN:
					break;
				default:
					break;
				}
				setState(879);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				{
				setState(880);
				match(OPEN_BRACK);
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
					{
					setState(881);
					testlist_comp();
					}
				}

				setState(884);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				{
				setState(885);
				match(OPEN_BRACE);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << POWER) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
					{
					setState(886);
					dictorsetmaker();
					}
				}

				setState(889);
				match(CLOSE_BRACE);
				}
				break;
			case NAME:
				{
				setState(890);
				atom_name();
				}
				break;
			case NUMBER:
				{
				setState(891);
				atom_number();
				}
				break;
			case STRING:
				{
				setState(892);
				atom_string();
				}
				break;
			case ELLIPSIS:
				{
				setState(893);
				match(ELLIPSIS);
				}
				break;
			case NONE:
				{
				setState(894);
				match(NONE);
				}
				break;
			case TRUE:
				{
				setState(895);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(896);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Atom_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(VyperParser.NAME, 0); }
		public Atom_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAtom_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAtom_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAtom_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_nameContext atom_name() throws RecognitionException {
		Atom_nameContext _localctx = new Atom_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_atom_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(NAME);
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

	public static class Atom_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VyperParser.NUMBER, 0); }
		public Atom_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAtom_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAtom_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAtom_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_numberContext atom_number() throws RecognitionException {
		Atom_numberContext _localctx = new Atom_numberContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_atom_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(NUMBER);
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

	public static class Atom_stringContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(VyperParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VyperParser.STRING, i);
		}
		public Atom_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterAtom_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitAtom_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitAtom_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_stringContext atom_string() throws RecognitionException {
		Atom_stringContext _localctx = new Atom_stringContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_atom_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(903);
				match(STRING);
				}
				}
				setState(906); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	public static class Testlist_compContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public Testlist_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterTestlist_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitTestlist_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitTestlist_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_compContext testlist_comp() throws RecognitionException {
		Testlist_compContext _localctx = new Testlist_compContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				{
				setState(908);
				test();
				}
				break;
			case STAR:
				{
				setState(909);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(926);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case ASYNC:
				{
				setState(912);
				comp_for();
				}
				break;
			case CLOSE_PAREN:
			case COMMA:
			case CLOSE_BRACK:
				{
				setState(920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(913);
						match(COMMA);
						setState(916);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STRING:
						case NUMBER:
						case LAMBDA:
						case NOT:
						case NONE:
						case TRUE:
						case FALSE:
						case AWAIT:
						case NAME:
						case ELLIPSIS:
						case OPEN_PAREN:
						case OPEN_BRACK:
						case ADD:
						case MINUS:
						case NOT_OP:
						case OPEN_BRACE:
							{
							setState(914);
							test();
							}
							break;
						case STAR:
							{
							setState(915);
							star_expr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(922);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(923);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TrailerContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(VyperParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(VyperParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(VyperParser.OPEN_BRACK, 0); }
		public SubscriptlistContext subscriptlist() {
			return getRuleContext(SubscriptlistContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(VyperParser.CLOSE_BRACK, 0); }
		public TerminalNode DOT() { return getToken(VyperParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(VyperParser.NAME, 0); }
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_trailer);
		int _la;
		try {
			setState(939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				match(OPEN_PAREN);
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << POWER) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
					{
					setState(929);
					arglist();
					}
				}

				setState(932);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				match(OPEN_BRACK);
				setState(934);
				subscriptlist();
				setState(935);
				match(CLOSE_BRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(937);
				match(DOT);
				setState(938);
				match(NAME);
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

	public static class SubscriptlistContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public SubscriptlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterSubscriptlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitSubscriptlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitSubscriptlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			subscript();
			setState(946);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(942);
					match(COMMA);
					setState(943);
					subscript();
					}
					} 
				}
				setState(948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(949);
				match(COMMA);
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

	public static class SubscriptContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COLON() { return getToken(VyperParser.COLON, 0); }
		public SliceopContext sliceop() {
			return getRuleContext(SliceopContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_subscript);
		int _la;
		try {
			setState(963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
					{
					setState(953);
					test();
					}
				}

				setState(956);
				match(COLON);
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
					{
					setState(957);
					test();
					}
				}

				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(960);
					sliceop();
					}
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

	public static class SliceopContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(VyperParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SliceopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterSliceop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitSliceop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitSliceop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceopContext sliceop() throws RecognitionException {
		SliceopContext _localctx = new SliceopContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_sliceop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(COLON);
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
				{
				setState(966);
				test();
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case NONE:
			case TRUE:
			case FALSE:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				{
				setState(969);
				expr();
				}
				break;
			case STAR:
				{
				setState(970);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(973);
					match(COMMA);
					setState(976);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
					case NUMBER:
					case NONE:
					case TRUE:
					case FALSE:
					case AWAIT:
					case NAME:
					case ELLIPSIS:
					case OPEN_PAREN:
					case OPEN_BRACK:
					case ADD:
					case MINUS:
					case NOT_OP:
					case OPEN_BRACE:
						{
						setState(974);
						expr();
						}
						break;
					case STAR:
						{
						setState(975);
						star_expr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(983);
				match(COMMA);
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

	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterTestlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitTestlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			test();
			setState(991);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(987);
					match(COMMA);
					setState(988);
					test();
					}
					} 
				}
				setState(993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(994);
				match(COMMA);
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

	public static class DictorsetmakerContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(VyperParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(VyperParser.COLON, i);
		}
		public List<TerminalNode> POWER() { return getTokens(VyperParser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(VyperParser.POWER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public DictorsetmakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictorsetmaker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterDictorsetmaker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitDictorsetmaker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitDictorsetmaker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictorsetmakerContext dictorsetmaker() throws RecognitionException {
		DictorsetmakerContext _localctx = new DictorsetmakerContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_dictorsetmaker);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				{
				setState(1003);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case NUMBER:
				case LAMBDA:
				case NOT:
				case NONE:
				case TRUE:
				case FALSE:
				case AWAIT:
				case NAME:
				case ELLIPSIS:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case ADD:
				case MINUS:
				case NOT_OP:
				case OPEN_BRACE:
					{
					setState(997);
					test();
					setState(998);
					match(COLON);
					setState(999);
					test();
					}
					break;
				case POWER:
					{
					setState(1001);
					match(POWER);
					setState(1002);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1023);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case ASYNC:
					{
					setState(1005);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(1017);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1006);
							match(COMMA);
							setState(1013);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case STRING:
							case NUMBER:
							case LAMBDA:
							case NOT:
							case NONE:
							case TRUE:
							case FALSE:
							case AWAIT:
							case NAME:
							case ELLIPSIS:
							case OPEN_PAREN:
							case OPEN_BRACK:
							case ADD:
							case MINUS:
							case NOT_OP:
							case OPEN_BRACE:
								{
								setState(1007);
								test();
								setState(1008);
								match(COLON);
								setState(1009);
								test();
								}
								break;
							case POWER:
								{
								setState(1011);
								match(POWER);
								setState(1012);
								expr();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							} 
						}
						setState(1019);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
					}
					setState(1021);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1020);
						match(COMMA);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(1027);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case NUMBER:
				case LAMBDA:
				case NOT:
				case NONE:
				case TRUE:
				case FALSE:
				case AWAIT:
				case NAME:
				case ELLIPSIS:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case ADD:
				case MINUS:
				case NOT_OP:
				case OPEN_BRACE:
					{
					setState(1025);
					test();
					}
					break;
				case STAR:
					{
					setState(1026);
					star_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1043);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case ASYNC:
					{
					setState(1029);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(1037);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1030);
							match(COMMA);
							setState(1033);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case STRING:
							case NUMBER:
							case LAMBDA:
							case NOT:
							case NONE:
							case TRUE:
							case FALSE:
							case AWAIT:
							case NAME:
							case ELLIPSIS:
							case OPEN_PAREN:
							case OPEN_BRACK:
							case ADD:
							case MINUS:
							case NOT_OP:
							case OPEN_BRACE:
								{
								setState(1031);
								test();
								}
								break;
							case STAR:
								{
								setState(1032);
								star_expr();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							} 
						}
						setState(1039);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
					}
					setState(1041);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1040);
						match(COMMA);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
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

	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(VyperParser.CLASS, 0); }
		public TerminalNode NAME() { return getToken(VyperParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(VyperParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(VyperParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(VyperParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(CLASS);
			setState(1048);
			match(NAME);
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(1049);
				match(OPEN_PAREN);
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << POWER) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
					{
					setState(1050);
					arglist();
					}
				}

				setState(1053);
				match(CLOSE_PAREN);
				}
			}

			setState(1056);
			match(COLON);
			setState(1057);
			suite();
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

	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VyperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VyperParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			argument();
			setState(1064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1060);
					match(COMMA);
					setState(1061);
					argument();
					}
					} 
				}
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1067);
				match(COMMA);
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(VyperParser.ASSIGN, 0); }
		public TerminalNode POWER() { return getToken(VyperParser.POWER, 0); }
		public TerminalNode STAR() { return getToken(VyperParser.STAR, 0); }
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1070);
				test();
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR || _la==ASYNC) {
					{
					setState(1071);
					comp_for();
					}
				}

				}
				break;
			case 2:
				{
				setState(1074);
				test();
				setState(1075);
				match(ASSIGN);
				setState(1076);
				test();
				}
				break;
			case 3:
				{
				setState(1078);
				match(POWER);
				setState(1079);
				test();
				}
				break;
			case 4:
				{
				setState(1080);
				match(STAR);
				setState(1081);
				test();
				}
				break;
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

	public static class Comp_iterContext extends ParserRuleContext {
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public Comp_ifContext comp_if() {
			return getRuleContext(Comp_ifContext.class,0);
		}
		public Comp_iterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_iter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterComp_iter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitComp_iter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitComp_iter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_iterContext comp_iter() throws RecognitionException {
		Comp_iterContext _localctx = new Comp_iterContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_comp_iter);
		try {
			setState(1086);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case ASYNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1084);
				comp_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				comp_if();
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

	public static class Comp_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VyperParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(VyperParser.IN, 0); }
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(VyperParser.ASYNC, 0); }
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterComp_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitComp_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitComp_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(1088);
				match(ASYNC);
				}
			}

			setState(1091);
			match(FOR);
			setState(1092);
			exprlist();
			setState(1093);
			match(IN);
			setState(1094);
			or_test();
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << ASYNC))) != 0)) {
				{
				setState(1095);
				comp_iter();
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

	public static class Comp_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VyperParser.IF, 0); }
		public Test_nocondContext test_nocond() {
			return getRuleContext(Test_nocondContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterComp_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitComp_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitComp_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_ifContext comp_if() throws RecognitionException {
		Comp_ifContext _localctx = new Comp_ifContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_comp_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(IF);
			setState(1099);
			test_nocond();
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << ASYNC))) != 0)) {
				{
				setState(1100);
				comp_iter();
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

	public static class Encoding_declContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(VyperParser.NAME, 0); }
		public Encoding_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encoding_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterEncoding_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitEncoding_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitEncoding_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Encoding_declContext encoding_decl() throws RecognitionException {
		Encoding_declContext _localctx = new Encoding_declContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_encoding_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(NAME);
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

	public static class Yield_exprContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(VyperParser.YIELD, 0); }
		public Yield_argContext yield_arg() {
			return getRuleContext(Yield_argContext.class,0);
		}
		public Yield_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterYield_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitYield_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitYield_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_exprContext yield_expr() throws RecognitionException {
		Yield_exprContext _localctx = new Yield_exprContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_yield_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(YIELD);
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << FROM) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << AWAIT) | (1L << NAME) | (1L << ELLIPSIS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ADD - 66)) | (1L << (MINUS - 66)) | (1L << (NOT_OP - 66)) | (1L << (OPEN_BRACE - 66)))) != 0)) {
				{
				setState(1106);
				yield_arg();
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

	public static class Yield_argContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(VyperParser.FROM, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Yield_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).enterYield_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VyperListener ) ((VyperListener)listener).exitYield_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VyperVisitor ) return ((VyperVisitor<? extends T>)visitor).visitYield_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_argContext yield_arg() throws RecognitionException {
		Yield_argContext _localctx = new Yield_argContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_yield_arg);
		try {
			setState(1112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1109);
				match(FROM);
				setState(1110);
				test();
				}
				break;
			case STRING:
			case NUMBER:
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case AWAIT:
			case NAME:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				testlist();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3e\u045d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\2\3\2\3\2\5\2\u00ba\n\2"+
		"\3\3\3\3\7\3\u00be\n\3\f\3\16\3\u00c1\13\3\3\3\3\3\3\4\3\4\7\4\u00c7\n"+
		"\4\f\4\16\4\u00ca\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00d2\n\5\3\5\5\5\u00d5"+
		"\n\5\3\5\3\5\3\6\6\6\u00da\n\6\r\6\16\6\u00db\3\7\3\7\3\7\3\7\5\7\u00e2"+
		"\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00ec\n\t\3\t\3\t\3\t\3\n\3\n"+
		"\5\n\u00f3\n\n\3\n\3\n\3\13\3\13\3\13\5\13\u00fa\n\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0100\n\13\7\13\u0102\n\13\f\13\16\13\u0105\13\13\3\13\3\13\3"+
		"\13\5\13\u010a\n\13\3\13\3\13\3\13\3\13\5\13\u0110\n\13\7\13\u0112\n\13"+
		"\f\13\16\13\u0115\13\13\3\13\3\13\3\13\3\13\5\13\u011b\n\13\5\13\u011d"+
		"\n\13\5\13\u011f\n\13\3\13\3\13\3\13\5\13\u0124\n\13\5\13\u0126\n\13\5"+
		"\13\u0128\n\13\3\13\3\13\5\13\u012c\n\13\3\13\3\13\3\13\3\13\5\13\u0132"+
		"\n\13\7\13\u0134\n\13\f\13\16\13\u0137\13\13\3\13\3\13\3\13\3\13\5\13"+
		"\u013d\n\13\5\13\u013f\n\13\5\13\u0141\n\13\3\13\3\13\3\13\5\13\u0146"+
		"\n\13\5\13\u0148\n\13\3\f\3\f\3\f\5\f\u014d\n\f\3\r\3\r\3\r\5\r\u0152"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u0158\n\r\7\r\u015a\n\r\f\r\16\r\u015d\13\r\3"+
		"\r\3\r\3\r\5\r\u0162\n\r\3\r\3\r\3\r\3\r\5\r\u0168\n\r\7\r\u016a\n\r\f"+
		"\r\16\r\u016d\13\r\3\r\3\r\3\r\3\r\5\r\u0173\n\r\5\r\u0175\n\r\5\r\u0177"+
		"\n\r\3\r\3\r\3\r\5\r\u017c\n\r\5\r\u017e\n\r\5\r\u0180\n\r\3\r\3\r\5\r"+
		"\u0184\n\r\3\r\3\r\3\r\3\r\5\r\u018a\n\r\7\r\u018c\n\r\f\r\16\r\u018f"+
		"\13\r\3\r\3\r\3\r\3\r\5\r\u0195\n\r\5\r\u0197\n\r\5\r\u0199\n\r\3\r\3"+
		"\r\3\r\5\r\u019e\n\r\5\r\u01a0\n\r\3\16\3\16\3\17\3\17\5\17\u01a6\n\17"+
		"\3\20\3\20\3\20\7\20\u01ab\n\20\f\20\16\20\u01ae\13\20\3\20\5\20\u01b1"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01bd\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u01c4\n\22\3\22\3\22\3\22\5\22\u01c9\n"+
		"\22\7\22\u01cb\n\22\f\22\16\22\u01ce\13\22\5\22\u01d0\n\22\3\23\3\23\3"+
		"\23\3\23\5\23\u01d6\n\23\3\24\3\24\5\24\u01da\n\24\3\24\3\24\3\24\5\24"+
		"\u01df\n\24\7\24\u01e1\n\24\f\24\16\24\u01e4\13\24\3\24\5\24\u01e7\n\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u01f5"+
		"\n\30\3\31\3\31\3\32\3\32\3\33\3\33\5\33\u01fd\n\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\5\35\u0205\n\35\5\35\u0207\n\35\3\36\3\36\5\36\u020b\n\36\3"+
		"\37\3\37\3\37\3 \3 \7 \u0212\n \f \16 \u0215\13 \3 \3 \6 \u0219\n \r "+
		"\16 \u021a\5 \u021d\n \3 \3 \3 \3 \3 \3 \3 \5 \u0226\n \3!\3!\3!\5!\u022b"+
		"\n!\3\"\3\"\3\"\5\"\u0230\n\"\3#\3#\3#\7#\u0235\n#\f#\16#\u0238\13#\3"+
		"#\5#\u023b\n#\3$\3$\3$\7$\u0240\n$\f$\16$\u0243\13$\3%\3%\3%\7%\u0248"+
		"\n%\f%\16%\u024b\13%\3&\3&\3&\3&\7&\u0251\n&\f&\16&\u0254\13&\3\'\3\'"+
		"\3\'\3\'\7\'\u025a\n\'\f\'\16\'\u025d\13\'\3(\3(\3(\3(\5(\u0263\n(\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\5)\u026e\n)\3*\3*\3*\3*\5*\u0274\n*\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\7+\u027f\n+\f+\16+\u0282\13+\3+\3+\3+\5+\u0287\n+\3"+
		",\3,\3,\3,\3,\3,\3,\5,\u0290\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u029b\n"+
		"-\3.\3.\3.\3.\3.\3.\3.\6.\u02a4\n.\r.\16.\u02a5\3.\3.\3.\5.\u02ab\n.\3"+
		".\3.\3.\5.\u02b0\n.\3.\3.\3.\5.\u02b5\n.\3/\3/\3/\3/\7/\u02bb\n/\f/\16"+
		"/\u02be\13/\3/\3/\3/\3\60\3\60\3\60\5\60\u02c6\n\60\3\61\3\61\3\61\3\61"+
		"\5\61\u02cc\n\61\5\61\u02ce\n\61\3\62\3\62\3\62\3\62\6\62\u02d4\n\62\r"+
		"\62\16\62\u02d5\3\62\3\62\5\62\u02da\n\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u02e2\n\63\3\63\5\63\u02e5\n\63\3\64\3\64\5\64\u02e9\n\64\3\65\3"+
		"\65\5\65\u02ed\n\65\3\65\3\65\3\65\3\66\3\66\5\66\u02f4\n\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\7\67\u02fc\n\67\f\67\16\67\u02ff\13\67\38\38\38\7"+
		"8\u0304\n8\f8\168\u0307\138\39\39\39\59\u030c\n9\3:\3:\3:\3:\7:\u0312"+
		"\n:\f:\16:\u0315\13:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0324\n"+
		";\3<\3<\3<\3=\3=\3=\7=\u032c\n=\f=\16=\u032f\13=\3>\3>\3>\7>\u0334\n>"+
		"\f>\16>\u0337\13>\3?\3?\3?\7?\u033c\n?\f?\16?\u033f\13?\3@\3@\3@\7@\u0344"+
		"\n@\f@\16@\u0347\13@\3A\3A\3A\7A\u034c\nA\fA\16A\u034f\13A\3B\3B\3B\7"+
		"B\u0354\nB\fB\16B\u0357\13B\3C\3C\3C\5C\u035c\nC\3D\3D\3D\5D\u0361\nD"+
		"\3E\5E\u0364\nE\3E\3E\7E\u0368\nE\fE\16E\u036b\13E\3F\3F\3F\5F\u0370\n"+
		"F\3F\3F\3F\5F\u0375\nF\3F\3F\3F\5F\u037a\nF\3F\3F\3F\3F\3F\3F\3F\3F\5"+
		"F\u0384\nF\3G\3G\3H\3H\3I\6I\u038b\nI\rI\16I\u038c\3J\3J\5J\u0391\nJ\3"+
		"J\3J\3J\3J\5J\u0397\nJ\7J\u0399\nJ\fJ\16J\u039c\13J\3J\5J\u039f\nJ\5J"+
		"\u03a1\nJ\3K\3K\5K\u03a5\nK\3K\3K\3K\3K\3K\3K\3K\5K\u03ae\nK\3L\3L\3L"+
		"\7L\u03b3\nL\fL\16L\u03b6\13L\3L\5L\u03b9\nL\3M\3M\5M\u03bd\nM\3M\3M\5"+
		"M\u03c1\nM\3M\5M\u03c4\nM\5M\u03c6\nM\3N\3N\5N\u03ca\nN\3O\3O\5O\u03ce"+
		"\nO\3O\3O\3O\5O\u03d3\nO\7O\u03d5\nO\fO\16O\u03d8\13O\3O\5O\u03db\nO\3"+
		"P\3P\3P\7P\u03e0\nP\fP\16P\u03e3\13P\3P\5P\u03e6\nP\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\5Q\u03ee\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u03f8\nQ\7Q\u03fa\nQ\fQ\16Q\u03fd"+
		"\13Q\3Q\5Q\u0400\nQ\5Q\u0402\nQ\3Q\3Q\5Q\u0406\nQ\3Q\3Q\3Q\3Q\5Q\u040c"+
		"\nQ\7Q\u040e\nQ\fQ\16Q\u0411\13Q\3Q\5Q\u0414\nQ\5Q\u0416\nQ\5Q\u0418\n"+
		"Q\3R\3R\3R\3R\5R\u041e\nR\3R\5R\u0421\nR\3R\3R\3R\3S\3S\3S\7S\u0429\n"+
		"S\fS\16S\u042c\13S\3S\5S\u042f\nS\3T\3T\5T\u0433\nT\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\5T\u043d\nT\3U\3U\5U\u0441\nU\3V\5V\u0444\nV\3V\3V\3V\3V\3V\5V"+
		"\u044b\nV\3W\3W\3W\5W\u0450\nW\3X\3X\3Y\3Y\5Y\u0456\nY\3Z\3Z\3Z\5Z\u045b"+
		"\nZ\3Z\2\2[\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\2\b\3\2Ua\3\2\63\64\3"+
		"\2BC\3\2DE\5\2\65\65FHSS\4\2DEII\2\u04d7\2\u00b9\3\2\2\2\4\u00bf\3\2\2"+
		"\2\6\u00c4\3\2\2\2\b\u00cd\3\2\2\2\n\u00d9\3\2\2\2\f\u00dd\3\2\2\2\16"+
		"\u00e3\3\2\2\2\20\u00e6\3\2\2\2\22\u00f0\3\2\2\2\24\u0147\3\2\2\2\26\u0149"+
		"\3\2\2\2\30\u019f\3\2\2\2\32\u01a1\3\2\2\2\34\u01a5\3\2\2\2\36\u01a7\3"+
		"\2\2\2 \u01bc\3\2\2\2\"\u01be\3\2\2\2$\u01d1\3\2\2\2&\u01d9\3\2\2\2(\u01e8"+
		"\3\2\2\2*\u01ea\3\2\2\2,\u01ed\3\2\2\2.\u01f4\3\2\2\2\60\u01f6\3\2\2\2"+
		"\62\u01f8\3\2\2\2\64\u01fa\3\2\2\2\66\u01fe\3\2\2\28\u0200\3\2\2\2:\u020a"+
		"\3\2\2\2<\u020c\3\2\2\2>\u020f\3\2\2\2@\u0227\3\2\2\2B\u022c\3\2\2\2D"+
		"\u0231\3\2\2\2F\u023c\3\2\2\2H\u0244\3\2\2\2J\u024c\3\2\2\2L\u0255\3\2"+
		"\2\2N\u025e\3\2\2\2P\u026d\3\2\2\2R\u026f\3\2\2\2T\u0275\3\2\2\2V\u0288"+
		"\3\2\2\2X\u0291\3\2\2\2Z\u029c\3\2\2\2\\\u02b6\3\2\2\2^\u02c2\3\2\2\2"+
		"`\u02c7\3\2\2\2b\u02d9\3\2\2\2d\u02e4\3\2\2\2f\u02e8\3\2\2\2h\u02ea\3"+
		"\2\2\2j\u02f1\3\2\2\2l\u02f8\3\2\2\2n\u0300\3\2\2\2p\u030b\3\2\2\2r\u030d"+
		"\3\2\2\2t\u0323\3\2\2\2v\u0325\3\2\2\2x\u0328\3\2\2\2z\u0330\3\2\2\2|"+
		"\u0338\3\2\2\2~\u0340\3\2\2\2\u0080\u0348\3\2\2\2\u0082\u0350\3\2\2\2"+
		"\u0084\u035b\3\2\2\2\u0086\u035d\3\2\2\2\u0088\u0363\3\2\2\2\u008a\u0383"+
		"\3\2\2\2\u008c\u0385\3\2\2\2\u008e\u0387\3\2\2\2\u0090\u038a\3\2\2\2\u0092"+
		"\u0390\3\2\2\2\u0094\u03ad\3\2\2\2\u0096\u03af\3\2\2\2\u0098\u03c5\3\2"+
		"\2\2\u009a\u03c7\3\2\2\2\u009c\u03cd\3\2\2\2\u009e\u03dc\3\2\2\2\u00a0"+
		"\u0417\3\2\2\2\u00a2\u0419\3\2\2\2\u00a4\u0425\3\2\2\2\u00a6\u043c\3\2"+
		"\2\2\u00a8\u0440\3\2\2\2\u00aa\u0443\3\2\2\2\u00ac\u044c\3\2\2\2\u00ae"+
		"\u0451\3\2\2\2\u00b0\u0453\3\2\2\2\u00b2\u045a\3\2\2\2\u00b4\u00ba\7)"+
		"\2\2\u00b5\u00ba\5\36\20\2\u00b6\u00b7\5P)\2\u00b7\u00b8\7)\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2"+
		"\2\2\u00ba\3\3\2\2\2\u00bb\u00be\7)\2\2\u00bc\u00be\5\34\17\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\2"+
		"\2\3\u00c3\5\3\2\2\2\u00c4\u00c8\5\u009eP\2\u00c5\u00c7\7)\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\2\2\3\u00cc\7\3\2\2\2"+
		"\u00cd\u00ce\7S\2\2\u00ce\u00d4\5H%\2\u00cf\u00d1\7\66\2\2\u00d0\u00d2"+
		"\5\u00a4S\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2"+
		"\2\u00d3\u00d5\7\67\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\7)\2\2\u00d7\t\3\2\2\2\u00d8\u00da\5\b\5\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\13\3\2\2\2\u00dd\u00e1\5\n\6\2\u00de\u00e2\5\u00a2R\2\u00df"+
		"\u00e2\5\20\t\2\u00e0\u00e2\5\16\b\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\r\3\2\2\2\u00e3\u00e4\7\'\2\2\u00e4\u00e5"+
		"\5\20\t\2\u00e5\17\3\2\2\2\u00e6\u00e7\7\6\2\2\u00e7\u00e8\7*\2\2\u00e8"+
		"\u00eb\5\22\n\2\u00e9\u00ea\7T\2\2\u00ea\u00ec\5d\63\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\79\2\2\u00ee"+
		"\u00ef\5b\62\2\u00ef\21\3\2\2\2\u00f0\u00f2\7\66\2\2\u00f1\u00f3\5\24"+
		"\13\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\7\67\2\2\u00f5\23\3\2\2\2\u00f6\u00f9\5\26\f\2\u00f7\u00f8\7<\2"+
		"\2\u00f8\u00fa\5d\63\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0103"+
		"\3\2\2\2\u00fb\u00fc\78\2\2\u00fc\u00ff\5\26\f\2\u00fd\u00fe\7<\2\2\u00fe"+
		"\u0100\5d\63\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00fb\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0127\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0125\78"+
		"\2\2\u0107\u0109\7\65\2\2\u0108\u010a\5\26\f\2\u0109\u0108\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0113\3\2\2\2\u010b\u010c\78\2\2\u010c\u010f\5\26"+
		"\f\2\u010d\u010e\7<\2\2\u010e\u0110\5d\63\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010b\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011e\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u011c\78\2\2\u0117\u0118\7;\2\2\u0118\u011a\5\26"+
		"\f\2\u0119\u011b\78\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u0117\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2"+
		"\2\2\u011e\u0116\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0126\3\2\2\2\u0120"+
		"\u0121\7;\2\2\u0121\u0123\5\26\f\2\u0122\u0124\78\2\2\u0123\u0122\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0107\3\2\2\2\u0125"+
		"\u0120\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0106\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u0148\3\2\2\2\u0129\u012b\7\65\2\2\u012a"+
		"\u012c\5\26\f\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0135\3"+
		"\2\2\2\u012d\u012e\78\2\2\u012e\u0131\5\26\f\2\u012f\u0130\7<\2\2\u0130"+
		"\u0132\5d\63\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u012d\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0140\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013e\78"+
		"\2\2\u0139\u013a\7;\2\2\u013a\u013c\5\26\f\2\u013b\u013d\78\2\2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0139\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0138\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0148\3\2\2\2\u0142\u0143\7;\2\2\u0143\u0145\5\26"+
		"\f\2\u0144\u0146\78\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u00f6\3\2\2\2\u0147\u0129\3\2\2\2\u0147\u0142\3\2"+
		"\2\2\u0148\25\3\2\2\2\u0149\u014c\7*\2\2\u014a\u014b\79\2\2\u014b\u014d"+
		"\5d\63\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\27\3\2\2\2\u014e"+
		"\u0151\5\32\16\2\u014f\u0150\7<\2\2\u0150\u0152\5d\63\2\u0151\u014f\3"+
		"\2\2\2\u0151\u0152\3\2\2\2\u0152\u015b\3\2\2\2\u0153\u0154\78\2\2\u0154"+
		"\u0157\5\32\16\2\u0155\u0156\7<\2\2\u0156\u0158\5d\63\2\u0157\u0155\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0153\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u017f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u017d\78\2\2\u015f\u0161\7\65\2\2\u0160"+
		"\u0162\5\32\16\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u016b\3"+
		"\2\2\2\u0163\u0164\78\2\2\u0164\u0167\5\32\16\2\u0165\u0166\7<\2\2\u0166"+
		"\u0168\5d\63\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2"+
		"\2\2\u0169\u0163\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u0176\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0174\78"+
		"\2\2\u016f\u0170\7;\2\2\u0170\u0172\5\32\16\2\u0171\u0173\78\2\2\u0172"+
		"\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u016f\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u016e\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u017e\3\2\2\2\u0178\u0179\7;\2\2\u0179\u017b\5\32"+
		"\16\2\u017a\u017c\78\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u015f\3\2\2\2\u017d\u0178\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u0180\3\2\2\2\u017f\u015e\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u01a0\3\2\2\2\u0181\u0183\7\65\2\2\u0182\u0184\5\32\16\2\u0183\u0182"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u018d\3\2\2\2\u0185\u0186\78\2\2\u0186"+
		"\u0189\5\32\16\2\u0187\u0188\7<\2\2\u0188\u018a\5d\63\2\u0189\u0187\3"+
		"\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0185\3\2\2\2\u018c"+
		"\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0198\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u0190\u0196\78\2\2\u0191\u0192\7;\2\2\u0192\u0194"+
		"\5\32\16\2\u0193\u0195\78\2\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2"+
		"\u0195\u0197\3\2\2\2\u0196\u0191\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199"+
		"\3\2\2\2\u0198\u0190\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01a0\3\2\2\2\u019a"+
		"\u019b\7;\2\2\u019b\u019d\5\32\16\2\u019c\u019e\78\2\2\u019d\u019c\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u014e\3\2\2\2\u019f"+
		"\u0181\3\2\2\2\u019f\u019a\3\2\2\2\u01a0\31\3\2\2\2\u01a1\u01a2\7*\2\2"+
		"\u01a2\33\3\2\2\2\u01a3\u01a6\5\36\20\2\u01a4\u01a6\5P)\2\u01a5\u01a3"+
		"\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\35\3\2\2\2\u01a7\u01ac\5 \21\2\u01a8"+
		"\u01a9\7:\2\2\u01a9\u01ab\5 \21\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b1\7:\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\7)\2\2\u01b3\37\3\2\2\2\u01b4\u01bd"+
		"\5\"\22\2\u01b5\u01bd\5*\26\2\u01b6\u01bd\5,\27\2\u01b7\u01bd\5.\30\2"+
		"\u01b8\u01bd\5:\36\2\u01b9\u01bd\5J&\2\u01ba\u01bd\5L\'\2\u01bb\u01bd"+
		"\5N(\2\u01bc\u01b4\3\2\2\2\u01bc\u01b5\3\2\2\2\u01bc\u01b6\3\2\2\2\u01bc"+
		"\u01b7\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bc\u01bb\3\2\2\2\u01bd!\3\2\2\2\u01be\u01cf\5&\24\2\u01bf\u01d0"+
		"\5$\23\2\u01c0\u01c3\5(\25\2\u01c1\u01c4\5\u00b0Y\2\u01c2\u01c4\5\u009e"+
		"P\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01d0\3\2\2\2\u01c5"+
		"\u01c8\7<\2\2\u01c6\u01c9\5\u00b0Y\2\u01c7\u01c9\5&\24\2\u01c8\u01c6\3"+
		"\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c5\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01bf\3\2\2\2\u01cf\u01c0\3\2\2\2\u01cf"+
		"\u01cc\3\2\2\2\u01d0#\3\2\2\2\u01d1\u01d2\79\2\2\u01d2\u01d5\5d\63\2\u01d3"+
		"\u01d4\7<\2\2\u01d4\u01d6\5d\63\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6%\3\2\2\2\u01d7\u01da\5d\63\2\u01d8\u01da\5v<\2\u01d9\u01d7"+
		"\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u01e2\3\2\2\2\u01db\u01de\78\2\2\u01dc"+
		"\u01df\5d\63\2\u01dd\u01df\5v<\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2"+
		"\2\u01df\u01e1\3\2\2\2\u01e0\u01db\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e7\78\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\'\3\2\2\2"+
		"\u01e8\u01e9\t\2\2\2\u01e9)\3\2\2\2\u01ea\u01eb\7#\2\2\u01eb\u01ec\5\u009c"+
		"O\2\u01ec+\3\2\2\2\u01ed\u01ee\7$\2\2\u01ee-\3\2\2\2\u01ef\u01f5\5\60"+
		"\31\2\u01f0\u01f5\5\62\32\2\u01f1\u01f5\5\64\33\2\u01f2\u01f5\58\35\2"+
		"\u01f3\u01f5\5\66\34\2\u01f4\u01ef\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f4\u01f1"+
		"\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5/\3\2\2\2\u01f6"+
		"\u01f7\7&\2\2\u01f7\61\3\2\2\2\u01f8\u01f9\7%\2\2\u01f9\63\3\2\2\2\u01fa"+
		"\u01fc\7\7\2\2\u01fb\u01fd\5\u009eP\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd"+
		"\3\2\2\2\u01fd\65\3\2\2\2\u01fe\u01ff\5\u00b0Y\2\u01ff\67\3\2\2\2\u0200"+
		"\u0206\7\b\2\2\u0201\u0204\5d\63\2\u0202\u0203\7\t\2\2\u0203\u0205\5d"+
		"\63\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206"+
		"\u0201\3\2\2\2\u0206\u0207\3\2\2\2\u02079\3\2\2\2\u0208\u020b\5<\37\2"+
		"\u0209\u020b\5> \2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b;\3\2"+
		"\2\2\u020c\u020d\7\n\2\2\u020d\u020e\5F$\2\u020e=\3\2\2\2\u020f\u021c"+
		"\7\t\2\2\u0210\u0212\t\3\2\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0216\u021d\5H%\2\u0217\u0219\t\3\2\2\u0218\u0217\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c"+
		"\u0213\3\2\2\2\u021c\u0218\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0225\7\n"+
		"\2\2\u021f\u0226\7\65\2\2\u0220\u0221\7\66\2\2\u0221\u0222\5D#\2\u0222"+
		"\u0223\7\67\2\2\u0223\u0226\3\2\2\2\u0224\u0226\5D#\2\u0225\u021f\3\2"+
		"\2\2\u0225\u0220\3\2\2\2\u0225\u0224\3\2\2\2\u0226?\3\2\2\2\u0227\u022a"+
		"\7*\2\2\u0228\u0229\7\13\2\2\u0229\u022b\7*\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022bA\3\2\2\2\u022c\u022f\5H%\2\u022d\u022e\7\13\2\2\u022e"+
		"\u0230\7*\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230C\3\2\2\2\u0231"+
		"\u0236\5@!\2\u0232\u0233\78\2\2\u0233\u0235\5@!\2\u0234\u0232\3\2\2\2"+
		"\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023a"+
		"\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023b\78\2\2\u023a\u0239\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023bE\3\2\2\2\u023c\u0241\5B\"\2\u023d\u023e\78\2\2\u023e"+
		"\u0240\5B\"\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242G\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0249"+
		"\7*\2\2\u0245\u0246\7\63\2\2\u0246\u0248\7*\2\2\u0247\u0245\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024aI\3\2\2\2"+
		"\u024b\u0249\3\2\2\2\u024c\u024d\7\f\2\2\u024d\u0252\7*\2\2\u024e\u024f"+
		"\78\2\2\u024f\u0251\7*\2\2\u0250\u024e\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253K\3\2\2\2\u0254\u0252\3\2\2\2"+
		"\u0255\u0256\7\r\2\2\u0256\u025b\7*\2\2\u0257\u0258\78\2\2\u0258\u025a"+
		"\7*\2\2\u0259\u0257\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025cM\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u025f\7\16\2\2"+
		"\u025f\u0262\5d\63\2\u0260\u0261\78\2\2\u0261\u0263\5d\63\2\u0262\u0260"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263O\3\2\2\2\u0264\u026e\5T+\2\u0265\u026e"+
		"\5V,\2\u0266\u026e\5X-\2\u0267\u026e\5Z.\2\u0268\u026e\5\\/\2\u0269\u026e"+
		"\5\20\t\2\u026a\u026e\5\u00a2R\2\u026b\u026e\5\f\7\2\u026c\u026e\5R*\2"+
		"\u026d\u0264\3\2\2\2\u026d\u0265\3\2\2\2\u026d\u0266\3\2\2\2\u026d\u0267"+
		"\3\2\2\2\u026d\u0268\3\2\2\2\u026d\u0269\3\2\2\2\u026d\u026a\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026eQ\3\2\2\2\u026f\u0273\7\'\2\2"+
		"\u0270\u0274\5\20\t\2\u0271\u0274\5\\/\2\u0272\u0274\5X-\2\u0273\u0270"+
		"\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0272\3\2\2\2\u0274S\3\2\2\2\u0275"+
		"\u0276\7\17\2\2\u0276\u0277\5d\63\2\u0277\u0278\79\2\2\u0278\u0280\5b"+
		"\62\2\u0279\u027a\7\20\2\2\u027a\u027b\5d\63\2\u027b\u027c\79\2\2\u027c"+
		"\u027d\5b\62\2\u027d\u027f\3\2\2\2\u027e\u0279\3\2\2\2\u027f\u0282\3\2"+
		"\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0286\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0283\u0284\7\21\2\2\u0284\u0285\79\2\2\u0285\u0287\5b"+
		"\62\2\u0286\u0283\3\2\2\2\u0286\u0287\3\2\2\2\u0287U\3\2\2\2\u0288\u0289"+
		"\7\22\2\2\u0289\u028a\5d\63\2\u028a\u028b\79\2\2\u028b\u028f\5b\62\2\u028c"+
		"\u028d\7\21\2\2\u028d\u028e\79\2\2\u028e\u0290\5b\62\2\u028f\u028c\3\2"+
		"\2\2\u028f\u0290\3\2\2\2\u0290W\3\2\2\2\u0291\u0292\7\23\2\2\u0292\u0293"+
		"\5\u009cO\2\u0293\u0294\7\24\2\2\u0294\u0295\5\u009eP\2\u0295\u0296\7"+
		"9\2\2\u0296\u029a\5b\62\2\u0297\u0298\7\21\2\2\u0298\u0299\79\2\2\u0299"+
		"\u029b\5b\62\2\u029a\u0297\3\2\2\2\u029a\u029b\3\2\2\2\u029bY\3\2\2\2"+
		"\u029c\u029d\7\25\2\2\u029d\u029e\79\2\2\u029e\u02b4\5b\62\2\u029f\u02a0"+
		"\5`\61\2\u02a0\u02a1\79\2\2\u02a1\u02a2\5b\62\2\u02a2\u02a4\3\2\2\2\u02a3"+
		"\u029f\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2"+
		"\2\2\u02a6\u02aa\3\2\2\2\u02a7\u02a8\7\21\2\2\u02a8\u02a9\79\2\2\u02a9"+
		"\u02ab\5b\62\2\u02aa\u02a7\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02af\3\2"+
		"\2\2\u02ac\u02ad\7\26\2\2\u02ad\u02ae\79\2\2\u02ae\u02b0\5b\62\2\u02af"+
		"\u02ac\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b5\3\2\2\2\u02b1\u02b2\7\26"+
		"\2\2\u02b2\u02b3\79\2\2\u02b3\u02b5\5b\62\2\u02b4\u02a3\3\2\2\2\u02b4"+
		"\u02b1\3\2\2\2\u02b5[\3\2\2\2\u02b6\u02b7\7\27\2\2\u02b7\u02bc\5^\60\2"+
		"\u02b8\u02b9\78\2\2\u02b9\u02bb\5^\60\2\u02ba\u02b8\3\2\2\2\u02bb\u02be"+
		"\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be"+
		"\u02bc\3\2\2\2\u02bf\u02c0\79\2\2\u02c0\u02c1\5b\62\2\u02c1]\3\2\2\2\u02c2"+
		"\u02c5\5d\63\2\u02c3\u02c4\7\13\2\2\u02c4\u02c6\5x=\2\u02c5\u02c3\3\2"+
		"\2\2\u02c5\u02c6\3\2\2\2\u02c6_\3\2\2\2\u02c7\u02cd\7\30\2\2\u02c8\u02cb"+
		"\5d\63\2\u02c9\u02ca\7\13\2\2\u02ca\u02cc\7*\2\2\u02cb\u02c9\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02c8\3\2\2\2\u02cd\u02ce\3\2"+
		"\2\2\u02cea\3\2\2\2\u02cf\u02da\5\36\20\2\u02d0\u02d1\7)\2\2\u02d1\u02d3"+
		"\7d\2\2\u02d2\u02d4\5\34\17\2\u02d3\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2"+
		"\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8"+
		"\7e\2\2\u02d8\u02da\3\2\2\2\u02d9\u02cf\3\2\2\2\u02d9\u02d0\3\2\2\2\u02da"+
		"c\3\2\2\2\u02db\u02e1\5l\67\2\u02dc\u02dd\7\17\2\2\u02dd\u02de\5l\67\2"+
		"\u02de\u02df\7\21\2\2\u02df\u02e0\5d\63\2\u02e0\u02e2\3\2\2\2\u02e1\u02dc"+
		"\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e5\5h\65\2\u02e4"+
		"\u02db\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5e\3\2\2\2\u02e6\u02e9\5l\67\2"+
		"\u02e7\u02e9\5j\66\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9g\3"+
		"\2\2\2\u02ea\u02ec\7\31\2\2\u02eb\u02ed\5\30\r\2\u02ec\u02eb\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\79\2\2\u02ef\u02f0\5d\63"+
		"\2\u02f0i\3\2\2\2\u02f1\u02f3\7\31\2\2\u02f2\u02f4\5\30\r\2\u02f3\u02f2"+
		"\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\79\2\2\u02f6"+
		"\u02f7\5f\64\2\u02f7k\3\2\2\2\u02f8\u02fd\5n8\2\u02f9\u02fa\7\32\2\2\u02fa"+
		"\u02fc\5n8\2\u02fb\u02f9\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2"+
		"\2\u02fd\u02fe\3\2\2\2\u02fem\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0305"+
		"\5p9\2\u0301\u0302\7\33\2\2\u0302\u0304\5p9\2\u0303\u0301\3\2\2\2\u0304"+
		"\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306o\3\2\2\2"+
		"\u0307\u0305\3\2\2\2\u0308\u0309\7\34\2\2\u0309\u030c\5p9\2\u030a\u030c"+
		"\5r:\2\u030b\u0308\3\2\2\2\u030b\u030a\3\2\2\2\u030cq\3\2\2\2\u030d\u0313"+
		"\5x=\2\u030e\u030f\5t;\2\u030f\u0310\5x=\2\u0310\u0312\3\2\2\2\u0311\u030e"+
		"\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"s\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0324\7L\2\2\u0317\u0324\7M\2\2\u0318"+
		"\u0324\7N\2\2\u0319\u0324\7O\2\2\u031a\u0324\7P\2\2\u031b\u0324\7Q\2\2"+
		"\u031c\u0324\7R\2\2\u031d\u0324\7\24\2\2\u031e\u031f\7\34\2\2\u031f\u0324"+
		"\7\24\2\2\u0320\u0324\7\35\2\2\u0321\u0322\7\35\2\2\u0322\u0324\7\34\2"+
		"\2\u0323\u0316\3\2\2\2\u0323\u0317\3\2\2\2\u0323\u0318\3\2\2\2\u0323\u0319"+
		"\3\2\2\2\u0323\u031a\3\2\2\2\u0323\u031b\3\2\2\2\u0323\u031c\3\2\2\2\u0323"+
		"\u031d\3\2\2\2\u0323\u031e\3\2\2\2\u0323\u0320\3\2\2\2\u0323\u0321\3\2"+
		"\2\2\u0324u\3\2\2\2\u0325\u0326\7\65\2\2\u0326\u0327\5x=\2\u0327w\3\2"+
		"\2\2\u0328\u032d\5z>\2\u0329\u032a\7?\2\2\u032a\u032c\5z>\2\u032b\u0329"+
		"\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"y\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0335\5|?\2\u0331\u0332\7@\2\2\u0332"+
		"\u0334\5|?\2\u0333\u0331\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2"+
		"\2\u0335\u0336\3\2\2\2\u0336{\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u033d"+
		"\5~@\2\u0339\u033a\7A\2\2\u033a\u033c\5~@\2\u033b\u0339\3\2\2\2\u033c"+
		"\u033f\3\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e}\3\2\2\2"+
		"\u033f\u033d\3\2\2\2\u0340\u0345\5\u0080A\2\u0341\u0342\t\4\2\2\u0342"+
		"\u0344\5\u0080A\2\u0343\u0341\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343"+
		"\3\2\2\2\u0345\u0346\3\2\2\2\u0346\177\3\2\2\2\u0347\u0345\3\2\2\2\u0348"+
		"\u034d\5\u0082B\2\u0349\u034a\t\5\2\2\u034a\u034c\5\u0082B\2\u034b\u0349"+
		"\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u0081\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0355\5\u0084C\2\u0351\u0352"+
		"\t\6\2\2\u0352\u0354\5\u0084C\2\u0353\u0351\3\2\2\2\u0354\u0357\3\2\2"+
		"\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0083\3\2\2\2\u0357\u0355"+
		"\3\2\2\2\u0358\u0359\t\7\2\2\u0359\u035c\5\u0084C\2\u035a\u035c\5\u0086"+
		"D\2\u035b\u0358\3\2\2\2\u035b\u035a\3\2\2\2\u035c\u0085\3\2\2\2\u035d"+
		"\u0360\5\u0088E\2\u035e\u035f\7;\2\2\u035f\u0361\5\u0084C\2\u0360\u035e"+
		"\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0087\3\2\2\2\u0362\u0364\7(\2\2\u0363"+
		"\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0369\5\u008a"+
		"F\2\u0366\u0368\5\u0094K\2\u0367\u0366\3\2\2\2\u0368\u036b\3\2\2\2\u0369"+
		"\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0089\3\2\2\2\u036b\u0369\3\2"+
		"\2\2\u036c\u036f\7\66\2\2\u036d\u0370\5\u00b0Y\2\u036e\u0370\5\u0092J"+
		"\2\u036f\u036d\3\2\2\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371"+
		"\3\2\2\2\u0371\u0384\7\67\2\2\u0372\u0374\7=\2\2\u0373\u0375\5\u0092J"+
		"\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0384"+
		"\7>\2\2\u0377\u0379\7J\2\2\u0378\u037a\5\u00a0Q\2\u0379\u0378\3\2\2\2"+
		"\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0384\7K\2\2\u037c\u0384"+
		"\5\u008cG\2\u037d\u0384\5\u008eH\2\u037e\u0384\5\u0090I\2\u037f\u0384"+
		"\7\64\2\2\u0380\u0384\7\36\2\2\u0381\u0384\7\37\2\2\u0382\u0384\7 \2\2"+
		"\u0383\u036c\3\2\2\2\u0383\u0372\3\2\2\2\u0383\u0377\3\2\2\2\u0383\u037c"+
		"\3\2\2\2\u0383\u037d\3\2\2\2\u0383\u037e\3\2\2\2\u0383\u037f\3\2\2\2\u0383"+
		"\u0380\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0382\3\2\2\2\u0384\u008b\3\2"+
		"\2\2\u0385\u0386\7*\2\2\u0386\u008d\3\2\2\2\u0387\u0388\7\4\2\2\u0388"+
		"\u008f\3\2\2\2\u0389\u038b\7\3\2\2\u038a\u0389\3\2\2\2\u038b\u038c\3\2"+
		"\2\2\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u0091\3\2\2\2\u038e"+
		"\u0391\5d\63\2\u038f\u0391\5v<\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2"+
		"\2\u0391\u03a0\3\2\2\2\u0392\u03a1\5\u00aaV\2\u0393\u0396\78\2\2\u0394"+
		"\u0397\5d\63\2\u0395\u0397\5v<\2\u0396\u0394\3\2\2\2\u0396\u0395\3\2\2"+
		"\2\u0397\u0399\3\2\2\2\u0398\u0393\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398"+
		"\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2\2\2\u039d"+
		"\u039f\78\2\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a1\3\2"+
		"\2\2\u03a0\u0392\3\2\2\2\u03a0\u039a\3\2\2\2\u03a1\u0093\3\2\2\2\u03a2"+
		"\u03a4\7\66\2\2\u03a3\u03a5\5\u00a4S\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5"+
		"\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03ae\7\67\2\2\u03a7\u03a8\7=\2\2\u03a8"+
		"\u03a9\5\u0096L\2\u03a9\u03aa\7>\2\2\u03aa\u03ae\3\2\2\2\u03ab\u03ac\7"+
		"\63\2\2\u03ac\u03ae\7*\2\2\u03ad\u03a2\3\2\2\2\u03ad\u03a7\3\2\2\2\u03ad"+
		"\u03ab\3\2\2\2\u03ae\u0095\3\2\2\2\u03af\u03b4\5\u0098M\2\u03b0\u03b1"+
		"\78\2\2\u03b1\u03b3\5\u0098M\2\u03b2\u03b0\3\2\2\2\u03b3\u03b6\3\2\2\2"+
		"\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4"+
		"\3\2\2\2\u03b7\u03b9\78\2\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u0097\3\2\2\2\u03ba\u03c6\5d\63\2\u03bb\u03bd\5d\63\2\u03bc\u03bb\3\2"+
		"\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\79\2\2\u03bf"+
		"\u03c1\5d\63\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3\2"+
		"\2\2\u03c2\u03c4\5\u009aN\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4"+
		"\u03c6\3\2\2\2\u03c5\u03ba\3\2\2\2\u03c5\u03bc\3\2\2\2\u03c6\u0099\3\2"+
		"\2\2\u03c7\u03c9\79\2\2\u03c8\u03ca\5d\63\2\u03c9\u03c8\3\2\2\2\u03c9"+
		"\u03ca\3\2\2\2\u03ca\u009b\3\2\2\2\u03cb\u03ce\5x=\2\u03cc\u03ce\5v<\2"+
		"\u03cd\u03cb\3\2\2\2\u03cd\u03cc\3\2\2\2\u03ce\u03d6\3\2\2\2\u03cf\u03d2"+
		"\78\2\2\u03d0\u03d3\5x=\2\u03d1\u03d3\5v<\2\u03d2\u03d0\3\2\2\2\u03d2"+
		"\u03d1\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03cf\3\2\2\2\u03d5\u03d8\3\2"+
		"\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8"+
		"\u03d6\3\2\2\2\u03d9\u03db\78\2\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2"+
		"\2\2\u03db\u009d\3\2\2\2\u03dc\u03e1\5d\63\2\u03dd\u03de\78\2\2\u03de"+
		"\u03e0\5d\63\2\u03df\u03dd\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03df\3\2"+
		"\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4"+
		"\u03e6\78\2\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u009f\3\2"+
		"\2\2\u03e7\u03e8\5d\63\2\u03e8\u03e9\79\2\2\u03e9\u03ea\5d\63\2\u03ea"+
		"\u03ee\3\2\2\2\u03eb\u03ec\7;\2\2\u03ec\u03ee\5x=\2\u03ed\u03e7\3\2\2"+
		"\2\u03ed\u03eb\3\2\2\2\u03ee\u0401\3\2\2\2\u03ef\u0402\5\u00aaV\2\u03f0"+
		"\u03f7\78\2\2\u03f1\u03f2\5d\63\2\u03f2\u03f3\79\2\2\u03f3\u03f4\5d\63"+
		"\2\u03f4\u03f8\3\2\2\2\u03f5\u03f6\7;\2\2\u03f6\u03f8\5x=\2\u03f7\u03f1"+
		"\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03f0\3\2\2\2\u03fa"+
		"\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03ff\3\2"+
		"\2\2\u03fd\u03fb\3\2\2\2\u03fe\u0400\78\2\2\u03ff\u03fe\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u0402\3\2\2\2\u0401\u03ef\3\2\2\2\u0401\u03fb\3\2"+
		"\2\2\u0402\u0418\3\2\2\2\u0403\u0406\5d\63\2\u0404\u0406\5v<\2\u0405\u0403"+
		"\3\2\2\2\u0405\u0404\3\2\2\2\u0406\u0415\3\2\2\2\u0407\u0416\5\u00aaV"+
		"\2\u0408\u040b\78\2\2\u0409\u040c\5d\63\2\u040a\u040c\5v<\2\u040b\u0409"+
		"\3\2\2\2\u040b\u040a\3\2\2\2\u040c\u040e\3\2\2\2\u040d\u0408\3\2\2\2\u040e"+
		"\u0411\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0413\3\2"+
		"\2\2\u0411\u040f\3\2\2\2\u0412\u0414\78\2\2\u0413\u0412\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u0416\3\2\2\2\u0415\u0407\3\2\2\2\u0415\u040f\3\2"+
		"\2\2\u0416\u0418\3\2\2\2\u0417\u03ed\3\2\2\2\u0417\u0405\3\2\2\2\u0418"+
		"\u00a1\3\2\2\2\u0419\u041a\7!\2\2\u041a\u0420\7*\2\2\u041b\u041d\7\66"+
		"\2\2\u041c\u041e\5\u00a4S\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0421\7\67\2\2\u0420\u041b\3\2\2\2\u0420\u0421\3"+
		"\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\79\2\2\u0423\u0424\5b\62\2\u0424"+
		"\u00a3\3\2\2\2\u0425\u042a\5\u00a6T\2\u0426\u0427\78\2\2\u0427\u0429\5"+
		"\u00a6T\2\u0428\u0426\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2"+
		"\u042a\u042b\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u042f"+
		"\78\2\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u00a5\3\2\2\2\u0430"+
		"\u0432\5d\63\2\u0431\u0433\5\u00aaV\2\u0432\u0431\3\2\2\2\u0432\u0433"+
		"\3\2\2\2\u0433\u043d\3\2\2\2\u0434\u0435\5d\63\2\u0435\u0436\7<\2\2\u0436"+
		"\u0437\5d\63\2\u0437\u043d\3\2\2\2\u0438\u0439\7;\2\2\u0439\u043d\5d\63"+
		"\2\u043a\u043b\7\65\2\2\u043b\u043d\5d\63\2\u043c\u0430\3\2\2\2\u043c"+
		"\u0434\3\2\2\2\u043c\u0438\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u00a7\3\2"+
		"\2\2\u043e\u0441\5\u00aaV\2\u043f\u0441\5\u00acW\2\u0440\u043e\3\2\2\2"+
		"\u0440\u043f\3\2\2\2\u0441\u00a9\3\2\2\2\u0442\u0444\7\'\2\2\u0443\u0442"+
		"\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\7\23\2\2"+
		"\u0446\u0447\5\u009cO\2\u0447\u0448\7\24\2\2\u0448\u044a\5l\67\2\u0449"+
		"\u044b\5\u00a8U\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u00ab"+
		"\3\2\2\2\u044c\u044d\7\17\2\2\u044d\u044f\5f\64\2\u044e\u0450\5\u00a8"+
		"U\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u00ad\3\2\2\2\u0451"+
		"\u0452\7*\2\2\u0452\u00af\3\2\2\2\u0453\u0455\7\"\2\2\u0454\u0456\5\u00b2"+
		"Z\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u00b1\3\2\2\2\u0457"+
		"\u0458\7\t\2\2\u0458\u045b\5d\63\2\u0459\u045b\5\u009eP\2\u045a\u0457"+
		"\3\2\2\2\u045a\u0459\3\2\2\2\u045b\u00b3\3\2\2\2\u00a8\u00b9\u00bd\u00bf"+
		"\u00c8\u00d1\u00d4\u00db\u00e1\u00eb\u00f2\u00f9\u00ff\u0103\u0109\u010f"+
		"\u0113\u011a\u011c\u011e\u0123\u0125\u0127\u012b\u0131\u0135\u013c\u013e"+
		"\u0140\u0145\u0147\u014c\u0151\u0157\u015b\u0161\u0167\u016b\u0172\u0174"+
		"\u0176\u017b\u017d\u017f\u0183\u0189\u018d\u0194\u0196\u0198\u019d\u019f"+
		"\u01a5\u01ac\u01b0\u01bc\u01c3\u01c8\u01cc\u01cf\u01d5\u01d9\u01de\u01e2"+
		"\u01e6\u01f4\u01fc\u0204\u0206\u020a\u0213\u021a\u021c\u0225\u022a\u022f"+
		"\u0236\u023a\u0241\u0249\u0252\u025b\u0262\u026d\u0273\u0280\u0286\u028f"+
		"\u029a\u02a5\u02aa\u02af\u02b4\u02bc\u02c5\u02cb\u02cd\u02d5\u02d9\u02e1"+
		"\u02e4\u02e8\u02ec\u02f3\u02fd\u0305\u030b\u0313\u0323\u032d\u0335\u033d"+
		"\u0345\u034d\u0355\u035b\u0360\u0363\u0369\u036f\u0374\u0379\u0383\u038c"+
		"\u0390\u0396\u039a\u039e\u03a0\u03a4\u03ad\u03b4\u03b8\u03bc\u03c0\u03c3"+
		"\u03c5\u03c9\u03cd\u03d2\u03d6\u03da\u03e1\u03e5\u03ed\u03f7\u03fb\u03ff"+
		"\u0401\u0405\u040b\u040f\u0413\u0415\u0417\u041d\u0420\u042a\u042e\u0432"+
		"\u043c\u0440\u0443\u044a\u044f\u0455\u045a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}