package com.campuslands.filtro.farmacy.application;

import java.util.Optional;
import java.util.List;

import com.campuslands.filtro.farmacy.domain.Farmacy;

public interface FarmacyService {
    Farmacy saveFarmacy(Farmacy farmacy);
    Farmacy updateFarmacy(Long id, Farmacy farmacy);
    void deleteFarmacy(Long id);
    List<Farmacy> findAll();
    List<Farmacy> findAllView();
    Optional<Farmacy> findById(Long id);
}
