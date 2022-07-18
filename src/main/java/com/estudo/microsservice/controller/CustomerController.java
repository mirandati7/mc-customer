package com.estudo.microsservice.controller;

import com.estudo.microsservice.model.Customer;
import com.estudo.microsservice.dto.CustomerResponse;
import com.estudo.microsservice.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        CustomerResponse response = new CustomerResponse(customer);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

}
