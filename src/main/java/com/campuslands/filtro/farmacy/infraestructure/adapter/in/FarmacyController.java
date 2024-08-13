package com.campuslands.filtro.farmacy.infraestructure.adapter.in;

import jakarta.validation.Valid;

import org.springframework.validation.annotation.Validated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campuslands.filtro.farmacy.application.FarmacyService;
import com.campuslands.filtro.farmacy.domain.Farmacy;

@Validated
@RestController
@RequestMapping("/api/farmacy")
public class FarmacyController {
    
    @Autowired
    private FarmacyService service;

    @PostMapping("/saveFarmacy")
    public ResponseEntity<Farmacy> saveFarmacy(@Valid @RequestBody Farmacy farmacy) {
        service.saveFarmacy(farmacy);
        return ResponseEntity.ok(farmacy);
    }

    @PutMapping("/updateFarmacy/{farmacyId}")
    public ResponseEntity<Farmacy> updateFarmacy(@PathVariable Long farmacyId, @Valid @RequestBody Farmacy farmacy) {
        service.updateFarmacy(farmacyId, farmacy);
        return ResponseEntity.ok(farmacy);
    }

    @DeleteMapping("/deleteFarmacy/{cityId}")
    public ResponseEntity<Long> deleteFarmacy(@PathVariable Long cityId) {
        service.deleteFarmacy(farmacyId);
        return ResponseEntity.ok(farmacyId);
    }

    @GetMapping("/allFarmacies")
    public ResponseEntity<List<FarmacyDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getFarmacy/{id}")
    public ResponseEntity<FarmacyDTO> getCityByid(@PathVariable Long id) {
        return ResponseEntity.of(service.findById(id));
    }

    @GetMapping("/allFarmaciesView")
    public ResponseEntity<List<FarmacyDTO>> findAllView() {
        return ResponseEntity.ok(service.findAllView());
    }
}
