package com.martinmunene.springbeerapp.repositories;

import com.martinmunene.springbeerapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Martin Munene
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
