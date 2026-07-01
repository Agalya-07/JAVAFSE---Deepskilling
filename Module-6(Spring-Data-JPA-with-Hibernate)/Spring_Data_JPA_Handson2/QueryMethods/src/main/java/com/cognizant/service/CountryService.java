package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Country;
import com.cognizant.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Get all countries
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // Search by containing text
    public List<Country> searchCountry(String text) {
        return countryRepository.findByNameContainingIgnoreCase(text);
    }

    // Search by starting letter
    public List<Country> searchCountryStartingWith(String letter) {
        return countryRepository.findByNameStartingWithIgnoreCase(letter);
    }

    // Get all countries in ascending order
    public List<Country> getCountriesSorted() {
        return countryRepository.findAllByOrderByNameAsc();
    }
}