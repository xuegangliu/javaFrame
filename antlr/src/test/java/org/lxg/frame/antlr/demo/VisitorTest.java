package org.lxg.frame.antlr.demo;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.lxg.frame.antlr.demo.antlr.DemoLexer;
import org.lxg.frame.antlr.demo.antlr.DemoParser;
import org.lxg.frame.antlr.demo.listener.SampleVisitor;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/7/31.
 */
public class VisitorTest {

    @Test
    public void test1() throws Exception {

        String inputFile = "D:\\WorkSpaces\\Self\\samplej\\antlr\\src\\test\\resources\\data.txt";
        InputStream is = System.in;

        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);

        DemoLexer lexer = new DemoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DemoParser parser = new DemoParser(tokens);
        ParseTree tree = parser.prog(); // parse
        SampleVisitor eval = new SampleVisitor();
        eval.visit(tree);

    }
}
