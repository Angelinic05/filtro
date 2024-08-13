package com.campuslands.filtro.laboratory.domain;

import com.campuslands.filtro.medicine.domain.Medicine;
import com.campuslands.filtro.city.domain.City;
import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Laboratory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String name;

    @JsonBackReference(value = "city-laboratory")
    @ManyToOne
    @JoinColumn(name = "regionId")
    public City cities;

    @OneToMany(mappedBy = "codelab")
    private List<Medicine> Medicines;

}
