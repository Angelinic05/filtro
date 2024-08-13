package com.campuslands.filtro.unitmeasurement.infraestructure.adapter.out;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campuslands.filtro.unitmeasurement.domain.Unitmeasurement;


/**
 * CityRepository
 */
@Repository
public interface UnitmeasuUnitmeasurementRepository extends JpaRepository<Unitmeasurement, Long> {

}