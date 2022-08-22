/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.spring_rest_api.exception;

import com.mytiki.spring_rest_api.reply.ApiReplyAOMessage;

import java.util.Arrays;
import java.util.List;

public class ApiException extends RuntimeException{

    private String status;
    private Integer code;
    private List<ApiReplyAOMessage> messages;

    public ApiException(String status, Integer code, List<ApiReplyAOMessage> messages) {
        super(messages.toString());
        this.status = status;
        this.code = code;
        this.messages = messages;
    }

    public ApiException(String status, Integer code, ApiReplyAOMessage... messages) {
        super(Arrays.toString(messages));
        this.status = status;
        this.code = code;
        this.messages = Arrays.asList(messages);
    }

    public ApiException(Throwable cause, String status, Integer code, List<ApiReplyAOMessage> messages) {
        super(messages.toString(), cause);
        this.status = status;
        this.code = code;
        this.messages = messages;
    }

    public ApiException(Throwable cause, String status, Integer code, ApiReplyAOMessage... messages) {
        super(Arrays.toString(messages), cause);
        this.status = status;
        this.code = code;
        this.messages = Arrays.asList(messages);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<ApiReplyAOMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ApiReplyAOMessage> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "status='" + status + '\'' +
                ", code=" + code +
                ", messages=" + messages +
                "} " + super.toString();
    }
}
