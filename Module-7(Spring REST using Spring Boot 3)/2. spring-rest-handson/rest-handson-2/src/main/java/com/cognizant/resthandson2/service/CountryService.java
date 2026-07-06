package com.cognizant.resthandson2.service;

import org.springframework.stereotype.Service;

import com.cognizant.resthandson2.model.Country;

@Service
public class CountryService {

    public Country getCountry() {

        Country country = new Country();

        country.setCode("IN");
        country.setName("India");

        return country;
    }

}