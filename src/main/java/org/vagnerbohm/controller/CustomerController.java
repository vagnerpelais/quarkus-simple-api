package org.vagnerbohm.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.vagnerbohm.entity.Customer;
import org.vagnerbohm.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

@Path("/api/customers")
public class CustomerController {

    @Inject
    CustomerService customerService;

    @GET
    public List<Customer> listCustomers() {
        List<Customer> customers = new ArrayList<>();
        try {
            customers = customerService.findAllCustomers();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return customers;
    }

    @POST
    @Transactional
    public void addCustomer(Customer customer) {
        customerService.addCustomer(customer);
    }
}
