/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.spring_rest_api;

import java.util.List;
import java.util.Objects;

public class ApiPage<T> {
    private List<T> elements;
    private Integer size;
    private Long totalElements;
    private Integer totalPages;
    private Integer page;

    public ApiPage() {}

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
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
        return "ApiPage{" +
                "elements=" + elements +
                ", size=" + size +
                ", totalElements=" + totalElements +
                ", totalPages=" + totalPages +
                ", page=" + page +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiPage<?> apiPage = (ApiPage<?>) o;
        return Objects.equals(elements, apiPage.elements) && Objects.equals(size, apiPage.size) && Objects.equals(totalElements, apiPage.totalElements) && Objects.equals(totalPages, apiPage.totalPages) && Objects.equals(page, apiPage.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements, size, totalElements, totalPages, page);
    }
}
