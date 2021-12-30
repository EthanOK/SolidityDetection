// Generated from E:/IDEAJAVA_Projects/SolidityDetection/src/main/antlr4/ru/smartdec/smartcheck\Solidity.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SolidityParser}.
 */
public interface SolidityListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(SolidityParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(SolidityParser.SourceUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void enterPragmaDirective(SolidityParser.PragmaDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void exitPragmaDirective(SolidityParser.PragmaDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#pragmaSolidity}.
	 * @param ctx the parse tree
	 */
	void enterPragmaSolidity(SolidityParser.PragmaSolidityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#pragmaSolidity}.
	 * @param ctx the parse tree
	 */
	void exitPragmaSolidity(SolidityParser.PragmaSolidityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#pragmaExperimental}.
	 * @param ctx the parse tree
	 */
	void enterPragmaExperimental(SolidityParser.PragmaExperimentalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#pragmaExperimental}.
	 * @param ctx the parse tree
	 */
	void exitPragmaExperimental(SolidityParser.PragmaExperimentalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(SolidityParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(SolidityParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void enterVersionOperator(SolidityParser.VersionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void exitVersionOperator(SolidityParser.VersionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void enterImportDirective(SolidityParser.ImportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void exitImportDirective(SolidityParser.ImportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(SolidityParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(SolidityParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(SolidityParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(SolidityParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#libraryDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLibraryDefinition(SolidityParser.LibraryDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#libraryDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLibraryDefinition(SolidityParser.LibraryDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefinition(SolidityParser.InterfaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefinition(SolidityParser.InterfaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceSpecifier(SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceSpecifier(SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#contractPartDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractPartDefinition(SolidityParser.ContractPartDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#contractPartDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractPartDefinition(SolidityParser.ContractPartDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingForDeclaration(SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingForDeclaration(SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(SolidityParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(SolidityParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModifierDefinition(SolidityParser.ModifierDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModifierDefinition(SolidityParser.ModifierDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SolidityParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SolidityParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#returnsParameters}.
	 * @param ctx the parse tree
	 */
	void enterReturnsParameters(SolidityParser.ReturnsParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#returnsParameters}.
	 * @param ctx the parse tree
	 */
	void exitReturnsParameters(SolidityParser.ReturnsParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SolidityParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SolidityParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVariableDeclaration(SolidityParser.StateVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVariableDeclaration(SolidityParser.StateVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionFallBackDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionFallBackDefinition(SolidityParser.FunctionFallBackDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionFallBackDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionFallBackDefinition(SolidityParser.FunctionFallBackDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(SolidityParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(SolidityParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEventDefinition(SolidityParser.EventDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEventDefinition(SolidityParser.EventDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(SolidityParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(SolidityParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#environmentalVariable}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentalVariable(SolidityParser.EnvironmentalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#environmentalVariable}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentalVariable(SolidityParser.EnvironmentalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#visibleType}.
	 * @param ctx the parse tree
	 */
	void enterVisibleType(SolidityParser.VisibleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#visibleType}.
	 * @param ctx the parse tree
	 */
	void exitVisibleType(SolidityParser.VisibleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#constantType}.
	 * @param ctx the parse tree
	 */
	void enterConstantType(SolidityParser.ConstantTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#constantType}.
	 * @param ctx the parse tree
	 */
	void exitConstantType(SolidityParser.ConstantTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#payableType}.
	 * @param ctx the parse tree
	 */
	void enterPayableType(SolidityParser.PayableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#payableType}.
	 * @param ctx the parse tree
	 */
	void exitPayableType(SolidityParser.PayableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SolidityParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SolidityParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedTypeName(SolidityParser.UserDefinedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedTypeName(SolidityParser.UserDefinedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeName(SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeName(SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void enterStateMutability(SolidityParser.StateMutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void exitStateMutability(SolidityParser.StateMutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#pureType}.
	 * @param ctx the parse tree
	 */
	void enterPureType(SolidityParser.PureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#pureType}.
	 * @param ctx the parse tree
	 */
	void exitPureType(SolidityParser.PureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#viewType}.
	 * @param ctx the parse tree
	 */
	void enterViewType(SolidityParser.ViewTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#viewType}.
	 * @param ctx the parse tree
	 */
	void exitViewType(SolidityParser.ViewTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#mappingSt}.
	 * @param ctx the parse tree
	 */
	void enterMappingSt(SolidityParser.MappingStContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#mappingSt}.
	 * @param ctx the parse tree
	 */
	void exitMappingSt(SolidityParser.MappingStContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SolidityParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SolidityParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SolidityParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SolidityParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#newContract}.
	 * @param ctx the parse tree
	 */
	void enterNewContract(SolidityParser.NewContractContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#newContract}.
	 * @param ctx the parse tree
	 */
	void exitNewContract(SolidityParser.NewContractContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SolidityParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SolidityParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#gas}.
	 * @param ctx the parse tree
	 */
	void enterGas(SolidityParser.GasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#gas}.
	 * @param ctx the parse tree
	 */
	void exitGas(SolidityParser.GasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#plusminusOperator}.
	 * @param ctx the parse tree
	 */
	void enterPlusminusOperator(SolidityParser.PlusminusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#plusminusOperator}.
	 * @param ctx the parse tree
	 */
	void exitPlusminusOperator(SolidityParser.PlusminusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#minusOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinusOperator(SolidityParser.MinusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#minusOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinusOperator(SolidityParser.MinusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#plusOperator}.
	 * @param ctx the parse tree
	 */
	void enterPlusOperator(SolidityParser.PlusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#plusOperator}.
	 * @param ctx the parse tree
	 */
	void exitPlusOperator(SolidityParser.PlusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#twoPlusMinusOperator}.
	 * @param ctx the parse tree
	 */
	void enterTwoPlusMinusOperator(SolidityParser.TwoPlusMinusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#twoPlusMinusOperator}.
	 * @param ctx the parse tree
	 */
	void exitTwoPlusMinusOperator(SolidityParser.TwoPlusMinusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#decrementOperator}.
	 * @param ctx the parse tree
	 */
	void enterDecrementOperator(SolidityParser.DecrementOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#decrementOperator}.
	 * @param ctx the parse tree
	 */
	void exitDecrementOperator(SolidityParser.DecrementOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#incrementOperator}.
	 * @param ctx the parse tree
	 */
	void enterIncrementOperator(SolidityParser.IncrementOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#incrementOperator}.
	 * @param ctx the parse tree
	 */
	void exitIncrementOperator(SolidityParser.IncrementOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#muldivOperator}.
	 * @param ctx the parse tree
	 */
	void enterMuldivOperator(SolidityParser.MuldivOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#muldivOperator}.
	 * @param ctx the parse tree
	 */
	void exitMuldivOperator(SolidityParser.MuldivOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#divRemOperator}.
	 * @param ctx the parse tree
	 */
	void enterDivRemOperator(SolidityParser.DivRemOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#divRemOperator}.
	 * @param ctx the parse tree
	 */
	void exitDivRemOperator(SolidityParser.DivRemOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#powerOperator}.
	 * @param ctx the parse tree
	 */
	void enterPowerOperator(SolidityParser.PowerOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#powerOperator}.
	 * @param ctx the parse tree
	 */
	void exitPowerOperator(SolidityParser.PowerOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#mulOperator}.
	 * @param ctx the parse tree
	 */
	void enterMulOperator(SolidityParser.MulOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#mulOperator}.
	 * @param ctx the parse tree
	 */
	void exitMulOperator(SolidityParser.MulOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#divOperator}.
	 * @param ctx the parse tree
	 */
	void enterDivOperator(SolidityParser.DivOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#divOperator}.
	 * @param ctx the parse tree
	 */
	void exitDivOperator(SolidityParser.DivOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#addressNumber}.
	 * @param ctx the parse tree
	 */
	void enterAddressNumber(SolidityParser.AddressNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#addressNumber}.
	 * @param ctx the parse tree
	 */
	void exitAddressNumber(SolidityParser.AddressNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#callArguments}.
	 * @param ctx the parse tree
	 */
	void enterCallArguments(SolidityParser.CallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#callArguments}.
	 * @param ctx the parse tree
	 */
	void exitCallArguments(SolidityParser.CallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#typeConversion}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(SolidityParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#typeConversion}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(SolidityParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SolidityParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SolidityParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#newDynamicArrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewDynamicArrayExpression(SolidityParser.NewDynamicArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#newDynamicArrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewDynamicArrayExpression(SolidityParser.NewDynamicArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#lvalueOperator}.
	 * @param ctx the parse tree
	 */
	void enterLvalueOperator(SolidityParser.LvalueOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#lvalueOperator}.
	 * @param ctx the parse tree
	 */
	void exitLvalueOperator(SolidityParser.LvalueOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#plusLvalueOperator}.
	 * @param ctx the parse tree
	 */
	void enterPlusLvalueOperator(SolidityParser.PlusLvalueOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#plusLvalueOperator}.
	 * @param ctx the parse tree
	 */
	void exitPlusLvalueOperator(SolidityParser.PlusLvalueOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#minusLvalueOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinusLvalueOperator(SolidityParser.MinusLvalueOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#minusLvalueOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinusLvalueOperator(SolidityParser.MinusLvalueOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#divLvalueOperator}.
	 * @param ctx the parse tree
	 */
	void enterDivLvalueOperator(SolidityParser.DivLvalueOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#divLvalueOperator}.
	 * @param ctx the parse tree
	 */
	void exitDivLvalueOperator(SolidityParser.DivLvalueOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#mulLvalueOperator}.
	 * @param ctx the parse tree
	 */
	void enterMulLvalueOperator(SolidityParser.MulLvalueOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#mulLvalueOperator}.
	 * @param ctx the parse tree
	 */
	void exitMulLvalueOperator(SolidityParser.MulLvalueOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#divRemLvalueOperator}.
	 * @param ctx the parse tree
	 */
	void enterDivRemLvalueOperator(SolidityParser.DivRemLvalueOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#divRemLvalueOperator}.
	 * @param ctx the parse tree
	 */
	void exitDivRemLvalueOperator(SolidityParser.DivRemLvalueOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(SolidityParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(SolidityParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#indexedParameterList}.
	 * @param ctx the parse tree
	 */
	void enterIndexedParameterList(SolidityParser.IndexedParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#indexedParameterList}.
	 * @param ctx the parse tree
	 */
	void exitIndexedParameterList(SolidityParser.IndexedParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#indexedParameter}.
	 * @param ctx the parse tree
	 */
	void enterIndexedParameter(SolidityParser.IndexedParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#indexedParameter}.
	 * @param ctx the parse tree
	 */
	void exitIndexedParameter(SolidityParser.IndexedParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SolidityParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SolidityParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SolidityParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SolidityParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void enterStorageLocation(SolidityParser.StorageLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void exitStorageLocation(SolidityParser.StorageLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SolidityParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SolidityParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SolidityParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SolidityParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#emitEventStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitEventStatement(SolidityParser.EmitEventStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#emitEventStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitEventStatement(SolidityParser.EmitEventStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void enterInlineAssemblyStatement(SolidityParser.InlineAssemblyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void exitInlineAssemblyStatement(SolidityParser.InlineAssemblyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SolidityParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SolidityParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#placeholderStatement}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholderStatement(SolidityParser.PlaceholderStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#placeholderStatement}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholderStatement(SolidityParser.PlaceholderStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(SolidityParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(SolidityParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#throwRevertStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowRevertStatement(SolidityParser.ThrowRevertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#throwRevertStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowRevertStatement(SolidityParser.ThrowRevertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(SolidityParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(SolidityParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(SolidityParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(SolidityParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#inlineAssemblyBlock}.
	 * @param ctx the parse tree
	 */
	void enterInlineAssemblyBlock(SolidityParser.InlineAssemblyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#inlineAssemblyBlock}.
	 * @param ctx the parse tree
	 */
	void exitInlineAssemblyBlock(SolidityParser.InlineAssemblyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyItem(SolidityParser.AssemblyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyItem(SolidityParser.AssemblyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyExpression(SolidityParser.AssemblyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyExpression(SolidityParser.AssemblyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCall(SolidityParser.AssemblyCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCall(SolidityParser.AssemblyCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLocalDefinition(SolidityParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLocalDefinition(SolidityParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyAssignment(SolidityParser.AssemblyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyAssignment(SolidityParser.AssemblyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierOrList(SolidityParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierOrList(SolidityParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierList(SolidityParser.AssemblyIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierList(SolidityParser.AssemblyIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyStackAssignment(SolidityParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyStackAssignment(SolidityParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(SolidityParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(SolidityParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void enterAssemblySwitch(SolidityParser.AssemblySwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void exitAssemblySwitch(SolidityParser.AssemblySwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCase(SolidityParser.AssemblyCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCase(SolidityParser.AssemblyCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionDefinition(SolidityParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionDefinition(SolidityParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionReturns(SolidityParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionReturns(SolidityParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFor(SolidityParser.AssemblyForContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFor(SolidityParser.AssemblyForContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIf(SolidityParser.AssemblyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIf(SolidityParser.AssemblyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLiteral(SolidityParser.AssemblyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLiteral(SolidityParser.AssemblyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void enterSubAssembly(SolidityParser.SubAssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void exitSubAssembly(SolidityParser.SubAssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(SolidityParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(SolidityParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void enterNameValueList(SolidityParser.NameValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void exitNameValueList(SolidityParser.NameValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SolidityParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SolidityParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SolidityParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SolidityParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SolidityParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SolidityParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void enterElementaryTypeName(SolidityParser.ElementaryTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void exitElementaryTypeName(SolidityParser.ElementaryTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(SolidityParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(SolidityParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(SolidityParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(SolidityParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(SolidityParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(SolidityParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#decimalNumber}.
	 * @param ctx the parse tree
	 */
	void enterDecimalNumber(SolidityParser.DecimalNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#decimalNumber}.
	 * @param ctx the parse tree
	 */
	void exitDecimalNumber(SolidityParser.DecimalNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#versionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterVersionLiteral(SolidityParser.VersionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#versionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitVersionLiteral(SolidityParser.VersionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SolidityParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SolidityParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#numberUnit}.
	 * @param ctx the parse tree
	 */
	void enterNumberUnit(SolidityParser.NumberUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#numberUnit}.
	 * @param ctx the parse tree
	 */
	void exitNumberUnit(SolidityParser.NumberUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#hexNumber}.
	 * @param ctx the parse tree
	 */
	void enterHexNumber(SolidityParser.HexNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#hexNumber}.
	 * @param ctx the parse tree
	 */
	void exitHexNumber(SolidityParser.HexNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#hexLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexLiteral(SolidityParser.HexLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#hexLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexLiteral(SolidityParser.HexLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SolidityParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SolidityParser.StringLiteralContext ctx);
}