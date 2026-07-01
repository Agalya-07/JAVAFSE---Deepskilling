package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Country;
import com.cognizant.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/countries/search/{text}")
    public List<Country> searchCountry(@PathVariable String text) {
        return countryService.searchCountry(text);
    }

    @GetMapping("/countries/start/{letter}")
    public List<Country> searchCountryStartingWith(@PathVariable String letter) {
        return countryService.searchCountryStartingWith(letter);
    }

    @GetMapping("/countries/sort")
    public List<Country> getCountriesSorted() {
        return countryService.getCountriesSorted();
    }
}