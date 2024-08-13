package com.campuslands.filtro.laboratory.infraestructure.adapter.in.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campuslands.filtro.laboratory.domain.Laboratory;


/**
 * CityRepository
 */
@Repository
public interface LaboratoryRepository extends JpaRepository<Laboratory, Long> {
    
}