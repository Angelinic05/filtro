package com.campuslands.filtro.customer.domain;

import com.campuslands.filtro.city.domain.City;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Customer {
    
        @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String name;
    public String lastname;
    public String email;
    public Float lon;
    public Float latitud;

    @JsonBackReference(value = "customer-city")
    @ManyToOne
    @JoinColumn(name = "cityId")
    public City city;


}
