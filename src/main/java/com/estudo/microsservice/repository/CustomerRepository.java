package com.estudo.microsservice.repository;


import com.estudo.microsservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
