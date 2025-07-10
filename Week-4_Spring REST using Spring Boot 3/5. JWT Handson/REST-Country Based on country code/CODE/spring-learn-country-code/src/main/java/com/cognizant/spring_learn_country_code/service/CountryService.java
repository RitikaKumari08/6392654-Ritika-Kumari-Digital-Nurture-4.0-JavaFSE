package com.cognizant.spring_learn_country_code.service;

import com.cognizant.spring_learn_country_code.model.Country;
import com.cognizant.spring_learn_country_code.model.CountryList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code) throws Exception {
        // Load country.xml from classpath
        InputStream inputStream = this.getClass().getResourceAsStream("/country.xml");
        if (inputStream == null) {
            throw new Exception("country.xml file not found in classpath.");
        }

        // Parse XML to CountryList
        JAXBContext context = JAXBContext.newInstance(CountryList.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        CountryList countryList = (CountryList) unmarshaller.unmarshal(inputStream);
        List<Country> countries = countryList.getCountries();

        // Find country by code (case-insensitive)
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new Exception("Country not found for code: " + code));
    }
}
