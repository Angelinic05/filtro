package com.campuslands.filtro.farmacy.infraestructure.adapter.in;


import java.util.List;

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

@RestController
@RequestMapping("/api/farmacy")
public class FarmacyController {
    
    @Autowired
    private FarmacyService service;

    @PostMapping("/saveFarmacy")
    public ResponseEntity<Farmacy> saveFarmacy(@RequestBody Farmacy farmacy) {
        service.saveFarmacy(farmacy);
        return ResponseEntity.ok(farmacy);
    }

    @PutMapping("/updateFarmacy/{farmacyId}")
    public ResponseEntity<Farmacy> updateFarmacy(@PathVariable Long farmacyId, @RequestBody Farmacy farmacy) {
        service.updateFarmacy(farmacyId, farmacy);
        return ResponseEntity.ok(farmacy);
    }

    @DeleteMapping("/deleteFarmacy/{cityId}")
    public ResponseEntity<Long> deleteFarmacy(@PathVariable Long farmacyId) {
        service.deleteFarmacy(farmacyId);
        return ResponseEntity.ok(farmacyId);
    }

    @GetMapping("/allFarmacies")
    public ResponseEntity<List<Farmacy>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getFarmacy/{id}")
    public ResponseEntity<Farmacy> getCityByid(@PathVariable Long id) {
        return ResponseEntity.of(service.findById(id));
    }

    @GetMapping("/allFarmaciesView")
    public ResponseEntity<List<Farmacy>> findAllView() {
        return ResponseEntity.ok(service.findAllView());
    }
}
