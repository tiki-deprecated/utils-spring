/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import java.util.List;

public class ApiReplyAmo<T> {

    private String status;
    private Integer code;
    private T data;
    private ApiReplyAmoPage page;
    private List<ApiReplyAmoMessage> messages;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiReplyAmoPage getPage() {
        return page;
    }

    public void setPage(ApiReplyAmoPage page) {
        this.page = page;
    }

    public List<ApiReplyAmoMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ApiReplyAmoMessage> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "ApiReplyAmo{" +
                "status='" + status + '\'' +
                ", code=" + code +
                ", data=" + data +
                ", page=" + page +
                ", messages=" + messages +
                '}';
    }
}
