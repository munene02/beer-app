package com.martinmunene.springbeerapp.repositories;

import com.martinmunene.springbeerapp.entities.Beer;
import com.martinmunene.springbeerapp.model.BeerStyle;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Martin Munene
 */
@DataJpaTest
class BeerRepositoryTest {

    @Autowired
    BeerRepository beerRepository;

    @Test
    void testSaveBeerNameTooLong(){

        assertThrows(ConstraintViolationException.class, ()->{
            Beer savedBeer = beerRepository.save(Beer.builder()
                    .beerName("123456789012345678901234567890123456789012345678901234567890")
                    .beerStyle(BeerStyle.LAGER)
                    .upc("12341234")
                    .price(new BigDecimal("19.99"))
                    .build());

            beerRepository.flush();
        });

    }

    @Test
    void testSaveBer(){
        Beer savedBeer = beerRepository.save(Beer.builder()
                .beerName("My test beer")
                .beerStyle(BeerStyle.LAGER)
                .upc("12341234")
                .price(new BigDecimal("19.99"))
                .build());

        beerRepository.flush();

        assertThat(savedBeer).isNotNull();
        assertThat(savedBeer.getId()).isNotNull();


    }

}