package com.campuslands.filtro.modeadministration.domain;

import com.campuslands.filtro.medicine.domain.Medicine;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Modeadministration {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String description;

    @JsonBackReference(value = "medicine-codemodeadmin")
    @OneToMany
    @JoinColumn(name = "codemodeadminId")
    public Medicine medicine;    
  
}
