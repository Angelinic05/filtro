package com.campuslands.filtro.unitmeasurement.domain;

import java.util.List;

import com.campuslands.filtro.medicine.domain.Medicine;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Unitmeasurement {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String name;


    @OneToMany(mappedBy = "codeum")
    private List<Medicine> medicines;
}
