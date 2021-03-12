/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.common_rest.reply;

public class ApiReplyAmoPageBuilder {

    private Integer size;
    private Long totalElements;
    private Integer totalPages;
    private Integer page;

    public ApiReplyAmoPageBuilder size(Integer size){
        this.size = size;
        return this;
    }

    public ApiReplyAmoPageBuilder totalElements(Long totalElements){
        this.totalElements = totalElements;
        return this;
    }

    public ApiReplyAmoPageBuilder totalPages(Integer totalPages){
        this.totalPages = totalPages;
        return this;
    }

    public ApiReplyAmoPageBuilder page(Integer page){
        this.page = page;
        return this;
    }

    public ApiReplyAmoPage build(){
        ApiReplyAmoPage replyAmoPage = new ApiReplyAmoPage();
        replyAmoPage.setPage(page);
        replyAmoPage.setSize(size);
        replyAmoPage.setTotalElements(totalElements);
        replyAmoPage.setTotalPages(totalPages);
        return replyAmoPage;
    }
}
