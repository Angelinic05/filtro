package com.campuslands.filtro.farmacy.application;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.filtro.farmacy.domain.Farmacy;
import com.campuslands.filtro.farmacy.infraestructure.adapter.out.FarmacyRepository;

import jakarta.transaction.Transactional;

@Service
public class FarmacyServiceImpl implements FarmacyService{
    
    @Autowired
    private FarmacyRepository farmacyRepository;

    @Transactional
    @Override
    public void deleteFarmacy(Long id) {
        farmacyRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<Farmacy> findAll() {
        return farmacyRepository.findAll().stream().map(this::farmacy).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public Farmacy saveFarmacy(Farmacy farmacy) {
        return farmacyRepository.save(farmacy);
    }

    @Transactional
    @Override
    public Farmacy updateFarmacy(Long id, Farmacy farmacy) {
        if (farmacyRepository.existsById(id)) {
            farmacy.setId(id);
            return farmacyRepository.save(farmacy);
        } else {
            throw new RuntimeException("city not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<Farmacy> findById(Long id) {
        return Optional.of(farmacyRepository.findById(id).map(this::farmacy)).orElse(null);
    }

    @Override
    public List<Farmacy> findAllView() {
        return farmacyRepository.findAll().stream().map(this::farmacy).collect(Collectors.toList());
    }

    private Farmacy farmacy(Farmacy farmacy) {
        new Farmacy();
        return Farmacy.builder().id(farmacy.getId()).name(farmacy.getName()).address(farmacy.getAddress()).lon(farmacy.getLon()).lat(farmacy.getLat()).cityId(farmacy.getCity()).logo(farmacy.getLogo());
    }
}
