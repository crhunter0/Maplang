package com.github.crhunter.maplang;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;


/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args ) throws FileNotFoundException
    {
    	
    	
    	String filename = "java_templates.stg";
    	
    	STGroup templates = new STGroupFile(filename);
    	
    	
    	CharStream	text  = CharStreams.fromString("IF AM00-FIELD1 = AM00-FIELD2 MOVE AM00-FIELD1 TO cifFieldA CONCAT AM00-FIELD1 TO AM00-FIELD2 AS cifField2 END-IF");
    	Var[] vars = new Var[20];
    	Var var = new Var("String", "AM00-FIELD1");
    	vars[0] = new Var("String", "AM00-FIELD1");
    	vars[1] = new Var("String", "AM00-FIELD2");
    	vars[2] = new Var("String", "cifField1");
    	vars[3] = new Var("String", "cifField2");
    	
    	
    	//errors with nested ifs and multiple statements in mapping
    	
    	
    	
        MaplangLexer lexer = new MaplangLexer(text);
        CommonTokenStream token = new CommonTokenStream(lexer);
        MaplangParser parser = new MaplangParser(token);
        
        ParseTree tree = parser.topUnit(); // parse the content and get the tree
        MaplangListener listener = new StatementListener(templates, vars);

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);
        
        //System.out.println();
    }
}
