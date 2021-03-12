/*
 * Copyright (c) My Tiki, Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import java.util.List;

public class ApiReplyAmo<T> {

    private String status;
    private Integer code;
    private T data;
    private com.mytiki.drinks.api.reply.ApiReplyAmoPage page;
    private List<com.mytiki.drinks.api.reply.ApiReplyAmoMessage> messages;

    public ApiReplyAmo() {}

    public ApiReplyAmo(String status, Integer code, T data, com.mytiki.drinks.api.reply.ApiReplyAmoPage page, List<com.mytiki.drinks.api.reply.ApiReplyAmoMessage> messages) {
        this.status = status;
        this.code = code;
        this.data = data;
        this.page = page;
        this.messages = messages;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public com.mytiki.drinks.api.reply.ApiReplyAmoPage getPage() {
        return page;
    }

    public void setPage(com.mytiki.drinks.api.reply.ApiReplyAmoPage page) {
        this.page = page;
    }

    public List<com.mytiki.drinks.api.reply.ApiReplyAmoMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<com.mytiki.drinks.api.reply.ApiReplyAmoMessage> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "ApiReplyAmo{" +
                "status='" + status + '\'' +
                ", code=" + code +
                ", data=" + data +
                ", page=" + page +
                ", messages=" + messages +
                '}';
    }
}
