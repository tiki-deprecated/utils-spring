/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

public class ApiReplyAOBuilder<T> {

    private String status;
    private Integer code;
    private T data;
    private ApiReplyAOPage page;
    private List<ApiReplyAOMessage> messages;

    public ApiReplyAOBuilder<T> status(String status){
        this.status = status;
        return this;
    }

    public ApiReplyAOBuilder<T> code(Integer code){
        this.code = code;
        return this;
    }

    public ApiReplyAOBuilder<T> httpStatus(HttpStatus httpStatus){
        this.status = httpStatus.getReasonPhrase();
        this.code = httpStatus.value();
        return this;
    }

    public ApiReplyAOBuilder<T> data(T data){
        this.data = data;
        return this;
    }

    public ApiReplyAOBuilder<T> page(ApiReplyAOPage page){
        this.page = page;
        return this;
    }

    public ApiReplyAOBuilder<T> messages(List<ApiReplyAOMessage> messages){
        this.messages = messages;
        return this;
    }

    public ApiReplyAOBuilder<T> messages(ApiReplyAOMessage... messages){
        this.messages = Arrays.asList(messages);
        return this;
    }

    public ApiReplyAO<T> build(){
        ApiReplyAO<T> apiReplyAO = new ApiReplyAO<>();
        apiReplyAO.setMessages(messages);
        apiReplyAO.setStatus(status);
        apiReplyAO.setCode(code);
        apiReplyAO.setData(data);
        apiReplyAO.setPage(page);
        return apiReplyAO;
    }
}
