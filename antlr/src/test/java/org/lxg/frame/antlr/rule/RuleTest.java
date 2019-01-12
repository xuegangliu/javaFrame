package org.lxg.frame.antlr.rule;

import com.alibaba.fastjson.JSONObject;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.lxg.frame.antlr.bean.ResultObject;
import org.lxg.frame.antlr.listener.ErrorListener;
import org.lxg.frame.antlr.rule.antlr.RuleLexer;
import org.lxg.frame.antlr.rule.antlr.RuleParser;
import org.lxg.frame.antlr.rule.listener.TestListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: xuegangliu
 * @date: 5/31/2018 2:20 PM
 * @DES:
 * @version: v1.0
 */
public class RuleTest {
    public static final Logger logger = LoggerFactory.getLogger(RuleTest.class);

    public static ResultObject isConform(String params){
        ResultObject resultObject = new ResultObject();
        ANTLRInputStream in = new ANTLRInputStream(params);
        RuleLexer lexer = new RuleLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RuleParser parser = new RuleParser(tokens);
        ErrorListener errorListener = new ErrorListener();
        parser.addErrorListener(errorListener);
        parser.regulation();
        if (StringUtils.isNotEmpty(errorListener.getErrorMsg())) {
            resultObject.setPass(false);
            resultObject.setErrMsg(errorListener.getErrorMsg());
        }else{
            resultObject.setPass(true);
            resultObject.setErrMsg("符合规则");
        }
        logger.error(JSONObject.toJSON(resultObject).toString());
        return resultObject;
    }

    public static void run(String expr) throws Exception{

        //对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream in = new ANTLRInputStream(expr);

        //用 in 构造词法分析器 lexer，词法分析的作用是产生记号
        RuleLexer lexer = new RuleLexer(in);

        //用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        RuleParser parser = new RuleParser(tokens);

        TestListener testListener = new TestListener();
        parser.addParseListener(testListener);

        //最终调用语法分析器的规则 prog，完成对表达式的验证
//        parser.regulation();

        ParseTree parseTree = parser.equationModule();
//        RuleVisitor visitor = new RuleVisitor();
//        Integer rtn = visitor.visit(parseTree);
//        System.out.println("#result#"+rtn.toString());

        // Listener
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(null,parseTree);



    }

    @Test
    public void test1() throws Exception{
        String test = "equation requestId = 11111111111";
        RuleTest.isConform(test);
//        String[] testStr={
//                "equation requestId = 11111111111"
////                "a+b+3",
////                "(a-b)+3",
////                "a+(b*3"
//        };
//
//        for (String s:testStr){
//            System.out.println("Input expr:"+s);
//            run(s);
//        }
    }
}
