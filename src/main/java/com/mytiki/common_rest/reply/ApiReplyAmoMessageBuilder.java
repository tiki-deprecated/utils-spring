/*
 * Copyright (c) My Tiki, Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

public class ApiReplyAmoMessageBuilder {

    private Integer code;
    private String status;
    private String message;
    private HashMap<String, String> properties;

    public ApiReplyAmoMessageBuilder code(Integer code){
        this.code = code;
        return this;
    }

    public ApiReplyAmoMessageBuilder status(String status){
        this.status = status;
        return this;
    }

    public ApiReplyAmoMessageBuilder code(HttpStatus httpStatus){
        this.code = httpStatus.value();
        this.status = httpStatus.getReasonPhrase();
        return this;
    }

    public ApiReplyAmoMessageBuilder message(String message){
        this.message = message;
        return this;
    }

    public ApiReplyAmoMessageBuilder properties(HashMap<String, String> properties){
        this.properties = properties;
        return this;
    }

    public ApiReplyAmoMessageBuilder properties(String... kvpairs){
        int mapSize = kvpairs.length / 2;
        HashMap<String, String> propertiesMap = new HashMap<>(mapSize);
        for(int i=0; i<kvpairs.length; i+=2)
            propertiesMap.put(kvpairs[i], kvpairs[i+1]);
        this.properties = propertiesMap;
        return this;
    }

    public ApiReplyAmoMessage build(){
        ApiReplyAmoMessage apiReplyAmoMessage = new ApiReplyAmoMessage();
        apiReplyAmoMessage.setCode(code);
        apiReplyAmoMessage.setStatus(status);
        apiReplyAmoMessage.setMessage(message);
        apiReplyAmoMessage.setProperties(properties);
        return apiReplyAmoMessage;
    }
}
