package com.martinmunene.springbeerapp.repositories;

import com.martinmunene.springbeerapp.entities.Beer;
import com.martinmunene.springbeerapp.entities.BeerOrder;
import com.martinmunene.springbeerapp.entities.BeerOrderShipment;
import com.martinmunene.springbeerapp.entities.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Martin Munene
 */
@SpringBootTest
class BeerOrderRepositoryTest {
    @Autowired
    BeerOrderRepository beerOrderRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BeerRepository beerRepository;

    Customer customer;
    Beer beer;

    @BeforeEach
    void setUp(){
        customer = customerRepository.findAll().get(0);
        beer = beerRepository.findAll().get(0);
    }

    @Transactional
    @Test
    void testBeersOrders(){
        BeerOrder beerOrder = BeerOrder.builder()
                .customer(customer)
                .beerOrderShipment(BeerOrderShipment.builder()
                        .trackingNumber("12345r")
                        .build())
                .customerRef("Test Order")
                .build();

        BeerOrder savedBeerOrder = beerOrderRepository.save(beerOrder);

        System.out.println(savedBeerOrder.getCustomerRef());
    }
}