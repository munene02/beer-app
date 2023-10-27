package com.martinmunene.springbeerapp.services;

import com.martinmunene.springbeerapp.model.Customer;

import java.util.List;
import java.util.UUID;

/**
 * @author Martin Munene
 */
public interface CustomerService {
    Customer getCustomerById(UUID uuid);

    List<Customer> getAllCustomers();

    Customer saveNewCustomer(Customer customer);

    void updateCustomerById(UUID customerId, Customer customer);

    void deleteCustomerById(UUID customerId);

    void patchCustomerById(UUID customerId, Customer customer);
}
