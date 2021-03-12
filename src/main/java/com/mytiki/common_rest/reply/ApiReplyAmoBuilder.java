/*
 * Copyright (c) My Tiki, Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

public class ApiReplyAmoBuilder<T> {

    private String status;
    private Integer code;
    private T data;
    private com.mytiki.drinks.api.reply.ApiReplyAmoPage page;
    private List<com.mytiki.drinks.api.reply.ApiReplyAmoMessage> messages;

    public ApiReplyAmoBuilder<T> status(String status){
        this.status = status;
        return this;
    }

    public ApiReplyAmoBuilder<T> code(Integer code){
        this.code = code;
        return this;
    }

    public ApiReplyAmoBuilder<T> httpStatus(HttpStatus httpStatus){
        this.status = httpStatus.getReasonPhrase();
        this.code = httpStatus.value();
        return this;
    }

    public ApiReplyAmoBuilder<T> data(T data){
        this.data = data;
        return this;
    }

    public ApiReplyAmoBuilder<T> page(com.mytiki.drinks.api.reply.ApiReplyAmoPage page){
        this.page = page;
        return this;
    }

    public ApiReplyAmoBuilder<T> messages(List<com.mytiki.drinks.api.reply.ApiReplyAmoMessage> messages){
        this.messages = messages;
        return this;
    }

    public ApiReplyAmoBuilder<T> messages(com.mytiki.drinks.api.reply.ApiReplyAmoMessage... messages){
        this.messages = Arrays.asList(messages);
        return this;
    }

    public com.mytiki.drinks.api.reply.ApiReplyAmo<T> build(){
        com.mytiki.drinks.api.reply.ApiReplyAmo<T> apiReplyAmo = new com.mytiki.drinks.api.reply.ApiReplyAmo<>();
        apiReplyAmo.setMessages(messages);
        apiReplyAmo.setStatus(status);
        apiReplyAmo.setCode(code);
        apiReplyAmo.setData(data);
        apiReplyAmo.setPage(page);
        return apiReplyAmo;
    }
}
