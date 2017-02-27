package com.example.myscopus.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Author {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "start")
    private int start;

    @JsonProperty(value = "count")
    private int count;

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "AuthorAndIndex{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", count=" + count +
                '}';
    }
}
