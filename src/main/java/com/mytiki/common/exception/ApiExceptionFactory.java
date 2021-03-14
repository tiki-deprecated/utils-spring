/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common.exception;


import com.mytiki.common.reply.ApiReplyAOMessageBuilder;
import org.springframework.http.HttpStatus;

public class ApiExceptionFactory {

    public static ApiException exception(HttpStatus status, String message){
        return new ApiExceptionBuilder()
                .httpStatus(status)
                .messages(new ApiReplyAOMessageBuilder()
                        .status(status)
                        .message(message)
                        .build())
                .build();
    }
}
