package com.martinmunene.springbeerapp.repositories;

import com.martinmunene.springbeerapp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Martin Munene
 */
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
