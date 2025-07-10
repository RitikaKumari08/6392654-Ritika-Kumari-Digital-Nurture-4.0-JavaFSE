package com.cognizant.spring_learn_country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn_country.model.Country;
import com.cognizant.spring_learn_country.model.CountryList;

import java.util.List;

public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	private static ApplicationContext context;

    public static void main(String[] args) {
        displayCountries();
    }

    public static void displayCountries() {
        context = new ClassPathXmlApplicationContext("country.xml");

        CountryList countryListBean = context.getBean("countryList", CountryList.class);
        List<Country> countries = countryListBean.getCountryList();

        for (Country country : countries) {
            LOGGER.debug("Country: {}", country.toString());
        }
    }
}
