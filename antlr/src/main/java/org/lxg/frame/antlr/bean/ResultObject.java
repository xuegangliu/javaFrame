package org.lxg.frame.antlr.bean;

import java.io.Serializable;

/**
 * @author: xuegangliu
 * @date: 5/31/2018 7:21 PM
 * @DES:
 * @version: v1.0
 */
public class ResultObject implements Serializable {
    private boolean pass;
    private String errMsg;

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public ResultObject(boolean pass, String errMsg) {
        this.pass = pass;
        this.errMsg = errMsg;
    }

    public ResultObject() {
    }
}
