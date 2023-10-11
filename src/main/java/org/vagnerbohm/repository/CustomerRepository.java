package org.vagnerbohm.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.vagnerbohm.entity.Customer;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository<Customer> {

}
