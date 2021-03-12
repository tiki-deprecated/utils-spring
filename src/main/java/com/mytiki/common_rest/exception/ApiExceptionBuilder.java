/*
 * Copyright (c) My Tiki, Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.exception;

import com.mytiki.drinks.api.reply.ApiReplyAmoMessage;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

public class ApiExceptionBuilder {

    private String status;
    private Integer code;
    private List<ApiReplyAmoMessage> messages;
    private Throwable cause;

    public ApiExceptionBuilder status(String status){
        this.status = status;
        return this;
    }

    public ApiExceptionBuilder code(Integer code){
        this.code = code;
        return this;
    }

    public ApiExceptionBuilder httpStatus(HttpStatus httpStatus){
        this.status = httpStatus.getReasonPhrase();
        this.code = httpStatus.value();
        return this;
    }

    public ApiExceptionBuilder messages(List<ApiReplyAmoMessage> messages){
        this.messages = messages;
        return this;
    }

    public ApiExceptionBuilder messages(ApiReplyAmoMessage... messages){
        this.messages = Arrays.asList(messages);
        return this;
    }

    public ApiExceptionBuilder cause(Throwable cause){
        this.cause = cause;
        return this;
    }

    public ApiException build(){
        return new ApiException(cause, status, code, messages);
    }
}
