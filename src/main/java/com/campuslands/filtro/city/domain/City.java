package com.campuslands.filtro.city.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

import com.campuslands.filtro.customer.domain.Customer;
import com.campuslands.filtro.laboratory.domain.Laboratory;
import com.campuslands.filtro.farmacy.domain.Farmacy;
import com.campuslands.filtro.region.domain.Region;


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
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String name;

    @JsonBackReference(value = "region-city")
    @ManyToOne
    @JoinColumn(name = "regionId")
    public Region region;

    @OneToMany(mappedBy = "codecityreg")
    private List<Laboratory> laboratories;

    @OneToMany(mappedBy = "codecity")
    private List<Customer> customers;

    @OneToMany(mappedBy = "cityId")
    private List<Farmacy> farmacies;

}