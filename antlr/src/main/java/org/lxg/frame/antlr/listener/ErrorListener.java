package org.lxg.frame.antlr.listener;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;


/**
 * @author: xuegangliu
 * @date: 5/31/2018 5:00 PM
 * @DES:
 * @version: v1.0
 */
public class ErrorListener extends BaseErrorListener {

    private ThreadLocal<String> errorMsg = new ThreadLocal<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        /*List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("rule stack: "+stack);*/
        String error = String.format("解析错误位置 %d行:%d列, detail: %s", line, charPositionInLine, msg);
        this.setErrorMsg(error);
    }

    public String getErrorMsg() {
        return errorMsg.get();
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg.set(errorMsg);
    }
}
