package com.campuslands.filtro.medicine.domain;

import com.campuslands.filtro.activeprinciple.domain.Activeprinciple;
import com.campuslands.filtro.modeadministration.domain.Modeadministration;
import com.campuslands.filtro.unitmeasurement.domain.Unitmeasurement;
import com.campuslands.filtro.laboratory.domain.Laboratory;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String proceeding;
    public String name;
    public String Healthregister;
    public String descripcion;
    public String descripctionShort;

    @JsonBackReference(value = "medicine-codemodeadmin")
    @ManyToOne
    @JoinColumn(name = "codemodeadminId")
    public Modeadministration modeadministration;    

    @JsonBackReference(value = "medicine-codap")
    @ManyToOne
    @JoinColumn(name = "codemodeadminId")
    public Activeprinciple activeprinciple;  

    @JsonBackReference(value = "medicine-codeum")
    @ManyToOne
    @JoinColumn(name = "codeum")
    public Unitmeasurement codeum;  

    @JsonBackReference(value = "medicine-codelab")
    @ManyToOne
    @JoinColumn(name = "codeum")
    public Laboratory laboratory;  
}
