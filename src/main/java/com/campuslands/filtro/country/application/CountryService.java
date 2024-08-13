package com.campuslands.filtro.country.application;

import java.util.List;
import java.util.Optional;

import com.campuslands.filtro.country.domain.Country;

/**
 * CityService
 */
public interface CountryService {

     Country saveCountry(Country country);

    Country updateCountry(Long id, Country country);

    void deleteCountry(Long id);

    List<Country> findAll();

    Optional<Country> findById(Long id);

    List<Country> findAllView();
}