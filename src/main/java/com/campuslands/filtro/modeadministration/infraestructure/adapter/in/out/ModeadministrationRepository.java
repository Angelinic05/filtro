package com.campuslands.filtro.modeadministration.infraestructure.adapter.in.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campuslands.filtro.modeadministration.domain.Modeadministration;


/**
 * CityRepository
 */
@Repository
public interface ModeadministrationRepository extends JpaRepository<Modeadministration, Long> {
    
}