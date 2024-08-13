package com.campuslands.filtro.city.application;

import java.util.List;
import java.util.Optional;

import com.campuslands.filtro.city.domain.City;

/**
 * CityService
 */
public interface CityService {
    City saveCity(City city);
    City updateCity(Long id, City city);
    void deleteCity(Long id);
    List<City> findAll();
    List<City> findAllView();
    Optional<City> findById(Long id);
}