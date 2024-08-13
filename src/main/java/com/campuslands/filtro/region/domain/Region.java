package com.campuslands.filtro.region.domain;

import java.util.List;


import com.campuslands.filtro.city.domain.City;
import com.campuslands.filtro.country.domain.Country;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * City
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String name;

    @JsonBackReference(value = "country-region")
    @ManyToOne
    @JoinColumn(name = "countryId")
    public Country country;


    @OneToMany(mappedBy = "codereg")
    private List<City> city;
}