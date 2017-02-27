package com.example.myscopus.models.scopusapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScopusEntry {

    @JsonProperty(value = "dc:title")
    private String title;

    @JsonProperty(value = "dc:creator")
    private String creator;

    @JsonProperty(value = "prism:publicationName")
    private String publicationName;

    @JsonProperty(value = "prism:coverDate")
    private String coverDate;

    @JsonProperty(value = "link")
    private List<ScopusEntryLink> links;

    @JsonProperty(value = "affiliation")
    private List<ScopusAffiliation> affiliations;

    public ScopusEntry() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public String getCoverDate() {
        return coverDate;
    }

    public void setCoverDate(String coverDate) {
        this.coverDate = coverDate;
    }

    public List<ScopusEntryLink> getLinks() {
        return links;
    }

    public void setLinks(List<ScopusEntryLink> links) {
        this.links = links;
    }

    public List<ScopusAffiliation> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(List<ScopusAffiliation> affiliations) {
        this.affiliations = affiliations;
    }

    @Override
    public String toString() {
        return "ScopusEntry{" +
                "title='" + title + '\'' +
                ", creator='" + creator + '\'' +
                ", publicationName='" + publicationName + '\'' +
                ", coverDate='" + coverDate + '\'' +
                ", links=" + links +
                ", affiliations=" + affiliations +
                '}';
    }
}
