/*
 * Copyright (c) TIKI Inc.
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
    private ApiReplyAmoPage page;
    private List<ApiReplyAmoMessage> messages;

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

    public ApiReplyAmoBuilder<T> page(ApiReplyAmoPage page){
        this.page = page;
        return this;
    }

    public ApiReplyAmoBuilder<T> messages(List<ApiReplyAmoMessage> messages){
        this.messages = messages;
        return this;
    }

    public ApiReplyAmoBuilder<T> messages(ApiReplyAmoMessage... messages){
        this.messages = Arrays.asList(messages);
        return this;
    }

    public ApiReplyAmo<T> build(){
        ApiReplyAmo<T> apiReplyAmo = new ApiReplyAmo<>();
        apiReplyAmo.setMessages(messages);
        apiReplyAmo.setStatus(status);
        apiReplyAmo.setCode(code);
        apiReplyAmo.setData(data);
        apiReplyAmo.setPage(page);
        return apiReplyAmo;
    }
}
