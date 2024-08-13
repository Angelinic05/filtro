package com.campuslands.filtro.region.infraestructure.adapter.out;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campuslands.filtro.region.domain.Region;


/**
 * CityRepository
 */
@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

}