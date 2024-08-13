package com.campuslands.filtro.customer.infraestructure.adapter.in.out;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campuslands.filtro.customer.domain.Customer;


/**
 * CityRepository
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}