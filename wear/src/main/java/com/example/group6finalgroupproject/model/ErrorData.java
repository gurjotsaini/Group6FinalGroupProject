package com.example.group6finalgroupproject.model;

/**
 * Details of an error returned by the ChatGPT API.
 */
public class ErrorData {
    private String message;
    private String type;
    private String param;
    private String code;

    // Getters ans setters
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getParam() {
        return param;
    }
    public void setParam(String param) {
        this.param = param;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}
