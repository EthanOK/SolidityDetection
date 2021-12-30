package my.smartdec.detect;// Generated from E:/IDEAJAVA_Projects/smartcheck2/src/main/antlr4/ru/smartdec/smartcheck\Vyper.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VyperParser}.
 */
public interface VyperListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VyperParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(VyperParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(VyperParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(VyperParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(VyperParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(VyperParser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(VyperParser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(VyperParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(VyperParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(VyperParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(VyperParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(VyperParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(VyperParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void enterAsync_funcdef(VyperParser.Async_funcdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void exitAsync_funcdef(VyperParser.Async_funcdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(VyperParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(VyperParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(VyperParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(VyperParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(VyperParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(VyperParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(VyperParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(VyperParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(VyperParser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(VyperParser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(VyperParser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(VyperParser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(VyperParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(VyperParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(VyperParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(VyperParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(VyperParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(VyperParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(VyperParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(VyperParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#annassign}.
	 * @param ctx the parse tree
	 */
	void enterAnnassign(VyperParser.AnnassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#annassign}.
	 * @param ctx the parse tree
	 */
	void exitAnnassign(VyperParser.AnnassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(VyperParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(VyperParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(VyperParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(VyperParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(VyperParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(VyperParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(VyperParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(VyperParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(VyperParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(VyperParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(VyperParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(VyperParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(VyperParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(VyperParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(VyperParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(VyperParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(VyperParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(VyperParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(VyperParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(VyperParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(VyperParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(VyperParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(VyperParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(VyperParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(VyperParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(VyperParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(VyperParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(VyperParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(VyperParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(VyperParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(VyperParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(VyperParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(VyperParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(VyperParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(VyperParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(VyperParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(VyperParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(VyperParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(VyperParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(VyperParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(VyperParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(VyperParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(VyperParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(VyperParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsync_stmt(VyperParser.Async_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsync_stmt(VyperParser.Async_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(VyperParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(VyperParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(VyperParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(VyperParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(VyperParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(VyperParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(VyperParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(VyperParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(VyperParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(VyperParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(VyperParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(VyperParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(VyperParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(VyperParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(VyperParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(VyperParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(VyperParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(VyperParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(VyperParser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(VyperParser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(VyperParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(VyperParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(VyperParser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(VyperParser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(VyperParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(VyperParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(VyperParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(VyperParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(VyperParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(VyperParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(VyperParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(VyperParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(VyperParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(VyperParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(VyperParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(VyperParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(VyperParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(VyperParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(VyperParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(VyperParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(VyperParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(VyperParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(VyperParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(VyperParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(VyperParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(VyperParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(VyperParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(VyperParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(VyperParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(VyperParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(VyperParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(VyperParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(VyperParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(VyperParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(VyperParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(VyperParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#atom_name}.
	 * @param ctx the parse tree
	 */
	void enterAtom_name(VyperParser.Atom_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#atom_name}.
	 * @param ctx the parse tree
	 */
	void exitAtom_name(VyperParser.Atom_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#atom_number}.
	 * @param ctx the parse tree
	 */
	void enterAtom_number(VyperParser.Atom_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#atom_number}.
	 * @param ctx the parse tree
	 */
	void exitAtom_number(VyperParser.Atom_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#atom_string}.
	 * @param ctx the parse tree
	 */
	void enterAtom_string(VyperParser.Atom_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#atom_string}.
	 * @param ctx the parse tree
	 */
	void exitAtom_string(VyperParser.Atom_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(VyperParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(VyperParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(VyperParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(VyperParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(VyperParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(VyperParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(VyperParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(VyperParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(VyperParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(VyperParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(VyperParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(VyperParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(VyperParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(VyperParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(VyperParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(VyperParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(VyperParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(VyperParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(VyperParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(VyperParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(VyperParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(VyperParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(VyperParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(VyperParser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(VyperParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(VyperParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(VyperParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(VyperParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_decl(VyperParser.Encoding_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_decl(VyperParser.Encoding_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(VyperParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(VyperParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(VyperParser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(VyperParser.Yield_argContext ctx);
}