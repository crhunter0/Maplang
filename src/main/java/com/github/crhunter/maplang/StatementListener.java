package com.github.crhunter.maplang;


import java.util.ArrayList;
import java.util.List;

import org.stringtemplate.v4.*;

import com.github.crhunter.maplang.MaplangParser.AndOrConditionContext;
import com.github.crhunter.maplang.MaplangParser.ConcatExtraToStatementContext;
import com.github.crhunter.maplang.MaplangParser.ConcatStatementContext;
import com.github.crhunter.maplang.MaplangParser.ConcatToStatementContext;
import com.github.crhunter.maplang.MaplangParser.IfStatementContext;
import com.github.crhunter.maplang.MaplangParser.MoveStatementContext;
import com.github.crhunter.maplang.MaplangParser.RelationArithmeticComparisonContext;
import com.github.crhunter.maplang.MaplangParser.StatementContext;
import com.github.crhunter.maplang.MaplangParser.TopUnitContext;

public class StatementListener extends MaplangBaseListener {
	
	STGroup templates;
	Var[] vars;
	List<String> concats = new ArrayList<String>();
	List<ST> block = new ArrayList<ST>();
	List<ST> stats = new ArrayList<ST>();
	String statement = "";
	String cond = "";
	List<String> conds = new ArrayList<String>();
	boolean inBlock = false;
	
	
	
	
	@Override
	public void enterTopUnit(TopUnitContext ctx) {
		
		super.enterTopUnit(ctx);
		if (!stats.isEmpty()) { 
			stats.clear();
		}
	}


	@Override
	public void exitTopUnit(TopUnitContext ctx) {
		
		super.exitTopUnit(ctx);
		String name = "LogicId1";
		ST classST = templates.getInstanceOf("class");
		classST.add("name", name);
		classST.add("vars",vars);
		classST.add("stats",stats);
		System.out.println(classST.render());
	}


	public StatementListener(STGroup templates, Var[] vars) {
		this.templates = templates;
		this.vars = vars;
	}
	

	@Override
	public void enterStatement(StatementContext ctx) {
		
		super.enterStatement(ctx);
		//System.out.println("Statement: " + ctx.getText());
	}

	@Override
	public void exitStatement(StatementContext ctx) {
		
		super.exitStatement(ctx);
		/*if (ctx.getParent() != null) {
			System.out.println("stmt parent: " + ctx.getParent().getRuleIndex());
			if (ctx.getParent().getRuleIndex() == MaplangParser.RULE_ifThen ||
				ctx.getParent().getRuleIndex() == MaplangParser.RULE_ifElse) {
				block.add(statement);
				
			}
		}*/
	}

	@Override
	public void enterMoveStatement(MoveStatementContext ctx) {
		
		super.enterMoveStatement(ctx);
	}

	@Override
	public void exitMoveStatement(MoveStatementContext ctx) {
		
		super.exitMoveStatement(ctx);
		ST moveST = templates.getInstanceOf("move");
		moveST.add("left", ctx.moveToStatement().identifier().IDENTIFIER());
		moveST.add("right", ctx.moveToStatement().moveToSendingArea().getText());
		
		if (inBlock == true) {
			block.add(moveST);
		} else {
			stats.add(moveST);
		}
		//statement = moveST.render();
		//System.out.println(statement);	
		
	}
	
	

	@Override
	public void enterConcatStatement(ConcatStatementContext ctx) {
		
		super.enterConcatStatement(ctx);
		if (!concats.isEmpty()) { 
			concats.clear();
		}
	}


	@Override
	public void exitConcatToStatement(ConcatToStatementContext ctx) {
		
		super.exitConcatToStatement(ctx);
		concats.add(ctx.concatToSendingArea().get(0).getText());
		concats.add(ctx.concatToSendingArea().get(1).getText());
		
		//System.out.println(ctx.concatToSendingArea().get(0).getText());
		//System.out.println(ctx.concatToSendingArea().get(1).getText());
		
		
	}


	@Override
	public void exitConcatExtraToStatement(ConcatExtraToStatementContext ctx) {
		
		super.exitConcatExtraToStatement(ctx);
		concats.add(ctx.concatToSendingArea().getText());
		
	}


	@Override
	public void exitConcatStatement(ConcatStatementContext ctx) {
		
		super.exitConcatStatement(ctx);
		ST concatST = templates.getInstanceOf("concats");
		concatST.add("in", concats);
		concatST.add("as", ctx.concatAsStatement().concatAsSendingArea().getText());
		if (inBlock == true) {
			block.add(concatST);
		} else {
			stats.add(concatST);
		}
	    //statement = concatST.render();
		//System.out.println(statement);
	}


	@Override
	public void enterIfStatement(IfStatementContext ctx) {
		
		super.enterIfStatement(ctx);
		if (!block.isEmpty()) { 
			block.clear();
		}
		if (!conds.isEmpty()) {
			conds.clear();
			//System.out.println("cleared conds");
		}
		inBlock = true;
		
	}

	@Override
	public void exitIfStatement(IfStatementContext ctx) {
		
		super.exitIfStatement(ctx);
		ST ifST = templates.getInstanceOf("ifCondition");
		//System.out.println("ifST: " + eefST.toString());
		ifST.add("conds",conds);
		ifST.add("block",block);
		String ifStat = ifST.render();
		//System.out.println(ifStat);
		inBlock = false;
		stats.add(ifST);
		
		
	}


	@Override
	public void exitRelationArithmeticComparison(
			RelationArithmeticComparisonContext ctx) {
		
		super.exitRelationArithmeticComparison(ctx);
		String condLeft = ctx.arithmeticExpression(0).getText();
		String condOp = ctx.relationalOperator().getText();
		String condRight= ctx.arithmeticExpression(1).getText();
		ST condST = templates.getInstanceOf("condition");
		condST.add("left", condLeft);
		condST.add("op", condOp);
		condST.add("right", condRight);
		cond = condST.render();
		conds.add(cond);
		//System.out.println(conds.toString());
	}


	@Override
	public void enterAndOrCondition(AndOrConditionContext ctx) {
		
		super.enterAndOrCondition(ctx);
		String andOr = ctx.getStart().getText();
		ST andOrST = templates.getInstanceOf("andOrCondition");
		andOrST.add("condOp", andOr);
		cond = andOrST.render();
		conds.add(cond);
		//System.out.println(conds.toString());
		
	}


	@Override
	public void exitAndOrCondition(AndOrConditionContext ctx) {
		
		super.exitAndOrCondition(ctx);
	}
	
	
	

	
}
