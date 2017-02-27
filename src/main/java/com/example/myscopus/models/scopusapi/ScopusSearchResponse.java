package com.example.myscopus.models.scopusapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScopusSearchResponse {

    @JsonProperty(value = "search-results")
    private ScopusSearchResult scopusSearchResult;

    public ScopusSearchResponse() {
    }

    public ScopusSearchResult getScopusSearchResult() {
        return scopusSearchResult;
    }

    public void setScopusSearchResult(ScopusSearchResult scopusSearchResult) {
        this.scopusSearchResult = scopusSearchResult;
    }

    @Override
    public String toString() {
        return "ScopusSearchResponse{" +
                "scopusSearchResult=" + scopusSearchResult +
                '}';
    }
}
