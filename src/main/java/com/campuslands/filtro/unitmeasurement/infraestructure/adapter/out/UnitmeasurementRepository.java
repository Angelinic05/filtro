package com.campuslands.filtro.unitmeasurement.infraestructure.adapter.out;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campuslands.filtro.region.domain.Region;


/**
 * CityRepository
 */
@Repository
public interface UnitmeasurementRepository extends JpaRepository<Region, Long> {

}