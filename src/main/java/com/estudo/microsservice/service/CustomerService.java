package com.estudo.microsservice.service;


import com.estudo.microsservice.model.Customer;
import com.estudo.microsservice.repository.CustomerRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository productRepository) {
        this.customerRepository = productRepository;
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
