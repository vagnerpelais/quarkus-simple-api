package org.vagnerbohm.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.vagnerbohm.entity.Customer;
import org.vagnerbohm.repository.CustomerRepository;

import java.util.List;

@ApplicationScoped
public class CustomerService {
    @Inject
    CustomerRepository customerRepository;

    public List<Customer> findAllCustomers(){
        return customerRepository.findAll().list();
    }

    public void addCustomer(Customer customer){
        customerRepository.persist(customer);
    }
}
