package org.lxg.frame.antlr.exceptions;

/**
 * @author: xuegangliu
 * @date: 5/31/2018 11:20 AM
 * @DES:
 * @version: v1.0
 */
public class AntlrParseException extends RuntimeException {
    private boolean syntaxError = true;
    private static final String FORMAT = "解析错误: %s";

    private AntlrParseException() {
    }

    public AntlrParseException(String message) {
        super(String.format(FORMAT, message));
    }

    public AntlrParseException(String message, Throwable cause) {
        super(String.format(FORMAT, message), cause);
    }

    public AntlrParseException(Throwable cause) {
        super(String.format(FORMAT, cause.getMessage()), cause);
    }

    public AntlrParseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(String.format(FORMAT, cause.getMessage()), cause, enableSuppression, writableStackTrace);
    }
}
