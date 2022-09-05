/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.spring_rest_api;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class ApiExceptionBuilder {
    private final HttpStatus httpStatus;
    private String id;
    private String message;
    private String detail;
    private String help;
    private Throwable cause;
    private Map<String, String> properties;

    public ApiExceptionBuilder(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public ApiExceptionBuilder message(String message) {
        this.message = message;
        return this;
    }

    public ApiExceptionBuilder id(String id){
        this.id = id;
        return this;
    }

    public ApiExceptionBuilder detail(String detail){
        this.detail = detail;
        return this;
    }

    public ApiExceptionBuilder help(String help){
        this.help = help;
        return this;
    }

    public ApiExceptionBuilder cause(Throwable cause){
        this.cause = cause;
        return this;
    }

    public ApiExceptionBuilder properties(Map<String, String> properties){
        this.properties = properties;
        return  this;
    }

    public ApiExceptionBuilder properties(String... kvPairs){
        int mapSize = kvPairs.length / 2;
        HashMap<String, String> propertiesMap = new HashMap<>(mapSize);
        for(int i=0; i<kvPairs.length; i+=2)
            propertiesMap.put(kvPairs[i], kvPairs[i+1]);
        this.properties = propertiesMap;
        return this;
    }

    public ApiException build(){
        ApiException exception = new ApiException(httpStatus, cause);
        exception.setMessage(message);
        exception.setId(id);
        exception.setDetail(detail);
        exception.setHelp(help);
        exception.setProperties(properties);
        return exception;
    }
}
