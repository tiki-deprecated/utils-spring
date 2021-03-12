/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common.reply;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ApiReplyAOFactory {

    public static <T> ApiReplyAO<T> ok(T data){
        return new ApiReplyAOBuilder<T>()
                .httpStatus(HttpStatus.OK)
                .data(data)
                .build();
    }

    public static <T> ApiReplyAO<T> ok(T data, String message){
        return new ApiReplyAOBuilder<T>()
                .httpStatus(HttpStatus.OK)
                .data(data)
                .messages(new ApiReplyAOMessage(message))
                .build();
    }

    public static <T> ApiReplyAO<T> ok(){
        return new ApiReplyAOBuilder<T>()
                .httpStatus(HttpStatus.OK)
                .build();
    }

    public static <T> ApiReplyAO<T> ok(String message){
        return new ApiReplyAOBuilder<T>()
                .httpStatus(HttpStatus.OK)
                .messages(new ApiReplyAOMessage(message))
                .build();
    }

    public static <T> ApiReplyAO<List<T>> ok(Page<T> data){
        ApiReplyAOPage replyAOPage = new ApiReplyAOPageBuilder()
                .page(data.getNumber())
                .size(data.getSize())
                .totalElements(data.getTotalElements())
                .totalPages(data.getTotalPages())
                .build();

        return new ApiReplyAOBuilder<List<T>>()
                .httpStatus(HttpStatus.OK)
                .page(replyAOPage)
                .data(data.getContent())
                .build();
    }
}
