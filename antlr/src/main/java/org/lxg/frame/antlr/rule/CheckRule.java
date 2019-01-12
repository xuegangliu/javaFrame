package org.lxg.frame.antlr.rule;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;
import org.lxg.frame.antlr.exceptions.AntlrParseException;
import org.lxg.frame.antlr.listener.ErrorListener;
import org.lxg.frame.antlr.rule.antlr.RuleLexer;
import org.lxg.frame.antlr.rule.antlr.RuleParser;
import org.lxg.frame.antlr.rule.bean.ResultJsonModel;
import org.lxg.frame.antlr.rule.constant.VisitorStats;
import org.lxg.frame.antlr.rule.parse.Parser;
import org.lxg.frame.antlr.rule.parse.StatsParser;
import org.lxg.frame.antlr.rule.visitors.IBaseVisitor;
import org.lxg.frame.antlr.rule.visitors.VisitorBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * @author: xuegangliu
 * @date: 5/31/2018 3:21 PM
 * @DES:
 * @version: v1.0
 */
public class CheckRule {
    public static final Logger LOGGER = LoggerFactory.getLogger(CheckRule.class);

    private static final Map<VisitorStats, Parser> parserMap;
    private static final ConcurrentMap<String, Map<String, String>> lookupMap=null;

    static {
        parserMap = new HashMap<>();
        StatsParser statsParser = new StatsParser();
//        parserMap.put(VisitorStats.None, new NoneParser());
//        parserMap.put(VisitorStats.OnlyEval, new EvalParser());
//        parserMap.put(VisitorStats.OnlyStats, statsParser);
    }

    public ResultJsonModel getResult(String epl,
                                     Set<String> indices) {
        return getResult(epl, indices, null);
    }

    public ResultJsonModel getResult(String epl,
                                     Set<String> indices,
                                     Set<String> types) {
        final IBaseVisitor baseVisitor = VisitorBuilder.builder()
                .build();
        return getResult(epl, indices, types, baseVisitor);
    }

    private ResultJsonModel getResult(String epl,
                                      Set<String> indices, Set<String> types, IBaseVisitor baseVisitor) {
        try {
            baseVisitor.visit(getParseTree(epl));
        } catch (Exception exc) {
            return ResultJsonModel.builder().syntaxError(true).errorInf(exc.getMessage()).build();
        }

//        if (epl.split("\\|").length < 2) {
//            return ResultJsonModel.builder().syntaxError(true).errorInf(ErrorConstants.NOT_HAVE_EPL).build();
//        }
//
//        if (!parserMap.containsKey(baseVisitor.getStats())) {
//            return ResultJsonModel.builder().syntaxError(true).errorInf(ErrorConstants.UN_SUPPORT_TYPE).build();
//        }

        if (!parserMap.get(baseVisitor.getStats()).beforeExecute(baseVisitor)) return new ResultJsonModel();
        return parserMap.get(baseVisitor.getStats()).parse(baseVisitor);
    }


    private ParseTree getParseTree(String epl) {
        ByteArrayInputStream is = new ByteArrayInputStream(epl.getBytes());
        ANTLRInputStream inputStream = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(is, "UTF-8"));
        } catch (UnsupportedEncodingException exc) {
            reader = null;
        }
        try {
            if (reader != null) {
                inputStream = new ANTLRInputStream(reader);
            } else {
                inputStream = new ANTLRInputStream(is);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        RuleLexer lexer = new RuleLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RuleParser parser = new RuleParser(tokens);

        ErrorListener errorListener = new ErrorListener();
        parser.addErrorListener(errorListener);
        ParseTree parseTree = parser.regulation();
        if (StringUtils.isNotEmpty(errorListener.getErrorMsg())) {
            throw new AntlrParseException(errorListener.getErrorMsg());
        }
        return parseTree;
    }
}
