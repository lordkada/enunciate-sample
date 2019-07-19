package com.ifyouwannabecool.domain;

import java.util.List;

public class PaginatedResponse<T> {

    List<T> results;

    public List<T> getResults() {
        return results;
    }

    public PaginatedResponse<T> setResults(List<T> results) {
        this.results = results;
        return this;
    }

}
