/*
 * Copyright (c) My Tiki, Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import java.util.HashMap;

public class ApiReplyAmoMessage {

    private Integer code;
    private String status;
    private String message;
    private HashMap<String, String> properties;

    public ApiReplyAmoMessage() {}

    public ApiReplyAmoMessage(String message) {
        this.message = message;
    }

    public ApiReplyAmoMessage(String message, HashMap<String, String> properties) {
        this.message = message;
        this.properties = properties;
    }

    public ApiReplyAmoMessage(Integer code, String status, String message, HashMap<String, String> properties) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.properties = properties;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<String, String> getProperties() {
        return properties;
    }

    public void setProperties(HashMap<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ApiReplyAmoMessage{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", properties=" + properties +
                '}';
    }
}
