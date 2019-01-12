package org.lxg.frame.antlr.demo;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.lxg.frame.antlr.demo.antlr.DemoLexer;
import org.lxg.frame.antlr.demo.antlr.DemoParser;
import org.lxg.frame.antlr.demo.listener.SampleListener;
import org.lxg.frame.antlr.exceptions.AntlrParseException;
import org.lxg.frame.antlr.listener.ErrorListener;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/7/31.
 */
public class ListenerTest {

    @Test
    public void test1() throws Exception {
        String inputFile = "D:\\WorkSpaces\\Self\\javaFrame\\antlr\\src\\test\\resources\\data.txt";
        InputStream is = null;

        if ( inputFile!=null ) is = new FileInputStream(inputFile);

        ANTLRInputStream input = new ANTLRInputStream(is);
        DemoLexer lexer = new DemoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DemoParser parser = new DemoParser(tokens);

        ErrorListener errorListener = new ErrorListener();
        parser.addErrorListener(errorListener);

        ParseTree tree = parser.prog();
        if (StringUtils.isNotEmpty(errorListener.getErrorMsg())) {
            throw new AntlrParseException(errorListener.getErrorMsg());
        }
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SampleListener(), tree);

        // print LISP-style tree
//        System.out.println(tree.toStringTree(parser));
    }
}
