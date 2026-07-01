package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Find countries containing text
    List<Country> findByNameContainingIgnoreCase(String text);

    // Find countries starting with text
    List<Country> findByNameStartingWithIgnoreCase(String text);

    // Find all countries in ascending order
    List<Country> findAllByOrderByNameAsc();
}