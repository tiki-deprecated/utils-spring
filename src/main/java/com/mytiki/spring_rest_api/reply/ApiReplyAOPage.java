/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.spring_rest_api.reply;

public class ApiReplyAOPage {

    private Integer size;
    private Long totalElements;
    private Integer totalPages;
    private Integer page;

    public ApiReplyAOPage() {}

    public ApiReplyAOPage(Integer size, Long totalElements, Integer totalPages, Integer page) {
        this.size = size;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "ApiReplyAOPage{" +
                "size=" + size +
                ", totalElements=" + totalElements +
                ", totalPages=" + totalPages +
                ", page=" + page +
                '}';
    }
}
