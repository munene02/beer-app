package com.martinmunene.springbeerapp.repositories;

import com.martinmunene.springbeerapp.entities.BeerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Martin Munene
 */
public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
}
