package com.campuslands.filtro.farmacymedicine.infraestructure.adapter.in.out;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campuslands.filtro.farmacymedicine.domain.Farmacymedicine;


/**
 * CityRepository
 */
@Repository
public interface FarmacymedicineRepository extends JpaRepository<Farmacymedicine, Long> {
}