package org.example.test.repository;

import org.example.test.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    @Override
    ArrayList<Customer> findAll();
}

