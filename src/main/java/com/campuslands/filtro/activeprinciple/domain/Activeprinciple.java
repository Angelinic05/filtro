package com.campuslands.filtro.activeprinciple.domain;


import java.util.List;

import com.campuslands.filtro.medicine.domain.Medicine;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Activeprinciple {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String nameap;

    @OneToMany(mappedBy = "codeap")
    private List<Medicine> medicines;

}
