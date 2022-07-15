package com.estudo.microsservice.model;


import java.math.BigDecimal;

public class CustomerResponse {

    private Long id;
    private String name;
    private String document;
    
    public CustomerResponse(Customer customer) {
        this.name = customer.getName();
        this.description = customer.getDescription();
        this.document = customer.getDocument();
    }

}
