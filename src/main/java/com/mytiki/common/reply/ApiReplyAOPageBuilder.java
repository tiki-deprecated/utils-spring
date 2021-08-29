/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common.reply;

public class ApiReplyAOPageBuilder {

    private Integer size;
    private Long totalElements;
    private Integer totalPages;
    private Integer page;

    public ApiReplyAOPageBuilder size(Integer size){
        this.size = size;
        return this;
    }

    public ApiReplyAOPageBuilder totalElements(Long totalElements){
        this.totalElements = totalElements;
        return this;
    }

    public ApiReplyAOPageBuilder totalPages(Integer totalPages){
        this.totalPages = totalPages;
        return this;
    }

    public ApiReplyAOPageBuilder page(Integer page){
        this.page = page;
        return this;
    }

    public ApiReplyAOPage build(){
        ApiReplyAOPage replyAOPage = new ApiReplyAOPage();
        replyAOPage.setPage(page);
        replyAOPage.setSize(size);
        replyAOPage.setTotalElements(totalElements);
        replyAOPage.setTotalPages(totalPages);
        return replyAOPage;
    }
}
