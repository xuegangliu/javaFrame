package org.lxg.frame.antlr.rule.bean;

import java.util.*;

/**
 * @author: xuegangliu
 * @date: 5/31/2018 5:16 PM
 * @DES:
 * @version: v1.0
 */
public class ResultJsonModel {
    private long totalResults = 0;
    private boolean syntaxError = false;
    private String errorInf = "";
    private Object result = new ArrayList<>();
    private Map<String, Object> extraProperties = new HashMap();


    public long getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(long totalResults) {
        this.totalResults = totalResults;
    }

    public boolean isSyntaxError() {
        return syntaxError;
    }

    public void setSyntaxError(boolean syntaxError) {
        this.syntaxError = syntaxError;
    }

    public String getErrorInf() {
        return errorInf;
    }

    public void setErrorInf(String errorInf) {
        this.errorInf = errorInf;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Map<String, Object> getExtraProperties() {
        return extraProperties;
    }

    public void setExtraProperties(Map<String, Object> extraProperties) {
        this.extraProperties = extraProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private ResultJsonModel resultJsonModel = new ResultJsonModel();

        public Builder result(Object result) {
            resultJsonModel.setResult(result);
            return this;
        }

        public Builder syntaxError(boolean s) {
            resultJsonModel.setSyntaxError(s);
            return this;
        }

        public Builder errorInf(String inf) {
            resultJsonModel.setErrorInf(inf);
            return this;
        }

        public Builder putToExtraProp(String key, Object value) {
            resultJsonModel.getExtraProperties().put(key, value);
            return this;
        }

        public Builder putAllToExtraProp(Map<String, Object> map) {
            resultJsonModel.getExtraProperties().putAll(map);
            return this;
        }

        public ResultJsonModel build() {
            return this.resultJsonModel;
        }
    }
}
