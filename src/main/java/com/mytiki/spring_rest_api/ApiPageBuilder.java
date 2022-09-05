/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.spring_rest_api;

import java.util.List;

public class ApiPageBuilder<T> {
    List<T> elements;
    private Long totalElements;
    private Integer totalPages;
    private Integer page;

    public ApiPageBuilder<T> elements(List<T> elements){
        this.elements = elements;
        return  this;
    }

    public ApiPageBuilder<T> totalElements(Long totalElements){
        this.totalElements = totalElements;
        return this;
    }

    public ApiPageBuilder<T> page(Integer page){
        this.page = page;
        return this;
    }

    public ApiPageBuilder<T> totalPages(Integer totalPages){
        this.totalPages = totalPages;
        return this;
    }

    public ApiPage<T> build(){
        ApiPage<T> apiPage = new ApiPage<>();
        apiPage.setElements(elements);
        apiPage.setTotalElements(totalElements);
        apiPage.setPage(page);
        apiPage.setTotalPages(totalPages);
        apiPage.setSize(elements.size());
        return apiPage;
    }
}
