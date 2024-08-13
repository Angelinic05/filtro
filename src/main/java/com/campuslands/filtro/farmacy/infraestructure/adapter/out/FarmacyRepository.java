package com.campuslands.filtro.farmacy.infraestructure.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campuslands.filtro.farmacy.domain.Farmacy;


public interface FarmacyRepository  extends JpaRepository<Farmacy, Long>  {
    
}
