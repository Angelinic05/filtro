package com.campuslands.filtro.farmacy.domain;

import com.campuslands.filtro.city.domain.City;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Farmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String address;
    private Float lon;
    private Float lat;
    private Float latitud;
    private String logo;

    @JsonBackReference(value = "farmacy-city")
    @ManyToOne
    @JoinColumn(name = "cityId")
    private City city;
}
