/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.invoke.MethodHandles;

@ControllerAdvice
public abstract class ApiReplyHandler implements ResponseBodyAdvice<ApiReplyAO<?>> {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return methodParameter.getParameterType().equals(ApiReplyAO.class);
    }

    @Override
    public ApiReplyAO<?> beforeBodyWrite(ApiReplyAO<?> aoReply,
                                         MethodParameter methodParameter,
                                         MediaType mediaType,
                                         Class<? extends HttpMessageConverter<?>> aClass,
                                         ServerHttpRequest serverHttpRequest,
                                         ServerHttpResponse serverHttpResponse) {

        if(
            (aoReply.getCode() == null || aoReply.getStatus() == null) &&
            (serverHttpResponse instanceof ServletServerHttpResponse)
        ) {
            logger.trace("Request: "
                    + serverHttpRequest.getURI().toString()
                    + " - Reply body is missing either code or status. Adding them in");
            HttpStatus httpStatus = HttpStatus.valueOf(((ServletServerHttpResponse) serverHttpResponse).getServletResponse().getStatus());
            aoReply.setStatus(httpStatus.getReasonPhrase());
            aoReply.setCode(httpStatus.value());
        }

        return aoReply;
    }
}
