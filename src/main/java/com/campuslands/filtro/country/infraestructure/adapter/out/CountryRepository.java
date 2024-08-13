package com.campuslands.filtro.country.infraestructure.adapter.out;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campuslands.filtro.country.domain.Country;


/**
 * CityRepository
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}