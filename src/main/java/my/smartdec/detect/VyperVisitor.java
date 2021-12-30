package my.smartdec.detect;// Generated from E:/IDEAJAVA_Projects/smartcheck2/src/main/antlr4/ru/smartdec/smartcheck\Vyper.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VyperParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VyperVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VyperParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(VyperParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(VyperParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(VyperParser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(VyperParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(VyperParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(VyperParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#async_funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_funcdef(VyperParser.Async_funcdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(VyperParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(VyperParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(VyperParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(VyperParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargslist(VyperParser.VarargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#vfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVfpdef(VyperParser.VfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(VyperParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(VyperParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(VyperParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(VyperParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#annassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnassign(VyperParser.AnnassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(VyperParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(VyperParser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(VyperParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(VyperParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(VyperParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(VyperParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(VyperParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(VyperParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(VyperParser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(VyperParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(VyperParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(VyperParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(VyperParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(VyperParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(VyperParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(VyperParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(VyperParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(VyperParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(VyperParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(VyperParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(VyperParser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(VyperParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#async_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_stmt(VyperParser.Async_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(VyperParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(VyperParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(VyperParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(VyperParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(VyperParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(VyperParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(VyperParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(VyperParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(VyperParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_nocond(VyperParser.Test_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(VyperParser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef_nocond(VyperParser.Lambdef_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(VyperParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(VyperParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(VyperParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(VyperParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(VyperParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(VyperParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(VyperParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(VyperParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(VyperParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(VyperParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(VyperParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(VyperParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(VyperParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(VyperParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(VyperParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(VyperParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#atom_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_name(VyperParser.Atom_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#atom_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_number(VyperParser.Atom_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#atom_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_string(VyperParser.Atom_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(VyperParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(VyperParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(VyperParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(VyperParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(VyperParser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(VyperParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(VyperParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(VyperParser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(VyperParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(VyperParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(VyperParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(VyperParser.Comp_iterContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(VyperParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(VyperParser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#encoding_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncoding_decl(VyperParser.Encoding_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(VyperParser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperParser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_arg(VyperParser.Yield_argContext ctx);
}