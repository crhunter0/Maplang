// Generated from Maplang.g4 by ANTLR 4.7.2
package com.github.crhunter.maplang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MaplangParser}.
 */
public interface MaplangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MaplangParser#topUnit}.
	 * @param ctx the parse tree
	 */
	void enterTopUnit(MaplangParser.TopUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#topUnit}.
	 * @param ctx the parse tree
	 */
	void exitTopUnit(MaplangParser.TopUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MaplangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MaplangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoveStatement(MaplangParser.MoveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoveStatement(MaplangParser.MoveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#moveToStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoveToStatement(MaplangParser.MoveToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#moveToStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoveToStatement(MaplangParser.MoveToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#moveToSendingArea}.
	 * @param ctx the parse tree
	 */
	void enterMoveToSendingArea(MaplangParser.MoveToSendingAreaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#moveToSendingArea}.
	 * @param ctx the parse tree
	 */
	void exitMoveToSendingArea(MaplangParser.MoveToSendingAreaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#concatStatement}.
	 * @param ctx the parse tree
	 */
	void enterConcatStatement(MaplangParser.ConcatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#concatStatement}.
	 * @param ctx the parse tree
	 */
	void exitConcatStatement(MaplangParser.ConcatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#concatToStatement}.
	 * @param ctx the parse tree
	 */
	void enterConcatToStatement(MaplangParser.ConcatToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#concatToStatement}.
	 * @param ctx the parse tree
	 */
	void exitConcatToStatement(MaplangParser.ConcatToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#concatExtraToStatement}.
	 * @param ctx the parse tree
	 */
	void enterConcatExtraToStatement(MaplangParser.ConcatExtraToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#concatExtraToStatement}.
	 * @param ctx the parse tree
	 */
	void exitConcatExtraToStatement(MaplangParser.ConcatExtraToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#concatToSendingArea}.
	 * @param ctx the parse tree
	 */
	void enterConcatToSendingArea(MaplangParser.ConcatToSendingAreaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#concatToSendingArea}.
	 * @param ctx the parse tree
	 */
	void exitConcatToSendingArea(MaplangParser.ConcatToSendingAreaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#concatAsStatement}.
	 * @param ctx the parse tree
	 */
	void enterConcatAsStatement(MaplangParser.ConcatAsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#concatAsStatement}.
	 * @param ctx the parse tree
	 */
	void exitConcatAsStatement(MaplangParser.ConcatAsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#concatAsSendingArea}.
	 * @param ctx the parse tree
	 */
	void enterConcatAsSendingArea(MaplangParser.ConcatAsSendingAreaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#concatAsSendingArea}.
	 * @param ctx the parse tree
	 */
	void exitConcatAsSendingArea(MaplangParser.ConcatAsSendingAreaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MaplangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MaplangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#ifThen}.
	 * @param ctx the parse tree
	 */
	void enterIfThen(MaplangParser.IfThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#ifThen}.
	 * @param ctx the parse tree
	 */
	void exitIfThen(MaplangParser.IfThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(MaplangParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(MaplangParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MaplangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MaplangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#andOrCondition}.
	 * @param ctx the parse tree
	 */
	void enterAndOrCondition(MaplangParser.AndOrConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#andOrCondition}.
	 * @param ctx the parse tree
	 */
	void exitAndOrCondition(MaplangParser.AndOrConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCondition(MaplangParser.SimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCondition(MaplangParser.SimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#relationCondition}.
	 * @param ctx the parse tree
	 */
	void enterRelationCondition(MaplangParser.RelationConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#relationCondition}.
	 * @param ctx the parse tree
	 */
	void exitRelationCondition(MaplangParser.RelationConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#relationArithmeticComparison}.
	 * @param ctx the parse tree
	 */
	void enterRelationArithmeticComparison(MaplangParser.RelationArithmeticComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#relationArithmeticComparison}.
	 * @param ctx the parse tree
	 */
	void exitRelationArithmeticComparison(MaplangParser.RelationArithmeticComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#relationCombinedComparison}.
	 * @param ctx the parse tree
	 */
	void enterRelationCombinedComparison(MaplangParser.RelationCombinedComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#relationCombinedComparison}.
	 * @param ctx the parse tree
	 */
	void exitRelationCombinedComparison(MaplangParser.RelationCombinedComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#relationCombinedCondition}.
	 * @param ctx the parse tree
	 */
	void enterRelationCombinedCondition(MaplangParser.RelationCombinedConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#relationCombinedCondition}.
	 * @param ctx the parse tree
	 */
	void exitRelationCombinedCondition(MaplangParser.RelationCombinedConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(MaplangParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(MaplangParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#computeStatement}.
	 * @param ctx the parse tree
	 */
	void enterComputeStatement(MaplangParser.ComputeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#computeStatement}.
	 * @param ctx the parse tree
	 */
	void exitComputeStatement(MaplangParser.ComputeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(MaplangParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(MaplangParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#plusMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(MaplangParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#plusMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(MaplangParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#multDivs}.
	 * @param ctx the parse tree
	 */
	void enterMultDivs(MaplangParser.MultDivsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#multDivs}.
	 * @param ctx the parse tree
	 */
	void exitMultDivs(MaplangParser.MultDivsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#multDiv}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(MaplangParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#multDiv}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(MaplangParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#powers}.
	 * @param ctx the parse tree
	 */
	void enterPowers(MaplangParser.PowersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#powers}.
	 * @param ctx the parse tree
	 */
	void exitPowers(MaplangParser.PowersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(MaplangParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(MaplangParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#basis}.
	 * @param ctx the parse tree
	 */
	void enterBasis(MaplangParser.BasisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#basis}.
	 * @param ctx the parse tree
	 */
	void exitBasis(MaplangParser.BasisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MaplangParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MaplangParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#refIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterRefIdentifier(MaplangParser.RefIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#refIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitRefIdentifier(MaplangParser.RefIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#arrayIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayIdentifier(MaplangParser.ArrayIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#arrayIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayIdentifier(MaplangParser.ArrayIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MaplangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MaplangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaplangParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(MaplangParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaplangParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(MaplangParser.NumericLiteralContext ctx);
}