package com.campuslands.filtro.medicine.infraestructure.adapter.in.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campuslands.filtro.medicine.domain.Medicine;


/**
 * CityRepository
 */
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    
}