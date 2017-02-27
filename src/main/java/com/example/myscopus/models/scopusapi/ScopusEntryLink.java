package com.example.myscopus.models.scopusapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScopusEntryLink {

    @JsonProperty(value = "@_fa")
    private boolean fa;

    @JsonProperty(value = "@ref")
    private String ref;

    @JsonProperty(value = "@href")
    private String href;

    public ScopusEntryLink() {
    }

    public boolean isFa() {
        return fa;
    }

    public void setFa(boolean fa) {
        this.fa = fa;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "ScopusEntryLink{" +
                "fa=" + fa +
                ", ref='" + ref + '\'' +
                ", href='" + href + '\'' +
                '}';
    }
}
