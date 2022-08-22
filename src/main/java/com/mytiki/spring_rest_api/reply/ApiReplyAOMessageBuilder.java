/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.spring_rest_api.reply;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

public class ApiReplyAOMessageBuilder {

    private Integer code;
    private String status;
    private String message;
    private HashMap<String, String> properties;

    public ApiReplyAOMessageBuilder code(Integer code){
        this.code = code;
        return this;
    }

    public ApiReplyAOMessageBuilder status(String status){
        this.status = status;
        return this;
    }

    public ApiReplyAOMessageBuilder status(HttpStatus httpStatus){
        this.code = httpStatus.value();
        this.status = httpStatus.getReasonPhrase();
        return this;
    }

    public ApiReplyAOMessageBuilder message(String message){
        this.message = message;
        return this;
    }

    public ApiReplyAOMessageBuilder properties(HashMap<String, String> properties){
        this.properties = properties;
        return this;
    }

    public ApiReplyAOMessageBuilder properties(String... kvpairs){
        int mapSize = kvpairs.length / 2;
        HashMap<String, String> propertiesMap = new HashMap<>(mapSize);
        for(int i=0; i<kvpairs.length; i+=2)
            propertiesMap.put(kvpairs[i], kvpairs[i+1]);
        this.properties = propertiesMap;
        return this;
    }

    public ApiReplyAOMessage build(){
        ApiReplyAOMessage apiReplyAOMessage = new ApiReplyAOMessage();
        apiReplyAOMessage.setCode(code);
        apiReplyAOMessage.setStatus(status);
        apiReplyAOMessage.setMessage(message);
        apiReplyAOMessage.setProperties(properties);
        return apiReplyAOMessage;
    }
}
