package com.cognizant.spring_learn_country_code.model;

import java.util.List;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlElement;


@XmlRootElement(name = "countries")
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryList {

    @XmlElement(name = "country")
    private List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}

