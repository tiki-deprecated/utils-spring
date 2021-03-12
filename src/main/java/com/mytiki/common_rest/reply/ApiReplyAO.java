/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

import java.util.List;

public class ApiReplyAO<T> {

    private String status;
    private Integer code;
    private T data;
    private ApiReplyAOPage page;
    private List<ApiReplyAOMessage> messages;

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

    public ApiReplyAOPage getPage() {
        return page;
    }

    public void setPage(ApiReplyAOPage page) {
        this.page = page;
    }

    public List<ApiReplyAOMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ApiReplyAOMessage> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "ApiReplyAO{" +
                "status='" + status + '\'' +
                ", code=" + code +
                ", data=" + data +
                ", page=" + page +
                ", messages=" + messages +
                '}';
    }
}
