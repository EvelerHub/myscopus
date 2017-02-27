package com.example.myscopus.models.scopusapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScopusSearchResult {

    @JsonProperty(value = "opensearch:totalResults")
    private int totalResults;

    @JsonProperty(value = "opensearch:startIndex")
    private int startIndex;

    @JsonProperty(value = "opensearch:itemsPerPage")
    private int itemsPerPage;

    @JsonProperty(value = "entry")
    private List<ScopusEntry> entries;

    public ScopusSearchResult() {
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public List<ScopusEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<ScopusEntry> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        return "ScopusSearchResult{" +
                "totalResults=" + totalResults +
                ", startIndex=" + startIndex +
                ", itemsPerPage=" + itemsPerPage +
                ", entries=" + entries +
                '}';
    }
}
