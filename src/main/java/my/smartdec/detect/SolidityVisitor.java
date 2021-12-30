package my.smartdec.detect;// Generated from E:/IDEAJAVA_Projects/SolidityDetection/src/main/antlr4/ru/smartdec/smartcheck\Solidity.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SolidityParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SolidityVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceUnit(SolidityParser.SourceUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#pragmaDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaDirective(SolidityParser.PragmaDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#pragmaSolidity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaSolidity(SolidityParser.PragmaSolidityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#pragmaExperimental}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaExperimental(SolidityParser.PragmaExperimentalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(SolidityParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#versionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionOperator(SolidityParser.VersionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#importDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDirective(SolidityParser.ImportDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(SolidityParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#contractDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractDefinition(SolidityParser.ContractDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#libraryDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDefinition(SolidityParser.LibraryDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDefinition(SolidityParser.InterfaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceSpecifier(SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#contractPartDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractPartDefinition(SolidityParser.ContractPartDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingForDeclaration(SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(SolidityParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#modifierDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierDefinition(SolidityParser.ModifierDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(SolidityParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#returnsParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsParameters(SolidityParser.ReturnsParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SolidityParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVariableDeclaration(SolidityParser.StateVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionFallBackDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionFallBackDefinition(SolidityParser.FunctionFallBackDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(SolidityParser.InheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#eventDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDefinition(SolidityParser.EventDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(SolidityParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#environmentalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentalVariable(SolidityParser.EnvironmentalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#visibleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibleType(SolidityParser.VisibleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#constantType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantType(SolidityParser.ConstantTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#payableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayableType(SolidityParser.PayableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(SolidityParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserDefinedTypeName(SolidityParser.UserDefinedTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeName(SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMutability(SolidityParser.StateMutabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#pureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureType(SolidityParser.PureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#viewType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewType(SolidityParser.ViewTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#mappingSt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingSt(SolidityParser.MappingStContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SolidityParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SolidityParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#newContract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewContract(SolidityParser.NewContractContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SolidityParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#gas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGas(SolidityParser.GasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#plusminusOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusminusOperator(SolidityParser.PlusminusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#minusOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOperator(SolidityParser.MinusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#plusOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOperator(SolidityParser.PlusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#twoPlusMinusOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoPlusMinusOperator(SolidityParser.TwoPlusMinusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#decrementOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementOperator(SolidityParser.DecrementOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#incrementOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementOperator(SolidityParser.IncrementOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#muldivOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldivOperator(SolidityParser.MuldivOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#divRemOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivRemOperator(SolidityParser.DivRemOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#powerOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerOperator(SolidityParser.PowerOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#mulOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOperator(SolidityParser.MulOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#divOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOperator(SolidityParser.DivOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#addressNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressNumber(SolidityParser.AddressNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#callArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArguments(SolidityParser.CallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#typeConversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(SolidityParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SolidityParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#newDynamicArrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDynamicArrayExpression(SolidityParser.NewDynamicArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#lvalueOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalueOperator(SolidityParser.LvalueOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#plusLvalueOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusLvalueOperator(SolidityParser.PlusLvalueOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#minusLvalueOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusLvalueOperator(SolidityParser.MinusLvalueOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#divLvalueOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivLvalueOperator(SolidityParser.DivLvalueOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#mulLvalueOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulLvalueOperator(SolidityParser.MulLvalueOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#divRemLvalueOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivRemLvalueOperator(SolidityParser.DivRemLvalueOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(SolidityParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#indexedParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedParameterList(SolidityParser.IndexedParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#indexedParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedParameter(SolidityParser.IndexedParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SolidityParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SolidityParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#storageLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageLocation(SolidityParser.StorageLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SolidityParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SolidityParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#emitEventStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitEventStatement(SolidityParser.EmitEventStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineAssemblyStatement(SolidityParser.InlineAssemblyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SolidityParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#placeholderStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholderStatement(SolidityParser.PlaceholderStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(SolidityParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#throwRevertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowRevertStatement(SolidityParser.ThrowRevertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(SolidityParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(SolidityParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#inlineAssemblyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineAssemblyBlock(SolidityParser.InlineAssemblyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyItem(SolidityParser.AssemblyItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyExpression(SolidityParser.AssemblyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCall(SolidityParser.AssemblyCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLocalDefinition(SolidityParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyAssignment(SolidityParser.AssemblyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIdentifierOrList(SolidityParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIdentifierList(SolidityParser.AssemblyIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyStackAssignment(SolidityParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#labelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDefinition(SolidityParser.LabelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblySwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblySwitch(SolidityParser.AssemblySwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCase(SolidityParser.AssemblyCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionDefinition(SolidityParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionReturns(SolidityParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFor(SolidityParser.AssemblyForContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIf(SolidityParser.AssemblyIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLiteral(SolidityParser.AssemblyLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#subAssembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAssembly(SolidityParser.SubAssemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(SolidityParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#nameValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValueList(SolidityParser.NameValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SolidityParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SolidityParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SolidityParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryTypeName(SolidityParser.ElementaryTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(SolidityParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(SolidityParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(SolidityParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#decimalNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalNumber(SolidityParser.DecimalNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#versionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionLiteral(SolidityParser.VersionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SolidityParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#numberUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberUnit(SolidityParser.NumberUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#hexNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexNumber(SolidityParser.HexNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#hexLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexLiteral(SolidityParser.HexLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolidityParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SolidityParser.StringLiteralContext ctx);
}