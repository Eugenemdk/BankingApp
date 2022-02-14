package com.example.bankingapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.bankingapp.models.Customer; 

@RestController
@RequestMapping("/")
public class RestApiCustomerController {
    private List<Customer>customers=new ArrayList<>();

    public RestApiCustomerController() {
        customers.addAll(List.of(new Customer("John"),
                                new Customer("Lebron") ,
                                new Customer("JCole"),
                                new Customer("Martin")));
    }

    @GetMapping("/customers")
        Iterable<Customer> getCustomers(){
        return customers;
    }
    
    @GetMapping("/customers/{id}")
    Optional<Customer> getCustomerById(@PathVariable String id){
        for(Customer customer : customers){
            if(customer.getId().equals(id)){
                return Optional.of(customer);
            }
        }
        return Optional.empty();
    }
    @PostMapping("/customers")
    public Customer postCustomer(@RequestBody Customer customer){
        customers.add(customer);
        return customer;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> putCustomer(@PathVariable String id,@RequestBody Customer cust){
        int customerIndex=-1;
        for(Customer customer : customers){
            if(customer.getId().equals(id)){
                customerIndex=customers.indexOf(customer);
                customers.set(customerIndex,cust);
            }
    }
    return (customerIndex==-1) ? new ResponseEntity<>(postCustomer(cust),HttpStatus.CREATED) : new ResponseEntity<>(cust,HttpStatus.OK);
}
    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable String id){
       customers.removeIf(c->c.getId().equals(id));
    }
}