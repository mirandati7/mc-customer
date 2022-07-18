package com.estudo.microsservice.dto;


import com.estudo.microsservice.model.Customer;

public class CustomerResponse {

    private Long id;
    private String name;
    private String document;
    
    public CustomerResponse(Customer customer) {
        this.name = customer.getName();
        this.document = customer.getDocument();
    }

}
