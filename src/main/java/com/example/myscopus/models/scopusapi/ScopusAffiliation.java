package com.example.myscopus.models.scopusapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScopusAffiliation {

    @JsonProperty(value = "@_fa")
    private boolean fa;

    @JsonProperty(value = "affilname")
    private String affilname;

    @JsonProperty(value = "affiliation-city")
    private String affiliationCity;

    @JsonProperty(value = "affiliation-country")
    private String affiliationCountry;

    public ScopusAffiliation() {
    }

    public ScopusAffiliation(boolean fa, String affilname, String affiliationCity, String affiliationCountry) {
        this.fa = fa;
        this.affilname = affilname;
        this.affiliationCity = affiliationCity;
        this.affiliationCountry = affiliationCountry;
    }

    public boolean isFa() {
        return fa;
    }

    public void setFa(boolean fa) {
        this.fa = fa;
    }

    public String getAffilname() {
        return affilname;
    }

    public void setAffilname(String affilname) {
        this.affilname = affilname;
    }

    public String getAffiliationCity() {
        return affiliationCity;
    }

    public void setAffiliationCity(String affiliationCity) {
        this.affiliationCity = affiliationCity;
    }

    public String getAffiliationCountry() {
        return affiliationCountry;
    }

    public void setAffiliationCountry(String affiliationCountry) {
        this.affiliationCountry = affiliationCountry;
    }

    @Override
    public String toString() {
        return "ScopusAffiliation{" +
                "fa=" + fa +
                ", affilname='" + affilname + '\'' +
                ", affiliationCity='" + affiliationCity + '\'' +
                ", affiliationCountry='" + affiliationCountry + '\'' +
                '}';
    }
}
