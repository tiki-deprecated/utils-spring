/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ApiReplyAmoFactory {

    public static <T> ApiReplyAmo<T> ok(T data){
        return new ApiReplyAmoBuilder<T>()
                .httpStatus(HttpStatus.OK)
                .data(data)
                .build();
    }

    public static <T> ApiReplyAmo<T> ok(T data, String message){
        return new ApiReplyAmoBuilder<T>()
                .httpStatus(HttpStatus.OK)
                .data(data)
                .messages(new ApiReplyAmoMessage(message))
                .build();
    }

    public static <T> ApiReplyAmo<T> ok(){
        return new ApiReplyAmoBuilder<T>()
                .httpStatus(HttpStatus.OK)
                .build();
    }

    public static <T> ApiReplyAmo<T> ok(String message){
        return new ApiReplyAmoBuilder<T>()
                .httpStatus(HttpStatus.OK)
                .messages(new ApiReplyAmoMessage(message))
                .build();
    }

    public static <T> ApiReplyAmo<List<T>> ok(Page<T> data){
        ApiReplyAmoPage replyAmoPage = new ApiReplyAmoPageBuilder()
                .page(data.getNumber())
                .size(data.getSize())
                .totalElements(data.getTotalElements())
                .totalPages(data.getTotalPages())
                .build();

        return new ApiReplyAmoBuilder<List<T>>()
                .httpStatus(HttpStatus.OK)
                .page(replyAmoPage)
                .data(data.getContent())
                .build();
    }
}
